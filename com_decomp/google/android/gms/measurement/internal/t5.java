package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.common.internal.s;
import com.google.firebase.analytics.FirebaseAnalytics;

final class t5 implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ Bundle f6424e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ i6 f6425f;

    t5(i6 i6Var, Bundle bundle) {
        this.f6425f = i6Var;
        this.f6424e = bundle;
    }

    public final void run() {
        i6 i6Var = this.f6425f;
        Bundle bundle = this.f6424e;
        i6Var.h();
        i6Var.i();
        s.k(bundle);
        s.g(bundle.getString("name"));
        if (i6Var.f5994a.o()) {
            g z10 = i6Var.f5994a.z();
            x2 x2Var = y2.f6647r0;
            z8 z8Var = z10.B((String) null, x2Var) ? new z8(bundle.getString("name"), 0, (Object) null, "") : new z8(bundle.getString("name"), 0, (Object) null, (String) null);
            try {
                d9 N = i6Var.f5994a.N();
                String string = bundle.getString("app_id");
                String string2 = bundle.getString("expired_event_name");
                Bundle bundle2 = bundle.getBundle("expired_event_params");
                String string3 = i6Var.f5994a.z().B((String) null, x2Var) ? "" : bundle.getString(FirebaseAnalytics.Param.ORIGIN);
                long j10 = bundle.getLong("creation_timestamp");
                String str = FirebaseAnalytics.Param.ORIGIN;
                i6Var.f5994a.L().s(new c(bundle.getString("app_id"), i6Var.f5994a.z().B((String) null, x2Var) ? "" : bundle.getString(str), z8Var, bundle.getLong("creation_timestamp"), bundle.getBoolean("active"), bundle.getString("trigger_event_name"), (t) null, bundle.getLong("trigger_timeout"), (t) null, bundle.getLong("time_to_live"), N.w0(string, string2, bundle2, string3, j10, true, true)));
            } catch (IllegalArgumentException unused) {
            }
        } else {
            i6Var.f5994a.d().v().a("Conditional property not cleared since app measurement is disabled");
        }
    }
}
