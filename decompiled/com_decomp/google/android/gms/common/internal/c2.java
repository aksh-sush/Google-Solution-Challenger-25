package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import android.util.Log;

final class c2 implements Handler.Callback {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ d2 f5589a;

    /* synthetic */ c2(d2 d2Var, b2 b2Var) {
        this.f5589a = d2Var;
    }

    public final boolean handleMessage(Message message) {
        int i10 = message.what;
        if (i10 == 0) {
            synchronized (this.f5589a.f5605f) {
                y1 y1Var = (y1) message.obj;
                a2 a2Var = (a2) this.f5589a.f5605f.get(y1Var);
                if (a2Var != null && a2Var.i()) {
                    if (a2Var.j()) {
                        a2Var.g("GmsClientSupervisor");
                    }
                    this.f5589a.f5605f.remove(y1Var);
                }
            }
            return true;
        } else if (i10 != 1) {
            return false;
        } else {
            synchronized (this.f5589a.f5605f) {
                y1 y1Var2 = (y1) message.obj;
                a2 a2Var2 = (a2) this.f5589a.f5605f.get(y1Var2);
                if (a2Var2 != null && a2Var2.a() == 3) {
                    String valueOf = String.valueOf(y1Var2);
                    Log.e("GmsClientSupervisor", "Timeout waiting for ServiceConnection callback " + valueOf, new Exception());
                    ComponentName b10 = a2Var2.b();
                    if (b10 == null) {
                        b10 = y1Var2.a();
                    }
                    if (b10 == null) {
                        String c10 = y1Var2.c();
                        s.k(c10);
                        b10 = new ComponentName(c10, "unknown");
                    }
                    a2Var2.onServiceDisconnected(b10);
                }
            }
            return true;
        }
    }
}
