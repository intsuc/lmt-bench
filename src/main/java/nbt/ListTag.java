package nbt;

import java.io.DataOutput;
import java.io.IOException;
import java.util.List;

public class ListTag implements Tag {
  private final List<Tag> list;
  private byte type;

  public ListTag(final List<Tag> list, final byte type) {
    this.list = list;
    this.type = type;
  }

  @Override
  public void write(final DataOutput out) throws IOException {
    out.writeByte(type);
    out.writeInt(list.size());
    for (final var tag : list) {
      tag.write(out);
    }
  }

  @Override
  public byte getId() {
    return 9;
  }
}
