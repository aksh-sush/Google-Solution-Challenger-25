package com.onesignal.notifications.internal.open.impl;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.onesignal.common.j;
import db.l;
import g9.h;
import kotlin.coroutines.jvm.internal.d;
import m9.b;
import org.json.JSONException;
import org.json.JSONObject;
import sa.t;

public final class c implements b {
    private final k9.c _lifecycleService;

    static final class a extends d {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ c this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(c cVar, va.d dVar) {
            super(dVar);
            this.this$0 = cVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.handleProcessJsonOpenData((Activity) null, (JSONObject) null, this);
        }
    }

    public c(k9.c cVar) {
        l.e(cVar, "_lifecycleService");
        this._lifecycleService = cVar;
    }

    private final JSONObject covertHMSOpenIntentToJson(Intent intent) {
        if (!g9.c.INSTANCE.isOneSignalIntent(intent)) {
            return null;
        }
        l.b(intent);
        Bundle extras = intent.getExtras();
        j jVar = j.INSTANCE;
        l.b(extras);
        JSONObject bundleAsJSONObject = jVar.bundleAsJSONObject(extras);
        reformatButtonClickAction(bundleAsJSONObject);
        return bundleAsJSONObject;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: org.json.JSONObject} */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object handleProcessJsonOpenData(android.app.Activity r6, org.json.JSONObject r7, va.d r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.onesignal.notifications.internal.open.impl.c.a
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.onesignal.notifications.internal.open.impl.c$a r0 = (com.onesignal.notifications.internal.open.impl.c.a) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.onesignal.notifications.internal.open.impl.c$a r0 = new com.onesignal.notifications.internal.open.impl.c$a
            r0.<init>(r5, r8)
        L_0x0018:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = wa.d.c()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0045
            if (r2 == r4) goto L_0x0034
            if (r2 != r3) goto L_0x002c
            sa.o.b(r8)
            goto L_0x0086
        L_0x002c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0034:
            java.lang.Object r6 = r0.L$2
            r7 = r6
            org.json.JSONObject r7 = (org.json.JSONObject) r7
            java.lang.Object r6 = r0.L$1
            android.app.Activity r6 = (android.app.Activity) r6
            java.lang.Object r2 = r0.L$0
            com.onesignal.notifications.internal.open.impl.c r2 = (com.onesignal.notifications.internal.open.impl.c) r2
            sa.o.b(r8)
            goto L_0x005a
        L_0x0045:
            sa.o.b(r8)
            k9.c r8 = r5._lifecycleService
            r0.L$0 = r5
            r0.L$1 = r6
            r0.L$2 = r7
            r0.label = r4
            java.lang.Object r8 = r8.canOpenNotification(r6, r7, r0)
            if (r8 != r1) goto L_0x0059
            return r1
        L_0x0059:
            r2 = r5
        L_0x005a:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 != 0) goto L_0x0065
            sa.t r6 = sa.t.f15300a
            return r6
        L_0x0065:
            k9.c r8 = r2._lifecycleService
            com.onesignal.common.j r2 = com.onesignal.common.j.INSTANCE
            org.json.JSONArray r2 = r2.wrapInJsonArray(r7)
            g9.c r4 = g9.c.INSTANCE
            java.lang.String r7 = r4.getOSNotificationIdFromJson(r7)
            db.l.b(r7)
            r4 = 0
            r0.L$0 = r4
            r0.L$1 = r4
            r0.L$2 = r4
            r0.label = r3
            java.lang.Object r6 = r8.notificationOpened(r6, r2, r7, r0)
            if (r6 != r1) goto L_0x0086
            return r1
        L_0x0086:
            sa.t r6 = sa.t.f15300a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.notifications.internal.open.impl.c.handleProcessJsonOpenData(android.app.Activity, org.json.JSONObject, va.d):java.lang.Object");
    }

    private final void reformatButtonClickAction(JSONObject jSONObject) {
        try {
            String str = (String) h.INSTANCE.getCustomJSONObject(jSONObject).remove("actionId");
            if (str != null) {
                jSONObject.put("actionId", str);
            }
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
    }

    public Object handleHMSNotificationOpenIntent(Activity activity, Intent intent, va.d dVar) {
        if (intent == null) {
            return t.f15300a;
        }
        JSONObject covertHMSOpenIntentToJson = covertHMSOpenIntentToJson(intent);
        if (covertHMSOpenIntentToJson == null) {
            return t.f15300a;
        }
        Object handleProcessJsonOpenData = handleProcessJsonOpenData(activity, covertHMSOpenIntentToJson, dVar);
        return handleProcessJsonOpenData == d.c() ? handleProcessJsonOpenData : t.f15300a;
    }
}
