package com.google.firebase.messaging;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import s3.b;
import s3.c;

public class RemoteMessageCreator implements Parcelable.Creator<RemoteMessage> {
    public static final int CONTENT_DESCRIPTION = 0;

    static void writeToParcel(RemoteMessage remoteMessage, Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.j(parcel, 2, remoteMessage.bundle, false);
        c.b(parcel, a10);
    }

    public RemoteMessage createFromParcel(Parcel parcel) {
        int L = b.L(parcel);
        Bundle bundle = null;
        while (parcel.dataPosition() < L) {
            int C = b.C(parcel);
            if (b.v(C) != 2) {
                b.K(parcel, C);
            } else {
                bundle = b.f(parcel, C);
            }
        }
        b.u(parcel, L);
        return new RemoteMessage(bundle);
    }

    public RemoteMessage[] newArray(int i10) {
        return new RemoteMessage[i10];
    }
}
