package com.google.android.material.internal;

import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import androidx.core.util.h;
import com.google.android.gms.common.api.a;
import java.lang.reflect.Constructor;

final class o {

    /* renamed from: n  reason: collision with root package name */
    static final int f7180n = (Build.VERSION.SDK_INT >= 23 ? 1 : 0);

    /* renamed from: o  reason: collision with root package name */
    private static boolean f7181o;

    /* renamed from: p  reason: collision with root package name */
    private static Constructor f7182p;

    /* renamed from: q  reason: collision with root package name */
    private static Object f7183q;

    /* renamed from: a  reason: collision with root package name */
    private CharSequence f7184a;

    /* renamed from: b  reason: collision with root package name */
    private final TextPaint f7185b;

    /* renamed from: c  reason: collision with root package name */
    private final int f7186c;

    /* renamed from: d  reason: collision with root package name */
    private int f7187d = 0;

    /* renamed from: e  reason: collision with root package name */
    private int f7188e;

    /* renamed from: f  reason: collision with root package name */
    private Layout.Alignment f7189f;

    /* renamed from: g  reason: collision with root package name */
    private int f7190g;

    /* renamed from: h  reason: collision with root package name */
    private float f7191h;

    /* renamed from: i  reason: collision with root package name */
    private float f7192i;

    /* renamed from: j  reason: collision with root package name */
    private int f7193j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f7194k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f7195l;

    /* renamed from: m  reason: collision with root package name */
    private TextUtils.TruncateAt f7196m;

    static class a extends Exception {
        a(Throwable th) {
            super("Error thrown initializing StaticLayout " + th.getMessage(), th);
        }
    }

    private o(CharSequence charSequence, TextPaint textPaint, int i10) {
        this.f7184a = charSequence;
        this.f7185b = textPaint;
        this.f7186c = i10;
        this.f7188e = charSequence.length();
        this.f7189f = Layout.Alignment.ALIGN_NORMAL;
        this.f7190g = a.e.API_PRIORITY_OTHER;
        this.f7191h = 0.0f;
        this.f7192i = 1.0f;
        this.f7193j = f7180n;
        this.f7194k = true;
        this.f7196m = null;
    }

    private void b() {
        if (!f7181o) {
            try {
                Class<TextDirectionHeuristic> cls = TextDirectionHeuristic.class;
                f7183q = this.f7195l && Build.VERSION.SDK_INT >= 23 ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
                Class cls2 = Integer.TYPE;
                Class cls3 = Float.TYPE;
                Constructor<StaticLayout> declaredConstructor = StaticLayout.class.getDeclaredConstructor(new Class[]{CharSequence.class, cls2, cls2, TextPaint.class, cls2, Layout.Alignment.class, cls, cls3, cls3, Boolean.TYPE, TextUtils.TruncateAt.class, cls2, cls2});
                f7182p = declaredConstructor;
                declaredConstructor.setAccessible(true);
                f7181o = true;
            } catch (Exception e10) {
                throw new a(e10);
            }
        }
    }

    public static o c(CharSequence charSequence, TextPaint textPaint, int i10) {
        return new o(charSequence, textPaint, i10);
    }

    public StaticLayout a() {
        if (this.f7184a == null) {
            this.f7184a = "";
        }
        int max = Math.max(0, this.f7186c);
        CharSequence charSequence = this.f7184a;
        if (this.f7190g == 1) {
            charSequence = TextUtils.ellipsize(charSequence, this.f7185b, (float) max, this.f7196m);
        }
        int min = Math.min(charSequence.length(), this.f7188e);
        this.f7188e = min;
        if (Build.VERSION.SDK_INT >= 23) {
            if (this.f7195l && this.f7190g == 1) {
                this.f7189f = Layout.Alignment.ALIGN_OPPOSITE;
            }
            StaticLayout.Builder a10 = StaticLayout.Builder.obtain(charSequence, this.f7187d, min, this.f7185b, max);
            StaticLayout.Builder unused = a10.setAlignment(this.f7189f);
            StaticLayout.Builder unused2 = a10.setIncludePad(this.f7194k);
            StaticLayout.Builder unused3 = a10.setTextDirection(this.f7195l ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
            TextUtils.TruncateAt truncateAt = this.f7196m;
            if (truncateAt != null) {
                StaticLayout.Builder unused4 = a10.setEllipsize(truncateAt);
            }
            StaticLayout.Builder unused5 = a10.setMaxLines(this.f7190g);
            float f10 = this.f7191h;
            if (!(f10 == 0.0f && this.f7192i == 1.0f)) {
                StaticLayout.Builder unused6 = a10.setLineSpacing(f10, this.f7192i);
            }
            if (this.f7190g > 1) {
                StaticLayout.Builder unused7 = a10.setHyphenationFrequency(this.f7193j);
            }
            return a10.build();
        }
        b();
        try {
            return (StaticLayout) ((Constructor) h.g(f7182p)).newInstance(new Object[]{charSequence, Integer.valueOf(this.f7187d), Integer.valueOf(this.f7188e), this.f7185b, Integer.valueOf(max), this.f7189f, h.g(f7183q), Float.valueOf(1.0f), Float.valueOf(0.0f), Boolean.valueOf(this.f7194k), null, Integer.valueOf(max), Integer.valueOf(this.f7190g)});
        } catch (Exception e10) {
            throw new a(e10);
        }
    }

    public o d(Layout.Alignment alignment) {
        this.f7189f = alignment;
        return this;
    }

    public o e(TextUtils.TruncateAt truncateAt) {
        this.f7196m = truncateAt;
        return this;
    }

    public o f(int i10) {
        this.f7193j = i10;
        return this;
    }

    public o g(boolean z10) {
        this.f7194k = z10;
        return this;
    }

    public o h(boolean z10) {
        this.f7195l = z10;
        return this;
    }

    public o i(float f10, float f11) {
        this.f7191h = f10;
        this.f7192i = f11;
        return this;
    }

    public o j(int i10) {
        this.f7190g = i10;
        return this;
    }

    public o k(p pVar) {
        return this;
    }
}
