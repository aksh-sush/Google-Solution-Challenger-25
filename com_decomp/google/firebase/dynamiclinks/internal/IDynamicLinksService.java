package com.google.firebase.dynamiclinks.internal;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.firebase.dynamiclinks.internal.IDynamicLinksCallbacks;

public interface IDynamicLinksService extends IInterface {

    public static abstract class Stub extends Binder implements IDynamicLinksService {
        private static final String DESCRIPTOR = "com.google.firebase.dynamiclinks.internal.IDynamicLinksService";
        static final int TRANSACTION_createShortDynamicLink = 2;
        static final int TRANSACTION_getDynamicLink = 1;

        private static class a implements IDynamicLinksService {

            /* renamed from: a  reason: collision with root package name */
            private IBinder f7809a;

            a(IBinder iBinder) {
                this.f7809a = iBinder;
            }

            public IBinder asBinder() {
                return this.f7809a;
            }

            public void createShortDynamicLink(IDynamicLinksCallbacks iDynamicLinksCallbacks, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.firebase.dynamiclinks.internal.IDynamicLinksService");
                    obtain.writeStrongBinder(iDynamicLinksCallbacks != null ? iDynamicLinksCallbacks.asBinder() : null);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f7809a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void getDynamicLink(IDynamicLinksCallbacks iDynamicLinksCallbacks, String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.firebase.dynamiclinks.internal.IDynamicLinksService");
                    obtain.writeStrongBinder(iDynamicLinksCallbacks != null ? iDynamicLinksCallbacks.asBinder() : null);
                    obtain.writeString(str);
                    this.f7809a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, "com.google.firebase.dynamiclinks.internal.IDynamicLinksService");
        }

        public static IDynamicLinksService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.firebase.dynamiclinks.internal.IDynamicLinksService");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof IDynamicLinksService)) ? new a(iBinder) : (IDynamicLinksService) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
            if (i10 == 1) {
                parcel.enforceInterface("com.google.firebase.dynamiclinks.internal.IDynamicLinksService");
                getDynamicLink(IDynamicLinksCallbacks.Stub.asInterface(parcel.readStrongBinder()), parcel.readString());
            } else if (i10 == 2) {
                parcel.enforceInterface("com.google.firebase.dynamiclinks.internal.IDynamicLinksService");
                createShortDynamicLink(IDynamicLinksCallbacks.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
            } else if (i10 != 1598968902) {
                return super.onTransact(i10, parcel, parcel2, i11);
            } else {
                parcel2.writeString("com.google.firebase.dynamiclinks.internal.IDynamicLinksService");
                return true;
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void createShortDynamicLink(IDynamicLinksCallbacks iDynamicLinksCallbacks, Bundle bundle);

    void getDynamicLink(IDynamicLinksCallbacks iDynamicLinksCallbacks, String str);
}
