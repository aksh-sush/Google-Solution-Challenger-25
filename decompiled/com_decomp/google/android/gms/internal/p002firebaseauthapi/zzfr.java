package com.google.android.gms.internal.p002firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzfr  reason: invalid package */
public final class zzfr extends zzzw<zzfr, zzfq> implements zzaba {
    /* access modifiers changed from: private */
    public static final zzfr zzb;
    /* access modifiers changed from: private */
    public int zze;

    static {
        zzfr zzfr = new zzfr();
        zzb = zzfr;
        zzzw.zzF(zzfr.class, zzfr);
    }

    private zzfr() {
    }

    public static zzfq zzb() {
        return (zzfq) zzb.zzt();
    }

    public static zzfr zzd() {
        return zzb;
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
            return zzzw.zzE(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zze"});
        } else if (i11 == 3) {
            return new zzfr();
        } else {
            if (i11 == 4) {
                return new zzfq((zzfp) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
