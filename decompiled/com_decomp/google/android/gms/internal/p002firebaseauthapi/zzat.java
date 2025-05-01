package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzaaz;
import java.util.Collections;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzat  reason: invalid package */
public abstract class zzat<KeyFormatProtoT extends zzaaz, KeyT> {
    private final Class<KeyFormatProtoT> zza;

    public zzat(Class<KeyFormatProtoT> cls) {
        this.zza = cls;
    }

    public abstract KeyFormatProtoT zza(zzyu zzyu);

    public final Class<KeyFormatProtoT> zzb() {
        return this.zza;
    }

    public abstract KeyT zzc(KeyFormatProtoT keyformatprotot);

    public Map<String, zzas<KeyFormatProtoT>> zzd() {
        return Collections.emptyMap();
    }

    public abstract void zze(KeyFormatProtoT keyformatprotot);
}
