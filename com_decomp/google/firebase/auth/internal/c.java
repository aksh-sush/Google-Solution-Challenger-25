package com.google.firebase.auth.internal;

import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuthUserCollisionException;
import n4.a;
import n4.i;
import n4.l;

final class c implements a {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ zzae f7692a;

    c(zzae zzae) {
        this.f7692a = zzae;
    }

    public final /* bridge */ /* synthetic */ Object a(i iVar) {
        if (this.f7692a.zzd == null) {
            return iVar;
        }
        if (iVar.isSuccessful()) {
            AuthResult authResult = (AuthResult) iVar.getResult();
            return l.e(new zzr((zzx) authResult.getUser(), (zzp) authResult.getAdditionalUserInfo(), this.f7692a.zzd));
        }
        Exception exception = iVar.getException();
        if (exception instanceof FirebaseAuthUserCollisionException) {
            ((FirebaseAuthUserCollisionException) exception).zza(this.f7692a.zzd);
        }
        return l.d(exception);
    }
}
