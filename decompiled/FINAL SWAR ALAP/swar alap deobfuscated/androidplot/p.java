package androidplot;

import adapters.MethodWriter;
import adapters.i;
import java.util.List;

class p
  extends h
{
  public p(MethodWriter paramMethodWriter)
  {
    super(paramMethodWriter);
    l.e();
    f.e();
    i = ((i)paramMethodWriter).b();
  }
  
  private void a(Label paramLabel)
  {
    c.f.add(paramLabel);
    c.add(c);
  }
  
  void a()
  {
    Object localObject = (i)a;
    int j = ((i)localObject).i();
    int i = j;
    int k = ((i)localObject).n();
    ((i)localObject).g();
    if (((i)localObject).b() == 1)
    {
      localObject = c;
      if (j != -1)
      {
        c.add(a.r.l.c);
        a.r.l.c.f.add(c);
        localObject = c;
      }
      for (;;)
      {
        d = i;
        break label237;
        if (k == -1) {
          break;
        }
        c.add(a.r.l.b);
        a.r.l.b.f.add(c);
        localObject = c;
        i = -k;
      }
      h = true;
      c.add(a.r.l.b);
      a.r.l.b.f.add(c);
      label237:
      a(a.l.c);
      localObject = a.l;
    }
    else
    {
      localObject = c;
      if (j != -1)
      {
        c.add(a.r.f.c);
        a.r.f.c.f.add(c);
        localObject = c;
      }
      for (;;)
      {
        d = i;
        break label462;
        if (k == -1) {
          break;
        }
        c.add(a.r.f.b);
        a.r.f.b.f.add(c);
        localObject = c;
        i = -k;
      }
      h = true;
      c.add(a.r.f.b);
      a.r.f.b.f.add(c);
      label462:
      a(a.f.c);
      localObject = a.f;
    }
    a(b);
  }
  
  public void a(l paramL)
  {
    paramL = c;
    if (!q) {
      return;
    }
    if (b) {
      return;
    }
    paramL = (Label)c.get(0);
    i localI = (i)a;
    int i = (int)(g * localI.g() + 0.5F);
    c.a(i);
  }
  
  boolean b()
  {
    return false;
  }
  
  public void c()
  {
    if (((i)a).b() == 1)
    {
      a.equals(c.g);
      return;
    }
    a.setText(c.g);
  }
  
  void e()
  {
    c.a();
  }
}
