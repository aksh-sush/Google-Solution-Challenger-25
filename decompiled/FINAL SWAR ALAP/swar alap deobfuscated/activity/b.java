package activity;

import astuetz.MethodVisitor;
import java.io.Serializable;
import model.Log;

public final class b
  implements Label, Serializable
{
  public static final b b = new b();
  
  private b() {}
  
  private final java.lang.Object readResolve()
  {
    return b;
  }
  
  public Object a(Context paramContext)
  {
    Log.get(paramContext, "key");
    return null;
  }
  
  public java.lang.Object a(java.lang.Object paramObject, MethodVisitor paramMethodVisitor)
  {
    Log.get(paramMethodVisitor, "operation");
    return paramObject;
  }
  
  public Label b(Context paramContext)
  {
    Log.get(paramContext, "key");
    return this;
  }
  
  public Label b(Label paramLabel)
  {
    Log.get(paramLabel, "context");
    return paramLabel;
  }
  
  public int hashCode()
  {
    return 0;
  }
  
  public String toString()
  {
    return "EmptyCoroutineContext";
  }
}
