package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.collection.a;
import b4.b;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.internal.measurement.zzcb;
import com.google.android.gms.internal.measurement.zzcf;
import com.google.android.gms.internal.measurement.zzci;
import com.google.android.gms.internal.measurement.zzck;
import com.google.android.gms.internal.measurement.zzcl;
import com.google.android.gms.internal.measurement.zzob;
import h4.r;
import h4.v;
import java.util.Map;

@DynamiteApi
public class AppMeasurementDynamiteService extends zzcb {

    /* renamed from: a  reason: collision with root package name */
    n4 f5822a = null;

    /* renamed from: b  reason: collision with root package name */
    private final Map f5823b = new a();

    private final void c(zzcf zzcf, String str) {
        zzb();
        this.f5822a.N().I(zzcf, str);
    }

    private final void zzb() {
        if (this.f5822a == null) {
            throw new IllegalStateException("Attempting to perform action before initialize.");
        }
    }

    public void beginAdUnitExposure(String str, long j10) {
        zzb();
        this.f5822a.y().l(str, j10);
    }

    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        zzb();
        this.f5822a.I().e0(str, str2, bundle);
    }

    public void clearMeasurementEnabled(long j10) {
        zzb();
        this.f5822a.I().H((Boolean) null);
    }

    public void endAdUnitExposure(String str, long j10) {
        zzb();
        this.f5822a.y().m(str, j10);
    }

    public void generateEventId(zzcf zzcf) {
        zzb();
        long r02 = this.f5822a.N().r0();
        zzb();
        this.f5822a.N().H(zzcf, r02);
    }

    public void getAppInstanceId(zzcf zzcf) {
        zzb();
        this.f5822a.b().z(new o5(this, zzcf));
    }

    public void getCachedAppInstanceId(zzcf zzcf) {
        zzb();
        c(zzcf, this.f5822a.I().U());
    }

    public void getConditionalUserProperties(String str, String str2, zzcf zzcf) {
        zzb();
        this.f5822a.b().z(new e9(this, zzcf, str, str2));
    }

    public void getCurrentScreenClass(zzcf zzcf) {
        zzb();
        c(zzcf, this.f5822a.I().V());
    }

    public void getCurrentScreenName(zzcf zzcf) {
        zzb();
        c(zzcf, this.f5822a.I().W());
    }

    public void getGmpAppId(zzcf zzcf) {
        String str;
        zzb();
        i6 I = this.f5822a.I();
        if (I.f5994a.O() != null) {
            str = I.f5994a.O();
        } else {
            try {
                str = v.c(I.f5994a.c(), "google_app_id", I.f5994a.R());
            } catch (IllegalStateException e10) {
                I.f5994a.d().r().b("getGoogleAppId failed with exception", e10);
                str = null;
            }
        }
        c(zzcf, str);
    }

    public void getMaxUserProperties(String str, zzcf zzcf) {
        zzb();
        this.f5822a.I().P(str);
        zzb();
        this.f5822a.N().G(zzcf, 25);
    }

    public void getTestFlag(zzcf zzcf, int i10) {
        zzb();
        if (i10 == 0) {
            this.f5822a.N().I(zzcf, this.f5822a.I().X());
        } else if (i10 == 1) {
            this.f5822a.N().H(zzcf, this.f5822a.I().T().longValue());
        } else if (i10 == 2) {
            d9 N = this.f5822a.N();
            double doubleValue = this.f5822a.I().R().doubleValue();
            Bundle bundle = new Bundle();
            bundle.putDouble("r", doubleValue);
            try {
                zzcf.zzd(bundle);
            } catch (RemoteException e10) {
                N.f5994a.d().w().b("Error returning double value to wrapper", e10);
            }
        } else if (i10 == 3) {
            this.f5822a.N().G(zzcf, this.f5822a.I().S().intValue());
        } else if (i10 == 4) {
            this.f5822a.N().C(zzcf, this.f5822a.I().Q().booleanValue());
        }
    }

    public void getUserProperties(String str, String str2, boolean z10, zzcf zzcf) {
        zzb();
        this.f5822a.b().z(new l7(this, zzcf, str, str2, z10));
    }

    public void initForTests(Map map) {
        zzb();
    }

    public void initialize(b4.a aVar, zzcl zzcl, long j10) {
        n4 n4Var = this.f5822a;
        if (n4Var == null) {
            this.f5822a = n4.H((Context) s.k((Context) b.Y(aVar)), zzcl, Long.valueOf(j10));
        } else {
            n4Var.d().w().a("Attempting to initialize multiple times");
        }
    }

    public void isDataCollectionEnabled(zzcf zzcf) {
        zzb();
        this.f5822a.b().z(new f9(this, zzcf));
    }

    public void logEvent(String str, String str2, Bundle bundle, boolean z10, boolean z11, long j10) {
        zzb();
        this.f5822a.I().r(str, str2, bundle, z10, z11, j10);
    }

    public void logEventAndBundle(String str, String str2, Bundle bundle, zzcf zzcf, long j10) {
        Bundle bundle2;
        zzb();
        s.g(str2);
        if (bundle == null) {
            bundle2 = new Bundle();
        }
        bundle2.putString("_o", "app");
        this.f5822a.b().z(new m6(this, zzcf, new t(str2, new r(bundle), "app", j10), str));
    }

    public void logHealthData(int i10, String str, b4.a aVar, b4.a aVar2, b4.a aVar3) {
        zzb();
        Object obj = null;
        Object Y = aVar == null ? null : b.Y(aVar);
        Object Y2 = aVar2 == null ? null : b.Y(aVar2);
        if (aVar3 != null) {
            obj = b.Y(aVar3);
        }
        this.f5822a.d().F(i10, true, false, str, Y, Y2, obj);
    }

    public void onActivityCreated(b4.a aVar, Bundle bundle, long j10) {
        zzb();
        h6 h6Var = this.f5822a.I().f6041c;
        if (h6Var != null) {
            this.f5822a.I().o();
            h6Var.onActivityCreated((Activity) b.Y(aVar), bundle);
        }
    }

    public void onActivityDestroyed(b4.a aVar, long j10) {
        zzb();
        h6 h6Var = this.f5822a.I().f6041c;
        if (h6Var != null) {
            this.f5822a.I().o();
            h6Var.onActivityDestroyed((Activity) b.Y(aVar));
        }
    }

    public void onActivityPaused(b4.a aVar, long j10) {
        zzb();
        h6 h6Var = this.f5822a.I().f6041c;
        if (h6Var != null) {
            this.f5822a.I().o();
            h6Var.onActivityPaused((Activity) b.Y(aVar));
        }
    }

    public void onActivityResumed(b4.a aVar, long j10) {
        zzb();
        h6 h6Var = this.f5822a.I().f6041c;
        if (h6Var != null) {
            this.f5822a.I().o();
            h6Var.onActivityResumed((Activity) b.Y(aVar));
        }
    }

    public void onActivitySaveInstanceState(b4.a aVar, zzcf zzcf, long j10) {
        zzb();
        h6 h6Var = this.f5822a.I().f6041c;
        Bundle bundle = new Bundle();
        if (h6Var != null) {
            this.f5822a.I().o();
            h6Var.onActivitySaveInstanceState((Activity) b.Y(aVar), bundle);
        }
        try {
            zzcf.zzd(bundle);
        } catch (RemoteException e10) {
            this.f5822a.d().w().b("Error returning bundle value to wrapper", e10);
        }
    }

    public void onActivityStarted(b4.a aVar, long j10) {
        zzb();
        if (this.f5822a.I().f6041c != null) {
            this.f5822a.I().o();
            Activity activity = (Activity) b.Y(aVar);
        }
    }

    public void onActivityStopped(b4.a aVar, long j10) {
        zzb();
        if (this.f5822a.I().f6041c != null) {
            this.f5822a.I().o();
            Activity activity = (Activity) b.Y(aVar);
        }
    }

    public void performAction(Bundle bundle, zzcf zzcf, long j10) {
        zzb();
        zzcf.zzd((Bundle) null);
    }

    public void registerOnMeasurementEventListener(zzci zzci) {
        r rVar;
        zzb();
        synchronized (this.f5823b) {
            rVar = (r) this.f5823b.get(Integer.valueOf(zzci.zzd()));
            if (rVar == null) {
                rVar = new h9(this, zzci);
                this.f5823b.put(Integer.valueOf(zzci.zzd()), rVar);
            }
        }
        this.f5822a.I().w(rVar);
    }

    public void resetAnalyticsData(long j10) {
        zzb();
        this.f5822a.I().x(j10);
    }

    public void setConditionalUserProperty(Bundle bundle, long j10) {
        zzb();
        if (bundle == null) {
            this.f5822a.d().r().a("Conditional user property must not be null");
        } else {
            this.f5822a.I().D(bundle, j10);
        }
    }

    public void setConsent(Bundle bundle, long j10) {
        zzb();
        i6 I = this.f5822a.I();
        zzob.zzc();
        if (!I.f5994a.z().B((String) null, y2.f6657w0) || TextUtils.isEmpty(I.f5994a.B().u())) {
            I.E(bundle, 0, j10);
        } else {
            I.f5994a.d().x().a("Using developer consent only; google app id found");
        }
    }

    public void setConsentThirdParty(Bundle bundle, long j10) {
        zzb();
        this.f5822a.I().E(bundle, -20, j10);
    }

    public void setCurrentScreen(b4.a aVar, String str, String str2, long j10) {
        zzb();
        this.f5822a.K().E((Activity) b.Y(aVar), str, str2);
    }

    public void setDataCollectionEnabled(boolean z10) {
        zzb();
        i6 I = this.f5822a.I();
        I.i();
        I.f5994a.b().z(new l5(I, z10));
    }

    public void setDefaultEventParameters(Bundle bundle) {
        zzb();
        i6 I = this.f5822a.I();
        I.f5994a.b().z(new h4.s(I, bundle == null ? null : new Bundle(bundle)));
    }

    public void setEventInterceptor(zzci zzci) {
        zzb();
        g9 g9Var = new g9(this, zzci);
        if (this.f5822a.b().C()) {
            this.f5822a.I().G(g9Var);
        } else {
            this.f5822a.b().z(new j8(this, g9Var));
        }
    }

    public void setInstanceIdProvider(zzck zzck) {
        zzb();
    }

    public void setMeasurementEnabled(boolean z10, long j10) {
        zzb();
        this.f5822a.I().H(Boolean.valueOf(z10));
    }

    public void setMinimumSessionDuration(long j10) {
        zzb();
    }

    public void setSessionTimeoutDuration(long j10) {
        zzb();
        i6 I = this.f5822a.I();
        I.f5994a.b().z(new n5(I, j10));
    }

    public void setUserId(String str, long j10) {
        zzb();
        if (!this.f5822a.z().B((String) null, y2.f6653u0) || str == null || str.length() != 0) {
            this.f5822a.I().K((String) null, "_id", str, true, j10);
        } else {
            this.f5822a.d().w().a("User ID must be non-empty");
        }
    }

    public void setUserProperty(String str, String str2, b4.a aVar, boolean z10, long j10) {
        zzb();
        this.f5822a.I().K(str, str2, b.Y(aVar), z10, j10);
    }

    public void unregisterOnMeasurementEventListener(zzci zzci) {
        r rVar;
        zzb();
        synchronized (this.f5823b) {
            rVar = (r) this.f5823b.remove(Integer.valueOf(zzci.zzd()));
        }
        if (rVar == null) {
            rVar = new h9(this, zzci);
        }
        this.f5822a.I().M(rVar);
    }
}
