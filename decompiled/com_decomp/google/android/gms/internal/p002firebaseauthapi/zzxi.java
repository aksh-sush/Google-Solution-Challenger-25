package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.s;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzxi  reason: invalid package */
public final class zzxi implements zzui {
    private String zza;
    private String zzb;
    private final String zzc;

    public zzxi(String str) {
        this.zzc = str;
    }

    public final String zza() {
        JSONObject jSONObject = new JSONObject();
        String str = this.zza;
        if (str != null) {
            jSONObject.put("email", str);
        }
        String str2 = this.zzb;
        if (str2 != null) {
            jSONObject.put("password", str2);
        }
        String str3 = this.zzc;
        if (str3 != null) {
            jSONObject.put("tenantId", str3);
        }
        return jSONObject.toString();
    }

    public zzxi(String str, String str2, String str3, String str4) {
        this.zza = s.g(str);
        this.zzb = s.g(str2);
        this.zzc = str4;
    }
}
