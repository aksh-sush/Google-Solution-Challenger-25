package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import y3.n;

public final class d implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {

    /* renamed from: i  reason: collision with root package name */
    private static final d f5338i = new d();

    /* renamed from: e  reason: collision with root package name */
    private final AtomicBoolean f5339e = new AtomicBoolean();

    /* renamed from: f  reason: collision with root package name */
    private final AtomicBoolean f5340f = new AtomicBoolean();

    /* renamed from: g  reason: collision with root package name */
    private final ArrayList f5341g = new ArrayList();

    /* renamed from: h  reason: collision with root package name */
    private boolean f5342h = false;

    public interface a {
        void onBackgroundStateChanged(boolean z10);
    }

    private d() {
    }

    public static d b() {
        return f5338i;
    }

    public static void c(Application application) {
        d dVar = f5338i;
        synchronized (dVar) {
            if (!dVar.f5342h) {
                application.registerActivityLifecycleCallbacks(dVar);
                application.registerComponentCallbacks(dVar);
                dVar.f5342h = true;
            }
        }
    }

    private final void f(boolean z10) {
        synchronized (f5338i) {
            Iterator it = this.f5341g.iterator();
            while (it.hasNext()) {
                ((a) it.next()).onBackgroundStateChanged(z10);
            }
        }
    }

    public void a(a aVar) {
        synchronized (f5338i) {
            this.f5341g.add(aVar);
        }
    }

    public boolean d() {
        return this.f5339e.get();
    }

    public boolean e(boolean z10) {
        if (!this.f5340f.get()) {
            if (!n.b()) {
                return z10;
            }
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (!this.f5340f.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                this.f5339e.set(true);
            }
        }
        return d();
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        boolean compareAndSet = this.f5339e.compareAndSet(true, false);
        this.f5340f.set(true);
        if (compareAndSet) {
            f(false);
        }
    }

    public final void onActivityDestroyed(Activity activity) {
    }

    public final void onActivityPaused(Activity activity) {
    }

    public final void onActivityResumed(Activity activity) {
        boolean compareAndSet = this.f5339e.compareAndSet(true, false);
        this.f5340f.set(true);
        if (compareAndSet) {
            f(false);
        }
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
    }

    public final void onActivityStopped(Activity activity) {
    }

    public final void onConfigurationChanged(Configuration configuration) {
    }

    public final void onLowMemory() {
    }

    public final void onTrimMemory(int i10) {
        if (i10 == 20 && this.f5339e.compareAndSet(false, true)) {
            this.f5340f.set(true);
            f(true);
        }
    }
}
