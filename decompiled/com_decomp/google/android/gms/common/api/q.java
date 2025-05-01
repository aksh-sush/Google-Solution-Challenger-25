package com.google.android.gms.common.api;

import android.os.Parcelable;

public final class q implements Parcelable.Creator {
    /* JADX WARNING: type inference failed for: r1v3, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r1v4, types: [android.os.Parcelable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r10) {
        /*
            r9 = this;
            int r0 = s3.b.L(r10)
            r1 = 0
            r2 = 0
            r6 = r1
            r7 = r6
            r8 = r7
            r4 = 0
            r5 = 0
        L_0x000b:
            int r1 = r10.dataPosition()
            if (r1 >= r0) goto L_0x0050
            int r1 = s3.b.C(r10)
            int r2 = s3.b.v(r1)
            r3 = 1
            if (r2 == r3) goto L_0x004b
            r3 = 2
            if (r2 == r3) goto L_0x0046
            r3 = 3
            if (r2 == r3) goto L_0x003c
            r3 = 4
            if (r2 == r3) goto L_0x0032
            r3 = 1000(0x3e8, float:1.401E-42)
            if (r2 == r3) goto L_0x002d
            s3.b.K(r10, r1)
            goto L_0x000b
        L_0x002d:
            int r4 = s3.b.E(r10, r1)
            goto L_0x000b
        L_0x0032:
            android.os.Parcelable$Creator<q3.b> r2 = q3.b.CREATOR
            android.os.Parcelable r1 = s3.b.o(r10, r1, r2)
            r8 = r1
            q3.b r8 = (q3.b) r8
            goto L_0x000b
        L_0x003c:
            android.os.Parcelable$Creator r2 = android.app.PendingIntent.CREATOR
            android.os.Parcelable r1 = s3.b.o(r10, r1, r2)
            r7 = r1
            android.app.PendingIntent r7 = (android.app.PendingIntent) r7
            goto L_0x000b
        L_0x0046:
            java.lang.String r6 = s3.b.p(r10, r1)
            goto L_0x000b
        L_0x004b:
            int r5 = s3.b.E(r10, r1)
            goto L_0x000b
        L_0x0050:
            s3.b.u(r10, r0)
            com.google.android.gms.common.api.Status r10 = new com.google.android.gms.common.api.Status
            r3 = r10
            r3.<init>(r4, r5, r6, r7, r8)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.q.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new Status[i10];
    }
}
