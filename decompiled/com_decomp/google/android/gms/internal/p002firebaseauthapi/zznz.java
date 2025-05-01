package com.google.android.gms.internal.p002firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.firebase.auth.zze;
import s3.b;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zznz  reason: invalid package */
public final class zznz implements Parcelable.Creator<zzny> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int L = b.L(parcel);
        Status status = null;
        zze zze = null;
        String str = null;
        String str2 = null;
        while (parcel.dataPosition() < L) {
            int C = b.C(parcel);
            int v10 = b.v(C);
            if (v10 == 1) {
                status = (Status) b.o(parcel, C, Status.CREATOR);
            } else if (v10 == 2) {
                zze = (zze) b.o(parcel, C, zze.CREATOR);
            } else if (v10 == 3) {
                str = b.p(parcel, C);
            } else if (v10 != 4) {
                b.K(parcel, C);
            } else {
                str2 = b.p(parcel, C);
            }
        }
        b.u(parcel, L);
        return new zzny(status, zze, str, str2);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i10) {
        return new zzny[i10];
    }
}
