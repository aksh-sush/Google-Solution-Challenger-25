package androidx.appcompat.app;

import android.app.LocaleManager;
import android.os.LocaleList;

abstract class a
{
  static LocaleList a(Object paramObject)
  {
    return ((LocaleManager)paramObject).getApplicationLocales();
  }
  
  static void setEnabled(Object paramObject, LocaleList paramLocaleList)
  {
    ((LocaleManager)paramObject).setApplicationLocales(paramLocaleList);
  }
}
