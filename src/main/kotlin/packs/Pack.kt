package packs

import PackMetadata
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.encodeToStream
import nbt.CompoundTag
import nbt.ListTag
import nbt.StringTag
import nbt.Tag
import writeData
import java.io.DataOutputStream
import java.nio.file.Path
import kotlin.io.path.*

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

      output.writeData(CompoundTag(mapOf(
        "contents" to CompoundTag(mapOf(
          "" to CompoundTag(mapOf(
            "_" to content()
          )),
        )),
      )))
    }

    val packRoot = (datapacks / name).createDirectories()
    (packRoot / "pack.mcmeta").outputStream().buffered().use { output ->
      json.encodeToStream(PackMetadata(PackMetadata.PackMetadataSection(name, 15)), output)
    }
    val functions = packRoot / "data" / name / "functions"
    pack().forEach { (name, commands) ->
      (functions / "$name.mcfunction").createParentDirectories().outputStream().buffered().use { output ->
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

    init {
      DataOutputStream((data / "scoreboard.dat").outputStream().buffered()).use { output ->
        output.writeData(CompoundTag(mapOf(
          "Objectives" to ListTag(listOf(
            CompoundTag(mapOf(
              "CriteriaName" to StringTag.valueOf("dummy"),
              "DisplayName" to StringTag.valueOf("""{"text":"_"}"""),
              "RenderType" to StringTag.valueOf("integer"),
              "Name" to StringTag.valueOf("_"),
            ))
          ), 10),
        )))
      }
    }
  }
}
