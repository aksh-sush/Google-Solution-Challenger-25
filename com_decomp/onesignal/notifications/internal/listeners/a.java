package com.onesignal.notifications.internal.listeners;

import android.app.Activity;
import com.onesignal.common.j;
import db.l;
import g9.h;
import g9.i;
import java.util.LinkedHashSet;
import java.util.Set;
import k9.c;
import kotlin.coroutines.jvm.internal.d;
import l7.f;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import sa.t;
import z7.b;

public final class a implements b, k9.b {
    private final com.onesignal.notifications.internal.a _activityOpener;
    private final w8.a _analyticsTracker;
    private final f _applicationService;
    private final y8.a _backend;
    private final com.onesignal.core.internal.config.b _configModelStore;
    private final q7.a _deviceService;
    private final t9.a _influenceManager;
    private final c _notificationLifecycleService;
    private final o9.b _receiveReceiptWorkManager;
    private final com.onesignal.user.internal.subscriptions.b _subscriptionManager;
    private final a8.a _time;
    private final Set<String> postedOpenedNotifIds = new LinkedHashSet();

    /* renamed from: com.onesignal.notifications.internal.listeners.a$a  reason: collision with other inner class name */
    static final class C0175a extends d {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ a this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0175a(a aVar, va.d dVar) {
            super(dVar);
            this.this$0 = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.onNotificationOpened((Activity) null, (JSONArray) null, (String) null, this);
        }
    }

    public a(f fVar, c cVar, com.onesignal.core.internal.config.b bVar, t9.a aVar, com.onesignal.user.internal.subscriptions.b bVar2, q7.a aVar2, y8.a aVar3, o9.b bVar3, com.onesignal.notifications.internal.a aVar4, w8.a aVar5, a8.a aVar6) {
        l.e(fVar, "_applicationService");
        l.e(cVar, "_notificationLifecycleService");
        l.e(bVar, "_configModelStore");
        l.e(aVar, "_influenceManager");
        l.e(bVar2, "_subscriptionManager");
        l.e(aVar2, "_deviceService");
        l.e(aVar3, "_backend");
        l.e(bVar3, "_receiveReceiptWorkManager");
        l.e(aVar4, "_activityOpener");
        l.e(aVar5, "_analyticsTracker");
        l.e(aVar6, "_time");
        this._applicationService = fVar;
        this._notificationLifecycleService = cVar;
        this._configModelStore = bVar;
        this._influenceManager = aVar;
        this._subscriptionManager = bVar2;
        this._deviceService = aVar2;
        this._backend = aVar3;
        this._receiveReceiptWorkManager = bVar3;
        this._activityOpener = aVar4;
        this._analyticsTracker = aVar5;
        this._time = aVar6;
    }

