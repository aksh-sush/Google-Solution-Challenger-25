package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.AsyncHttpClient;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import module.ClassWriter;
import module.Item;
import module.Label;

public abstract class Context
{
  private static final Label[] CENTER = new Label[0];
  public static final int CONNECT_STATE_CONNECTED = 4;
  public static final int CONNECT_STATE_DISCONNECTED = 1;
  public static final int CONNECT_STATE_DISCONNECTING = 5;
  public static final String DEFAULT_ACCOUNT = "<<default account>>";
  public static final String[] GOOGLE_PLUS_REQUIRED_FEATURES = { "service_esmobile", "service_googleme" };
  public static final String KEY_PENDING_INTENT = "pendingIntent";
  private final ClassWriter a;
  private final MediaBrowserCompatApi21.ConnectionCallback b;
  private final ArrayList c = new ArrayList();
  private final k d;
  private final Object e = new Object();
  private int endTime;
  private volatile String f;
  private final int g;
  final Handler h;
  private boolean i = false;
  private Item k = null;
  private long key;
  private final f l;
  protected Object m;
  private final android.content.Context mContext;
  private final String mDescriptor;
  private int n = 1;
  private volatile String nodeSet = null;
  MethodWriter o;
  private OpenPgpServiceConnection.1 p;
  private long position;
  private IFileWriteModuleService q;
  private volatile Matrix r = null;
  protected AtomicInteger s = new AtomicInteger(0);
  private final Object size = new Object();
  private long state;
  private IInterface t;
  private final Looper u;
  private int y;
  
  protected Context(android.content.Context paramContext, Looper paramLooper, int paramInt, MediaBrowserCompatApi21.ConnectionCallback paramConnectionCallback, k paramK, String paramString)
  {
    this(paramContext, paramLooper, localF, localClassWriter, paramInt, paramConnectionCallback, paramK, paramString);
  }
  
  protected Context(android.content.Context paramContext, Looper paramLooper, f paramF, ClassWriter paramClassWriter, int paramInt, MediaBrowserCompatApi21.ConnectionCallback paramConnectionCallback, k paramK, String paramString)
  {
    Log.append(paramContext, "Context must not be null");
    mContext = paramContext;
    Log.append(paramLooper, "Looper must not be null");
    u = paramLooper;
    Log.append(paramF, "Supervisor must not be null");
    l = paramF;
    Log.append(paramClassWriter, "API availability must not be null");
    a = paramClassWriter;
    h = new RegisteredMediaRouteProvider.ReceiveHandler(this, paramLooper);
    g = paramInt;
    b = paramConnectionCallback;
    d = paramK;
    mDescriptor = paramString;
  }
  
