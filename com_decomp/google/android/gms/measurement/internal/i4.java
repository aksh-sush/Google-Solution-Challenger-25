package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.s;
import java.lang.Thread;

final class i4 implements Thread.UncaughtExceptionHandler {

    /* renamed from: a  reason: collision with root package name */
    private final String f6039a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ l4 f6040b;

    public i4(l4 l4Var, String str) {
        this.f6040b = l4Var;
        s.k(str);
        this.f6039a = str;
    }

    public final synchronized void uncaughtException(Thread thread, Throwable th) {
        this.f6040b.f5994a.d().r().b(this.f6039a, th);
    }
}
