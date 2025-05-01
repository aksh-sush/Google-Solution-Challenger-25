package com.google.firebase.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.s;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.auth.AdditionalUserInfo;
import java.util.Map;
import s3.c;

public final class zzp implements AdditionalUserInfo {
    public static final Parcelable.Creator<zzp> CREATOR = new zzq();
    private final String zza;
    private final String zzb;
    private final Map<String, Object> zzc;
    private final boolean zzd;

    public zzp(String str, String str2, boolean z10) {
        s.g(str);
        s.g(str2);
        this.zza = str;
        this.zzb = str2;
        this.zzc = n.c(str2);
        this.zzd = z10;
    }

    public final int describeContents() {
        return 0;
    }

    public final Map<String, Object> getProfile() {
        return this.zzc;
    }

    public final String getProviderId() {
        return this.zza;
    }

    public final String getUsername() {
        Map<String, Object> map;
        String str;
        if ("github.com".equals(this.zza)) {
            map = this.zzc;
            str = FirebaseAnalytics.Event.LOGIN;
        } else if (!"twitter.com".equals(this.zza)) {
            return null;
        } else {
            map = this.zzc;
            str = FirebaseAnalytics.Param.SCREEN_NAME;
        }
        return (String) map.get(str);
    }

    public final boolean isNewUser() {
        return this.zzd;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.D(parcel, 1, this.zza, false);
        c.D(parcel, 2, this.zzb, false);
        c.g(parcel, 3, this.zzd);
        c.b(parcel, a10);
    }

    public zzp(boolean z10) {
        this.zzd = z10;
        this.zzb = null;
        this.zza = null;
        this.zzc = null;
    }
}
