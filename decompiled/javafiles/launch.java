package androidx.core.app;

import android.app.Activity;
import android.app.Application;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

/* loaded from: classes.dex */
abstract class d {

    /* renamed from: a, reason: collision with root package name */
    protected static final Class f2040a;

    /* renamed from: b, reason: collision with root package name */
    protected static final Field f2041b;

    /* renamed from: c, reason: collision with root package name */
    protected static final Field f2042c;

    /* renamed from: d, reason: collision with root package name */
    protected static final Method f2043d;

    /* renamed from: e, reason: collision with root package name */
    protected static final Method f2044e;

    /* renamed from: f, reason: collision with root package name */
    protected static final Method f2045f;

    /* renamed from: g, reason: collision with root package name */
    private static final Handler f2046g = new Handler(Looper.getMainLooper());

    class a implements Runnable {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ C0020d f2047e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Object f2048f;

        a(C0020d c0020d, Object obj) {
            this.f2047e = c0020d;
            this.f2048f = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f2047e.f2053e = this.f2048f;
        }
    }

    class b implements Runnable {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Application f2049e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ C0020d f2050f;

        b(Application application, C0020d c0020d) {
            this.f2049e = application;
            this.f2050f = c0020d;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f2049e.unregisterActivityLifecycleCallbacks(this.f2050f);
        }
    }

    class c implements Runnable {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Object f2051e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Object f2052f;

        c(Object obj, Object obj2) {
            this.f2051e = obj;
            this.f2052f = obj2;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Method method = d.f2043d;
                if (method != null) {
                    method.invoke(this.f2051e, this.f2052f, Boolean.FALSE, "AppCompat recreation");
                } else {
                    d.f2044e.invoke(this.f2051e, this.f2052f, Boolean.FALSE);
                }
            } catch (RuntimeException e10) {
                if (e10.getClass() == RuntimeException.class && e10.getMessage() != null && e10.getMessage().startsWith("Unable to stop")) {
                    throw e10;
                }
            } catch (Throwable th) {
                Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th);
            }
        }
    }

    /* renamed from: androidx.core.app.d$d, reason: collision with other inner class name */
    private static final class C0020d implements Application.ActivityLifecycleCallbacks {

        /* renamed from: e, reason: collision with root package name */
        Object f2053e;

        /* renamed from: f, reason: collision with root package name */
        private Activity f2054f;

        /* renamed from: g, reason: collision with root package name */
        private final int f2055g;

        /* renamed from: h, reason: collision with root package name */
        private boolean f2056h = false;

        /* renamed from: i, reason: collision with root package name */
        private boolean f2057i = false;

        /* renamed from: j, reason: collision with root package name */
        private boolean f2058j = false;

        C0020d(Activity activity) {
            this.f2054f = activity;
            this.f2055g = activity.hashCode();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            if (this.f2054f == activity) {
                this.f2054f = null;
                this.f2057i = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            if (!this.f2057i || this.f2058j || this.f2056h || !d.h(this.f2053e, this.f2055g, activity)) {
                return;
            }
            this.f2058j = true;
            this.f2053e = null;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            if (this.f2054f == activity) {
                this.f2056h = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }
    }

    static {
        Class a10 = a();
        f2040a = a10;
        f2041b = b();
        f2042c = f();
        f2043d = d(a10);
        f2044e = c(a10);
        f2045f = e(a10);
    }

    private static Class a() {
        try {
            return Class.forName("android.app.ActivityThread");
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Field b() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mMainThread");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Method c(Class cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Method d(Class cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE, String.class);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Method e(Class cls) {
        if (g() && cls != null) {
            try {
                Class<?> cls2 = Boolean.TYPE;
                Method declaredMethod = cls.getDeclaredMethod("requestRelaunchActivity", IBinder.class, List.class, List.class, Integer.TYPE, cls2, Configuration.class, Configuration.class, cls2, cls2);
                declaredMethod.setAccessible(true);
                return declaredMethod;
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    private static Field f() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mToken");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static boolean g() {
        int i10 = Build.VERSION.SDK_INT;
        return i10 == 26 || i10 == 27;
    }

    protected static boolean h(Object obj, int i10, Activity activity) {
        try {
            Object obj2 = f2042c.get(activity);
            if (obj2 == obj && activity.hashCode() == i10) {
                f2046g.postAtFrontOfQueue(new c(f2041b.get(activity), obj2));
                return true;
            }
            return false;
        } catch (Throwable th) {
            Log.e("ActivityRecreator", "Exception while fetching field values", th);
            return false;
        }
    }

    static boolean i(Activity activity) {
        Object obj;
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
            return true;
        }
        if (g() && f2045f == null) {
            return false;
        }
        if (f2044e == null && f2043d == null) {
            return false;
        }
        try {
            Object obj2 = f2042c.get(activity);
            if (obj2 == null || (obj = f2041b.get(activity)) == null) {
                return false;
            }
            Application application = activity.getApplication();
            C0020d c0020d = new C0020d(activity);
            application.registerActivityLifecycleCallbacks(c0020d);
            Handler handler = f2046g;
            handler.post(new a(c0020d, obj2));
            try {
                if (g()) {
                    Method method = f2045f;
                    Boolean bool = Boolean.FALSE;
                    method.invoke(obj, obj2, null, null, 0, bool, null, null, bool, bool);
                } else {
                    activity.recreate();
                }
                handler.post(new b(application, c0020d));
                return true;
            } catch (Throwable th) {
                f2046g.post(new b(application, c0020d));
                throw th;
            }
        } catch (Throwable unused) {
            return false;
        }
    }
}