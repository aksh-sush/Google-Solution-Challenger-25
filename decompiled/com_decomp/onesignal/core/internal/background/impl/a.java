package com.onesignal.core.internal.background.impl;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import cb.p;
import com.onesignal.core.services.SyncJobService;
import com.onesignal.core.services.SyncService;
import db.g;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.jvm.internal.l;
import l7.e;
import l7.f;
import mb.h0;
import mb.i0;
import mb.j0;
import mb.o1;
import mb.w0;
import sa.o;
import sa.t;
import va.d;

public final class a implements e, n7.a, z7.b {
    public static final C0125a Companion = new C0125a((g) null);
    private static final int SYNC_TASK_ID = 2071862118;
    private final f _applicationService;
    /* access modifiers changed from: private */
    public final List<n7.b> _backgroundServices;
    private final a8.a _time;
    /* access modifiers changed from: private */
    public o1 backgroundSyncJob;
    /* access modifiers changed from: private */
    public final Object lock = new Object();
    private boolean needsJobReschedule;
    /* access modifiers changed from: private */
    public long nextScheduledSyncTimeMs;
    private final Class<?> syncServiceJobClass = SyncJobService.class;
    private final Class<?> syncServicePendingIntentClass = SyncService.class;

    /* renamed from: com.onesignal.core.internal.background.impl.a$a  reason: collision with other inner class name */
    public static final class C0125a {
        private C0125a() {
        }

        public /* synthetic */ C0125a(g gVar) {
            this();
        }
    }

    static final class b extends l implements p {
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ a this$0;

        /* renamed from: com.onesignal.core.internal.background.impl.a$b$a  reason: collision with other inner class name */
        static final class C0126a extends l implements p {
            Object L$0;
            int label;
            final /* synthetic */ a this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0126a(a aVar, d dVar) {
                super(2, dVar);
                this.this$0 = aVar;
            }

            public final d create(Object obj, d dVar) {
                return new C0126a(this.this$0, dVar);
            }

