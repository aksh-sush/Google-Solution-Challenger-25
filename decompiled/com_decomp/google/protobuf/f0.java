package com.google.protobuf;

import java.util.Iterator;
import java.util.Map;

public abstract class f0 extends g0 {

    static class a implements Map.Entry {
        public abstract f0 a();
    }

    static class b implements Iterator {

        /* renamed from: e  reason: collision with root package name */
        private Iterator f8572e;

        public b(Iterator it) {
            this.f8572e = it;
        }

        /* renamed from: b */
        public Map.Entry next() {
            Map.Entry entry = (Map.Entry) this.f8572e.next();
            entry.getValue();
            return entry;
        }

        public boolean hasNext() {
            return this.f8572e.hasNext();
        }

        public void remove() {
            this.f8572e.remove();
        }
    }
}
