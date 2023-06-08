package nbt;

import java.util.Objects;

public class StringTag implements Tag {
  private static final StringTag EMPTY = new StringTag("");

  private final String data;

  private StringTag(String data) {
    this.data = Objects.requireNonNull(data);
  }

  public static StringTag valueOf(String value) {
    return value.isEmpty() ? EMPTY : new StringTag(value);
  }
}
