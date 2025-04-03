package com.google.android.gms.internal.p002firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzgj  reason: invalid package */
public final class zzgj extends zzzw<zzgj, zzgi> implements zzaba {
    /* access modifiers changed from: private */
    public static final zzgj zzb;
    /* access modifiers changed from: private */
    public int zze;
    private int zzf;

    static {
        zzgj zzgj = new zzgj();
        zzb = zzgj;
        zzzw.zzF(zzgj.class, zzgj);
    }

    private zzgj() {
    }

    public static zzgi zzb() {
        return (zzgi) zzb.zzt();
    }

    public static zzgj zzd(zzyu zzyu, zzzj zzzj) {
        return (zzgj) zzzw.zzw(zzb, zzyu, zzzj);
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
            return zzzw.zzE(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"zze", "zzf"});
        } else if (i11 == 3) {
            return new zzgj();
        } else {
            if (i11 == 4) {
                return new zzgi((zzgh) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
