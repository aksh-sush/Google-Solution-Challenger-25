package Abstract;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;

public abstract interface IInAppBillingService
  extends IInterface
{
  public abstract Bundle getSkuDetails(Bundle paramBundle);
  
  public abstract class Stub
    extends Binder
    implements IInAppBillingService
  {
    public static IInAppBillingService asInterface(IBinder paramIBinder)
    {
      if (paramIBinder == null) {
        return null;
      }
      IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
      if ((localIInterface != null) && ((localIInterface instanceof IInAppBillingService))) {
        return (IInAppBillingService)localIInterface;
      }
      return new a.a.a(paramIBinder);
    }
  }
}
