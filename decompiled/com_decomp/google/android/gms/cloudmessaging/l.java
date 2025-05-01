package com.google.android.gms.cloudmessaging;

import android.os.Handler;
import android.os.Message;

final /* synthetic */ class l implements Handler.Callback {

    /* renamed from: a  reason: collision with root package name */
    private final i f5218a;

    l(i iVar) {
        this.f5218a = iVar;
    }

    public final boolean handleMessage(Message message) {
        return this.f5218a.d(message);
    }
}
