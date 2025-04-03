package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.s;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzwf  reason: invalid package */
public final class zzwf implements zzui {
    private final String zza = zzwe.REFRESH_TOKEN.toString();
    private final String zzb;

    public zzwf(String str) {
        this.zzb = s.g(str);
    }

    public final String zza() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("grantType", this.zza);
        jSONObject.put("refreshToken", this.zzb);
        return jSONObject.toString();
    }
}
