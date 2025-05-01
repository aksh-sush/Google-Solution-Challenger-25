package com.google.android.gms.internal.p002firebaseauthapi;

import java.io.OutputStream;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzah  reason: invalid package */
public final class zzah implements zzay {
    private final OutputStream zza;

    private zzah(OutputStream outputStream) {
        this.zza = outputStream;
    }

    public static zzay zza(OutputStream outputStream) {
        return new zzah(outputStream);
    }

    public final void zzb(zzho zzho) {
        throw null;
    }

    public final void zzc(zzir zzir) {
        try {
            zzir.zzq(this.zza);
        } finally {
            this.zza.close();
        }
    }
}
