package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.Parcel;
import b4.a;
import com.google.android.gms.internal.common.zza;
import com.google.android.gms.internal.common.zzc;

public final class n extends zza {
    n(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2");
    }

    public final a Y(a aVar, String str, int i10, a aVar2) {
        Parcel zza = zza();
        zzc.zze(zza, aVar);
        zza.writeString(str);
        zza.writeInt(i10);
        zzc.zze(zza, aVar2);
        Parcel zzB = zzB(3, zza);
        a c10 = a.C0075a.c(zzB.readStrongBinder());
        zzB.recycle();
        return c10;
    }

    public final a c(a aVar, String str, int i10, a aVar2) {
        Parcel zza = zza();
        zzc.zze(zza, aVar);
        zza.writeString(str);
        zza.writeInt(i10);
        zzc.zze(zza, aVar2);
        Parcel zzB = zzB(2, zza);
        a c10 = a.C0075a.c(zzB.readStrongBinder());
        zzB.recycle();
        return c10;
    }
}
