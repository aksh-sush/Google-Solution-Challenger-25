package analysis;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.BaseBundle;
import android.os.Bundle;
import android.text.TextUtils;
import calculation.g;
import com.facebook.Integer;
import com.facebook.m0.c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import package_31.Priority;
import ranges.Type;
import ui.Attribute;
import widgets.ClassWriter;

public final class i
{
  private static final Map a = new ConcurrentHashMap();
  public static final i d = new i();
  private static final List next = ui.Context.get(new String[] { "other", "fb_mobile_complete_registration", "fb_mobile_add_to_cart", "fb_mobile_purchase", "fb_mobile_initiated_checkout" });
  private static final List values = ui.Context.get(new String[] { "none", "address", "health" });
  
  private i() {}
  
  public static final java.io.File a(f paramF)
  {
    model.Log.get(paramF, "task");
    paramF = (m)a.get(paramF.c());
    if (paramF == null) {
      return null;
    }
    return paramF.f();
  }
  
  public static final void a()
  {
    package_31.Context localContext = package_31.Context.a;
    package_31.Context.invoke(new Plot.a());
  }
  
  private final void a(JSONObject paramJSONObject)
  {
    Iterator localIterator = paramJSONObject.keys();
    try
    {
      for (;;)
      {
        boolean bool = localIterator.hasNext();
        if (!bool) {
          break;
        }
        Object localObject1 = localIterator.next();
        localObject1 = (String)localObject1;
        Object localObject2 = m.i;
        localObject1 = ((f.b.a)localObject2).a(paramJSONObject.getJSONObject((String)localObject1));
        if (localObject1 != null)
        {
          localObject2 = a;
          ((Map)localObject2).put(((m)localObject1).a(), localObject1);
        }
      }
      return;
    }
    catch (JSONException paramJSONObject) {}
  }
  
  public static final String[] a(f paramF, float[][] paramArrayOfFloat, String[] paramArrayOfString)
  {
    model.Log.get(paramF, "task");
    model.Log.get(paramArrayOfFloat, "denses");
    model.Log.get(paramArrayOfString, "texts");
    Object localObject = (m)a.get(paramF.c());
    d localD;
    if (localObject == null) {
      localD = null;
    } else {
      localD = ((m)localObject).b();
    }
    if (localD == null) {
      return null;
    }
    localObject = ((m)localObject).d();
    int m = paramArrayOfString.length;
    int j = 0;
    int n = paramArrayOfFloat[0].length;
    Item localItem = new Item(new int[] { m, n });
    int i;
    if (m > 0)
    {
      int k;
      for (i = 0;; i = k)
      {
        k = i + 1;
        System.arraycopy(paramArrayOfFloat[i], 0, localItem.get(), i * n, n);
        if (k >= m) {
          break;
        }
      }
    }
    paramArrayOfFloat = localD.a(localItem, paramArrayOfString, paramF.b());
    if ((paramArrayOfFloat != null) && (localObject != null))
    {
      if (paramArrayOfFloat.get().length == 0) {
        i = 1;
      } else {
        i = 0;
      }
      if (i == 0)
      {
        i = j;
        if (localObject.length == 0) {
          i = 1;
        }
        if (i != 0) {
          return null;
        }
        i = l.d[paramF.ordinal()];
        if (i != 1)
        {
          if (i == 2) {
            return d.add(paramArrayOfFloat, (float[])localObject);
          }
          throw new ClassWriter();
        }
        return d.get(paramArrayOfFloat, (float[])localObject);
      }
    }
    return null;
  }
  
  private final JSONObject add()
  {
    Object localObject = new Bundle();
    ((BaseBundle)localObject).putString("fields", TextUtils.join(",", new String[] { "use_case", "version_id", "asset_uri", "rules_uri", "thresholds" }));
    Integer localInteger = Integer.c.a(null, "app/model_asset", null);
    localInteger.e((Bundle)localObject);
    localObject = localInteger.i().next();
    if (localObject == null) {
      return null;
    }
    return update((JSONObject)localObject);
  }
  
