package androidplot;

import adapters.MethodWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Label
  implements l
{
  h a;
  public boolean b = false;
  List c = new ArrayList();
  int d;
  ByteVector e = null;
  List f = new ArrayList();
  public int g;
  public boolean h = false;
  public l i = null;
  int j = 1;
  Plot.RenderMode k = Plot.RenderMode.SUBDIVIDE;
  public boolean q = false;
  
  public Label(h paramH)
  {
    a = paramH;
  }
  
  public void a()
  {
    c.clear();
    f.clear();
    b = false;
    g = 0;
    q = false;
    h = false;
  }
  
  public void a(int paramInt)
  {
    if (b) {
      return;
    }
    b = true;
    g = paramInt;
    Iterator localIterator = f.iterator();
    while (localIterator.hasNext())
    {
      l localL = (l)localIterator.next();
      localL.a(localL);
    }
  }
  
  public void a(l paramL)
  {
    paramL = c.iterator();
    while (paramL.hasNext()) {
      if (!nextb) {
        return;
      }
    }
    q = true;
    paramL = i;
    if (paramL != null) {
      paramL.a(this);
    }
    if (h)
    {
      a.a(this);
      return;
    }
    Iterator localIterator = c.iterator();
    paramL = null;
    int m = 0;
    Object localObject;
    while (localIterator.hasNext())
    {
      localObject = (Label)localIterator.next();
      if (!(localObject instanceof ByteVector))
      {
        m += 1;
        paramL = (l)localObject;
      }
    }
    if ((paramL != null) && (m == 1) && (b))
    {
      localObject = e;
      if (localObject != null) {
        if (b) {
          d = (j * g);
        } else {
          return;
        }
      }
      a(g + d);
    }
    paramL = i;
    if (paramL != null) {
      paramL.a(this);
    }
  }
  
  public void b(l paramL)
  {
    f.add(paramL);
    if (b) {
      paramL.a(paramL);
    }
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(a.a.getString());
    localStringBuilder.append(":");
    localStringBuilder.append(k);
    localStringBuilder.append("(");
    Object localObject;
    if (b) {
      localObject = Integer.valueOf(g);
    } else {
      localObject = "unresolved";
    }
    localStringBuilder.append(localObject);
    localStringBuilder.append(") <t=");
    localStringBuilder.append(c.size());
    localStringBuilder.append(":d=");
    localStringBuilder.append(f.size());
    localStringBuilder.append(">");
    return localStringBuilder.toString();
  }
}
