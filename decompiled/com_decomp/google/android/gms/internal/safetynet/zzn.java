package com.google.android.gms.internal.safetynet;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.a;
import com.google.android.gms.internal.safetynet.zzk;
import java.util.ArrayList;

final class zzn extends zzk.zzf {
    private final /* synthetic */ int[] zzaa;
    private final /* synthetic */ int zzab;
    private final /* synthetic */ String zzx;
    private final /* synthetic */ String zzz;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzn(GoogleApiClient googleApiClient, int[] iArr, int i10, String str, String str2) {
        super(googleApiClient);
        this.zzaa = iArr;
        this.zzab = i10;
        this.zzz = str;
        this.zzx = str2;
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ void doExecute(a.b bVar) {
        zzx zzx2 = (zzx) bVar;
        ArrayList arrayList = new ArrayList();
        for (int valueOf : this.zzaa) {
            arrayList.add(Integer.valueOf(valueOf));
        }
        zzx2.zza(this.zzaf, arrayList, this.zzab, this.zzz, this.zzx);
    }
}
