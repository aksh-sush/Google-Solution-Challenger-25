package com.google.android.gms.common.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;

public interface n extends IInterface {

    public static abstract class a extends Binder implements n {
        public a() {
            attachInterface(this, "com.google.android.gms.common.internal.IGmsServiceBroker");
        }

        public IBinder asBinder() {
            return this;
        }

        /* JADX WARNING: Can't fix incorrect switch cases order */
        /* JADX WARNING: Code restructure failed: missing block: B:51:0x009d, code lost:
            if (r5.readInt() != 0) goto L_0x00e4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:54:0x00ba, code lost:
            if (r5.readInt() != 0) goto L_0x00e4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:57:0x00cb, code lost:
            if (r5.readInt() != 0) goto L_0x00e4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:59:0x00d2, code lost:
            if (r5.readInt() != 0) goto L_0x00e4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:61:0x00e2, code lost:
            if (r5.readInt() != 0) goto L_0x00e4;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean onTransact(int r4, android.os.Parcel r5, android.os.Parcel r6, int r7) {
            /*
                r3 = this;
                r0 = 16777215(0xffffff, float:2.3509886E-38)
                if (r4 <= r0) goto L_0x000a
                boolean r4 = super.onTransact(r4, r5, r6, r7)
                return r4
            L_0x000a:
                java.lang.String r7 = "com.google.android.gms.common.internal.IGmsServiceBroker"
                r5.enforceInterface(r7)
                android.os.IBinder r7 = r5.readStrongBinder()
                r0 = 0
                if (r7 != 0) goto L_0x0018
                r1 = r0
                goto L_0x002a
            L_0x0018:
                java.lang.String r1 = "com.google.android.gms.common.internal.IGmsCallbacks"
                android.os.IInterface r1 = r7.queryLocalInterface(r1)
                boolean r2 = r1 instanceof com.google.android.gms.common.internal.m
                if (r2 == 0) goto L_0x0025
                com.google.android.gms.common.internal.m r1 = (com.google.android.gms.common.internal.m) r1
                goto L_0x002a
            L_0x0025:
                com.google.android.gms.common.internal.d1 r1 = new com.google.android.gms.common.internal.d1
                r1.<init>(r7)
            L_0x002a:
                r7 = 46
                r2 = 1
                if (r4 != r7) goto L_0x0048
                int r4 = r5.readInt()
                if (r4 == 0) goto L_0x003e
                android.os.Parcelable$Creator<com.google.android.gms.common.internal.g> r4 = com.google.android.gms.common.internal.g.CREATOR
                java.lang.Object r4 = r4.createFromParcel(r5)
                r0 = r4
                com.google.android.gms.common.internal.g r0 = (com.google.android.gms.common.internal.g) r0
            L_0x003e:
                r3.q(r1, r0)
                com.google.android.gms.common.internal.s.k(r6)
                r6.writeNoException()
                return r2
            L_0x0048:
                r6 = 47
                if (r4 != r6) goto L_0x0060
                int r4 = r5.readInt()
                if (r4 == 0) goto L_0x005a
                android.os.Parcelable$Creator<com.google.android.gms.common.internal.m1> r4 = com.google.android.gms.common.internal.m1.CREATOR
                java.lang.Object r4 = r4.createFromParcel(r5)
                com.google.android.gms.common.internal.m1 r4 = (com.google.android.gms.common.internal.m1) r4
            L_0x005a:
                java.lang.UnsupportedOperationException r4 = new java.lang.UnsupportedOperationException
                r4.<init>()
                throw r4
            L_0x0060:
                r5.readInt()
                r6 = 4
                if (r4 == r6) goto L_0x00ec
                r5.readString()
                if (r4 == r2) goto L_0x00d5
                r6 = 2
                if (r4 == r6) goto L_0x00ce
                r6 = 23
                if (r4 == r6) goto L_0x00ce
                r6 = 25
                if (r4 == r6) goto L_0x00ce
                r6 = 27
                if (r4 == r6) goto L_0x00ce
                r6 = 30
                if (r4 == r6) goto L_0x00c1
                r6 = 34
                if (r4 == r6) goto L_0x00bd
                r6 = 41
                if (r4 == r6) goto L_0x00ce
                r6 = 43
                if (r4 == r6) goto L_0x00ce
                r6 = 37
                if (r4 == r6) goto L_0x00ce
                r6 = 38
                if (r4 == r6) goto L_0x00ce
                switch(r4) {
                    case 5: goto L_0x00ce;
                    case 6: goto L_0x00ce;
                    case 7: goto L_0x00ce;
                    case 8: goto L_0x00ce;
                    case 9: goto L_0x00a7;
                    case 10: goto L_0x00a0;
                    case 11: goto L_0x00ce;
                    case 12: goto L_0x00ce;
                    case 13: goto L_0x00ce;
                    case 14: goto L_0x00ce;
                    case 15: goto L_0x00ce;
                    case 16: goto L_0x00ce;
                    case 17: goto L_0x00ce;
                    case 18: goto L_0x00ce;
                    case 19: goto L_0x0096;
                    case 20: goto L_0x00c1;
                    default: goto L_0x0095;
                }
            L_0x0095:
                goto L_0x00ec
            L_0x0096:
                r5.readStrongBinder()
                int r4 = r5.readInt()
                if (r4 == 0) goto L_0x00ec
                goto L_0x00e4
            L_0x00a0:
                r5.readString()
                r5.createStringArray()
                goto L_0x00ec
            L_0x00a7:
                r5.readString()
                r5.createStringArray()
                r5.readString()
                r5.readStrongBinder()
                r5.readString()
                int r4 = r5.readInt()
                if (r4 == 0) goto L_0x00ec
                goto L_0x00e4
            L_0x00bd:
                r5.readString()
                goto L_0x00ec
            L_0x00c1:
                r5.createStringArray()
                r5.readString()
                int r4 = r5.readInt()
                if (r4 == 0) goto L_0x00ec
                goto L_0x00e4
            L_0x00ce:
                int r4 = r5.readInt()
                if (r4 == 0) goto L_0x00ec
                goto L_0x00e4
            L_0x00d5:
                r5.readString()
                r5.createStringArray()
                r5.readString()
                int r4 = r5.readInt()
                if (r4 == 0) goto L_0x00ec
            L_0x00e4:
                android.os.Parcelable$Creator r4 = android.os.Bundle.CREATOR
                java.lang.Object r4 = r4.createFromParcel(r5)
                android.os.Bundle r4 = (android.os.Bundle) r4
            L_0x00ec:
                java.lang.UnsupportedOperationException r4 = new java.lang.UnsupportedOperationException
                r4.<init>()
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.n.a.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
        }
    }

    void q(m mVar, g gVar);
}
