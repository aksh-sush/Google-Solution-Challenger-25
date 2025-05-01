package androidx.appcompat.app;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.app.b;
import androidx.appcompat.view.b;
import androidx.appcompat.view.f;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.f1;
import androidx.appcompat.widget.p1;
import androidx.appcompat.widget.q1;
import androidx.core.content.res.h;
import androidx.core.view.h1;
import androidx.core.view.p;
import androidx.core.view.p0;
import androidx.core.view.r0;
import androidx.lifecycle.i;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
class h extends androidx.appcompat.app.g implements g.a, LayoutInflater.Factory2 {

    /* renamed from: n0, reason: collision with root package name */
    private static final androidx.collection.g f419n0 = new androidx.collection.g();

    /* renamed from: o0, reason: collision with root package name */
    private static final boolean f420o0 = false;

    /* renamed from: p0, reason: collision with root package name */
    private static final int[] f421p0 = {R.attr.windowBackground};

    /* renamed from: q0, reason: collision with root package name */
    private static final boolean f422q0 = !"robolectric".equals(Build.FINGERPRINT);

    /* renamed from: r0, reason: collision with root package name */
    private static final boolean f423r0 = true;
    PopupWindow A;
    Runnable B;
    p0 C;
    private boolean D;
    private boolean E;
    ViewGroup F;
    private TextView G;
    private View H;
    private boolean I;
    private boolean J;
    boolean K;
    boolean L;
    boolean M;
    boolean N;
    boolean O;
    private boolean P;
    private u[] Q;
    private u R;
    private boolean S;
    private boolean T;
    private boolean U;
    boolean V;
    private Configuration W;
    private int X;
    private int Y;
    private int Z;

    /* renamed from: a0, reason: collision with root package name */
    private boolean f424a0;

    /* renamed from: b0, reason: collision with root package name */
    private q f425b0;

    /* renamed from: c0, reason: collision with root package name */
    private q f426c0;

    /* renamed from: d0, reason: collision with root package name */
    boolean f427d0;

    /* renamed from: e0, reason: collision with root package name */
    int f428e0;

    /* renamed from: f0, reason: collision with root package name */
    private final Runnable f429f0;

    /* renamed from: g0, reason: collision with root package name */
    private boolean f430g0;

    /* renamed from: h0, reason: collision with root package name */
    private Rect f431h0;

    /* renamed from: i0, reason: collision with root package name */
    private Rect f432i0;

    /* renamed from: j0, reason: collision with root package name */
    private y f433j0;

    /* renamed from: k0, reason: collision with root package name */
    private c0 f434k0;

    /* renamed from: l0, reason: collision with root package name */
    private OnBackInvokedDispatcher f435l0;

    /* renamed from: m0, reason: collision with root package name */
    private OnBackInvokedCallback f436m0;

    /* renamed from: n, reason: collision with root package name */
    final Object f437n;

    /* renamed from: o, reason: collision with root package name */
    final Context f438o;

    /* renamed from: p, reason: collision with root package name */
    Window f439p;

    /* renamed from: q, reason: collision with root package name */
    private o f440q;

    /* renamed from: r, reason: collision with root package name */
    final androidx.appcompat.app.e f441r;

    /* renamed from: s, reason: collision with root package name */
    androidx.appcompat.app.a f442s;

    /* renamed from: t, reason: collision with root package name */
    MenuInflater f443t;

    /* renamed from: u, reason: collision with root package name */
    private CharSequence f444u;

    /* renamed from: v, reason: collision with root package name */
    private androidx.appcompat.widget.i0 f445v;

    /* renamed from: w, reason: collision with root package name */
    private C0010h f446w;

    /* renamed from: x, reason: collision with root package name */
    private v f447x;

    /* renamed from: y, reason: collision with root package name */
    androidx.appcompat.view.b f448y;

