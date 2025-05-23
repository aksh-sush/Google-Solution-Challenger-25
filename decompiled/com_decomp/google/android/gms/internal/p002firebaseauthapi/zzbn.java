package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzbn  reason: invalid package */
public final class zzbn {
    private static final Logger zza = Logger.getLogger(zzbn.class.getName());
    private static final ConcurrentMap<String, zzbm> zzb = new ConcurrentHashMap();
    private static final ConcurrentMap<String, zzbl> zzc = new ConcurrentHashMap();
    private static final ConcurrentMap<String, Boolean> zzd = new ConcurrentHashMap();
    private static final ConcurrentMap<String, Object> zze = new ConcurrentHashMap();
    private static final ConcurrentMap<Class<?>, zzbg<?, ?>> zzf = new ConcurrentHashMap();
    private static final ConcurrentMap<String, zzaq> zzg = new ConcurrentHashMap();

    private zzbn() {
    }

    public static zzan<?> zza(String str) {
        return zzp(str).zzb();
    }

    public static zzie zzb(String str, zzyu zzyu) {
        zzan zzo = zzo(str, (Class) null);
        if (zzo instanceof zzbh) {
            return ((zzbh) zzo).zze(zzyu);
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 48);
        sb2.append("manager for key type ");
        sb2.append(str);
        sb2.append(" is not a PrivateKeyManager");
        throw new GeneralSecurityException(sb2.toString());
    }

    public static synchronized zzie zzc(zzij zzij) {
        zzie zza2;
        synchronized (zzbn.class) {
            zzan<?> zza3 = zza(zzij.zzf());
            if (zzd.get(zzij.zzf()).booleanValue()) {
                zza2 = zza3.zza(zzij.zze());
            } else {
                String valueOf = String.valueOf(zzij.zzf());
                throw new GeneralSecurityException(valueOf.length() != 0 ? "newKey-operation not permitted for key type ".concat(valueOf) : new String("newKey-operation not permitted for key type "));
            }
        }
        return zza2;
    }

    public static synchronized zzaaz zzd(zzij zzij) {
        zzaaz zzb2;
        synchronized (zzbn.class) {
            zzan<?> zza2 = zza(zzij.zzf());
            if (zzd.get(zzij.zzf()).booleanValue()) {
                zzb2 = zza2.zzb(zzij.zze());
            } else {
                String valueOf = String.valueOf(zzij.zzf());
                throw new GeneralSecurityException(valueOf.length() != 0 ? "newKey-operation not permitted for key type ".concat(valueOf) : new String("newKey-operation not permitted for key type "));
            }
        }
        return zzb2;
    }

    public static Class<?> zze(Class<?> cls) {
        zzbg zzbg = zzf.get(cls);
        if (zzbg == null) {
            return null;
        }
        return zzbg.zza();
    }

    @Deprecated
    public static <P> P zzf(zzie zzie) {
        return zzq(zzie.zzf(), zzie.zze(), (Class) null);
    }

    public static <P> P zzg(zzie zzie, Class<P> cls) {
        return zzq(zzie.zzf(), zzie.zze(), cls);
    }

    public static <P> P zzh(String str, zzaaz zzaaz, Class<P> cls) {
        return zzo(str, cls).zzd(zzaaz);
    }

