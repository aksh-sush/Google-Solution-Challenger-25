package com.google.android.gms.internal.p002firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzga  reason: invalid package */
public final class zzga extends zzzw<zzga, zzfz> implements zzaba {
    /* access modifiers changed from: private */
    public static final zzga zzb;
    /* access modifiers changed from: private */
    public int zze;
    /* access modifiers changed from: private */
    public zzyu zzf = zzyu.zzb;

    static {
        zzga zzga = new zzga();
        zzb = zzga;
        zzzw.zzF(zzga.class, zzga);
    }

    private zzga() {
    }

    public static zzfz zzb() {
        return (zzfz) zzb.zzt();
    }

    public static zzga zzd(zzyu zzyu, zzzj zzzj) {
        return (zzga) zzzw.zzw(zzb, zzyu, zzzj);
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
            return zzzw.zzE(zzb, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"zze", "zzf"});
        } else if (i11 == 3) {
            return new zzga();
        } else {
            if (i11 == 4) {
                return new zzfz((zzfy) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
