package androidplot;

import adapters.f;
import java.util.ArrayList;
import java.util.List;

class e
{
  public static int e;
  h a = null;
  h b = null;
  ArrayList c = new ArrayList();
  int d;
  int f;
  public int h = 0;
  public boolean i = false;
  
  public e(h paramH, int paramInt)
  {
    int j = e;
    d = j;
    e = j + 1;
    a = paramH;
    b = paramH;
    f = paramInt;
  }
  
  private long a(Label paramLabel, long paramLong)
  {
    h localH = a;
    if ((localH instanceof MethodWriter)) {
      return paramLong;
    }
    int k = f.size();
    int j = 0;
    long l2;
    for (long l1 = paramLong; j < k; l1 = l2)
    {
      Object localObject = (l)f.get(j);
      l2 = l1;
      if ((localObject instanceof Label))
      {
        localObject = (Label)localObject;
        if (a == localH) {
          l2 = l1;
        } else {
          l2 = Math.max(l1, a((Label)localObject, d + paramLong));
        }
      }
      j += 1;
    }
    if (paramLabel == c)
    {
      l2 = localH.draw();
      paramLabel = b;
      paramLong += l2;
      return Math.max(Math.max(l1, a(paramLabel, paramLong)), paramLong - b.d);
    }
    return l1;
  }
  
  private long b(Label paramLabel, long paramLong)
  {
    h localH = a;
    if ((localH instanceof MethodWriter)) {
      return paramLong;
    }
    int k = f.size();
    int j = 0;
    long l2;
    for (long l1 = paramLong; j < k; l1 = l2)
    {
      Object localObject = (l)f.get(j);
      l2 = l1;
      if ((localObject instanceof Label))
      {
        localObject = (Label)localObject;
        if (a == localH) {
          l2 = l1;
        } else {
          l2 = Math.min(l1, b((Label)localObject, d + paramLong));
        }
      }
      j += 1;
    }
    if (paramLabel == b)
    {
      l2 = localH.draw();
      paramLabel = c;
      paramLong -= l2;
      return Math.min(Math.min(l1, b(paramLabel, paramLong)), paramLong - c.d);
    }
    return l1;
  }
  
  public long a(f paramF, int paramInt)
  {
    h localH = a;
    boolean bool1 = localH instanceof b;
    long l3 = 0L;
    if (bool1)
    {
      if (i != paramInt) {
        return 0L;
      }
    }
    else if (paramInt == 0)
    {
      if (!(localH instanceof XYPlot)) {
        return 0L;
      }
    }
    else if (!(localH instanceof m)) {
      return 0L;
    }
    if (paramInt == 0) {
      localObject = l;
    } else {
      localObject = f;
    }
    Object localObject = c;
    if (paramInt == 0) {
      paramF = l;
    } else {
      paramF = f;
    }
    paramF = b;
    bool1 = c.c.contains(localObject);
    boolean bool2 = a.b.c.contains(paramF);
    long l5 = a.draw();
    long l1;
    long l2;
    if ((bool1) && (bool2))
    {
      l1 = a(a.c, 0L);
      long l4 = b(a.b, 0L);
      l2 = l1 - l5;
      paramF = a;
      int j = b.d;
      l1 = l2;
      if (l2 >= -j) {
        l1 = l2 + j;
      }
      l2 = -l4;
      j = c.d;
      l4 = l2 - l5 - j;
      l2 = l4;
      if (l4 >= j) {
        l2 = l4 - j;
      }
      float f1 = a.toString(paramInt);
      if (f1 > 0.0F) {
        l3 = ((float)l2 / f1 + (float)l1 / (1.0F - f1));
      }
      float f2 = (float)l3;
      l1 = (f2 * f1 + 0.5F);
      l2 = (f2 * (1.0F - f1) + 0.5F);
      paramF = a;
      l1 = c.d + (l1 + l5 + l2);
    }
    else
    {
      if (bool1)
      {
        paramF = a.c;
        l1 = a(paramF, d);
        l2 = a.c.d + l5;
      }
      for (;;)
      {
        return Math.max(l1, l2);
        if (!bool2) {
          break;
        }
        paramF = a.b;
        l1 = b(paramF, d);
        l2 = -a.b.d + l5;
        l1 = -l1;
      }
      paramF = a;
      l1 = c.d + paramF.draw();
      paramF = a;
    }
    return l1 - b.d;
  }
  
  public void a(h paramH)
  {
    c.add(paramH);
    b = paramH;
  }
}
