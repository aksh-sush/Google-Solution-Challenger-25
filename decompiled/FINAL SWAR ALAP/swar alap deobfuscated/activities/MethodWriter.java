package activities;

import android.accounts.Account;
import android.os.BaseBundle;
import android.os.Bundle;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.auth.params.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.GoogleApiClient.b;
import com.google.android.gms.common.api.GoogleApiClient.c;
import com.google.android.gms.common.internal.AnnotationWriter;
import com.google.android.gms.common.internal.Scope;
import com.google.android.gms.common.internal.h;
import spec.ByteVector;

public class MethodWriter
  extends Scope
  implements reflect.e
{
  private final boolean S = true;
  private final Integer b;
  private final h o;
  private final Bundle s;
  
  public MethodWriter(android.content.Context paramContext, Looper paramLooper, boolean paramBoolean, h paramH, Bundle paramBundle, GoogleApiClient.b paramB, GoogleApiClient.c paramC)
  {
    super(paramContext, paramLooper, 44, paramH, paramB, paramC);
    o = paramH;
    s = paramBundle;
    b = paramH.getDimension();
  }
  
  public static Bundle onSaveInstanceState(h paramH)
  {
    paramH.a();
    Integer localInteger = paramH.getDimension();
    Bundle localBundle = new Bundle();
    localBundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", paramH.getIntent());
    if (localInteger != null) {
      localBundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", localInteger.intValue());
    }
    localBundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
    localBundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
    localBundle.putString("com.google.android.gms.signin.internal.serverClientId", null);
    localBundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
    localBundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
    localBundle.putString("com.google.android.gms.signin.internal.hostedDomain", null);
    localBundle.putString("com.google.android.gms.signin.internal.logSessionId", null);
    localBundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
    return localBundle;
  }
  
  public final void a()
  {
    connect(new AnnotationWriter(this));
  }
  
  public final void a(c paramC)
  {
    com.google.android.gms.common.internal.Log.append(paramC, "Expecting a valid ISignInCallbacks");
    Object localObject1 = o;
    try
    {
      Object localObject2 = ((h)localObject1).c();
      localObject1 = name;
      boolean bool = "<<default account>>".equals(localObject1);
      if (bool) {
        localObject1 = ByteVector.a(getContext()).a();
      } else {
        localObject1 = null;
      }
      Object localObject3 = b;
      localObject3 = com.google.android.gms.common.internal.Log.append(localObject3);
      localObject3 = (Integer)localObject3;
      localObject1 = new com.google.android.gms.common.internal.Item((Account)localObject2, ((Integer)localObject3).intValue(), (GoogleSignInAccount)localObject1);
      localObject2 = getService();
      localObject2 = (Type)localObject2;
      ((Type)localObject2).a(new Label(1, (com.google.android.gms.common.internal.Item)localObject1), paramC);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      android.util.Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
    }
    try
    {
      paramC.a(new f(1, new module.Item(8, null), null));
      return;
    }
    catch (RemoteException paramC)
    {
      for (;;) {}
    }
    android.util.Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", localRemoteException);
  }
  
  public final void a(com.google.android.gms.common.internal.e paramE, boolean paramBoolean)
  {
    try
    {
      Object localObject1 = getService();
      localObject1 = (Type)localObject1;
      Object localObject2 = b;
      localObject2 = com.google.android.gms.common.internal.Log.append(localObject2);
      localObject2 = (Integer)localObject2;
      ((Type)localObject1).a(paramE, ((Integer)localObject2).intValue(), paramBoolean);
      return;
    }
    catch (RemoteException paramE)
    {
      for (;;) {}
    }
    android.util.Log.w("SignInClientImpl", "Remote service probably died when saveDefaultAccount is called");
  }
  
  public final void b()
  {
    try
    {
      Object localObject1 = getService();
      localObject1 = (Type)localObject1;
      Object localObject2 = b;
      localObject2 = com.google.android.gms.common.internal.Log.append(localObject2);
      localObject2 = (Integer)localObject2;
      ((Type)localObject1).a(((Integer)localObject2).intValue());
      return;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;) {}
    }
    android.util.Log.w("SignInClientImpl", "Remote service probably died when clearAccountFromSessionStore is called");
  }
  
  protected final Bundle getGetServiceRequestExtraArgs()
  {
    String str = o.b();
    if (!getContext().getPackageName().equals(str)) {
      s.putString("com.google.android.gms.signin.internal.realClientPackageName", o.b());
    }
    return s;
  }
  
  public final int getMinApkVersion()
  {
    return 12451000;
  }
  
  protected final String getServiceDescriptor()
  {
    return "com.google.android.gms.signin.internal.ISignInService";
  }
  
  protected final String getStartServiceAction()
  {
    return "com.google.android.gms.signin.service.START";
  }
  
  public final boolean requiresSignIn()
  {
    return S;
  }
}
