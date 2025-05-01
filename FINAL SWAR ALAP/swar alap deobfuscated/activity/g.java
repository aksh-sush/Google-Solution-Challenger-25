package activity;

import model.Log;

public abstract class g
{
  public static Object a(c paramC, Context paramContext)
  {
    Log.get(paramContext, "key");
    if ((paramContext instanceof Type))
    {
      paramContext = (Type)paramContext;
      if (paramContext.get(paramC.getKey()))
      {
        paramC = paramContext.getValue(paramC);
        if ((paramC instanceof Object)) {
          return paramC;
        }
      }
    }
    else if (c.d == paramContext)
    {
      Log.add(paramC, "null cannot be cast to non-null type E of kotlin.coroutines.ContinuationInterceptor.get");
      return paramC;
    }
    return null;
  }
  
  public static Label b(c paramC, Context paramContext)
  {
    Log.get(paramContext, "key");
    if ((paramContext instanceof Type))
    {
      paramContext = (Type)paramContext;
      if ((paramContext.get(paramC.getKey())) && (paramContext.getValue(paramC) != null)) {
        return b.b;
      }
    }
    else if (c.d == paramContext)
    {
      return b.b;
    }
    return paramC;
  }
}
