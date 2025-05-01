package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.common.server.response.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import s3.a;
import s3.c;

public final class h extends a {
    public static final Parcelable.Creator<h> CREATOR = new i();

    /* renamed from: e  reason: collision with root package name */
    final int f5764e;

    /* renamed from: f  reason: collision with root package name */
    private final HashMap f5765f;

    /* renamed from: g  reason: collision with root package name */
    private final String f5766g;

    h(int i10, ArrayList arrayList, String str) {
        this.f5764e = i10;
        HashMap hashMap = new HashMap();
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            f fVar = (f) arrayList.get(i11);
            String str2 = fVar.f5759f;
            HashMap hashMap2 = new HashMap();
            int size2 = ((ArrayList) s.k(fVar.f5760g)).size();
            for (int i12 = 0; i12 < size2; i12++) {
                g gVar = (g) fVar.f5760g.get(i12);
                hashMap2.put(gVar.f5762f, gVar.f5763g);
            }
            hashMap.put(str2, hashMap2);
        }
        this.f5765f = hashMap;
        this.f5766g = (String) s.k(str);
        W();
    }

    public final String U() {
        return this.f5766g;
    }

    public final Map V(String str) {
        return (Map) this.f5765f.get(str);
    }

    public final void W() {
        for (String str : this.f5765f.keySet()) {
            Map map = (Map) this.f5765f.get(str);
            for (String str2 : map.keySet()) {
                ((a.C0089a) map.get(str2)).E0(this);
            }
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        for (String str : this.f5765f.keySet()) {
            sb2.append(str);
            sb2.append(":\n");
            Map map = (Map) this.f5765f.get(str);
            for (String str2 : map.keySet()) {
                sb2.append("  ");
                sb2.append(str2);
                sb2.append(": ");
                sb2.append(map.get(str2));
            }
        }
        return sb2.toString();
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.t(parcel, 1, this.f5764e);
        ArrayList arrayList = new ArrayList();
        for (String str : this.f5765f.keySet()) {
            arrayList.add(new f(str, (Map) this.f5765f.get(str)));
        }
        c.H(parcel, 2, arrayList, false);
        c.D(parcel, 3, this.f5766g, false);
        c.b(parcel, a10);
    }
}
