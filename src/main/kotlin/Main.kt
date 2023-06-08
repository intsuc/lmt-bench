import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

fun main() {
}

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
