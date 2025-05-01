package androidx.activity.result;

import android.content.Intent;
import android.os.BaseBundle;
import android.os.Bundle;
import android.util.Log;
import androidx.core.asm.ClassVisitor;
import androidx.lifecycle.Label;
import androidx.lifecycle.LifecycleEvent;
import androidx.lifecycle.c;
import androidx.lifecycle.m;
import file.MersenneTwister;
import file.Random;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import showcaseview.h;

public abstract class ActivityResultRegistry
{
  final Bundle a = new Bundle();
  private final Map b = new HashMap();
  final Map c = new HashMap();
  private final Map d = new HashMap();
  final Map l = new HashMap();
  final transient Map m = new HashMap();
  ArrayList p = new ArrayList();
  
  public ActivityResultRegistry() {}
  
  private int a()
  {
    for (int i = Random.p.next(2147418112);; i = Random.p.next(2147418112))
    {
      i += 65536;
      if (!b.containsKey(Integer.valueOf(i))) {
        break;
      }
    }
    return i;
  }
  
  private void a(String paramString, int paramInt, Intent paramIntent, c paramC)
  {
    if ((paramC != null) && (a != null) && (p.contains(paramString)))
    {
      a.add(e.b(paramInt, paramIntent));
      p.remove(paramString);
      return;
    }
    l.remove(paramString);
    a.putParcelable(paramString, new Item(paramInt, paramIntent));
  }
  
  private void add(int paramInt, String paramString)
  {
    b.put(Integer.valueOf(paramInt), paramString);
    c.put(paramString, Integer.valueOf(paramInt));
  }
  
  private void i(String paramString)
  {
    if ((Integer)c.get(paramString) != null) {
      return;
    }
    add(a(), paramString);
  }
  
  public final f a(final String paramString, m paramM, final h paramH, final ClassWriter paramClassWriter)
  {
    androidx.lifecycle.ClassWriter localClassWriter = paramM.getLifecycle();
    if (!localClassWriter.c().a(Label.c))
    {
      i(paramString);
      d localD = (d)d.get(paramString);
      paramM = localD;
      if (localD == null) {
        paramM = new d(localClassWriter);
      }
      paramM.a(new c()
      {
        public void a(m paramAnonymousM, LifecycleEvent paramAnonymousLifecycleEvent)
        {
          if (LifecycleEvent.ON_START.equals(paramAnonymousLifecycleEvent))
          {
            m.put(paramString, new ActivityResultRegistry.c(paramClassWriter, paramH));
            if (l.containsKey(paramString))
            {
              paramAnonymousM = l.get(paramString);
              l.remove(paramString);
              paramClassWriter.add(paramAnonymousM);
            }
            paramAnonymousM = (Item)a.getParcelable(paramString);
            if (paramAnonymousM != null)
            {
              a.remove(paramString);
              paramClassWriter.add(paramH.b(paramAnonymousM.b(), paramAnonymousM.a()));
            }
          }
          else
          {
            if (LifecycleEvent.ON_STOP.equals(paramAnonymousLifecycleEvent))
            {
              m.remove(paramString);
              return;
            }
            if (LifecycleEvent.ON_DESTROY.equals(paramAnonymousLifecycleEvent)) {
              a(paramString);
            }
          }
        }
      });
      d.put(paramString, paramM);
      return new a(paramString, paramH);
    }
    paramString = new StringBuilder();
    paramString.append("LifecycleOwner ");
    paramString.append(paramM);
    paramString.append(" is attempting to register while current state is ");
    paramString.append(localClassWriter.c());
    paramString.append(". LifecycleOwners must call register before they are STARTED.");
    throw new IllegalStateException(paramString.toString());
  }
  
  public final f a(final String paramString, final h paramH, ClassWriter paramClassWriter)
  {
    i(paramString);
    m.put(paramString, new c(paramClassWriter, paramH));
    if (l.containsKey(paramString))
    {
      localObject = l.get(paramString);
      l.remove(paramString);
      paramClassWriter.add(localObject);
    }
    Object localObject = (Item)a.getParcelable(paramString);
    if (localObject != null)
    {
      a.remove(paramString);
      paramClassWriter.add(paramH.b(((Item)localObject).b(), ((Item)localObject).a()));
    }
    return new b(paramString, paramH);
  }
  
  public abstract void a(int paramInt, h paramH, Object paramObject, ClassVisitor paramClassVisitor);
  
  final void a(String paramString)
  {
    if (!p.contains(paramString))
    {
      localObject = (Integer)c.remove(paramString);
      if (localObject != null) {
        b.remove(localObject);
      }
    }
    m.remove(paramString);
    if (l.containsKey(paramString))
    {
      localObject = new StringBuilder();
      ((StringBuilder)localObject).append("Dropping pending result for request ");
      ((StringBuilder)localObject).append(paramString);
      ((StringBuilder)localObject).append(": ");
      ((StringBuilder)localObject).append(l.get(paramString));
      Log.w("ActivityResultRegistry", ((StringBuilder)localObject).toString());
      l.remove(paramString);
    }
    if (a.containsKey(paramString))
    {
      localObject = new StringBuilder();
      ((StringBuilder)localObject).append("Dropping pending result for request ");
      ((StringBuilder)localObject).append(paramString);
      ((StringBuilder)localObject).append(": ");
      ((StringBuilder)localObject).append(a.getParcelable(paramString));
      Log.w("ActivityResultRegistry", ((StringBuilder)localObject).toString());
      a.remove(paramString);
    }
    Object localObject = (d)d.get(paramString);
    if (localObject != null)
    {
      ((d)localObject).a();
      d.remove(paramString);
    }
  }
  
