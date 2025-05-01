package com.google.firebase.firestore.core;

import android.app.Activity;
import android.app.Fragment;
import androidx.fragment.app.e;
import androidx.lifecycle.g;
import com.google.firebase.firestore.ListenerRegistration;
import com.google.firebase.firestore.util.Assert;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ActivityScope {
    private static final String FRAGMENT_TAG = "FirestoreOnStopObserverFragment";
    private static final String SUPPORT_FRAGMENT_TAG = "FirestoreOnStopObserverSupportFragment";

    public static class StopListenerFragment extends Fragment {
        b callbacks = new b();

        public void onStop() {
            b bVar;
            super.onStop();
            synchronized (this.callbacks) {
                bVar = this.callbacks;
                this.callbacks = new b();
            }
            bVar.b();
        }
    }

    public static class StopListenerSupportFragment extends androidx.fragment.app.Fragment {
        b callbacks = new b();

        public /* bridge */ /* synthetic */ n0.a getDefaultViewModelCreationExtras() {
            return g.a(this);
        }

        public void onStop() {
            b bVar;
            super.onStop();
            synchronized (this.callbacks) {
                bVar = this.callbacks;
                this.callbacks = new b();
            }
            bVar.b();
        }
    }

    private static class b {

        /* renamed from: a  reason: collision with root package name */
        private final List f7834a;

        private b() {
            this.f7834a = new ArrayList();
        }

        /* access modifiers changed from: package-private */
        public synchronized void a(Runnable runnable) {
            this.f7834a.add(runnable);
        }

        /* access modifiers changed from: package-private */
        public void b() {
            for (Runnable runnable : this.f7834a) {
                if (runnable != null) {
                    runnable.run();
                }
            }
        }
    }

    public static ListenerRegistration bind(Activity activity, ListenerRegistration listenerRegistration) {
        if (activity != null) {
            if (activity instanceof e) {
                Objects.requireNonNull(listenerRegistration);
                onFragmentActivityStopCallOnce((e) activity, new a(listenerRegistration));
            } else {
                Objects.requireNonNull(listenerRegistration);
                onActivityStopCallOnce(activity, new a(listenerRegistration));
            }
        }
        return listenerRegistration;
    }

    private static <T> T castFragment(Class<T> cls, Object obj, String str) {
        if (obj == null) {
            return null;
        }
        try {
            return cls.cast(obj);
        } catch (ClassCastException unused) {
            throw new IllegalStateException("Fragment with tag '" + str + "' is a " + obj.getClass().getName() + " but should be a " + cls.getName());
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void lambda$onActivityStopCallOnce$0(Activity activity, Runnable runnable) {
        StopListenerFragment stopListenerFragment = (StopListenerFragment) castFragment(StopListenerFragment.class, activity.getFragmentManager().findFragmentByTag(FRAGMENT_TAG), FRAGMENT_TAG);
        if (stopListenerFragment == null || stopListenerFragment.isRemoving()) {
            stopListenerFragment = new StopListenerFragment();
            activity.getFragmentManager().beginTransaction().add(stopListenerFragment, FRAGMENT_TAG).commitAllowingStateLoss();
            activity.getFragmentManager().executePendingTransactions();
        }
        stopListenerFragment.callbacks.a(runnable);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void lambda$onFragmentActivityStopCallOnce$1(e eVar, Runnable runnable) {
        StopListenerSupportFragment stopListenerSupportFragment = (StopListenerSupportFragment) castFragment(StopListenerSupportFragment.class, eVar.getSupportFragmentManager().i0(SUPPORT_FRAGMENT_TAG), SUPPORT_FRAGMENT_TAG);
        if (stopListenerSupportFragment == null || stopListenerSupportFragment.isRemoving()) {
            stopListenerSupportFragment = new StopListenerSupportFragment();
            eVar.getSupportFragmentManager().m().d(stopListenerSupportFragment, SUPPORT_FRAGMENT_TAG).g();
            eVar.getSupportFragmentManager().e0();
        }
        stopListenerSupportFragment.callbacks.a(runnable);
    }

    private static void onActivityStopCallOnce(Activity activity, Runnable runnable) {
        Assert.hardAssert(!(activity instanceof e), "onActivityStopCallOnce must be called with a *non*-FragmentActivity Activity.", new Object[0]);
        activity.runOnUiThread(new b(activity, runnable));
    }

    private static void onFragmentActivityStopCallOnce(e eVar, Runnable runnable) {
        eVar.runOnUiThread(new c(eVar, runnable));
    }
}
