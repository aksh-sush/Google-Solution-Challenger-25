package com.google.android.gms.internal.auth;

import android.accounts.Account;
import com.google.android.gms.auth.account.g;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.internal.e;

final class zzag extends e {
    final /* synthetic */ Account zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzag(zzal zzal, a aVar, GoogleApiClient googleApiClient, Account account) {
        super(aVar, googleApiClient);
        this.zza = account;
    }

    /* access modifiers changed from: protected */
    public final h createFailedResult(Status status) {
        return new zzak(status);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void doExecute(a.b bVar) {
        ((g) ((zzam) bVar).getService()).F(new zzaf(this), this.zza);
    }

    public final /* bridge */ /* synthetic */ void setResult(Object obj) {
        super.setResult((h) obj);
    }
}
