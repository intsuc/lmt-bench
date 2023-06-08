package packs

import getMaxCapacity
import nbt.ListTag
import nbt.Tag
import kotlin.math.log
import kotlin.math.pow
import kotlin.math.roundToInt

class GenericArity(
  val arity: Int,
  round: (Double) -> Int = { it.roundToInt() },
) : Pack("generic_arity_$arity") {
  private val height: Int = round(log(MAX_SIZE.toDouble(), arity.toDouble()))
  private val capacity: Int = getMaxCapacity(arity)
  val scale: Double = MAX_SIZE.toDouble() / arity.toDouble().pow(height.toDouble())

  override fun metadata(totalSize: Long) {
    println("   height        $height")
    println("   capacity      $capacity")
    println("   scale         $scale")
    println("   total size    $totalSize")
    println("   scaled size   ${totalSize.toDouble() * scale}")
  }

  override fun storage(): Tag {
    return create(height)
  }

  private fun create(depth: Int): Tag {
    return when (depth) {
      1    -> ListTag(ArrayList(capacity), 9)
      else -> ListTag(ArrayList<Tag>(capacity).also { branch ->
        repeat(arity) {
          branch += create(depth - 1)
        }
      }, 9)
    }
  }

  override fun pack(): Map<String, List<String>> {
    return mapOf()
  }
}
