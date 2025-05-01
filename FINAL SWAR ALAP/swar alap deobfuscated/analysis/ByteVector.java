package analysis;

import ui.List;

public final class ByteVector
{
  private ByteVector() {}
  
  private final int read(int[] paramArrayOfInt)
  {
    int i = paramArrayOfInt.length;
    int k = 1;
    if (i == 0) {
      i = 1;
    } else {
      i = 0;
    }
    int j;
    if (i == 0)
    {
      j = paramArrayOfInt[0];
      int m = List.read(paramArrayOfInt);
      if (1 <= m)
      {
        i = k;
        for (;;)
        {
          j *= paramArrayOfInt[i];
          if (i == m) {
            break;
          }
          i += 1;
        }
      }
      return j;
    }
    throw new UnsupportedOperationException("Empty array can't be reduced.");
    return j;
  }
}
