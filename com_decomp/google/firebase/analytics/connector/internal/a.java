package com.google.firebase.analytics.connector.internal;

import android.os.Bundle;
import g4.a;

final class a implements a.C0221a {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ zze f7675a;

    public a(zze zze) {
        this.f7675a = zze;
    }

    public final void a(String str, String str2, Bundle bundle, long j10) {
        if (this.f7675a.zza.contains(str2)) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("events", zzc.zzc(str2));
            this.f7675a.zzb.onMessageTriggered(2, bundle2);
        }
    }
}
