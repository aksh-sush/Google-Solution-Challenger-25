package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public final class w0 {

    /* renamed from: i, reason: collision with root package name */
    private static w0 f1368i;

    /* renamed from: a, reason: collision with root package name */
    private WeakHashMap f1370a;

    /* renamed from: b, reason: collision with root package name */
    private androidx.collection.g f1371b;

    /* renamed from: c, reason: collision with root package name */
    private androidx.collection.h f1372c;

    /* renamed from: d, reason: collision with root package name */
    private final WeakHashMap f1373d = new WeakHashMap(0);

    /* renamed from: e, reason: collision with root package name */
    private TypedValue f1374e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f1375f;

    /* renamed from: g, reason: collision with root package name */
    private f f1376g;

    /* renamed from: h, reason: collision with root package name */
    private static final PorterDuff.Mode f1367h = PorterDuff.Mode.SRC_IN;

    /* renamed from: j, reason: collision with root package name */
    private static final c f1369j = new c(6);

    static class a implements e {
        a() {
        }

        @Override // androidx.appcompat.widget.w0.e
        public Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return h.a.l(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e10) {
                Log.e("AsldcInflateDelegate", "Exception while inflating <animated-selector>", e10);
                return null;
            }
        }
    }

    private static class b implements e {
        b() {
        }

        @Override // androidx.appcompat.widget.w0.e
        public Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return androidx.vectordrawable.graphics.drawable.e.b(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e10) {
                Log.e("AvdcInflateDelegate", "Exception while inflating <animated-vector>", e10);
                return null;
            }
        }
    }

    private static class c extends androidx.collection.e {
        public c(int i10) {
            super(i10);
        }

        private static int b(int i10, PorterDuff.Mode mode) {
            return ((i10 + 31) * 31) + mode.hashCode();
        }

        PorterDuffColorFilter c(int i10, PorterDuff.Mode mode) {
            return (PorterDuffColorFilter) get(Integer.valueOf(b(i10, mode)));
        }

        PorterDuffColorFilter d(int i10, PorterDuff.Mode mode, PorterDuffColorFilter porterDuffColorFilter) {
            return (PorterDuffColorFilter) put(Integer.valueOf(b(i10, mode)), porterDuffColorFilter);
        }
    }

    static class d implements e {
        d() {
        }

        @Override // androidx.appcompat.widget.w0.e
        public Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            String classAttribute = attributeSet.getClassAttribute();
            if (classAttribute != null) {
                try {
                    Drawable drawable = (Drawable) d.class.getClassLoader().loadClass(classAttribute).asSubclass(Drawable.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                    i.c.c(drawable, context.getResources(), xmlPullParser, attributeSet, theme);
                    return drawable;
                } catch (Exception e10) {
                    Log.e("DrawableDelegate", "Exception while inflating <drawable>", e10);
                }
            }
            return null;
        }
    }

    private interface e {
        Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme);
    }

    public interface f {
        boolean a(Context context, int i10, Drawable drawable);

        PorterDuff.Mode b(int i10);

        Drawable c(w0 w0Var, Context context, int i10);

        ColorStateList d(Context context, int i10);

        boolean e(Context context, int i10, Drawable drawable);
    }

    private static class g implements e {
        g() {
        }

        @Override // androidx.appcompat.widget.w0.e
        public Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return androidx.vectordrawable.graphics.drawable.j.c(context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e10) {
                Log.e("VdcInflateDelegate", "Exception while inflating <vector>", e10);
                return null;
            }
        }
    }

    private void a(String str, e eVar) {
        if (this.f1371b == null) {
            this.f1371b = new androidx.collection.g();
        }
        this.f1371b.put(str, eVar);
    }

    private synchronized boolean b(Context context, long j10, Drawable drawable) {
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState == null) {
            return false;
        }
        androidx.collection.d dVar = (androidx.collection.d) this.f1373d.get(context);
        if (dVar == null) {
            dVar = new androidx.collection.d();
            this.f1373d.put(context, dVar);
        }
        dVar.i(j10, new WeakReference(constantState));
        return true;
    }

    private void c(Context context, int i10, ColorStateList colorStateList) {
        if (this.f1370a == null) {
            this.f1370a = new WeakHashMap();
        }
        androidx.collection.h hVar = (androidx.collection.h) this.f1370a.get(context);
        if (hVar == null) {
            hVar = new androidx.collection.h();
            this.f1370a.put(context, hVar);
        }
        hVar.a(i10, colorStateList);
    }

    private void d(Context context) {
        if (this.f1375f) {
            return;
        }
        this.f1375f = true;
        Drawable j10 = j(context, i.d.f11177a);
        if (j10 == null || !q(j10)) {
            this.f1375f = false;
            throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
        }
    }

    private static long e(TypedValue typedValue) {
        return (typedValue.assetCookie << 32) | typedValue.data;
    }

    private Drawable f(Context context, int i10) {
        if (this.f1374e == null) {
            this.f1374e = new TypedValue();
        }
        TypedValue typedValue = this.f1374e;
        context.getResources().getValue(i10, typedValue, true);
        long e10 = e(typedValue);
        Drawable i11 = i(context, e10);
        if (i11 != null) {
            return i11;
        }
        f fVar = this.f1376g;
        Drawable c10 = fVar == null ? null : fVar.c(this, context, i10);
        if (c10 != null) {
            c10.setChangingConfigurations(typedValue.changingConfigurations);
            b(context, e10, c10);
        }
        return c10;
    }

    private static PorterDuffColorFilter g(ColorStateList colorStateList, PorterDuff.Mode mode, int[] iArr) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return l(colorStateList.getColorForState(iArr, 0), mode);
    }

    public static synchronized w0 h() {
        w0 w0Var;
        synchronized (w0.class) {
            if (f1368i == null) {
                w0 w0Var2 = new w0();
                f1368i = w0Var2;
                p(w0Var2);
            }
            w0Var = f1368i;
        }
        return w0Var;
    }

    private synchronized Drawable i(Context context, long j10) {
        androidx.collection.d dVar = (androidx.collection.d) this.f1373d.get(context);
        if (dVar == null) {
            return null;
        }
        WeakReference weakReference = (WeakReference) dVar.e(j10);
        if (weakReference != null) {
            Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            dVar.j(j10);
        }
        return null;
    }

    public static synchronized PorterDuffColorFilter l(int i10, PorterDuff.Mode mode) {
        PorterDuffColorFilter c10;
        synchronized (w0.class) {
            c cVar = f1369j;
            c10 = cVar.c(i10, mode);
            if (c10 == null) {
                c10 = new PorterDuffColorFilter(i10, mode);
                cVar.d(i10, mode, c10);
            }
        }
        return c10;
    }

    private ColorStateList n(Context context, int i10) {
        androidx.collection.h hVar;
        WeakHashMap weakHashMap = this.f1370a;
        if (weakHashMap == null || (hVar = (androidx.collection.h) weakHashMap.get(context)) == null) {
            return null;
        }
        return (ColorStateList) hVar.e(i10);
    }

    private static void p(w0 w0Var) {
        if (Build.VERSION.SDK_INT < 24) {
            w0Var.a("vector", new g());
            w0Var.a("animated-vector", new b());
            w0Var.a("animated-selector", new a());
            w0Var.a("drawable", new d());
        }
    }

    private static boolean q(Drawable drawable) {
        return (drawable instanceof androidx.vectordrawable.graphics.drawable.j) || "android.graphics.drawable.VectorDrawable".equals(drawable.getClass().getName());
    }

    private Drawable r(Context context, int i10) {
        int next;
        androidx.collection.g gVar = this.f1371b;
        if (gVar == null || gVar.isEmpty()) {
            return null;
        }
        androidx.collection.h hVar = this.f1372c;
        if (hVar != null) {
            String str = (String) hVar.e(i10);
            if ("appcompat_skip_skip".equals(str) || (str != null && this.f1371b.get(str) == null)) {
                return null;
            }
        } else {
            this.f1372c = new androidx.collection.h();
        }
        if (this.f1374e == null) {
            this.f1374e = new TypedValue();
        }
        TypedValue typedValue = this.f1374e;
        Resources resources = context.getResources();
        resources.getValue(i10, typedValue, true);
        long e10 = e(typedValue);
        Drawable i11 = i(context, e10);
        if (i11 != null) {
            return i11;
        }
        CharSequence charSequence = typedValue.string;
        if (charSequence != null && charSequence.toString().endsWith(".xml")) {
            try {
                XmlResourceParser xml = resources.getXml(i10);
                AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next != 2) {
                    throw new XmlPullParserException("No start tag found");
                }
                String name = xml.getName();
                this.f1372c.a(i10, name);
                e eVar = (e) this.f1371b.get(name);
                if (eVar != null) {
                    i11 = eVar.a(context, xml, asAttributeSet, context.getTheme());
                }
                if (i11 != null) {
                    i11.setChangingConfigurations(typedValue.changingConfigurations);
                    b(context, e10, i11);
                }
            } catch (Exception e11) {
                Log.e("ResourceManagerInternal", "Exception while inflating drawable", e11);
            }
        }
        if (i11 == null) {
            this.f1372c.a(i10, "appcompat_skip_skip");
        }
        return i11;
    }

    private Drawable v(Context context, int i10, boolean z10, Drawable drawable) {
        ColorStateList m10 = m(context, i10);
        if (m10 == null) {
            f fVar = this.f1376g;
            if ((fVar == null || !fVar.e(context, i10, drawable)) && !x(context, i10, drawable) && z10) {
                return null;
            }
            return drawable;
        }
        if (o0.a(drawable)) {
            drawable = drawable.mutate();
        }
        Drawable r10 = androidx.core.graphics.drawable.a.r(drawable);
        androidx.core.graphics.drawable.a.o(r10, m10);
        PorterDuff.Mode o10 = o(i10);
        if (o10 == null) {
            return r10;
        }
        androidx.core.graphics.drawable.a.p(r10, o10);
        return r10;
    }

    static void w(Drawable drawable, d1 d1Var, int[] iArr) {
        int[] state = drawable.getState();
        if (o0.a(drawable)) {
            if (!(drawable.mutate() == drawable)) {
                Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
                return;
            }
        }
        if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
            drawable.setState(new int[0]);
            drawable.setState(state);
        }
        boolean z10 = d1Var.f1151d;
        if (z10 || d1Var.f1150c) {
            drawable.setColorFilter(g(z10 ? d1Var.f1148a : null, d1Var.f1150c ? d1Var.f1149b : f1367h, iArr));
        } else {
            drawable.clearColorFilter();
        }
        if (Build.VERSION.SDK_INT <= 23) {
            drawable.invalidateSelf();
        }
    }

    public synchronized Drawable j(Context context, int i10) {
        return k(context, i10, false);
    }

    synchronized Drawable k(Context context, int i10, boolean z10) {
        Drawable r10;
        d(context);
        r10 = r(context, i10);
        if (r10 == null) {
            r10 = f(context, i10);
        }
        if (r10 == null) {
            r10 = androidx.core.content.a.e(context, i10);
        }
        if (r10 != null) {
            r10 = v(context, i10, z10, r10);
        }
        if (r10 != null) {
            o0.b(r10);
        }
        return r10;
    }

    synchronized ColorStateList m(Context context, int i10) {
        ColorStateList n10;
        n10 = n(context, i10);
        if (n10 == null) {
            f fVar = this.f1376g;
            n10 = fVar == null ? null : fVar.d(context, i10);
            if (n10 != null) {
                c(context, i10, n10);
            }
        }
        return n10;
    }

    PorterDuff.Mode o(int i10) {
        f fVar = this.f1376g;
        if (fVar == null) {
            return null;
        }
        return fVar.b(i10);
    }

    public synchronized void s(Context context) {
        androidx.collection.d dVar = (androidx.collection.d) this.f1373d.get(context);
        if (dVar != null) {
            dVar.b();
        }
    }

    synchronized Drawable t(Context context, p1 p1Var, int i10) {
        Drawable r10 = r(context, i10);
        if (r10 == null) {
            r10 = p1Var.a(i10);
        }
        if (r10 == null) {
            return null;
        }
        return v(context, i10, false, r10);
    }

    public synchronized void u(f fVar) {
        this.f1376g = fVar;
    }

    boolean x(Context context, int i10, Drawable drawable) {
        f fVar = this.f1376g;
        return fVar != null && fVar.a(context, i10, drawable);
    }
}