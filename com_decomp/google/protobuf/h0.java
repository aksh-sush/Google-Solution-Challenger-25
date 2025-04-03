package com.google.protobuf;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

public class h0 extends c implements i0, RandomAccess {

    /* renamed from: g  reason: collision with root package name */
    private static final h0 f8590g;

    /* renamed from: h  reason: collision with root package name */
    public static final i0 f8591h;

    /* renamed from: f  reason: collision with root package name */
    private final List f8592f;

    static {
        h0 h0Var = new h0();
        f8590g = h0Var;
        h0Var.c();
        f8591h = h0Var;
    }

    public h0() {
        this(10);
    }

    private static String e(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        return obj instanceof j ? ((j) obj).L() : c0.j((byte[]) obj);
    }

    public i0 B() {
        return T() ? new w1(this) : this;
    }

    public Object G(int i10) {
        return this.f8592f.get(i10);
    }

    public List R() {
        return Collections.unmodifiableList(this.f8592f);
    }

    public /* bridge */ /* synthetic */ boolean T() {
        return super.T();
    }

    public boolean addAll(int i10, Collection collection) {
        b();
        if (collection instanceof i0) {
            collection = ((i0) collection).R();
        }
        boolean addAll = this.f8592f.addAll(i10, collection);
        this.modCount++;
        return addAll;
    }

    public void clear() {
        b();
        this.f8592f.clear();
        this.modCount++;
    }

    /* renamed from: d */
    public void add(int i10, String str) {
        b();
        this.f8592f.add(i10, str);
        this.modCount++;
    }

    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    /* renamed from: f */
    public String get(int i10) {
        Object obj = this.f8592f.get(i10);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof j) {
            j jVar = (j) obj;
            String L = jVar.L();
            if (jVar.w()) {
                this.f8592f.set(i10, L);
            }
            return L;
        }
        byte[] bArr = (byte[]) obj;
        String j10 = c0.j(bArr);
        if (c0.g(bArr)) {
            this.f8592f.set(i10, j10);
        }
        return j10;
    }

    /* renamed from: h */
    public h0 a(int i10) {
        if (i10 >= size()) {
            ArrayList arrayList = new ArrayList(i10);
            arrayList.addAll(this.f8592f);
            return new h0(arrayList);
        }
        throw new IllegalArgumentException();
    }

    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    /* renamed from: i */
    public String remove(int i10) {
        b();
        Object remove = this.f8592f.remove(i10);
        this.modCount++;
        return e(remove);
    }

    /* renamed from: j */
    public String set(int i10, String str) {
        b();
        return e(this.f8592f.set(i10, str));
    }

    public void n(j jVar) {
        b();
        this.f8592f.add(jVar);
        this.modCount++;
    }

    public /* bridge */ /* synthetic */ boolean removeAll(Collection collection) {
        return super.removeAll(collection);
    }

    public /* bridge */ /* synthetic */ boolean retainAll(Collection collection) {
        return super.retainAll(collection);
    }

    public int size() {
        return this.f8592f.size();
    }

    public h0(int i10) {
        this(new ArrayList(i10));
    }

    public boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }

    public /* bridge */ /* synthetic */ boolean remove(Object obj) {
        return super.remove(obj);
    }

    private h0(ArrayList arrayList) {
        this.f8592f = arrayList;
    }
}
