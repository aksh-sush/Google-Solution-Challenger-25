package Conference;

import com.google.android.gms.location.LocationListener;
import com.huawei.hms.location.LocationCallback;
import com.onesignal.common.AndroidUtils;
import model.Log;

public final class ReminderAlarm
{
  public static final ReminderAlarm INSTANCE = new ReminderAlarm();
  
  private ReminderAlarm() {}
  
  public final boolean hasGMSLocationLibrary()
  {
    try
    {
      boolean bool = AndroidUtils.INSTANCE.opaqueHasClass(LocationListener.class);
      return bool;
    }
    catch (NoClassDefFoundError localNoClassDefFoundError)
    {
      for (;;) {}
    }
    return false;
  }
  
  public final boolean hasHMSLocationLibrary()
  {
    try
    {
      boolean bool = AndroidUtils.INSTANCE.opaqueHasClass(LocationCallback.class);
      return bool;
    }
    catch (NoClassDefFoundError localNoClassDefFoundError)
    {
      for (;;) {}
    }
    return false;
  }
  
  public final boolean hasLocationPermission(android.content.Context paramContext)
  {
    Log.get(paramContext, "context");
    return (androidx.core.content.Context.checkSelfPermission(paramContext, "android.permission.ACCESS_FINE_LOCATION") == 0) || (androidx.core.content.Context.checkSelfPermission(paramContext, "android.permission.ACCESS_COARSE_LOCATION") == 0);
  }
}
