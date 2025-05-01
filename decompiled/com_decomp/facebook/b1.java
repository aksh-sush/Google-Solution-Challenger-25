package com.facebook;

import android.os.Handler;
import db.l;

public final class b1 {

    /* renamed from: a  reason: collision with root package name */
    private final Handler f4704a;

    /* renamed from: b  reason: collision with root package name */
    private final m0 f4705b;

    /* renamed from: c  reason: collision with root package name */
    private final long f4706c = i0.A();

    /* renamed from: d  reason: collision with root package name */
    private long f4707d;

    /* renamed from: e  reason: collision with root package name */
    private long f4708e;

    /* renamed from: f  reason: collision with root package name */
    private long f4709f;

    public b1(Handler handler, m0 m0Var) {
        l.e(m0Var, "request");
        this.f4704a = handler;
        this.f4705b = m0Var;
    }

    public final void a(long j10) {
        long j11 = this.f4707d + j10;
        this.f4707d = j11;
        if (j11 >= this.f4708e + this.f4706c || j11 >= this.f4709f) {
            c();
        }
    }

    public final void b(long j10) {
        this.f4709f += j10;
    }

    public final void c() {
        if (this.f4707d > this.f4708e) {
            this.f4705b.o();
        }
    }
}
