package GAL;

import com.google.android.gms.common.internal.b;
import java.util.Locale;

public class Log
{
  private final String TAG;
  private final b c;
  private final int index;
  private final String text;
  
  public Log(String paramString, String... paramVarArgs)
  {
    text = paramVarArgs;
    TAG = paramString;
    c = new b(paramString);
    int i = 2;
    while ((i <= 7) && (!android.util.Log.isLoggable(TAG, i))) {
      i += 1;
    }
    index = i;
  }
  
  public void d(String paramString, Object... paramVarArgs)
  {
    if (write(3)) {
      android.util.Log.d(TAG, toString(paramString, paramVarArgs));
    }
  }
  
  public void e(String paramString, Throwable paramThrowable, Object... paramVarArgs)
  {
    android.util.Log.e(TAG, toString(paramString, paramVarArgs), paramThrowable);
  }
  
  public void e(String paramString, Object... paramVarArgs)
  {
    android.util.Log.w(TAG, toString(paramString, paramVarArgs));
  }
  
  public void error(String paramString, Object... paramVarArgs)
  {
    if (write(2)) {
      android.util.Log.v(TAG, toString(paramString, paramVarArgs));
    }
  }
  
  public void log(String paramString, Throwable paramThrowable, Object... paramVarArgs)
  {
    android.util.Log.wtf(TAG, toString(paramString, paramVarArgs), paramThrowable);
  }
  
  public void log(String paramString, Object... paramVarArgs)
  {
    android.util.Log.i(TAG, toString(paramString, paramVarArgs));
  }
  
  public void log(Throwable paramThrowable)
  {
    android.util.Log.wtf(TAG, paramThrowable);
  }
  
  protected String toString(String paramString, Object... paramVarArgs)
  {
    String str = paramString;
    if (paramVarArgs != null)
    {
      str = paramString;
      if (paramVarArgs.length > 0) {
        str = String.format(Locale.US, paramString, paramVarArgs);
      }
    }
    return text.concat(str);
  }
  
  public void w(String paramString, Object... paramVarArgs)
  {
    android.util.Log.e(TAG, toString(paramString, paramVarArgs));
  }
  
  public boolean write(int paramInt)
  {
    return index <= paramInt;
  }
}
