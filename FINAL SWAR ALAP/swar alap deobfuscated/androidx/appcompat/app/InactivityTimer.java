package androidx.appcompat.app;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;

abstract class InactivityTimer
{
  private BroadcastReceiver mReceiver;
  
  InactivityTimer(AppCompatDelegateImplV7 paramAppCompatDelegateImplV7) {}
  
  void cancel()
  {
    BroadcastReceiver localBroadcastReceiver = mReceiver;
    if (localBroadcastReceiver != null)
    {
      Context localContext = handler.mContext;
      try
      {
        localContext.unregisterReceiver(localBroadcastReceiver);
        mReceiver = null;
        return;
      }
      catch (IllegalArgumentException localIllegalArgumentException)
      {
        for (;;) {}
      }
    }
  }
  
  abstract void dispatchKeyEvent();
  
  abstract IntentFilter init();
  
  void onResume()
  {
    cancel();
    IntentFilter localIntentFilter = init();
    if (localIntentFilter != null)
    {
      if (localIntentFilter.countActions() == 0) {
        return;
      }
      if (mReceiver == null) {
        mReceiver = new h.q.a(this);
      }
      handler.mContext.registerReceiver(mReceiver, localIntentFilter);
    }
  }
  
  abstract int start();
}
