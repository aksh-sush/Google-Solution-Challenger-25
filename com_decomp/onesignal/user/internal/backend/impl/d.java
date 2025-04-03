package com.onesignal.user.internal.backend.impl;

import db.l;
import java.util.List;
import java.util.Map;
import w9.e;
import w9.f;
import w9.h;

public final class d implements w9.d {
    private final s7.b _httpClient;

    static final class a extends kotlin.coroutines.jvm.internal.d {
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ d this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(d dVar, va.d dVar2) {
            super(dVar2);
            this.this$0 = dVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.createUser((String) null, (Map<String, String>) null, (List<h>) null, (Map<String, String>) null, this);
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.d {
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ d this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(d dVar, va.d dVar2) {
            super(dVar2);
            this.this$0 = dVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.getUser((String) null, (String) null, (String) null, this);
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.d {
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ d this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(d dVar, va.d dVar2) {
            super(dVar2);
            this.this$0 = dVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.updateUser((String) null, (String) null, (String) null, (f) null, false, (e) null, this);
        }
    }

    public d(s7.b bVar) {
        l.e(bVar, "_httpClient");
        this._httpClient = bVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object createUser(java.lang.String r5, java.util.Map<java.lang.String, java.lang.String> r6, java.util.List<w9.h> r7, java.util.Map<java.lang.String, java.lang.String> r8, va.d r9) {
        /*
            r4 = this;
            boolean r0 = r9 instanceof com.onesignal.user.internal.backend.impl.d.a
            if (r0 == 0) goto L_0x0013
            r0 = r9
            com.onesignal.user.internal.backend.impl.d$a r0 = (com.onesignal.user.internal.backend.impl.d.a) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.onesignal.user.internal.backend.impl.d$a r0 = new com.onesignal.user.internal.backend.impl.d$a
            r0.<init>(r4, r9)
        L_0x0018:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = wa.d.c()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            sa.o.b(r9)
            goto L_0x009b
        L_0x0029:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0031:
            sa.o.b(r9)
            org.json.JSONObject r9 = new org.json.JSONObject
            r9.<init>()
            boolean r2 = r6.isEmpty()
            r2 = r2 ^ r3
            if (r2 == 0) goto L_0x004e
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
            org.json.JSONObject r6 = com.onesignal.common.i.putMap(r2, r6)
            java.lang.String r2 = "identity"
            r9.put(r2, r6)
        L_0x004e:
            boolean r6 = r7.isEmpty()
            r6 = r6 ^ r3
            if (r6 == 0) goto L_0x0060
            com.onesignal.user.internal.backend.impl.b r6 = com.onesignal.user.internal.backend.impl.b.INSTANCE
            org.json.JSONArray r6 = r6.convertToJSON((java.util.List<w9.h>) r7)
            java.lang.String r7 = "subscriptions"
            r9.put(r7, r6)
        L_0x0060:
            boolean r6 = r8.isEmpty()
            r6 = r6 ^ r3
            if (r6 == 0) goto L_0x0075
            org.json.JSONObject r6 = new org.json.JSONObject
            r6.<init>()
            org.json.JSONObject r6 = com.onesignal.common.i.putMap(r6, r8)
            java.lang.String r7 = "properties"
            r9.put(r7, r6)
        L_0x0075:
            java.lang.String r6 = "refresh_device_metadata"
            r9.put(r6, r3)
            s7.b r6 = r4._httpClient
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "apps/"
            r7.append(r8)
            r7.append(r5)
            java.lang.String r5 = "/users"
            r7.append(r5)
            java.lang.String r5 = r7.toString()
            r0.label = r3
            java.lang.Object r9 = r6.post(r5, r9, r0)
            if (r9 != r1) goto L_0x009b
            return r1
        L_0x009b:
            s7.a r9 = (s7.a) r9
            boolean r5 = r9.isSuccess()
            if (r5 == 0) goto L_0x00b6
            com.onesignal.user.internal.backend.impl.b r5 = com.onesignal.user.internal.backend.impl.b.INSTANCE
            org.json.JSONObject r6 = new org.json.JSONObject
            java.lang.String r7 = r9.getPayload()
            db.l.b(r7)
            r6.<init>(r7)
            w9.a r5 = r5.convertToCreateUserResponse(r6)
            return r5
        L_0x00b6:
            h7.a r5 = new h7.a
            int r6 = r9.getStatusCode()
            java.lang.String r7 = r9.getPayload()
            r5.<init>(r6, r7)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.user.internal.backend.impl.d.createUser(java.lang.String, java.util.Map, java.util.List, java.util.Map, va.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object getUser(java.lang.String r8, java.lang.String r9, java.lang.String r10, va.d r11) {
        /*
            r7 = this;
            boolean r0 = r11 instanceof com.onesignal.user.internal.backend.impl.d.b
            if (r0 == 0) goto L_0x0013
            r0 = r11
            com.onesignal.user.internal.backend.impl.d$b r0 = (com.onesignal.user.internal.backend.impl.d.b) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.onesignal.user.internal.backend.impl.d$b r0 = new com.onesignal.user.internal.backend.impl.d$b
            r0.<init>(r7, r11)
        L_0x0018:
            r4 = r0
            java.lang.Object r11 = r4.result
            java.lang.Object r0 = wa.d.c()
            int r1 = r4.label
            r2 = 1
            if (r1 == 0) goto L_0x0032
            if (r1 != r2) goto L_0x002a
            sa.o.b(r11)
            goto L_0x0065
        L_0x002a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0032:
            sa.o.b(r11)
            s7.b r1 = r7._httpClient
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r3 = "apps/"
            r11.append(r3)
            r11.append(r8)
            java.lang.String r8 = "/users/by/"
            r11.append(r8)
            r11.append(r9)
            r8 = 47
            r11.append(r8)
            r11.append(r10)
            java.lang.String r8 = r11.toString()
            r3 = 0
            r5 = 2
            r6 = 0
            r4.label = r2
            r2 = r8
            java.lang.Object r11 = s7.b.a.get$default(r1, r2, r3, r4, r5, r6)
            if (r11 != r0) goto L_0x0065
            return r0
        L_0x0065:
            s7.a r11 = (s7.a) r11
            boolean r8 = r11.isSuccess()
            if (r8 == 0) goto L_0x007d
            com.onesignal.user.internal.backend.impl.b r8 = com.onesignal.user.internal.backend.impl.b.INSTANCE
            org.json.JSONObject r9 = new org.json.JSONObject
            java.lang.String r10 = r11.getPayload()
            r9.<init>(r10)
            w9.a r8 = r8.convertToCreateUserResponse(r9)
            return r8
        L_0x007d:
            h7.a r8 = new h7.a
            int r9 = r11.getStatusCode()
            java.lang.String r10 = r11.getPayload()
            r8.<init>(r9, r10)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.user.internal.backend.impl.d.getUser(java.lang.String, java.lang.String, java.lang.String, va.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object updateUser(java.lang.String r5, java.lang.String r6, java.lang.String r7, w9.f r8, boolean r9, w9.e r10, va.d r11) {
        /*
            r4 = this;
            boolean r0 = r11 instanceof com.onesignal.user.internal.backend.impl.d.c
            if (r0 == 0) goto L_0x0013
            r0 = r11
            com.onesignal.user.internal.backend.impl.d$c r0 = (com.onesignal.user.internal.backend.impl.d.c) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.onesignal.user.internal.backend.impl.d$c r0 = new com.onesignal.user.internal.backend.impl.d$c
            r0.<init>(r4, r11)
        L_0x0018:
            java.lang.Object r11 = r0.result
            java.lang.Object r1 = wa.d.c()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            sa.o.b(r11)
            goto L_0x0092
        L_0x0029:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0031:
            sa.o.b(r11)
            org.json.JSONObject r11 = new org.json.JSONObject
            r11.<init>()
            java.lang.String r2 = "refresh_device_metadata"
            org.json.JSONObject r9 = r11.put(r2, r9)
            boolean r11 = r8.getHasAtLeastOnePropertySet()
            if (r11 == 0) goto L_0x0050
            com.onesignal.user.internal.backend.impl.b r11 = com.onesignal.user.internal.backend.impl.b.INSTANCE
            org.json.JSONObject r8 = r11.convertToJSON((w9.f) r8)
            java.lang.String r11 = "properties"
            r9.put(r11, r8)
        L_0x0050:
            boolean r8 = r10.getHasAtLeastOnePropertySet()
            if (r8 == 0) goto L_0x0061
            com.onesignal.user.internal.backend.impl.b r8 = com.onesignal.user.internal.backend.impl.b.INSTANCE
            org.json.JSONObject r8 = r8.convertToJSON((w9.e) r10)
            java.lang.String r10 = "deltas"
            r9.put(r10, r8)
        L_0x0061:
            s7.b r8 = r4._httpClient
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "apps/"
            r10.append(r11)
            r10.append(r5)
            java.lang.String r5 = "/users/by/"
            r10.append(r5)
            r10.append(r6)
            r5 = 47
            r10.append(r5)
            r10.append(r7)
            java.lang.String r5 = r10.toString()
            java.lang.String r6 = "jsonObject"
            db.l.d(r9, r6)
            r0.label = r3
            java.lang.Object r11 = r8.patch(r5, r9, r0)
            if (r11 != r1) goto L_0x0092
            return r1
        L_0x0092:
            s7.a r11 = (s7.a) r11
            boolean r5 = r11.isSuccess()
            if (r5 == 0) goto L_0x009d
            sa.t r5 = sa.t.f15300a
            return r5
        L_0x009d:
            h7.a r5 = new h7.a
            int r6 = r11.getStatusCode()
            java.lang.String r7 = r11.getPayload()
            r5.<init>(r6, r7)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.user.internal.backend.impl.d.updateUser(java.lang.String, java.lang.String, java.lang.String, w9.f, boolean, w9.e, va.d):java.lang.Object");
    }
}
