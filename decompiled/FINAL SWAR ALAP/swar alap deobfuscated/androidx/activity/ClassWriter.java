package androidx.activity;

import astuetz.Function;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import model.Log;

public abstract class ClassWriter
{
  private Function a;
  private boolean g;
  private final CopyOnWriteArrayList m;
  
  public ClassWriter(boolean paramBoolean)
  {
    g = paramBoolean;
    m = new CopyOnWriteArrayList();
  }
  
  public final void a()
  {
    Iterator localIterator = m.iterator();
    while (localIterator.hasNext()) {
      ((View)localIterator.next()).cancel();
    }
  }
  
  public final void a(View paramView)
  {
    Log.get(paramView, "cancellable");
    m.add(paramView);
  }
  
  public void a(b paramB)
  {
    Log.get(paramB, "backEvent");
  }
  
  public final void a(boolean paramBoolean)
  {
    g = paramBoolean;
    Function localFunction = a;
    if (localFunction != null) {
      localFunction.invoke();
    }
  }
  
  public void append() {}
  
  public final Function get()
  {
    return a;
  }
  
  public final void get(View paramView)
  {
    Log.get(paramView, "cancellable");
    m.remove(paramView);
  }
  
  public final boolean next()
  {
    return g;
  }
  
  public void put(b paramB)
  {
    Log.get(paramB, "backEvent");
  }
  
  public final void visitAttribute(Function paramFunction)
  {
    a = paramFunction;
  }
  
  public abstract void visitEnd();
}
