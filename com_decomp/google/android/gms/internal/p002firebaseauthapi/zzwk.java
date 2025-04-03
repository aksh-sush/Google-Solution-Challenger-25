package com.google.android.gms.internal.p002firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.auth.zze;
import java.util.ArrayList;
import s3.b;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzwk  reason: invalid package */
public final class zzwk implements Parcelable.Creator<zzwj> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int L = b.L(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        zzwy zzwy = null;
        String str5 = null;
        String str6 = null;
        zze zze = null;
        ArrayList arrayList = null;
        long j10 = 0;
        long j11 = 0;
        boolean z10 = false;
        boolean z11 = false;
        while (parcel.dataPosition() < L) {
            int C = b.C(parcel);
            switch (b.v(C)) {
                case 2:
                    str = b.p(parcel2, C);
                    break;
                case 3:
                    str2 = b.p(parcel2, C);
                    break;
                case 4:
                    z10 = b.w(parcel2, C);
                    break;
                case 5:
                    str3 = b.p(parcel2, C);
                    break;
                case 6:
                    str4 = b.p(parcel2, C);
                    break;
                case 7:
                    zzwy = (zzwy) b.o(parcel2, C, zzwy.CREATOR);
                    break;
                case 8:
                    str5 = b.p(parcel2, C);
                    break;
                case 9:
                    str6 = b.p(parcel2, C);
                    break;
                case 10:
                    j10 = b.G(parcel2, C);
                    break;
                case 11:
                    j11 = b.G(parcel2, C);
                    break;
                case 12:
                    z11 = b.w(parcel2, C);
                    break;
                case 13:
                    zze = (zze) b.o(parcel2, C, zze.CREATOR);
                    break;
                case 14:
                    arrayList = b.t(parcel2, C, zzwu.CREATOR);
                    break;
                default:
                    b.K(parcel2, C);
                    break;
            }
        }
        b.u(parcel2, L);
        return new zzwj(str, str2, z10, str3, str4, zzwy, str5, str6, j10, j11, z11, zze, arrayList);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i10) {
        return new zzwj[i10];
    }
}
