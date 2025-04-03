package com.google.android.gms.internal.p002firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import s3.a;
import s3.c;
import y3.p;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzxo  reason: invalid package */
public final class zzxo extends a {
    public static final Parcelable.Creator<zzxo> CREATOR = new zzxp();
    public final int zza;
    private List<String> zzb;

    public zzxo() {
        this((List<String>) null);
    }

    public static zzxo zza(zzxo zzxo) {
        return new zzxo(zzxo.zzb);
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.t(parcel, 1, this.zza);
        c.F(parcel, 2, this.zzb, false);
        c.b(parcel, a10);
    }

    public final List<String> zzb() {
        return this.zzb;
    }

    zzxo(int i10, List<String> list) {
        List<String> emptyList;
        this.zza = i10;
        if (list == null || list.isEmpty()) {
            emptyList = Collections.emptyList();
        } else {
            for (int i11 = 0; i11 < list.size(); i11++) {
                list.set(i11, p.a(list.get(i11)));
            }
            emptyList = Collections.unmodifiableList(list);
        }
        this.zzb = emptyList;
    }

    public zzxo(List<String> list) {
        this.zza = 1;
        this.zzb = new ArrayList();
        if (list != null && !list.isEmpty()) {
            this.zzb.addAll(list);
        }
    }
}
