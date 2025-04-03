package com.google.firebase.auth.internal;

import android.content.Context;
import n4.e;

final class j implements e {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ n4.j f7704a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Context f7705b;

    j(zzax zzax, n4.j jVar, Context context) {
        this.f7704a = jVar;
        this.f7705b = context;
    }

    public final void onFailure(Exception exc) {
        this.f7704a.b(exc);
        zzax.zze(this.f7705b);
    }
}
