package com.google.android.gms.internal.auth;

import android.util.Log;

final class zzcx extends zzdc {
    zzcx(zzcz zzcz, String str, Double d10, boolean z10) {
        super(zzcz, str, d10, true, (zzdb) null);
    }

    /* access modifiers changed from: package-private */
    public final /* bridge */ /* synthetic */ Object zza(Object obj) {
        try {
            return Double.valueOf(Double.parseDouble((String) obj));
        } catch (NumberFormatException unused) {
            String zzc = super.zzc();
            Log.e("PhenotypeFlag", "Invalid double value for " + zzc + ": " + ((String) obj));
            return null;
        }
    }
}
