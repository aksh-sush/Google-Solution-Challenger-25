package com.google.android.gms.internal.p002firebaseauthapi;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.firebase.auth.PhoneAuthCredential;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zztv  reason: invalid package */
public final class zztv extends zza implements zztx {
    zztv(IBinder iBinder) {
        super(iBinder, "com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
    }

    public final void zzd(String str) {
        Parcel zza = zza();
        zza.writeString(str);
        zzJ(11, zza);
    }

    public final void zze(String str) {
        Parcel zza = zza();
        zza.writeString(str);
        zzJ(9, zza);
    }

    public final void zzf(zzvv zzvv) {
        Parcel zza = zza();
        zzc.zzb(zza, zzvv);
        zzJ(3, zza);
    }

    public final void zzg() {
        zzJ(6, zza());
    }

    public final void zzh(zzny zzny) {
        Parcel zza = zza();
        zzc.zzb(zza, zzny);
        zzJ(14, zza);
    }

    public final void zzi(zzoa zzoa) {
        Parcel zza = zza();
        zzc.zzb(zza, zzoa);
        zzJ(15, zza);
    }

    public final void zzj(Status status, PhoneAuthCredential phoneAuthCredential) {
        Parcel zza = zza();
        zzc.zzb(zza, status);
        zzc.zzb(zza, phoneAuthCredential);
        zzJ(12, zza);
    }

    public final void zzk(Status status) {
        Parcel zza = zza();
        zzc.zzb(zza, status);
        zzJ(5, zza);
    }

    public final void zzl(zzwq zzwq, zzwj zzwj) {
        Parcel zza = zza();
        zzc.zzb(zza, zzwq);
        zzc.zzb(zza, zzwj);
        zzJ(2, zza);
    }

    public final void zzm(zzxb zzxb) {
        Parcel zza = zza();
        zzc.zzb(zza, zzxb);
        zzJ(4, zza);
    }

    public final void zzn() {
        zzJ(7, zza());
    }

    public final void zzo(String str) {
        Parcel zza = zza();
        zza.writeString(str);
        zzJ(8, zza);
    }

    public final void zzp() {
        zzJ(13, zza());
    }

    public final void zzq(zzwq zzwq) {
        Parcel zza = zza();
        zzc.zzb(zza, zzwq);
        zzJ(1, zza);
    }

    public final void zzr(PhoneAuthCredential phoneAuthCredential) {
        Parcel zza = zza();
        zzc.zzb(zza, phoneAuthCredential);
        zzJ(10, zza);
    }
}
