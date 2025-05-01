package com.onesignal.core.services;

import android.app.job.JobParameters;
import android.app.job.JobService;
import db.t;
import g7.b;
import kotlin.coroutines.jvm.internal.l;
import sa.o;
import va.d;

public final class SyncJobService extends JobService {

    static final class a extends l implements cb.l {
        final /* synthetic */ t $backgroundService;
        final /* synthetic */ JobParameters $jobParameters;
        int label;
        final /* synthetic */ SyncJobService this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(t tVar, SyncJobService syncJobService, JobParameters jobParameters, d dVar) {
            super(1, dVar);
            this.$backgroundService = tVar;
            this.this$0 = syncJobService;
            this.$jobParameters = jobParameters;
        }

        public final d create(d dVar) {
            return new a(this.$backgroundService, this.this$0, this.$jobParameters, dVar);
        }

        public final Object invokeSuspend(Object obj) {
            Object c10 = d.c();
            int i10 = this.label;
            if (i10 == 0) {
                o.b(obj);
                this.label = 1;
                if (((n7.a) this.$backgroundService.f9426e).runBackgroundServices(this) == c10) {
                    return c10;
                }
            } else if (i10 == 1) {
                o.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.onesignal.debug.internal.logging.a.debug$default("LollipopSyncRunnable:JobFinished needsJobReschedule: " + ((n7.a) this.$backgroundService.f9426e).getNeedsJobReschedule(), (Throwable) null, 2, (Object) null);
            boolean needsJobReschedule = ((n7.a) this.$backgroundService.f9426e).getNeedsJobReschedule();
            ((n7.a) this.$backgroundService.f9426e).setNeedsJobReschedule(false);
            this.this$0.jobFinished(this.$jobParameters, needsJobReschedule);
            return sa.t.f15300a;
        }

        public final Object invoke(d dVar) {
            return ((a) create(dVar)).invokeSuspend(sa.t.f15300a);
        }
    }

    public boolean onStartJob(JobParameters jobParameters) {
        db.l.e(jobParameters, "jobParameters");
        if (!b.f(this)) {
            return false;
        }
        t tVar = new t();
        tVar.f9426e = b.f10823a.c().getService(n7.a.class);
        com.onesignal.common.threading.a.suspendifyOnThread$default(0, new a(tVar, this, jobParameters, (d) null), 1, (Object) null);
        return true;
    }

    public boolean onStopJob(JobParameters jobParameters) {
        db.l.e(jobParameters, "jobParameters");
        boolean cancelRunBackgroundServices = ((n7.a) b.f10823a.c().getService(n7.a.class)).cancelRunBackgroundServices();
        com.onesignal.debug.internal.logging.a.debug$default("SyncJobService onStopJob called, system conditions not available reschedule: " + cancelRunBackgroundServices, (Throwable) null, 2, (Object) null);
        return cancelRunBackgroundServices;
    }
}
