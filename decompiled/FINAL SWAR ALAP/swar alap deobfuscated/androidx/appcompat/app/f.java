package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.widget.Toolbar;
import androidx.collection.TFloatLinkedList;
import androidx.core.menu.Label;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.Iterator;

public abstract class f
{
  private static Label a;
  private static Label b;
  private static Boolean c;
  private static int d;
  static b0.a e = new b0.a(new b0.b());
  private static final TFloatLinkedList f;
  private static boolean i;
  private static final Object m = new Object();
  private static final Object p;
  
  static
  {
    d = -100;
    a = null;
    b = null;
    c = null;
    i = false;
    f = new TFloatLinkedList();
    p = new Object();
  }
  
  f() {}
  
  private static void a(f paramF)
  {
    Object localObject = p;
    try
    {
      Iterator localIterator = f.iterator();
      while (localIterator.hasNext())
      {
        f localF = (f)((WeakReference)localIterator.next()).get();
        if ((localF == paramF) || (localF == null)) {
          localIterator.remove();
        }
      }
      return;
    }
    catch (Throwable paramF)
    {
      throw paramF;
    }
  }
  
  static void add(f paramF)
  {
    Object localObject = p;
    try
    {
      a(paramF);
      f.add(new WeakReference(paramF));
      return;
    }
    catch (Throwable paramF)
    {
      throw paramF;
    }
  }
  
  static boolean add(android.content.Context paramContext)
  {
    if (c == null) {}
    try
    {
      paramContext = CustomTileListenerService.evaluate(paramContext);
      paramContext = metaData;
      if (paramContext == null) {
        break label51;
      }
      boolean bool = paramContext.getBoolean("autoStoreLocales");
      c = Boolean.valueOf(bool);
    }
    catch (PackageManager.NameNotFoundException paramContext)
    {
      for (;;) {}
    }
    Log.d("AppCompatDelegate", "Checking for metadata for AppLocalesMetadataHolderService : Service not found");
    c = Boolean.FALSE;
    label51:
    return c.booleanValue();
  }
  
  public static Label b()
  {
    Object localObject;
    if (androidx.core.menu.Context.get())
    {
      localObject = close();
      if (localObject != null) {
        return Label.a(a.a(localObject));
      }
    }
    else
    {
      localObject = a;
      if (localObject != null) {
        return localObject;
      }
    }
    return Label.c();
  }
  
  static Label c()
  {
    return a;
  }
  
  static Object close()
  {
    Iterator localIterator = f.iterator();
    while (localIterator.hasNext())
    {
      Object localObject = (f)((WeakReference)localIterator.next()).get();
      if (localObject != null)
      {
        localObject = ((f)localObject).getContext();
        if (localObject != null) {
          return ((android.content.Context)localObject).getSystemService("locale");
        }
      }
    }
    return null;
  }
  
  static void close(f paramF)
  {
    Object localObject = p;
    try
    {
      a(paramF);
      return;
    }
    catch (Throwable paramF)
    {
      throw paramF;
    }
  }
  
  public static f create(Activity paramActivity, AppCompatCallback paramAppCompatCallback)
  {
    return new AppCompatDelegateImplV7(paramActivity, paramAppCompatCallback);
  }
  
  public static f create(Dialog paramDialog, AppCompatCallback paramAppCompatCallback)
  {
    return new AppCompatDelegateImplV7(paramDialog, paramAppCompatCallback);
  }
  
  public static int q()
  {
    return d;
  }
  
  static void run(android.content.Context paramContext)
  {
    if (!add(paramContext)) {
      return;
    }
    if (androidx.core.menu.Context.get())
    {
      if (!i) {
        e.execute(new SplashScreen.5.1(paramContext));
      }
    }
    else
    {
      Object localObject = m;
      try
      {
        Label localLabel = a;
        if (localLabel == null)
        {
          if (b == null) {
            b = Label.a(JsonParser.parse(paramContext));
          }
          if (b.a()) {
            return;
          }
          a = b;
        }
        else if (!localLabel.equals(b))
        {
          localLabel = a;
          b = localLabel;
          JsonParser.save(paramContext, localLabel.d());
        }
        return;
      }
      catch (Throwable paramContext)
      {
        throw paramContext;
      }
    }
  }
  
  public abstract void a();
  
  public abstract void a(Bundle paramBundle);
  
  public void a(OnBackInvokedDispatcher paramOnBackInvokedDispatcher) {}
  
  public abstract void addContentView(View paramView, ViewGroup.LayoutParams paramLayoutParams);
  
  public abstract void b(int paramInt);
  
  public abstract int e();
  
  public void e(android.content.Context paramContext) {}
  
  public abstract View findViewById(int paramInt);
  
  public abstract android.content.Context getContext();
  
  public abstract ActionBarDrawerToggle.Delegate getDrawerToggleDelegate();
  
  public abstract MenuInflater getMenuInflater();
  
  public abstract ActionBar getSupportActionBar();
  
  public abstract void installViewFactory();
  
  public abstract void invalidateOptionsMenu();
  
  public abstract void onConfigurationChanged(Configuration paramConfiguration);
  
  public android.content.Context onCreate(android.content.Context paramContext)
  {
    e(paramContext);
    return paramContext;
  }
  
  public abstract void onCreate(Bundle paramBundle);
  
  public abstract void onPostCreate(Bundle paramBundle);
  
  public abstract void onPostResume();
  
  public abstract void onStop();
  
  public abstract void onTitleChanged(CharSequence paramCharSequence);
  
  public abstract boolean requestWindowFeature(int paramInt);
  
  public abstract void setContentView();
  
  public abstract void setContentView(int paramInt);
  
  public abstract void setContentView(View paramView);
  
  public abstract void setContentView(View paramView, ViewGroup.LayoutParams paramLayoutParams);
  
  public abstract void setSupportActionBar(Toolbar paramToolbar);
}
