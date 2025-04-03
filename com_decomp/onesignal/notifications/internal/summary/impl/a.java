package com.onesignal.notifications.internal.summary.impl;

import db.l;
import l7.f;
import sa.t;

public final class a implements r9.a {
    private final f _applicationService;
    private final com.onesignal.core.internal.config.b _configModelStore;
    private final h9.b _dataController;
    private final q9.a _notificationRestoreProcessor;
    private final i9.c _summaryNotificationDisplayer;
    private final a8.a _time;

    /* renamed from: com.onesignal.notifications.internal.summary.impl.a$a  reason: collision with other inner class name */
    static final class C0184a extends kotlin.coroutines.jvm.internal.d {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ a this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0184a(a aVar, va.d dVar) {
            super(dVar);
            this.this$0 = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.clearNotificationOnSummaryClick((String) null, this);
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.d {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        boolean Z$0;
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
            return this.this$0.internalUpdateSummaryNotificationAfterChildRemoved((String) null, false, this);
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.d {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ a this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(a aVar, va.d dVar) {
            super(dVar);
            this.this$0 = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.restoreSummary((String) null, this);
        }
    }

    static final class d extends kotlin.coroutines.jvm.internal.d {
        Object L$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ a this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(a aVar, va.d dVar) {
            super(dVar);
            this.this$0 = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.updatePossibleDependentSummaryOnDismiss(0, this);
        }
    }

    public a(f fVar, h9.b bVar, i9.c cVar, com.onesignal.core.internal.config.b bVar2, q9.a aVar, a8.a aVar2) {
        l.e(fVar, "_applicationService");
        l.e(bVar, "_dataController");
        l.e(cVar, "_summaryNotificationDisplayer");
        l.e(bVar2, "_configModelStore");
        l.e(aVar, "_notificationRestoreProcessor");
        l.e(aVar2, "_time");
        this._applicationService = fVar;
        this._dataController = bVar;
        this._summaryNotificationDisplayer = cVar;
        this._configModelStore = bVar2;
        this._notificationRestoreProcessor = aVar;
        this._time = aVar2;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x009f A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0129  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0028  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object internalUpdateSummaryNotificationAfterChildRemoved(java.lang.String r12, boolean r13, va.d r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof com.onesignal.notifications.internal.summary.impl.a.b
            if (r0 == 0) goto L_0x0013
            r0 = r14
            com.onesignal.notifications.internal.summary.impl.a$b r0 = (com.onesignal.notifications.internal.summary.impl.a.b) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.onesignal.notifications.internal.summary.impl.a$b r0 = new com.onesignal.notifications.internal.summary.impl.a$b
            r0.<init>(r11, r14)
        L_0x0018:
            r6 = r0
            java.lang.Object r14 = r6.result
            java.lang.Object r0 = wa.d.c()
            int r1 = r6.label
            r2 = 5
            r3 = 4
            r4 = 3
            r5 = 2
            r7 = 1
            if (r1 == 0) goto L_0x006f
            if (r1 == r7) goto L_0x0060
            if (r1 == r5) goto L_0x004c
            if (r1 == r4) goto L_0x0047
            if (r1 == r3) goto L_0x0042
            if (r1 != r2) goto L_0x003a
            sa.o.b(r14)     // Catch:{ JSONException -> 0x0037 }
            goto L_0x0126
        L_0x0037:
            r12 = move-exception
            goto L_0x0123
        L_0x003a:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L_0x0042:
            sa.o.b(r14)
            goto L_0x00eb
        L_0x0047:
            sa.o.b(r14)
            goto L_0x00d7
        L_0x004c:
            int r12 = r6.I$0
            boolean r13 = r6.Z$0
            java.lang.Object r1 = r6.L$2
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r5 = r6.L$1
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r8 = r6.L$0
            com.onesignal.notifications.internal.summary.impl.a r8 = (com.onesignal.notifications.internal.summary.impl.a) r8
            sa.o.b(r14)
            goto L_0x00a4
        L_0x0060:
            boolean r13 = r6.Z$0
            java.lang.Object r12 = r6.L$1
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r1 = r6.L$0
            com.onesignal.notifications.internal.summary.impl.a r1 = (com.onesignal.notifications.internal.summary.impl.a) r1
            sa.o.b(r14)
            r8 = r1
            goto L_0x0084
        L_0x006f:
            sa.o.b(r14)
            h9.b r14 = r11._dataController
            r6.L$0 = r11
            r6.L$1 = r12
            r6.Z$0 = r13
            r6.label = r7
            java.lang.Object r14 = r14.listNotificationsForGroup(r12, r6)
            if (r14 != r0) goto L_0x0083
            return r0
        L_0x0083:
            r8 = r11
        L_0x0084:
            r1 = r14
            java.util.List r1 = (java.util.List) r1
            int r14 = r1.size()
            h9.b r9 = r8._dataController
            r6.L$0 = r8
            r6.L$1 = r12
            r6.L$2 = r1
            r6.Z$0 = r13
            r6.I$0 = r14
            r6.label = r5
            java.lang.Object r5 = r9.getAndroidIdForGroup(r12, r7, r6)
            if (r5 != r0) goto L_0x00a0
            return r0
        L_0x00a0:
            r10 = r5
            r5 = r12
            r12 = r14
            r14 = r10
        L_0x00a4:
            java.lang.Integer r14 = (java.lang.Integer) r14
            if (r14 == 0) goto L_0x0129
            int r14 = r14.intValue()
            r9 = 0
            if (r12 != 0) goto L_0x00da
            g9.h r12 = g9.h.INSTANCE
            l7.f r1 = r8._applicationService
            android.content.Context r1 = r1.getAppContext()
            android.app.NotificationManager r12 = r12.getNotificationManager(r1)
            r12.cancel(r14)
            h9.b r1 = r8._dataController
            r12 = 0
            r5 = 0
            r7 = 12
            r8 = 0
            r6.L$0 = r9
            r6.L$1 = r9
            r6.L$2 = r9
            r6.label = r4
            r2 = r14
            r3 = r13
            r4 = r12
            java.lang.Object r12 = h9.b.a.markAsConsumed$default(r1, r2, r3, r4, r5, r6, r7, r8)
            if (r12 != r0) goto L_0x00d7
            return r0
        L_0x00d7:
            sa.t r12 = sa.t.f15300a
            return r12
        L_0x00da:
            if (r12 != r7) goto L_0x00ee
            r6.L$0 = r9
            r6.L$1 = r9
            r6.L$2 = r9
            r6.label = r3
            java.lang.Object r12 = r8.restoreSummary(r5, r6)
            if (r12 != r0) goto L_0x00eb
            return r0
        L_0x00eb:
            sa.t r12 = sa.t.f15300a
            return r12
        L_0x00ee:
            java.lang.Object r12 = ta.w.w(r1)     // Catch:{ JSONException -> 0x0037 }
            h9.b$b r12 = (h9.b.C0231b) r12     // Catch:{ JSONException -> 0x0037 }
            org.json.JSONObject r13 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0037 }
            java.lang.String r14 = r12.getFullData()     // Catch:{ JSONException -> 0x0037 }
            r13.<init>(r14)     // Catch:{ JSONException -> 0x0037 }
            g9.d r14 = new g9.d     // Catch:{ JSONException -> 0x0037 }
            a8.a r1 = r8._time     // Catch:{ JSONException -> 0x0037 }
            r14.<init>((org.json.JSONObject) r13, (a8.a) r1)     // Catch:{ JSONException -> 0x0037 }
            r14.setRestoring(r7)     // Catch:{ JSONException -> 0x0037 }
            long r12 = r12.getCreatedAt()     // Catch:{ JSONException -> 0x0037 }
            java.lang.Long r12 = kotlin.coroutines.jvm.internal.b.d(r12)     // Catch:{ JSONException -> 0x0037 }
            r14.setShownTimeStamp(r12)     // Catch:{ JSONException -> 0x0037 }
            i9.c r12 = r8._summaryNotificationDisplayer     // Catch:{ JSONException -> 0x0037 }
            r6.L$0 = r9     // Catch:{ JSONException -> 0x0037 }
            r6.L$1 = r9     // Catch:{ JSONException -> 0x0037 }
            r6.L$2 = r9     // Catch:{ JSONException -> 0x0037 }
            r6.label = r2     // Catch:{ JSONException -> 0x0037 }
            java.lang.Object r12 = r12.updateSummaryNotification(r14, r6)     // Catch:{ JSONException -> 0x0037 }
            if (r12 != r0) goto L_0x0126
            return r0
        L_0x0123:
            r12.printStackTrace()
        L_0x0126:
            sa.t r12 = sa.t.f15300a
            return r12
        L_0x0129:
            sa.t r12 = sa.t.f15300a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.notifications.internal.summary.impl.a.internalUpdateSummaryNotificationAfterChildRemoved(java.lang.String, boolean, va.d):java.lang.Object");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object restoreSummary(java.lang.String r11, va.d r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof com.onesignal.notifications.internal.summary.impl.a.c
            if (r0 == 0) goto L_0x0013
            r0 = r12
            com.onesignal.notifications.internal.summary.impl.a$c r0 = (com.onesignal.notifications.internal.summary.impl.a.c) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.onesignal.notifications.internal.summary.impl.a$c r0 = new com.onesignal.notifications.internal.summary.impl.a$c
            r0.<init>(r10, r12)
        L_0x0018:
            java.lang.Object r12 = r0.result
            java.lang.Object r1 = wa.d.c()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0044
            if (r2 == r4) goto L_0x003c
            if (r2 != r3) goto L_0x0034
            java.lang.Object r11 = r0.L$1
            java.util.Iterator r11 = (java.util.Iterator) r11
            java.lang.Object r2 = r0.L$0
            com.onesignal.notifications.internal.summary.impl.a r2 = (com.onesignal.notifications.internal.summary.impl.a) r2
            sa.o.b(r12)
            goto L_0x005d
        L_0x0034:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x003c:
            java.lang.Object r11 = r0.L$0
            com.onesignal.notifications.internal.summary.impl.a r11 = (com.onesignal.notifications.internal.summary.impl.a) r11
            sa.o.b(r12)
            goto L_0x0055
        L_0x0044:
            sa.o.b(r12)
            h9.b r12 = r10._dataController
            r0.L$0 = r10
            r0.label = r4
            java.lang.Object r12 = r12.listNotificationsForGroup(r11, r0)
            if (r12 != r1) goto L_0x0054
            return r1
        L_0x0054:
            r11 = r10
        L_0x0055:
            java.util.List r12 = (java.util.List) r12
            java.util.Iterator r12 = r12.iterator()
            r2 = r11
            r11 = r12
        L_0x005d:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L_0x007d
            java.lang.Object r12 = r11.next()
            r5 = r12
            h9.b$b r5 = (h9.b.C0231b) r5
            q9.a r4 = r2._notificationRestoreProcessor
            r6 = 0
            r8 = 2
            r9 = 0
            r0.L$0 = r2
            r0.L$1 = r11
            r0.label = r3
            r7 = r0
            java.lang.Object r12 = q9.a.C0282a.processNotification$default(r4, r5, r6, r7, r8, r9)
            if (r12 != r1) goto L_0x005d
            return r1
        L_0x007d:
            sa.t r11 = sa.t.f15300a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.notifications.internal.summary.impl.a.restoreSummary(java.lang.String, va.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object clearNotificationOnSummaryClick(java.lang.String r11, va.d r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof com.onesignal.notifications.internal.summary.impl.a.C0184a
            if (r0 == 0) goto L_0x0013
            r0 = r12
            com.onesignal.notifications.internal.summary.impl.a$a r0 = (com.onesignal.notifications.internal.summary.impl.a.C0184a) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.onesignal.notifications.internal.summary.impl.a$a r0 = new com.onesignal.notifications.internal.summary.impl.a$a
            r0.<init>(r10, r12)
        L_0x0018:
            java.lang.Object r12 = r0.result
            java.lang.Object r1 = wa.d.c()
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x0055
            if (r2 == r5) goto L_0x0041
            if (r2 == r4) goto L_0x0038
            if (r2 != r3) goto L_0x0030
            sa.o.b(r12)
            goto L_0x00d2
        L_0x0030:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x0038:
            java.lang.Object r11 = r0.L$0
            android.app.NotificationManager r11 = (android.app.NotificationManager) r11
            sa.o.b(r12)
            goto L_0x00ae
        L_0x0041:
            java.lang.Object r11 = r0.L$2
            android.app.NotificationManager r11 = (android.app.NotificationManager) r11
            java.lang.Object r2 = r0.L$1
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r6 = r0.L$0
            com.onesignal.notifications.internal.summary.impl.a r6 = (com.onesignal.notifications.internal.summary.impl.a) r6
            sa.o.b(r12)
            r9 = r12
            r12 = r11
            r11 = r2
            r2 = r9
            goto L_0x0077
        L_0x0055:
            sa.o.b(r12)
            g9.h r12 = g9.h.INSTANCE
            l7.f r2 = r10._applicationService
            android.content.Context r2 = r2.getAppContext()
            android.app.NotificationManager r12 = r12.getNotificationManager(r2)
            h9.b r2 = r10._dataController
            r0.L$0 = r10
            r0.L$1 = r11
            r0.L$2 = r12
            r0.label = r5
            r6 = 0
            java.lang.Object r2 = r2.getAndroidIdForGroup(r11, r6, r0)
            if (r2 != r1) goto L_0x0076
            return r1
        L_0x0076:
            r6 = r10
        L_0x0077:
            java.lang.Integer r2 = (java.lang.Integer) r2
            if (r2 == 0) goto L_0x00d5
            com.onesignal.core.internal.config.b r7 = r6._configModelStore
            com.onesignal.common.modeling.g r7 = r7.getModel()
            com.onesignal.core.internal.config.a r7 = (com.onesignal.core.internal.config.a) r7
            boolean r7 = r7.getClearGroupOnSummaryClick()
            r8 = 0
            if (r7 == 0) goto L_0x00bd
            java.lang.String r2 = "os_group_undefined"
            boolean r2 = db.l.a(r11, r2)
            if (r2 == 0) goto L_0x009a
            r11 = -718463522(0xffffffffd52d1dde, float:-1.18964869E13)
            java.lang.Integer r11 = kotlin.coroutines.jvm.internal.b.c(r11)
            goto L_0x00b3
        L_0x009a:
            h9.b r2 = r6._dataController
            r0.L$0 = r12
            r0.L$1 = r8
            r0.L$2 = r8
            r0.label = r4
            java.lang.Object r11 = r2.getAndroidIdForGroup(r11, r5, r0)
            if (r11 != r1) goto L_0x00ab
            return r1
        L_0x00ab:
            r9 = r12
            r12 = r11
            r11 = r9
        L_0x00ae:
            java.lang.Integer r12 = (java.lang.Integer) r12
            r9 = r12
            r12 = r11
            r11 = r9
        L_0x00b3:
            if (r11 == 0) goto L_0x00d5
            int r11 = r11.intValue()
            r12.cancel(r11)
            goto L_0x00d5
        L_0x00bd:
            h9.b r11 = r6._dataController
            int r12 = r2.intValue()
            r0.L$0 = r8
            r0.L$1 = r8
            r0.L$2 = r8
            r0.label = r3
            java.lang.Object r11 = r11.markAsDismissed(r12, r0)
            if (r11 != r1) goto L_0x00d2
            return r1
        L_0x00d2:
            sa.t r11 = sa.t.f15300a
            return r11
        L_0x00d5:
            sa.t r11 = sa.t.f15300a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.notifications.internal.summary.impl.a.clearNotificationOnSummaryClick(java.lang.String, va.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object updatePossibleDependentSummaryOnDismiss(int r6, va.d r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.onesignal.notifications.internal.summary.impl.a.d
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.onesignal.notifications.internal.summary.impl.a$d r0 = (com.onesignal.notifications.internal.summary.impl.a.d) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.onesignal.notifications.internal.summary.impl.a$d r0 = new com.onesignal.notifications.internal.summary.impl.a$d
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = wa.d.c()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x003c
            if (r2 == r4) goto L_0x0034
            if (r2 != r3) goto L_0x002c
            sa.o.b(r7)
            goto L_0x005d
        L_0x002c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0034:
            java.lang.Object r6 = r0.L$0
            com.onesignal.notifications.internal.summary.impl.a r6 = (com.onesignal.notifications.internal.summary.impl.a) r6
            sa.o.b(r7)
            goto L_0x004d
        L_0x003c:
            sa.o.b(r7)
            h9.b r7 = r5._dataController
            r0.L$0 = r5
            r0.label = r4
            java.lang.Object r7 = r7.getGroupId(r6, r0)
            if (r7 != r1) goto L_0x004c
            return r1
        L_0x004c:
            r6 = r5
        L_0x004d:
            java.lang.String r7 = (java.lang.String) r7
            if (r7 == 0) goto L_0x0060
            r2 = 0
            r0.L$0 = r2
            r0.label = r3
            java.lang.Object r6 = r6.internalUpdateSummaryNotificationAfterChildRemoved(r7, r4, r0)
            if (r6 != r1) goto L_0x005d
            return r1
        L_0x005d:
            sa.t r6 = sa.t.f15300a
            return r6
        L_0x0060:
            sa.t r6 = sa.t.f15300a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.notifications.internal.summary.impl.a.updatePossibleDependentSummaryOnDismiss(int, va.d):java.lang.Object");
    }

    public Object updateSummaryNotificationAfterChildRemoved(String str, boolean z10, va.d dVar) {
        Object internalUpdateSummaryNotificationAfterChildRemoved = internalUpdateSummaryNotificationAfterChildRemoved(str, z10, dVar);
        return internalUpdateSummaryNotificationAfterChildRemoved == d.c() ? internalUpdateSummaryNotificationAfterChildRemoved : t.f15300a;
    }
}
