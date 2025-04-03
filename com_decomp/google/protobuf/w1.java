package com.google.protobuf;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

public class w1 extends AbstractList implements i0, RandomAccess {
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final i0 f8817e;

    class a implements ListIterator {

        /* renamed from: e  reason: collision with root package name */
        ListIterator f8818e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f8819f;

        a(int i10) {
            this.f8819f = i10;
            this.f8818e = w1.this.f8817e.listIterator(i10);
        }

        /* renamed from: b */
        public void add(String str) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: c */
        public String next() {
            return (String) this.f8818e.next();
        }

        /* renamed from: d */
        public String previous() {
            return (String) this.f8818e.previous();
        }

        /* renamed from: e */
        public void set(String str) {
            throw new UnsupportedOperationException();
        }

        public boolean hasNext() {
            return this.f8818e.hasNext();
        }

        public boolean hasPrevious() {
            return this.f8818e.hasPrevious();
        }

        public int nextIndex() {
            return this.f8818e.nextIndex();
        }

        public int previousIndex() {
            return this.f8818e.previousIndex();
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    class b implements Iterator {

        /* renamed from: e  reason: collision with root package name */
        Iterator f8821e;

        b() {
            this.f8821e = w1.this.f8817e.iterator();
        }

        /* renamed from: b */
        public String next() {
            return (String) this.f8821e.next();
        }

        public boolean hasNext() {
            return this.f8821e.hasNext();
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public w1(i0 i0Var) {
        this.f8817e = i0Var;
    }

    public i0 B() {
        return this;
    }

    public Object G(int i10) {
        return this.f8817e.G(i10);
    }

    public List R() {
        return this.f8817e.R();
    }

    /* renamed from: d */
    public String get(int i10) {
        return (String) this.f8817e.get(i10);
    }

    public Iterator iterator() {
        return new b();
    }

    public ListIterator listIterator(int i10) {
        return new a(i10);
    }

    public void n(j jVar) {
        throw new UnsupportedOperationException();
    }

    public int size() {
        return this.f8817e.size();
    }
}
