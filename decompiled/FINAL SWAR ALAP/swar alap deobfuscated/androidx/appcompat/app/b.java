package androidx.appcompat.app;

import android.app.ActionBar;
import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.drawerlayout.widget.DrawerLayout.e;
import drawable.DrawerArrowDrawable;

public abstract class b
  implements DrawerLayout.e
{
  View.OnClickListener a;
  private Drawable b;
  boolean c = true;
  private DrawerArrowDrawable e;
  private final int g;
  private final int i;
  private boolean l = true;
  private final ActionBarDrawerToggle.Delegate mActivityImpl;
  private final DrawerLayout mDrawerLayout;
  private boolean mWarnedForDisplayHomeAsUp = false;
  
  b(Activity paramActivity, Toolbar paramToolbar, DrawerLayout paramDrawerLayout, DrawerArrowDrawable paramDrawerArrowDrawable, int paramInt1, int paramInt2)
  {
    if (paramToolbar != null)
    {
      mActivityImpl = new ActionBarDrawerToggle.ToolbarCompatDelegate(paramToolbar);
      paramToolbar.setNavigationOnClickListener(new FilenameDialog.1(this));
    }
    else if ((paramActivity instanceof ActionBarDrawerToggle.DelegateProvider))
    {
      mActivityImpl = ((ActionBarDrawerToggle.DelegateProvider)paramActivity).getDrawerToggleDelegate();
    }
    else
    {
      mActivityImpl = new ActionBarDrawerToggle.JellybeanMr2Delegate(paramActivity);
    }
    mDrawerLayout = paramDrawerLayout;
    g = paramInt1;
    i = paramInt2;
    if (paramDrawerArrowDrawable == null) {
      e = new DrawerArrowDrawable(mActivityImpl.getActionBarThemedContext());
    } else {
      e = paramDrawerArrowDrawable;
    }
    b = getThemeUpIndicator();
  }
  
  public b(Activity paramActivity, DrawerLayout paramDrawerLayout, Toolbar paramToolbar, int paramInt1, int paramInt2)
  {
    this(paramActivity, paramToolbar, paramDrawerLayout, null, paramInt1, paramInt2);
  }
  
  private void a(float paramFloat)
  {
    DrawerArrowDrawable localDrawerArrowDrawable;
    if (paramFloat == 1.0F) {
      localDrawerArrowDrawable = e;
    }
    for (boolean bool = true;; bool = false)
    {
      localDrawerArrowDrawable.setVerticalMirror(bool);
      break;
      if (paramFloat != 0.0F) {
        break;
      }
      localDrawerArrowDrawable = e;
    }
    e.setProgress(paramFloat);
  }
  
  void a(int paramInt)
  {
    mActivityImpl.setActionBarDescription(paramInt);
  }
  
  public void a(View paramView)
  {
    a(1.0F);
    if (c) {
      a(i);
    }
  }
  
  public void a(View paramView, float paramFloat)
  {
    if (l)
    {
      a(Math.min(1.0F, Math.max(0.0F, paramFloat)));
      return;
    }
    a(0.0F);
  }
  
  public void b(View paramView)
  {
    a(0.0F);
    if (c) {
      a(g);
    }
  }
  
  Drawable getThemeUpIndicator()
  {
    return mActivityImpl.getThemeUpIndicator();
  }
  
  public void onClick(int paramInt) {}
  
  public void onCreate()
  {
    float f;
    if (mDrawerLayout.isDrawerOpen(8388611)) {
      f = 1.0F;
    } else {
      f = 0.0F;
    }
    a(f);
    if (c)
    {
      DrawerArrowDrawable localDrawerArrowDrawable = e;
      int j;
      if (mDrawerLayout.isDrawerOpen(8388611)) {
        j = i;
      } else {
        j = g;
      }
      setActionBarUpIndicator(localDrawerArrowDrawable, j);
    }
  }
  
  void setActionBarUpIndicator(Drawable paramDrawable, int paramInt)
  {
    if ((!mWarnedForDisplayHomeAsUp) && (!mActivityImpl.isNavigationVisible()))
    {
      Log.w("ActionBarDrawerToggle", "DrawerToggle may not show up because NavigationIcon is not visible. You may need to call actionbar.setDisplayHomeAsUpEnabled(true);");
      mWarnedForDisplayHomeAsUp = true;
    }
    mActivityImpl.setActionBarUpIndicator(paramDrawable, paramInt);
  }
  
  public void setToolbarNavigationClickListener(View.OnClickListener paramOnClickListener)
  {
    a = paramOnClickListener;
  }
  
  void toggle()
  {
    int j = mDrawerLayout.getDrawerLockMode(8388611);
    if ((mDrawerLayout.isDrawerVisible(8388611)) && (j != 2))
    {
      mDrawerLayout.closeDrawer(8388611);
      return;
    }
    if (j != 1) {
      mDrawerLayout.openDrawer(8388611);
    }
  }
  
  static abstract class d$a
  {
    static void setActionBarDescription(ActionBar paramActionBar, int paramInt)
    {
      paramActionBar.setHomeActionContentDescription(paramInt);
    }
    
    static void setActionBarUpIndicator(ActionBar paramActionBar, Drawable paramDrawable)
    {
      paramActionBar.setHomeAsUpIndicator(paramDrawable);
    }
  }
}
