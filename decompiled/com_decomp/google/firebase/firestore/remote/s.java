package com.google.firebase.firestore.remote;

import java.util.concurrent.Callable;

public final /* synthetic */ class s implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ GrpcCallProvider f8229a;

    public /* synthetic */ s(GrpcCallProvider grpcCallProvider) {
        this.f8229a = grpcCallProvider;
    }

    public final Object call() {
        return this.f8229a.lambda$initChannelTask$6();
    }
}
