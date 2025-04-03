package com.google.android.gms.common.api.internal;

import android.app.Dialog;

final class v2 extends t1 {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Dialog f5529a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ w2 f5530b;

    v2(w2 w2Var, Dialog dialog) {
        this.f5530b = w2Var;
        this.f5529a = dialog;
    }

    public final void a() {
        this.f5530b.f5533f.d();
        if (this.f5529a.isShowing()) {
            this.f5529a.dismiss();
        }
    }
}
