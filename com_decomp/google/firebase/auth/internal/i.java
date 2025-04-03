package com.google.firebase.auth.internal;

import android.content.Context;
import com.google.firebase.auth.AuthResult;
import n4.f;
import n4.j;

final class i implements f {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ j f7702a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Context f7703b;

    i(zzax zzax, j jVar, Context context) {
        this.f7702a = jVar;
        this.f7703b = context;
    }

    public final /* bridge */ /* synthetic */ void b(Object obj) {
        this.f7702a.c((AuthResult) obj);
        zzax.zze(this.f7703b);
    }
}
