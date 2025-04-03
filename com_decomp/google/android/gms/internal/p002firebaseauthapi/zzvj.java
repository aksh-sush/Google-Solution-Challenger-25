package com.google.android.gms.internal.p002firebaseauthapi;

import n4.e;
import u3.a;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzvj  reason: invalid package */
final class zzvj implements e {
    zzvj(zzvn zzvn) {
    }

    public final void onFailure(Exception exc) {
        a zza = zzvn.zza;
        String valueOf = String.valueOf(exc.getMessage());
        zza.c(valueOf.length() != 0 ? "SmsRetrieverClient failed to start: ".concat(valueOf) : new String("SmsRetrieverClient failed to start: "), new Object[0]);
    }
}
