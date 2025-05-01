package com.google.firebase.firestore.remote;

import android.app.Activity;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Bundle;
import com.google.firebase.firestore.remote.ConnectivityMonitor;
import com.google.firebase.firestore.util.Assert;
import com.google.firebase.firestore.util.Consumer;
import com.google.firebase.firestore.util.Logger;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

public final class AndroidConnectivityMonitor implements ConnectivityMonitor {
    private static final String LOG_TAG = "AndroidConnectivityMonitor";
    private final List<Consumer<ConnectivityMonitor.NetworkStatus>> callbacks = new ArrayList();
    private final ConnectivityManager connectivityManager;
    private final Context context;
    private Runnable unregisterRunnable;

    class a implements Application.ActivityLifecycleCallbacks {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ AtomicBoolean f8143e;

        a(AtomicBoolean atomicBoolean) {
            this.f8143e = atomicBoolean;
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
            if (this.f8143e.compareAndSet(true, false)) {
                AndroidConnectivityMonitor.this.raiseForegroundNotification();
            }
        }

        public void onActivityDestroyed(Activity activity) {
        }

        public void onActivityPaused(Activity activity) {
        }

        public void onActivityResumed(Activity activity) {
            if (this.f8143e.compareAndSet(true, false)) {
                AndroidConnectivityMonitor.this.raiseForegroundNotification();
            }
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public void onActivityStarted(Activity activity) {
            if (this.f8143e.compareAndSet(true, false)) {
                AndroidConnectivityMonitor.this.raiseForegroundNotification();
            }
        }

        public void onActivityStopped(Activity activity) {
        }
    }

    class b implements ComponentCallbacks2 {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ AtomicBoolean f8145e;

        b(AtomicBoolean atomicBoolean) {
            this.f8145e = atomicBoolean;
        }

        public void onConfigurationChanged(Configuration configuration) {
        }

        public void onLowMemory() {
        }

        public void onTrimMemory(int i10) {
            if (i10 == 20) {
                this.f8145e.set(true);
            }
        }
    }

    private class c extends ConnectivityManager.NetworkCallback {
        private c() {
        }

        public void onAvailable(Network network) {
            AndroidConnectivityMonitor.this.raiseCallbacks(true);
        }

        public void onLost(Network network) {
            AndroidConnectivityMonitor.this.raiseCallbacks(false);
        }

        /* synthetic */ c(AndroidConnectivityMonitor androidConnectivityMonitor, a aVar) {
            this();
        }
    }

    private class d extends BroadcastReceiver {

        /* renamed from: a  reason: collision with root package name */
        private boolean f8148a;

        private d() {
            this.f8148a = false;
        }

        public void onReceive(Context context, Intent intent) {
            AndroidConnectivityMonitor androidConnectivityMonitor;
            boolean z10;
            boolean access$300 = AndroidConnectivityMonitor.this.isConnected();
            if (!AndroidConnectivityMonitor.this.isConnected() || this.f8148a) {
                if (!access$300 && this.f8148a) {
                    androidConnectivityMonitor = AndroidConnectivityMonitor.this;
                    z10 = false;
                }
                this.f8148a = access$300;
            }
            androidConnectivityMonitor = AndroidConnectivityMonitor.this;
            z10 = true;
            androidConnectivityMonitor.raiseCallbacks(z10);
            this.f8148a = access$300;
        }

        /* synthetic */ d(AndroidConnectivityMonitor androidConnectivityMonitor, a aVar) {
            this();
        }
    }

    public AndroidConnectivityMonitor(Context context2) {
        Assert.hardAssert(context2 != null, "Context must be non-null", new Object[0]);
        this.context = context2;
        this.connectivityManager = (ConnectivityManager) context2.getSystemService("connectivity");
        configureBackgroundStateListener();
        configureNetworkMonitoring();
    }

    private void configureBackgroundStateListener() {
        Application application = (Application) this.context.getApplicationContext();
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        application.registerActivityLifecycleCallbacks(new a(atomicBoolean));
        application.registerComponentCallbacks(new b(atomicBoolean));
    }

    private void configureNetworkMonitoring() {
        Runnable runnable;
        if (Build.VERSION.SDK_INT < 24 || this.connectivityManager == null) {
            d dVar = new d(this, (a) null);
            this.context.registerReceiver(dVar, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            runnable = new h(this, dVar);
        } else {
            c cVar = new c(this, (a) null);
            this.connectivityManager.registerDefaultNetworkCallback(cVar);
            runnable = new g(this, cVar);
        }
        this.unregisterRunnable = runnable;
    }

    /* access modifiers changed from: private */
    public boolean isConnected() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.context.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$configureNetworkMonitoring$0(c cVar) {
        this.connectivityManager.unregisterNetworkCallback(cVar);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$configureNetworkMonitoring$1(d dVar) {
        this.context.unregisterReceiver(dVar);
    }

    /* access modifiers changed from: private */
    public void raiseCallbacks(boolean z10) {
        synchronized (this.callbacks) {
            for (Consumer accept : this.callbacks) {
                accept.accept(z10 ? ConnectivityMonitor.NetworkStatus.REACHABLE : ConnectivityMonitor.NetworkStatus.UNREACHABLE);
            }
        }
    }

    public void addCallback(Consumer<ConnectivityMonitor.NetworkStatus> consumer) {
        synchronized (this.callbacks) {
            this.callbacks.add(consumer);
        }
    }

    public void raiseForegroundNotification() {
        Logger.debug(LOG_TAG, "App has entered the foreground.", new Object[0]);
        if (isConnected()) {
            raiseCallbacks(true);
        }
    }

    public void shutdown() {
        Runnable runnable = this.unregisterRunnable;
        if (runnable != null) {
            runnable.run();
            this.unregisterRunnable = null;
        }
    }
}
