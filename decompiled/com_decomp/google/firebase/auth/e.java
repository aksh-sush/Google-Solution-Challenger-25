package com.google.firebase.auth;

import com.google.android.gms.common.api.Status;
import com.google.firebase.auth.internal.zzan;

final class e implements zzan {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ FirebaseUser f7678a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ FirebaseAuth f7679b;

    e(FirebaseAuth firebaseAuth, FirebaseUser firebaseUser) {
        this.f7679b = firebaseAuth;
        this.f7678a = firebaseUser;
    }

    public final void zza() {
        if (this.f7679b.zzf != null && this.f7679b.zzf.getUid().equalsIgnoreCase(this.f7678a.getUid())) {
            this.f7679b.zzC();
        }
    }

    public final void zzb(Status status) {
        if (status.V() == 17011 || status.V() == 17021 || status.V() == 17005) {
            this.f7679b.signOut();
        }
    }
}
