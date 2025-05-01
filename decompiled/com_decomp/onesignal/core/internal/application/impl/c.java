package com.onesignal.core.internal.application.impl;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.ViewTreeObserver;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.m;
import com.onesignal.common.AndroidUtils;
import java.lang.ref.WeakReference;
import java.util.Objects;
import sa.t;

public final class c implements l7.f, Application.ActivityLifecycleCallbacks, ViewTreeObserver.OnGlobalLayoutListener {
    private Context _appContext;
    private Activity _current;
    private final com.onesignal.common.events.b activityLifecycleNotifier = new com.onesignal.common.events.b();
    private int activityReferences;
    private final com.onesignal.common.events.b applicationLifecycleNotifier = new com.onesignal.common.events.b();
    private l7.b entryState = l7.b.APP_CLOSE;
    private boolean isActivityChangingConfigurations;
    private boolean nextResumeIsFirstActivity;
    private final com.onesignal.common.events.b systemConditionNotifier = new com.onesignal.common.events.b();

    static final class a extends db.m implements cb.l {
        final /* synthetic */ Activity $value;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(Activity activity) {
            super(1);
            this.$value = activity;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((l7.d) obj);
            return t.f15300a;
        }

        public final void invoke(l7.d dVar) {
            db.l.e(dVar, "it");
            dVar.onActivityAvailable(this.$value);
        }
    }

    public static final class b extends l7.a {
        final /* synthetic */ Runnable $runnable;
        final /* synthetic */ c $self;
        final /* synthetic */ c this$0;

        b(c cVar, Runnable runnable, c cVar2) {
            this.$self = cVar;
            this.$runnable = runnable;
            this.this$0 = cVar2;
        }

        public void onActivityAvailable(Activity activity) {
            db.l.e(activity, "currentActivity");
            this.$self.removeActivityLifecycleHandler(this);
            if (AndroidUtils.INSTANCE.isActivityFullyReady(activity)) {
                this.$runnable.run();
            } else {
                this.this$0.decorViewReady(activity, this.$runnable);
            }
        }
    }

    /* renamed from: com.onesignal.core.internal.application.impl.c$c  reason: collision with other inner class name */
    static final class C0122c extends db.m implements cb.l {
        public static final C0122c INSTANCE = new C0122c();

        C0122c() {
            super(1);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((l7.e) obj);
            return t.f15300a;
        }

        public final void invoke(l7.e eVar) {
            db.l.e(eVar, "it");
            eVar.onFocus();
        }
    }

    static final class d extends db.m implements cb.l {
        public static final d INSTANCE = new d();

        d() {
            super(1);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((l7.e) obj);
            return t.f15300a;
        }

        public final void invoke(l7.e eVar) {
            db.l.e(eVar, "it");
            eVar.onUnfocused();
        }
    }

    static final class e extends db.m implements cb.l {
        final /* synthetic */ Activity $activity;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(Activity activity) {
            super(1);
            this.$activity = activity;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((l7.d) obj);
            return t.f15300a;
        }

        public final void invoke(l7.d dVar) {
            db.l.e(dVar, "it");
            dVar.onActivityStopped(this.$activity);
        }
    }

    static final class f extends db.m implements cb.l {
        public static final f INSTANCE = new f();

        f() {
            super(1);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((d) obj);
            return t.f15300a;
        }

        public final void invoke(d dVar) {
            db.l.e(dVar, "it");
            dVar.systemConditionChanged();
        }
    }

    static final class g extends db.m implements cb.l {
        final /* synthetic */ Activity $activity;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(Activity activity) {
            super(1);
            this.$activity = activity;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((l7.d) obj);
            return t.f15300a;
        }

        public final void invoke(l7.d dVar) {
            db.l.e(dVar, "it");
            dVar.onActivityStopped(this.$activity);
        }
    }

    static final class h extends db.m implements cb.l {
        final /* synthetic */ Activity $activity;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(Activity activity) {
            super(1);
            this.$activity = activity;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((l7.d) obj);
            return t.f15300a;
        }

        public final void invoke(l7.d dVar) {
            db.l.e(dVar, "it");
            dVar.onActivityAvailable(this.$activity);
        }
    }

    public static final class i implements ComponentCallbacks {
        final /* synthetic */ c this$0;

        i(c cVar) {
            this.this$0 = cVar;
        }

