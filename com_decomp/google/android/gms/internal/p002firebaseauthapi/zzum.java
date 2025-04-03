package com.google.android.gms.internal.p002firebaseauthapi;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.common.internal.s;
import java.net.URLConnection;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzum  reason: invalid package */
public final class zzum {
    private final Context zza;
    private zzvc zzb;
    private final String zzc;
    private boolean zzd = false;
    private String zze;

    public zzum(Context context, String str) {
        s.k(context);
        this.zza = context.getApplicationContext();
        this.zzc = String.format("Android/%s/%s", new Object[]{"Fallback", str});
    }

    public final void zza(URLConnection uRLConnection) {
        StringBuilder sb2;
        String str;
        if (this.zzd) {
            String str2 = this.zzc;
            sb2 = new StringBuilder(String.valueOf(str2).length() + 19);
            sb2.append(str2);
            str = "/FirebaseUI-Android";
        } else {
            String str3 = this.zzc;
            sb2 = new StringBuilder(String.valueOf(str3).length() + 21);
            sb2.append(str3);
            str = "/FirebaseCore-Android";
        }
        sb2.append(str);
        String sb3 = sb2.toString();
        if (this.zzb == null) {
            Context context = this.zza;
            this.zzb = new zzvc(context, context.getPackageName());
        }
        uRLConnection.setRequestProperty("X-Android-Package", this.zzb.zzb());
        uRLConnection.setRequestProperty("X-Android-Cert", this.zzb.zza());
        uRLConnection.setRequestProperty("Accept-Language", zzun.zza());
        uRLConnection.setRequestProperty("X-Client-Version", sb3);
        uRLConnection.setRequestProperty("X-Firebase-Locale", this.zze);
        this.zze = null;
    }

    public final void zzb(String str) {
        this.zzd = !TextUtils.isEmpty(str);
    }

    public final void zzc(String str) {
        this.zze = str;
    }
}
