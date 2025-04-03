package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.api.Scope;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import q3.k;

public abstract class c {
    public static final int CONNECT_STATE_CONNECTED = 4;
    public static final int CONNECT_STATE_DISCONNECTED = 1;
    public static final int CONNECT_STATE_DISCONNECTING = 5;
    public static final String DEFAULT_ACCOUNT = "<<default account>>";
    public static final String[] GOOGLE_PLUS_REQUIRED_FEATURES = {"service_esmobile", "service_googleme"};
    public static final String KEY_PENDING_INTENT = "pendingIntent";
    private static final q3.d[] zze = new q3.d[0];
    private volatile String zzA;
    /* access modifiers changed from: private */
    public q3.b zzB;
    /* access modifiers changed from: private */
    public boolean zzC;
    private volatile u1 zzD;
    f2 zza;
    final Handler zzb;
    protected C0088c zzc;
    protected AtomicInteger zzd;
    private int zzf;
    private long zzg;
    private long zzh;
    private int zzi;
    private long zzj;
    private volatile String zzk;
    private final Context zzl;
    private final Looper zzm;
    private final i zzn;
    private final k zzo;
    private final Object zzp;
    /* access modifiers changed from: private */
    public final Object zzq;
    /* access modifiers changed from: private */
    public n zzr;
    private IInterface zzs;
    /* access modifiers changed from: private */
    public final ArrayList zzt;
    private r1 zzu;
    private int zzv;
    /* access modifiers changed from: private */
    public final a zzw;
    /* access modifiers changed from: private */
    public final b zzx;
    private final int zzy;
    private final String zzz;

    public interface a {
        void onConnected(Bundle bundle);

        void onConnectionSuspended(int i10);
    }

    public interface b {
        void onConnectionFailed(q3.b bVar);
    }

    /* renamed from: com.google.android.gms.common.internal.c$c  reason: collision with other inner class name */
    public interface C0088c {
        void b(q3.b bVar);
    }

    protected class d implements C0088c {
        public d() {
        }

        public final void b(q3.b bVar) {
            if (bVar.j0()) {
                c cVar = c.this;
                cVar.getRemoteService((k) null, cVar.getScopes());
            } else if (c.this.zzx != null) {
                c.this.zzx.onConnectionFailed(bVar);
            }
        }
    }

    public interface e {
        void a();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected c(android.content.Context r10, android.os.Looper r11, int r12, com.google.android.gms.common.internal.c.a r13, com.google.android.gms.common.internal.c.b r14, java.lang.String r15) {
        /*
            r9 = this;
            com.google.android.gms.common.internal.i r3 = com.google.android.gms.common.internal.i.a(r10)
            q3.k r4 = q3.k.h()
            com.google.android.gms.common.internal.s.k(r13)
            com.google.android.gms.common.internal.s.k(r14)
            r0 = r9
            r1 = r10
            r2 = r11
            r5 = r12
            r6 = r13
            r7 = r14
            r8 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.c.<init>(android.content.Context, android.os.Looper, int, com.google.android.gms.common.internal.c$a, com.google.android.gms.common.internal.c$b, java.lang.String):void");
    }

    /* access modifiers changed from: private */
    public final void e(int i10, IInterface iInterface) {
        f2 f2Var;
        boolean z10 = false;
        if ((i10 == 4) == (iInterface != null)) {
            z10 = true;
        }
        s.a(z10);
        synchronized (this.zzp) {
            this.zzv = i10;
            this.zzs = iInterface;
            if (i10 == 1) {
                r1 r1Var = this.zzu;
                if (r1Var != null) {
                    i iVar = this.zzn;
                    String b10 = this.zza.b();
                    s.k(b10);
                    iVar.d(b10, this.zza.a(), 4225, r1Var, zze(), this.zza.c());
                    this.zzu = null;
                }
            } else if (i10 == 2 || i10 == 3) {
                r1 r1Var2 = this.zzu;
                if (!(r1Var2 == null || (f2Var = this.zza) == null)) {
                    String b11 = f2Var.b();
                    String a10 = f2Var.a();
                    Log.e("GmsClient", "Calling connect() while still connected, missing disconnect() for " + b11 + " on " + a10);
                    i iVar2 = this.zzn;
                    String b12 = this.zza.b();
                    s.k(b12);
                    iVar2.d(b12, this.zza.a(), 4225, r1Var2, zze(), this.zza.c());
                    this.zzd.incrementAndGet();
                }
                r1 r1Var3 = new r1(this, this.zzd.get());
                this.zzu = r1Var3;
                f2 f2Var2 = (this.zzv != 3 || getLocalStartServiceAction() == null) ? new f2(getStartServicePackage(), getStartServiceAction(), false, 4225, getUseDynamicLookup()) : new f2(getContext().getPackageName(), getLocalStartServiceAction(), true, 4225, false);
                this.zza = f2Var2;
                if (f2Var2.c()) {
                    if (getMinApkVersion() < 17895000) {
                        throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf(this.zza.b())));
                    }
                }
                i iVar3 = this.zzn;
                String b13 = this.zza.b();
                s.k(b13);
                if (!iVar3.e(new y1(b13, this.zza.a(), 4225, this.zza.c()), r1Var3, zze(), getBindServiceExecutor())) {
                    String b14 = this.zza.b();
                    String a11 = this.zza.a();
                    Log.w("GmsClient", "unable to connect to service: " + b14 + " on " + a11);
                    zzl(16, (Bundle) null, this.zzd.get());
                }
            } else if (i10 == 4) {
                s.k(iInterface);
                onConnectedLocked(iInterface);
            }
        }
    }

