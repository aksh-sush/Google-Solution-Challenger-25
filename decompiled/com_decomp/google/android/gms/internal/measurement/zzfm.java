package com.google.android.gms.internal.measurement;

public final class zzfm extends zzjz<zzfm, zzfl> implements zzlh {
    /* access modifiers changed from: private */
    public static final zzfm zza;
    private int zze;
    private int zzf;
    private long zzg;

    static {
        zzfm zzfm = new zzfm();
        zza = zzfm;
        zzjz.zzbG(zzfm.class, zzfm);
    }

    private zzfm() {
    }

    public static zzfl zzc() {
        return (zzfl) zza.zzbu();
    }

    static /* synthetic */ void zze(zzfm zzfm, int i10) {
        zzfm.zze |= 1;
        zzfm.zzf = i10;
    }

    static /* synthetic */ void zzf(zzfm zzfm, long j10) {
        zzfm.zze |= 2;
        zzfm.zzg = j10;
    }

    public final int zza() {
        return this.zzf;
    }

    public final long zzb() {
        return this.zzg;
    }

    public final boolean zzg() {
        return (this.zze & 2) != 0;
    }

    public final boolean zzh() {
        return (this.zze & 1) != 0;
    }

    /* access modifiers changed from: protected */
    public final Object zzl(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzjz.zzbF(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဂ\u0001", new Object[]{"zze", "zzf", "zzg"});
        } else if (i11 == 3) {
            return new zzfm();
        } else {
            if (i11 == 4) {
                return new zzfl((zzff) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zza;
        }
    }
}
