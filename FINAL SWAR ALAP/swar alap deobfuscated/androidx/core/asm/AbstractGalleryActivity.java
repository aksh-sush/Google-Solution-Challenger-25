package androidx.core.asm;

import android.app.Activity;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v4.media.session.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import androidx.collection.g;
import androidx.core.view.Drawable;
import androidx.core.view.i;
import androidx.lifecycle.BaseFragment;
import androidx.lifecycle.Label;
import androidx.lifecycle.f;
import androidx.lifecycle.m;

public abstract class AbstractGalleryActivity
  extends Activity
  implements m, Drawable
{
  private g mExtraDataMap = new androidx.collection.Context();
  private f mLifecycleRegistry = new f(this);
  
  public AbstractGalleryActivity() {}
  
  private static boolean a(String[] paramArrayOfString)
  {
    if ((paramArrayOfString != null) && (paramArrayOfString.length > 0))
    {
      paramArrayOfString = paramArrayOfString[0];
      paramArrayOfString.hashCode();
      int j = paramArrayOfString.hashCode();
      int i = -1;
      switch (j)
      {
      default: 
        break;
      case 1455016274: 
        if (paramArrayOfString.equals("--autofill")) {
          i = 4;
        }
        break;
      case 1159329357: 
        if (paramArrayOfString.equals("--contentcapture")) {
          i = 3;
        }
        break;
      case 472614934: 
        if (paramArrayOfString.equals("--list-dumpables")) {
          i = 2;
        }
        break;
      case 100470631: 
        if (paramArrayOfString.equals("--dump-dumpable")) {
          i = 1;
        }
        break;
      case -645125871: 
        if (paramArrayOfString.equals("--translation")) {
          i = 0;
        }
        break;
      }
      switch (i)
      {
      default: 
        return false;
      case 4: 
        if (Build.VERSION.SDK_INT >= 26) {
          return true;
        }
        break;
      case 3: 
        if (Build.VERSION.SDK_INT >= 29) {
          return true;
        }
        break;
      case 1: 
      case 2: 
        return androidx.core.menu.Context.get();
      case 0: 
        if (Build.VERSION.SDK_INT >= 31) {
          return true;
        }
        break;
      }
    }
    return false;
  }
  
  public boolean dispatchKeyEvent(KeyEvent paramKeyEvent)
  {
    View localView = getWindow().getDecorView();
    if ((localView != null) && (i.a(localView, paramKeyEvent))) {
      return true;
    }
    return i.a(this, localView, this, paramKeyEvent);
  }
  
  public boolean dispatchKeyShortcutEvent(KeyEvent paramKeyEvent)
  {
    View localView = getWindow().getDecorView();
    if ((localView != null) && (i.a(localView, paramKeyEvent))) {
      return true;
    }
    return super.dispatchKeyShortcutEvent(paramKeyEvent);
  }
  
  public AnnotationVisitor getExtraData(Class paramClass)
  {
    Log.get(mExtraDataMap.get(paramClass));
    return null;
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    BaseFragment.onCreate(this);
  }
  
  protected void onSaveInstanceState(Bundle paramBundle)
  {
    mLifecycleRegistry.d(Label.d);
    super.onSaveInstanceState(paramBundle);
  }
  
  public void putExtraData(AnnotationVisitor paramAnnotationVisitor)
  {
    throw new NullPointerException("Null throw statement replaced by Soot");
  }
  
  protected final boolean shouldDumpInternalState(String[] paramArrayOfString)
  {
    return a(paramArrayOfString) ^ true;
  }
  
  public boolean superDispatchKeyEvent(KeyEvent paramKeyEvent)
  {
    return super.dispatchKeyEvent(paramKeyEvent);
  }
}
