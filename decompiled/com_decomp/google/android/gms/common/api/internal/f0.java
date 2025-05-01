package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.TimeUnit;
import q3.b;

public abstract class f0 extends GoogleApiClient {

    /* renamed from: b  reason: collision with root package name */
    private final String f5353b = "Method is not supported by connectionless client. APIs supporting connectionless client must not call this method.";

    public f0(String str) {
    }

    public final void connect() {
        throw new UnsupportedOperationException(this.f5353b);
    }

    public final b d(long j10, TimeUnit timeUnit) {
        throw new UnsupportedOperationException(this.f5353b);
    }

    public final void disconnect() {
        throw new UnsupportedOperationException(this.f5353b);
    }

    public final void e(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        throw new UnsupportedOperationException(this.f5353b);
    }

    public final boolean l() {
        throw new UnsupportedOperationException(this.f5353b);
    }

    public final void o(GoogleApiClient.c cVar) {
        throw new UnsupportedOperationException(this.f5353b);
    }

    public final void p(GoogleApiClient.c cVar) {
        throw new UnsupportedOperationException(this.f5353b);
    }
}