    /* renamed from: z, reason: collision with root package name */
    ActionBarContextView f449z;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            h hVar = h.this;
            if ((hVar.f428e0 & 1) != 0) {
                hVar.h0(0);
            }
            h hVar2 = h.this;
            if ((hVar2.f428e0 & 4096) != 0) {
                hVar2.h0(108);
            }
            h hVar3 = h.this;
            hVar3.f427d0 = false;
            hVar3.f428e0 = 0;
        }
    }

    class b implements androidx.core.view.c0 {
        b() {
        }

        @Override // androidx.core.view.c0
        public h1 a(View view, h1 h1Var) {
            int l10 = h1Var.l();
            int e12 = h.this.e1(h1Var, null);
            if (l10 != e12) {
                h1Var = h1Var.p(h1Var.j(), e12, h1Var.k(), h1Var.i());
            }
            return androidx.core.view.h0.e0(view, h1Var);
        }
    }

    class c implements ContentFrameLayout.a {
        c() {
        }

        @Override // androidx.appcompat.widget.ContentFrameLayout.a
        public void a() {
        }

        @Override // androidx.appcompat.widget.ContentFrameLayout.a
        public void onDetachedFromWindow() {
            h.this.f0();
        }
    }

    class d implements Runnable {

        class a extends r0 {
            a() {
            }

            @Override // androidx.core.view.q0
            public void b(View view) {
                h.this.f449z.setAlpha(1.0f);
                h.this.C.i(null);
                h.this.C = null;
            }

            @Override // androidx.core.view.r0, androidx.core.view.q0
            public void c(View view) {
                h.this.f449z.setVisibility(0);
            }
        }

        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            h hVar = h.this;
            hVar.A.showAtLocation(hVar.f449z, 55, 0, 0);
            h.this.i0();
            if (!h.this.T0()) {
                h.this.f449z.setAlpha(1.0f);
                h.this.f449z.setVisibility(0);
            } else {
                h.this.f449z.setAlpha(0.0f);
                h hVar2 = h.this;
                hVar2.C = androidx.core.view.h0.e(hVar2.f449z).b(1.0f);
                h.this.C.i(new a());
            }
        }
    }

    class e extends r0 {
        e() {
        }

        @Override // androidx.core.view.q0
        public void b(View view) {
            h.this.f449z.setAlpha(1.0f);
            h.this.C.i(null);
            h.this.C = null;
        }

        @Override // androidx.core.view.r0, androidx.core.view.q0
        public void c(View view) {
            h.this.f449z.setVisibility(0);
            if (h.this.f449z.getParent() instanceof View) {
                androidx.core.view.h0.p0((View) h.this.f449z.getParent());
            }
        }
    }

    private class f implements b.InterfaceC0009b {
        f() {
        }

        @Override // androidx.appcompat.app.b.InterfaceC0009b
        public void a(Drawable drawable, int i10) {
            androidx.appcompat.app.a s10 = h.this.s();
            if (s10 != null) {
                s10.t(drawable);
                s10.s(i10);
            }
        }

        @Override // androidx.appcompat.app.b.InterfaceC0009b
        public boolean b() {
            androidx.appcompat.app.a s10 = h.this.s();
            return (s10 == null || (s10.j() & 4) == 0) ? false : true;
        }

        @Override // androidx.appcompat.app.b.InterfaceC0009b
        public Drawable c() {
            f1 u10 = f1.u(e(), null, new int[]{f.a.A});
            Drawable g10 = u10.g(0);
            u10.w();
            return g10;
        }

        @Override // androidx.appcompat.app.b.InterfaceC0009b
        public void d(int i10) {
            androidx.appcompat.app.a s10 = h.this.s();
            if (s10 != null) {
                s10.s(i10);
            }
        }

        @Override // androidx.appcompat.app.b.InterfaceC0009b
        public Context e() {
            return h.this.n0();
        }
    }

    interface g {
        boolean a(int i10);

        View onCreatePanelView(int i10);
    }

    /* renamed from: androidx.appcompat.app.h$h, reason: collision with other inner class name */
    private final class C0010h implements m.a {
        C0010h() {
        }

        @Override // androidx.appcompat.view.menu.m.a
        public void a(androidx.appcompat.view.menu.g gVar, boolean z10) {
            h.this.Y(gVar);
        }

        @Override // androidx.appcompat.view.menu.m.a
        public boolean b(androidx.appcompat.view.menu.g gVar) {
            Window.Callback u02 = h.this.u0();
            if (u02 == null) {
                return true;
            }
            u02.onMenuOpened(108, gVar);
            return true;
        }
    }

    class i implements b.a {

        /* renamed from: a, reason: collision with root package name */
        private b.a f458a;

        class a extends r0 {
            a() {
            }

            @Override // androidx.core.view.q0
            public void b(View view) {
                h.this.f449z.setVisibility(8);
                h hVar = h.this;
                PopupWindow popupWindow = hVar.A;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (hVar.f449z.getParent() instanceof View) {
                    androidx.core.view.h0.p0((View) h.this.f449z.getParent());
                }
                h.this.f449z.k();
                h.this.C.i(null);
                h hVar2 = h.this;
                hVar2.C = null;
                androidx.core.view.h0.p0(hVar2.F);
            }
        }

        public i(b.a aVar) {
            this.f458a = aVar;
        }

        @Override // androidx.appcompat.view.b.a
        public boolean a(androidx.appcompat.view.b bVar, Menu menu) {
            androidx.core.view.h0.p0(h.this.F);
            return this.f458a.a(bVar, menu);
        }

        @Override // androidx.appcompat.view.b.a
        public void b(androidx.appcompat.view.b bVar) {
            this.f458a.b(bVar);
            h hVar = h.this;
            if (hVar.A != null) {
                hVar.f439p.getDecorView().removeCallbacks(h.this.B);
            }
            h hVar2 = h.this;
            if (hVar2.f449z != null) {
                hVar2.i0();
                h hVar3 = h.this;
                hVar3.C = androidx.core.view.h0.e(hVar3.f449z).b(0.0f);
                h.this.C.i(new a());
            }
            h hVar4 = h.this;
            androidx.appcompat.app.e eVar = hVar4.f441r;
            if (eVar != null) {
                eVar.d(hVar4.f448y);
            }
            h hVar5 = h.this;
            hVar5.f448y = null;
            androidx.core.view.h0.p0(hVar5.F);
            h.this.c1();
        }

        @Override // androidx.appcompat.view.b.a
        public boolean c(androidx.appcompat.view.b bVar, MenuItem menuItem) {
            return this.f458a.c(bVar, menuItem);
        }

        @Override // androidx.appcompat.view.b.a
        public boolean d(androidx.appcompat.view.b bVar, Menu menu) {
            return this.f458a.d(bVar, menu);
        }
    }

    static class j {
        static Context a(Context context, Configuration configuration) {
            return context.createConfigurationContext(configuration);
        }

        static void b(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            int i10 = configuration.densityDpi;
            int i11 = configuration2.densityDpi;
            if (i10 != i11) {
                configuration3.densityDpi = i11;
            }
        }

        static void c(Configuration configuration, Locale locale) {
            configuration.setLayoutDirection(locale);
        }

        static void d(Configuration configuration, Locale locale) {
            configuration.setLocale(locale);
        }
    }

    static class k {
        static boolean a(PowerManager powerManager) {
            return powerManager.isPowerSaveMode();
        }

        static String b(Locale locale) {
            return locale.toLanguageTag();
        }
    }

    static class l {
        static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            LocaleList locales;
            LocaleList locales2;
            boolean equals;
            locales = configuration.getLocales();
            locales2 = configuration2.getLocales();
            equals = locales.equals(locales2);
            if (equals) {
                return;
            }
            configuration3.setLocales(locales2);
            configuration3.locale = configuration2.locale;
        }

        static androidx.core.os.h b(Configuration configuration) {
            LocaleList locales;
            String languageTags;
            locales = configuration.getLocales();
            languageTags = locales.toLanguageTags();
            return androidx.core.os.h.c(languageTags);
        }

        public static void c(androidx.core.os.h hVar) {
            LocaleList forLanguageTags;
            forLanguageTags = LocaleList.forLanguageTags(hVar.h());
            LocaleList.setDefault(forLanguageTags);
        }

        static void d(Configuration configuration, androidx.core.os.h hVar) {
            LocaleList forLanguageTags;
            forLanguageTags = LocaleList.forLanguageTags(hVar.h());
            configuration.setLocales(forLanguageTags);
        }
    }

    static class m {
        static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            int i10;
            int i11;
            int i12;
            int i13;
            int i14;
            int i15;
            int i16;
            int i17;
            i10 = configuration.colorMode;
            int i18 = i10 & 3;
            i11 = configuration2.colorMode;
            if (i18 != (i11 & 3)) {
                i16 = configuration3.colorMode;
                i17 = configuration2.colorMode;
                configuration3.colorMode = i16 | (i17 & 3);
            }
            i12 = configuration.colorMode;
            int i19 = i12 & 12;
            i13 = configuration2.colorMode;
            if (i19 != (i13 & 12)) {
                i14 = configuration3.colorMode;
                i15 = configuration2.colorMode;
                configuration3.colorMode = i14 | (i15 & 12);
            }
        }
    }

    static class n {
        static OnBackInvokedDispatcher a(Activity activity) {
            OnBackInvokedDispatcher onBackInvokedDispatcher;
            onBackInvokedDispatcher = activity.getOnBackInvokedDispatcher();
            return onBackInvokedDispatcher;
        }

        static OnBackInvokedCallback b(Object obj, final h hVar) {
            Objects.requireNonNull(hVar);
            OnBackInvokedCallback onBackInvokedCallback = new OnBackInvokedCallback() { // from class: androidx.appcompat.app.v
                @Override // android.window.OnBackInvokedCallback
                public final void onBackInvoked() {
                    h.this.C0();
                }
            };
            androidx.appcompat.app.s.a(obj).registerOnBackInvokedCallback(1000000, onBackInvokedCallback);
            return onBackInvokedCallback;
        }

        static void c(Object obj, Object obj2) {
            androidx.appcompat.app.s.a(obj).unregisterOnBackInvokedCallback(androidx.appcompat.app.r.a(obj2));
        }
    }

    class o extends androidx.appcompat.view.i {

        /* renamed from: f, reason: collision with root package name */
        private g f461f;

        /* renamed from: g, reason: collision with root package name */
        private boolean f462g;

        /* renamed from: h, reason: collision with root package name */
        private boolean f463h;

        /* renamed from: i, reason: collision with root package name */
        private boolean f464i;

        o(Window.Callback callback) {
            super(callback);
        }

        public boolean b(Window.Callback callback, KeyEvent keyEvent) {
            try {
                this.f463h = true;
                return callback.dispatchKeyEvent(keyEvent);
            } finally {
                this.f463h = false;
            }
        }

        public void c(Window.Callback callback) {
            try {
                this.f462g = true;
                callback.onContentChanged();
            } finally {
                this.f462g = false;
            }
        }

        public void d(Window.Callback callback, int i10, Menu menu) {
            try {
                this.f464i = true;
                callback.onPanelClosed(i10, menu);
            } finally {
                this.f464i = false;
            }
        }

        @Override // androidx.appcompat.view.i, android.view.Window.Callback
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return this.f463h ? a().dispatchKeyEvent(keyEvent) : h.this.g0(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // androidx.appcompat.view.i, android.view.Window.Callback
        public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
            return super.dispatchKeyShortcutEvent(keyEvent) || h.this.F0(keyEvent.getKeyCode(), keyEvent);
        }

        void e(g gVar) {
            this.f461f = gVar;
        }

        final ActionMode f(ActionMode.Callback callback) {
            f.a aVar = new f.a(h.this.f438o, callback);
            androidx.appcompat.view.b W0 = h.this.W0(aVar);
            if (W0 != null) {
                return aVar.e(W0);
            }
            return null;
        }

        @Override // android.view.Window.Callback
        public void onContentChanged() {
            if (this.f462g) {
                a().onContentChanged();
            }
        }

        @Override // androidx.appcompat.view.i, android.view.Window.Callback
        public boolean onCreatePanelMenu(int i10, Menu menu) {
            if (i10 != 0 || (menu instanceof androidx.appcompat.view.menu.g)) {
                return super.onCreatePanelMenu(i10, menu);
            }
            return false;
        }

        @Override // androidx.appcompat.view.i, android.view.Window.Callback
        public View onCreatePanelView(int i10) {
            View onCreatePanelView;
            g gVar = this.f461f;
            return (gVar == null || (onCreatePanelView = gVar.onCreatePanelView(i10)) == null) ? super.onCreatePanelView(i10) : onCreatePanelView;
        }

        @Override // androidx.appcompat.view.i, android.view.Window.Callback
        public boolean onMenuOpened(int i10, Menu menu) {
            super.onMenuOpened(i10, menu);
            h.this.I0(i10);
            return true;
        }

        @Override // androidx.appcompat.view.i, android.view.Window.Callback
        public void onPanelClosed(int i10, Menu menu) {
            if (this.f464i) {
                a().onPanelClosed(i10, menu);
            } else {
                super.onPanelClosed(i10, menu);
                h.this.J0(i10);
            }
        }

        @Override // androidx.appcompat.view.i, android.view.Window.Callback
        public boolean onPreparePanel(int i10, View view, Menu menu) {
            androidx.appcompat.view.menu.g gVar = menu instanceof androidx.appcompat.view.menu.g ? (androidx.appcompat.view.menu.g) menu : null;
            if (i10 == 0 && gVar == null) {
                return false;
            }
            if (gVar != null) {
                gVar.a0(true);
            }
            g gVar2 = this.f461f;
            boolean z10 = gVar2 != null && gVar2.a(i10);
            if (!z10) {
                z10 = super.onPreparePanel(i10, view, menu);
            }
            if (gVar != null) {
                gVar.a0(false);
            }
            return z10;
        }

        @Override // androidx.appcompat.view.i, android.view.Window.Callback
        public void onProvideKeyboardShortcuts(List list, Menu menu, int i10) {
            androidx.appcompat.view.menu.g gVar;
            u s02 = h.this.s0(0, true);
            if (s02 == null || (gVar = s02.f483j) == null) {
                super.onProvideKeyboardShortcuts(list, menu, i10);
            } else {
                super.onProvideKeyboardShortcuts(list, gVar, i10);
            }
        }

        @Override // androidx.appcompat.view.i, android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            if (Build.VERSION.SDK_INT >= 23) {
                return null;
            }
            return h.this.A0() ? f(callback) : super.onWindowStartingActionMode(callback);
        }

        @Override // androidx.appcompat.view.i, android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i10) {
            return (h.this.A0() && i10 == 0) ? f(callback) : super.onWindowStartingActionMode(callback, i10);
        }
    }

    private class p extends q {

        /* renamed from: c, reason: collision with root package name */
        private final PowerManager f466c;

        p(Context context) {
            super();
            this.f466c = (PowerManager) context.getApplicationContext().getSystemService("power");
        }

        @Override // androidx.appcompat.app.h.q
        IntentFilter b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
            return intentFilter;
        }

        @Override // androidx.appcompat.app.h.q
        public int c() {
            return k.a(this.f466c) ? 2 : 1;
        }

        @Override // androidx.appcompat.app.h.q
        public void d() {
            h.this.S();
        }
    }

    abstract class q {

        /* renamed from: a, reason: collision with root package name */
        private BroadcastReceiver f468a;

        class a extends BroadcastReceiver {
            a() {
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                q.this.d();
            }
        }

        q() {
        }

        void a() {
            BroadcastReceiver broadcastReceiver = this.f468a;
            if (broadcastReceiver != null) {
                try {
                    h.this.f438o.unregisterReceiver(broadcastReceiver);
                } catch (IllegalArgumentException unused) {
                }
                this.f468a = null;
            }
        }

        abstract IntentFilter b();

        abstract int c();

        abstract void d();

        void e() {
            a();
            IntentFilter b10 = b();
            if (b10 == null || b10.countActions() == 0) {
                return;
            }
            if (this.f468a == null) {
                this.f468a = new a();
            }
            h.this.f438o.registerReceiver(this.f468a, b10);
        }
    }

    private class r extends q {

        /* renamed from: c, reason: collision with root package name */
        private final h0 f471c;

        r(h0 h0Var) {
            super();
            this.f471c = h0Var;
        }

        @Override // androidx.appcompat.app.h.q
        IntentFilter b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.TIME_SET");
            intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            intentFilter.addAction("android.intent.action.TIME_TICK");
            return intentFilter;
        }

        @Override // androidx.appcompat.app.h.q
        public int c() {
            return this.f471c.d() ? 2 : 1;
        }

        @Override // androidx.appcompat.app.h.q
        public void d() {
            h.this.S();
        }
    }

    private static class s {
        static void a(ContextThemeWrapper contextThemeWrapper, Configuration configuration) {
            contextThemeWrapper.applyOverrideConfiguration(configuration);
        }
    }

    private class t extends ContentFrameLayout {
        public t(Context context) {
            super(context);
        }

        private boolean b(int i10, int i11) {
            return i10 < -5 || i11 < -5 || i10 > getWidth() + 5 || i11 > getHeight() + 5;
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return h.this.g0(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() != 0 || !b((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return super.onInterceptTouchEvent(motionEvent);
            }
            h.this.a0(0);
            return true;
        }

        @Override // android.view.View
        public void setBackgroundResource(int i10) {
            setBackgroundDrawable(g.a.b(getContext(), i10));
        }
    }

    protected static final class u {

        /* renamed from: a, reason: collision with root package name */
        int f474a;

        /* renamed from: b, reason: collision with root package name */
        int f475b;

        /* renamed from: c, reason: collision with root package name */
        int f476c;

        /* renamed from: d, reason: collision with root package name */
        int f477d;

        /* renamed from: e, reason: collision with root package name */
        int f478e;

        /* renamed from: f, reason: collision with root package name */
        int f479f;

        /* renamed from: g, reason: collision with root package name */
        ViewGroup f480g;

        /* renamed from: h, reason: collision with root package name */
        View f481h;

        /* renamed from: i, reason: collision with root package name */
        View f482i;

        /* renamed from: j, reason: collision with root package name */
        androidx.appcompat.view.menu.g f483j;

        /* renamed from: k, reason: collision with root package name */
        androidx.appcompat.view.menu.e f484k;

        /* renamed from: l, reason: collision with root package name */
        Context f485l;

        /* renamed from: m, reason: collision with root package name */
        boolean f486m;

        /* renamed from: n, reason: collision with root package name */
        boolean f487n;

        /* renamed from: o, reason: collision with root package name */
        boolean f488o;

        /* renamed from: p, reason: collision with root package name */
        public boolean f489p;

        /* renamed from: q, reason: collision with root package name */
        boolean f490q = false;

        /* renamed from: r, reason: collision with root package name */
        boolean f491r;

        /* renamed from: s, reason: collision with root package name */
        Bundle f492s;

        u(int i10) {
            this.f474a = i10;
        }

        androidx.appcompat.view.menu.n a(m.a aVar) {
            if (this.f483j == null) {
                return null;
            }
            if (this.f484k == null) {
                androidx.appcompat.view.menu.e eVar = new androidx.appcompat.view.menu.e(this.f485l, f.g.f10125j);
                this.f484k = eVar;
                eVar.k(aVar);
                this.f483j.b(this.f484k);
            }
            return this.f484k.d(this.f480g);
        }

        public boolean b() {
            if (this.f481h == null) {
                return false;
            }
            return this.f482i != null || this.f484k.b().getCount() > 0;
        }

        void c(androidx.appcompat.view.menu.g gVar) {
            androidx.appcompat.view.menu.e eVar;
            androidx.appcompat.view.menu.g gVar2 = this.f483j;
            if (gVar == gVar2) {
                return;
            }
            if (gVar2 != null) {
                gVar2.O(this.f484k);
            }
            this.f483j = gVar;
            if (gVar == null || (eVar = this.f484k) == null) {
                return;
            }
            gVar.b(eVar);
        }

        void d(Context context) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme newTheme = context.getResources().newTheme();
            newTheme.setTo(context.getTheme());
            newTheme.resolveAttribute(f.a.f10016a, typedValue, true);
            int i10 = typedValue.resourceId;
            if (i10 != 0) {
                newTheme.applyStyle(i10, true);
            }
            newTheme.resolveAttribute(f.a.E, typedValue, true);
            int i11 = typedValue.resourceId;
            if (i11 == 0) {
                i11 = f.i.f10152c;
            }
            newTheme.applyStyle(i11, true);
            androidx.appcompat.view.d dVar = new androidx.appcompat.view.d(context, 0);
            dVar.getTheme().setTo(newTheme);
            this.f485l = dVar;
            TypedArray obtainStyledAttributes = dVar.obtainStyledAttributes(f.j.f10278y0);
            this.f475b = obtainStyledAttributes.getResourceId(f.j.B0, 0);
            this.f479f = obtainStyledAttributes.getResourceId(f.j.A0, 0);
            obtainStyledAttributes.recycle();
        }
    }

    private final class v implements m.a {
        v() {
        }

        @Override // androidx.appcompat.view.menu.m.a
        public void a(androidx.appcompat.view.menu.g gVar, boolean z10) {
            androidx.appcompat.view.menu.g D = gVar.D();
            boolean z11 = D != gVar;
            h hVar = h.this;
            if (z11) {
                gVar = D;
            }
            u l02 = hVar.l0(gVar);
            if (l02 != null) {
                if (!z11) {
                    h.this.b0(l02, z10);
                } else {
                    h.this.X(l02.f474a, l02, D);
                    h.this.b0(l02, true);
                }
            }
        }

        @Override // androidx.appcompat.view.menu.m.a
        public boolean b(androidx.appcompat.view.menu.g gVar) {
            Window.Callback u02;
            if (gVar != gVar.D()) {
                return true;
            }
            h hVar = h.this;
            if (!hVar.K || (u02 = hVar.u0()) == null || h.this.V) {
                return true;
            }
            u02.onMenuOpened(108, gVar);
            return true;
        }
    }

    h(Activity activity, androidx.appcompat.app.e eVar) {
        this(activity, null, eVar, activity);
    }

    private boolean E0(int i10, KeyEvent keyEvent) {
        if (keyEvent.getRepeatCount() != 0) {
            return false;
        }
        u s02 = s0(i10, true);
        if (s02.f488o) {
            return false;
        }
        return O0(s02, keyEvent);
    }

    private boolean H0(int i10, KeyEvent keyEvent) {
        boolean z10;
        androidx.appcompat.widget.i0 i0Var;
        if (this.f448y != null) {
            return false;
        }
        boolean z11 = true;
        u s02 = s0(i10, true);
        if (i10 != 0 || (i0Var = this.f445v) == null || !i0Var.g() || ViewConfiguration.get(this.f438o).hasPermanentMenuKey()) {
            boolean z12 = s02.f488o;
            if (z12 || s02.f487n) {
                b0(s02, true);
                z11 = z12;
            } else {
                if (s02.f486m) {
                    if (s02.f491r) {
                        s02.f486m = false;
                        z10 = O0(s02, keyEvent);
                    } else {
                        z10 = true;
                    }
                    if (z10) {
                        L0(s02, keyEvent);
                    }
                }
                z11 = false;
            }
        } else if (this.f445v.b()) {
            z11 = this.f445v.e();
        } else {
            if (!this.V && O0(s02, keyEvent)) {
                z11 = this.f445v.f();
            }
            z11 = false;
        }
        if (z11) {
            AudioManager audioManager = (AudioManager) this.f438o.getApplicationContext().getSystemService("audio");
            if (audioManager != null) {
                audioManager.playSoundEffect(0);
            } else {
                Log.w("AppCompatDelegate", "Couldn't get audio manager");
            }
        }
        return z11;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void L0(androidx.appcompat.app.h.u r13, android.view.KeyEvent r14) {
        /*
            Method dump skipped, instructions count: 249
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.h.L0(androidx.appcompat.app.h$u, android.view.KeyEvent):void");
    }

    private boolean N0(u uVar, int i10, KeyEvent keyEvent, int i11) {
        androidx.appcompat.view.menu.g gVar;
        boolean z10 = false;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((uVar.f486m || O0(uVar, keyEvent)) && (gVar = uVar.f483j) != null) {
            z10 = gVar.performShortcut(i10, keyEvent, i11);
        }
        if (z10 && (i11 & 1) == 0 && this.f445v == null) {
            b0(uVar, true);
        }
        return z10;
    }

    private boolean O0(u uVar, KeyEvent keyEvent) {
        androidx.appcompat.widget.i0 i0Var;
        androidx.appcompat.widget.i0 i0Var2;
        androidx.appcompat.widget.i0 i0Var3;
        if (this.V) {
            return false;
        }
        if (uVar.f486m) {
            return true;
        }
        u uVar2 = this.R;
        if (uVar2 != null && uVar2 != uVar) {
            b0(uVar2, false);
        }
        Window.Callback u02 = u0();
        if (u02 != null) {
            uVar.f482i = u02.onCreatePanelView(uVar.f474a);
        }
        int i10 = uVar.f474a;
        boolean z10 = i10 == 0 || i10 == 108;
        if (z10 && (i0Var3 = this.f445v) != null) {
            i0Var3.c();
        }
        if (uVar.f482i == null && (!z10 || !(M0() instanceof f0))) {
            androidx.appcompat.view.menu.g gVar = uVar.f483j;
            if (gVar == null || uVar.f491r) {
                if (gVar == null && (!y0(uVar) || uVar.f483j == null)) {
                    return false;
                }
                if (z10 && this.f445v != null) {
                    if (this.f446w == null) {
                        this.f446w = new C0010h();
                    }
                    this.f445v.a(uVar.f483j, this.f446w);
                }
                uVar.f483j.d0();
                if (!u02.onCreatePanelMenu(uVar.f474a, uVar.f483j)) {
                    uVar.c(null);
                    if (z10 && (i0Var = this.f445v) != null) {
                        i0Var.a(null, this.f446w);
                    }
                    return false;
                }
                uVar.f491r = false;
            }
            uVar.f483j.d0();
            Bundle bundle = uVar.f492s;
            if (bundle != null) {
                uVar.f483j.P(bundle);
                uVar.f492s = null;
            }
            if (!u02.onPreparePanel(0, uVar.f482i, uVar.f483j)) {
                if (z10 && (i0Var2 = this.f445v) != null) {
                    i0Var2.a(null, this.f446w);
                }
                uVar.f483j.c0();
                return false;
            }
            boolean z11 = KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1;
            uVar.f489p = z11;
            uVar.f483j.setQwertyMode(z11);
            uVar.f483j.c0();
        }
        uVar.f486m = true;
        uVar.f487n = false;
        this.R = uVar;
        return true;
    }

    private void P0(boolean z10) {
        androidx.appcompat.widget.i0 i0Var = this.f445v;
        if (i0Var == null || !i0Var.g() || (ViewConfiguration.get(this.f438o).hasPermanentMenuKey() && !this.f445v.d())) {
            u s02 = s0(0, true);
            s02.f490q = true;
            b0(s02, false);
            L0(s02, null);
            return;
        }
        Window.Callback u02 = u0();
        if (this.f445v.b() && z10) {
            this.f445v.e();
            if (this.V) {
                return;
            }
            u02.onPanelClosed(108, s0(0, true).f483j);
            return;
        }
        if (u02 == null || this.V) {
            return;
        }
        if (this.f427d0 && (this.f428e0 & 1) != 0) {
            this.f439p.getDecorView().removeCallbacks(this.f429f0);
            this.f429f0.run();
        }
        u s03 = s0(0, true);
        androidx.appcompat.view.menu.g gVar = s03.f483j;
        if (gVar == null || s03.f491r || !u02.onPreparePanel(0, s03.f482i, gVar)) {
            return;
        }
        u02.onMenuOpened(108, s03.f483j);
        this.f445v.f();
    }

    private boolean Q(boolean z10) {
        return R(z10, true);
    }

    private int Q0(int i10) {
        if (i10 == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            return 108;
        }
        if (i10 != 9) {
            return i10;
        }
        Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
        return 109;
    }

    private boolean R(boolean z10, boolean z11) {
        if (this.V) {
            return false;
        }
        int W = W();
        int B0 = B0(this.f438o, W);
        androidx.core.os.h V = Build.VERSION.SDK_INT < 33 ? V(this.f438o) : null;
        if (!z11 && V != null) {
            V = r0(this.f438o.getResources().getConfiguration());
        }
        boolean b12 = b1(B0, V, z10);
        if (W == 0) {
            q0(this.f438o).e();
        } else {
            q qVar = this.f425b0;
            if (qVar != null) {
                qVar.a();
            }
        }
        if (W == 3) {
            p0(this.f438o).e();
        } else {
            q qVar2 = this.f426c0;
            if (qVar2 != null) {
                qVar2.a();
            }
        }
        return b12;
    }

    private void T() {
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) this.F.findViewById(R.id.content);
        View decorView = this.f439p.getDecorView();
        contentFrameLayout.a(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        TypedArray obtainStyledAttributes = this.f438o.obtainStyledAttributes(f.j.f10278y0);
        obtainStyledAttributes.getValue(f.j.K0, contentFrameLayout.getMinWidthMajor());
        obtainStyledAttributes.getValue(f.j.L0, contentFrameLayout.getMinWidthMinor());
        int i10 = f.j.I0;
        if (obtainStyledAttributes.hasValue(i10)) {
            obtainStyledAttributes.getValue(i10, contentFrameLayout.getFixedWidthMajor());
        }
        int i11 = f.j.J0;
        if (obtainStyledAttributes.hasValue(i11)) {
            obtainStyledAttributes.getValue(i11, contentFrameLayout.getFixedWidthMinor());
        }
        int i12 = f.j.G0;
        if (obtainStyledAttributes.hasValue(i12)) {
            obtainStyledAttributes.getValue(i12, contentFrameLayout.getFixedHeightMajor());
        }
        int i13 = f.j.H0;
        if (obtainStyledAttributes.hasValue(i13)) {
            obtainStyledAttributes.getValue(i13, contentFrameLayout.getFixedHeightMinor());
        }
        obtainStyledAttributes.recycle();
        contentFrameLayout.requestLayout();
    }

    private void U(Window window) {
        if (this.f439p != null) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof o) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        o oVar = new o(callback);
        this.f440q = oVar;
        window.setCallback(oVar);
        f1 u10 = f1.u(this.f438o, null, f421p0);
        Drawable h10 = u10.h(0);
        if (h10 != null) {
            window.setBackgroundDrawable(h10);
        }
        u10.w();
        this.f439p = window;
        if (Build.VERSION.SDK_INT < 33 || this.f435l0 != null) {
            return;
        }
        L(null);
    }

    private boolean U0(ViewParent viewParent) {
        if (viewParent == null) {
            return false;
        }
        View decorView = this.f439p.getDecorView();
        while (viewParent != null) {
            if (viewParent == decorView || !(viewParent instanceof View) || androidx.core.view.h0.V((View) viewParent)) {
                return false;
            }
            viewParent = viewParent.getParent();
        }
        return true;
    }

    private int W() {
        int i10 = this.X;
        return i10 != -100 ? i10 : androidx.appcompat.app.g.m();
    }

    private void Y0() {
        if (this.E) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    private void Z() {
        q qVar = this.f425b0;
        if (qVar != null) {
            qVar.a();
        }
        q qVar2 = this.f426c0;
        if (qVar2 != null) {
            qVar2.a();
        }
    }

    private androidx.appcompat.app.d Z0() {
        for (Context context = this.f438o; context != null; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof androidx.appcompat.app.d) {
                return (androidx.appcompat.app.d) context;
            }
            if (!(context instanceof ContextWrapper)) {
                break;
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void a1(Configuration configuration) {
        Activity activity = (Activity) this.f437n;
        if (activity instanceof androidx.lifecycle.n) {
            if (!((androidx.lifecycle.n) activity).getLifecycle().b().c(i.b.CREATED)) {
                return;
            }
        } else if (!this.U || this.V) {
            return;
        }
        activity.onConfigurationChanged(configuration);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean b1(int r9, androidx.core.os.h r10, boolean r11) {
        /*
            r8 = this;
            android.content.Context r1 = r8.f438o
            r4 = 0
            r5 = 0
            r0 = r8
            r2 = r9
            r3 = r10
            android.content.res.Configuration r0 = r0.c0(r1, r2, r3, r4, r5)
            android.content.Context r1 = r8.f438o
            int r1 = r8.o0(r1)
            android.content.res.Configuration r2 = r8.W
            if (r2 != 0) goto L1f
            android.content.Context r2 = r8.f438o
            android.content.res.Resources r2 = r2.getResources()
            android.content.res.Configuration r2 = r2.getConfiguration()
        L1f:
            int r3 = r2.uiMode
            r3 = r3 & 48
            int r4 = r0.uiMode
            r4 = r4 & 48
            androidx.core.os.h r2 = r8.r0(r2)
            r5 = 0
            if (r10 != 0) goto L30
            r0 = r5
            goto L34
        L30:
            androidx.core.os.h r0 = r8.r0(r0)
        L34:
            r6 = 0
            if (r3 == r4) goto L3a
            r3 = 512(0x200, float:7.175E-43)
            goto L3b
        L3a:
            r3 = 0
        L3b:
            if (r0 == 0) goto L47
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L47
            r2 = r3 | 4
            r3 = r2 | 8192(0x2000, float:1.14794E-41)
        L47:
            int r2 = ~r1
            r2 = r2 & r3
            r7 = 1
            if (r2 == 0) goto L71
            if (r11 == 0) goto L71
            boolean r11 = r8.T
            if (r11 == 0) goto L71
            boolean r11 = androidx.appcompat.app.h.f422q0
            if (r11 != 0) goto L5a
            boolean r11 = r8.U
            if (r11 == 0) goto L71
        L5a:
            java.lang.Object r11 = r8.f437n
            boolean r2 = r11 instanceof android.app.Activity
            if (r2 == 0) goto L71
            android.app.Activity r11 = (android.app.Activity) r11
            boolean r11 = r11.isChild()
            if (r11 != 0) goto L71
            java.lang.Object r11 = r8.f437n
            android.app.Activity r11 = (android.app.Activity) r11
            androidx.core.app.b.t(r11)
            r11 = 1
            goto L72
        L71:
            r11 = 0
        L72:
            if (r11 != 0) goto L7f
            if (r3 == 0) goto L7f
            r11 = r3 & r1
            if (r11 != r3) goto L7b
            r6 = 1
        L7b:
            r8.d1(r4, r0, r6, r5)
            goto L80
        L7f:
            r7 = r11
        L80:
            if (r7 == 0) goto L9c
            java.lang.Object r11 = r8.f437n
            boolean r1 = r11 instanceof androidx.appcompat.app.d
            if (r1 == 0) goto L9c
            r1 = r3 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L91
            androidx.appcompat.app.d r11 = (androidx.appcompat.app.d) r11
            r11.B(r9)
        L91:
            r9 = r3 & 4
            if (r9 == 0) goto L9c
            java.lang.Object r9 = r8.f437n
            androidx.appcompat.app.d r9 = (androidx.appcompat.app.d) r9
            r9.A(r10)
        L9c:
            if (r7 == 0) goto Lb1
            if (r0 == 0) goto Lb1
            android.content.Context r9 = r8.f438o
            android.content.res.Resources r9 = r9.getResources()
            android.content.res.Configuration r9 = r9.getConfiguration()
            androidx.core.os.h r9 = r8.r0(r9)
            r8.S0(r9)
        Lb1:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.h.b1(int, androidx.core.os.h, boolean):boolean");
    }

    private Configuration c0(Context context, int i10, androidx.core.os.h hVar, Configuration configuration, boolean z10) {
        int i11 = i10 != 1 ? i10 != 2 ? z10 ? 0 : context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32 : 16;
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i11 | (configuration2.uiMode & (-49));
        if (hVar != null) {
            R0(configuration2, hVar);
        }
        return configuration2;
    }

    private ViewGroup d0() {
        ViewGroup viewGroup;
        TypedArray obtainStyledAttributes = this.f438o.obtainStyledAttributes(f.j.f10278y0);
        int i10 = f.j.D0;
        if (!obtainStyledAttributes.hasValue(i10)) {
            obtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        if (obtainStyledAttributes.getBoolean(f.j.M0, false)) {
            H(1);
        } else if (obtainStyledAttributes.getBoolean(i10, false)) {
            H(108);
        }
        if (obtainStyledAttributes.getBoolean(f.j.E0, false)) {
            H(109);
        }
        if (obtainStyledAttributes.getBoolean(f.j.F0, false)) {
            H(10);
        }
        this.N = obtainStyledAttributes.getBoolean(f.j.f10283z0, false);
        obtainStyledAttributes.recycle();
        k0();
        this.f439p.getDecorView();
        LayoutInflater from = LayoutInflater.from(this.f438o);
        if (this.O) {
            viewGroup = (ViewGroup) from.inflate(this.M ? f.g.f10130o : f.g.f10129n, (ViewGroup) null);
        } else if (this.N) {
            viewGroup = (ViewGroup) from.inflate(f.g.f10121f, (ViewGroup) null);
            this.L = false;
            this.K = false;
        } else if (this.K) {
            TypedValue typedValue = new TypedValue();
            this.f438o.getTheme().resolveAttribute(f.a.f10019d, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new androidx.appcompat.view.d(this.f438o, typedValue.resourceId) : this.f438o).inflate(f.g.f10131p, (ViewGroup) null);
            androidx.appcompat.widget.i0 i0Var = (androidx.appcompat.widget.i0) viewGroup.findViewById(f.f.f10105p);
            this.f445v = i0Var;
            i0Var.setWindowCallback(u0());
            if (this.L) {
                this.f445v.k(109);
            }
            if (this.I) {
                this.f445v.k(2);
            }
            if (this.J) {
                this.f445v.k(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.K + ", windowActionBarOverlay: " + this.L + ", android:windowIsFloating: " + this.N + ", windowActionModeOverlay: " + this.M + ", windowNoTitle: " + this.O + " }");
        }
        androidx.core.view.h0.F0(viewGroup, new b());
        if (this.f445v == null) {
            this.G = (TextView) viewGroup.findViewById(f.f.M);
        }
        q1.c(viewGroup);
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(f.f.f10091b);
        ViewGroup viewGroup2 = (ViewGroup) this.f439p.findViewById(R.id.content);
        if (viewGroup2 != null) {
            while (viewGroup2.getChildCount() > 0) {
                View childAt = viewGroup2.getChildAt(0);
                viewGroup2.removeViewAt(0);
                contentFrameLayout.addView(childAt);
            }
            viewGroup2.setId(-1);
            contentFrameLayout.setId(R.id.content);
            if (viewGroup2 instanceof FrameLayout) {
                ((FrameLayout) viewGroup2).setForeground(null);
            }
        }
        this.f439p.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new c());
        return viewGroup;
    }

    private void d1(int i10, androidx.core.os.h hVar, boolean z10, Configuration configuration) {
        Resources resources = this.f438o.getResources();
        Configuration configuration2 = new Configuration(resources.getConfiguration());
        if (configuration != null) {
            configuration2.updateFrom(configuration);
        }
        configuration2.uiMode = i10 | (resources.getConfiguration().uiMode & (-49));
        if (hVar != null) {
            R0(configuration2, hVar);
        }
        resources.updateConfiguration(configuration2, null);
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < 26) {
            e0.a(resources);
        }
        int i12 = this.Y;
        if (i12 != 0) {
            this.f438o.setTheme(i12);
            if (i11 >= 23) {
                this.f438o.getTheme().applyStyle(this.Y, true);
            }
        }
        if (z10 && (this.f437n instanceof Activity)) {
            a1(configuration2);
        }
    }

    private void f1(View view) {
        Context context;
        int i10;
        if ((androidx.core.view.h0.P(view) & 8192) != 0) {
            context = this.f438o;
            i10 = f.c.f10044b;
        } else {
            context = this.f438o;
            i10 = f.c.f10043a;
        }
        view.setBackgroundColor(androidx.core.content.a.c(context, i10));
    }

    private void j0() {
        if (this.E) {
            return;
        }
        this.F = d0();
        CharSequence t02 = t0();
        if (!TextUtils.isEmpty(t02)) {
            androidx.appcompat.widget.i0 i0Var = this.f445v;
            if (i0Var != null) {
                i0Var.setWindowTitle(t02);
            } else if (M0() != null) {
                M0().w(t02);
            } else {
                TextView textView = this.G;
                if (textView != null) {
                    textView.setText(t02);
                }
            }
        }
        T();
        K0(this.F);
        this.E = true;
        u s02 = s0(0, false);
        if (this.V) {
            return;
        }
        if (s02 == null || s02.f483j == null) {
            z0(108);
        }
    }

    private void k0() {
        if (this.f439p == null) {
            Object obj = this.f437n;
            if (obj instanceof Activity) {
                U(((Activity) obj).getWindow());
            }
        }
        if (this.f439p == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    private static Configuration m0(Configuration configuration, Configuration configuration2) {
        Configuration configuration3 = new Configuration();
        configuration3.fontScale = 0.0f;
        if (configuration2 != null && configuration.diff(configuration2) != 0) {
            float f10 = configuration.fontScale;
            float f11 = configuration2.fontScale;
            if (f10 != f11) {
                configuration3.fontScale = f11;
            }
            int i10 = configuration.mcc;
            int i11 = configuration2.mcc;
            if (i10 != i11) {
                configuration3.mcc = i11;
            }
            int i12 = configuration.mnc;
            int i13 = configuration2.mnc;
            if (i12 != i13) {
                configuration3.mnc = i13;
            }
            int i14 = Build.VERSION.SDK_INT;
            if (i14 >= 24) {
                l.a(configuration, configuration2, configuration3);
            } else if (!androidx.core.util.c.a(configuration.locale, configuration2.locale)) {
                configuration3.locale = configuration2.locale;
            }
            int i15 = configuration.touchscreen;
            int i16 = configuration2.touchscreen;
            if (i15 != i16) {
                configuration3.touchscreen = i16;
            }
            int i17 = configuration.keyboard;
            int i18 = configuration2.keyboard;
            if (i17 != i18) {
                configuration3.keyboard = i18;
            }
            int i19 = configuration.keyboardHidden;
            int i20 = configuration2.keyboardHidden;
            if (i19 != i20) {
                configuration3.keyboardHidden = i20;
            }
            int i21 = configuration.navigation;
            int i22 = configuration2.navigation;
            if (i21 != i22) {
                configuration3.navigation = i22;
            }
            int i23 = configuration.navigationHidden;
            int i24 = configuration2.navigationHidden;
            if (i23 != i24) {
                configuration3.navigationHidden = i24;
            }
            int i25 = configuration.orientation;
            int i26 = configuration2.orientation;
            if (i25 != i26) {
                configuration3.orientation = i26;
            }
            int i27 = configuration.screenLayout & 15;
            int i28 = configuration2.screenLayout;
            if (i27 != (i28 & 15)) {
                configuration3.screenLayout |= i28 & 15;
            }
            int i29 = configuration.screenLayout & 192;
            int i30 = configuration2.screenLayout;
            if (i29 != (i30 & 192)) {
                configuration3.screenLayout |= i30 & 192;
            }
            int i31 = configuration.screenLayout & 48;
            int i32 = configuration2.screenLayout;
            if (i31 != (i32 & 48)) {
                configuration3.screenLayout |= i32 & 48;
            }
            int i33 = configuration.screenLayout & 768;
            int i34 = configuration2.screenLayout;
            if (i33 != (i34 & 768)) {
                configuration3.screenLayout |= i34 & 768;
            }
            if (i14 >= 26) {
                m.a(configuration, configuration2, configuration3);
            }
            int i35 = configuration.uiMode & 15;
            int i36 = configuration2.uiMode;
            if (i35 != (i36 & 15)) {
                configuration3.uiMode |= i36 & 15;
            }
            int i37 = configuration.uiMode & 48;
            int i38 = configuration2.uiMode;
            if (i37 != (i38 & 48)) {
                configuration3.uiMode |= i38 & 48;
            }
            int i39 = configuration.screenWidthDp;
            int i40 = configuration2.screenWidthDp;
            if (i39 != i40) {
                configuration3.screenWidthDp = i40;
            }
            int i41 = configuration.screenHeightDp;
            int i42 = configuration2.screenHeightDp;
            if (i41 != i42) {
                configuration3.screenHeightDp = i42;
            }
            int i43 = configuration.smallestScreenWidthDp;
            int i44 = configuration2.smallestScreenWidthDp;
            if (i43 != i44) {
                configuration3.smallestScreenWidthDp = i44;
            }
            j.b(configuration, configuration2, configuration3);
        }
        return configuration3;
    }

    private int o0(Context context) {
        if (!this.f424a0 && (this.f437n instanceof Activity)) {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                return 0;
            }
            try {
                int i10 = Build.VERSION.SDK_INT;
                ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(context, this.f437n.getClass()), i10 >= 29 ? 269221888 : i10 >= 24 ? 786432 : 0);
                if (activityInfo != null) {
                    this.Z = activityInfo.configChanges;
                }
            } catch (PackageManager.NameNotFoundException e10) {
                Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e10);
                this.Z = 0;
            }
        }
        this.f424a0 = true;
        return this.Z;
    }

    private q p0(Context context) {
        if (this.f426c0 == null) {
            this.f426c0 = new p(context);
        }
        return this.f426c0;
    }

    private q q0(Context context) {
        if (this.f425b0 == null) {
            this.f425b0 = new r(h0.a(context));
        }
        return this.f425b0;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void v0() {
        /*
            r3 = this;
            r3.j0()
            boolean r0 = r3.K
            if (r0 == 0) goto L37
            androidx.appcompat.app.a r0 = r3.f442s
            if (r0 == 0) goto Lc
            goto L37
        Lc:
            java.lang.Object r0 = r3.f437n
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L20
            androidx.appcompat.app.i0 r0 = new androidx.appcompat.app.i0
            java.lang.Object r1 = r3.f437n
            android.app.Activity r1 = (android.app.Activity) r1
            boolean r2 = r3.L
            r0.<init>(r1, r2)
        L1d:
            r3.f442s = r0
            goto L2e
        L20:
            boolean r0 = r0 instanceof android.app.Dialog
            if (r0 == 0) goto L2e
            androidx.appcompat.app.i0 r0 = new androidx.appcompat.app.i0
            java.lang.Object r1 = r3.f437n
            android.app.Dialog r1 = (android.app.Dialog) r1
            r0.<init>(r1)
            goto L1d
        L2e:
            androidx.appcompat.app.a r0 = r3.f442s
            if (r0 == 0) goto L37
            boolean r1 = r3.f430g0
            r0.r(r1)
        L37:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.h.v0():void");
    }

    private boolean w0(u uVar) {
        View view = uVar.f482i;
        if (view != null) {
            uVar.f481h = view;
            return true;
        }
        if (uVar.f483j == null) {
            return false;
        }
        if (this.f447x == null) {
            this.f447x = new v();
        }
        View view2 = (View) uVar.a(this.f447x);
        uVar.f481h = view2;
        return view2 != null;
    }

    private boolean x0(u uVar) {
        uVar.d(n0());
        uVar.f480g = new t(uVar.f485l);
        uVar.f476c = 81;
        return true;
    }

    private boolean y0(u uVar) {
        Resources.Theme theme;
        Context context = this.f438o;
        int i10 = uVar.f474a;
        if ((i10 == 0 || i10 == 108) && this.f445v != null) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme theme2 = context.getTheme();
            theme2.resolveAttribute(f.a.f10019d, typedValue, true);
            if (typedValue.resourceId != 0) {
                theme = context.getResources().newTheme();
                theme.setTo(theme2);
                theme.applyStyle(typedValue.resourceId, true);
                theme.resolveAttribute(f.a.f10020e, typedValue, true);
            } else {
                theme2.resolveAttribute(f.a.f10020e, typedValue, true);
                theme = null;
            }
            if (typedValue.resourceId != 0) {
                if (theme == null) {
                    theme = context.getResources().newTheme();
                    theme.setTo(theme2);
                }
                theme.applyStyle(typedValue.resourceId, true);
            }
            if (theme != null) {
                androidx.appcompat.view.d dVar = new androidx.appcompat.view.d(context, 0);
                dVar.getTheme().setTo(theme);
                context = dVar;
            }
        }
        androidx.appcompat.view.menu.g gVar = new androidx.appcompat.view.menu.g(context);
        gVar.R(this);
        uVar.c(gVar);
        return true;
    }

    private void z0(int i10) {
        this.f428e0 = (1 << i10) | this.f428e0;
        if (this.f427d0) {
            return;
        }
        androidx.core.view.h0.k0(this.f439p.getDecorView(), this.f429f0);
        this.f427d0 = true;
    }

    @Override // androidx.appcompat.app.g
    public void A(Bundle bundle) {
        j0();
    }

    public boolean A0() {
        return this.D;
    }

    @Override // androidx.appcompat.app.g
    public void B() {
        androidx.appcompat.app.a s10 = s();
        if (s10 != null) {
            s10.u(true);
        }
    }

    int B0(Context context, int i10) {
        q q02;
        if (i10 == -100) {
            return -1;
        }
        if (i10 != -1) {
            if (i10 != 0) {
                if (i10 != 1 && i10 != 2) {
                    if (i10 != 3) {
                        throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                    }
                    q02 = p0(context);
                }
            } else {
                if (Build.VERSION.SDK_INT >= 23 && ((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() == 0) {
                    return -1;
                }
                q02 = q0(context);
            }
            return q02.c();
        }
        return i10;
    }

    @Override // androidx.appcompat.app.g
    public void C(Bundle bundle) {
    }

    boolean C0() {
        boolean z10 = this.S;
        this.S = false;
        u s02 = s0(0, false);
        if (s02 != null && s02.f488o) {
            if (!z10) {
                b0(s02, true);
            }
            return true;
        }
        androidx.appcompat.view.b bVar = this.f448y;
        if (bVar != null) {
            bVar.c();
            return true;
        }
        androidx.appcompat.app.a s10 = s();
        return s10 != null && s10.h();
    }

    @Override // androidx.appcompat.app.g
    public void D() {
        R(true, false);
    }

    boolean D0(int i10, KeyEvent keyEvent) {
        if (i10 == 4) {
            this.S = (keyEvent.getFlags() & 128) != 0;
        } else if (i10 == 82) {
            E0(0, keyEvent);
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.app.g
    public void E() {
        androidx.appcompat.app.a s10 = s();
        if (s10 != null) {
            s10.u(false);
        }
    }

    boolean F0(int i10, KeyEvent keyEvent) {
        androidx.appcompat.app.a s10 = s();
        if (s10 != null && s10.o(i10, keyEvent)) {
            return true;
        }
        u uVar = this.R;
        if (uVar != null && N0(uVar, keyEvent.getKeyCode(), keyEvent, 1)) {
            u uVar2 = this.R;
            if (uVar2 != null) {
                uVar2.f487n = true;
            }
            return true;
        }
        if (this.R == null) {
            u s02 = s0(0, true);
            O0(s02, keyEvent);
            boolean N0 = N0(s02, keyEvent.getKeyCode(), keyEvent, 1);
            s02.f486m = false;
            if (N0) {
                return true;
            }
        }
        return false;
    }

    boolean G0(int i10, KeyEvent keyEvent) {
        if (i10 != 4) {
            if (i10 == 82) {
                H0(0, keyEvent);
                return true;
            }
        } else if (C0()) {
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.app.g
    public boolean H(int i10) {
        int Q0 = Q0(i10);
        if (this.O && Q0 == 108) {
            return false;
        }
        if (this.K && Q0 == 1) {
            this.K = false;
        }
        if (Q0 == 1) {
            Y0();
            this.O = true;
            return true;
        }
        if (Q0 == 2) {
            Y0();
            this.I = true;
            return true;
        }
        if (Q0 == 5) {
            Y0();
            this.J = true;
            return true;
        }
        if (Q0 == 10) {
            Y0();
            this.M = true;
            return true;
        }
        if (Q0 == 108) {
            Y0();
            this.K = true;
            return true;
        }
        if (Q0 != 109) {
            return this.f439p.requestFeature(Q0);
        }
        Y0();
        this.L = true;
        return true;
    }

    @Override // androidx.appcompat.app.g
    public void I(int i10) {
        j0();
        ViewGroup viewGroup = (ViewGroup) this.F.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f438o).inflate(i10, viewGroup);
        this.f440q.c(this.f439p.getCallback());
    }

    void I0(int i10) {
        androidx.appcompat.app.a s10;
        if (i10 != 108 || (s10 = s()) == null) {
            return;
        }
        s10.i(true);
    }

    @Override // androidx.appcompat.app.g
    public void J(View view) {
        j0();
        ViewGroup viewGroup = (ViewGroup) this.F.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f440q.c(this.f439p.getCallback());
    }

    void J0(int i10) {
        if (i10 == 108) {
            androidx.appcompat.app.a s10 = s();
            if (s10 != null) {
                s10.i(false);
                return;
            }
            return;
        }
        if (i10 == 0) {
            u s02 = s0(i10, true);
            if (s02.f488o) {
                b0(s02, false);
            }
        }
    }

    @Override // androidx.appcompat.app.g
    public void K(View view, ViewGroup.LayoutParams layoutParams) {
        j0();
        ViewGroup viewGroup = (ViewGroup) this.F.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f440q.c(this.f439p.getCallback());
    }

    void K0(ViewGroup viewGroup) {
    }

    @Override // androidx.appcompat.app.g
    public void L(OnBackInvokedDispatcher onBackInvokedDispatcher) {
        OnBackInvokedCallback onBackInvokedCallback;
        super.L(onBackInvokedDispatcher);
        OnBackInvokedDispatcher onBackInvokedDispatcher2 = this.f435l0;
        if (onBackInvokedDispatcher2 != null && (onBackInvokedCallback = this.f436m0) != null) {
            n.c(onBackInvokedDispatcher2, onBackInvokedCallback);
            this.f436m0 = null;
        }
        if (onBackInvokedDispatcher == null) {
            Object obj = this.f437n;
            if ((obj instanceof Activity) && ((Activity) obj).getWindow() != null) {
                onBackInvokedDispatcher = n.a((Activity) this.f437n);
            }
        }
        this.f435l0 = onBackInvokedDispatcher;
        c1();
    }

    @Override // androidx.appcompat.app.g
    public void M(Toolbar toolbar) {
        if (this.f437n instanceof Activity) {
            androidx.appcompat.app.a s10 = s();
            if (s10 instanceof i0) {
                throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
            }
            this.f443t = null;
            if (s10 != null) {
                s10.n();
            }
            this.f442s = null;
            if (toolbar != null) {
                f0 f0Var = new f0(toolbar, t0(), this.f440q);
                this.f442s = f0Var;
                this.f440q.e(f0Var.f393c);
                toolbar.setBackInvokedCallbackEnabled(true);
            } else {
                this.f440q.e(null);
            }
            u();
        }
    }

    final androidx.appcompat.app.a M0() {
        return this.f442s;
    }

    @Override // androidx.appcompat.app.g
    public void N(int i10) {
        this.Y = i10;
    }

    @Override // androidx.appcompat.app.g
    public final void O(CharSequence charSequence) {
        this.f444u = charSequence;
        androidx.appcompat.widget.i0 i0Var = this.f445v;
        if (i0Var != null) {
            i0Var.setWindowTitle(charSequence);
            return;
        }
        if (M0() != null) {
            M0().w(charSequence);
            return;
        }
        TextView textView = this.G;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    void R0(Configuration configuration, androidx.core.os.h hVar) {
        if (Build.VERSION.SDK_INT >= 24) {
            l.d(configuration, hVar);
        } else {
            j.d(configuration, hVar.d(0));
            j.c(configuration, hVar.d(0));
        }
    }

    public boolean S() {
        return Q(true);
    }

    void S0(androidx.core.os.h hVar) {
        if (Build.VERSION.SDK_INT >= 24) {
            l.c(hVar);
        } else {
            Locale.setDefault(hVar.d(0));
        }
    }

    final boolean T0() {
        ViewGroup viewGroup;
        return this.E && (viewGroup = this.F) != null && androidx.core.view.h0.W(viewGroup);
    }

    androidx.core.os.h V(Context context) {
        androidx.core.os.h r10;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 33 || (r10 = androidx.appcompat.app.g.r()) == null) {
            return null;
        }
        androidx.core.os.h r02 = r0(context.getApplicationContext().getResources().getConfiguration());
        androidx.core.os.h b10 = i10 >= 24 ? d0.b(r10, r02) : r10.f() ? androidx.core.os.h.e() : androidx.core.os.h.c(r10.d(0).toString());
        return b10.f() ? r02 : b10;
    }

    boolean V0() {
        if (this.f435l0 == null) {
            return false;
        }
        u s02 = s0(0, false);
        return (s02 != null && s02.f488o) || this.f448y != null;
    }

    public androidx.appcompat.view.b W0(b.a aVar) {
        androidx.appcompat.app.e eVar;
        if (aVar == null) {
            throw new IllegalArgumentException("ActionMode callback can not be null.");
        }
        androidx.appcompat.view.b bVar = this.f448y;
        if (bVar != null) {
            bVar.c();
        }
        i iVar = new i(aVar);
        androidx.appcompat.app.a s10 = s();
        if (s10 != null) {
            androidx.appcompat.view.b x10 = s10.x(iVar);
            this.f448y = x10;
            if (x10 != null && (eVar = this.f441r) != null) {
                eVar.b(x10);
            }
        }
        if (this.f448y == null) {
            this.f448y = X0(iVar);
        }
        c1();
        return this.f448y;
    }

    void X(int i10, u uVar, Menu menu) {
        if (menu == null) {
            if (uVar == null && i10 >= 0) {
                u[] uVarArr = this.Q;
                if (i10 < uVarArr.length) {
                    uVar = uVarArr[i10];
                }
            }
            if (uVar != null) {
                menu = uVar.f483j;
            }
        }
        if ((uVar == null || uVar.f488o) && !this.V) {
            this.f440q.d(this.f439p.getCallback(), i10, menu);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    androidx.appcompat.view.b X0(androidx.appcompat.view.b.a r8) {
        /*
            Method dump skipped, instructions count: 365
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.h.X0(androidx.appcompat.view.b$a):androidx.appcompat.view.b");
    }

    void Y(androidx.appcompat.view.menu.g gVar) {
        if (this.P) {
            return;
        }
        this.P = true;
        this.f445v.l();
        Window.Callback u02 = u0();
        if (u02 != null && !this.V) {
            u02.onPanelClosed(108, gVar);
        }
        this.P = false;
    }

    @Override // androidx.appcompat.view.menu.g.a
    public boolean a(androidx.appcompat.view.menu.g gVar, MenuItem menuItem) {
        u l02;
        Window.Callback u02 = u0();
        if (u02 == null || this.V || (l02 = l0(gVar.D())) == null) {
            return false;
        }
        return u02.onMenuItemSelected(l02.f474a, menuItem);
    }

    void a0(int i10) {
        b0(s0(i10, true), true);
    }

    @Override // androidx.appcompat.view.menu.g.a
    public void b(androidx.appcompat.view.menu.g gVar) {
        P0(true);
    }

    void b0(u uVar, boolean z10) {
        ViewGroup viewGroup;
        androidx.appcompat.widget.i0 i0Var;
        if (z10 && uVar.f474a == 0 && (i0Var = this.f445v) != null && i0Var.b()) {
            Y(uVar.f483j);
            return;
        }
        WindowManager windowManager = (WindowManager) this.f438o.getSystemService("window");
        if (windowManager != null && uVar.f488o && (viewGroup = uVar.f480g) != null) {
            windowManager.removeView(viewGroup);
            if (z10) {
                X(uVar.f474a, uVar, null);
            }
        }
        uVar.f486m = false;
        uVar.f487n = false;
        uVar.f488o = false;
        uVar.f481h = null;
        uVar.f490q = true;
        if (this.R == uVar) {
            this.R = null;
        }
        if (uVar.f474a == 0) {
            c1();
        }
    }

    void c1() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean V0 = V0();
            if (V0 && this.f436m0 == null) {
                this.f436m0 = n.b(this.f435l0, this);
            } else {
                if (V0 || (onBackInvokedCallback = this.f436m0) == null) {
                    return;
                }
                n.c(this.f435l0, onBackInvokedCallback);
            }
        }
    }

    @Override // androidx.appcompat.app.g
    public void e(View view, ViewGroup.LayoutParams layoutParams) {
        j0();
        ((ViewGroup) this.F.findViewById(R.id.content)).addView(view, layoutParams);
        this.f440q.c(this.f439p.getCallback());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View e0(View view, String str, Context context, AttributeSet attributeSet) {
        boolean z10;
        y yVar;
        boolean z11 = false;
        if (this.f433j0 == null) {
            String string = this.f438o.obtainStyledAttributes(f.j.f10278y0).getString(f.j.C0);
            if (string == null) {
                yVar = new y();
            } else {
                try {
                    this.f433j0 = (y) this.f438o.getClassLoader().loadClass(string).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (Throwable th) {
                    Log.i("AppCompatDelegate", "Failed to instantiate custom view inflater " + string + ". Falling back to default.", th);
                    yVar = new y();
                }
            }
            this.f433j0 = yVar;
        }
        boolean z12 = f420o0;
        if (z12) {
            if (this.f434k0 == null) {
                this.f434k0 = new c0();
            }
            if (this.f434k0.a(attributeSet)) {
                z10 = true;
            } else {
                if (!(attributeSet instanceof XmlPullParser)) {
                    z11 = U0((ViewParent) view);
                } else if (((XmlPullParser) attributeSet).getDepth() > 1) {
                    z11 = true;
                }
                z10 = z11;
            }
        } else {
            z10 = false;
        }
        return this.f433j0.r(view, str, context, attributeSet, z10, z12, true, p1.c());
    }

    final int e1(h1 h1Var, Rect rect) {
        boolean z10;
        boolean z11;
        int l10 = h1Var != null ? h1Var.l() : rect != null ? rect.top : 0;
        ActionBarContextView actionBarContextView = this.f449z;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z10 = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f449z.getLayoutParams();
            if (this.f449z.isShown()) {
                if (this.f431h0 == null) {
                    this.f431h0 = new Rect();
                    this.f432i0 = new Rect();
                }
                Rect rect2 = this.f431h0;
                Rect rect3 = this.f432i0;
                if (h1Var == null) {
                    rect2.set(rect);
                } else {
                    rect2.set(h1Var.j(), h1Var.l(), h1Var.k(), h1Var.i());
                }
                q1.a(this.F, rect2, rect3);
                int i10 = rect2.top;
                int i11 = rect2.left;
                int i12 = rect2.right;
                h1 L = androidx.core.view.h0.L(this.F);
                int j10 = L == null ? 0 : L.j();
                int k10 = L == null ? 0 : L.k();
                if (marginLayoutParams.topMargin == i10 && marginLayoutParams.leftMargin == i11 && marginLayoutParams.rightMargin == i12) {
                    z11 = false;
                } else {
                    marginLayoutParams.topMargin = i10;
                    marginLayoutParams.leftMargin = i11;
                    marginLayoutParams.rightMargin = i12;
                    z11 = true;
                }
                if (i10 <= 0 || this.H != null) {
                    View view = this.H;
                    if (view != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                        int i13 = marginLayoutParams2.height;
                        int i14 = marginLayoutParams.topMargin;
                        if (i13 != i14 || marginLayoutParams2.leftMargin != j10 || marginLayoutParams2.rightMargin != k10) {
                            marginLayoutParams2.height = i14;
                            marginLayoutParams2.leftMargin = j10;
                            marginLayoutParams2.rightMargin = k10;
                            this.H.setLayoutParams(marginLayoutParams2);
                        }
                    }
                } else {
                    View view2 = new View(this.f438o);
                    this.H = view2;
                    view2.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = j10;
                    layoutParams.rightMargin = k10;
                    this.F.addView(this.H, -1, layoutParams);
                }
                View view3 = this.H;
                r5 = view3 != null;
                if (r5 && view3.getVisibility() != 0) {
                    f1(this.H);
                }
                if (!this.M && r5) {
                    l10 = 0;
                }
                z10 = r5;
                r5 = z11;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z10 = false;
            } else {
                z10 = false;
                r5 = false;
            }
            if (r5) {
                this.f449z.setLayoutParams(marginLayoutParams);
            }
        }
        View view4 = this.H;
        if (view4 != null) {
            view4.setVisibility(z10 ? 0 : 8);
        }
        return l10;
    }

    void f0() {
        androidx.appcompat.view.menu.g gVar;
        androidx.appcompat.widget.i0 i0Var = this.f445v;
        if (i0Var != null) {
            i0Var.l();
        }
        if (this.A != null) {
            this.f439p.getDecorView().removeCallbacks(this.B);
            if (this.A.isShowing()) {
                try {
                    this.A.dismiss();
                } catch (IllegalArgumentException unused) {
                }
            }
            this.A = null;
        }
        i0();
        u s02 = s0(0, false);
        if (s02 == null || (gVar = s02.f483j) == null) {
            return;
        }
        gVar.close();
    }

    @Override // androidx.appcompat.app.g
    public Context g(Context context) {
        this.T = true;
        int B0 = B0(context, W());
        if (androidx.appcompat.app.g.v(context)) {
            androidx.appcompat.app.g.P(context);
        }
        androidx.core.os.h V = V(context);
        if (f423r0 && (context instanceof ContextThemeWrapper)) {
            try {
                s.a((ContextThemeWrapper) context, c0(context, B0, V, null, false));
                return context;
            } catch (IllegalStateException unused) {
            }
        }
        if (context instanceof androidx.appcompat.view.d) {
            try {
                ((androidx.appcompat.view.d) context).a(c0(context, B0, V, null, false));
                return context;
            } catch (IllegalStateException unused2) {
            }
        }
        if (!f422q0) {
            return super.g(context);
        }
        Configuration configuration = new Configuration();
        configuration.uiMode = -1;
        configuration.fontScale = 0.0f;
        Configuration configuration2 = j.a(context, configuration).getResources().getConfiguration();
        Configuration configuration3 = context.getResources().getConfiguration();
        configuration2.uiMode = configuration3.uiMode;
        Configuration c02 = c0(context, B0, V, !configuration2.equals(configuration3) ? m0(configuration2, configuration3) : null, true);
        androidx.appcompat.view.d dVar = new androidx.appcompat.view.d(context, f.i.f10153d);
        dVar.a(c02);
        boolean z10 = false;
        try {
            z10 = context.getTheme() != null;
        } catch (NullPointerException unused3) {
        }
        if (z10) {
            h.f.a(dVar.getTheme());
        }
        return super.g(dVar);
    }

    boolean g0(KeyEvent keyEvent) {
        View decorView;
        Object obj = this.f437n;
        if (((obj instanceof p.a) || (obj instanceof x)) && (decorView = this.f439p.getDecorView()) != null && androidx.core.view.p.d(decorView, keyEvent)) {
            return true;
        }
        if (keyEvent.getKeyCode() == 82 && this.f440q.b(this.f439p.getCallback(), keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        return keyEvent.getAction() == 0 ? D0(keyCode, keyEvent) : G0(keyCode, keyEvent);
    }

    void h0(int i10) {
        u s02;
        u s03 = s0(i10, true);
        if (s03.f483j != null) {
            Bundle bundle = new Bundle();
            s03.f483j.Q(bundle);
            if (bundle.size() > 0) {
                s03.f492s = bundle;
            }
            s03.f483j.d0();
            s03.f483j.clear();
        }
        s03.f491r = true;
        s03.f490q = true;
        if ((i10 != 108 && i10 != 0) || this.f445v == null || (s02 = s0(0, false)) == null) {
            return;
        }
        s02.f486m = false;
        O0(s02, null);
    }

    void i0() {
        p0 p0Var = this.C;
        if (p0Var != null) {
            p0Var.c();
        }
    }

    @Override // androidx.appcompat.app.g
    public View j(int i10) {
        j0();
        return this.f439p.findViewById(i10);
    }

    @Override // androidx.appcompat.app.g
    public Context l() {
        return this.f438o;
    }

    u l0(Menu menu) {
        u[] uVarArr = this.Q;
        int length = uVarArr != null ? uVarArr.length : 0;
        for (int i10 = 0; i10 < length; i10++) {
            u uVar = uVarArr[i10];
            if (uVar != null && uVar.f483j == menu) {
                return uVar;
            }
        }
        return null;
    }

    @Override // androidx.appcompat.app.g
    public final b.InterfaceC0009b n() {
        return new f();
    }

    final Context n0() {
        androidx.appcompat.app.a s10 = s();
        Context k10 = s10 != null ? s10.k() : null;
        return k10 == null ? this.f438o : k10;
    }

    @Override // androidx.appcompat.app.g
    public int o() {
        return this.X;
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return e0(view, str, context, attributeSet);
    }

    @Override // androidx.appcompat.app.g
    public MenuInflater q() {
        if (this.f443t == null) {
            v0();
            androidx.appcompat.app.a aVar = this.f442s;
            this.f443t = new androidx.appcompat.view.g(aVar != null ? aVar.k() : this.f438o);
        }
        return this.f443t;
    }

    androidx.core.os.h r0(Configuration configuration) {
        return Build.VERSION.SDK_INT >= 24 ? l.b(configuration) : androidx.core.os.h.c(k.b(configuration.locale));
    }

    @Override // androidx.appcompat.app.g
    public androidx.appcompat.app.a s() {
        v0();
        return this.f442s;
    }

    protected u s0(int i10, boolean z10) {
        u[] uVarArr = this.Q;
        if (uVarArr == null || uVarArr.length <= i10) {
            u[] uVarArr2 = new u[i10 + 1];
            if (uVarArr != null) {
                System.arraycopy(uVarArr, 0, uVarArr2, 0, uVarArr.length);
            }
            this.Q = uVarArr2;
            uVarArr = uVarArr2;
        }
        u uVar = uVarArr[i10];
        if (uVar != null) {
            return uVar;
        }
        u uVar2 = new u(i10);
        uVarArr[i10] = uVar2;
        return uVar2;
    }

    @Override // androidx.appcompat.app.g
    public void t() {
        LayoutInflater from = LayoutInflater.from(this.f438o);
        if (from.getFactory() == null) {
            androidx.core.view.q.a(from, this);
        } else {
            if (from.getFactory2() instanceof h) {
                return;
            }
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    final CharSequence t0() {
        Object obj = this.f437n;
        return obj instanceof Activity ? ((Activity) obj).getTitle() : this.f444u;
    }

    @Override // androidx.appcompat.app.g
    public void u() {
        if (M0() == null || s().l()) {
            return;
        }
        z0(0);
    }

    final Window.Callback u0() {
        return this.f439p.getCallback();
    }

    @Override // androidx.appcompat.app.g
    public void x(Configuration configuration) {
        androidx.appcompat.app.a s10;
        if (this.K && this.E && (s10 = s()) != null) {
            s10.m(configuration);
        }
        androidx.appcompat.widget.j.b().g(this.f438o);
        this.W = new Configuration(this.f438o.getResources().getConfiguration());
        R(false, false);
    }

    @Override // androidx.appcompat.app.g
    public void y(Bundle bundle) {
        String str;
        this.T = true;
        Q(false);
        k0();
        Object obj = this.f437n;
        if (obj instanceof Activity) {
            try {
                str = androidx.core.app.i.c((Activity) obj);
            } catch (IllegalArgumentException unused) {
                str = null;
            }
            if (str != null) {
                androidx.appcompat.app.a M0 = M0();
                if (M0 == null) {
                    this.f430g0 = true;
                } else {
                    M0.r(true);
                }
            }
            androidx.appcompat.app.g.d(this);
        }
        this.W = new Configuration(this.f438o.getResources().getConfiguration());
        this.U = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0058  */
    @Override // androidx.appcompat.app.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void z() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f437n
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L9
            androidx.appcompat.app.g.F(r3)
        L9:
            boolean r0 = r3.f427d0
            if (r0 == 0) goto L18
            android.view.Window r0 = r3.f439p
            android.view.View r0 = r0.getDecorView()
            java.lang.Runnable r1 = r3.f429f0
            r0.removeCallbacks(r1)
        L18:
            r0 = 1
            r3.V = r0
            int r0 = r3.X
            r1 = -100
            if (r0 == r1) goto L45
            java.lang.Object r0 = r3.f437n
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L45
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = r0.isChangingConfigurations()
            if (r0 == 0) goto L45
            androidx.collection.g r0 = androidx.appcompat.app.h.f419n0
            java.lang.Object r1 = r3.f437n
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            int r2 = r3.X
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            goto L54
        L45:
            androidx.collection.g r0 = androidx.appcompat.app.h.f419n0
            java.lang.Object r1 = r3.f437n
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r0.remove(r1)
        L54:
            androidx.appcompat.app.a r0 = r3.f442s
            if (r0 == 0) goto L5b
            r0.n()
        L5b:
            r3.Z()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.h.z():void");
    }

    h(Dialog dialog, androidx.appcompat.app.e eVar) {
        this(dialog.getContext(), dialog.getWindow(), eVar, dialog);
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    private h(Context context, Window window, androidx.appcompat.app.e eVar, Object obj) {
        androidx.appcompat.app.d Z0;
        this.C = null;
        this.D = true;
        this.X = -100;
        this.f429f0 = new a();
        this.f438o = context;
        this.f441r = eVar;
        this.f437n = obj;
        if (this.X == -100 && (obj instanceof Dialog) && (Z0 = Z0()) != null) {
            this.X = Z0.v().o();
        }
        if (this.X == -100) {
            androidx.collection.g gVar = f419n0;
            Integer num = (Integer) gVar.get(obj.getClass().getName());
            if (num != null) {
                this.X = num.intValue();
                gVar.remove(obj.getClass().getName());
            }
        }
        if (window != null) {
            U(window);
        }
        androidx.appcompat.widget.j.h();
    }
}