package com.google.firebase.auth.internal;

import android.text.TextUtils;
import android.util.Log;
import i4.e;

public final class zzbf {
    private static final String zza = "zzbf";

    private zzbf() {
    }

    public static boolean zza(e.a aVar) {
        String str;
        String str2;
        if (aVar == null || TextUtils.isEmpty(aVar.c())) {
            str = zza;
            str2 = "No SafetyNet AttestationResponse passed.";
        } else {
            zzbe zza2 = zzbe.zza(aVar.c());
            if (zza2 == null) {
                str = zza;
                str2 = "Unable to parse SafetyNet AttestationResponse";
            } else if (!zza2.zzc()) {
                str = zza;
                str2 = "SafetyNet Attestation fails basic integrity.";
            } else if (TextUtils.isEmpty(zza2.zzb())) {
                return true;
            } else {
                String str3 = zza;
                String valueOf = String.valueOf(zza2.zzb());
                Log.e(str3, valueOf.length() != 0 ? "SafetyNet Attestation has advice: \n".concat(valueOf) : new String("SafetyNet Attestation has advice: \n"));
                return false;
            }
        }
        Log.e(str, str2);
        return false;
    }
}
