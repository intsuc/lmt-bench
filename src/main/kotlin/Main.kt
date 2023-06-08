import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import packs.GenericArity

fun main() {
  listOf(
    GenericArity(2),
    GenericArity(3),
    GenericArity(4),
    GenericArity(5),
    GenericArity(6),
    GenericArity(7),
    GenericArity(8),
    GenericArity(9),
    GenericArity(10),
    GenericArity(11),
    GenericArity(12),
    GenericArity(13),
    GenericArity(14),
    GenericArity(15),
    GenericArity(16),
    GenericArity(32),
    GenericArity(256),
    GenericArity(65536),
  ).forEach {
    it.generate()
  }
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
