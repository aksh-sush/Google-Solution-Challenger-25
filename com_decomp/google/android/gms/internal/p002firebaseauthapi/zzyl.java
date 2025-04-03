package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzyl  reason: invalid package */
final class zzyl extends zzyo {
    final /* synthetic */ zzyu zza;
    private int zzb = 0;
    private final int zzc;

    zzyl(zzyu zzyu) {
        this.zza = zzyu;
        this.zzc = zzyu.zzd();
    }

    public final boolean hasNext() {
        return this.zzb < this.zzc;
    }

    public final byte zza() {
        int i10 = this.zzb;
        if (i10 < this.zzc) {
            this.zzb = i10 + 1;
            return this.zza.zzb(i10);
        }
        throw new NoSuchElementException();
    }
}
