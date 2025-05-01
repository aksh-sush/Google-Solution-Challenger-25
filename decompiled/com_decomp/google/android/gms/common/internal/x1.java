package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import s3.c;

public final class x1 implements Parcelable.Creator {
    static void a(g gVar, Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.t(parcel, 1, gVar.f5630e);
        c.t(parcel, 2, gVar.f5631f);
        c.t(parcel, 3, gVar.f5632g);
        c.D(parcel, 4, gVar.f5633h, false);
        c.s(parcel, 5, gVar.f5634i, false);
        c.G(parcel, 6, gVar.f5635j, i10, false);
        c.j(parcel, 7, gVar.f5636k, false);
        c.B(parcel, 8, gVar.f5637l, i10, false);
        c.G(parcel, 10, gVar.f5638m, i10, false);
        c.G(parcel, 11, gVar.f5639n, i10, false);
        c.g(parcel, 12, gVar.f5640o);
        c.t(parcel, 13, gVar.f5641p);
        c.g(parcel, 14, gVar.f5642q);
        c.D(parcel, 15, gVar.zza(), false);
        c.b(parcel, a10);
    }

    /* JADX WARNING: type inference failed for: r2v3, types: [java.lang.Object[]] */
    /* JADX WARNING: type inference failed for: r2v4, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r2v5, types: [java.lang.Object[]] */
    /* JADX WARNING: type inference failed for: r2v6, types: [java.lang.Object[]] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r23) {
        /*
            r22 = this;
            r0 = r23
            int r1 = s3.b.L(r23)
            com.google.android.gms.common.api.Scope[] r2 = com.google.android.gms.common.internal.g.f5628s
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>()
            q3.d[] r4 = com.google.android.gms.common.internal.g.f5629t
            r5 = 0
            r6 = 0
            r13 = r2
            r14 = r3
            r16 = r4
            r17 = r16
            r11 = r5
            r12 = r11
            r15 = r12
            r21 = r15
            r8 = 0
            r9 = 0
            r10 = 0
            r18 = 0
            r19 = 0
            r20 = 0
        L_0x0025:
            int r2 = r23.dataPosition()
            if (r2 >= r1) goto L_0x0096
            int r2 = s3.b.C(r23)
            int r3 = s3.b.v(r2)
            switch(r3) {
                case 1: goto L_0x0091;
                case 2: goto L_0x008c;
                case 3: goto L_0x0087;
                case 4: goto L_0x0082;
                case 5: goto L_0x007d;
                case 6: goto L_0x0073;
                case 7: goto L_0x006e;
                case 8: goto L_0x0064;
                case 9: goto L_0x0036;
                case 10: goto L_0x0059;
                case 11: goto L_0x004e;
                case 12: goto L_0x0049;
                case 13: goto L_0x0044;
                case 14: goto L_0x003f;
                case 15: goto L_0x003a;
                default: goto L_0x0036;
            }
        L_0x0036:
            s3.b.K(r0, r2)
            goto L_0x0025
        L_0x003a:
            java.lang.String r21 = s3.b.p(r0, r2)
            goto L_0x0025
        L_0x003f:
            boolean r20 = s3.b.w(r0, r2)
            goto L_0x0025
        L_0x0044:
            int r19 = s3.b.E(r0, r2)
            goto L_0x0025
        L_0x0049:
            boolean r18 = s3.b.w(r0, r2)
            goto L_0x0025
        L_0x004e:
            android.os.Parcelable$Creator<q3.d> r3 = q3.d.CREATOR
            java.lang.Object[] r2 = s3.b.s(r0, r2, r3)
            r17 = r2
            q3.d[] r17 = (q3.d[]) r17
            goto L_0x0025
        L_0x0059:
            android.os.Parcelable$Creator<q3.d> r3 = q3.d.CREATOR
            java.lang.Object[] r2 = s3.b.s(r0, r2, r3)
            r16 = r2
            q3.d[] r16 = (q3.d[]) r16
            goto L_0x0025
        L_0x0064:
            android.os.Parcelable$Creator r3 = android.accounts.Account.CREATOR
            android.os.Parcelable r2 = s3.b.o(r0, r2, r3)
            r15 = r2
            android.accounts.Account r15 = (android.accounts.Account) r15
            goto L_0x0025
        L_0x006e:
            android.os.Bundle r14 = s3.b.f(r0, r2)
            goto L_0x0025
        L_0x0073:
            android.os.Parcelable$Creator<com.google.android.gms.common.api.Scope> r3 = com.google.android.gms.common.api.Scope.CREATOR
            java.lang.Object[] r2 = s3.b.s(r0, r2, r3)
            r13 = r2
            com.google.android.gms.common.api.Scope[] r13 = (com.google.android.gms.common.api.Scope[]) r13
            goto L_0x0025
        L_0x007d:
            android.os.IBinder r12 = s3.b.D(r0, r2)
            goto L_0x0025
        L_0x0082:
            java.lang.String r11 = s3.b.p(r0, r2)
            goto L_0x0025
        L_0x0087:
            int r10 = s3.b.E(r0, r2)
            goto L_0x0025
        L_0x008c:
            int r9 = s3.b.E(r0, r2)
            goto L_0x0025
        L_0x0091:
            int r8 = s3.b.E(r0, r2)
            goto L_0x0025
        L_0x0096:
            s3.b.u(r0, r1)
            com.google.android.gms.common.internal.g r0 = new com.google.android.gms.common.internal.g
            r7 = r0
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.x1.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new g[i10];
    }
}
