package com.google.android.gms.internal.p000authapiphone;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.i;
import com.google.android.gms.common.api.internal.w;
import com.google.android.gms.common.internal.b;
import n4.j;

/* renamed from: com.google.android.gms.internal.auth-api-phone.zzo  reason: invalid package */
final class zzo extends i.a {
    final /* synthetic */ j zza;

    zzo(zzr zzr, j jVar) {
        this.zza = jVar;
    }

    public final void onResult(Status status) {
        if (status.V() == 6) {
            this.zza.d(b.a(status));
        } else {
            w.b(status, this.zza);
        }
    }
}
