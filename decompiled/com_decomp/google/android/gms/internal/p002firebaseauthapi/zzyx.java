package com.google.android.gms.internal.p002firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzyx  reason: invalid package */
public abstract class zzyx {
    int zza;
    zzyy zzb;

    /* synthetic */ zzyx(zzyv zzyv) {
    }

    public static int zzs(int i10) {
        return (-(i10 & 1)) ^ (i10 >>> 1);
    }

    public static long zzt(long j10) {
        return (-(j10 & 1)) ^ (j10 >>> 1);
    }

    static zzyx zzu(byte[] bArr, int i10, int i11, boolean z10) {
        zzyw zzyw = new zzyw(bArr, 0, i11, z10, (zzyv) null);
        try {
            zzyw.zzc(i11);
            return zzyw;
        } catch (zzaae e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public abstract int zzb();

    public abstract int zzc(int i10);

    public abstract int zzf();

    public abstract zzyu zzj();

    public abstract String zzk();

    public abstract String zzl();

    public abstract void zzm(int i10);

    public abstract void zzn(int i10);

    public abstract boolean zzp();

    public abstract boolean zzq();

    public abstract boolean zzr(int i10);
}
