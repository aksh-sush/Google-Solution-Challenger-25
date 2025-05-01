package com.google.android.gms.internal.p002firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.auth.zze;
import java.util.ArrayList;
import s3.b;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzob  reason: invalid package */
public final class zzob implements Parcelable.Creator<zzoa> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int L = b.L(parcel);
        String str = null;
        ArrayList arrayList = null;
        zze zze = null;
        while (parcel.dataPosition() < L) {
            int C = b.C(parcel);
            int v10 = b.v(C);
            if (v10 == 1) {
                str = b.p(parcel, C);
            } else if (v10 == 2) {
                arrayList = b.t(parcel, C, zzwu.CREATOR);
            } else if (v10 != 3) {
                b.K(parcel, C);
            } else {
                zze = (zze) b.o(parcel, C, zze.CREATOR);
            }
        }
        b.u(parcel, L);
        return new zzoa(str, arrayList, zze);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i10) {
        return new zzoa[i10];
    }
}
