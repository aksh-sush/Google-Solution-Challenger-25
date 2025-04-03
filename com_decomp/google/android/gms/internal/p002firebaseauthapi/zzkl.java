package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.interfaces.ECPrivateKey;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzkl  reason: invalid package */
public final class zzkl {
    private final ECPrivateKey zza;

    public zzkl(ECPrivateKey eCPrivateKey) {
        this.zza = eCPrivateKey;
    }

    /* JADX WARNING: Removed duplicated region for block: B:43:0x010a  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x01e5 A[SYNTHETIC, Splitter:B:71:0x01e5] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final byte[] zza(byte[] r17, java.lang.String r18, byte[] r19, byte[] r20, int r21, int r22) {
        /*
            r16 = this;
            r1 = r16
            r0 = r17
            r2 = r18
            r3 = r19
            r4 = r21
            java.security.interfaces.ECPrivateKey r5 = r1.zza
            java.security.spec.ECParameterSpec r5 = r5.getParams()
            java.security.spec.EllipticCurve r6 = r5.getCurve()
            int r7 = com.google.android.gms.internal.p002firebaseauthapi.zzkn.zza(r6)
            r8 = -1
            int r9 = r22 + -1
            java.lang.String r10 = "invalid point size"
            r11 = 2
            r12 = 0
            r13 = 1
            if (r9 == 0) goto L_0x0093
            if (r9 == r11) goto L_0x006d
            java.math.BigInteger r9 = com.google.android.gms.internal.p002firebaseauthapi.zzkn.zzb(r6)
            int r10 = r0.length
            int r7 = r7 + r13
            if (r10 != r7) goto L_0x0065
            byte r7 = r0[r12]
            if (r7 != r11) goto L_0x0032
            r7 = 0
            goto L_0x0036
        L_0x0032:
            r14 = 3
            if (r7 != r14) goto L_0x005d
            r7 = 1
        L_0x0036:
            java.math.BigInteger r14 = new java.math.BigInteger
            byte[] r10 = java.util.Arrays.copyOfRange(r0, r13, r10)
            r14.<init>(r13, r10)
            int r10 = r14.signum()
            if (r10 == r8) goto L_0x0055
            int r9 = r14.compareTo(r9)
            if (r9 >= 0) goto L_0x0055
            java.math.BigInteger r6 = com.google.android.gms.internal.p002firebaseauthapi.zzkn.zzc(r14, r7, r6)
            java.security.spec.ECPoint r7 = new java.security.spec.ECPoint
            r7.<init>(r14, r6)
            goto L_0x00b7
        L_0x0055:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r2 = "x is out of range"
            r0.<init>(r2)
            throw r0
        L_0x005d:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r2 = "invalid format"
            r0.<init>(r2)
            throw r0
        L_0x0065:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r2 = "compressed point has wrong length"
            r0.<init>(r2)
            throw r0
        L_0x006d:
            int r9 = r0.length
            int r14 = r7 + r7
            if (r9 != r14) goto L_0x008d
            java.math.BigInteger r10 = new java.math.BigInteger
            byte[] r14 = java.util.Arrays.copyOfRange(r0, r12, r7)
            r10.<init>(r13, r14)
            java.math.BigInteger r14 = new java.math.BigInteger
            byte[] r7 = java.util.Arrays.copyOfRange(r0, r7, r9)
            r14.<init>(r13, r7)
            java.security.spec.ECPoint r7 = new java.security.spec.ECPoint
            r7.<init>(r10, r14)
        L_0x0089:
            com.google.android.gms.internal.p002firebaseauthapi.zzkn.zzd(r7, r6)
            goto L_0x00b7
        L_0x008d:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            r0.<init>(r10)
            throw r0
        L_0x0093:
            int r9 = r0.length
            int r14 = r7 + r7
            int r14 = r14 + r13
            if (r9 != r14) goto L_0x0202
            byte r10 = r0[r12]
            r14 = 4
            if (r10 != r14) goto L_0x01fa
            int r7 = r7 + r13
            java.math.BigInteger r10 = new java.math.BigInteger
            byte[] r14 = java.util.Arrays.copyOfRange(r0, r13, r7)
            r10.<init>(r13, r14)
            java.math.BigInteger r14 = new java.math.BigInteger
            byte[] r7 = java.util.Arrays.copyOfRange(r0, r7, r9)
            r14.<init>(r13, r7)
            java.security.spec.ECPoint r7 = new java.security.spec.ECPoint
            r7.<init>(r10, r14)
            goto L_0x0089
        L_0x00b7:
            java.security.spec.ECPublicKeySpec r6 = new java.security.spec.ECPublicKeySpec
            r6.<init>(r7, r5)
            com.google.android.gms.internal.firebase-auth-api.zzkp<com.google.android.gms.internal.firebase-auth-api.zzks, java.security.KeyFactory> r5 = com.google.android.gms.internal.p002firebaseauthapi.zzkp.zzg
            java.lang.String r7 = "EC"
            java.lang.Object r9 = r5.zza(r7)
            java.security.KeyFactory r9 = (java.security.KeyFactory) r9
            java.security.PublicKey r6 = r9.generatePublic(r6)
            java.security.interfaces.ECPublicKey r6 = (java.security.interfaces.ECPublicKey) r6
            java.security.interfaces.ECPrivateKey r9 = r1.zza
            java.security.spec.ECParameterSpec r10 = r6.getParams()     // Catch:{ IllegalArgumentException -> 0x01ef, NullPointerException -> 0x01ed }
            java.security.spec.ECParameterSpec r14 = r9.getParams()     // Catch:{ IllegalArgumentException -> 0x01ef, NullPointerException -> 0x01ed }
            java.security.spec.EllipticCurve r15 = r10.getCurve()     // Catch:{ IllegalArgumentException -> 0x01ef, NullPointerException -> 0x01ed }
            java.security.spec.EllipticCurve r12 = r14.getCurve()     // Catch:{ IllegalArgumentException -> 0x01ef, NullPointerException -> 0x01ed }
            boolean r12 = r15.equals(r12)     // Catch:{ IllegalArgumentException -> 0x01ef, NullPointerException -> 0x01ed }
            if (r12 == 0) goto L_0x01e5
            java.security.spec.ECPoint r12 = r10.getGenerator()     // Catch:{ IllegalArgumentException -> 0x01ef, NullPointerException -> 0x01ed }
            java.security.spec.ECPoint r15 = r14.getGenerator()     // Catch:{ IllegalArgumentException -> 0x01ef, NullPointerException -> 0x01ed }
            boolean r12 = r12.equals(r15)     // Catch:{ IllegalArgumentException -> 0x01ef, NullPointerException -> 0x01ed }
            if (r12 == 0) goto L_0x01e5
            java.math.BigInteger r12 = r10.getOrder()     // Catch:{ IllegalArgumentException -> 0x01ef, NullPointerException -> 0x01ed }
            java.math.BigInteger r15 = r14.getOrder()     // Catch:{ IllegalArgumentException -> 0x01ef, NullPointerException -> 0x01ed }
            boolean r12 = r12.equals(r15)     // Catch:{ IllegalArgumentException -> 0x01ef, NullPointerException -> 0x01ed }
            if (r12 == 0) goto L_0x01e5
            int r10 = r10.getCofactor()     // Catch:{ IllegalArgumentException -> 0x01ef, NullPointerException -> 0x01ed }
            int r12 = r14.getCofactor()     // Catch:{ IllegalArgumentException -> 0x01ef, NullPointerException -> 0x01ed }
            if (r10 != r12) goto L_0x01e5
            java.security.spec.ECPoint r6 = r6.getW()
            java.security.spec.ECParameterSpec r10 = r9.getParams()
            java.security.spec.EllipticCurve r10 = r10.getCurve()
            com.google.android.gms.internal.p002firebaseauthapi.zzkn.zzd(r6, r10)
            java.security.spec.ECParameterSpec r10 = r9.getParams()
            java.security.spec.ECPublicKeySpec r12 = new java.security.spec.ECPublicKeySpec
            r12.<init>(r6, r10)
            java.lang.Object r5 = r5.zza(r7)
            java.security.KeyFactory r5 = (java.security.KeyFactory) r5
            java.security.PublicKey r5 = r5.generatePublic(r12)
            com.google.android.gms.internal.firebase-auth-api.zzkp<com.google.android.gms.internal.firebase-auth-api.zzkr, javax.crypto.KeyAgreement> r6 = com.google.android.gms.internal.p002firebaseauthapi.zzkp.zze
            java.lang.String r7 = "ECDH"
            java.lang.Object r6 = r6.zza(r7)
            javax.crypto.KeyAgreement r6 = (javax.crypto.KeyAgreement) r6
            r6.init(r9)
            r6.doPhase(r5, r13)     // Catch:{ IllegalStateException -> 0x01da }
            byte[] r5 = r6.generateSecret()     // Catch:{ IllegalStateException -> 0x01da }
            java.security.spec.ECParameterSpec r6 = r9.getParams()     // Catch:{ IllegalStateException -> 0x01da }
            java.security.spec.EllipticCurve r6 = r6.getCurve()     // Catch:{ IllegalStateException -> 0x01da }
            java.math.BigInteger r7 = new java.math.BigInteger     // Catch:{ IllegalStateException -> 0x01da }
            r7.<init>(r13, r5)     // Catch:{ IllegalStateException -> 0x01da }
            int r9 = r7.signum()     // Catch:{ IllegalStateException -> 0x01da }
            if (r9 == r8) goto L_0x01d2
            java.math.BigInteger r8 = com.google.android.gms.internal.p002firebaseauthapi.zzkn.zzb(r6)     // Catch:{ IllegalStateException -> 0x01da }
            int r8 = r7.compareTo(r8)     // Catch:{ IllegalStateException -> 0x01da }
            if (r8 >= 0) goto L_0x01d2
            com.google.android.gms.internal.p002firebaseauthapi.zzkn.zzc(r7, r13, r6)     // Catch:{ IllegalStateException -> 0x01da }
            byte[][] r6 = new byte[r11][]
            r7 = 0
            r6[r7] = r0
            r6[r13] = r5
            byte[] r0 = com.google.android.gms.internal.p002firebaseauthapi.zzkd.zzc(r6)
            com.google.android.gms.internal.firebase-auth-api.zzkp<com.google.android.gms.internal.firebase-auth-api.zzku, javax.crypto.Mac> r5 = com.google.android.gms.internal.p002firebaseauthapi.zzkp.zzb
            java.lang.Object r5 = r5.zza(r2)
            javax.crypto.Mac r5 = (javax.crypto.Mac) r5
            int r6 = r5.getMacLength()
            int r6 = r6 * 255
            if (r4 > r6) goto L_0x01ca
            if (r3 == 0) goto L_0x018a
            int r6 = r3.length
            if (r6 != 0) goto L_0x0181
            goto L_0x018a
        L_0x0181:
            javax.crypto.spec.SecretKeySpec r6 = new javax.crypto.spec.SecretKeySpec
            r6.<init>(r3, r2)
            r5.init(r6)
            goto L_0x0198
        L_0x018a:
            javax.crypto.spec.SecretKeySpec r3 = new javax.crypto.spec.SecretKeySpec
            int r6 = r5.getMacLength()
            byte[] r6 = new byte[r6]
            r3.<init>(r6, r2)
            r5.init(r3)
        L_0x0198:
            byte[] r0 = r5.doFinal(r0)
            byte[] r3 = new byte[r4]
            javax.crypto.spec.SecretKeySpec r6 = new javax.crypto.spec.SecretKeySpec
            r6.<init>(r0, r2)
            r5.init(r6)
            r7 = 0
            byte[] r0 = new byte[r7]
            r2 = 0
        L_0x01aa:
            r5.update(r0)
            r0 = 0
            r5.update(r0)
            byte r0 = (byte) r13
            r5.update(r0)
            byte[] r0 = r5.doFinal()
            int r6 = r0.length
            int r8 = r2 + r6
            if (r8 >= r4) goto L_0x01c5
            java.lang.System.arraycopy(r0, r7, r3, r2, r6)
            int r13 = r13 + 1
            r2 = r8
            goto L_0x01aa
        L_0x01c5:
            int r4 = r4 - r2
            java.lang.System.arraycopy(r0, r7, r3, r2, r4)
            return r3
        L_0x01ca:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r2 = "size too large"
            r0.<init>(r2)
            throw r0
        L_0x01d2:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException     // Catch:{ IllegalStateException -> 0x01da }
            java.lang.String r2 = "shared secret is out of range"
            r0.<init>(r2)     // Catch:{ IllegalStateException -> 0x01da }
            throw r0     // Catch:{ IllegalStateException -> 0x01da }
        L_0x01da:
            r0 = move-exception
            java.security.GeneralSecurityException r2 = new java.security.GeneralSecurityException
            java.lang.String r0 = r0.toString()
            r2.<init>(r0)
            throw r2
        L_0x01e5:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException     // Catch:{ IllegalArgumentException -> 0x01ef, NullPointerException -> 0x01ed }
            java.lang.String r2 = "invalid public key spec"
            r0.<init>(r2)     // Catch:{ IllegalArgumentException -> 0x01ef, NullPointerException -> 0x01ed }
            throw r0     // Catch:{ IllegalArgumentException -> 0x01ef, NullPointerException -> 0x01ed }
        L_0x01ed:
            r0 = move-exception
            goto L_0x01f0
        L_0x01ef:
            r0 = move-exception
        L_0x01f0:
            java.security.GeneralSecurityException r2 = new java.security.GeneralSecurityException
            java.lang.String r0 = r0.toString()
            r2.<init>(r0)
            throw r2
        L_0x01fa:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r2 = "invalid point format"
            r0.<init>(r2)
            throw r0
        L_0x0202:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            r0.<init>(r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p002firebaseauthapi.zzkl.zza(byte[], java.lang.String, byte[], byte[], int, int):byte[]");
    }
}
