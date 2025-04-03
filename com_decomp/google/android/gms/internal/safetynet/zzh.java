package com.google.android.gms.internal.safetynet;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import i4.b;
import i4.g;
import i4.j;
import i4.l;
import i4.n;

public abstract class zzh extends zzb implements zzg {
    public zzh() {
        super("com.google.android.gms.safetynet.internal.ISafetyNetCallbacks");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            zza((Status) zzc.zza(parcel, Status.CREATOR), (g) zzc.zza(parcel, g.CREATOR));
        } else if (i10 == 2) {
            zza(parcel.readString());
        } else if (i10 == 3) {
            zza((Status) zzc.zza(parcel, Status.CREATOR), (b) zzc.zza(parcel, b.CREATOR));
        } else if (i10 == 4) {
            zza((Status) zzc.zza(parcel, Status.CREATOR), zzc.zza(parcel));
        } else if (i10 == 6) {
            zza((Status) zzc.zza(parcel, Status.CREATOR), (l) zzc.zza(parcel, l.CREATOR));
        } else if (i10 == 8) {
            zza((Status) zzc.zza(parcel, Status.CREATOR), (j) zzc.zza(parcel, j.CREATOR));
        } else if (i10 == 15) {
            zza((Status) zzc.zza(parcel, Status.CREATOR), (n) zzc.zza(parcel, n.CREATOR));
        } else if (i10 == 10) {
            zzb((Status) zzc.zza(parcel, Status.CREATOR), zzc.zza(parcel));
        } else if (i10 != 11) {
            return false;
        } else {
            zza((Status) zzc.zza(parcel, Status.CREATOR));
        }
        return true;
    }
}
