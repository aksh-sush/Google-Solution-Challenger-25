package com.google.android.gms.common.api.internal;

import android.os.Handler;
import java.util.concurrent.Executor;

public final /* synthetic */ class h1 implements Executor {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Handler f5402e;

    public /* synthetic */ h1(Handler handler) {
        this.f5402e = handler;
    }

    public final void execute(Runnable runnable) {
        this.f5402e.post(runnable);
    }
}
