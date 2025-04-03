package com.google.android.gms.internal.p002firebaseauthapi;

import org.json.JSONException;
import org.json.JSONObject;
import y3.p;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzxf  reason: invalid package */
public final class zzxf implements zzuj<zzxf> {
    private static final String zza = "zzxf";
    private String zzb;

    public final /* bridge */ /* synthetic */ zzuj zza(String str) {
        try {
            this.zzb = p.a(new JSONObject(str).optString("sessionInfo", (String) null));
            return this;
        } catch (NullPointerException | JSONException e10) {
            throw zzyc.zza(e10, zza, str);
        }
    }

    public final String zzb() {
        return this.zzb;
    }
}
