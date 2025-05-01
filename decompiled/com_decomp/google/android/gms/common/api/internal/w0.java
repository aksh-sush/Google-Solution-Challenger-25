package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.api.a;
import java.util.Collections;
import q3.b;

public final class w0 implements c1 {

    /* renamed from: a  reason: collision with root package name */
    private final f1 f5531a;

    public w0(f1 f1Var) {
        this.f5531a = f1Var;
    }

    public final void a(Bundle bundle) {
    }

    public final void b(int i10) {
    }

    public final void c() {
        for (a.f disconnect : this.f5531a.f5359f.values()) {
            disconnect.disconnect();
        }
        this.f5531a.f5367n.f5317p = Collections.emptySet();
    }

    public final void d() {
        this.f5531a.n();
    }

    public final void e(b bVar, a aVar, boolean z10) {
    }

    public final e f(e eVar) {
        this.f5531a.f5367n.f5309h.add(eVar);
        return eVar;
    }

    public final boolean g() {
        return true;
    }

    public final e h(e eVar) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }
}
