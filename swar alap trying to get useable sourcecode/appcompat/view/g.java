package androidx.appcompat.view;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.f1;
import androidx.appcompat.widget.o0;
import androidx.core.view.v;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public class g extends MenuInflater {

    /* renamed from: e, reason: collision with root package name */
    static final Class[] f572e;

    /* renamed from: f, reason: collision with root package name */
    static final Class[] f573f;

    /* renamed from: a, reason: collision with root package name */
    final Object[] f574a;

    /* renamed from: b, reason: collision with root package name */
    final Object[] f575b;

    /* renamed from: c, reason: collision with root package name */
    Context f576c;

    /* renamed from: d, reason: collision with root package name */
    private Object f577d;

    private static class a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: c, reason: collision with root package name */
        private static final Class[] f578c = {MenuItem.class};

        /* renamed from: a, reason: collision with root package name */
        private Object f579a;

        /* renamed from: b, reason: collision with root package name */
        private Method f580b;

        public a(Object obj, String str) {
            this.f579a = obj;
            Class<?> cls = obj.getClass();
            try {
                this.f580b = cls.getMethod(str, f578c);
            } catch (Exception e10) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str + " in class " + cls.getName());
                inflateException.initCause(e10);
                throw inflateException;
            }
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            try {
                if (this.f580b.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) this.f580b.invoke(this.f579a, menuItem)).booleanValue();
                }
                this.f580b.invoke(this.f579a, menuItem);
                return true;
            } catch (Exception e10) {
                throw new RuntimeException(e10);
            }
        }
    }

    private class b {
        androidx.core.view.b A;
        private CharSequence B;
        private CharSequence C;
        private ColorStateList D = null;
        private PorterDuff.Mode E = null;

        /* renamed from: a, reason: collision with root package name */
        private Menu f581a;

        /* renamed from: b, reason: collision with root package name */
        private int f582b;

        /* renamed from: c, reason: collision with root package name */
        private int f583c;

        /* renamed from: d, reason: collision with root package name */
        private int f584d;

        /* renamed from: e, reason: collision with root package name */
        private int f585e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f586f;

        /* renamed from: g, reason: collision with root package name */
        private boolean f587g;

        /* renamed from: h, reason: collision with root package name */
        private boolean f588h;

        /* renamed from: i, reason: collision with root package name */
        private int f589i;

        /* renamed from: j, reason: collision with root package name */
        private int f590j;

        /* renamed from: k, reason: collision with root package name */
        private CharSequence f591k;

        /* renamed from: l, reason: collision with root package name */
        private CharSequence f592l;

        /* renamed from: m, reason: collision with root package name */
        private int f593m;

        /* renamed from: n, reason: collision with root package name */
        private char f594n;

        /* renamed from: o, reason: collision with root package name */
        private int f595o;

        /* renamed from: p, reason: collision with root package name */
        private char f596p;

        /* renamed from: q, reason: collision with root package name */
        private int f597q;

        /* renamed from: r, reason: collision with root package name */
        private int f598r;

        /* renamed from: s, reason: collision with root package name */
        private boolean f599s;

        /* renamed from: t, reason: collision with root package name */
        private boolean f600t;

        /* renamed from: u, reason: collision with root package name */
        private boolean f601u;

        /* renamed from: v, reason: collision with root package name */
        private int f602v;

        /* renamed from: w, reason: collision with root package name */
        private int f603w;

        /* renamed from: x, reason: collision with root package name */
        private String f604x;

        /* renamed from: y, reason: collision with root package name */
        private String f605y;

        /* renamed from: z, reason: collision with root package name */
        private String f606z;

        public b(Menu menu) {
            this.f581a = menu;
            h();
        }

        private char c(String str) {
            if (str == null) {
                return (char) 0;
            }
            return str.charAt(0);
        }

        private Object e(String str, Class[] clsArr, Object[] objArr) {
            try {
                Constructor<?> constructor = Class.forName(str, false, g.this.f576c.getClassLoader()).getConstructor(clsArr);
                constructor.setAccessible(true);
                return constructor.newInstance(objArr);
            } catch (Exception e10) {
                Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e10);
                return null;
            }
        }

        private void i(MenuItem menuItem) {
            boolean z10 = false;
            menuItem.setChecked(this.f599s).setVisible(this.f600t).setEnabled(this.f601u).setCheckable(this.f598r >= 1).setTitleCondensed(this.f592l).setIcon(this.f593m);
            int i10 = this.f602v;
            if (i10 >= 0) {
                menuItem.setShowAsAction(i10);
            }
            if (this.f606z != null) {
                if (g.this.f576c.isRestricted()) {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
                menuItem.setOnMenuItemClickListener(new a(g.this.b(), this.f606z));
            }
            if (this.f598r >= 2) {
                if (menuItem instanceof androidx.appcompat.view.menu.i) {
                    ((androidx.appcompat.view.menu.i) menuItem).t(true);
                } else if (menuItem instanceof j) {
                    ((j) menuItem).h(true);
                }
            }
            String str = this.f604x;
            if (str != null) {
                menuItem.setActionView((View) e(str, g.f572e, g.this.f574a));
                z10 = true;
            }
            int i11 = this.f603w;
            if (i11 > 0) {
                if (z10) {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
                } else {
                    menuItem.setActionView(i11);
                }
            }
            androidx.core.view.b bVar = this.A;
            if (bVar != null) {
                v.a(menuItem, bVar);
            }
            v.c(menuItem, this.B);
            v.g(menuItem, this.C);
            v.b(menuItem, this.f594n, this.f595o);
            v.f(menuItem, this.f596p, this.f597q);
            PorterDuff.Mode mode = this.E;
            if (mode != null) {
                v.e(menuItem, mode);
            }
            ColorStateList colorStateList = this.D;
            if (colorStateList != null) {
                v.d(menuItem, colorStateList);
            }
        }

        public void a() {
            this.f588h = true;
            i(this.f581a.add(this.f582b, this.f589i, this.f590j, this.f591k));
        }

        public SubMenu b() {
            this.f588h = true;
            SubMenu addSubMenu = this.f581a.addSubMenu(this.f582b, this.f589i, this.f590j, this.f591k);
            i(addSubMenu.getItem());
            return addSubMenu;
        }

        public boolean d() {
            return this.f588h;
        }

        public void f(AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = g.this.f576c.obtainStyledAttributes(attributeSet, f.j.f10269w1);
            this.f582b = obtainStyledAttributes.getResourceId(f.j.f10279y1, 0);
            this.f583c = obtainStyledAttributes.getInt(f.j.A1, 0);
            this.f584d = obtainStyledAttributes.getInt(f.j.B1, 0);
            this.f585e = obtainStyledAttributes.getInt(f.j.C1, 0);
            this.f586f = obtainStyledAttributes.getBoolean(f.j.f10284z1, true);
            this.f587g = obtainStyledAttributes.getBoolean(f.j.f10274x1, true);
            obtainStyledAttributes.recycle();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public void g(AttributeSet attributeSet) {
            f1 u10 = f1.u(g.this.f576c, attributeSet, f.j.D1);
            this.f589i = u10.n(f.j.G1, 0);
            this.f590j = (u10.k(f.j.J1, this.f583c) & (-65536)) | (u10.k(f.j.K1, this.f584d) & 65535);
            this.f591k = u10.p(f.j.L1);
            this.f592l = u10.p(f.j.M1);
            this.f593m = u10.n(f.j.E1, 0);
            this.f594n = c(u10.o(f.j.N1));
            this.f595o = u10.k(f.j.U1, 4096);
            this.f596p = c(u10.o(f.j.O1));
            this.f597q = u10.k(f.j.Y1, 4096);
            int i10 = f.j.P1;
            this.f598r = u10.s(i10) ? u10.a(i10, false) : this.f585e;
            this.f599s = u10.a(f.j.H1, false);
            this.f600t = u10.a(f.j.I1, this.f586f);
            this.f601u = u10.a(f.j.F1, this.f587g);
            this.f602v = u10.k(f.j.Z1, -1);
            this.f606z = u10.o(f.j.Q1);
            this.f603w = u10.n(f.j.R1, 0);
            this.f604x = u10.o(f.j.T1);
            String o10 = u10.o(f.j.S1);
            this.f605y = o10;
            boolean z10 = o10 != null;
            if (z10 && this.f603w == 0 && this.f604x == null) {
                this.A = (androidx.core.view.b) e(o10, g.f573f, g.this.f575b);
            } else {
                if (z10) {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                }
                this.A = null;
            }
            this.B = u10.p(f.j.V1);
            this.C = u10.p(f.j.f10158a2);
            int i11 = f.j.X1;
            if (u10.s(i11)) {
                this.E = o0.e(u10.k(i11, -1), this.E);
            } else {
                this.E = null;
            }
            int i12 = f.j.W1;
            if (u10.s(i12)) {
                this.D = u10.c(i12);
            } else {
                this.D = null;
            }
            u10.w();
            this.f588h = false;
        }

        public void h() {
            this.f582b = 0;
            this.f583c = 0;
            this.f584d = 0;
            this.f585e = 0;
            this.f586f = true;
            this.f587g = true;
        }
    }

    static {
        Class[] clsArr = {Context.class};
        f572e = clsArr;
        f573f = clsArr;
    }

    public g(Context context) {
        super(context);
        this.f576c = context;
        Object[] objArr = {context};
        this.f574a = objArr;
        this.f575b = objArr;
    }

    private Object a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0048, code lost:
    
        if (r15 == 2) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004b, code lost:
    
        if (r15 == 3) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004f, code lost:
    
        r15 = r13.getName();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0053, code lost:
    
        if (r7 == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0059, code lost:
    
        if (r15.equals(r8) == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005b, code lost:
    
        r8 = null;
        r7 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00b9, code lost:
    
        r15 = r13.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0062, code lost:
    
        if (r15.equals("group") == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0064, code lost:
    
        r0.h();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006c, code lost:
    
        if (r15.equals("item") == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0072, code lost:
    
        if (r0.d() != false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0074, code lost:
    
        r15 = r0.A;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0076, code lost:
    
        if (r15 == null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007c, code lost:
    
        if (r15.a() == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x007e, code lost:
    
        r0.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0082, code lost:
    
        r0.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x008a, code lost:
    
        if (r15.equals("menu") == false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x008c, code lost:
    
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x008e, code lost:
    
        if (r7 == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0091, code lost:
    
        r15 = r13.getName();
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0099, code lost:
    
        if (r15.equals("group") == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x009b, code lost:
    
        r0.f(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00a3, code lost:
    
        if (r15.equals("item") == false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00a5, code lost:
    
        r0.g(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00ad, code lost:
    
        if (r15.equals("menu") == false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00af, code lost:
    
        c(r13, r14, r0.b());
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00b7, code lost:
    
        r8 = r15;
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00c5, code lost:
    
        throw new java.lang.RuntimeException("Unexpected end of document");
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00c6, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x003b, code lost:
    
        r8 = null;
        r6 = false;
        r7 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0040, code lost:
    
        if (r6 != false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0042, code lost:
    
        if (r15 == 1) goto L61;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void c(org.xmlpull.v1.XmlPullParser r13, android.util.AttributeSet r14, android.view.Menu r15) {
        /*
            r12 = this;
            androidx.appcompat.view.g$b r0 = new androidx.appcompat.view.g$b
            r0.<init>(r15)
            int r15 = r13.getEventType()
        L9:
            r1 = 2
            java.lang.String r2 = "menu"
            r3 = 1
            if (r15 != r1) goto L35
            java.lang.String r15 = r13.getName()
            boolean r4 = r15.equals(r2)
            if (r4 == 0) goto L1e
            int r15 = r13.next()
            goto L3b
        L1e:
            java.lang.RuntimeException r13 = new java.lang.RuntimeException
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r0 = "Expecting menu, got "
            r14.append(r0)
            r14.append(r15)
            java.lang.String r14 = r14.toString()
            r13.<init>(r14)
            throw r13
        L35:
            int r15 = r13.next()
            if (r15 != r3) goto L9
        L3b:
            r4 = 0
            r5 = 0
            r8 = r5
            r6 = 0
            r7 = 0
        L40:
            if (r6 != 0) goto Lc6
            if (r15 == r3) goto Lbe
            java.lang.String r9 = "item"
            java.lang.String r10 = "group"
            if (r15 == r1) goto L8e
            r11 = 3
            if (r15 == r11) goto L4f
            goto Lb9
        L4f:
            java.lang.String r15 = r13.getName()
            if (r7 == 0) goto L5e
            boolean r11 = r15.equals(r8)
            if (r11 == 0) goto L5e
            r8 = r5
            r7 = 0
            goto Lb9
        L5e:
            boolean r10 = r15.equals(r10)
            if (r10 == 0) goto L68
            r0.h()
            goto Lb9
        L68:
            boolean r9 = r15.equals(r9)
            if (r9 == 0) goto L86
            boolean r15 = r0.d()
            if (r15 != 0) goto Lb9
            androidx.core.view.b r15 = r0.A
            if (r15 == 0) goto L82
            boolean r15 = r15.a()
            if (r15 == 0) goto L82
            r0.b()
            goto Lb9
        L82:
            r0.a()
            goto Lb9
        L86:
            boolean r15 = r15.equals(r2)
            if (r15 == 0) goto Lb9
            r6 = 1
            goto Lb9
        L8e:
            if (r7 == 0) goto L91
            goto Lb9
        L91:
            java.lang.String r15 = r13.getName()
            boolean r10 = r15.equals(r10)
            if (r10 == 0) goto L9f
            r0.f(r14)
            goto Lb9
        L9f:
            boolean r9 = r15.equals(r9)
            if (r9 == 0) goto La9
            r0.g(r14)
            goto Lb9
        La9:
            boolean r9 = r15.equals(r2)
            if (r9 == 0) goto Lb7
            android.view.SubMenu r15 = r0.b()
            r12.c(r13, r14, r15)
            goto Lb9
        Lb7:
            r8 = r15
            r7 = 1
        Lb9:
            int r15 = r13.next()
            goto L40
        Lbe:
            java.lang.RuntimeException r13 = new java.lang.RuntimeException
            java.lang.String r14 = "Unexpected end of document"
            r13.<init>(r14)
            throw r13
        Lc6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.g.c(org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.view.Menu):void");
    }

    Object b() {
        if (this.f577d == null) {
            this.f577d = a(this.f576c);
        }
        return this.f577d;
    }

    @Override // android.view.MenuInflater
    public void inflate(int i10, Menu menu) {
        if (!(menu instanceof y.a)) {
            super.inflate(i10, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        try {
            try {
                try {
                    xmlResourceParser = this.f576c.getResources().getLayout(i10);
                    c(xmlResourceParser, Xml.asAttributeSet(xmlResourceParser), menu);
                } catch (IOException e10) {
                    throw new InflateException("Error inflating menu XML", e10);
                }
            } catch (XmlPullParserException e11) {
                throw new InflateException("Error inflating menu XML", e11);
            }
        } finally {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
        }
    }
}