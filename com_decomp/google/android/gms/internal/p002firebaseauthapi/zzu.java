package com.google.android.gms.internal.p002firebaseauthapi;

import java.io.Serializable;
import java.util.regex.Pattern;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzu  reason: invalid package */
final class zzu extends zzs implements Serializable {
    private final Pattern zza;

    zzu(Pattern pattern) {
        pattern.getClass();
        this.zza = pattern;
    }

    public final String toString() {
        return this.zza.toString();
    }

    public final zzr zza(CharSequence charSequence) {
        return new zzt(this.zza.matcher(charSequence));
    }
}
