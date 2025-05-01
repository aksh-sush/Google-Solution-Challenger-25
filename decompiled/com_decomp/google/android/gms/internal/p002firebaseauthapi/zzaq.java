package com.google.android.gms.internal.p002firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaq  reason: invalid package */
public final class zzaq {
    private final zzij zza;

    private zzaq(zzij zzij) {
        this.zza = zzij;
    }

    public static zzaq zze(String str, byte[] bArr, int i10) {
        zzii zza2 = zzij.zza();
        zza2.zzb(str);
        zza2.zzc(zzyu.zzn(bArr));
        zzjk zzjk = zzjk.UNKNOWN_PREFIX;
        int i11 = i10 - 1;
        zza2.zza(i11 != 0 ? i11 != 1 ? i11 != 2 ? zzjk.CRUNCHY : zzjk.RAW : zzjk.LEGACY : zzjk.TINK);
        return new zzaq((zzij) zza2.zzk());
    }

    /* access modifiers changed from: package-private */
    public final zzij zza() {
        return this.zza;
    }

    public final String zzb() {
        return this.zza.zzf();
    }

    public final byte[] zzc() {
        return this.zza.zze().zzs();
    }

    public final int zzd() {
        zzjk zzd = this.zza.zzd();
        zzjk zzjk = zzjk.UNKNOWN_PREFIX;
        int ordinal = zzd.ordinal();
        int i10 = 1;
        if (ordinal != 1) {
            i10 = 2;
            if (ordinal != 2) {
                i10 = 3;
                if (ordinal != 3) {
                    if (ordinal == 4) {
                        return 4;
                    }
                    throw new IllegalArgumentException("Unknown output prefix type");
                }
            }
        }
        return i10;
    }
}
