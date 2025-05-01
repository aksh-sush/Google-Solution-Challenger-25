package com.google.android.gms.internal.p002firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzhg  reason: invalid package */
public final class zzhg extends zzzw<zzhg, zzhf> implements zzaba {
    /* access modifiers changed from: private */
    public static final zzhg zzb;
    /* access modifiers changed from: private */
    public int zze;
    private zzha zzf;
    /* access modifiers changed from: private */
    public zzyu zzg;
    /* access modifiers changed from: private */
    public zzyu zzh;

    static {
        zzhg zzhg = new zzhg();
        zzb = zzhg;
        zzzw.zzF(zzhg.class, zzhg);
    }

    private zzhg() {
        zzyu zzyu = zzyu.zzb;
        this.zzg = zzyu;
        this.zzh = zzyu;
    }

    public static zzhf zzc() {
        return (zzhf) zzb.zzt();
    }

    public static zzhg zze() {
        return zzb;
    }

    public static zzhg zzf(zzyu zzyu, zzzj zzzj) {
        return (zzhg) zzzw.zzw(zzb, zzyu, zzzj);
    }

    static /* synthetic */ void zzk(zzhg zzhg, zzha zzha) {
        zzha.getClass();
        zzhg.zzf = zzha;
    }

    public final int zza() {
        return this.zze;
    }

    public final zzha zzb() {
        zzha zzha = this.zzf;
        return zzha == null ? zzha.zze() : zzha;
    }

    public final zzyu zzg() {
        return this.zzg;
    }

    public final zzyu zzh() {
        return this.zzh;
    }

    /* access modifiers changed from: protected */
    public final Object zzj(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzzw.zzE(zzb, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n\u0004\n", new Object[]{"zze", "zzf", "zzg", "zzh"});
        } else if (i11 == 3) {
            return new zzhg();
        } else {
            if (i11 == 4) {
                return new zzhf((zzhe) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
