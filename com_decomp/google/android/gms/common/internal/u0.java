package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import s3.a;
import s3.c;

public final class u0 extends a {
    public static final Parcelable.Creator<u0> CREATOR = new v0();

    /* renamed from: e  reason: collision with root package name */
    final int f5710e;

    /* renamed from: f  reason: collision with root package name */
    private final Account f5711f;

    /* renamed from: g  reason: collision with root package name */
    private final int f5712g;

    /* renamed from: h  reason: collision with root package name */
    private final GoogleSignInAccount f5713h;

    u0(int i10, Account account, int i11, GoogleSignInAccount googleSignInAccount) {
        this.f5710e = i10;
        this.f5711f = account;
        this.f5712g = i11;
        this.f5713h = googleSignInAccount;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.t(parcel, 1, this.f5710e);
        c.B(parcel, 2, this.f5711f, i10, false);
        c.t(parcel, 3, this.f5712g);
        c.B(parcel, 4, this.f5713h, i10, false);
        c.b(parcel, a10);
    }

    public u0(Account account, int i10, GoogleSignInAccount googleSignInAccount) {
        this(2, account, i10, googleSignInAccount);
    }
}
