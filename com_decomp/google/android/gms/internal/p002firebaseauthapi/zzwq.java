package com.google.android.gms.internal.p002firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.internal.s;
import org.json.JSONException;
import org.json.JSONObject;
import s3.a;
import s3.c;
import y3.h;
import y3.p;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzwq  reason: invalid package */
public final class zzwq extends a implements zzuj<zzwq> {
    public static final Parcelable.Creator<zzwq> CREATOR = new zzwr();
    private static final String zza = "zzwq";
    private String zzb;
    private String zzc;
    private Long zzd;
    private String zze;
    private Long zzf;

    public zzwq() {
        this.zzf = Long.valueOf(System.currentTimeMillis());
    }

    public static zzwq zzd(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            zzwq zzwq = new zzwq();
            zzwq.zzb = jSONObject.optString("refresh_token", (String) null);
            zzwq.zzc = jSONObject.optString("access_token", (String) null);
            zzwq.zzd = Long.valueOf(jSONObject.optLong("expires_in"));
            zzwq.zze = jSONObject.optString("token_type", (String) null);
            zzwq.zzf = Long.valueOf(jSONObject.optLong("issued_at"));
            return zzwq;
        } catch (JSONException e10) {
            Log.d(zza, "Failed to read GetTokenResponse from JSONObject");
            throw new zzll(e10);
        }
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.D(parcel, 2, this.zzb, false);
        c.D(parcel, 3, this.zzc, false);
        c.y(parcel, 4, Long.valueOf(zzb()), false);
        c.D(parcel, 5, this.zze, false);
        c.y(parcel, 6, Long.valueOf(this.zzf.longValue()), false);
        c.b(parcel, a10);
    }

    public final /* bridge */ /* synthetic */ zzuj zza(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.zzb = p.a(jSONObject.optString("refresh_token"));
            this.zzc = p.a(jSONObject.optString("access_token"));
            this.zzd = Long.valueOf(jSONObject.optLong("expires_in", 0));
            this.zze = p.a(jSONObject.optString("token_type"));
            this.zzf = Long.valueOf(System.currentTimeMillis());
            return this;
        } catch (NullPointerException | JSONException e10) {
            throw zzyc.zza(e10, zza, str);
        }
    }

    public final long zzb() {
        Long l10 = this.zzd;
        if (l10 == null) {
            return 0;
        }
        return l10.longValue();
    }

    public final long zzc() {
        return this.zzf.longValue();
    }

    public final String zze() {
        return this.zzc;
    }

    public final String zzf() {
        return this.zzb;
    }

    public final String zzg() {
        return this.zze;
    }

    public final String zzh() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("refresh_token", this.zzb);
            jSONObject.put("access_token", this.zzc);
            jSONObject.put("expires_in", this.zzd);
            jSONObject.put("token_type", this.zze);
            jSONObject.put("issued_at", this.zzf);
            return jSONObject.toString();
        } catch (JSONException e10) {
            Log.d(zza, "Failed to convert GetTokenResponse to JSON");
            throw new zzll(e10);
        }
    }

    public final void zzi(String str) {
        this.zzb = s.g(str);
    }

    public final boolean zzj() {
        return h.c().currentTimeMillis() + 300000 < this.zzf.longValue() + (this.zzd.longValue() * 1000);
    }

    public zzwq(String str, String str2, Long l10, String str3) {
        this(str, str2, l10, str3, Long.valueOf(System.currentTimeMillis()));
    }

    zzwq(String str, String str2, Long l10, String str3, Long l11) {
        this.zzb = str;
        this.zzc = str2;
        this.zzd = l10;
        this.zze = str3;
        this.zzf = l11;
    }
}
