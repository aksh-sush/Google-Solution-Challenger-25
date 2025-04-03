package com.google.android.gms.internal.p002firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaa  reason: invalid package */
final class zzaa extends zzac {
    final /* synthetic */ zzr zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzaa(zzab zzab, zzae zzae, CharSequence charSequence, zzr zzr) {
        super(zzae, charSequence);
        this.zza = zzr;
    }

    public final int zzc(int i10) {
        return ((zzt) this.zza).zza.end();
    }

    public final int zzd(int i10) {
        if (((zzt) this.zza).zza.find(i10)) {
            return ((zzt) this.zza).zza.start();
        }
        return -1;
    }
}
