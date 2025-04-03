package com.google.android.gms.internal.p002firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzff  reason: invalid package */
public final class zzff extends zzzw<zzff, zzfe> implements zzaba {
    /* access modifiers changed from: private */
    public static final zzff zzb;
    private zzfi zze;
    /* access modifiers changed from: private */
    public int zzf;

    static {
        zzff zzff = new zzff();
        zzb = zzff;
        zzzw.zzF(zzff.class, zzff);
    }

    private zzff() {
    }

    public static zzfe zzb() {
        return (zzfe) zzb.zzt();
    }

    public static zzff zzd() {
        return zzb;
    }

    public static zzff zze(zzyu zzyu, zzzj zzzj) {
        return (zzff) zzzw.zzw(zzb, zzyu, zzzj);
    }

    static /* synthetic */ void zzg(zzff zzff, zzfi zzfi) {
        zzfi.getClass();
        zzff.zze = zzfi;
    }

    public final int zza() {
        return this.zzf;
    }

    public final zzfi zzf() {
        zzfi zzfi = this.zze;
        return zzfi == null ? zzfi.zzd() : zzfi;
    }

    /* access modifiers changed from: protected */
    public final Object zzj(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzzw.zzE(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u000b", new Object[]{"zze", "zzf"});
        } else if (i11 == 3) {
            return new zzff();
        } else {
            if (i11 == 4) {
                return new zzfe((zzfd) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
