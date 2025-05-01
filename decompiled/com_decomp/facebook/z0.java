package com.facebook;

import com.facebook.q0;
import db.l;
import java.io.FilterOutputStream;
import java.io.OutputStream;
import java.util.Map;

public final class z0 extends FilterOutputStream implements a1 {

    /* renamed from: e  reason: collision with root package name */
    private final q0 f5033e;

    /* renamed from: f  reason: collision with root package name */
    private final Map f5034f;

    /* renamed from: g  reason: collision with root package name */
    private final long f5035g;

    /* renamed from: h  reason: collision with root package name */
    private final long f5036h = i0.A();

    /* renamed from: i  reason: collision with root package name */
    private long f5037i;

    /* renamed from: j  reason: collision with root package name */
    private long f5038j;

    /* renamed from: k  reason: collision with root package name */
    private b1 f5039k;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public z0(OutputStream outputStream, q0 q0Var, Map map, long j10) {
        super(outputStream);
        l.e(outputStream, "out");
        l.e(q0Var, "requests");
        l.e(map, "progressMap");
        this.f5033e = q0Var;
        this.f5034f = map;
        this.f5035g = j10;
    }

    private final void c(long j10) {
        b1 b1Var = this.f5039k;
        if (b1Var != null) {
            b1Var.a(j10);
        }
        long j11 = this.f5037i + j10;
        this.f5037i = j11;
        if (j11 >= this.f5038j + this.f5036h || j11 >= this.f5035g) {
            g();
        }
    }

    private final void g() {
        if (this.f5037i > this.f5038j) {
            for (q0.a aVar : this.f5033e.p()) {
            }
            this.f5038j = this.f5037i;
        }
    }

    public void a(m0 m0Var) {
        this.f5039k = m0Var != null ? (b1) this.f5034f.get(m0Var) : null;
    }

    public void close() {
        super.close();
        for (b1 c10 : this.f5034f.values()) {
            c10.c();
        }
        g();
    }

    public void write(int i10) {
        this.out.write(i10);
        c(1);
    }

    public void write(byte[] bArr) {
        l.e(bArr, "buffer");
        this.out.write(bArr);
        c((long) bArr.length);
    }

    public void write(byte[] bArr, int i10, int i11) {
        l.e(bArr, "buffer");
        this.out.write(bArr, i10, i11);
        c((long) i11);
    }
}
