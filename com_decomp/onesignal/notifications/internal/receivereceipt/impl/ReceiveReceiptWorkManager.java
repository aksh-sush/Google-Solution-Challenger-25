package com.onesignal.notifications.internal.receivereceipt.impl;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import androidx.work.c;
import androidx.work.q;
import db.g;
import db.l;
import kotlin.coroutines.jvm.internal.d;
import l7.f;
import o9.b;

public final class ReceiveReceiptWorkManager implements b {
    public static final a Companion = new a((g) null);
    private static final String OS_APP_ID = "os_app_id";
    private static final String OS_NOTIFICATION_ID = "os_notification_id";
    private static final String OS_SUBSCRIPTION_ID = "os_subscription_id";
    private final f _applicationService;
    private final com.onesignal.core.internal.config.b _configModelStore;
    private final com.onesignal.user.internal.subscriptions.b _subscriptionManager;
    private final int maxDelay = 25;
    private final int minDelay;

    public static final class ReceiveReceiptWorker extends CoroutineWorker {
        private o9.a receiveReceiptProcessor = ((o9.a) g7.b.f10823a.c().getService(o9.a.class));

        static final class a extends d {
            int label;
            /* synthetic */ Object result;
            final /* synthetic */ ReceiveReceiptWorker this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(ReceiveReceiptWorker receiveReceiptWorker, va.d dVar) {
                super(dVar);
                this.this$0 = receiveReceiptWorker;
            }

