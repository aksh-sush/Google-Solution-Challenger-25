package com.google.android.gms.common.server.response;

import com.google.android.gms.common.internal.Log;
import com.google.android.gms.common.internal.StringMap;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

public abstract class Series
  extends PlaylistEntry
  implements rx.Object
{
  public Series() {}
  
  public final int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    if (paramObject == null) {
      return false;
    }
    if (this == paramObject) {
      return true;
    }
    if (!getClass().isInstance(paramObject)) {
      return false;
    }
    paramObject = (PlaylistEntry)paramObject;
    Iterator localIterator = getFieldMappings().values().iterator();
    while (localIterator.hasNext())
    {
      Node localNode = (Node)localIterator.next();
      if (isFieldSet(localNode))
      {
        if (!paramObject.isFieldSet(localNode)) {
          break label111;
        }
        if (!StringMap.append(getFieldValue(localNode), paramObject.getFieldValue(localNode))) {
          return false;
        }
      }
      else if (paramObject.isFieldSet(localNode))
      {
        return false;
      }
    }
    return true;
    label111:
    return false;
  }
  
  public Object getValueObject(String paramString)
  {
    return null;
  }
  
  public int hashCode()
  {
    Iterator localIterator = getFieldMappings().values().iterator();
    int i = 0;
    while (localIterator.hasNext())
    {
      Node localNode = (Node)localIterator.next();
      if (isFieldSet(localNode)) {
        i = i * 31 + Log.append(getFieldValue(localNode)).hashCode();
      }
    }
    return i;
  }
  
  public boolean isPrimitiveFieldSet(String paramString)
  {
    return false;
  }
}
