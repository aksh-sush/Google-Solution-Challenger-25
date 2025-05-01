package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.common.internal.w0;
import java.util.Set;
import k4.e;
import l4.d;
import l4.l;
import q3.b;

public final class g2 extends d implements GoogleApiClient.b, GoogleApiClient.c {

    /* renamed from: h  reason: collision with root package name */
    private static final a.C0085a f5371h = k4.d.f12810c;

    /* renamed from: a  reason: collision with root package name */
    private final Context f5372a;

    /* renamed from: b  reason: collision with root package name */
    private final Handler f5373b;

    /* renamed from: c  reason: collision with root package name */
    private final a.C0085a f5374c;

    /* renamed from: d  reason: collision with root package name */
    private final Set f5375d;

    /* renamed from: e  reason: collision with root package name */
    private final com.google.android.gms.common.internal.d f5376e;

    /* renamed from: f  reason: collision with root package name */
    private e f5377f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public f2 f5378g;

    public g2(Context context, Handler handler, com.google.android.gms.common.internal.d dVar) {
        a.C0085a aVar = f5371h;
        this.f5372a = context;
        this.f5373b = handler;
        this.f5376e = (com.google.android.gms.common.internal.d) s.l(dVar, "ClientSettings must not be null");
        this.f5375d = dVar.g();
        this.f5374c = aVar;
    }

    static /* bridge */ /* synthetic */ void Z(g2 g2Var, l lVar) {
        b U = lVar.U();
        if (U.j0()) {
            w0 w0Var = (w0) s.k(lVar.V());
            U = w0Var.U();
            if (!U.j0()) {
                String valueOf = String.valueOf(U);
                Log.wtf("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(valueOf), new Exception());
            } else {
                g2Var.f5378g.c(w0Var.V(), g2Var.f5375d);
                g2Var.f5377f.disconnect();
            }
        }
        g2Var.f5378g.a(U);
        g2Var.f5377f.disconnect();
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [k4.e, com.google.android.gms.common.api.a$f] */
    public final void a0(f2 f2Var) {
        e eVar = this.f5377f;
        if (eVar != null) {
            eVar.disconnect();
        }
        this.f5376e.l(Integer.valueOf(System.identityHashCode(this)));
        a.C0085a aVar = this.f5374c;
        Context context = this.f5372a;
        Looper looper = this.f5373b.getLooper();
        com.google.android.gms.common.internal.d dVar = this.f5376e;
        this.f5377f = aVar.buildClient(context, looper, dVar, (Object) dVar.h(), (GoogleApiClient.b) this, (GoogleApiClient.c) this);
        this.f5378g = f2Var;
        Set set = this.f5375d;
        if (set == null || set.isEmpty()) {
            this.f5373b.post(new d2(this));
        } else {
            this.f5377f.d();
        }
    }

    public final void b0() {
        e eVar = this.f5377f;
        if (eVar != null) {
            eVar.disconnect();
        }
    }

    public final void onConnected(Bundle bundle) {
        this.f5377f.a(this);
    }

    public final void onConnectionFailed(b bVar) {
        this.f5378g.a(bVar);
    }

    public final void onConnectionSuspended(int i10) {
        this.f5377f.disconnect();
    }

    public final void s(l lVar) {
        this.f5373b.post(new e2(this, lVar));
    }
}
