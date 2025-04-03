package com.google.android.gms.internal.measurement;

import java.util.List;

public final class zzfs extends zzjz<zzfs, zzfr> implements zzlh {
    /* access modifiers changed from: private */
    public static final zzfs zza;
    private int zze;
    private String zzf = "";
    private String zzg = "";
    private long zzh;
    private float zzi;
    private double zzj;
    /* access modifiers changed from: private */
    public zzkg<zzfs> zzk = zzjz.zzbA();

    static {
        zzfs zzfs = new zzfs();
        zza = zzfs;
        zzjz.zzbG(zzfs.class, zzfs);
    }

    private zzfs() {
    }

    public static zzfr zze() {
        return (zzfr) zza.zzbu();
    }

    static /* synthetic */ void zzj(zzfs zzfs, String str) {
        str.getClass();
        zzfs.zze |= 1;
        zzfs.zzf = str;
    }

    static /* synthetic */ void zzk(zzfs zzfs, String str) {
        str.getClass();
        zzfs.zze |= 2;
        zzfs.zzg = str;
    }

    static /* synthetic */ void zzm(zzfs zzfs) {
        zzfs.zze &= -3;
        zzfs.zzg = zza.zzg;
    }

    static /* synthetic */ void zzn(zzfs zzfs, long j10) {
        zzfs.zze |= 4;
        zzfs.zzh = j10;
    }

    static /* synthetic */ void zzo(zzfs zzfs) {
        zzfs.zze &= -5;
        zzfs.zzh = 0;
    }

    static /* synthetic */ void zzp(zzfs zzfs, double d10) {
        zzfs.zze |= 16;
        zzfs.zzj = d10;
    }

    static /* synthetic */ void zzq(zzfs zzfs) {
        zzfs.zze &= -17;
        zzfs.zzj = 0.0d;
    }

    static /* synthetic */ void zzr(zzfs zzfs, zzfs zzfs2) {
        zzfs2.getClass();
        zzfs.zzz();
        zzfs.zzk.add(zzfs2);
    }

    static /* synthetic */ void zzs(zzfs zzfs, Iterable iterable) {
        zzfs.zzz();
        zzih.zzbq(iterable, zzfs.zzk);
    }

    private final void zzz() {
        zzkg<zzfs> zzkg = this.zzk;
        if (!zzkg.zzc()) {
            this.zzk = zzjz.zzbB(zzkg);
        }
    }

    public final double zza() {
        return this.zzj;
    }

    public final float zzb() {
        return this.zzi;
    }

    public final int zzc() {
        return this.zzk.size();
    }

    public final long zzd() {
        return this.zzh;
    }

    public final String zzg() {
        return this.zzf;
    }

    public final String zzh() {
        return this.zzg;
    }

    public final List<zzfs> zzi() {
        return this.zzk;
    }

    /* access modifiers changed from: protected */
    public final Object zzl(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzjz.zzbF(zza, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ခ\u0003\u0005က\u0004\u0006\u001b", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", zzfs.class});
        } else if (i11 == 3) {
            return new zzfs();
        } else {
            if (i11 == 4) {
                return new zzfr((zzff) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zza;
        }
    }

    public final boolean zzu() {
        return (this.zze & 16) != 0;
    }

    public final boolean zzv() {
        return (this.zze & 8) != 0;
    }

    public final boolean zzw() {
        return (this.zze & 4) != 0;
    }

    public final boolean zzx() {
        return (this.zze & 1) != 0;
    }

    public final boolean zzy() {
        return (this.zze & 2) != 0;
    }
}