  private final boolean add(long paramLong)
  {
    if (paramLong == 0L) {
      return false;
    }
    return System.currentTimeMillis() - paramLong < 259200000L;
  }
  
  private final String[] add(Item paramItem, float[] paramArrayOfFloat)
  {
    int i = paramItem.get(0);
    int k = paramItem.get(1);
    float[] arrayOfFloat = paramItem.get();
    if (k != paramArrayOfFloat.length) {
      return null;
    }
    paramItem = Type.create(0, i);
    ArrayList localArrayList = new ArrayList(ui.Context.add(paramItem, 10));
    Iterator localIterator = paramItem.iterator();
    while (localIterator.hasNext())
    {
      int m = ((Attribute)localIterator).get();
      int n = paramArrayOfFloat.length;
      paramItem = "none";
      int j = 0;
      i = 0;
      while (j < n)
      {
        float f = paramArrayOfFloat[j];
        if (arrayOfFloat[(m * k + i)] >= f) {
          paramItem = values.get(i);
        }
        j += 1;
        i += 1;
      }
      localArrayList.add((String)paramItem);
    }
    paramItem = localArrayList.toArray(new String[0]);
    if (paramItem != null) {
      return (String[])paramItem;
    }
    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
  }
  
  private final void b()
  {
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = a.entrySet().iterator();
    Object localObject1 = null;
    int i = 0;
    while (localIterator.hasNext())
    {
      Object localObject2 = (Map.Entry)localIterator.next();
      String str = (String)((Map.Entry)localObject2).getKey();
      m localM = (m)((Map.Entry)localObject2).getValue();
      int j = i;
      if (model.Log.append(str, f.d.c()))
      {
        localObject2 = localM.e();
        i = Math.max(i, localM.getValue());
        localObject1 = package_31.i.b;
        localObject1 = localObject2;
        j = i;
        if (package_31.i.a(Priority.d))
        {
          localObject1 = localObject2;
          j = i;
          if (write())
          {
            localArrayList.add(localM.a(new EventInfoFragment.1()));
            j = i;
            localObject1 = localObject2;
          }
        }
      }
      i = j;
      if (model.Log.append(str, f.b.c()))
      {
        localObject2 = localM.e();
        j = Math.max(j, localM.getValue());
        localObject1 = package_31.i.b;
        localObject1 = localObject2;
        i = j;
        if (package_31.i.a(Priority.e))
        {
          localArrayList.add(localM.a(new AppCompatDelegateImplV7.4()));
          localObject1 = localObject2;
          i = j;
        }
      }
    }
    if ((localObject1 != null) && (i > 0) && (!localArrayList.isEmpty()))
    {
      localObject1 = new m("MTML", (String)localObject1, null, i, null);
      m.i.a((m)localObject1, localArrayList);
    }
  }
  
  private static final void c() {}
  
  private static final void clear()
  {
    try
    {
      Object localObject1 = com.facebook.Context.getContext();
      int i = 0;
      SharedPreferences localSharedPreferences = ((android.content.Context)localObject1).getSharedPreferences("com.facebook.internal.MODEL_STORE", 0);
      localObject1 = localSharedPreferences.getString("models", null);
      if (localObject1 != null)
      {
        int j = ((CharSequence)localObject1).length();
        if (j == 0) {
          i = 1;
        }
        if (i == 0)
        {
          localObject1 = new JSONObject((String)localObject1);
          break label80;
        }
      }
      localObject1 = new JSONObject();
      label80:
      long l = localSharedPreferences.getLong("model_request_timestamp", 0L);
      Object localObject2 = package_31.i.b;
      localObject2 = Priority.x;
      boolean bool = package_31.i.a((Priority)localObject2);
      if (bool)
      {
        i = ((JSONObject)localObject1).length();
        if (i != 0)
        {
          localObject2 = d;
          bool = ((i)localObject2).add(l);
          if (bool) {
            break label200;
          }
        }
      }
      localObject1 = d;
      localObject2 = ((i)localObject1).add();
      localObject1 = localObject2;
      if (localObject2 == null) {
        return;
      }
      localSharedPreferences.edit().putString("models", ((JSONObject)localObject2).toString()).putLong("model_request_timestamp", System.currentTimeMillis()).apply();
      label200:
      localObject2 = d;
      ((i)localObject2).a((JSONObject)localObject1);
      ((i)localObject2).b();
      return;
    }
    catch (Exception localException) {}
  }
  
