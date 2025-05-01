package com.google.android.gms.internal.p002firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.s;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import s3.a;
import s3.c;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzwu  reason: invalid package */
public final class zzwu extends a {
    public static final Parcelable.Creator<zzwu> CREATOR = new zzwv();
    private final String zza;
    private final String zzb;
    private final String zzc;
    private final long zzd;
    private String zze;

    public zzwu(String str, String str2, String str3, long j10) {
        this.zza = str;
        this.zzb = s.g(str2);
        this.zzc = str3;
        this.zzd = j10;
    }

    public static zzwu zzb(JSONObject jSONObject) {
        JSONObject optJSONObject;
        String optString = jSONObject.optString("phoneInfo", (String) null);
        String optString2 = jSONObject.optString("mfaEnrollmentId", (String) null);
        String optString3 = jSONObject.optString("displayName", (String) null);
        long j10 = 0;
        if (jSONObject.has("enrolledAt") && (optJSONObject = jSONObject.optJSONObject("enrolledAt")) != null && optJSONObject.has("seconds")) {
            j10 = optJSONObject.optLong("seconds", 0);
        }
        zzwu zzwu = new zzwu(optString, optString2, optString3, j10);
        zzwu.zze = jSONObject.optString("unobfuscatedPhoneInfo");
        return zzwu;
    }

    public static List<zzwu> zzf(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() == 0) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            arrayList.add(zzb(jSONArray.getJSONObject(i10)));
        }
        return arrayList;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.D(parcel, 1, this.zza, false);
        c.D(parcel, 2, this.zzb, false);
        c.D(parcel, 3, this.zzc, false);
        c.w(parcel, 4, this.zzd);
        c.b(parcel, a10);
    }

    public final long zza() {
        return this.zzd;
    }

    public final String zzc() {
        return this.zzc;
    }

    public final String zzd() {
        return this.zzb;
    }

    public final String zze() {
        return this.zza;
    }
}
