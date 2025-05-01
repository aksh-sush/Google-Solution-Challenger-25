package com.onesignal.notifications.internal.backend.impl;

import db.l;
import kotlin.coroutines.jvm.internal.d;
import q7.a;

public final class a implements y8.a {
    private final s7.b _httpClient;

    /* renamed from: com.onesignal.notifications.internal.backend.impl.a$a  reason: collision with other inner class name */
    static final class C0167a extends d {
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ a this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0167a(a aVar, va.d dVar) {
            super(dVar);
            this.this$0 = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.updateNotificationAsOpened((String) null, (String) null, (String) null, (a.b) null, this);
        }
    }

    static final class b extends d {
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
            return this.this$0.updateNotificationAsReceived((String) null, (String) null, (String) null, (a.b) null, this);
        }
    }

    public a(s7.b bVar) {
        l.e(bVar, "_httpClient");
        this._httpClient = bVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object updateNotificationAsOpened(java.lang.String r5, java.lang.String r6, java.lang.String r7, q7.a.b r8, va.d r9) {
        /*
            r4 = this;
            boolean r0 = r9 instanceof com.onesignal.notifications.internal.backend.impl.a.C0167a
            if (r0 == 0) goto L_0x0013
            r0 = r9
            com.onesignal.notifications.internal.backend.impl.a$a r0 = (com.onesignal.notifications.internal.backend.impl.a.C0167a) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.onesignal.notifications.internal.backend.impl.a$a r0 = new com.onesignal.notifications.internal.backend.impl.a$a
            r0.<init>(r4, r9)
        L_0x0018:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = wa.d.c()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            sa.o.b(r9)
            goto L_0x006d
        L_0x0029:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0031:
            sa.o.b(r9)
            org.json.JSONObject r9 = new org.json.JSONObject
            r9.<init>()
            java.lang.String r2 = "app_id"
            r9.put(r2, r5)
            java.lang.String r5 = "player_id"
            r9.put(r5, r7)
            java.lang.String r5 = "opened"
            r9.put(r5, r3)
            java.lang.String r5 = "device_type"
            int r7 = r8.getValue()
            r9.put(r5, r7)
            s7.b r5 = r4._httpClient
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "notifications/"
            r7.append(r8)
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            r0.label = r3
            java.lang.Object r9 = r5.put(r6, r9, r0)
            if (r9 != r1) goto L_0x006d
            return r1
        L_0x006d:
            s7.a r9 = (s7.a) r9
            boolean r5 = r9.isSuccess()
            if (r5 == 0) goto L_0x0078
            sa.t r5 = sa.t.f15300a
            return r5
        L_0x0078:
            h7.a r5 = new h7.a
            int r6 = r9.getStatusCode()
            java.lang.String r7 = r9.getPayload()
            r5.<init>(r6, r7)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.notifications.internal.backend.impl.a.updateNotificationAsOpened(java.lang.String, java.lang.String, java.lang.String, q7.a$b, va.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object updateNotificationAsReceived(java.lang.String r5, java.lang.String r6, java.lang.String r7, q7.a.b r8, va.d r9) {
        /*
            r4 = this;
            boolean r0 = r9 instanceof com.onesignal.notifications.internal.backend.impl.a.b
            if (r0 == 0) goto L_0x0013
            r0 = r9
            com.onesignal.notifications.internal.backend.impl.a$b r0 = (com.onesignal.notifications.internal.backend.impl.a.b) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.onesignal.notifications.internal.backend.impl.a$b r0 = new com.onesignal.notifications.internal.backend.impl.a$b
            r0.<init>(r4, r9)
        L_0x0018:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = wa.d.c()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            sa.o.b(r9)
            goto L_0x0075
        L_0x0029:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0031:
            sa.o.b(r9)
            org.json.JSONObject r9 = new org.json.JSONObject
            r9.<init>()
            java.lang.String r2 = "app_id"
            org.json.JSONObject r5 = r9.put(r2, r5)
            java.lang.String r9 = "player_id"
            org.json.JSONObject r5 = r5.put(r9, r7)
            java.lang.String r7 = "device_type"
            int r8 = r8.getValue()
            org.json.JSONObject r5 = r5.put(r7, r8)
            java.lang.String r7 = "JSONObject()\n           …_type\", deviceType.value)"
            db.l.d(r5, r7)
            s7.b r7 = r4._httpClient
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "notifications/"
            r8.append(r9)
            r8.append(r6)
            java.lang.String r6 = "/report_received"
            r8.append(r6)
            java.lang.String r6 = r8.toString()
            r0.label = r3
            java.lang.Object r9 = r7.put(r6, r5, r0)
            if (r9 != r1) goto L_0x0075
            return r1
        L_0x0075:
            s7.a r9 = (s7.a) r9
            boolean r5 = r9.isSuccess()
            if (r5 == 0) goto L_0x0080
            sa.t r5 = sa.t.f15300a
            return r5
        L_0x0080:
            h7.a r5 = new h7.a
            int r6 = r9.getStatusCode()
            java.lang.String r7 = r9.getPayload()
            r5.<init>(r6, r7)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.notifications.internal.backend.impl.a.updateNotificationAsReceived(java.lang.String, java.lang.String, java.lang.String, q7.a$b, va.d):java.lang.Object");
    }
}
