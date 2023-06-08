package nbt;

public class ByteArrayTag implements Tag {
  private byte[] data;

  public ByteArrayTag(byte[] data) {
    this.data = data;
  }
}
