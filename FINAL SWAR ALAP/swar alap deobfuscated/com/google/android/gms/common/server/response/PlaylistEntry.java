package com.google.android.gms.common.server.response;

import helpers.AdapterTime;
import helpers.DurationFormatUtils;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public abstract class PlaylistEntry
{
  public PlaylistEntry() {}
  
  private static final void add(String paramString)
  {
    if (android.util.Log.isLoggable("FastJsonResponse", 6))
    {
      StringBuilder localStringBuilder = new StringBuilder(String.valueOf(paramString).length() + 58);
      localStringBuilder.append("Output field (");
      localStringBuilder.append(paramString);
      localStringBuilder.append(") has a null value, but expected a primitive");
      android.util.Log.e("FastJsonResponse", localStringBuilder.toString());
    }
  }
  
  protected static final Object append(Node paramNode, Object paramObject)
  {
    Object localObject = paramObject;
    if (Node.toString(paramNode) != null) {
      localObject = paramNode.d(paramObject);
    }
    return localObject;
  }
  
  private final void toString(Node paramNode, Object paramObject)
  {
    String str = d;
    paramObject = paramNode.getValue(paramObject);
    int i = e;
    switch (i)
    {
    default: 
      break;
    case 3: 
      paramNode = new StringBuilder(44);
      paramNode.append("Unsupported type for conversion: ");
      paramNode.append(i);
      throw new IllegalStateException(paramNode.toString());
    case 8: 
    case 9: 
      if (paramObject != null)
      {
        setDecodedBytesInternal(paramNode, str, (byte[])paramObject);
        return;
      }
      add(str);
      return;
    case 7: 
      setStringInternal(paramNode, str, (String)paramObject);
      return;
    case 6: 
      if (paramObject != null)
      {
        setBooleanInternal(paramNode, str, ((Boolean)paramObject).booleanValue());
        return;
      }
      add(str);
      return;
    case 5: 
      toString(paramNode, str, (BigDecimal)paramObject);
      return;
    case 4: 
      if (paramObject != null)
      {
        toString(paramNode, str, ((Double)paramObject).doubleValue());
        return;
      }
      add(str);
      return;
    case 2: 
      if (paramObject != null)
      {
        setLongInternal(paramNode, str, ((Long)paramObject).longValue());
        return;
      }
      add(str);
      return;
    case 1: 
      toString(paramNode, str, (BigInteger)paramObject);
      return;
    }
    if (paramObject != null)
    {
      setIntegerInternal(paramNode, str, ((Integer)paramObject).intValue());
      return;
    }
    add(str);
  }
  
  private static final void toString(StringBuilder paramStringBuilder, Node paramNode, Object paramObject)
  {
    int i = length;
    if (i != 11) {
      if (i == 7)
      {
        paramNode = "\"";
        paramStringBuilder.append("\"");
        paramStringBuilder.append(DurationFormatUtils.format((String)paramObject));
      }
    }
    for (;;)
    {
      paramStringBuilder.append(paramNode);
      return;
      paramStringBuilder.append(paramObject);
      return;
      paramNode = type;
      com.google.android.gms.common.internal.Log.append(paramNode);
      paramNode = ((PlaylistEntry)paramNode.cast(paramObject)).toString();
    }
  }
  
  protected void a(Node paramNode, String paramString, ArrayList paramArrayList)
  {
    throw new UnsupportedOperationException("Double list not supported");
  }
  
  public final void add(Node paramNode, double paramDouble)
  {
    if (Node.toString(paramNode) != null)
    {
      toString(paramNode, Double.valueOf(paramDouble));
      return;
    }
    toString(paramNode, d, paramDouble);
  }
  
  public final void add(Node paramNode, float paramFloat)
  {
    if (Node.toString(paramNode) != null)
    {
      toString(paramNode, Float.valueOf(paramFloat));
      return;
    }
    set(paramNode, d, paramFloat);
  }
  
  public final void add(Node paramNode, int paramInt)
  {
    if (Node.toString(paramNode) != null)
    {
      toString(paramNode, Integer.valueOf(paramInt));
      return;
    }
    setIntegerInternal(paramNode, d, paramInt);
  }
  
  public final void add(Node paramNode, long paramLong)
  {
    if (Node.toString(paramNode) != null)
    {
      toString(paramNode, Long.valueOf(paramLong));
      return;
    }
    setLongInternal(paramNode, d, paramLong);
  }
  
  public final void add(Node paramNode, String paramString)
  {
    if (Node.toString(paramNode) != null)
    {
      toString(paramNode, paramString);
      return;
    }
    setStringInternal(paramNode, d, paramString);
  }
  
  protected void add(Node paramNode, String paramString, ArrayList paramArrayList)
  {
    throw new UnsupportedOperationException("Float list not supported");
  }
  
  public final void add(Node paramNode, BigDecimal paramBigDecimal)
  {
    if (Node.toString(paramNode) != null)
    {
      toString(paramNode, paramBigDecimal);
      return;
    }
    toString(paramNode, d, paramBigDecimal);
  }
  
  public final void add(Node paramNode, BigInteger paramBigInteger)
  {
    if (Node.toString(paramNode) != null)
    {
      toString(paramNode, paramBigInteger);
      return;
    }
    toString(paramNode, d, paramBigInteger);
  }
  
  public final void add(Node paramNode, ArrayList paramArrayList)
  {
    if (Node.toString(paramNode) != null)
    {
      toString(paramNode, paramArrayList);
      return;
    }
    remove(paramNode, d, paramArrayList);
  }
  
  public final void add(Node paramNode, Map paramMap)
  {
    if (Node.toString(paramNode) != null)
    {
      toString(paramNode, paramMap);
      return;
    }
    setStringMapInternal(paramNode, d, paramMap);
  }
  
  public final void add(Node paramNode, boolean paramBoolean)
  {
    if (Node.toString(paramNode) != null)
    {
      toString(paramNode, Boolean.valueOf(paramBoolean));
      return;
    }
    setBooleanInternal(paramNode, d, paramBoolean);
  }
  
  public final void add(Node paramNode, byte[] paramArrayOfByte)
  {
    if (Node.toString(paramNode) != null)
    {
      toString(paramNode, paramArrayOfByte);
      return;
    }
    setDecodedBytesInternal(paramNode, d, paramArrayOfByte);
  }
  
  public void addConcreteTypeArrayInternal(Node paramNode, String paramString, ArrayList paramArrayList)
  {
    throw new UnsupportedOperationException("Concrete type array not supported");
  }
  
  public void addConcreteTypeInternal(Node paramNode, String paramString, PlaylistEntry paramPlaylistEntry)
  {
    throw new UnsupportedOperationException("Concrete type not supported");
  }
  
  public final void equals(Node paramNode, ArrayList paramArrayList)
  {
    if (Node.toString(paramNode) != null)
    {
      toString(paramNode, paramArrayList);
      return;
    }
    toString(paramNode, d, paramArrayList);
  }
  
  public final void eval(Node paramNode, ArrayList paramArrayList)
  {
    if (Node.toString(paramNode) != null)
    {
      toString(paramNode, paramArrayList);
      return;
    }
    write(paramNode, d, paramArrayList);
  }
  
  public final void getCoordinate(Node paramNode, ArrayList paramArrayList)
  {
    if (Node.toString(paramNode) != null)
    {
      toString(paramNode, paramArrayList);
      return;
    }
    setStringsInternal(paramNode, d, paramArrayList);
  }
  
  public abstract Map getFieldMappings();
  
  protected Object getFieldValue(Node paramNode)
  {
    Object localObject = d;
    if (type != null)
    {
      boolean bool;
      if (getValueObject((String)localObject) == null) {
        bool = true;
      } else {
        bool = false;
      }
      com.google.android.gms.common.internal.Log.add(bool, "Concrete field shouldn't be value object: %s", new Object[] { d });
      try
      {
        char c = Character.toUpperCase(((String)localObject).charAt(0));
        localObject = ((String)localObject).substring(1);
        int i = String.valueOf(localObject).length();
        paramNode = new StringBuilder(i + 4);
        paramNode.append("get");
        paramNode.append(c);
        paramNode.append((String)localObject);
        localObject = getClass();
        paramNode = paramNode.toString();
        paramNode = ((Class)localObject).getMethod(paramNode, new Class[0]);
        paramNode = paramNode.invoke(this, new Object[0]);
        return paramNode;
      }
      catch (Exception paramNode)
      {
        throw new RuntimeException(paramNode);
      }
    }
    return getValueObject((String)localObject);
  }
  
  protected abstract Object getValueObject(String paramString);
  
  protected void init(Node paramNode, String paramString, ArrayList paramArrayList)
  {
    throw new UnsupportedOperationException("BigInteger list not supported");
  }
  
  protected boolean isFieldSet(Node paramNode)
  {
    if (e == 11)
    {
      if (c) {
        throw new UnsupportedOperationException("Concrete type arrays not supported");
      }
      throw new UnsupportedOperationException("Concrete types not supported");
    }
    return isPrimitiveFieldSet(d);
  }
  
  protected abstract boolean isPrimitiveFieldSet(String paramString);
  
  protected void remove(Node paramNode, String paramString, ArrayList paramArrayList)
  {
    throw new UnsupportedOperationException("Long list not supported");
  }
  
  public final void remove(Node paramNode, ArrayList paramArrayList)
  {
    if (Node.toString(paramNode) != null)
    {
      toString(paramNode, paramArrayList);
      return;
    }
    set(paramNode, d, paramArrayList);
  }
  
  protected void set(Node paramNode, String paramString, float paramFloat)
  {
    throw new UnsupportedOperationException("Float not supported");
  }
  
  protected void set(Node paramNode, String paramString, ArrayList paramArrayList)
  {
    throw new UnsupportedOperationException("Integer list not supported");
  }
  
  public final void set(Node paramNode, ArrayList paramArrayList)
  {
    if (Node.toString(paramNode) != null)
    {
      toString(paramNode, paramArrayList);
      return;
    }
    init(paramNode, d, paramArrayList);
  }
  
  protected void setBooleanInternal(Node paramNode, String paramString, boolean paramBoolean)
  {
    throw new UnsupportedOperationException("Boolean not supported");
  }
  
  protected void setDecodedBytesInternal(Node paramNode, String paramString, byte[] paramArrayOfByte)
  {
    throw new UnsupportedOperationException("byte[] not supported");
  }
  
  protected void setIntegerInternal(Node paramNode, String paramString, int paramInt)
  {
    throw new UnsupportedOperationException("Integer not supported");
  }
  
  protected void setLongInternal(Node paramNode, String paramString, long paramLong)
  {
    throw new UnsupportedOperationException("Long not supported");
  }
  
  protected void setStringInternal(Node paramNode, String paramString1, String paramString2)
  {
    throw new UnsupportedOperationException("String not supported");
  }
  
  protected void setStringMapInternal(Node paramNode, String paramString, Map paramMap)
  {
    throw new UnsupportedOperationException("String map not supported");
  }
  
  protected void setStringsInternal(Node paramNode, String paramString, ArrayList paramArrayList)
  {
    throw new UnsupportedOperationException("String list not supported");
  }
  
  public String toString()
  {
    Map localMap = getFieldMappings();
    StringBuilder localStringBuilder = new StringBuilder(100);
    Iterator localIterator = localMap.keySet().iterator();
    Object localObject1;
    while (localIterator.hasNext())
    {
      Object localObject2 = (String)localIterator.next();
      localObject1 = (Node)localMap.get(localObject2);
      if (isFieldSet((Node)localObject1))
      {
        Object localObject3 = append((Node)localObject1, getFieldValue((Node)localObject1));
        if (localStringBuilder.length() == 0) {
          localStringBuilder.append("{");
        } else {
          localStringBuilder.append(",");
        }
        localStringBuilder.append("\"");
        localStringBuilder.append((String)localObject2);
        localStringBuilder.append("\":");
        if (localObject3 == null) {}
        for (localObject1 = "null";; localObject1 = "]")
        {
          localStringBuilder.append((String)localObject1);
          break;
          int j;
          int i;
          switch (e)
          {
          default: 
            if (!next) {
              break label354;
            }
            localObject2 = (ArrayList)localObject3;
            localStringBuilder.append("[");
            j = ((ArrayList)localObject2).size();
            i = 0;
            break;
          case 10: 
            AdapterTime.toString(localStringBuilder, (HashMap)localObject3);
            break;
          case 9: 
            localStringBuilder.append("\"");
            localObject1 = helpers.Integer.read((byte[])localObject3);
            break;
          case 8: 
            localStringBuilder.append("\"");
            localObject1 = helpers.Integer.encode((byte[])localObject3);
            localStringBuilder.append((String)localObject1);
            localStringBuilder.append("\"");
            break;
            while (i < j)
            {
              if (i > 0) {
                localStringBuilder.append(",");
              }
              localObject3 = ((ArrayList)localObject2).get(i);
              if (localObject3 != null) {
                toString(localStringBuilder, (Node)localObject1, localObject3);
              }
              i += 1;
            }
          }
        }
        label354:
        toString(localStringBuilder, (Node)localObject1, localObject3);
      }
    }
    if (localStringBuilder.length() > 0) {
      localObject1 = "}";
    } else {
      localObject1 = "{}";
    }
    localStringBuilder.append((String)localObject1);
    return localStringBuilder.toString();
  }
  
  protected void toString(Node paramNode, String paramString, double paramDouble)
  {
    throw new UnsupportedOperationException("Double not supported");
  }
  
  protected void toString(Node paramNode, String paramString, BigDecimal paramBigDecimal)
  {
    throw new UnsupportedOperationException("BigDecimal not supported");
  }
  
  protected void toString(Node paramNode, String paramString, BigInteger paramBigInteger)
  {
    throw new UnsupportedOperationException("BigInteger not supported");
  }
  
  protected void toString(Node paramNode, String paramString, ArrayList paramArrayList)
  {
    throw new UnsupportedOperationException("Boolean list not supported");
  }
  
  public final void toString(Node paramNode, ArrayList paramArrayList)
  {
    if (Node.toString(paramNode) != null)
    {
      toString(paramNode, paramArrayList);
      return;
    }
    add(paramNode, d, paramArrayList);
  }
  
  public final void visit(Node paramNode, ArrayList paramArrayList)
  {
    if (Node.toString(paramNode) != null)
    {
      toString(paramNode, paramArrayList);
      return;
    }
    a(paramNode, d, paramArrayList);
  }
  
  protected void write(Node paramNode, String paramString, ArrayList paramArrayList)
  {
    throw new UnsupportedOperationException("BigDecimal list not supported");
  }
}
