package com.google.android.gms.internal.auth;

import android.accounts.Account;
import com.google.android.gms.auth.account.g;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.internal.e;

final class zzae extends e {
    final /* synthetic */ String zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzae(zzal zzal, a aVar, GoogleApiClient googleApiClient, String str) {
        super(aVar, googleApiClient);
        this.zza = str;
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ h createFailedResult(Status status) {
        return new zzai(status, (Account) null);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void doExecute(a.b bVar) {
        ((g) ((zzam) bVar).getService()).D(new zzad(this), this.zza);
    }

    public final /* bridge */ /* synthetic */ void setResult(Object obj) {
        super.setResult((h) obj);
    }
}
