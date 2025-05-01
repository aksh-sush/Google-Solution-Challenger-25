package androidplot;

import adapters.Handle;
import adapters.MethodWriter;
import adapters.c;
import java.util.List;

public class XYPlot
  extends h
{
  private static int[] c = new int[2];
  
  public XYPlot(MethodWriter paramMethodWriter)
  {
    super(paramMethodWriter);
    c.k = Plot.RenderMode.e;
    b.k = Plot.RenderMode.a;
    i = 0;
  }
  
  private void a(int[] paramArrayOfInt, int paramInt1, int paramInt2, int paramInt3, int paramInt4, float paramFloat, int paramInt5)
  {
    paramInt1 = paramInt2 - paramInt1;
    paramInt2 = paramInt4 - paramInt3;
    if (paramInt5 != -1)
    {
      if (paramInt5 != 0)
      {
        if (paramInt5 != 1) {
          return;
        }
        paramInt2 = (int)(paramInt1 * paramFloat + 0.5F);
        paramArrayOfInt[0] = paramInt1;
        paramArrayOfInt[1] = paramInt2;
        return;
      }
      paramArrayOfInt[0] = ((int)(paramInt2 * paramFloat + 0.5F));
      paramArrayOfInt[1] = paramInt2;
      return;
    }
    paramInt3 = (int)(paramInt2 * paramFloat + 0.5F);
    paramInt4 = (int)(paramInt1 / paramFloat + 0.5F);
    if (paramInt3 <= paramInt1)
    {
      paramArrayOfInt[0] = paramInt3;
      paramArrayOfInt[1] = paramInt2;
      return;
    }
    if (paramInt4 <= paramInt2)
    {
      paramArrayOfInt[0] = paramInt1;
      paramArrayOfInt[1] = paramInt4;
    }
  }
  
  void a()
  {
    Object localObject1 = a;
    if (k) {
      d.a(((MethodWriter)localObject1).get());
    }
    int i;
    if (!d.b)
    {
      localObject2 = a.charAt();
      g = ((c)localObject2);
      if (localObject2 != c.a)
      {
        localObject1 = c.d;
        if (localObject2 == localObject1)
        {
          localObject2 = a.l();
          if ((localObject2 != null) && ((((MethodWriter)localObject2).charAt() == c.b) || (((MethodWriter)localObject2).charAt() == localObject1)))
          {
            i = ((MethodWriter)localObject2).get();
            int j = a.b.a();
            int k = a.c.a();
            a(c, l.c, a.b.a());
            a(b, l.b, -a.c.a());
            d.a(i - j - k);
            return;
          }
        }
        if (g == c.b) {
          d.a(a.get());
        }
      }
    }
    else
    {
      localObject2 = g;
      localObject1 = c.d;
      if (localObject2 == localObject1)
      {
        localObject2 = a.l();
        if ((localObject2 != null) && ((((MethodWriter)localObject2).charAt() == c.b) || (((MethodWriter)localObject2).charAt() == localObject1)))
        {
          a(c, l.c, a.b.a());
          a(b, l.b, -a.c.a());
          return;
        }
      }
    }
    Object localObject2 = d;
    if (b)
    {
      localObject1 = a;
      if (k)
      {
        localObject2 = u;
        localObject3 = localObject2[0];
        localLabel = b;
        if ((localLabel != null) && (1b != null))
        {
          if (((MethodWriter)localObject1).f())
          {
            c.d = a.u[0].a();
            localObject2 = b;
            localObject1 = a.u[1];
            break label1440;
          }
          localObject1 = a(a.u[0]);
          if (localObject1 != null) {
            a(c, (Label)localObject1, a.u[0].a());
          }
          localObject1 = a(a.u[1]);
          if (localObject1 != null) {
            a(b, (Label)localObject1, -a.u[1].a());
          }
          c.h = true;
          b.h = true;
          return;
        }
        if (localLabel != null)
        {
          localObject2 = a((adapters.Label)localObject3);
          localObject1 = localObject2;
          if (localObject2 == null) {
            return;
          }
          localObject2 = c;
          i = a.u[0].a();
        }
        else
        {
          localObject2 = localObject2[1];
          if (b != null)
          {
            localObject1 = a((adapters.Label)localObject2);
            if (localObject1 == null) {
              return;
            }
            a(b, (Label)localObject1, -a.u[1].a());
            localObject1 = c;
            localObject2 = b;
            i = -d.g;
            break label754;
          }
          if (((localObject1 instanceof adapters.l)) || (((MethodWriter)localObject1).l() == null) || (a.a(Handle.r).b != null)) {
            return;
          }
          localObject1 = a.l().l.c;
          localObject2 = c;
          i = a.put();
        }
        a((Label)localObject2, (Label)localObject1, i);
        localObject1 = b;
        localObject2 = c;
        i = d.g;
        label754:
        a((Label)localObject1, (Label)localObject2, i);
        return;
      }
    }
    if (g == c.a)
    {
      localObject1 = a;
      i = h;
      if (i != 2)
      {
        if (i != 3) {
          break label1355;
        }
        if (i == 3)
        {
          c.i = this;
          b.i = this;
          localObject3 = f;
          c.i = this;
          b.i = this;
          i = this;
          if (((MethodWriter)localObject1).equals())
          {
            d.c.add(a.f.d);
            a.f.d.f.add(d);
            localObject1 = a.f;
            d.i = this;
            d.c.add(c);
            d.c.add(a.f.b);
            a.f.c.f.add(d);
            localObject2 = a.f.b.f;
            break label1239;
          }
          if (a.f())
          {
            a.f.d.c.add(d);
            localObject2 = d.f;
            localObject1 = a.f.d;
            break label1345;
          }
          localObject1 = a.f.d;
        }
        else
        {
          localObject1 = f.d;
          c.add(localObject1);
          f.add(d);
          a.f.c.f.add(d);
          a.f.b.f.add(d);
          localObject1 = d;
          h = true;
          f.add(c);
          d.f.add(b);
          c.c.add(d);
          localObject1 = b;
        }
        localObject2 = c;
        label1239:
        localObject1 = d;
      }
      else
      {
        localObject1 = ((MethodWriter)localObject1).l();
        if (localObject1 == null) {
          break label1355;
        }
        localObject1 = f.d;
        d.c.add(localObject1);
        f.add(d);
        localObject1 = d;
        h = true;
        f.add(c);
        localObject2 = d.f;
        localObject1 = b;
      }
      label1345:
      ((List)localObject2).add(localObject1);
    }
    label1355:
    localObject1 = a;
    localObject2 = u;
    Object localObject3 = localObject2[0];
    adapters.Label localLabel = b;
    if ((localLabel != null) && (1b != null))
    {
      if (((MethodWriter)localObject1).f())
      {
        c.d = a.u[0].a();
        localObject2 = b;
        localObject1 = a.u[1];
        label1440:
        d = (-((adapters.Label)localObject1).a());
        return;
      }
      localObject1 = a(a.u[0]);
      localObject2 = a(a.u[1]);
      if (localObject1 != null) {
        ((Label)localObject1).b(this);
      }
      if (localObject2 != null) {
        ((Label)localObject2).b(this);
      }
      e = MathArrays.OrderDirection.e;
      return;
    }
    if (localLabel != null)
    {
      localObject2 = a((adapters.Label)localObject3);
      localObject1 = localObject2;
      if (localObject2 == null) {
        return;
      }
      localObject2 = c;
      i = a.u[0].a();
    }
    else
    {
      localObject2 = localObject2[1];
      if (b != null)
      {
        localObject1 = a((adapters.Label)localObject2);
        if (localObject1 == null) {
          return;
        }
        a(b, (Label)localObject1, -a.u[1].a());
        a(c, b, -1, d);
        return;
      }
      if (((localObject1 instanceof adapters.l)) || (((MethodWriter)localObject1).l() == null)) {
        return;
      }
      localObject1 = a.l().l.c;
      localObject2 = c;
      i = a.put();
    }
    a((Label)localObject2, (Label)localObject1, i);
    a(b, c, 1, d);
  }
  
  public void a(l paramL)
  {
    int i = YPositionMetric.a.a[e.ordinal()];
    Object localObject1;
    if (i != 1)
    {
      if (i != 2)
      {
        if (i == 3)
        {
          localObject1 = a;
          a(paramL, b, c, 0);
        }
      }
      else {
        b(paramL);
      }
    }
    else {
      setTitle(paramL);
    }
    float f;
    label201:
    label207:
    int j;
    int k;
    if ((!d.b) && (g == c.a))
    {
      Object localObject2 = a;
      i = h;
      if (i != 2)
      {
        if (i != 3) {
          break label1493;
        }
        i = i;
        if ((i != 0) && (i != 3))
        {
          i = ((MethodWriter)localObject2).readInt();
          if (i != -1) {
            if (i != 0)
            {
              if (i != 1)
              {
                i = 0;
                break label207;
              }
            }
            else
            {
              paramL = a;
              f = f.d.g / paramL.doubleValue();
              break label201;
            }
          }
          paramL = a;
          f = f.d.g * paramL.doubleValue();
        }
      }
      for (i = (int)(f + 0.5F);; i = (int)(g * f + 0.5F))
      {
        d.a(i);
        break;
        localObject1 = f;
        paramL = c;
        localObject1 = b;
        if (b.b != null) {
          i = 1;
        } else {
          i = 0;
        }
        if (j.b != null) {
          j = 1;
        } else {
          j = 0;
        }
        if (c.b != null) {
          k = 1;
        } else {
          k = 0;
        }
        int m;
        if (a.b != null) {
          m = 1;
        } else {
          m = 0;
        }
        int n = ((MethodWriter)localObject2).readInt();
        if ((i != 0) && (j != 0) && (k != 0) && (m != 0))
        {
          f = a.doubleValue();
          int i1;
          int i2;
          int i3;
          int i4;
          if ((b) && (b))
          {
            localObject2 = c;
            if (!q) {
              return;
            }
            if (!b.q) {
              return;
            }
            i = c.get(0)).g;
            j = c.d;
            k = b.c.get(0)).g;
            m = b.d;
            i1 = g;
            i2 = d;
            i3 = g;
            i4 = d;
            a(c, i + j, k - m, i1 + i2, i3 - i4, f, n);
            d.a(c[0]);
            a.f.d.a(c[1]);
            return;
          }
          localObject2 = c;
          if (b)
          {
            Label localLabel = b;
            if (b) {
              if (q)
              {
                if (!q) {
                  return;
                }
                i = g;
                j = d;
                k = g;
                m = d;
                i1 = c.get(0)).g;
                i2 = d;
                i3 = c.get(0)).g;
                i4 = d;
                a(c, i + j, k - m, i1 + i2, i3 - i4, f, n);
                d.a(c[0]);
                a.f.d.a(c[1]);
              }
              else
              {
                return;
              }
            }
          }
          localObject2 = c;
          if (q)
          {
            if ((!b.q) || (!q)) {
              return;
            }
            if (!q) {
              return;
            }
            i = c.get(0)).g;
            j = c.d;
            k = b.c.get(0)).g;
            m = b.d;
            i1 = c.get(0)).g;
            i2 = d;
            i3 = c.get(0)).g;
            i4 = d;
            a(c, i + j, k - m, i1 + i2, i3 - i4, f, n);
            d.a(c[0]);
            paramL = a.f.d;
            i = c[1];
          }
        }
        else
        {
          if ((i != 0) && (k != 0))
          {
            if (c.q)
            {
              if (!b.q) {
                return;
              }
              f = a.doubleValue();
              i = c.c.get(0)).g + c.d;
              j = b.c.get(0)).g - b.d;
              if ((n != -1) && (n != 0))
              {
                if (n != 1) {
                  break;
                }
                i = b(j - i, 0);
                j = i;
                n = (int)(i / f + 0.5F);
                m = b(n, 1);
                k = m;
                i = k;
                if (n == m) {
                  break label1161;
                }
                f = m * f;
                i = k;
              }
              else
              {
                i = b(j - i, 0);
                j = i;
                n = (int)(i * f + 0.5F);
                m = b(n, 1);
                k = m;
                i = k;
                if (n == m) {
                  break label1161;
                }
                f = m / f;
                i = k;
              }
              j = (int)(f + 0.5F);
              label1161:
              d.a(j);
              a.f.d.a(i);
              break;
            }
            return;
          }
          if ((j == 0) || (m == 0)) {
            break;
          }
          if (!q) {
            break label1444;
          }
          if (!q) {
            return;
          }
          f = a.doubleValue();
          i = c.get(0)).g + d;
          j = c.get(0)).g - d;
          if (n != -1) {
            if (n != 0)
            {
              if (n != 1) {
                break;
              }
            }
            else
            {
              j = b(j - i, 1);
              i = j;
              n = (int)(j * f + 0.5F);
              m = b(n, 0);
              k = m;
              j = k;
              if (n == m) {
                break label1416;
              }
              f = m / f;
              j = k;
              break label1410;
            }
          }
          j = b(j - i, 1);
          i = j;
          n = (int)(j / f + 0.5F);
          m = b(n, 0);
          k = m;
          j = k;
          if (n != m)
          {
            f = m * f;
            j = k;
            label1410:
            i = (int)(f + 0.5F);
          }
          label1416:
          d.a(j);
          paramL = a.f.d;
        }
        paramL.a(i);
        break;
        label1444:
        return;
        paramL = ((MethodWriter)localObject2).l();
        if (paramL == null) {
          break;
        }
        paramL = l.d;
        if (!b) {
          break;
        }
        f = a.m;
      }
    }
    label1493:
    paramL = c;
    if (q)
    {
      localObject1 = b;
      if (!q) {
        return;
      }
      if ((b) && (b) && (d.b)) {
        return;
      }
      if ((!d.b) && (g == c.a))
      {
        paramL = a;
        if ((h == 0) && (!paramL.f()))
        {
          localObject1 = (Label)c.c.get(0);
          paramL = (Label)b.c.get(0);
          i = g;
          localObject1 = c;
          i += d;
          j = g + b.d;
          ((Label)localObject1).a(i);
          b.a(j);
          d.a(j - i);
          return;
        }
      }
      if ((!d.b) && (g == c.a) && (h == 1) && (c.c.size() > 0) && (b.c.size() > 0))
      {
        paramL = (Label)c.c.get(0);
        localObject1 = (Label)b.c.get(0);
        i = g;
        j = c.d;
        i = Math.min(g + b.d - (i + j), d.a);
        paramL = a;
        k = A;
        j = Math.max(z, i);
        i = j;
        if (k > 0) {
          i = Math.min(k, j);
        }
        d.a(i);
      }
      if (!d.b) {
        return;
      }
      paramL = (Label)c.c.get(0);
      localObject1 = (Label)b.c.get(0);
      i = g + c.d;
      j = g + b.d;
      f = a.offset();
      if (paramL == localObject1)
      {
        i = g;
        j = g;
        f = 0.5F;
      }
      k = d.g;
      c.a((int)(i + 0.5F + (j - i - k) * f));
      b.a(c.g + d.g);
    }
  }
  
  boolean b()
  {
    if (g == c.a) {
      return a.h == 0;
    }
    return true;
  }
  
  public void c()
  {
    Label localLabel = c;
    if (b) {
      a.equals(g);
    }
  }
  
  void d()
  {
    k = false;
    c.a();
    c.b = false;
    b.a();
    b.b = false;
    d.b = false;
  }
  
  void e()
  {
    f = null;
    c.a();
    b.a();
    d.a();
    k = false;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("HorizontalRun ");
    localStringBuilder.append(a.getString());
    return localStringBuilder.toString();
  }
}
