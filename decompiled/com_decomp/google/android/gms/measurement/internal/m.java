package com.google.android.gms.measurement.internal;

import android.os.Handler;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.internal.measurement.zzby;

abstract class m {

    /* renamed from: d  reason: collision with root package name */
    private static volatile Handler f6189d;

    /* renamed from: a  reason: collision with root package name */
    private final i5 f6190a;

    /* renamed from: b  reason: collision with root package name */
    private final Runnable f6191b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public volatile long f6192c;

    m(i5 i5Var) {
        s.k(i5Var);
        this.f6190a = i5Var;
        this.f6191b = new l(this, i5Var);
    }

    private final Handler f() {
        Handler handler;
        if (f6189d != null) {
            return f6189d;
        }
        synchronized (m.class) {
            if (f6189d == null) {
                f6189d = new zzby(this.f6190a.c().getMainLooper());
            }
            handler = f6189d;
        }
        return handler;
    }

    /* access modifiers changed from: package-private */
    public final void b() {
        this.f6192c = 0;
        f().removeCallbacks(this.f6191b);
    }

    public abstract void c();

    public final void d(long j10) {
        b();
        if (j10 >= 0) {
            this.f6192c = this.f6190a.e().currentTimeMillis();
            if (!f().postDelayed(this.f6191b, j10)) {
                this.f6190a.d().r().b("Failed to schedule delayed post. time", Long.valueOf(j10));
            }
        }
    }

    public final boolean e() {
        return this.f6192c != 0;
    }
}
