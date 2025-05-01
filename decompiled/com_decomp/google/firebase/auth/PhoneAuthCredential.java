package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.s;
import s3.c;

public class PhoneAuthCredential extends AuthCredential implements Cloneable {
    public static final Parcelable.Creator<PhoneAuthCredential> CREATOR = new zzac();
    private String zza;
    private String zzb;
    private boolean zzc;
    private String zzd;
    private boolean zze;
    private String zzf;
    private String zzg;

    PhoneAuthCredential(String str, String str2, boolean z10, String str3, boolean z11, String str4, String str5) {
        boolean z12 = true;
        if ((!z10 || TextUtils.isEmpty(str3) || !TextUtils.isEmpty(str5)) && ((!z10 || !TextUtils.isEmpty(str3) || TextUtils.isEmpty(str5)) && ((TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) && (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4))))) {
            z12 = false;
        }
        s.b(z12, "Cannot create PhoneAuthCredential without either verificationProof, sessionInfo, temporary proof, or enrollment ID.");
        this.zza = str;
        this.zzb = str2;
        this.zzc = z10;
        this.zzd = str3;
        this.zze = z11;
        this.zzf = str4;
        this.zzg = str5;
    }

    public static PhoneAuthCredential zzc(String str, String str2) {
        return new PhoneAuthCredential(str, str2, false, (String) null, true, (String) null, (String) null);
    }

    public static PhoneAuthCredential zzd(String str, String str2) {
        return new PhoneAuthCredential((String) null, (String) null, false, str, true, str2, (String) null);
    }

    public String getProvider() {
        return "phone";
    }

    public String getSignInMethod() {
        return "phone";
    }

    public String getSmsCode() {
        return this.zzb;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.D(parcel, 1, this.zza, false);
        c.D(parcel, 2, getSmsCode(), false);
        c.g(parcel, 3, this.zzc);
        c.D(parcel, 4, this.zzd, false);
        c.g(parcel, 5, this.zze);
        c.D(parcel, 6, this.zzf, false);
        c.D(parcel, 7, this.zzg, false);
        c.b(parcel, a10);
    }

    public final AuthCredential zza() {
        return clone();
    }

    /* renamed from: zzb */
    public final PhoneAuthCredential clone() {
        return new PhoneAuthCredential(this.zza, getSmsCode(), this.zzc, this.zzd, this.zze, this.zzf, this.zzg);
    }

    public final PhoneAuthCredential zze(boolean z10) {
        this.zze = false;
        return this;
    }

    public final String zzf() {
        return this.zzd;
    }

    public final String zzg() {
        return this.zza;
    }

    public final String zzh() {
        return this.zzf;
    }

    public final boolean zzi() {
        return this.zze;
    }
}
