package androidx.activity;

import android.app.Dialog;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.LifecycleEvent;
import androidx.lifecycle.m;
import model.Log;
import search.c;
import search.e;

public abstract class k
  extends Dialog
  implements m, Point, c
{
  private final OnBackPressedDispatcher a = new OnBackPressedDispatcher(new EventInfoFragment.1(this));
  private final search.f d = search.f.k.a(this);
  private androidx.lifecycle.f f;
  
  public k(Context paramContext, int paramInt)
  {
    super(paramContext, paramInt);
  }
  
  private final androidx.lifecycle.f a()
  {
    androidx.lifecycle.f localF2 = f;
    androidx.lifecycle.f localF1 = localF2;
    if (localF2 == null)
    {
      localF1 = new androidx.lifecycle.f(this);
      f = localF1;
    }
    return localF1;
  }
  
  private static final void a(k paramK)
  {
    Log.get(paramK, "this$0");
    paramK.onBackPressed();
  }
  
  public androidx.lifecycle.ClassWriter getLifecycle()
  {
    return a();
  }
  
  public final OnBackPressedDispatcher getOnBackPressedDispatcher()
  {
    return a;
  }
  
  public androidx.savedstate.ClassWriter getSavedStateRegistry()
  {
    return d.a();
  }
  
  public void onBackPressed()
  {
    a.get();
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    if (Build.VERSION.SDK_INT >= 33)
    {
      OnBackPressedDispatcher localOnBackPressedDispatcher = a;
      OnBackInvokedDispatcher localOnBackInvokedDispatcher = Widget.a(this);
      Log.append(localOnBackInvokedDispatcher, "onBackInvokedDispatcher");
      localOnBackPressedDispatcher.a(localOnBackInvokedDispatcher);
    }
    d.a(paramBundle);
    a().append(LifecycleEvent.ON_CREATE);
  }
  
  public Bundle onSaveInstanceState()
  {
    Bundle localBundle = super.onSaveInstanceState();
    Log.append(localBundle, "super.onSaveInstanceState()");
    d.d(localBundle);
    return localBundle;
  }
  
  protected void onStart()
  {
    super.onStart();
    a().append(LifecycleEvent.ON_RESUME);
  }
  
  protected void onStop()
  {
    a().append(LifecycleEvent.ON_DESTROY);
    f = null;
    super.onStop();
  }
}
