package com.google.android.material.bottomsheet;

import android.view.View;
import androidx.core.view.h1;
import androidx.core.view.u0;
import java.util.Iterator;
import java.util.List;

class a extends u0.b {

    /* renamed from: c  reason: collision with root package name */
    private final View f6828c;

    /* renamed from: d  reason: collision with root package name */
    private int f6829d;

    /* renamed from: e  reason: collision with root package name */
    private int f6830e;

    /* renamed from: f  reason: collision with root package name */
    private final int[] f6831f = new int[2];

    public a(View view) {
        super(0);
        this.f6828c = view;
    }

    public void b(u0 u0Var) {
        this.f6828c.setTranslationY(0.0f);
    }

    public void c(u0 u0Var) {
        this.f6828c.getLocationOnScreen(this.f6831f);
        this.f6829d = this.f6831f[1];
    }

    public h1 d(h1 h1Var, List list) {
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            u0 u0Var = (u0) it.next();
            if ((u0Var.c() & h1.m.a()) != 0) {
                this.f6828c.setTranslationY((float) p4.a.c(this.f6830e, 0, u0Var.b()));
                break;
            }
        }
        return h1Var;
    }

    public u0.a e(u0 u0Var, u0.a aVar) {
        this.f6828c.getLocationOnScreen(this.f6831f);
        int i10 = this.f6829d - this.f6831f[1];
        this.f6830e = i10;
        this.f6828c.setTranslationY((float) i10);
        return aVar;
    }
}
