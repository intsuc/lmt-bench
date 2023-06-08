package nbt;

public class IntTag implements Tag {
  private final int data;

  private IntTag(int data) {
    this.data = data;
  }

  public static IntTag valueOf(int value) {
    return value >= -128 && value <= 1024 ? IntTag.Cache.cache[value - -128] : new IntTag(value);
  }

  static class Cache {
    static final IntTag[] cache = new IntTag[1153];

    static {
      for (int i = 0; i < cache.length; ++i) {
        cache[i] = new IntTag(-128 + i);
      }
    }

    private Cache() {
    }
  }
}
