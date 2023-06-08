package nbt;

import java.io.DataOutput;
import java.io.IOException;

public class LongArrayTag implements Tag {
  private long[] data;

  public LongArrayTag(final long[] data) {
    this.data = data;
  }

  @Override
  public void write(final DataOutput out) throws IOException {
    out.writeInt(data.length);
    for (long l : data) {
      out.writeLong(l);
    }
  }

  @Override
  public byte getId() {
    return 12;
  }
}
