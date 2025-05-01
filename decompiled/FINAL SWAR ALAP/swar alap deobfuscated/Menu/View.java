package Menu;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.AppCompatDrawableManager;

public abstract class View
{
  public static ColorStateList get(android.content.Context paramContext, int paramInt)
  {
    return androidx.core.content.Context.c(paramContext, paramInt);
  }
  
  public static Drawable getDrawable(android.content.Context paramContext, int paramInt)
  {
    return AppCompatDrawableManager.get().getDrawable(paramContext, paramInt);
  }
}
