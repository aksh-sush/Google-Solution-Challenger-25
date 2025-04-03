package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import n4.a;
import n4.i;

final /* synthetic */ class h implements a {

    /* renamed from: a  reason: collision with root package name */
    private final Context f8403a;

    /* renamed from: b  reason: collision with root package name */
    private final Intent f8404b;

    h(Context context, Intent intent) {
        this.f8403a = context;
        this.f8404b = intent;
    }

    public Object a(i iVar) {
        return FcmBroadcastProcessor.lambda$startMessagingService$2$FcmBroadcastProcessor(this.f8403a, this.f8404b, iVar);
    }
}
