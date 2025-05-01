package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.s;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

final class j4 extends FutureTask implements Comparable {

    /* renamed from: e  reason: collision with root package name */
    private final long f6106e;

    /* renamed from: f  reason: collision with root package name */
    final boolean f6107f;

    /* renamed from: g  reason: collision with root package name */
    private final String f6108g;

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ l4 f6109h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    j4(l4 l4Var, Runnable runnable, boolean z10, String str) {
        super(runnable, (Object) null);
        this.f6109h = l4Var;
        s.k(str);
        long andIncrement = l4.f6160l.getAndIncrement();
        this.f6106e = andIncrement;
        this.f6108g = str;
        this.f6107f = z10;
        if (andIncrement == Long.MAX_VALUE) {
            l4Var.f5994a.d().r().a("Tasks index overflow");
        }
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        j4 j4Var = (j4) obj;
        boolean z10 = this.f6107f;
        if (z10 != j4Var.f6107f) {
            return !z10 ? 1 : -1;
        }
        int i10 = (this.f6106e > j4Var.f6106e ? 1 : (this.f6106e == j4Var.f6106e ? 0 : -1));
        if (i10 < 0) {
            return -1;
        }
        if (i10 > 0) {
            return 1;
        }
        this.f6109h.f5994a.d().t().b("Two tasks share the same index. index", Long.valueOf(this.f6106e));
        return 0;
    }

    /* access modifiers changed from: protected */
    public final void setException(Throwable th) {
        this.f6109h.f5994a.d().r().b(this.f6108g, th);
        super.setException(th);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    j4(l4 l4Var, Callable callable, boolean z10, String str) {
        super(callable);
        this.f6109h = l4Var;
        s.k("Task exception on worker thread");
        long andIncrement = l4.f6160l.getAndIncrement();
        this.f6106e = andIncrement;
        this.f6108g = "Task exception on worker thread";
        this.f6107f = z10;
        if (andIncrement == Long.MAX_VALUE) {
            l4Var.f5994a.d().r().a("Tasks index overflow");
        }
    }
}
