package nbt;

public class LongTag implements Tag {
  private final long data;

  private LongTag(long data) {
    this.data = data;
  }

  public static LongTag valueOf(long value) {
    return value >= -128L && value <= 1024L ? LongTag.Cache.cache[(int) value - -128] : new LongTag(value);
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
