package com.google.firebase.auth;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.internal.p002firebaseauthapi.zzwq;
import com.google.firebase.auth.internal.zzbk;

final class p implements zzbk {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ FirebaseAuth f7739a;

    p(FirebaseAuth firebaseAuth) {
        this.f7739a = firebaseAuth;
    }

    public final void zza(zzwq zzwq, FirebaseUser firebaseUser) {
        s.k(zzwq);
        s.k(firebaseUser);
        firebaseUser.zzh(zzwq);
        FirebaseAuth.zzG(this.f7739a, firebaseUser, zzwq, true, true);
    }

    public final void zzb(Status status) {
        if (status.V() == 17011 || status.V() == 17021 || status.V() == 17005 || status.V() == 17091) {
            this.f7739a.signOut();
        }
    }
}
