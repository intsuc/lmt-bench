package nbt;

import java.io.DataOutput;
import java.io.IOException;
import java.util.Map;

public class CompoundTag implements Tag {
  private final Map<String, Tag> tags;

  public CompoundTag(final Map<String, Tag> tags) {
    this.tags = tags;
  }

  @Override
  public void write(final DataOutput out) throws IOException {
    for (final var key : tags.keySet()) {
      final var tag = tags.get(key);
      out.writeByte(tag.getId());
      out.writeUTF(key);
      tag.write(out);
    }
    out.writeByte(0);
  }

  @Override
  public byte getId() {
    return 10;
  }
}
