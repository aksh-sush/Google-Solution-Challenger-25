package com.google.android.gms.internal.p002firebaseauthapi;

import android.text.TextUtils;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import y3.p;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzxx  reason: invalid package */
public final class zzxx implements zzuj<zzxx> {
    private static final String zza = "zzxx";
    private String zzb;
    private String zzc;
    private String zzd;
    private String zze;
    private String zzf;
    private String zzg;
    private long zzh;
    private List<zzwu> zzi;
    private String zzj;

    public final /* bridge */ /* synthetic */ zzuj zza(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.zzb = p.a(jSONObject.optString("localId", (String) null));
            this.zzc = p.a(jSONObject.optString("email", (String) null));
            this.zzd = p.a(jSONObject.optString("displayName", (String) null));
            this.zze = p.a(jSONObject.optString("idToken", (String) null));
            this.zzf = p.a(jSONObject.optString("photoUrl", (String) null));
            this.zzg = p.a(jSONObject.optString("refreshToken", (String) null));
            this.zzh = jSONObject.optLong("expiresIn", 0);
            this.zzi = zzwu.zzf(jSONObject.optJSONArray("mfaInfo"));
            this.zzj = jSONObject.optString("mfaPendingCredential", (String) null);
            return this;
        } catch (NullPointerException | JSONException e10) {
            throw zzyc.zza(e10, zza, str);
        }
    }

    public final long zzb() {
        return this.zzh;
    }

    public final String zzc() {
        return this.zze;
    }

    public final String zzd() {
        return this.zzj;
    }

    public final String zze() {
        return this.zzg;
    }

    public final List<zzwu> zzf() {
        return this.zzi;
    }

    public final boolean zzg() {
        return !TextUtils.isEmpty(this.zzj);
    }
}
