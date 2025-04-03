package com.google.android.gms.internal.firebase_messaging;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

final class zzk extends FilterInputStream {
    private long zza;
    private long zzb = -1;

    zzk(InputStream inputStream, long j10) {
        super(inputStream);
        inputStream.getClass();
        this.zza = 1048577;
    }

    public final int available() {
        return (int) Math.min((long) this.in.available(), this.zza);
    }

    public final synchronized void mark(int i10) {
        this.in.mark(i10);
        this.zzb = this.zza;
    }

    public final int read() {
        if (this.zza == 0) {
            return -1;
        }
        int read = this.in.read();
        if (read != -1) {
            this.zza--;
        }
        return read;
    }

    public final synchronized void reset() {
        if (!this.in.markSupported()) {
            throw new IOException("Mark not supported");
        } else if (this.zzb != -1) {
            this.in.reset();
            this.zza = this.zzb;
        } else {
            throw new IOException("Mark not set");
        }
    }

    public final long skip(long j10) {
        long skip = this.in.skip(Math.min(j10, this.zza));
        this.zza -= skip;
        return skip;
    }

    public final int read(byte[] bArr, int i10, int i11) {
        long j10 = this.zza;
        if (j10 == 0) {
            return -1;
        }
        int read = this.in.read(bArr, i10, (int) Math.min((long) i11, j10));
        if (read != -1) {
            this.zza -= (long) read;
        }
        return read;
    }
}
