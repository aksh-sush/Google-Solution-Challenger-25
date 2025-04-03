package com.google.firebase.messaging;

import android.content.Context;
import android.content.SharedPreferences;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

final class q0 {

    /* renamed from: d  reason: collision with root package name */
    private static WeakReference f8445d;

    /* renamed from: a  reason: collision with root package name */
    private final SharedPreferences f8446a;

    /* renamed from: b  reason: collision with root package name */
    private m0 f8447b;

    /* renamed from: c  reason: collision with root package name */
    private final Executor f8448c;

    private q0(SharedPreferences sharedPreferences, Executor executor) {
        this.f8448c = executor;
        this.f8446a = sharedPreferences;
    }

    public static synchronized q0 b(Context context, Executor executor) {
        synchronized (q0.class) {
            WeakReference weakReference = f8445d;
            q0 q0Var = weakReference != null ? (q0) weakReference.get() : null;
            if (q0Var != null) {
                return q0Var;
            }
            q0 q0Var2 = new q0(context.getSharedPreferences("com.google.android.gms.appid", 0), executor);
            q0Var2.d();
            f8445d = new WeakReference(q0Var2);
            return q0Var2;
        }
    }

    private synchronized void d() {
        this.f8447b = m0.d(this.f8446a, "topic_operation_queue", ",", this.f8448c);
    }

    /* access modifiers changed from: package-private */
    public synchronized boolean a(p0 p0Var) {
        return this.f8447b.a(p0Var.e());
    }

    /* access modifiers changed from: package-private */
    public synchronized p0 c() {
        return p0.a(this.f8447b.f());
    }

    /* access modifiers changed from: package-private */
    public synchronized boolean e(p0 p0Var) {
        return this.f8447b.g(p0Var.e());
    }
}
