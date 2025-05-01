package IE;

import android.app.Activity;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.StateListDrawable;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import androidx.core.content.asm.l;
import androidx.core.view.ViewCompat;
import scripts.R.attr;
import scripts.R.dimen;

public abstract class UIUtils
{
  public static float convertDpToPixel(float paramFloat, android.content.Context paramContext)
  {
    return paramFloat * (getResourcesgetDisplayMetricsdensityDpi / 160.0F);
  }
  
  public static int getActionBarHeight(android.content.Context paramContext)
  {
    int j = getThemeAttributeDimensionSize(paramContext, R.attr.actionBarSize);
    int i = j;
    if (j == 0) {
      i = paramContext.getResources().getDimensionPixelSize(R.dimen.abc_action_bar_default_height_material);
    }
    return i;
  }
  
  public static int getColor(android.content.Context paramContext, int paramInt1, int paramInt2)
  {
    int i = getThemeColor(paramContext, paramInt1);
    paramInt1 = i;
    if (i == 0) {
      paramInt1 = l.getColor(paramContext.getResources(), paramInt2, paramContext.getTheme());
    }
    return paramInt1;
  }
  
  public static Drawable getCompatDrawable(android.content.Context paramContext)
  {
    return androidx.core.content.Context.getDrawable(paramContext, getSelectableBackground(paramContext));
  }
  
  public static StateListDrawable getIconStateList(Drawable paramDrawable1, Drawable paramDrawable2)
  {
    StateListDrawable localStateListDrawable = new StateListDrawable();
    localStateListDrawable.addState(new int[] { 16842913 }, paramDrawable2);
    localStateListDrawable.addState(new int[0], paramDrawable1);
    return localStateListDrawable;
  }
  
  public static int getNavigationBarHeight(android.content.Context paramContext)
  {
    Resources localResources = paramContext.getResources();
    if (getResourcesgetConfigurationorientation == 1) {
      paramContext = "navigation_bar_height";
    } else {
      paramContext = "navigation_bar_height_landscape";
    }
    int i = localResources.getIdentifier(paramContext, "dimen", "android");
    if (i > 0) {
      return localResources.getDimensionPixelSize(i);
    }
    return 0;
  }
  
  public static int getScreenWidth(android.content.Context paramContext)
  {
    return getResourcesgetDisplayMetricswidthPixels;
  }
  
  public static int getSelectableBackground(android.content.Context paramContext)
  {
    TypedValue localTypedValue = new TypedValue();
    paramContext.getTheme().resolveAttribute(R.attr.selectableItemBackground, localTypedValue, true);
    return resourceId;
  }
  
  public static StateListDrawable getSelectableBackground(android.content.Context paramContext, int paramInt, boolean paramBoolean)
  {
    StateListDrawable localStateListDrawable = new StateListDrawable();
    Object localObject = new ColorDrawable(paramInt);
    localStateListDrawable.addState(new int[] { 16842913 }, (Drawable)localObject);
    localObject = getCompatDrawable(paramContext);
    localStateListDrawable.addState(new int[0], (Drawable)localObject);
    if (paramBoolean)
    {
      paramInt = paramContext.getResources().getInteger(17694720);
      localStateListDrawable.setEnterFadeDuration(paramInt);
      localStateListDrawable.setExitFadeDuration(paramInt);
    }
    return localStateListDrawable;
  }
  
  public static int getStatusBarHeight(android.content.Context paramContext)
  {
    return getStatusBarHeight(paramContext, false);
  }
  
  public static int getStatusBarHeight(android.content.Context paramContext, boolean paramBoolean)
  {
    int i = paramContext.getResources().getIdentifier("status_bar_height", "dimen", "android");
    if (i > 0) {
      i = paramContext.getResources().getDimensionPixelSize(i);
    } else {
      i = 0;
    }
    int j = paramContext.getResources().getDimensionPixelSize(R.dimen.tool_bar_top_padding);
    if ((j == 0) && (!paramBoolean)) {
      return 0;
    }
    if (i == 0) {
      return j;
    }
    return i;
  }
  
  public static int getThemeAttributeDimensionSize(android.content.Context paramContext, int paramInt)
  {
    android.content.Context localContext = null;
    try
    {
      paramContext = paramContext.getTheme().obtainStyledAttributes(new int[] { paramInt });
      localContext = paramContext;
      paramInt = paramContext.getDimensionPixelSize(0, 0);
      paramContext.recycle();
      return paramInt;
    }
    catch (Throwable paramContext)
    {
      if (localContext != null) {
        localContext.recycle();
      }
      throw paramContext;
    }
  }
  
  public static int getThemeColor(android.content.Context paramContext, int paramInt)
  {
    TypedValue localTypedValue = new TypedValue();
    if (paramContext.getTheme().resolveAttribute(paramInt, localTypedValue, true)) {
      return data;
    }
    return 0;
  }
  
  public static void setBackground(View paramView, int paramInt)
  {
    ViewCompat.setBackgroundDrawable(paramView, androidx.core.content.Context.getDrawable(paramView.getContext(), paramInt));
  }
  
  public static void setBackground(View paramView, Drawable paramDrawable)
  {
    ViewCompat.setBackgroundDrawable(paramView, paramDrawable);
  }
  
  public static void setFlag(Activity paramActivity, int paramInt, boolean paramBoolean)
  {
    paramActivity = paramActivity.getWindow();
    WindowManager.LayoutParams localLayoutParams = paramActivity.getAttributes();
    if (paramBoolean) {
      paramInt |= flags;
    } else {
      paramInt &= flags;
    }
    flags = paramInt;
    paramActivity.setAttributes(localLayoutParams);
  }
  
  public static void setTranslucentNavigationFlag(Activity paramActivity, boolean paramBoolean)
  {
    setFlag(paramActivity, 134217728, paramBoolean);
  }
  
  public static void setTranslucentStatusFlag(Activity paramActivity, boolean paramBoolean)
  {
    setFlag(paramActivity, 67108864, paramBoolean);
  }
}
