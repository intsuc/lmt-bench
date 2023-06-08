package packs

import PackMetadata
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.encodeToStream
import nbt.CompoundTag
import nbt.IntTag
import nbt.Tag
import java.io.DataOutputStream
import java.nio.file.Path
import kotlin.io.path.Path
import kotlin.io.path.createDirectories
import kotlin.io.path.div
import kotlin.io.path.outputStream

sealed class Pack(
  val name: String,
) {
  abstract fun metadata()

  abstract fun content(): Tag

  abstract fun pack(): Map<String, List<String>>

  @OptIn(ExperimentalSerializationApi::class)
  fun generate() {
    DataOutputStream((data / "command_storage_$name.dat").outputStream().buffered()).use { output ->
      println(name)
      metadata()

      output.writeByte(10)
      output.writeUTF("")
      CompoundTag(mapOf(
        "data" to CompoundTag(mapOf(
          "contents" to CompoundTag(mapOf(
            "" to CompoundTag(mapOf(
              "_" to content()
            )),
          )),
        )),
        "DataVersion" to IntTag.valueOf(0),
      )).write(output)
    }

    val packRoot = (datapacks / name).createDirectories()
    (packRoot / "pack.mcmeta").outputStream().buffered().use { output ->
      json.encodeToStream(PackMetadata(PackMetadata.PackMetadataSection(name, 15)), output)
    }
    val functions = packRoot / "data" / "minecraft" / "functions"
    pack().forEach { (name, commands) ->
      (functions / "$name.mcfunction").outputStream().buffered().use { output ->
        commands.forEach {
          output.write(it.encodeToByteArray())
          output.write('\n'.code)
        }
      }
    }
  }

  companion object {
    const val MAX_SIZE: Int = 65536

    private val server: Path = Path("server")
    private val world: Path = server / "world"
    private val data: Path = world / "data"
    private val datapacks: Path = world / "datapacks"

    private val json: Json = Json {
      prettyPrint = true
    }
  }
}
