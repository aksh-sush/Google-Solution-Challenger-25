package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzbf  reason: invalid package */
public final class zzbf<P> {
    private final ConcurrentMap<zzbe, List<zzbd<P>>> zza = new ConcurrentHashMap();
    private zzbd<P> zzb;
    private final Class<P> zzc;

    private zzbf(Class<P> cls) {
        this.zzc = cls;
    }

    public static <P> zzbf<P> zzb(Class<P> cls) {
        return new zzbf<>(cls);
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x007d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.p002firebaseauthapi.zzbd<P> zza(P r9, com.google.android.gms.internal.p002firebaseauthapi.zziq r10) {
        /*
            r8 = this;
            com.google.android.gms.internal.firebase-auth-api.zzig r0 = r10.zzc()
            com.google.android.gms.internal.firebase-auth-api.zzig r1 = com.google.android.gms.internal.p002firebaseauthapi.zzig.ENABLED
            if (r0 != r1) goto L_0x0092
            com.google.android.gms.internal.firebase-auth-api.zzbd r0 = new com.google.android.gms.internal.firebase-auth-api.zzbd
            com.google.android.gms.internal.firebase-auth-api.zzjk r1 = com.google.android.gms.internal.p002firebaseauthapi.zzjk.UNKNOWN_PREFIX
            com.google.android.gms.internal.firebase-auth-api.zzjk r1 = r10.zzf()
            int r1 = r1.ordinal()
            r2 = 5
            r3 = 1
            if (r1 == r3) goto L_0x0037
            r3 = 2
            if (r1 == r3) goto L_0x002d
            r3 = 3
            if (r1 == r3) goto L_0x002a
            r3 = 4
            if (r1 != r3) goto L_0x0022
            goto L_0x002d
        L_0x0022:
            java.security.GeneralSecurityException r9 = new java.security.GeneralSecurityException
            java.lang.String r10 = "unknown output prefix type"
            r9.<init>(r10)
            throw r9
        L_0x002a:
            byte[] r1 = com.google.android.gms.internal.p002firebaseauthapi.zzaj.zza
            goto L_0x004b
        L_0x002d:
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.allocate(r2)
            r2 = 0
            java.nio.ByteBuffer r1 = r1.put(r2)
            goto L_0x003f
        L_0x0037:
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.allocate(r2)
            java.nio.ByteBuffer r1 = r1.put(r3)
        L_0x003f:
            int r2 = r10.zza()
            java.nio.ByteBuffer r1 = r1.putInt(r2)
            byte[] r1 = r1.array()
        L_0x004b:
            r4 = r1
            com.google.android.gms.internal.firebase-auth-api.zzig r5 = r10.zzc()
            com.google.android.gms.internal.firebase-auth-api.zzjk r6 = r10.zzf()
            int r7 = r10.zza()
            r2 = r0
            r3 = r9
            r2.<init>(r3, r4, r5, r6, r7)
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            r9.add(r0)
            com.google.android.gms.internal.firebase-auth-api.zzbe r10 = new com.google.android.gms.internal.firebase-auth-api.zzbe
            byte[] r1 = r0.zzd()
            r2 = 0
            r10.<init>(r1, r2)
            java.util.concurrent.ConcurrentMap<com.google.android.gms.internal.firebase-auth-api.zzbe, java.util.List<com.google.android.gms.internal.firebase-auth-api.zzbd<P>>> r1 = r8.zza
            java.util.List r9 = java.util.Collections.unmodifiableList(r9)
            java.lang.Object r9 = r1.put(r10, r9)
            java.util.List r9 = (java.util.List) r9
            if (r9 == 0) goto L_0x0091
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r1.addAll(r9)
            r1.add(r0)
            java.util.concurrent.ConcurrentMap<com.google.android.gms.internal.firebase-auth-api.zzbe, java.util.List<com.google.android.gms.internal.firebase-auth-api.zzbd<P>>> r9 = r8.zza
            java.util.List r1 = java.util.Collections.unmodifiableList(r1)
            r9.put(r10, r1)
        L_0x0091:
            return r0
        L_0x0092:
            java.security.GeneralSecurityException r9 = new java.security.GeneralSecurityException
            java.lang.String r10 = "only ENABLED key is allowed"
            r9.<init>(r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p002firebaseauthapi.zzbf.zza(java.lang.Object, com.google.android.gms.internal.firebase-auth-api.zziq):com.google.android.gms.internal.firebase-auth-api.zzbd");
    }

    public final Class<P> zzc() {
        return this.zzc;
    }

    public final List<zzbd<P>> zzd(byte[] bArr) {
        List<zzbd<P>> list = this.zza.get(new zzbe(bArr, (zzbc) null));
        return list != null ? list : Collections.emptyList();
    }

    public final void zze(zzbd<P> zzbd) {
        if (zzbd.zza() != zzig.ENABLED) {
            throw new IllegalArgumentException("the primary entry has to be ENABLED");
        } else if (!zzd(zzbd.zzd()).isEmpty()) {
            this.zzb = zzbd;
        } else {
            throw new IllegalArgumentException("the primary entry cannot be set to an entry which is not held by this primitive set");
        }
    }
}
