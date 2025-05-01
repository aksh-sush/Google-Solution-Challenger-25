package Entity;

import android.util.SparseArray;
import commander.f;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public abstract class Handler
{
  private static HashMap a;
  private static SparseArray f = new SparseArray();
  
  static
  {
    Object localObject = new HashMap();
    a = (HashMap)localObject;
    ((HashMap)localObject).put(f.d, Integer.valueOf(0));
    a.put(f.b, Integer.valueOf(1));
    a.put(f.f, Integer.valueOf(2));
    localObject = a.keySet().iterator();
    while (((Iterator)localObject).hasNext())
    {
      f localF = (f)((Iterator)localObject).next();
      f.append(((Integer)a.get(localF)).intValue(), localF);
    }
  }
  
  public static int a(f paramF)
  {
    Object localObject = (Integer)a.get(paramF);
    if (localObject != null) {
      return ((Integer)localObject).intValue();
    }
    localObject = new StringBuilder();
    ((StringBuilder)localObject).append("PriorityMapping is missing known Priority value ");
    ((StringBuilder)localObject).append(paramF);
    throw new IllegalStateException(((StringBuilder)localObject).toString());
  }
  
  public static f a(int paramInt)
  {
    Object localObject = (f)f.get(paramInt);
    if (localObject != null) {
      return localObject;
    }
    localObject = new StringBuilder();
    ((StringBuilder)localObject).append("Unknown Priority for value ");
    ((StringBuilder)localObject).append(paramInt);
    throw new IllegalArgumentException(((StringBuilder)localObject).toString());
  }
}