    static /* bridge */ /* synthetic */ void zzj(c cVar, u1 u1Var) {
        cVar.zzD = u1Var;
        if (cVar.usesClientTelemetry()) {
            e eVar = u1Var.f5717h;
            t.b().c(eVar == null ? null : eVar.l0());
        }
    }

    static /* bridge */ /* synthetic */ void zzk(c cVar, int i10) {
        int i11;
        int i12;
        synchronized (cVar.zzp) {
            i11 = cVar.zzv;
        }
        if (i11 == 3) {
            cVar.zzC = true;
            i12 = 5;
        } else {
            i12 = 4;
        }
        Handler handler = cVar.zzb;
        handler.sendMessage(handler.obtainMessage(i12, cVar.zzd.get(), 16));
    }

    static /* bridge */ /* synthetic */ boolean zzn(c cVar, int i10, int i11, IInterface iInterface) {
        synchronized (cVar.zzp) {
            if (cVar.zzv != i10) {
                return false;
            }
            cVar.e(i11, iInterface);
            return true;
        }
    }

    static /* bridge */ /* synthetic */ boolean zzo(c cVar) {
        if (cVar.zzC || TextUtils.isEmpty(cVar.getServiceDescriptor()) || TextUtils.isEmpty(cVar.getLocalStartServiceAction())) {
            return false;
        }
        try {
            Class.forName(cVar.getServiceDescriptor());
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public void checkAvailabilityAndConnect() {
        int j10 = this.zzo.j(this.zzl, getMinApkVersion());
        if (j10 != 0) {
            e(1, (IInterface) null);
            triggerNotAvailable(new d(), j10, (PendingIntent) null);
            return;
        }
        connect(new d());
    }

    /* access modifiers changed from: protected */
    public final void checkConnected() {
        if (!isConnected()) {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }

    public void connect(C0088c cVar) {
        s.l(cVar, "Connection progress callbacks cannot be null.");
        this.zzc = cVar;
        e(2, (IInterface) null);
    }

    /* access modifiers changed from: protected */
    public abstract IInterface createServiceInterface(IBinder iBinder);

    public void disconnect() {
        this.zzd.incrementAndGet();
        synchronized (this.zzt) {
            int size = this.zzt.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((p1) this.zzt.get(i10)).d();
            }
            this.zzt.clear();
        }
        synchronized (this.zzq) {
            this.zzr = null;
        }
        e(1, (IInterface) null);
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int i10;
        IInterface iInterface;
        n nVar;
        synchronized (this.zzp) {
            i10 = this.zzv;
            iInterface = this.zzs;
        }
        synchronized (this.zzq) {
            nVar = this.zzr;
        }
        printWriter.append(str).append("mConnectState=");
        printWriter.print(i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? i10 != 5 ? "UNKNOWN" : "DISCONNECTING" : "CONNECTED" : "LOCAL_CONNECTING" : "REMOTE_CONNECTING" : "DISCONNECTED");
        printWriter.append(" mService=");
        if (iInterface == null) {
            printWriter.append("null");
        } else {
            printWriter.append(getServiceDescriptor()).append("@").append(Integer.toHexString(System.identityHashCode(iInterface.asBinder())));
        }
        printWriter.append(" mServiceBroker=");
        if (nVar == null) {
            printWriter.println("null");
        } else {
            printWriter.append("IGmsServiceBroker@").println(Integer.toHexString(System.identityHashCode(nVar.asBinder())));
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US);
        if (this.zzh > 0) {
            PrintWriter append = printWriter.append(str).append("lastConnectedTime=");
            long j10 = this.zzh;
            String format = simpleDateFormat.format(new Date(j10));
            append.println(j10 + " " + format);
        }
        if (this.zzg > 0) {
            printWriter.append(str).append("lastSuspendedCause=");
            int i11 = this.zzf;
            printWriter.append(i11 != 1 ? i11 != 2 ? i11 != 3 ? String.valueOf(i11) : "CAUSE_DEAD_OBJECT_EXCEPTION" : "CAUSE_NETWORK_LOST" : "CAUSE_SERVICE_DISCONNECTED");
            PrintWriter append2 = printWriter.append(" lastSuspendedTime=");
            long j11 = this.zzg;
            String format2 = simpleDateFormat.format(new Date(j11));
            append2.println(j11 + " " + format2);
        }
        if (this.zzj > 0) {
            printWriter.append(str).append("lastFailedStatus=").append(com.google.android.gms.common.api.c.a(this.zzi));
            PrintWriter append3 = printWriter.append(" lastFailedTime=");
            long j12 = this.zzj;
            String format3 = simpleDateFormat.format(new Date(j12));
            append3.println(j12 + " " + format3);
        }
    }

    /* access modifiers changed from: protected */
    public boolean enableLocalFallback() {
        return false;
    }

    public Account getAccount() {
        return null;
    }

    public q3.d[] getApiFeatures() {
        return zze;
    }

    public final q3.d[] getAvailableFeatures() {
        u1 u1Var = this.zzD;
        if (u1Var == null) {
            return null;
        }
        return u1Var.f5715f;
    }

    /* access modifiers changed from: protected */
    public Executor getBindServiceExecutor() {
        return null;
    }

    public Bundle getConnectionHint() {
        return null;
    }

    public final Context getContext() {
        return this.zzl;
    }

    public String getEndpointPackageName() {
        f2 f2Var;
        if (isConnected() && (f2Var = this.zza) != null) {
            return f2Var.a();
        }
        throw new RuntimeException("Failed to connect when checking package");
    }

    public int getGCoreServiceId() {
        return this.zzy;
    }

    /* access modifiers changed from: protected */
    public Bundle getGetServiceRequestExtraArgs() {
        return new Bundle();
    }

    public String getLastDisconnectMessage() {
        return this.zzk;
    }

    /* access modifiers changed from: protected */
    public String getLocalStartServiceAction() {
        return null;
    }

    public final Looper getLooper() {
        return this.zzm;
    }

    public abstract int getMinApkVersion();

    public void getRemoteService(k kVar, Set<Scope> set) {
        Set<Scope> set2 = set;
        Bundle getServiceRequestExtraArgs = getGetServiceRequestExtraArgs();
        int i10 = this.zzy;
        String str = this.zzA;
        int i11 = k.f14679a;
        Scope[] scopeArr = g.f5628s;
        Bundle bundle = new Bundle();
        q3.d[] dVarArr = g.f5629t;
        g gVar = r3;
        g gVar2 = new g(6, i10, i11, (String) null, (IBinder) null, scopeArr, bundle, (Account) null, dVarArr, dVarArr, true, 0, false, str);
        g gVar3 = gVar;
        gVar3.f5633h = this.zzl.getPackageName();
        gVar3.f5636k = getServiceRequestExtraArgs;
        if (set2 != null) {
            gVar3.f5635j = (Scope[]) set2.toArray(new Scope[0]);
        }
        if (requiresSignIn()) {
            Account account = getAccount();
            if (account == null) {
                account = new Account(DEFAULT_ACCOUNT, "com.google");
            }
            gVar3.f5637l = account;
            if (kVar != null) {
                gVar3.f5634i = kVar.asBinder();
            }
        } else if (requiresAccount()) {
            gVar3.f5637l = getAccount();
        }
        gVar3.f5638m = zze;
        gVar3.f5639n = getApiFeatures();
        if (usesClientTelemetry()) {
            gVar3.f5642q = true;
        }
        try {
            synchronized (this.zzq) {
                n nVar = this.zzr;
                if (nVar != null) {
                    nVar.q(new q1(this, this.zzd.get()), gVar3);
                } else {
                    Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                }
            }
        } catch (DeadObjectException e10) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e10);
            triggerConnectionSuspended(3);
        } catch (SecurityException e11) {
            throw e11;
        } catch (RemoteException | RuntimeException e12) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e12);
            onPostInitHandler(8, (IBinder) null, (Bundle) null, this.zzd.get());
        }
    }

    /* access modifiers changed from: protected */
    public Set getScopes() {
        return Collections.emptySet();
    }

    public final IInterface getService() {
        IInterface iInterface;
        synchronized (this.zzp) {
            if (this.zzv != 5) {
                checkConnected();
                iInterface = this.zzs;
                s.l(iInterface, "Client is connected but service is null");
            } else {
                throw new DeadObjectException();
            }
        }
        return iInterface;
    }

    public IBinder getServiceBrokerBinder() {
        synchronized (this.zzq) {
            n nVar = this.zzr;
            if (nVar == null) {
                return null;
            }
            IBinder asBinder = nVar.asBinder();
            return asBinder;
        }
    }

    /* access modifiers changed from: protected */
    public abstract String getServiceDescriptor();

    public Intent getSignInIntent() {
        throw new UnsupportedOperationException("Not a sign in API");
    }

    /* access modifiers changed from: protected */
    public abstract String getStartServiceAction();

    /* access modifiers changed from: protected */
    public String getStartServicePackage() {
        return "com.google.android.gms";
    }

    public e getTelemetryConfiguration() {
        u1 u1Var = this.zzD;
        if (u1Var == null) {
            return null;
        }
        return u1Var.f5717h;
    }

    /* access modifiers changed from: protected */
    public boolean getUseDynamicLookup() {
        return getMinApkVersion() >= 211700000;
    }

    public boolean hasConnectionInfo() {
        return this.zzD != null;
    }

    public boolean isConnected() {
        boolean z10;
        synchronized (this.zzp) {
            z10 = this.zzv == 4;
        }
        return z10;
    }

    public boolean isConnecting() {
        boolean z10;
        synchronized (this.zzp) {
            int i10 = this.zzv;
            z10 = true;
            if (i10 != 2) {
                if (i10 != 3) {
                    z10 = false;
                }
            }
        }
        return z10;
    }

    /* access modifiers changed from: protected */
    public void onConnectedLocked(IInterface iInterface) {
        this.zzh = System.currentTimeMillis();
    }

    /* access modifiers changed from: protected */
    public void onConnectionFailed(q3.b bVar) {
        this.zzi = bVar.U();
        this.zzj = System.currentTimeMillis();
    }

    /* access modifiers changed from: protected */
    public void onConnectionSuspended(int i10) {
        this.zzf = i10;
        this.zzg = System.currentTimeMillis();
    }

    /* access modifiers changed from: protected */
    public void onPostInitHandler(int i10, IBinder iBinder, Bundle bundle, int i11) {
        Handler handler = this.zzb;
        handler.sendMessage(handler.obtainMessage(1, i11, -1, new s1(this, i10, iBinder, bundle)));
    }

    public void onUserSignOut(e eVar) {
        eVar.a();
    }

    public boolean providesSignIn() {
        return false;
    }

    public boolean requiresAccount() {
        return false;
    }

    public boolean requiresGooglePlayServices() {
        return true;
    }

    public boolean requiresSignIn() {
        return false;
    }

    public void setAttributionTag(String str) {
        this.zzA = str;
    }

    public void triggerConnectionSuspended(int i10) {
        Handler handler = this.zzb;
        handler.sendMessage(handler.obtainMessage(6, this.zzd.get(), i10));
    }

    /* access modifiers changed from: protected */
    public void triggerNotAvailable(C0088c cVar, int i10, PendingIntent pendingIntent) {
        s.l(cVar, "Connection progress callbacks cannot be null.");
        this.zzc = cVar;
        Handler handler = this.zzb;
        handler.sendMessage(handler.obtainMessage(3, this.zzd.get(), i10, pendingIntent));
    }

    public boolean usesClientTelemetry() {
        return false;
    }

    /* access modifiers changed from: protected */
    public final String zze() {
        String str = this.zzz;
        return str == null ? this.zzl.getClass().getName() : str;
    }

    /* access modifiers changed from: protected */
    public final void zzl(int i10, Bundle bundle, int i11) {
        Handler handler = this.zzb;
        handler.sendMessage(handler.obtainMessage(7, i11, -1, new t1(this, i10, (Bundle) null)));
    }

    protected c(Context context, Looper looper, i iVar, k kVar, int i10, a aVar, b bVar, String str) {
        this.zzk = null;
        this.zzp = new Object();
        this.zzq = new Object();
        this.zzt = new ArrayList();
        this.zzv = 1;
        this.zzB = null;
        this.zzC = false;
        this.zzD = null;
        this.zzd = new AtomicInteger(0);
        s.l(context, "Context must not be null");
        this.zzl = context;
        s.l(looper, "Looper must not be null");
        this.zzm = looper;
        s.l(iVar, "Supervisor must not be null");
        this.zzn = iVar;
        s.l(kVar, "API availability must not be null");
        this.zzo = kVar;
        this.zzb = new o1(this, looper);
        this.zzy = i10;
        this.zzw = aVar;
        this.zzx = bVar;
        this.zzz = str;
    }

    public void disconnect(String str) {
        this.zzk = str;
        disconnect();
    }
}
