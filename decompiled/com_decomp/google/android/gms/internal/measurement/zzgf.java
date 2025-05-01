package com.google.android.gms.internal.measurement;

import java.util.List;

public final class zzgf extends zzjz<zzgf, zzge> implements zzlh {
    /* access modifiers changed from: private */
    public static final zzgf zza;
    private int zze;
    private int zzf;
    private zzkf zzg = zzjz.zzby();

    static {
        zzgf zzgf = new zzgf();
        zza = zzgf;
        zzjz.zzbG(zzgf.class, zzgf);
    }

    private zzgf() {
    }

    public static zzge zzd() {
        return (zzge) zza.zzbu();
    }

    static /* synthetic */ void zzg(zzgf zzgf, int i10) {
        zzgf.zze |= 1;
        zzgf.zzf = i10;
    }

    static /* synthetic */ void zzh(zzgf zzgf, Iterable iterable) {
        zzkf zzkf = zzgf.zzg;
        if (!zzkf.zzc()) {
            zzgf.zzg = zzjz.zzbz(zzkf);
        }
        zzih.zzbq(iterable, zzgf.zzg);
    }

    public final int zza() {
        return this.zzg.size();
    }

    public final int zzb() {
        return this.zzf;
    }

    public final long zzc(int i10) {
        return this.zzg.zza(i10);
    }

    public final List<Long> zzf() {
        return this.zzg;
    }

    public final boolean zzi() {
        return (this.zze & 1) != 0;
    }

    /* access modifiers changed from: protected */
    public final Object zzl(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzjz.zzbF(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001င\u0000\u0002\u0014", new Object[]{"zze", "zzf", "zzg"});
        } else if (i11 == 3) {
            return new zzgf();
        } else {
            if (i11 == 4) {
                return new zzge((zzff) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zza;
        }
    }
}
