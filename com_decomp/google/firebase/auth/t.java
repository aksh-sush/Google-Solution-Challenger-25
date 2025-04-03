package com.google.firebase.auth;

import com.google.android.gms.common.internal.s;
import n4.a;
import n4.i;

final class t implements a {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ActionCodeSettings f7741a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ FirebaseUser f7742b;

    t(FirebaseUser firebaseUser, ActionCodeSettings actionCodeSettings) {
        this.f7742b = firebaseUser;
        this.f7741a = actionCodeSettings;
    }

    public final /* bridge */ /* synthetic */ Object a(i iVar) {
        return FirebaseAuth.getInstance(this.f7742b.zza()).zzi(this.f7741a, (String) s.k(((GetTokenResult) iVar.getResult()).getToken()));
    }
}
