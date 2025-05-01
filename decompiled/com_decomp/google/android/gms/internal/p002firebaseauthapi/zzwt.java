package com.google.android.gms.internal.p002firebaseauthapi;

import android.util.Log;
import java.io.UnsupportedEncodingException;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzwt  reason: invalid package */
public final class zzwt {
    private String zza;
    private String zzb;
    private String zzc;
    private Long zzd;
    private Long zze;

    public static zzwt zza(String str) {
        try {
            zzwt zzwt = new zzwt();
            JSONObject jSONObject = new JSONObject(str);
            zzwt.zza = jSONObject.optString("iss");
            zzwt.zzb = jSONObject.optString("aud");
            zzwt.zzc = jSONObject.optString("sub");
            zzwt.zzd = Long.valueOf(jSONObject.optLong("iat"));
            zzwt.zze = Long.valueOf(jSONObject.optLong("exp"));
            jSONObject.optBoolean("is_anonymous");
            return zzwt;
        } catch (JSONException e10) {
            if (Log.isLoggable("JwtToken", 3)) {
                String valueOf = String.valueOf(e10);
                StringBuilder sb2 = new StringBuilder(valueOf.length() + 41);
                sb2.append("Failed to read JwtToken from JSONObject. ");
                sb2.append(valueOf);
                Log.d("JwtToken", sb2.toString());
            }
            String valueOf2 = String.valueOf(e10);
            StringBuilder sb3 = new StringBuilder(valueOf2.length() + 41);
            sb3.append("Failed to read JwtToken from JSONObject. ");
            sb3.append(valueOf2);
            throw new UnsupportedEncodingException(sb3.toString());
        }
    }

    public final Long zzb() {
        return this.zze;
    }

    public final Long zzc() {
        return this.zzd;
    }
}
