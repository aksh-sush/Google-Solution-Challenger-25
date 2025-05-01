package adapters;

import androidplot.ClassWriter;
import androidplot.d;
import java.util.HashSet;

public abstract class XYPlot
  extends b
{
  d a = null;
  protected ClassWriter b = new ClassWriter();
  private int c = 0;
  private int e = 0;
  private int f = 0;
  private int g = 0;
  private int h = 0;
  private int i = 0;
  private int k = 0;
  private boolean l = false;
  private int m = 0;
  private int n = 0;
  private int x = 0;
  
  public XYPlot() {}
  
  public void a(int paramInt1, int paramInt2)
  {
    x = paramInt1;
    m = paramInt2;
  }
  
  public abstract void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4);
  
  protected void a(MethodWriter paramMethodWriter, c paramC1, int paramInt1, c paramC2, int paramInt2)
  {
    while ((a == null) && (l() != null)) {
      a = ((f)l()).a();
    }
    ClassWriter localClassWriter = b;
    c = paramC1;
    b = paramC2;
    i = paramInt1;
    f = paramInt2;
    a.a(paramMethodWriter, localClassWriter);
    paramMethodWriter.append(b.d);
    paramMethodWriter.get(b.a);
    paramMethodWriter.put(b.e);
    paramMethodWriter.visitFieldInsn(b.q);
  }
  
  public void a(f paramF)
  {
    draw();
  }
  
  protected boolean a()
  {
    Object localObject1 = r;
    if (localObject1 != null) {
      localObject1 = ((f)localObject1).a();
    } else {
      localObject1 = null;
    }
    if (localObject1 == null) {
      return false;
    }
    int j = 0;
    for (;;)
    {
      int i2 = i;
      int i1 = 1;
      if (j >= i2) {
        break;
      }
      MethodWriter localMethodWriter = a[j];
      if ((localMethodWriter != null) && (!(localMethodWriter instanceof i)))
      {
        c localC2 = localMethodWriter.f(0);
        c localC1 = localC2;
        Object localObject3 = localMethodWriter.f(1);
        Object localObject2 = localObject3;
        c localC3 = c.a;
        if ((localC2 != localC3) || (h == 1) || (localObject3 != localC3) || (i == 1)) {
          i1 = 0;
        }
        if (i1 == 0)
        {
          if (localC2 == localC3) {
            localC1 = c.c;
          }
          if (localObject3 == localC3) {
            localObject2 = c.c;
          }
          localObject3 = b;
          c = localC1;
          b = ((c)localObject2);
          i = localMethodWriter.get();
          b.f = localMethodWriter.getValue();
          ((d)localObject1).a(localMethodWriter, b);
          localMethodWriter.append(b.d);
          localMethodWriter.get(b.a);
          localMethodWriter.visitFieldInsn(b.q);
        }
      }
      j += 1;
    }
    return true;
  }
  
  public boolean a(HashSet paramHashSet)
  {
    int j = 0;
    while (j < i)
    {
      if (paramHashSet.contains(a[j])) {
        return true;
      }
      j += 1;
    }
    return false;
  }
  
  public int b()
  {
    return e;
  }
  
  public void b(int paramInt)
  {
    i = paramInt;
    k = paramInt;
    g = paramInt;
  }
  
  protected void b(boolean paramBoolean)
  {
    l = paramBoolean;
  }
  
  public int c()
  {
    return k;
  }
  
  public void d(int paramInt)
  {
    f = paramInt;
    n = paramInt;
    c = paramInt;
    e = paramInt;
    i = paramInt;
    h = paramInt;
  }
  
  public void d(boolean paramBoolean)
  {
    int j = i;
    if ((j > 0) || (h > 0))
    {
      if (paramBoolean)
      {
        k = h;
        g = j;
        return;
      }
      k = j;
      g = h;
    }
  }
  
  public void draw()
  {
    int j = 0;
    while (j < i)
    {
      MethodWriter localMethodWriter = a[j];
      if (localMethodWriter != null) {
        localMethodWriter.set(true);
      }
      j += 1;
    }
  }
  
  public int getM()
  {
    return m;
  }
  
  public int getOrientation()
  {
    return x;
  }
  
  public void initialize(int paramInt)
  {
    n = paramInt;
  }
  
  public int length()
  {
    return n;
  }
  
  public boolean n()
  {
    return l;
  }
  
  public int next()
  {
    return g;
  }
  
  public void next(int paramInt)
  {
    c = paramInt;
    g = paramInt;
  }
  
  public void setPadding(int paramInt)
  {
    f = paramInt;
    k = paramInt;
  }
  
  public void setRadius(int paramInt)
  {
    h = paramInt;
  }
  
  public void setWeight(int paramInt)
  {
    e = paramInt;
  }
}
