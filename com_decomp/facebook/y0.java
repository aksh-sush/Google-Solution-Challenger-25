package com.facebook;

import android.os.Handler;
import db.l;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

public final class y0 extends OutputStream implements a1 {

    /* renamed from: e  reason: collision with root package name */
    private final Handler f5028e;

    /* renamed from: f  reason: collision with root package name */
    private final Map f5029f = new HashMap();

    /* renamed from: g  reason: collision with root package name */
    private m0 f5030g;

    /* renamed from: h  reason: collision with root package name */
    private b1 f5031h;

    /* renamed from: i  reason: collision with root package name */
    private int f5032i;

    public y0(Handler handler) {
        this.f5028e = handler;
    }

    public void a(m0 m0Var) {
        this.f5030g = m0Var;
        this.f5031h = m0Var != null ? (b1) this.f5029f.get(m0Var) : null;
    }

    public final void c(long j10) {
        m0 m0Var = this.f5030g;
        if (m0Var != null) {
            if (this.f5031h == null) {
                b1 b1Var = new b1(this.f5028e, m0Var);
                this.f5031h = b1Var;
                this.f5029f.put(m0Var, b1Var);
            }
            b1 b1Var2 = this.f5031h;
            if (b1Var2 != null) {
                b1Var2.b(j10);
            }
            this.f5032i += (int) j10;
        }
    }

    public final int g() {
        return this.f5032i;
    }

    public final Map h() {
        return this.f5029f;
    }

    public void write(int i10) {
        c(1);
    }

    public void write(byte[] bArr) {
        l.e(bArr, "buffer");
        c((long) bArr.length);
    }

    public void write(byte[] bArr, int i10, int i11) {
        l.e(bArr, "buffer");
        c((long) i11);
    }
}
