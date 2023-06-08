package nbt;

import java.util.Map;

public class CompoundTag implements Tag {
  private final Map<String, Tag> tags;

  public CompoundTag(Map<String, Tag> tags) {
    this.tags = tags;
  }
}
