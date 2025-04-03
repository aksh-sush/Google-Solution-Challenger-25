package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.s;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzwc  reason: invalid package */
public final class zzwc implements zzui {
    private final String zza = s.g("phone");
    private final String zzb;
    private final String zzc;
    private final String zzd;

    zzwc(String str, String str2, String str3, String str4, String str5, String str6) {
        this.zzb = s.g(str2);
        this.zzc = str3;
        this.zzd = str4;
    }

    public static zzwc zzb(String str, String str2, String str3) {
        s.g(str3);
        s.g(str2);
        return new zzwc("phone", str, str2, str3, (String) null, (String) null);
    }

    public final String zza() {
        JSONObject jSONObject = new JSONObject();
        this.zza.hashCode();
        jSONObject.put("mfaProvider", 1);
        jSONObject.put("mfaPendingCredential", this.zzb);
        JSONObject jSONObject2 = new JSONObject();
        String str = this.zzc;
        if (str != null) {
            jSONObject2.put("sessionInfo", str);
        }
        String str2 = this.zzd;
        if (str2 != null) {
            jSONObject2.put("code", str2);
        }
        jSONObject.put("phoneVerificationInfo", jSONObject2);
        return jSONObject.toString();
    }
}
