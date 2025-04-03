package com.google.firebase.auth.internal;

import android.util.Log;
import n4.e;
import n4.j;

final class q implements e {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ j f7723a;

    q(zzf zzf, j jVar) {
        this.f7723a = jVar;
    }

    public final void onFailure(Exception exc) {
        Log.e(zzf.zza, String.format("Failed to get reCAPTCHA token with error [%s]- calling backend without app verification", new Object[]{exc.getMessage()}));
        this.f7723a.c(new zze((String) null, (String) null));
    }
}
