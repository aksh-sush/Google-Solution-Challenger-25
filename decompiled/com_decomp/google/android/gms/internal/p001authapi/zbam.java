package com.google.android.gms.internal.p001authapi;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.api.internal.i;
import k3.b;
import k3.d;
import k3.e;

/* renamed from: com.google.android.gms.internal.auth-api.zbam  reason: invalid package */
public final class zbam extends zba {
    zbam(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.identity.internal.ISignInService");
    }

    public final void zbc(zbac zbac, b bVar) {
        Parcel zba = zba();
        zbc.zbd(zba, zbac);
        zbc.zbc(zba, bVar);
        zbb(1, zba);
    }

    public final void zbd(zbaf zbaf, d dVar, String str) {
        Parcel zba = zba();
        zbc.zbd(zba, zbaf);
        zbc.zbc(zba, dVar);
        zba.writeString(str);
        zbb(4, zba);
    }

    public final void zbe(zbah zbah, e eVar) {
        Parcel zba = zba();
        zbc.zbd(zba, zbah);
        zbc.zbc(zba, eVar);
        zbb(3, zba);
    }

    public final void zbf(i iVar, String str) {
        Parcel zba = zba();
        zbc.zbd(zba, iVar);
        zba.writeString(str);
        zbb(2, zba);
    }
}
