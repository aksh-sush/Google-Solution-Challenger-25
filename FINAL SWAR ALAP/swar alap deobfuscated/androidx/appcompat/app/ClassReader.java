package androidx.appcompat.app;

import androidx.core.menu.Label;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Set;

abstract class ClassReader
{
  private static Label a(Label paramLabel1, Label paramLabel2)
  {
    LinkedHashSet localLinkedHashSet = new LinkedHashSet();
    int i = 0;
    while (i < paramLabel1.b() + paramLabel2.b())
    {
      Locale localLocale;
      if (i < paramLabel1.b()) {
        localLocale = paramLabel1.a(i);
      } else {
        localLocale = paramLabel2.a(i - paramLabel1.b());
      }
      if (localLocale != null) {
        localLinkedHashSet.add(localLocale);
      }
      i += 1;
    }
    return Label.a((Locale[])localLinkedHashSet.toArray(new Locale[localLinkedHashSet.size()]));
  }
  
  static Label b(Label paramLabel1, Label paramLabel2)
  {
    if ((paramLabel1 != null) && (!paramLabel1.a())) {
      return a(paramLabel1, paramLabel2);
    }
    return Label.c();
  }
}
