package com.google.android.gms.fido.u2f.api.common;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.common.internal.s;
import f4.a;
import f4.e;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import s3.c;

@Deprecated
public class SignRequestParams extends RequestParams {
    public static final Parcelable.Creator<SignRequestParams> CREATOR = new b();

    /* renamed from: e  reason: collision with root package name */
    private final Integer f5806e;

    /* renamed from: f  reason: collision with root package name */
    private final Double f5807f;

    /* renamed from: g  reason: collision with root package name */
    private final Uri f5808g;

    /* renamed from: h  reason: collision with root package name */
    private final byte[] f5809h;

    /* renamed from: i  reason: collision with root package name */
    private final List f5810i;

    /* renamed from: j  reason: collision with root package name */
    private final a f5811j;

    /* renamed from: k  reason: collision with root package name */
    private final String f5812k;

    /* renamed from: l  reason: collision with root package name */
    private final Set f5813l;

    SignRequestParams(Integer num, Double d10, Uri uri, byte[] bArr, List list, a aVar, String str) {
        this.f5806e = num;
        this.f5807f = d10;
        this.f5808g = uri;
        this.f5809h = bArr;
        boolean z10 = false;
        s.b(list != null && !list.isEmpty(), "registeredKeys must not be null or empty");
        this.f5810i = list;
        this.f5811j = aVar;
        HashSet hashSet = new HashSet();
        if (uri != null) {
            hashSet.add(uri);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            e eVar = (e) it.next();
            s.b((eVar.U() == null && uri == null) ? false : true, "registered key has null appId and no request appId is provided");
            String V = eVar.V();
            s.b(true, "register request has null challenge and no default challenge isprovided");
            if (eVar.U() != null) {
                hashSet.add(Uri.parse(eVar.U()));
            }
        }
        this.f5813l = hashSet;
        s.b((str == null || str.length() <= 80) ? true : z10, "Display Hint cannot be longer than 80 characters");
        this.f5812k = str;
    }

    public Uri U() {
        return this.f5808g;
    }

    public a V() {
        return this.f5811j;
    }

    public byte[] W() {
        return this.f5809h;
    }

    public String X() {
        return this.f5812k;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SignRequestParams)) {
            return false;
        }
        SignRequestParams signRequestParams = (SignRequestParams) obj;
        return q.b(this.f5806e, signRequestParams.f5806e) && q.b(this.f5807f, signRequestParams.f5807f) && q.b(this.f5808g, signRequestParams.f5808g) && Arrays.equals(this.f5809h, signRequestParams.f5809h) && this.f5810i.containsAll(signRequestParams.f5810i) && signRequestParams.f5810i.containsAll(this.f5810i) && q.b(this.f5811j, signRequestParams.f5811j) && q.b(this.f5812k, signRequestParams.f5812k);
    }

    public int hashCode() {
        return q.c(this.f5806e, this.f5808g, this.f5807f, this.f5810i, this.f5811j, this.f5812k, Integer.valueOf(Arrays.hashCode(this.f5809h)));
    }

    public List j0() {
        return this.f5810i;
    }

    public Integer l0() {
        return this.f5806e;
    }

    public Double m0() {
        return this.f5807f;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.v(parcel, 2, l0(), false);
        c.o(parcel, 3, m0(), false);
        c.B(parcel, 4, U(), i10, false);
        c.k(parcel, 5, W(), false);
        c.H(parcel, 6, j0(), false);
        c.B(parcel, 7, V(), i10, false);
        c.D(parcel, 8, X(), false);
        c.b(parcel, a10);
    }
}
