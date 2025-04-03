package com.google.firebase.heartbeatinfo;

import java.util.concurrent.Callable;

public final /* synthetic */ class f implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ DefaultHeartBeatInfo f8299a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f8300b;

    public /* synthetic */ f(DefaultHeartBeatInfo defaultHeartBeatInfo, String str) {
        this.f8299a = defaultHeartBeatInfo;
        this.f8300b = str;
    }

    public final Object call() {
        return this.f8299a.lambda$storeHeartBeatInfo$3(this.f8300b);
    }
}
