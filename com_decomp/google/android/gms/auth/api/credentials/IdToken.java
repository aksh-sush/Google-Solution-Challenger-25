package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.common.internal.s;
import j3.b;
import s3.a;
import s3.c;

@Deprecated
public final class IdToken extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<IdToken> CREATOR = new b();

    /* renamed from: e  reason: collision with root package name */
    private final String f5089e;

    /* renamed from: f  reason: collision with root package name */
    private final String f5090f;

    public IdToken(String str, String str2) {
        s.b(!TextUtils.isEmpty(str), "account type string cannot be null or empty");
        s.b(!TextUtils.isEmpty(str2), "id token string cannot be null or empty");
        this.f5089e = str;
        this.f5090f = str2;
    }

    public String U() {
        return this.f5089e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IdToken)) {
            return false;
        }
        IdToken idToken = (IdToken) obj;
        return q.b(this.f5089e, idToken.f5089e) && q.b(this.f5090f, idToken.f5090f);
    }

    public String getIdToken() {
        return this.f5090f;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.D(parcel, 1, U(), false);
        c.D(parcel, 2, getIdToken(), false);
        c.b(parcel, a10);
    }
}
