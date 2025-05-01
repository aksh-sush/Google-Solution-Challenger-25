package com.google.android.gms.auth.api.signin;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.s;
import s3.a;
import s3.c;

public class SignInAccount extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<SignInAccount> CREATOR = new g();

    /* renamed from: e  reason: collision with root package name */
    final String f5170e;

    /* renamed from: f  reason: collision with root package name */
    private final GoogleSignInAccount f5171f;

    /* renamed from: g  reason: collision with root package name */
    final String f5172g;

    SignInAccount(String str, GoogleSignInAccount googleSignInAccount, String str2) {
        this.f5171f = googleSignInAccount;
        this.f5170e = s.h(str, "8.3 and 8.4 SDKs require non-null email");
        this.f5172g = s.h(str2, "8.3 and 8.4 SDKs require non-null userId");
    }

    public final GoogleSignInAccount U() {
        return this.f5171f;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.D(parcel, 4, this.f5170e, false);
        c.B(parcel, 7, this.f5171f, i10, false);
        c.D(parcel, 8, this.f5172g, false);
        c.b(parcel, a10);
    }
}
