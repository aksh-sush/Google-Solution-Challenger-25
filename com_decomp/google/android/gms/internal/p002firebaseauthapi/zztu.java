package com.google.android.gms.internal.p002firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zztu  reason: invalid package */
public class zztu {
    final String zza;
    final zzum zzb;

    public zztu(String str, zzum zzum) {
        this.zza = str;
        this.zzb = zzum;
    }

    /* access modifiers changed from: package-private */
    public final String zza(String str, String str2) {
        String str3 = this.zza;
        int length = String.valueOf(str3).length();
        StringBuilder sb2 = new StringBuilder(length + 5 + str.length() + String.valueOf(str2).length());
        sb2.append(str3);
        sb2.append(str);
        sb2.append("?key=");
        sb2.append(str2);
        return sb2.toString();
    }
}
