package androidx.appcompat.app;

import android.content.res.Configuration;

abstract class L
{
  static void d(Configuration paramConfiguration1, Configuration paramConfiguration2, Configuration paramConfiguration3)
  {
    if ((x.a(paramConfiguration1) & 0x3) != (x.a(paramConfiguration2) & 0x3)) {
      l.a(paramConfiguration3, x.a(paramConfiguration3) | x.a(paramConfiguration2) & 0x3);
    }
    if ((x.a(paramConfiguration1) & 0xC) != (x.a(paramConfiguration2) & 0xC)) {
      l.a(paramConfiguration3, x.a(paramConfiguration3) | x.a(paramConfiguration2) & 0xC);
    }
  }
}
