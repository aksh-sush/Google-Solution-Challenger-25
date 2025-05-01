package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import o3.a;
import s3.b;

public final class e implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int L = b.L(parcel);
        ArrayList arrayList = null;
        Account account = null;
        String str = null;
        String str2 = null;
        ArrayList arrayList2 = null;
        String str3 = null;
        int i10 = 0;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        while (parcel.dataPosition() < L) {
            int C = b.C(parcel);
            switch (b.v(C)) {
                case 1:
                    i10 = b.E(parcel, C);
                    break;
                case 2:
                    arrayList = b.t(parcel, C, Scope.CREATOR);
                    break;
                case 3:
                    account = (Account) b.o(parcel, C, Account.CREATOR);
                    break;
                case 4:
                    z10 = b.w(parcel, C);
                    break;
                case 5:
                    z11 = b.w(parcel, C);
                    break;
                case 6:
                    z12 = b.w(parcel, C);
                    break;
                case 7:
                    str = b.p(parcel, C);
                    break;
                case 8:
                    str2 = b.p(parcel, C);
                    break;
                case 9:
                    arrayList2 = b.t(parcel, C, a.CREATOR);
                    break;
                case 10:
                    str3 = b.p(parcel, C);
                    break;
                default:
                    b.K(parcel, C);
                    break;
            }
        }
        b.u(parcel, L);
        return new GoogleSignInOptions(i10, arrayList, account, z10, z11, z12, str, str2, arrayList2, str3);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new GoogleSignInOptions[i10];
    }
}
