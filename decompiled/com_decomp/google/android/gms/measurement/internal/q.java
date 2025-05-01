package com.google.android.gms.measurement.internal;

import java.util.Iterator;

final class q implements Iterator {

    /* renamed from: e  reason: collision with root package name */
    final Iterator f6340e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ r f6341f;

    q(r rVar) {
        this.f6341f = rVar;
        this.f6340e = rVar.f6371e.keySet().iterator();
    }

    /* renamed from: b */
    public final String next() {
        return (String) this.f6340e.next();
    }

    public final boolean hasNext() {
        return this.f6340e.hasNext();
    }

    public final void remove() {
        throw new UnsupportedOperationException("Remove not supported");
    }
}
