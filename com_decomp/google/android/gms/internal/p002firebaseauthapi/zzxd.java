package com.google.android.gms.internal.p002firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.s;
import org.json.JSONObject;
import s3.a;
import s3.c;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzxd  reason: invalid package */
public final class zzxd extends a implements zzui {
    public static final Parcelable.Creator<zzxd> CREATOR = new zzxe();
    private final String zza;
    private final long zzb;
    private final boolean zzc;
    private final String zzd;
    private final String zze;
    private final String zzf;
    private final boolean zzg;
    private final String zzh;
    private zzvs zzi;

    public zzxd(String str, long j10, boolean z10, String str2, String str3, String str4, boolean z11, String str5) {
        this.zza = s.g(str);
        this.zzb = j10;
        this.zzc = z10;
        this.zzd = str2;
        this.zze = str3;
        this.zzf = str4;
        this.zzg = z11;
        this.zzh = str5;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.D(parcel, 1, this.zza, false);
        c.w(parcel, 2, this.zzb);
        c.g(parcel, 3, this.zzc);
        c.D(parcel, 4, this.zzd, false);
        c.D(parcel, 5, this.zze, false);
        c.D(parcel, 6, this.zzf, false);
        c.g(parcel, 7, this.zzg);
        c.D(parcel, 8, this.zzh, false);
        c.b(parcel, a10);
    }

    public final String zza() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("phoneNumber", this.zza);
        String str = this.zze;
        if (str != null) {
            jSONObject.put("tenantId", str);
        }
        String str2 = this.zzf;
        if (str2 != null) {
            jSONObject.put("recaptchaToken", str2);
        }
        zzvs zzvs = this.zzi;
        if (zzvs != null) {
            jSONObject.put("autoRetrievalInfo", zzvs.zza());
        }
        String str3 = this.zzh;
        if (str3 != null) {
            jSONObject.put("safetyNetToken", str3);
        }
        return jSONObject.toString();
    }

    public final long zzb() {
        return this.zzb;
    }

    public final String zzc() {
        return this.zzd;
    }

    public final String zzd() {
        return this.zza;
    }

    public final void zze(zzvs zzvs) {
        this.zzi = zzvs;
    }

    public final boolean zzf() {
        return this.zzc;
    }

    public final boolean zzg() {
        return this.zzg;
    }
}
