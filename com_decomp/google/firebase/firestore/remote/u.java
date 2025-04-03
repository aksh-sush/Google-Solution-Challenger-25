package com.google.firebase.firestore.remote;

import fa.o0;

public final /* synthetic */ class u implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ GrpcCallProvider f8232e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ o0 f8233f;

    public /* synthetic */ u(GrpcCallProvider grpcCallProvider, o0 o0Var) {
        this.f8232e = grpcCallProvider;
        this.f8233f = o0Var;
    }

    public final void run() {
        this.f8232e.lambda$onConnectivityStateChange$1(this.f8233f);
    }
}
