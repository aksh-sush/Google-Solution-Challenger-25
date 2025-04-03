package com.google.common.collect;

import java.util.NoSuchElementException;
import l5.j;

abstract class a extends q0 {

    /* renamed from: e  reason: collision with root package name */
    private final int f7518e;

    /* renamed from: f  reason: collision with root package name */
    private int f7519f;

    protected a(int i10) {
        this(i10, 0);
    }

    /* access modifiers changed from: protected */
    public abstract Object b(int i10);

    public final boolean hasNext() {
        return this.f7519f < this.f7518e;
    }

    public final boolean hasPrevious() {
        return this.f7519f > 0;
    }

    public final Object next() {
        if (hasNext()) {
            int i10 = this.f7519f;
            this.f7519f = i10 + 1;
            return b(i10);
        }
        throw new NoSuchElementException();
    }

    public final int nextIndex() {
        return this.f7519f;
    }

    public final Object previous() {
        if (hasPrevious()) {
            int i10 = this.f7519f - 1;
            this.f7519f = i10;
            return b(i10);
        }
        throw new NoSuchElementException();
    }

    public final int previousIndex() {
        return this.f7519f - 1;
    }

    protected a(int i10, int i11) {
        j.r(i11, i10);
        this.f7518e = i10;
        this.f7519f = i11;
    }
}
