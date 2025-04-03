package com.google.android.gms.internal.p002firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import s3.a;
import s3.c;
import y3.p;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzwy  reason: invalid package */
public final class zzwy extends a {
    public static final Parcelable.Creator<zzwy> CREATOR = new zzwz();
    private final List<zzww> zza;

    public zzwy() {
        this.zza = new ArrayList();
    }

    public static zzwy zza(JSONArray jSONArray) {
        zzww zzww;
        if (jSONArray == null || jSONArray.length() == 0) {
            return new zzwy(new ArrayList());
        }
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i10);
            if (jSONObject == null) {
                zzww = new zzww();
            } else {
                zzww = new zzww(p.a(jSONObject.optString("federatedId", (String) null)), p.a(jSONObject.optString("displayName", (String) null)), p.a(jSONObject.optString("photoUrl", (String) null)), p.a(jSONObject.optString("providerId", (String) null)), (String) null, p.a(jSONObject.optString("phoneNumber", (String) null)), p.a(jSONObject.optString("email", (String) null)));
            }
            arrayList.add(zzww);
        }
        return new zzwy(arrayList);
    }

    public static zzwy zzb(zzwy zzwy) {
        List<zzww> list = zzwy.zza;
        zzwy zzwy2 = new zzwy();
        if (list != null) {
            zzwy2.zza.addAll(list);
        }
        return zzwy2;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.H(parcel, 2, this.zza, false);
        c.b(parcel, a10);
    }

    public final List<zzww> zzc() {
        return this.zza;
    }

    zzwy(List<zzww> list) {
        this.zza = (list == null || list.isEmpty()) ? Collections.emptyList() : Collections.unmodifiableList(list);
    }
}
