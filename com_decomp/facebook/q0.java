package com.facebook;

import android.os.Handler;
import db.g;
import db.l;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public final class q0 extends AbstractList {

    /* renamed from: k  reason: collision with root package name */
    public static final b f4939k = new b((g) null);

    /* renamed from: l  reason: collision with root package name */
    private static final AtomicInteger f4940l = new AtomicInteger();

    /* renamed from: e  reason: collision with root package name */
    private Handler f4941e;

    /* renamed from: f  reason: collision with root package name */
    private int f4942f;

    /* renamed from: g  reason: collision with root package name */
    private final String f4943g = String.valueOf(Integer.valueOf(f4940l.incrementAndGet()));

    /* renamed from: h  reason: collision with root package name */
    private List f4944h;

    /* renamed from: i  reason: collision with root package name */
    private List f4945i = new ArrayList();

    /* renamed from: j  reason: collision with root package name */
    private String f4946j;

    public interface a {
        void a(q0 q0Var);
    }

    public static final class b {
        private b() {
        }

        public /* synthetic */ b(g gVar) {
            this();
        }
    }

    public q0(Collection collection) {
        l.e(collection, "requests");
        this.f4944h = new ArrayList(collection);
    }

    private final List i() {
        return m0.f4893n.i(this);
    }

    private final p0 k() {
        return m0.f4893n.l(this);
    }

    public final void A(Handler handler) {
        this.f4941e = handler;
    }

    /* renamed from: b */
    public void add(int i10, m0 m0Var) {
        l.e(m0Var, "element");
        this.f4944h.add(i10, m0Var);
    }

    public void clear() {
        this.f4944h.clear();
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj == null ? true : obj instanceof m0)) {
            return false;
        }
        return f((m0) obj);
    }

    /* renamed from: d */
    public boolean add(m0 m0Var) {
        l.e(m0Var, "element");
        return this.f4944h.add(m0Var);
    }

    public final void e(a aVar) {
        l.e(aVar, "callback");
        if (!this.f4945i.contains(aVar)) {
            this.f4945i.add(aVar);
        }
    }

    public /* bridge */ boolean f(m0 m0Var) {
        return super.contains(m0Var);
    }

    public final List h() {
        return i();
    }

    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj == null ? true : obj instanceof m0)) {
            return -1;
        }
        return u((m0) obj);
    }

    public final p0 j() {
        return k();
    }

    /* renamed from: l */
    public m0 get(int i10) {
        return (m0) this.f4944h.get(i10);
    }

    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj == null ? true : obj instanceof m0)) {
            return -1;
        }
        return v((m0) obj);
    }

    public final String m() {
        return this.f4946j;
    }

    public final Handler o() {
        return this.f4941e;
    }

    public final List p() {
        return this.f4945i;
    }

    public final String q() {
        return this.f4943g;
    }

    public final List r() {
        return this.f4944h;
    }

    public int s() {
        return this.f4944h.size();
    }

    public final /* bridge */ int size() {
        return s();
    }

    public final int t() {
        return this.f4942f;
    }

    public /* bridge */ int u(m0 m0Var) {
        return super.indexOf(m0Var);
    }

    public /* bridge */ int v(m0 m0Var) {
        return super.lastIndexOf(m0Var);
    }

    /* renamed from: w */
    public final /* bridge */ m0 remove(int i10) {
        return y(i10);
    }

    public /* bridge */ boolean x(m0 m0Var) {
        return super.remove(m0Var);
    }

    public m0 y(int i10) {
        return (m0) this.f4944h.remove(i10);
    }

    /* renamed from: z */
    public m0 set(int i10, m0 m0Var) {
        l.e(m0Var, "element");
        return (m0) this.f4944h.set(i10, m0Var);
    }

    public q0(m0... m0VarArr) {
        l.e(m0VarArr, "requests");
        this.f4944h = new ArrayList(i.b(m0VarArr));
    }

    public final /* bridge */ boolean remove(Object obj) {
        if (!(obj == null ? true : obj instanceof m0)) {
            return false;
        }
        return x((m0) obj);
    }
}
