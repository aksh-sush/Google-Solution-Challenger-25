package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;

final class u8 implements c9 {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ w8 f6474a;

    u8(w8 w8Var) {
        this.f6474a = w8Var;
    }

    public final void a(String str, String str2, Bundle bundle) {
        if (!TextUtils.isEmpty(str)) {
            this.f6474a.b().z(new t8(this, str, "_err", bundle));
        } else if (this.f6474a.f6570l != null) {
            this.f6474a.f6570l.d().r().b("AppId not known when logging event", "_err");
        }
    }
}
