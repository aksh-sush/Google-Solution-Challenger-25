package androidx.appcompat.app;

import android.content.res.Resources;
import android.os.Build.VERSION;
import android.util.Log;
import android.util.LongSparseArray;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.util.Map;

abstract class ActionMenuItemView
{
  private static Field b;
  private static Class c;
  private static boolean f;
  private static Field g;
  private static Field h;
  private static boolean i;
  private static boolean l;
  private static boolean m;
  
  private static void a(Resources paramResources)
  {
    if (!i)
    {
      try
      {
        Field localField1 = Resources.class.getDeclaredField("mResourcesImpl");
        b = localField1;
        localField1.setAccessible(true);
      }
      catch (NoSuchFieldException localNoSuchFieldException1)
      {
        Log.e("ResourcesFlusher", "Could not retrieve Resources#mResourcesImpl field", localNoSuchFieldException1);
      }
      i = true;
    }
    Field localField2 = b;
    if (localField2 == null) {
      return;
    }
    Object localObject2 = null;
    try
    {
      paramResources = localField2.get(paramResources);
    }
    catch (IllegalAccessException paramResources)
    {
      Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mResourcesImpl", paramResources);
      paramResources = null;
    }
    if (paramResources == null) {
      return;
    }
    if (!m)
    {
      try
      {
        localField2 = paramResources.getClass().getDeclaredField("mDrawableCache");
        h = localField2;
        localField2.setAccessible(true);
      }
      catch (NoSuchFieldException localNoSuchFieldException2)
      {
        Log.e("ResourcesFlusher", "Could not retrieve ResourcesImpl#mDrawableCache field", localNoSuchFieldException2);
      }
      m = true;
    }
    Field localField3 = h;
    Object localObject1 = localObject2;
    if (localField3 != null) {
      try
      {
        localObject1 = localField3.get(paramResources);
      }
      catch (IllegalAccessException paramResources)
      {
        Log.e("ResourcesFlusher", "Could not retrieve value from ResourcesImpl#mDrawableCache", paramResources);
        localObject1 = localObject2;
      }
    }
    if (localObject1 != null) {
      a(localObject1);
    }
  }
  
  private static void a(Object paramObject)
  {
    if (!l)
    {
      try
      {
        Class localClass = Class.forName("android.content.res.ThemedResourceCache");
        c = localClass;
      }
      catch (ClassNotFoundException localClassNotFoundException)
      {
        Log.e("ResourcesFlusher", "Could not find ThemedResourceCache class", localClassNotFoundException);
      }
      l = true;
    }
    Object localObject = c;
    if (localObject == null) {
      return;
    }
    if (!f)
    {
      try
      {
        localObject = ((Class)localObject).getDeclaredField("mUnthemedEntries");
        g = (Field)localObject;
        ((AccessibleObject)localObject).setAccessible(true);
      }
      catch (NoSuchFieldException localNoSuchFieldException)
      {
        Log.e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", localNoSuchFieldException);
      }
      f = true;
    }
    Field localField = g;
    if (localField == null) {
      return;
    }
    try
    {
      paramObject = localField.get(paramObject);
      paramObject = (LongSparseArray)paramObject;
    }
    catch (IllegalAccessException paramObject)
    {
      Log.e("ResourcesFlusher", "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", paramObject);
      paramObject = null;
    }
    if (paramObject != null) {
      e0.a.setAdapter(paramObject);
    }
  }
  
  private static void init(Resources paramResources)
  {
    if (!m)
    {
      try
      {
        Field localField1 = Resources.class.getDeclaredField("mDrawableCache");
        h = localField1;
        localField1.setAccessible(true);
      }
      catch (NoSuchFieldException localNoSuchFieldException)
      {
        Log.e("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", localNoSuchFieldException);
      }
      m = true;
    }
    Field localField2 = h;
    if (localField2 != null)
    {
      try
      {
        paramResources = localField2.get(paramResources);
        paramResources = (Map)paramResources;
      }
      catch (IllegalAccessException paramResources)
      {
        Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mDrawableCache", paramResources);
        paramResources = null;
      }
      if (paramResources != null) {
        paramResources.clear();
      }
    }
  }
  
  private static void initialize(Resources paramResources)
  {
    if (!m)
    {
      try
      {
        Field localField1 = Resources.class.getDeclaredField("mDrawableCache");
        h = localField1;
        localField1.setAccessible(true);
      }
      catch (NoSuchFieldException localNoSuchFieldException)
      {
        Log.e("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", localNoSuchFieldException);
      }
      m = true;
    }
    Field localField2 = h;
    if (localField2 != null) {
      try
      {
        paramResources = localField2.get(paramResources);
      }
      catch (IllegalAccessException paramResources)
      {
        Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mDrawableCache", paramResources);
      }
    } else {
      paramResources = null;
    }
    if (paramResources == null) {
      return;
    }
    a(paramResources);
  }
  
  static void onCreateView(Resources paramResources)
  {
    int j = Build.VERSION.SDK_INT;
    if (j >= 28) {
      return;
    }
    if (j >= 24)
    {
      a(paramResources);
      return;
    }
    if (j >= 23)
    {
      initialize(paramResources);
      return;
    }
    init(paramResources);
  }
}
