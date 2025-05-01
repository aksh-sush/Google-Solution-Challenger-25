package com.google.android.gms.internal.p002firebaseauthapi;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.o;
import java.util.List;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzuk  reason: invalid package */
public final class zzuk {
    private final int zza;

    public zzuk(String str) {
        int i10 = -1;
        try {
            List<String> zzd = zzae.zzc("[.-]").zzd(str);
            if (zzd.size() == 1) {
                i10 = Integer.parseInt(str);
            } else if (zzd.size() >= 3) {
                i10 = (Integer.parseInt(zzd.get(0)) * 1000000) + (Integer.parseInt(zzd.get(1)) * 1000) + Integer.parseInt(zzd.get(2));
            }
        } catch (IllegalArgumentException e10) {
            if (Log.isLoggable("LibraryVersionContainer", 3)) {
                Log.d("LibraryVersionContainer", String.format("Version code parsing failed for: %s with exception %s.", new Object[]{str, e10}));
            }
        }
        this.zza = i10;
    }

    public static zzuk zza() {
        return new zzuk(zzc());
    }

    static String zzc() {
        String b10 = o.a().b("firebase-auth");
        return (TextUtils.isEmpty(b10) || b10.equals("UNKNOWN")) ? "-1" : b10;
    }

    public final String zzb() {
        return String.format("X%s", new Object[]{Integer.toString(this.zza)});
    }
}
