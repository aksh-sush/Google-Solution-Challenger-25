package com.google.android.gms.internal.p002firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzabd  reason: invalid package */
final class zzabd<T> implements zzabl<T> {
    private final zzaaz zza;
    private final zzabz<?, ?> zzb;
    private final boolean zzc;
    private final zzzk<?> zzd;

    private zzabd(zzabz<?, ?> zzabz, zzzk<?> zzzk, zzaaz zzaaz) {
        this.zzb = zzabz;
        this.zzc = zzzk.zzh(zzaaz);
        this.zzd = zzzk;
        this.zza = zzaaz;
    }

    static <T> zzabd<T> zzc(zzabz<?, ?> zzabz, zzzk<?> zzzk, zzaaz zzaaz) {
        return new zzabd<>(zzabz, zzzk, zzaaz);
    }

    public final int zza(T t10) {
        zzabz<?, ?> zzabz = this.zzb;
        int zzb2 = zzabz.zzb(zzabz.zzd(t10));
        if (!this.zzc) {
            return zzb2;
        }
        this.zzd.zza(t10);
        throw null;
    }

    public final int zzb(T t10) {
        int hashCode = this.zzb.zzd(t10).hashCode();
        if (!this.zzc) {
            return hashCode;
        }
        this.zzd.zza(t10);
        throw null;
    }

    public final T zze() {
        return this.zza.zzB().zzm();
    }

    public final void zzf(T t10) {
        this.zzb.zzm(t10);
        this.zzd.zze(t10);
    }

    public final void zzg(T t10, T t11) {
        zzabn.zzF(this.zzb, t10, t11);
        if (this.zzc) {
            zzabn.zzE(this.zzd, t10, t11);
        }
    }

    public final void zzh(T t10, zzabk zzabk, zzzj zzzj) {
        boolean z10;
        zzabz<?, ?> zzabz = this.zzb;
        zzzk<?> zzzk = this.zzd;
        Object zzc2 = zzabz.zzc(t10);
        zzzo<?> zzb2 = zzzk.zzb(t10);
        while (zzabk.zzc() != Integer.MAX_VALUE) {
            int zzd2 = zzabk.zzd();
            if (zzd2 != 11) {
                if ((zzd2 & 7) == 2) {
                    Object zzc3 = zzzk.zzc(zzzj, this.zza, zzd2 >>> 3);
                    if (zzc3 != null) {
                        zzzk.zzf(zzabk, zzc3, zzzj, zzb2);
                    } else {
                        z10 = zzabz.zzp(zzc2, zzabk);
                    }
                } else {
                    z10 = zzabk.zzO();
                }
                if (!z10) {
                    zzabz.zzn(t10, zzc2);
                    return;
                }
            } else {
                Object obj = null;
                zzyu zzyu = null;
                int i10 = 0;
                while (true) {
                    try {
                        if (zzabk.zzc() == Integer.MAX_VALUE) {
                            break;
                        }
                        int zzd3 = zzabk.zzd();
                        if (zzd3 == 16) {
                            i10 = zzabk.zzj();
                            obj = zzzk.zzc(zzzj, this.zza, i10);
                        } else if (zzd3 == 26) {
                            if (obj != null) {
                                zzzk.zzf(zzabk, obj, zzzj, zzb2);
                            } else {
                                zzyu = zzabk.zzp();
                            }
                        } else if (!zzabk.zzO()) {
                            break;
                        }
                    } catch (Throwable th) {
                        zzabz.zzn(t10, zzc2);
                        throw th;
                    }
                }
                if (zzabk.zzd() != 12) {
                    throw zzaae.zzb();
                } else if (zzyu != null) {
                    if (obj != null) {
                        zzzk.zzg(zzyu, obj, zzzj, zzb2);
                    } else {
                        zzabz.zzk(zzc2, i10, zzyu);
                    }
                }
            }
        }
        zzabz.zzn(t10, zzc2);
    }

    public final void zzi(T t10, byte[] bArr, int i10, int i11, zzyh zzyh) {
        zzzw zzzw = (zzzw) t10;
        if (zzzw.zzc == zzaca.zzc()) {
            zzzw.zzc = zzaca.zze();
        }
        zzzt zzzt = (zzzt) t10;
        throw null;
    }

    public final boolean zzj(T t10, T t11) {
        if (!this.zzb.zzd(t10).equals(this.zzb.zzd(t11))) {
            return false;
        }
        if (!this.zzc) {
            return true;
        }
        this.zzd.zza(t10);
        this.zzd.zza(t11);
        throw null;
    }

    public final boolean zzk(T t10) {
        this.zzd.zza(t10);
        throw null;
    }

    public final void zzn(T t10, zzzf zzzf) {
        this.zzd.zza(t10);
        throw null;
    }
}
