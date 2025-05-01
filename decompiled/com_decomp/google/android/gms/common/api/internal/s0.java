package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.s;
import k4.e;
import q3.b;

final class s0 implements GoogleApiClient.b, GoogleApiClient.c {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ v0 f5489a;

    /* synthetic */ s0(v0 v0Var, r0 r0Var) {
        this.f5489a = v0Var;
    }

    public final void onConnected(Bundle bundle) {
        d dVar = (d) s.k(this.f5489a.f5525r);
        ((e) s.k(this.f5489a.f5518k)).a(new q0(this.f5489a));
    }

    public final void onConnectionFailed(b bVar) {
        this.f5489a.f5509b.lock();
        try {
            if (this.f5489a.q(bVar)) {
                this.f5489a.i();
                this.f5489a.n();
            } else {
                this.f5489a.l(bVar);
            }
        } finally {
            this.f5489a.f5509b.unlock();
        }
    }

    public final void onConnectionSuspended(int i10) {
    }
}
