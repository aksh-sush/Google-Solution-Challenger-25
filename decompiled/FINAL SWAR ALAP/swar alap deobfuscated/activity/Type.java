package activity;

import model.Log;

public abstract class Type
  implements Context
{
  private final Context c;
  private final astuetz.Object d;
  
  public Type(Context paramContext, astuetz.Object paramObject)
  {
    d = paramObject;
    paramObject = paramContext;
    if ((paramContext instanceof Type)) {
      paramObject = c;
    }
    c = paramObject;
  }
  
  public final boolean get(Context paramContext)
  {
    Log.get(paramContext, "key");
    return (paramContext == this) || (c == paramContext);
  }
  
  public final Object getValue(Object paramObject)
  {
    Log.get(paramObject, "element");
    return (Object)d.invoke(paramObject);
  }
}
