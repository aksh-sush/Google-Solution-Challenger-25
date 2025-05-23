package com.google.firebase.auth.internal;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.internal.p002firebaseauthapi.zzll;
import com.google.android.gms.internal.p002firebaseauthapi.zzwj;
import com.google.android.gms.internal.p002firebaseauthapi.zzww;
import com.google.firebase.auth.FirebaseAuthProvider;
import com.google.firebase.auth.UserInfo;
import org.json.JSONException;
import org.json.JSONObject;
import s3.a;
import s3.c;

public final class zzt extends a implements UserInfo {
    public static final Parcelable.Creator<zzt> CREATOR = new zzu();
    private final String zza;
    private final String zzb;
    private final String zzc;
    private String zzd;
    private Uri zze;
    private final String zzf;
    private final String zzg;
    private final boolean zzh;
    private final String zzi;

    public zzt(zzwj zzwj, String str) {
        s.k(zzwj);
        s.g(FirebaseAuthProvider.PROVIDER_ID);
        this.zza = s.g(zzwj.zzo());
        this.zzb = FirebaseAuthProvider.PROVIDER_ID;
        this.zzf = zzwj.zzn();
        this.zzc = zzwj.zzm();
        Uri zzc2 = zzwj.zzc();
        if (zzc2 != null) {
            this.zzd = zzc2.toString();
            this.zze = zzc2;
        }
        this.zzh = zzwj.zzs();
        this.zzi = null;
        this.zzg = zzwj.zzp();
    }

    public final String getDisplayName() {
        return this.zzc;
    }

    public final String getEmail() {
        return this.zzf;
    }

    public final String getPhoneNumber() {
        return this.zzg;
    }

    public final Uri getPhotoUrl() {
        if (!TextUtils.isEmpty(this.zzd) && this.zze == null) {
            this.zze = Uri.parse(this.zzd);
        }
        return this.zze;
    }

    public final String getProviderId() {
        return this.zzb;
    }

    public final String getUid() {
        return this.zza;
    }

    public final boolean isEmailVerified() {
        return this.zzh;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.D(parcel, 1, this.zza, false);
        c.D(parcel, 2, this.zzb, false);
        c.D(parcel, 3, this.zzc, false);
        c.D(parcel, 4, this.zzd, false);
        c.D(parcel, 5, this.zzf, false);
        c.D(parcel, 6, this.zzg, false);
        c.g(parcel, 7, this.zzh);
        c.D(parcel, 8, this.zzi, false);
        c.b(parcel, a10);
    }

    public final String zza() {
        return this.zzi;
    }

    public final String zzb() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("userId", this.zza);
            jSONObject.putOpt("providerId", this.zzb);
            jSONObject.putOpt("displayName", this.zzc);
            jSONObject.putOpt("photoUrl", this.zzd);
            jSONObject.putOpt("email", this.zzf);
            jSONObject.putOpt("phoneNumber", this.zzg);
            jSONObject.putOpt("isEmailVerified", Boolean.valueOf(this.zzh));
            jSONObject.putOpt("rawUserInfo", this.zzi);
            return jSONObject.toString();
        } catch (JSONException e10) {
            Log.d("DefaultAuthUserInfo", "Failed to jsonify this object");
            throw new zzll(e10);
        }
    }

    public zzt(zzww zzww) {
        s.k(zzww);
        this.zza = zzww.zzd();
        this.zzb = s.g(zzww.zzf());
        this.zzc = zzww.zzb();
        Uri zza2 = zzww.zza();
        if (zza2 != null) {
            this.zzd = zza2.toString();
            this.zze = zza2;
        }
        this.zzf = zzww.zzc();
        this.zzg = zzww.zze();
        this.zzh = false;
        this.zzi = zzww.zzg();
    }

    public zzt(String str, String str2, String str3, String str4, String str5, String str6, boolean z10, String str7) {
        this.zza = str;
        this.zzb = str2;
        this.zzf = str3;
        this.zzg = str4;
        this.zzc = str5;
        this.zzd = str6;
        if (!TextUtils.isEmpty(str6)) {
            this.zze = Uri.parse(this.zzd);
        }
        this.zzh = z10;
        this.zzi = str7;
    }
}
