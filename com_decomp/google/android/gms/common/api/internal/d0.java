package com.google.android.gms.common.api.internal;

import android.app.Activity;
import androidx.collection.b;
import com.google.android.gms.common.internal.s;
import q3.j;

public final class d0 extends x2 {

    /* renamed from: i  reason: collision with root package name */
    private final b f5343i = new b();

    /* renamed from: j  reason: collision with root package name */
    private final h f5344j;

    d0(k kVar, h hVar, j jVar) {
        super(kVar, jVar);
        this.f5344j = hVar;
        this.mLifecycleFragment.a("ConnectionlessLifecycleHelper", this);
    }

    public static void j(Activity activity, h hVar, c cVar) {
        k fragment = LifecycleCallback.getFragment(activity);
        d0 d0Var = (d0) fragment.b("ConnectionlessLifecycleHelper", d0.class);
        if (d0Var == null) {
            d0Var = new d0(fragment, hVar, j.q());
        }
        s.l(cVar, "ApiKey cannot be null");
        d0Var.f5343i.add(cVar);
        hVar.d(d0Var);
    }

    private final void k() {
        if (!this.f5343i.isEmpty()) {
            this.f5344j.d(this);
        }
    }

    /* access modifiers changed from: protected */
    public final void b(q3.b bVar, int i10) {
        this.f5344j.J(bVar, i10);
    }

    /* access modifiers changed from: protected */
    public final void c() {
        this.f5344j.b();
    }

    /* access modifiers changed from: package-private */
    public final b i() {
        return this.f5343i;
    }

    public final void onResume() {
        super.onResume();
        k();
    }

    public final void onStart() {
        super.onStart();
        k();
    }

    public final void onStop() {
        super.onStop();
        this.f5344j.e(this);
    }
}
