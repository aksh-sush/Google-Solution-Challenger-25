package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.measurement.zzbm;
import com.google.android.gms.internal.measurement.zzbo;
import h4.d;
import java.util.ArrayList;
import java.util.List;

public final class z2 extends zzbm implements d {
    z2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IMeasurementService");
    }

    public final byte[] A(t tVar, String str) {
        Parcel zza = zza();
        zzbo.zzd(zza, tVar);
        zza.writeString(str);
        Parcel zzb = zzb(9, zza);
        byte[] createByteArray = zzb.createByteArray();
        zzb.recycle();
        return createByteArray;
    }

    public final void G(i9 i9Var) {
        Parcel zza = zza();
        zzbo.zzd(zza, i9Var);
        zzc(4, zza);
    }

    public final List H(String str, String str2, i9 i9Var) {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzbo.zzd(zza, i9Var);
        Parcel zzb = zzb(16, zza);
        ArrayList<c> createTypedArrayList = zzb.createTypedArrayList(c.CREATOR);
        zzb.recycle();
        return createTypedArrayList;
    }

    public final void P(i9 i9Var) {
        Parcel zza = zza();
        zzbo.zzd(zza, i9Var);
        zzc(6, zza);
    }

    public final void U(z8 z8Var, i9 i9Var) {
        Parcel zza = zza();
        zzbo.zzd(zza, z8Var);
        zzbo.zzd(zza, i9Var);
        zzc(2, zza);
    }

    public final void X(t tVar, i9 i9Var) {
        Parcel zza = zza();
        zzbo.zzd(zza, tVar);
        zzbo.zzd(zza, i9Var);
        zzc(1, zza);
    }

    public final void a(i9 i9Var) {
        Parcel zza = zza();
        zzbo.zzd(zza, i9Var);
        zzc(20, zza);
    }

    public final void b(long j10, String str, String str2, String str3) {
        Parcel zza = zza();
        zza.writeLong(j10);
        zza.writeString(str);
        zza.writeString(str2);
        zza.writeString(str3);
        zzc(10, zza);
    }

    public final void d(Bundle bundle, i9 i9Var) {
        Parcel zza = zza();
        zzbo.zzd(zza, bundle);
        zzbo.zzd(zza, i9Var);
        zzc(19, zza);
    }

    public final List e(String str, String str2, boolean z10, i9 i9Var) {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzbo.zzc(zza, z10);
        zzbo.zzd(zza, i9Var);
        Parcel zzb = zzb(14, zza);
        ArrayList<z8> createTypedArrayList = zzb.createTypedArrayList(z8.CREATOR);
        zzb.recycle();
        return createTypedArrayList;
    }

    public final void g(c cVar, i9 i9Var) {
        Parcel zza = zza();
        zzbo.zzd(zza, cVar);
        zzbo.zzd(zza, i9Var);
        zzc(12, zza);
    }

    public final List i(String str, String str2, String str3, boolean z10) {
        Parcel zza = zza();
        zza.writeString((String) null);
        zza.writeString(str2);
        zza.writeString(str3);
        zzbo.zzc(zza, z10);
        Parcel zzb = zzb(15, zza);
        ArrayList<z8> createTypedArrayList = zzb.createTypedArrayList(z8.CREATOR);
        zzb.recycle();
        return createTypedArrayList;
    }

    public final void k(i9 i9Var) {
        Parcel zza = zza();
        zzbo.zzd(zza, i9Var);
        zzc(18, zza);
    }

    public final String o(i9 i9Var) {
        Parcel zza = zza();
        zzbo.zzd(zza, i9Var);
        Parcel zzb = zzb(11, zza);
        String readString = zzb.readString();
        zzb.recycle();
        return readString;
    }

    public final List v(String str, String str2, String str3) {
        Parcel zza = zza();
        zza.writeString((String) null);
        zza.writeString(str2);
        zza.writeString(str3);
        Parcel zzb = zzb(17, zza);
        ArrayList<c> createTypedArrayList = zzb.createTypedArrayList(c.CREATOR);
        zzb.recycle();
        return createTypedArrayList;
    }
}
