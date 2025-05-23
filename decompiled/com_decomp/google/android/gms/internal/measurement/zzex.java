package com.google.android.gms.internal.measurement;

import java.util.List;

public final class zzex extends zzjz<zzex, zzet> implements zzlh {
    /* access modifiers changed from: private */
    public static final zzex zza;
    private int zze;
    private int zzf;
    private String zzg = "";
    private boolean zzh;
    private zzkg<String> zzi = zzjz.zzbA();

    static {
        zzex zzex = new zzex();
        zza = zzex;
        zzjz.zzbG(zzex.class, zzex);
    }

    private zzex() {
    }

    public static zzex zzc() {
        return zza;
    }

    public final int zza() {
        return this.zzi.size();
    }

    public final String zzd() {
        return this.zzg;
    }

    public final List<String> zze() {
        return this.zzi;
    }

    public final boolean zzf() {
        return this.zzh;
    }

    public final boolean zzg() {
        return (this.zze & 4) != 0;
    }

    public final boolean zzh() {
        return (this.zze & 2) != 0;
    }

    public final boolean zzi() {
        return (this.zze & 1) != 0;
    }

    public final int zzj() {
        int zza2 = zzew.zza(this.zzf);
        if (zza2 == 0) {
            return 1;
        }
        return zza2;
    }

    /* access modifiers changed from: protected */
    public final Object zzl(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzjz.zzbF(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004\u001a", new Object[]{"zze", "zzf", zzev.zza, "zzg", "zzh", "zzi"});
        } else if (i11 == 3) {
            return new zzex();
        } else {
            if (i11 == 4) {
                return new zzet((zzef) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zza;
        }
    }
}
