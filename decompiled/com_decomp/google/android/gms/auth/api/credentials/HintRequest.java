package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.s;
import s3.a;
import s3.c;

@Deprecated
public final class HintRequest extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<HintRequest> CREATOR = new e();

    /* renamed from: e  reason: collision with root package name */
    final int f5081e;

    /* renamed from: f  reason: collision with root package name */
    private final CredentialPickerConfig f5082f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f5083g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f5084h;

    /* renamed from: i  reason: collision with root package name */
    private final String[] f5085i;

    /* renamed from: j  reason: collision with root package name */
    private final boolean f5086j;

    /* renamed from: k  reason: collision with root package name */
    private final String f5087k;

    /* renamed from: l  reason: collision with root package name */
    private final String f5088l;

    HintRequest(int i10, CredentialPickerConfig credentialPickerConfig, boolean z10, boolean z11, String[] strArr, boolean z12, String str, String str2) {
        this.f5081e = i10;
        this.f5082f = (CredentialPickerConfig) s.k(credentialPickerConfig);
        this.f5083g = z10;
        this.f5084h = z11;
        this.f5085i = (String[]) s.k(strArr);
        if (i10 < 2) {
            this.f5086j = true;
            this.f5087k = null;
            this.f5088l = null;
            return;
        }
        this.f5086j = z12;
        this.f5087k = str;
        this.f5088l = str2;
    }

    public String[] U() {
        return this.f5085i;
    }

    public CredentialPickerConfig V() {
        return this.f5082f;
    }

    public String W() {
        return this.f5088l;
    }

    public String X() {
        return this.f5087k;
    }

    public boolean j0() {
        return this.f5083g;
    }

    public boolean l0() {
        return this.f5086j;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.B(parcel, 1, V(), i10, false);
        c.g(parcel, 2, j0());
        c.g(parcel, 3, this.f5084h);
        c.E(parcel, 4, U(), false);
        c.g(parcel, 5, l0());
        c.D(parcel, 6, X(), false);
        c.D(parcel, 7, W(), false);
        c.t(parcel, 1000, this.f5081e);
        c.b(parcel, a10);
    }
}
