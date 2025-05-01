package com.google.android.gms.internal.p002firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.auth.zze;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import s3.a;
import s3.c;
import y3.p;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzwh  reason: invalid package */
public final class zzwh extends a implements zzuj<zzwh> {
    public static final Parcelable.Creator<zzwh> CREATOR = new zzwi();
    private static final String zza = "zzwh";
    private zzwl zzb;

    public zzwh() {
    }

    zzwh(zzwl zzwl) {
        this.zzb = zzwl == null ? new zzwl() : zzwl.zza(zzwl);
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.B(parcel, 2, this.zzb, i10, false);
        c.b(parcel, a10);
    }

    public final /* bridge */ /* synthetic */ zzuj zza(String str) {
        zzwl zzwl;
        int i10;
        zzwj zzwj;
        String str2 = str;
        try {
            JSONObject jSONObject = new JSONObject(str2);
            if (!jSONObject.has("users")) {
                zzwl = new zzwl();
            } else {
                JSONArray optJSONArray = jSONObject.optJSONArray("users");
                Parcelable.Creator<zzwl> creator = zzwl.CREATOR;
                if (optJSONArray != null) {
                    if (optJSONArray.length() != 0) {
                        ArrayList arrayList = new ArrayList(optJSONArray.length());
                        boolean z10 = false;
                        int i11 = 0;
                        while (i11 < optJSONArray.length()) {
                            JSONObject jSONObject2 = optJSONArray.getJSONObject(i11);
                            if (jSONObject2 == null) {
                                zzwj = new zzwj();
                                i10 = i11;
                            } else {
                                String a10 = p.a(jSONObject2.optString("localId", (String) null));
                                String a11 = p.a(jSONObject2.optString("email", (String) null));
                                boolean optBoolean = jSONObject2.optBoolean("emailVerified", z10);
                                String a12 = p.a(jSONObject2.optString("displayName", (String) null));
                                String a13 = p.a(jSONObject2.optString("photoUrl", (String) null));
                                zzwy zza2 = zzwy.zza(jSONObject2.optJSONArray("providerUserInfo"));
                                String a14 = p.a(jSONObject2.optString("rawPassword", (String) null));
                                String a15 = p.a(jSONObject2.optString("phoneNumber", (String) null));
                                i10 = i11;
                                long optLong = jSONObject2.optLong("createdAt", 0);
                                zzwj = new zzwj(a10, a11, optBoolean, a12, a13, zza2, a14, a15, optLong, jSONObject2.optLong("lastLoginAt", 0), false, (zze) null, zzwu.zzf(jSONObject2.optJSONArray("mfaInfo")));
                            }
                            arrayList.add(zzwj);
                            i11 = i10 + 1;
                            z10 = false;
                        }
                        zzwl = new zzwl(arrayList);
                    }
                }
                zzwl = new zzwl(new ArrayList());
            }
            this.zzb = zzwl;
            return this;
        } catch (NullPointerException | JSONException e10) {
            throw zzyc.zza(e10, zza, str2);
        }
    }

    public final List<zzwj> zzb() {
        return this.zzb.zzb();
    }
}
