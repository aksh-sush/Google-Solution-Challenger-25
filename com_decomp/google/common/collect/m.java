package com.google.common.collect;

import java.io.Serializable;

class m extends c implements Serializable {

    /* renamed from: e  reason: collision with root package name */
    final Object f7614e;

    /* renamed from: f  reason: collision with root package name */
    final Object f7615f;

    m(Object obj, Object obj2) {
        this.f7614e = obj;
        this.f7615f = obj2;
    }

    public final Object getKey() {
        return this.f7614e;
    }

    public final Object getValue() {
        return this.f7615f;
    }

    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
