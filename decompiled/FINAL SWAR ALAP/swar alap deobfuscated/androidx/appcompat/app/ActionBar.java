package androidx.appcompat.app;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import androidx.appcompat.view.ActionMode;
import androidx.appcompat.view.ActionMode.Callback;
import handle.R.styleable;

public abstract class ActionBar
{
  public ActionBar() {}
  
  public abstract boolean collapseActionView();
  
  public abstract void dispatchMenuVisibilityChanged(boolean paramBoolean);
  
  public abstract int getDisplayOptions();
  
  public abstract Context getThemedContext();
  
  public boolean invalidateOptionsMenu()
  {
    return false;
  }
  
  public boolean isShowing()
  {
    return false;
  }
  
  public void onConfigurationChanged(Configuration paramConfiguration) {}
  
  void onDestroy() {}
  
  public abstract boolean onKeyShortcut(int paramInt, KeyEvent paramKeyEvent);
  
  public boolean onKeyShortcut(KeyEvent paramKeyEvent)
  {
    return false;
  }
  
  public boolean openOptionsMenu()
  {
    return false;
  }
  
  public abstract void setDefaultDisplayHomeAsUpEnabled(boolean paramBoolean);
  
  public abstract void setHomeActionContentDescription(int paramInt);
  
  public abstract void setHomeAsUpIndicator(Drawable paramDrawable);
  
  public abstract void setShowHideAnimationEnabled(boolean paramBoolean);
  
  public abstract void setTitle(CharSequence paramCharSequence);
  
  public abstract void setWindowTitle(CharSequence paramCharSequence);
  
  public ActionMode startActionMode(ActionMode.Callback paramCallback)
  {
    return null;
  }
  
  public abstract class LayoutParams
    extends ViewGroup.MarginLayoutParams
  {
    public int gravity;
    
    public LayoutParams(int paramInt)
    {
      super(paramInt);
      gravity = 8388627;
    }
    
    public LayoutParams(AttributeSet paramAttributeSet)
    {
      super(paramAttributeSet);
      gravity = 0;
      this$1 = this$1.obtainStyledAttributes(paramAttributeSet, R.styleable.ActionBarLayout);
      gravity = this$1.getInt(R.styleable.ActionBarLayout_android_layout_gravity, 0);
      this$1.recycle();
    }
    
    public LayoutParams()
    {
      super();
      gravity = 0;
    }
    
    public LayoutParams()
    {
      super();
      gravity = 0;
      gravity = gravity;
    }
  }
}
