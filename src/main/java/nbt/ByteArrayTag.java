package nbt;

import java.io.DataOutput;
import java.io.IOException;

public class ByteArrayTag implements Tag {
  private byte[] data;

  public ByteArrayTag(final byte[] data) {
    this.data = data;
  }

  @Override
  public void write(final DataOutput out) throws IOException {
    out.writeInt(data.length);
    out.write(data);
  }

  @Override
  public byte getId() {
    return 7;
  }
}
