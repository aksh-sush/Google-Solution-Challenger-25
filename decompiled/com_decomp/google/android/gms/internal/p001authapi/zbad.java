package com.google.android.gms.internal.p001authapi;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest;
import k3.g;

/* renamed from: com.google.android.gms.internal.auth-api.zbad  reason: invalid package */
public final class zbad extends zba {
    zbad(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.identity.internal.ICredentialSavingService");
    }

    public final void zbc(zbaj zbaj, SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest) {
        Parcel zba = zba();
        zbc.zbd(zba, zbaj);
        zbc.zbc(zba, saveAccountLinkingTokenRequest);
        zbb(1, zba);
    }

    public final void zbd(zbal zbal, g gVar) {
        Parcel zba = zba();
        zbc.zbd(zba, zbal);
        zbc.zbc(zba, gVar);
        zbb(2, zba);
    }
}
