package androidx.activity;

import android.os.Build.VERSION;
import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.Label;
import androidx.lifecycle.LifecycleEvent;
import androidx.lifecycle.c;
import androidx.lifecycle.m;
import astuetz.Function;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import model.Lambda;
import model.symbol;
import ui.LinkedList;

public final class OnBackPressedDispatcher
{
  private boolean d;
  private OnBackInvokedCallback h;
  private final Runnable key;
  private OnBackInvokedDispatcher l;
  private ClassWriter o;
  private boolean s;
  private final LinkedList tags;
  private final androidx.core.util.Log type;
  
  public OnBackPressedDispatcher(Runnable paramRunnable)
  {
    this(paramRunnable, null);
  }
  
  public OnBackPressedDispatcher(Runnable paramRunnable, androidx.core.util.Log paramLog)
  {
    key = paramRunnable;
    type = paramLog;
    tags = new LinkedList();
    int i = Build.VERSION.SDK_INT;
    if (i >= 33)
    {
      if (i >= 34) {
        paramRunnable = g.h.put(new a(this), new b(this), new c(this), new d(this));
      } else {
        paramRunnable = f.b.a(new e(this));
      }
      h = paramRunnable;
    }
  }
  
  private final void a()
  {
    boolean bool3 = s;
    Object localObject = tags;
    boolean bool1 = localObject instanceof Collection;
    boolean bool2 = false;
    if ((bool1) && (((Collection)localObject).isEmpty()))
    {
      bool1 = bool2;
    }
    else
    {
      localObject = ((Iterable)localObject).iterator();
      do
      {
        bool1 = bool2;
        if (!((Iterator)localObject).hasNext()) {
          break;
        }
      } while (!((ClassWriter)((Iterator)localObject).next()).next());
      bool1 = true;
    }
    s = bool1;
    if (bool1 != bool3)
    {
      localObject = type;
      if (localObject != null) {
        ((androidx.core.util.Log)localObject).accept(Boolean.valueOf(bool1));
      }
      if (Build.VERSION.SDK_INT >= 33) {
        b(bool1);
      }
    }
  }
  
  private final void b(boolean paramBoolean)
  {
    OnBackInvokedDispatcher localOnBackInvokedDispatcher = l;
    OnBackInvokedCallback localOnBackInvokedCallback = h;
    if ((localOnBackInvokedDispatcher != null) && (localOnBackInvokedCallback != null))
    {
      if ((paramBoolean) && (!d))
      {
        f.b.append(localOnBackInvokedDispatcher, 0, localOnBackInvokedCallback);
        d = true;
        return;
      }
      if ((!paramBoolean) && (d))
      {
        f.b.append(localOnBackInvokedDispatcher, localOnBackInvokedCallback);
        d = false;
      }
    }
  }
  
  private final void removeTag()
  {
    Object localObject1 = tags;
    ListIterator localListIterator = ((List)localObject1).listIterator(((List)localObject1).size());
    while (localListIterator.hasPrevious())
    {
      Object localObject2 = localListIterator.previous();
      localObject1 = localObject2;
      if (((ClassWriter)localObject2).next()) {
        break label51;
      }
    }
    localObject1 = null;
    label51:
    localObject1 = (ClassWriter)localObject1;
    o = null;
    if (localObject1 != null) {
      ((ClassWriter)localObject1).append();
    }
  }
  
  private final void removeTag(b paramB)
  {
    Object localObject1 = tags;
    ListIterator localListIterator = ((List)localObject1).listIterator(((List)localObject1).size());
    while (localListIterator.hasPrevious())
    {
      Object localObject2 = localListIterator.previous();
      localObject1 = localObject2;
      if (((ClassWriter)localObject2).next()) {
        break label54;
      }
    }
    localObject1 = null;
    label54:
    localObject1 = (ClassWriter)localObject1;
    o = ((ClassWriter)localObject1);
    if (localObject1 != null) {
      ((ClassWriter)localObject1).put(paramB);
    }
  }
  
