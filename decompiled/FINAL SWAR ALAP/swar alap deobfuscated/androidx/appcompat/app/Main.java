package androidx.appcompat.app;

import android.content.Context;
import android.content.IntentFilter;
import android.os.PowerManager;

class Main
  extends InactivityTimer
{
  private final PowerManager activity;
  
  Main(AppCompatDelegateImplV7 paramAppCompatDelegateImplV7, Context paramContext)
  {
    super(paramAppCompatDelegateImplV7);
    activity = ((PowerManager)paramContext.getApplicationContext().getSystemService("power"));
  }
  
  public void dispatchKeyEvent()
  {
    this$0.dispatchKeyEvent();
  }
  
  IntentFilter init()
  {
    IntentFilter localIntentFilter = new IntentFilter();
    localIntentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
    return localIntentFilter;
  }
  
  public int start()
  {
    if (Format.isPowerSaveMode(activity)) {
      return 2;
    }
    return 1;
  }
}
