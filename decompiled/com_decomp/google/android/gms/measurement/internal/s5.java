package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.common.internal.s;
import com.google.firebase.analytics.FirebaseAnalytics;

final class s5 implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ Bundle f6401e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ i6 f6402f;

    s5(i6 i6Var, Bundle bundle) {
        this.f6402f = i6Var;
        this.f6401e = bundle;
    }

    public final void run() {
        i6 i6Var = this.f6402f;
        Bundle bundle = this.f6401e;
        i6Var.h();
        i6Var.i();
        s.k(bundle);
        String string = bundle.getString("name");
        String string2 = bundle.getString(FirebaseAnalytics.Param.ORIGIN);
        s.g(string);
        s.g(string2);
        s.k(bundle.get(FirebaseAnalytics.Param.VALUE));
        if (!i6Var.f5994a.o()) {
            i6Var.f5994a.d().v().a("Conditional property not set since app measurement is disabled");
            return;
        }
        z8 z8Var = new z8(string, bundle.getLong("triggered_timestamp"), bundle.get(FirebaseAnalytics.Param.VALUE), string2);
        try {
            t w02 = i6Var.f5994a.N().w0(bundle.getString("app_id"), bundle.getString("triggered_event_name"), bundle.getBundle("triggered_event_params"), string2, 0, true, true);
            t w03 = i6Var.f5994a.N().w0(bundle.getString("app_id"), bundle.getString("timed_out_event_name"), bundle.getBundle("timed_out_event_params"), string2, 0, true, true);
            t w04 = i6Var.f5994a.N().w0(bundle.getString("app_id"), bundle.getString("expired_event_name"), bundle.getBundle("expired_event_params"), string2, 0, true, true);
            i6Var.f5994a.L().s(new c(bundle.getString("app_id"), string2, z8Var, bundle.getLong("creation_timestamp"), false, bundle.getString("trigger_event_name"), w03, bundle.getLong("trigger_timeout"), w02, bundle.getLong("time_to_live"), w04));
        } catch (IllegalArgumentException unused) {
        }
    }
}
