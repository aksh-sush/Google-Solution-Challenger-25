package com.google.firebase.firestore.remote;

import fa.o0;

public final /* synthetic */ class v implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ GrpcCallProvider f8234e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ o0 f8235f;

    public /* synthetic */ v(GrpcCallProvider grpcCallProvider, o0 o0Var) {
        this.f8234e = grpcCallProvider;
        this.f8235f = o0Var;
    }

    public final void run() {
        this.f8234e.lambda$onConnectivityStateChange$3(this.f8235f);
    }
}
