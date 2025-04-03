package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.s;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzwg  reason: invalid package */
public final class zzwg implements zzui {
    private final String zza;

    public zzwg(String str) {
        this.zza = s.g(str);
    }

    public final String zza() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("idToken", this.zza);
        return jSONObject.toString();
    }
}
