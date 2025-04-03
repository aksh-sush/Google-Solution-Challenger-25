package com.google.android.gms.internal.p002firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import s3.b;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzwz  reason: invalid package */
public final class zzwz implements Parcelable.Creator<zzwy> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int L = b.L(parcel);
        ArrayList arrayList = null;
        while (parcel.dataPosition() < L) {
            int C = b.C(parcel);
            if (b.v(C) != 2) {
                b.K(parcel, C);
            } else {
                arrayList = b.t(parcel, C, zzww.CREATOR);
            }
        }
        b.u(parcel, L);
        return new zzwy(arrayList);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i10) {
        return new zzwy[i10];
    }
}
