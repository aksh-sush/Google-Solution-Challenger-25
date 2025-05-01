package com.google.android.gms.auth.api.credentials;

import android.os.Parcelable;

public final class b implements Parcelable.Creator {
    /* JADX WARNING: type inference failed for: r1v3, types: [android.os.Parcelable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r12) {
        /*
            r11 = this;
            int r0 = s3.b.L(r12)
            r1 = 0
            r3 = r1
            r4 = r3
            r5 = r4
            r6 = r5
            r7 = r6
            r8 = r7
            r9 = r8
            r10 = r9
        L_0x000d:
            int r1 = r12.dataPosition()
            if (r1 >= r0) goto L_0x0051
            int r1 = s3.b.C(r12)
            int r2 = s3.b.v(r1)
            switch(r2) {
                case 1: goto L_0x004c;
                case 2: goto L_0x0047;
                case 3: goto L_0x003d;
                case 4: goto L_0x0036;
                case 5: goto L_0x0031;
                case 6: goto L_0x002c;
                case 7: goto L_0x001e;
                case 8: goto L_0x001e;
                case 9: goto L_0x0027;
                case 10: goto L_0x0022;
                default: goto L_0x001e;
            }
        L_0x001e:
            s3.b.K(r12, r1)
            goto L_0x000d
        L_0x0022:
            java.lang.String r10 = s3.b.p(r12, r1)
            goto L_0x000d
        L_0x0027:
            java.lang.String r9 = s3.b.p(r12, r1)
            goto L_0x000d
        L_0x002c:
            java.lang.String r8 = s3.b.p(r12, r1)
            goto L_0x000d
        L_0x0031:
            java.lang.String r7 = s3.b.p(r12, r1)
            goto L_0x000d
        L_0x0036:
            android.os.Parcelable$Creator<com.google.android.gms.auth.api.credentials.IdToken> r2 = com.google.android.gms.auth.api.credentials.IdToken.CREATOR
            java.util.ArrayList r6 = s3.b.t(r12, r1, r2)
            goto L_0x000d
        L_0x003d:
            android.os.Parcelable$Creator r2 = android.net.Uri.CREATOR
            android.os.Parcelable r1 = s3.b.o(r12, r1, r2)
            r5 = r1
            android.net.Uri r5 = (android.net.Uri) r5
            goto L_0x000d
        L_0x0047:
            java.lang.String r4 = s3.b.p(r12, r1)
            goto L_0x000d
        L_0x004c:
            java.lang.String r3 = s3.b.p(r12, r1)
            goto L_0x000d
        L_0x0051:
            s3.b.u(r12, r0)
            com.google.android.gms.auth.api.credentials.Credential r12 = new com.google.android.gms.auth.api.credentials.Credential
            r2 = r12
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.api.credentials.b.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new Credential[i10];
    }
}
