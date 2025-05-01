package com.google.android.gms.common.api.internal;

import java.lang.ref.WeakReference;

public final class y0 extends a {

    /* renamed from: a  reason: collision with root package name */
    private final WeakReference f5540a;

    y0(y yVar) {
        this.f5540a = new WeakReference(yVar);
    }

    public final a b(Runnable runnable) {
        y yVar = (y) this.f5540a.get();
        if (yVar != null) {
            yVar.c(runnable);
            return this;
        }
        throw new IllegalStateException("The target activity has already been GC'd");
    }
}
