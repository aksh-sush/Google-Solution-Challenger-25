package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.internal.common.zzb;
import com.google.android.gms.internal.common.zzc;

public abstract class e1 extends zzb implements m {
    public e1() {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
    }

    /* access modifiers changed from: protected */
    public final boolean zza(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            zzc.zzb(parcel);
            W(parcel.readInt(), parcel.readStrongBinder(), (Bundle) zzc.zza(parcel, Bundle.CREATOR));
        } else if (i10 == 2) {
            zzc.zzb(parcel);
            z(parcel.readInt(), (Bundle) zzc.zza(parcel, Bundle.CREATOR));
        } else if (i10 != 3) {
            return false;
        } else {
            zzc.zzb(parcel);
            L(parcel.readInt(), parcel.readStrongBinder(), (u1) zzc.zza(parcel, u1.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
