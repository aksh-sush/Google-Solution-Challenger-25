package com.google.android.gms.common.api.internal;

import android.app.Activity;
import java.util.ArrayList;
import java.util.List;

final class y extends LifecycleCallback {

    /* renamed from: e  reason: collision with root package name */
    private List f5539e = new ArrayList();

    private y(k kVar) {
        super(kVar);
        this.mLifecycleFragment.a("LifecycleObserverOnStop", this);
    }

    static /* bridge */ /* synthetic */ y a(Activity activity) {
        y yVar;
        synchronized (activity) {
            k fragment = LifecycleCallback.getFragment(activity);
            yVar = (y) fragment.b("LifecycleObserverOnStop", y.class);
            if (yVar == null) {
                yVar = new y(fragment);
            }
        }
        return yVar;
    }

    /* access modifiers changed from: private */
    public final synchronized void c(Runnable runnable) {
        this.f5539e.add(runnable);
    }

    public final void onStop() {
        List<Runnable> list;
        synchronized (this) {
            list = this.f5539e;
            this.f5539e = new ArrayList();
        }
        for (Runnable run : list) {
            run.run();
        }
    }
}
