import kotlin.math.max

fun getMaxCapacity(min: Int, max: Int): Int {
  var capacity = min
  while (capacity < max) {
    capacity += max(1, capacity shr 1)
  }
  return capacity
}
