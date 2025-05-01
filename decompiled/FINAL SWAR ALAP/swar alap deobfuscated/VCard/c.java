package VCard;

import com.google.protobuf.c0.c;
import com.google.protobuf.c0.d;
import s5.a.c;

public enum c
  implements c0.c
{
  private static final c0.d i = new a.c.a();
  private final int value;
  
  static
  {
    c localC1 = new c("FIRST", 0, 0);
    d = localC1;
    c localC2 = new c("LAST", 1, 1);
    a = localC2;
    c localC3 = new c("UNRECOGNIZED", 2, -1);
    b = localC3;
    e = new c[] { localC1, localC2, localC3 };
  }
  
  private c(int paramInt)
  {
    value = paramInt;
  }
  
  public static c a(int paramInt)
  {
    if (paramInt != 0)
    {
      if (paramInt != 1) {
        return null;
      }
      return a;
    }
    return d;
  }
  
  public final int getNumber()
  {
    if (this != b) {
      return value;
    }
    throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
  }
}
