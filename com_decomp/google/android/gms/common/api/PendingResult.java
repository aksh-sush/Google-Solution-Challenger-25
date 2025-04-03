package com.google.android.gms.common.api;

import java.util.concurrent.TimeUnit;

public abstract class PendingResult {

    public interface a {
        void a(Status status);
    }

    public abstract void addStatusListener(a aVar);

    public abstract h await(long j10, TimeUnit timeUnit);
}
