package model;

import commons.Element;
import java.io.Serializable;

public abstract class FilterIterator
  implements commons.Object, Serializable
{
  public static final Object proxy = ;
  private final String baseDN;
  private final boolean e;
  private final String filter;
  private transient commons.Object first;
  private final Class type;
  protected final Object value;
  
  protected FilterIterator(Object paramObject, Class paramClass, String paramString1, String paramString2, boolean paramBoolean)
  {
    value = paramObject;
    type = paramClass;
    filter = paramString1;
    baseDN = paramString2;
    e = paramBoolean;
  }
  
  protected abstract commons.Object b();
  
  public String getRepositoryName()
  {
    return filter;
  }
  
  public commons.Object hasNext()
  {
    commons.Object localObject2 = first;
    commons.Object localObject1 = localObject2;
    if (localObject2 == null)
    {
      localObject1 = b();
      first = localObject1;
    }
    return localObject1;
  }
  
  public Element next()
  {
    Class localClass = type;
    if (localClass == null) {
      return null;
    }
    if (e) {
      return f.get(localClass);
    }
    return f.add(localClass);
  }
  
  public Object remove()
  {
    return value;
  }
  
  public String toNormalizedString()
  {
    return baseDN;
  }
}
