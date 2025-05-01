package com.google.firebase.firestore.remote;

import fa.o0;

public final /* synthetic */ class w implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ GrpcCallProvider f8236e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ o0 f8237f;

    public /* synthetic */ w(GrpcCallProvider grpcCallProvider, o0 o0Var) {
        this.f8236e = grpcCallProvider;
        this.f8237f = o0Var;
    }

    public final void run() {
        this.f8236e.lambda$onConnectivityStateChange$2(this.f8237f);
    }
}
