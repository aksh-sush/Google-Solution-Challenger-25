package com.google.firebase.firestore.remote;

import fa.o0;

public final /* synthetic */ class t implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ GrpcCallProvider f8230e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ o0 f8231f;

    public /* synthetic */ t(GrpcCallProvider grpcCallProvider, o0 o0Var) {
        this.f8230e = grpcCallProvider;
        this.f8231f = o0Var;
    }

    public final void run() {
        this.f8230e.lambda$initChannelTask$5(this.f8231f);
    }
}
