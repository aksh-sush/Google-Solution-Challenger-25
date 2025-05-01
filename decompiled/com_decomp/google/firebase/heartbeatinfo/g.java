package com.google.firebase.heartbeatinfo;

import java.util.concurrent.Callable;

public final /* synthetic */ class g implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ DefaultHeartBeatInfo f8301a;

    public /* synthetic */ g(DefaultHeartBeatInfo defaultHeartBeatInfo) {
        this.f8301a = defaultHeartBeatInfo;
    }

    public final Object call() {
        return this.f8301a.lambda$getAndClearStoredHeartBeatInfo$2();
    }
}
