package com.google.android.gms.internal.p002firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import s3.b;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzxe  reason: invalid package */
public final class zzxe implements Parcelable.Creator<zzxd> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int L = b.L(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        long j10 = 0;
        boolean z10 = false;
        boolean z11 = false;
        while (parcel.dataPosition() < L) {
            int C = b.C(parcel);
            switch (b.v(C)) {
                case 1:
                    str = b.p(parcel2, C);
                    break;
                case 2:
                    j10 = b.G(parcel2, C);
                    break;
                case 3:
                    z10 = b.w(parcel2, C);
                    break;
                case 4:
                    str2 = b.p(parcel2, C);
                    break;
                case 5:
                    str3 = b.p(parcel2, C);
                    break;
                case 6:
                    str4 = b.p(parcel2, C);
                    break;
                case 7:
                    z11 = b.w(parcel2, C);
                    break;
                case 8:
                    str5 = b.p(parcel2, C);
                    break;
                default:
                    b.K(parcel2, C);
                    break;
            }
        }
        b.u(parcel2, L);
        return new zzxd(str, j10, z10, str2, str3, str4, z11, str5);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i10) {
        return new zzxd[i10];
    }
}
