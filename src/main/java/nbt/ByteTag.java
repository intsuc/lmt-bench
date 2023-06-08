package nbt;

public class ByteTag implements Tag {
  private final byte data;

  private ByteTag(byte data) {
    this.data = data;
  }

  public static ByteTag valueOf(byte value) {
    return ByteTag.Cache.cache[128 + value];
  }

  static class Cache {
    static final ByteTag[] cache = new ByteTag[256];

    static {
      for (int i = 0; i < cache.length; ++i) {
        cache[i] = new ByteTag((byte) (i - 128));
      }
    }

    private Cache() {
    }
  }
}
