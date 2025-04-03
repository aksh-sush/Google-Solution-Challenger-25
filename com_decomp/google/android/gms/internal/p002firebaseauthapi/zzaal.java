package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaal  reason: invalid package */
final class zzaal extends zzaan {
    private static final Class<?> zza = Collections.unmodifiableList(Collections.emptyList()).getClass();

    private zzaal() {
        super((zzaak) null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: com.google.android.gms.internal.firebase-auth-api.zzaai} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v14, resolved type: com.google.android.gms.internal.firebase-auth-api.zzaai} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v15, resolved type: com.google.android.gms.internal.firebase-auth-api.zzaai} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static <L> java.util.List<L> zzf(java.lang.Object r3, long r4, int r6) {
        /*
            java.lang.Object r0 = com.google.android.gms.internal.p002firebaseauthapi.zzacj.zzf(r3, r4)
            java.util.List r0 = (java.util.List) r0
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L_0x002f
            boolean r1 = r0 instanceof com.google.android.gms.internal.p002firebaseauthapi.zzaaj
            if (r1 == 0) goto L_0x0016
            com.google.android.gms.internal.firebase-auth-api.zzaai r0 = new com.google.android.gms.internal.firebase-auth-api.zzaai
            r0.<init>((int) r6)
            goto L_0x002b
        L_0x0016:
            boolean r1 = r0 instanceof com.google.android.gms.internal.p002firebaseauthapi.zzabg
            if (r1 == 0) goto L_0x0026
            boolean r1 = r0 instanceof com.google.android.gms.internal.p002firebaseauthapi.zzaab
            if (r1 == 0) goto L_0x0026
            com.google.android.gms.internal.firebase-auth-api.zzaab r0 = (com.google.android.gms.internal.p002firebaseauthapi.zzaab) r0
            com.google.android.gms.internal.firebase-auth-api.zzaab r6 = r0.zzd(r6)
            r0 = r6
            goto L_0x002b
        L_0x0026:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r6)
        L_0x002b:
            com.google.android.gms.internal.p002firebaseauthapi.zzacj.zzs(r3, r4, r0)
            goto L_0x0084
        L_0x002f:
            java.lang.Class<?> r1 = zza
            java.lang.Class r2 = r0.getClass()
            boolean r1 = r1.isAssignableFrom(r2)
            if (r1 == 0) goto L_0x004d
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r0.size()
            int r2 = r2 + r6
            r1.<init>(r2)
            r1.addAll(r0)
        L_0x0048:
            com.google.android.gms.internal.p002firebaseauthapi.zzacj.zzs(r3, r4, r1)
            r0 = r1
            goto L_0x0084
        L_0x004d:
            boolean r1 = r0 instanceof com.google.android.gms.internal.p002firebaseauthapi.zzace
            if (r1 == 0) goto L_0x0065
            com.google.android.gms.internal.firebase-auth-api.zzaai r1 = new com.google.android.gms.internal.firebase-auth-api.zzaai
            int r2 = r0.size()
            int r2 = r2 + r6
            r1.<init>((int) r2)
            com.google.android.gms.internal.firebase-auth-api.zzace r0 = (com.google.android.gms.internal.p002firebaseauthapi.zzace) r0
            int r6 = r1.size()
            r1.addAll(r6, r0)
            goto L_0x0048
        L_0x0065:
            boolean r1 = r0 instanceof com.google.android.gms.internal.p002firebaseauthapi.zzabg
            if (r1 == 0) goto L_0x0084
            boolean r1 = r0 instanceof com.google.android.gms.internal.p002firebaseauthapi.zzaab
            if (r1 == 0) goto L_0x0084
            r1 = r0
            com.google.android.gms.internal.firebase-auth-api.zzaab r1 = (com.google.android.gms.internal.p002firebaseauthapi.zzaab) r1
            boolean r2 = r1.zzc()
            if (r2 == 0) goto L_0x0077
            goto L_0x0084
        L_0x0077:
            int r0 = r0.size()
            int r0 = r0 + r6
            com.google.android.gms.internal.firebase-auth-api.zzaab r6 = r1.zzd(r0)
            com.google.android.gms.internal.p002firebaseauthapi.zzacj.zzs(r3, r4, r6)
            return r6
        L_0x0084:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p002firebaseauthapi.zzaal.zzf(java.lang.Object, long, int):java.util.List");
    }

    /* access modifiers changed from: package-private */
    public final <L> List<L> zza(Object obj, long j10) {
        return zzf(obj, j10, 10);
    }

    /* access modifiers changed from: package-private */
    public final void zzb(Object obj, long j10) {
        Object obj2;
        List list = (List) zzacj.zzf(obj, j10);
        if (list instanceof zzaaj) {
            obj2 = ((zzaaj) list).zze();
        } else if (!zza.isAssignableFrom(list.getClass())) {
            if (!(list instanceof zzabg) || !(list instanceof zzaab)) {
                obj2 = Collections.unmodifiableList(list);
            } else {
                zzaab zzaab = (zzaab) list;
                if (zzaab.zzc()) {
                    zzaab.zzb();
                    return;
                }
                return;
            }
        } else {
            return;
        }
        zzacj.zzs(obj, j10, obj2);
    }

    /* access modifiers changed from: package-private */
    public final <E> void zzc(Object obj, Object obj2, long j10) {
        List list = (List) zzacj.zzf(obj2, j10);
        List zzf = zzf(obj, j10, list.size());
        int size = zzf.size();
        int size2 = list.size();
        if (size > 0 && size2 > 0) {
            zzf.addAll(list);
        }
        if (size > 0) {
            list = zzf;
        }
        zzacj.zzs(obj, j10, list);
    }

    /* synthetic */ zzaal(zzaak zzaak) {
        super((zzaak) null);
    }
}
