package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import s3.c;

@Deprecated
public final class CredentialPickerConfig extends s3.a implements ReflectedParcelable {
    public static final Parcelable.Creator<CredentialPickerConfig> CREATOR = new c();

    /* renamed from: e  reason: collision with root package name */
    final int f5074e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f5075f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f5076g;

    /* renamed from: h  reason: collision with root package name */
    private final int f5077h;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private boolean f5078a = false;

        /* renamed from: b  reason: collision with root package name */
        private boolean f5079b = true;

        /* renamed from: c  reason: collision with root package name */
        private int f5080c = 1;

        public CredentialPickerConfig a() {
            return new CredentialPickerConfig(2, this.f5078a, this.f5079b, false, this.f5080c);
        }
    }

    CredentialPickerConfig(int i10, boolean z10, boolean z11, boolean z12, int i11) {
        this.f5074e = i10;
        this.f5075f = z10;
        this.f5076g = z11;
        if (i10 < 2) {
            this.f5077h = true == z12 ? 3 : 1;
        } else {
            this.f5077h = i11;
        }
    }

    public boolean U() {
        return this.f5077h == 3;
    }

    public boolean V() {
        return this.f5075f;
    }

    public boolean W() {
        return this.f5076g;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.g(parcel, 1, V());
        c.g(parcel, 2, W());
        c.g(parcel, 3, U());
        c.t(parcel, 4, this.f5077h);
        c.t(parcel, 1000, this.f5074e);
        c.b(parcel, a10);
    }
}
