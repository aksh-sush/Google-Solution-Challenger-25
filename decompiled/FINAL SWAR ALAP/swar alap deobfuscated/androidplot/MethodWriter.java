package androidplot;

import adapters.b;
import java.util.Iterator;
import java.util.List;

class MethodWriter
  extends h
{
  public MethodWriter(adapters.MethodWriter paramMethodWriter)
  {
    super(paramMethodWriter);
  }
  
  private void a(Label paramLabel)
  {
    c.f.add(paramLabel);
    c.add(c);
  }
  
  void a()
  {
    Object localObject1 = a;
    if ((localObject1 instanceof adapters.h))
    {
      c.h = true;
      localObject1 = (adapters.h)localObject1;
      int n = ((adapters.h)localObject1).i();
      boolean bool = ((adapters.h)localObject1).n();
      int j = 0;
      int k = 0;
      int m = 0;
      int i = 0;
      Object localObject2;
      if (n != 0)
      {
        if (n != 1)
        {
          if (n != 2)
          {
            if (n != 3) {
              return;
            }
            c.k = Plot.RenderMode.k;
            while (i < i)
            {
              localObject2 = a[i];
              if ((bool) || (((adapters.MethodWriter)localObject2).iterator() != 8))
              {
                localObject2 = f.b;
                f.add(c);
                c.c.add(localObject2);
              }
              i += 1;
            }
          }
          c.k = Plot.RenderMode.b;
          i = j;
          while (i < i)
          {
            localObject2 = a[i];
            if ((bool) || (((adapters.MethodWriter)localObject2).iterator() != 8))
            {
              localObject2 = f.c;
              f.add(c);
              c.c.add(localObject2);
            }
            i += 1;
          }
          a(a.f.c);
          localObject1 = a.f;
        }
        else
        {
          c.k = Plot.RenderMode.a;
          i = k;
          while (i < i)
          {
            localObject2 = a[i];
            if ((bool) || (((adapters.MethodWriter)localObject2).iterator() != 8))
            {
              localObject2 = l.b;
              f.add(c);
              c.c.add(localObject2);
            }
            i += 1;
          }
        }
      }
      else
      {
        c.k = Plot.RenderMode.e;
        i = m;
        while (i < i)
        {
          localObject2 = a[i];
          if ((bool) || (((adapters.MethodWriter)localObject2).iterator() != 8))
          {
            localObject2 = l.c;
            f.add(c);
            c.c.add(localObject2);
          }
          i += 1;
        }
        a(a.l.c);
        localObject1 = a.l;
      }
      a(b);
    }
  }
  
  public void a(l paramL)
  {
    paramL = (adapters.h)a;
    int n = paramL.i();
    Iterator localIterator = c.c.iterator();
    int i = 0;
    int j = -1;
    while (localIterator.hasNext())
    {
      int k = nextg;
      int m;
      if (j != -1)
      {
        m = j;
        if (k >= j) {}
      }
      else
      {
        m = k;
      }
      j = m;
      if (i < k)
      {
        i = k;
        j = m;
      }
    }
    if ((n != 0) && (n != 2))
    {
      c.a(i + paramL.getCount());
      return;
    }
    c.a(j + paramL.getCount());
  }
  
  boolean b()
  {
    return false;
  }
  
  public void c()
  {
    adapters.MethodWriter localMethodWriter = a;
    if ((localMethodWriter instanceof adapters.h))
    {
      int i = ((adapters.h)localMethodWriter).i();
      if ((i != 0) && (i != 1))
      {
        a.setText(c.g);
        return;
      }
      a.equals(c.g);
    }
  }
  
  void e()
  {
    f = null;
    c.a();
  }
}
