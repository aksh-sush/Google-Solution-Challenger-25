package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.api.a;
import java.util.List;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzyy  reason: invalid package */
final class zzyy implements zzabk {
    private final zzyx zza;
    private int zzb;
    private int zzc;
    private int zzd = 0;

    private zzyy(zzyx zzyx) {
        zzaac.zzf(zzyx, "input");
        this.zza = zzyx;
        zzyx.zzb = this;
    }

    private final <T> T zzP(zzabl<T> zzabl, zzzj zzzj) {
        int i10 = this.zzc;
        this.zzc = ((this.zzb >>> 3) << 3) | 4;
        try {
            T zze = zzabl.zze();
            zzabl.zzh(zze, this, zzzj);
            zzabl.zzf(zze);
            if (this.zzb == this.zzc) {
                return zze;
            }
            throw zzaae.zzg();
        } finally {
            this.zzc = i10;
        }
    }

    private final <T> T zzQ(zzabl<T> zzabl, zzzj zzzj) {
        int zze = ((zzyw) this.zza).zze();
        zzyx zzyx = this.zza;
        if (zzyx.zza < 100) {
            int zzc2 = zzyx.zzc(zze);
            T zze2 = zzabl.zze();
            this.zza.zza++;
            zzabl.zzh(zze2, this, zzzj);
            zzabl.zzf(zze2);
            this.zza.zzm(0);
            zzyx zzyx2 = this.zza;
            zzyx2.zza--;
            zzyx2.zzn(zzc2);
            return zze2;
        }
        throw new zzaae("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    private final void zzR(int i10) {
        if (this.zza.zzb() != i10) {
            throw zzaae.zzi();
        }
    }

    private final void zzS(int i10) {
        if ((this.zzb & 7) != i10) {
            throw zzaae.zza();
        }
    }

    private static final void zzT(int i10) {
        if ((i10 & 3) != 0) {
            throw zzaae.zzg();
        }
    }

    private static final void zzU(int i10) {
        if ((i10 & 7) != 0) {
            throw zzaae.zzg();
        }
    }

    public static zzyy zzq(zzyx zzyx) {
        zzyy zzyy = zzyx.zzb;
        return zzyy != null ? zzyy : new zzyy(zzyx);
    }

    public final void zzA(List<Long> list) {
        int zzf;
        int zzf2;
        if (list instanceof zzaao) {
            zzaao zzaao = (zzaao) list;
            int i10 = this.zzb & 7;
            if (i10 == 1) {
                do {
                    zzaao.zzf(((zzyw) this.zza).zzg());
                    if (!this.zza.zzp()) {
                        zzf2 = this.zza.zzf();
                    } else {
                        return;
                    }
                } while (zzf2 == this.zzb);
                this.zzd = zzf2;
            } else if (i10 == 2) {
                int zze = ((zzyw) this.zza).zze();
                zzU(zze);
                int zzb2 = this.zza.zzb() + zze;
                do {
                    zzaao.zzf(((zzyw) this.zza).zzg());
                } while (this.zza.zzb() < zzb2);
            } else {
                throw zzaae.zza();
            }
        } else {
            int i11 = this.zzb & 7;
            if (i11 == 1) {
                do {
                    list.add(Long.valueOf(((zzyw) this.zza).zzg()));
                    if (!this.zza.zzp()) {
                        zzf = this.zza.zzf();
                    } else {
                        return;
                    }
                } while (zzf == this.zzb);
                this.zzd = zzf;
            } else if (i11 == 2) {
                int zze2 = ((zzyw) this.zza).zze();
                zzU(zze2);
                int zzb3 = this.zza.zzb() + zze2;
                do {
                    list.add(Long.valueOf(((zzyw) this.zza).zzg()));
                } while (this.zza.zzb() < zzb3);
            } else {
                throw zzaae.zza();
            }
        }
    }

    public final void zzB(List<Float> list) {
        int zzf;
        int zzf2;
        if (list instanceof zzzq) {
            zzzq zzzq = (zzzq) list;
            int i10 = this.zzb & 7;
            if (i10 == 2) {
                int zze = ((zzyw) this.zza).zze();
                zzT(zze);
                int zzb2 = this.zza.zzb() + zze;
                do {
                    zzzq.zze(Float.intBitsToFloat(((zzyw) this.zza).zzd()));
                } while (this.zza.zzb() < zzb2);
            } else if (i10 == 5) {
                do {
                    zzzq.zze(Float.intBitsToFloat(((zzyw) this.zza).zzd()));
                    if (!this.zza.zzp()) {
                        zzf2 = this.zza.zzf();
                    } else {
                        return;
                    }
                } while (zzf2 == this.zzb);
                this.zzd = zzf2;
            } else {
                throw zzaae.zza();
            }
        } else {
            int i11 = this.zzb & 7;
            if (i11 == 2) {
                int zze2 = ((zzyw) this.zza).zze();
                zzT(zze2);
                int zzb3 = this.zza.zzb() + zze2;
                do {
                    list.add(Float.valueOf(Float.intBitsToFloat(((zzyw) this.zza).zzd())));
                } while (this.zza.zzb() < zzb3);
            } else if (i11 == 5) {
                do {
                    list.add(Float.valueOf(Float.intBitsToFloat(((zzyw) this.zza).zzd())));
                    if (!this.zza.zzp()) {
                        zzf = this.zza.zzf();
                    } else {
                        return;
                    }
                } while (zzf == this.zzb);
                this.zzd = zzf;
            } else {
                throw zzaae.zza();
            }
        }
    }

    public final <T> void zzC(List<T> list, zzabl<T> zzabl, zzzj zzzj) {
        int zzf;
        int i10 = this.zzb;
        if ((i10 & 7) == 3) {
            do {
                list.add(zzP(zzabl, zzzj));
                if (!this.zza.zzp() && this.zzd == 0) {
                    zzf = this.zza.zzf();
                } else {
                    return;
                }
            } while (zzf == i10);
            this.zzd = zzf;
            return;
        }
        throw zzaae.zza();
    }

    public final void zzD(List<Integer> list) {
        int zzf;
        int zzf2;
        if (list instanceof zzzx) {
            zzzx zzzx = (zzzx) list;
            int i10 = this.zzb & 7;
            if (i10 == 0) {
                do {
                    zzzx.zzf(((zzyw) this.zza).zze());
                    if (!this.zza.zzp()) {
                        zzf2 = this.zza.zzf();
                    } else {
                        return;
                    }
                } while (zzf2 == this.zzb);
                this.zzd = zzf2;
            } else if (i10 == 2) {
                int zzb2 = this.zza.zzb() + ((zzyw) this.zza).zze();
                do {
                    zzzx.zzf(((zzyw) this.zza).zze());
                } while (this.zza.zzb() < zzb2);
                zzR(zzb2);
            } else {
                throw zzaae.zza();
            }
        } else {
            int i11 = this.zzb & 7;
            if (i11 == 0) {
                do {
                    list.add(Integer.valueOf(((zzyw) this.zza).zze()));
                    if (!this.zza.zzp()) {
                        zzf = this.zza.zzf();
                    } else {
                        return;
                    }
                } while (zzf == this.zzb);
                this.zzd = zzf;
            } else if (i11 == 2) {
                int zzb3 = this.zza.zzb() + ((zzyw) this.zza).zze();
                do {
                    list.add(Integer.valueOf(((zzyw) this.zza).zze()));
                } while (this.zza.zzb() < zzb3);
                zzR(zzb3);
            } else {
                throw zzaae.zza();
            }
        }
    }

    public final void zzE(List<Long> list) {
        int zzf;
        int zzf2;
        if (list instanceof zzaao) {
            zzaao zzaao = (zzaao) list;
            int i10 = this.zzb & 7;
            if (i10 == 0) {
                do {
                    zzaao.zzf(((zzyw) this.zza).zzh());
                    if (!this.zza.zzp()) {
                        zzf2 = this.zza.zzf();
                    } else {
                        return;
                    }
                } while (zzf2 == this.zzb);
                this.zzd = zzf2;
            } else if (i10 == 2) {
                int zzb2 = this.zza.zzb() + ((zzyw) this.zza).zze();
                do {
                    zzaao.zzf(((zzyw) this.zza).zzh());
                } while (this.zza.zzb() < zzb2);
                zzR(zzb2);
            } else {
                throw zzaae.zza();
            }
        } else {
            int i11 = this.zzb & 7;
            if (i11 == 0) {
                do {
                    list.add(Long.valueOf(((zzyw) this.zza).zzh()));
                    if (!this.zza.zzp()) {
                        zzf = this.zza.zzf();
                    } else {
                        return;
                    }
                } while (zzf == this.zzb);
                this.zzd = zzf;
            } else if (i11 == 2) {
                int zzb3 = this.zza.zzb() + ((zzyw) this.zza).zze();
                do {
                    list.add(Long.valueOf(((zzyw) this.zza).zzh()));
                } while (this.zza.zzb() < zzb3);
                zzR(zzb3);
            } else {
                throw zzaae.zza();
            }
        }
    }

    public final <T> void zzF(List<T> list, zzabl<T> zzabl, zzzj zzzj) {
        int zzf;
        int i10 = this.zzb;
        if ((i10 & 7) == 2) {
            do {
                list.add(zzQ(zzabl, zzzj));
                if (!this.zza.zzp() && this.zzd == 0) {
                    zzf = this.zza.zzf();
                } else {
                    return;
                }
            } while (zzf == i10);
            this.zzd = zzf;
            return;
        }
        throw zzaae.zza();
    }

    public final void zzG(List<Integer> list) {
        int zzf;
        int zzf2;
        if (list instanceof zzzx) {
            zzzx zzzx = (zzzx) list;
            int i10 = this.zzb & 7;
            if (i10 == 2) {
                int zze = ((zzyw) this.zza).zze();
                zzT(zze);
                int zzb2 = this.zza.zzb() + zze;
                do {
                    zzzx.zzf(((zzyw) this.zza).zzd());
                } while (this.zza.zzb() < zzb2);
            } else if (i10 == 5) {
                do {
                    zzzx.zzf(((zzyw) this.zza).zzd());
                    if (!this.zza.zzp()) {
                        zzf2 = this.zza.zzf();
                    } else {
                        return;
                    }
                } while (zzf2 == this.zzb);
                this.zzd = zzf2;
            } else {
                throw zzaae.zza();
            }
        } else {
            int i11 = this.zzb & 7;
            if (i11 == 2) {
                int zze2 = ((zzyw) this.zza).zze();
                zzT(zze2);
                int zzb3 = this.zza.zzb() + zze2;
                do {
                    list.add(Integer.valueOf(((zzyw) this.zza).zzd()));
                } while (this.zza.zzb() < zzb3);
            } else if (i11 == 5) {
                do {
                    list.add(Integer.valueOf(((zzyw) this.zza).zzd()));
                    if (!this.zza.zzp()) {
                        zzf = this.zza.zzf();
                    } else {
                        return;
                    }
                } while (zzf == this.zzb);
                this.zzd = zzf;
            } else {
                throw zzaae.zza();
            }
        }
    }

    public final void zzH(List<Long> list) {
        int zzf;
        int zzf2;
        if (list instanceof zzaao) {
            zzaao zzaao = (zzaao) list;
            int i10 = this.zzb & 7;
            if (i10 == 1) {
                do {
                    zzaao.zzf(((zzyw) this.zza).zzg());
                    if (!this.zza.zzp()) {
                        zzf2 = this.zza.zzf();
                    } else {
                        return;
                    }
                } while (zzf2 == this.zzb);
                this.zzd = zzf2;
            } else if (i10 == 2) {
                int zze = ((zzyw) this.zza).zze();
                zzU(zze);
                int zzb2 = this.zza.zzb() + zze;
                do {
                    zzaao.zzf(((zzyw) this.zza).zzg());
                } while (this.zza.zzb() < zzb2);
            } else {
                throw zzaae.zza();
            }
        } else {
            int i11 = this.zzb & 7;
            if (i11 == 1) {
                do {
                    list.add(Long.valueOf(((zzyw) this.zza).zzg()));
                    if (!this.zza.zzp()) {
                        zzf = this.zza.zzf();
                    } else {
                        return;
                    }
                } while (zzf == this.zzb);
                this.zzd = zzf;
            } else if (i11 == 2) {
                int zze2 = ((zzyw) this.zza).zze();
                zzU(zze2);
                int zzb3 = this.zza.zzb() + zze2;
                do {
                    list.add(Long.valueOf(((zzyw) this.zza).zzg()));
                } while (this.zza.zzb() < zzb3);
            } else {
                throw zzaae.zza();
            }
        }
    }

    public final void zzI(List<Integer> list) {
        int zzf;
        int zzf2;
        if (list instanceof zzzx) {
            zzzx zzzx = (zzzx) list;
            int i10 = this.zzb & 7;
            if (i10 == 0) {
                do {
                    zzzx.zzf(zzyx.zzs(((zzyw) this.zza).zze()));
                    if (!this.zza.zzp()) {
                        zzf2 = this.zza.zzf();
                    } else {
                        return;
                    }
                } while (zzf2 == this.zzb);
                this.zzd = zzf2;
            } else if (i10 == 2) {
                int zzb2 = this.zza.zzb() + ((zzyw) this.zza).zze();
                do {
                    zzzx.zzf(zzyx.zzs(((zzyw) this.zza).zze()));
                } while (this.zza.zzb() < zzb2);
                zzR(zzb2);
            } else {
                throw zzaae.zza();
            }
        } else {
            int i11 = this.zzb & 7;
            if (i11 == 0) {
                do {
                    list.add(Integer.valueOf(zzyx.zzs(((zzyw) this.zza).zze())));
                    if (!this.zza.zzp()) {
                        zzf = this.zza.zzf();
                    } else {
                        return;
                    }
                } while (zzf == this.zzb);
                this.zzd = zzf;
            } else if (i11 == 2) {
                int zzb3 = this.zza.zzb() + ((zzyw) this.zza).zze();
                do {
                    list.add(Integer.valueOf(zzyx.zzs(((zzyw) this.zza).zze())));
                } while (this.zza.zzb() < zzb3);
                zzR(zzb3);
            } else {
                throw zzaae.zza();
            }
        }
    }

    public final void zzJ(List<Long> list) {
        int zzf;
        int zzf2;
        if (list instanceof zzaao) {
            zzaao zzaao = (zzaao) list;
            int i10 = this.zzb & 7;
            if (i10 == 0) {
                do {
                    zzaao.zzf(zzyx.zzt(((zzyw) this.zza).zzh()));
                    if (!this.zza.zzp()) {
                        zzf2 = this.zza.zzf();
                    } else {
                        return;
                    }
                } while (zzf2 == this.zzb);
                this.zzd = zzf2;
            } else if (i10 == 2) {
                int zzb2 = this.zza.zzb() + ((zzyw) this.zza).zze();
                do {
                    zzaao.zzf(zzyx.zzt(((zzyw) this.zza).zzh()));
                } while (this.zza.zzb() < zzb2);
                zzR(zzb2);
            } else {
                throw zzaae.zza();
            }
        } else {
            int i11 = this.zzb & 7;
            if (i11 == 0) {
                do {
                    list.add(Long.valueOf(zzyx.zzt(((zzyw) this.zza).zzh())));
                    if (!this.zza.zzp()) {
                        zzf = this.zza.zzf();
                    } else {
                        return;
                    }
                } while (zzf == this.zzb);
                this.zzd = zzf;
            } else if (i11 == 2) {
                int zzb3 = this.zza.zzb() + ((zzyw) this.zza).zze();
                do {
                    list.add(Long.valueOf(zzyx.zzt(((zzyw) this.zza).zzh())));
                } while (this.zza.zzb() < zzb3);
                zzR(zzb3);
            } else {
                throw zzaae.zza();
            }
        }
    }

    public final void zzK(List<String> list, boolean z10) {
        int zzf;
        int zzf2;
        if ((this.zzb & 7) != 2) {
            throw zzaae.zza();
        } else if ((list instanceof zzaaj) && !z10) {
            zzaaj zzaaj = (zzaaj) list;
            do {
                zzaaj.zzi(zzp());
                if (!this.zza.zzp()) {
                    zzf2 = this.zza.zzf();
                } else {
                    return;
                }
            } while (zzf2 == this.zzb);
            this.zzd = zzf2;
        } else {
            do {
                list.add(z10 ? zzu() : zzt());
                if (!this.zza.zzp()) {
                    zzf = this.zza.zzf();
                } else {
                    return;
                }
            } while (zzf == this.zzb);
            this.zzd = zzf;
        }
    }

    public final void zzL(List<Integer> list) {
        int zzf;
        int zzf2;
        if (list instanceof zzzx) {
            zzzx zzzx = (zzzx) list;
            int i10 = this.zzb & 7;
            if (i10 == 0) {
                do {
                    zzzx.zzf(((zzyw) this.zza).zze());
                    if (!this.zza.zzp()) {
                        zzf2 = this.zza.zzf();
                    } else {
                        return;
                    }
                } while (zzf2 == this.zzb);
                this.zzd = zzf2;
            } else if (i10 == 2) {
                int zzb2 = this.zza.zzb() + ((zzyw) this.zza).zze();
                do {
                    zzzx.zzf(((zzyw) this.zza).zze());
                } while (this.zza.zzb() < zzb2);
                zzR(zzb2);
            } else {
                throw zzaae.zza();
            }
        } else {
            int i11 = this.zzb & 7;
            if (i11 == 0) {
                do {
                    list.add(Integer.valueOf(((zzyw) this.zza).zze()));
                    if (!this.zza.zzp()) {
                        zzf = this.zza.zzf();
                    } else {
                        return;
                    }
                } while (zzf == this.zzb);
                this.zzd = zzf;
            } else if (i11 == 2) {
                int zzb3 = this.zza.zzb() + ((zzyw) this.zza).zze();
                do {
                    list.add(Integer.valueOf(((zzyw) this.zza).zze()));
                } while (this.zza.zzb() < zzb3);
                zzR(zzb3);
            } else {
                throw zzaae.zza();
            }
        }
    }

    public final void zzM(List<Long> list) {
        int zzf;
        int zzf2;
        if (list instanceof zzaao) {
            zzaao zzaao = (zzaao) list;
            int i10 = this.zzb & 7;
            if (i10 == 0) {
                do {
                    zzaao.zzf(((zzyw) this.zza).zzh());
                    if (!this.zza.zzp()) {
                        zzf2 = this.zza.zzf();
                    } else {
                        return;
                    }
                } while (zzf2 == this.zzb);
                this.zzd = zzf2;
            } else if (i10 == 2) {
                int zzb2 = this.zza.zzb() + ((zzyw) this.zza).zze();
                do {
                    zzaao.zzf(((zzyw) this.zza).zzh());
                } while (this.zza.zzb() < zzb2);
                zzR(zzb2);
            } else {
                throw zzaae.zza();
            }
        } else {
            int i11 = this.zzb & 7;
            if (i11 == 0) {
                do {
                    list.add(Long.valueOf(((zzyw) this.zza).zzh()));
                    if (!this.zza.zzp()) {
                        zzf = this.zza.zzf();
                    } else {
                        return;
                    }
                } while (zzf == this.zzb);
                this.zzd = zzf;
            } else if (i11 == 2) {
                int zzb3 = this.zza.zzb() + ((zzyw) this.zza).zze();
                do {
                    list.add(Long.valueOf(((zzyw) this.zza).zzh()));
                } while (this.zza.zzb() < zzb3);
                zzR(zzb3);
            } else {
                throw zzaae.zza();
            }
        }
    }

    public final boolean zzN() {
        zzS(0);
        return this.zza.zzq();
    }

    public final boolean zzO() {
        int i10;
        if (this.zza.zzp() || (i10 = this.zzb) == this.zzc) {
            return false;
        }
        return this.zza.zzr(i10);
    }

    public final double zza() {
        zzS(1);
        return Double.longBitsToDouble(((zzyw) this.zza).zzg());
    }

    public final float zzb() {
        zzS(5);
        return Float.intBitsToFloat(((zzyw) this.zza).zzd());
    }

    public final int zzc() {
        int i10 = this.zzd;
        if (i10 != 0) {
            this.zzb = i10;
            this.zzd = 0;
        } else {
            i10 = this.zza.zzf();
            this.zzb = i10;
        }
        return (i10 == 0 || i10 == this.zzc) ? a.e.API_PRIORITY_OTHER : i10 >>> 3;
    }

    public final int zzd() {
        return this.zzb;
    }

    public final int zze() {
        zzS(0);
        return ((zzyw) this.zza).zze();
    }

    public final int zzf() {
        zzS(5);
        return ((zzyw) this.zza).zzd();
    }

    public final int zzg() {
        zzS(0);
        return ((zzyw) this.zza).zze();
    }

    public final int zzh() {
        zzS(5);
        return ((zzyw) this.zza).zzd();
    }

    public final int zzi() {
        zzS(0);
        return zzyx.zzs(((zzyw) this.zza).zze());
    }

    public final int zzj() {
        zzS(0);
        return ((zzyw) this.zza).zze();
    }

    public final long zzk() {
        zzS(1);
        return ((zzyw) this.zza).zzg();
    }

    public final long zzl() {
        zzS(0);
        return ((zzyw) this.zza).zzh();
    }

    public final long zzm() {
        zzS(1);
        return ((zzyw) this.zza).zzg();
    }

    public final long zzn() {
        zzS(0);
        return zzyx.zzt(((zzyw) this.zza).zzh());
    }

    public final long zzo() {
        zzS(0);
        return ((zzyw) this.zza).zzh();
    }

    public final zzyu zzp() {
        zzS(2);
        return this.zza.zzj();
    }

    public final <T> T zzr(zzabl<T> zzabl, zzzj zzzj) {
        zzS(3);
        return zzP(zzabl, zzzj);
    }

    public final <T> T zzs(zzabl<T> zzabl, zzzj zzzj) {
        zzS(2);
        return zzQ(zzabl, zzzj);
    }

    public final String zzt() {
        zzS(2);
        return this.zza.zzk();
    }

    public final String zzu() {
        zzS(2);
        return this.zza.zzl();
    }

    public final void zzv(List<Boolean> list) {
        int zzf;
        int zzf2;
        if (list instanceof zzyj) {
            zzyj zzyj = (zzyj) list;
            int i10 = this.zzb & 7;
            if (i10 == 0) {
                do {
                    zzyj.zze(this.zza.zzq());
                    if (!this.zza.zzp()) {
                        zzf2 = this.zza.zzf();
                    } else {
                        return;
                    }
                } while (zzf2 == this.zzb);
                this.zzd = zzf2;
            } else if (i10 == 2) {
                int zzb2 = this.zza.zzb() + ((zzyw) this.zza).zze();
                do {
                    zzyj.zze(this.zza.zzq());
                } while (this.zza.zzb() < zzb2);
                zzR(zzb2);
            } else {
                throw zzaae.zza();
            }
        } else {
            int i11 = this.zzb & 7;
            if (i11 == 0) {
                do {
                    list.add(Boolean.valueOf(this.zza.zzq()));
                    if (!this.zza.zzp()) {
                        zzf = this.zza.zzf();
                    } else {
                        return;
                    }
                } while (zzf == this.zzb);
                this.zzd = zzf;
            } else if (i11 == 2) {
                int zzb3 = this.zza.zzb() + ((zzyw) this.zza).zze();
                do {
                    list.add(Boolean.valueOf(this.zza.zzq()));
                } while (this.zza.zzb() < zzb3);
                zzR(zzb3);
            } else {
                throw zzaae.zza();
            }
        }
    }

    public final void zzw(List<zzyu> list) {
        int zzf;
        if ((this.zzb & 7) == 2) {
            do {
                list.add(zzp());
                if (!this.zza.zzp()) {
                    zzf = this.zza.zzf();
                } else {
                    return;
                }
            } while (zzf == this.zzb);
            this.zzd = zzf;
            return;
        }
        throw zzaae.zza();
    }

    public final void zzx(List<Double> list) {
        int zzf;
        int zzf2;
        if (list instanceof zzzg) {
            zzzg zzzg = (zzzg) list;
            int i10 = this.zzb & 7;
            if (i10 == 1) {
                do {
                    zzzg.zze(Double.longBitsToDouble(((zzyw) this.zza).zzg()));
                    if (!this.zza.zzp()) {
                        zzf2 = this.zza.zzf();
                    } else {
                        return;
                    }
                } while (zzf2 == this.zzb);
                this.zzd = zzf2;
            } else if (i10 == 2) {
                int zze = ((zzyw) this.zza).zze();
                zzU(zze);
                int zzb2 = this.zza.zzb() + zze;
                do {
                    zzzg.zze(Double.longBitsToDouble(((zzyw) this.zza).zzg()));
                } while (this.zza.zzb() < zzb2);
            } else {
                throw zzaae.zza();
            }
        } else {
            int i11 = this.zzb & 7;
            if (i11 == 1) {
                do {
                    list.add(Double.valueOf(Double.longBitsToDouble(((zzyw) this.zza).zzg())));
                    if (!this.zza.zzp()) {
                        zzf = this.zza.zzf();
                    } else {
                        return;
                    }
                } while (zzf == this.zzb);
                this.zzd = zzf;
            } else if (i11 == 2) {
                int zze2 = ((zzyw) this.zza).zze();
                zzU(zze2);
                int zzb3 = this.zza.zzb() + zze2;
                do {
                    list.add(Double.valueOf(Double.longBitsToDouble(((zzyw) this.zza).zzg())));
                } while (this.zza.zzb() < zzb3);
            } else {
                throw zzaae.zza();
            }
        }
    }

    public final void zzy(List<Integer> list) {
        int zzf;
        int zzf2;
        if (list instanceof zzzx) {
            zzzx zzzx = (zzzx) list;
            int i10 = this.zzb & 7;
            if (i10 == 0) {
                do {
                    zzzx.zzf(((zzyw) this.zza).zze());
                    if (!this.zza.zzp()) {
                        zzf2 = this.zza.zzf();
                    } else {
                        return;
                    }
                } while (zzf2 == this.zzb);
                this.zzd = zzf2;
            } else if (i10 == 2) {
                int zzb2 = this.zza.zzb() + ((zzyw) this.zza).zze();
                do {
                    zzzx.zzf(((zzyw) this.zza).zze());
                } while (this.zza.zzb() < zzb2);
                zzR(zzb2);
            } else {
                throw zzaae.zza();
            }
        } else {
            int i11 = this.zzb & 7;
            if (i11 == 0) {
                do {
                    list.add(Integer.valueOf(((zzyw) this.zza).zze()));
                    if (!this.zza.zzp()) {
                        zzf = this.zza.zzf();
                    } else {
                        return;
                    }
                } while (zzf == this.zzb);
                this.zzd = zzf;
            } else if (i11 == 2) {
                int zzb3 = this.zza.zzb() + ((zzyw) this.zza).zze();
                do {
                    list.add(Integer.valueOf(((zzyw) this.zza).zze()));
                } while (this.zza.zzb() < zzb3);
                zzR(zzb3);
            } else {
                throw zzaae.zza();
            }
        }
    }

    public final void zzz(List<Integer> list) {
        int zzf;
        int zzf2;
        if (list instanceof zzzx) {
            zzzx zzzx = (zzzx) list;
            int i10 = this.zzb & 7;
            if (i10 == 2) {
                int zze = ((zzyw) this.zza).zze();
                zzT(zze);
                int zzb2 = this.zza.zzb() + zze;
                do {
                    zzzx.zzf(((zzyw) this.zza).zzd());
                } while (this.zza.zzb() < zzb2);
            } else if (i10 == 5) {
                do {
                    zzzx.zzf(((zzyw) this.zza).zzd());
                    if (!this.zza.zzp()) {
                        zzf2 = this.zza.zzf();
                    } else {
                        return;
                    }
                } while (zzf2 == this.zzb);
                this.zzd = zzf2;
            } else {
                throw zzaae.zza();
            }
        } else {
            int i11 = this.zzb & 7;
            if (i11 == 2) {
                int zze2 = ((zzyw) this.zza).zze();
                zzT(zze2);
                int zzb3 = this.zza.zzb() + zze2;
                do {
                    list.add(Integer.valueOf(((zzyw) this.zza).zzd()));
                } while (this.zza.zzb() < zzb3);
            } else if (i11 == 5) {
                do {
                    list.add(Integer.valueOf(((zzyw) this.zza).zzd()));
                    if (!this.zza.zzp()) {
                        zzf = this.zza.zzf();
                    } else {
                        return;
                    }
                } while (zzf == this.zzb);
                this.zzd = zzf;
            } else {
                throw zzaae.zza();
            }
        }
    }
}
