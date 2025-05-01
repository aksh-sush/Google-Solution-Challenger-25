package com.google.firebase.auth.internal;

import android.content.Context;
import com.google.firebase.auth.AuthResult;
import n4.f;
import n4.j;

final class k implements f {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ j f7706a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Context f7707b;

    k(zzax zzax, j jVar, Context context) {
        this.f7706a = jVar;
        this.f7707b = context;
    }

    public final /* bridge */ /* synthetic */ void b(Object obj) {
        this.f7706a.c((AuthResult) obj);
        zzax.zze(this.f7707b);
    }
}
