package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzaaz;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzav  reason: invalid package */
public abstract class zzav<KeyProtoT extends zzaaz> {
    private final Class<KeyProtoT> zza;
    private final Map<Class<?>, zzau<?, KeyProtoT>> zzb;
    private final Class<?> zzc;

    @SafeVarargs
    protected zzav(Class<KeyProtoT> cls, zzau<?, KeyProtoT>... zzauArr) {
        this.zza = cls;
        HashMap hashMap = new HashMap();
        int i10 = 0;
        while (i10 <= 0) {
            zzau<?, KeyProtoT> zzau = zzauArr[i10];
            if (hashMap.containsKey(zzau.zza())) {
                String valueOf = String.valueOf(zzau.zza().getCanonicalName());
                throw new IllegalArgumentException(valueOf.length() != 0 ? "KeyTypeManager constructed with duplicate factories for primitive ".concat(valueOf) : new String("KeyTypeManager constructed with duplicate factories for primitive "));
            } else {
                hashMap.put(zzau.zza(), zzau);
                i10++;
            }
        }
        this.zzc = zzauArr[0].zza();
        this.zzb = Collections.unmodifiableMap(hashMap);
    }

    public zzat<?, KeyProtoT> zza() {
        throw new UnsupportedOperationException("Creating keys is not supported.");
    }

    public abstract zzid zzb();

    public abstract KeyProtoT zzc(zzyu zzyu);

    /* access modifiers changed from: package-private */
    public final Class<?> zzd() {
        return this.zzc;
    }

    public final Class<KeyProtoT> zze() {
        return this.zza;
    }

    public final <P> P zzf(KeyProtoT keyprotot, Class<P> cls) {
        zzau zzau = this.zzb.get(cls);
        if (zzau != null) {
            return zzau.zzb(keyprotot);
        }
        String canonicalName = cls.getCanonicalName();
        StringBuilder sb2 = new StringBuilder(String.valueOf(canonicalName).length() + 41);
        sb2.append("Requested primitive class ");
        sb2.append(canonicalName);
        sb2.append(" not supported.");
        throw new IllegalArgumentException(sb2.toString());
    }

    public abstract String zzg();

    public final Set<Class<?>> zzh() {
        return this.zzb.keySet();
    }

    public abstract void zzi(KeyProtoT keyprotot);
}
