package com.google.firebase.auth.internal;

import com.google.android.gms.common.internal.s;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.FirebaseAuth;
import n4.i;

final class e implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    private final String f7694e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ zzam f7695f;

    e(zzam zzam, String str) {
        this.f7695f = zzam;
        this.f7694e = s.g(str);
    }

    public final void run() {
        FirebaseAuth instance = FirebaseAuth.getInstance(FirebaseApp.getInstance(this.f7694e));
        if (instance.getCurrentUser() != null) {
            i accessToken = instance.getAccessToken(true);
            zzam.zzg.g("Token refreshing started", new Object[0]);
            accessToken.addOnFailureListener(new d(this));
        }
    }
}
