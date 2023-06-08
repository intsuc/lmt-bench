package packs

import getMaxCapacity
import nbt.ByteTag
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
  private val capacity: Int = getMaxCapacity(arity, arity * 2 - 1)
  private val scale: Double = MAX_SIZE.toDouble() / arity.toDouble().pow(height.toDouble())

  override fun metadata() {
    println("   height     $height")
    println("   capacity   $capacity")
    println("   scale      $scale")
  }

  override fun content(): Tag {
    return create(height)
  }

  private fun create(depth: Int): Tag {
    return when (depth) {
      0    -> ListTag(listOf(ByteTag.valueOf(0)), 1)
      else -> ListTag(List(arity) { create(depth - 1) }, 9)
    }
  }

  override fun pack(): Map<String, List<String>> {
    return mapOf(
      "baseline" to emptyList(),
      "access" to listOf("data get storage $name: _${"[${-arity}]".repeat(height)}[0]"),
    )
  }
}
