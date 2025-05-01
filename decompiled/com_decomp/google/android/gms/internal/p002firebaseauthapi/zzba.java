package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzba  reason: invalid package */
public final class zzba {
    private static final CopyOnWriteArrayList<zzaz> zza = new CopyOnWriteArrayList<>();

    public static zzaz zza(String str) {
        Iterator<zzaz> it = zza.iterator();
        while (it.hasNext()) {
            zzaz next = it.next();
            if (next.zzb(str)) {
                return next;
            }
        }
        String valueOf = String.valueOf(str);
        throw new GeneralSecurityException(valueOf.length() != 0 ? "No KMS client does support: ".concat(valueOf) : new String("No KMS client does support: "));
    }
}
