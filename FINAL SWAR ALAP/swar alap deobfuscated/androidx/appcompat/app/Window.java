package androidx.appcompat.app;

import android.content.IntentFilter;

class Window
  extends InactivityTimer
{
  private final TwilightManager lock;
  
  Window(AppCompatDelegateImplV7 paramAppCompatDelegateImplV7, TwilightManager paramTwilightManager)
  {
    super(paramAppCompatDelegateImplV7);
    lock = paramTwilightManager;
  }
  
  public void dispatchKeyEvent()
  {
    this$0.dispatchKeyEvent();
  }
  
  IntentFilter init()
  {
    IntentFilter localIntentFilter = new IntentFilter();
    localIntentFilter.addAction("android.intent.action.TIME_SET");
    localIntentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
    localIntentFilter.addAction("android.intent.action.TIME_TICK");
    return localIntentFilter;
  }
  
  public int start()
  {
    if (lock.isNight()) {
      return 2;
    }
    return 1;
  }
}
