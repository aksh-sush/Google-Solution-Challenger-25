package com.google.android.gms.internal.auth;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.s;
import s3.a;
import s3.c;

public final class zzbb extends a {
    public static final Parcelable.Creator<zzbb> CREATOR = new zzbc();
    final int zza;
    public final String zzb;
    public final PendingIntent zzc;

    zzbb(int i10, String str, PendingIntent pendingIntent) {
        this.zza = 1;
        this.zzb = (String) s.k(str);
        this.zzc = (PendingIntent) s.k(pendingIntent);
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.t(parcel, 1, this.zza);
        c.D(parcel, 2, this.zzb, false);
        c.B(parcel, 3, this.zzc, i10, false);
        c.b(parcel, a10);
    }

    public zzbb(String str, PendingIntent pendingIntent) {
        this(1, str, pendingIntent);
    }
}
