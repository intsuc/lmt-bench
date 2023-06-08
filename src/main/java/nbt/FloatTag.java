package nbt;

public class FloatTag implements Tag {
  public static final FloatTag ZERO = new FloatTag(0.0F);

  private final float data;

  private FloatTag(float data) {
    this.data = data;
  }

  public static FloatTag valueOf(float value) {
    return value == 0.0F ? ZERO : new FloatTag(value);
  }
}
