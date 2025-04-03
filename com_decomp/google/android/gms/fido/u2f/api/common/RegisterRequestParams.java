package com.google.android.gms.fido.u2f.api.common;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.common.internal.s;
import f4.a;
import f4.d;
import f4.e;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import s3.c;

@Deprecated
public class RegisterRequestParams extends RequestParams {
    public static final Parcelable.Creator<RegisterRequestParams> CREATOR = new a();

    /* renamed from: e  reason: collision with root package name */
    private final Integer f5798e;

    /* renamed from: f  reason: collision with root package name */
    private final Double f5799f;

    /* renamed from: g  reason: collision with root package name */
    private final Uri f5800g;

    /* renamed from: h  reason: collision with root package name */
    private final List f5801h;

    /* renamed from: i  reason: collision with root package name */
    private final List f5802i;

    /* renamed from: j  reason: collision with root package name */
    private final a f5803j;

    /* renamed from: k  reason: collision with root package name */
    private final String f5804k;

    /* renamed from: l  reason: collision with root package name */
    private Set f5805l;

    RegisterRequestParams(Integer num, Double d10, Uri uri, List list, List list2, a aVar, String str) {
        this.f5798e = num;
        this.f5799f = d10;
        this.f5800g = uri;
        boolean z10 = false;
        s.b(list != null && !list.isEmpty(), "empty list of register requests is provided");
        this.f5801h = list;
        this.f5802i = list2;
        this.f5803j = aVar;
        HashSet hashSet = new HashSet();
        if (uri != null) {
            hashSet.add(uri);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            s.b((uri == null && dVar.U() == null) ? false : true, "register request has null appId and no request appId is provided");
            if (dVar.U() != null) {
                hashSet.add(Uri.parse(dVar.U()));
            }
        }
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            e eVar = (e) it2.next();
            s.b((uri == null && eVar.U() == null) ? false : true, "registered key has null appId and no request appId is provided");
            if (eVar.U() != null) {
                hashSet.add(Uri.parse(eVar.U()));
            }
        }
        this.f5805l = hashSet;
        s.b((str == null || str.length() <= 80) ? true : z10, "Display Hint cannot be longer than 80 characters");
        this.f5804k = str;
    }

    public Uri U() {
        return this.f5800g;
    }

    public a V() {
        return this.f5803j;
    }

    public String W() {
        return this.f5804k;
    }

    public List X() {
        return this.f5801h;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0034, code lost:
        r1 = r4.f5802i;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003e, code lost:
        r3 = r5.f5802i;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.google.android.gms.fido.u2f.api.common.RegisterRequestParams
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            com.google.android.gms.fido.u2f.api.common.RegisterRequestParams r5 = (com.google.android.gms.fido.u2f.api.common.RegisterRequestParams) r5
            java.lang.Integer r1 = r4.f5798e
            java.lang.Integer r3 = r5.f5798e
            boolean r1 = com.google.android.gms.common.internal.q.b(r1, r3)
            if (r1 == 0) goto L_0x0067
            java.lang.Double r1 = r4.f5799f
            java.lang.Double r3 = r5.f5799f
            boolean r1 = com.google.android.gms.common.internal.q.b(r1, r3)
            if (r1 == 0) goto L_0x0067
            android.net.Uri r1 = r4.f5800g
            android.net.Uri r3 = r5.f5800g
            boolean r1 = com.google.android.gms.common.internal.q.b(r1, r3)
            if (r1 == 0) goto L_0x0067
            java.util.List r1 = r4.f5801h
            java.util.List r3 = r5.f5801h
            boolean r1 = com.google.android.gms.common.internal.q.b(r1, r3)
            if (r1 == 0) goto L_0x0067
            java.util.List r1 = r4.f5802i
            if (r1 != 0) goto L_0x003c
            java.util.List r3 = r5.f5802i
            if (r3 == 0) goto L_0x0052
        L_0x003c:
            if (r1 == 0) goto L_0x0067
            java.util.List r3 = r5.f5802i
            if (r3 == 0) goto L_0x0067
            boolean r1 = r1.containsAll(r3)
            if (r1 == 0) goto L_0x0067
            java.util.List r1 = r5.f5802i
            java.util.List r3 = r4.f5802i
            boolean r1 = r1.containsAll(r3)
            if (r1 == 0) goto L_0x0067
        L_0x0052:
            f4.a r1 = r4.f5803j
            f4.a r3 = r5.f5803j
            boolean r1 = com.google.android.gms.common.internal.q.b(r1, r3)
            if (r1 == 0) goto L_0x0067
            java.lang.String r1 = r4.f5804k
            java.lang.String r5 = r5.f5804k
            boolean r5 = com.google.android.gms.common.internal.q.b(r1, r5)
            if (r5 == 0) goto L_0x0067
            return r0
        L_0x0067:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.fido.u2f.api.common.RegisterRequestParams.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        return q.c(this.f5798e, this.f5800g, this.f5799f, this.f5801h, this.f5802i, this.f5803j, this.f5804k);
    }

    public List j0() {
        return this.f5802i;
    }

    public Integer l0() {
        return this.f5798e;
    }

    public Double m0() {
        return this.f5799f;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.v(parcel, 2, l0(), false);
        c.o(parcel, 3, m0(), false);
        c.B(parcel, 4, U(), i10, false);
        c.H(parcel, 5, X(), false);
        c.H(parcel, 6, j0(), false);
        c.B(parcel, 7, V(), i10, false);
        c.D(parcel, 8, W(), false);
        c.b(parcel, a10);
    }
}
