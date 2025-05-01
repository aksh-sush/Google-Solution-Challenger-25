package com.google.firebase.analytics.connector.internal;

import android.os.Bundle;
import g4.a;

final class b implements a.C0221a {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ zzg f7676a;

    public b(zzg zzg) {
        this.f7676a = zzg;
    }

    public final void a(String str, String str2, Bundle bundle, long j10) {
        if (str != null && !str.equals("crash") && zzc.zzk(str2)) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("name", str2);
            bundle2.putLong("timestampInMillis", j10);
            bundle2.putBundle("params", bundle);
            this.f7676a.zza.onMessageTriggered(3, bundle2);
        }
    }
}
