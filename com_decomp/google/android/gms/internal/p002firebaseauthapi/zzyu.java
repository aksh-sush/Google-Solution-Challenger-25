package com.google.android.gms.internal.p002firebaseauthapi;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzyu  reason: invalid package */
public abstract class zzyu implements Iterable<Byte>, Serializable {
    private static final Comparator<zzyu> zza = new zzyn();
    public static final zzyu zzb = new zzys(zzaac.zzc);
    private static final zzyt zzd = new zzyt((zzyl) null);
    private int zzc = 0;

    static {
        int i10 = zzyg.zza;
    }

    zzyu() {
    }

    static int zzl(int i10, int i11, int i12) {
        int i13 = i11 - i10;
        if ((i10 | i11 | i13 | (i12 - i11)) >= 0) {
            return i13;
        }
        if (i10 < 0) {
            StringBuilder sb2 = new StringBuilder(32);
            sb2.append("Beginning index: ");
            sb2.append(i10);
            sb2.append(" < 0");
            throw new IndexOutOfBoundsException(sb2.toString());
        } else if (i11 < i10) {
            StringBuilder sb3 = new StringBuilder(66);
            sb3.append("Beginning index larger than ending index: ");
            sb3.append(i10);
            sb3.append(", ");
            sb3.append(i11);
            throw new IndexOutOfBoundsException(sb3.toString());
        } else {
            StringBuilder sb4 = new StringBuilder(37);
            sb4.append("End index: ");
            sb4.append(i11);
            sb4.append(" >= ");
            sb4.append(i12);
            throw new IndexOutOfBoundsException(sb4.toString());
        }
    }

    public static zzyu zzn(byte[] bArr) {
        return zzo(bArr, 0, bArr.length);
    }

    public static zzyu zzo(byte[] bArr, int i10, int i11) {
        zzl(i10, i10 + i11, bArr.length);
        byte[] bArr2 = new byte[i11];
        System.arraycopy(bArr, i10, bArr2, 0, i11);
        return new zzys(bArr2);
    }

    public static zzyu zzp(String str) {
        return new zzys(str.getBytes(zzaac.zza));
    }

    static zzyu zzq(byte[] bArr) {
        return new zzys(bArr);
    }

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int i10 = this.zzc;
        if (i10 == 0) {
            int zzd2 = zzd();
            i10 = zzf(zzd2, 0, zzd2);
            if (i10 == 0) {
                i10 = 1;
            }
            this.zzc = i10;
        }
        return i10;
    }

    public final /* bridge */ /* synthetic */ Iterator iterator() {
        return new zzyl(this);
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(zzd());
        objArr[2] = zzd() <= 50 ? zzabx.zza(this) : String.valueOf(zzabx.zza(zzg(0, 47))).concat("...");
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }

    public abstract byte zza(int i10);

    /* access modifiers changed from: package-private */
    public abstract byte zzb(int i10);

    public abstract int zzd();

    /* access modifiers changed from: protected */
    public abstract void zze(byte[] bArr, int i10, int i11, int i12);

    /* access modifiers changed from: protected */
    public abstract int zzf(int i10, int i11, int i12);

    public abstract zzyu zzg(int i10, int i11);

    public abstract zzyx zzh();

    /* access modifiers changed from: protected */
    public abstract String zzi(Charset charset);

    /* access modifiers changed from: package-private */
    public abstract void zzj(zzyk zzyk);

    public abstract boolean zzk();

    /* access modifiers changed from: protected */
    public final int zzm() {
        return this.zzc;
    }

    public final String zzr(Charset charset) {
        return zzd() == 0 ? "" : zzi(charset);
    }

    public final byte[] zzs() {
        int zzd2 = zzd();
        if (zzd2 == 0) {
            return zzaac.zzc;
        }
        byte[] bArr = new byte[zzd2];
        zze(bArr, 0, 0, zzd2);
        return bArr;
    }
}
