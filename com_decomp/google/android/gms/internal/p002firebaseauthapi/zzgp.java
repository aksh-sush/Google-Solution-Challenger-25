package com.google.android.gms.internal.p002firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzgp  reason: invalid package */
public final class zzgp extends zzzw<zzgp, zzgo> implements zzaba {
    /* access modifiers changed from: private */
    public static final zzgp zzb;

    static {
        zzgp zzgp = new zzgp();
        zzb = zzgp;
        zzzw.zzF(zzgp.class, zzgp);
    }

    private zzgp() {
    }

    public static zzgp zzb() {
        return zzb;
    }

    public static zzgp zzc(zzyu zzyu, zzzj zzzj) {
        return (zzgp) zzzw.zzw(zzb, zzyu, zzzj);
    }

    /* access modifiers changed from: protected */
    public final Object zzj(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzzw.zzE(zzb, "\u0000\u0000", (Object[]) null);
        }
        if (i11 == 3) {
            return new zzgp();
        }
        if (i11 == 4) {
            return new zzgo((zzgn) null);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
