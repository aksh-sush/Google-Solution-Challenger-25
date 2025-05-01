package com.google.android.gms.internal.measurement;

import java.util.List;

public final class zzfc extends zzjz<zzfc, zzfb> implements zzlh {
    /* access modifiers changed from: private */
    public static final zzfc zza;
    private int zze;
    private long zzf;
    private String zzg = "";
    private int zzh;
    private zzkg<zzfe> zzi = zzjz.zzbA();
    private zzkg<zzfa> zzj = zzjz.zzbA();
    /* access modifiers changed from: private */
    public zzkg<zzeh> zzk = zzjz.zzbA();
    private String zzl = "";
    private boolean zzm;
    private zzkg<zzgo> zzn = zzjz.zzbA();

    static {
        zzfc zzfc = new zzfc();
        zza = zzfc;
        zzjz.zzbG(zzfc.class, zzfc);
    }

    private zzfc() {
    }

    public static zzfb zze() {
        return (zzfb) zza.zzbu();
    }

    public static zzfc zzg() {
        return zza;
    }

    static /* synthetic */ void zzm(zzfc zzfc, int i10, zzfa zzfa) {
        zzfa.getClass();
        zzkg<zzfa> zzkg = zzfc.zzj;
        if (!zzkg.zzc()) {
            zzfc.zzj = zzjz.zzbB(zzkg);
        }
        zzfc.zzj.set(i10, zzfa);
    }

    public final int zza() {
        return this.zzn.size();
    }

    public final int zzb() {
        return this.zzj.size();
    }

    public final long zzc() {
        return this.zzf;
    }

    public final zzfa zzd(int i10) {
        return this.zzj.get(i10);
    }

    public final String zzh() {
        return this.zzg;
    }

    public final List<zzeh> zzi() {
        return this.zzk;
    }

    public final List<zzgo> zzj() {
        return this.zzn;
    }

    public final List<zzfe> zzk() {
        return this.zzi;
    }

    /* access modifiers changed from: protected */
    public final Object zzl(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzjz.zzbF(zza, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0004\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004\u001b\u0005\u001b\u0006\u001b\u0007ဈ\u0003\bဇ\u0004\t\u001b", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", zzfe.class, "zzj", zzfa.class, "zzk", zzeh.class, "zzl", "zzm", "zzn", zzgo.class});
        } else if (i11 == 3) {
            return new zzfc();
        } else {
            if (i11 == 4) {
                return new zzfb((zzey) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zza;
        }
    }

    public final boolean zzo() {
        return this.zzm;
    }

    public final boolean zzp() {
        return (this.zze & 2) != 0;
    }

    public final boolean zzq() {
        return (this.zze & 1) != 0;
    }
}
