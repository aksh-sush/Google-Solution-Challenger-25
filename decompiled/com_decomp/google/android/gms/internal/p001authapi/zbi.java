package com.google.android.gms.internal.p001authapi;

import android.content.Context;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.h;

/* renamed from: com.google.android.gms.internal.auth-api.zbi  reason: invalid package */
final class zbi extends zbm {
    final /* synthetic */ Credential zba;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zbi(zbl zbl, GoogleApiClient googleApiClient, Credential credential) {
        super(googleApiClient);
        this.zba = credential;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ h createFailedResult(Status status) {
        return status;
    }

    /* access modifiers changed from: protected */
    public final void zba(Context context, zbt zbt) {
        zbt.zbc(new zbk(this), new zbp(this.zba));
    }
}
