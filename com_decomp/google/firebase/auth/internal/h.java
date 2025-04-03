package com.google.firebase.auth.internal;

import android.content.Context;
import n4.e;
import n4.j;

final class h implements e {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ j f7700a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Context f7701b;

    h(zzax zzax, j jVar, Context context) {
        this.f7700a = jVar;
        this.f7701b = context;
    }

    public final void onFailure(Exception exc) {
        this.f7700a.b(exc);
        zzax.zze(this.f7701b);
    }
}
