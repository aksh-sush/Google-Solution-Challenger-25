package androidx.appcompat.app;

import android.content.res.Configuration;
import android.os.LocaleList;
import androidx.core.menu.Label;

abstract class Handler
{
  static Label a(Configuration paramConfiguration)
  {
    return Label.a(e.b(Widget.getString(paramConfiguration)));
  }
  
  static void a(Configuration paramConfiguration, Label paramLabel)
  {
    Context.setLocale(paramConfiguration, n.a(paramLabel.d()));
  }
  
  public static void a(Label paramLabel)
  {
    Item.a(n.a(paramLabel.d()));
  }
  
  static void init(Configuration paramConfiguration1, Configuration paramConfiguration2, Configuration paramConfiguration3)
  {
    paramConfiguration1 = Widget.getString(paramConfiguration1);
    LocaleList localLocaleList = Widget.getString(paramConfiguration2);
    if (!Calendar.equals(paramConfiguration1, localLocaleList))
    {
      Context.setLocale(paramConfiguration3, localLocaleList);
      locale = locale;
    }
  }
}
