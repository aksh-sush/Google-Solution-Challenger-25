package com.google.android.gms.internal.p002firebaseauthapi;

import android.text.TextUtils;
import com.google.android.gms.common.internal.s;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzxm  reason: invalid package */
public final class zzxm implements zzui {
    private final String zza = s.g("phone");
    private final String zzb;
    private final String zzc;
    private final String zzd;
    private final String zze;
    private final String zzf;
    private final String zzg;
    private zzvs zzh;

    private zzxm(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.zzb = s.g(str2);
        this.zzc = s.g(str3);
        this.zze = str4;
        this.zzd = str5;
        this.zzf = str6;
        this.zzg = str7;
    }

    public static zzxm zzb(String str, String str2, String str3, String str4, String str5, String str6) {
        s.g(str3);
        return new zzxm("phone", str, str2, str3, str4, str5, str6);
    }

    public final String zza() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("mfaPendingCredential", this.zzb);
        jSONObject.put("mfaEnrollmentId", this.zzc);
        this.zza.hashCode();
        jSONObject.put("mfaProvider", 1);
        if (this.zze != null) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("phoneNumber", this.zze);
            if (!TextUtils.isEmpty(this.zzf)) {
                jSONObject2.put("recaptchaToken", this.zzf);
            }
            if (!TextUtils.isEmpty(this.zzg)) {
                jSONObject2.put("safetyNetToken", this.zzg);
            }
            zzvs zzvs = this.zzh;
            if (zzvs != null) {
                jSONObject2.put("autoRetrievalInfo", zzvs.zza());
            }
            jSONObject.put("phoneSignInInfo", jSONObject2);
        }
        return jSONObject.toString();
    }

    public final String zzc() {
        return this.zzd;
    }

    public final void zzd(zzvs zzvs) {
        this.zzh = zzvs;
    }
}
