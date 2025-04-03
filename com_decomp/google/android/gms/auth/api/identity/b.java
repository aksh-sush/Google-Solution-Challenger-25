package com.google.android.gms.auth.api.identity;

import android.os.Parcelable;

public final class b implements Parcelable.Creator {
    /* JADX WARNING: type inference failed for: r1v3, types: [android.os.Parcelable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r11) {
        /*
            r10 = this;
            int r0 = s3.b.L(r11)
            r1 = 0
            r2 = 0
            r4 = r2
            r5 = r4
            r6 = r5
            r7 = r6
            r8 = r7
            r9 = 0
        L_0x000c:
            int r1 = r11.dataPosition()
            if (r1 >= r0) goto L_0x0044
            int r1 = s3.b.C(r11)
            int r2 = s3.b.v(r1)
            switch(r2) {
                case 1: goto L_0x003a;
                case 2: goto L_0x0035;
                case 3: goto L_0x0030;
                case 4: goto L_0x002b;
                case 5: goto L_0x0026;
                case 6: goto L_0x0021;
                default: goto L_0x001d;
            }
        L_0x001d:
            s3.b.K(r11, r1)
            goto L_0x000c
        L_0x0021:
            int r9 = s3.b.E(r11, r1)
            goto L_0x000c
        L_0x0026:
            java.lang.String r8 = s3.b.p(r11, r1)
            goto L_0x000c
        L_0x002b:
            java.util.ArrayList r7 = s3.b.r(r11, r1)
            goto L_0x000c
        L_0x0030:
            java.lang.String r6 = s3.b.p(r11, r1)
            goto L_0x000c
        L_0x0035:
            java.lang.String r5 = s3.b.p(r11, r1)
            goto L_0x000c
        L_0x003a:
            android.os.Parcelable$Creator r2 = android.app.PendingIntent.CREATOR
            android.os.Parcelable r1 = s3.b.o(r11, r1, r2)
            r4 = r1
            android.app.PendingIntent r4 = (android.app.PendingIntent) r4
            goto L_0x000c
        L_0x0044:
            s3.b.u(r11, r0)
            com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest r11 = new com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest
            r3 = r11
            r3.<init>(r4, r5, r6, r7, r8, r9)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.api.identity.b.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new SaveAccountLinkingTokenRequest[i10];
    }
}
