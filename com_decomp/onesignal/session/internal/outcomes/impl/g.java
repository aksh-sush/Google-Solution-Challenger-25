package com.onesignal.session.internal.outcomes.impl;

import db.l;
import kotlin.coroutines.jvm.internal.d;
import s7.b;

public final class g implements b {
    private final b _http;

    static final class a extends d {
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ g this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(g gVar, va.d dVar) {
            super(dVar);
            this.this$0 = gVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.sendOutcomeEvent((String) null, (String) null, (String) null, (String) null, (Boolean) null, (e) null, this);
        }
    }

    public g(b bVar) {
        l.e(bVar, "_http");
        this._http = bVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object sendOutcomeEvent(java.lang.String r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, java.lang.Boolean r11, com.onesignal.session.internal.outcomes.impl.e r12, va.d r13) {
        /*
            r6 = this;
            boolean r0 = r13 instanceof com.onesignal.session.internal.outcomes.impl.g.a
            if (r0 == 0) goto L_0x0013
            r0 = r13
            com.onesignal.session.internal.outcomes.impl.g$a r0 = (com.onesignal.session.internal.outcomes.impl.g.a) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.onesignal.session.internal.outcomes.impl.g$a r0 = new com.onesignal.session.internal.outcomes.impl.g$a
            r0.<init>(r6, r13)
        L_0x0018:
            java.lang.Object r13 = r0.result
            java.lang.Object r1 = wa.d.c()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0032
            if (r2 != r3) goto L_0x002a
            sa.o.b(r13)
            goto L_0x00d4
        L_0x002a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0032:
            sa.o.b(r13)
            org.json.JSONObject r13 = new org.json.JSONObject
            r13.<init>()
            java.lang.String r2 = "app_id"
            org.json.JSONObject r7 = r13.put(r2, r7)
            java.lang.String r13 = "onesignal_id"
            org.json.JSONObject r7 = r7.put(r13, r8)
            org.json.JSONObject r8 = new org.json.JSONObject
            r8.<init>()
            java.lang.String r13 = "id"
            org.json.JSONObject r8 = r8.put(r13, r9)
            java.lang.String r9 = "type"
            org.json.JSONObject r8 = r8.put(r9, r10)
            java.lang.String r9 = "subscription"
            org.json.JSONObject r7 = r7.put(r9, r8)
            if (r11 == 0) goto L_0x0068
            java.lang.String r8 = "direct"
            boolean r9 = r11.booleanValue()
            r7.put(r8, r9)
        L_0x0068:
            org.json.JSONArray r8 = r12.getNotificationIds()
            if (r8 == 0) goto L_0x0081
            org.json.JSONArray r8 = r12.getNotificationIds()
            int r8 = r8.length()
            if (r8 <= 0) goto L_0x0081
            java.lang.String r8 = "notification_ids"
            org.json.JSONArray r9 = r12.getNotificationIds()
            r7.put(r8, r9)
        L_0x0081:
            java.lang.String r8 = r12.getName()
            r7.put(r13, r8)
            float r8 = r12.getWeight()
            r9 = 0
            int r8 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r8 <= 0) goto L_0x009e
            float r8 = r12.getWeight()
            java.lang.Float r8 = kotlin.coroutines.jvm.internal.b.b(r8)
            java.lang.String r9 = "weight"
            r7.put(r9, r8)
        L_0x009e:
            long r8 = r12.getTimestamp()
            r10 = 0
            int r13 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r13 <= 0) goto L_0x00b1
            java.lang.String r8 = "timestamp"
            long r4 = r12.getTimestamp()
            r7.put(r8, r4)
        L_0x00b1:
            long r8 = r12.getSessionTime()
            int r13 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r13 <= 0) goto L_0x00c2
            java.lang.String r8 = "session_time"
            long r9 = r12.getSessionTime()
            r7.put(r8, r9)
        L_0x00c2:
            s7.b r8 = r6._http
            java.lang.String r9 = "jsonObject"
            db.l.d(r7, r9)
            r0.label = r3
            java.lang.String r9 = "outcomes/measure"
            java.lang.Object r13 = r8.post(r9, r7, r0)
            if (r13 != r1) goto L_0x00d4
            return r1
        L_0x00d4:
            s7.a r13 = (s7.a) r13
            boolean r7 = r13.isSuccess()
            if (r7 == 0) goto L_0x00df
            sa.t r7 = sa.t.f15300a
            return r7
        L_0x00df:
            h7.a r7 = new h7.a
            int r8 = r13.getStatusCode()
            java.lang.String r9 = r13.getPayload()
            r7.<init>(r8, r9)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.session.internal.outcomes.impl.g.sendOutcomeEvent(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, com.onesignal.session.internal.outcomes.impl.e, va.d):java.lang.Object");
    }
}
