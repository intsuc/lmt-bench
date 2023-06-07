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
import kotlin.math.log

@OptIn(ExperimentalSerializationApi::class)
fun main(args: Array<String>) {
  args.forEach { println(it) }
  val arity = args[0].toInt()

  Path("mch-config.json").outputStream().buffered().use {
    Json.encodeToStream(
      MchConfig(
        warmupIterations = 5,
        measurementIterations = 5,
        time = 10,
        forks = 5,
        timeUnit = "ns",
        jvmArgs = emptyList(),
        executeBenchmarks = listOf("access")
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
    fun write(name: String, content: String) {
      println("\u001B[32m$name\u001B[0m")
      println(content)
      it.putNextEntry(ZipEntry(name))
      it.write(content.encodeToByteArray())
    }

    it.putNextEntry(ZipEntry("pack.mcmeta"))
    Json.encodeToStream(PackMetadata(PackMetadata.PackMetadataSection("", 15)), it)

    it.putNextEntry(ZipEntry("data/mch/tags/functions/setup.json"))
    Json.encodeToStream(TagFile(listOf("setup")), it)

    val max = 65536
    val height = log(arity.toDouble(), max.toDouble()).toInt()
    val storage = "a"
    val lmt = "a"

    write(
      "data/minecraft/functions/setup.mcfunction",
      """data modify storage $storage $lmt set value ${List(arity) { "[]" }.joinToString(",", "[", "]")}
        |${List(height - 1) { "data modify storage $storage $lmt[] append from storage $storage $lmt[]" }.joinToString("\n")}
      """.trimMargin(),
    )

    write(
      "data/minecraft/functions/access.mcfunction",
      """data get storage $storage $lmt${"[-2]".repeat(height)}
      """.trimMargin(),
    )
  }
}

@Serializable
data class MchConfig(
  @SerialName("warmup_iterations") val warmupIterations: Int,
  @SerialName("measurement_iterations") val measurementIterations: Int,
  val time: Int,
  val forks: Int,
  @SerialName("time_unit") val timeUnit: String,
  @SerialName("jvm_args") val jvmArgs: List<String>,
  @SerialName("execute_benchmarks") val executeBenchmarks: List<String>,
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
