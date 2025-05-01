package androidplot;

import adapters.MethodWriter;
import adapters.c;
import java.util.List;

public abstract class h
  implements l
{
  MethodWriter a;
  public Label b = new Label(this);
  public Label c = new Label(this);
  ByteVector d = new ByteVector(this);
  protected MathArrays.OrderDirection e = MathArrays.OrderDirection.INCREASING;
  e f;
  protected c g;
  public int h;
  public int i = 0;
  boolean k = false;
  
  public h(MethodWriter paramMethodWriter)
  {
    a = paramMethodWriter;
  }
  
  private void a(int paramInt1, int paramInt2)
  {
    int m = h;
    int j = paramInt2;
    if (m != 0) {
      if (m != 1)
      {
        float f1;
        if (m != 2)
        {
          if (m != 3) {
            return;
          }
          localMethodWriter = a;
          localObject1 = l;
          Object localObject2 = g;
          c localC = c.a;
          if ((localObject2 == localC) && (h == 3))
          {
            localObject2 = f;
            if ((g == localC) && (h == 3)) {
              return;
            }
          }
          if (paramInt1 == 0) {
            localObject1 = f;
          }
          if (!d.b) {
            return;
          }
          f1 = localMethodWriter.doubleValue();
          if (paramInt1 == 1) {
            paramInt1 = (int)(d.g / f1 + 0.5F);
          } else {
            paramInt1 = (int)(f1 * d.g + 0.5F);
          }
          d.a(paramInt1);
          return;
        }
        localObject1 = a.l();
        if (localObject1 == null) {
          return;
        }
        if (paramInt1 == 0) {
          localObject1 = l;
        } else {
          localObject1 = f;
        }
        localObject1 = d;
        if (!b) {
          return;
        }
        MethodWriter localMethodWriter = a;
        if (paramInt1 == 0) {
          f1 = m;
        } else {
          f1 = g;
        }
        j = (int)(g * f1 + 0.5F);
      }
      else
      {
        paramInt1 = b(d.a, paramInt1);
        localObject1 = d;
        paramInt1 = Math.min(paramInt1, paramInt2);
        break label312;
      }
    }
    Object localObject1 = d;
    paramInt1 = b(j, paramInt1);
    label312:
    ((ByteVector)localObject1).a(paramInt1);
  }
  
  protected final Label a(adapters.Label paramLabel)
  {
    Object localObject = b;
    if (localObject == null) {
      return null;
    }
    paramLabel = a;
    localObject = h;
    int j = Type.d[localObject.ordinal()];
    if (j != 1)
    {
      if (j != 2)
      {
        if (j != 3)
        {
          if (j != 4)
          {
            if (j != 5) {
              return null;
            }
            paramLabel = f;
          }
          else
          {
            return f.a;
          }
        }
        else
        {
          paramLabel = f;
          break label96;
        }
      }
      else {
        paramLabel = l;
      }
      return b;
    }
    else
    {
      paramLabel = l;
    }
    label96:
    return c;
  }
  
  protected final Label a(adapters.Label paramLabel, int paramInt)
  {
    Object localObject = b;
    if (localObject == null) {
      return null;
    }
    paramLabel = a;
    if (paramInt == 0) {
      paramLabel = l;
    } else {
      paramLabel = f;
    }
    localObject = h;
    paramInt = Type.d[localObject.ordinal()];
    if (paramInt != 1)
    {
      if (paramInt != 2)
      {
        if (paramInt == 3) {
          break label74;
        }
        if (paramInt != 5) {
          return null;
        }
      }
      return b;
    }
    label74:
    return c;
  }
  
  abstract void a();
  
  protected final void a(Label paramLabel1, Label paramLabel2, int paramInt)
  {
    c.add(paramLabel2);
    d = paramInt;
    f.add(paramLabel1);
  }
  
  protected final void a(Label paramLabel1, Label paramLabel2, int paramInt, ByteVector paramByteVector)
  {
    c.add(paramLabel2);
    c.add(d);
    j = paramInt;
    e = paramByteVector;
    f.add(paramLabel1);
    f.add(paramLabel1);
  }
  
  public abstract void a(l paramL);
  
  protected void a(l paramL, adapters.Label paramLabel1, adapters.Label paramLabel2, int paramInt)
  {
    paramL = a(paramLabel1);
    Label localLabel = a(paramLabel2);
    if (b)
    {
      if (!b) {
        return;
      }
      int m = g + paramLabel1.a();
      int j = g - paramLabel2.a();
      int n = j - m;
      if ((!d.b) && (g == c.a)) {
        a(paramInt, n);
      }
      paramLabel1 = d;
      if (!b) {
        return;
      }
      if (g == n)
      {
        c.a(m);
        paramL = b;
      }
      for (;;)
      {
        paramL.a(j);
        return;
        paramLabel1 = a;
        float f1;
        if (paramInt == 0) {
          f1 = paramLabel1.offset();
        } else {
          f1 = paramLabel1.visitAttribute();
        }
        paramInt = m;
        if (paramL == localLabel)
        {
          paramInt = g;
          j = g;
          f1 = 0.5F;
        }
        m = d.g;
        c.a((int)(paramInt + 0.5F + (j - paramInt - m) * f1));
        paramL = b;
        j = c.g + d.g;
      }
    }
  }
  
  protected final int b(int paramInt1, int paramInt2)
  {
    MethodWriter localMethodWriter;
    int j;
    if (paramInt2 == 0)
    {
      localMethodWriter = a;
      j = A;
      paramInt2 = Math.max(z, paramInt1);
      if (j > 0) {
        paramInt2 = Math.min(j, paramInt1);
      }
      if (paramInt2 != paramInt1) {
        return paramInt2;
      }
    }
    else
    {
      localMethodWriter = a;
      j = B;
      paramInt2 = Math.max(top, paramInt1);
      if (j > 0) {
        paramInt2 = Math.min(j, paramInt1);
      }
      if (paramInt2 != paramInt1) {
        return paramInt2;
      }
    }
    return paramInt1;
  }
  
  protected void b(l paramL) {}
  
  abstract boolean b();
  
  abstract void c();
  
  public long draw()
  {
    ByteVector localByteVector = d;
    if (b) {
      return g;
    }
    return 0L;
  }
  
  abstract void e();
  
  public boolean i()
  {
    return k;
  }
  
  protected void setTitle(l paramL) {}
}
