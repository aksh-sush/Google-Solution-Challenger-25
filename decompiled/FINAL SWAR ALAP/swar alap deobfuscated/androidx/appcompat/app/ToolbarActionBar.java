package androidx.appcompat.app;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.support.v4.media.session.Log;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.Window.Callback;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.widget.DecorToolbar;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.Toolbar.h;
import androidx.appcompat.widget.ToolbarWidgetWrapper;
import androidx.core.util.Type;
import androidx.core.view.ViewCompat;
import java.util.ArrayList;

class ToolbarActionBar
  extends ActionBar
{
  final DecorToolbar mDecorToolbar;
  private boolean mLastMenuVisibility;
  private boolean mMenuCallbackSet;
  private final Toolbar.h mMenuClicker;
  private final Runnable mMenuInvalidator = new f0.a(this);
  private ArrayList mMenuVisibilityListeners = new ArrayList();
  boolean mOptionsMenuInvalidated;
  final WindowCallback mWindow;
  final Window.Callback mWindowCallback;
  
  ToolbarActionBar(Toolbar paramToolbar, CharSequence paramCharSequence, Window.Callback paramCallback)
  {
    f0.b localB = new f0.b(this);
    mMenuClicker = localB;
    Type.a(paramToolbar);
    ToolbarWidgetWrapper localToolbarWidgetWrapper = new ToolbarWidgetWrapper(paramToolbar, false);
    mDecorToolbar = localToolbarWidgetWrapper;
    mWindowCallback = ((Window.Callback)Type.a(paramCallback));
    localToolbarWidgetWrapper.setWindowCallback(paramCallback);
    paramToolbar.setOnMenuItemClickListener(localB);
    localToolbarWidgetWrapper.setWindowTitle(paramCharSequence);
    mWindow = new f0.e(this);
  }
  
  private Menu getMenu()
  {
    if (!mMenuCallbackSet)
    {
      mDecorToolbar.setMenuCallbacks(new f0.c(this), new f0.d(this));
      mMenuCallbackSet = true;
    }
    return mDecorToolbar.getMenu();
  }
  
  public boolean collapseActionView()
  {
    if (mDecorToolbar.hasExpandedActionView())
    {
      mDecorToolbar.collapseActionView();
      return true;
    }
    return false;
  }
  
  public void dispatchMenuVisibilityChanged(boolean paramBoolean)
  {
    if (paramBoolean == mLastMenuVisibility) {
      return;
    }
    mLastMenuVisibility = paramBoolean;
    if (mMenuVisibilityListeners.size() <= 0) {
      return;
    }
    Log.get(mMenuVisibilityListeners.get(0));
    throw new NullPointerException("Null throw statement replaced by Soot");
  }
  
  public int getDisplayOptions()
  {
    return mDecorToolbar.getDisplayOptions();
  }
  
  public Context getThemedContext()
  {
    return mDecorToolbar.getContext();
  }
  
  public boolean invalidateOptionsMenu()
  {
    mDecorToolbar.getViewGroup().removeCallbacks(mMenuInvalidator);
    ViewCompat.postOnAnimation(mDecorToolbar.getViewGroup(), mMenuInvalidator);
    return true;
  }
  
  public boolean isShowing()
  {
    return mDecorToolbar.hideOverflowMenu();
  }
  
  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    super.onConfigurationChanged(paramConfiguration);
  }
  
  void onDestroy()
  {
    mDecorToolbar.getViewGroup().removeCallbacks(mMenuInvalidator);
  }
  
  public boolean onKeyShortcut(int paramInt, KeyEvent paramKeyEvent)
  {
    Menu localMenu = getMenu();
    if (localMenu != null)
    {
      if (paramKeyEvent != null) {
        i = paramKeyEvent.getDeviceId();
      } else {
        i = -1;
      }
      int i = KeyCharacterMap.load(i).getKeyboardType();
      boolean bool = true;
      if (i == 1) {
        bool = false;
      }
      localMenu.setQwertyMode(bool);
      return localMenu.performShortcut(paramInt, paramKeyEvent, 0);
    }
    return false;
  }
  
  public boolean onKeyShortcut(KeyEvent paramKeyEvent)
  {
    if (paramKeyEvent.getAction() == 1) {
      openOptionsMenu();
    }
    return true;
  }
  
  public boolean openOptionsMenu()
  {
    return mDecorToolbar.showOverflowMenu();
  }
  
  void populateOptionsMenu()
  {
    Menu localMenu = getMenu();
    f localF;
    if ((localMenu instanceof f)) {
      localF = (f)localMenu;
    } else {
      localF = null;
    }
    if (localF != null) {
      localF.stopDispatchingItemsChanged();
    }
    try
    {
      localMenu.clear();
      boolean bool = mWindowCallback.onCreatePanelMenu(0, localMenu);
      if (bool)
      {
        bool = mWindowCallback.onPreparePanel(0, null, localMenu);
        if (bool) {}
      }
      else
      {
        localMenu.clear();
      }
      if (localF != null)
      {
        localF.startDispatchingItemsChanged();
        return;
      }
    }
    catch (Throwable localThrowable)
    {
      if (localF != null) {
        localF.startDispatchingItemsChanged();
      }
      throw localThrowable;
    }
  }
  
  public void setDefaultDisplayHomeAsUpEnabled(boolean paramBoolean) {}
  
  public void setHomeActionContentDescription(int paramInt)
  {
    mDecorToolbar.setNavigationContentDescription(paramInt);
  }
  
  public void setHomeAsUpIndicator(Drawable paramDrawable)
  {
    mDecorToolbar.setNavigationIcon(paramDrawable);
  }
  
  public void setShowHideAnimationEnabled(boolean paramBoolean) {}
  
  public void setTitle(CharSequence paramCharSequence)
  {
    mDecorToolbar.setTitle(paramCharSequence);
  }
  
  public void setWindowTitle(CharSequence paramCharSequence)
  {
    mDecorToolbar.setWindowTitle(paramCharSequence);
  }
}
