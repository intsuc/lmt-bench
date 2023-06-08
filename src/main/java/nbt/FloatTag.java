package nbt;

import java.io.DataOutput;
import java.io.IOException;

public class FloatTag implements Tag {
  public static final FloatTag ZERO = new FloatTag(0.0F);

  private final float data;

  private FloatTag(final float data) {
    this.data = data;
  }

  public static FloatTag valueOf(final float value) {
    return value == 0.0F ? ZERO : new FloatTag(value);
  }

  @Override
  public void write(final DataOutput out) throws IOException {
    out.writeFloat(data);
  }

  @Override
  public byte getId() {
    return 5;
  }
}
