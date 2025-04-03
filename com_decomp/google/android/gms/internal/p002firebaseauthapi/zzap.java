package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzaaz;
import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzap  reason: invalid package */
class zzap<PrimitiveT, KeyProtoT extends zzaaz> implements zzan<PrimitiveT> {
    private final zzav<KeyProtoT> zza;
    private final Class<PrimitiveT> zzb;

    public zzap(zzav<KeyProtoT> zzav, Class<PrimitiveT> cls) {
        if (zzav.zzh().contains(cls) || Void.class.equals(cls)) {
            this.zza = zzav;
            this.zzb = cls;
            return;
        }
        throw new IllegalArgumentException(String.format("Given internalKeyMananger %s does not support primitive class %s", new Object[]{zzav.toString(), cls.getName()}));
    }

    private final zzao<?, KeyProtoT> zze() {
        return new zzao<>(this.zza.zza());
    }

    private final PrimitiveT zzf(KeyProtoT keyprotot) {
        if (!Void.class.equals(this.zzb)) {
            this.zza.zzi(keyprotot);
            return this.zza.zzf(keyprotot, this.zzb);
        }
        throw new GeneralSecurityException("Cannot create a primitive for Void");
    }

    public final zzie zza(zzyu zzyu) {
        try {
            zzaaz zza2 = zze().zza(zzyu);
            zzib zza3 = zzie.zza();
            zza3.zzb(this.zza.zzg());
            zza3.zzc(zza2.zzo());
            zza3.zza(this.zza.zzb());
            return (zzie) zza3.zzk();
        } catch (zzaae e10) {
            throw new GeneralSecurityException("Unexpected proto", e10);
        }
    }

    public final zzaaz zzb(zzyu zzyu) {
        try {
            return zze().zza(zzyu);
        } catch (zzaae e10) {
            String name = this.zza.zza().zzb().getName();
            throw new GeneralSecurityException(name.length() != 0 ? "Failures parsing proto of type ".concat(name) : new String("Failures parsing proto of type "), e10);
        }
    }

    public final PrimitiveT zzc(zzyu zzyu) {
        try {
            return zzf(this.zza.zzc(zzyu));
        } catch (zzaae e10) {
            String name = this.zza.zze().getName();
            throw new GeneralSecurityException(name.length() != 0 ? "Failures parsing proto of type ".concat(name) : new String("Failures parsing proto of type "), e10);
        }
    }

    public final PrimitiveT zzd(zzaaz zzaaz) {
        String name = this.zza.zze().getName();
        String concat = name.length() != 0 ? "Expected proto of type ".concat(name) : new String("Expected proto of type ");
        if (this.zza.zze().isInstance(zzaaz)) {
            return zzf(zzaaz);
        }
        throw new GeneralSecurityException(concat);
    }
}
