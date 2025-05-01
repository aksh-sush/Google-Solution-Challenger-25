package com.google.android.gms.measurement;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import com.google.android.gms.measurement.internal.y7;
import h4.y;

public final class AppMeasurementJobService extends JobService implements y {

    /* renamed from: e  reason: collision with root package name */
    private y7 f5816e;

    private final y7 d() {
        if (this.f5816e == null) {
            this.f5816e = new y7(this);
        }
        return this.f5816e;
    }

    public final void a(Intent intent) {
    }

    public final boolean b(int i10) {
        throw new UnsupportedOperationException();
    }

    public final void c(JobParameters jobParameters, boolean z10) {
        jobFinished(jobParameters, false);
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

    public boolean onStartJob(JobParameters jobParameters) {
        d().i(jobParameters);
        return true;
    }

    public boolean onStopJob(JobParameters jobParameters) {
        return false;
    }

    public boolean onUnbind(Intent intent) {
        d().j(intent);
        return true;
    }
}
