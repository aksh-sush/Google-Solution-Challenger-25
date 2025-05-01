package com.google.firebase.auth;

import com.google.android.gms.common.internal.s;
import com.google.android.gms.internal.p002firebaseauthapi.zzwq;
import com.google.firebase.auth.internal.zzg;

class o implements zzg {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ FirebaseAuth f7738a;

    o(FirebaseAuth firebaseAuth) {
        this.f7738a = firebaseAuth;
    }

    public final void zza(zzwq zzwq, FirebaseUser firebaseUser) {
        s.k(zzwq);
        s.k(firebaseUser);
        firebaseUser.zzh(zzwq);
        this.f7738a.zzD(firebaseUser, zzwq, true);
    }
}
