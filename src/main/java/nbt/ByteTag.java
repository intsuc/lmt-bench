package nbt;

import java.io.DataOutput;
import java.io.IOException;

public class ByteTag implements Tag {
  private final byte data;

  private ByteTag(final byte data) {
    this.data = data;
  }

  public static ByteTag valueOf(final byte value) {
    return ByteTag.Cache.cache[128 + value];
  }

  @Override
  public void write(final DataOutput out) throws IOException {
    out.writeByte(data);
  }

  @Override
  public byte getId() {
    return 1;
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
