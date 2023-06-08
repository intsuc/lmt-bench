package nbt;

import java.io.DataOutput;
import java.io.IOException;

public class LongTag implements Tag {
  private final long data;

  private LongTag(final long data) {
    this.data = data;
  }

  public static LongTag valueOf(final long value) {
    return value >= -128L && value <= 1024L ? LongTag.Cache.cache[(int) value - -128] : new LongTag(value);
  }

  @Override
  public void write(final DataOutput out) throws IOException {
    out.writeLong(data);
  }

  @Override
  public byte getId() {
    return 4;
  }

  static class Cache {
    static final LongTag[] cache = new LongTag[1153];

    static {
      for (int i = 0; i < cache.length; ++i) {
        cache[i] = new LongTag(-128 + i);
      }
    }

    private Cache() {
    }
  }
}
