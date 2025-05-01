package com.google.android.gms.internal.p002firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.s;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import s3.a;
import s3.c;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzwl  reason: invalid package */
public final class zzwl extends a {
    public static final Parcelable.Creator<zzwl> CREATOR = new zzwm();
    private final List<zzwj> zza;

    public zzwl() {
        this.zza = new ArrayList();
    }

    public static zzwl zza(zzwl zzwl) {
        s.k(zzwl);
        List<zzwj> list = zzwl.zza;
        zzwl zzwl2 = new zzwl();
        if (list != null && !list.isEmpty()) {
            zzwl2.zza.addAll(list);
        }
        return zzwl2;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.H(parcel, 2, this.zza, false);
        c.b(parcel, a10);
    }

    public final List<zzwj> zzb() {
        return this.zza;
    }

    zzwl(List<zzwj> list) {
        this.zza = list == null ? Collections.emptyList() : Collections.unmodifiableList(list);
    }
}
