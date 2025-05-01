package adapters;

import java.util.ArrayList;
import tree.ClassWriter;

public class i
  extends MethodWriter
{
  private Label a = this.j;
  protected int b = -1;
  private int c;
  private int d;
  protected boolean f = true;
  protected int l = -1;
  private boolean m;
  protected float n = -1.0F;
  
  public i()
  {
    int i = 0;
    c = 0;
    d = 0;
    right.clear();
    right.add(a);
    int j = u.length;
    while (i < j)
    {
      u[i] = a;
      i += 1;
    }
  }
  
  public Label a()
  {
    return a;
  }
  
  public Label a(Handle paramHandle)
  {
    int i = YPositionMetric.a.a[paramHandle.ordinal()];
    if ((i != 1) && (i != 2))
    {
      if (((i == 3) || (i == 4)) && (c == 0)) {
        return a;
      }
    }
    else if (c == 1) {
      return a;
    }
    return null;
  }
  
  public void a(float paramFloat)
  {
    if (paramFloat > -1.0F)
    {
      n = paramFloat;
      l = -1;
      b = -1;
    }
  }
  
  public void a(int paramInt)
  {
    if (c == paramInt) {
      return;
    }
    c = paramInt;
    right.clear();
    Label localLabel;
    if (c == 1) {
      localLabel = b;
    } else {
      localLabel = j;
    }
    a = localLabel;
    right.add(a);
    int i = u.length;
    paramInt = 0;
    while (paramInt < i)
    {
      u[paramInt] = a;
      paramInt += 1;
    }
  }
  
  public void a(ClassWriter paramClassWriter, boolean paramBoolean)
  {
    Object localObject2 = (f)l();
    if (localObject2 == null) {
      return;
    }
    Label localLabel = ((MethodWriter)localObject2).a(Handle.c);
    Object localObject1 = ((MethodWriter)localObject2).a(Handle.a);
    MethodWriter localMethodWriter = r;
    int j = 1;
    int i;
    if ((localMethodWriter != null) && (t[0] == c.c)) {
      i = 1;
    } else {
      i = 0;
    }
    if (c == 0)
    {
      localLabel = ((MethodWriter)localObject2).a(Handle.i);
      localObject1 = ((MethodWriter)localObject2).a(Handle.b);
      localObject2 = r;
      if ((localObject2 != null) && (t[1] == c.c)) {
        i = j;
      } else {
        i = 0;
      }
    }
    if ((m) && (a.equals()))
    {
      localObject2 = paramClassWriter.a(a);
      paramClassWriter.a((tree.Label)localObject2, a.e());
      if (l != -1)
      {
        if (i != 0) {
          paramClassWriter.d(paramClassWriter.a(localObject1), (tree.Label)localObject2, 0, 5);
        }
      }
      else if ((b != -1) && (i != 0))
      {
        localObject1 = paramClassWriter.a(localObject1);
        paramClassWriter.d((tree.Label)localObject2, paramClassWriter.a(localLabel), 0, 5);
        paramClassWriter.d((tree.Label)localObject1, (tree.Label)localObject2, 0, 5);
      }
      m = false;
      return;
    }
    if (l != -1)
    {
      localObject2 = paramClassWriter.a(a);
      paramClassWriter.a((tree.Label)localObject2, paramClassWriter.a(localLabel), l, 8);
      if (i != 0) {
        paramClassWriter.d(paramClassWriter.a(localObject1), (tree.Label)localObject2, 0, 5);
      }
    }
    else if (b != -1)
    {
      localObject2 = paramClassWriter.a(a);
      localObject1 = paramClassWriter.a(localObject1);
      paramClassWriter.a((tree.Label)localObject2, (tree.Label)localObject1, -b, 8);
      if (i != 0)
      {
        paramClassWriter.d((tree.Label)localObject2, paramClassWriter.a(localLabel), 0, 5);
        paramClassWriter.d((tree.Label)localObject1, (tree.Label)localObject2, 0, 5);
      }
    }
    else if (n != -1.0F)
    {
      paramClassWriter.b(ClassWriter.a(paramClassWriter, paramClassWriter.a(a), paramClassWriter.a(localObject1), n));
    }
  }
  
  public int b()
  {
    return c;
  }
  
  public void b(int paramInt)
  {
    if (paramInt > -1)
    {
      n = -1.0F;
      l = paramInt;
      b = -1;
    }
  }
  
  public void b(ClassWriter paramClassWriter, boolean paramBoolean)
  {
    if (l() == null) {
      return;
    }
    int i = paramClassWriter.b(a);
    if (c == 1)
    {
      equals(i);
      setText(0);
      get(l().getValue());
      append(0);
      return;
    }
    equals(0);
    setText(i);
    append(l().get());
    get(0);
  }
  
  public boolean d()
  {
    return m;
  }
  
  public void e(int paramInt)
  {
    a.a(paramInt);
    m = true;
  }
  
  public float g()
  {
    return n;
  }
  
  public void g(int paramInt)
  {
    if (paramInt > -1)
    {
      n = -1.0F;
      l = -1;
      b = paramInt;
    }
  }
  
  public int i()
  {
    return l;
  }
  
  public boolean k()
  {
    return true;
  }
  
  public boolean m()
  {
    return m;
  }
  
  public int n()
  {
    return b;
  }
}
