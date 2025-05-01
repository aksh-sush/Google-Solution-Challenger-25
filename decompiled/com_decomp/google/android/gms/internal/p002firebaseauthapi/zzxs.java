package com.google.android.gms.internal.p002firebaseauthapi;

import android.text.TextUtils;
import com.google.firebase.auth.zze;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import y3.p;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzxs  reason: invalid package */
public final class zzxs implements zzuj<zzxs> {
    private static final String zza = "zzxs";
    private boolean zzb;
    private String zzc;
    private String zzd;
    private long zze;
    private String zzf;
    private String zzg;
    private String zzh;
    private String zzi;
    private String zzj;
    private String zzk;
    private boolean zzl;
    private String zzm;
    private String zzn;
    private String zzo;
    private String zzp;
    private String zzq;
    private String zzr;
    private List<zzwu> zzs;
    private String zzt;

    public final /* bridge */ /* synthetic */ zzuj zza(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.zzb = jSONObject.optBoolean("needConfirmation", false);
            jSONObject.optBoolean("needEmail", false);
            this.zzc = p.a(jSONObject.optString("idToken", (String) null));
            this.zzd = p.a(jSONObject.optString("refreshToken", (String) null));
            this.zze = jSONObject.optLong("expiresIn", 0);
            this.zzf = p.a(jSONObject.optString("localId", (String) null));
            this.zzg = p.a(jSONObject.optString("email", (String) null));
            this.zzh = p.a(jSONObject.optString("displayName", (String) null));
            this.zzi = p.a(jSONObject.optString("photoUrl", (String) null));
            this.zzj = p.a(jSONObject.optString("providerId", (String) null));
            this.zzk = p.a(jSONObject.optString("rawUserInfo", (String) null));
            this.zzl = jSONObject.optBoolean("isNewUser", false);
            this.zzm = jSONObject.optString("oauthAccessToken", (String) null);
            this.zzn = jSONObject.optString("oauthIdToken", (String) null);
            this.zzp = p.a(jSONObject.optString("errorMessage", (String) null));
            this.zzq = p.a(jSONObject.optString("pendingToken", (String) null));
            this.zzr = p.a(jSONObject.optString("tenantId", (String) null));
            this.zzs = zzwu.zzf(jSONObject.optJSONArray("mfaInfo"));
            this.zzt = p.a(jSONObject.optString("mfaPendingCredential", (String) null));
            this.zzo = p.a(jSONObject.optString("oauthTokenSecret", (String) null));
            return this;
        } catch (NullPointerException | JSONException e10) {
            throw zzyc.zza(e10, zza, str);
        }
    }

    public final long zzb() {
        return this.zze;
    }

    public final zze zzc() {
        if (!TextUtils.isEmpty(this.zzm) || !TextUtils.isEmpty(this.zzn)) {
            return zze.zzc(this.zzj, this.zzn, this.zzm, this.zzq, this.zzo);
        }
        return null;
    }

    public final String zzd() {
        return this.zzg;
    }

    public final String zze() {
        return this.zzp;
    }

    public final String zzf() {
        return this.zzc;
    }

    public final String zzg() {
        return this.zzt;
    }

    public final String zzh() {
        return this.zzj;
    }

    public final String zzi() {
        return this.zzk;
    }

    public final String zzj() {
        return this.zzd;
    }

    public final String zzk() {
        return this.zzr;
    }

    public final List<zzwu> zzl() {
        return this.zzs;
    }

    public final boolean zzm() {
        return !TextUtils.isEmpty(this.zzt);
    }

    public final boolean zzn() {
        return this.zzb;
    }

    public final boolean zzo() {
        return this.zzl;
    }

    public final boolean zzp() {
        return this.zzb || !TextUtils.isEmpty(this.zzp);
    }
}
