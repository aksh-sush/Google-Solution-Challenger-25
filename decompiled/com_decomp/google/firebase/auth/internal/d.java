package com.google.firebase.auth.internal;

import com.google.firebase.FirebaseNetworkException;
import n4.e;

final class d implements e {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ e f7693a;

    d(e eVar) {
        this.f7693a = eVar;
    }

    public final void onFailure(Exception exc) {
        if (exc instanceof FirebaseNetworkException) {
            zzam.zzg.g("Failure to refresh token; scheduling refresh after failure", new Object[0]);
            this.f7693a.f7695f.zzd();
        }
    }
}
