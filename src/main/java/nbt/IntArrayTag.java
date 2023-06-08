package nbt;

import java.io.DataOutput;
import java.io.IOException;

public class IntArrayTag implements Tag {
  private int[] data;

  public IntArrayTag(final int[] data) {
    this.data = data;
  }

  @Override
  public void write(final DataOutput out) throws IOException {
    out.writeInt(data.length);
    for (int i : data) {
      out.writeInt(i);
    }
  }

  @Override
  public byte getId() {
    return 11;
  }
}
