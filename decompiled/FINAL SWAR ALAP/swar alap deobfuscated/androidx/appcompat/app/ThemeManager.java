package androidx.appcompat.app;

import android.content.res.Configuration;
import android.view.ContextThemeWrapper;

abstract class ThemeManager
{
  static void applyTheme(ContextThemeWrapper paramContextThemeWrapper, Configuration paramConfiguration)
  {
    paramContextThemeWrapper.applyOverrideConfiguration(paramConfiguration);
  }
}
