package com.google.android.gms.internal.measurement;

import java.util.List;

public final class zzgd extends zzjz<zzgd, zzgc> implements zzlh {
    /* access modifiers changed from: private */
    public static final zzgd zza;
    /* access modifiers changed from: private */
    public zzkf zze = zzjz.zzby();
    /* access modifiers changed from: private */
    public zzkf zzf = zzjz.zzby();
    private zzkg<zzfm> zzg = zzjz.zzbA();
    private zzkg<zzgf> zzh = zzjz.zzbA();

    static {
        zzgd zzgd = new zzgd();
        zza = zzgd;
        zzjz.zzbG(zzgd.class, zzgd);
    }

    private zzgd() {
    }

    public static zzgc zzf() {
        return (zzgc) zza.zzbu();
    }

    public static zzgd zzh() {
        return zza;
    }

    static /* synthetic */ void zzo(zzgd zzgd, Iterable iterable) {
        zzkf zzkf = zzgd.zze;
        if (!zzkf.zzc()) {
            zzgd.zze = zzjz.zzbz(zzkf);
        }
        zzih.zzbq(iterable, zzgd.zze);
    }

    static /* synthetic */ void zzq(zzgd zzgd, Iterable iterable) {
        zzkf zzkf = zzgd.zzf;
        if (!zzkf.zzc()) {
            zzgd.zzf = zzjz.zzbz(zzkf);
        }
        zzih.zzbq(iterable, zzgd.zzf);
    }

    static /* synthetic */ void zzs(zzgd zzgd, Iterable iterable) {
        zzgd.zzw();
        zzih.zzbq(iterable, zzgd.zzg);
    }

    static /* synthetic */ void zzt(zzgd zzgd, int i10) {
        zzgd.zzw();
        zzgd.zzg.remove(i10);
    }

    static /* synthetic */ void zzu(zzgd zzgd, Iterable iterable) {
        zzgd.zzx();
        zzih.zzbq(iterable, zzgd.zzh);
    }

    static /* synthetic */ void zzv(zzgd zzgd, int i10) {
        zzgd.zzx();
        zzgd.zzh.remove(i10);
    }

    private final void zzw() {
        zzkg<zzfm> zzkg = this.zzg;
        if (!zzkg.zzc()) {
            this.zzg = zzjz.zzbB(zzkg);
        }
    }

    private final void zzx() {
        zzkg<zzgf> zzkg = this.zzh;
        if (!zzkg.zzc()) {
            this.zzh = zzjz.zzbB(zzkg);
        }
    }

    public final int zza() {
        return this.zzg.size();
    }

    public final int zzb() {
        return this.zzf.size();
    }

    public final int zzc() {
        return this.zzh.size();
    }

    public final int zzd() {
        return this.zze.size();
    }

    public final zzfm zze(int i10) {
        return this.zzg.get(i10);
    }

    public final zzgf zzi(int i10) {
        return this.zzh.get(i10);
    }

    public final List<zzfm> zzj() {
        return this.zzg;
    }

    public final List<Long> zzk() {
        return this.zzf;
    }

    /* access modifiers changed from: protected */
    public final Object zzl(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzjz.zzbF(zza, "\u0001\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u0015\u0002\u0015\u0003\u001b\u0004\u001b", new Object[]{"zze", "zzf", "zzg", zzfm.class, "zzh", zzgf.class});
        } else if (i11 == 3) {
            return new zzgd();
        } else {
            if (i11 == 4) {
                return new zzgc((zzff) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zza;
        }
    }

    public final List<zzgf> zzm() {
        return this.zzh;
    }

    public final List<Long> zzn() {
        return this.zze;
    }
}
