package com.google.android.gms.cloudmessaging;

import android.os.Looper;
import android.os.Message;
import com.google.android.gms.internal.cloudmessaging.zze;

final class b0 extends zze {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ c f5188a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    b0(c cVar, Looper looper) {
        super(looper);
        this.f5188a = cVar;
    }

    public final void handleMessage(Message message) {
        this.f5188a.g(message);
    }
}
