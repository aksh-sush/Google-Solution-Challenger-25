package com.google.firebase.firestore.remote;

import com.google.firebase.firestore.remote.ConnectivityMonitor;

public final /* synthetic */ class b0 implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ RemoteStore f8189e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ ConnectivityMonitor.NetworkStatus f8190f;

    public /* synthetic */ b0(RemoteStore remoteStore, ConnectivityMonitor.NetworkStatus networkStatus) {
        this.f8189e = remoteStore;
        this.f8190f = networkStatus;
    }

    public final void run() {
        this.f8189e.lambda$new$0(this.f8190f);
    }
}
