package com.google.android.gms.common.api.internal;

import android.util.Log;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.k;
import java.util.Set;
import q3.b;

final class r1 implements c.C0088c, f2 {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final a.f f5482a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final c f5483b;

    /* renamed from: c  reason: collision with root package name */
    private k f5484c = null;

    /* renamed from: d  reason: collision with root package name */
    private Set f5485d = null;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public boolean f5486e = false;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ h f5487f;

    public r1(h hVar, a.f fVar, c cVar) {
        this.f5487f = hVar;
        this.f5482a = fVar;
        this.f5483b = cVar;
    }

    /* access modifiers changed from: private */
    public final void h() {
        k kVar;
        if (this.f5486e && (kVar = this.f5484c) != null) {
            this.f5482a.getRemoteService(kVar, this.f5485d);
        }
    }

    public final void a(b bVar) {
        n1 n1Var = (n1) this.f5487f.f5395l.get(this.f5483b);
        if (n1Var != null) {
            n1Var.F(bVar);
        }
    }

    public final void b(b bVar) {
        this.f5487f.f5399p.post(new q1(this, bVar));
    }

    public final void c(k kVar, Set set) {
        if (kVar == null || set == null) {
            Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
            a(new b(4));
            return;
        }
        this.f5484c = kVar;
        this.f5485d = set;
        h();
    }
}
