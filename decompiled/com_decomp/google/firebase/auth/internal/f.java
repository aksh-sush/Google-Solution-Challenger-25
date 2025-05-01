package com.google.firebase.auth.internal;

import android.content.Context;
import n4.e;
import n4.j;

final class f implements e {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ j f7696a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Context f7697b;

    f(zzax zzax, j jVar, Context context) {
        this.f7696a = jVar;
        this.f7697b = context;
    }

    public final void onFailure(Exception exc) {
        this.f7696a.b(exc);
        zzax.zze(this.f7697b);
    }
}
