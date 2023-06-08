package nbt;

public class ShortTag implements Tag {
  private final short data;

  private ShortTag(short data) {
    this.data = data;
  }

  public static ShortTag valueOf(short value) {
    return value >= -128 && value <= 1024 ? ShortTag.Cache.cache[value - -128] : new ShortTag(value);
  }

  static class Cache {
    static final ShortTag[] cache = new ShortTag[1153];

    static {
      for (int i = 0; i < cache.length; ++i) {
        cache[i] = new ShortTag((short) (-128 + i));
      }
    }

    private Cache() {
    }
  }
}
