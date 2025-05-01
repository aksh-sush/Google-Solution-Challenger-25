package analysis;

import model.Log;

public final class Item
{
  public static final ByteVector d = new ByteVector(null);
  private float[] a;
  private int b;
  private int[] c;
  
  public Item(int[] paramArrayOfInt)
  {
    c = paramArrayOfInt;
    int i = ByteVector.a(d, paramArrayOfInt);
    b = i;
    a = new float[i];
  }
  
  public final int a()
  {
    return c.length;
  }
  
  public final void a(int[] paramArrayOfInt)
  {
    Log.get(paramArrayOfInt, "shape");
    c = paramArrayOfInt;
    int i = ByteVector.a(d, paramArrayOfInt);
    paramArrayOfInt = new float[i];
    System.arraycopy(a, 0, paramArrayOfInt, 0, Math.min(b, i));
    a = paramArrayOfInt;
    b = i;
  }
  
  public final int get(int paramInt)
  {
    return c[paramInt];
  }
  
  public final float[] get()
  {
    return a;
  }
}
