package com.google.firebase.auth.api.fallback.service;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.f;
import com.google.android.gms.common.internal.g;
import com.google.android.gms.common.internal.m;
import com.google.android.gms.internal.p002firebaseauthapi.zztp;

final class a extends f {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ FirebaseAuthFallbackService f7677a;

    protected a(FirebaseAuthFallbackService firebaseAuthFallbackService, Context context) {
        this.f7677a = firebaseAuthFallbackService;
    }

    public final void q(m mVar, g gVar) {
        Bundle U = gVar.U();
        if (U != null) {
            String string = U.getString("com.google.firebase.auth.API_KEY");
            if (!TextUtils.isEmpty(string)) {
                mVar.W(0, new zztp(this.f7677a, string), (Bundle) null);
                return;
            }
            throw new IllegalArgumentException("ApiKey must not be empty.");
        }
        throw new IllegalArgumentException("ExtraArgs is null.");
    }
}
