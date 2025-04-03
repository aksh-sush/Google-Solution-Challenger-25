package com.google.android.gms.internal.measurement;

import java.util.List;

public final class zzfo extends zzjz<zzfo, zzfn> implements zzlh {
    /* access modifiers changed from: private */
    public static final zzfo zza;
    private int zze;
    /* access modifiers changed from: private */
    public zzkg<zzfs> zzf = zzjz.zzbA();
    private String zzg = "";
    private long zzh;
    private long zzi;
    private int zzj;

    static {
        zzfo zzfo = new zzfo();
        zza = zzfo;
        zzjz.zzbG(zzfo.class, zzfo);
    }

    private zzfo() {
    }

    public static zzfn zze() {
        return (zzfn) zza.zzbu();
    }

    static /* synthetic */ void zzj(zzfo zzfo, int i10, zzfs zzfs) {
        zzfs.getClass();
        zzfo.zzv();
        zzfo.zzf.set(i10, zzfs);
    }

    static /* synthetic */ void zzk(zzfo zzfo, zzfs zzfs) {
        zzfs.getClass();
        zzfo.zzv();
        zzfo.zzf.add(zzfs);
    }

    static /* synthetic */ void zzm(zzfo zzfo, Iterable iterable) {
        zzfo.zzv();
        zzih.zzbq(iterable, zzfo.zzf);
    }

    static /* synthetic */ void zzo(zzfo zzfo, int i10) {
        zzfo.zzv();
        zzfo.zzf.remove(i10);
    }

    static /* synthetic */ void zzp(zzfo zzfo, String str) {
        str.getClass();
        zzfo.zze |= 1;
        zzfo.zzg = str;
    }

    static /* synthetic */ void zzq(zzfo zzfo, long j10) {
        zzfo.zze |= 2;
        zzfo.zzh = j10;
    }

    static /* synthetic */ void zzr(zzfo zzfo, long j10) {
        zzfo.zze |= 4;
        zzfo.zzi = j10;
    }

    private final void zzv() {
        zzkg<zzfs> zzkg = this.zzf;
        if (!zzkg.zzc()) {
            this.zzf = zzjz.zzbB(zzkg);
        }
    }

    public final int zza() {
        return this.zzj;
    }

    public final int zzb() {
        return this.zzf.size();
    }

    public final long zzc() {
        return this.zzi;
    }

    public final long zzd() {
        return this.zzh;
    }

    public final zzfs zzg(int i10) {
        return this.zzf.get(i10);
    }

    public final String zzh() {
        return this.zzg;
    }

    public final List<zzfs> zzi() {
        return this.zzf;
    }

    /* access modifiers changed from: protected */
    public final Object zzl(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzjz.zzbF(zza, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဂ\u0001\u0004ဂ\u0002\u0005င\u0003", new Object[]{"zze", "zzf", zzfs.class, "zzg", "zzh", "zzi", "zzj"});
        } else if (i11 == 3) {
            return new zzfo();
        } else {
            if (i11 == 4) {
                return new zzfn((zzff) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zza;
        }
    }

    public final boolean zzs() {
        return (this.zze & 8) != 0;
    }

    public final boolean zzt() {
        return (this.zze & 4) != 0;
    }

    public final boolean zzu() {
        return (this.zze & 2) != 0;
    }
}
