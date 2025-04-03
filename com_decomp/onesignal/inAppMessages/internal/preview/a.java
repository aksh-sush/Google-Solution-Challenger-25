package com.onesignal.inAppMessages.internal.preview;

import android.app.Activity;
import db.l;
import g9.h;
import k9.c;
import kotlin.coroutines.jvm.internal.d;
import l7.f;
import org.json.JSONException;
import org.json.JSONObject;

public final class a implements z7.b, k9.a {
    private final f _applicationService;
    private final h8.a _iamDisplayer;
    private final com.onesignal.notifications.internal.a _notificationActivityOpener;
    private final i9.b _notificationDisplayer;
    private final c _notificationLifeCycle;
    private final o8.a _state;
    private final a8.a _time;

    /* renamed from: com.onesignal.inAppMessages.internal.preview.a$a  reason: collision with other inner class name */
    static final class C0148a extends d {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ a this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0148a(a aVar, va.d dVar) {
            super(dVar);
            this.this$0 = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.canOpenNotification((Activity) null, (JSONObject) null, this);
        }
    }

    static final class b extends d {
        Object L$0;
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
            return this.this$0.canReceiveNotification((JSONObject) null, this);
        }
    }

    public a(h8.a aVar, f fVar, i9.b bVar, com.onesignal.notifications.internal.a aVar2, c cVar, o8.a aVar3, a8.a aVar4) {
        l.e(aVar, "_iamDisplayer");
        l.e(fVar, "_applicationService");
        l.e(bVar, "_notificationDisplayer");
        l.e(aVar2, "_notificationActivityOpener");
        l.e(cVar, "_notificationLifeCycle");
        l.e(aVar3, "_state");
        l.e(aVar4, "_time");
        this._iamDisplayer = aVar;
        this._applicationService = fVar;
        this._notificationDisplayer = bVar;
        this._notificationActivityOpener = aVar2;
        this._notificationLifeCycle = cVar;
        this._state = aVar3;
        this._time = aVar4;
    }

    private final String inAppPreviewPushUUID(JSONObject jSONObject) {
        JSONObject optJSONObject;
        try {
            JSONObject customJSONObject = h.INSTANCE.getCustomJSONObject(jSONObject);
            if (customJSONObject.has(d9.a.PUSH_ADDITIONAL_DATA_KEY) && (optJSONObject = customJSONObject.optJSONObject(d9.a.PUSH_ADDITIONAL_DATA_KEY)) != null && optJSONObject.has("os_in_app_message_preview_id")) {
                return optJSONObject.optString("os_in_app_message_preview_id");
            }
            return null;
        } catch (JSONException unused) {
            return null;
        }
    }

    private final boolean shouldDisplayNotification() {
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0086 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object canOpenNotification(android.app.Activity r8, org.json.JSONObject r9, va.d r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof com.onesignal.inAppMessages.internal.preview.a.C0148a
            if (r0 == 0) goto L_0x0013
            r0 = r10
            com.onesignal.inAppMessages.internal.preview.a$a r0 = (com.onesignal.inAppMessages.internal.preview.a.C0148a) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.onesignal.inAppMessages.internal.preview.a$a r0 = new com.onesignal.inAppMessages.internal.preview.a$a
            r0.<init>(r7, r10)
        L_0x0018:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = wa.d.c()
            int r2 = r0.label
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x0047
            if (r2 == r5) goto L_0x0039
            if (r2 != r4) goto L_0x0031
            java.lang.Object r8 = r0.L$0
            com.onesignal.inAppMessages.internal.preview.a r8 = (com.onesignal.inAppMessages.internal.preview.a) r8
            sa.o.b(r10)
            goto L_0x0087
        L_0x0031:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0039:
            java.lang.Object r8 = r0.L$1
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r9 = r0.L$0
            com.onesignal.inAppMessages.internal.preview.a r9 = (com.onesignal.inAppMessages.internal.preview.a) r9
            sa.o.b(r10)
            r10 = r8
            r8 = r9
            goto L_0x0073
        L_0x0047:
            sa.o.b(r10)
            java.lang.String r10 = r7.inAppPreviewPushUUID(r9)
            if (r10 != 0) goto L_0x0055
            java.lang.Boolean r8 = kotlin.coroutines.jvm.internal.b.a(r5)
            return r8
        L_0x0055:
            com.onesignal.notifications.internal.a r2 = r7._notificationActivityOpener
            org.json.JSONArray r6 = new org.json.JSONArray
            r6.<init>()
            org.json.JSONArray r9 = r6.put(r9)
            java.lang.String r6 = "JSONArray().put(jsonData)"
            db.l.d(r9, r6)
            r0.L$0 = r7
            r0.L$1 = r10
            r0.label = r5
            java.lang.Object r8 = r2.openDestinationActivity(r8, r9, r0)
            if (r8 != r1) goto L_0x0072
            return r1
        L_0x0072:
            r8 = r7
        L_0x0073:
            o8.a r9 = r8._state
            r9.setInAppMessageIdShowing(r10)
            h8.a r9 = r8._iamDisplayer
            r0.L$0 = r8
            r0.L$1 = r3
            r0.label = r4
            java.lang.Object r10 = r9.displayPreviewMessage(r10, r0)
            if (r10 != r1) goto L_0x0087
            return r1
        L_0x0087:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r9 = r10.booleanValue()
            if (r9 != 0) goto L_0x0094
            o8.a r8 = r8._state
            r8.setInAppMessageIdShowing(r3)
        L_0x0094:
            r8 = 0
            java.lang.Boolean r8 = kotlin.coroutines.jvm.internal.b.a(r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.inAppMessages.internal.preview.a.canOpenNotification(android.app.Activity, org.json.JSONObject, va.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object canReceiveNotification(org.json.JSONObject r6, va.d r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.onesignal.inAppMessages.internal.preview.a.b
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.onesignal.inAppMessages.internal.preview.a$b r0 = (com.onesignal.inAppMessages.internal.preview.a.b) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.onesignal.inAppMessages.internal.preview.a$b r0 = new com.onesignal.inAppMessages.internal.preview.a$b
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
            goto L_0x008c
        L_0x002c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0034:
            java.lang.Object r6 = r0.L$0
            com.onesignal.inAppMessages.internal.preview.a r6 = (com.onesignal.inAppMessages.internal.preview.a) r6
            sa.o.b(r7)
            goto L_0x0065
        L_0x003c:
            sa.o.b(r7)
            java.lang.String r7 = r5.inAppPreviewPushUUID(r6)
            if (r7 != 0) goto L_0x004a
            java.lang.Boolean r6 = kotlin.coroutines.jvm.internal.b.a(r4)
            return r6
        L_0x004a:
            l7.f r2 = r5._applicationService
            boolean r2 = r2.isInForeground()
            if (r2 == 0) goto L_0x0074
            o8.a r6 = r5._state
            r6.setInAppMessageIdShowing(r7)
            h8.a r6 = r5._iamDisplayer
            r0.L$0 = r5
            r0.label = r4
            java.lang.Object r7 = r6.displayPreviewMessage(r7, r0)
            if (r7 != r1) goto L_0x0064
            return r1
        L_0x0064:
            r6 = r5
        L_0x0065:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 != 0) goto L_0x008c
            o8.a r6 = r6._state
            r7 = 0
            r6.setInAppMessageIdShowing(r7)
            goto L_0x008c
        L_0x0074:
            boolean r7 = r5.shouldDisplayNotification()
            if (r7 == 0) goto L_0x008c
            g9.d r7 = new g9.d
            a8.a r2 = r5._time
            r7.<init>((org.json.JSONObject) r6, (a8.a) r2)
            i9.b r6 = r5._notificationDisplayer
            r0.label = r3
            java.lang.Object r6 = r6.displayNotification(r7, r0)
            if (r6 != r1) goto L_0x008c
            return r1
        L_0x008c:
            r6 = 0
            java.lang.Boolean r6 = kotlin.coroutines.jvm.internal.b.a(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.inAppMessages.internal.preview.a.canReceiveNotification(org.json.JSONObject, va.d):java.lang.Object");
    }

    public void start() {
        this._notificationLifeCycle.setInternalNotificationLifecycleCallback(this);
    }
}
