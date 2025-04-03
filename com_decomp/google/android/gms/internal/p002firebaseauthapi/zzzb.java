package com.google.android.gms.internal.p002firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzzb  reason: invalid package */
final class zzzb extends zzze {
    private final byte[] zza;
    private final int zzb;
    private int zzc;

    zzzb(byte[] bArr, int i10, int i11) {
        super((zzyz) null);
        int length = bArr.length;
        if (((length - i11) | i11) >= 0) {
            this.zza = bArr;
            this.zzc = 0;
            this.zzb = i11;
            return;
        }
        throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(length), 0, Integer.valueOf(i11)}));
    }

    public final void zzN() {
    }

    public final void zzO(byte b10) {
        try {
            byte[] bArr = this.zza;
            int i10 = this.zzc;
            this.zzc = i10 + 1;
            bArr[i10] = b10;
        } catch (IndexOutOfBoundsException e10) {
            throw new zzzc(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.zzc), Integer.valueOf(this.zzb), 1}), e10);
        }
    }

    public final void zzP(int i10, boolean z10) {
        zzs(i10 << 3);
        zzO(z10 ? (byte) 1 : 0);
    }

    public final void zzQ(int i10, zzyu zzyu) {
        zzs((i10 << 3) | 2);
        zzs(zzyu.zzd());
        zzyu.zzj(this);
    }

    public final void zza(byte[] bArr, int i10, int i11) {
        zze(bArr, 0, i11);
    }

    public final int zzb() {
        return this.zzb - this.zzc;
    }

    public final void zze(byte[] bArr, int i10, int i11) {
        try {
            System.arraycopy(bArr, 0, this.zza, this.zzc, i11);
            this.zzc += i11;
        } catch (IndexOutOfBoundsException e10) {
            throw new zzzc(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.zzc), Integer.valueOf(this.zzb), Integer.valueOf(i11)}), e10);
        }
    }

    public final void zzh(int i10, int i11) {
        zzs((i10 << 3) | 5);
        zzi(i11);
    }

    public final void zzi(int i10) {
        try {
            byte[] bArr = this.zza;
            int i11 = this.zzc;
            int i12 = i11 + 1;
            bArr[i11] = (byte) (i10 & 255);
            int i13 = i12 + 1;
            bArr[i12] = (byte) ((i10 >> 8) & 255);
            int i14 = i13 + 1;
            bArr[i13] = (byte) ((i10 >> 16) & 255);
            this.zzc = i14 + 1;
            bArr[i14] = (byte) ((i10 >> 24) & 255);
        } catch (IndexOutOfBoundsException e10) {
            throw new zzzc(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.zzc), Integer.valueOf(this.zzb), 1}), e10);
        }
    }

    public final void zzj(int i10, long j10) {
        zzs((i10 << 3) | 1);
        zzk(j10);
    }

    public final void zzk(long j10) {
        try {
            byte[] bArr = this.zza;
            int i10 = this.zzc;
            int i11 = i10 + 1;
            bArr[i10] = (byte) (((int) j10) & 255);
            int i12 = i11 + 1;
            bArr[i11] = (byte) (((int) (j10 >> 8)) & 255);
            int i13 = i12 + 1;
            bArr[i12] = (byte) (((int) (j10 >> 16)) & 255);
            int i14 = i13 + 1;
            bArr[i13] = (byte) (((int) (j10 >> 24)) & 255);
            int i15 = i14 + 1;
            bArr[i14] = (byte) (((int) (j10 >> 32)) & 255);
            int i16 = i15 + 1;
            bArr[i15] = (byte) (((int) (j10 >> 40)) & 255);
            int i17 = i16 + 1;
            bArr[i16] = (byte) (((int) (j10 >> 48)) & 255);
            this.zzc = i17 + 1;
            bArr[i17] = (byte) (((int) (j10 >> 56)) & 255);
        } catch (IndexOutOfBoundsException e10) {
            throw new zzzc(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.zzc), Integer.valueOf(this.zzb), 1}), e10);
        }
    }

    public final void zzl(int i10, int i11) {
        zzs(i10 << 3);
        zzm(i11);
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
        zzp(str);
    }

    public final void zzp(String str) {
        int i10 = this.zzc;
        try {
            int zzE = zzze.zzE(str.length() * 3);
            int zzE2 = zzze.zzE(str.length());
            if (zzE2 == zzE) {
                int i11 = i10 + zzE2;
                this.zzc = i11;
                int zzb2 = zzaco.zzb(str, this.zza, i11, this.zzb - i11);
                this.zzc = i10;
                zzs((zzb2 - i10) - zzE2);
                this.zzc = zzb2;
                return;
            }
            zzs(zzaco.zzc(str));
            byte[] bArr = this.zza;
            int i12 = this.zzc;
            this.zzc = zzaco.zzb(str, bArr, i12, this.zzb - i12);
        } catch (zzacn e10) {
            this.zzc = i10;
            zzJ(str, e10);
        } catch (IndexOutOfBoundsException e11) {
            throw new zzzc(e11);
        }
    }

    public final void zzq(int i10, int i11) {
        zzs((i10 << 3) | i11);
    }

    public final void zzr(int i10, int i11) {
        zzs(i10 << 3);
        zzs(i11);
    }

    public final void zzs(int i10) {
        if (zzze.zzb) {
            int i11 = zzyg.zza;
        }
        while ((i10 & -128) != 0) {
            byte[] bArr = this.zza;
            int i12 = this.zzc;
            this.zzc = i12 + 1;
            bArr[i12] = (byte) ((i10 & 127) | 128);
            i10 >>>= 7;
        }
        try {
            byte[] bArr2 = this.zza;
            int i13 = this.zzc;
            this.zzc = i13 + 1;
            bArr2[i13] = (byte) i10;
        } catch (IndexOutOfBoundsException e10) {
            throw new zzzc(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.zzc), Integer.valueOf(this.zzb), 1}), e10);
        }
    }

    public final void zzt(int i10, long j10) {
        zzs(i10 << 3);
        zzu(j10);
    }

    public final void zzu(long j10) {
        if (!zzze.zzb || this.zzb - this.zzc < 10) {
            while ((j10 & -128) != 0) {
                byte[] bArr = this.zza;
                int i10 = this.zzc;
                this.zzc = i10 + 1;
                bArr[i10] = (byte) ((((int) j10) & 127) | 128);
                j10 >>>= 7;
            }
            try {
                byte[] bArr2 = this.zza;
                int i11 = this.zzc;
                this.zzc = i11 + 1;
                bArr2[i11] = (byte) ((int) j10);
            } catch (IndexOutOfBoundsException e10) {
                throw new zzzc(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.zzc), Integer.valueOf(this.zzb), 1}), e10);
            }
        } else {
            while ((j10 & -128) != 0) {
                byte[] bArr3 = this.zza;
                int i12 = this.zzc;
                this.zzc = i12 + 1;
                zzacj.zzn(bArr3, (long) i12, (byte) ((((int) j10) & 127) | 128));
                j10 >>>= 7;
            }
            byte[] bArr4 = this.zza;
            int i13 = this.zzc;
            this.zzc = i13 + 1;
            zzacj.zzn(bArr4, (long) i13, (byte) ((int) j10));
        }
    }
}
