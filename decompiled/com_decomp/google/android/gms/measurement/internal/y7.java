package com.google.android.gms.measurement.internal;

import android.app.job.JobParameters;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.internal.measurement.zzcl;
import h4.w;
import h4.x;
import h4.y;

public final class y7 {

    /* renamed from: a  reason: collision with root package name */
    private final Context f6673a;

    public y7(Context context) {
        s.k(context);
        this.f6673a = context;
    }

    private final j3 k() {
        return n4.H(this.f6673a, (zzcl) null, (Long) null).d();
    }

    public final int a(Intent intent, int i10, int i11) {
        n4 H = n4.H(this.f6673a, (zzcl) null, (Long) null);
        j3 d10 = H.d();
        if (intent == null) {
            d10.w().a("AppMeasurementService started with null intent");
            return 2;
        }
        String action = intent.getAction();
        H.f();
        d10.v().c("Local AppMeasurementService called. startId, action", Integer.valueOf(i11), action);
        if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
            h(new w(this, i11, d10, intent));
        }
        return 2;
    }

    public final IBinder b(Intent intent) {
        if (intent == null) {
            k().r().a("onBind called with null intent");
            return null;
        }
        String action = intent.getAction();
        if ("com.google.android.gms.measurement.START".equals(action)) {
            return new f5(w8.e0(this.f6673a), (String) null);
        }
        k().w().b("onBind received unknown action", action);
        return null;
    }

    public final /* synthetic */ void c(int i10, j3 j3Var, Intent intent) {
        if (((y) this.f6673a).b(i10)) {
            j3Var.v().b("Local AppMeasurementService processed last upload request. StartId", Integer.valueOf(i10));
            k().v().a("Completed wakeful intent.");
            ((y) this.f6673a).a(intent);
        }
    }

    public final /* synthetic */ void d(j3 j3Var, JobParameters jobParameters) {
        j3Var.v().a("AppMeasurementJobService processed last upload request.");
        ((y) this.f6673a).c(jobParameters, false);
    }

    public final void e() {
        n4 H = n4.H(this.f6673a, (zzcl) null, (Long) null);
        j3 d10 = H.d();
        H.f();
        d10.v().a("Local AppMeasurementService is starting up");
    }

    public final void f() {
        n4 H = n4.H(this.f6673a, (zzcl) null, (Long) null);
        j3 d10 = H.d();
        H.f();
        d10.v().a("Local AppMeasurementService is shutting down");
    }

    public final void g(Intent intent) {
        if (intent == null) {
            k().r().a("onRebind called with null intent");
            return;
        }
        k().v().b("onRebind called. action", intent.getAction());
    }

    public final void h(Runnable runnable) {
        w8 e02 = w8.e0(this.f6673a);
        e02.b().z(new x7(this, e02, runnable));
    }

    public final boolean i(JobParameters jobParameters) {
        n4 H = n4.H(this.f6673a, (zzcl) null, (Long) null);
        j3 d10 = H.d();
        String string = jobParameters.getExtras().getString("action");
        H.f();
        d10.v().b("Local AppMeasurementJobService called. action", string);
        if (!"com.google.android.gms.measurement.UPLOAD".equals(string)) {
            return true;
        }
        h(new x(this, d10, jobParameters));
        return true;
    }

    public final boolean j(Intent intent) {
        if (intent == null) {
            k().r().a("onUnbind called with null intent");
            return true;
        }
        k().v().b("onUnbind called for intent. action", intent.getAction());
        return true;
    }
}
