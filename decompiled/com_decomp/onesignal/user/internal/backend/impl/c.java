package com.onesignal.user.internal.backend.impl;

import db.l;
import w9.h;

public final class c implements w9.c {
    private final s7.b _httpClient;

    static final class a extends kotlin.coroutines.jvm.internal.d {
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
            return this.this$0.createSubscription((String) null, (String) null, (String) null, (h) null, this);
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.d {
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ c this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(c cVar, va.d dVar) {
            super(dVar);
            this.this$0 = cVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.deleteSubscription((String) null, (String) null, this);
        }
    }

    /* renamed from: com.onesignal.user.internal.backend.impl.c$c  reason: collision with other inner class name */
    static final class C0192c extends kotlin.coroutines.jvm.internal.d {
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ c this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0192c(c cVar, va.d dVar) {
            super(dVar);
            this.this$0 = cVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.getIdentityFromSubscription((String) null, (String) null, this);
        }
    }

    static final class d extends kotlin.coroutines.jvm.internal.d {
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ c this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(c cVar, va.d dVar) {
            super(dVar);
            this.this$0 = cVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.transferSubscription((String) null, (String) null, (String) null, (String) null, this);
        }
    }

    static final class e extends kotlin.coroutines.jvm.internal.d {
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ c this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(c cVar, va.d dVar) {
            super(dVar);
            this.this$0 = cVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.updateSubscription((String) null, (String) null, (h) null, this);
        }
    }

