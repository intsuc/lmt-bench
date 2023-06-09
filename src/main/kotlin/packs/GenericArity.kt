package packs

import getMaxCapacity
import nbt.CompoundTag
import nbt.IntTag
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
    return CompoundTag(mutableMapOf<String, Tag>().also {
      it["_"] = create(height)
      if (arity <= 32) {
        for (i in 2..<arity) {
          it[i.toString()] = ListTag(List(i) { ListTag(emptyList(), 0) }, 9)
        }
      }
    })
  }

  private fun create(depth: Int): Tag {
    var index = 0
    fun go(depth: Int): Tag {
      return when (depth) {
        0    -> ListTag(listOf(IntTag.valueOf(index++)), 3)
        else -> ListTag(List(arity) { go(depth - 1) }, 9)
      }
    }
    return go(depth)
  }

  override fun pack(): Map<String, List<String>> {
    return emptyMap()
  }
}
