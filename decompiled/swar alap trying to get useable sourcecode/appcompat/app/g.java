package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.app.LocaleManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.LocaleList;
import android.util.Log;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.app.b;
import androidx.appcompat.app.b0;
import androidx.appcompat.widget.Toolbar;
import java.lang.ref.WeakReference;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: e, reason: collision with root package name */
    static b0.a f406e = new b0.a(new b0.b());

    /* renamed from: f, reason: collision with root package name */
    private static int f407f = -100;

    /* renamed from: g, reason: collision with root package name */
    private static androidx.core.os.h f408g = null;

    /* renamed from: h, reason: collision with root package name */
    private static androidx.core.os.h f409h = null;

    /* renamed from: i, reason: collision with root package name */
    private static Boolean f410i = null;

    /* renamed from: j, reason: collision with root package name */
    private static boolean f411j = false;

    /* renamed from: k, reason: collision with root package name */
    private static final androidx.collection.b f412k = new androidx.collection.b();

    /* renamed from: l, reason: collision with root package name */
    private static final Object f413l = new Object();

    /* renamed from: m, reason: collision with root package name */
    private static final Object f414m = new Object();

    static class a {
        static LocaleList a(String str) {
            return LocaleList.forLanguageTags(str);
        }
    }

    static class b {
        static LocaleList a(Object obj) {
            return ((LocaleManager) obj).getApplicationLocales();
        }

        static void b(Object obj, LocaleList localeList) {
            ((LocaleManager) obj).setApplicationLocales(localeList);
        }
    }

    g() {
    }

    static void F(g gVar) {
        synchronized (f413l) {
            G(gVar);
        }
    }

    private static void G(g gVar) {
        synchronized (f413l) {
            Iterator it = f412k.iterator();
            while (it.hasNext()) {
                g gVar2 = (g) ((WeakReference) it.next()).get();
                if (gVar2 == gVar || gVar2 == null) {
                    it.remove();
                }
            }
        }
    }

    static void P(final Context context) {
        if (v(context)) {
            if (androidx.core.os.a.d()) {
                if (f411j) {
                    return;
                }
                f406e.execute(new Runnable() { // from class: androidx.appcompat.app.f
                    @Override // java.lang.Runnable
                    public final void run() {
                        g.w(context);
                    }
                });
                return;
            }
            synchronized (f414m) {
                androidx.core.os.h hVar = f408g;
                if (hVar == null) {
                    if (f409h == null) {
                        f409h = androidx.core.os.h.c(b0.b(context));
                    }
                    if (f409h.f()) {
                    } else {
                        f408g = f409h;
                    }
                } else if (!hVar.equals(f409h)) {
                    androidx.core.os.h hVar2 = f408g;
                    f409h = hVar2;
                    b0.a(context, hVar2.h());
                }
            }
        }
    }

    static void d(g gVar) {
        synchronized (f413l) {
            G(gVar);
            f412k.add(new WeakReference(gVar));
        }
    }

    public static g h(Activity activity, e eVar) {
        return new h(activity, eVar);
    }

    public static g i(Dialog dialog, e eVar) {
        return new h(dialog, eVar);
    }

    public static androidx.core.os.h k() {
        if (androidx.core.os.a.d()) {
            Object p10 = p();
            if (p10 != null) {
                return androidx.core.os.h.i(b.a(p10));
            }
        } else {
            androidx.core.os.h hVar = f408g;
            if (hVar != null) {
                return hVar;
            }
        }
        return androidx.core.os.h.e();
    }

    public static int m() {
        return f407f;
    }

    static Object p() {
        Context l10;
        Iterator it = f412k.iterator();
        while (it.hasNext()) {
            g gVar = (g) ((WeakReference) it.next()).get();
            if (gVar != null && (l10 = gVar.l()) != null) {
                return l10.getSystemService("locale");
            }
        }
        return null;
    }

    static androidx.core.os.h r() {
        return f408g;
    }

    static boolean v(Context context) {
        if (f410i == null) {
            try {
                Bundle bundle = z.a(context).metaData;
                if (bundle != null) {
                    f410i = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                Log.d("AppCompatDelegate", "Checking for metadata for AppLocalesMetadataHolderService : Service not found");
                f410i = Boolean.FALSE;
            }
        }
        return f410i.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void w(Context context) {
        b0.c(context);
        f411j = true;
    }

    public abstract void A(Bundle bundle);

    public abstract void B();

    public abstract void C(Bundle bundle);

    public abstract void D();

    public abstract void E();

    public abstract boolean H(int i10);

    public abstract void I(int i10);

    public abstract void J(View view);

    public abstract void K(View view, ViewGroup.LayoutParams layoutParams);

    public void L(OnBackInvokedDispatcher onBackInvokedDispatcher) {
    }

    public abstract void M(Toolbar toolbar);

    public abstract void N(int i10);

    public abstract void O(CharSequence charSequence);

    public abstract void e(View view, ViewGroup.LayoutParams layoutParams);

    public void f(Context context) {
    }

    public Context g(Context context) {
        f(context);
        return context;
    }

    public abstract View j(int i10);

    public abstract Context l();

    public abstract b.InterfaceC0009b n();

    public abstract int o();

    public abstract MenuInflater q();

    public abstract androidx.appcompat.app.a s();

    public abstract void t();

    public abstract void u();

    public abstract void x(Configuration configuration);

    public abstract void y(Bundle bundle);

    public abstract void z();
}