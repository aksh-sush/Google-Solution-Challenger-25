package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzci  reason: invalid package */
public final class zzci extends zzav<zzga> {
    zzci() {
        super(zzga.class, new zzcg(zzag.class));
    }

    public static void zzj(boolean z10) {
        if (zzl()) {
            zzbn.zzm(new zzci(), true);
        }
    }

    static /* synthetic */ zzas zzk(int i10, int i11) {
        zzgc zzb = zzgd.zzb();
        zzb.zza(i10);
        return new zzas((zzgd) zzb.zzk(), i11);
    }

    private static boolean zzl() {
        try {
            Cipher.getInstance("AES/GCM-SIV/NoPadding");
            return true;
        } catch (NoSuchAlgorithmException | NoSuchPaddingException unused) {
            return false;
        }
    }

    public final zzat<zzgd, zzga> zza() {
        return new zzch(this, zzgd.class);
    }

    public final zzid zzb() {
        return zzid.SYMMETRIC;
    }

    public final /* bridge */ /* synthetic */ zzaaz zzc(zzyu zzyu) {
        return zzga.zzd(zzyu, zzzj.zza());
    }

    public final String zzg() {
        return "type.googleapis.com/google.crypto.tink.AesGcmSivKey";
    }

    public final /* bridge */ /* synthetic */ void zzi(zzaaz zzaaz) {
        zzga zzga = (zzga) zzaaz;
        zzli.zzc(zzga.zza(), 0);
        zzli.zzb(zzga.zze().zzd());
    }
}
