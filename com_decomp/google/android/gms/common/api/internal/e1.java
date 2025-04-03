package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.internal.base.zaq;

final class e1 extends zaq {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ f1 f5349a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    e1(f1 f1Var, Looper looper) {
        super(looper);
        this.f5349a = f1Var;
    }

    public final void handleMessage(Message message) {
        int i10 = message.what;
        if (i10 == 1) {
            ((d1) message.obj).b(this.f5349a);
        } else if (i10 != 2) {
            StringBuilder sb2 = new StringBuilder(31);
            sb2.append("Unknown message id: ");
            sb2.append(i10);
            Log.w("GACStateManager", sb2.toString());
        } else {
            throw ((RuntimeException) message.obj);
        }
    }
}
