package com.google.protobuf;

import com.google.protobuf.v;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

abstract class o1 extends AbstractMap {

    /* renamed from: e  reason: collision with root package name */
    private final int f8708e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public List f8709f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public Map f8710g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f8711h;

    /* renamed from: i  reason: collision with root package name */
    private volatile g f8712i;
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public Map f8713j;

    /* renamed from: k  reason: collision with root package name */
    private volatile c f8714k;

    static class a extends o1 {
        a(int i10) {
            super(i10, (a) null);
        }

        public void p() {
            if (!o()) {
                for (int i10 = 0; i10 < k(); i10++) {
                    Map.Entry j10 = j(i10);
                    if (((v.b) j10.getKey()).b()) {
                        j10.setValue(Collections.unmodifiableList((List) j10.getValue()));
                    }
                }
                for (Map.Entry entry : m()) {
                    if (((v.b) entry.getKey()).b()) {
                        entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                    }
                }
            }
            o1.super.p();
        }

        public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
            return o1.super.r((v.b) obj, obj2);
        }
    }

    private class b implements Iterator {

        /* renamed from: e  reason: collision with root package name */
        private int f8715e;

        /* renamed from: f  reason: collision with root package name */
        private Iterator f8716f;

        private b() {
            this.f8715e = o1.this.f8709f.size();
        }

        private Iterator b() {
            if (this.f8716f == null) {
                this.f8716f = o1.this.f8713j.entrySet().iterator();
            }
            return this.f8716f;
        }

        /* renamed from: c */
        public Map.Entry next() {
            Object obj;
            if (b().hasNext()) {
                obj = b().next();
            } else {
                List b10 = o1.this.f8709f;
                int i10 = this.f8715e - 1;
                this.f8715e = i10;
                obj = b10.get(i10);
            }
            return (Map.Entry) obj;
        }

        public boolean hasNext() {
            int i10 = this.f8715e;
            return (i10 > 0 && i10 <= o1.this.f8709f.size()) || b().hasNext();
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }

        /* synthetic */ b(o1 o1Var, a aVar) {
            this();
        }
    }

    private class c extends g {
        private c() {
            super(o1.this, (a) null);
        }

        public Iterator iterator() {
            return new b(o1.this, (a) null);
        }

        /* synthetic */ c(o1 o1Var, a aVar) {
            this();
        }
    }

    private static class d {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public static final Iterator f8719a = new a();

        /* renamed from: b  reason: collision with root package name */
        private static final Iterable f8720b = new b();

        static class a implements Iterator {
            a() {
            }

            public boolean hasNext() {
                return false;
            }

            public Object next() {
                throw new NoSuchElementException();
            }

            public void remove() {
                throw new UnsupportedOperationException();
            }
        }

        static class b implements Iterable {
            b() {
            }

            public Iterator iterator() {
                return d.f8719a;
            }
        }

        static Iterable b() {
            return f8720b;
        }
    }

    private class e implements Map.Entry, Comparable {

        /* renamed from: e  reason: collision with root package name */
        private final Comparable f8721e;

        /* renamed from: f  reason: collision with root package name */
        private Object f8722f;

        e(Comparable comparable, Object obj) {
            this.f8721e = comparable;
            this.f8722f = obj;
        }

        private boolean c(Object obj, Object obj2) {
            if (obj == null) {
                return obj2 == null;
            }
            return obj.equals(obj2);
        }

        /* renamed from: a */
        public int compareTo(e eVar) {
            return getKey().compareTo(eVar.getKey());
        }

        /* renamed from: d */
        public Comparable getKey() {
            return this.f8721e;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return c(this.f8721e, entry.getKey()) && c(this.f8722f, entry.getValue());
        }

        public Object getValue() {
            return this.f8722f;
        }

        public int hashCode() {
            Comparable comparable = this.f8721e;
            int i10 = 0;
            int hashCode = comparable == null ? 0 : comparable.hashCode();
            Object obj = this.f8722f;
            if (obj != null) {
                i10 = obj.hashCode();
            }
            return hashCode ^ i10;
        }

        public Object setValue(Object obj) {
            o1.this.g();
            Object obj2 = this.f8722f;
            this.f8722f = obj;
            return obj2;
        }

        public String toString() {
            return this.f8721e + "=" + this.f8722f;
        }

        e(o1 o1Var, Map.Entry entry) {
            this((Comparable) entry.getKey(), entry.getValue());
        }
    }

    private class f implements Iterator {

        /* renamed from: e  reason: collision with root package name */
        private int f8724e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f8725f;

        /* renamed from: g  reason: collision with root package name */
        private Iterator f8726g;

        private f() {
            this.f8724e = -1;
        }

        private Iterator b() {
            if (this.f8726g == null) {
                this.f8726g = o1.this.f8710g.entrySet().iterator();
            }
            return this.f8726g;
        }

        /* renamed from: c */
        public Map.Entry next() {
            this.f8725f = true;
            int i10 = this.f8724e + 1;
            this.f8724e = i10;
            return (Map.Entry) (i10 < o1.this.f8709f.size() ? o1.this.f8709f.get(this.f8724e) : b().next());
        }

        public boolean hasNext() {
            if (this.f8724e + 1 >= o1.this.f8709f.size()) {
                return !o1.this.f8710g.isEmpty() && b().hasNext();
            }
            return true;
        }

        public void remove() {
            if (this.f8725f) {
                this.f8725f = false;
                o1.this.g();
                if (this.f8724e < o1.this.f8709f.size()) {
                    o1 o1Var = o1.this;
                    int i10 = this.f8724e;
                    this.f8724e = i10 - 1;
                    Object unused = o1Var.s(i10);
                    return;
                }
                b().remove();
                return;
            }
            throw new IllegalStateException("remove() was called before next()");
        }

        /* synthetic */ f(o1 o1Var, a aVar) {
            this();
        }
    }

    private class g extends AbstractSet {
        private g() {
        }

        /* renamed from: b */
        public boolean add(Map.Entry entry) {
            if (contains(entry)) {
                return false;
            }
            o1.this.r((Comparable) entry.getKey(), entry.getValue());
            return true;
        }

        public void clear() {
            o1.this.clear();
        }

        public boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = o1.this.get(entry.getKey());
            Object value = entry.getValue();
            return obj2 == value || (obj2 != null && obj2.equals(value));
        }

        public Iterator iterator() {
            return new f(o1.this, (a) null);
        }

        public boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (!contains(entry)) {
                return false;
            }
            o1.this.remove(entry.getKey());
            return true;
        }

        public int size() {
            return o1.this.size();
        }

        /* synthetic */ g(o1 o1Var, a aVar) {
            this();
        }
    }

    private o1(int i10) {
        this.f8708e = i10;
        this.f8709f = Collections.emptyList();
        this.f8710g = Collections.emptyMap();
        this.f8713j = Collections.emptyMap();
    }

    private int f(Comparable comparable) {
        int size = this.f8709f.size() - 1;
        if (size >= 0) {
            int compareTo = comparable.compareTo(((e) this.f8709f.get(size)).getKey());
            if (compareTo > 0) {
                return -(size + 2);
            }
            if (compareTo == 0) {
                return size;
            }
        }
        int i10 = 0;
        while (i10 <= size) {
            int i11 = (i10 + size) / 2;
            int compareTo2 = comparable.compareTo(((e) this.f8709f.get(i11)).getKey());
            if (compareTo2 < 0) {
                size = i11 - 1;
            } else if (compareTo2 <= 0) {
                return i11;
            } else {
                i10 = i11 + 1;
            }
        }
        return -(i10 + 1);
    }

    /* access modifiers changed from: private */
    public void g() {
        if (this.f8711h) {
            throw new UnsupportedOperationException();
        }
    }

    private void i() {
        g();
        if (this.f8709f.isEmpty() && !(this.f8709f instanceof ArrayList)) {
            this.f8709f = new ArrayList(this.f8708e);
        }
    }

    private SortedMap n() {
        g();
        if (this.f8710g.isEmpty() && !(this.f8710g instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f8710g = treeMap;
            this.f8713j = treeMap.descendingMap();
        }
        return (SortedMap) this.f8710g;
    }

    static o1 q(int i10) {
        return new a(i10);
    }

    /* access modifiers changed from: private */
    public Object s(int i10) {
        g();
        Object value = ((e) this.f8709f.remove(i10)).getValue();
        if (!this.f8710g.isEmpty()) {
            Iterator it = n().entrySet().iterator();
            this.f8709f.add(new e(this, (Map.Entry) it.next()));
            it.remove();
        }
        return value;
    }

    public void clear() {
        g();
        if (!this.f8709f.isEmpty()) {
            this.f8709f.clear();
        }
        if (!this.f8710g.isEmpty()) {
            this.f8710g.clear();
        }
    }

    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return f(comparable) >= 0 || this.f8710g.containsKey(comparable);
    }

    public Set entrySet() {
        if (this.f8712i == null) {
            this.f8712i = new g(this, (a) null);
        }
        return this.f8712i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o1)) {
            return super.equals(obj);
        }
        o1 o1Var = (o1) obj;
        int size = size();
        if (size != o1Var.size()) {
            return false;
        }
        int k10 = k();
        if (k10 != o1Var.k()) {
            return entrySet().equals(o1Var.entrySet());
        }
        for (int i10 = 0; i10 < k10; i10++) {
            if (!j(i10).equals(o1Var.j(i10))) {
                return false;
            }
        }
        if (k10 != size) {
            return this.f8710g.equals(o1Var.f8710g);
        }
        return true;
    }

    public Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int f10 = f(comparable);
        return f10 >= 0 ? ((e) this.f8709f.get(f10)).getValue() : this.f8710g.get(comparable);
    }

    /* access modifiers changed from: package-private */
    public Set h() {
        if (this.f8714k == null) {
            this.f8714k = new c(this, (a) null);
        }
        return this.f8714k;
    }

    public int hashCode() {
        int k10 = k();
        int i10 = 0;
        for (int i11 = 0; i11 < k10; i11++) {
            i10 += ((e) this.f8709f.get(i11)).hashCode();
        }
        return l() > 0 ? i10 + this.f8710g.hashCode() : i10;
    }

    public Map.Entry j(int i10) {
        return (Map.Entry) this.f8709f.get(i10);
    }

    public int k() {
        return this.f8709f.size();
    }

    public int l() {
        return this.f8710g.size();
    }

    public Iterable m() {
        return this.f8710g.isEmpty() ? d.b() : this.f8710g.entrySet();
    }

    public boolean o() {
        return this.f8711h;
    }

    public void p() {
        if (!this.f8711h) {
            this.f8710g = this.f8710g.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f8710g);
            this.f8713j = this.f8713j.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f8713j);
            this.f8711h = true;
        }
    }

    public Object r(Comparable comparable, Object obj) {
        g();
        int f10 = f(comparable);
        if (f10 >= 0) {
            return ((e) this.f8709f.get(f10)).setValue(obj);
        }
        i();
        int i10 = -(f10 + 1);
        if (i10 >= this.f8708e) {
            return n().put(comparable, obj);
        }
        int size = this.f8709f.size();
        int i11 = this.f8708e;
        if (size == i11) {
            e eVar = (e) this.f8709f.remove(i11 - 1);
            n().put(eVar.getKey(), eVar.getValue());
        }
        this.f8709f.add(i10, new e(comparable, obj));
        return null;
    }

    public Object remove(Object obj) {
        g();
        Comparable comparable = (Comparable) obj;
        int f10 = f(comparable);
        if (f10 >= 0) {
            return s(f10);
        }
        if (this.f8710g.isEmpty()) {
            return null;
        }
        return this.f8710g.remove(comparable);
    }

    public int size() {
        return this.f8709f.size() + this.f8710g.size();
    }

    /* synthetic */ o1(int i10, a aVar) {
        this(i10);
    }
}
