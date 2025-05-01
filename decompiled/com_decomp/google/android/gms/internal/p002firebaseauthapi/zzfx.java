package com.google.android.gms.internal.p002firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzfx  reason: invalid package */
public final class zzfx extends zzzw<zzfx, zzfw> implements zzaba {
    /* access modifiers changed from: private */
    public static final zzfx zzb;
    /* access modifiers changed from: private */
    public int zze;
    private int zzf;

    static {
        zzfx zzfx = new zzfx();
        zzb = zzfx;
        zzzw.zzF(zzfx.class, zzfx);
    }

    private zzfx() {
    }

    public static zzfw zzb() {
        return (zzfw) zzb.zzt();
    }

    public static zzfx zzd(zzyu zzyu, zzzj zzzj) {
        return (zzfx) zzzw.zzw(zzb, zzyu, zzzj);
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
            return zzzw.zzE(zzb, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\u000b\u0003\u000b", new Object[]{"zze", "zzf"});
        } else if (i11 == 3) {
            return new zzfx();
        } else {
            if (i11 == 4) {
                return new zzfw((zzfv) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
