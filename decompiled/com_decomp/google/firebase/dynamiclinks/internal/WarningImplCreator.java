package com.google.firebase.dynamiclinks.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.dynamiclinks.internal.ShortDynamicLinkImpl;
import s3.b;
import s3.c;

public class WarningImplCreator implements Parcelable.Creator<ShortDynamicLinkImpl.WarningImpl> {
    public static final int CONTENT_DESCRIPTION = 0;

    static void writeToParcel(ShortDynamicLinkImpl.WarningImpl warningImpl, Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.D(parcel, 2, warningImpl.getMessage(), false);
        c.b(parcel, a10);
    }

    public ShortDynamicLinkImpl.WarningImpl createFromParcel(Parcel parcel) {
        int L = b.L(parcel);
        String str = null;
        while (parcel.dataPosition() < L) {
            int C = b.C(parcel);
            if (b.v(C) != 2) {
                b.K(parcel, C);
            } else {
                str = b.p(parcel, C);
            }
        }
        b.u(parcel, L);
        return new ShortDynamicLinkImpl.WarningImpl(str);
    }

    public ShortDynamicLinkImpl.WarningImpl[] newArray(int i10) {
        return new ShortDynamicLinkImpl.WarningImpl[i10];
    }
}
