package com.google.firebase.auth.internal;

import com.google.android.gms.common.api.internal.d;

final class p implements d.a {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ zzbi f7722a;

    p(zzbi zzbi) {
        this.f7722a = zzbi;
    }

    public final void onBackgroundStateChanged(boolean z10) {
        if (z10) {
            boolean unused = this.f7722a.zzc = true;
            this.f7722a.zzb();
            return;
        }
        boolean unused2 = this.f7722a.zzc = false;
        if (this.f7722a.zzg()) {
            this.f7722a.zzb.zzc();
        }
    }
}
