package com.google.android.gms.internal.auth;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import i3.a;
import i3.b;
import i3.i;

public abstract class zzas extends zzb implements zzat {
    public zzas() {
        super("com.google.android.gms.auth.api.accounttransfer.internal.IAccountTransferCallbacks");
    }

    /* access modifiers changed from: protected */
    public final boolean zza(int i10, Parcel parcel, Parcel parcel2, int i11) {
        switch (i10) {
            case 1:
                zzc.zzb(parcel);
                zzh((Status) zzc.zza(parcel, Status.CREATOR));
                return true;
            case 2:
                zzc.zzb(parcel);
                zzf((Status) zzc.zza(parcel, Status.CREATOR), (i) zzc.zza(parcel, i.CREATOR));
                return true;
            case 3:
                zzc.zzb(parcel);
                zzg((Status) zzc.zza(parcel, Status.CREATOR), (b) zzc.zza(parcel, b.CREATOR));
                return true;
            case 4:
                zze();
                return true;
            case 5:
                zzc.zzb(parcel);
                zzd((Status) zzc.zza(parcel, Status.CREATOR));
                return true;
            case 6:
                byte[] createByteArray = parcel.createByteArray();
                zzc.zzb(parcel);
                zzb(createByteArray);
                return true;
            case 7:
                zzc.zzb(parcel);
                zzc((a) zzc.zza(parcel, a.CREATOR));
                return true;
            default:
                return false;
        }
    }
}