  private final void restore(b paramB)
  {
    Object localObject1 = tags;
    ListIterator localListIterator = ((List)localObject1).listIterator(((List)localObject1).size());
    while (localListIterator.hasPrevious())
    {
      Object localObject2 = localListIterator.previous();
      localObject1 = localObject2;
      if (((ClassWriter)localObject2).next()) {
        break label54;
      }
    }
    localObject1 = null;
    label54:
    localObject1 = (ClassWriter)localObject1;
    if (localObject1 != null) {
      ((ClassWriter)localObject1).a(paramB);
    }
  }
  
  public final View a(ClassWriter paramClassWriter)
  {
    model.Log.get(paramClassWriter, "onBackPressedCallback");
    tags.add(paramClassWriter);
    h localH = new h(paramClassWriter);
    paramClassWriter.a(localH);
    a();
    paramClassWriter.visitAttribute(new j());
    return localH;
  }
  
  public final void a(OnBackInvokedDispatcher paramOnBackInvokedDispatcher)
  {
    model.Log.get(paramOnBackInvokedDispatcher, "invoker");
    l = paramOnBackInvokedDispatcher;
    b(s);
  }
  
  public final void b(m paramM, ClassWriter paramClassWriter)
  {
    model.Log.get(paramM, "owner");
    model.Log.get(paramClassWriter, "onBackPressedCallback");
    paramM = paramM.getLifecycle();
    if (paramM.c() == Label.b) {
      return;
    }
    paramClassWriter.a(new LifecycleOnBackPressedCancellable(paramM, paramClassWriter));
    a();
    paramClassWriter.visitAttribute(new i());
  }
  
  public final void get()
  {
    Object localObject1 = tags;
    ListIterator localListIterator = ((List)localObject1).listIterator(((List)localObject1).size());
    while (localListIterator.hasPrevious())
    {
      Object localObject2 = localListIterator.previous();
      localObject1 = localObject2;
      if (((ClassWriter)localObject2).next()) {
        break label51;
      }
    }
    localObject1 = null;
    label51:
    localObject1 = (ClassWriter)localObject1;
    o = null;
    if (localObject1 != null)
    {
      ((ClassWriter)localObject1).visitEnd();
      return;
    }
    localObject1 = key;
    if (localObject1 != null) {
      ((Runnable)localObject1).run();
    }
  }
  
  private final class LifecycleOnBackPressedCancellable
    implements c, View
  {
    private final ClassWriter a;
    private final androidx.lifecycle.ClassWriter b;
    private View c;
    
    public LifecycleOnBackPressedCancellable(androidx.lifecycle.ClassWriter paramClassWriter, ClassWriter paramClassWriter1)
    {
      b = paramClassWriter;
      a = paramClassWriter1;
      paramClassWriter.a(this);
    }
    
    public void a(m paramM, LifecycleEvent paramLifecycleEvent)
    {
      model.Log.get(paramM, "source");
      model.Log.get(paramLifecycleEvent, "event");
      if (paramLifecycleEvent == LifecycleEvent.ON_START)
      {
        c = a(a);
        return;
      }
      if (paramLifecycleEvent == LifecycleEvent.ON_STOP)
      {
        paramM = c;
        if (paramM != null) {
          paramM.cancel();
        }
      }
      else if (paramLifecycleEvent == LifecycleEvent.ON_DESTROY)
      {
        cancel();
      }
    }
    
    public void cancel()
    {
      b.c(this);
      a.get(this);
      View localView = c;
      if (localView != null) {
        localView.cancel();
      }
      c = null;
    }
  }
  
  static final class a
    extends Lambda
    implements astuetz.Object
  {
    a(OnBackPressedDispatcher paramOnBackPressedDispatcher)
    {
      super();
    }
    
    public final void registerCallbacks(b paramB)
    {
      model.Log.get(paramB, "backEvent");
      OnBackPressedDispatcher.access$getShowSoftKeyboard(this$0, paramB);
    }
  }
  
  static final class b
    extends Lambda
    implements astuetz.Object
  {
    b(OnBackPressedDispatcher paramOnBackPressedDispatcher)
    {
      super();
    }
    
    public final void e(b paramB)
    {
      model.Log.get(paramB, "backEvent");
      OnBackPressedDispatcher.a(o, paramB);
    }
  }
  
