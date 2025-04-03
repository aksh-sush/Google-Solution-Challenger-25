package com.google.android.gms.internal.safetynet;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.a;
import com.google.android.gms.internal.safetynet.zzk;

final class zzr extends zzk.zze {
    private final /* synthetic */ String zzac;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzr(zzk zzk, GoogleApiClient googleApiClient, String str) {
        super(googleApiClient);
        this.zzac = str;
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ void doExecute(a.b bVar) {
        ((zzi) ((zzx) bVar).getService()).zza(this.zzaf, this.zzac);
    }
}
