package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.logging.Logger;
import java.util.regex.Pattern;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzx  reason: invalid package */
final class zzx {
    private static final Logger zza = Logger.getLogger(zzx.class.getName());
    private static final zzw zzb = new zzw((zzv) null);

    private zzx() {
    }

    static zzs zza(String str) {
        return new zzu(Pattern.compile("[.-]"));
    }

    static String zzb(String str) {
        return str == null ? "" : str;
    }

    static boolean zzc(String str) {
        return str == null || str.isEmpty();
    }
}
