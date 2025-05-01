package adapters;

class m
{
  private int b = 0;
  private Label c;
  private int d = 0;
  private int e = 0;
  private int f = 0;
  private Label g;
  private int h = 0;
  private int i = 0;
  private Label k;
  private Label l;
  private int n;
  private int p = 0;
  private int q = 0;
  private MethodWriter r = null;
  int s = 0;
  private int t = 0;
  private int u = 0;
  
  public m(d paramD, int paramInt1, Label paramLabel1, Label paramLabel2, Label paramLabel3, Label paramLabel4, int paramInt2)
  {
    n = paramInt1;
    l = paramLabel1;
    g = paramLabel2;
    k = paramLabel3;
    c = paramLabel4;
    e = paramD.c();
    d = paramD.length();
    h = paramD.next();
    i = paramD.b();
    f = paramInt2;
  }
  
  private void a()
  {
    q = 0;
    t = 0;
    r = null;
    s = 0;
    int i1 = u;
    int j = 0;
    while (j < i1)
    {
      if (b + j >= d.getId(a)) {
        return;
      }
      MethodWriter localMethodWriter = d.get(a)[(b + j)];
      int i2;
      int m;
      if (n == 0)
      {
        i2 = localMethodWriter.get();
        m = d.c(a);
        if (localMethodWriter.iterator() == 8) {
          m = 0;
        }
        q += i2 + m;
        m = d.d(a, localMethodWriter, f);
        if ((r == null) || (s < m))
        {
          r = localMethodWriter;
          s = m;
          t = m;
        }
      }
      else
      {
        i2 = d.a(a, localMethodWriter, f);
        int i3 = d.d(a, localMethodWriter, f);
        m = d.g(a);
        if (localMethodWriter.iterator() == 8) {
          m = 0;
        }
        t += i3 + m;
        if ((r == null) || (s < i2))
        {
          r = localMethodWriter;
          s = i2;
          q = i2;
        }
      }
      j += 1;
    }
  }
  
  public void a(int paramInt)
  {
    int j = p;
    if (j == 0) {
      return;
    }
    int i3 = u;
    paramInt /= j;
    j = 0;
    while ((j < i3) && (b + j < d.getId(a)))
    {
      MethodWriter localMethodWriter = d.get(a)[(b + j)];
      d localD;
      c localC1;
      c localC2;
      int i1;
      int m;
      int i2;
      if (n == 0)
      {
        if ((localMethodWriter == null) || (localMethodWriter.charAt() != c.a) || (h != 0)) {
          break label196;
        }
        localD = a;
        localC1 = c.b;
        localC2 = localMethodWriter.isEmpty();
        i1 = localMethodWriter.getValue();
        m = paramInt;
        i2 = m;
      }
      else
      {
        if ((localMethodWriter == null) || (localMethodWriter.isEmpty() != c.a) || (i != 0)) {
          break label196;
        }
        localD = a;
        localC1 = localMethodWriter.charAt();
        i2 = localMethodWriter.get();
        localC2 = c.b;
        m = paramInt;
        i1 = m;
      }
      localD.a(localMethodWriter, localC1, i2, localC2, i1);
      label196:
      j += 1;
    }
    a();
  }
  
