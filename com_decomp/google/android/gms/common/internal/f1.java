package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;

final class f1 implements n {

    /* renamed from: a  reason: collision with root package name */
    private final IBinder f5624a;

    f1(IBinder iBinder) {
        this.f5624a = iBinder;
    }

    public final IBinder asBinder() {
        return this.f5624a;
    }

    public final void q(m mVar, g gVar) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            obtain.writeStrongBinder(mVar != null ? mVar.asBinder() : null);
            if (gVar != null) {
                obtain.writeInt(1);
                x1.a(gVar, obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f5624a.transact(46, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
