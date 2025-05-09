package com.google.android.gms.internal.p002firebaseauthapi;

import android.text.TextUtils;
import com.google.android.gms.common.internal.s;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzxk  reason: invalid package */
public final class zzxk implements zzui {
    private final String zza;
    private final String zzb = s.g("phone");
    private final String zzc;
    private final String zzd;
    private final String zze;
    private final String zzf;
    private zzvs zzg;

    private zzxk(String str, String str2, String str3, String str4, String str5, String str6) {
        this.zza = s.g(str);
        this.zzc = str3;
        this.zzd = str4;
        this.zze = str5;
        this.zzf = str6;
    }

    public static zzxk zzb(String str, String str2, String str3, String str4, String str5) {
        s.g(str2);
        return new zzxk(str, "phone", str2, str3, str4, str5);
    }

    public final String zza() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("idToken", this.zza);
        this.zzb.hashCode();
        jSONObject.put("mfaProvider", 1);
        if (this.zzc != null) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("phoneNumber", this.zzc);
            if (!TextUtils.isEmpty(this.zze)) {
                jSONObject2.put("recaptchaToken", this.zze);
            }
            if (!TextUtils.isEmpty(this.zzf)) {
                jSONObject2.put("safetyNetToken", this.zzf);
            }
            zzvs zzvs = this.zzg;
            if (zzvs != null) {
                jSONObject2.put("autoRetrievalInfo", zzvs.zza());
            }
            jSONObject.put("phoneEnrollmentInfo", jSONObject2);
        }
        return jSONObject.toString();
    }

    public final String zzc() {
        return this.zzd;
    }

    public final void zzd(zzvs zzvs) {
        this.zzg = zzvs;
    }
}
