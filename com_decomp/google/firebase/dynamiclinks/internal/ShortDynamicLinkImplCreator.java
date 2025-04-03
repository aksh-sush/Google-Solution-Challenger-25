package com.google.firebase.dynamiclinks.internal;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.dynamiclinks.internal.ShortDynamicLinkImpl;
import java.util.ArrayList;
import s3.b;
import s3.c;

public class ShortDynamicLinkImplCreator implements Parcelable.Creator<ShortDynamicLinkImpl> {
    public static final int CONTENT_DESCRIPTION = 0;

    static void writeToParcel(ShortDynamicLinkImpl shortDynamicLinkImpl, Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.B(parcel, 1, shortDynamicLinkImpl.getShortLink(), i10, false);
        c.B(parcel, 2, shortDynamicLinkImpl.getPreviewLink(), i10, false);
        c.H(parcel, 3, shortDynamicLinkImpl.getWarnings(), false);
        c.b(parcel, a10);
    }

    public ShortDynamicLinkImpl createFromParcel(Parcel parcel) {
        int L = b.L(parcel);
        Uri uri = null;
        Uri uri2 = null;
        ArrayList arrayList = null;
        while (parcel.dataPosition() < L) {
            int C = b.C(parcel);
            int v10 = b.v(C);
            if (v10 == 1) {
                uri = (Uri) b.o(parcel, C, Uri.CREATOR);
            } else if (v10 == 2) {
                uri2 = (Uri) b.o(parcel, C, Uri.CREATOR);
            } else if (v10 != 3) {
                b.K(parcel, C);
            } else {
                arrayList = b.t(parcel, C, ShortDynamicLinkImpl.WarningImpl.CREATOR);
            }
        }
        b.u(parcel, L);
        return new ShortDynamicLinkImpl(uri, uri2, arrayList);
    }

    public ShortDynamicLinkImpl[] newArray(int i10) {
        return new ShortDynamicLinkImpl[i10];
    }
}
