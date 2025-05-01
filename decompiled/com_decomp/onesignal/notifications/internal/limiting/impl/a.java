package com.onesignal.notifications.internal.limiting.impl;

import db.l;
import kotlin.coroutines.jvm.internal.d;
import l7.f;

public final class a implements l9.a {
    private final f _applicationService;
    private final h9.b _dataController;
    private final r9.a _notificationSummaryManager;

    /* renamed from: com.onesignal.notifications.internal.limiting.impl.a$a  reason: collision with other inner class name */
    static final class C0174a extends d {
        int I$0;
        Object L$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ a this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0174a(a aVar, va.d dVar) {
            super(dVar);
            this.this$0 = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.clearOldestOverLimit(0, this);
        }
    }

    static final class b extends d {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ a this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(a aVar, va.d dVar) {
            super(dVar);
            this.this$0 = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.clearOldestOverLimitStandard(0, this);
        }
    }

    public a(h9.b bVar, f fVar, r9.a aVar) {
        l.e(bVar, "_dataController");
        l.e(fVar, "_applicationService");
        l.e(aVar, "_notificationSummaryManager");
        this._dataController = bVar;
        this._applicationService = fVar;
        this._notificationSummaryManager = aVar;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0106  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object clearOldestOverLimitStandard(int r14, va.d r15) {
        /*
            r13 = this;
            boolean r0 = r15 instanceof com.onesignal.notifications.internal.limiting.impl.a.b
            if (r0 == 0) goto L_0x0013
            r0 = r15
            com.onesignal.notifications.internal.limiting.impl.a$b r0 = (com.onesignal.notifications.internal.limiting.impl.a.b) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.onesignal.notifications.internal.limiting.impl.a$b r0 = new com.onesignal.notifications.internal.limiting.impl.a$b
            r0.<init>(r13, r15)
        L_0x0018:
            java.lang.Object r15 = r0.result
            java.lang.Object r1 = wa.d.c()
            int r2 = r0.label
            java.lang.String r3 = "value"
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x0054
            if (r2 == r5) goto L_0x0041
            if (r2 != r4) goto L_0x0039
            int r14 = r0.I$0
            java.lang.Object r2 = r0.L$1
            java.util.Iterator r2 = (java.util.Iterator) r2
            java.lang.Object r6 = r0.L$0
            com.onesignal.notifications.internal.limiting.impl.a r6 = (com.onesignal.notifications.internal.limiting.impl.a) r6
            sa.o.b(r15)
            goto L_0x00fd
        L_0x0039:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L_0x0041:
            int r14 = r0.I$0
            java.lang.Object r2 = r0.L$2
            java.lang.Integer r2 = (java.lang.Integer) r2
            java.lang.Object r6 = r0.L$1
            java.util.Iterator r6 = (java.util.Iterator) r6
            java.lang.Object r7 = r0.L$0
            com.onesignal.notifications.internal.limiting.impl.a r7 = (com.onesignal.notifications.internal.limiting.impl.a) r7
            sa.o.b(r15)
            goto L_0x00d8
        L_0x0054:
            sa.o.b(r15)
            g9.h r15 = g9.h.INSTANCE
            l7.f r2 = r13._applicationService
            android.content.Context r2 = r2.getAppContext()
            android.service.notification.StatusBarNotification[] r15 = r15.getActiveNotifications(r2)
            int r2 = r15.length
            l9.a$a r6 = l9.a.C0256a.INSTANCE
            int r6 = r6.getMaxNumberOfNotifications()
            int r2 = r2 - r6
            int r2 = r2 + r14
            if (r2 >= r5) goto L_0x0071
            sa.t r14 = sa.t.f15300a
            return r14
        L_0x0071:
            java.util.TreeMap r14 = new java.util.TreeMap
            r14.<init>()
            int r6 = r15.length
            r7 = 0
        L_0x0078:
            if (r7 >= r6) goto L_0x009c
            r8 = r15[r7]
            g9.h r9 = g9.h.INSTANCE
            boolean r9 = r9.isGroupSummary(r8)
            if (r9 != 0) goto L_0x0099
            android.app.Notification r9 = r8.getNotification()
            long r9 = r9.when
            java.lang.Long r9 = kotlin.coroutines.jvm.internal.b.d(r9)
            int r8 = r8.getId()
            java.lang.Integer r8 = kotlin.coroutines.jvm.internal.b.c(r8)
            r14.put(r9, r8)
        L_0x0099:
            int r7 = r7 + 1
            goto L_0x0078
        L_0x009c:
            java.util.Set r14 = r14.entrySet()
            java.util.Iterator r14 = r14.iterator()
            r15 = r13
        L_0x00a5:
            boolean r6 = r14.hasNext()
            if (r6 == 0) goto L_0x010a
            java.lang.Object r6 = r14.next()
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6
            java.lang.Object r6 = r6.getValue()
            java.lang.Integer r6 = (java.lang.Integer) r6
            h9.b r7 = r15._dataController
            db.l.d(r6, r3)
            int r8 = r6.intValue()
            r0.L$0 = r15
            r0.L$1 = r14
            r0.L$2 = r6
            r0.I$0 = r2
            r0.label = r5
            java.lang.Object r7 = r7.markAsDismissed(r8, r0)
            if (r7 != r1) goto L_0x00d1
            return r1
        L_0x00d1:
            r11 = r6
            r6 = r14
            r14 = r2
            r2 = r11
            r12 = r7
            r7 = r15
            r15 = r12
        L_0x00d8:
            java.lang.Boolean r15 = (java.lang.Boolean) r15
            boolean r15 = r15.booleanValue()
            if (r15 == 0) goto L_0x00ff
            r9.a r15 = r7._notificationSummaryManager
            db.l.d(r2, r3)
            int r2 = r2.intValue()
            r0.L$0 = r7
            r0.L$1 = r6
            r8 = 0
            r0.L$2 = r8
            r0.I$0 = r14
            r0.label = r4
            java.lang.Object r15 = r15.updatePossibleDependentSummaryOnDismiss(r2, r0)
            if (r15 != r1) goto L_0x00fb
            return r1
        L_0x00fb:
            r2 = r6
            r6 = r7
        L_0x00fd:
            r15 = r6
            goto L_0x0101
        L_0x00ff:
            r2 = r6
            r15 = r7
        L_0x0101:
            int r14 = r14 + -1
            if (r14 > 0) goto L_0x0106
            goto L_0x010a
        L_0x0106:
            r11 = r2
            r2 = r14
            r14 = r11
            goto L_0x00a5
        L_0x010a:
            sa.t r14 = sa.t.f15300a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.notifications.internal.limiting.impl.a.clearOldestOverLimitStandard(int, va.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object clearOldestOverLimit(int r7, va.d r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.onesignal.notifications.internal.limiting.impl.a.C0174a
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.onesignal.notifications.internal.limiting.impl.a$a r0 = (com.onesignal.notifications.internal.limiting.impl.a.C0174a) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.onesignal.notifications.internal.limiting.impl.a$a r0 = new com.onesignal.notifications.internal.limiting.impl.a$a
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = wa.d.c()
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x004a
            if (r2 == r5) goto L_0x003e
            if (r2 == r4) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            sa.o.b(r8)
            goto L_0x008b
        L_0x002f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0037:
            int r7 = r0.I$0
            java.lang.Object r2 = r0.L$0
            com.onesignal.notifications.internal.limiting.impl.a r2 = (com.onesignal.notifications.internal.limiting.impl.a) r2
            goto L_0x0044
        L_0x003e:
            int r7 = r0.I$0
            java.lang.Object r2 = r0.L$0
            com.onesignal.notifications.internal.limiting.impl.a r2 = (com.onesignal.notifications.internal.limiting.impl.a) r2
        L_0x0044:
            sa.o.b(r8)     // Catch:{ all -> 0x0048 }
            goto L_0x008b
        L_0x0048:
            goto L_0x0077
        L_0x004a:
            sa.o.b(r8)
            int r8 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0075 }
            r2 = 23
            if (r8 < r2) goto L_0x0060
            r0.L$0 = r6     // Catch:{ all -> 0x0075 }
            r0.I$0 = r7     // Catch:{ all -> 0x0075 }
            r0.label = r5     // Catch:{ all -> 0x0075 }
            java.lang.Object r7 = r6.clearOldestOverLimitStandard(r7, r0)     // Catch:{ all -> 0x0075 }
            if (r7 != r1) goto L_0x008b
            return r1
        L_0x0060:
            h9.b r8 = r6._dataController     // Catch:{ all -> 0x0075 }
            l9.a$a r2 = l9.a.C0256a.INSTANCE     // Catch:{ all -> 0x0075 }
            int r2 = r2.getMaxNumberOfNotifications()     // Catch:{ all -> 0x0075 }
            r0.L$0 = r6     // Catch:{ all -> 0x0075 }
            r0.I$0 = r7     // Catch:{ all -> 0x0075 }
            r0.label = r4     // Catch:{ all -> 0x0075 }
            java.lang.Object r7 = r8.clearOldestOverLimitFallback(r7, r2, r0)     // Catch:{ all -> 0x0075 }
            if (r7 != r1) goto L_0x008b
            return r1
        L_0x0075:
            r2 = r6
        L_0x0077:
            h9.b r8 = r2._dataController
            l9.a$a r2 = l9.a.C0256a.INSTANCE
            int r2 = r2.getMaxNumberOfNotifications()
            r4 = 0
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r7 = r8.clearOldestOverLimitFallback(r7, r2, r0)
            if (r7 != r1) goto L_0x008b
            return r1
        L_0x008b:
            sa.t r7 = sa.t.f15300a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.notifications.internal.limiting.impl.a.clearOldestOverLimit(int, va.d):java.lang.Object");
    }
}
