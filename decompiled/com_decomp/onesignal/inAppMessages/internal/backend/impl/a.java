package com.onesignal.inAppMessages.internal.backend.impl;

import db.l;
import org.json.JSONObject;

public final class a implements f8.b {
    /* access modifiers changed from: private */
    public final q7.a _deviceService;
    private final s7.b _httpClient;
    private final i8.a _hydrator;
    private int htmlNetworkRequestAttemptCount;

    /* renamed from: com.onesignal.inAppMessages.internal.backend.impl.a$a  reason: collision with other inner class name */
    static final class C0139a extends kotlin.coroutines.jvm.internal.d {
        Object L$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ a this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0139a(a aVar, va.d dVar) {
            super(dVar);
            this.this$0 = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.getIAMData((String) null, (String) null, (String) null, this);
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.d {
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
            return this.this$0.getIAMPreviewData((String) null, (String) null, this);
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.d {
        Object L$0;
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
            return this.this$0.listInAppMessages((String) null, (String) null, this);
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
            return this.this$0.sendIAMClick((String) null, (String) null, (String) null, (String) null, (String) null, false, this);
        }
    }

    public static final class e extends JSONObject {
        e(String str, a aVar, String str2, String str3, String str4, boolean z10) {
            put("app_id", str);
            put("device_type", aVar._deviceService.getDeviceType().getValue());
            put("player_id", str2);
            put("click_id", str3);
            put("variant_id", str4);
            if (z10) {
                put("first_click", true);
            }
        }
    }

    static final class f extends kotlin.coroutines.jvm.internal.d {
        Object L$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ a this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(a aVar, va.d dVar) {
            super(dVar);
            this.this$0 = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.sendIAMImpression((String) null, (String) null, (String) null, (String) null, this);
        }
    }

    public static final class g extends JSONObject {
        g(String str, String str2, String str3, a aVar) {
            put("app_id", str);
            put("player_id", str2);
            put("variant_id", str3);
            put("device_type", aVar._deviceService.getDeviceType().getValue());
            put("first_impression", true);
        }
    }

    static final class h extends kotlin.coroutines.jvm.internal.d {
        Object L$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ a this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(a aVar, va.d dVar) {
            super(dVar);
            this.this$0 = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.sendIAMPageImpression((String) null, (String) null, (String) null, (String) null, (String) null, this);
        }
    }

    public static final class i extends JSONObject {
        i(String str, String str2, String str3, a aVar, String str4) {
            put("app_id", str);
            put("player_id", str2);
            put("variant_id", str3);
            put("device_type", aVar._deviceService.getDeviceType().getValue());
            put("page_id", str4);
        }
    }

    public a(s7.b bVar, q7.a aVar, i8.a aVar2) {
        l.e(bVar, "_httpClient");
        l.e(aVar, "_deviceService");
        l.e(aVar2, "_hydrator");
        this._httpClient = bVar;
        this._deviceService = aVar;
        this._hydrator = aVar2;
    }

    private final String htmlPathForMessage(String str, String str2, String str3) {
        if (str2 == null) {
            com.onesignal.debug.internal.logging.a.error$default("Unable to find a variant for in-app message " + str, (Throwable) null, 2, (Object) null);
            return null;
        }
        return "in_app_messages/" + str + "/variants/" + str2 + "/html?app_id=" + str3;
    }

    private final void printHttpErrorForInAppMessageRequest(String str, int i10, String str2) {
        com.onesignal.debug.internal.logging.a.error$default("Encountered a " + i10 + " error while attempting in-app message " + str + " request: " + str2, (Throwable) null, 2, (Object) null);
    }

    private final void printHttpSuccessForInAppMessageRequest(String str, String str2) {
        com.onesignal.debug.internal.logging.a.debug$default("Successful post for in-app message " + str + " request: " + str2, (Throwable) null, 2, (Object) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object getIAMData(java.lang.String r7, java.lang.String r8, java.lang.String r9, va.d r10) {
        /*
            r6 = this;
            boolean r0 = r10 instanceof com.onesignal.inAppMessages.internal.backend.impl.a.C0139a
            if (r0 == 0) goto L_0x0013
            r0 = r10
            com.onesignal.inAppMessages.internal.backend.impl.a$a r0 = (com.onesignal.inAppMessages.internal.backend.impl.a.C0139a) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.onesignal.inAppMessages.internal.backend.impl.a$a r0 = new com.onesignal.inAppMessages.internal.backend.impl.a$a
            r0.<init>(r6, r10)
        L_0x0018:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = wa.d.c()
            int r2 = r0.label
            r3 = 0
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L_0x0037
            if (r2 != r4) goto L_0x002f
            java.lang.Object r7 = r0.L$0
            com.onesignal.inAppMessages.internal.backend.impl.a r7 = (com.onesignal.inAppMessages.internal.backend.impl.a) r7
            sa.o.b(r10)
            goto L_0x0054
        L_0x002f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0037:
            sa.o.b(r10)
            java.lang.String r7 = r6.htmlPathForMessage(r8, r9, r7)
            if (r7 != 0) goto L_0x0046
            f8.a r7 = new f8.a
            r7.<init>(r3, r5)
            return r7
        L_0x0046:
            s7.b r8 = r6._httpClient
            r0.L$0 = r6
            r0.label = r4
            java.lang.Object r10 = r8.get(r7, r3, r0)
            if (r10 != r1) goto L_0x0053
            return r1
        L_0x0053:
            r7 = r6
        L_0x0054:
            s7.a r10 = (s7.a) r10
            boolean r8 = r10.isSuccess()
            if (r8 == 0) goto L_0x0076
            r7.htmlNetworkRequestAttemptCount = r5
            org.json.JSONObject r8 = new org.json.JSONObject
            java.lang.String r9 = r10.getPayload()
            db.l.b(r9)
            r8.<init>(r9)
            f8.a r9 = new f8.a
            i8.a r7 = r7._hydrator
            com.onesignal.inAppMessages.internal.d r7 = r7.hydrateIAMMessageContent(r8)
            r9.<init>(r7, r5)
            return r9
        L_0x0076:
            int r8 = r10.getStatusCode()
            java.lang.String r9 = r10.getPayload()
            java.lang.String r0 = "html"
            r7.printHttpErrorForInAppMessageRequest(r0, r8, r9)
            com.onesignal.common.k r8 = com.onesignal.common.k.INSTANCE
            int r9 = r10.getStatusCode()
            com.onesignal.common.k$a r9 = r8.getResponseStatusType(r9)
            com.onesignal.common.k$a r10 = com.onesignal.common.k.a.RETRYABLE
            if (r9 != r10) goto L_0x00a5
            int r9 = r7.htmlNetworkRequestAttemptCount
            int r8 = r8.getMaxNetworkRequestAttemptCount()
            if (r9 < r8) goto L_0x009a
            goto L_0x00a5
        L_0x009a:
            int r8 = r7.htmlNetworkRequestAttemptCount
            int r8 = r8 + r4
            r7.htmlNetworkRequestAttemptCount = r8
            f8.a r7 = new f8.a
            r7.<init>(r3, r4)
            goto L_0x00ac
        L_0x00a5:
            r7.htmlNetworkRequestAttemptCount = r5
            f8.a r7 = new f8.a
            r7.<init>(r3, r5)
        L_0x00ac:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.inAppMessages.internal.backend.impl.a.getIAMData(java.lang.String, java.lang.String, java.lang.String, va.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object getIAMPreviewData(java.lang.String r6, java.lang.String r7, va.d r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.onesignal.inAppMessages.internal.backend.impl.a.b
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.onesignal.inAppMessages.internal.backend.impl.a$b r0 = (com.onesignal.inAppMessages.internal.backend.impl.a.b) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.onesignal.inAppMessages.internal.backend.impl.a$b r0 = new com.onesignal.inAppMessages.internal.backend.impl.a$b
            r0.<init>(r5, r8)
        L_0x0018:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = wa.d.c()
            int r2 = r0.label
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x0036
            if (r2 != r4) goto L_0x002e
            java.lang.Object r6 = r0.L$0
            com.onesignal.inAppMessages.internal.backend.impl.a r6 = (com.onesignal.inAppMessages.internal.backend.impl.a) r6
            sa.o.b(r8)
            goto L_0x0060
        L_0x002e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0036:
            sa.o.b(r8)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r2 = "in_app_messages/device_preview?preview_id="
            r8.append(r2)
            r8.append(r7)
            java.lang.String r7 = "&app_id="
            r8.append(r7)
            r8.append(r6)
            java.lang.String r6 = r8.toString()
            s7.b r7 = r5._httpClient
            r0.L$0 = r5
            r0.label = r4
            java.lang.Object r8 = r7.get(r6, r3, r0)
            if (r8 != r1) goto L_0x005f
            return r1
        L_0x005f:
            r6 = r5
        L_0x0060:
            s7.a r8 = (s7.a) r8
            boolean r7 = r8.isSuccess()
            if (r7 == 0) goto L_0x007b
            org.json.JSONObject r7 = new org.json.JSONObject
            java.lang.String r8 = r8.getPayload()
            db.l.b(r8)
            r7.<init>(r8)
            i8.a r6 = r6._hydrator
            com.onesignal.inAppMessages.internal.d r3 = r6.hydrateIAMMessageContent(r7)
            goto L_0x0088
        L_0x007b:
            int r7 = r8.getStatusCode()
            java.lang.String r8 = r8.getPayload()
            java.lang.String r0 = "html"
            r6.printHttpErrorForInAppMessageRequest(r0, r7, r8)
        L_0x0088:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.inAppMessages.internal.backend.impl.a.getIAMPreviewData(java.lang.String, java.lang.String, va.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:22:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object listInAppMessages(java.lang.String r8, java.lang.String r9, va.d r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof com.onesignal.inAppMessages.internal.backend.impl.a.c
            if (r0 == 0) goto L_0x0013
            r0 = r10
            com.onesignal.inAppMessages.internal.backend.impl.a$c r0 = (com.onesignal.inAppMessages.internal.backend.impl.a.c) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.onesignal.inAppMessages.internal.backend.impl.a$c r0 = new com.onesignal.inAppMessages.internal.backend.impl.a$c
            r0.<init>(r7, r10)
        L_0x0018:
            r4 = r0
            java.lang.Object r10 = r4.result
            java.lang.Object r0 = wa.d.c()
            int r1 = r4.label
            r2 = 1
            if (r1 == 0) goto L_0x0036
            if (r1 != r2) goto L_0x002e
            java.lang.Object r8 = r4.L$0
            com.onesignal.inAppMessages.internal.backend.impl.a r8 = (com.onesignal.inAppMessages.internal.backend.impl.a) r8
            sa.o.b(r10)
            goto L_0x0069
        L_0x002e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0036:
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
            java.lang.String r8 = "/iams"
            r10.append(r8)
            java.lang.String r8 = r10.toString()
            r3 = 0
            r5 = 2
            r6 = 0
            r4.L$0 = r7
            r4.label = r2
            r2 = r8
            java.lang.Object r10 = s7.b.a.get$default(r1, r2, r3, r4, r5, r6)
            if (r10 != r0) goto L_0x0068
            return r0
        L_0x0068:
            r8 = r7
        L_0x0069:
            s7.a r10 = (s7.a) r10
            boolean r9 = r10.isSuccess()
            if (r9 == 0) goto L_0x0092
            org.json.JSONObject r9 = new org.json.JSONObject
            java.lang.String r10 = r10.getPayload()
            r9.<init>(r10)
            java.lang.String r10 = "in_app_messages"
            boolean r0 = r9.has(r10)
            if (r0 == 0) goto L_0x0092
            org.json.JSONArray r9 = r9.getJSONArray(r10)
            i8.a r8 = r8._hydrator
            java.lang.String r10 = "iamMessagesAsJSON"
            db.l.d(r9, r10)
            java.util.List r8 = r8.hydrateIAMMessages(r9)
            return r8
        L_0x0092:
            r8 = 0
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.inAppMessages.internal.backend.impl.a.listInAppMessages(java.lang.String, java.lang.String, va.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object sendIAMClick(java.lang.String r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, boolean r18, va.d r19) {
        /*
            r12 = this;
            r7 = r12
            r0 = r19
            boolean r1 = r0 instanceof com.onesignal.inAppMessages.internal.backend.impl.a.d
            if (r1 == 0) goto L_0x0016
            r1 = r0
            com.onesignal.inAppMessages.internal.backend.impl.a$d r1 = (com.onesignal.inAppMessages.internal.backend.impl.a.d) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0016
            int r2 = r2 - r3
            r1.label = r2
            goto L_0x001b
        L_0x0016:
            com.onesignal.inAppMessages.internal.backend.impl.a$d r1 = new com.onesignal.inAppMessages.internal.backend.impl.a$d
            r1.<init>(r12, r0)
        L_0x001b:
            r8 = r1
            java.lang.Object r0 = r8.result
            java.lang.Object r9 = wa.d.c()
            int r1 = r8.label
            r10 = 1
            if (r1 == 0) goto L_0x0039
            if (r1 != r10) goto L_0x0031
            java.lang.Object r1 = r8.L$0
            com.onesignal.inAppMessages.internal.backend.impl.a r1 = (com.onesignal.inAppMessages.internal.backend.impl.a) r1
            sa.o.b(r0)
            goto L_0x0070
        L_0x0031:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0039:
            sa.o.b(r0)
            com.onesignal.inAppMessages.internal.backend.impl.a$e r11 = new com.onesignal.inAppMessages.internal.backend.impl.a$e
            r0 = r11
            r1 = r13
            r2 = r12
            r3 = r14
            r4 = r17
            r5 = r15
            r6 = r18
            r0.<init>(r1, r2, r3, r4, r5, r6)
            s7.b r0 = r7._httpClient
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "in_app_messages/"
            r1.append(r2)
            r2 = r16
            r1.append(r2)
            java.lang.String r2 = "/click"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r8.L$0 = r7
            r8.label = r10
            java.lang.Object r0 = r0.post(r1, r11, r8)
            if (r0 != r9) goto L_0x006f
            return r9
        L_0x006f:
            r1 = r7
        L_0x0070:
            s7.a r0 = (s7.a) r0
            boolean r2 = r0.isSuccess()
            java.lang.String r3 = "engagement"
            if (r2 == 0) goto L_0x0087
            java.lang.String r0 = r0.getPayload()
            db.l.b(r0)
            r1.printHttpSuccessForInAppMessageRequest(r3, r0)
            sa.t r0 = sa.t.f15300a
            return r0
        L_0x0087:
            int r2 = r0.getStatusCode()
            java.lang.String r4 = r0.getPayload()
            r1.printHttpErrorForInAppMessageRequest(r3, r2, r4)
            h7.a r1 = new h7.a
            int r2 = r0.getStatusCode()
            java.lang.String r0 = r0.getPayload()
            r1.<init>(r2, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.inAppMessages.internal.backend.impl.a.sendIAMClick(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, va.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object sendIAMImpression(java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, va.d r9) {
        /*
            r4 = this;
            boolean r0 = r9 instanceof com.onesignal.inAppMessages.internal.backend.impl.a.f
            if (r0 == 0) goto L_0x0013
            r0 = r9
            com.onesignal.inAppMessages.internal.backend.impl.a$f r0 = (com.onesignal.inAppMessages.internal.backend.impl.a.f) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.onesignal.inAppMessages.internal.backend.impl.a$f r0 = new com.onesignal.inAppMessages.internal.backend.impl.a$f
            r0.<init>(r4, r9)
        L_0x0018:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = wa.d.c()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            java.lang.Object r5 = r0.L$0
            com.onesignal.inAppMessages.internal.backend.impl.a r5 = (com.onesignal.inAppMessages.internal.backend.impl.a) r5
            sa.o.b(r9)
            goto L_0x0061
        L_0x002d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0035:
            sa.o.b(r9)
            com.onesignal.inAppMessages.internal.backend.impl.a$g r9 = new com.onesignal.inAppMessages.internal.backend.impl.a$g
            r9.<init>(r5, r6, r7, r4)
            s7.b r5 = r4._httpClient
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "in_app_messages/"
            r6.append(r7)
            r6.append(r8)
            java.lang.String r7 = "/impression"
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r9 = r5.post(r6, r9, r0)
            if (r9 != r1) goto L_0x0060
            return r1
        L_0x0060:
            r5 = r4
        L_0x0061:
            s7.a r9 = (s7.a) r9
            boolean r6 = r9.isSuccess()
            java.lang.String r7 = "impression"
            if (r6 == 0) goto L_0x0078
            java.lang.String r6 = r9.getPayload()
            db.l.b(r6)
            r5.printHttpSuccessForInAppMessageRequest(r7, r6)
            sa.t r5 = sa.t.f15300a
            return r5
        L_0x0078:
            int r6 = r9.getStatusCode()
            java.lang.String r8 = r9.getPayload()
            r5.printHttpErrorForInAppMessageRequest(r7, r6, r8)
            h7.a r5 = new h7.a
            int r6 = r9.getStatusCode()
            java.lang.String r7 = r9.getPayload()
            r5.<init>(r6, r7)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.inAppMessages.internal.backend.impl.a.sendIAMImpression(java.lang.String, java.lang.String, java.lang.String, java.lang.String, va.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object sendIAMPageImpression(java.lang.String r12, java.lang.String r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, va.d r17) {
        /*
            r11 = this;
            r6 = r11
            r0 = r17
            boolean r1 = r0 instanceof com.onesignal.inAppMessages.internal.backend.impl.a.h
            if (r1 == 0) goto L_0x0016
            r1 = r0
            com.onesignal.inAppMessages.internal.backend.impl.a$h r1 = (com.onesignal.inAppMessages.internal.backend.impl.a.h) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0016
            int r2 = r2 - r3
            r1.label = r2
            goto L_0x001b
        L_0x0016:
            com.onesignal.inAppMessages.internal.backend.impl.a$h r1 = new com.onesignal.inAppMessages.internal.backend.impl.a$h
            r1.<init>(r11, r0)
        L_0x001b:
            r7 = r1
            java.lang.Object r0 = r7.result
            java.lang.Object r8 = wa.d.c()
            int r1 = r7.label
            r9 = 1
            if (r1 == 0) goto L_0x0039
            if (r1 != r9) goto L_0x0031
            java.lang.Object r1 = r7.L$0
            com.onesignal.inAppMessages.internal.backend.impl.a r1 = (com.onesignal.inAppMessages.internal.backend.impl.a) r1
            sa.o.b(r0)
            goto L_0x006d
        L_0x0031:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0039:
            sa.o.b(r0)
            com.onesignal.inAppMessages.internal.backend.impl.a$i r10 = new com.onesignal.inAppMessages.internal.backend.impl.a$i
            r0 = r10
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r11
            r5 = r16
            r0.<init>(r1, r2, r3, r4, r5)
            s7.b r0 = r6._httpClient
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "in_app_messages/"
            r1.append(r2)
            r2 = r15
            r1.append(r15)
            java.lang.String r2 = "/pageImpression"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r7.L$0 = r6
            r7.label = r9
            java.lang.Object r0 = r0.post(r1, r10, r7)
            if (r0 != r8) goto L_0x006c
            return r8
        L_0x006c:
            r1 = r6
        L_0x006d:
            s7.a r0 = (s7.a) r0
            boolean r2 = r0.isSuccess()
            java.lang.String r3 = "page impression"
            if (r2 == 0) goto L_0x0084
            java.lang.String r0 = r0.getPayload()
            db.l.b(r0)
            r1.printHttpSuccessForInAppMessageRequest(r3, r0)
            sa.t r0 = sa.t.f15300a
            return r0
        L_0x0084:
            int r2 = r0.getStatusCode()
            java.lang.String r4 = r0.getPayload()
            r1.printHttpErrorForInAppMessageRequest(r3, r2, r4)
            h7.a r1 = new h7.a
            int r2 = r0.getStatusCode()
            java.lang.String r0 = r0.getPayload()
            r1.<init>(r2, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.inAppMessages.internal.backend.impl.a.sendIAMPageImpression(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, va.d):java.lang.Object");
    }
}
