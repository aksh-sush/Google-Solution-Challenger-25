package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.LocaleList;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import androidx.core.content.res.h;
import java.lang.ref.WeakReference;
import java.util.Locale;

/* loaded from: classes.dex */
class b0 {

    /* renamed from: a, reason: collision with root package name */
    private final TextView f1065a;

    /* renamed from: b, reason: collision with root package name */
    private d1 f1066b;

    /* renamed from: c, reason: collision with root package name */
    private d1 f1067c;

    /* renamed from: d, reason: collision with root package name */
    private d1 f1068d;

    /* renamed from: e, reason: collision with root package name */
    private d1 f1069e;

    /* renamed from: f, reason: collision with root package name */
    private d1 f1070f;

    /* renamed from: g, reason: collision with root package name */
    private d1 f1071g;

    /* renamed from: h, reason: collision with root package name */
    private d1 f1072h;

    /* renamed from: i, reason: collision with root package name */
    private final d0 f1073i;

    /* renamed from: j, reason: collision with root package name */
    private int f1074j = 0;

    /* renamed from: k, reason: collision with root package name */
    private int f1075k = -1;

    /* renamed from: l, reason: collision with root package name */
    private Typeface f1076l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f1077m;

    class a extends h.e {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f1078a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f1079b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ WeakReference f1080c;

        a(int i10, int i11, WeakReference weakReference) {
            this.f1078a = i10;
            this.f1079b = i11;
            this.f1080c = weakReference;
        }

        @Override // androidx.core.content.res.h.e
        /* renamed from: h */
        public void f(int i10) {
        }

        @Override // androidx.core.content.res.h.e
        /* renamed from: i */
        public void g(Typeface typeface) {
            int i10;
            if (Build.VERSION.SDK_INT >= 28 && (i10 = this.f1078a) != -1) {
                typeface = g.a(typeface, i10, (this.f1079b & 2) != 0);
            }
            b0.this.n(this.f1080c, typeface);
        }
    }

    class b implements Runnable {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ TextView f1082e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Typeface f1083f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f1084g;

        b(TextView textView, Typeface typeface, int i10) {
            this.f1082e = textView;
            this.f1083f = typeface;
            this.f1084g = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f1082e.setTypeface(this.f1083f, this.f1084g);
        }
    }

    static class c {
        static Drawable[] a(TextView textView) {
            return textView.getCompoundDrawablesRelative();
        }

        static void b(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        }

        static void c(TextView textView, Locale locale) {
            textView.setTextLocale(locale);
        }
    }

    static class d {
        static Locale a(String str) {
            return Locale.forLanguageTag(str);
        }
    }

    static class e {
        static LocaleList a(String str) {
            return LocaleList.forLanguageTags(str);
        }

        static void b(TextView textView, LocaleList localeList) {
            textView.setTextLocales(localeList);
        }
    }

    static class f {
        static int a(TextView textView) {
            return textView.getAutoSizeStepGranularity();
        }

        static void b(TextView textView, int i10, int i11, int i12, int i13) {
            textView.setAutoSizeTextTypeUniformWithConfiguration(i10, i11, i12, i13);
        }

        static void c(TextView textView, int[] iArr, int i10) {
            textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i10);
        }

