package com.google.android.gms.internal.measurement;

import java.nio.charset.Charset;

class zziv extends zziu {
    protected final byte[] zza;

    zziv(byte[] bArr) {
        bArr.getClass();
        this.zza = bArr;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zziy) || zzd() != ((zziy) obj).zzd()) {
            return false;
        }
        if (zzd() == 0) {
            return true;
        }
        if (!(obj instanceof zziv)) {
            return obj.equals(this);
        }
        zziv zziv = (zziv) obj;
        int zzk = zzk();
        int zzk2 = zziv.zzk();
        if (zzk != 0 && zzk2 != 0 && zzk != zzk2) {
            return false;
        }
        int zzd = zzd();
        if (zzd > zziv.zzd()) {
            int zzd2 = zzd();
            StringBuilder sb2 = new StringBuilder(40);
            sb2.append("Length too large: ");
            sb2.append(zzd);
            sb2.append(zzd2);
            throw new IllegalArgumentException(sb2.toString());
        } else if (zzd <= zziv.zzd()) {
            byte[] bArr = this.zza;
            byte[] bArr2 = zziv.zza;
            zziv.zzc();
            int i10 = 0;
            int i11 = 0;
            while (i10 < zzd) {
                if (bArr[i10] != bArr2[i11]) {
                    return false;
                }
                i10++;
                i11++;
            }
            return true;
        } else {
            int zzd3 = zziv.zzd();
            StringBuilder sb3 = new StringBuilder(59);
            sb3.append("Ran off end of other: 0, ");
            sb3.append(zzd);
            sb3.append(", ");
            sb3.append(zzd3);
            throw new IllegalArgumentException(sb3.toString());
        }
    }

    public byte zza(int i10) {
        return this.zza[i10];
    }

    /* access modifiers changed from: package-private */
    public byte zzb(int i10) {
        return this.zza[i10];
    }

    /* access modifiers changed from: protected */
    public int zzc() {
        return 0;
    }

    public int zzd() {
        return this.zza.length;
    }

    /* access modifiers changed from: protected */
    public final int zze(int i10, int i11, int i12) {
        return zzkh.zzd(i10, this.zza, 0, i12);
    }

    public final zziy zzf(int i10, int i11) {
        int zzj = zziy.zzj(0, i11, zzd());
        return zzj == 0 ? zziy.zzb : new zzis(this.zza, 0, zzj);
    }

    /* access modifiers changed from: protected */
    public final String zzg(Charset charset) {
        return new String(this.zza, 0, zzd(), charset);
    }

    /* access modifiers changed from: package-private */
    public final void zzh(zzin zzin) {
        ((zzjd) zzin).zzc(this.zza, 0, zzd());
    }

    public final boolean zzi() {
        return zzmx.zzf(this.zza, 0, zzd());
    }
}
