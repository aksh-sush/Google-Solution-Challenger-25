package com.google.android.gms.internal.p002firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import org.json.JSONException;
import org.json.JSONObject;
import s3.a;
import s3.c;
import y3.p;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzxu  reason: invalid package */
public final class zzxu extends a implements zzuj<zzxu> {
    public static final Parcelable.Creator<zzxu> CREATOR = new zzxv();
    private static final String zza = "zzxu";
    private String zzb;
    private String zzc;
    private long zzd;
    private boolean zze;

    public zzxu() {
    }

    zzxu(String str, String str2, long j10, boolean z10) {
        this.zzb = str;
        this.zzc = str2;
        this.zzd = j10;
        this.zze = z10;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.D(parcel, 2, this.zzb, false);
        c.D(parcel, 3, this.zzc, false);
        c.w(parcel, 4, this.zzd);
        c.g(parcel, 5, this.zze);
        c.b(parcel, a10);
    }

    public final /* bridge */ /* synthetic */ zzuj zza(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.zzb = p.a(jSONObject.optString("idToken", (String) null));
            this.zzc = p.a(jSONObject.optString("refreshToken", (String) null));
            this.zzd = jSONObject.optLong("expiresIn", 0);
            this.zze = jSONObject.optBoolean("isNewUser", false);
            return this;
        } catch (NullPointerException | JSONException e10) {
            throw zzyc.zza(e10, zza, str);
        }
    }

    public final long zzb() {
        return this.zzd;
    }

    public final String zzc() {
        return this.zzb;
    }

    public final String zzd() {
        return this.zzc;
    }

    public final boolean zze() {
        return this.zze;
    }
}
