package com.google.android.gms.internal.measurement;

public final class zzfk extends zzjz<zzfk, zzfj> implements zzlh {
    /* access modifiers changed from: private */
    public static final zzfk zza;
    private int zze;
    private int zzf;
    private zzgd zzg;
    private zzgd zzh;
    private boolean zzi;

    static {
        zzfk zzfk = new zzfk();
        zza = zzfk;
        zzjz.zzbG(zzfk.class, zzfk);
    }

    private zzfk() {
    }

    public static zzfj zzb() {
        return (zzfj) zza.zzbu();
    }

    static /* synthetic */ void zzf(zzfk zzfk, int i10) {
        zzfk.zze |= 1;
        zzfk.zzf = i10;
    }

    static /* synthetic */ void zzg(zzfk zzfk, zzgd zzgd) {
        zzgd.getClass();
        zzfk.zzg = zzgd;
        zzfk.zze |= 2;
    }

    static /* synthetic */ void zzh(zzfk zzfk, zzgd zzgd) {
        zzfk.zzh = zzgd;
        zzfk.zze |= 4;
    }

    static /* synthetic */ void zzi(zzfk zzfk, boolean z10) {
        zzfk.zze |= 8;
        zzfk.zzi = z10;
    }

    public final int zza() {
        return this.zzf;
    }

    public final zzgd zzd() {
        zzgd zzgd = this.zzg;
        return zzgd == null ? zzgd.zzh() : zzgd;
    }

    public final zzgd zze() {
        zzgd zzgd = this.zzh;
        return zzgd == null ? zzgd.zzh() : zzgd;
    }

    public final boolean zzj() {
        return this.zzi;
    }

    public final boolean zzk() {
        return (this.zze & 1) != 0;
    }

    /* access modifiers changed from: protected */
    public final Object zzl(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzjz.zzbF(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဇ\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
        } else if (i11 == 3) {
            return new zzfk();
        } else {
            if (i11 == 4) {
                return new zzfj((zzff) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zza;
        }
    }

    public final boolean zzm() {
        return (this.zze & 8) != 0;
    }

    public final boolean zzn() {
        return (this.zze & 4) != 0;
    }
}
