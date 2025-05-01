package com.google.android.gms.internal.p002firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzgx  reason: invalid package */
public final class zzgx extends zzzw<zzgx, zzgw> implements zzaba {
    /* access modifiers changed from: private */
    public static final zzgx zzb;
    private zzha zze;

    static {
        zzgx zzgx = new zzgx();
        zzb = zzgx;
        zzzw.zzF(zzgx.class, zzgx);
    }

    private zzgx() {
    }

    public static zzgw zza() {
        return (zzgw) zzb.zzt();
    }

    public static zzgx zzc(zzyu zzyu, zzzj zzzj) {
        return (zzgx) zzzw.zzw(zzb, zzyu, zzzj);
    }

    static /* synthetic */ void zze(zzgx zzgx, zzha zzha) {
        zzha.getClass();
        zzgx.zze = zzha;
    }

    public final zzha zzd() {
        zzha zzha = this.zze;
        return zzha == null ? zzha.zze() : zzha;
    }

    /* access modifiers changed from: protected */
    public final Object zzj(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzzw.zzE(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"zze"});
        } else if (i11 == 3) {
            return new zzgx();
        } else {
            if (i11 == 4) {
                return new zzgw((zzgv) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
