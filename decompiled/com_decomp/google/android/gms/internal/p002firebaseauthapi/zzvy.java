package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.s;
import com.google.firebase.auth.ActionCodeUrl;
import com.google.firebase.auth.EmailAuthCredential;
import org.json.JSONObject;
import u3.a;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzvy  reason: invalid package */
public final class zzvy implements zzui {
    private static final String zza = "zzvy";
    private static final a zzb = new a(zzvy.class.getSimpleName(), new String[0]);
    private final String zzc;
    private final String zzd;
    private final String zze;

    public zzvy(EmailAuthCredential emailAuthCredential, String str) {
        this.zzc = s.g(emailAuthCredential.zzd());
        this.zzd = s.g(emailAuthCredential.zzf());
        this.zze = str;
    }

    public final String zza() {
        ActionCodeUrl parseLink = ActionCodeUrl.parseLink(this.zzd);
        String str = null;
        String code = parseLink != null ? parseLink.getCode() : null;
        if (parseLink != null) {
            str = parseLink.zza();
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("email", this.zzc);
        if (code != null) {
            jSONObject.put("oobCode", code);
        }
        if (str != null) {
            jSONObject.put("tenantId", str);
        }
        String str2 = this.zze;
        if (str2 != null) {
            jSONObject.put("idToken", str2);
        }
        return jSONObject.toString();
    }
}