    private final boolean shouldInitDirectSessionFromNotificationOpen(Activity activity) {
        if (this._applicationService.isInForeground()) {
            return false;
        }
        try {
            return i.INSTANCE.getShouldOpenActivity(activity);
        } catch (JSONException e10) {
            e10.printStackTrace();
            return true;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(10:22|(3:24|41|(0)(0))|25|26|27|28|29|30|(1:32)(4:33|40|41|(0)(0))|32) */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00f3, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00f4, code lost:
        r13 = r3;
        r12 = r4;
        r3 = r15;
        r15 = r16;
        r11 = r17;
        r10 = r18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00fe, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00ff, code lost:
        r18 = r10;
        r19 = r11;
        r20 = r12;
        r21 = r13;
        r13 = r3;
        r12 = r4;
        r3 = r15;
        r15 = r8;
        r11 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0112, code lost:
        r9 = r19;
        r8 = r20;
        r4 = r21;
        r22 = r14;
        r14 = r2;
        r2 = r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x011d, code lost:
        com.onesignal.debug.internal.logging.a.error$default("Notification opened confirmation failed with statusCode: " + r0.getStatusCode() + " response: " + r0.getResponse(), (java.lang.Throwable) null, 2, (java.lang.Object) null);
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x015b  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0183  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x01a8 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0029  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object onNotificationOpened(android.app.Activity r26, org.json.JSONArray r27, java.lang.String r28, va.d r29) {
        /*
            r25 = this;
            r1 = r25
            r0 = r29
            boolean r2 = r0 instanceof com.onesignal.notifications.internal.listeners.a.C0175a
            if (r2 == 0) goto L_0x0017
            r2 = r0
            com.onesignal.notifications.internal.listeners.a$a r2 = (com.onesignal.notifications.internal.listeners.a.C0175a) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.label = r3
            goto L_0x001c
        L_0x0017:
            com.onesignal.notifications.internal.listeners.a$a r2 = new com.onesignal.notifications.internal.listeners.a$a
            r2.<init>(r1, r0)
        L_0x001c:
            java.lang.Object r0 = r2.result
            java.lang.Object r3 = wa.d.c()
            int r4 = r2.label
            r5 = 2
            r6 = 1
            r7 = 0
            if (r4 == 0) goto L_0x0062
            if (r4 == r6) goto L_0x003a
            if (r4 != r5) goto L_0x0032
            sa.o.b(r0)
            goto L_0x01a9
        L_0x0032:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x003a:
            int r4 = r2.I$1
            int r8 = r2.I$0
            java.lang.Object r9 = r2.L$6
            q7.a$b r9 = (q7.a.b) r9
            java.lang.Object r10 = r2.L$5
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r11 = r2.L$4
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r12 = r2.L$3
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r13 = r2.L$2
            org.json.JSONArray r13 = (org.json.JSONArray) r13
            java.lang.Object r14 = r2.L$1
            android.app.Activity r14 = (android.app.Activity) r14
            java.lang.Object r15 = r2.L$0
            com.onesignal.notifications.internal.listeners.a r15 = (com.onesignal.notifications.internal.listeners.a) r15
            sa.o.b(r0)     // Catch:{ a -> 0x005f }
            goto L_0x0142
        L_0x005f:
            r0 = move-exception
            goto L_0x011d
        L_0x0062:
            sa.o.b(r0)
            com.onesignal.core.internal.config.b r0 = r1._configModelStore
            com.onesignal.common.modeling.g r0 = r0.getModel()
            com.onesignal.core.internal.config.a r0 = (com.onesignal.core.internal.config.a) r0
            java.lang.String r0 = r0.getAppId()
            if (r0 != 0) goto L_0x0075
            java.lang.String r0 = ""
        L_0x0075:
            com.onesignal.user.internal.subscriptions.b r4 = r1._subscriptionManager
            com.onesignal.user.internal.subscriptions.c r4 = r4.getSubscriptions()
            ba.b r4 = r4.getPush()
            java.lang.String r4 = r4.getId()
            q7.a r8 = r1._deviceService
            q7.a$b r8 = r8.getDeviceType()
            int r9 = r27.length()
            r10 = 0
            r14 = r2
            r15 = r3
            r10 = r4
            r11 = r8
            r13 = r9
            r12 = 0
            r2 = r26
            r3 = r27
            r4 = r28
            r9 = r0
            r8 = r1
        L_0x009c:
            if (r12 >= r13) goto L_0x015b
            java.util.Set<java.lang.String> r0 = r8.postedOpenedNotifIds
            boolean r0 = r0.contains(r4)
            if (r0 == 0) goto L_0x00a9
            r5 = 1
            goto L_0x0156
        L_0x00a9:
            java.util.Set<java.lang.String> r0 = r8.postedOpenedNotifIds
            r0.add(r4)
            y8.a r0 = r8._backend     // Catch:{ a -> 0x00fe }
            r14.L$0 = r8     // Catch:{ a -> 0x00fe }
            r14.L$1 = r2     // Catch:{ a -> 0x00fe }
            r14.L$2 = r3     // Catch:{ a -> 0x00fe }
            r14.L$3 = r4     // Catch:{ a -> 0x00fe }
            r14.L$4 = r9     // Catch:{ a -> 0x00fe }
            r14.L$5 = r10     // Catch:{ a -> 0x00fe }
            r14.L$6 = r11     // Catch:{ a -> 0x00fe }
            r14.I$0 = r12     // Catch:{ a -> 0x00fe }
            r14.I$1 = r13     // Catch:{ a -> 0x00fe }
            r14.label = r6     // Catch:{ a -> 0x00fe }
            r16 = r8
            r8 = r0
            r17 = r9
            r18 = r10
            r10 = r4
            r19 = r11
            r11 = r18
            r20 = r12
            r12 = r19
            r21 = r13
            r13 = r14
            java.lang.Object r0 = r8.updateNotificationAsOpened(r9, r10, r11, r12, r13)     // Catch:{ a -> 0x00f3 }
            if (r0 != r15) goto L_0x00de
            return r15
        L_0x00de:
            r13 = r3
            r12 = r4
            r3 = r15
            r15 = r16
            r11 = r17
            r10 = r18
            r9 = r19
            r8 = r20
            r4 = r21
            r22 = r14
            r14 = r2
            r2 = r22
            goto L_0x0142
        L_0x00f3:
            r0 = move-exception
            r13 = r3
            r12 = r4
            r3 = r15
            r15 = r16
            r11 = r17
            r10 = r18
            goto L_0x0112
        L_0x00fe:
            r0 = move-exception
            r16 = r8
            r17 = r9
            r18 = r10
            r19 = r11
            r20 = r12
            r21 = r13
            r13 = r3
            r12 = r4
            r3 = r15
            r15 = r16
            r11 = r17
        L_0x0112:
            r9 = r19
            r8 = r20
            r4 = r21
            r22 = r14
            r14 = r2
            r2 = r22
        L_0x011d:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r5 = "Notification opened confirmation failed with statusCode: "
            r6.append(r5)
            int r5 = r0.getStatusCode()
            r6.append(r5)
            java.lang.String r5 = " response: "
            r6.append(r5)
            java.lang.String r0 = r0.getResponse()
            r6.append(r0)
            java.lang.String r0 = r6.toString()
            r5 = 2
            com.onesignal.debug.internal.logging.a.error$default(r0, r7, r5, r7)
        L_0x0142:
            r5 = 1
            r22 = r14
            r14 = r2
            r2 = r22
            r23 = r15
            r15 = r3
            r3 = r13
            r13 = r4
            r4 = r12
            r12 = r8
            r8 = r23
            r24 = r11
            r11 = r9
            r9 = r24
        L_0x0156:
            int r12 = r12 + r5
            r5 = 2
            r6 = 1
            goto L_0x009c
        L_0x015b:
            r16 = r8
            g9.h r0 = g9.h.INSTANCE
            a8.a r5 = r8._time
            com.onesignal.notifications.internal.d r5 = r0.generateNotificationOpenedResult$com_onesignal_notifications(r3, r5)
            w8.a r6 = r8._analyticsTracker
            com.onesignal.notifications.f r9 = r5.getNotification()
            java.lang.String r9 = r9.getNotificationId()
            db.l.b(r9)
            com.onesignal.notifications.f r5 = r5.getNotification()
            java.lang.String r0 = r0.getCampaignNameFromNotification(r5)
            r6.trackOpenedEvent(r9, r0)
            boolean r0 = r8.shouldInitDirectSessionFromNotificationOpen(r2)
            if (r0 == 0) goto L_0x018f
            l7.f r0 = r8._applicationService
            l7.b r5 = l7.b.NOTIFICATION_CLICK
            r0.setEntryState(r5)
            t9.a r0 = r8._influenceManager
            r0.onDirectInfluenceFromNotification(r4)
        L_0x018f:
            com.onesignal.notifications.internal.a r0 = r8._activityOpener
            r14.L$0 = r7
            r14.L$1 = r7
            r14.L$2 = r7
            r14.L$3 = r7
            r14.L$4 = r7
            r14.L$5 = r7
            r14.L$6 = r7
            r4 = 2
            r14.label = r4
            java.lang.Object r0 = r0.openDestinationActivity(r2, r3, r14)
            if (r0 != r15) goto L_0x01a9
            return r15
        L_0x01a9:
            sa.t r0 = sa.t.f15300a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.notifications.internal.listeners.a.onNotificationOpened(android.app.Activity, org.json.JSONArray, java.lang.String, va.d):java.lang.Object");
    }

    public Object onNotificationReceived(g9.d dVar, va.d dVar2) {
        this._receiveReceiptWorkManager.enqueueReceiveReceipt(dVar.getApiNotificationId());
        this._influenceManager.onNotificationReceived(dVar.getApiNotificationId());
        try {
            JSONObject jSONObject = new JSONObject(dVar.getJsonPayload().toString());
            jSONObject.put("androidNotificationId", dVar.getAndroidId());
            h hVar = h.INSTANCE;
            com.onesignal.notifications.internal.d generateNotificationOpenedResult$com_onesignal_notifications = hVar.generateNotificationOpenedResult$com_onesignal_notifications(j.INSTANCE.wrapInJsonArray(jSONObject), this._time);
            w8.a aVar = this._analyticsTracker;
            String notificationId = generateNotificationOpenedResult$com_onesignal_notifications.getNotification().getNotificationId();
            l.b(notificationId);
            aVar.trackReceivedEvent(notificationId, hVar.getCampaignNameFromNotification(generateNotificationOpenedResult$com_onesignal_notifications.getNotification()));
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
        return t.f15300a;
    }

    public void start() {
        this._notificationLifecycleService.addInternalNotificationLifecycleEventHandler(this);
    }
}
