package androidplot;

import adapters.MethodWriter;
import adapters.c;
import adapters.f;
import java.util.ArrayList;
import java.util.Iterator;

public class b
  extends h
{
  ArrayList a = new ArrayList();
  private int i;
  
  public b(MethodWriter paramMethodWriter, int paramInt)
  {
    super(paramMethodWriter);
    i = paramInt;
    accept();
  }
  
  private void accept()
  {
    Object localObject1 = a;
    Object localObject2;
    MethodWriter localMethodWriter;
    do
    {
      localObject2 = localObject1;
      localMethodWriter = ((MethodWriter)localObject2).accept(i);
      localObject1 = localMethodWriter;
    } while (localMethodWriter != null);
    a = ((MethodWriter)localObject2);
    a.add(((MethodWriter)localObject2).getValue(i));
    for (localObject1 = ((MethodWriter)localObject2).visitMethodInsn(i); localObject1 != null; localObject1 = ((MethodWriter)localObject1).visitMethodInsn(i)) {
      a.add(((MethodWriter)localObject1).getValue(i));
    }
    localObject1 = a.iterator();
    int j;
    while (((Iterator)localObject1).hasNext())
    {
      localObject2 = (h)((Iterator)localObject1).next();
      j = i;
      if (j == 0) {
        a.Q = this;
      } else if (j == 1) {
        a.E = this;
      }
    }
    if ((i == 0) && (((f)a.l()).b())) {
      j = 1;
    } else {
      j = 0;
    }
    if ((j != 0) && (a.size() > 1))
    {
      localObject1 = a;
      a = getsize1a;
    }
    if (i == 0) {
      j = a.register();
    } else {
      j = a.getLevel();
    }
    i = j;
  }
  
  private MethodWriter d()
  {
    int j = a.size() - 1;
    while (j >= 0)
    {
      h localH = (h)a.get(j);
      if (a.iterator() != 8) {
        return a;
      }
      j -= 1;
    }
    return null;
  }
  
  private MethodWriter write()
  {
    int j = 0;
    while (j < a.size())
    {
      h localH = (h)a.get(j);
      if (a.iterator() != 8) {
        return a;
      }
      j += 1;
    }
    return null;
  }
  
  void a()
  {
    Object localObject1 = a.iterator();
    while (((Iterator)localObject1).hasNext()) {
      ((h)((Iterator)localObject1).next()).a();
    }
    int j = a.size();
    if (j < 1) {
      return;
    }
    Object localObject2 = a.get(0)).a;
    localObject1 = a.get(j - 1)).a;
    Object localObject3;
    if (i == 0)
    {
      localObject2 = b;
      localObject3 = c;
      localObject1 = a((adapters.Label)localObject2, 0);
      j = ((adapters.Label)localObject2).a();
      localObject2 = write();
      if (localObject2 != null) {
        j = b.a();
      }
      if (localObject1 != null) {
        a(c, (Label)localObject1, j);
      }
      localObject2 = a((adapters.Label)localObject3, 0);
      localObject1 = localObject2;
      j = ((adapters.Label)localObject3).a();
      localObject3 = d();
      if (localObject3 != null) {
        j = c.a();
      }
      if (localObject2 == null) {
        break label287;
      }
    }
    else
    {
      localObject2 = j;
      localObject3 = a;
      localObject1 = a((adapters.Label)localObject2, 1);
      j = ((adapters.Label)localObject2).a();
      localObject2 = write();
      if (localObject2 != null) {
        j = j.a();
      }
      if (localObject1 != null) {
        a(c, (Label)localObject1, j);
      }
      localObject2 = a((adapters.Label)localObject3, 1);
      localObject1 = localObject2;
      j = ((adapters.Label)localObject3).a();
      localObject3 = d();
      if (localObject3 != null) {
        j = a.a();
      }
      if (localObject2 == null) {
        break label287;
      }
    }
    a(b, (Label)localObject1, -j);
    label287:
    c.i = this;
    b.i = this;
  }
  
  public void a(l paramL)
  {
    if (c.b)
    {
      if (!b.b) {
        return;
      }
      paramL = a.l();
      boolean bool;
      if ((paramL instanceof f)) {
        bool = ((f)paramL).b();
      } else {
        bool = false;
      }
      int i12 = b.g - c.g;
      int i11 = a.size();
      int j = 0;
      for (;;)
      {
        k = -1;
        if (j >= i11) {
          break;
        }
        i6 = j;
        if (a.get(j)).a.iterator() != 8) {
          break label129;
        }
        j += 1;
      }
      int i6 = -1;
      label129:
      int i10 = i11 - 1;
      j = i10;
      for (;;)
      {
        i7 = k;
        if (j < 0) {
          break label184;
        }
        if (a.get(j)).a.iterator() != 8) {
          break;
        }
        j -= 1;
      }
      int i7 = j;
      label184:
      int i1 = 0;
      int i2;
      int i3;
      int i4;
      Object localObject;
      label430:
      label442:
      float f2;
      while (i1 < 2)
      {
        i2 = 0;
        m = 0;
        j = 0;
        n = 0;
        f1 = 0.0F;
        while (i2 < i11)
        {
          paramL = (h)a.get(i2);
          if (a.iterator() == 8)
          {
            i3 = j;
            k = m;
          }
          else
          {
            i4 = n + 1;
            k = m;
            if (i2 > 0)
            {
              k = m;
              if (i2 >= i6) {
                k = m + c.d;
              }
            }
            localObject = d;
            n = g;
            i3 = n;
            if (g != c.a) {
              m = 1;
            } else {
              m = 0;
            }
            if (m != 0)
            {
              i3 = i;
              if ((i3 == 0) && (!a.l.d.b)) {
                return;
              }
              if ((i3 == 1) && (!a.f.d.b)) {
                return;
              }
            }
            else
            {
              if ((h == 1) && (i1 == 0))
              {
                m = a;
                j += 1;
              }
              else
              {
                if (!b) {
                  break label430;
                }
                m = i3;
              }
              n = 1;
              break label442;
            }
            i3 = n;
            n = m;
            m = i3;
            if (n == 0)
            {
              n = j + 1;
              float f3 = a.left[i];
              j = n;
              m = k;
              f2 = f1;
              if (f3 >= 0.0F)
              {
                f2 = f1 + f3;
                j = n;
                m = k;
              }
            }
            else
            {
              m = k + m;
              f2 = f1;
            }
            i3 = j;
            k = m;
            n = i4;
            f1 = f2;
            if (i2 < i10)
            {
              i3 = j;
              k = m;
              n = i4;
              f1 = f2;
              if (i2 < i7)
              {
                k = m + -b.d;
                f1 = f2;
                n = i4;
                i3 = j;
              }
            }
          }
          i2 += 1;
          j = i3;
          m = k;
        }
        if ((m >= i12) && (j != 0))
        {
          i1 += 1;
        }
        else
        {
          k = j;
          break label633;
        }
      }
      int n = 0;
      int m = 0;
      int k = 0;
      float f1 = 0.0F;
      label633:
      i1 = c.g;
      if (bool) {
        i1 = b.g;
      }
      j = i1;
      if (m > i12)
      {
        j = (int)((m - i12) / 2.0F + 0.5F);
        if (bool) {
          j = i1 + j;
        } else {
          j = i1 - j;
        }
      }
      if (k > 0)
      {
        f2 = i12 - m;
        i2 = (int)(f2 / k + 0.5F);
        int i8 = 0;
        int i5;
        for (i1 = 0; i8 < i11; i1 = i5)
        {
          paramL = (h)a.get(i8);
          if (a.iterator() == 8)
          {
            i5 = i1;
          }
          else
          {
            i5 = i1;
            if (g == c.a)
            {
              localObject = d;
              i5 = i1;
              if (!b)
              {
                i3 = i2;
                if (f1 > 0.0F) {
                  i3 = (int)(a.left[i] * f2 / f1 + 0.5F);
                }
                MethodWriter localMethodWriter;
                if (i == 0)
                {
                  localMethodWriter = a;
                  i5 = A;
                  i4 = z;
                }
                else
                {
                  localMethodWriter = a;
                  i4 = top;
                  i5 = B;
                }
                if (h == 1) {
                  i9 = Math.min(i3, a);
                } else {
                  i9 = i3;
                }
                int i9 = Math.max(i4, i9);
                i4 = i9;
                if (i5 > 0) {
                  i4 = Math.min(i5, i9);
                }
                i5 = i1;
                i9 = i3;
                if (i4 != i3)
                {
                  i5 = i1 + 1;
                  i9 = i4;
                }
                d.a(i9);
              }
            }
          }
          i8 += 1;
        }
        i2 = k;
        if (i1 > 0)
        {
          i3 = k - i1;
          m = 0;
          k = 0;
          while (m < i11)
          {
            paramL = (h)a.get(m);
            if (a.iterator() != 8)
            {
              i2 = k;
              if (m > 0)
              {
                i2 = k;
                if (m >= i6) {
                  i2 = k + c.d;
                }
              }
              i2 += d.g;
              k = i2;
              if (m < i10)
              {
                k = i2;
                if (m < i7) {
                  k = i2 + -b.d;
                }
              }
            }
            m += 1;
          }
          i2 = i3;
          m = k;
        }
        if ((i == 2) && (i1 == 0)) {
          i = 0;
        }
      }
      else
      {
        i2 = k;
      }
      k = j;
      if (m > i12) {
        i = 2;
      }
      if ((n > 0) && (i2 == 0) && (i6 == i7)) {
        i = 2;
      }
      j = i;
      if (j == 1)
      {
        if (n > 1) {
          j = (i12 - m) / (n - 1);
        } else if (n == 1) {
          j = (i12 - m) / 2;
        } else {
          j = 0;
        }
        n = j;
        if (i2 > 0) {
          n = 0;
        }
        m = k;
        k = 0;
        while (k < i11)
        {
          if (bool) {
            j = i11 - (k + 1);
          } else {
            j = k;
          }
          localObject = (h)a.get(j);
          if (a.iterator() == 8)
          {
            c.a(m);
            b.a(m);
            j = m;
          }
          else
          {
            j = m;
            if (k > 0) {
              if (bool) {
                j = m - n;
              } else {
                j = m + n;
              }
            }
            m = j;
            if (k > 0)
            {
              m = j;
              if (k >= i6)
              {
                m = c.d;
                if (bool) {
                  m = j - m;
                } else {
                  m = j + m;
                }
              }
            }
            if (bool) {
              paramL = b;
            } else {
              paramL = c;
            }
            paramL.a(m);
            paramL = d;
            i1 = g;
            j = i1;
            if (g == c.a)
            {
              j = i1;
              if (h == 1) {
                j = a;
              }
            }
            if (bool) {
              m -= j;
            } else {
              m += j;
            }
            if (bool) {
              paramL = c;
            } else {
              paramL = b;
            }
            paramL.a(m);
            k = true;
            j = m;
            if (k < i10)
            {
              j = m;
              if (k < i7)
              {
                j = -b.d;
                if (bool) {
                  j = m - j;
                } else {
                  j = m + j;
                }
              }
            }
          }
          k += 1;
          m = j;
        }
      }
      if (j == 0)
      {
        n = (i12 - m) / (n + 1);
        if (i2 > 0) {
          n = 0;
        }
        j = k;
        k = 0;
        while (k < i11)
        {
          if (bool) {
            m = i11 - (k + 1);
          } else {
            m = k;
          }
          localObject = (h)a.get(m);
          if (a.iterator() == 8)
          {
            c.a(j);
            b.a(j);
          }
          else
          {
            if (bool) {
              m = j - n;
            } else {
              m = j + n;
            }
            j = m;
            if (k > 0)
            {
              j = m;
              if (k >= i6)
              {
                j = c.d;
                if (bool) {
                  j = m - j;
                } else {
                  j = m + j;
                }
              }
            }
            if (bool) {
              paramL = b;
            } else {
              paramL = c;
            }
            paramL.a(j);
            paramL = d;
            i1 = g;
            m = i1;
            if (g == c.a)
            {
              m = i1;
              if (h == 1) {
                m = Math.min(i1, a);
              }
            }
            if (bool) {
              m = j - m;
            } else {
              m = j + m;
            }
            if (bool) {
              paramL = c;
            } else {
              paramL = b;
            }
            paramL.a(m);
            j = m;
            if (k < i10)
            {
              j = m;
              if (k < i7)
              {
                j = -b.d;
                if (bool) {
                  j = m - j;
                } else {
                  j = m + j;
                }
              }
            }
          }
          k += 1;
        }
      }
      if (j == 2)
      {
        if (i == 0) {
          f1 = a.offset();
        } else {
          f1 = a.visitAttribute();
        }
        f2 = f1;
        if (bool) {
          f2 = 1.0F - f1;
        }
        j = (int)((i12 - m) * f2 + 0.5F);
        if ((j < 0) || (i2 > 0)) {
          j = 0;
        }
        if (bool) {
          j = k - j;
        } else {
          j = k + j;
        }
        k = 0;
        while (k < i11)
        {
          if (bool) {
            m = i11 - (k + 1);
          } else {
            m = k;
          }
          localObject = (h)a.get(m);
          if (a.iterator() == 8)
          {
            c.a(j);
            b.a(j);
          }
          else
          {
            m = j;
            if (k > 0)
            {
              m = j;
              if (k >= i6)
              {
                m = c.d;
                if (bool) {
                  m = j - m;
                } else {
                  m = j + m;
                }
              }
            }
            if (bool) {
              paramL = b;
            } else {
              paramL = c;
            }
            paramL.a(m);
            paramL = d;
            n = g;
            j = n;
            if (g == c.a)
            {
              j = n;
              if (h == 1) {
                j = a;
              }
            }
            if (bool) {
              m -= j;
            } else {
              m += j;
            }
            if (bool) {
              paramL = c;
            } else {
              paramL = b;
            }
            paramL.a(m);
            j = m;
            if (k < i10)
            {
              j = m;
              if (k < i7)
              {
                j = -b.d;
                if (bool) {
                  j = m - j;
                } else {
                  j = m + j;
                }
              }
            }
          }
          k += 1;
        }
      }
    }
  }
  
  boolean b()
  {
    int k = a.size();
    int j = 0;
    while (j < k)
    {
      if (!((h)a.get(j)).b()) {
        return false;
      }
      j += 1;
    }
    return true;
  }
  
  public void c()
  {
    int j = 0;
    while (j < a.size())
    {
      ((h)a.get(j)).c();
      j += 1;
    }
  }
  
  public long draw()
  {
    int k = a.size();
    long l = 0L;
    int j = 0;
    while (j < k)
    {
      h localH = (h)a.get(j);
      l = l + c.d + localH.draw() + b.d;
      j += 1;
    }
    return l;
  }
  
  void e()
  {
    f = null;
    Iterator localIterator = a.iterator();
    while (localIterator.hasNext()) {
      ((h)localIterator.next()).e();
    }
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("ChainRun ");
    if (i == 0) {
      localObject = "horizontal : ";
    } else {
      localObject = "vertical : ";
    }
    localStringBuilder.append((String)localObject);
    Object localObject = a.iterator();
    while (((Iterator)localObject).hasNext())
    {
      h localH = (h)((Iterator)localObject).next();
      localStringBuilder.append("<");
      localStringBuilder.append(localH);
      localStringBuilder.append("> ");
    }
    return localStringBuilder.toString();
  }
}
