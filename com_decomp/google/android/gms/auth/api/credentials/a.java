package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.credentials.CredentialPickerConfig;
import com.google.android.gms.common.internal.s;
import s3.c;

public final class a extends s3.a {
    public static final Parcelable.Creator<a> CREATOR = new d();

    /* renamed from: e  reason: collision with root package name */
    final int f5091e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f5092f;

    /* renamed from: g  reason: collision with root package name */
    private final String[] f5093g;

    /* renamed from: h  reason: collision with root package name */
    private final CredentialPickerConfig f5094h;

    /* renamed from: i  reason: collision with root package name */
    private final CredentialPickerConfig f5095i;

    /* renamed from: j  reason: collision with root package name */
    private final boolean f5096j;

    /* renamed from: k  reason: collision with root package name */
    private final String f5097k;

    /* renamed from: l  reason: collision with root package name */
    private final String f5098l;

    /* renamed from: m  reason: collision with root package name */
    private final boolean f5099m;

    a(int i10, boolean z10, String[] strArr, CredentialPickerConfig credentialPickerConfig, CredentialPickerConfig credentialPickerConfig2, boolean z11, String str, String str2, boolean z12) {
        this.f5091e = i10;
        this.f5092f = z10;
        this.f5093g = (String[]) s.k(strArr);
        this.f5094h = credentialPickerConfig == null ? new CredentialPickerConfig.a().a() : credentialPickerConfig;
        this.f5095i = credentialPickerConfig2 == null ? new CredentialPickerConfig.a().a() : credentialPickerConfig2;
        if (i10 < 3) {
            this.f5096j = true;
            this.f5097k = null;
            this.f5098l = null;
        } else {
            this.f5096j = z11;
            this.f5097k = str;
            this.f5098l = str2;
        }
        this.f5099m = z12;
    }

    public String[] U() {
        return this.f5093g;
    }

    public CredentialPickerConfig V() {
        return this.f5095i;
    }

    public CredentialPickerConfig W() {
        return this.f5094h;
    }

    public String X() {
        return this.f5098l;
    }

    public String j0() {
        return this.f5097k;
    }

    public boolean l0() {
        return this.f5096j;
    }

    public boolean m0() {
        return this.f5092f;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.g(parcel, 1, m0());
        c.E(parcel, 2, U(), false);
        c.B(parcel, 3, W(), i10, false);
        c.B(parcel, 4, V(), i10, false);
        c.g(parcel, 5, l0());
        c.D(parcel, 6, j0(), false);
        c.D(parcel, 7, X(), false);
        c.g(parcel, 8, this.f5099m);
        c.t(parcel, 1000, this.f5091e);
        c.b(parcel, a10);
    }
}
