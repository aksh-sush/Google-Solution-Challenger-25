package com.google.firebase.dynamiclinks.internal;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import s3.b;
import s3.c;

public class DynamicLinkDataCreator implements Parcelable.Creator<DynamicLinkData> {
    public static final int CONTENT_DESCRIPTION = 0;

    static void writeToParcel(DynamicLinkData dynamicLinkData, Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.D(parcel, 1, dynamicLinkData.getDynamicLink(), false);
        c.D(parcel, 2, dynamicLinkData.getDeepLink(), false);
        c.t(parcel, 3, dynamicLinkData.getMinVersion());
        c.w(parcel, 4, dynamicLinkData.getClickTimestamp());
        c.j(parcel, 5, dynamicLinkData.getExtensionBundle(), false);
        c.B(parcel, 6, dynamicLinkData.getRedirectUrl(), i10, false);
        c.b(parcel, a10);
    }

    public DynamicLinkData createFromParcel(Parcel parcel) {
        int L = b.L(parcel);
        String str = null;
        String str2 = null;
        Bundle bundle = null;
        Uri uri = null;
        long j10 = 0;
        int i10 = 0;
        while (parcel.dataPosition() < L) {
            int C = b.C(parcel);
            switch (b.v(C)) {
                case 1:
                    str = b.p(parcel, C);
                    break;
                case 2:
                    str2 = b.p(parcel, C);
                    break;
                case 3:
                    i10 = b.E(parcel, C);
                    break;
                case 4:
                    j10 = b.G(parcel, C);
                    break;
                case 5:
                    bundle = b.f(parcel, C);
                    break;
                case 6:
                    uri = (Uri) b.o(parcel, C, Uri.CREATOR);
                    break;
                default:
                    b.K(parcel, C);
                    break;
            }
        }
        b.u(parcel, L);
        return new DynamicLinkData(str, str2, i10, j10, bundle, uri);
    }

    public DynamicLinkData[] newArray(int i10) {
        return new DynamicLinkData[i10];
    }
}
