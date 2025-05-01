package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.Parcel;
import b4.a;
import com.google.android.gms.internal.common.zza;
import com.google.android.gms.internal.common.zzc;

public final class m extends zza {
    m(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
    }

    public final int Y(a aVar, String str, boolean z10) {
        Parcel zza = zza();
        zzc.zze(zza, aVar);
        zza.writeString(str);
        zza.writeInt(z10 ? 1 : 0);
        Parcel zzB = zzB(3, zza);
        int readInt = zzB.readInt();
        zzB.recycle();
        return readInt;
    }

    public final int Z(a aVar, String str, boolean z10) {
        Parcel zza = zza();
        zzc.zze(zza, aVar);
        zza.writeString(str);
        zza.writeInt(z10 ? 1 : 0);
        Parcel zzB = zzB(5, zza);
        int readInt = zzB.readInt();
        zzB.recycle();
        return readInt;
    }

    public final a a0(a aVar, String str, int i10) {
        Parcel zza = zza();
        zzc.zze(zza, aVar);
        zza.writeString(str);
        zza.writeInt(i10);
        Parcel zzB = zzB(2, zza);
        a c10 = a.C0075a.c(zzB.readStrongBinder());
        zzB.recycle();
        return c10;
    }

    public final a b0(a aVar, String str, int i10, a aVar2) {
        Parcel zza = zza();
        zzc.zze(zza, aVar);
        zza.writeString(str);
        zza.writeInt(i10);
        zzc.zze(zza, aVar2);
        Parcel zzB = zzB(8, zza);
        a c10 = a.C0075a.c(zzB.readStrongBinder());
        zzB.recycle();
        return c10;
    }

    public final int c() {
        Parcel zzB = zzB(6, zza());
        int readInt = zzB.readInt();
        zzB.recycle();
        return readInt;
    }

    public final a c0(a aVar, String str, int i10) {
        Parcel zza = zza();
        zzc.zze(zza, aVar);
        zza.writeString(str);
        zza.writeInt(i10);
        Parcel zzB = zzB(4, zza);
        a c10 = a.C0075a.c(zzB.readStrongBinder());
        zzB.recycle();
        return c10;
    }

    public final a d0(a aVar, String str, boolean z10, long j10) {
        Parcel zza = zza();
        zzc.zze(zza, aVar);
        zza.writeString(str);
        zza.writeInt(z10 ? 1 : 0);
        zza.writeLong(j10);
        Parcel zzB = zzB(7, zza);
        a c10 = a.C0075a.c(zzB.readStrongBinder());
        zzB.recycle();
        return c10;
    }
}
