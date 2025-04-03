package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.s;
import java.io.UnsupportedEncodingException;
import java.util.List;
import y3.c;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzws  reason: invalid package */
public final class zzws {
    public static long zza(String str) {
        s.g(str);
        List<String> zzd = zzae.zzb('.').zzd(str);
        if (zzd.size() < 2) {
            String valueOf = String.valueOf(str);
            throw new RuntimeException(valueOf.length() != 0 ? "Invalid idToken ".concat(valueOf) : new String("Invalid idToken "));
        }
        try {
            zzwt zza = zzwt.zza(new String(c.b(zzd.get(1)), "UTF-8"));
            return zza.zzb().longValue() - zza.zzc().longValue();
        } catch (UnsupportedEncodingException e10) {
            throw new RuntimeException("Unable to decode token", e10);
        }
    }
}
