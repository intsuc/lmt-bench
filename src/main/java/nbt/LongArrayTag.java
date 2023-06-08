package nbt;

public class LongArrayTag implements Tag {
  private long[] data;

  public LongArrayTag(long[] data) {
    this.data = data;
  }
}
