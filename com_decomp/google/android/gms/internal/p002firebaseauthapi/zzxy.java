package com.google.android.gms.internal.p002firebaseauthapi;

import android.text.TextUtils;
import com.google.android.gms.common.internal.s;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzxy  reason: invalid package */
public final class zzxy implements zzui {
    private String zza;
    private String zzb;
    private String zzc;
    private String zzd;
    private String zze;
    private boolean zzf;

    private zzxy() {
    }

    public static zzxy zzb(String str, String str2, boolean z10) {
        zzxy zzxy = new zzxy();
        zzxy.zzb = s.g(str);
        zzxy.zzc = s.g(str2);
        zzxy.zzf = z10;
        return zzxy;
    }

    public static zzxy zzc(String str, String str2, boolean z10) {
        zzxy zzxy = new zzxy();
        zzxy.zza = s.g(str);
        zzxy.zzd = s.g(str2);
        zzxy.zzf = z10;
        return zzxy;
    }

    public final String zza() {
        String str;
        String str2;
        JSONObject jSONObject = new JSONObject();
        if (!TextUtils.isEmpty(this.zzd)) {
            jSONObject.put("phoneNumber", this.zza);
            str2 = "temporaryProof";
            str = this.zzd;
        } else {
            jSONObject.put("sessionInfo", this.zzb);
            str2 = "code";
            str = this.zzc;
        }
        jSONObject.put(str2, str);
        String str3 = this.zze;
        if (str3 != null) {
            jSONObject.put("idToken", str3);
        }
        if (!this.zzf) {
            jSONObject.put("operation", 2);
        }
        return jSONObject.toString();
    }

    public final void zzd(String str) {
        this.zze = str;
    }
}
