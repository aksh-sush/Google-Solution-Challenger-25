package com.google.firebase.components;

import com.google.firebase.inject.Deferred;
import com.google.firebase.inject.Provider;

class t implements Provider, Deferred {

    /* renamed from: c  reason: collision with root package name */
    private static final Deferred.DeferredHandler f7773c = new p();

    /* renamed from: d  reason: collision with root package name */
    private static final Provider f7774d = new q();

    /* renamed from: a  reason: collision with root package name */
    private Deferred.DeferredHandler f7775a;

    /* renamed from: b  reason: collision with root package name */
    private volatile Provider f7776b;

    private t(Deferred.DeferredHandler deferredHandler, Provider provider) {
        this.f7775a = deferredHandler;
        this.f7776b = provider;
    }

    static t d() {
        return new t(f7773c, f7774d);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void e(Provider provider) {
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Object f() {
        return null;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void g(Deferred.DeferredHandler deferredHandler, Deferred.DeferredHandler deferredHandler2, Provider provider) {
        deferredHandler.handle(provider);
        deferredHandler2.handle(provider);
    }

    static t h(Provider provider) {
        return new t((Deferred.DeferredHandler) null, provider);
    }

    public Object get() {
        return this.f7776b.get();
    }

    /* access modifiers changed from: package-private */
    public void i(Provider provider) {
        Deferred.DeferredHandler deferredHandler;
        if (this.f7776b == f7774d) {
            synchronized (this) {
                deferredHandler = this.f7775a;
                this.f7775a = null;
                this.f7776b = provider;
            }
            deferredHandler.handle(provider);
            return;
        }
        throw new IllegalStateException("provide() can be called only once.");
    }

    public void whenAvailable(Deferred.DeferredHandler deferredHandler) {
        Provider provider;
        Provider provider2;
        Provider provider3 = this.f7776b;
        Provider provider4 = f7774d;
        if (provider3 != provider4) {
            deferredHandler.handle(provider3);
            return;
        }
        synchronized (this) {
            provider = this.f7776b;
            if (provider != provider4) {
                provider2 = provider;
            } else {
                this.f7775a = new s(this.f7775a, deferredHandler);
                provider2 = null;
            }
        }
        if (provider2 != null) {
            deferredHandler.handle(provider);
        }
    }
}
