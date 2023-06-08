package nbt;

public class DoubleTag implements Tag {
  public static final DoubleTag ZERO = new DoubleTag(0.0);

  private final double data;

  private DoubleTag(double data) {
    this.data = data;
  }

  public static DoubleTag valueOf(double value) {
    return value == 0.0 ? ZERO : new DoubleTag(value);
  }
}
