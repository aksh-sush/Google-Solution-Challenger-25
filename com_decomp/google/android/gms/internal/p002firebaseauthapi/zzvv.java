package com.google.android.gms.internal.p002firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import s3.a;
import s3.c;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzvv  reason: invalid package */
public final class zzvv extends a implements zzuj<zzvv> {
    public static final Parcelable.Creator<zzvv> CREATOR = new zzvw();
    private static final String zza = "zzvv";
    private String zzb;
    private boolean zzc;
    private String zzd;
    private boolean zze;
    private zzxo zzf;
    private List<String> zzg;

    public zzvv() {
        this.zzf = new zzxo((List<String>) null);
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.D(parcel, 2, this.zzb, false);
        c.g(parcel, 3, this.zzc);
        c.D(parcel, 4, this.zzd, false);
        c.g(parcel, 5, this.zze);
        c.B(parcel, 6, this.zzf, i10, false);
        c.F(parcel, 7, this.zzg, false);
        c.b(parcel, a10);
    }

    public final /* bridge */ /* synthetic */ zzuj zza(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.zzb = jSONObject.optString("authUri", (String) null);
            this.zzc = jSONObject.optBoolean("registered", false);
            this.zzd = jSONObject.optString("providerId", (String) null);
            this.zze = jSONObject.optBoolean("forExistingProvider", false);
            if (!jSONObject.has("allProviders")) {
                this.zzf = new zzxo((List<String>) null);
            } else {
                this.zzf = new zzxo(1, zzyc.zzb(jSONObject.optJSONArray("allProviders")));
            }
            this.zzg = zzyc.zzb(jSONObject.optJSONArray("signinMethods"));
            return this;
        } catch (NullPointerException | JSONException e10) {
            throw zzyc.zza(e10, zza, str);
        }
    }

    public final List<String> zzb() {
        return this.zzg;
    }

    public zzvv(String str, boolean z10, String str2, boolean z11, zzxo zzxo, List<String> list) {
        this.zzb = str;
        this.zzc = z10;
        this.zzd = str2;
        this.zze = z11;
        this.zzf = zzxo == null ? new zzxo((List<String>) null) : zzxo.zza(zzxo);
        this.zzg = list;
    }
}
