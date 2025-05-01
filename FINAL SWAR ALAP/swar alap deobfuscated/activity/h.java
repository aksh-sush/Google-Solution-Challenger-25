package activity;

import astuetz.MethodVisitor;
import java.io.Serializable;
import model.Log;
import model.Ref.BooleanRef;
import widgets.Ref.ObjectRef;

public final class h
  implements Label, Serializable
{
  private final Label a;
  private final Object b;
  
  public h(Label paramLabel, Object paramObject)
  {
    a = paramLabel;
    b = paramObject;
  }
  
  private final int a()
  {
    int i = 2;
    java.lang.Object localObject = this;
    for (;;)
    {
      localObject = a;
      if ((localObject instanceof h)) {
        localObject = (h)localObject;
      } else {
        localObject = null;
      }
      if (localObject == null) {
        return i;
      }
      i += 1;
    }
  }
  
  private final boolean a(Object paramObject)
  {
    return Log.append(a(paramObject.getKey()), paramObject);
  }
  
  private final boolean a(h paramH)
  {
    for (;;)
    {
      if (!a(b)) {
        return false;
      }
      paramH = a;
      if (!(paramH instanceof h)) {
        break;
      }
      paramH = (h)paramH;
    }
    Log.add(paramH, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
    return a((Object)paramH);
  }
  
  private final java.lang.Object writeReplace()
  {
    int i = a();
    Label[] arrayOfLabel = new Label[i];
    Ref.BooleanRef localBooleanRef = new Ref.BooleanRef();
    a(Ref.ObjectRef.i, new Regex.findAll.1(arrayOfLabel, localBooleanRef));
    if (i == i) {
      i = 1;
    } else {
      i = 0;
    }
    if (i != 0) {
      return new DateTimeComparator(arrayOfLabel);
    }
    throw new IllegalStateException("Check failed.".toString());
  }
  
  public Object a(Context paramContext)
  {
    Log.get(paramContext, "key");
    for (java.lang.Object localObject = this;; localObject = (h)localObject)
    {
      Object localObject1 = b.a(paramContext);
      if (localObject1 != null) {
        return localObject1;
      }
      localObject = a;
      if (!(localObject instanceof h)) {
        break;
      }
    }
    return ((Label)localObject).a(paramContext);
  }
  
  public java.lang.Object a(java.lang.Object paramObject, MethodVisitor paramMethodVisitor)
  {
    Log.get(paramMethodVisitor, "operation");
    return paramMethodVisitor.invoke(a.a(paramObject, paramMethodVisitor), b);
  }
  
  public Label b(Context paramContext)
  {
    Log.get(paramContext, "key");
    if (b.a(paramContext) != null) {
      return a;
    }
    paramContext = a.b(paramContext);
    if (paramContext == a) {
      return this;
    }
    if (paramContext == b.b) {
      return b;
    }
    return new h(paramContext, b);
  }
  
  public Label b(Label paramLabel)
  {
    return n.a(this, paramLabel);
  }
  
  public boolean equals(java.lang.Object paramObject)
  {
    if (this != paramObject) {
      if ((paramObject instanceof h))
      {
        paramObject = (h)paramObject;
        if ((paramObject.a() == a()) && (paramObject.a(this))) {}
      }
      else
      {
        return false;
      }
    }
    return true;
  }
  
  public int hashCode()
  {
    return a.hashCode() + b.hashCode();
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append('[');
    localStringBuilder.append((String)a("", CharDirectionality.Companion.directionalityMap.2.INSTANCE));
    localStringBuilder.append(']');
    return localStringBuilder.toString();
  }
}