  private final String[] get(Item paramItem, float[] paramArrayOfFloat)
  {
    int i = paramItem.get(0);
    int k = paramItem.get(1);
    float[] arrayOfFloat = paramItem.get();
    if (k != paramArrayOfFloat.length) {
      return null;
    }
    paramItem = Type.create(0, i);
    ArrayList localArrayList = new ArrayList(ui.Context.add(paramItem, 10));
    Iterator localIterator = paramItem.iterator();
    while (localIterator.hasNext())
    {
      int m = ((Attribute)localIterator).get();
      int n = paramArrayOfFloat.length;
      paramItem = "other";
      int j = 0;
      i = 0;
      while (j < n)
      {
        float f = paramArrayOfFloat[j];
        if (arrayOfFloat[(m * k + i)] >= f) {
          paramItem = next.get(i);
        }
        j += 1;
        i += 1;
      }
      localArrayList.add((String)paramItem);
    }
    paramItem = localArrayList.toArray(new String[0]);
    if (paramItem != null) {
      return (String[])paramItem;
    }
    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
  }
  
  private final float[] read(JSONArray paramJSONArray)
  {
    if (paramJSONArray == null) {
      return null;
    }
    float[] arrayOfFloat = new float[paramJSONArray.length()];
    int k = paramJSONArray.length();
    if (k > 0)
    {
      int j;
      for (int i = 0;; i = j)
      {
        j = i + 1;
        try
        {
          String str = paramJSONArray.getString(i);
          model.Log.append(str, "jsonArray.getString(i)");
          float f = Float.parseFloat(str);
          arrayOfFloat[i] = f;
        }
        catch (JSONException localJSONException)
        {
          for (;;) {}
        }
        if (j >= k) {
          return arrayOfFloat;
        }
      }
    }
    return arrayOfFloat;
  }
  
  private static final void setEnabled() {}
  
  private final JSONObject update(JSONObject paramJSONObject)
  {
    JSONObject localJSONObject1 = new JSONObject();
    try
    {
      paramJSONObject = paramJSONObject.getJSONArray("data");
      int k = paramJSONObject.length();
      if (k <= 0) {
        break label180;
      }
      int j;
      for (int i = 0;; i = j)
      {
        j = i + 1;
        JSONObject localJSONObject2 = paramJSONObject.getJSONObject(i);
        JSONObject localJSONObject3 = new JSONObject();
        localJSONObject3.put("version_id", localJSONObject2.getString("version_id"));
        localJSONObject3.put("use_case", localJSONObject2.getString("use_case"));
        localJSONObject3.put("thresholds", localJSONObject2.getJSONArray("thresholds"));
        localJSONObject3.put("asset_uri", localJSONObject2.getString("asset_uri"));
        boolean bool = localJSONObject2.has("rules_uri");
        if (bool) {
          localJSONObject3.put("rules_uri", localJSONObject2.getString("rules_uri"));
        }
        localJSONObject1.put(localJSONObject2.getString("use_case"), localJSONObject3);
        if (j >= k) {
          return localJSONObject1;
        }
      }
    }
    catch (JSONException paramJSONObject)
    {
      for (;;) {}
    }
    return new JSONObject();
    label180:
    return localJSONObject1;
  }
  
  private final boolean write()
  {
    Object localObject = package_31.Context.setLocale();
    if (localObject != null)
    {
      localObject = ((Locale)localObject).getLanguage();
      model.Log.append(localObject, "locale.language");
    }
    return terminal.Log.append((CharSequence)localObject, "en", false, 2, null);
  }
}
