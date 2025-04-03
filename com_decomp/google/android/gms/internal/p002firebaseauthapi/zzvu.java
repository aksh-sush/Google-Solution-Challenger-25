package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.s;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzvu  reason: invalid package */
public final class zzvu implements zzui {
    private final String zza;
    private final String zzb = "http://localhost";
    private final String zzc;

    public zzvu(String str, String str2) {
        this.zza = s.g(str);
        this.zzc = str2;
    }

    public final String zza() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("identifier", this.zza);
        jSONObject.put("continueUri", this.zzb);
        String str = this.zzc;
        if (str != null) {
            jSONObject.put("tenantId", str);
        }
        return jSONObject.toString();
    }
}