        public void onConfigurationChanged(Configuration configuration) {
            db.l.e(configuration, "newConfig");
            if (this.this$0.getCurrent() != null) {
                AndroidUtils androidUtils = AndroidUtils.INSTANCE;
                Activity current = this.this$0.getCurrent();
                db.l.b(current);
                if (androidUtils.hasConfigChangeFlag(current, 128)) {
                    c cVar = this.this$0;
                    int i10 = configuration.orientation;
                    Activity current2 = cVar.getCurrent();
                    db.l.b(current2);
                    cVar.onOrientationChanged(i10, current2);
                }
            }
        }

        public void onLowMemory() {
        }
    }

    static final class j extends kotlin.coroutines.jvm.internal.d {
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ c this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(c cVar, va.d dVar) {
            super(dVar);
            this.this$0 = cVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.waitUntilActivityReady(this);
        }
    }

    static final class k extends kotlin.coroutines.jvm.internal.d {
        int I$0;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ c this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(c cVar, va.d dVar) {
            super(dVar);
            this.this$0 = cVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.waitUntilSystemConditionsAvailable(this);
        }
    }

    public static final class l extends m.l {
        final /* synthetic */ androidx.fragment.app.m $manager;
        final /* synthetic */ com.onesignal.common.threading.b $waiter;

        l(androidx.fragment.app.m mVar, com.onesignal.common.threading.b bVar) {
            this.$manager = mVar;
            this.$waiter = bVar;
        }

        public void onFragmentDetached(androidx.fragment.app.m mVar, Fragment fragment) {
            db.l.e(mVar, "fm");
            db.l.e(fragment, "fragmentDetached");
            super.onFragmentDetached(mVar, fragment);
            if (fragment instanceof androidx.fragment.app.d) {
                this.$manager.r1(this);
                this.$waiter.wake();
            }
        }
    }

    public static final class m implements d {
        final /* synthetic */ com.onesignal.common.threading.b $waiter;
        final /* synthetic */ c this$0;

        m(c cVar, com.onesignal.common.threading.b bVar) {
            this.this$0 = cVar;
            this.$waiter = bVar;
        }

