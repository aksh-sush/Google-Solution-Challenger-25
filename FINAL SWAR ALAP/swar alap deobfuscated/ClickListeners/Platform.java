package ClickListeners;

import android.support.v4.media.session.Log;
import java.util.ArrayList;
import ui.Context;

final class Platform
{
  private final ArrayList val$ids = new ArrayList();
  
  public Platform() {}
  
  public final void invoke()
  {
    int i = Context.getValue(val$ids);
    if (-1 >= i) {
      return;
    }
    Log.get(val$ids.get(i));
    throw new NullPointerException("Null throw statement replaced by Soot");
  }
}
