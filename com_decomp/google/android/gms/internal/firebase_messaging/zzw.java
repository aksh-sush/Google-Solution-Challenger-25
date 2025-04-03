package com.google.android.gms.internal.firebase_messaging;

import java.io.OutputStream;

final class zzw extends OutputStream {
    private long zza = 0;

    zzw() {
    }

    public final void write(int i10) {
        this.zza++;
    }

    /* access modifiers changed from: package-private */
    public final long zza() {
        return this.zza;
    }

    public final void write(byte[] bArr) {
        this.zza += (long) bArr.length;
    }

    public final void write(byte[] bArr, int i10, int i11) {
        int length;
        int i12;
        if (i10 < 0 || i10 > (length = bArr.length) || i11 < 0 || (i12 = i10 + i11) > length || i12 < 0) {
            throw new IndexOutOfBoundsException();
        }
        this.zza += (long) i11;
    }
}
