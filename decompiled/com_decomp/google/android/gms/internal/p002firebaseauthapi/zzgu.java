package com.google.android.gms.internal.p002firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzgu  reason: invalid package */
public final class zzgu extends zzzw<zzgu, zzgt> implements zzaba {
    /* access modifiers changed from: private */
    public static final zzgu zzb;
    private zzij zze;

    static {
        zzgu zzgu = new zzgu();
        zzb = zzgu;
        zzzw.zzF(zzgu.class, zzgu);
    }

    private zzgu() {
    }

    public static zzgt zza() {
        return (zzgt) zzb.zzt();
    }

    public static zzgu zzc() {
        return zzb;
    }

    static /* synthetic */ void zze(zzgu zzgu, zzij zzij) {
        zzij.getClass();
        zzgu.zze = zzij;
    }

    public final zzij zzd() {
        zzij zzij = this.zze;
        return zzij == null ? zzij.zzc() : zzij;
    }

    /* access modifiers changed from: protected */
    public final Object zzj(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzzw.zzE(zzb, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002\t", new Object[]{"zze"});
        } else if (i11 == 3) {
            return new zzgu();
        } else {
            if (i11 == 4) {
                return new zzgt((zzgs) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
