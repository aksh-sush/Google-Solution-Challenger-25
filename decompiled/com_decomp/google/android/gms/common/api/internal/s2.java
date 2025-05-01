package com.google.android.gms.common.api.internal;

import android.util.Log;
import com.google.android.gms.common.api.GoogleApiClient;
import q3.b;

final class s2 implements GoogleApiClient.c {

    /* renamed from: a  reason: collision with root package name */
    public final int f5491a;

    /* renamed from: b  reason: collision with root package name */
    public final GoogleApiClient f5492b;

    /* renamed from: c  reason: collision with root package name */
    public final GoogleApiClient.c f5493c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ t2 f5494d;

    public s2(t2 t2Var, int i10, GoogleApiClient googleApiClient, GoogleApiClient.c cVar) {
        this.f5494d = t2Var;
        this.f5491a = i10;
        this.f5492b = googleApiClient;
        this.f5493c = cVar;
    }

    public final void onConnectionFailed(b bVar) {
        Log.d("AutoManageHelper", "beginFailureResolution for ".concat(String.valueOf(bVar)));
        this.f5494d.h(bVar, this.f5491a);
    }
}
