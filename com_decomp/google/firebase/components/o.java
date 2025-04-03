package com.google.firebase.components;

import com.google.firebase.inject.Provider;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

class o implements Provider {

    /* renamed from: a  reason: collision with root package name */
    private volatile Set f7769a = Collections.newSetFromMap(new ConcurrentHashMap());

    /* renamed from: b  reason: collision with root package name */
    private volatile Set f7770b = null;

    o(Collection collection) {
        this.f7769a.addAll(collection);
    }

    static o b(Collection collection) {
        return new o((Set) collection);
    }

    private synchronized void d() {
        for (Provider provider : this.f7769a) {
            this.f7770b.add(provider.get());
        }
        this.f7769a = null;
    }

    /* access modifiers changed from: package-private */
    public synchronized void a(Provider provider) {
        Set set;
        Object obj;
        if (this.f7770b == null) {
            set = this.f7769a;
            obj = provider;
        } else {
            set = this.f7770b;
            obj = provider.get();
        }
        set.add(obj);
    }

    /* renamed from: c */
    public Set get() {
        if (this.f7770b == null) {
            synchronized (this) {
                if (this.f7770b == null) {
                    this.f7770b = Collections.newSetFromMap(new ConcurrentHashMap());
                    d();
                }
            }
        }
        return Collections.unmodifiableSet(this.f7770b);
    }
}
