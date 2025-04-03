package com.google.android.gms.internal.p002firebaseauthapi;

import java.io.OutputStream;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzzd  reason: invalid package */
final class zzzd extends zzza {
    private final OutputStream zzf;

    zzzd(OutputStream outputStream, int i10) {
        super(i10);
        this.zzf = outputStream;
    }

    private final void zzL() {
        this.zzf.write(this.zza, 0, this.zzc);
        this.zzc = 0;
    }

    private final void zzM(int i10) {
        if (this.zzb - this.zzc < i10) {
            zzL();
        }
    }

    public final void zzN() {
        if (this.zzc > 0) {
            zzL();
        }
    }

    public final void zzO(byte b10) {
        if (this.zzc == this.zzb) {
            zzL();
        }
        zzc(b10);
    }

    public final void zzP(int i10, boolean z10) {
        zzM(11);
        zzf(i10 << 3);
        zzc(z10 ? (byte) 1 : 0);
    }

    public final void zzQ(int i10, zzyu zzyu) {
        zzs((i10 << 3) | 2);
        zzs(zzyu.zzd());
        zzyu.zzj(this);
    }

    public final void zza(byte[] bArr, int i10, int i11) {
        zzp(bArr, 0, i11);
    }

    public final void zzh(int i10, int i11) {
        zzM(14);
        zzf((i10 << 3) | 5);
        zzd(i11);
    }

    public final void zzi(int i10) {
        zzM(4);
        zzd(i10);
    }

    public final void zzj(int i10, long j10) {
        zzM(18);
        zzf((i10 << 3) | 1);
        zze(j10);
    }

    public final void zzk(long j10) {
        zzM(8);
        zze(j10);
    }

    public final void zzl(int i10, int i11) {
        zzM(20);
        zzf(i10 << 3);
        if (i11 >= 0) {
            zzf(i11);
        } else {
            zzg((long) i11);
        }
    }

    public final void zzm(int i10) {
        if (i10 >= 0) {
            zzs(i10);
        } else {
            zzu((long) i10);
        }
    }

    /* access modifiers changed from: package-private */
    public final void zzn(int i10, zzaaz zzaaz, zzabl zzabl) {
        zzs((i10 << 3) | 2);
        zzye zzye = (zzye) zzaaz;
        int zzn = zzye.zzn();
        if (zzn == -1) {
            zzn = zzabl.zza(zzye);
            zzye.zzp(zzn);
        }
        zzs(zzn);
        zzabl.zzn(zzaaz, this.zze);
    }

    public final void zzo(int i10, String str) {
        zzs((i10 << 3) | 2);
        zzv(str);
    }

    public final void zzp(byte[] bArr, int i10, int i11) {
        int i12 = this.zzb;
        int i13 = this.zzc;
        int i14 = i12 - i13;
        if (i14 >= i11) {
            System.arraycopy(bArr, 0, this.zza, i13, i11);
            this.zzc += i11;
        } else {
            System.arraycopy(bArr, 0, this.zza, i13, i14);
            i11 -= i14;
            this.zzc = this.zzb;
            this.zzd += i14;
            zzL();
            if (i11 <= this.zzb) {
                System.arraycopy(bArr, i14, this.zza, 0, i11);
                this.zzc = i11;
            } else {
                this.zzf.write(bArr, i14, i11);
            }
        }
        this.zzd += i11;
    }

    public final void zzq(int i10, int i11) {
        zzs((i10 << 3) | i11);
    }

    public final void zzr(int i10, int i11) {
        zzM(20);
        zzf(i10 << 3);
        zzf(i11);
    }

    public final void zzs(int i10) {
        zzM(5);
        zzf(i10);
    }

    public final void zzt(int i10, long j10) {
        zzM(20);
        zzf(i10 << 3);
        zzg(j10);
    }

    public final void zzu(long j10) {
        zzM(10);
        zzg(j10);
    }

    public final void zzv(String str) {
        int i10;
        int i11;
        try {
            int length = str.length() * 3;
            int zzE = zzze.zzE(length);
            int i12 = zzE + length;
            int i13 = this.zzb;
            if (i12 > i13) {
                byte[] bArr = new byte[length];
                int zzb = zzaco.zzb(str, bArr, 0, length);
                zzs(zzb);
                zzp(bArr, 0, zzb);
                return;
            }
            if (i12 > i13 - this.zzc) {
                zzL();
            }
            int zzE2 = zzze.zzE(str.length());
            i10 = this.zzc;
            if (zzE2 == zzE) {
                int i14 = i10 + zzE2;
                this.zzc = i14;
                int zzb2 = zzaco.zzb(str, this.zza, i14, this.zzb - i14);
                this.zzc = i10;
                i11 = (zzb2 - i10) - zzE2;
                zzf(i11);
                this.zzc = zzb2;
            } else {
                i11 = zzaco.zzc(str);
                zzf(i11);
                this.zzc = zzaco.zzb(str, this.zza, this.zzc, i11);
            }
            this.zzd += i11;
        } catch (zzacn e10) {
            this.zzd -= this.zzc - i10;
            this.zzc = i10;
            throw e10;
        } catch (ArrayIndexOutOfBoundsException e11) {
            throw new zzzc(e11);
        } catch (zzacn e12) {
            zzJ(str, e12);
        }
    }
}
