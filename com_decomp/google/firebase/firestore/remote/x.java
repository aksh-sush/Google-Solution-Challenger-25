package com.google.firebase.firestore.remote;

import fa.s0;
import n4.a;
import n4.i;

public final /* synthetic */ class x implements a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ GrpcCallProvider f8238a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ s0 f8239b;

    public /* synthetic */ x(GrpcCallProvider grpcCallProvider, s0 s0Var) {
        this.f8238a = grpcCallProvider;
        this.f8239b = s0Var;
    }

    public final Object a(i iVar) {
        return this.f8238a.lambda$createClientCall$0(this.f8239b, iVar);
    }
}
