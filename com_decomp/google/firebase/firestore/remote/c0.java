package com.google.firebase.firestore.remote;

import com.google.firebase.firestore.core.OnlineState;
import com.google.firebase.firestore.remote.RemoteStore;
import com.google.firebase.firestore.remote.a0;

public final /* synthetic */ class c0 implements a0.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ RemoteStore.RemoteStoreCallback f8192a;

    public /* synthetic */ c0(RemoteStore.RemoteStoreCallback remoteStoreCallback) {
        this.f8192a = remoteStoreCallback;
    }

    public final void handleOnlineStateChange(OnlineState onlineState) {
        this.f8192a.handleOnlineStateChange(onlineState);
    }
}
