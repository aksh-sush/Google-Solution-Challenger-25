package com.google.firebase.auth.internal;

import android.content.Context;
import com.google.firebase.auth.AuthResult;
import n4.f;
import n4.j;

final class g implements f {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ j f7698a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Context f7699b;

    g(zzax zzax, j jVar, Context context) {
        this.f7698a = jVar;
        this.f7699b = context;
    }

    public final /* bridge */ /* synthetic */ void b(Object obj) {
        this.f7698a.c((AuthResult) obj);
        zzax.zze(this.f7699b);
    }
}
