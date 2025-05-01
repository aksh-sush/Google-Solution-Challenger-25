package com.onesignal.inAppMessages.internal.display.impl;

import android.app.Activity;
import cb.p;
import db.g;
import kotlin.coroutines.jvm.internal.l;
import mb.h0;
import sa.o;
import sa.t;

public final class b implements h8.a {
    public static final a Companion = new a((g) null);
    private static final int IN_APP_MESSAGE_INIT_DELAY = 200;
    private final l7.f _applicationService;
    private final f8.b _backend;
    private final com.onesignal.core.internal.config.b _configModelStore;
    private final t9.a _influenceManager;
    private final t7.a _languageContext;
    private final j8.b _lifecycle;
    private final m8.a _promptFactory;
    private final a8.a _time;
    private i lastInstance;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }
    }

    /* renamed from: com.onesignal.inAppMessages.internal.display.impl.b$b  reason: collision with other inner class name */
    static final class C0142b extends kotlin.coroutines.jvm.internal.d {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ b this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0142b(b bVar, va.d dVar) {
            super(dVar);
            this.this$0 = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.displayMessage((com.onesignal.inAppMessages.internal.a) null, this);
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.d {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ b this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(b bVar, va.d dVar) {
            super(dVar);
            this.this$0 = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.displayPreviewMessage((String) null, this);
        }
    }

    static final class d extends kotlin.coroutines.jvm.internal.d {
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ b this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(b bVar, va.d dVar) {
            super(dVar);
            this.this$0 = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.initInAppMessage((Activity) null, (com.onesignal.inAppMessages.internal.a) null, (com.onesignal.inAppMessages.internal.d) null, this);
        }
    }

    static final class e extends l implements p {
        final /* synthetic */ String $base64Str;
        final /* synthetic */ com.onesignal.inAppMessages.internal.d $content;
        final /* synthetic */ Activity $currentActivity;
        final /* synthetic */ i $webViewManager;
        int label;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(i iVar, Activity activity, String str, com.onesignal.inAppMessages.internal.d dVar, va.d dVar2) {
            super(2, dVar2);
            this.$webViewManager = iVar;
            this.$currentActivity = activity;
            this.$base64Str = str;
            this.$content = dVar;
        }

        public final va.d create(Object obj, va.d dVar) {
            return new e(this.$webViewManager, this.$currentActivity, this.$base64Str, this.$content, dVar);
        }

        public final Object invokeSuspend(Object obj) {
            Object c10 = d.c();
            int i10 = this.label;
            if (i10 == 0) {
                o.b(obj);
                i iVar = this.$webViewManager;
                Activity activity = this.$currentActivity;
                String str = this.$base64Str;
                db.l.d(str, "base64Str");
                boolean isFullBleed = this.$content.isFullBleed();
                this.label = 1;
                if (iVar.setupWebView(activity, str, isFullBleed, this) == c10) {
                    return c10;
                }
            } else if (i10 == 1) {
                try {
                    o.b(obj);
                } catch (Exception e10) {
                    if (e10.getMessage() != null) {
                        String message = e10.getMessage();
                        db.l.b(message);
                        if (q.w(message, "No WebView installed", false, 2, (Object) null)) {
                            com.onesignal.debug.internal.logging.a.error("Error setting up WebView: ", e10);
                        }
                    }
                    throw e10;
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return t.f15300a;
        }

        public final Object invoke(h0 h0Var, va.d dVar) {
            return ((e) create(h0Var, dVar)).invokeSuspend(t.f15300a);
        }
    }

    static final class f extends kotlin.coroutines.jvm.internal.d {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ b this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(b bVar, va.d dVar) {
            super(dVar);
            this.this$0 = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.showMessageContent((com.onesignal.inAppMessages.internal.a) null, (com.onesignal.inAppMessages.internal.d) null, this);
        }
    }

    public b(l7.f fVar, j8.b bVar, m8.a aVar, f8.b bVar2, t9.a aVar2, com.onesignal.core.internal.config.b bVar3, t7.a aVar3, a8.a aVar4) {
        db.l.e(fVar, "_applicationService");
        db.l.e(bVar, "_lifecycle");
        db.l.e(aVar, "_promptFactory");
        db.l.e(bVar2, "_backend");
        db.l.e(aVar2, "_influenceManager");
        db.l.e(bVar3, "_configModelStore");
        db.l.e(aVar3, "_languageContext");
        db.l.e(aVar4, "_time");
        this._applicationService = fVar;
        this._lifecycle = bVar;
        this._promptFactory = aVar;
        this._backend = bVar2;
        this._influenceManager = aVar2;
        this._configModelStore = bVar3;
        this._languageContext = aVar3;
        this._time = aVar4;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object initInAppMessage(android.app.Activity r18, com.onesignal.inAppMessages.internal.a r19, com.onesignal.inAppMessages.internal.d r20, va.d r21) {
        /*
            r17 = this;
            r1 = r17
            r0 = r21
            boolean r2 = r0 instanceof com.onesignal.inAppMessages.internal.display.impl.b.d
            if (r2 == 0) goto L_0x0017
            r2 = r0
            com.onesignal.inAppMessages.internal.display.impl.b$d r2 = (com.onesignal.inAppMessages.internal.display.impl.b.d) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.label = r3
            goto L_0x001c
        L_0x0017:
            com.onesignal.inAppMessages.internal.display.impl.b$d r2 = new com.onesignal.inAppMessages.internal.display.impl.b$d
            r2.<init>(r1, r0)
        L_0x001c:
            java.lang.Object r0 = r2.result
            java.lang.Object r3 = wa.d.c()
            int r4 = r2.label
            r5 = 1
            if (r4 == 0) goto L_0x0039
            if (r4 != r5) goto L_0x0031
            sa.o.b(r0)     // Catch:{ UnsupportedEncodingException -> 0x002e }
            goto L_0x00a1
        L_0x002e:
            r0 = move-exception
            goto L_0x009c
        L_0x0031:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x0039:
            sa.o.b(r0)
            java.lang.String r0 = r20.getContentHtml()     // Catch:{ UnsupportedEncodingException -> 0x002e }
            db.l.b(r0)     // Catch:{ UnsupportedEncodingException -> 0x002e }
            java.lang.String r4 = "UTF-8"
            java.nio.charset.Charset r4 = java.nio.charset.Charset.forName(r4)     // Catch:{ UnsupportedEncodingException -> 0x002e }
            java.lang.String r6 = "forName(charsetName)"
            db.l.d(r4, r6)     // Catch:{ UnsupportedEncodingException -> 0x002e }
            byte[] r0 = r0.getBytes(r4)     // Catch:{ UnsupportedEncodingException -> 0x002e }
            java.lang.String r4 = "this as java.lang.String).getBytes(charset)"
            db.l.d(r0, r4)     // Catch:{ UnsupportedEncodingException -> 0x002e }
            r4 = 2
            java.lang.String r9 = android.util.Base64.encodeToString(r0, r4)     // Catch:{ UnsupportedEncodingException -> 0x002e }
            com.onesignal.inAppMessages.internal.display.impl.i r7 = new com.onesignal.inAppMessages.internal.display.impl.i     // Catch:{ UnsupportedEncodingException -> 0x002e }
            j8.b r14 = r1._lifecycle     // Catch:{ UnsupportedEncodingException -> 0x002e }
            l7.f r15 = r1._applicationService     // Catch:{ UnsupportedEncodingException -> 0x002e }
            m8.a r0 = r1._promptFactory     // Catch:{ UnsupportedEncodingException -> 0x002e }
            r10 = r7
            r11 = r19
            r12 = r18
            r13 = r20
            r16 = r0
            r10.<init>(r11, r12, r13, r14, r15, r16)     // Catch:{ UnsupportedEncodingException -> 0x002e }
            r1.lastInstance = r7     // Catch:{ UnsupportedEncodingException -> 0x002e }
            boolean r0 = r20.isFullBleed()     // Catch:{ UnsupportedEncodingException -> 0x002e }
            if (r0 == 0) goto L_0x0080
            r0 = r18
            r4 = r20
            r7.setContentSafeAreaInsets(r4, r0)     // Catch:{ UnsupportedEncodingException -> 0x002e }
            goto L_0x0084
        L_0x0080:
            r0 = r18
            r4 = r20
        L_0x0084:
            mb.z1 r12 = mb.w0.c()     // Catch:{ UnsupportedEncodingException -> 0x002e }
            com.onesignal.inAppMessages.internal.display.impl.b$e r13 = new com.onesignal.inAppMessages.internal.display.impl.b$e     // Catch:{ UnsupportedEncodingException -> 0x002e }
            r11 = 0
            r6 = r13
            r8 = r18
            r10 = r20
            r6.<init>(r7, r8, r9, r10, r11)     // Catch:{ UnsupportedEncodingException -> 0x002e }
            r2.label = r5     // Catch:{ UnsupportedEncodingException -> 0x002e }
            java.lang.Object r0 = mb.h.g(r12, r13, r2)     // Catch:{ UnsupportedEncodingException -> 0x002e }
            if (r0 != r3) goto L_0x00a1
            return r3
        L_0x009c:
            java.lang.String r2 = "Catch on initInAppMessage: "
            com.onesignal.debug.internal.logging.a.error(r2, r0)
        L_0x00a1:
            sa.t r0 = sa.t.f15300a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.inAppMessages.internal.display.impl.b.initInAppMessage(android.app.Activity, com.onesignal.inAppMessages.internal.a, com.onesignal.inAppMessages.internal.d, va.d):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v5, resolved type: com.onesignal.inAppMessages.internal.d} */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00be A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00eb A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0028  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object showMessageContent(com.onesignal.inAppMessages.internal.a r11, com.onesignal.inAppMessages.internal.d r12, va.d r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof com.onesignal.inAppMessages.internal.display.impl.b.f
            if (r0 == 0) goto L_0x0013
            r0 = r13
            com.onesignal.inAppMessages.internal.display.impl.b$f r0 = (com.onesignal.inAppMessages.internal.display.impl.b.f) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.onesignal.inAppMessages.internal.display.impl.b$f r0 = new com.onesignal.inAppMessages.internal.display.impl.b$f
            r0.<init>(r10, r13)
        L_0x0018:
            java.lang.Object r13 = r0.result
            java.lang.Object r1 = wa.d.c()
            int r2 = r0.label
            r3 = 5
            r4 = 4
            r5 = 3
            r6 = 1
            r7 = 2
            r8 = 0
            if (r2 == 0) goto L_0x006a
            if (r2 == r6) goto L_0x0056
            if (r2 == r7) goto L_0x0051
            if (r2 == r5) goto L_0x0051
            if (r2 == r4) goto L_0x003f
            if (r2 != r3) goto L_0x0037
            sa.o.b(r13)
            goto L_0x00ec
        L_0x0037:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x003f:
            java.lang.Object r11 = r0.L$2
            r12 = r11
            com.onesignal.inAppMessages.internal.d r12 = (com.onesignal.inAppMessages.internal.d) r12
            java.lang.Object r11 = r0.L$1
            com.onesignal.inAppMessages.internal.a r11 = (com.onesignal.inAppMessages.internal.a) r11
            java.lang.Object r2 = r0.L$0
            com.onesignal.inAppMessages.internal.display.impl.b r2 = (com.onesignal.inAppMessages.internal.display.impl.b) r2
            sa.o.b(r13)
            goto L_0x00dd
        L_0x0051:
            sa.o.b(r13)
            goto L_0x00c8
        L_0x0056:
            java.lang.Object r11 = r0.L$3
            android.app.Activity r11 = (android.app.Activity) r11
            java.lang.Object r12 = r0.L$2
            com.onesignal.inAppMessages.internal.d r12 = (com.onesignal.inAppMessages.internal.d) r12
            java.lang.Object r2 = r0.L$1
            com.onesignal.inAppMessages.internal.a r2 = (com.onesignal.inAppMessages.internal.a) r2
            java.lang.Object r3 = r0.L$0
            com.onesignal.inAppMessages.internal.display.impl.b r3 = (com.onesignal.inAppMessages.internal.display.impl.b) r3
            sa.o.b(r13)
            goto L_0x00ac
        L_0x006a:
            sa.o.b(r13)
            l7.f r13 = r10._applicationService
            android.app.Activity r13 = r13.getCurrent()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r9 = "InAppDisplayer.showMessageContent: in app message on currentActivity: "
            r2.append(r9)
            r2.append(r13)
            java.lang.String r2 = r2.toString()
            com.onesignal.debug.internal.logging.a.debug$default(r2, r8, r7, r8)
            if (r13 == 0) goto L_0x00cb
            com.onesignal.inAppMessages.internal.display.impl.i r2 = r10.lastInstance
            if (r2 == 0) goto L_0x00bf
            boolean r2 = r11.isPreview()
            if (r2 == 0) goto L_0x00bf
            com.onesignal.inAppMessages.internal.display.impl.i r2 = r10.lastInstance
            db.l.b(r2)
            r0.L$0 = r10
            r0.L$1 = r11
            r0.L$2 = r12
            r0.L$3 = r13
            r0.label = r6
            java.lang.Object r2 = r2.dismissAndAwaitNextMessage(r0)
            if (r2 != r1) goto L_0x00a9
            return r1
        L_0x00a9:
            r3 = r10
            r2 = r11
            r11 = r13
        L_0x00ac:
            r3.lastInstance = r8
            r0.L$0 = r8
            r0.L$1 = r8
            r0.L$2 = r8
            r0.L$3 = r8
            r0.label = r7
            java.lang.Object r11 = r3.initInAppMessage(r11, r2, r12, r0)
            if (r11 != r1) goto L_0x00c8
            return r1
        L_0x00bf:
            r0.label = r5
            java.lang.Object r11 = r10.initInAppMessage(r13, r11, r12, r0)
            if (r11 != r1) goto L_0x00c8
            return r1
        L_0x00c8:
            sa.t r11 = sa.t.f15300a
            return r11
        L_0x00cb:
            r0.L$0 = r10
            r0.L$1 = r11
            r0.L$2 = r12
            r0.label = r4
            r4 = 200(0xc8, double:9.9E-322)
            java.lang.Object r13 = mb.r0.a(r4, r0)
            if (r13 != r1) goto L_0x00dc
            return r1
        L_0x00dc:
            r2 = r10
        L_0x00dd:
            r0.L$0 = r8
            r0.L$1 = r8
            r0.L$2 = r8
            r0.label = r3
            java.lang.Object r11 = r2.showMessageContent(r11, r12, r0)
            if (r11 != r1) goto L_0x00ec
            return r1
        L_0x00ec:
            sa.t r11 = sa.t.f15300a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.inAppMessages.internal.display.impl.b.showMessageContent(com.onesignal.inAppMessages.internal.a, com.onesignal.inAppMessages.internal.d, va.d):java.lang.Object");
    }

    public void dismissCurrentInAppMessage() {
        com.onesignal.debug.internal.logging.a.debug$default("WebViewManager IAM dismissAndAwaitNextMessage lastInstance: " + this.lastInstance, (Throwable) null, 2, (Object) null);
        i iVar = this.lastInstance;
        if (iVar != null) {
            db.l.b(iVar);
            iVar.backgroundDismissAndAwaitNextMessage();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object displayMessage(com.onesignal.inAppMessages.internal.a r10, va.d r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof com.onesignal.inAppMessages.internal.display.impl.b.C0142b
            if (r0 == 0) goto L_0x0013
            r0 = r11
            com.onesignal.inAppMessages.internal.display.impl.b$b r0 = (com.onesignal.inAppMessages.internal.display.impl.b.C0142b) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.onesignal.inAppMessages.internal.display.impl.b$b r0 = new com.onesignal.inAppMessages.internal.display.impl.b$b
            r0.<init>(r9, r11)
        L_0x0018:
            java.lang.Object r11 = r0.result
            java.lang.Object r1 = wa.d.c()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0041
            if (r2 == r4) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            sa.o.b(r11)
            goto L_0x00a7
        L_0x002d:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x0035:
            java.lang.Object r10 = r0.L$1
            com.onesignal.inAppMessages.internal.a r10 = (com.onesignal.inAppMessages.internal.a) r10
            java.lang.Object r2 = r0.L$0
            com.onesignal.inAppMessages.internal.display.impl.b r2 = (com.onesignal.inAppMessages.internal.display.impl.b) r2
            sa.o.b(r11)
            goto L_0x006c
        L_0x0041:
            sa.o.b(r11)
            f8.b r11 = r9._backend
            com.onesignal.core.internal.config.b r2 = r9._configModelStore
            com.onesignal.common.modeling.g r2 = r2.getModel()
            com.onesignal.core.internal.config.a r2 = (com.onesignal.core.internal.config.a) r2
            java.lang.String r2 = r2.getAppId()
            java.lang.String r5 = r10.getMessageId()
            g8.a r6 = g8.a.INSTANCE
            t7.a r7 = r9._languageContext
            java.lang.String r6 = r6.variantIdForMessage(r10, r7)
            r0.L$0 = r9
            r0.L$1 = r10
            r0.label = r4
            java.lang.Object r11 = r11.getIAMData(r2, r5, r6, r0)
            if (r11 != r1) goto L_0x006b
            return r1
        L_0x006b:
            r2 = r9
        L_0x006c:
            f8.a r11 = (f8.a) r11
            com.onesignal.inAppMessages.internal.d r5 = r11.getContent()
            r6 = 0
            if (r5 == 0) goto L_0x00ac
            com.onesignal.inAppMessages.internal.d r5 = r11.getContent()
            db.l.b(r5)
            java.lang.Double r5 = r5.getDisplayDuration()
            db.l.b(r5)
            double r7 = r5.doubleValue()
            r10.setDisplayDuration(r7)
            t9.a r5 = r2._influenceManager
            java.lang.String r7 = r10.getMessageId()
            r5.onInAppMessageDisplayed(r7)
            com.onesignal.inAppMessages.internal.d r11 = r11.getContent()
            db.l.b(r11)
            r0.L$0 = r6
            r0.L$1 = r6
            r0.label = r3
            java.lang.Object r10 = r2.showMessageContent(r10, r11, r0)
            if (r10 != r1) goto L_0x00a7
            return r1
        L_0x00a7:
            java.lang.Boolean r10 = kotlin.coroutines.jvm.internal.b.a(r4)
            return r10
        L_0x00ac:
            boolean r10 = r11.getShouldRetry()
            if (r10 == 0) goto L_0x00b3
            goto L_0x00b8
        L_0x00b3:
            r10 = 0
            java.lang.Boolean r6 = kotlin.coroutines.jvm.internal.b.a(r10)
        L_0x00b8:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.inAppMessages.internal.display.impl.b.displayMessage(com.onesignal.inAppMessages.internal.a, va.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object displayPreviewMessage(java.lang.String r9, va.d r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof com.onesignal.inAppMessages.internal.display.impl.b.c
            if (r0 == 0) goto L_0x0013
            r0 = r10
            com.onesignal.inAppMessages.internal.display.impl.b$c r0 = (com.onesignal.inAppMessages.internal.display.impl.b.c) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.onesignal.inAppMessages.internal.display.impl.b$c r0 = new com.onesignal.inAppMessages.internal.display.impl.b$c
            r0.<init>(r8, r10)
        L_0x0018:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = wa.d.c()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0040
            if (r2 == r4) goto L_0x0034
            if (r2 != r3) goto L_0x002c
            sa.o.b(r10)
            goto L_0x008b
        L_0x002c:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x0034:
            java.lang.Object r9 = r0.L$1
            com.onesignal.inAppMessages.internal.a r9 = (com.onesignal.inAppMessages.internal.a) r9
            java.lang.Object r2 = r0.L$0
            com.onesignal.inAppMessages.internal.display.impl.b r2 = (com.onesignal.inAppMessages.internal.display.impl.b) r2
            sa.o.b(r10)
            goto L_0x0069
        L_0x0040:
            sa.o.b(r10)
            com.onesignal.inAppMessages.internal.a r10 = new com.onesignal.inAppMessages.internal.a
            a8.a r2 = r8._time
            r10.<init>((boolean) r4, (a8.a) r2)
            f8.b r2 = r8._backend
            com.onesignal.core.internal.config.b r5 = r8._configModelStore
            com.onesignal.common.modeling.g r5 = r5.getModel()
            com.onesignal.core.internal.config.a r5 = (com.onesignal.core.internal.config.a) r5
            java.lang.String r5 = r5.getAppId()
            r0.L$0 = r8
            r0.L$1 = r10
            r0.label = r4
            java.lang.Object r9 = r2.getIAMPreviewData(r5, r9, r0)
            if (r9 != r1) goto L_0x0065
            return r1
        L_0x0065:
            r2 = r8
            r7 = r10
            r10 = r9
            r9 = r7
        L_0x0069:
            com.onesignal.inAppMessages.internal.d r10 = (com.onesignal.inAppMessages.internal.d) r10
            if (r10 != 0) goto L_0x006f
            r4 = 0
            goto L_0x008b
        L_0x006f:
            java.lang.Double r5 = r10.getDisplayDuration()
            db.l.b(r5)
            double r5 = r5.doubleValue()
            r9.setDisplayDuration(r5)
            r5 = 0
            r0.L$0 = r5
            r0.L$1 = r5
            r0.label = r3
            java.lang.Object r9 = r2.showMessageContent(r9, r10, r0)
            if (r9 != r1) goto L_0x008b
            return r1
        L_0x008b:
            java.lang.Boolean r9 = kotlin.coroutines.jvm.internal.b.a(r4)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.inAppMessages.internal.display.impl.b.displayPreviewMessage(java.lang.String, va.d):java.lang.Object");
    }
}