            public final Object invokeSuspend(Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return this.this$0.doWork(this);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ReceiveReceiptWorker(Context context, WorkerParameters workerParameters) {
            super(context, workerParameters);
            l.e(context, "context");
            l.e(workerParameters, "workerParams");
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object doWork(va.d r7) {
            /*
                r6 = this;
                boolean r0 = r7 instanceof com.onesignal.notifications.internal.receivereceipt.impl.ReceiveReceiptWorkManager.ReceiveReceiptWorker.a
                if (r0 == 0) goto L_0x0013
                r0 = r7
                com.onesignal.notifications.internal.receivereceipt.impl.ReceiveReceiptWorkManager$ReceiveReceiptWorker$a r0 = (com.onesignal.notifications.internal.receivereceipt.impl.ReceiveReceiptWorkManager.ReceiveReceiptWorker.a) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.label = r1
                goto L_0x0018
            L_0x0013:
                com.onesignal.notifications.internal.receivereceipt.impl.ReceiveReceiptWorkManager$ReceiveReceiptWorker$a r0 = new com.onesignal.notifications.internal.receivereceipt.impl.ReceiveReceiptWorkManager$ReceiveReceiptWorker$a
                r0.<init>(r6, r7)
            L_0x0018:
                java.lang.Object r7 = r0.result
                java.lang.Object r1 = wa.d.c()
                int r2 = r0.label
                r3 = 1
                if (r2 == 0) goto L_0x0031
                if (r2 != r3) goto L_0x0029
                sa.o.b(r7)
                goto L_0x0063
            L_0x0029:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L_0x0031:
                sa.o.b(r7)
                androidx.work.e r7 = r6.getInputData()
                java.lang.String r2 = "inputData"
                db.l.d(r7, r2)
                java.lang.String r2 = "os_notification_id"
                java.lang.String r2 = r7.l(r2)
                db.l.b(r2)
                java.lang.String r4 = "os_app_id"
                java.lang.String r4 = r7.l(r4)
                db.l.b(r4)
                java.lang.String r5 = "os_subscription_id"
                java.lang.String r7 = r7.l(r5)
                db.l.b(r7)
                o9.a r5 = r6.receiveReceiptProcessor
                r0.label = r3
                java.lang.Object r7 = r5.sendReceiveReceipt(r4, r7, r2, r0)
                if (r7 != r1) goto L_0x0063
                return r1
            L_0x0063:
                androidx.work.ListenableWorker$a r7 = androidx.work.ListenableWorker.a.c()
                java.lang.String r0 = "success()"
                db.l.d(r7, r0)
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onesignal.notifications.internal.receivereceipt.impl.ReceiveReceiptWorkManager.ReceiveReceiptWorker.doWork(va.d):java.lang.Object");
        }
    }

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }
    }

    public ReceiveReceiptWorkManager(f fVar, com.onesignal.core.internal.config.b bVar, com.onesignal.user.internal.subscriptions.b bVar2) {
        l.e(fVar, "_applicationService");
        l.e(bVar, "_configModelStore");
        l.e(bVar2, "_subscriptionManager");
        this._applicationService = fVar;
        this._configModelStore = bVar;
        this._subscriptionManager = bVar2;
    }

    private final c buildConstraints() {
        c a10 = new c.a().b(q.CONNECTED).a();
        l.d(a10, "Builder()\n            .s…TED)\n            .build()");
        return a10;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x004a, code lost:
        if (r5 != false) goto L_0x004c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void enqueueReceiveReceipt(java.lang.String r9) {
        /*
            r8 = this;
            java.lang.String r0 = "notificationId"
            db.l.e(r9, r0)
            com.onesignal.core.internal.config.b r0 = r8._configModelStore
            com.onesignal.common.modeling.g r0 = r0.getModel()
            com.onesignal.core.internal.config.a r0 = (com.onesignal.core.internal.config.a) r0
            boolean r0 = r0.getReceiveReceiptEnabled()
            r1 = 2
            r2 = 0
            if (r0 != 0) goto L_0x001b
            java.lang.String r9 = "sendReceiveReceipt disabled"
            com.onesignal.debug.internal.logging.a.debug$default(r9, r2, r1, r2)
            return
        L_0x001b:
            com.onesignal.core.internal.config.b r0 = r8._configModelStore
            com.onesignal.common.modeling.g r0 = r0.getModel()
            com.onesignal.core.internal.config.a r0 = (com.onesignal.core.internal.config.a) r0
            java.lang.String r0 = r0.getAppId()
            com.onesignal.user.internal.subscriptions.b r3 = r8._subscriptionManager
            com.onesignal.user.internal.subscriptions.c r3 = r3.getSubscriptions()
            ba.b r3 = r3.getPush()
            java.lang.String r3 = r3.getId()
            int r4 = r3.length()
            r5 = 1
            r6 = 0
            if (r4 != 0) goto L_0x003f
            r4 = 1
            goto L_0x0040
        L_0x003f:
            r4 = 0
        L_0x0040:
            if (r4 != 0) goto L_0x004c
            int r4 = r0.length()
            if (r4 != 0) goto L_0x0049
            goto L_0x004a
        L_0x0049:
            r5 = 0
        L_0x004a:
            if (r5 == 0) goto L_0x0051
        L_0x004c:
            java.lang.String r4 = "ReceiveReceiptWorkManager: No push subscription or appId!"
            com.onesignal.debug.internal.logging.a.debug$default(r4, r2, r1, r2)
        L_0x0051:
            com.onesignal.common.AndroidUtils r4 = com.onesignal.common.AndroidUtils.INSTANCE
            int r5 = r8.minDelay
            int r6 = r8.maxDelay
            int r4 = r4.getRandomDelay(r5, r6)
            androidx.work.e$a r5 = new androidx.work.e$a
            r5.<init>()
            java.lang.String r6 = "os_notification_id"
            androidx.work.e$a r5 = r5.h(r6, r9)
            java.lang.String r6 = "os_app_id"
            androidx.work.e$a r0 = r5.h(r6, r0)
            java.lang.String r5 = "os_subscription_id"
            androidx.work.e$a r0 = r0.h(r5, r3)
            androidx.work.e r0 = r0.a()
            java.lang.String r3 = "Builder()\n              …\n                .build()"
            db.l.d(r0, r3)
            androidx.work.c r3 = r8.buildConstraints()
            androidx.work.r$a r5 = new androidx.work.r$a
            java.lang.Class<com.onesignal.notifications.internal.receivereceipt.impl.ReceiveReceiptWorkManager$ReceiveReceiptWorker> r6 = com.onesignal.notifications.internal.receivereceipt.impl.ReceiveReceiptWorkManager.ReceiveReceiptWorker.class
            r5.<init>(r6)
            androidx.work.a0$a r3 = r5.e(r3)
            androidx.work.r$a r3 = (androidx.work.r.a) r3
            long r5 = (long) r4
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.SECONDS
            androidx.work.a0$a r3 = r3.f(r5, r7)
            androidx.work.r$a r3 = (androidx.work.r.a) r3
            androidx.work.a0$a r0 = r3.g(r0)
            androidx.work.r$a r0 = (androidx.work.r.a) r0
            androidx.work.a0 r0 = r0.b()
            java.lang.String r3 = "Builder(ReceiveReceiptWo…\n                .build()"
            db.l.d(r0, r3)
            androidx.work.r r0 = (androidx.work.r) r0
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "OSReceiveReceiptController enqueueing send receive receipt work with notificationId: "
            r3.append(r5)
            r3.append(r9)
            java.lang.String r5 = " and delay: "
            r3.append(r5)
            r3.append(r4)
            java.lang.String r4 = " seconds"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            com.onesignal.debug.internal.logging.a.debug$default(r3, r2, r1, r2)
            l7.f r1 = r8._applicationService
            android.content.Context r1 = r1.getAppContext()
            androidx.work.z r1 = androidx.work.z.e(r1)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r9)
            java.lang.String r9 = "_receive_receipt"
            r2.append(r9)
            java.lang.String r9 = r2.toString()
            androidx.work.g r2 = androidx.work.g.KEEP
            r1.c(r9, r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.notifications.internal.receivereceipt.impl.ReceiveReceiptWorkManager.enqueueReceiveReceipt(java.lang.String):void");
    }
}
