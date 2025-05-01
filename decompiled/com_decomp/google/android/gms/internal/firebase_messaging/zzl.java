package com.google.android.gms.internal.firebase_messaging;

import com.google.android.gms.common.api.a;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayDeque;
import java.util.Queue;

public final class zzl {
    private static final OutputStream zza = new zzj();

    public static byte[] zza(InputStream inputStream) {
        ArrayDeque arrayDeque = new ArrayDeque(20);
        int i10 = 8192;
        int i11 = 0;
        while (i11 < 2147483639) {
            int min = Math.min(i10, 2147483639 - i11);
            byte[] bArr = new byte[min];
            arrayDeque.add(bArr);
            int i12 = 0;
            while (i12 < min) {
                int read = inputStream.read(bArr, i12, min - i12);
                if (read == -1) {
                    return zzc(arrayDeque, i11);
                }
                i12 += read;
                i11 += read;
            }
            long j10 = (long) i10;
            long j11 = j10 + j10;
            i10 = j11 > 2147483647L ? a.e.API_PRIORITY_OTHER : j11 < -2147483648L ? Integer.MIN_VALUE : (int) j11;
        }
        if (inputStream.read() == -1) {
            return zzc(arrayDeque, 2147483639);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }

    public static InputStream zzb(InputStream inputStream, long j10) {
        return new zzk(inputStream, 1048577);
    }

    private static byte[] zzc(Queue<byte[]> queue, int i10) {
        byte[] bArr = new byte[i10];
        int i11 = i10;
        while (i11 > 0) {
            byte[] remove = queue.remove();
            int min = Math.min(i11, remove.length);
            System.arraycopy(remove, 0, bArr, i10 - i11, min);
            i11 -= min;
        }
        return bArr;
    }
}
