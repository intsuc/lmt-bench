package nbt;

import java.io.DataOutput;
import java.io.IOException;

public class DoubleTag implements Tag {
  public static final DoubleTag ZERO = new DoubleTag(0.0);

  private final double data;

  private DoubleTag(final double data) {
    this.data = data;
  }

  public static DoubleTag valueOf(final double value) {
    return value == 0.0 ? ZERO : new DoubleTag(value);
  }

  @Override
  public void write(final DataOutput out) throws IOException {
    out.writeDouble(data);
  }

  @Override
  public byte getId() {
    return 6;
  }
}
