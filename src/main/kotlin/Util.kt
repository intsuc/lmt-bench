import nbt.CompoundTag
import nbt.IntTag
import java.io.DataOutput
import kotlin.math.max

fun getMaxCapacity(min: Int, max: Int): Int {
  var capacity = min
  while (capacity < max) {
    capacity += max(1, capacity shr 1)
  }
  return capacity
}

fun DataOutput.writeData(data: CompoundTag) {
  writeByte(10)
  writeUTF("")
  CompoundTag(mapOf(
    "data" to data,
    "DataVersion" to IntTag.valueOf(Int.MAX_VALUE),
  )).write(this)
}
