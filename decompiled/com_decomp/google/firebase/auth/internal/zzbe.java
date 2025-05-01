package com.google.firebase.auth.internal;

import android.text.TextUtils;
import java.util.Map;

public final class zzbe {
    private boolean zza;
    private String zzb;

    private zzbe() {
    }

    public static zzbe zza(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Map b10 = n.b(str);
        try {
            zzbe zzbe = new zzbe();
            Object obj = b10.get("basicIntegrity");
            boolean z10 = false;
            if (obj != null && ((Boolean) obj).booleanValue()) {
                z10 = true;
            }
            zzbe.zza = z10;
            String str2 = (String) b10.get("advice");
            if (str2 == null) {
                str2 = "";
            }
            zzbe.zzb = str2;
            return zzbe;
        } catch (ClassCastException unused) {
            return null;
        }
    }

    public final String zzb() {
        return this.zzb;
    }

    public final boolean zzc() {
        return this.zza;
    }
}
