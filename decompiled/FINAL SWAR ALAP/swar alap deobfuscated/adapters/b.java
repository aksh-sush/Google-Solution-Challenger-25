package adapters;

import androidplot.ClassReader;
import androidplot.i;
import java.util.ArrayList;
import java.util.Arrays;

public abstract class b
  extends MethodWriter
  implements l
{
  public MethodWriter[] a = new MethodWriter[4];
  public int i = 0;
  
  public b() {}
  
  public int a(int paramInt)
  {
    int j = 0;
    while (j < i)
    {
      MethodWriter localMethodWriter = a[j];
      int k;
      if (paramInt == 0)
      {
        k = S;
        if (k != -1) {
          return k;
        }
      }
      if (paramInt == 1)
      {
        k = o;
        if (k != -1) {
          return k;
        }
      }
      j += 1;
    }
    return -1;
  }
  
  public void a(MethodWriter paramMethodWriter)
  {
    if (paramMethodWriter != this)
    {
      if (paramMethodWriter == null) {
        return;
      }
      int j = i;
      MethodWriter[] arrayOfMethodWriter = a;
      if (j + 1 > arrayOfMethodWriter.length) {
        a = ((MethodWriter[])Arrays.copyOf(arrayOfMethodWriter, arrayOfMethodWriter.length * 2));
      }
      arrayOfMethodWriter = a;
      j = i;
      arrayOfMethodWriter[j] = paramMethodWriter;
      i = (j + 1);
    }
  }
  
  public void a(f paramF) {}
  
  public void a(ArrayList paramArrayList, int paramInt, i paramI)
  {
    int m = 0;
    int j = 0;
    int k;
    for (;;)
    {
      k = m;
      if (j >= i) {
        break;
      }
      paramI.a(a[j]);
      j += 1;
    }
    while (k < i)
    {
      ClassReader.a(a[k], paramInt, paramArrayList, paramI);
      k += 1;
    }
  }
  
  public void initForMenu()
  {
    i = 0;
    Arrays.fill(a, null);
  }
}
