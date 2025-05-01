package analysis;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import model.Log;
import ui.ByteVector;
import widgets.Pair;

public final class d
{
  public static final e a = new e(null);
  private static final Map m = ByteVector.get(new Pair[] { widgets.Type.append("embedding.weight", "embed.weight"), widgets.Type.append("dense1.weight", "fc1.weight"), widgets.Type.append("dense2.weight", "fc2.weight"), widgets.Type.append("dense3.weight", "fc3.weight"), widgets.Type.append("dense1.bias", "fc1.bias"), widgets.Type.append("dense2.bias", "fc2.bias"), widgets.Type.append("dense3.bias", "fc3.bias") });
  private final Item b;
  private final Map c;
  private final Item d;
  private final Item e;
  private final Item f;
  private final Item g;
  private final Item h;
  private final Item i;
  private final Item j;
  private final Item k;
  private final Item l;
  private final Item o;
  
  private d(Map paramMap)
  {
    Object localObject = paramMap.get("embed.weight");
    if (localObject != null)
    {
      g = ((Item)localObject);
      localObject = ClassWriter.b;
      localObject = paramMap.get("convs.0.weight");
      if (localObject != null)
      {
        f = ClassWriter.b((Item)localObject);
        localObject = paramMap.get("convs.1.weight");
        if (localObject != null)
        {
          e = ClassWriter.b((Item)localObject);
          localObject = paramMap.get("convs.2.weight");
          if (localObject != null)
          {
            b = ClassWriter.b((Item)localObject);
            localObject = paramMap.get("convs.0.bias");
            if (localObject != null)
            {
              i = ((Item)localObject);
              localObject = paramMap.get("convs.1.bias");
              if (localObject != null)
              {
                d = ((Item)localObject);
                localObject = paramMap.get("convs.2.bias");
                if (localObject != null)
                {
                  h = ((Item)localObject);
                  localObject = paramMap.get("fc1.weight");
                  if (localObject != null)
                  {
                    j = ClassWriter.get((Item)localObject);
                    localObject = paramMap.get("fc2.weight");
                    if (localObject != null)
                    {
                      k = ClassWriter.get((Item)localObject);
                      localObject = paramMap.get("fc1.bias");
                      if (localObject != null)
                      {
                        o = ((Item)localObject);
                        localObject = paramMap.get("fc2.bias");
                        if (localObject != null)
                        {
                          l = ((Item)localObject);
                          c = new HashMap();
                          localObject = ui.Type.a(new String[] { f.b.b(), f.d.b() }).iterator();
                          while (((Iterator)localObject).hasNext())
                          {
                            String str2 = (String)((Iterator)localObject).next();
                            String str1 = Log.valueOf(str2, ".weight");
                            str2 = Log.valueOf(str2, ".bias");
                            Item localItem2 = (Item)paramMap.get(str1);
                            Item localItem1 = (Item)paramMap.get(str2);
                            if (localItem2 != null)
                            {
                              localItem2 = ClassWriter.get(localItem2);
                              c.put(str1, localItem2);
                            }
                            if (localItem1 != null) {
                              c.put(str2, localItem1);
                            }
                          }
                          return;
                        }
                        throw new IllegalStateException("Required value was null.".toString());
                      }
                      throw new IllegalStateException("Required value was null.".toString());
                    }
                    throw new IllegalStateException("Required value was null.".toString());
                  }
                  throw new IllegalStateException("Required value was null.".toString());
                }
                throw new IllegalStateException("Required value was null.".toString());
              }
              throw new IllegalStateException("Required value was null.".toString());
            }
            throw new IllegalStateException("Required value was null.".toString());
          }
          throw new IllegalStateException("Required value was null.".toString());
        }
        throw new IllegalStateException("Required value was null.".toString());
      }
      throw new IllegalStateException("Required value was null.".toString());
    }
    throw new IllegalStateException("Required value was null.".toString());
  }
  
  public final Item a(Item paramItem, String[] paramArrayOfString, String paramString)
  {
    Log.get(paramItem, "dense");
    Log.get(paramArrayOfString, "texts");
    Log.get(paramString, "task");
    Object localObject = ClassWriter.b;
    localObject = ClassWriter.a(ClassWriter.a(paramArrayOfString, 128, g), f);
    ClassWriter.b((Item)localObject, i);
    ClassWriter.a((Item)localObject);
    paramArrayOfString = ClassWriter.a((Item)localObject, e);
    ClassWriter.b(paramArrayOfString, d);
    ClassWriter.a(paramArrayOfString);
    Item localItem = ClassWriter.add(paramArrayOfString, 2);
    paramArrayOfString = ClassWriter.a(localItem, b);
    ClassWriter.b(paramArrayOfString, h);
    ClassWriter.a(paramArrayOfString);
    localObject = ClassWriter.add((Item)localObject, ((Item)localObject).get(1));
    localItem = ClassWriter.add(localItem, localItem.get(1));
    paramArrayOfString = ClassWriter.add(paramArrayOfString, paramArrayOfString.get(1));
    ClassWriter.a((Item)localObject, 1);
    ClassWriter.a(localItem, 1);
    ClassWriter.a(paramArrayOfString, 1);
    paramItem = ClassWriter.a(ClassWriter.a(new Item[] { localObject, localItem, paramArrayOfString, paramItem }), j, o);
    ClassWriter.a(paramItem);
    paramItem = ClassWriter.a(paramItem, k, l);
    ClassWriter.a(paramItem);
    paramArrayOfString = (Item)c.get(Log.valueOf(paramString, ".weight"));
    paramString = (Item)c.get(Log.valueOf(paramString, ".bias"));
    if ((paramArrayOfString != null) && (paramString != null))
    {
      paramItem = ClassWriter.a(paramItem, paramArrayOfString, paramString);
      ClassWriter.add(paramItem);
      return paramItem;
    }
    return null;
  }
}
