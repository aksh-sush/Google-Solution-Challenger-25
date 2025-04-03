package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.s;
import o3.b;
import o3.w;
import s3.a;
import s3.c;

public final class SignInConfiguration extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<SignInConfiguration> CREATOR = new w();

    /* renamed from: e  reason: collision with root package name */
    private final String f5175e;

    /* renamed from: f  reason: collision with root package name */
    private final GoogleSignInOptions f5176f;

    public SignInConfiguration(String str, GoogleSignInOptions googleSignInOptions) {
        this.f5175e = s.g(str);
        this.f5176f = googleSignInOptions;
    }

    public final GoogleSignInOptions U() {
        return this.f5176f;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SignInConfiguration)) {
            return false;
        }
        SignInConfiguration signInConfiguration = (SignInConfiguration) obj;
        if (this.f5175e.equals(signInConfiguration.f5175e)) {
            GoogleSignInOptions googleSignInOptions = this.f5176f;
            GoogleSignInOptions googleSignInOptions2 = signInConfiguration.f5176f;
            if (googleSignInOptions != null) {
                return googleSignInOptions.equals(googleSignInOptions2);
            }
            if (googleSignInOptions2 == null) {
                return true;
            }
        }
    }

    public final int hashCode() {
        return new b().a(this.f5175e).a(this.f5176f).b();
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.D(parcel, 2, this.f5175e, false);
        c.B(parcel, 5, this.f5176f, i10, false);
        c.b(parcel, a10);
    }
}
