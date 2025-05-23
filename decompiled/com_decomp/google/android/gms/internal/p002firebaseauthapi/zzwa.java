package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.s;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzwa  reason: invalid package */
public final class zzwa implements zzui {
    private final String zza = s.g("phone");
    private String zzb;
    private final String zzc;
    private final String zzd;
    private final String zze;

    zzwa(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.zzb = s.g(str2);
        this.zzc = str3;
        this.zze = str4;
        this.zzd = str7;
    }

    public static zzwa zzb(String str, String str2, String str3, String str4) {
        s.g(str3);
        s.g(str2);
        return new zzwa("phone", str, str2, str3, (String) null, (String) null, str4);
    }

    public final String zza() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("idToken", this.zzb);
        this.zza.hashCode();
        jSONObject.put("mfaProvider", 1);
        String str = this.zzd;
        if (str != null) {
            jSONObject.put("displayName", str);
        }
        JSONObject jSONObject2 = new JSONObject();
        String str2 = this.zzc;
        if (str2 != null) {
            jSONObject2.put("sessionInfo", str2);
        }
        String str3 = this.zze;
        if (str3 != null) {
            jSONObject2.put("code", str3);
        }
        jSONObject.put("phoneVerificationInfo", jSONObject2);
        return jSONObject.toString();
    }

    public final zzwa zzc(String str) {
        this.zzb = str;
        return this;
    }
}
