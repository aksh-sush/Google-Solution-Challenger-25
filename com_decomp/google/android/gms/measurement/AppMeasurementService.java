package com.google.android.gms.measurement;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.gms.measurement.internal.y7;
import h4.y;
import l0.a;

public final class AppMeasurementService extends Service implements y {

    /* renamed from: e  reason: collision with root package name */
    private y7 f5818e;

    private final y7 d() {
        if (this.f5818e == null) {
            this.f5818e = new y7(this);
        }
        return this.f5818e;
    }

    public final void a(Intent intent) {
        a.b(intent);
    }

    public final boolean b(int i10) {
        return stopSelfResult(i10);
    }

    public final void c(JobParameters jobParameters, boolean z10) {
        throw new UnsupportedOperationException();
    }

    public IBinder onBind(Intent intent) {
        return d().b(intent);
    }

    public void onCreate() {
        super.onCreate();
        d().e();
    }

    public void onDestroy() {
        d().f();
        super.onDestroy();
    }

    public void onRebind(Intent intent) {
        d().g(intent);
    }

    public int onStartCommand(Intent intent, int i10, int i11) {
        d().a(intent, i10, i11);
        return 2;
    }

    public boolean onUnbind(Intent intent) {
        d().j(intent);
        return true;
    }
}
