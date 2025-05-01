package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.internal.base.zaq;

final class j2 extends zaq {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ l2 f5417a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j2(l2 l2Var, Looper looper) {
        super(looper);
        this.f5417a = l2Var;
    }

    public final void handleMessage(Message message) {
        int i10 = message.what;
        if (i10 == 0) {
            PendingResult pendingResult = (PendingResult) message.obj;
            synchronized (this.f5417a.f5441c) {
                l2 l2Var = (l2) s.k(this.f5417a.f5439a);
                if (pendingResult == null) {
                    l2Var.h(new Status(13, "Transform returned null"));
                } else {
                    l2Var.g(pendingResult);
                }
            }
        } else if (i10 != 1) {
            StringBuilder sb2 = new StringBuilder(70);
            sb2.append("TransformationResultHandler received unknown message type: ");
            sb2.append(i10);
            Log.e("TransformedResultImpl", sb2.toString());
        } else {
            RuntimeException runtimeException = (RuntimeException) message.obj;
            String valueOf = String.valueOf(runtimeException.getMessage());
            Log.e("TransformedResultImpl", valueOf.length() != 0 ? "Runtime exception on the transformation worker thread: ".concat(valueOf) : new String("Runtime exception on the transformation worker thread: "));
            throw runtimeException;
        }
    }
}
