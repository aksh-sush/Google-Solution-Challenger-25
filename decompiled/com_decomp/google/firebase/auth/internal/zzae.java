package com.google.firebase.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.s;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.MultiFactorAssertion;
import com.google.firebase.auth.MultiFactorInfo;
import com.google.firebase.auth.MultiFactorResolver;
import com.google.firebase.auth.MultiFactorSession;
import com.google.firebase.auth.PhoneMultiFactorInfo;
import com.google.firebase.auth.zze;
import java.util.ArrayList;
import java.util.List;
import n4.i;
import s3.c;

public final class zzae extends MultiFactorResolver {
    public static final Parcelable.Creator<zzae> CREATOR = new zzaf();
    private final List<PhoneMultiFactorInfo> zza = new ArrayList();
    private final zzag zzb;
    private final String zzc;
    /* access modifiers changed from: private */
    public final zze zzd;
    private final zzx zze;

    public zzae(List<PhoneMultiFactorInfo> list, zzag zzag, String str, zze zze2, zzx zzx) {
        for (MultiFactorInfo next : list) {
            if (next instanceof PhoneMultiFactorInfo) {
                this.zza.add((PhoneMultiFactorInfo) next);
            }
        }
        this.zzb = (zzag) s.k(zzag);
        this.zzc = s.g(str);
        this.zzd = zze2;
        this.zze = zzx;
    }

    public final FirebaseAuth getFirebaseAuth() {
        return FirebaseAuth.getInstance(FirebaseApp.getInstance(this.zzc));
    }

    public final List<MultiFactorInfo> getHints() {
        ArrayList arrayList = new ArrayList();
        for (PhoneMultiFactorInfo add : this.zza) {
            arrayList.add(add);
        }
        return arrayList;
    }

    public final MultiFactorSession getSession() {
        return this.zzb;
    }

    public final i resolveSignIn(MultiFactorAssertion multiFactorAssertion) {
        return FirebaseAuth.getInstance(FirebaseApp.getInstance(this.zzc)).zzh(multiFactorAssertion, this.zzb, this.zze).continueWithTask(new c(this));
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.H(parcel, 1, this.zza, false);
        c.B(parcel, 2, this.zzb, i10, false);
        c.D(parcel, 3, this.zzc, false);
        c.B(parcel, 4, this.zzd, i10, false);
        c.B(parcel, 5, this.zze, i10, false);
        c.b(parcel, a10);
    }
}
