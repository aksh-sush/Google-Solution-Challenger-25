package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.s;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzya  reason: invalid package */
public final class zzya implements zzui {
    private final String zza;
    private final String zzb;

    public zzya(String str, String str2) {
        this.zza = s.g(str);
        this.zzb = s.g(str2);
    }

    public final String zza() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("idToken", this.zza);
        jSONObject.put("mfaEnrollmentId", this.zzb);
        return jSONObject.toString();
    }
}
