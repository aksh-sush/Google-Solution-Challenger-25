package androidplot;

import adapters.Handle;
import adapters.MethodWriter;
import adapters.c;
import java.util.List;

public class m
  extends h
{
  public Label a;
  ByteVector b;
  
  public m(MethodWriter paramMethodWriter)
  {
    super(paramMethodWriter);
    paramMethodWriter = new Label(this);
    a = paramMethodWriter;
    b = null;
    c.k = Plot.RenderMode.b;
    b.k = Plot.RenderMode.k;
    k = Plot.RenderMode.USE_MAIN_THREAD;
    i = 1;
  }
  
  void a()
  {
    Object localObject1 = a;
    if (k) {
      d.a(((MethodWriter)localObject1).getValue());
    }
    int i;
    if (!d.b)
    {
      g = a.isEmpty();
      if (a.trim()) {
        b = new LayoutManager(this);
      }
      localObject1 = g;
      if (localObject1 != c.a)
      {
        if (localObject1 == c.d)
        {
          localObject1 = a.l();
          if ((localObject1 != null) && (((MethodWriter)localObject1).isEmpty() == c.b))
          {
            i = ((MethodWriter)localObject1).getValue();
            int j = a.j.a();
            int k = a.a.a();
            a(c, f.c, a.j.a());
            a(b, f.b, -a.a.a());
            d.a(i - j - k);
            return;
          }
        }
        if (g == c.b) {
          d.a(a.getValue());
        }
      }
    }
    else if (g == c.d)
    {
      localObject1 = a.l();
      if ((localObject1 != null) && (((MethodWriter)localObject1).isEmpty() == c.b))
      {
        a(c, f.c, a.j.a());
        a(b, f.b, -a.a.a());
        return;
      }
    }
    Object localObject2 = d;
    boolean bool = b;
    if (bool)
    {
      localObject1 = a;
      if (k)
      {
        localObject2 = u;
        localObject3 = localObject2[2];
        localLabel = b;
        if ((localLabel != null) && (3b != null))
        {
          if (((MethodWriter)localObject1).equals())
          {
            c.d = a.u[2].a();
            b.d = (-a.u[3].a());
          }
          else
          {
            localObject1 = a(a.u[2]);
            if (localObject1 != null) {
              a(c, (Label)localObject1, a.u[2].a());
            }
            localObject1 = a(a.u[3]);
            if (localObject1 != null) {
              a(b, (Label)localObject1, -a.u[3].a());
            }
            c.h = true;
            b.h = true;
          }
          if (!a.trim()) {
            return;
          }
        }
        for (;;)
        {
          localObject1 = a;
          localObject2 = c;
          for (i = a.readUnsignedShort();; i = d.g)
          {
            a((Label)localObject1, (Label)localObject2, i);
            return;
            if (localLabel != null)
            {
              localObject1 = a((adapters.Label)localObject3);
              if (localObject1 == null) {
                return;
              }
              a(c, (Label)localObject1, a.u[2].a());
              a(b, c, d.g);
              if (!a.trim()) {
                return;
              }
              break;
            }
            localObject3 = localObject2[3];
            if (b != null)
            {
              localObject1 = a((adapters.Label)localObject3);
              if (localObject1 != null)
              {
                a(b, (Label)localObject1, -a.u[3].a());
                a(c, b, -d.g);
              }
              if (!a.trim()) {
                return;
              }
              break;
            }
            localObject2 = localObject2[4];
            if (b == null) {
              break label820;
            }
            localObject1 = a((adapters.Label)localObject2);
            if (localObject1 == null) {
              return;
            }
            a(a, (Label)localObject1, 0);
            a(c, a, -a.readUnsignedShort());
            localObject1 = b;
            localObject2 = c;
          }
          label820:
          if (((localObject1 instanceof adapters.l)) || (((MethodWriter)localObject1).l() == null) || (a.a(Handle.r).b != null)) {
            break;
          }
          localObject1 = a.l().f.c;
          a(c, (Label)localObject1, a.size());
          a(b, c, d.g);
          if (!a.trim()) {
            break;
          }
        }
      }
    }
    if ((!bool) && (g == c.a))
    {
      localObject1 = a;
      i = i;
      if (i != 2)
      {
        if ((i != 3) || (((MethodWriter)localObject1).equals())) {
          break label1104;
        }
        localObject1 = a;
        if (h == 3) {
          break label1104;
        }
        localObject1 = l;
      }
      else
      {
        localObject1 = ((MethodWriter)localObject1).l();
        if (localObject1 == null) {
          break label1104;
        }
        localObject1 = f;
      }
      localObject1 = d;
      d.c.add(localObject1);
      f.add(d);
      localObject1 = d;
      h = true;
      f.add(c);
      d.f.add(b);
    }
    else
    {
      ((Label)localObject2).b(this);
    }
    label1104:
    localObject1 = a;
    localObject2 = u;
    Object localObject3 = localObject2[2];
    adapters.Label localLabel = b;
    if ((localLabel != null) && (3b != null))
    {
      if (((MethodWriter)localObject1).equals())
      {
        c.d = a.u[2].a();
        b.d = (-a.u[3].a());
      }
      else
      {
        localObject1 = a(a.u[2]);
        localObject2 = a(a.u[3]);
        if (localObject1 != null) {
          ((Label)localObject1).b(this);
        }
        if (localObject2 != null) {
          ((Label)localObject2).b(this);
        }
        e = MathArrays.OrderDirection.e;
      }
      if (a.trim())
      {
        localObject2 = a;
        localObject3 = c;
      }
    }
    else
    {
      for (localObject1 = b;; localObject1 = d)
      {
        a((Label)localObject2, (Label)localObject3, 1, (ByteVector)localObject1);
        break label1786;
        if (localLabel != null)
        {
          localObject1 = a((adapters.Label)localObject3);
          if (localObject1 == null) {
            break label1786;
          }
          a(c, (Label)localObject1, a.u[2].a());
          a(b, c, 1, d);
          if (a.trim()) {
            a(a, c, 1, b);
          }
          localObject1 = g;
          localObject3 = c.a;
          if ((localObject1 != localObject3) || (a.doubleValue() <= 0.0F)) {
            break label1786;
          }
          localObject2 = a.l;
          localObject1 = localObject2;
          if (g != localObject3) {
            break label1786;
          }
          break label1737;
        }
        localObject3 = localObject2[3];
        if (b != null)
        {
          localObject1 = a((adapters.Label)localObject3);
          if (localObject1 == null) {
            break label1786;
          }
          a(b, (Label)localObject1, -a.u[3].a());
          a(c, b, -1, d);
          if (!a.trim()) {
            break label1786;
          }
          break;
        }
        localObject2 = localObject2[4];
        if (b == null) {
          break label1592;
        }
        localObject1 = a((adapters.Label)localObject2);
        if (localObject1 == null) {
          break label1786;
        }
        a(a, (Label)localObject1, 0);
        a(c, a, -1, b);
        localObject2 = b;
        localObject3 = c;
      }
      label1592:
      if ((!(localObject1 instanceof adapters.l)) && (((MethodWriter)localObject1).l() != null))
      {
        localObject1 = a.l().f.c;
        a(c, (Label)localObject1, a.size());
        a(b, c, 1, d);
        if (a.trim()) {
          a(a, c, 1, b);
        }
        localObject1 = g;
        localObject3 = c.a;
        if ((localObject1 == localObject3) && (a.doubleValue() > 0.0F))
        {
          localObject2 = a.l;
          localObject1 = localObject2;
          if (g == localObject3)
          {
            label1737:
            d.f.add(d);
            d.c.add(a.l.d);
            d.i = this;
          }
        }
      }
    }
    label1786:
    if (d.c.size() == 0) {
      d.q = true;
    }
  }
  
  public void a(l paramL)
  {
    int i = XYGraphWidget.a.a[e.ordinal()];
    Object localObject;
    if (i != 1)
    {
      if (i != 2)
      {
        if (i == 3)
        {
          localObject = a;
          a(paramL, j, a, 1);
        }
      }
      else {
        b(paramL);
      }
    }
    else {
      setTitle(paramL);
    }
    paramL = d;
    float f;
    if ((q) && (!b) && (g == c.a))
    {
      paramL = a;
      i = i;
      if (i != 2)
      {
        if ((i != 3) || (!l.d.b)) {
          break label266;
        }
        i = paramL.readInt();
        if (i != -1) {
          if (i != 0)
          {
            if (i != 1)
            {
              i = 0;
              break label208;
            }
          }
          else
          {
            paramL = a;
            f = l.d.g * paramL.doubleValue();
            break label202;
          }
        }
        paramL = a;
        f = l.d.g / paramL.doubleValue();
      }
      label202:
      for (i = (int)(f + 0.5F);; i = (int)(g * f + 0.5F))
      {
        label208:
        d.a(i);
        break;
        paramL = paramL.l();
        if (paramL == null) {
          break;
        }
        paramL = f.d;
        if (!b) {
          break;
        }
        f = a.g;
      }
    }
    label266:
    paramL = c;
    if (q)
    {
      localObject = b;
      if (!q) {
        return;
      }
      if ((b) && (b) && (d.b)) {
        return;
      }
      int j;
      if ((!d.b) && (g == c.a))
      {
        paramL = a;
        if ((h == 0) && (!paramL.equals()))
        {
          localObject = (Label)c.c.get(0);
          paramL = (Label)b.c.get(0);
          i = g;
          localObject = c;
          i += d;
          j = g + b.d;
          ((Label)localObject).a(i);
          b.a(j);
          d.a(j - i);
          return;
        }
      }
      if ((!d.b) && (g == c.a) && (h == 1) && (c.c.size() > 0) && (b.c.size() > 0))
      {
        paramL = (Label)c.c.get(0);
        localObject = (Label)b.c.get(0);
        i = g;
        j = c.d;
        i = g + b.d - (i + j);
        paramL = d;
        j = a;
        if (i < j) {
          paramL.a(i);
        } else {
          paramL.a(j);
        }
      }
      if (!d.b) {
        return;
      }
      if ((c.c.size() > 0) && (b.c.size() > 0))
      {
        paramL = (Label)c.c.get(0);
        localObject = (Label)b.c.get(0);
        i = g + c.d;
        j = g + b.d;
        f = a.visitAttribute();
        if (paramL == localObject)
        {
          i = g;
          j = g;
          f = 0.5F;
        }
        int k = d.g;
        c.a((int)(i + 0.5F + (j - i - k) * f));
        b.a(c.g + d.g);
      }
    }
  }
  
  boolean b()
  {
    if (g == c.a) {
      return a.i == 0;
    }
    return true;
  }
  
  public void c()
  {
    Label localLabel = c;
    if (b) {
      a.setText(g);
    }
  }
  
  void d()
  {
    k = false;
    c.a();
    c.b = false;
    b.a();
    b.b = false;
    a.a();
    a.b = false;
    d.b = false;
  }
  
  void e()
  {
    f = null;
    c.a();
    b.a();
    a.a();
    d.a();
    k = false;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("VerticalRun ");
    localStringBuilder.append(a.getString());
    return localStringBuilder.toString();
  }
}
