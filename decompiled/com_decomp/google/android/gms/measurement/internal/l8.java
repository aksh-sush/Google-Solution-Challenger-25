package com.google.android.gms.measurement.internal;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.PersistableBundle;
import com.google.android.gms.internal.measurement.zzbs;
import com.google.android.gms.internal.measurement.zzbt;

public final class l8 extends n8 {

    /* renamed from: d  reason: collision with root package name */
    private final AlarmManager f6178d = ((AlarmManager) this.f5994a.c().getSystemService("alarm"));

    /* renamed from: e  reason: collision with root package name */
    private m f6179e;

    /* renamed from: f  reason: collision with root package name */
    private Integer f6180f;

    protected l8(w8 w8Var) {
        super(w8Var);
    }

    private final int o() {
        if (this.f6180f == null) {
            String valueOf = String.valueOf(this.f5994a.c().getPackageName());
            this.f6180f = Integer.valueOf((valueOf.length() != 0 ? "measurement".concat(valueOf) : new String("measurement")).hashCode());
        }
        return this.f6180f.intValue();
    }

    private final PendingIntent p() {
        Context c10 = this.f5994a.c();
        return zzbs.zza(c10, 0, new Intent().setClassName(c10, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), zzbs.zza);
    }

    private final m q() {
        if (this.f6179e == null) {
            this.f6179e = new k8(this, this.f6214b.b0());
        }
        return this.f6179e;
    }

    private final void r() {
        JobScheduler jobScheduler = (JobScheduler) this.f5994a.c().getSystemService("jobscheduler");
        if (jobScheduler != null) {
            jobScheduler.cancel(o());
        }
    }

    /* access modifiers changed from: protected */
    public final boolean l() {
        AlarmManager alarmManager = this.f6178d;
        if (alarmManager != null) {
            alarmManager.cancel(p());
        }
        if (Build.VERSION.SDK_INT < 24) {
            return false;
        }
        r();
        return false;
    }

    public final void m() {
        i();
        this.f5994a.d().v().a("Unscheduling upload");
        AlarmManager alarmManager = this.f6178d;
        if (alarmManager != null) {
            alarmManager.cancel(p());
        }
        q().b();
        if (Build.VERSION.SDK_INT >= 24) {
            r();
        }
    }

    public final void n(long j10) {
        i();
        this.f5994a.f();
        Context c10 = this.f5994a.c();
        if (!d9.X(c10)) {
            this.f5994a.d().q().a("Receiver not registered/enabled");
        }
        if (!d9.Y(c10, false)) {
            this.f5994a.d().q().a("Service not registered/enabled");
        }
        m();
        this.f5994a.d().v().b("Scheduling upload, millis", Long.valueOf(j10));
        long a10 = this.f5994a.e().a() + j10;
        this.f5994a.z();
        if (j10 < Math.max(0, ((Long) y2.f6660y.a((Object) null)).longValue()) && !q().e()) {
            q().d(j10);
        }
        this.f5994a.f();
        if (Build.VERSION.SDK_INT >= 24) {
            Context c11 = this.f5994a.c();
            ComponentName componentName = new ComponentName(c11, "com.google.android.gms.measurement.AppMeasurementJobService");
            int o10 = o();
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putString("action", "com.google.android.gms.measurement.UPLOAD");
            zzbt.zza(c11, new JobInfo.Builder(o10, componentName).setMinimumLatency(j10).setOverrideDeadline(j10 + j10).setExtras(persistableBundle).build(), "com.google.android.gms", "UploadAlarm");
            return;
        }
        AlarmManager alarmManager = this.f6178d;
        if (alarmManager != null) {
            this.f5994a.z();
            alarmManager.setInexactRepeating(2, a10, Math.max(((Long) y2.f6650t.a((Object) null)).longValue(), j10), p());
        }
    }
}
