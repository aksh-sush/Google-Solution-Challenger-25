package adapters;

import androidplot.ClassReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import tree.c;

public class Label
{
  public final MethodWriter a;
  public Label b;
  private HashSet c = null;
  private boolean e;
  private int g;
  public final Handle h;
  tree.Label i;
  int n = Integer.MIN_VALUE;
  public int r = 0;
  
  public Label(MethodWriter paramMethodWriter, Handle paramHandle)
  {
    a = paramMethodWriter;
    h = paramHandle;
  }
  
  public int a()
  {
    if (a.iterator() == 8) {
      return 0;
    }
    if (n != Integer.MIN_VALUE)
    {
      Label localLabel = b;
      if ((localLabel != null) && (a.iterator() == 8)) {
        return n;
      }
    }
    return r;
  }
  
  public void a(int paramInt)
  {
    g = paramInt;
    e = true;
  }
  
  public void a(int paramInt, ArrayList paramArrayList, androidplot.i paramI)
  {
    Object localObject = c;
    if (localObject != null)
    {
      localObject = ((HashSet)localObject).iterator();
      while (((Iterator)localObject).hasNext()) {
        ClassReader.a(nexta, paramInt, paramArrayList, paramI);
      }
    }
  }
  
  public void a(c paramC)
  {
    paramC = i;
    if (paramC == null)
    {
      i = new tree.Label(tree.Handle.a, null);
      return;
    }
    paramC.a();
  }
  
  public boolean a(Label paramLabel)
  {
    boolean bool4 = false;
    boolean bool3 = false;
    if (paramLabel == null) {
      return false;
    }
    Handle localHandle1 = paramLabel.d();
    Handle localHandle2 = h;
    boolean bool2;
    if (localHandle1 == localHandle2)
    {
      if (localHandle2 == Handle.d)
      {
        if (paramLabel.getName().trim())
        {
          if (getName().trim()) {
            break label340;
          }
          return false;
        }
      }
      else {
        return true;
      }
    }
    else
    {
      boolean bool1;
      switch (Item.c[localHandle2.ordinal()])
      {
      default: 
        throw new AssertionError(h.name());
      case 7: 
      case 8: 
      case 9: 
        return false;
      case 6: 
        if (localHandle1 != Handle.c) {
          return localHandle1 != Handle.a;
        }
        return false;
      case 4: 
      case 5: 
        if ((localHandle1 != Handle.i) && (localHandle1 != Handle.b)) {
          bool1 = false;
        } else {
          bool1 = true;
        }
        bool2 = bool1;
        if (!(paramLabel.getName() instanceof i)) {
          break;
        }
        if (!bool1)
        {
          bool1 = bool3;
          if (localHandle1 != Handle.e) {}
        }
        else
        {
          bool1 = true;
        }
        return bool1;
      case 2: 
      case 3: 
        if ((localHandle1 != Handle.c) && (localHandle1 != Handle.a)) {
          bool1 = false;
        } else {
          bool1 = true;
        }
        bool2 = bool1;
        if (!(paramLabel.getName() instanceof i)) {
          break;
        }
        if (!bool1)
        {
          bool1 = bool4;
          if (localHandle1 != Handle.g) {}
        }
        else
        {
          bool1 = true;
        }
        return bool1;
      case 1: 
        if ((localHandle1 == Handle.d) || (localHandle1 == Handle.g) || (localHandle1 == Handle.e)) {
          break label344;
        }
        return true;
      }
    }
    return false;
    label340:
    return true;
    return bool2;
    label344:
    return false;
  }
  
  public boolean a(Label paramLabel, int paramInt)
  {
    return a(paramLabel, paramInt, Integer.MIN_VALUE, false);
  }
  
  public boolean a(Label paramLabel, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    if (paramLabel == null)
    {
      add();
      return true;
    }
    if ((!paramBoolean) && (!a(paramLabel))) {
      return false;
    }
    b = paramLabel;
    if (c == null) {
      c = new HashSet();
    }
    paramLabel = b.c;
    if (paramLabel != null) {
      paramLabel.add(this);
    }
    r = paramInt1;
    n = paramInt2;
    return true;
  }
  
  public void add()
  {
    Object localObject = b;
    if (localObject != null)
    {
      localObject = c;
      if (localObject != null)
      {
        ((HashSet)localObject).remove(this);
        if (b.c.size() == 0) {
          b.c = null;
        }
      }
    }
    c = null;
    b = null;
    r = 0;
    n = Integer.MIN_VALUE;
    e = false;
    g = 0;
  }
  
  public final Label b()
  {
    switch (Item.c[h.ordinal()])
    {
    default: 
      throw new AssertionError(h.name());
    case 5: 
      return a.j;
    case 4: 
      return a.a;
    case 3: 
      return a.b;
    case 2: 
      return a.c;
    }
    return null;
  }
  
  public void b(int paramInt)
  {
    if (remove()) {
      n = paramInt;
    }
  }
  
  public tree.Label c()
  {
    return i;
  }
  
  public Handle d()
  {
    return h;
  }
  
  public boolean draw()
  {
    Object localObject = c;
    if (localObject == null) {
      return false;
    }
    localObject = ((HashSet)localObject).iterator();
    while (((Iterator)localObject).hasNext()) {
      if (((Label)((Iterator)localObject).next()).b().remove()) {
        return true;
      }
    }
    return false;
  }
  
  public int e()
  {
    if (!e) {
      return 0;
    }
    return g;
  }
  
  public boolean equals()
  {
    return e;
  }
  
  public HashSet get()
  {
    return c;
  }
  
  public MethodWriter getName()
  {
    return a;
  }
  
  public Label getText()
  {
    return b;
  }
  
  public void next()
  {
    e = false;
    g = 0;
  }
  
  public boolean put()
  {
    HashSet localHashSet = c;
    if (localHashSet == null) {
      return false;
    }
    return localHashSet.size() > 0;
  }
  
  public boolean remove()
  {
    return b != null;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(a.getString());
    localStringBuilder.append(":");
    localStringBuilder.append(h.toString());
    return localStringBuilder.toString();
  }
}
