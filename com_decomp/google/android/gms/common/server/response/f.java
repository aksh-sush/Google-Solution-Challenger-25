package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.a;
import java.util.ArrayList;
import java.util.Map;
import s3.a;
import s3.c;

public final class f extends a {
    public static final Parcelable.Creator<f> CREATOR = new j();

    /* renamed from: e  reason: collision with root package name */
    final int f5758e;

    /* renamed from: f  reason: collision with root package name */
    final String f5759f;

    /* renamed from: g  reason: collision with root package name */
    final ArrayList f5760g;

    f(int i10, String str, ArrayList arrayList) {
        this.f5758e = i10;
        this.f5759f = str;
        this.f5760g = arrayList;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.t(parcel, 1, this.f5758e);
        c.D(parcel, 2, this.f5759f, false);
        c.H(parcel, 3, this.f5760g, false);
        c.b(parcel, a10);
    }

    f(String str, Map map) {
        ArrayList arrayList;
        this.f5758e = 1;
        this.f5759f = str;
        if (map == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            for (String str2 : map.keySet()) {
                arrayList.add(new g(str2, (a.C0089a) map.get(str2)));
            }
        }
        this.f5760g = arrayList;
    }
}
