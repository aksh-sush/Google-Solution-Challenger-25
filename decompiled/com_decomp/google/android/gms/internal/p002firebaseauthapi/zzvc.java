package com.google.android.gms.internal.p002firebaseauthapi;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import com.google.android.gms.common.internal.s;
import y3.a;
import y3.j;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzvc  reason: invalid package */
public final class zzvc {
    private final String zza;
    private final String zzb;

    public zzvc(Context context, String str) {
        s.k(context);
        String g10 = s.g(str);
        this.zza = g10;
        try {
            byte[] a10 = a.a(context, g10);
            if (a10 == null) {
                String valueOf = String.valueOf(str);
                Log.e("FBA-PackageInfo", valueOf.length() != 0 ? "single cert required: ".concat(valueOf) : new String("single cert required: "));
                this.zzb = null;
                return;
            }
            this.zzb = j.c(a10, false);
        } catch (PackageManager.NameNotFoundException unused) {
            String valueOf2 = String.valueOf(str);
            Log.e("FBA-PackageInfo", valueOf2.length() != 0 ? "no pkg: ".concat(valueOf2) : new String("no pkg: "));
            this.zzb = null;
        }
    }

    public final String zza() {
        return this.zzb;
    }

    public final String zzb() {
        return this.zza;
    }
}
