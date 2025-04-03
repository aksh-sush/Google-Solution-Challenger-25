package com.google.android.gms.internal.p002firebaseauthapi;

import org.json.JSONException;
import org.json.JSONObject;
import y3.p;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzyb  reason: invalid package */
public final class zzyb implements zzuj<zzyb> {
    private static final String zza = "zzyb";
    private String zzb;
    private String zzc;

    public final /* bridge */ /* synthetic */ zzuj zza(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.zzb = p.a(jSONObject.optString("idToken", (String) null));
            this.zzc = p.a(jSONObject.optString("refreshToken", (String) null));
            return this;
        } catch (NullPointerException | JSONException e10) {
            throw zzyc.zza(e10, zza, str);
        }
    }

    public final String zzb() {
        return this.zzb;
    }

    public final String zzc() {
        return this.zzc;
    }
}
