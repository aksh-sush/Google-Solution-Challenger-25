package com.google.firebase.auth.internal;

import com.google.firebase.auth.GetTokenResult;
import n4.a;
import n4.i;
import n4.l;

final class b implements a {
    b(zzac zzac) {
    }

    public final /* bridge */ /* synthetic */ Object a(i iVar) {
        return !iVar.isSuccessful() ? l.d(iVar.getException()) : l.e(zzag.zza(((GetTokenResult) iVar.getResult()).getToken()));
    }
}
