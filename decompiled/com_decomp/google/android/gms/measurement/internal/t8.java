package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.common.internal.s;

final class t8 implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ String f6430e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ String f6431f = "_err";

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ Bundle f6432g;

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ u8 f6433h;

    t8(u8 u8Var, String str, String str2, Bundle bundle) {
        this.f6433h = u8Var;
        this.f6430e = str;
        this.f6432g = bundle;
    }

    public final void run() {
        this.f6433h.f6474a.j((t) s.k(this.f6433h.f6474a.g0().w0(this.f6430e, this.f6431f, this.f6432g, "auto", this.f6433h.f6474a.e().currentTimeMillis(), false, true)), this.f6430e);
    }
}
