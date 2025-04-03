package com.google.firebase.firestore.local;

import com.google.firebase.firestore.model.SnapshotVersion;
import com.google.firebase.firestore.remote.RemoteEvent;
import com.google.firebase.firestore.util.Supplier;

public final /* synthetic */ class k implements Supplier {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ LocalStore f8033a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ RemoteEvent f8034b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ SnapshotVersion f8035c;

    public /* synthetic */ k(LocalStore localStore, RemoteEvent remoteEvent, SnapshotVersion snapshotVersion) {
        this.f8033a = localStore;
        this.f8034b = remoteEvent;
        this.f8035c = snapshotVersion;
    }

    public final Object get() {
        return this.f8033a.lambda$applyRemoteEvent$5(this.f8034b, this.f8035c);
    }
}
