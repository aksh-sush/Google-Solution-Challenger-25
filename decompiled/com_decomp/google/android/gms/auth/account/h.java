package com.google.android.gms.auth.account;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.internal.auth.zzam;

final class h extends a.C0085a {
    h() {
    }

    public final /* synthetic */ a.f buildClient(Context context, Looper looper, d dVar, Object obj, GoogleApiClient.b bVar, GoogleApiClient.c cVar) {
        a.d.C0086a aVar = (a.d.C0086a) obj;
        return new zzam(context, looper, dVar, bVar, cVar);
    }
}
