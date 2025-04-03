package com.google.android.gms.internal.auth;

import android.accounts.Account;
import android.os.Bundle;
import com.google.android.gms.common.api.internal.r;
import n4.j;

public final /* synthetic */ class zzs implements r {
    public final /* synthetic */ zzab zza;
    public final /* synthetic */ Account zzb;
    public final /* synthetic */ String zzc;
    public final /* synthetic */ Bundle zzd;

    public /* synthetic */ zzs(zzab zzab, Account account, String str, Bundle bundle) {
        this.zza = zzab;
        this.zzb = account;
        this.zzc = str;
        this.zzd = bundle;
    }

    public final void accept(Object obj, Object obj2) {
        zzab zzab = this.zza;
        ((zzp) ((zzi) obj).getService()).zzf(new zzw(zzab, (j) obj2), this.zzb, this.zzc, this.zzd);
    }
}
