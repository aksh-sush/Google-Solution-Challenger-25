package com.google.android.gms.internal.p002firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zziv  reason: invalid package */
public final class zziv extends zzzw<zziv, zziu> implements zzaba {
    /* access modifiers changed from: private */
    public static final zziv zzb;
    private String zze = "";
    /* access modifiers changed from: private */
    public int zzf;
    /* access modifiers changed from: private */
    public int zzg;
    /* access modifiers changed from: private */
    public int zzh;

    static {
        zziv zziv = new zziv();
        zzb = zziv;
        zzzw.zzF(zziv.class, zziv);
    }

    private zziv() {
    }

    public static zziu zzb() {
        return (zziu) zzb.zzt();
    }

    static /* synthetic */ void zzd(zziv zziv, String str) {
        str.getClass();
        zziv.zze = str;
    }

    public final int zza() {
        return this.zzg;
    }

    /* access modifiers changed from: protected */
    public final Object zzj(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzzw.zzE(zzb, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f", new Object[]{"zze", "zzf", "zzg", "zzh"});
        } else if (i11 == 3) {
            return new zziv();
        } else {
            if (i11 == 4) {
                return new zziu((zzis) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
