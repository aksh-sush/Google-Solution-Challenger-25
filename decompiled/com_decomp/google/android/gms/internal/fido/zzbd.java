package com.google.android.gms.internal.fido;

final class zzbd extends zzbe {
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    zzbd(java.lang.String r2, java.lang.String r3, java.lang.Character r4) {
        /*
            r1 = this;
            com.google.android.gms.internal.fido.zzbb r0 = new com.google.android.gms.internal.fido.zzbb
            char[] r3 = r3.toCharArray()
            r0.<init>(r2, r3)
            r1.<init>(r0, r4)
            char[] r2 = r0.zzf
            int r2 = r2.length
            r3 = 64
            if (r2 != r3) goto L_0x0017
            r2 = 1
            goto L_0x0018
        L_0x0017:
            r2 = 0
        L_0x0018:
            com.google.android.gms.internal.fido.zzam.zzc(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.fido.zzbd.<init>(java.lang.String, java.lang.String, java.lang.Character):void");
    }

    /* access modifiers changed from: package-private */
    public final void zza(Appendable appendable, byte[] bArr, int i10, int i11) {
        int i12 = 0;
        zzam.zze(0, i11, bArr.length);
        for (int i13 = i11; i13 >= 3; i13 -= 3) {
            int i14 = i12 + 1;
            int i15 = i14 + 1;
            byte b10 = ((bArr[i12] & 255) << 16) | ((bArr[i14] & 255) << 8) | (bArr[i15] & 255);
            appendable.append(this.zzb.zza(b10 >>> 18));
            appendable.append(this.zzb.zza((b10 >>> 12) & 63));
            appendable.append(this.zzb.zza((b10 >>> 6) & 63));
            appendable.append(this.zzb.zza(b10 & 63));
            i12 = i15 + 1;
        }
        if (i12 < i11) {
            zzc(appendable, bArr, i12, i11 - i12);
        }
    }
}
