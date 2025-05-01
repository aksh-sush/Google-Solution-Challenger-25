package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import s3.b;

public final class c implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int L = b.L(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Uri uri = null;
        String str5 = null;
        String str6 = null;
        ArrayList arrayList = null;
        String str7 = null;
        String str8 = null;
        long j10 = 0;
        int i10 = 0;
        while (parcel.dataPosition() < L) {
            int C = b.C(parcel);
            switch (b.v(C)) {
                case 1:
                    i10 = b.E(parcel2, C);
                    break;
                case 2:
                    str = b.p(parcel2, C);
                    break;
                case 3:
                    str2 = b.p(parcel2, C);
                    break;
                case 4:
                    str3 = b.p(parcel2, C);
                    break;
                case 5:
                    str4 = b.p(parcel2, C);
                    break;
                case 6:
                    uri = (Uri) b.o(parcel2, C, Uri.CREATOR);
                    break;
                case 7:
                    str5 = b.p(parcel2, C);
                    break;
                case 8:
                    j10 = b.G(parcel2, C);
                    break;
                case 9:
                    str6 = b.p(parcel2, C);
                    break;
                case 10:
                    arrayList = b.t(parcel2, C, Scope.CREATOR);
                    break;
                case 11:
                    str7 = b.p(parcel2, C);
                    break;
                case 12:
                    str8 = b.p(parcel2, C);
                    break;
                default:
                    b.K(parcel2, C);
                    break;
            }
        }
        b.u(parcel2, L);
        return new GoogleSignInAccount(i10, str, str2, str3, str4, uri, str5, j10, str6, arrayList, str7, str8);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new GoogleSignInAccount[i10];
    }
}
