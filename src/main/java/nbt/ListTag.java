package nbt;

import java.util.List;

public class ListTag implements Tag {
  private final List<Tag> list;
  private byte type;

  public ListTag(List<Tag> list, byte type) {
    this.list = list;
    this.type = type;
  }
}
