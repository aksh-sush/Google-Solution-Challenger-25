package com.google.android.gms.internal.measurement;

import android.net.Uri;
import androidx.collection.a;

public final class zzhk {
    private static final a zza = new a();

    public static synchronized Uri zza(String str) {
        Uri uri;
        synchronized (zzhk.class) {
            a aVar = zza;
            uri = (Uri) aVar.get("com.google.android.gms.measurement");
            if (uri == null) {
                String valueOf = String.valueOf(Uri.encode("com.google.android.gms.measurement"));
                uri = Uri.parse(valueOf.length() != 0 ? "content://com.google.android.gms.phenotype/".concat(valueOf) : new String("content://com.google.android.gms.phenotype/"));
                aVar.put("com.google.android.gms.measurement", uri);
            }
        }
        return uri;
    }
}
