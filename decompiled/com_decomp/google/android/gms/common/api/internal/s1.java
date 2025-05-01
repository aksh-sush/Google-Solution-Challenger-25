package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.d;

public final class s1 extends f0 {

    /* renamed from: c  reason: collision with root package name */
    private final d f5490c;

    public s1(d dVar) {
        super("Method is not supported by connectionless client. APIs supporting connectionless client must not call this method.");
        this.f5490c = dVar;
    }

    public final e f(e eVar) {
        return this.f5490c.doRead(eVar);
    }

    public final e g(e eVar) {
        return this.f5490c.doWrite(eVar);
    }

    public final Context j() {
        return this.f5490c.getApplicationContext();
    }

    public final Looper k() {
        return this.f5490c.getLooper();
    }
}
