package com.google.firebase.auth;

import com.google.android.gms.common.internal.s;
import n4.a;
import n4.i;

final class u implements a {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ String f7743a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ActionCodeSettings f7744b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ FirebaseUser f7745c;

    u(FirebaseUser firebaseUser, String str, ActionCodeSettings actionCodeSettings) {
        this.f7745c = firebaseUser;
        this.f7743a = str;
        this.f7744b = actionCodeSettings;
    }

    public final /* bridge */ /* synthetic */ Object a(i iVar) {
        return FirebaseAuth.getInstance(this.f7745c.zza()).zzr((String) s.k(((GetTokenResult) iVar.getResult()).getToken()), this.f7743a, this.f7744b);
    }
}
