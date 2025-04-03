package com.google.android.gms.internal.p002firebaseauthapi;

import android.text.TextUtils;
import android.util.Log;
import com.google.firebase.messaging.Constants;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzvt  reason: invalid package */
public final class zzvt implements zzuj<zzvt> {
    private static final String zza = "com.google.android.gms.internal.firebase-auth-api.zzvt";
    private String zzb;

    public final /* bridge */ /* synthetic */ zzuj zza(String str) {
        zzb(str);
        return this;
    }

    public final zzvt zzb(String str) {
        try {
            JSONObject jSONObject = new JSONObject(new JSONObject(str).getString(Constants.IPC_BUNDLE_KEY_SEND_ERROR));
            jSONObject.getInt("code");
            this.zzb = jSONObject.getString("message");
            return this;
        } catch (NullPointerException | JSONException e10) {
            String str2 = zza;
            String message = e10.getMessage();
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 52 + String.valueOf(message).length());
            sb2.append("Failed to parse error for string [");
            sb2.append(str);
            sb2.append("] with exception: ");
            sb2.append(message);
            Log.e(str2, sb2.toString());
            StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 35);
            sb3.append("Failed to parse error for string [");
            sb3.append(str);
            sb3.append("]");
            throw new zzpz(sb3.toString(), e10);
        }
    }

    public final String zzc() {
        return this.zzb;
    }

    public final boolean zzd() {
        return !TextUtils.isEmpty(this.zzb);
    }
}
