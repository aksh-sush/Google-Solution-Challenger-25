package com.onesignal.notifications.internal.permissions.impl;

import android.app.Activity;
import android.os.Build;
import cb.l;
import com.onesignal.common.AndroidUtils;
import com.onesignal.notifications.r;
import db.g;
import db.m;
import g9.h;
import l7.f;
import sa.t;
import x7.c;
import x7.d;

public final class b implements d.a, n9.b {
    private static final String ANDROID_PERMISSION_STRING = "android.permission.POST_NOTIFICATIONS";
    public static final a Companion = new a((g) null);
    private static final String PERMISSION_TYPE = "NOTIFICATION";
    private final f _application;
    /* access modifiers changed from: private */
    public final f _applicationService;
    private final y7.a _preferenceService;
    private final x7.d _requestPermission;
    /* access modifiers changed from: private */
    public final com.onesignal.common.events.b events = new com.onesignal.common.events.b();
    private final boolean supportsNativePrompt;
    /* access modifiers changed from: private */
    public final com.onesignal.common.threading.c waiter = new com.onesignal.common.threading.c();

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }
    }

    /* renamed from: com.onesignal.notifications.internal.permissions.impl.b$b  reason: collision with other inner class name */
    static final class C0177b extends m implements l {
        public static final C0177b INSTANCE = new C0177b();

        C0177b() {
            super(1);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((n9.a) obj);
            return t.f15300a;
        }

        public final void invoke(n9.a aVar) {
            db.l.e(aVar, "it");
            aVar.onNotificationPermissionChanged(true);
        }
    }

    static final class c extends m implements l {
        public static final c INSTANCE = new c();

        c() {
            super(1);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((n9.a) obj);
            return t.f15300a;
        }

        public final void invoke(n9.a aVar) {
            db.l.e(aVar, "it");
            aVar.onNotificationPermissionChanged(false);
        }
    }

    public static final class d implements c.a {
        final /* synthetic */ Activity $activity;
        final /* synthetic */ b this$0;

        public static final class a extends l7.c {
            final /* synthetic */ b this$0;

            /* renamed from: com.onesignal.notifications.internal.permissions.impl.b$d$a$a  reason: collision with other inner class name */
            static final class C0178a extends m implements l {
                final /* synthetic */ boolean $hasPermission;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C0178a(boolean z10) {
                    super(1);
                    this.$hasPermission = z10;
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((n9.a) obj);
                    return t.f15300a;
                }

                public final void invoke(n9.a aVar) {
                    db.l.e(aVar, "it");
                    aVar.onNotificationPermissionChanged(this.$hasPermission);
                }
            }

            a(b bVar) {
                this.this$0 = bVar;
            }

            public void onFocus() {
                super.onFocus();
                this.this$0._applicationService.removeApplicationLifecycleHandler(this);
                boolean hasPermission = AndroidUtils.INSTANCE.hasPermission(b.ANDROID_PERMISSION_STRING, true, this.this$0._applicationService);
                this.this$0.waiter.wake(Boolean.valueOf(hasPermission));
                this.this$0.events.fire(new C0178a(hasPermission));
            }
        }

        /* renamed from: com.onesignal.notifications.internal.permissions.impl.b$d$b  reason: collision with other inner class name */
        static final class C0179b extends m implements l {
            public static final C0179b INSTANCE = new C0179b();

            C0179b() {
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((n9.a) obj);
                return t.f15300a;
            }

            public final void invoke(n9.a aVar) {
                db.l.e(aVar, "it");
                aVar.onNotificationPermissionChanged(false);
            }
        }

        d(b bVar, Activity activity) {
            this.this$0 = bVar;
            this.$activity = activity;
        }

        public void onAccept() {
            this.this$0._applicationService.addApplicationLifecycleHandler(new a(this.this$0));
            a.INSTANCE.show(this.$activity);
        }

        public void onDecline() {
            this.this$0.waiter.wake(Boolean.FALSE);
            this.this$0.events.fire(C0179b.INSTANCE);
        }
    }

    public b(f fVar, x7.d dVar, f fVar2, y7.a aVar) {
        db.l.e(fVar, "_application");
        db.l.e(dVar, "_requestPermission");
        db.l.e(fVar2, "_applicationService");
        db.l.e(aVar, "_preferenceService");
        this._application = fVar;
        this._requestPermission = dVar;
        this._applicationService = fVar2;
        this._preferenceService = aVar;
        dVar.registerAsCallback(PERMISSION_TYPE, this);
        this.supportsNativePrompt = Build.VERSION.SDK_INT > 32 && AndroidUtils.INSTANCE.getTargetSdkVersion(fVar.getAppContext()) > 32;
    }

    private final boolean notificationsEnabled() {
        return h.areNotificationsEnabled$default(h.INSTANCE, this._application.getAppContext(), (String) null, 2, (Object) null);
    }

    private final boolean showFallbackAlertDialog() {
        Activity current = this._application.getCurrent();
        if (current == null) {
            return false;
        }
        x7.c cVar = x7.c.INSTANCE;
        String string = current.getString(r.notification_permission_name_for_title);
        db.l.d(string, "activity.getString(R.str…ermission_name_for_title)");
        String string2 = current.getString(r.notification_permission_settings_message);
        db.l.d(string2, "activity.getString(R.str…mission_settings_message)");
        cVar.show(current, string, string2, new d(this, current));
        return true;
    }

    public boolean getCanRequestPermission() {
        Boolean bool = this._preferenceService.getBool("OneSignal", "USER_RESOLVED_PERMISSION_android.permission.POST_NOTIFICATIONS", Boolean.FALSE);
        db.l.b(bool);
        return !bool.booleanValue();
    }

    public boolean getHasSubscribers() {
        return this.events.getHasSubscribers();
    }

    public final boolean getSupportsNativePrompt() {
        return this.supportsNativePrompt;
    }

    public void onAccept() {
        this.waiter.wake(Boolean.TRUE);
        this.events.fire(C0177b.INSTANCE);
    }

    public void onReject(boolean z10) {
        if (!(z10 ? showFallbackAlertDialog() : false)) {
            this.waiter.wake(Boolean.FALSE);
            this.events.fire(c.INSTANCE);
        }
    }

    public Object prompt(boolean z10, va.d dVar) {
        if (notificationsEnabled()) {
            return kotlin.coroutines.jvm.internal.b.a(true);
        }
        if (this.supportsNativePrompt) {
            this._requestPermission.startPrompt(z10, PERMISSION_TYPE, ANDROID_PERMISSION_STRING, b.class);
        } else if (!z10) {
            return kotlin.coroutines.jvm.internal.b.a(false);
        } else {
            showFallbackAlertDialog();
        }
        return this.waiter.waitForWake(dVar);
    }

    public void subscribe(n9.a aVar) {
        db.l.e(aVar, "handler");
        this.events.subscribe(aVar);
    }

    public void unsubscribe(n9.a aVar) {
        db.l.e(aVar, "handler");
        this.events.subscribe(aVar);
    }
}