  private final void a(int paramInt, IInterface paramIInterface)
  {
    boolean bool = false;
    int j;
    if (paramInt != 4) {
      j = 0;
    } else {
      j = 1;
    }
    int i1;
    if (paramIInterface == null) {
      i1 = 0;
    } else {
      i1 = 1;
    }
    if (j == i1) {
      bool = true;
    }
    Log.valueOf(bool);
    Object localObject1 = size;
    try
    {
      n = paramInt;
      t = paramIInterface;
      Object localObject3;
      Object localObject2;
      if (paramInt != 1)
      {
        if ((paramInt != 2) && (paramInt != 3))
        {
          if (paramInt == 4)
          {
            Log.append(paramIInterface);
            onConnectedLocked(paramIInterface);
          }
        }
        else
        {
          paramIInterface = p;
          if (paramIInterface != null)
          {
            localObject3 = o;
            if (localObject3 != null)
            {
              localObject2 = ((MethodWriter)localObject3).a();
              localObject3 = ((MethodWriter)localObject3).f();
              localObject4 = new StringBuilder();
              ((StringBuilder)localObject4).append("Calling connect() while still connected, missing disconnect() for ");
              ((StringBuilder)localObject4).append((String)localObject2);
              ((StringBuilder)localObject4).append(" on ");
              ((StringBuilder)localObject4).append((String)localObject3);
              android.util.Log.e("GmsClient", ((StringBuilder)localObject4).toString());
              localObject2 = l;
              localObject3 = o.a();
              Log.append(localObject3);
              ((f)localObject2).a((String)localObject3, o.f(), 4225, paramIInterface, getDescriptor(), o.c());
              s.incrementAndGet();
            }
          }
          localObject2 = new OpenPgpServiceConnection.1(this, s.get());
          p = ((OpenPgpServiceConnection.1)localObject2);
          if ((n == 3) && (getLocalStartServiceAction() != null)) {
            paramIInterface = new MethodWriter(getContext().getPackageName(), getLocalStartServiceAction(), true, 4225, false);
          } else {
            paramIInterface = new MethodWriter(getStartServicePackage(), getStartServiceAction(), false, 4225, getUseDynamicLookup());
          }
          o = paramIInterface;
          if ((paramIInterface.c()) && (getMinApkVersion() < 17895000)) {
            throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf(o.a())));
          }
          paramIInterface = l;
          localObject3 = o.a();
          Log.append(localObject3);
          Object localObject4 = o.f();
          String str = getDescriptor();
          bool = o.c();
          Executor localExecutor = getBindServiceExecutor();
          if (!paramIInterface.a(new Handle((String)localObject3, (String)localObject4, 4225, bool), (ServiceConnection)localObject2, str, localExecutor))
          {
            paramIInterface = o.a();
            localObject2 = o.f();
            localObject3 = new StringBuilder();
            ((StringBuilder)localObject3).append("unable to connect to service: ");
            ((StringBuilder)localObject3).append(paramIInterface);
            ((StringBuilder)localObject3).append(" on ");
            ((StringBuilder)localObject3).append((String)localObject2);
            android.util.Log.w("GmsClient", ((StringBuilder)localObject3).toString());
            a(16, null, s.get());
          }
        }
      }
      else
      {
        paramIInterface = p;
        if (paramIInterface != null)
        {
          localObject2 = l;
          localObject3 = o.a();
          Log.append(localObject3);
          ((f)localObject2).a((String)localObject3, o.f(), 4225, paramIInterface, getDescriptor(), o.c());
          p = null;
        }
      }
      return;
    }
    catch (Throwable paramIInterface)
    {
      throw paramIInterface;
    }
  }
  
  protected final void a(int paramInt1, Bundle paramBundle, int paramInt2)
  {
    paramBundle = h;
    paramBundle.sendMessage(paramBundle.obtainMessage(7, paramInt2, -1, new XYGraphWidget(this, paramInt1, null)));
  }
  
  public void checkAvailabilityAndConnect()
  {
    int j = a.a(mContext, getMinApkVersion());
    if (j != 0)
    {
      a(1, null);
      triggerNotAvailable(new AnnotationWriter(this), j, null);
      return;
    }
    connect(new AnnotationWriter(this));
  }
  
  protected final void checkConnected()
  {
    if (isConnected()) {
      return;
    }
    throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
  }
  
  public void connect(Object paramObject)
  {
    Log.append(paramObject, "Connection progress callbacks cannot be null.");
    m = paramObject;
    a(2, null);
  }
  
  protected abstract IInterface createServiceInterface(IBinder paramIBinder);
  
  /* Error */
  public void disconnect()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 144	com/google/android/gms/common/internal/Context:s	Ljava/util/concurrent/atomic/AtomicInteger;
    //   4: invokevirtual 235	java/util/concurrent/atomic/AtomicInteger:incrementAndGet	()I
    //   7: pop
    //   8: aload_0
    //   9: getfield 129	com/google/android/gms/common/internal/Context:c	Ljava/util/ArrayList;
    //   12: astore_3
    //   13: aload_3
    //   14: monitorenter
    //   15: aload_0
    //   16: getfield 129	com/google/android/gms/common/internal/Context:c	Ljava/util/ArrayList;
    //   19: invokevirtual 411	java/util/ArrayList:size	()I
    //   22: istore_2
    //   23: iconst_0
    //   24: istore_1
    //   25: iload_1
    //   26: iload_2
    //   27: if_icmpge +24 -> 51
    //   30: aload_0
    //   31: getfield 129	com/google/android/gms/common/internal/Context:c	Ljava/util/ArrayList;
    //   34: iload_1
    //   35: invokevirtual 414	java/util/ArrayList:get	(I)Ljava/lang/Object;
    //   38: checkcast 416	com/google/android/gms/common/internal/m
    //   41: invokevirtual 419	com/google/android/gms/common/internal/m:next	()V
    //   44: iload_1
    //   45: iconst_1
    //   46: iadd
    //   47: istore_1
    //   48: goto -23 -> 25
    //   51: aload_0
    //   52: getfield 129	com/google/android/gms/common/internal/Context:c	Ljava/util/ArrayList;
    //   55: invokevirtual 422	java/util/ArrayList:clear	()V
    //   58: aload_3
    //   59: monitorexit
    //   60: aload_0
    //   61: getfield 124	com/google/android/gms/common/internal/Context:e	Ljava/lang/Object;
    //   64: astore_3
    //   65: aload_3
    //   66: monitorenter
    //   67: aload_0
    //   68: aconst_null
    //   69: putfield 366	com/google/android/gms/common/internal/Context:q	Lcom/google/android/gms/common/internal/IFileWriteModuleService;
    //   72: aload_3
    //   73: monitorexit
    //   74: aload_0
    //   75: iconst_1
    //   76: aconst_null
    //   77: invokespecial 370	com/google/android/gms/common/internal/Context:a	(ILandroid/os/IInterface;)V
    //   80: return
    //   81: astore 4
    //   83: aload_3
    //   84: monitorexit
    //   85: aload 4
    //   87: athrow
    //   88: astore 4
    //   90: aload_3
    //   91: monitorexit
    //   92: aload 4
    //   94: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	95	0	this	Context
    //   24	24	1	j	int
    //   22	6	2	i1	int
    //   12	79	3	localObject	Object
    //   81	5	4	localThrowable1	Throwable
    //   88	5	4	localThrowable2	Throwable
    // Exception table:
    //   from	to	target	type
    //   67	74	81	java/lang/Throwable
    //   83	85	81	java/lang/Throwable
    //   15	23	88	java/lang/Throwable
    //   30	44	88	java/lang/Throwable
    //   51	60	88	java/lang/Throwable
    //   90	92	88	java/lang/Throwable
  }
  
  public void disconnect(String paramString)
  {
    nodeSet = paramString;
    disconnect();
  }
  
  public void dump(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString)
  {
    paramFileDescriptor = size;
    try
    {
      int j = n;
      paramArrayOfString = t;
      paramFileDescriptor = e;
      try
      {
        Object localObject = q;
        paramPrintWriter.append(paramString).append("mConnectState=");
        if (j != 1)
        {
          if (j != 2)
          {
            if (j != 3)
            {
              if (j != 4)
              {
                if (j != 5) {
                  paramFileDescriptor = "UNKNOWN";
                } else {
                  paramFileDescriptor = "DISCONNECTING";
                }
              }
              else {
                paramFileDescriptor = "CONNECTED";
              }
            }
            else {
              paramFileDescriptor = "LOCAL_CONNECTING";
            }
          }
          else {
            paramFileDescriptor = "REMOTE_CONNECTING";
          }
        }
        else {
          paramFileDescriptor = "DISCONNECTED";
        }
        paramPrintWriter.print(paramFileDescriptor);
        paramPrintWriter.append(" mService=");
        if (paramArrayOfString == null) {
          paramPrintWriter.append("null");
        } else {
          paramPrintWriter.append(getServiceDescriptor()).append("@").append(Integer.toHexString(System.identityHashCode(paramArrayOfString.asBinder())));
        }
        paramPrintWriter.append(" mServiceBroker=");
        if (localObject == null) {
          paramPrintWriter.println("null");
        } else {
          paramPrintWriter.append("IGmsServiceBroker@").println(Integer.toHexString(System.identityHashCode(((IInterface)localObject).asBinder())));
        }
        paramArrayOfString = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US);
        long l1;
        StringBuilder localStringBuilder;
        if (position > 0L)
        {
          paramFileDescriptor = paramPrintWriter.append(paramString).append("lastConnectedTime=");
          l1 = position;
          localObject = paramArrayOfString.format(new Date(l1));
          localStringBuilder = new StringBuilder();
          localStringBuilder.append(l1);
          localStringBuilder.append(" ");
          localStringBuilder.append((String)localObject);
          paramFileDescriptor.println(localStringBuilder.toString());
        }
        if (key > 0L)
        {
          paramPrintWriter.append(paramString).append("lastSuspendedCause=");
          j = endTime;
          if (j != 1)
          {
            if (j != 2)
            {
              if (j != 3) {
                paramFileDescriptor = String.valueOf(j);
              } else {
                paramFileDescriptor = "CAUSE_DEAD_OBJECT_EXCEPTION";
              }
            }
            else {
              paramFileDescriptor = "CAUSE_NETWORK_LOST";
            }
          }
          else {
            paramFileDescriptor = "CAUSE_SERVICE_DISCONNECTED";
          }
          paramPrintWriter.append(paramFileDescriptor);
          paramFileDescriptor = paramPrintWriter.append(" lastSuspendedTime=");
          l1 = key;
          localObject = paramArrayOfString.format(new Date(l1));
          localStringBuilder = new StringBuilder();
          localStringBuilder.append(l1);
          localStringBuilder.append(" ");
          localStringBuilder.append((String)localObject);
          paramFileDescriptor.println(localStringBuilder.toString());
        }
        if (state > 0L)
        {
          paramPrintWriter.append(paramString).append("lastFailedStatus=").append(AsyncHttpClient.get(y));
          paramString = paramPrintWriter.append(" lastFailedTime=");
          l1 = state;
          paramFileDescriptor = paramArrayOfString.format(new Date(l1));
          paramPrintWriter = new StringBuilder();
          paramPrintWriter.append(l1);
          paramPrintWriter.append(" ");
          paramPrintWriter.append(paramFileDescriptor);
          paramString.println(paramPrintWriter.toString());
          return;
        }
      }
      catch (Throwable paramString)
      {
        throw paramString;
      }
      return;
    }
    catch (Throwable paramString)
    {
      throw paramString;
    }
  }
  
  protected boolean enableLocalFallback()
  {
    return false;
  }
  
  public Account getAccount()
  {
    return null;
  }
  
  public Label[] getApiFeatures()
  {
    return CENTER;
  }
  
  public final Label[] getAvailableFeatures()
  {
    Matrix localMatrix = r;
    if (localMatrix == null) {
      return null;
    }
    return c;
  }
  
  protected Executor getBindServiceExecutor()
  {
    return null;
  }
  
  public Bundle getConnectionHint()
  {
    return null;
  }
  
  public final android.content.Context getContext()
  {
    return mContext;
  }
  
  protected final String getDescriptor()
  {
    String str2 = mDescriptor;
    String str1 = str2;
    if (str2 == null) {
      str1 = mContext.getClass().getName();
    }
    return str1;
  }
  
  public String getEndpointPackageName()
  {
    if (isConnected())
    {
      MethodWriter localMethodWriter = o;
      if (localMethodWriter != null) {
        return localMethodWriter.f();
      }
    }
    throw new RuntimeException("Failed to connect when checking package");
  }
  
  public int getGCoreServiceId()
  {
    return g;
  }
  
  protected Bundle getGetServiceRequestExtraArgs()
  {
    return new Bundle();
  }
  
  public String getLastDisconnectMessage()
  {
    return nodeSet;
  }
  
  protected String getLocalStartServiceAction()
  {
    return null;
  }
  
  public final Looper getLooper()
  {
    return u;
  }
  
  public abstract int getMinApkVersion();
  
  public void getRemoteService(e paramE, Set paramSet)
  {
    throw new Runtime("d2j fail translate: java.lang.RuntimeException: fail exe a14 = a13\n\tat com.googlecode.dex2jar.ir.ts.an.BaseAnalyze.exec(BaseAnalyze.java:92)\n\tat com.googlecode.dex2jar.ir.ts.an.BaseAnalyze.exec(BaseAnalyze.java:1)\n\tat com.googlecode.dex2jar.ir.ts.Cfg.dfs(Cfg.java:255)\n\tat com.googlecode.dex2jar.ir.ts.an.BaseAnalyze.analyze0(BaseAnalyze.java:75)\n\tat com.googlecode.dex2jar.ir.ts.an.BaseAnalyze.analyze(BaseAnalyze.java:69)\n\tat com.googlecode.dex2jar.ir.ts.UnSSATransformer.transform(UnSSATransformer.java:274)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:163)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\nCaused by: java.lang.NullPointerException\n\tat com.googlecode.dex2jar.ir.ts.UnSSATransformer$LiveA.onUseLocal(UnSSATransformer.java:552)\n\tat com.googlecode.dex2jar.ir.ts.UnSSATransformer$LiveA.onUseLocal(UnSSATransformer.java:1)\n\tat com.googlecode.dex2jar.ir.ts.an.BaseAnalyze.onUse(BaseAnalyze.java:166)\n\tat com.googlecode.dex2jar.ir.ts.an.BaseAnalyze.onUse(BaseAnalyze.java:1)\n\tat com.googlecode.dex2jar.ir.ts.Cfg.travel(Cfg.java:331)\n\tat com.googlecode.dex2jar.ir.ts.Cfg.travel(Cfg.java:387)\n\tat com.googlecode.dex2jar.ir.ts.an.BaseAnalyze.exec(BaseAnalyze.java:90)\n\t... 17 more\n");
  }
  
  protected Set getScopes()
  {
    return Collections.emptySet();
  }
  
  public final IInterface getService()
  {
    Object localObject = size;
    try
    {
      if (n != 5)
      {
        checkConnected();
        IInterface localIInterface = t;
        Log.append(localIInterface, "Client is connected but service is null");
        return localIInterface;
      }
      throw new DeadObjectException();
    }
    catch (Throwable localThrowable)
    {
      throw localThrowable;
    }
  }
  
  public IBinder getServiceBrokerBinder()
  {
    Object localObject1 = e;
    try
    {
      Object localObject2 = q;
      if (localObject2 == null) {
        return null;
      }
      localObject2 = ((IInterface)localObject2).asBinder();
      return localObject2;
    }
    catch (Throwable localThrowable)
    {
      throw localThrowable;
    }
  }
  
  protected abstract String getServiceDescriptor();
  
  public Intent getSignInIntent()
  {
    throw new UnsupportedOperationException("Not a sign in API");
  }
  
  protected abstract String getStartServiceAction();
  
  protected String getStartServicePackage()
  {
    return "com.google.android.gms";
  }
  
  public Task getTelemetryConfiguration()
  {
    Matrix localMatrix = r;
    if (localMatrix == null) {
      return null;
    }
    return d;
  }
  
  protected boolean getUseDynamicLookup()
  {
    return getMinApkVersion() >= 211700000;
  }
  
  public boolean hasConnectionInfo()
  {
    return r != null;
  }
  
  public boolean isConnected()
  {
    Object localObject = size;
    for (;;)
    {
      try
      {
        if (n == 4)
        {
          bool = true;
          return bool;
        }
      }
      catch (Throwable localThrowable)
      {
        throw localThrowable;
      }
      boolean bool = false;
    }
  }
  
  public boolean isConnecting()
  {
    Object localObject = size;
    for (;;)
    {
      try
      {
        int j = n;
        boolean bool2 = true;
        bool1 = bool2;
        if (j != 2)
        {
          if (j != 3) {
            break label46;
          }
          bool1 = bool2;
        }
        return bool1;
      }
      catch (Throwable localThrowable)
      {
        throw localThrowable;
      }
      label46:
      boolean bool1 = false;
    }
  }
  
  protected void onConnectedLocked(IInterface paramIInterface)
  {
    position = System.currentTimeMillis();
  }
  
  protected void onConnectionFailed(Item paramItem)
  {
    y = paramItem.a();
    state = System.currentTimeMillis();
  }
  
  protected void onConnectionSuspended(int paramInt)
  {
    endTime = paramInt;
    key = System.currentTimeMillis();
  }
  
  protected void onPostInitHandler(int paramInt1, IBinder paramIBinder, Bundle paramBundle, int paramInt2)
  {
    Handler localHandler = h;
    localHandler.sendMessage(localHandler.obtainMessage(1, paramInt2, -1, new XYPlotZoomPan(this, paramInt1, paramIBinder, paramBundle)));
  }
  
  public void onUserSignOut(Widget paramWidget)
  {
    paramWidget.a();
  }
  
  public boolean providesSignIn()
  {
    return false;
  }
  
  public boolean requiresAccount()
  {
    return false;
  }
  
  public boolean requiresGooglePlayServices()
  {
    return true;
  }
  
  public boolean requiresSignIn()
  {
    return false;
  }
  
  public void setAttributionTag(String paramString)
  {
    f = paramString;
  }
  
  public void triggerConnectionSuspended(int paramInt)
  {
    Handler localHandler = h;
    localHandler.sendMessage(localHandler.obtainMessage(6, s.get(), paramInt));
  }
  
  protected void triggerNotAvailable(Object paramObject, int paramInt, PendingIntent paramPendingIntent)
  {
    Log.append(paramObject, "Connection progress callbacks cannot be null.");
    m = paramObject;
    paramObject = h;
    paramObject.sendMessage(paramObject.obtainMessage(3, s.get(), paramInt, paramPendingIntent));
  }
  
  public boolean usesClientTelemetry()
  {
    return false;
  }
}
