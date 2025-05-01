package com.facebook;

import android.content.Intent;
import db.g;
import db.l;
import e2.s0;

public final class x0 {

    /* renamed from: d  reason: collision with root package name */
    public static final a f5001d = new a((g) null);
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static volatile x0 f5002e;

    /* renamed from: a  reason: collision with root package name */
    private final p0.a f5003a;

    /* renamed from: b  reason: collision with root package name */
    private final w0 f5004b;

    /* renamed from: c  reason: collision with root package name */
    private v0 f5005c;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        public final synchronized x0 a() {
            x0 a10;
            if (x0.f5002e == null) {
                p0.a b10 = p0.a.b(i0.l());
                l.d(b10, "getInstance(applicationContext)");
                x0.f5002e = new x0(b10, new w0());
            }
            a10 = x0.f5002e;
            if (a10 == null) {
                l.s("instance");
                throw null;
            }
            return a10;
        }
    }

    public x0(p0.a aVar, w0 w0Var) {
        l.e(aVar, "localBroadcastManager");
        l.e(w0Var, "profileCache");
        this.f5003a = aVar;
        this.f5004b = w0Var;
    }

    private final void e(v0 v0Var, v0 v0Var2) {
        Intent intent = new Intent("com.facebook.sdk.ACTION_CURRENT_PROFILE_CHANGED");
        intent.putExtra("com.facebook.sdk.EXTRA_OLD_PROFILE", v0Var);
        intent.putExtra("com.facebook.sdk.EXTRA_NEW_PROFILE", v0Var2);
        this.f5003a.d(intent);
    }

    private final void g(v0 v0Var, boolean z10) {
        v0 v0Var2 = this.f5005c;
        this.f5005c = v0Var;
        if (z10) {
            w0 w0Var = this.f5004b;
            if (v0Var != null) {
                w0Var.c(v0Var);
            } else {
                w0Var.a();
            }
        }
        if (!s0.e(v0Var2, v0Var)) {
            e(v0Var2, v0Var);
        }
    }

    public final v0 c() {
        return this.f5005c;
    }

    public final boolean d() {
        v0 b10 = this.f5004b.b();
        if (b10 == null) {
            return false;
        }
        g(b10, false);
        return true;
    }

    public final void f(v0 v0Var) {
        g(v0Var, true);
    }
}
