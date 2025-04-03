package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.internal.d;

final class i1 implements d.a {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ h f5409a;

    i1(h hVar) {
        this.f5409a = hVar;
    }

    public final void onBackgroundStateChanged(boolean z10) {
        h hVar = this.f5409a;
        hVar.f5399p.sendMessage(hVar.f5399p.obtainMessage(1, Boolean.valueOf(z10)));
    }
}
