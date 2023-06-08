package nbt;

import java.io.DataOutput;
import java.io.IOException;
import java.util.Objects;

public class StringTag implements Tag {
  private static final StringTag EMPTY = new StringTag("");

  private final String data;

  private StringTag(final String data) {
    this.data = Objects.requireNonNull(data);
  }

  public static StringTag valueOf(final String value) {
    return value.isEmpty() ? EMPTY : new StringTag(value);
  }

  @Override
  public void write(final DataOutput out) throws IOException {
    out.writeUTF(data);
  }

  @Override
  public byte getId() {
    return 8;
  }
}
