package com.google.android.gms.internal.p002firebaseauthapi;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import javax.crypto.AEADBadTagException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzkh  reason: invalid package */
abstract class zzkh implements zzag {
    private final zzkf zza;
    private final zzkf zzb;

    public zzkh(byte[] bArr) {
        this.zza = zzc(bArr, 1);
        this.zzb = zzc(bArr, 0);
    }

    private final byte[] zzd(ByteBuffer byteBuffer, byte[] bArr) {
        if (byteBuffer.remaining() >= this.zza.zzb() + 16) {
            int position = byteBuffer.position();
            byte[] bArr2 = new byte[16];
            byteBuffer.position(byteBuffer.limit() - 16);
            byteBuffer.get(bArr2);
            byteBuffer.position(position);
            byteBuffer.limit(byteBuffer.limit() - 16);
            byte[] bArr3 = new byte[this.zza.zzb()];
            byteBuffer.get(bArr3);
            try {
                byte[] bArr4 = new byte[32];
                this.zzb.zzd(bArr3, 0).get(bArr4);
                int length = bArr.length;
                int i10 = length & 15;
                int i11 = i10 == 0 ? length : (length + 16) - i10;
                int remaining = byteBuffer.remaining();
                int i12 = remaining % 16;
                int i13 = (i12 == 0 ? remaining : (remaining + 16) - i12) + i11;
                ByteBuffer order = ByteBuffer.allocate(i13 + 16).order(ByteOrder.LITTLE_ENDIAN);
                order.put(bArr);
                order.position(i11);
                order.put(byteBuffer);
                order.position(i13);
                order.putLong((long) length);
                order.putLong((long) remaining);
                if (zzkd.zzb(zzla.zza(bArr4, order.array()), bArr2)) {
                    byteBuffer.position(position);
                    return this.zza.zzh(byteBuffer);
                }
                throw new GeneralSecurityException("invalid MAC");
            } catch (GeneralSecurityException e10) {
                throw new AEADBadTagException(e10.toString());
            }
        } else {
            throw new GeneralSecurityException("ciphertext too short");
        }
    }

    public final byte[] zza(byte[] bArr, byte[] bArr2) {
        return zzd(ByteBuffer.wrap(bArr), bArr2);
    }

    public final byte[] zzb(byte[] bArr, byte[] bArr2) {
        throw null;
    }

    /* access modifiers changed from: package-private */
    public abstract zzkf zzc(byte[] bArr, int i10);
}