  static final class c
    extends Lambda
    implements Function
  {
    c(OnBackPressedDispatcher paramOnBackPressedDispatcher)
    {
      super();
    }
    
    public final void invoke()
    {
      globals.get();
    }
  }
  
  static final class d
    extends Lambda
    implements Function
  {
    d(OnBackPressedDispatcher paramOnBackPressedDispatcher)
    {
      super();
    }
    
    public final void invoke()
    {
      OnBackPressedDispatcher.removeTag(setExecutor);
    }
  }
  
  static final class e
    extends Lambda
    implements Function
  {
    e(OnBackPressedDispatcher paramOnBackPressedDispatcher)
    {
      super();
    }
    
    public final void invoke()
    {
      globals.get();
    }
  }
  
  public static final class f
  {
    public static final f b = new f();
    
    private f() {}
    
    private static final void transform(Function paramFunction)
    {
      model.Log.get(paramFunction, "$onBackInvoked");
      paramFunction.invoke();
    }
    
    public final OnBackInvokedCallback a(Function paramFunction)
    {
      model.Log.get(paramFunction, "onBackInvoked");
      return new Type(paramFunction);
    }
    
    public final void append(Object paramObject1, int paramInt, Object paramObject2)
    {
      model.Log.get(paramObject1, "dispatcher");
      model.Log.get(paramObject2, "callback");
      ((OnBackInvokedDispatcher)paramObject1).registerOnBackInvokedCallback(paramInt, (OnBackInvokedCallback)paramObject2);
    }
    
    public final void append(Object paramObject1, Object paramObject2)
    {
      model.Log.get(paramObject1, "dispatcher");
      model.Log.get(paramObject2, "callback");
      ((OnBackInvokedDispatcher)paramObject1).unregisterOnBackInvokedCallback((OnBackInvokedCallback)paramObject2);
    }
  }
  
  public static final class g
  {
    public static final g h = new g();
    
    private g() {}
    
    public final OnBackInvokedCallback put(astuetz.Object paramObject1, final astuetz.Object paramObject2, final Function paramFunction1, final Function paramFunction2)
    {
      model.Log.get(paramObject1, "onBackStarted");
      model.Log.get(paramObject2, "onBackProgressed");
      model.Log.get(paramFunction1, "onBackInvoked");
      model.Log.get(paramFunction2, "onBackCancelled");
      return (OnBackInvokedCallback)new a(paramObject1, paramObject2, paramFunction1, paramFunction2);
    }
    
    public static final class a
      implements OnBackAnimationCallback
    {
      a(astuetz.Object paramObject1, astuetz.Object paramObject2, Function paramFunction1, Function paramFunction2) {}
      
      public void onBackCancelled()
      {
        paramFunction2.invoke();
      }
      
      public void onBackInvoked()
      {
        paramFunction1.invoke();
      }
      
      public void onBackProgressed(BackEvent paramBackEvent)
      {
        model.Log.get(paramBackEvent, "backEvent");
        paramObject2.invoke(new b(paramBackEvent));
      }
      
      public void onBackStarted(BackEvent paramBackEvent)
      {
        model.Log.get(paramBackEvent, "backEvent");
        d.invoke(new b(paramBackEvent));
      }
    }
  }
  
  private final class h
    implements View
  {
    private final ClassWriter target;
    
    public h(ClassWriter paramClassWriter)
    {
      target = paramClassWriter;
    }
    
    public void cancel()
    {
      OnBackPressedDispatcher.access$getEngines(OnBackPressedDispatcher.this).remove(target);
      if (model.Log.append(OnBackPressedDispatcher.d(OnBackPressedDispatcher.this), target))
      {
        target.append();
        OnBackPressedDispatcher.b(OnBackPressedDispatcher.this, null);
      }
      target.get(this);
      Function localFunction = target.get();
      if (localFunction != null) {
        localFunction.invoke();
      }
      target.visitAttribute(null);
    }
  }
}
