package com.onesignal.user.internal.backend.impl;

import db.l;
import java.util.Map;
import kotlin.coroutines.jvm.internal.d;

public final class a implements w9.b {
    private final s7.b _httpClient;

    /* renamed from: com.onesignal.user.internal.backend.impl.a$a  reason: collision with other inner class name */
    static final class C0190a extends d {
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ a this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0190a(a aVar, va.d dVar) {
            super(dVar);
            this.this$0 = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.deleteAlias((String) null, (String) null, (String) null, (String) null, this);
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
            return this.this$0.setAlias((String) null, (String) null, (String) null, (Map<String, String>) null, this);
        }
    }

    public a(s7.b bVar) {
        l.e(bVar, "_httpClient");
        this._httpClient = bVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object deleteAlias(java.lang.String r6, java.lang.String r7, java.lang.String r8, java.lang.String r9, va.d r10) {
        /*
            r5 = this;
            boolean r0 = r10 instanceof com.onesignal.user.internal.backend.impl.a.C0190a
            if (r0 == 0) goto L_0x0013
            r0 = r10
            com.onesignal.user.internal.backend.impl.a$a r0 = (com.onesignal.user.internal.backend.impl.a.C0190a) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.onesignal.user.internal.backend.impl.a$a r0 = new com.onesignal.user.internal.backend.impl.a$a
            r0.<init>(r5, r10)
        L_0x0018:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = wa.d.c()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            sa.o.b(r10)
            goto L_0x0068
        L_0x0029:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0031:
            sa.o.b(r10)
            s7.b r10 = r5._httpClient
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "apps/"
            r2.append(r4)
            r2.append(r6)
            java.lang.String r6 = "/users/by/"
            r2.append(r6)
            r2.append(r7)
            r6 = 47
            r2.append(r6)
            r2.append(r8)
            java.lang.String r6 = "/identity/"
            r2.append(r6)
            r2.append(r9)
            java.lang.String r6 = r2.toString()
            r0.label = r3
            java.lang.Object r10 = r10.delete(r6, r0)
            if (r10 != r1) goto L_0x0068
            return r1
        L_0x0068:
            s7.a r10 = (s7.a) r10
            boolean r6 = r10.isSuccess()
            if (r6 == 0) goto L_0x0073
            sa.t r6 = sa.t.f15300a
            return r6
        L_0x0073:
            h7.a r6 = new h7.a
            int r7 = r10.getStatusCode()
            java.lang.String r8 = r10.getPayload()
            r6.<init>(r7, r8)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.user.internal.backend.impl.a.deleteAlias(java.lang.String, java.lang.String, java.lang.String, java.lang.String, va.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object setAlias(java.lang.String r7, java.lang.String r8, java.lang.String r9, java.util.Map<java.lang.String, java.lang.String> r10, va.d r11) {
        /*
            r6 = this;
            boolean r0 = r11 instanceof com.onesignal.user.internal.backend.impl.a.b
            if (r0 == 0) goto L_0x0013
            r0 = r11
            com.onesignal.user.internal.backend.impl.a$b r0 = (com.onesignal.user.internal.backend.impl.a.b) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.onesignal.user.internal.backend.impl.a$b r0 = new com.onesignal.user.internal.backend.impl.a$b
            r0.<init>(r6, r11)
        L_0x0018:
            java.lang.Object r11 = r0.result
            java.lang.Object r1 = wa.d.c()
            int r2 = r0.label
            java.lang.String r3 = "identity"
            r4 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r4) goto L_0x002b
            sa.o.b(r11)
            goto L_0x007e
        L_0x002b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0033:
            sa.o.b(r11)
            org.json.JSONObject r11 = new org.json.JSONObject
            r11.<init>()
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
            org.json.JSONObject r10 = com.onesignal.common.i.putMap(r2, r10)
            org.json.JSONObject r10 = r11.put(r3, r10)
            s7.b r11 = r6._httpClient
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r5 = "apps/"
            r2.append(r5)
            r2.append(r7)
            java.lang.String r7 = "/users/by/"
            r2.append(r7)
            r2.append(r8)
            r7 = 47
            r2.append(r7)
            r2.append(r9)
            java.lang.String r7 = "/identity"
            r2.append(r7)
            java.lang.String r7 = r2.toString()
            java.lang.String r8 = "requestJSONObject"
            db.l.d(r10, r8)
            r0.label = r4
            java.lang.Object r11 = r11.patch(r7, r10, r0)
            if (r11 != r1) goto L_0x007e
            return r1
        L_0x007e:
            s7.a r11 = (s7.a) r11
            boolean r7 = r11.isSuccess()
            if (r7 == 0) goto L_0x00d1
            org.json.JSONObject r7 = new org.json.JSONObject
            java.lang.String r8 = r11.getPayload()
            db.l.b(r8)
            r7.<init>(r8)
            org.json.JSONObject r7 = r7.getJSONObject(r3)
            java.lang.String r8 = "responseJSON.getJSONObject(\"identity\")"
            db.l.d(r7, r8)
            java.util.Map r7 = com.onesignal.common.i.toMap(r7)
            java.util.LinkedHashMap r8 = new java.util.LinkedHashMap
            int r9 = r7.size()
            int r9 = ta.e0.a(r9)
            r8.<init>(r9)
            java.util.Set r7 = r7.entrySet()
            java.util.Iterator r7 = r7.iterator()
        L_0x00b4:
            boolean r9 = r7.hasNext()
            if (r9 == 0) goto L_0x00d0
            java.lang.Object r9 = r7.next()
            java.util.Map$Entry r9 = (java.util.Map.Entry) r9
            java.lang.Object r10 = r9.getKey()
            java.lang.Object r9 = r9.getValue()
            java.lang.String r9 = r9.toString()
            r8.put(r10, r9)
            goto L_0x00b4
        L_0x00d0:
            return r8
        L_0x00d1:
            h7.a r7 = new h7.a
            int r8 = r11.getStatusCode()
            java.lang.String r9 = r11.getPayload()
            r7.<init>(r8, r9)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.user.internal.backend.impl.a.setAlias(java.lang.String, java.lang.String, java.lang.String, java.util.Map, va.d):java.lang.Object");
    }
}
