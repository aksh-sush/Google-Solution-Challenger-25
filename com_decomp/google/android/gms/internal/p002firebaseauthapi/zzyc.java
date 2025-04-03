package com.google.android.gms.internal.p002firebaseauthapi;

import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzyc  reason: invalid package */
public final class zzyc {
    public static zzpz zza(Exception exc, String str, String str2) {
        String message = exc.getMessage();
        int length = String.valueOf(str).length();
        StringBuilder sb2 = new StringBuilder(length + 47 + String.valueOf(str2).length() + String.valueOf(message).length());
        sb2.append("Failed to parse ");
        sb2.append(str);
        sb2.append(" for string [");
        sb2.append(str2);
        sb2.append("] with exception: ");
        sb2.append(message);
        Log.e(str, sb2.toString());
        StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 30 + String.valueOf(str2).length());
        sb3.append("Failed to parse ");
        sb3.append(str);
        sb3.append(" for string [");
        sb3.append(str2);
        sb3.append("]");
        return new zzpz(sb3.toString(), exc);
    }

    public static List<String> zzb(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        if (!(jSONArray == null || jSONArray.length() == 0)) {
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                arrayList.add(jSONArray.getString(i10));
            }
        }
        return arrayList;
    }
}
