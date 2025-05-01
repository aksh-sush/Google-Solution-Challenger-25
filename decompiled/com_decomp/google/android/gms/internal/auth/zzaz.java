package com.google.android.gms.internal.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.s;
import s3.a;
import s3.c;

public final class zzaz extends a {
    public static final Parcelable.Creator<zzaz> CREATOR = new zzba();
    final int zza;
    public final String zzb;
    public final byte[] zzc;

    zzaz(int i10, String str, byte[] bArr) {
        this.zza = 1;
        this.zzb = (String) s.k(str);
        this.zzc = (byte[]) s.k(bArr);
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.t(parcel, 1, this.zza);
        c.D(parcel, 2, this.zzb, false);
        c.k(parcel, 3, this.zzc, false);
        c.b(parcel, a10);
    }

    public zzaz(String str, byte[] bArr) {
        this(1, str, bArr);
    }
}
