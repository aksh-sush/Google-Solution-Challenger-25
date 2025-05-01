package adapters;

import tree.ClassWriter;

public class h
  extends b
{
  private boolean b = true;
  private int i = 0;
  private int n = 0;
  boolean s = false;
  
  public h() {}
  
  public void a(ClassWriter paramClassWriter, boolean paramBoolean)
  {
    Object localObject1 = u;
    localObject1[0] = b;
    localObject1[2] = this.j;
    localObject1[1] = c;
    localObject1[3] = a;
    int j = 0;
    for (;;)
    {
      localObject1 = u;
      if (j >= localObject1.length) {
        break;
      }
      localObject1 = localObject1[j];
      i = paramClassWriter.a(localObject1);
      j += 1;
    }
    j = i;
    if ((j >= 0) && (j < 4))
    {
      localObject1 = localObject1[j];
      if (!s) {
        a();
      }
      if (s)
      {
        s = false;
        j = i;
        if ((j != 0) && (j != 1))
        {
          if ((j != 2) && (j != 3)) {
            return;
          }
          paramClassWriter.a(ji, y);
          localObject1 = a.i;
          j = y;
        }
        else
        {
          paramClassWriter.a(b.i, length);
          localObject1 = c.i;
          j = length;
        }
        paramClassWriter.a((tree.Label)localObject1, j);
      }
      else
      {
        j = 0;
        Object localObject2;
        while (j < i)
        {
          localObject2 = a[j];
          if ((b) || (((MethodWriter)localObject2).k()))
          {
            k = i;
            if (((k == 0) || (k == 1)) && (((MethodWriter)localObject2).charAt() == c.a) && (b.b != null) && (c.b != null)) {}
            do
            {
              paramBoolean = true;
              break;
              k = i;
            } while (((k == 2) || (k == 3)) && (((MethodWriter)localObject2).isEmpty() == c.a) && (j.b != null) && (a.b != null));
          }
          j += 1;
        }
        paramBoolean = false;
        if ((!b.draw()) && (!c.draw())) {
          j = 0;
        } else {
          j = 1;
        }
        if ((!this.j.draw()) && (!a.draw())) {
          k = 0;
        } else {
          k = 1;
        }
        int m;
        if (!paramBoolean)
        {
          m = i;
          if (((m == 0) && (j != 0)) || ((m == 2) && (k != 0)) || ((m == 1) && (j != 0)) || ((m == 3) && (k != 0)))
          {
            j = 1;
            break label491;
          }
        }
        j = 0;
        label491:
        if (j == 0) {
          j = 4;
        } else {
          j = 5;
        }
        int k = 0;
        while (k < i)
        {
          Object localObject3 = a[k];
          if ((b) || (((MethodWriter)localObject3).k()))
          {
            localObject2 = paramClassWriter.a(u[i]);
            localObject3 = u;
            int i1 = i;
            localObject3 = localObject3[i1];
            i = ((tree.Label)localObject2);
            Label localLabel = b;
            if ((localLabel != null) && (a == this)) {
              m = r + 0;
            } else {
              m = 0;
            }
            if ((i1 != 0) && (i1 != 2)) {
              paramClassWriter.a(i, (tree.Label)localObject2, n + m, paramBoolean);
            } else {
              paramClassWriter.b(i, (tree.Label)localObject2, n - m, paramBoolean);
            }
            paramClassWriter.a(i, (tree.Label)localObject2, n + m, j);
          }
          k += 1;
        }
        j = i;
        if (j == 0)
        {
          paramClassWriter.a(c.i, b.i, 0, 8);
          paramClassWriter.a(b.i, r.c.i, 0, 4);
          localObject2 = b.i;
          localObject1 = r.b;
        }
        for (;;)
        {
          paramClassWriter.a((tree.Label)localObject2, i, 0, 0);
          return;
          if (j == 1)
          {
            paramClassWriter.a(b.i, c.i, 0, 8);
            paramClassWriter.a(b.i, r.b.i, 0, 4);
            localObject2 = b.i;
            localObject1 = r.c;
          }
          else if (j == 2)
          {
            paramClassWriter.a(a.i, ji, 0, 8);
            paramClassWriter.a(ji, r.a.i, 0, 4);
            localObject2 = ji;
            localObject1 = r.j;
          }
          else
          {
            if (j != 3) {
              break;
            }
            paramClassWriter.a(ji, a.i, 0, 8);
            paramClassWriter.a(ji, r.j.i, 0, 4);
            localObject2 = ji;
            localObject1 = r.a;
          }
        }
      }
    }
  }
  
  public boolean a()
  {
    int i2 = 0;
    int j = 0;
    int m;
    Object localObject;
    int i1;
    for (int k = 1;; k = m)
    {
      m = i;
      if (j >= m) {
        break;
      }
      localObject = a[j];
      if ((!b) && (!((MethodWriter)localObject).k()))
      {
        m = k;
      }
      else
      {
        m = i;
        if (((m == 0) || (m == 1)) && (!((MethodWriter)localObject).d())) {}
        do
        {
          m = 0;
          break;
          i1 = i;
          if (i1 != 2)
          {
            m = k;
            if (i1 != 3) {
              break;
            }
          }
          m = k;
        } while (!((MethodWriter)localObject).m());
      }
      j += 1;
    }
    if ((k != 0) && (m > 0))
    {
      j = 0;
      m = 0;
      while (i2 < i)
      {
        MethodWriter localMethodWriter = a[i2];
        if ((b) || (localMethodWriter.k()))
        {
          i1 = j;
          k = m;
          if (m == 0)
          {
            k = i;
            if (k == 0) {
              localObject = Handle.c;
            }
            for (;;)
            {
              j = localMethodWriter.a((Handle)localObject).e();
              break;
              if (k == 1)
              {
                localObject = Handle.a;
              }
              else if (k == 2)
              {
                localObject = Handle.i;
              }
              else
              {
                if (k != 3) {
                  break;
                }
                localObject = Handle.b;
              }
            }
            k = 1;
            i1 = j;
          }
          int i3 = i;
          if (i3 == 0)
          {
            localObject = Handle.c;
            j = Math.min(i1, localMethodWriter.a((Handle)localObject).e());
            m = k;
          }
          else
          {
            if (i3 == 1) {}
            for (localObject = Handle.a;; localObject = Handle.b)
            {
              j = Math.max(i1, localMethodWriter.a((Handle)localObject).e());
              m = k;
              break label345;
              if (i3 == 2)
              {
                localObject = Handle.i;
                break;
              }
              j = i1;
              m = k;
              if (i3 != 3) {
                break label345;
              }
            }
          }
        }
        label345:
        i2 += 1;
      }
      j += n;
      k = i;
      if ((k != 0) && (k != 1)) {
        b(j, j);
      } else {
        add(j, j);
      }
      s = true;
      return true;
    }
    return false;
  }
  
  protected void b()
  {
    int j = 0;
    while (j < i)
    {
      MethodWriter localMethodWriter = a[j];
      if ((b) || (localMethodWriter.k()))
      {
        int k = i;
        if ((k != 0) && (k != 1))
        {
          if ((k == 2) || (k == 3)) {
            localMethodWriter.a(1, true);
          }
        }
        else {
          localMethodWriter.a(0, true);
        }
      }
      j += 1;
    }
  }
  
  public int c()
  {
    int j = i;
    if ((j != 0) && (j != 1))
    {
      if (j != 2)
      {
        if (j != 3) {
          return -1;
        }
      }
      else {
        return 1;
      }
    }
    else {
      return 0;
    }
    return 1;
  }
  
  public void d(int paramInt)
  {
    i = paramInt;
  }
  
  public boolean d()
  {
    return s;
  }
  
  public int getCount()
  {
    return n;
  }
  
  public int i()
  {
    return i;
  }
  
  public boolean k()
  {
    return true;
  }
  
  public boolean m()
  {
    return s;
  }
  
  public boolean n()
  {
    return b;
  }
  
  public void setEnabled(int paramInt)
  {
    n = paramInt;
  }
  
  public void setEnabled(boolean paramBoolean)
  {
    b = paramBoolean;
  }
  
  public String toString()
  {
    Object localObject1 = new StringBuilder();
    ((StringBuilder)localObject1).append("[Barrier] ");
    ((StringBuilder)localObject1).append(getString());
    ((StringBuilder)localObject1).append(" {");
    localObject1 = ((StringBuilder)localObject1).toString();
    int j = 0;
    while (j < i)
    {
      MethodWriter localMethodWriter = a[j];
      localObject2 = localObject1;
      if (j > 0)
      {
        localObject2 = new StringBuilder();
        ((StringBuilder)localObject2).append((String)localObject1);
        ((StringBuilder)localObject2).append(", ");
        localObject2 = ((StringBuilder)localObject2).toString();
      }
      localObject1 = new StringBuilder();
      ((StringBuilder)localObject1).append((String)localObject2);
      ((StringBuilder)localObject1).append(localMethodWriter.getString());
      localObject1 = ((StringBuilder)localObject1).toString();
      j += 1;
    }
    Object localObject2 = new StringBuilder();
    ((StringBuilder)localObject2).append((String)localObject1);
    ((StringBuilder)localObject2).append("}");
    return ((StringBuilder)localObject2).toString();
  }
}