        public void systemConditionChanged() {
            if (!com.onesignal.common.g.INSTANCE.isKeyboardUp(new WeakReference(this.this$0.getCurrent()))) {
                this.$waiter.wake();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: decorViewReady$lambda-1  reason: not valid java name */
    public static final void m1decorViewReady$lambda1(c cVar, Runnable runnable, c cVar2) {
        db.l.e(cVar, "$self");
        db.l.e(runnable, "$runnable");
        db.l.e(cVar2, "this$0");
        cVar.addActivityLifecycleHandler(new b(cVar, runnable, cVar2));
    }

    private final void handleFocus() {
        if (!isInForeground() || this.nextResumeIsFirstActivity) {
            com.onesignal.debug.internal.logging.a.debug$default("ApplicationService.handleFocus: application is now in focus, nextResumeIsFirstActivity=" + this.nextResumeIsFirstActivity, (Throwable) null, 2, (Object) null);
            this.nextResumeIsFirstActivity = false;
            if (getEntryState() != l7.b.NOTIFICATION_CLICK) {
                setEntryState(l7.b.APP_OPEN);
            }
            this.applicationLifecycleNotifier.fire(C0122c.INSTANCE);
            return;
        }
        com.onesignal.debug.internal.logging.a.debug$default("ApplicationService.handleFocus: application never lost focus", (Throwable) null, 2, (Object) null);
    }

    private final void handleLostFocus() {
        if (isInForeground()) {
            com.onesignal.debug.internal.logging.a.debug$default("ApplicationService.handleLostFocus: application is now out of focus", (Throwable) null, 2, (Object) null);
            setEntryState(l7.b.APP_CLOSE);
            this.applicationLifecycleNotifier.fire(d.INSTANCE);
            return;
        }
        com.onesignal.debug.internal.logging.a.debug$default("ApplicationService.handleLostFocus: application already out of focus", (Throwable) null, 2, (Object) null);
    }

    /* access modifiers changed from: private */
    public final void onOrientationChanged(int i10, Activity activity) {
        String str;
        StringBuilder sb2;
        if (i10 != 1) {
            if (i10 == 2) {
                sb2 = new StringBuilder();
                str = "ApplicationService.onOrientationChanged: Configuration Orientation Change: LANDSCAPE (";
            }
            handleLostFocus();
            this.activityLifecycleNotifier.fire(new g(activity));
            this.activityLifecycleNotifier.fire(new h(activity));
            activity.getWindow().getDecorView().getViewTreeObserver().addOnGlobalLayoutListener(this);
            handleFocus();
        }
        sb2 = new StringBuilder();
        str = "ApplicationService.onOrientationChanged: Configuration Orientation Change: PORTRAIT (";
        sb2.append(str);
        sb2.append(i10);
        sb2.append(") on activity: ");
        sb2.append(activity);
        com.onesignal.debug.internal.logging.a.debug$default(sb2.toString(), (Throwable) null, 2, (Object) null);
        handleLostFocus();
        this.activityLifecycleNotifier.fire(new g(activity));
        this.activityLifecycleNotifier.fire(new h(activity));
        activity.getWindow().getDecorView().getViewTreeObserver().addOnGlobalLayoutListener(this);
        handleFocus();
    }

    /* access modifiers changed from: private */
    /* renamed from: waitUntilActivityReady$lambda-0  reason: not valid java name */
    public static final void m2waitUntilActivityReady$lambda0(com.onesignal.common.threading.b bVar) {
        db.l.e(bVar, "$waiter");
        bVar.wake();
    }

    public void addActivityLifecycleHandler(l7.d dVar) {
        db.l.e(dVar, "handler");
        this.activityLifecycleNotifier.subscribe(dVar);
        if (getCurrent() != null) {
            Activity current = getCurrent();
            db.l.b(current);
            dVar.onActivityAvailable(current);
        }
    }

    public void addApplicationLifecycleHandler(l7.e eVar) {
        db.l.e(eVar, "handler");
        this.applicationLifecycleNotifier.subscribe(eVar);
    }

    public final void decorViewReady(Activity activity, Runnable runnable) {
        db.l.e(activity, "activity");
        db.l.e(runnable, "runnable");
        Objects.toString(runnable);
        activity.getWindow().getDecorView().post(new a(this, runnable, this));
    }

    public Context getAppContext() {
        Context context = this._appContext;
        db.l.b(context);
        return context;
    }

    public Activity getCurrent() {
        return this._current;
    }

    public l7.b getEntryState() {
        return this.entryState;
    }

    public boolean isInForeground() {
        return getEntryState().isAppOpen() || getEntryState().isNotificationClick();
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        db.l.e(activity, "activity");
        com.onesignal.debug.internal.logging.a.debug$default("ApplicationService.onActivityCreated(" + this.activityReferences + ',' + getEntryState() + "): " + activity, (Throwable) null, 2, (Object) null);
    }

    public void onActivityDestroyed(Activity activity) {
        db.l.e(activity, "activity");
        com.onesignal.debug.internal.logging.a.debug$default("ApplicationService.onActivityDestroyed(" + this.activityReferences + ',' + getEntryState() + "): " + activity, (Throwable) null, 2, (Object) null);
    }

    public void onActivityPaused(Activity activity) {
        db.l.e(activity, "activity");
        com.onesignal.debug.internal.logging.a.debug$default("ApplicationService.onActivityPaused(" + this.activityReferences + ',' + getEntryState() + "): " + activity, (Throwable) null, 2, (Object) null);
    }

    public void onActivityResumed(Activity activity) {
        db.l.e(activity, "activity");
        com.onesignal.debug.internal.logging.a.debug$default("ApplicationService.onActivityResumed(" + this.activityReferences + ',' + getEntryState() + "): " + activity, (Throwable) null, 2, (Object) null);
        if (!db.l.a(getCurrent(), activity)) {
            setCurrent(activity);
        }
        if ((!isInForeground() || this.nextResumeIsFirstActivity) && !this.isActivityChangingConfigurations) {
            this.activityReferences = 1;
            handleFocus();
        }
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        db.l.e(activity, "p0");
        db.l.e(bundle, "p1");
    }

    public void onActivityStarted(Activity activity) {
        db.l.e(activity, "activity");
        com.onesignal.debug.internal.logging.a.debug$default("ApplicationService.onActivityStarted(" + this.activityReferences + ',' + getEntryState() + "): " + activity, (Throwable) null, 2, (Object) null);
        if (!db.l.a(getCurrent(), activity)) {
            setCurrent(activity);
            if ((!isInForeground() || this.nextResumeIsFirstActivity) && !this.isActivityChangingConfigurations) {
                this.activityReferences = 1;
                handleFocus();
                return;
            }
            this.activityReferences++;
        }
    }

    public void onActivityStopped(Activity activity) {
        db.l.e(activity, "activity");
        com.onesignal.debug.internal.logging.a.debug$default("ApplicationService.onActivityStopped(" + this.activityReferences + ',' + getEntryState() + "): " + activity, (Throwable) null, 2, (Object) null);
        boolean isChangingConfigurations = activity.isChangingConfigurations();
        this.isActivityChangingConfigurations = isChangingConfigurations;
        if (!isChangingConfigurations) {
            int i10 = this.activityReferences - 1;
            this.activityReferences = i10;
            if (i10 <= 0) {
                setCurrent((Activity) null);
                this.activityReferences = 0;
                handleLostFocus();
            }
        }
        this.activityLifecycleNotifier.fire(new e(activity));
    }

    public void onGlobalLayout() {
        this.systemConditionNotifier.fire(f.INSTANCE);
    }

    public void removeActivityLifecycleHandler(l7.d dVar) {
        db.l.e(dVar, "handler");
        this.activityLifecycleNotifier.unsubscribe(dVar);
    }

    public void removeApplicationLifecycleHandler(l7.e eVar) {
        db.l.e(eVar, "handler");
        this.applicationLifecycleNotifier.unsubscribe(eVar);
    }

    public void setCurrent(Activity activity) {
        this._current = activity;
        com.onesignal.debug.internal.logging.a.debug$default("ApplicationService: current activity=" + getCurrent(), (Throwable) null, 2, (Object) null);
        if (activity != null) {
            this.activityLifecycleNotifier.fire(new a(activity));
            try {
                activity.getWindow().getDecorView().getViewTreeObserver().addOnGlobalLayoutListener(this);
            } catch (RuntimeException e10) {
                e10.printStackTrace();
            }
        }
    }

    public void setEntryState(l7.b bVar) {
        db.l.e(bVar, "<set-?>");
        this.entryState = bVar;
    }

    public final void start(Context context) {
        db.l.e(context, "context");
        this._appContext = context;
        Context applicationContext = context.getApplicationContext();
        db.l.c(applicationContext, "null cannot be cast to non-null type android.app.Application");
        Application application = (Application) applicationContext;
        application.registerActivityLifecycleCallbacks(this);
        application.registerComponentCallbacks(new i(this));
        boolean z10 = context instanceof Activity;
        boolean z11 = getCurrent() == null;
        if (!z11 || z10) {
            setEntryState(l7.b.APP_OPEN);
            if (z11 && z10) {
                setCurrent((Activity) context);
                this.activityReferences = 1;
                this.nextResumeIsFirstActivity = false;
            }
        } else {
            this.nextResumeIsFirstActivity = true;
            setEntryState(l7.b.APP_CLOSE);
        }
        com.onesignal.debug.internal.logging.a.debug$default("ApplicationService.init: entryState=" + getEntryState(), (Throwable) null, 2, (Object) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object waitUntilActivityReady(va.d r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.onesignal.core.internal.application.impl.c.j
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.onesignal.core.internal.application.impl.c$j r0 = (com.onesignal.core.internal.application.impl.c.j) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.onesignal.core.internal.application.impl.c$j r0 = new com.onesignal.core.internal.application.impl.c$j
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = wa.d.c()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            sa.o.b(r6)
            goto L_0x0056
        L_0x0029:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x0031:
            sa.o.b(r6)
            android.app.Activity r6 = r5.getCurrent()
            if (r6 != 0) goto L_0x0040
            r6 = 0
            java.lang.Boolean r6 = kotlin.coroutines.jvm.internal.b.a(r6)
            return r6
        L_0x0040:
            com.onesignal.common.threading.b r2 = new com.onesignal.common.threading.b
            r2.<init>()
            com.onesignal.core.internal.application.impl.b r4 = new com.onesignal.core.internal.application.impl.b
            r4.<init>(r2)
            r5.decorViewReady(r6, r4)
            r0.label = r3
            java.lang.Object r6 = r2.waitForWake(r0)
            if (r6 != r1) goto L_0x0056
            return r1
        L_0x0056:
            java.lang.Boolean r6 = kotlin.coroutines.jvm.internal.b.a(r3)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.core.internal.application.impl.c.waitUntilActivityReady(va.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x009a A[SYNTHETIC, Splitter:B:34:0x009a] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x009e A[Catch:{ NoClassDefFoundError -> 0x00e4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0118  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0029  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object waitUntilSystemConditionsAvailable(va.d r14) {
        /*
            r13 = this;
            boolean r0 = r14 instanceof com.onesignal.core.internal.application.impl.c.k
            if (r0 == 0) goto L_0x0013
            r0 = r14
            com.onesignal.core.internal.application.impl.c$k r0 = (com.onesignal.core.internal.application.impl.c.k) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.onesignal.core.internal.application.impl.c$k r0 = new com.onesignal.core.internal.application.impl.c$k
            r0.<init>(r13, r14)
        L_0x0018:
            java.lang.Object r14 = r0.result
            java.lang.Object r1 = wa.d.c()
            int r2 = r0.label
            r3 = 50
            r4 = 0
            r5 = 3
            r6 = 2
            r7 = 1
            r8 = 0
            if (r2 == 0) goto L_0x005f
            if (r2 == r7) goto L_0x0054
            if (r2 == r6) goto L_0x0044
            if (r2 != r5) goto L_0x003c
            java.lang.Object r1 = r0.L$1
            com.onesignal.core.internal.application.impl.c$m r1 = (com.onesignal.core.internal.application.impl.c.m) r1
            java.lang.Object r0 = r0.L$0
            com.onesignal.core.internal.application.impl.c r0 = (com.onesignal.core.internal.application.impl.c) r0
            sa.o.b(r14)
            goto L_0x012b
        L_0x003c:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L_0x0044:
            java.lang.Object r2 = r0.L$1
            android.app.Activity r2 = (android.app.Activity) r2
            java.lang.Object r3 = r0.L$0
            com.onesignal.core.internal.application.impl.c r3 = (com.onesignal.core.internal.application.impl.c) r3
            sa.o.b(r14)     // Catch:{ NoClassDefFoundError -> 0x0051 }
            goto L_0x00fa
        L_0x0051:
            r14 = move-exception
            goto L_0x00e6
        L_0x0054:
            int r2 = r0.I$0
            java.lang.Object r9 = r0.L$0
            com.onesignal.core.internal.application.impl.c r9 = (com.onesignal.core.internal.application.impl.c) r9
            sa.o.b(r14)
        L_0x005d:
            r14 = r2
            goto L_0x0095
        L_0x005f:
            sa.o.b(r14)
            android.app.Activity r14 = r13.getCurrent()
            com.onesignal.common.AndroidUtils r2 = com.onesignal.common.AndroidUtils.INSTANCE
            boolean r2 = r2.isRunningOnMainThread()
            if (r2 == 0) goto L_0x0071
            r2 = 50
            goto L_0x0072
        L_0x0071:
            r2 = 0
        L_0x0072:
            r9 = r13
            r12 = r2
            r2 = r14
            r14 = r12
        L_0x0076:
            if (r2 != 0) goto L_0x009a
            int r2 = r14 + 1
            if (r2 <= r3) goto L_0x0086
            java.lang.String r14 = "ApplicationService.waitUntilSystemConditionsAvailable: current is null"
            com.onesignal.debug.internal.logging.a.warn$default(r14, r8, r6, r8)
            java.lang.Boolean r14 = kotlin.coroutines.jvm.internal.b.a(r4)
            return r14
        L_0x0086:
            r0.L$0 = r9
            r0.I$0 = r2
            r0.label = r7
            r10 = 100
            java.lang.Object r14 = mb.r0.a(r10, r0)
            if (r14 != r1) goto L_0x005d
            return r1
        L_0x0095:
            android.app.Activity r2 = r9.getCurrent()
            goto L_0x0076
        L_0x009a:
            boolean r14 = r2 instanceof androidx.appcompat.app.d     // Catch:{ NoClassDefFoundError -> 0x00e4 }
            if (r14 == 0) goto L_0x00e1
            r14 = r2
            androidx.appcompat.app.d r14 = (androidx.appcompat.app.d) r14     // Catch:{ NoClassDefFoundError -> 0x00e4 }
            androidx.fragment.app.m r14 = r14.getSupportFragmentManager()     // Catch:{ NoClassDefFoundError -> 0x00e4 }
            java.lang.String r3 = "currentActivity.supportFragmentManager"
            db.l.d(r14, r3)     // Catch:{ NoClassDefFoundError -> 0x00e4 }
            java.util.List r3 = r14.s0()     // Catch:{ NoClassDefFoundError -> 0x00e4 }
            java.lang.String r4 = "manager.fragments"
            db.l.d(r3, r4)     // Catch:{ NoClassDefFoundError -> 0x00e4 }
            java.lang.Object r3 = ta.w.F(r3)     // Catch:{ NoClassDefFoundError -> 0x00e4 }
            androidx.fragment.app.Fragment r3 = (androidx.fragment.app.Fragment) r3     // Catch:{ NoClassDefFoundError -> 0x00e4 }
            if (r3 == 0) goto L_0x00e1
            boolean r4 = r3.isVisible()     // Catch:{ NoClassDefFoundError -> 0x00e4 }
            if (r4 == 0) goto L_0x00e1
            boolean r3 = r3 instanceof androidx.fragment.app.d     // Catch:{ NoClassDefFoundError -> 0x00e4 }
            if (r3 == 0) goto L_0x00e1
            com.onesignal.common.threading.b r3 = new com.onesignal.common.threading.b     // Catch:{ NoClassDefFoundError -> 0x00e4 }
            r3.<init>()     // Catch:{ NoClassDefFoundError -> 0x00e4 }
            com.onesignal.core.internal.application.impl.c$l r4 = new com.onesignal.core.internal.application.impl.c$l     // Catch:{ NoClassDefFoundError -> 0x00e4 }
            r4.<init>(r14, r3)     // Catch:{ NoClassDefFoundError -> 0x00e4 }
            r14.b1(r4, r7)     // Catch:{ NoClassDefFoundError -> 0x00e4 }
            r0.L$0 = r9     // Catch:{ NoClassDefFoundError -> 0x00e4 }
            r0.L$1 = r2     // Catch:{ NoClassDefFoundError -> 0x00e4 }
            r0.label = r6     // Catch:{ NoClassDefFoundError -> 0x00e4 }
            java.lang.Object r14 = r3.waitForWake(r0)     // Catch:{ NoClassDefFoundError -> 0x00e4 }
            if (r14 != r1) goto L_0x00df
            return r1
        L_0x00df:
            r3 = r9
            goto L_0x00fa
        L_0x00e1:
            r14 = r0
            r0 = r9
            goto L_0x00fc
        L_0x00e4:
            r14 = move-exception
            r3 = r9
        L_0x00e6:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r9 = "ApplicationService.waitUntilSystemConditionsAvailable: AppCompatActivity is not used in this app, skipping 'isDialogFragmentShowing' check: "
            r4.append(r9)
            r4.append(r14)
            java.lang.String r14 = r4.toString()
            com.onesignal.debug.internal.logging.a.info$default(r14, r8, r6, r8)
        L_0x00fa:
            r14 = r0
            r0 = r3
        L_0x00fc:
            com.onesignal.common.threading.b r3 = new com.onesignal.common.threading.b
            r3.<init>()
            com.onesignal.core.internal.application.impl.c$m r4 = new com.onesignal.core.internal.application.impl.c$m
            r4.<init>(r0, r3)
            com.onesignal.common.events.b r9 = r0.systemConditionNotifier
            r9.subscribe(r4)
            com.onesignal.common.g r9 = com.onesignal.common.g.INSTANCE
            java.lang.ref.WeakReference r10 = new java.lang.ref.WeakReference
            r10.<init>(r2)
            boolean r2 = r9.isKeyboardUp(r10)
            if (r2 == 0) goto L_0x012c
            java.lang.String r2 = "ApplicationService.waitUntilSystemConditionsAvailable: keyboard up detected"
            com.onesignal.debug.internal.logging.a.warn$default(r2, r8, r6, r8)
            r14.L$0 = r0
            r14.L$1 = r4
            r14.label = r5
            java.lang.Object r14 = r3.waitForWake(r14)
            if (r14 != r1) goto L_0x012a
            return r1
        L_0x012a:
            r1 = r4
        L_0x012b:
            r4 = r1
        L_0x012c:
            com.onesignal.common.events.b r14 = r0.systemConditionNotifier
            r14.unsubscribe(r4)
            java.lang.Boolean r14 = kotlin.coroutines.jvm.internal.b.a(r7)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.core.internal.application.impl.c.waitUntilSystemConditionsAvailable(va.d):java.lang.Object");
    }
}
