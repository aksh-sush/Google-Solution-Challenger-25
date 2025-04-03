package com.google.android.gms.internal.p002firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzgm  reason: invalid package */
public final class zzgm extends zzzw<zzgm, zzgl> implements zzaba {
    /* access modifiers changed from: private */
    public static final zzgm zzb;
    /* access modifiers changed from: private */
    public int zze;
    /* access modifiers changed from: private */
    public zzyu zzf = zzyu.zzb;

    static {
        zzgm zzgm = new zzgm();
        zzb = zzgm;
        zzzw.zzF(zzgm.class, zzgm);
    }

    private zzgm() {
    }

    public static zzgl zzb() {
        return (zzgl) zzb.zzt();
    }

    public static zzgm zzd(zzyu zzyu, zzzj zzzj) {
        return (zzgm) zzzw.zzw(zzb, zzyu, zzzj);
    }

    public final int zza() {
        return this.zze;
    }

    public final zzyu zze() {
        return this.zzf;
    }

    /* access modifiers changed from: protected */
    public final Object zzj(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzzw.zzE(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\n", new Object[]{"zze", "zzf"});
        } else if (i11 == 3) {
            return new zzgm();
        } else {
            if (i11 == 4) {
                return new zzgl((zzgk) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
