package com.onesignal.notifications.internal.open.impl;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.core.app.k0;
import db.l;
import g9.h;
import org.json.JSONArray;
import sa.t;

public final class b implements m9.a {
    private final com.onesignal.core.internal.config.b _configModelStore;
    private final h9.b _dataController;
    private final k9.c _lifecycleService;
    private final r9.a _summaryManager;

    static final class a extends kotlin.coroutines.jvm.internal.d {
        Object L$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ b this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(b bVar, va.d dVar) {
            super(dVar);
            this.this$0 = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.addChildNotifications((JSONArray) null, (String) null, this);
        }
    }

    /* renamed from: com.onesignal.notifications.internal.open.impl.b$b  reason: collision with other inner class name */
    static final class C0176b extends kotlin.coroutines.jvm.internal.d {
        Object L$0;
        Object L$1;
        Object L$2;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ b this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0176b(b bVar, va.d dVar) {
            super(dVar);
            this.this$0 = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.markNotificationsConsumed((Context) null, (Intent) null, false, this);
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.d {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ b this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(b bVar, va.d dVar) {
            super(dVar);
            this.this$0 = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.processIntent((Context) null, (Intent) null, this);
        }
    }

    static final class d extends kotlin.coroutines.jvm.internal.d {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ b this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(b bVar, va.d dVar) {
            super(dVar);
            this.this$0 = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.processToOpenIntent((Context) null, (Intent) null, (String) null, this);
        }
    }

    public b(r9.a aVar, h9.b bVar, com.onesignal.core.internal.config.b bVar2, k9.c cVar) {
        l.e(aVar, "_summaryManager");
        l.e(bVar, "_dataController");
        l.e(bVar2, "_configModelStore");
        l.e(cVar, "_lifecycleService");
        this._summaryManager = aVar;
        this._dataController = bVar;
        this._configModelStore = bVar2;
        this._lifecycleService = cVar;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0051 A[LOOP:0: B:16:0x004b->B:18:0x0051, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object addChildNotifications(org.json.JSONArray r5, java.lang.String r6, va.d r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.onesignal.notifications.internal.open.impl.b.a
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.onesignal.notifications.internal.open.impl.b$a r0 = (com.onesignal.notifications.internal.open.impl.b.a) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.onesignal.notifications.internal.open.impl.b$a r0 = new com.onesignal.notifications.internal.open.impl.b$a
            r0.<init>(r4, r7)
        L_0x0018:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = wa.d.c()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            java.lang.Object r5 = r0.L$0
            org.json.JSONArray r5 = (org.json.JSONArray) r5
            sa.o.b(r7)
            goto L_0x0045
        L_0x002d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0035:
            sa.o.b(r7)
            h9.b r7 = r4._dataController
            r0.L$0 = r5
            r0.label = r3
            java.lang.Object r7 = r7.listNotificationsForGroup(r6, r0)
            if (r7 != r1) goto L_0x0045
            return r1
        L_0x0045:
            java.util.List r7 = (java.util.List) r7
            java.util.Iterator r6 = r7.iterator()
        L_0x004b:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x0064
            java.lang.Object r7 = r6.next()
            h9.b$b r7 = (h9.b.C0231b) r7
            org.json.JSONObject r0 = new org.json.JSONObject
            java.lang.String r7 = r7.getFullData()
            r0.<init>(r7)
            r5.put(r0)
            goto L_0x004b
        L_0x0064:
            sa.t r5 = sa.t.f15300a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.notifications.internal.open.impl.b.addChildNotifications(org.json.JSONArray, java.lang.String, va.d):java.lang.Object");
    }

    /* access modifiers changed from: private */
    public final Object clearStatusBarNotifications(Context context, String str, va.d dVar) {
        if (str != null) {
            Object clearNotificationOnSummaryClick = this._summaryManager.clearNotificationOnSummaryClick(str, dVar);
            return clearNotificationOnSummaryClick == d.c() ? clearNotificationOnSummaryClick : t.f15300a;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            h hVar = h.INSTANCE;
            if (hVar.getGrouplessNotifsCount(context) < 1) {
                hVar.getNotificationManager(context).cancel(h.GROUPLESS_SUMMARY_ID);
            }
        }
        return t.f15300a;
    }

    private final void handleDismissFromActionButtonPress(Context context, Intent intent) {
        if (intent.getBooleanExtra("action_button", false)) {
            l.b(context);
            k0.d(context).b(intent.getIntExtra("androidNotificationId", 0));
            if (Build.VERSION.SDK_INT < 31) {
                context.sendBroadcast(new Intent("android.intent.action.CLOSE_SYSTEM_DIALOGS"));
            }
        }
    }

    private final boolean isOneSignalIntent(Intent intent) {
        return intent.hasExtra("onesignalData") || intent.hasExtra("summary") || intent.hasExtra("androidNotificationId");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x008c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object markNotificationsConsumed(android.content.Context r8, android.content.Intent r9, boolean r10, va.d r11) {
        /*
            r7 = this;
            boolean r0 = r11 instanceof com.onesignal.notifications.internal.open.impl.b.C0176b
            if (r0 == 0) goto L_0x0013
            r0 = r11
            com.onesignal.notifications.internal.open.impl.b$b r0 = (com.onesignal.notifications.internal.open.impl.b.C0176b) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.onesignal.notifications.internal.open.impl.b$b r0 = new com.onesignal.notifications.internal.open.impl.b$b
            r0.<init>(r7, r11)
        L_0x0018:
            r6 = r0
            java.lang.Object r11 = r6.result
            java.lang.Object r0 = wa.d.c()
            int r1 = r6.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L_0x0049
            if (r1 == r3) goto L_0x0035
            if (r1 != r2) goto L_0x002d
            sa.o.b(r11)
            goto L_0x008d
        L_0x002d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0035:
            boolean r10 = r6.Z$0
            java.lang.Object r8 = r6.L$2
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r9 = r6.L$1
            android.content.Intent r9 = (android.content.Intent) r9
            java.lang.Object r1 = r6.L$0
            com.onesignal.notifications.internal.open.impl.b r1 = (com.onesignal.notifications.internal.open.impl.b) r1
            sa.o.b(r11)
            r4 = r8
            r3 = r10
            goto L_0x0066
        L_0x0049:
            sa.o.b(r11)
            java.lang.String r11 = "summary"
            java.lang.String r11 = r9.getStringExtra(r11)
            r6.L$0 = r7
            r6.L$1 = r9
            r6.L$2 = r11
            r6.Z$0 = r10
            r6.label = r3
            java.lang.Object r8 = r7.clearStatusBarNotifications(r8, r11, r6)
            if (r8 != r0) goto L_0x0063
            return r0
        L_0x0063:
            r1 = r7
            r3 = r10
            r4 = r11
        L_0x0066:
            h9.b r8 = r1._dataController
            java.lang.String r10 = "androidNotificationId"
            r11 = 0
            int r9 = r9.getIntExtra(r10, r11)
            com.onesignal.core.internal.config.b r10 = r1._configModelStore
            com.onesignal.common.modeling.g r10 = r10.getModel()
            com.onesignal.core.internal.config.a r10 = (com.onesignal.core.internal.config.a) r10
            boolean r5 = r10.getClearGroupOnSummaryClick()
            r10 = 0
            r6.L$0 = r10
            r6.L$1 = r10
            r6.L$2 = r10
            r6.label = r2
            r1 = r8
            r2 = r9
            java.lang.Object r8 = r1.markAsConsumed(r2, r3, r4, r5, r6)
            if (r8 != r0) goto L_0x008d
            return r0
        L_0x008d:
            sa.t r8 = sa.t.f15300a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.notifications.internal.open.impl.b.markNotificationsConsumed(android.content.Context, android.content.Intent, boolean, va.d):java.lang.Object");
    }

    private final ContentValues newContentValuesWithConsumed(Intent intent) {
        ContentValues contentValues = new ContentValues();
        if (intent.getBooleanExtra("dismissed", false)) {
            contentValues.put("dismissed", 1);
        } else {
            contentValues.put("opened", 1);
        }
        return contentValues;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00cd A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00f5 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00f6  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x011e  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0138  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object processIntent(android.content.Context r12, android.content.Intent r13, va.d r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof com.onesignal.notifications.internal.open.impl.b.c
            if (r0 == 0) goto L_0x0013
            r0 = r14
            com.onesignal.notifications.internal.open.impl.b$c r0 = (com.onesignal.notifications.internal.open.impl.b.c) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.onesignal.notifications.internal.open.impl.b$c r0 = new com.onesignal.notifications.internal.open.impl.b$c
            r0.<init>(r11, r14)
        L_0x0018:
            java.lang.Object r14 = r0.result
            java.lang.Object r1 = wa.d.c()
            int r2 = r0.label
            r3 = 4
            r4 = 3
            r5 = 1
            r6 = 2
            r7 = 0
            if (r2 == 0) goto L_0x008a
            if (r2 == r5) goto L_0x006e
            if (r2 == r6) goto L_0x0053
            if (r2 == r4) goto L_0x003c
            if (r2 != r3) goto L_0x0034
            sa.o.b(r14)
            goto L_0x017c
        L_0x0034:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L_0x003c:
            boolean r12 = r0.Z$0
            java.lang.Object r13 = r0.L$3
            com.onesignal.notifications.internal.open.impl.a r13 = (com.onesignal.notifications.internal.open.impl.a) r13
            java.lang.Object r2 = r0.L$2
            android.content.Intent r2 = (android.content.Intent) r2
            java.lang.Object r4 = r0.L$1
            android.content.Context r4 = (android.content.Context) r4
            java.lang.Object r5 = r0.L$0
            com.onesignal.notifications.internal.open.impl.b r5 = (com.onesignal.notifications.internal.open.impl.b) r5
            sa.o.b(r14)
            goto L_0x00f9
        L_0x0053:
            boolean r12 = r0.Z$0
            java.lang.Object r13 = r0.L$4
            com.onesignal.notifications.internal.open.impl.a r13 = (com.onesignal.notifications.internal.open.impl.a) r13
            java.lang.Object r2 = r0.L$3
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r5 = r0.L$2
            android.content.Intent r5 = (android.content.Intent) r5
            java.lang.Object r8 = r0.L$1
            android.content.Context r8 = (android.content.Context) r8
            java.lang.Object r9 = r0.L$0
            com.onesignal.notifications.internal.open.impl.b r9 = (com.onesignal.notifications.internal.open.impl.b) r9
            sa.o.b(r14)
            goto L_0x00d5
        L_0x006e:
            boolean r12 = r0.Z$0
            java.lang.Object r13 = r0.L$3
            java.lang.String r13 = (java.lang.String) r13
            java.lang.Object r2 = r0.L$2
            android.content.Intent r2 = (android.content.Intent) r2
            java.lang.Object r5 = r0.L$1
            android.content.Context r5 = (android.content.Context) r5
            java.lang.Object r8 = r0.L$0
            com.onesignal.notifications.internal.open.impl.b r8 = (com.onesignal.notifications.internal.open.impl.b) r8
            sa.o.b(r14)
            r10 = r2
            r2 = r12
            r12 = r5
            r5 = r14
            r14 = r13
            r13 = r10
            goto L_0x00b0
        L_0x008a:
            sa.o.b(r14)
            java.lang.String r14 = "summary"
            java.lang.String r14 = r13.getStringExtra(r14)
            java.lang.String r2 = "dismissed"
            r8 = 0
            boolean r2 = r13.getBooleanExtra(r2, r8)
            if (r2 != 0) goto L_0x00b7
            r0.L$0 = r11
            r0.L$1 = r12
            r0.L$2 = r13
            r0.L$3 = r14
            r0.Z$0 = r2
            r0.label = r5
            java.lang.Object r5 = r11.processToOpenIntent(r12, r13, r14, r0)
            if (r5 != r1) goto L_0x00af
            return r1
        L_0x00af:
            r8 = r11
        L_0x00b0:
            com.onesignal.notifications.internal.open.impl.a r5 = (com.onesignal.notifications.internal.open.impl.a) r5
            if (r5 != 0) goto L_0x00b9
            sa.t r12 = sa.t.f15300a
            return r12
        L_0x00b7:
            r8 = r11
            r5 = r7
        L_0x00b9:
            r0.L$0 = r8
            r0.L$1 = r12
            r0.L$2 = r13
            r0.L$3 = r14
            r0.L$4 = r5
            r0.Z$0 = r2
            r0.label = r6
            java.lang.Object r9 = r8.markNotificationsConsumed(r12, r13, r2, r0)
            if (r9 != r1) goto L_0x00ce
            return r1
        L_0x00ce:
            r9 = r8
            r8 = r12
            r12 = r2
            r2 = r14
            r10 = r5
            r5 = r13
            r13 = r10
        L_0x00d5:
            if (r2 != 0) goto L_0x00fc
            java.lang.String r14 = "grp"
            java.lang.String r14 = r5.getStringExtra(r14)
            if (r14 == 0) goto L_0x00fc
            r9.a r2 = r9._summaryManager
            r0.L$0 = r9
            r0.L$1 = r8
            r0.L$2 = r5
            r0.L$3 = r13
            r0.L$4 = r7
            r0.Z$0 = r12
            r0.label = r4
            java.lang.Object r14 = r2.updateSummaryNotificationAfterChildRemoved(r14, r12, r0)
            if (r14 != r1) goto L_0x00f6
            return r1
        L_0x00f6:
            r2 = r5
            r4 = r8
            r5 = r9
        L_0x00f9:
            r8 = r4
            r9 = r5
            r5 = r2
        L_0x00fc:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r2 = "processIntent from context: "
            r14.append(r2)
            r14.append(r8)
            java.lang.String r2 = " and intent: "
            r14.append(r2)
            r14.append(r5)
            java.lang.String r14 = r14.toString()
            com.onesignal.debug.internal.logging.a.debug$default(r14, r7, r6, r7)
            android.os.Bundle r14 = r5.getExtras()
            if (r14 == 0) goto L_0x0136
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r2 = "processIntent intent extras: "
            r14.append(r2)
            android.os.Bundle r2 = r5.getExtras()
            r14.append(r2)
            java.lang.String r14 = r14.toString()
            com.onesignal.debug.internal.logging.a.debug$default(r14, r7, r6, r7)
        L_0x0136:
            if (r12 != 0) goto L_0x017f
            boolean r12 = r8 instanceof android.app.Activity
            if (r12 != 0) goto L_0x0151
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "NotificationOpenedProcessor processIntent from an non Activity context: "
            r12.append(r13)
            r12.append(r8)
            java.lang.String r12 = r12.toString()
            com.onesignal.debug.internal.logging.a.error$default(r12, r7, r6, r7)
            goto L_0x017f
        L_0x0151:
            k9.c r12 = r9._lifecycleService
            android.app.Activity r8 = (android.app.Activity) r8
            db.l.b(r13)
            org.json.JSONArray r14 = r13.getDataArray()
            g9.c r2 = g9.c.INSTANCE
            org.json.JSONObject r13 = r13.getJsonData()
            java.lang.String r13 = r2.getOSNotificationIdFromJson(r13)
            db.l.b(r13)
            r0.L$0 = r7
            r0.L$1 = r7
            r0.L$2 = r7
            r0.L$3 = r7
            r0.L$4 = r7
            r0.label = r3
            java.lang.Object r12 = r12.notificationOpened(r8, r14, r13, r0)
            if (r12 != r1) goto L_0x017c
            return r1
        L_0x017c:
            sa.t r12 = sa.t.f15300a
            return r12
        L_0x017f:
            sa.t r12 = sa.t.f15300a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.notifications.internal.open.impl.b.processIntent(android.content.Context, android.content.Intent, va.d):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v12, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v8, resolved type: java.lang.String} */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00a2 A[Catch:{ JSONException -> 0x0057 }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0029  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object processToOpenIntent(android.content.Context r10, android.content.Intent r11, java.lang.String r12, va.d r13) {
        /*
            r9 = this;
            java.lang.String r0 = "androidNotificationId"
            boolean r1 = r13 instanceof com.onesignal.notifications.internal.open.impl.b.d
            if (r1 == 0) goto L_0x0015
            r1 = r13
            com.onesignal.notifications.internal.open.impl.b$d r1 = (com.onesignal.notifications.internal.open.impl.b.d) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0015
            int r2 = r2 - r3
            r1.label = r2
            goto L_0x001a
        L_0x0015:
            com.onesignal.notifications.internal.open.impl.b$d r1 = new com.onesignal.notifications.internal.open.impl.b$d
            r1.<init>(r9, r13)
        L_0x001a:
            java.lang.Object r13 = r1.result
            java.lang.Object r2 = wa.d.c()
            int r3 = r1.label
            r4 = 1
            java.lang.String r5 = "onesignalData"
            r6 = 2
            r7 = 0
            if (r3 == 0) goto L_0x005a
            if (r3 == r4) goto L_0x0042
            if (r3 != r6) goto L_0x003a
            java.lang.Object r10 = r1.L$1
            org.json.JSONObject r10 = (org.json.JSONObject) r10
            java.lang.Object r11 = r1.L$0
            org.json.JSONArray r11 = (org.json.JSONArray) r11
            sa.o.b(r13)
            goto L_0x00e3
        L_0x003a:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x0042:
            java.lang.Object r10 = r1.L$3
            org.json.JSONObject r10 = (org.json.JSONObject) r10
            java.lang.Object r11 = r1.L$2
            r12 = r11
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r11 = r1.L$1
            android.content.Intent r11 = (android.content.Intent) r11
            java.lang.Object r3 = r1.L$0
            com.onesignal.notifications.internal.open.impl.b r3 = (com.onesignal.notifications.internal.open.impl.b) r3
            sa.o.b(r13)     // Catch:{ JSONException -> 0x0057 }
            goto L_0x009a
        L_0x0057:
            r11 = move-exception
            goto L_0x00c9
        L_0x005a:
            sa.o.b(r13)
            org.json.JSONObject r13 = new org.json.JSONObject     // Catch:{ JSONException -> 0x00c6 }
            java.lang.String r3 = r11.getStringExtra(r5)     // Catch:{ JSONException -> 0x00c6 }
            r13.<init>(r3)     // Catch:{ JSONException -> 0x00c6 }
            boolean r3 = r10 instanceof android.app.Activity     // Catch:{ JSONException -> 0x00c2 }
            if (r3 != 0) goto L_0x0081
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x00c2 }
            r3.<init>()     // Catch:{ JSONException -> 0x00c2 }
            java.lang.String r4 = "NotificationOpenedProcessor processIntent from an non Activity context: "
            r3.append(r4)     // Catch:{ JSONException -> 0x00c2 }
            r3.append(r10)     // Catch:{ JSONException -> 0x00c2 }
            java.lang.String r10 = r3.toString()     // Catch:{ JSONException -> 0x00c2 }
            com.onesignal.debug.internal.logging.a.error$default(r10, r7, r6, r7)     // Catch:{ JSONException -> 0x00c2 }
            r3 = r9
            r10 = r13
            goto L_0x00a3
        L_0x0081:
            k9.c r3 = r9._lifecycleService     // Catch:{ JSONException -> 0x00c2 }
            android.app.Activity r10 = (android.app.Activity) r10     // Catch:{ JSONException -> 0x00c2 }
            r1.L$0 = r9     // Catch:{ JSONException -> 0x00c2 }
            r1.L$1 = r11     // Catch:{ JSONException -> 0x00c2 }
            r1.L$2 = r12     // Catch:{ JSONException -> 0x00c2 }
            r1.L$3 = r13     // Catch:{ JSONException -> 0x00c2 }
            r1.label = r4     // Catch:{ JSONException -> 0x00c2 }
            java.lang.Object r10 = r3.canOpenNotification(r10, r13, r1)     // Catch:{ JSONException -> 0x00c2 }
            if (r10 != r2) goto L_0x0096
            return r2
        L_0x0096:
            r3 = r9
            r8 = r13
            r13 = r10
            r10 = r8
        L_0x009a:
            java.lang.Boolean r13 = (java.lang.Boolean) r13     // Catch:{ JSONException -> 0x0057 }
            boolean r13 = r13.booleanValue()     // Catch:{ JSONException -> 0x0057 }
            if (r13 != 0) goto L_0x00a3
            return r7
        L_0x00a3:
            r13 = 0
            int r13 = r11.getIntExtra(r0, r13)     // Catch:{ JSONException -> 0x0057 }
            r10.put(r0, r13)     // Catch:{ JSONException -> 0x0057 }
            java.lang.String r13 = r10.toString()     // Catch:{ JSONException -> 0x0057 }
            r11.putExtra(r5, r13)     // Catch:{ JSONException -> 0x0057 }
            com.onesignal.common.j r13 = com.onesignal.common.j.INSTANCE     // Catch:{ JSONException -> 0x0057 }
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0057 }
            java.lang.String r11 = r11.getStringExtra(r5)     // Catch:{ JSONException -> 0x0057 }
            r0.<init>(r11)     // Catch:{ JSONException -> 0x0057 }
            org.json.JSONArray r11 = r13.wrapInJsonArray(r0)     // Catch:{ JSONException -> 0x0057 }
            goto L_0x00cd
        L_0x00c2:
            r11 = move-exception
            r3 = r9
            r10 = r13
            goto L_0x00c9
        L_0x00c6:
            r11 = move-exception
            r3 = r9
            r10 = r7
        L_0x00c9:
            r11.printStackTrace()
            r11 = r7
        L_0x00cd:
            if (r12 == 0) goto L_0x00e3
            db.l.b(r11)
            r1.L$0 = r11
            r1.L$1 = r10
            r1.L$2 = r7
            r1.L$3 = r7
            r1.label = r6
            java.lang.Object r12 = r3.addChildNotifications(r11, r12, r1)
            if (r12 != r2) goto L_0x00e3
            return r2
        L_0x00e3:
            com.onesignal.notifications.internal.open.impl.a r12 = new com.onesignal.notifications.internal.open.impl.a
            db.l.b(r11)
            db.l.b(r10)
            r12.<init>(r11, r10)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.notifications.internal.open.impl.b.processToOpenIntent(android.content.Context, android.content.Intent, java.lang.String, va.d):java.lang.Object");
    }

    public Object processFromContext(Context context, Intent intent, va.d dVar) {
        if (!isOneSignalIntent(intent)) {
            return t.f15300a;
        }
        handleDismissFromActionButtonPress(context, intent);
        Object processIntent = processIntent(context, intent, dVar);
        return processIntent == d.c() ? processIntent : t.f15300a;
    }
}
