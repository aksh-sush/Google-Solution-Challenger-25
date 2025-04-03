package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzef  reason: invalid package */
public final class zzef extends zzav<zzht> {
    public zzef() {
        super(zzht.class, new zzed(zzbb.class));
    }

    static /* synthetic */ zzas zzk(int i10, int i11, zzhq zzhq, int i12) {
        zzhv zzb = zzhw.zzb();
        zzhy zzc = zzhz.zzc();
        zzc.zza(zzhq);
        zzc.zzb(i11);
        zzb.zzb((zzhz) zzc.zzk());
        zzb.zza(i10);
        return new zzas((zzhw) zzb.zzk(), i12);
    }

    public static final void zzl(zzht zzht) {
        zzli.zzc(zzht.zza(), 0);
        if (zzht.zzg().zzd() >= 16) {
            zzm(zzht.zzf());
            return;
        }
        throw new GeneralSecurityException("key too short");
    }

    /* access modifiers changed from: private */
    public static void zzm(zzhz zzhz) {
        if (zzhz.zza() >= 10) {
            zzhq zzhq = zzhq.UNKNOWN_HASH;
            int ordinal = zzhz.zzb().ordinal();
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        if (ordinal != 4) {
                            if (ordinal != 5) {
                                throw new GeneralSecurityException("unknown hash type");
                            } else if (zzhz.zza() > 28) {
                                throw new GeneralSecurityException("tag size too big");
                            }
                        } else if (zzhz.zza() > 64) {
                            throw new GeneralSecurityException("tag size too big");
                        }
                    } else if (zzhz.zza() > 32) {
                        throw new GeneralSecurityException("tag size too big");
                    }
                } else if (zzhz.zza() > 48) {
                    throw new GeneralSecurityException("tag size too big");
                }
            } else if (zzhz.zza() > 20) {
                throw new GeneralSecurityException("tag size too big");
            }
        } else {
            throw new GeneralSecurityException("tag size too small");
        }
    }

    public final zzat<zzhw, zzht> zza() {
        return new zzee(this, zzhw.class);
    }

    public final zzid zzb() {
        return zzid.SYMMETRIC;
    }

    public final /* bridge */ /* synthetic */ zzaaz zzc(zzyu zzyu) {
        return zzht.zze(zzyu, zzzj.zza());
    }

    public final String zzg() {
        return "type.googleapis.com/google.crypto.tink.HmacKey";
    }

    public final /* bridge */ /* synthetic */ void zzi(zzaaz zzaaz) {
        zzl((zzht) zzaaz);
    }
}
