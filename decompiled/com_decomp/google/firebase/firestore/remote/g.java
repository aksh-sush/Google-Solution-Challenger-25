package com.google.firebase.firestore.remote;

import com.google.firebase.firestore.remote.AndroidConnectivityMonitor;

public final /* synthetic */ class g implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ AndroidConnectivityMonitor f8207e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ AndroidConnectivityMonitor.c f8208f;

    public /* synthetic */ g(AndroidConnectivityMonitor androidConnectivityMonitor, AndroidConnectivityMonitor.c cVar) {
        this.f8207e = androidConnectivityMonitor;
        this.f8208f = cVar;
    }

    public final void run() {
        this.f8207e.lambda$configureNetworkMonitoring$0(this.f8208f);
    }
}
