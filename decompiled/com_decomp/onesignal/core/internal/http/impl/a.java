package com.onesignal.core.internal.http.impl;

import cb.p;
import db.g;
import kotlin.coroutines.jvm.internal.l;
import mb.h0;
import org.json.JSONObject;
import sa.o;
import sa.t;

public final class a implements s7.b {
    public static final C0131a Companion = new C0131a((g) null);
    private static final String OS_ACCEPT_HEADER = "application/vnd.onesignal.v1+json";
    private static final String OS_API_VERSION = "1";
    private static final int THREAD_ID = 10000;
    /* access modifiers changed from: private */
    public final com.onesignal.core.internal.config.b _configModelStore;
    /* access modifiers changed from: private */
    public final c _connectionFactory;
    /* access modifiers changed from: private */
    public final y7.a _prefs;

    /* renamed from: com.onesignal.core.internal.http.impl.a$a  reason: collision with other inner class name */
    public static final class C0131a {
        private C0131a() {
        }

        public /* synthetic */ C0131a(g gVar) {
            this();
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
            return this.this$0.makeRequest((String) null, (String) null, (JSONObject) null, 0, (String) null, this);
        }
    }

    static final class c extends l implements p {
        final /* synthetic */ String $cacheKey;
        final /* synthetic */ JSONObject $jsonBody;
        final /* synthetic */ String $method;
        final /* synthetic */ int $timeout;
        final /* synthetic */ String $url;
        int label;
        final /* synthetic */ a this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(a aVar, String str, String str2, JSONObject jSONObject, int i10, String str3, va.d dVar) {
            super(2, dVar);
            this.this$0 = aVar;
            this.$url = str;
            this.$method = str2;
            this.$jsonBody = jSONObject;
            this.$timeout = i10;
            this.$cacheKey = str3;
        }

        public final va.d create(Object obj, va.d dVar) {
            return new c(this.this$0, this.$url, this.$method, this.$jsonBody, this.$timeout, this.$cacheKey, dVar);
        }

        public final Object invokeSuspend(Object obj) {
            Object c10 = d.c();
            int i10 = this.label;
            if (i10 == 0) {
                o.b(obj);
                a aVar = this.this$0;
                String str = this.$url;
                String str2 = this.$method;
                JSONObject jSONObject = this.$jsonBody;
                int i11 = this.$timeout;
                String str3 = this.$cacheKey;
                this.label = 1;
                obj = aVar.makeRequestIODispatcher(str, str2, jSONObject, i11, str3, this);
                if (obj == c10) {
                    return c10;
                }
            } else if (i10 == 1) {
                o.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return obj;
        }

        public final Object invoke(h0 h0Var, va.d dVar) {
            return ((c) create(h0Var, dVar)).invokeSuspend(t.f15300a);
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
            return this.this$0.makeRequestIODispatcher((String) null, (String) null, (JSONObject) null, 0, (String) null, this);
        }
    }

    static final class e extends l implements p {
        final /* synthetic */ String $cacheKey;
        final /* synthetic */ JSONObject $jsonBody;
        final /* synthetic */ String $method;
        final /* synthetic */ db.t $retVal;
        final /* synthetic */ int $timeout;
        final /* synthetic */ String $url;
        int label;
        final /* synthetic */ a this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(a aVar, String str, int i10, JSONObject jSONObject, String str2, String str3, db.t tVar, va.d dVar) {
            super(2, dVar);
            this.this$0 = aVar;
            this.$url = str;
            this.$timeout = i10;
            this.$jsonBody = jSONObject;
            this.$method = str2;
            this.$cacheKey = str3;
            this.$retVal = tVar;
        }

