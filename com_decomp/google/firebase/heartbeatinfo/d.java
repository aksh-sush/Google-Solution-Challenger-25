package com.google.firebase.heartbeatinfo;

import java.util.concurrent.ThreadFactory;

public final /* synthetic */ class d implements ThreadFactory {
    public final Thread newThread(Runnable runnable) {
        return DefaultHeartBeatInfo.lambda$static$0(runnable);
    }
}
