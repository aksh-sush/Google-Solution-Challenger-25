package com.google.firebase.auth.internal;

import android.content.Intent;
import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.s;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import s3.e;

public final class zzbl {
    static final Map<String, String> zza;

    static {
        HashMap hashMap = new HashMap();
        zza = hashMap;
        hashMap.put("auth/invalid-provider-id", "INVALID_PROVIDER_ID");
        hashMap.put("auth/invalid-cert-hash", "INVALID_CERT_HASH");
        hashMap.put("auth/network-request-failed", "WEB_NETWORK_REQUEST_FAILED");
        hashMap.put("auth/web-storage-unsupported", "WEB_STORAGE_UNSUPPORTED");
        hashMap.put("auth/operation-not-allowed", "OPERATION_NOT_ALLOWED");
    }

    public static Status zza(Intent intent) {
        s.k(intent);
        s.a(zzd(intent));
        return (Status) e.b(intent, "com.google.firebase.auth.internal.STATUS", Status.CREATOR);
    }

    public static Status zzb(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString("code");
            String string2 = jSONObject.getString("message");
            if (!TextUtils.isEmpty(string) && !TextUtils.isEmpty(string2)) {
                Map<String, String> map = zza;
                if (map.containsKey(string)) {
                    String str2 = map.get(string);
                    StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 1 + String.valueOf(string2).length());
                    sb2.append(str2);
                    sb2.append(":");
                    sb2.append(string2);
                    return zzai.zza(sb2.toString());
                }
            }
            String valueOf = String.valueOf(str);
            return zzai.zza(valueOf.length() != 0 ? "WEB_INTERNAL_ERROR:".concat(valueOf) : new String("WEB_INTERNAL_ERROR:"));
        } catch (JSONException e10) {
            String localizedMessage = e10.getLocalizedMessage();
            StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 23 + String.valueOf(localizedMessage).length());
            sb3.append("WEB_INTERNAL_ERROR:");
            sb3.append(str);
            sb3.append("[ ");
            sb3.append(localizedMessage);
            sb3.append(" ]");
            return zzai.zza(sb3.toString());
        }
    }

    public static void zzc(Intent intent, Status status) {
        e.e(status, intent, "com.google.firebase.auth.internal.STATUS");
    }

    public static boolean zzd(Intent intent) {
        s.k(intent);
        return intent.hasExtra("com.google.firebase.auth.internal.STATUS");
    }
}
