package com.google.android.gms.internal.p002firebaseauthapi;

import java.nio.charset.Charset;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzys  reason: invalid package */
class zzys extends zzyr {
    protected final byte[] zza;

    zzys(byte[] bArr) {
        bArr.getClass();
        this.zza = bArr;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzyu) || zzd() != ((zzyu) obj).zzd()) {
            return false;
        }
        if (zzd() == 0) {
            return true;
        }
        if (!(obj instanceof zzys)) {
            return obj.equals(this);
        }
        zzys zzys = (zzys) obj;
        int zzm = zzm();
        int zzm2 = zzys.zzm();
        if (zzm != 0 && zzm2 != 0 && zzm != zzm2) {
            return false;
        }
        int zzd = zzd();
        if (zzd > zzys.zzd()) {
            int zzd2 = zzd();
            StringBuilder sb2 = new StringBuilder(40);
            sb2.append("Length too large: ");
            sb2.append(zzd);
            sb2.append(zzd2);
            throw new IllegalArgumentException(sb2.toString());
        } else if (zzd <= zzys.zzd()) {
            byte[] bArr = this.zza;
            byte[] bArr2 = zzys.zza;
            zzys.zzc();
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
            int zzd3 = zzys.zzd();
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
    public void zze(byte[] bArr, int i10, int i11, int i12) {
        System.arraycopy(this.zza, 0, bArr, 0, i12);
    }

    /* access modifiers changed from: protected */
    public final int zzf(int i10, int i11, int i12) {
        return zzaac.zzd(i10, this.zza, 0, i12);
    }

    public final zzyu zzg(int i10, int i11) {
        int zzl = zzyu.zzl(0, i11, zzd());
        return zzl == 0 ? zzyu.zzb : new zzyp(this.zza, 0, zzl);
    }

    public final zzyx zzh() {
        return zzyx.zzu(this.zza, 0, zzd(), true);
    }

    /* access modifiers changed from: protected */
    public final String zzi(Charset charset) {
        return new String(this.zza, 0, zzd(), charset);
    }

    /* access modifiers changed from: package-private */
    public final void zzj(zzyk zzyk) {
        zzyk.zza(this.zza, 0, zzd());
    }

    public final boolean zzk() {
        return zzaco.zzf(this.zza, 0, zzd());
    }
}
