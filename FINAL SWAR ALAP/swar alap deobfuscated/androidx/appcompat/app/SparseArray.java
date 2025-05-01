package androidx.appcompat.app;

import android.os.LocaleList;

abstract class SparseArray
{
  static LocaleList append(String paramString)
  {
    return LocaleList.forLanguageTags(paramString);
  }
}
