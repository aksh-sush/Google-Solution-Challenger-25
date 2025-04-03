package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import b4.a;
import com.google.android.gms.internal.common.zza;
import com.google.android.gms.internal.common.zzc;
import q3.h0;
import q3.j0;
import q3.l0;

public final class g1 extends zza implements i1 {
    g1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IGoogleCertificatesApi");
    }

    public final j0 C(h0 h0Var) {
        Parcel zza = zza();
        zzc.zzc(zza, h0Var);
        Parcel zzB = zzB(6, zza);
        j0 j0Var = (j0) zzc.zza(zzB, j0.CREATOR);
        zzB.recycle();
        return j0Var;
    }

    public final boolean f(l0 l0Var, a aVar) {
        Parcel zza = zza();
        zzc.zzc(zza, l0Var);
        zzc.zze(zza, aVar);
        Parcel zzB = zzB(5, zza);
        boolean zzf = zzc.zzf(zzB);
        zzB.recycle();
        return zzf;
    }

    public final j0 p(h0 h0Var) {
        Parcel zza = zza();
        zzc.zzc(zza, h0Var);
        Parcel zzB = zzB(8, zza);
        j0 j0Var = (j0) zzc.zza(zzB, j0.CREATOR);
        zzB.recycle();
        return j0Var;
    }

    public final boolean zzi() {
        Parcel zzB = zzB(7, zza());
        boolean zzf = zzc.zzf(zzB);
        zzB.recycle();
        return zzf;
    }
}
