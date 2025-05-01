package com.google.android.gms.internal.p002firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzeq  reason: invalid package */
public final class zzeq extends zzzw<zzeq, zzep> implements zzaba {
    /* access modifiers changed from: private */
    public static final zzeq zzb;
    /* access modifiers changed from: private */
    public int zze;
    private zzet zzf;

    static {
        zzeq zzeq = new zzeq();
        zzb = zzeq;
        zzzw.zzF(zzeq.class, zzeq);
    }

    private zzeq() {
    }

    public static zzep zzb() {
        return (zzep) zzb.zzt();
    }

    public static zzeq zzd(zzyu zzyu, zzzj zzzj) {
        return (zzeq) zzzw.zzw(zzb, zzyu, zzzj);
    }

    static /* synthetic */ void zzg(zzeq zzeq, zzet zzet) {
        zzet.getClass();
        zzeq.zzf = zzet;
    }

    public final int zza() {
        return this.zze;
    }

    public final zzet zze() {
        zzet zzet = this.zzf;
        return zzet == null ? zzet.zzd() : zzet;
    }

    /* access modifiers changed from: protected */
    public final Object zzj(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzzw.zzE(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"zze", "zzf"});
        } else if (i11 == 3) {
            return new zzeq();
        } else {
            if (i11 == 4) {
                return new zzep((zzeo) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
