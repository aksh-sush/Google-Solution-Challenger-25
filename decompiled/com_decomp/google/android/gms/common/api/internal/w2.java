package com.google.android.gms.common.api.internal;

import android.app.Dialog;
import android.app.PendingIntent;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.internal.s;
import q3.b;

final class w2 implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    private final u2 f5532e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ x2 f5533f;

    w2(x2 x2Var, u2 u2Var) {
        this.f5533f = x2Var;
        this.f5532e = u2Var;
    }

    public final void run() {
        if (this.f5533f.f5535e) {
            b b10 = this.f5532e.b();
            if (b10.X()) {
                x2 x2Var = this.f5533f;
                x2Var.mLifecycleFragment.startActivityForResult(GoogleApiActivity.a(x2Var.getActivity(), (PendingIntent) s.k(b10.W()), this.f5532e.a(), false), 1);
                return;
            }
            x2 x2Var2 = this.f5533f;
            if (x2Var2.f5538h.d(x2Var2.getActivity(), b10.U(), (String) null) != null) {
                x2 x2Var3 = this.f5533f;
                x2Var3.f5538h.z(x2Var3.getActivity(), this.f5533f.mLifecycleFragment, b10.U(), 2, this.f5533f);
            } else if (b10.U() == 18) {
                x2 x2Var4 = this.f5533f;
                Dialog u10 = x2Var4.f5538h.u(x2Var4.getActivity(), this.f5533f);
                x2 x2Var5 = this.f5533f;
                x2Var5.f5538h.v(x2Var5.getActivity().getApplicationContext(), new v2(this, u10));
            } else {
                this.f5533f.a(b10, this.f5532e.a());
            }
        }
    }
}
