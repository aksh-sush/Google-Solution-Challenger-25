package androidx.activity;

import android.window.BackEvent;
import model.Log;

public final class i
{
  public static final i b = new i();
  
  private i() {}
  
  public final float a(BackEvent paramBackEvent)
  {
    Log.get(paramBackEvent, "backEvent");
    return paramBackEvent.getTouchY();
  }
  
  public final BackEvent a(float paramFloat1, float paramFloat2, float paramFloat3, int paramInt)
  {
    return new BackEvent(paramFloat1, paramFloat2, paramFloat3, paramInt);
  }
  
  public final float b(BackEvent paramBackEvent)
  {
    Log.get(paramBackEvent, "backEvent");
    return paramBackEvent.getTouchX();
  }
  
  public final float f(BackEvent paramBackEvent)
  {
    Log.get(paramBackEvent, "backEvent");
    return paramBackEvent.getProgress();
  }
  
  public final int i(BackEvent paramBackEvent)
  {
    Log.get(paramBackEvent, "backEvent");
    return paramBackEvent.getSwipeEdge();
  }
}
