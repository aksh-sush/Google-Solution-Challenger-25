package com.facebook;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import db.g;
import db.l;
import e2.s0;
import e2.t0;

public abstract class i {

    /* renamed from: d  reason: collision with root package name */
    public static final a f4770d = new a((g) null);
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static final String f4771e = i.class.getSimpleName();

    /* renamed from: a  reason: collision with root package name */
    private final BroadcastReceiver f4772a = new b(this);

    /* renamed from: b  reason: collision with root package name */
    private final p0.a f4773b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f4774c;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }
    }

    private final class b extends BroadcastReceiver {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f4775a;

        public b(i iVar) {
            l.e(iVar, "this$0");
            this.f4775a = iVar;
        }

        public void onReceive(Context context, Intent intent) {
            l.e(context, "context");
            l.e(intent, "intent");
            if (l.a("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED", intent.getAction())) {
                s0 s0Var = s0.f9663a;
                s0.j0(i.f4771e, "AccessTokenChanged");
                this.f4775a.d((a) intent.getParcelableExtra("com.facebook.sdk.EXTRA_OLD_ACCESS_TOKEN"), (a) intent.getParcelableExtra("com.facebook.sdk.EXTRA_NEW_ACCESS_TOKEN"));
            }
        }
    }

    public i() {
        t0.l();
        p0.a b10 = p0.a.b(i0.l());
        l.d(b10, "getInstance(FacebookSdk.getApplicationContext())");
        this.f4773b = b10;
        e();
    }

    private final void b() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED");
        this.f4773b.c(this.f4772a, intentFilter);
    }

    public final boolean c() {
        return this.f4774c;
    }

    /* access modifiers changed from: protected */
    public abstract void d(a aVar, a aVar2);

    public final void e() {
        if (!this.f4774c) {
            b();
            this.f4774c = true;
        }
    }

    public final void f() {
        if (this.f4774c) {
            this.f4773b.e(this.f4772a);
            this.f4774c = false;
        }
    }
}
