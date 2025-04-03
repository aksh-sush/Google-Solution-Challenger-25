package com.google.android.gms.internal.p002firebaseauthapi;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzdz  reason: invalid package */
public final class zzdz implements zzay {
    private final SharedPreferences.Editor zza;
    private final String zzb = "GenericIdpKeyset";

    public zzdz(Context context, String str, String str2) {
        Context applicationContext = context.getApplicationContext();
        this.zza = (str2 == null ? PreferenceManager.getDefaultSharedPreferences(applicationContext) : applicationContext.getSharedPreferences(str2, 0)).edit();
    }

    public final void zzb(zzho zzho) {
        if (!this.zza.putString(this.zzb, zzky.zza(zzho.zzr())).commit()) {
            throw new IOException("Failed to write to SharedPreferences");
        }
    }

    public final void zzc(zzir zzir) {
        if (!this.zza.putString(this.zzb, zzky.zza(zzir.zzr())).commit()) {
            throw new IOException("Failed to write to SharedPreferences");
        }
    }
}