    public static <P> P zzi(String str, byte[] bArr, Class<P> cls) {
        return zzq(str, zzyu.zzn(bArr), cls);
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [com.google.android.gms.internal.firebase-auth-api.zzbf, com.google.android.gms.internal.firebase-auth-api.zzbf<B>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static <B, P> P zzj(com.google.android.gms.internal.p002firebaseauthapi.zzbf<B> r4, java.lang.Class<P> r5) {
        /*
            java.util.concurrent.ConcurrentMap<java.lang.Class<?>, com.google.android.gms.internal.firebase-auth-api.zzbg<?, ?>> r0 = zzf
            java.lang.Object r5 = r0.get(r5)
            com.google.android.gms.internal.firebase-auth-api.zzbg r5 = (com.google.android.gms.internal.p002firebaseauthapi.zzbg) r5
            if (r5 != 0) goto L_0x002a
            java.security.GeneralSecurityException r5 = new java.security.GeneralSecurityException
            java.lang.Class r4 = r4.zzc()
            java.lang.String r4 = r4.getName()
            int r0 = r4.length()
            java.lang.String r1 = "No wrapper found for "
            if (r0 == 0) goto L_0x0021
            java.lang.String r4 = r1.concat(r4)
            goto L_0x0026
        L_0x0021:
            java.lang.String r4 = new java.lang.String
            r4.<init>(r1)
        L_0x0026:
            r5.<init>(r4)
            throw r5
        L_0x002a:
            java.lang.Class r0 = r5.zza()
            java.lang.Class r1 = r4.zzc()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x003d
            java.lang.Object r4 = r5.zzc(r4)
            return r4
        L_0x003d:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.Class r5 = r5.zza()
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.Class r4 = r4.zzc()
            java.lang.String r4 = java.lang.String.valueOf(r4)
            int r1 = r5.length()
            int r2 = r4.length()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            int r1 = r1 + 44
            int r1 = r1 + r2
            r3.<init>(r1)
            java.lang.String r1 = "Wrong input primitive class, expected "
            r3.append(r1)
            r3.append(r5)
            java.lang.String r5 = ", got "
            r3.append(r5)
            r3.append(r4)
            java.lang.String r4 = r3.toString()
            r0.<init>(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p002firebaseauthapi.zzbn.zzj(com.google.android.gms.internal.firebase-auth-api.zzbf, java.lang.Class):java.lang.Object");
    }

    static synchronized Map<String, zzaq> zzk() {
        Map<String, zzaq> unmodifiableMap;
        synchronized (zzbn.class) {
            unmodifiableMap = Collections.unmodifiableMap(zzg);
        }
        return unmodifiableMap;
    }

    public static synchronized <KeyProtoT extends zzaaz, PublicKeyProtoT extends zzaaz> void zzl(zzbi<KeyProtoT, PublicKeyProtoT> zzbi, zzav<PublicKeyProtoT> zzav, boolean z10) {
        Class<?> zzd2;
        synchronized (zzbn.class) {
            zzr("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey", zzbi.getClass(), zzbi.zza().zzd(), true);
            zzr("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey", zzav.getClass(), Collections.emptyMap(), false);
            ConcurrentMap<String, zzbm> concurrentMap = zzb;
            if (concurrentMap.containsKey("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey") && (zzd2 = concurrentMap.get("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey").zzd()) != null) {
                if (!zzd2.getName().equals(zzav.getClass().getName())) {
                    zza.logp(Level.WARNING, "com.google.crypto.tink.Registry", "registerAsymmetricKeyManagers", "Attempted overwrite of a registered key manager for key type type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey with inconsistent public key type type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey");
                    throw new GeneralSecurityException(String.format("public key manager corresponding to %s is already registered with %s, cannot be re-registered with %s", new Object[]{zzbi.getClass().getName(), zzd2.getName(), zzav.getClass().getName()}));
                }
            }
            if (!concurrentMap.containsKey("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey") || concurrentMap.get("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey").zzd() == null) {
                concurrentMap.put("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey", new zzbk(zzbi, zzav));
                zzc.put("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey", new zzbl(zzbi));
                zzs("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey", zzbi.zza().zzd());
            }
            ConcurrentMap<String, Boolean> concurrentMap2 = zzd;
            concurrentMap2.put("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey", Boolean.TRUE);
            if (!concurrentMap.containsKey("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey")) {
                concurrentMap.put("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey", new zzbj(zzav));
            }
            concurrentMap2.put("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey", Boolean.FALSE);
        }
    }

    public static synchronized <KeyProtoT extends zzaaz> void zzm(zzav<KeyProtoT> zzav, boolean z10) {
        synchronized (zzbn.class) {
            String zzg2 = zzav.zzg();
            zzr(zzg2, zzav.getClass(), zzav.zza().zzd(), true);
            ConcurrentMap<String, zzbm> concurrentMap = zzb;
            if (!concurrentMap.containsKey(zzg2)) {
                concurrentMap.put(zzg2, new zzbj(zzav));
                zzc.put(zzg2, new zzbl(zzav));
                zzs(zzg2, zzav.zza().zzd());
            }
            zzd.put(zzg2, Boolean.TRUE);
        }
    }

    public static synchronized <B, P> void zzn(zzbg<B, P> zzbg) {
        synchronized (zzbn.class) {
            if (zzbg != null) {
                Class<P> zzb2 = zzbg.zzb();
                ConcurrentMap<Class<?>, zzbg<?, ?>> concurrentMap = zzf;
                if (concurrentMap.containsKey(zzb2)) {
                    zzbg zzbg2 = concurrentMap.get(zzb2);
                    if (!zzbg.getClass().getName().equals(zzbg2.getClass().getName())) {
                        Logger logger = zza;
                        Level level = Level.WARNING;
                        String valueOf = String.valueOf(zzb2);
                        StringBuilder sb2 = new StringBuilder(valueOf.length() + 62);
                        sb2.append("Attempted overwrite of a registered PrimitiveWrapper for type ");
                        sb2.append(valueOf);
                        logger.logp(level, "com.google.crypto.tink.Registry", "registerPrimitiveWrapper", sb2.toString());
                        throw new GeneralSecurityException(String.format("PrimitiveWrapper for primitive (%s) is already registered to be %s, cannot be re-registered with %s", new Object[]{zzb2.getName(), zzbg2.getClass().getName(), zzbg.getClass().getName()}));
                    }
                }
                concurrentMap.put(zzb2, zzbg);
            } else {
                throw new IllegalArgumentException("wrapper must be non-null");
            }
        }
    }

    private static <P> zzan<P> zzo(String str, Class<P> cls) {
        zzbm zzp = zzp(str);
        if (cls == null) {
            return zzp.zzb();
        }
        if (zzp.zze().contains(cls)) {
            return zzp.zza(cls);
        }
        String name = cls.getName();
        String valueOf = String.valueOf(zzp.zzc());
        Set<Class<?>> zze2 = zzp.zze();
        StringBuilder sb2 = new StringBuilder();
        boolean z10 = true;
        for (Class next : zze2) {
            if (!z10) {
                sb2.append(", ");
            }
            sb2.append(next.getCanonicalName());
            z10 = false;
        }
        String sb3 = sb2.toString();
        int length = name.length();
        StringBuilder sb4 = new StringBuilder(length + 77 + valueOf.length() + String.valueOf(sb3).length());
        sb4.append("Primitive type ");
        sb4.append(name);
        sb4.append(" not supported by key manager of type ");
        sb4.append(valueOf);
        sb4.append(", supported primitives: ");
        sb4.append(sb3);
        throw new GeneralSecurityException(sb4.toString());
    }

    private static synchronized zzbm zzp(String str) {
        zzbm zzbm;
        synchronized (zzbn.class) {
            ConcurrentMap<String, zzbm> concurrentMap = zzb;
            if (!concurrentMap.containsKey(str)) {
                String valueOf = String.valueOf(str);
                throw new GeneralSecurityException(valueOf.length() != 0 ? "No key manager found for key type ".concat(valueOf) : new String("No key manager found for key type "));
            }
            zzbm = concurrentMap.get(str);
        }
        return zzbm;
    }

    private static <P> P zzq(String str, zzyu zzyu, Class<P> cls) {
        return zzo(str, cls).zzc(zzyu);
    }

    private static synchronized <KeyProtoT extends zzaaz, KeyFormatProtoT extends zzaaz> void zzr(String str, Class cls, Map<String, zzas<KeyFormatProtoT>> map, boolean z10) {
        synchronized (zzbn.class) {
            ConcurrentMap<String, zzbm> concurrentMap = zzb;
            zzbm zzbm = concurrentMap.get(str);
            if (zzbm != null && !zzbm.zzc().equals(cls)) {
                zza.logp(Level.WARNING, "com.google.crypto.tink.Registry", "ensureKeyManagerInsertable", str.length() != 0 ? "Attempted overwrite of a registered key manager for key type ".concat(str) : new String("Attempted overwrite of a registered key manager for key type "));
                throw new GeneralSecurityException(String.format("typeUrl (%s) is already registered with %s, cannot be re-registered with %s", new Object[]{str, zzbm.zzc().getName(), cls.getName()}));
            } else if (z10) {
                ConcurrentMap<String, Boolean> concurrentMap2 = zzd;
                if (concurrentMap2.containsKey(str) && !concurrentMap2.get(str).booleanValue()) {
                    throw new GeneralSecurityException(str.length() != 0 ? "New keys are already disallowed for key type ".concat(str) : new String("New keys are already disallowed for key type "));
                } else if (concurrentMap.containsKey(str)) {
                    for (Map.Entry next : map.entrySet()) {
                        if (!zzg.containsKey(next.getKey())) {
                            String str2 = (String) next.getKey();
                            StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 79 + str.length());
                            sb2.append("Attempted to register a new key template ");
                            sb2.append(str2);
                            sb2.append(" from an existing key manager of type ");
                            sb2.append(str);
                            throw new GeneralSecurityException(sb2.toString());
                        }
                    }
                } else {
                    for (Map.Entry next2 : map.entrySet()) {
                        if (zzg.containsKey(next2.getKey())) {
                            String valueOf = String.valueOf((String) next2.getKey());
                            throw new GeneralSecurityException(valueOf.length() != 0 ? "Attempted overwrite of a registered key template ".concat(valueOf) : new String("Attempted overwrite of a registered key template "));
                        }
                    }
                }
            }
        }
    }

    private static <KeyFormatProtoT extends zzaaz> void zzs(String str, Map<String, zzas<KeyFormatProtoT>> map) {
        for (Map.Entry next : map.entrySet()) {
            zzg.put((String) next.getKey(), zzaq.zze(str, ((zzas) next.getValue()).zza.zzr(), ((zzas) next.getValue()).zzb));
        }
    }
}
