package com.google.android.gms.internal.p002firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import s3.b;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzvw  reason: invalid package */
public final class zzvw implements Parcelable.Creator<zzvv> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int L = b.L(parcel);
        String str = null;
        String str2 = null;
        zzxo zzxo = null;
        ArrayList arrayList = null;
        boolean z10 = false;
        boolean z11 = false;
        while (parcel.dataPosition() < L) {
            int C = b.C(parcel);
            switch (b.v(C)) {
                case 2:
                    str = b.p(parcel, C);
                    break;
                case 3:
                    z10 = b.w(parcel, C);
                    break;
                case 4:
                    str2 = b.p(parcel, C);
                    break;
                case 5:
                    z11 = b.w(parcel, C);
                    break;
                case 6:
                    zzxo = (zzxo) b.o(parcel, C, zzxo.CREATOR);
                    break;
                case 7:
                    arrayList = b.r(parcel, C);
                    break;
                default:
                    b.K(parcel, C);
                    break;
            }
        }
        b.u(parcel, L);
        return new zzvv(str, z10, str2, z11, zzxo, arrayList);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i10) {
        return new zzvv[i10];
    }
}
