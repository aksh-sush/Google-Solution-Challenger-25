package com.google.firebase.dynamiclinks.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

public interface IDynamicLinksCallbacks extends IInterface {

    public static abstract class Stub extends Binder implements IDynamicLinksCallbacks {
        private static final String DESCRIPTOR = "com.google.firebase.dynamiclinks.internal.IDynamicLinksCallbacks";
        static final int TRANSACTION_onCreateShortDynamicLink = 2;
        static final int TRANSACTION_onGetDynamicLink = 1;

        private static class a implements IDynamicLinksCallbacks {

            /* renamed from: a  reason: collision with root package name */
            private IBinder f7808a;

            a(IBinder iBinder) {
                this.f7808a = iBinder;
            }

            public IBinder asBinder() {
                return this.f7808a;
            }

            public void onCreateShortDynamicLink(Status status, ShortDynamicLinkImpl shortDynamicLinkImpl) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (status != null) {
                        obtain.writeInt(1);
                        status.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (shortDynamicLinkImpl != null) {
                        obtain.writeInt(1);
                        shortDynamicLinkImpl.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f7808a.transact(2, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public void onGetDynamicLink(Status status, DynamicLinkData dynamicLinkData) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (status != null) {
                        obtain.writeInt(1);
                        status.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (dynamicLinkData != null) {
                        obtain.writeInt(1);
                        dynamicLinkData.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f7808a.transact(1, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static IDynamicLinksCallbacks asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof IDynamicLinksCallbacks)) ? new a(iBinder) : (IDynamicLinksCallbacks) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: com.google.firebase.dynamiclinks.internal.DynamicLinkData} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: com.google.firebase.dynamiclinks.internal.ShortDynamicLinkImpl} */
        /* JADX WARNING: type inference failed for: r0v0 */
        /* JADX WARNING: type inference failed for: r0v7 */
        /* JADX WARNING: type inference failed for: r0v8 */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTransact(int r5, android.os.Parcel r6, android.os.Parcel r7, int r8) {
            /*
                r4 = this;
                r0 = 0
                r1 = 1
                java.lang.String r2 = "com.google.firebase.dynamiclinks.internal.IDynamicLinksCallbacks"
                if (r5 == r1) goto L_0x003d
                r3 = 2
                if (r5 == r3) goto L_0x0017
                r0 = 1598968902(0x5f4e5446, float:1.4867585E19)
                if (r5 == r0) goto L_0x0013
                boolean r5 = super.onTransact(r5, r6, r7, r8)
                return r5
            L_0x0013:
                r7.writeString(r2)
                return r1
            L_0x0017:
                r6.enforceInterface(r2)
                int r5 = r6.readInt()
                if (r5 == 0) goto L_0x0029
                android.os.Parcelable$Creator<com.google.android.gms.common.api.Status> r5 = com.google.android.gms.common.api.Status.CREATOR
                java.lang.Object r5 = r5.createFromParcel(r6)
                com.google.android.gms.common.api.Status r5 = (com.google.android.gms.common.api.Status) r5
                goto L_0x002a
            L_0x0029:
                r5 = r0
            L_0x002a:
                int r7 = r6.readInt()
                if (r7 == 0) goto L_0x0039
                android.os.Parcelable$Creator<com.google.firebase.dynamiclinks.internal.ShortDynamicLinkImpl> r7 = com.google.firebase.dynamiclinks.internal.ShortDynamicLinkImpl.CREATOR
                java.lang.Object r6 = r7.createFromParcel(r6)
                r0 = r6
                com.google.firebase.dynamiclinks.internal.ShortDynamicLinkImpl r0 = (com.google.firebase.dynamiclinks.internal.ShortDynamicLinkImpl) r0
            L_0x0039:
                r4.onCreateShortDynamicLink(r5, r0)
                return r1
            L_0x003d:
                r6.enforceInterface(r2)
                int r5 = r6.readInt()
                if (r5 == 0) goto L_0x004f
                android.os.Parcelable$Creator<com.google.android.gms.common.api.Status> r5 = com.google.android.gms.common.api.Status.CREATOR
                java.lang.Object r5 = r5.createFromParcel(r6)
                com.google.android.gms.common.api.Status r5 = (com.google.android.gms.common.api.Status) r5
                goto L_0x0050
            L_0x004f:
                r5 = r0
            L_0x0050:
                int r7 = r6.readInt()
                if (r7 == 0) goto L_0x005f
                android.os.Parcelable$Creator<com.google.firebase.dynamiclinks.internal.DynamicLinkData> r7 = com.google.firebase.dynamiclinks.internal.DynamicLinkData.CREATOR
                java.lang.Object r6 = r7.createFromParcel(r6)
                r0 = r6
                com.google.firebase.dynamiclinks.internal.DynamicLinkData r0 = (com.google.firebase.dynamiclinks.internal.DynamicLinkData) r0
            L_0x005f:
                r4.onGetDynamicLink(r5, r0)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.dynamiclinks.internal.IDynamicLinksCallbacks.Stub.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
        }
    }

    void onCreateShortDynamicLink(Status status, ShortDynamicLinkImpl shortDynamicLinkImpl);

    void onGetDynamicLink(Status status, DynamicLinkData dynamicLinkData);
}
