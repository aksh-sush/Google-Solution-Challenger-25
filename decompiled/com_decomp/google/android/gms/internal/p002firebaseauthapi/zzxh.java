package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import y3.p;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzxh  reason: invalid package */
public final class zzxh implements zzuj<zzxh> {
    private static final String zza = "zzxh";
    private String zzb;
    private String zzc;
    private Boolean zzd;
    private String zze;
    private String zzf;
    private zzwy zzg;
    private String zzh;
    private String zzi;
    private long zzj;

    public final /* bridge */ /* synthetic */ zzuj zza(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.zzb = p.a(jSONObject.optString("email", (String) null));
            this.zzc = p.a(jSONObject.optString("passwordHash", (String) null));
            this.zzd = Boolean.valueOf(jSONObject.optBoolean("emailVerified", false));
            this.zze = p.a(jSONObject.optString("displayName", (String) null));
            this.zzf = p.a(jSONObject.optString("photoUrl", (String) null));
            this.zzg = zzwy.zza(jSONObject.optJSONArray("providerUserInfo"));
            this.zzh = p.a(jSONObject.optString("idToken", (String) null));
            this.zzi = p.a(jSONObject.optString("refreshToken", (String) null));
            this.zzj = jSONObject.optLong("expiresIn", 0);
            return this;
        } catch (NullPointerException | JSONException e10) {
            throw zzyc.zza(e10, zza, str);
        }
    }

    public final long zzb() {
        return this.zzj;
    }

    public final String zzc() {
        return this.zzb;
    }

    public final String zzd() {
        return this.zzh;
    }

    public final String zze() {
        return this.zzi;
    }

    public final List<zzww> zzf() {
        zzwy zzwy = this.zzg;
        if (zzwy != null) {
            return zzwy.zzc();
        }
        return null;
    }
}
