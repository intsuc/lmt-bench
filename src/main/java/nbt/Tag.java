package nbt;

import java.io.DataOutput;
import java.io.IOException;

public interface Tag {
  void write(final DataOutput out) throws IOException;

  byte getId();
}
