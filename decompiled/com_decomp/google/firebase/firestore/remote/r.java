package com.google.firebase.firestore.remote;

import fa.o0;

public final /* synthetic */ class r implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ GrpcCallProvider f8227e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ o0 f8228f;

    public /* synthetic */ r(GrpcCallProvider grpcCallProvider, o0 o0Var) {
        this.f8227e = grpcCallProvider;
        this.f8228f = o0Var;
    }

    public final void run() {
        this.f8227e.lambda$resetChannel$4(this.f8228f);
    }
}
