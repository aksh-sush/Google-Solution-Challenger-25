package com.google.android.gms.internal.p002firebaseauthapi;

import sun.misc.Unsafe;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzach  reason: invalid package */
final class zzach extends zzaci {
    zzach(Unsafe unsafe) {
        super(unsafe);
    }

    public final double zza(Object obj, long j10) {
        return Double.longBitsToDouble(zzk(obj, j10));
    }

    public final float zzb(Object obj, long j10) {
        return Float.intBitsToFloat(zzj(obj, j10));
    }

    public final void zzc(Object obj, long j10, boolean z10) {
        if (zzacj.zzb) {
            zzacj.zzD(obj, j10, r3 ? (byte) 1 : 0);
        } else {
            zzacj.zzE(obj, j10, r3 ? (byte) 1 : 0);
        }
    }

    public final void zzd(Object obj, long j10, byte b10) {
        if (zzacj.zzb) {
            zzacj.zzD(obj, j10, b10);
        } else {
            zzacj.zzE(obj, j10, b10);
        }
    }

    public final void zze(Object obj, long j10, double d10) {
        zzo(obj, j10, Double.doubleToLongBits(d10));
    }

    public final void zzf(Object obj, long j10, float f10) {
        zzn(obj, j10, Float.floatToIntBits(f10));
    }

    public final boolean zzg(Object obj, long j10) {
        return zzacj.zzb ? zzacj.zzt(obj, j10) : zzacj.zzu(obj, j10);
    }
}
