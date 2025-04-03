package com.google.android.gms.internal.measurement;

import android.util.Log;

final class zzhn extends zzhu<Long> {
    zzhn(zzhr zzhr, String str, Long l10, boolean z10) {
        super(zzhr, str, l10, true, (zzht) null);
    }

    /* access modifiers changed from: package-private */
    public final /* bridge */ /* synthetic */ Object zza(Object obj) {
        try {
            return Long.valueOf(Long.parseLong((String) obj));
        } catch (NumberFormatException unused) {
            String zzc = super.zzc();
            String str = (String) obj;
            StringBuilder sb2 = new StringBuilder(String.valueOf(zzc).length() + 25 + str.length());
            sb2.append("Invalid long value for ");
            sb2.append(zzc);
            sb2.append(": ");
            sb2.append(str);
            Log.e("PhenotypeFlag", sb2.toString());
            return null;
        }
    }
}
