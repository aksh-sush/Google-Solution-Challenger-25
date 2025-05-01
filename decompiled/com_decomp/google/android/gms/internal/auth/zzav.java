package com.google.android.gms.internal.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.s;
import s3.a;
import s3.c;

public final class zzav extends a {
    public static final Parcelable.Creator<zzav> CREATOR = new zzaw();
    final int zza;
    public final String zzb;
    public final int zzc;

    zzav(int i10, String str, int i11) {
        this.zza = 1;
        this.zzb = (String) s.k(str);
        this.zzc = i11;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.t(parcel, 1, this.zza);
        c.D(parcel, 2, this.zzb, false);
        c.t(parcel, 3, this.zzc);
        c.b(parcel, a10);
    }

    public zzav(String str, int i10) {
        this(1, str, i10);
    }
}
