package com.google.android.gms.internal.measurement;

final class zzlk<T> implements zzlr<T> {
    private final zzlg zza;
    private final zzmi<?, ?> zzb;
    private final boolean zzc;
    private final zzjm<?> zzd;

    private zzlk(zzmi<?, ?> zzmi, zzjm<?> zzjm, zzlg zzlg) {
        this.zzb = zzmi;
        this.zzc = zzjm.zzc(zzlg);
        this.zzd = zzjm;
        this.zza = zzlg;
    }

    static <T> zzlk<T> zzc(zzmi<?, ?> zzmi, zzjm<?> zzjm, zzlg zzlg) {
        return new zzlk<>(zzmi, zzjm, zzlg);
    }

    public final int zza(T t10) {
        zzmi<?, ?> zzmi = this.zzb;
        int zzb2 = zzmi.zzb(zzmi.zzc(t10));
        if (!this.zzc) {
            return zzb2;
        }
        this.zzd.zza(t10);
        throw null;
    }

    public final int zzb(T t10) {
        int hashCode = this.zzb.zzc(t10).hashCode();
        if (!this.zzc) {
            return hashCode;
        }
        this.zzd.zza(t10);
        throw null;
    }

    public final T zze() {
        return this.zza.zzbC().zzaC();
    }

    public final void zzf(T t10) {
        this.zzb.zzg(t10);
        this.zzd.zzb(t10);
    }

    public final void zzg(T t10, T t11) {
        zzlt.zzF(this.zzb, t10, t11);
        if (this.zzc) {
            zzlt.zzE(this.zzd, t10, t11);
        }
    }

    public final void zzh(T t10, byte[] bArr, int i10, int i11, zzik zzik) {
        zzjz zzjz = (zzjz) t10;
        if (zzjz.zzc == zzmj.zzc()) {
            zzjz.zzc = zzmj.zze();
        }
        zzjw zzjw = (zzjw) t10;
        throw null;
    }

    public final boolean zzi(T t10, T t11) {
        if (!this.zzb.zzc(t10).equals(this.zzb.zzc(t11))) {
            return false;
        }
        if (!this.zzc) {
            return true;
        }
        this.zzd.zza(t10);
        this.zzd.zza(t11);
        throw null;
    }

    public final boolean zzj(T t10) {
        this.zzd.zza(t10);
        throw null;
    }

    public final void zzm(T t10, zzjh zzjh) {
        this.zzd.zza(t10);
        throw null;
    }
}
