package com.google.android.gms.auth.api.signin.internal;

import android.os.Bundle;
import androidx.loader.app.a;
import com.google.android.gms.common.api.GoogleApiClient;
import o0.b;
import o3.g;
import o3.x;

final class a implements a.C0052a {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ SignInHubActivity f5183a;

    /* synthetic */ a(SignInHubActivity signInHubActivity, x xVar) {
        this.f5183a = signInHubActivity;
    }

    public final /* bridge */ /* synthetic */ void a(b bVar, Object obj) {
        Void voidR = (Void) obj;
        SignInHubActivity signInHubActivity = this.f5183a;
        signInHubActivity.setResult(signInHubActivity.f5181h, signInHubActivity.f5182i);
        this.f5183a.finish();
    }

    public final b b(int i10, Bundle bundle) {
        return new g(this.f5183a, GoogleApiClient.h());
    }

    public final void c(b bVar) {
    }
}
