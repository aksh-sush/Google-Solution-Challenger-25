package com.google.firebase.firestore.remote;

import com.google.firebase.firestore.remote.AndroidConnectivityMonitor;

public final /* synthetic */ class h implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ AndroidConnectivityMonitor f8209e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ AndroidConnectivityMonitor.d f8210f;

    public /* synthetic */ h(AndroidConnectivityMonitor androidConnectivityMonitor, AndroidConnectivityMonitor.d dVar) {
        this.f8209e = androidConnectivityMonitor;
        this.f8210f = dVar;
    }

    public final void run() {
        this.f8209e.lambda$configureNetworkMonitoring$1(this.f8210f);
    }
}
