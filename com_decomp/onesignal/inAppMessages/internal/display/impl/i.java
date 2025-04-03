package com.onesignal.inAppMessages.internal.display.impl;

import android.app.Activity;
import android.webkit.JavascriptInterface;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import cb.p;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.onesignal.common.u;
import com.onesignal.inAppMessages.internal.display.impl.c;
import db.w;
import java.util.Arrays;
import java.util.Locale;
import mb.h0;
import mb.w0;
import org.json.JSONException;
import org.json.JSONObject;
import sa.o;
import sa.t;

public final class i implements l7.d {
    public static final a Companion = new a((db.g) null);
    public static final String EVENT_TYPE_ACTION_TAKEN = "action_taken";
    public static final String EVENT_TYPE_KEY = "type";
    public static final String EVENT_TYPE_PAGE_CHANGE = "page_change";
    public static final String EVENT_TYPE_RENDERING_COMPLETE = "rendering_complete";
    public static final String EVENT_TYPE_RESIZE = "resize";
    public static final String GET_PAGE_META_DATA_JS_FUNCTION = "getPageMetaData()";
    public static final String IAM_DISPLAY_LOCATION_KEY = "displayLocation";
    public static final String IAM_DRAG_TO_DISMISS_DISABLED_KEY = "dragToDismissDisabled";
    public static final String IAM_PAGE_META_DATA_KEY = "pageMetaData";
    public static final String JS_OBJ_NAME = "OSAndroid";
    private static final int MARGIN_PX_SIZE = u.INSTANCE.dpToPx(24);
    public static final String SAFE_AREA_JS_OBJECT = "{\n   top: %d,\n   bottom: %d,\n   right: %d,\n   left: %d,\n}";
    public static final String SET_SAFE_AREA_INSETS_JS_FUNCTION = "setSafeAreaInsets(%s)";
    public static final String SET_SAFE_AREA_INSETS_SCRIPT = "\n\n<script>\n    setSafeAreaInsets(%s);\n</script>";
    /* access modifiers changed from: private */
    public final l7.f _applicationService;
    /* access modifiers changed from: private */
    public final j8.b _lifecycle;
    /* access modifiers changed from: private */
    public final m8.a _promptFactory;
    /* access modifiers changed from: private */
    public Activity activity;
    /* access modifiers changed from: private */
    public boolean closing;
    /* access modifiers changed from: private */
    public String currentActivityName;
    private boolean dismissFired;
    /* access modifiers changed from: private */
    public Integer lastPageHeight;
    /* access modifiers changed from: private */
    public final com.onesignal.inAppMessages.internal.a message;
    /* access modifiers changed from: private */
    public final com.onesignal.inAppMessages.internal.d messageContent;
    /* access modifiers changed from: private */
    public c messageView;
    private final kotlinx.coroutines.sync.b messageViewMutex = kotlinx.coroutines.sync.d.b(false, 1, (Object) null);
    /* access modifiers changed from: private */
    public d webView;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(db.g gVar) {
            this();
        }
    }

    public final class b {
        public b() {
        }

        private final c getDisplayLocation(JSONObject jSONObject) {
            c cVar = c.FULL_SCREEN;
            try {
                if (!jSONObject.has(i.IAM_DISPLAY_LOCATION_KEY) || db.l.a(jSONObject.get(i.IAM_DISPLAY_LOCATION_KEY), "")) {
                    return cVar;
                }
                String optString = jSONObject.optString(i.IAM_DISPLAY_LOCATION_KEY, "FULL_SCREEN");
                db.l.d(optString, "jsonObject.optString(\n  …                        )");
                Locale locale = Locale.getDefault();
                db.l.d(locale, "getDefault()");
                String upperCase = optString.toUpperCase(locale);
                db.l.d(upperCase, "this as java.lang.String).toUpperCase(locale)");
                return c.valueOf(upperCase);
            } catch (JSONException e10) {
                e10.printStackTrace();
                return cVar;
            }
        }

        private final boolean getDragToDismissDisabled(JSONObject jSONObject) {
            try {
                return jSONObject.getBoolean(i.IAM_DRAG_TO_DISMISS_DISABLED_KEY);
            } catch (JSONException unused) {
                return false;
            }
        }

        private final int getPageHeightData(JSONObject jSONObject) {
            try {
                i iVar = i.this;
                Activity access$getActivity$p = iVar.activity;
                JSONObject jSONObject2 = jSONObject.getJSONObject(i.IAM_PAGE_META_DATA_KEY);
                db.l.d(jSONObject2, "jsonObject.getJSONObject(IAM_PAGE_META_DATA_KEY)");
                return iVar.pageRectToViewHeight(access$getActivity$p, jSONObject2);
            } catch (JSONException unused) {
                return -1;
            }
        }

        private final void handleActionTaken(JSONObject jSONObject) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("body");
            db.l.d(jSONObject2, "body");
            String safeString = com.onesignal.common.i.safeString(jSONObject2, "id");
            i.this.closing = jSONObject2.getBoolean("close");
            if (i.this.message.isPreview()) {
                i.this._lifecycle.messageActionOccurredOnPreview(i.this.message, new com.onesignal.inAppMessages.internal.c(jSONObject2, i.this._promptFactory));
            } else if (safeString != null) {
                i.this._lifecycle.messageActionOccurredOnMessage(i.this.message, new com.onesignal.inAppMessages.internal.c(jSONObject2, i.this._promptFactory));
            }
            if (i.this.closing) {
                i.this.backgroundDismissAndAwaitNextMessage();
            }
        }

        private final void handlePageChange(JSONObject jSONObject) {
            i.this._lifecycle.messagePageChanged(i.this.message, new com.onesignal.inAppMessages.internal.g(jSONObject));
        }

        private final void handleRenderComplete(JSONObject jSONObject) {
            c displayLocation = getDisplayLocation(jSONObject);
            int pageHeightData = displayLocation == c.FULL_SCREEN ? -1 : getPageHeightData(jSONObject);
            boolean dragToDismissDisabled = getDragToDismissDisabled(jSONObject);
            i.this.messageContent.setDisplayLocation(displayLocation);
            i.this.messageContent.setPageHeight(pageHeightData);
            i.this.createNewInAppMessageView(dragToDismissDisabled);
        }

        @JavascriptInterface
        public final void postMessage(String str) {
            db.l.e(str, "message");
            try {
                com.onesignal.debug.internal.logging.a.debug$default("OSJavaScriptInterface:postMessage: " + str, (Throwable) null, 2, (Object) null);
                JSONObject jSONObject = new JSONObject(str);
                String string = jSONObject.getString(i.EVENT_TYPE_KEY);
                if (string != null) {
                    switch (string.hashCode()) {
                        case -1484226720:
                            if (string.equals(i.EVENT_TYPE_PAGE_CHANGE)) {
                                handlePageChange(jSONObject);
                                return;
                            }
                            return;
                        case -934437708:
                            string.equals(i.EVENT_TYPE_RESIZE);
                            return;
                        case 42998156:
                            if (string.equals(i.EVENT_TYPE_RENDERING_COMPLETE)) {
                                handleRenderComplete(jSONObject);
                                return;
                            }
                            return;
                        case 1851145598:
                            if (string.equals(i.EVENT_TYPE_ACTION_TAKEN)) {
                                c access$getMessageView$p = i.this.messageView;
                                boolean z10 = false;
                                if (access$getMessageView$p != null && !access$getMessageView$p.isDragging()) {
                                    z10 = true;
                                }
                                if (z10) {
                                    handleActionTaken(jSONObject);
                                    return;
                                }
                                return;
                            }
                            return;
                        default:
                            return;
                    }
                }
            } catch (JSONException e10) {
                e10.printStackTrace();
            }
        }
    }

    public enum c {
        TOP_BANNER,
        BOTTOM_BANNER,
        CENTER_MODAL,
        FULL_SCREEN;

        public /* synthetic */ class a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0 = null;

            static {
                int[] iArr = new int[c.values().length];
                iArr[c.TOP_BANNER.ordinal()] = 1;
                iArr[c.BOTTOM_BANNER.ordinal()] = 2;
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public final boolean isBanner() {
            int i10 = a.$EnumSwitchMapping$0[ordinal()];
            return i10 == 1 || i10 == 2;
        }
    }

    static final class d extends kotlin.coroutines.jvm.internal.l implements cb.l {
        int label;
        final /* synthetic */ i this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(i iVar, va.d dVar) {
            super(1, dVar);
            this.this$0 = iVar;
        }

        public final va.d create(va.d dVar) {
            return new d(this.this$0, dVar);
        }

        public final Object invokeSuspend(Object obj) {
            Object c10 = d.c();
            int i10 = this.label;
            if (i10 == 0) {
                o.b(obj);
                i iVar = this.this$0;
                this.label = 1;
                if (iVar.dismissAndAwaitNextMessage(this) == c10) {
                    return c10;
                }
            } else if (i10 == 1) {
                o.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return t.f15300a;
        }

        public final Object invoke(va.d dVar) {
            return ((d) create(dVar)).invokeSuspend(t.f15300a);
        }
    }

    static final class e extends kotlin.coroutines.jvm.internal.d {
        Object L$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ i this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(i iVar, va.d dVar) {
            super(dVar);
            this.this$0 = iVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.calculateHeightAndShowWebViewAfterNewActivity(this);
        }
    }

    static final class f extends kotlin.coroutines.jvm.internal.l implements cb.l {
        final /* synthetic */ int $pagePxHeight;
        int label;
        final /* synthetic */ i this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(i iVar, int i10, va.d dVar) {
            super(1, dVar);
            this.this$0 = iVar;
            this.$pagePxHeight = i10;
        }

        public final va.d create(va.d dVar) {
            return new f(this.this$0, this.$pagePxHeight, dVar);
        }

        public final Object invokeSuspend(Object obj) {
            Object c10 = d.c();
            int i10 = this.label;
            if (i10 == 0) {
                o.b(obj);
                i iVar = this.this$0;
                Integer c11 = kotlin.coroutines.jvm.internal.b.c(this.$pagePxHeight);
                this.label = 1;
                if (iVar.showMessageView(c11, this) == c10) {
                    return c10;
                }
            } else if (i10 == 1) {
                o.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return t.f15300a;
        }

        public final Object invoke(va.d dVar) {
            return ((f) create(dVar)).invokeSuspend(t.f15300a);
        }
    }

    public static final class g implements c.b {
        final /* synthetic */ i $self;
        final /* synthetic */ i this$0;

        g(i iVar, i iVar2) {
            this.this$0 = iVar;
            this.$self = iVar2;
        }

        public void onMessageWasDismissed() {
            this.this$0._lifecycle.messageWasDismissed(this.this$0.message);
            this.this$0._applicationService.removeActivityLifecycleHandler(this.$self);
        }

        public void onMessageWasDisplayed() {
            this.this$0._lifecycle.messageWasDisplayed(this.this$0.message);
        }

        public void onMessageWillDismiss() {
            this.this$0._lifecycle.messageWillDismiss(this.this$0.message);
        }
    }

    static final class h extends kotlin.coroutines.jvm.internal.d {
        Object L$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ i this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(i iVar, va.d dVar) {
            super(dVar);
            this.this$0 = iVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.dismissAndAwaitNextMessage(this);
        }
    }

    /* renamed from: com.onesignal.inAppMessages.internal.display.impl.i$i  reason: collision with other inner class name */
    static final class C0144i extends kotlin.coroutines.jvm.internal.l implements cb.l {
        final /* synthetic */ String $lastActivityName;
        int label;
        final /* synthetic */ i this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0144i(String str, i iVar, va.d dVar) {
            super(1, dVar);
            this.$lastActivityName = str;
            this.this$0 = iVar;
        }

        public final va.d create(va.d dVar) {
            return new C0144i(this.$lastActivityName, this.this$0, dVar);
        }

        public final Object invokeSuspend(Object obj) {
            Object c10 = d.c();
            int i10 = this.label;
            if (i10 == 0) {
                o.b(obj);
                String str = this.$lastActivityName;
                if (str == null) {
                    i iVar = this.this$0;
                    this.label = 1;
                    if (iVar.showMessageView((Integer) null, this) == c10) {
                        return c10;
                    }
                } else if (db.l.a(str, this.this$0.currentActivityName)) {
                    i iVar2 = this.this$0;
                    this.label = 3;
                    if (iVar2.calculateHeightAndShowWebViewAfterNewActivity(this) == c10) {
                        return c10;
                    }
                } else if (!this.this$0.closing) {
                    if (this.this$0.messageView != null) {
                        c access$getMessageView$p = this.this$0.messageView;
                        db.l.b(access$getMessageView$p);
                        access$getMessageView$p.removeAllViews();
                    }
                    i iVar3 = this.this$0;
                    Integer access$getLastPageHeight$p = iVar3.lastPageHeight;
                    this.label = 2;
                    if (iVar3.showMessageView(access$getLastPageHeight$p, this) == c10) {
                        return c10;
                    }
                }
            } else if (i10 == 1 || i10 == 2 || i10 == 3) {
                o.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return t.f15300a;
        }

        public final Object invoke(va.d dVar) {
            return ((C0144i) create(dVar)).invokeSuspend(t.f15300a);
        }
    }

    static final class j extends kotlin.coroutines.jvm.internal.d {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ i this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(i iVar, va.d dVar) {
            super(dVar);
            this.this$0 = iVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.setupWebView((Activity) null, (String) null, false, this);
        }
    }

    static final class k extends kotlin.coroutines.jvm.internal.d {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ i this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(i iVar, va.d dVar) {
            super(dVar);
            this.this$0 = iVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.showMessageView((Integer) null, this);
        }
    }

    static final class l extends kotlin.coroutines.jvm.internal.l implements p {
        int label;
        final /* synthetic */ i this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(i iVar, va.d dVar) {
            super(2, dVar);
            this.this$0 = iVar;
        }

        public final va.d create(Object obj, va.d dVar) {
            return new l(this.this$0, dVar);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = d.c();
            if (this.label == 0) {
                o.b(obj);
                int[] cutoutAndStatusBarInsets = u.INSTANCE.getCutoutAndStatusBarInsets(this.this$0.activity);
                w wVar = w.f9429a;
                String format = String.format(i.SAFE_AREA_JS_OBJECT, Arrays.copyOf(new Object[]{kotlin.coroutines.jvm.internal.b.c(cutoutAndStatusBarInsets[0]), kotlin.coroutines.jvm.internal.b.c(cutoutAndStatusBarInsets[1]), kotlin.coroutines.jvm.internal.b.c(cutoutAndStatusBarInsets[2]), kotlin.coroutines.jvm.internal.b.c(cutoutAndStatusBarInsets[3])}, 4));
                db.l.d(format, "format(format, *args)");
                String format2 = String.format(i.SET_SAFE_AREA_INSETS_JS_FUNCTION, Arrays.copyOf(new Object[]{format}, 1));
                db.l.d(format2, "format(format, *args)");
                d access$getWebView$p = this.this$0.webView;
                db.l.b(access$getWebView$p);
                access$getWebView$p.evaluateJavascript(format2, (ValueCallback) null);
                return t.f15300a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        public final Object invoke(h0 h0Var, va.d dVar) {
            return ((l) create(h0Var, dVar)).invokeSuspend(t.f15300a);
        }
    }

    public i(com.onesignal.inAppMessages.internal.a aVar, Activity activity2, com.onesignal.inAppMessages.internal.d dVar, j8.b bVar, l7.f fVar, m8.a aVar2) {
        db.l.e(aVar, "message");
        db.l.e(activity2, "activity");
        db.l.e(dVar, "messageContent");
        db.l.e(bVar, "_lifecycle");
        db.l.e(fVar, "_applicationService");
        db.l.e(aVar2, "_promptFactory");
        this.message = aVar;
        this.activity = activity2;
        this.messageContent = dVar;
        this._lifecycle = bVar;
        this._applicationService = fVar;
        this._promptFactory = aVar2;
    }

    private final void blurryRenderingWebViewForKitKatWorkAround(WebView webView2) {
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object calculateHeightAndShowWebViewAfterNewActivity(va.d r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.onesignal.inAppMessages.internal.display.impl.i.e
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.onesignal.inAppMessages.internal.display.impl.i$e r0 = (com.onesignal.inAppMessages.internal.display.impl.i.e) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.onesignal.inAppMessages.internal.display.impl.i$e r0 = new com.onesignal.inAppMessages.internal.display.impl.i$e
            r0.<init>(r7, r8)
        L_0x0018:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = wa.d.c()
            int r2 = r0.label
            r3 = 3
            r4 = 1
            r5 = 2
            if (r2 == 0) goto L_0x0047
            if (r2 == r4) goto L_0x0043
            if (r2 == r5) goto L_0x003b
            if (r2 != r3) goto L_0x0033
            java.lang.Object r0 = r0.L$0
            com.onesignal.inAppMessages.internal.display.impl.i r0 = (com.onesignal.inAppMessages.internal.display.impl.i) r0
            sa.o.b(r8)
            goto L_0x009d
        L_0x0033:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L_0x003b:
            java.lang.Object r2 = r0.L$0
            com.onesignal.inAppMessages.internal.display.impl.i r2 = (com.onesignal.inAppMessages.internal.display.impl.i) r2
            sa.o.b(r8)
            goto L_0x0084
        L_0x0043:
            sa.o.b(r8)
            goto L_0x006e
        L_0x0047:
            sa.o.b(r8)
            com.onesignal.inAppMessages.internal.display.impl.c r8 = r7.messageView
            if (r8 != 0) goto L_0x0051
            sa.t r8 = sa.t.f15300a
            return r8
        L_0x0051:
            db.l.b(r8)
            com.onesignal.inAppMessages.internal.display.impl.i$c r8 = r8.getDisplayPosition()
            com.onesignal.inAppMessages.internal.display.impl.i$c r2 = com.onesignal.inAppMessages.internal.display.impl.i.c.FULL_SCREEN
            r6 = 0
            if (r8 != r2) goto L_0x0071
            com.onesignal.inAppMessages.internal.d r8 = r7.messageContent
            boolean r8 = r8.isFullBleed()
            if (r8 != 0) goto L_0x0071
            r0.label = r4
            java.lang.Object r8 = r7.showMessageView(r6, r0)
            if (r8 != r1) goto L_0x006e
            return r1
        L_0x006e:
            sa.t r8 = sa.t.f15300a
            return r8
        L_0x0071:
            java.lang.String r8 = "In app message new activity, calculate height and show "
            com.onesignal.debug.internal.logging.a.debug$default(r8, r6, r5, r6)
            l7.f r8 = r7._applicationService
            r0.L$0 = r7
            r0.label = r5
            java.lang.Object r8 = r8.waitUntilActivityReady(r0)
            if (r8 != r1) goto L_0x0083
            return r1
        L_0x0083:
            r2 = r7
        L_0x0084:
            android.app.Activity r8 = r2.activity
            r2.setWebViewToMaxSize(r8)
            com.onesignal.inAppMessages.internal.d r8 = r2.messageContent
            boolean r8 = r8.isFullBleed()
            if (r8 == 0) goto L_0x009e
            r0.L$0 = r2
            r0.label = r3
            java.lang.Object r8 = r2.updateSafeAreaInsets(r0)
            if (r8 != r1) goto L_0x009c
            return r1
        L_0x009c:
            r0 = r2
        L_0x009d:
            r2 = r0
        L_0x009e:
            com.onesignal.inAppMessages.internal.display.impl.d r8 = r2.webView
            db.l.b(r8)
            com.onesignal.inAppMessages.internal.display.impl.h r0 = new com.onesignal.inAppMessages.internal.display.impl.h
            r0.<init>(r2)
            java.lang.String r1 = "getPageMetaData()"
            r8.evaluateJavascript(r1, r0)
            sa.t r8 = sa.t.f15300a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.inAppMessages.internal.display.impl.i.calculateHeightAndShowWebViewAfterNewActivity(va.d):java.lang.Object");
    }

    /* access modifiers changed from: private */
    /* renamed from: calculateHeightAndShowWebViewAfterNewActivity$lambda-0  reason: not valid java name */
    public static final void m5calculateHeightAndShowWebViewAfterNewActivity$lambda0(i iVar, String str) {
        db.l.e(iVar, "this$0");
        try {
            com.onesignal.common.threading.a.suspendifyOnThread$default(0, new f(iVar, iVar.pageRectToViewHeight(iVar.activity, new JSONObject(str)), (va.d) null), 1, (Object) null);
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
    }

    private final void enableWebViewRemoteDebugging() {
        if (com.onesignal.debug.internal.logging.a.atLogLevel(c8.b.DEBUG)) {
            WebView.setWebContentsDebuggingEnabled(true);
        }
    }

    private final int getWebViewMaxSizeX(Activity activity2) {
        if (this.messageContent.isFullBleed()) {
            return u.INSTANCE.getFullbleedWindowWidth(activity2);
        }
        return u.INSTANCE.getWindowWidth(activity2) - (MARGIN_PX_SIZE * 2);
    }

    private final int getWebViewMaxSizeY(Activity activity2) {
        return u.INSTANCE.getWindowHeight(activity2) - (this.messageContent.isFullBleed() ? 0 : MARGIN_PX_SIZE * 2);
    }

    /* access modifiers changed from: private */
    public final int pageRectToViewHeight(Activity activity2, JSONObject jSONObject) {
        try {
            int dpToPx = u.INSTANCE.dpToPx(jSONObject.getJSONObject("rect").getInt("height"));
            com.onesignal.debug.internal.logging.a.debug$default("getPageHeightData:pxHeight: " + dpToPx, (Throwable) null, 2, (Object) null);
            int webViewMaxSizeY = getWebViewMaxSizeY(activity2);
            if (dpToPx <= webViewMaxSizeY) {
                return dpToPx;
            }
            com.onesignal.debug.internal.logging.a.debug$default("getPageHeightData:pxHeight is over screen max: " + webViewMaxSizeY, (Throwable) null, 2, (Object) null);
            return webViewMaxSizeY;
        } catch (JSONException e10) {
            com.onesignal.debug.internal.logging.a.error("pageRectToViewHeight could not get page height", e10);
            return -1;
        }
    }

    private final void setMessageView(c cVar) {
        this.messageView = cVar;
    }

    private final void setWebViewToMaxSize(Activity activity2) {
        d dVar = this.webView;
        db.l.b(dVar);
        dVar.layout(0, 0, getWebViewMaxSizeX(activity2), getWebViewMaxSizeY(activity2));
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0088 A[Catch:{ all -> 0x005a }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0093 A[SYNTHETIC, Splitter:B:35:0x0093] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00d3 A[Catch:{ all -> 0x005a }] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00e8 A[Catch:{ all -> 0x005a }] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00fa  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object showMessageView(java.lang.Integer r10, va.d r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof com.onesignal.inAppMessages.internal.display.impl.i.k
            if (r0 == 0) goto L_0x0013
            r0 = r11
            com.onesignal.inAppMessages.internal.display.impl.i$k r0 = (com.onesignal.inAppMessages.internal.display.impl.i.k) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.onesignal.inAppMessages.internal.display.impl.i$k r0 = new com.onesignal.inAppMessages.internal.display.impl.i$k
            r0.<init>(r9, r11)
        L_0x0018:
            java.lang.Object r11 = r0.result
            java.lang.Object r1 = wa.d.c()
            int r2 = r0.label
            r3 = 4
            r4 = 3
            r5 = 1
            r6 = 2
            r7 = 0
            if (r2 == 0) goto L_0x006d
            if (r2 == r5) goto L_0x005d
            if (r2 == r6) goto L_0x004d
            if (r2 == r4) goto L_0x0040
            if (r2 != r3) goto L_0x0038
            java.lang.Object r10 = r0.L$0
            kotlinx.coroutines.sync.b r10 = (kotlinx.coroutines.sync.b) r10
            sa.o.b(r11)     // Catch:{ all -> 0x005a }
            goto L_0x00f7
        L_0x0038:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x0040:
            java.lang.Object r10 = r0.L$1
            kotlinx.coroutines.sync.b r10 = (kotlinx.coroutines.sync.b) r10
            java.lang.Object r2 = r0.L$0
            com.onesignal.inAppMessages.internal.display.impl.i r2 = (com.onesignal.inAppMessages.internal.display.impl.i) r2
            sa.o.b(r11)     // Catch:{ all -> 0x005a }
            goto L_0x00e4
        L_0x004d:
            java.lang.Object r10 = r0.L$1
            kotlinx.coroutines.sync.b r10 = (kotlinx.coroutines.sync.b) r10
            java.lang.Object r2 = r0.L$0
            com.onesignal.inAppMessages.internal.display.impl.i r2 = (com.onesignal.inAppMessages.internal.display.impl.i) r2
            sa.o.b(r11)     // Catch:{ all -> 0x005a }
            goto L_0x00cf
        L_0x005a:
            r11 = move-exception
            goto L_0x00ff
        L_0x005d:
            java.lang.Object r10 = r0.L$2
            kotlinx.coroutines.sync.b r10 = (kotlinx.coroutines.sync.b) r10
            java.lang.Object r2 = r0.L$1
            java.lang.Integer r2 = (java.lang.Integer) r2
            java.lang.Object r5 = r0.L$0
            com.onesignal.inAppMessages.internal.display.impl.i r5 = (com.onesignal.inAppMessages.internal.display.impl.i) r5
            sa.o.b(r11)
            goto L_0x0084
        L_0x006d:
            sa.o.b(r11)
            kotlinx.coroutines.sync.b r11 = r9.messageViewMutex
            r0.L$0 = r9
            r0.L$1 = r10
            r0.L$2 = r11
            r0.label = r5
            java.lang.Object r2 = r11.b(r7, r0)
            if (r2 != r1) goto L_0x0081
            return r1
        L_0x0081:
            r5 = r9
            r2 = r10
            r10 = r11
        L_0x0084:
            com.onesignal.inAppMessages.internal.display.impl.c r11 = r5.messageView     // Catch:{ all -> 0x005a }
            if (r11 != 0) goto L_0x0093
            java.lang.String r11 = "No messageView found to update a with a new height."
            com.onesignal.debug.internal.logging.a.warn$default(r11, r7, r6, r7)     // Catch:{ all -> 0x005a }
            sa.t r11 = sa.t.f15300a     // Catch:{ all -> 0x005a }
            r10.a(r7)
            return r11
        L_0x0093:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x005a }
            r11.<init>()     // Catch:{ all -> 0x005a }
            java.lang.String r8 = "In app message, showing first one with height: "
            r11.append(r8)     // Catch:{ all -> 0x005a }
            r11.append(r2)     // Catch:{ all -> 0x005a }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x005a }
            com.onesignal.debug.internal.logging.a.debug$default(r11, r7, r6, r7)     // Catch:{ all -> 0x005a }
            com.onesignal.inAppMessages.internal.display.impl.c r11 = r5.messageView     // Catch:{ all -> 0x005a }
            if (r11 == 0) goto L_0x00b3
            com.onesignal.inAppMessages.internal.display.impl.d r8 = r5.webView     // Catch:{ all -> 0x005a }
            db.l.b(r8)     // Catch:{ all -> 0x005a }
            r11.setWebView(r8)     // Catch:{ all -> 0x005a }
        L_0x00b3:
            if (r2 == 0) goto L_0x00ce
            r5.lastPageHeight = r2     // Catch:{ all -> 0x005a }
            com.onesignal.inAppMessages.internal.display.impl.c r11 = r5.messageView     // Catch:{ all -> 0x005a }
            if (r11 == 0) goto L_0x00ce
            int r2 = r2.intValue()     // Catch:{ all -> 0x005a }
            r0.L$0 = r5     // Catch:{ all -> 0x005a }
            r0.L$1 = r10     // Catch:{ all -> 0x005a }
            r0.L$2 = r7     // Catch:{ all -> 0x005a }
            r0.label = r6     // Catch:{ all -> 0x005a }
            java.lang.Object r11 = r11.updateHeight(r2, r0)     // Catch:{ all -> 0x005a }
            if (r11 != r1) goto L_0x00ce
            return r1
        L_0x00ce:
            r2 = r5
        L_0x00cf:
            com.onesignal.inAppMessages.internal.display.impl.c r11 = r2.messageView     // Catch:{ all -> 0x005a }
            if (r11 == 0) goto L_0x00e4
            android.app.Activity r5 = r2.activity     // Catch:{ all -> 0x005a }
            r0.L$0 = r2     // Catch:{ all -> 0x005a }
            r0.L$1 = r10     // Catch:{ all -> 0x005a }
            r0.L$2 = r7     // Catch:{ all -> 0x005a }
            r0.label = r4     // Catch:{ all -> 0x005a }
            java.lang.Object r11 = r11.showView(r5, r0)     // Catch:{ all -> 0x005a }
            if (r11 != r1) goto L_0x00e4
            return r1
        L_0x00e4:
            com.onesignal.inAppMessages.internal.display.impl.c r11 = r2.messageView     // Catch:{ all -> 0x005a }
            if (r11 == 0) goto L_0x00fa
            r0.L$0 = r10     // Catch:{ all -> 0x005a }
            r0.L$1 = r7     // Catch:{ all -> 0x005a }
            r0.L$2 = r7     // Catch:{ all -> 0x005a }
            r0.label = r3     // Catch:{ all -> 0x005a }
            java.lang.Object r11 = r11.checkIfShouldDismiss(r0)     // Catch:{ all -> 0x005a }
            if (r11 != r1) goto L_0x00f7
            return r1
        L_0x00f7:
            sa.t r11 = sa.t.f15300a     // Catch:{ all -> 0x005a }
            goto L_0x00fb
        L_0x00fa:
            r11 = r7
        L_0x00fb:
            r10.a(r7)
            return r11
        L_0x00ff:
            r10.a(r7)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.inAppMessages.internal.display.impl.i.showMessageView(java.lang.Integer, va.d):java.lang.Object");
    }

    /* access modifiers changed from: private */
    public final Object updateSafeAreaInsets(va.d dVar) {
        Object g10 = mb.h.g(w0.c(), new l(this, (va.d) null), dVar);
        return g10 == d.c() ? g10 : t.f15300a;
    }

    public final void backgroundDismissAndAwaitNextMessage() {
        com.onesignal.common.threading.a.suspendifyOnThread$default(0, new d(this, (va.d) null), 1, (Object) null);
    }

    public final void createNewInAppMessageView(boolean z10) {
        this.lastPageHeight = Integer.valueOf(this.messageContent.getPageHeight());
        d dVar = this.webView;
        db.l.b(dVar);
        setMessageView(new c(dVar, this.messageContent, z10));
        c cVar = this.messageView;
        db.l.b(cVar);
        cVar.setMessageController(new g(this, this));
        this._applicationService.addActivityLifecycleHandler(this);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object dismissAndAwaitNextMessage(va.d r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.onesignal.inAppMessages.internal.display.impl.i.h
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.onesignal.inAppMessages.internal.display.impl.i$h r0 = (com.onesignal.inAppMessages.internal.display.impl.i.h) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.onesignal.inAppMessages.internal.display.impl.i$h r0 = new com.onesignal.inAppMessages.internal.display.impl.i$h
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = wa.d.c()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            java.lang.Object r0 = r0.L$0
            com.onesignal.inAppMessages.internal.display.impl.i r0 = (com.onesignal.inAppMessages.internal.display.impl.i) r0
            sa.o.b(r6)
            goto L_0x0056
        L_0x002d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x0035:
            sa.o.b(r6)
            com.onesignal.inAppMessages.internal.display.impl.c r6 = r5.messageView
            if (r6 == 0) goto L_0x0060
            boolean r2 = r5.dismissFired
            if (r2 == 0) goto L_0x0041
            goto L_0x0060
        L_0x0041:
            r5.dismissFired = r3
            j8.b r2 = r5._lifecycle
            com.onesignal.inAppMessages.internal.a r4 = r5.message
            r2.messageWillDismiss(r4)
            r0.L$0 = r5
            r0.label = r3
            java.lang.Object r6 = r6.dismissAndAwaitNextMessage(r0)
            if (r6 != r1) goto L_0x0055
            return r1
        L_0x0055:
            r0 = r5
        L_0x0056:
            r6 = 0
            r0.dismissFired = r6
            r6 = 0
            r0.setMessageView(r6)
            sa.t r6 = sa.t.f15300a
            return r6
        L_0x0060:
            sa.t r6 = sa.t.f15300a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.inAppMessages.internal.display.impl.i.dismissAndAwaitNextMessage(va.d):java.lang.Object");
    }

    public void onActivityAvailable(Activity activity2) {
        db.l.e(activity2, "activity");
        String str = this.currentActivityName;
        this.activity = activity2;
        this.currentActivityName = activity2.getLocalClassName();
        com.onesignal.debug.internal.logging.a.debug$default("In app message activity available currentActivityName: " + this.currentActivityName + " lastActivityName: " + str, (Throwable) null, 2, (Object) null);
        com.onesignal.common.threading.a.suspendifyOnMain(new C0144i(str, this, (va.d) null));
    }

    public void onActivityStopped(Activity activity2) {
        db.l.e(activity2, "activity");
        com.onesignal.debug.internal.logging.a.debug$default(i.e("\n            In app message activity stopped, cleaning views, currentActivityName: " + this.currentActivityName + "\n            activity: " + this.activity + "\n            messageView: " + this.messageView + "\n            "), (Throwable) null, 2, (Object) null);
        if (this.messageView != null && db.l.a(activity2.getLocalClassName(), this.currentActivityName)) {
            c cVar = this.messageView;
            db.l.b(cVar);
            cVar.removeAllViews();
        }
    }

    public final void setContentSafeAreaInsets(com.onesignal.inAppMessages.internal.d dVar, Activity activity2) {
        db.l.e(dVar, FirebaseAnalytics.Param.CONTENT);
        db.l.e(activity2, "activity");
        String contentHtml = dVar.getContentHtml();
        int[] cutoutAndStatusBarInsets = u.INSTANCE.getCutoutAndStatusBarInsets(activity2);
        w wVar = w.f9429a;
        String format = String.format(SAFE_AREA_JS_OBJECT, Arrays.copyOf(new Object[]{Integer.valueOf(cutoutAndStatusBarInsets[0]), Integer.valueOf(cutoutAndStatusBarInsets[1]), Integer.valueOf(cutoutAndStatusBarInsets[2]), Integer.valueOf(cutoutAndStatusBarInsets[3])}, 4));
        db.l.d(format, "format(format, *args)");
        String format2 = String.format(SET_SAFE_AREA_INSETS_SCRIPT, Arrays.copyOf(new Object[]{format}, 1));
        db.l.d(format2, "format(format, *args)");
        dVar.setContentHtml(contentHtml + format2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object setupWebView(android.app.Activity r7, java.lang.String r8, boolean r9, va.d r10) {
        /*
            r6 = this;
            boolean r0 = r10 instanceof com.onesignal.inAppMessages.internal.display.impl.i.j
            if (r0 == 0) goto L_0x0013
            r0 = r10
            com.onesignal.inAppMessages.internal.display.impl.i$j r0 = (com.onesignal.inAppMessages.internal.display.impl.i.j) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.onesignal.inAppMessages.internal.display.impl.i$j r0 = new com.onesignal.inAppMessages.internal.display.impl.i$j
            r0.<init>(r6, r10)
        L_0x0018:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = wa.d.c()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x003f
            if (r2 != r3) goto L_0x0037
            java.lang.Object r7 = r0.L$2
            r8 = r7
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r7 = r0.L$1
            android.app.Activity r7 = (android.app.Activity) r7
            java.lang.Object r9 = r0.L$0
            com.onesignal.inAppMessages.internal.display.impl.i r9 = (com.onesignal.inAppMessages.internal.display.impl.i) r9
            sa.o.b(r10)
            goto L_0x00ba
        L_0x0037:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x003f:
            sa.o.b(r10)
            r6.enableWebViewRemoteDebugging()
            com.onesignal.inAppMessages.internal.display.impl.d r10 = new com.onesignal.inAppMessages.internal.display.impl.d
            r10.<init>(r7)
            r6.webView = r10
            db.l.b(r10)
            r2 = 2
            r10.setOverScrollMode(r2)
            com.onesignal.inAppMessages.internal.display.impl.d r10 = r6.webView
            db.l.b(r10)
            r2 = 0
            r10.setVerticalScrollBarEnabled(r2)
            com.onesignal.inAppMessages.internal.display.impl.d r10 = r6.webView
            db.l.b(r10)
            r10.setHorizontalScrollBarEnabled(r2)
            com.onesignal.inAppMessages.internal.display.impl.d r10 = r6.webView
            db.l.b(r10)
            android.webkit.WebSettings r10 = r10.getSettings()
            r10.setJavaScriptEnabled(r3)
            com.onesignal.inAppMessages.internal.display.impl.d r10 = r6.webView
            db.l.b(r10)
            com.onesignal.inAppMessages.internal.display.impl.i$b r4 = new com.onesignal.inAppMessages.internal.display.impl.i$b
            r4.<init>()
            java.lang.String r5 = "OSAndroid"
            r10.addJavascriptInterface(r4, r5)
            if (r9 == 0) goto L_0x0099
            com.onesignal.inAppMessages.internal.display.impl.d r9 = r6.webView
            db.l.b(r9)
            r10 = 3074(0xc02, float:4.308E-42)
            r9.setSystemUiVisibility(r10)
            int r9 = android.os.Build.VERSION.SDK_INT
            r10 = 30
            if (r9 < r10) goto L_0x0099
            com.onesignal.inAppMessages.internal.display.impl.d r9 = r6.webView
            db.l.b(r9)
            r9.setFitsSystemWindows(r2)
        L_0x0099:
            com.onesignal.inAppMessages.internal.display.impl.d r9 = r6.webView
            db.l.b(r9)
            r6.blurryRenderingWebViewForKitKatWorkAround(r9)
            j8.b r9 = r6._lifecycle
            com.onesignal.inAppMessages.internal.a r10 = r6.message
            r9.messageWillDisplay(r10)
            l7.f r9 = r6._applicationService
            r0.L$0 = r6
            r0.L$1 = r7
            r0.L$2 = r8
            r0.label = r3
            java.lang.Object r9 = r9.waitUntilActivityReady(r0)
            if (r9 != r1) goto L_0x00b9
            return r1
        L_0x00b9:
            r9 = r6
        L_0x00ba:
            r9.setWebViewToMaxSize(r7)
            com.onesignal.inAppMessages.internal.display.impl.d r7 = r9.webView
            db.l.b(r7)
            java.lang.String r9 = "text/html; charset=utf-8"
            java.lang.String r10 = "base64"
            r7.loadData(r8, r9, r10)
            sa.t r7 = sa.t.f15300a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.inAppMessages.internal.display.impl.i.setupWebView(android.app.Activity, java.lang.String, boolean, va.d):java.lang.Object");
    }
}
