package com.google.firebase.auth;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p002firebaseauthapi.zzwq;
import com.google.firebase.auth.internal.zzbk;

final class j implements zzbk {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ FirebaseAuth f7725a;

    j(FirebaseAuth firebaseAuth) {
        this.f7725a = firebaseAuth;
    }

    public final void zza(zzwq zzwq, FirebaseUser firebaseUser) {
        FirebaseAuth.zzG(this.f7725a, firebaseUser, zzwq, true, true);
    }

    public final void zzb(Status status) {
        int V = status.V();
        if (V == 17011 || V == 17021 || V == 17005) {
            this.f7725a.signOut();
        }
    }
}