    public c(s7.b bVar) {
        l.e(bVar, "_httpClient");
        this._httpClient = bVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object createSubscription(java.lang.String r7, java.lang.String r8, java.lang.String r9, w9.h r10, va.d r11) {
        /*
            r6 = this;
            boolean r0 = r11 instanceof com.onesignal.user.internal.backend.impl.c.a
            if (r0 == 0) goto L_0x0013
            r0 = r11
            com.onesignal.user.internal.backend.impl.c$a r0 = (com.onesignal.user.internal.backend.impl.c.a) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.onesignal.user.internal.backend.impl.c$a r0 = new com.onesignal.user.internal.backend.impl.c$a
            r0.<init>(r6, r11)
        L_0x0018:
            java.lang.Object r11 = r0.result
            java.lang.Object r1 = wa.d.c()
            int r2 = r0.label
            java.lang.String r3 = "subscription"
            r4 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r4) goto L_0x002b
            sa.o.b(r11)
            goto L_0x007b
        L_0x002b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0033:
            sa.o.b(r11)
            org.json.JSONObject r11 = new org.json.JSONObject
            r11.<init>()
            com.onesignal.user.internal.backend.impl.b r2 = com.onesignal.user.internal.backend.impl.b.INSTANCE
            org.json.JSONObject r10 = r2.convertToJSON((w9.h) r10)
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
            java.lang.String r7 = "/subscriptions"
            r2.append(r7)
            java.lang.String r7 = r2.toString()
            java.lang.String r8 = "requestJSON"
            db.l.d(r10, r8)
            r0.label = r4
            java.lang.Object r11 = r11.post(r7, r10, r0)
            if (r11 != r1) goto L_0x007b
            return r1
        L_0x007b:
            s7.a r11 = (s7.a) r11
            boolean r7 = r11.isSuccess()
            if (r7 == 0) goto L_0x00a5
            org.json.JSONObject r7 = new org.json.JSONObject
            java.lang.String r8 = r11.getPayload()
            db.l.b(r8)
            r7.<init>(r8)
            org.json.JSONObject r7 = com.onesignal.common.i.safeJSONObject(r7, r3)
            if (r7 == 0) goto L_0x00a3
            java.lang.String r8 = "id"
            boolean r9 = r7.has(r8)
            if (r9 != 0) goto L_0x009e
            goto L_0x00a3
        L_0x009e:
            java.lang.String r7 = r7.getString(r8)
            return r7
        L_0x00a3:
            r7 = 0
            return r7
        L_0x00a5:
            h7.a r7 = new h7.a
            int r8 = r11.getStatusCode()
            java.lang.String r9 = r11.getPayload()
            r7.<init>(r8, r9)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.user.internal.backend.impl.c.createSubscription(java.lang.String, java.lang.String, java.lang.String, w9.h, va.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object deleteSubscription(java.lang.String r6, java.lang.String r7, va.d r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.onesignal.user.internal.backend.impl.c.b
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.onesignal.user.internal.backend.impl.c$b r0 = (com.onesignal.user.internal.backend.impl.c.b) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.onesignal.user.internal.backend.impl.c$b r0 = new com.onesignal.user.internal.backend.impl.c$b
            r0.<init>(r5, r8)
        L_0x0018:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = wa.d.c()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            sa.o.b(r8)
            goto L_0x0058
        L_0x0029:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0031:
            sa.o.b(r8)
            s7.b r8 = r5._httpClient
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "apps/"
            r2.append(r4)
            r2.append(r6)
            java.lang.String r6 = "/subscriptions/"
            r2.append(r6)
            r2.append(r7)
            java.lang.String r6 = r2.toString()
            r0.label = r3
            java.lang.Object r8 = r8.delete(r6, r0)
            if (r8 != r1) goto L_0x0058
            return r1
        L_0x0058:
            s7.a r8 = (s7.a) r8
            boolean r6 = r8.isSuccess()
            if (r6 == 0) goto L_0x0063
            sa.t r6 = sa.t.f15300a
            return r6
        L_0x0063:
            h7.a r6 = new h7.a
            int r7 = r8.getStatusCode()
            java.lang.String r8 = r8.getPayload()
            r6.<init>(r7, r8)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.user.internal.backend.impl.c.deleteSubscription(java.lang.String, java.lang.String, va.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object getIdentityFromSubscription(java.lang.String r8, java.lang.String r9, va.d r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof com.onesignal.user.internal.backend.impl.c.C0192c
            if (r0 == 0) goto L_0x0013
            r0 = r10
            com.onesignal.user.internal.backend.impl.c$c r0 = (com.onesignal.user.internal.backend.impl.c.C0192c) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.onesignal.user.internal.backend.impl.c$c r0 = new com.onesignal.user.internal.backend.impl.c$c
            r0.<init>(r7, r10)
        L_0x0018:
            r4 = r0
            java.lang.Object r10 = r4.result
            java.lang.Object r0 = wa.d.c()
            int r1 = r4.label
            r2 = 1
            if (r1 == 0) goto L_0x0032
            if (r1 != r2) goto L_0x002a
            sa.o.b(r10)
            goto L_0x0062
        L_0x002a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0032:
            sa.o.b(r10)
            s7.b r1 = r7._httpClient
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r3 = "apps/"
            r10.append(r3)
            r10.append(r8)
            java.lang.String r8 = "/subscriptions/"
            r10.append(r8)
            r10.append(r9)
            java.lang.String r8 = "/user/identity"
            r10.append(r8)
            java.lang.String r8 = r10.toString()
            r3 = 0
            r5 = 2
            r6 = 0
            r4.label = r2
            r2 = r8
            java.lang.Object r10 = s7.b.a.get$default(r1, r2, r3, r4, r5, r6)
            if (r10 != r0) goto L_0x0062
            return r0
        L_0x0062:
            s7.a r10 = (s7.a) r10
            boolean r8 = r10.isSuccess()
            if (r8 == 0) goto L_0x00ba
            org.json.JSONObject r8 = new org.json.JSONObject
            java.lang.String r9 = r10.getPayload()
            db.l.b(r9)
            r8.<init>(r9)
            java.lang.String r9 = "identity"
            org.json.JSONObject r8 = com.onesignal.common.i.safeJSONObject(r8, r9)
            if (r8 == 0) goto L_0x00b5
            java.util.Map r8 = com.onesignal.common.i.toMap(r8)
            if (r8 == 0) goto L_0x00b5
            java.util.LinkedHashMap r9 = new java.util.LinkedHashMap
            int r10 = r8.size()
            int r10 = ta.e0.a(r10)
            r9.<init>(r10)
            java.util.Set r8 = r8.entrySet()
            java.util.Iterator r8 = r8.iterator()
        L_0x0099:
            boolean r10 = r8.hasNext()
            if (r10 == 0) goto L_0x00b9
            java.lang.Object r10 = r8.next()
            java.util.Map$Entry r10 = (java.util.Map.Entry) r10
            java.lang.Object r0 = r10.getKey()
            java.lang.Object r10 = r10.getValue()
            java.lang.String r10 = r10.toString()
            r9.put(r0, r10)
            goto L_0x0099
        L_0x00b5:
            java.util.Map r9 = ta.f0.d()
        L_0x00b9:
            return r9
        L_0x00ba:
            h7.a r8 = new h7.a
            int r9 = r10.getStatusCode()
            java.lang.String r10 = r10.getPayload()
            r8.<init>(r9, r10)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.user.internal.backend.impl.c.getIdentityFromSubscription(java.lang.String, java.lang.String, va.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object transferSubscription(java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, va.d r9) {
        /*
            r4 = this;
            boolean r0 = r9 instanceof com.onesignal.user.internal.backend.impl.c.d
            if (r0 == 0) goto L_0x0013
            r0 = r9
            com.onesignal.user.internal.backend.impl.c$d r0 = (com.onesignal.user.internal.backend.impl.c.d) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.onesignal.user.internal.backend.impl.c$d r0 = new com.onesignal.user.internal.backend.impl.c$d
            r0.<init>(r4, r9)
        L_0x0018:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = wa.d.c()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            sa.o.b(r9)
            goto L_0x0076
        L_0x0029:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0031:
            sa.o.b(r9)
            org.json.JSONObject r9 = new org.json.JSONObject
            r9.<init>()
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
            org.json.JSONObject r7 = r2.put(r7, r8)
            java.lang.String r8 = "identity"
            org.json.JSONObject r7 = r9.put(r8, r7)
            s7.b r8 = r4._httpClient
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r2 = "apps/"
            r9.append(r2)
            r9.append(r5)
            java.lang.String r5 = "/subscriptions/"
            r9.append(r5)
            r9.append(r6)
            java.lang.String r5 = "/owner"
            r9.append(r5)
            java.lang.String r5 = r9.toString()
            java.lang.String r6 = "requestJSON"
            db.l.d(r7, r6)
            r0.label = r3
            java.lang.Object r9 = r8.patch(r5, r7, r0)
            if (r9 != r1) goto L_0x0076
            return r1
        L_0x0076:
            s7.a r9 = (s7.a) r9
            boolean r5 = r9.isSuccess()
            if (r5 == 0) goto L_0x0081
            sa.t r5 = sa.t.f15300a
            return r5
        L_0x0081:
            h7.a r5 = new h7.a
            int r6 = r9.getStatusCode()
            java.lang.String r7 = r9.getPayload()
            r5.<init>(r6, r7)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.user.internal.backend.impl.c.transferSubscription(java.lang.String, java.lang.String, java.lang.String, java.lang.String, va.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object updateSubscription(java.lang.String r6, java.lang.String r7, w9.h r8, va.d r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof com.onesignal.user.internal.backend.impl.c.e
            if (r0 == 0) goto L_0x0013
            r0 = r9
            com.onesignal.user.internal.backend.impl.c$e r0 = (com.onesignal.user.internal.backend.impl.c.e) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.onesignal.user.internal.backend.impl.c$e r0 = new com.onesignal.user.internal.backend.impl.c$e
            r0.<init>(r5, r9)
        L_0x0018:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = wa.d.c()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            sa.o.b(r9)
            goto L_0x006e
        L_0x0029:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0031:
            sa.o.b(r9)
            org.json.JSONObject r9 = new org.json.JSONObject
            r9.<init>()
            com.onesignal.user.internal.backend.impl.b r2 = com.onesignal.user.internal.backend.impl.b.INSTANCE
            org.json.JSONObject r8 = r2.convertToJSON((w9.h) r8)
            java.lang.String r2 = "subscription"
            org.json.JSONObject r8 = r9.put(r2, r8)
            s7.b r9 = r5._httpClient
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "apps/"
            r2.append(r4)
            r2.append(r6)
            java.lang.String r6 = "/subscriptions/"
            r2.append(r6)
            r2.append(r7)
            java.lang.String r6 = r2.toString()
            java.lang.String r7 = "requestJSON"
            db.l.d(r8, r7)
            r0.label = r3
            java.lang.Object r9 = r9.patch(r6, r8, r0)
            if (r9 != r1) goto L_0x006e
            return r1
        L_0x006e:
            s7.a r9 = (s7.a) r9
            boolean r6 = r9.isSuccess()
            if (r6 == 0) goto L_0x0079
            sa.t r6 = sa.t.f15300a
            return r6
        L_0x0079:
            h7.a r6 = new h7.a
            int r7 = r9.getStatusCode()
            java.lang.String r8 = r9.getPayload()
            r6.<init>(r7, r8)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.user.internal.backend.impl.c.updateSubscription(java.lang.String, java.lang.String, w9.h, va.d):java.lang.Object");
    }
}
