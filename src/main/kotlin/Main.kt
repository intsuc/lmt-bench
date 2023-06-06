import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.encodeToStream
import java.util.zip.ZipEntry
import java.util.zip.ZipOutputStream
import kotlin.io.path.Path
import kotlin.io.path.createParentDirectories
import kotlin.io.path.outputStream

@OptIn(ExperimentalSerializationApi::class)
fun main(args: Array<String>) {
  args.forEach { println(it) }

  Path("mch-config.json").outputStream().buffered().use {
    Json.encodeToStream(
      MchConfig(
        5,
        5,
        10,
        5,
        "ns",
        null,
        null,
        null,
        null,
        listOf("bench")
      ),
      it,
    )
  }

  ZipOutputStream(
    Path("world", "datapacks", "lmt.zip")
      .createParentDirectories()
      .outputStream()
      .buffered()
  ).use {
    it.putNextEntry(ZipEntry("pack.mcmeta"))
    Json.encodeToStream(PackMetadata(PackMetadata.PackMetadataSection("", 15)), it)

    it.putNextEntry(ZipEntry("data/mch/tags/functions/setup.json"))
    Json.encodeToStream(TagFile(listOf("setup")), it)

    it.putNextEntry(ZipEntry("data/minecraft/functions/setup.mcfunction"))
    it.write("""say setup""".encodeToByteArray())

    it.putNextEntry(ZipEntry("data/minecraft/functions/bench.mcfunction"))
    it.write("""seed""".encodeToByteArray())
  }
}

@Serializable
data class MchConfig(
  @SerialName("warmup_iterations") val warmupIterations: Int?,
  @SerialName("measurement_iterations") val measurementIterations: Int?,
  val time: Int?,
  val forks: Int?,
  @SerialName("time_unit") val timeUnit: String?,
  val mc: String?,
  @SerialName("jvm_args") val jvmArgs: List<String>?,
  @SerialName("mc_args") val mcArgs: List<String>?,
  @SerialName("parsing_benchmarks") val parsingBenchmarks: List<String>?,
  @SerialName("execute_benchmarks") val executeBenchmarks: List<String>?,
)

@Serializable
data class PackMetadata(
  val pack: PackMetadataSection,
) {
  @Serializable
  data class PackMetadataSection(
    val description: String,
    @SerialName("pack_format") val packFormat: Int,
  )
}

@Serializable
data class TagFile(
  val values: List<String>,
)
