package com.google.firebase.auth;

import n4.a;
import n4.i;

final class s implements a {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ FirebaseUser f7740a;

    s(FirebaseUser firebaseUser) {
        this.f7740a = firebaseUser;
    }

    public final /* bridge */ /* synthetic */ Object a(i iVar) {
        return FirebaseAuth.getInstance(this.f7740a.zza()).zzi((ActionCodeSettings) null, (String) com.google.android.gms.common.internal.s.k(((GetTokenResult) iVar.getResult()).getToken()));
    }
}