        static boolean d(TextView textView, String str) {
            return textView.setFontVariationSettings(str);
        }
    }

    static class g {
        static Typeface a(Typeface typeface, int i10, boolean z10) {
            return Typeface.create(typeface, i10, z10);
        }
    }

    b0(TextView textView) {
        this.f1065a = textView;
        this.f1073i = new d0(textView);
    }

    private void B(int i10, float f10) {
        this.f1073i.t(i10, f10);
    }

    private void C(Context context, f1 f1Var) {
        String o10;
        Typeface create;
        Typeface typeface;
        this.f1074j = f1Var.k(f.j.f10176d3, this.f1074j);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            int k10 = f1Var.k(f.j.f10201i3, -1);
            this.f1075k = k10;
            if (k10 != -1) {
                this.f1074j = (this.f1074j & 2) | 0;
            }
        }
        int i11 = f.j.f10196h3;
        if (!f1Var.s(i11) && !f1Var.s(f.j.f10206j3)) {
            int i12 = f.j.f10171c3;
            if (f1Var.s(i12)) {
                this.f1077m = false;
                int k11 = f1Var.k(i12, 1);
                if (k11 == 1) {
                    typeface = Typeface.SANS_SERIF;
                } else if (k11 == 2) {
                    typeface = Typeface.SERIF;
                } else if (k11 != 3) {
                    return;
                } else {
                    typeface = Typeface.MONOSPACE;
                }
                this.f1076l = typeface;
                return;
            }
            return;
        }
        this.f1076l = null;
        int i13 = f.j.f10206j3;
        if (f1Var.s(i13)) {
            i11 = i13;
        }
        int i14 = this.f1075k;
        int i15 = this.f1074j;
        if (!context.isRestricted()) {
            try {
                Typeface j10 = f1Var.j(i11, this.f1074j, new a(i14, i15, new WeakReference(this.f1065a)));
                if (j10 != null) {
                    if (i10 >= 28 && this.f1075k != -1) {
                        j10 = g.a(Typeface.create(j10, 0), this.f1075k, (this.f1074j & 2) != 0);
                    }
                    this.f1076l = j10;
                }
                this.f1077m = this.f1076l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f1076l != null || (o10 = f1Var.o(i11)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || this.f1075k == -1) {
            create = Typeface.create(o10, this.f1074j);
        } else {
            create = g.a(Typeface.create(o10, 0), this.f1075k, (this.f1074j & 2) != 0);
        }
        this.f1076l = create;
    }

    private void a(Drawable drawable, d1 d1Var) {
        if (drawable == null || d1Var == null) {
            return;
        }
        j.i(drawable, d1Var, this.f1065a.getDrawableState());
    }

    private static d1 d(Context context, j jVar, int i10) {
        ColorStateList f10 = jVar.f(context, i10);
        if (f10 == null) {
            return null;
        }
        d1 d1Var = new d1();
        d1Var.f1151d = true;
        d1Var.f1148a = f10;
        return d1Var;
    }

    private void y(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4, Drawable drawable5, Drawable drawable6) {
        if (drawable5 != null || drawable6 != null) {
            Drawable[] a10 = c.a(this.f1065a);
            TextView textView = this.f1065a;
            if (drawable5 == null) {
                drawable5 = a10[0];
            }
            if (drawable2 == null) {
                drawable2 = a10[1];
            }
            if (drawable6 == null) {
                drawable6 = a10[2];
            }
            if (drawable4 == null) {
                drawable4 = a10[3];
            }
            c.b(textView, drawable5, drawable2, drawable6, drawable4);
            return;
        }
        if (drawable == null && drawable2 == null && drawable3 == null && drawable4 == null) {
            return;
        }
        Drawable[] a11 = c.a(this.f1065a);
        Drawable drawable7 = a11[0];
        if (drawable7 != null || a11[2] != null) {
            TextView textView2 = this.f1065a;
            if (drawable2 == null) {
                drawable2 = a11[1];
            }
            Drawable drawable8 = a11[2];
            if (drawable4 == null) {
                drawable4 = a11[3];
            }
            c.b(textView2, drawable7, drawable2, drawable8, drawable4);
            return;
        }
        Drawable[] compoundDrawables = this.f1065a.getCompoundDrawables();
        TextView textView3 = this.f1065a;
        if (drawable == null) {
            drawable = compoundDrawables[0];
        }
        if (drawable2 == null) {
            drawable2 = compoundDrawables[1];
        }
        if (drawable3 == null) {
            drawable3 = compoundDrawables[2];
        }
        if (drawable4 == null) {
            drawable4 = compoundDrawables[3];
        }
        textView3.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
    }

    private void z() {
        d1 d1Var = this.f1072h;
        this.f1066b = d1Var;
        this.f1067c = d1Var;
        this.f1068d = d1Var;
        this.f1069e = d1Var;
        this.f1070f = d1Var;
        this.f1071g = d1Var;
    }

    void A(int i10, float f10) {
        if (q1.f1294b || l()) {
            return;
        }
        B(i10, f10);
    }

    void b() {
        if (this.f1066b != null || this.f1067c != null || this.f1068d != null || this.f1069e != null) {
            Drawable[] compoundDrawables = this.f1065a.getCompoundDrawables();
            a(compoundDrawables[0], this.f1066b);
            a(compoundDrawables[1], this.f1067c);
            a(compoundDrawables[2], this.f1068d);
            a(compoundDrawables[3], this.f1069e);
        }
        if (this.f1070f == null && this.f1071g == null) {
            return;
        }
        Drawable[] a10 = c.a(this.f1065a);
        a(a10[0], this.f1070f);
        a(a10[2], this.f1071g);
    }

    void c() {
        this.f1073i.a();
    }

    int e() {
        return this.f1073i.f();
    }

    int f() {
        return this.f1073i.g();
    }

    int g() {
        return this.f1073i.h();
    }

    int[] h() {
        return this.f1073i.i();
    }

    int i() {
        return this.f1073i.j();
    }

    ColorStateList j() {
        d1 d1Var = this.f1072h;
        if (d1Var != null) {
            return d1Var.f1148a;
        }
        return null;
    }

    PorterDuff.Mode k() {
        d1 d1Var = this.f1072h;
        if (d1Var != null) {
            return d1Var.f1149b;
        }
        return null;
    }

    boolean l() {
        return this.f1073i.n();
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:141:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01c1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01e5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void m(android.util.AttributeSet r24, int r25) {
        /*
            Method dump skipped, instructions count: 784
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.b0.m(android.util.AttributeSet, int):void");
    }

    void n(WeakReference weakReference, Typeface typeface) {
        if (this.f1077m) {
            this.f1076l = typeface;
            TextView textView = (TextView) weakReference.get();
            if (textView != null) {
                if (androidx.core.view.h0.V(textView)) {
                    textView.post(new b(textView, typeface, this.f1074j));
                } else {
                    textView.setTypeface(typeface, this.f1074j);
                }
            }
        }
    }

    void o(boolean z10, int i10, int i11, int i12, int i13) {
        if (q1.f1294b) {
            return;
        }
        c();
    }

    void p() {
        b();
    }

    void q(Context context, int i10) {
        String o10;
        ColorStateList c10;
        ColorStateList c11;
        ColorStateList c12;
        f1 t10 = f1.t(context, i10, f.j.f10159a3);
        int i11 = f.j.f10216l3;
        if (t10.s(i11)) {
            s(t10.a(i11, false));
        }
        int i12 = Build.VERSION.SDK_INT;
        if (i12 < 23) {
            int i13 = f.j.f10181e3;
            if (t10.s(i13) && (c12 = t10.c(i13)) != null) {
                this.f1065a.setTextColor(c12);
            }
            int i14 = f.j.f10191g3;
            if (t10.s(i14) && (c11 = t10.c(i14)) != null) {
                this.f1065a.setLinkTextColor(c11);
            }
            int i15 = f.j.f10186f3;
            if (t10.s(i15) && (c10 = t10.c(i15)) != null) {
                this.f1065a.setHintTextColor(c10);
            }
        }
        int i16 = f.j.f10165b3;
        if (t10.s(i16) && t10.f(i16, -1) == 0) {
            this.f1065a.setTextSize(0, 0.0f);
        }
        C(context, t10);
        if (i12 >= 26) {
            int i17 = f.j.f10211k3;
            if (t10.s(i17) && (o10 = t10.o(i17)) != null) {
                f.d(this.f1065a, o10);
            }
        }
        t10.w();
        Typeface typeface = this.f1076l;
        if (typeface != null) {
            this.f1065a.setTypeface(typeface, this.f1074j);
        }
    }

    void r(TextView textView, InputConnection inputConnection, EditorInfo editorInfo) {
        if (Build.VERSION.SDK_INT >= 30 || inputConnection == null) {
            return;
        }
        a0.c.f(editorInfo, textView.getText());
    }

    void s(boolean z10) {
        this.f1065a.setAllCaps(z10);
    }

    void t(int i10, int i11, int i12, int i13) {
        this.f1073i.p(i10, i11, i12, i13);
    }

    void u(int[] iArr, int i10) {
        this.f1073i.q(iArr, i10);
    }

    void v(int i10) {
        this.f1073i.r(i10);
    }

    void w(ColorStateList colorStateList) {
        if (this.f1072h == null) {
            this.f1072h = new d1();
        }
        d1 d1Var = this.f1072h;
        d1Var.f1148a = colorStateList;
        d1Var.f1151d = colorStateList != null;
        z();
    }

    void x(PorterDuff.Mode mode) {
        if (this.f1072h == null) {
            this.f1072h = new d1();
        }
        d1 d1Var = this.f1072h;
        d1Var.f1149b = mode;
        d1Var.f1150c = mode != null;
        z();
    }
}