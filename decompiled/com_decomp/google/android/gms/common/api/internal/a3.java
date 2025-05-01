package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.internal.s;
import q3.b;

public final class a3 implements GoogleApiClient.b, GoogleApiClient.c {

    /* renamed from: a  reason: collision with root package name */
    public final a f5298a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f5299b;

    /* renamed from: c  reason: collision with root package name */
    private b3 f5300c;

    public a3(a aVar, boolean z10) {
        this.f5298a = aVar;
        this.f5299b = z10;
    }

    private final b3 b() {
        s.l(this.f5300c, "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client.");
        return this.f5300c;
    }

    public final void a(b3 b3Var) {
        this.f5300c = b3Var;
    }

    public final void onConnected(Bundle bundle) {
        b().onConnected(bundle);
    }

    public final void onConnectionFailed(b bVar) {
        b().c(bVar, this.f5298a, this.f5299b);
    }

    public final void onConnectionSuspended(int i10) {
        b().onConnectionSuspended(i10);
    }
}
