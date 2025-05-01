package androidx.appcompat.view;

import android.view.View;
import android.view.animation.Interpolator;
import androidx.core.view.p0;
import androidx.core.view.q0;
import androidx.core.view.r0;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class h {

    /* renamed from: c, reason: collision with root package name */
    private Interpolator f609c;

    /* renamed from: d, reason: collision with root package name */
    q0 f610d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f611e;

    /* renamed from: b, reason: collision with root package name */
    private long f608b = -1;

    /* renamed from: f, reason: collision with root package name */
    private final r0 f612f = new a();

    /* renamed from: a, reason: collision with root package name */
    final ArrayList f607a = new ArrayList();

    class a extends r0 {

        /* renamed from: a, reason: collision with root package name */
        private boolean f613a = false;

        /* renamed from: b, reason: collision with root package name */
        private int f614b = 0;

        a() {
        }

        @Override // androidx.core.view.q0
        public void b(View view) {
            int i10 = this.f614b + 1;
            this.f614b = i10;
            if (i10 == h.this.f607a.size()) {
                q0 q0Var = h.this.f610d;
                if (q0Var != null) {
                    q0Var.b(null);
                }
                d();
            }
        }

        @Override // androidx.core.view.r0, androidx.core.view.q0
        public void c(View view) {
            if (this.f613a) {
                return;
            }
            this.f613a = true;
            q0 q0Var = h.this.f610d;
            if (q0Var != null) {
                q0Var.c(null);
            }
        }

        void d() {
            this.f614b = 0;
            this.f613a = false;
            h.this.b();
        }
    }

    public void a() {
        if (this.f611e) {
            Iterator it = this.f607a.iterator();
            while (it.hasNext()) {
                ((p0) it.next()).c();
            }
            this.f611e = false;
        }
    }

    void b() {
        this.f611e = false;
    }

    public h c(p0 p0Var) {
        if (!this.f611e) {
            this.f607a.add(p0Var);
        }
        return this;
    }

    public h d(p0 p0Var, p0 p0Var2) {
        this.f607a.add(p0Var);
        p0Var2.k(p0Var.d());
        this.f607a.add(p0Var2);
        return this;
    }

    public h e(long j10) {
        if (!this.f611e) {
            this.f608b = j10;
        }
        return this;
    }

    public h f(Interpolator interpolator) {
        if (!this.f611e) {
            this.f609c = interpolator;
        }
        return this;
    }

    public h g(q0 q0Var) {
        if (!this.f611e) {
            this.f610d = q0Var;
        }
        return this;
    }

    public void h() {
        if (this.f611e) {
            return;
        }
        Iterator it = this.f607a.iterator();
        while (it.hasNext()) {
            p0 p0Var = (p0) it.next();
            long j10 = this.f608b;
            if (j10 >= 0) {
                p0Var.g(j10);
            }
            Interpolator interpolator = this.f609c;
            if (interpolator != null) {
                p0Var.h(interpolator);
            }
            if (this.f610d != null) {
                p0Var.i(this.f612f);
            }
            p0Var.m();
        }
        this.f611e = true;
    }
}