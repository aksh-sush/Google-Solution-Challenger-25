package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.internal.base.zaq;

final class z0 extends zaq {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ b1 f5555a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    z0(b1 b1Var, Looper looper) {
        super(looper);
        this.f5555a = b1Var;
    }

    public final void handleMessage(Message message) {
        int i10 = message.what;
        if (i10 == 1) {
            b1.v(this.f5555a);
        } else if (i10 != 2) {
            StringBuilder sb2 = new StringBuilder(31);
            sb2.append("Unknown message id: ");
            sb2.append(i10);
            Log.w("GoogleApiClientImpl", sb2.toString());
        } else {
            b1.u(this.f5555a);
        }
    }
}
