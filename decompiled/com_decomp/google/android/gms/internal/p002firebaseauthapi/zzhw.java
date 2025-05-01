package com.google.android.gms.internal.p002firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzhw  reason: invalid package */
public final class zzhw extends zzzw<zzhw, zzhv> implements zzaba {
    /* access modifiers changed from: private */
    public static final zzhw zzb;
    private zzhz zze;
    /* access modifiers changed from: private */
    public int zzf;
    private int zzg;

    static {
        zzhw zzhw = new zzhw();
        zzb = zzhw;
        zzzw.zzF(zzhw.class, zzhw);
    }

    private zzhw() {
    }

    public static zzhv zzb() {
        return (zzhv) zzb.zzt();
    }

    public static zzhw zzd() {
        return zzb;
    }

    public static zzhw zze(zzyu zzyu, zzzj zzzj) {
        return (zzhw) zzzw.zzw(zzb, zzyu, zzzj);
    }

    static /* synthetic */ void zzg(zzhw zzhw, zzhz zzhz) {
        zzhz.getClass();
        zzhw.zze = zzhz;
    }

    public final int zza() {
        return this.zzf;
    }

    public final zzhz zzf() {
        zzhz zzhz = this.zze;
        return zzhz == null ? zzhz.zze() : zzhz;
    }

    /* access modifiers changed from: protected */
    public final Object zzj(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzzw.zzE(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\u000b\u0003\u000b", new Object[]{"zze", "zzf", "zzg"});
        } else if (i11 == 3) {
            return new zzhw();
        } else {
            if (i11 == 4) {
                return new zzhv((zzhu) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
