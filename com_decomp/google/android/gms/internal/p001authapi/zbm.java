package com.google.android.gms.internal.p001authapi;

import android.content.Context;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.internal.e;
import h3.a;

/* renamed from: com.google.android.gms.internal.auth-api.zbm  reason: invalid package */
abstract class zbm extends e {
    zbm(GoogleApiClient googleApiClient) {
        super(a.f10929b, googleApiClient);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void doExecute(a.b bVar) {
        zbo zbo = (zbo) bVar;
        zba(zbo.getContext(), (zbt) zbo.getService());
    }

    public final /* bridge */ /* synthetic */ void setResult(Object obj) {
        super.setResult((h) obj);
    }

    /* access modifiers changed from: protected */
    public abstract void zba(Context context, zbt zbt);
}