            public final Object invokeSuspend(Object obj) {
                Iterator it;
                Object c10 = d.c();
                int i10 = this.label;
                if (i10 == 0) {
                    o.b(obj);
                    Object access$getLock$p = this.this$0.lock;
                    a aVar = this.this$0;
                    synchronized (access$getLock$p) {
                        aVar.nextScheduledSyncTimeMs = 0;
                        t tVar = t.f15300a;
                    }
                    it = this.this$0._backgroundServices.iterator();
                } else if (i10 == 1) {
                    it = (Iterator) this.L$0;
                    o.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                while (it.hasNext()) {
                    this.L$0 = it;
                    this.label = 1;
                    if (((n7.b) it.next()).backgroundRun(this) == c10) {
                        return c10;
                    }
                }
                this.this$0.scheduleBackground();
                return t.f15300a;
            }

            public final Object invoke(h0 h0Var, d dVar) {
                return ((C0126a) create(h0Var, dVar)).invokeSuspend(t.f15300a);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(a aVar, d dVar) {
            super(2, dVar);
            this.this$0 = aVar;
        }

        public final d create(Object obj, d dVar) {
            b bVar = new b(this.this$0, dVar);
            bVar.L$0 = obj;
            return bVar;
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = d.c();
            if (this.label == 0) {
                o.b(obj);
                com.onesignal.debug.internal.logging.a.debug$default("OSBackground sync, calling initWithContext", (Throwable) null, 2, (Object) null);
                this.this$0.backgroundSyncJob = j.d((h0) this.L$0, w0.d(), (j0) null, new C0126a(this.this$0, (d) null), 2, (Object) null);
                return t.f15300a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        public final Object invoke(h0 h0Var, d dVar) {
            return ((b) create(h0Var, dVar)).invokeSuspend(t.f15300a);
        }
    }

    public a(f fVar, a8.a aVar, List<? extends n7.b> list) {
        db.l.e(fVar, "_applicationService");
        db.l.e(aVar, "_time");
        db.l.e(list, "_backgroundServices");
        this._applicationService = fVar;
        this._time = aVar;
        this._backgroundServices = list;
    }

    private final void cancelBackgroundSyncTask() {
        com.onesignal.debug.internal.logging.a.debug$default(a.class.getSimpleName() + " cancel background sync", (Throwable) null, 2, (Object) null);
        synchronized (this.lock) {
            if (useJob()) {
                Object systemService = this._applicationService.getAppContext().getSystemService("jobscheduler");
                db.l.c(systemService, "null cannot be cast to non-null type android.app.job.JobScheduler");
                ((JobScheduler) systemService).cancel(SYNC_TASK_ID);
            } else {
                Object systemService2 = this._applicationService.getAppContext().getSystemService("alarm");
                db.l.c(systemService2, "null cannot be cast to non-null type android.app.AlarmManager");
                ((AlarmManager) systemService2).cancel(syncServicePendingIntent());
            }
            t tVar = t.f15300a;
        }
    }

    private final void cancelSyncTask() {
        synchronized (this.lock) {
            this.nextScheduledSyncTimeMs = 0;
            cancelBackgroundSyncTask();
            t tVar = t.f15300a;
        }
    }

    private final boolean hasBootPermission() {
        return com.onesignal.common.e.INSTANCE.checkSelfPermission(this._applicationService.getAppContext(), "android.permission.RECEIVE_BOOT_COMPLETED") == 0;
    }

    private final boolean isJobIdRunning() {
        o1 o1Var;
        Object systemService = this._applicationService.getAppContext().getSystemService("jobscheduler");
        db.l.c(systemService, "null cannot be cast to non-null type android.app.job.JobScheduler");
        for (JobInfo id : ((JobScheduler) systemService).getAllPendingJobs()) {
            if (id.getId() == SYNC_TASK_ID && (o1Var = this.backgroundSyncJob) != null) {
                db.l.b(o1Var);
                if (o1Var.c()) {
                    return true;
                }
            }
        }
        return false;
    }

    /* access modifiers changed from: private */
    public final void scheduleBackground() {
        Long l10 = null;
        for (n7.b scheduleBackgroundRunIn : this._backgroundServices) {
            Long scheduleBackgroundRunIn2 = scheduleBackgroundRunIn.getScheduleBackgroundRunIn();
            if (scheduleBackgroundRunIn2 != null && (l10 == null || scheduleBackgroundRunIn2.longValue() < l10.longValue())) {
                l10 = scheduleBackgroundRunIn2;
            }
        }
        if (l10 != null) {
            scheduleSyncTask(l10.longValue());
        }
    }

    private final void scheduleBackgroundSyncTask(long j10) {
        synchronized (this.lock) {
            if (useJob()) {
                scheduleSyncServiceAsJob(j10);
            } else {
                scheduleSyncServiceAsAlarm(j10);
            }
            t tVar = t.f15300a;
        }
    }

    private final void scheduleSyncServiceAsAlarm(long j10) {
        com.onesignal.debug.internal.logging.a.verbose$default(a.class.getSimpleName() + " scheduleServiceSyncTask:atTime: " + j10, (Throwable) null, 2, (Object) null);
        PendingIntent syncServicePendingIntent = syncServicePendingIntent();
        Object systemService = this._applicationService.getAppContext().getSystemService("alarm");
        db.l.c(systemService, "null cannot be cast to non-null type android.app.AlarmManager");
        ((AlarmManager) systemService).set(0, this._time.getCurrentTimeMillis() + j10, syncServicePendingIntent);
    }

    private final void scheduleSyncServiceAsJob(long j10) {
        com.onesignal.debug.internal.logging.a.debug$default("OSBackgroundSync scheduleSyncServiceAsJob:atTime: " + j10, (Throwable) null, 2, (Object) null);
        if (isJobIdRunning()) {
            com.onesignal.debug.internal.logging.a.verbose$default("OSBackgroundSync scheduleSyncServiceAsJob Scheduler already running!", (Throwable) null, 2, (Object) null);
            setNeedsJobReschedule(true);
            return;
        }
        Context appContext = this._applicationService.getAppContext();
        db.l.b(appContext);
        Class<?> cls = this.syncServiceJobClass;
        db.l.b(cls);
        JobInfo.Builder builder = new JobInfo.Builder(SYNC_TASK_ID, new ComponentName(appContext, cls));
        builder.setMinimumLatency(j10).setRequiredNetworkType(1);
        if (hasBootPermission()) {
            builder.setPersisted(true);
        }
        Context appContext2 = this._applicationService.getAppContext();
        db.l.b(appContext2);
        Object systemService = appContext2.getSystemService("jobscheduler");
        db.l.c(systemService, "null cannot be cast to non-null type android.app.job.JobScheduler");
        try {
            int schedule = ((JobScheduler) systemService).schedule(builder.build());
            com.onesignal.debug.internal.logging.a.info$default("OSBackgroundSync scheduleSyncServiceAsJob:result: " + schedule, (Throwable) null, 2, (Object) null);
        } catch (NullPointerException e10) {
            com.onesignal.debug.internal.logging.a.error("scheduleSyncServiceAsJob called JobScheduler.jobScheduler which triggered an internal null Android error. Skipping job.", e10);
        }
    }

    private final void scheduleSyncTask(long j10) {
        synchronized (this.lock) {
            if (this.nextScheduledSyncTimeMs == 0 || this._time.getCurrentTimeMillis() + j10 <= this.nextScheduledSyncTimeMs) {
                if (j10 < 5000) {
                    j10 = 5000;
                }
                scheduleBackgroundSyncTask(j10);
                this.nextScheduledSyncTimeMs = this._time.getCurrentTimeMillis() + j10;
                t tVar = t.f15300a;
                return;
            }
            com.onesignal.debug.internal.logging.a.debug$default("OSSyncService scheduleSyncTask already update scheduled nextScheduledSyncTimeMs: " + this.nextScheduledSyncTimeMs, (Throwable) null, 2, (Object) null);
        }
    }

    private final PendingIntent syncServicePendingIntent() {
        PendingIntent service = PendingIntent.getService(this._applicationService.getAppContext(), SYNC_TASK_ID, new Intent(this._applicationService.getAppContext(), this.syncServicePendingIntentClass), 201326592);
        db.l.d(service, "getService(\n            …FLAG_IMMUTABLE,\n        )");
        return service;
    }

    private final boolean useJob() {
        return true;
    }

    public boolean cancelRunBackgroundServices() {
        o1 o1Var = this.backgroundSyncJob;
        if (o1Var == null) {
            return false;
        }
        db.l.b(o1Var);
        if (!o1Var.c()) {
            return false;
        }
        o1 o1Var2 = this.backgroundSyncJob;
        db.l.b(o1Var2);
        o1.a.a(o1Var2, (CancellationException) null, 1, (Object) null);
        return true;
    }

    public boolean getNeedsJobReschedule() {
        return this.needsJobReschedule;
    }

    public void onFocus() {
        cancelSyncTask();
    }

    public void onUnfocused() {
        scheduleBackground();
    }

    public Object runBackgroundServices(d dVar) {
        Object b10 = i0.b(new b(this, (d) null), dVar);
        return b10 == d.c() ? b10 : t.f15300a;
    }

    public void setNeedsJobReschedule(boolean z10) {
        this.needsJobReschedule = z10;
    }

    public void start() {
        this._applicationService.addApplicationLifecycleHandler(this);
    }
}
