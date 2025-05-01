package com.google.android.gms.internal.p002firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzgd  reason: invalid package */
public final class zzgd extends zzzw<zzgd, zzgc> implements zzaba {
    /* access modifiers changed from: private */
    public static final zzgd zzb;
    /* access modifiers changed from: private */
    public int zze;
    private int zzf;

    static {
        zzgd zzgd = new zzgd();
        zzb = zzgd;
        zzzw.zzF(zzgd.class, zzgd);
    }

    private zzgd() {
    }

    public static zzgc zzb() {
        return (zzgc) zzb.zzt();
    }

    public static zzgd zzd(zzyu zzyu, zzzj zzzj) {
        return (zzgd) zzzw.zzw(zzb, zzyu, zzzj);
    }

    public final int zza() {
        return this.zze;
    }

    /* access modifiers changed from: protected */
    public final Object zzj(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzzw.zzE(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"zzf", "zze"});
        } else if (i11 == 3) {
            return new zzgd();
        } else {
            if (i11 == 4) {
                return new zzgc((zzgb) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
