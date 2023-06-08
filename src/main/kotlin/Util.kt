import kotlin.math.max

fun getMaxCapacity(size: Int): Int {
  return size + max(1, size shr 1)
}
