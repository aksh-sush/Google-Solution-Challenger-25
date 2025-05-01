package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;

final class x5 implements c9 {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ i6 f6601a;

    x5(i6 i6Var) {
        this.f6601a = i6Var;
    }

    public final void a(String str, String str2, Bundle bundle) {
        if (!TextUtils.isEmpty(str)) {
            this.f6601a.s("auto", "_err", bundle, str);
        } else {
            this.f6601a.q("auto", "_err", bundle);
        }
    }
}
