package com.google.android.gms.internal.p001authapi;

import android.content.Context;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.auth.api.credentials.a;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.h;

/* renamed from: com.google.android.gms.internal.auth-api.zbg  reason: invalid package */
final class zbg extends zbm {
    final /* synthetic */ a zba;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zbg(zbl zbl, GoogleApiClient googleApiClient, a aVar) {
        super(googleApiClient);
        this.zba = aVar;
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ h createFailedResult(Status status) {
        return new zbe(status, (Credential) null);
    }

    /* access modifiers changed from: protected */
    public final void zba(Context context, zbt zbt) {
        zbt.zbd(new zbf(this), this.zba);
    }
}
