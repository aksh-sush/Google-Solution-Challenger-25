package com.google.android.gms.internal.auth;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.internal.g;
import com.google.android.gms.common.api.internal.o;
import com.google.android.gms.common.internal.d;

final class zzv extends a.C0085a {
    zzv() {
    }

    public final /* synthetic */ a.f buildClient(Context context, Looper looper, d dVar, Object obj, g gVar, o oVar) {
        a.d.C0086a aVar = (a.d.C0086a) obj;
        return new zzi(context, looper, dVar, gVar, oVar);
    }
}
