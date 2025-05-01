package androidx.appcompat.app;

import android.os.PowerManager;
import java.util.Locale;

abstract class Format
{
  static String getTitle(Locale paramLocale)
  {
    return paramLocale.toLanguageTag();
  }
  
  static boolean isPowerSaveMode(PowerManager paramPowerManager)
  {
    return paramPowerManager.isPowerSaveMode();
  }
}
