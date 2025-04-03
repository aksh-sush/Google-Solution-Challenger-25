package com.google.firebase.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.s;
import com.google.firebase.auth.AdditionalUserInfo;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.zze;
import java.util.List;
import s3.c;

public final class zzr implements AuthResult {
    public static final Parcelable.Creator<zzr> CREATOR = new zzs();
    private zzx zza;
    private zzp zzb;
    private zze zzc;

    public zzr(zzx zzx) {
        zzx zzx2 = (zzx) s.k(zzx);
        this.zza = zzx2;
        List<zzt> zzo = zzx2.zzo();
        this.zzb = null;
        for (int i10 = 0; i10 < zzo.size(); i10++) {
            if (!TextUtils.isEmpty(zzo.get(i10).zza())) {
                this.zzb = new zzp(zzo.get(i10).getProviderId(), zzo.get(i10).zza(), zzx.zzs());
            }
        }
        if (this.zzb == null) {
            this.zzb = new zzp(zzx.zzs());
        }
        this.zzc = zzx.zzj();
    }

    public final int describeContents() {
        return 0;
    }

    public final AdditionalUserInfo getAdditionalUserInfo() {
        return this.zzb;
    }

    public final AuthCredential getCredential() {
        return this.zzc;
    }

    public final FirebaseUser getUser() {
        return this.zza;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.B(parcel, 1, this.zza, i10, false);
        c.B(parcel, 2, this.zzb, i10, false);
        c.B(parcel, 3, this.zzc, i10, false);
        c.b(parcel, a10);
    }

    zzr(zzx zzx, zzp zzp, zze zze) {
        this.zza = zzx;
        this.zzb = zzp;
        this.zzc = zze;
    }
}
