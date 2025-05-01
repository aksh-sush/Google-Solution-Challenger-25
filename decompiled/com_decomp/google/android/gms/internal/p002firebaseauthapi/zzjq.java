package com.google.android.gms.internal.p002firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzjq  reason: invalid package */
public final class zzjq extends zzzw<zzjq, zzjp> implements zzaba {
    /* access modifiers changed from: private */
    public static final zzjq zzb;
    /* access modifiers changed from: private */
    public int zze;
    /* access modifiers changed from: private */
    public zzyu zzf = zzyu.zzb;

    static {
        zzjq zzjq = new zzjq();
        zzb = zzjq;
        zzzw.zzF(zzjq.class, zzjq);
    }

    private zzjq() {
    }

    public static zzjp zzb() {
        return (zzjp) zzb.zzt();
    }

    public static zzjq zzd(zzyu zzyu, zzzj zzzj) {
        return (zzjq) zzzw.zzw(zzb, zzyu, zzzj);
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
            return new zzjq();
        } else {
            if (i11 == 4) {
                return new zzjp((zzjo) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
