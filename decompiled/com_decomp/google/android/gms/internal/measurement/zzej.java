package com.google.android.gms.internal.measurement;

import java.util.List;

public final class zzej extends zzjz<zzej, zzei> implements zzlh {
    /* access modifiers changed from: private */
    public static final zzej zza;
    private int zze;
    private int zzf;
    private String zzg = "";
    private zzkg<zzel> zzh = zzjz.zzbA();
    private boolean zzi;
    private zzeq zzj;
    private boolean zzk;
    private boolean zzl;
    private boolean zzm;

    static {
        zzej zzej = new zzej();
        zza = zzej;
        zzjz.zzbG(zzej.class, zzej);
    }

    private zzej() {
    }

    public static zzei zzc() {
        return (zzei) zza.zzbu();
    }

    static /* synthetic */ void zzi(zzej zzej, String str) {
        zzej.zze |= 2;
        zzej.zzg = str;
    }

    static /* synthetic */ void zzj(zzej zzej, int i10, zzel zzel) {
        zzel.getClass();
        zzkg<zzel> zzkg = zzej.zzh;
        if (!zzkg.zzc()) {
            zzej.zzh = zzjz.zzbB(zzkg);
        }
        zzej.zzh.set(i10, zzel);
    }

    public final int zza() {
        return this.zzh.size();
    }

    public final int zzb() {
        return this.zzf;
    }

    public final zzel zze(int i10) {
        return this.zzh.get(i10);
    }

    public final zzeq zzf() {
        zzeq zzeq = this.zzj;
        return zzeq == null ? zzeq.zzb() : zzeq;
    }

    public final String zzg() {
        return this.zzg;
    }

    public final List<zzel> zzh() {
        return this.zzh;
    }

    public final boolean zzk() {
        return this.zzk;
    }

    /* access modifiers changed from: protected */
    public final Object zzl(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzjz.zzbF(zza, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u001b\u0004ဇ\u0002\u0005ဉ\u0003\u0006ဇ\u0004\u0007ဇ\u0005\bဇ\u0006", new Object[]{"zze", "zzf", "zzg", "zzh", zzel.class, "zzi", "zzj", "zzk", "zzl", "zzm"});
        } else if (i11 == 3) {
            return new zzej();
        } else {
            if (i11 == 4) {
                return new zzei((zzef) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zza;
        }
    }

    public final boolean zzm() {
        return this.zzl;
    }

    public final boolean zzn() {
        return this.zzm;
    }

    public final boolean zzo() {
        return (this.zze & 8) != 0;
    }

    public final boolean zzp() {
        return (this.zze & 1) != 0;
    }

    public final boolean zzq() {
        return (this.zze & 64) != 0;
    }
}
