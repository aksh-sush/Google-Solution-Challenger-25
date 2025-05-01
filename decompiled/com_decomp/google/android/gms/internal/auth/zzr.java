package com.google.android.gms.internal.auth;

import android.accounts.Account;
import com.google.android.gms.common.api.internal.r;
import n4.j;

public final /* synthetic */ class zzr implements r {
    public final /* synthetic */ zzab zza;
    public final /* synthetic */ Account zzb;

    public /* synthetic */ zzr(zzab zzab, Account account) {
        this.zza = zzab;
        this.zzb = account;
    }

    public final void accept(Object obj, Object obj2) {
        zzab zzab = this.zza;
        ((zzp) ((zzi) obj).getService()).zzg(new zzaa(zzab, (j) obj2), this.zzb);
    }
}