        public final va.d create(Object obj, va.d dVar) {
            return new e(this.this$0, this.$url, this.$timeout, this.$jsonBody, this.$method, this.$cacheKey, this.$retVal, dVar);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:103:0x0395, code lost:
            if (r7 == null) goto L_0x0398;
         */
        /* JADX WARNING: Removed duplicated region for block: B:97:0x0351 A[Catch:{ all -> 0x039b }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r20) {
            /*
                r19 = this;
                r1 = r19
                java.lang.String r0 = "OneSignal"
                java.lang.String r2 = "HttpClient: "
                java.lang.Object unused = wa.d.c()
                int r3 = r1.label
                if (r3 != 0) goto L_0x03a2
                sa.o.b(r20)
                int r3 = android.os.Build.VERSION.SDK_INT
                r4 = 26
                if (r3 < r4) goto L_0x001b
                r4 = 10000(0x2710, float:1.4013E-41)
                android.net.TrafficStats.setThreadStatsTag(r4)
            L_0x001b:
                r4 = 2
                r5 = 0
                r6 = -1
                com.onesignal.core.internal.http.impl.a r7 = r1.this$0     // Catch:{ all -> 0x034b }
                com.onesignal.core.internal.http.impl.c r7 = r7._connectionFactory     // Catch:{ all -> 0x034b }
                java.lang.String r8 = r1.$url     // Catch:{ all -> 0x034b }
                java.net.HttpURLConnection r7 = r7.newHttpURLConnection(r8)     // Catch:{ all -> 0x034b }
                r8 = 22
                if (r3 >= r8) goto L_0x0049
                boolean r3 = r7 instanceof javax.net.ssl.HttpsURLConnection     // Catch:{ all -> 0x0349 }
                if (r3 == 0) goto L_0x0049
                r3 = r7
                javax.net.ssl.HttpsURLConnection r3 = (javax.net.ssl.HttpsURLConnection) r3     // Catch:{ all -> 0x0349 }
                com.onesignal.core.internal.http.impl.d r8 = new com.onesignal.core.internal.http.impl.d     // Catch:{ all -> 0x0349 }
                r9 = r7
                javax.net.ssl.HttpsURLConnection r9 = (javax.net.ssl.HttpsURLConnection) r9     // Catch:{ all -> 0x0349 }
                javax.net.ssl.SSLSocketFactory r9 = r9.getSSLSocketFactory()     // Catch:{ all -> 0x0349 }
                java.lang.String r10 = "conHttps.sslSocketFactory"
                db.l.d(r9, r10)     // Catch:{ all -> 0x0349 }
                r8.<init>(r9)     // Catch:{ all -> 0x0349 }
                r3.setSSLSocketFactory(r8)     // Catch:{ all -> 0x0349 }
            L_0x0049:
                r3 = 0
                r7.setUseCaches(r3)     // Catch:{ all -> 0x0349 }
                int r8 = r1.$timeout     // Catch:{ all -> 0x0349 }
                r7.setConnectTimeout(r8)     // Catch:{ all -> 0x0349 }
                int r8 = r1.$timeout     // Catch:{ all -> 0x0349 }
                r7.setReadTimeout(r8)     // Catch:{ all -> 0x0349 }
                java.lang.String r8 = "SDK-Version"
                java.lang.String r9 = "onesignal/android/050100"
                r7.setRequestProperty(r8, r9)     // Catch:{ all -> 0x0349 }
                java.lang.String r8 = com.onesignal.common.m.getSdkType()     // Catch:{ all -> 0x0349 }
                if (r8 == 0) goto L_0x0090
                java.lang.String r8 = com.onesignal.common.m.getSdkVersion()     // Catch:{ all -> 0x0349 }
                if (r8 == 0) goto L_0x0090
                java.lang.String r8 = "SDK-Wrapper"
                java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x0349 }
                r9.<init>()     // Catch:{ all -> 0x0349 }
                java.lang.String r10 = "onesignal/"
                r9.append(r10)     // Catch:{ all -> 0x0349 }
                java.lang.String r10 = com.onesignal.common.m.getSdkType()     // Catch:{ all -> 0x0349 }
                r9.append(r10)     // Catch:{ all -> 0x0349 }
                r10 = 47
                r9.append(r10)     // Catch:{ all -> 0x0349 }
                java.lang.String r10 = com.onesignal.common.m.getSdkVersion()     // Catch:{ all -> 0x0349 }
                r9.append(r10)     // Catch:{ all -> 0x0349 }
                java.lang.String r9 = r9.toString()     // Catch:{ all -> 0x0349 }
                r7.setRequestProperty(r8, r9)     // Catch:{ all -> 0x0349 }
            L_0x0090:
                java.lang.String r8 = "Accept"
                java.lang.String r9 = "application/vnd.onesignal.v1+json"
                r7.setRequestProperty(r8, r9)     // Catch:{ all -> 0x0349 }
                com.onesignal.core.internal.http.impl.a r8 = r1.this$0     // Catch:{ all -> 0x0349 }
                com.onesignal.core.internal.config.b r8 = r8._configModelStore     // Catch:{ all -> 0x0349 }
                com.onesignal.common.modeling.g r8 = r8.getModel()     // Catch:{ all -> 0x0349 }
                com.onesignal.core.internal.config.a r8 = (com.onesignal.core.internal.config.a) r8     // Catch:{ all -> 0x0349 }
                java.lang.String r8 = r8.getPushSubscriptionId()     // Catch:{ all -> 0x0349 }
                r9 = 1
                if (r8 == 0) goto L_0x00b8
                int r10 = r8.length()     // Catch:{ all -> 0x0349 }
                if (r10 <= 0) goto L_0x00b1
                r3 = 1
            L_0x00b1:
                if (r3 == 0) goto L_0x00b8
                java.lang.String r3 = "OneSignal-Subscription-Id"
                r7.setRequestProperty(r3, r8)     // Catch:{ all -> 0x0349 }
            L_0x00b8:
                org.json.JSONObject r3 = r1.$jsonBody     // Catch:{ all -> 0x0349 }
                if (r3 == 0) goto L_0x00bf
                r7.setDoInput(r9)     // Catch:{ all -> 0x0349 }
            L_0x00bf:
                java.lang.String r3 = r1.$method     // Catch:{ all -> 0x0349 }
                if (r3 == 0) goto L_0x00d2
                java.lang.String r3 = "Content-Type"
                java.lang.String r8 = "application/json; charset=UTF-8"
                r7.setRequestProperty(r3, r8)     // Catch:{ all -> 0x0349 }
                java.lang.String r3 = r1.$method     // Catch:{ all -> 0x0349 }
                r7.setRequestMethod(r3)     // Catch:{ all -> 0x0349 }
                r7.setDoOutput(r9)     // Catch:{ all -> 0x0349 }
            L_0x00d2:
                org.json.JSONObject r3 = r1.$jsonBody     // Catch:{ all -> 0x0349 }
                java.lang.String r8 = "UTF-8"
                r9 = 32
                java.lang.String r10 = "GET"
                if (r3 == 0) goto L_0x0127
                com.onesignal.common.j r11 = com.onesignal.common.j.INSTANCE     // Catch:{ all -> 0x0349 }
                java.lang.String r3 = r11.toUnescapedEUIDString(r3)     // Catch:{ all -> 0x0349 }
                java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x0349 }
                r11.<init>()     // Catch:{ all -> 0x0349 }
                r11.append(r2)     // Catch:{ all -> 0x0349 }
                java.lang.String r12 = r1.$method     // Catch:{ all -> 0x0349 }
                if (r12 != 0) goto L_0x00ef
                r12 = r10
            L_0x00ef:
                r11.append(r12)     // Catch:{ all -> 0x0349 }
                r11.append(r9)     // Catch:{ all -> 0x0349 }
                java.lang.String r12 = r1.$url     // Catch:{ all -> 0x0349 }
                r11.append(r12)     // Catch:{ all -> 0x0349 }
                java.lang.String r12 = " - "
                r11.append(r12)     // Catch:{ all -> 0x0349 }
                r11.append(r3)     // Catch:{ all -> 0x0349 }
                java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x0349 }
                com.onesignal.debug.internal.logging.a.debug$default(r11, r5, r4, r5)     // Catch:{ all -> 0x0349 }
                java.nio.charset.Charset r11 = java.nio.charset.Charset.forName(r8)     // Catch:{ all -> 0x0349 }
                java.lang.String r12 = "forName(charsetName)"
                db.l.d(r11, r12)     // Catch:{ all -> 0x0349 }
                byte[] r3 = r3.getBytes(r11)     // Catch:{ all -> 0x0349 }
                java.lang.String r11 = "this as java.lang.String).getBytes(charset)"
                db.l.d(r3, r11)     // Catch:{ all -> 0x0349 }
                int r11 = r3.length     // Catch:{ all -> 0x0349 }
                r7.setFixedLengthStreamingMode(r11)     // Catch:{ all -> 0x0349 }
                java.io.OutputStream r11 = r7.getOutputStream()     // Catch:{ all -> 0x0349 }
                r11.write(r3)     // Catch:{ all -> 0x0349 }
                goto L_0x0146
            L_0x0127:
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0349 }
                r3.<init>()     // Catch:{ all -> 0x0349 }
                r3.append(r2)     // Catch:{ all -> 0x0349 }
                java.lang.String r11 = r1.$method     // Catch:{ all -> 0x0349 }
                if (r11 != 0) goto L_0x0134
                r11 = r10
            L_0x0134:
                r3.append(r11)     // Catch:{ all -> 0x0349 }
                r3.append(r9)     // Catch:{ all -> 0x0349 }
                java.lang.String r11 = r1.$url     // Catch:{ all -> 0x0349 }
                r3.append(r11)     // Catch:{ all -> 0x0349 }
                java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0349 }
                com.onesignal.debug.internal.logging.a.debug$default(r3, r5, r4, r5)     // Catch:{ all -> 0x0349 }
            L_0x0146:
                java.lang.String r3 = r1.$cacheKey     // Catch:{ all -> 0x0349 }
                java.lang.String r11 = "PREFS_OS_ETAG_PREFIX_"
                if (r3 == 0) goto L_0x0189
                com.onesignal.core.internal.http.impl.a r3 = r1.this$0     // Catch:{ all -> 0x0349 }
                y7.a r12 = r3._prefs     // Catch:{ all -> 0x0349 }
                java.lang.String r13 = "OneSignal"
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0349 }
                r3.<init>()     // Catch:{ all -> 0x0349 }
                r3.append(r11)     // Catch:{ all -> 0x0349 }
                java.lang.String r14 = r1.$cacheKey     // Catch:{ all -> 0x0349 }
                r3.append(r14)     // Catch:{ all -> 0x0349 }
                java.lang.String r14 = r3.toString()     // Catch:{ all -> 0x0349 }
                r15 = 0
                r16 = 4
                r17 = 0
                java.lang.String r3 = y7.a.C0324a.getString$default(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x0349 }
                if (r3 == 0) goto L_0x0189
                java.lang.String r12 = "if-none-match"
                r7.setRequestProperty(r12, r3)     // Catch:{ all -> 0x0349 }
                java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ all -> 0x0349 }
                r12.<init>()     // Catch:{ all -> 0x0349 }
                java.lang.String r13 = "HttpClient: Adding header if-none-match: "
                r12.append(r13)     // Catch:{ all -> 0x0349 }
                r12.append(r3)     // Catch:{ all -> 0x0349 }
                java.lang.String r3 = r12.toString()     // Catch:{ all -> 0x0349 }
                com.onesignal.debug.internal.logging.a.debug$default(r3, r5, r4, r5)     // Catch:{ all -> 0x0349 }
            L_0x0189:
                int r6 = r7.getResponseCode()     // Catch:{ all -> 0x0349 }
                r3 = 304(0x130, float:4.26E-43)
                java.lang.String r12 = "PREFS_OS_HTTP_CACHE_PREFIX_"
                if (r6 == r3) goto L_0x02ea
                java.lang.String r3 = ""
                java.lang.String r13 = "\\A"
                switch(r6) {
                    case 200: goto L_0x0236;
                    case 201: goto L_0x0236;
                    case 202: goto L_0x0236;
                    default: goto L_0x019a;
                }
            L_0x019a:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0349 }
                r0.<init>()     // Catch:{ all -> 0x0349 }
                r0.append(r2)     // Catch:{ all -> 0x0349 }
                java.lang.String r11 = r1.$method     // Catch:{ all -> 0x0349 }
                if (r11 != 0) goto L_0x01a7
                goto L_0x01a8
            L_0x01a7:
                r10 = r11
            L_0x01a8:
                r0.append(r10)     // Catch:{ all -> 0x0349 }
                r0.append(r9)     // Catch:{ all -> 0x0349 }
                java.lang.String r9 = r1.$url     // Catch:{ all -> 0x0349 }
                r0.append(r9)     // Catch:{ all -> 0x0349 }
                java.lang.String r9 = " - FAILED STATUS: "
                r0.append(r9)     // Catch:{ all -> 0x0349 }
                r0.append(r6)     // Catch:{ all -> 0x0349 }
                java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0349 }
                com.onesignal.debug.internal.logging.a.debug$default(r0, r5, r4, r5)     // Catch:{ all -> 0x0349 }
                java.io.InputStream r0 = r7.getErrorStream()     // Catch:{ all -> 0x0349 }
                if (r0 != 0) goto L_0x01cc
                java.io.InputStream r0 = r7.getInputStream()     // Catch:{ all -> 0x0349 }
            L_0x01cc:
                if (r0 == 0) goto L_0x0202
                java.util.Scanner r9 = new java.util.Scanner     // Catch:{ all -> 0x0349 }
                r9.<init>(r0, r8)     // Catch:{ all -> 0x0349 }
                java.util.Scanner r0 = r9.useDelimiter(r13)     // Catch:{ all -> 0x0349 }
                boolean r0 = r0.hasNext()     // Catch:{ all -> 0x0349 }
                if (r0 == 0) goto L_0x01e1
                java.lang.String r3 = r9.next()     // Catch:{ all -> 0x0349 }
            L_0x01e1:
                r9.close()     // Catch:{ all -> 0x0349 }
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0349 }
                r0.<init>()     // Catch:{ all -> 0x0349 }
                r0.append(r2)     // Catch:{ all -> 0x0349 }
                java.lang.String r8 = r1.$method     // Catch:{ all -> 0x0349 }
                r0.append(r8)     // Catch:{ all -> 0x0349 }
                java.lang.String r8 = " RECEIVED JSON: "
                r0.append(r8)     // Catch:{ all -> 0x0349 }
                r0.append(r3)     // Catch:{ all -> 0x0349 }
                java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0349 }
                com.onesignal.debug.internal.logging.a.warn$default(r0, r5, r4, r5)     // Catch:{ all -> 0x0349 }
                r14 = r3
                goto L_0x0224
            L_0x0202:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0349 }
                r0.<init>()     // Catch:{ all -> 0x0349 }
                r0.append(r2)     // Catch:{ all -> 0x0349 }
                java.lang.String r3 = r1.$method     // Catch:{ all -> 0x0349 }
                r0.append(r3)     // Catch:{ all -> 0x0349 }
                java.lang.String r3 = " HTTP Code: "
                r0.append(r3)     // Catch:{ all -> 0x0349 }
                r0.append(r6)     // Catch:{ all -> 0x0349 }
                java.lang.String r3 = " No response body!"
                r0.append(r3)     // Catch:{ all -> 0x0349 }
                java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0349 }
                com.onesignal.debug.internal.logging.a.warn$default(r0, r5, r4, r5)     // Catch:{ all -> 0x0349 }
                r14 = r5
            L_0x0224:
                db.t r0 = r1.$retVal     // Catch:{ all -> 0x0349 }
                s7.a r3 = new s7.a     // Catch:{ all -> 0x0349 }
                r15 = 0
                r16 = 4
                r17 = 0
                r12 = r3
                r13 = r6
                r12.<init>(r13, r14, r15, r16, r17)     // Catch:{ all -> 0x0349 }
            L_0x0232:
                r0.f9426e = r3     // Catch:{ all -> 0x0349 }
                goto L_0x0345
            L_0x0236:
                java.io.InputStream r14 = r7.getInputStream()     // Catch:{ all -> 0x0349 }
                java.util.Scanner r15 = new java.util.Scanner     // Catch:{ all -> 0x0349 }
                r15.<init>(r14, r8)     // Catch:{ all -> 0x0349 }
                java.util.Scanner r8 = r15.useDelimiter(r13)     // Catch:{ all -> 0x0349 }
                boolean r8 = r8.hasNext()     // Catch:{ all -> 0x0349 }
                if (r8 == 0) goto L_0x024d
                java.lang.String r3 = r15.next()     // Catch:{ all -> 0x0349 }
            L_0x024d:
                r14 = r3
                r15.close()     // Catch:{ all -> 0x0349 }
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0349 }
                r3.<init>()     // Catch:{ all -> 0x0349 }
                r3.append(r2)     // Catch:{ all -> 0x0349 }
                java.lang.String r8 = r1.$method     // Catch:{ all -> 0x0349 }
                if (r8 != 0) goto L_0x025e
                goto L_0x025f
            L_0x025e:
                r10 = r8
            L_0x025f:
                r3.append(r10)     // Catch:{ all -> 0x0349 }
                r3.append(r9)     // Catch:{ all -> 0x0349 }
                java.lang.String r8 = r1.$url     // Catch:{ all -> 0x0349 }
                r3.append(r8)     // Catch:{ all -> 0x0349 }
                java.lang.String r8 = " - STATUS: "
                r3.append(r8)     // Catch:{ all -> 0x0349 }
                r3.append(r6)     // Catch:{ all -> 0x0349 }
                java.lang.String r8 = " JSON: "
                r3.append(r8)     // Catch:{ all -> 0x0349 }
                r3.append(r14)     // Catch:{ all -> 0x0349 }
                java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0349 }
                com.onesignal.debug.internal.logging.a.debug$default(r3, r5, r4, r5)     // Catch:{ all -> 0x0349 }
                java.lang.String r3 = r1.$cacheKey     // Catch:{ all -> 0x0349 }
                if (r3 == 0) goto L_0x02da
                java.lang.String r3 = "etag"
                java.lang.String r3 = r7.getHeaderField(r3)     // Catch:{ all -> 0x0349 }
                if (r3 == 0) goto L_0x02da
                java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x0349 }
                r8.<init>()     // Catch:{ all -> 0x0349 }
                java.lang.String r9 = "HttpClient: Response has etag of "
                r8.append(r9)     // Catch:{ all -> 0x0349 }
                r8.append(r3)     // Catch:{ all -> 0x0349 }
                java.lang.String r9 = " so caching the response."
                r8.append(r9)     // Catch:{ all -> 0x0349 }
                java.lang.String r8 = r8.toString()     // Catch:{ all -> 0x0349 }
                com.onesignal.debug.internal.logging.a.debug$default(r8, r5, r4, r5)     // Catch:{ all -> 0x0349 }
                com.onesignal.core.internal.http.impl.a r8 = r1.this$0     // Catch:{ all -> 0x0349 }
                y7.a r8 = r8._prefs     // Catch:{ all -> 0x0349 }
                java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x0349 }
                r9.<init>()     // Catch:{ all -> 0x0349 }
                r9.append(r11)     // Catch:{ all -> 0x0349 }
                java.lang.String r10 = r1.$cacheKey     // Catch:{ all -> 0x0349 }
                r9.append(r10)     // Catch:{ all -> 0x0349 }
                java.lang.String r9 = r9.toString()     // Catch:{ all -> 0x0349 }
                r8.saveString(r0, r9, r3)     // Catch:{ all -> 0x0349 }
                com.onesignal.core.internal.http.impl.a r3 = r1.this$0     // Catch:{ all -> 0x0349 }
                y7.a r3 = r3._prefs     // Catch:{ all -> 0x0349 }
                java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x0349 }
                r8.<init>()     // Catch:{ all -> 0x0349 }
                r8.append(r12)     // Catch:{ all -> 0x0349 }
                java.lang.String r9 = r1.$cacheKey     // Catch:{ all -> 0x0349 }
                r8.append(r9)     // Catch:{ all -> 0x0349 }
                java.lang.String r8 = r8.toString()     // Catch:{ all -> 0x0349 }
                r3.saveString(r0, r8, r14)     // Catch:{ all -> 0x0349 }
            L_0x02da:
                db.t r0 = r1.$retVal     // Catch:{ all -> 0x0349 }
                s7.a r3 = new s7.a     // Catch:{ all -> 0x0349 }
                r15 = 0
                r16 = 4
                r17 = 0
                r12 = r3
                r13 = r6
                r12.<init>(r13, r14, r15, r16, r17)     // Catch:{ all -> 0x0349 }
                goto L_0x0232
            L_0x02ea:
                com.onesignal.core.internal.http.impl.a r0 = r1.this$0     // Catch:{ all -> 0x0349 }
                y7.a r13 = r0._prefs     // Catch:{ all -> 0x0349 }
                java.lang.String r14 = "OneSignal"
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0349 }
                r0.<init>()     // Catch:{ all -> 0x0349 }
                r0.append(r12)     // Catch:{ all -> 0x0349 }
                java.lang.String r3 = r1.$cacheKey     // Catch:{ all -> 0x0349 }
                r0.append(r3)     // Catch:{ all -> 0x0349 }
                java.lang.String r15 = r0.toString()     // Catch:{ all -> 0x0349 }
                r16 = 0
                r17 = 4
                r18 = 0
                java.lang.String r14 = y7.a.C0324a.getString$default(r13, r14, r15, r16, r17, r18)     // Catch:{ all -> 0x0349 }
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0349 }
                r0.<init>()     // Catch:{ all -> 0x0349 }
                r0.append(r2)     // Catch:{ all -> 0x0349 }
                java.lang.String r3 = r1.$method     // Catch:{ all -> 0x0349 }
                if (r3 != 0) goto L_0x031a
                goto L_0x031b
            L_0x031a:
                r10 = r3
            L_0x031b:
                r0.append(r10)     // Catch:{ all -> 0x0349 }
                r0.append(r9)     // Catch:{ all -> 0x0349 }
                java.lang.String r3 = r1.$url     // Catch:{ all -> 0x0349 }
                r0.append(r3)     // Catch:{ all -> 0x0349 }
                java.lang.String r3 = " - Using Cached response due to 304: "
                r0.append(r3)     // Catch:{ all -> 0x0349 }
                r0.append(r14)     // Catch:{ all -> 0x0349 }
                java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0349 }
                com.onesignal.debug.internal.logging.a.debug$default(r0, r5, r4, r5)     // Catch:{ all -> 0x0349 }
                db.t r0 = r1.$retVal     // Catch:{ all -> 0x0349 }
                s7.a r3 = new s7.a     // Catch:{ all -> 0x0349 }
                r15 = 0
                r16 = 4
                r17 = 0
                r12 = r3
                r13 = r6
                r12.<init>(r13, r14, r15, r16, r17)     // Catch:{ all -> 0x0349 }
                goto L_0x0232
            L_0x0345:
                r7.disconnect()
                goto L_0x0398
            L_0x0349:
                r0 = move-exception
                goto L_0x034d
            L_0x034b:
                r0 = move-exception
                r7 = r5
            L_0x034d:
                boolean r3 = r0 instanceof java.net.ConnectException     // Catch:{ all -> 0x039b }
                if (r3 != 0) goto L_0x0370
                boolean r3 = r0 instanceof java.net.UnknownHostException     // Catch:{ all -> 0x039b }
                if (r3 == 0) goto L_0x0356
                goto L_0x0370
            L_0x0356:
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x039b }
                r3.<init>()     // Catch:{ all -> 0x039b }
                r3.append(r2)     // Catch:{ all -> 0x039b }
                java.lang.String r2 = r1.$method     // Catch:{ all -> 0x039b }
                r3.append(r2)     // Catch:{ all -> 0x039b }
                java.lang.String r2 = " Error thrown from network stack. "
                r3.append(r2)     // Catch:{ all -> 0x039b }
                java.lang.String r2 = r3.toString()     // Catch:{ all -> 0x039b }
                com.onesignal.debug.internal.logging.a.warn(r2, r0)     // Catch:{ all -> 0x039b }
                goto L_0x038c
            L_0x0370:
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x039b }
                r2.<init>()     // Catch:{ all -> 0x039b }
                java.lang.String r3 = "HttpClient: Could not send last request, device is offline. Throwable: "
                r2.append(r3)     // Catch:{ all -> 0x039b }
                java.lang.Class r3 = r0.getClass()     // Catch:{ all -> 0x039b }
                java.lang.String r3 = r3.getName()     // Catch:{ all -> 0x039b }
                r2.append(r3)     // Catch:{ all -> 0x039b }
                java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x039b }
                com.onesignal.debug.internal.logging.a.info$default(r2, r5, r4, r5)     // Catch:{ all -> 0x039b }
            L_0x038c:
                db.t r2 = r1.$retVal     // Catch:{ all -> 0x039b }
                s7.a r3 = new s7.a     // Catch:{ all -> 0x039b }
                r3.<init>(r6, r5, r0)     // Catch:{ all -> 0x039b }
                r2.f9426e = r3     // Catch:{ all -> 0x039b }
                if (r7 == 0) goto L_0x0398
                goto L_0x0345
            L_0x0398:
                sa.t r0 = sa.t.f15300a
                return r0
            L_0x039b:
                r0 = move-exception
                if (r7 == 0) goto L_0x03a1
                r7.disconnect()
            L_0x03a1:
                throw r0
            L_0x03a2:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r2)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onesignal.core.internal.http.impl.a.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        public final Object invoke(h0 h0Var, va.d dVar) {
            return ((e) create(h0Var, dVar)).invokeSuspend(t.f15300a);
        }
    }

    public a(c cVar, y7.a aVar, com.onesignal.core.internal.config.b bVar) {
        db.l.e(cVar, "_connectionFactory");
        db.l.e(aVar, "_prefs");
        db.l.e(bVar, "_configModelStore");
        this._connectionFactory = cVar;
        this._prefs = aVar;
        this._configModelStore = bVar;
    }

    private final int getThreadTimeout(int i10) {
        return i10 + 5000;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: java.lang.String} */
    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00c8, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00ce, code lost:
        return new s7.a(0, (java.lang.String) null, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00cf, code lost:
        r0 = e;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:10:0x0035, B:25:0x009c] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00c8 A[ExcHandler: all (r0v2 'th' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:10:0x0035] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object makeRequest(java.lang.String r20, java.lang.String r21, org.json.JSONObject r22, int r23, java.lang.String r24, va.d r25) {
        /*
            r19 = this;
            r9 = r19
            r10 = r20
            r0 = r21
            r1 = r25
            boolean r2 = r1 instanceof com.onesignal.core.internal.http.impl.a.b
            if (r2 == 0) goto L_0x001b
            r2 = r1
            com.onesignal.core.internal.http.impl.a$b r2 = (com.onesignal.core.internal.http.impl.a.b) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x001b
            int r3 = r3 - r4
            r2.label = r3
            goto L_0x0020
        L_0x001b:
            com.onesignal.core.internal.http.impl.a$b r2 = new com.onesignal.core.internal.http.impl.a$b
            r2.<init>(r9, r1)
        L_0x0020:
            r11 = r2
            java.lang.Object r1 = r11.result
            java.lang.Object r12 = wa.d.c()
            int r2 = r11.label
            r13 = 0
            r14 = 1
            r15 = 0
            if (r2 == 0) goto L_0x0046
            if (r2 != r14) goto L_0x003e
            java.lang.Object r0 = r11.L$0
            r2 = r0
            java.lang.String r2 = (java.lang.String) r2
            sa.o.b(r1)     // Catch:{ j2 -> 0x003a, all -> 0x00c8 }
            goto L_0x00c7
        L_0x003a:
            r0 = move-exception
            r10 = r2
            goto L_0x00d0
        L_0x003e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0046:
            sa.o.b(r1)
            if (r0 == 0) goto L_0x009a
            com.onesignal.core.internal.config.b r1 = r9._configModelStore
            com.onesignal.common.modeling.g r1 = r1.getModel()
            com.onesignal.core.internal.config.a r1 = (com.onesignal.core.internal.config.a) r1
            java.lang.Boolean r1 = r1.getConsentRequired()
            java.lang.Boolean r2 = kotlin.coroutines.jvm.internal.b.a(r14)
            boolean r1 = db.l.a(r1, r2)
            if (r1 == 0) goto L_0x009a
            com.onesignal.core.internal.config.b r1 = r9._configModelStore
            com.onesignal.common.modeling.g r1 = r1.getModel()
            com.onesignal.core.internal.config.a r1 = (com.onesignal.core.internal.config.a) r1
            java.lang.Boolean r1 = r1.getConsentGiven()
            java.lang.Boolean r2 = kotlin.coroutines.jvm.internal.b.a(r14)
            boolean r1 = db.l.a(r1, r2)
            if (r1 != 0) goto L_0x009a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = " `"
            r1.append(r0)
            r1.append(r10)
            java.lang.String r0 = "` was called before the user provided privacy consent. Your application is set to require the user's privacy consent before the OneSignal SDK can be initialized. Please ensure the user has provided consent before calling this method. You can check the latest OneSignal consent status by calling OneSignal.privacyConsent"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r1 = 2
            com.onesignal.debug.internal.logging.a.warn$default(r0, r15, r1, r15)
            s7.a r0 = new s7.a
            r0.<init>(r13, r15, r15)
            return r0
        L_0x009a:
            r6 = r23
            int r1 = r9.getThreadTimeout(r6)     // Catch:{ j2 -> 0x00cf, all -> 0x00c8 }
            long r7 = (long) r1     // Catch:{ j2 -> 0x00cf, all -> 0x00c8 }
            com.onesignal.core.internal.http.impl.a$c r5 = new com.onesignal.core.internal.http.impl.a$c     // Catch:{ j2 -> 0x00cf, all -> 0x00c8 }
            r16 = 0
            r1 = r5
            r2 = r19
            r3 = r20
            r4 = r21
            r0 = r5
            r5 = r22
            r6 = r23
            r17 = r7
            r7 = r24
            r8 = r16
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ j2 -> 0x00cf, all -> 0x00c8 }
            r11.L$0 = r10     // Catch:{ j2 -> 0x00cf, all -> 0x00c8 }
            r11.label = r14     // Catch:{ j2 -> 0x00cf, all -> 0x00c8 }
            r1 = r17
            java.lang.Object r1 = mb.l2.c(r1, r0, r11)     // Catch:{ j2 -> 0x00cf, all -> 0x00c8 }
            if (r1 != r12) goto L_0x00c7
            return r12
        L_0x00c7:
            return r1
        L_0x00c8:
            r0 = move-exception
            s7.a r1 = new s7.a
            r1.<init>(r13, r15, r0)
            return r1
        L_0x00cf:
            r0 = move-exception
        L_0x00d0:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "HttpClient: Request timed out: "
            r1.append(r2)
            r1.append(r10)
            java.lang.String r1 = r1.toString()
            com.onesignal.debug.internal.logging.a.error(r1, r0)
            s7.a r1 = new s7.a
            r1.<init>(r13, r15, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.core.internal.http.impl.a.makeRequest(java.lang.String, java.lang.String, org.json.JSONObject, int, java.lang.String, va.d):java.lang.Object");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0029  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object makeRequestIODispatcher(java.lang.String r19, java.lang.String r20, org.json.JSONObject r21, int r22, java.lang.String r23, va.d r24) {
        /*
            r18 = this;
            r0 = r24
            boolean r1 = r0 instanceof com.onesignal.core.internal.http.impl.a.d
            if (r1 == 0) goto L_0x0017
            r1 = r0
            com.onesignal.core.internal.http.impl.a$d r1 = (com.onesignal.core.internal.http.impl.a.d) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0017
            int r2 = r2 - r3
            r1.label = r2
            r11 = r18
            goto L_0x001e
        L_0x0017:
            com.onesignal.core.internal.http.impl.a$d r1 = new com.onesignal.core.internal.http.impl.a$d
            r11 = r18
            r1.<init>(r11, r0)
        L_0x001e:
            java.lang.Object r0 = r1.result
            java.lang.Object r12 = wa.d.c()
            int r2 = r1.label
            r13 = 1
            if (r2 == 0) goto L_0x003b
            if (r2 != r13) goto L_0x0033
            java.lang.Object r1 = r1.L$0
            db.t r1 = (db.t) r1
            sa.o.b(r0)
            goto L_0x007e
        L_0x0033:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x003b:
            sa.o.b(r0)
            db.t r0 = new db.t
            r0.<init>()
            mb.h1 r14 = mb.h1.f13395e
            mb.d0 r15 = mb.w0.b()
            r16 = 0
            com.onesignal.core.internal.http.impl.a$e r17 = new com.onesignal.core.internal.http.impl.a$e
            r10 = 0
            r2 = r17
            r3 = r18
            r4 = r19
            r5 = r22
            r6 = r21
            r7 = r20
            r8 = r23
            r9 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            r2 = 2
            r3 = 0
            r19 = r14
            r20 = r15
            r21 = r16
            r22 = r17
            r23 = r2
            r24 = r3
            mb.o1 r2 = mb.j.d(r19, r20, r21, r22, r23, r24)
            r1.L$0 = r0
            r1.label = r13
            java.lang.Object r1 = r2.V(r1)
            if (r1 != r12) goto L_0x007d
            return r12
        L_0x007d:
            r1 = r0
        L_0x007e:
            java.lang.Object r0 = r1.f9426e
            db.l.b(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.core.internal.http.impl.a.makeRequestIODispatcher(java.lang.String, java.lang.String, org.json.JSONObject, int, java.lang.String, va.d):java.lang.Object");
    }

    public Object delete(String str, va.d dVar) {
        return makeRequest(str, "DELETE", (JSONObject) null, ((com.onesignal.core.internal.config.a) this._configModelStore.getModel()).getHttpTimeout(), (String) null, dVar);
    }

    public Object get(String str, String str2, va.d dVar) {
        return makeRequest(str, (String) null, (JSONObject) null, ((com.onesignal.core.internal.config.a) this._configModelStore.getModel()).getHttpGetTimeout(), str2, dVar);
    }

    public Object patch(String str, JSONObject jSONObject, va.d dVar) {
        return makeRequest(str, "PATCH", jSONObject, ((com.onesignal.core.internal.config.a) this._configModelStore.getModel()).getHttpTimeout(), (String) null, dVar);
    }

    public Object post(String str, JSONObject jSONObject, va.d dVar) {
        return makeRequest(str, "POST", jSONObject, ((com.onesignal.core.internal.config.a) this._configModelStore.getModel()).getHttpTimeout(), (String) null, dVar);
    }

    public Object put(String str, JSONObject jSONObject, va.d dVar) {
        return makeRequest(str, "PUT", jSONObject, ((com.onesignal.core.internal.config.a) this._configModelStore.getModel()).getHttpTimeout(), (String) null, dVar);
    }
}
