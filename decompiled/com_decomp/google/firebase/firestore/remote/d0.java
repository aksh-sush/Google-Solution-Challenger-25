package com.google.firebase.firestore.remote;

import com.google.firebase.firestore.remote.ConnectivityMonitor;
import com.google.firebase.firestore.util.AsyncQueue;
import com.google.firebase.firestore.util.Consumer;

public final /* synthetic */ class d0 implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ RemoteStore f8195a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ AsyncQueue f8196b;

    public /* synthetic */ d0(RemoteStore remoteStore, AsyncQueue asyncQueue) {
        this.f8195a = remoteStore;
        this.f8196b = asyncQueue;
    }

    public final void accept(Object obj) {
        this.f8195a.lambda$new$1(this.f8196b, (ConnectivityMonitor.NetworkStatus) obj);
    }
}
