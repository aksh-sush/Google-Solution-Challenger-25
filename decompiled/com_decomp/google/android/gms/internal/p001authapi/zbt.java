package com.google.android.gms.internal.p001authapi;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.auth.api.credentials.a;

/* renamed from: com.google.android.gms.internal.auth-api.zbt  reason: invalid package */
public final class zbt extends zba {
    zbt(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
    }

    public final void zbc(zbs zbs, zbp zbp) {
        Parcel zba = zba();
        zbc.zbd(zba, zbs);
        zbc.zbc(zba, zbp);
        zbb(3, zba);
    }

    public final void zbd(zbs zbs, a aVar) {
        Parcel zba = zba();
        zbc.zbd(zba, zbs);
        zbc.zbc(zba, aVar);
        zbb(1, zba);
    }

    public final void zbe(zbs zbs, zbu zbu) {
        Parcel zba = zba();
        zbc.zbd(zba, zbs);
        zbc.zbc(zba, zbu);
        zbb(2, zba);
    }

    public final void zbf(zbs zbs) {
        Parcel zba = zba();
        zbc.zbd(zba, zbs);
        zbb(4, zba);
    }
}