  public final boolean a(int paramInt, Object paramObject)
  {
    String str = (String)b.get(Integer.valueOf(paramInt));
    if (str == null) {
      return false;
    }
    Object localObject = (c)m.get(str);
    if (localObject != null)
    {
      localObject = a;
      if (localObject != null)
      {
        if (!p.remove(str)) {
          break label100;
        }
        ((ClassWriter)localObject).add(paramObject);
        break label100;
      }
    }
    a.remove(str);
    l.put(str, paramObject);
    label100:
    return true;
  }
  
  public final boolean add(int paramInt1, int paramInt2, Intent paramIntent)
  {
    String str = (String)b.get(Integer.valueOf(paramInt1));
    if (str == null) {
      return false;
    }
    a(str, paramInt2, paramIntent, (c)m.get(str));
    return true;
  }
  
  public final void doInBackground(Bundle paramBundle)
  {
    if (paramBundle == null) {
      return;
    }
    ArrayList localArrayList1 = paramBundle.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
    ArrayList localArrayList2 = paramBundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
    if (localArrayList2 != null)
    {
      if (localArrayList1 == null) {
        return;
      }
      p = paramBundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
      a.putAll(paramBundle.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT"));
      int i = 0;
      while (i < localArrayList2.size())
      {
        paramBundle = (String)localArrayList2.get(i);
        if (c.containsKey(paramBundle))
        {
          Integer localInteger = (Integer)c.remove(paramBundle);
          if (!a.containsKey(paramBundle)) {
            b.remove(localInteger);
          }
        }
        add(((Integer)localArrayList1.get(i)).intValue(), (String)localArrayList2.get(i));
        i += 1;
      }
    }
  }
  
  public final void set(Bundle paramBundle)
  {
    paramBundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList(c.values()));
    paramBundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList(c.keySet()));
    paramBundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList(p));
    paramBundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", (Bundle)a.clone());
  }
  
  class a
    extends f
  {
    a(String paramString, h paramH) {}
    
    public void a(Object paramObject, ClassVisitor paramClassVisitor)
    {
      Object localObject = (Integer)c.get(paramString);
      if (localObject != null)
      {
        p.add(paramString);
        ActivityResultRegistry localActivityResultRegistry = ActivityResultRegistry.this;
        try
        {
          int i = ((Integer)localObject).intValue();
          localObject = paramH;
          localActivityResultRegistry.a(i, (h)localObject, paramObject, paramClassVisitor);
          return;
        }
        catch (Exception paramObject)
        {
          p.remove(paramString);
          throw paramObject;
        }
      }
      paramClassVisitor = new StringBuilder();
      paramClassVisitor.append("Attempting to launch an unregistered ActivityResultLauncher with contract ");
      paramClassVisitor.append(paramH);
      paramClassVisitor.append(" and input ");
      paramClassVisitor.append(paramObject);
      paramClassVisitor.append(". You must ensure the ActivityResultLauncher is registered before calling launch().");
      throw new IllegalStateException(paramClassVisitor.toString());
    }
    
    public void b()
    {
      a(paramString);
    }
    
    public h c()
    {
      return paramH;
    }
  }
  
  class b
    extends f
  {
    b(String paramString, h paramH) {}
    
    public void a(Object paramObject, ClassVisitor paramClassVisitor)
    {
      Object localObject = (Integer)c.get(paramString);
      if (localObject != null)
      {
        p.add(paramString);
        ActivityResultRegistry localActivityResultRegistry = ActivityResultRegistry.this;
        try
        {
          int i = ((Integer)localObject).intValue();
          localObject = paramH;
          localActivityResultRegistry.a(i, (h)localObject, paramObject, paramClassVisitor);
          return;
        }
        catch (Exception paramObject)
        {
          p.remove(paramString);
          throw paramObject;
        }
      }
      paramClassVisitor = new StringBuilder();
      paramClassVisitor.append("Attempting to launch an unregistered ActivityResultLauncher with contract ");
      paramClassVisitor.append(paramH);
      paramClassVisitor.append(" and input ");
      paramClassVisitor.append(paramObject);
      paramClassVisitor.append(". You must ensure the ActivityResultLauncher is registered before calling launch().");
      throw new IllegalStateException(paramClassVisitor.toString());
    }
    
    public void b()
    {
      a(paramString);
    }
    
    public h c()
    {
      return paramH;
    }
  }
  
  private static class c
  {
    final ClassWriter a;
    final h e;
    
    c(ClassWriter paramClassWriter, h paramH)
    {
      a = paramClassWriter;
      e = paramH;
    }
  }
  
  private static class d
  {
    final androidx.lifecycle.ClassWriter b;
    private final ArrayList k;
    
    d(androidx.lifecycle.ClassWriter paramClassWriter)
    {
      b = paramClassWriter;
      k = new ArrayList();
    }
    
    void a()
    {
      Iterator localIterator = k.iterator();
      while (localIterator.hasNext())
      {
        c localC = (c)localIterator.next();
        b.c(localC);
      }
      k.clear();
    }
    
    void a(c paramC)
    {
      b.a(paramC);
      k.add(paramC);
    }
  }
}
