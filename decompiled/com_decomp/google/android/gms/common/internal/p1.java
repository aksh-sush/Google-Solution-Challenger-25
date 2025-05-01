package com.google.android.gms.common.internal;

import android.util.Log;

public abstract class p1 {

    /* renamed from: a  reason: collision with root package name */
    private Object f5684a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f5685b = false;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ c f5686c;

    public p1(c cVar, Object obj) {
        this.f5686c = cVar;
        this.f5684a = obj;
    }

    /* access modifiers changed from: protected */
    public abstract void a(Object obj);

    /* access modifiers changed from: protected */
    public abstract void b();

    public final void c() {
        Object obj;
        synchronized (this) {
            obj = this.f5684a;
            if (this.f5685b) {
                String obj2 = toString();
                Log.w("GmsClient", "Callback proxy " + obj2 + " being reused. This is not safe.");
            }
        }
        if (obj != null) {
            a(obj);
        }
        synchronized (this) {
            this.f5685b = true;
        }
        e();
    }

    public final void d() {
        synchronized (this) {
            this.f5684a = null;
        }
    }

    public final void e() {
        d();
        synchronized (this.f5686c.zzt) {
            this.f5686c.zzt.remove(this);
        }
    }
}
