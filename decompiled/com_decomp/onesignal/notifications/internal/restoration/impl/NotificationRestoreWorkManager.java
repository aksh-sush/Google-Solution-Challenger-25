package com.onesignal.notifications.internal.restoration.impl;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import db.g;
import db.l;
import kotlin.coroutines.jvm.internal.d;
import q9.b;

public final class NotificationRestoreWorkManager implements b {
    public static final a Companion = new a((g) null);
    private static final String NOTIFICATION_RESTORE_WORKER_IDENTIFIER = NotificationRestoreWorker.class.getCanonicalName();
    private boolean restored;

    public static final class NotificationRestoreWorker extends CoroutineWorker {

        static final class a extends d {
            int label;
            /* synthetic */ Object result;
            final /* synthetic */ NotificationRestoreWorker this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(NotificationRestoreWorker notificationRestoreWorker, va.d dVar) {
                super(dVar);
                this.this$0 = notificationRestoreWorker;
            }

            public final Object invokeSuspend(Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return this.this$0.doWork(this);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public NotificationRestoreWorker(Context context, WorkerParameters workerParameters) {
            super(context, workerParameters);
            l.e(context, "context");
            l.e(workerParameters, "workerParams");
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object doWork(va.d r8) {
            /*
                r7 = this;
                boolean r0 = r8 instanceof com.onesignal.notifications.internal.restoration.impl.NotificationRestoreWorkManager.NotificationRestoreWorker.a
                if (r0 == 0) goto L_0x0013
                r0 = r8
                com.onesignal.notifications.internal.restoration.impl.NotificationRestoreWorkManager$NotificationRestoreWorker$a r0 = (com.onesignal.notifications.internal.restoration.impl.NotificationRestoreWorkManager.NotificationRestoreWorker.a) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.label = r1
                goto L_0x0018
            L_0x0013:
                com.onesignal.notifications.internal.restoration.impl.NotificationRestoreWorkManager$NotificationRestoreWorker$a r0 = new com.onesignal.notifications.internal.restoration.impl.NotificationRestoreWorkManager$NotificationRestoreWorker$a
                r0.<init>(r7, r8)
            L_0x0018:
                java.lang.Object r8 = r0.result
                java.lang.Object r1 = wa.d.c()
                int r2 = r0.label
                java.lang.String r3 = "success()"
                r4 = 1
                if (r2 == 0) goto L_0x0033
                if (r2 != r4) goto L_0x002b
                sa.o.b(r8)
                goto L_0x0078
            L_0x002b:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L_0x0033:
                sa.o.b(r8)
                android.content.Context r8 = r7.getApplicationContext()
                java.lang.String r2 = "applicationContext"
                db.l.d(r8, r2)
                boolean r2 = g7.b.f(r8)
                if (r2 != 0) goto L_0x004d
                androidx.work.ListenableWorker$a r8 = androidx.work.ListenableWorker.a.c()
                db.l.d(r8, r3)
                return r8
            L_0x004d:
                g9.h r2 = g9.h.INSTANCE
                r5 = 2
                r6 = 0
                boolean r8 = g9.h.areNotificationsEnabled$default(r2, r8, r6, r5, r6)
                if (r8 != 0) goto L_0x0061
                androidx.work.ListenableWorker$a r8 = androidx.work.ListenableWorker.a.a()
                java.lang.String r0 = "failure()"
                db.l.d(r8, r0)
                return r8
            L_0x0061:
                g7.b r8 = g7.b.f10823a
                j7.b r8 = r8.c()
                java.lang.Class<q9.a> r2 = q9.a.class
                java.lang.Object r8 = r8.getService(r2)
                q9.a r8 = (q9.a) r8
                r0.label = r4
                java.lang.Object r8 = r8.process(r0)
                if (r8 != r1) goto L_0x0078
                return r1
            L_0x0078:
                androidx.work.ListenableWorker$a r8 = androidx.work.ListenableWorker.a.c()
                db.l.d(r8, r3)
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onesignal.notifications.internal.restoration.impl.NotificationRestoreWorkManager.NotificationRestoreWorker.doWork(va.d):java.lang.Object");
        }
    }

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0018, code lost:
        if (r5 == false) goto L_0x001d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001a, code lost:
        r5 = 15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001d, code lost:
        r5 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001e, code lost:
        r5 = ((androidx.work.r.a) new androidx.work.r.a(com.onesignal.notifications.internal.restoration.impl.NotificationRestoreWorkManager.NotificationRestoreWorker.class).f((long) r5, java.util.concurrent.TimeUnit.SECONDS)).b();
        db.l.d(r5, "Builder(NotificationRest…\n                .build()");
        androidx.work.z.e(r4).c(NOTIFICATION_RESTORE_WORKER_IDENTIFIER, androidx.work.g.KEEP, (androidx.work.r) r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0044, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void beginEnqueueingWork(android.content.Context r4, boolean r5) {
        /*
            r3 = this;
            java.lang.String r0 = "context"
            db.l.e(r4, r0)
            boolean r0 = r3.restored
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            monitor-enter(r0)
            boolean r1 = r3.restored     // Catch:{ all -> 0x0045 }
            if (r1 == 0) goto L_0x0012
            monitor-exit(r0)
            return
        L_0x0012:
            r1 = 1
            r3.restored = r1     // Catch:{ all -> 0x0045 }
            sa.t r1 = sa.t.f15300a     // Catch:{ all -> 0x0045 }
            monitor-exit(r0)
            if (r5 == 0) goto L_0x001d
            r5 = 15
            goto L_0x001e
        L_0x001d:
            r5 = 0
        L_0x001e:
            androidx.work.r$a r0 = new androidx.work.r$a
            java.lang.Class<com.onesignal.notifications.internal.restoration.impl.NotificationRestoreWorkManager$NotificationRestoreWorker> r1 = com.onesignal.notifications.internal.restoration.impl.NotificationRestoreWorkManager.NotificationRestoreWorker.class
            r0.<init>(r1)
            long r1 = (long) r5
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.SECONDS
            androidx.work.a0$a r5 = r0.f(r1, r5)
            androidx.work.r$a r5 = (androidx.work.r.a) r5
            androidx.work.a0 r5 = r5.b()
            java.lang.String r0 = "Builder(NotificationRest…\n                .build()"
            db.l.d(r5, r0)
            androidx.work.r r5 = (androidx.work.r) r5
            androidx.work.z r4 = androidx.work.z.e(r4)
            java.lang.String r0 = NOTIFICATION_RESTORE_WORKER_IDENTIFIER
            androidx.work.g r1 = androidx.work.g.KEEP
            r4.c(r0, r1, r5)
            return
        L_0x0045:
            r4 = move-exception
            monitor-exit(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.notifications.internal.restoration.impl.NotificationRestoreWorkManager.beginEnqueueingWork(android.content.Context, boolean):void");
    }
}
