package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.InvalidAlgorithmParameterException;
import java.security.Key;
import java.util.Arrays;
import javax.crypto.Mac;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzld  reason: invalid package */
public final class zzld implements zzek {
    private final ThreadLocal<Mac> zza;
    /* access modifiers changed from: private */
    public final String zzb;
    /* access modifiers changed from: private */
    public final Key zzc;
    private final int zzd;

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public zzld(java.lang.String r6, java.security.Key r7) {
        /*
            r5 = this;
            r5.<init>()
            com.google.android.gms.internal.firebase-auth-api.zzlc r0 = new com.google.android.gms.internal.firebase-auth-api.zzlc
            r0.<init>(r5)
            r5.zza = r0
            r5.zzb = r6
            r5.zzc = r7
            byte[] r7 = r7.getEncoded()
            int r7 = r7.length
            r1 = 16
            if (r7 < r1) goto L_0x008c
            int r7 = r6.hashCode()
            r1 = 4
            r2 = 3
            r3 = 2
            r4 = 1
            switch(r7) {
                case -1823053428: goto L_0x004b;
                case 392315023: goto L_0x0041;
                case 392315118: goto L_0x0037;
                case 392316170: goto L_0x002d;
                case 392317873: goto L_0x0023;
                default: goto L_0x0022;
            }
        L_0x0022:
            goto L_0x0055
        L_0x0023:
            java.lang.String r7 = "HMACSHA512"
            boolean r7 = r6.equals(r7)
            if (r7 == 0) goto L_0x0055
            r7 = 4
            goto L_0x0056
        L_0x002d:
            java.lang.String r7 = "HMACSHA384"
            boolean r7 = r6.equals(r7)
            if (r7 == 0) goto L_0x0055
            r7 = 3
            goto L_0x0056
        L_0x0037:
            java.lang.String r7 = "HMACSHA256"
            boolean r7 = r6.equals(r7)
            if (r7 == 0) goto L_0x0055
            r7 = 2
            goto L_0x0056
        L_0x0041:
            java.lang.String r7 = "HMACSHA224"
            boolean r7 = r6.equals(r7)
            if (r7 == 0) goto L_0x0055
            r7 = 1
            goto L_0x0056
        L_0x004b:
            java.lang.String r7 = "HMACSHA1"
            boolean r7 = r6.equals(r7)
            if (r7 == 0) goto L_0x0055
            r7 = 0
            goto L_0x0056
        L_0x0055:
            r7 = -1
        L_0x0056:
            if (r7 == 0) goto L_0x0084
            if (r7 == r4) goto L_0x0081
            if (r7 == r3) goto L_0x007e
            if (r7 == r2) goto L_0x007b
            if (r7 == r1) goto L_0x0078
            java.security.NoSuchAlgorithmException r7 = new java.security.NoSuchAlgorithmException
            int r0 = r6.length()
            java.lang.String r1 = "unknown Hmac algorithm: "
            if (r0 == 0) goto L_0x006f
            java.lang.String r6 = r1.concat(r6)
            goto L_0x0074
        L_0x006f:
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1)
        L_0x0074:
            r7.<init>(r6)
            throw r7
        L_0x0078:
            r6 = 64
            goto L_0x0086
        L_0x007b:
            r6 = 48
            goto L_0x0086
        L_0x007e:
            r6 = 32
            goto L_0x0086
        L_0x0081:
            r6 = 28
            goto L_0x0086
        L_0x0084:
            r6 = 20
        L_0x0086:
            r5.zzd = r6
            r0.get()
            return
        L_0x008c:
            java.security.InvalidAlgorithmParameterException r6 = new java.security.InvalidAlgorithmParameterException
            java.lang.String r7 = "key size too small, need at least 16 bytes"
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p002firebaseauthapi.zzld.<init>(java.lang.String, java.security.Key):void");
    }

    public final byte[] zza(byte[] bArr, int i10) {
        if (i10 <= this.zzd) {
            this.zza.get().update(bArr);
            return Arrays.copyOf(this.zza.get().doFinal(), i10);
        }
        throw new InvalidAlgorithmParameterException("tag size too big");
    }
}
