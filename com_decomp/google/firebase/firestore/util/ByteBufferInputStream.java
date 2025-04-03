package com.google.firebase.firestore.util;

import java.io.InputStream;
import java.nio.ByteBuffer;

public class ByteBufferInputStream extends InputStream {
    ByteBuffer buffer;

    public ByteBufferInputStream(ByteBuffer byteBuffer) {
        this.buffer = byteBuffer;
    }

    public int available() {
        return this.buffer.remaining();
    }

    public int read() {
        if (!this.buffer.hasRemaining()) {
            return -1;
        }
        return this.buffer.get() & 255;
    }

    public int read(byte[] bArr, int i10, int i11) {
        if (!this.buffer.hasRemaining()) {
            return -1;
        }
        int min = Math.min(i11, this.buffer.remaining());
        this.buffer.get(bArr, i10, min);
        return min;
    }
}
