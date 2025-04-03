package com.google.firebase.auth;

import n4.a;
import n4.i;
import n4.l;

final class n implements a {
    n(FirebaseAuth firebaseAuth) {
    }

    public final /* bridge */ /* synthetic */ Object a(i iVar) {
        return (iVar.isSuccessful() || !(iVar.getException() instanceof FirebaseAuthException) || !((FirebaseAuthException) iVar.getException()).getErrorCode().equals("ERROR_INTERNAL_SUCCESS_SIGN_OUT")) ? iVar : l.e((Object) null);
    }
}
