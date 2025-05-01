package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CompoundButton;

/* loaded from: classes.dex */
class i {

    /* renamed from: a, reason: collision with root package name */
    private final CompoundButton f1180a;

    /* renamed from: b, reason: collision with root package name */
    private ColorStateList f1181b = null;

    /* renamed from: c, reason: collision with root package name */
    private PorterDuff.Mode f1182c = null;

    /* renamed from: d, reason: collision with root package name */
    private boolean f1183d = false;

    /* renamed from: e, reason: collision with root package name */
    private boolean f1184e = false;

    /* renamed from: f, reason: collision with root package name */
    private boolean f1185f;

    i(CompoundButton compoundButton) {
        this.f1180a = compoundButton;
    }

    void a() {
        Drawable a10 = androidx.core.widget.c.a(this.f1180a);
        if (a10 != null) {
            if (this.f1183d || this.f1184e) {
                Drawable mutate = androidx.core.graphics.drawable.a.r(a10).mutate();
                if (this.f1183d) {
                    androidx.core.graphics.drawable.a.o(mutate, this.f1181b);
                }
                if (this.f1184e) {
                    androidx.core.graphics.drawable.a.p(mutate, this.f1182c);
                }
                if (mutate.isStateful()) {
                    mutate.setState(this.f1180a.getDrawableState());
                }
                this.f1180a.setButtonDrawable(mutate);
            }
        }
    }

    int b(int i10) {
        return i10;
    }

    ColorStateList c() {
        return this.f1181b;
    }

    PorterDuff.Mode d() {
        return this.f1182c;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003e A[Catch: all -> 0x0085, TRY_ENTER, TryCatch #1 {all -> 0x0085, blocks: (B:3:0x001d, B:5:0x0025, B:8:0x002b, B:11:0x003e, B:13:0x0046, B:15:0x004c, B:16:0x0059, B:18:0x0061, B:19:0x006a, B:21:0x0072), top: B:2:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0061 A[Catch: all -> 0x0085, TryCatch #1 {all -> 0x0085, blocks: (B:3:0x001d, B:5:0x0025, B:8:0x002b, B:11:0x003e, B:13:0x0046, B:15:0x004c, B:16:0x0059, B:18:0x0061, B:19:0x006a, B:21:0x0072), top: B:2:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0072 A[Catch: all -> 0x0085, TRY_LEAVE, TryCatch #1 {all -> 0x0085, blocks: (B:3:0x001d, B:5:0x0025, B:8:0x002b, B:11:0x003e, B:13:0x0046, B:15:0x004c, B:16:0x0059, B:18:0x0061, B:19:0x006a, B:21:0x0072), top: B:2:0x001d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void e(android.util.AttributeSet r10, int r11) {
        /*
            r9 = this;
            android.widget.CompoundButton r0 = r9.f1180a
            android.content.Context r0 = r0.getContext()
            int[] r3 = f.j.U0
            r8 = 0
            androidx.appcompat.widget.f1 r0 = androidx.appcompat.widget.f1.v(r0, r10, r3, r11, r8)
            android.widget.CompoundButton r1 = r9.f1180a
            android.content.Context r2 = r1.getContext()
            android.content.res.TypedArray r5 = r0.r()
            r7 = 0
            r4 = r10
            r6 = r11
            androidx.core.view.h0.q0(r1, r2, r3, r4, r5, r6, r7)
            int r10 = f.j.W0     // Catch: java.lang.Throwable -> L85
            boolean r11 = r0.s(r10)     // Catch: java.lang.Throwable -> L85
            if (r11 == 0) goto L3b
            int r10 = r0.n(r10, r8)     // Catch: java.lang.Throwable -> L85
            if (r10 == 0) goto L3b
            android.widget.CompoundButton r11 = r9.f1180a     // Catch: android.content.res.Resources.NotFoundException -> L3a java.lang.Throwable -> L85
            android.content.Context r1 = r11.getContext()     // Catch: android.content.res.Resources.NotFoundException -> L3a java.lang.Throwable -> L85
            android.graphics.drawable.Drawable r10 = g.a.b(r1, r10)     // Catch: android.content.res.Resources.NotFoundException -> L3a java.lang.Throwable -> L85
            r11.setButtonDrawable(r10)     // Catch: android.content.res.Resources.NotFoundException -> L3a java.lang.Throwable -> L85
            r10 = 1
            goto L3c
        L3a:
        L3b:
            r10 = 0
        L3c:
            if (r10 != 0) goto L59
            int r10 = f.j.V0     // Catch: java.lang.Throwable -> L85
            boolean r11 = r0.s(r10)     // Catch: java.lang.Throwable -> L85
            if (r11 == 0) goto L59
            int r10 = r0.n(r10, r8)     // Catch: java.lang.Throwable -> L85
            if (r10 == 0) goto L59
            android.widget.CompoundButton r11 = r9.f1180a     // Catch: java.lang.Throwable -> L85
            android.content.Context r1 = r11.getContext()     // Catch: java.lang.Throwable -> L85
            android.graphics.drawable.Drawable r10 = g.a.b(r1, r10)     // Catch: java.lang.Throwable -> L85
            r11.setButtonDrawable(r10)     // Catch: java.lang.Throwable -> L85
        L59:
            int r10 = f.j.X0     // Catch: java.lang.Throwable -> L85
            boolean r11 = r0.s(r10)     // Catch: java.lang.Throwable -> L85
            if (r11 == 0) goto L6a
            android.widget.CompoundButton r11 = r9.f1180a     // Catch: java.lang.Throwable -> L85
            android.content.res.ColorStateList r10 = r0.c(r10)     // Catch: java.lang.Throwable -> L85
            androidx.core.widget.c.d(r11, r10)     // Catch: java.lang.Throwable -> L85
        L6a:
            int r10 = f.j.Y0     // Catch: java.lang.Throwable -> L85
            boolean r11 = r0.s(r10)     // Catch: java.lang.Throwable -> L85
            if (r11 == 0) goto L81
            android.widget.CompoundButton r11 = r9.f1180a     // Catch: java.lang.Throwable -> L85
            r1 = -1
            int r10 = r0.k(r10, r1)     // Catch: java.lang.Throwable -> L85
            r1 = 0
            android.graphics.PorterDuff$Mode r10 = androidx.appcompat.widget.o0.e(r10, r1)     // Catch: java.lang.Throwable -> L85
            androidx.core.widget.c.e(r11, r10)     // Catch: java.lang.Throwable -> L85
        L81:
            r0.w()
            return
        L85:
            r10 = move-exception
            r0.w()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.i.e(android.util.AttributeSet, int):void");
    }

    void f() {
        if (this.f1185f) {
            this.f1185f = false;
        } else {
            this.f1185f = true;
            a();
        }
    }

    void g(ColorStateList colorStateList) {
        this.f1181b = colorStateList;
        this.f1183d = true;
        a();
    }

    void h(PorterDuff.Mode mode) {
        this.f1182c = mode;
        this.f1184e = true;
        a();
    }
}