  public void a(int paramInt1, Label paramLabel1, Label paramLabel2, Label paramLabel3, Label paramLabel4, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
  {
    n = paramInt1;
    l = paramLabel1;
    g = paramLabel2;
    k = paramLabel3;
    c = paramLabel4;
    e = paramInt2;
    d = paramInt3;
    h = paramInt4;
    i = paramInt5;
    f = paramInt6;
  }
  
  public void a(MethodWriter paramMethodWriter)
  {
    int j = n;
    int m = 0;
    int i1 = 0;
    if (j == 0)
    {
      j = d.a(a, paramMethodWriter, f);
      if (paramMethodWriter.charAt() == c.a)
      {
        p += 1;
        j = 0;
      }
      m = d.c(a);
      if (paramMethodWriter.iterator() == 8) {
        m = i1;
      }
      q += j + m;
      j = d.d(a, paramMethodWriter, f);
      if ((r == null) || (s < j))
      {
        r = paramMethodWriter;
        s = j;
        t = j;
      }
    }
    else
    {
      int i2 = d.a(a, paramMethodWriter, f);
      j = d.d(a, paramMethodWriter, f);
      if (paramMethodWriter.isEmpty() == c.a)
      {
        p += 1;
        j = 0;
      }
      i1 = d.g(a);
      if (paramMethodWriter.iterator() != 8) {
        m = i1;
      }
      t += j + m;
      if ((r == null) || (s < i2))
      {
        r = paramMethodWriter;
        s = i2;
        q = i2;
      }
    }
    u += 1;
  }
  
  public void a(boolean paramBoolean1, int paramInt, boolean paramBoolean2)
  {
    int i5 = u;
    int j = 0;
    Object localObject1;
    while ((j < i5) && (b + j < d.getId(a)))
    {
      localObject1 = d.get(a)[(b + j)];
      if (localObject1 != null) {
        ((MethodWriter)localObject1).addAll();
      }
      j += 1;
    }
    if (i5 != 0)
    {
      if (r == null) {
        return;
      }
      int i2;
      if ((paramBoolean2) && (paramInt == 0)) {
        i2 = 1;
      } else {
        i2 = 0;
      }
      j = 0;
      int m = -1;
      for (int i1 = -1; j < i5; i1 = i3)
      {
        if (paramBoolean1) {
          i3 = i5 - 1 - j;
        } else {
          i3 = j;
        }
        if (b + i3 >= d.getId(a)) {
          break;
        }
        localObject1 = d.get(a)[(b + i3)];
        int i4 = m;
        i3 = i1;
        if (localObject1 != null)
        {
          i4 = m;
          i3 = i1;
          if (((MethodWriter)localObject1).iterator() == 0)
          {
            i1 = m;
            if (m == -1) {
              i1 = j;
            }
            i3 = j;
            i4 = i1;
          }
        }
        j += 1;
        m = i4;
      }
      j = n;
      Object localObject2 = null;
      localObject1 = null;
      label468:
      float f2;
      float f1;
      label725:
      Label localLabel;
      if (j == 0)
      {
        MethodWriter localMethodWriter2 = r;
        localMethodWriter2.add(d.h(a));
        i3 = d;
        j = i3;
        if (paramInt > 0) {
          j = i3 + d.g(a);
        }
        j.a(g, j);
        if (paramBoolean2) {
          a.a(c, i);
        }
        if (paramInt > 0) {
          g.a.a.a(j, 0);
        }
        if ((d.e(a) == 3) && (!localMethodWriter2.trim()))
        {
          paramInt = 0;
          while (paramInt < i5)
          {
            if (paramBoolean1) {
              j = i5 - 1 - paramInt;
            } else {
              j = paramInt;
            }
            if (b + j >= d.getId(a)) {
              break;
            }
            localObject2 = d.get(a)[(b + j)];
            if (((MethodWriter)localObject2).trim()) {
              break label468;
            }
            paramInt += 1;
          }
        }
        localObject2 = localMethodWriter2;
        j = 0;
        while (j < i5)
        {
          if (paramBoolean1) {
            paramInt = i5 - 1 - j;
          } else {
            paramInt = j;
          }
          if (b + paramInt >= d.getId(a)) {
            return;
          }
          localMethodWriter1 = d.get(a)[(b + paramInt)];
          if (localMethodWriter1 != null)
          {
            do
            {
              if (j == 0) {
                localMethodWriter1.a(b, l, e);
              }
              if (paramInt == 0)
              {
                i3 = d.k(a);
                f2 = d.f(a);
                f1 = f2;
                if (paramBoolean1) {
                  f1 = 1.0F - f2;
                }
                if ((b == 0) && (d.ordinal(a) != -1))
                {
                  paramInt = d.ordinal(a);
                  if (paramBoolean1)
                  {
                    f1 = d.i(a);
                    f1 = 1.0F - f1;
                  }
                }
                for (f1 = d.i(a);; f1 = d.b(a))
                {
                  f2 = f1;
                  break label725;
                  paramInt = i3;
                  f2 = f1;
                  if (!paramBoolean2) {
                    break label725;
                  }
                  paramInt = i3;
                  f2 = f1;
                  if (d.readInt(a) == -1) {
                    break label725;
                  }
                  paramInt = d.readInt(a);
                  if (paramBoolean1)
                  {
                    f1 = d.b(a);
                    break;
                  }
                }
                localMethodWriter1.putInt(paramInt);
                localMethodWriter1.close(f2);
              }
              if (j == i5 - 1) {
                localMethodWriter1.a(c, k, h);
              }
              if (localObject1 != null)
              {
                b.a(c, d.c(a));
                if (j == m) {
                  b.b(e);
                }
                c.a(b, 0);
                if (j == i1 + 1) {
                  c.b(h);
                }
              }
              localObject1 = localMethodWriter1;
            } while (localMethodWriter1 == localMethodWriter2);
            if ((d.e(a) == 3) && (((MethodWriter)localObject2).trim()) && (localMethodWriter1 != localObject2) && (localMethodWriter1.trim()))
            {
              localObject1 = d;
              localLabel = d;
            }
            else
            {
              paramInt = d.e(a);
              if (paramInt != 0)
              {
                if (paramInt != 1)
                {
                  localObject1 = j;
                  if (i2 != 0)
                  {
                    ((Label)localObject1).a(g, d);
                    a.a(c, i);
                    localObject1 = localMethodWriter1;
                    break label1031;
                  }
                  ((Label)localObject1).a(j, 0);
                }
                localObject1 = a;
                localLabel = a;
              }
              else
              {
                localObject1 = j;
                localLabel = j;
              }
            }
            ((Label)localObject1).a(localLabel, 0);
            localObject1 = localMethodWriter1;
          }
          label1031:
          j += 1;
        }
      }
      MethodWriter localMethodWriter1 = r;
      localMethodWriter1.putInt(d.k(a));
      int i3 = e;
      j = i3;
      if (paramInt > 0) {
        j = i3 + d.c(a);
      }
      if (paramBoolean1)
      {
        c.a(k, j);
        if (paramBoolean2) {
          b.a(l, h);
        }
        if (paramInt <= 0) {
          break label1218;
        }
        localObject1 = k.a.b;
        localLabel = c;
      }
      else
      {
        b.a(l, j);
        if (paramBoolean2) {
          c.a(k, h);
        }
        if (paramInt <= 0) {
          break label1218;
        }
        localObject1 = l.a.c;
        localLabel = b;
      }
      ((Label)localObject1).a(localLabel, 0);
      label1218:
      j = 0;
      localObject1 = localObject2;
      while (j < i5)
      {
        if (b + j >= d.getId(a)) {
          return;
        }
        localObject2 = d.get(a)[(b + j)];
        if (localObject2 != null)
        {
          if (j == 0)
          {
            ((MethodWriter)localObject2).a(j, g, d);
            i3 = d.h(a);
            f2 = d.d(a);
            if ((b == 0) && (d.size(a) != -1))
            {
              paramInt = d.size(a);
              f1 = d.j(a);
            }
            else
            {
              paramInt = i3;
              f1 = f2;
              if (paramBoolean2)
              {
                paramInt = i3;
                f1 = f2;
                if (d.hashCode(a) != -1)
                {
                  paramInt = d.hashCode(a);
                  f1 = d.a(a);
                }
              }
            }
            ((MethodWriter)localObject2).add(paramInt);
            ((MethodWriter)localObject2).add(f1);
          }
          if (j == i5 - 1) {
            ((MethodWriter)localObject2).a(a, c, i);
          }
          if (localObject1 != null)
          {
            j.a(a, d.g(a));
            if (j == m) {
              j.b(d);
            }
            a.a(j, 0);
            if (j == i1 + 1) {
              a.b(i);
            }
          }
          if (localObject2 != localMethodWriter1)
          {
            paramInt = d.l(a);
            if (paramBoolean1)
            {
              if (paramInt != 0) {
                if (paramInt != 1)
                {
                  if (paramInt != 2) {
                    break label1736;
                  }
                  b.a(b, 0);
                }
                else
                {
                  localObject1 = b;
                  localLabel = b;
                  break label1606;
                }
              }
              localObject1 = c;
              localLabel = c;
              label1606:
              ((Label)localObject1).a(localLabel, 0);
            }
            else
            {
              if (paramInt != 0)
              {
                if (paramInt != 1)
                {
                  if (paramInt != 2) {
                    break label1736;
                  }
                  localObject1 = b;
                  if (i2 != 0)
                  {
                    ((Label)localObject1).a(l, e);
                    c.a(k, h);
                    break label1736;
                  }
                  ((Label)localObject1).a(b, 0);
                }
                localObject1 = c;
                localLabel = c;
              }
              else
              {
                localObject1 = b;
                localLabel = b;
              }
              ((Label)localObject1).a(localLabel, 0);
            }
          }
          label1736:
          localObject1 = localObject2;
        }
        j += 1;
      }
    }
  }
  
  public int c()
  {
    if (n == 0) {
      return q - d.c(a);
    }
    return q;
  }
  
  public void d()
  {
    s = 0;
    r = null;
    q = 0;
    t = 0;
    b = 0;
    u = 0;
    p = 0;
  }
  
  public int e()
  {
    if (n == 1) {
      return t - d.g(a);
    }
    return t;
  }
  
  public void e(int paramInt)
  {
    b = paramInt;
  }
}
