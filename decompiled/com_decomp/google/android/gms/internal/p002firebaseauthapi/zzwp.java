package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzwp  reason: invalid package */
public final class zzwp implements zzuj<zzwp> {
    private static final String zza = "zzwp";
    private List<String> zzb;

    public final /* bridge */ /* synthetic */ zzuj zza(String str) {
        zzb(str);
        return this;
    }

    public final zzwp zzb(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.zzb = new ArrayList();
            JSONArray optJSONArray = jSONObject.optJSONArray("authorizedDomains");
            if (optJSONArray != null) {
                for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
                    this.zzb.add(optJSONArray.getString(i10));
                }
            }
            return this;
        } catch (JSONException e10) {
            throw zzyc.zza(e10, zza, str);
        }
    }

    public final List<String> zzc() {
        return this.zzb;
    }
}
