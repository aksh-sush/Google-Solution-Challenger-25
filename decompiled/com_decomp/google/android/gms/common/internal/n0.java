package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import b4.a;
import com.google.android.gms.internal.base.zaa;
import com.google.android.gms.internal.base.zac;

public final class n0 extends zaa {
    n0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ISignInButtonCreator");
    }

    public final a c(a aVar, y0 y0Var) {
        Parcel zaa = zaa();
        zac.zad(zaa, aVar);
        zac.zac(zaa, y0Var);
        Parcel zab = zab(2, zaa);
        a c10 = a.C0075a.c(zab.readStrongBinder());
        zab.recycle();
        return c10;
    }
}
