package androidx.activity.result;

import android.content.Intent;
import android.content.IntentSender;

public final class i
{
  private final IntentSender a;
  private int b;
  private int f;
  private Intent g;
  
  public i(IntentSender paramIntentSender)
  {
    a = paramIntentSender;
  }
  
  public final Label a()
  {
    return new Label(a, g, b, f);
  }
  
  public final i a(int paramInt1, int paramInt2)
  {
    f = paramInt1;
    b = paramInt2;
    return this;
  }
  
  public final i a(Intent paramIntent)
  {
    g = paramIntent;
    return this;
  }
}
