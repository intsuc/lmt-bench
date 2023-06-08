import java.io.DataOutput

sealed interface Tag

@JvmInline
value class ByteTag(val value: Byte) : Tag

@JvmInline
value class ShortTag(val value: Short) : Tag

@JvmInline
value class IntTag(val value: Int) : Tag

@JvmInline
value class LongTag(val value: Long) : Tag

@JvmInline
value class FloatTag(val value: Float) : Tag

@JvmInline
value class DoubleTag(val value: Double) : Tag

@JvmInline
value class ByteArrayTag(val values: List<Byte>) : Tag, List<Byte> by values

@JvmInline
value class StringTag(val value: String) : Tag

@JvmInline
value class IntArrayTag(val values: List<Int>) : Tag, List<Int> by values

@JvmInline
value class LongArrayTag(val values: List<Long>) : Tag, List<Long> by values

@JvmInline
value class ListTag(val tags: List<Tag>) : Tag, List<Tag> by tags

@JvmInline
value class CompoundTag(private val tags: Map<String, Tag>) : Tag, Map<String, Tag> by tags

fun DataOutput.writeTag(tag: Tag) {
  when (tag) {
    is ByteTag      -> writeByte(tag.value.toInt())
    is ShortTag     -> writeShort(tag.value.toInt())
    is IntTag       -> writeInt(tag.value)
    is LongTag      -> writeLong(tag.value)
    is FloatTag     -> writeFloat(tag.value)
    is DoubleTag    -> writeDouble(tag.value)
    is ByteArrayTag -> {
      writeInt(tag.size)
      tag.forEach { writeByte(it.toInt()) }
    }
    is StringTag    -> writeUTF(tag.value)
    is ListTag      -> {
      writeByte(
        when (tag.tags.firstOrNull()) {
          null            -> 0
          is ByteTag      -> 1
          is ShortTag     -> 2
          is IntTag       -> 3
          is LongTag      -> 4
          is FloatTag     -> 5
          is DoubleTag    -> 6
          is ByteArrayTag -> 7
          is StringTag    -> 8
          is ListTag      -> 9
          is CompoundTag  -> 10
          is IntArrayTag  -> 11
          is LongArrayTag -> 12
        }
      )
      writeInt(tag.size)
      tag.forEach { writeTag(it) }
    }
    is CompoundTag  -> {
      tag.forEach { (key, value) ->
        writeUTF(key)
        writeTag(value)
      }
      writeByte(0)
    }
    is IntArrayTag  -> {
      writeInt(tag.size)
      tag.forEach { writeInt(it) }
    }
    is LongArrayTag -> {
      writeInt(tag.size)
      tag.forEach { writeLong(it) }
    }
  }
}
