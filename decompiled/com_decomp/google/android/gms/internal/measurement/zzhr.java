package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.net.Uri;

public final class zzhr {
    final String zza;
    final Uri zzb;
    final String zzc;
    final String zzd;
    final boolean zze;
    final boolean zzf;
    final boolean zzg;
    final boolean zzh;
    final zzhy<Context, Boolean> zzi;

    public zzhr(Uri uri) {
        this((String) null, uri, "", "", false, false, false, false, (zzhy<Context, Boolean>) null);
    }

    public final zzhr zza() {
        if (this.zzc.isEmpty()) {
            return new zzhr((String) null, this.zzb, this.zzc, this.zzd, true, false, false, false, (zzhy<Context, Boolean>) null);
        }
        throw new IllegalStateException("Cannot set GServices prefix and skip GServices");
    }

    public final zzhu<Double> zzb(String str, double d10) {
        return new zzhp(this, "measurement.test.double_flag", Double.valueOf(-3.0d), true);
    }

    public final zzhu<Long> zzc(String str, long j10) {
        return new zzhn(this, str, Long.valueOf(j10), true);
    }

    public final zzhu<String> zzd(String str, String str2) {
        return new zzhq(this, str, str2, true);
    }

    public final zzhu<Boolean> zze(String str, boolean z10) {
        return new zzho(this, str, Boolean.valueOf(z10), true);
    }

    private zzhr(String str, Uri uri, String str2, String str3, boolean z10, boolean z11, boolean z12, boolean z13, zzhy<Context, Boolean> zzhy) {
        this.zza = null;
        this.zzb = uri;
        this.zzc = "";
        this.zzd = "";
        this.zze = z10;
        this.zzf = false;
        this.zzg = false;
        this.zzh = false;
        this.zzi = null;
    }
}
