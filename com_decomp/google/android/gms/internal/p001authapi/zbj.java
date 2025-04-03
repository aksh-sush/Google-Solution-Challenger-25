package com.google.android.gms.internal.p001authapi;

import android.content.Context;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.h;

/* renamed from: com.google.android.gms.internal.auth-api.zbj  reason: invalid package */
final class zbj extends zbm {
    zbj(zbl zbl, GoogleApiClient googleApiClient) {
        super(googleApiClient);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ h createFailedResult(Status status) {
        return status;
    }

    /* access modifiers changed from: protected */
    public final void zba(Context context, zbt zbt) {
        zbt.zbf(new zbk(this));
    }
}
