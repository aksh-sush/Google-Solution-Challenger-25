package androidx.appcompat.app;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Build.VERSION;

public abstract class CustomTileListenerService
  extends Service
{
  public static ServiceInfo evaluate(Context paramContext)
  {
    int i;
    if (Build.VERSION.SDK_INT >= 24) {
      i = Renderer.getMaxLineLength() | 0x80;
    } else {
      i = 640;
    }
    return paramContext.getPackageManager().getServiceInfo(new ComponentName(paramContext, z.class), i);
  }
}
