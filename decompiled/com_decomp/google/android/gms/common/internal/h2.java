package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import b4.a;
import com.google.android.gms.internal.common.zza;

public final class h2 extends zza implements c1 {
    h2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ICertData");
    }

    public final int zzc() {
        Parcel zzB = zzB(2, zza());
        int readInt = zzB.readInt();
        zzB.recycle();
        return readInt;
    }

    public final a zzd() {
        Parcel zzB = zzB(1, zza());
        a c10 = a.C0075a.c(zzB.readStrongBinder());
        zzB.recycle();
        return c10;
    }
}
