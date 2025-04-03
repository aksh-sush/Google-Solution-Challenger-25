package com.google.android.gms.internal.p002firebaseauthapi;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zza  reason: invalid package */
public class zza implements IInterface {
    private final IBinder zza;
    private final String zzb;

    protected zza(IBinder iBinder, String str) {
        this.zza = iBinder;
        this.zzb = str;
    }

    public final IBinder asBinder() {
        return this.zza;
    }

    /* access modifiers changed from: protected */
    public final void zzI(int i10, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.zza.transact(i10, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    /* access modifiers changed from: protected */
    public final void zzJ(int i10, Parcel parcel) {
        try {
            this.zza.transact(i10, parcel, (Parcel) null, 1);
        } finally {
            parcel.recycle();
        }
    }

    /* access modifiers changed from: protected */
    public final Parcel zza() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.zzb);
        return obtain;
    }
}
