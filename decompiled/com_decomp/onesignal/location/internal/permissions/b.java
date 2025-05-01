package com.onesignal.location.internal.permissions;

import android.app.Activity;
import cb.l;
import com.onesignal.common.AndroidUtils;
import db.g;
import db.m;
import l7.f;
import sa.t;
import x7.c;
import x7.d;

public final class b implements d.a, z7.b, com.onesignal.common.events.d {
    public static final a Companion = new a((g) null);
    private static final String PERMISSION_TYPE = "LOCATION";
    /* access modifiers changed from: private */
    public final f _applicationService;
    private final x7.d _requestPermission;
    /* access modifiers changed from: private */
    public String currPermission = "";
    /* access modifiers changed from: private */
    public final com.onesignal.common.events.b events = new com.onesignal.common.events.b();
    /* access modifiers changed from: private */
    public final com.onesignal.common.threading.c waiter = new com.onesignal.common.threading.c();

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }
    }

    /* renamed from: com.onesignal.location.internal.permissions.b$b  reason: collision with other inner class name */
    static final class C0162b extends m implements l {
        public static final C0162b INSTANCE = new C0162b();

        C0162b() {
            super(1);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((a) obj);
            return t.f15300a;
        }

        public final void invoke(a aVar) {
            db.l.e(aVar, "it");
            aVar.onLocationPermissionChanged(true);
        }
    }

    static final class c extends m implements l {
        public static final c INSTANCE = new c();

        c() {
            super(1);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((a) obj);
            return t.f15300a;
        }

        public final void invoke(a aVar) {
            db.l.e(aVar, "it");
            aVar.onLocationPermissionChanged(false);
        }
    }

    public static final class d implements c.a {
        final /* synthetic */ Activity $activity;
        final /* synthetic */ b this$0;

        public static final class a extends l7.c {
            final /* synthetic */ b this$0;

            /* renamed from: com.onesignal.location.internal.permissions.b$d$a$a  reason: collision with other inner class name */
            static final class C0163a extends m implements l {
                final /* synthetic */ boolean $hasPermission;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C0163a(boolean z10) {
                    super(1);
                    this.$hasPermission = z10;
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((a) obj);
                    return t.f15300a;
                }

                public final void invoke(a aVar) {
                    db.l.e(aVar, "it");
                    aVar.onLocationPermissionChanged(this.$hasPermission);
                }
            }

            a(b bVar) {
                this.this$0 = bVar;
            }

            public void onFocus() {
                super.onFocus();
                this.this$0._applicationService.removeApplicationLifecycleHandler(this);
                boolean hasPermission = AndroidUtils.INSTANCE.hasPermission(this.this$0.currPermission, true, this.this$0._applicationService);
                this.this$0.waiter.wake(Boolean.valueOf(hasPermission));
                this.this$0.events.fire(new C0163a(hasPermission));
            }
        }

        /* renamed from: com.onesignal.location.internal.permissions.b$d$b  reason: collision with other inner class name */
        static final class C0164b extends m implements l {
            public static final C0164b INSTANCE = new C0164b();

            C0164b() {
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((a) obj);
                return t.f15300a;
            }

            public final void invoke(a aVar) {
                db.l.e(aVar, "it");
                aVar.onLocationPermissionChanged(false);
            }
        }

        d(b bVar, Activity activity) {
            this.this$0 = bVar;
            this.$activity = activity;
        }

        public void onAccept() {
            this.this$0._applicationService.addApplicationLifecycleHandler(new a(this.this$0));
            c.INSTANCE.show(this.$activity);
        }

        public void onDecline() {
            this.this$0.waiter.wake(Boolean.FALSE);
            this.this$0.events.fire(C0164b.INSTANCE);
        }
    }

    public b(x7.d dVar, f fVar) {
        db.l.e(dVar, "_requestPermission");
        db.l.e(fVar, "_applicationService");
        this._requestPermission = dVar;
        this._applicationService = fVar;
    }

    private final boolean showFallbackAlertDialog() {
        Activity current = this._applicationService.getCurrent();
        if (current == null) {
            return false;
        }
        x7.c cVar = x7.c.INSTANCE;
        String string = current.getString(com.onesignal.location.b.location_permission_name_for_title);
        db.l.d(string, "activity.getString(R.str…ermission_name_for_title)");
        String string2 = current.getString(com.onesignal.location.b.location_permission_settings_message);
        db.l.d(string2, "activity.getString(R.str…mission_settings_message)");
        cVar.show(current, string, string2, new d(this, current));
        return true;
    }

    public boolean getHasSubscribers() {
        return this.events.getHasSubscribers();
    }

    public void onAccept() {
        this.waiter.wake(Boolean.TRUE);
        this.events.fire(C0162b.INSTANCE);
    }

    public void onReject(boolean z10) {
        if (!(z10 ? showFallbackAlertDialog() : false)) {
            this.waiter.wake(Boolean.FALSE);
            this.events.fire(c.INSTANCE);
        }
    }

    public final Object prompt(boolean z10, String str, va.d dVar) {
        this.currPermission = str;
        this._requestPermission.startPrompt(z10, PERMISSION_TYPE, str, b.class);
        return this.waiter.waitForWake(dVar);
    }

    public void start() {
        this._requestPermission.registerAsCallback(PERMISSION_TYPE, this);
    }

    public void subscribe(a aVar) {
        db.l.e(aVar, "handler");
        this.events.subscribe(aVar);
    }

    public void unsubscribe(a aVar) {
        db.l.e(aVar, "handler");
        this.events.subscribe(aVar);
    }
}
