package com.google.android.gms.internal.p002firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzza  reason: invalid package */
abstract class zzza extends zzze {
    final byte[] zza;
    final int zzb;
    int zzc;
    int zzd;

    zzza(int i10) {
        super((zzyz) null);
        if (i10 >= 0) {
            byte[] bArr = new byte[Math.max(i10, 20)];
            this.zza = bArr;
            this.zzb = bArr.length;
            return;
        }
        throw new IllegalArgumentException("bufferSize must be >= 0");
    }

    public final int zzb() {
        throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
    }

    /* access modifiers changed from: package-private */
    public final void zzc(byte b10) {
        byte[] bArr = this.zza;
        int i10 = this.zzc;
        this.zzc = i10 + 1;
        bArr[i10] = b10;
        this.zzd++;
    }

    /* access modifiers changed from: package-private */
    public final void zzd(int i10) {
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
        this.zzd += 4;
    }

    /* access modifiers changed from: package-private */
    public final void zze(long j10) {
        byte[] bArr = this.zza;
        int i10 = this.zzc;
        int i11 = i10 + 1;
        bArr[i10] = (byte) ((int) (j10 & 255));
        int i12 = i11 + 1;
        bArr[i11] = (byte) ((int) ((j10 >> 8) & 255));
        int i13 = i12 + 1;
        bArr[i12] = (byte) ((int) ((j10 >> 16) & 255));
        int i14 = i13 + 1;
        bArr[i13] = (byte) ((int) (255 & (j10 >> 24)));
        int i15 = i14 + 1;
        bArr[i14] = (byte) (((int) (j10 >> 32)) & 255);
        int i16 = i15 + 1;
        bArr[i15] = (byte) (((int) (j10 >> 40)) & 255);
        int i17 = i16 + 1;
        bArr[i16] = (byte) (((int) (j10 >> 48)) & 255);
        this.zzc = i17 + 1;
        bArr[i17] = (byte) (((int) (j10 >> 56)) & 255);
        this.zzd += 8;
    }

    /* access modifiers changed from: package-private */
    public final void zzf(int i10) {
        if (zzze.zzb) {
            long j10 = (long) this.zzc;
            while ((i10 & -128) != 0) {
                byte[] bArr = this.zza;
                int i11 = this.zzc;
                this.zzc = i11 + 1;
                zzacj.zzn(bArr, (long) i11, (byte) ((i10 & 127) | 128));
                i10 >>>= 7;
            }
            byte[] bArr2 = this.zza;
            int i12 = this.zzc;
            this.zzc = i12 + 1;
            zzacj.zzn(bArr2, (long) i12, (byte) i10);
            this.zzd += (int) (((long) this.zzc) - j10);
            return;
        }
        while ((i10 & -128) != 0) {
            byte[] bArr3 = this.zza;
            int i13 = this.zzc;
            this.zzc = i13 + 1;
            bArr3[i13] = (byte) ((i10 & 127) | 128);
            this.zzd++;
            i10 >>>= 7;
        }
        byte[] bArr4 = this.zza;
        int i14 = this.zzc;
        this.zzc = i14 + 1;
        bArr4[i14] = (byte) i10;
        this.zzd++;
    }

    /* access modifiers changed from: package-private */
    public final void zzg(long j10) {
        if (zzze.zzb) {
            long j11 = (long) this.zzc;
            while ((j10 & -128) != 0) {
                byte[] bArr = this.zza;
                int i10 = this.zzc;
                this.zzc = i10 + 1;
                zzacj.zzn(bArr, (long) i10, (byte) ((((int) j10) & 127) | 128));
                j10 >>>= 7;
            }
            byte[] bArr2 = this.zza;
            int i11 = this.zzc;
            this.zzc = i11 + 1;
            zzacj.zzn(bArr2, (long) i11, (byte) ((int) j10));
            this.zzd += (int) (((long) this.zzc) - j11);
            return;
        }
        while ((j10 & -128) != 0) {
            byte[] bArr3 = this.zza;
            int i12 = this.zzc;
            this.zzc = i12 + 1;
            bArr3[i12] = (byte) ((((int) j10) & 127) | 128);
            this.zzd++;
            j10 >>>= 7;
        }
        byte[] bArr4 = this.zza;
        int i13 = this.zzc;
        this.zzc = i13 + 1;
        bArr4[i13] = (byte) ((int) j10);
        this.zzd++;
    }
}
