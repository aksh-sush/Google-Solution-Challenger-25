package com.google.android.gms.auth.api.credentials;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.q;
import java.util.List;
import s3.a;
import s3.c;

@Deprecated
public class Credential extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<Credential> CREATOR = new b();

    /* renamed from: e  reason: collision with root package name */
    private final String f5066e;

    /* renamed from: f  reason: collision with root package name */
    private final String f5067f;

    /* renamed from: g  reason: collision with root package name */
    private final Uri f5068g;

    /* renamed from: h  reason: collision with root package name */
    private final List f5069h;

    /* renamed from: i  reason: collision with root package name */
    private final String f5070i;

    /* renamed from: j  reason: collision with root package name */
    private final String f5071j;

    /* renamed from: k  reason: collision with root package name */
    private final String f5072k;

    /* renamed from: l  reason: collision with root package name */
    private final String f5073l;

    /* JADX WARNING: Removed duplicated region for block: B:26:0x007b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    Credential(java.lang.String r4, java.lang.String r5, android.net.Uri r6, java.util.List r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, java.lang.String r11) {
        /*
            r3 = this;
            r3.<init>()
            java.lang.String r0 = "credential identifier cannot be null"
            java.lang.Object r4 = com.google.android.gms.common.internal.s.l(r4, r0)
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r4 = r4.trim()
            java.lang.String r0 = "credential identifier cannot be empty"
            com.google.android.gms.common.internal.s.h(r4, r0)
            if (r8 == 0) goto L_0x0025
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            if (r0 != 0) goto L_0x001d
            goto L_0x0025
        L_0x001d:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "Password must not be empty if set"
            r4.<init>(r5)
            throw r4
        L_0x0025:
            if (r9 == 0) goto L_0x0083
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            if (r0 == 0) goto L_0x0030
        L_0x002d:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            goto L_0x0074
        L_0x0030:
            android.net.Uri r0 = android.net.Uri.parse(r9)
            boolean r1 = r0.isAbsolute()
            if (r1 == 0) goto L_0x002d
            boolean r1 = r0.isHierarchical()
            if (r1 == 0) goto L_0x002d
            java.lang.String r1 = r0.getScheme()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x002d
            java.lang.String r1 = r0.getAuthority()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L_0x0055
            goto L_0x002d
        L_0x0055:
            java.lang.String r1 = r0.getScheme()
            java.lang.String r2 = "http"
            boolean r1 = r2.equalsIgnoreCase(r1)
            r2 = 1
            if (r1 != 0) goto L_0x0070
            java.lang.String r0 = r0.getScheme()
            java.lang.String r1 = "https"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x006f
            goto L_0x0070
        L_0x006f:
            r2 = 0
        L_0x0070:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
        L_0x0074:
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x007b
            goto L_0x0083
        L_0x007b:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "Account type must be a valid Http/Https URI"
            r4.<init>(r5)
            throw r4
        L_0x0083:
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            if (r0 != 0) goto L_0x0098
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            if (r0 == 0) goto L_0x0090
            goto L_0x0098
        L_0x0090:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "Password and AccountType are mutually exclusive"
            r4.<init>(r5)
            throw r4
        L_0x0098:
            if (r5 == 0) goto L_0x00a5
            java.lang.String r0 = r5.trim()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x00a5
            r5 = 0
        L_0x00a5:
            r3.f5067f = r5
            r3.f5068g = r6
            if (r7 != 0) goto L_0x00b0
            java.util.List r5 = java.util.Collections.emptyList()
            goto L_0x00b4
        L_0x00b0:
            java.util.List r5 = java.util.Collections.unmodifiableList(r7)
        L_0x00b4:
            r3.f5069h = r5
            r3.f5066e = r4
            r3.f5070i = r8
            r3.f5071j = r9
            r3.f5072k = r10
            r3.f5073l = r11
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.api.credentials.Credential.<init>(java.lang.String, java.lang.String, android.net.Uri, java.util.List, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }

    public String U() {
        return this.f5071j;
    }

    public String V() {
        return this.f5073l;
    }

    public String W() {
        return this.f5072k;
    }

    public String X() {
        return this.f5066e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Credential)) {
            return false;
        }
        Credential credential = (Credential) obj;
        return TextUtils.equals(this.f5066e, credential.f5066e) && TextUtils.equals(this.f5067f, credential.f5067f) && q.b(this.f5068g, credential.f5068g) && TextUtils.equals(this.f5070i, credential.f5070i) && TextUtils.equals(this.f5071j, credential.f5071j);
    }

    public int hashCode() {
        return q.c(this.f5066e, this.f5067f, this.f5068g, this.f5070i, this.f5071j);
    }

    public List j0() {
        return this.f5069h;
    }

    public String l0() {
        return this.f5067f;
    }

    public String m0() {
        return this.f5070i;
    }

    public Uri w0() {
        return this.f5068g;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.D(parcel, 1, X(), false);
        c.D(parcel, 2, l0(), false);
        c.B(parcel, 3, w0(), i10, false);
        c.H(parcel, 4, j0(), false);
        c.D(parcel, 5, m0(), false);
        c.D(parcel, 6, U(), false);
        c.D(parcel, 9, W(), false);
        c.D(parcel, 10, V(), false);
        c.b(parcel, a10);
    }
}
