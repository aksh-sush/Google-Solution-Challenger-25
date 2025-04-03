package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.List;

final class zzkq extends zzku {
    private static final Class<?> zza = Collections.unmodifiableList(Collections.emptyList()).getClass();

    private zzkq() {
        super((zzkt) null);
    }

    /* access modifiers changed from: package-private */
    public final void zza(Object obj, long j10) {
        Object obj2;
        List list = (List) zzms.zzf(obj, j10);
        if (list instanceof zzko) {
            obj2 = ((zzko) list).zze();
        } else if (!zza.isAssignableFrom(list.getClass())) {
            if (!(list instanceof zzln) || !(list instanceof zzkg)) {
                obj2 = Collections.unmodifiableList(list);
            } else {
                zzkg zzkg = (zzkg) list;
                if (zzkg.zzc()) {
                    zzkg.zzb();
                    return;
                }
                return;
            }
        } else {
            return;
        }
        zzms.zzs(obj, j10, obj2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: com.google.android.gms.internal.measurement.zzkn} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v15, resolved type: com.google.android.gms.internal.measurement.zzkn} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v16, resolved type: com.google.android.gms.internal.measurement.zzkn} */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x009c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <E> void zzb(java.lang.Object r5, java.lang.Object r6, long r7) {
        /*
            r4 = this;
            java.lang.Object r6 = com.google.android.gms.internal.measurement.zzms.zzf(r6, r7)
            java.util.List r6 = (java.util.List) r6
            int r0 = r6.size()
            java.lang.Object r1 = com.google.android.gms.internal.measurement.zzms.zzf(r5, r7)
            java.util.List r1 = (java.util.List) r1
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L_0x0039
            boolean r2 = r1 instanceof com.google.android.gms.internal.measurement.zzko
            if (r2 == 0) goto L_0x0020
            com.google.android.gms.internal.measurement.zzkn r1 = new com.google.android.gms.internal.measurement.zzkn
            r1.<init>((int) r0)
            goto L_0x0035
        L_0x0020:
            boolean r2 = r1 instanceof com.google.android.gms.internal.measurement.zzln
            if (r2 == 0) goto L_0x0030
            boolean r2 = r1 instanceof com.google.android.gms.internal.measurement.zzkg
            if (r2 == 0) goto L_0x0030
            com.google.android.gms.internal.measurement.zzkg r1 = (com.google.android.gms.internal.measurement.zzkg) r1
            com.google.android.gms.internal.measurement.zzkg r0 = r1.zzd(r0)
            r1 = r0
            goto L_0x0035
        L_0x0030:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r0)
        L_0x0035:
            com.google.android.gms.internal.measurement.zzms.zzs(r5, r7, r1)
            goto L_0x008a
        L_0x0039:
            java.lang.Class<?> r2 = zza
            java.lang.Class r3 = r1.getClass()
            boolean r2 = r2.isAssignableFrom(r3)
            if (r2 == 0) goto L_0x0057
            java.util.ArrayList r2 = new java.util.ArrayList
            int r3 = r1.size()
            int r3 = r3 + r0
            r2.<init>(r3)
            r2.addAll(r1)
        L_0x0052:
            com.google.android.gms.internal.measurement.zzms.zzs(r5, r7, r2)
            r1 = r2
            goto L_0x008a
        L_0x0057:
            boolean r2 = r1 instanceof com.google.android.gms.internal.measurement.zzmn
            if (r2 == 0) goto L_0x006f
            com.google.android.gms.internal.measurement.zzkn r2 = new com.google.android.gms.internal.measurement.zzkn
            int r3 = r1.size()
            int r3 = r3 + r0
            r2.<init>((int) r3)
            com.google.android.gms.internal.measurement.zzmn r1 = (com.google.android.gms.internal.measurement.zzmn) r1
            int r0 = r2.size()
            r2.addAll(r0, r1)
            goto L_0x0052
        L_0x006f:
            boolean r2 = r1 instanceof com.google.android.gms.internal.measurement.zzln
            if (r2 == 0) goto L_0x008a
            boolean r2 = r1 instanceof com.google.android.gms.internal.measurement.zzkg
            if (r2 == 0) goto L_0x008a
            r2 = r1
            com.google.android.gms.internal.measurement.zzkg r2 = (com.google.android.gms.internal.measurement.zzkg) r2
            boolean r3 = r2.zzc()
            if (r3 != 0) goto L_0x008a
            int r1 = r1.size()
            int r1 = r1 + r0
            com.google.android.gms.internal.measurement.zzkg r1 = r2.zzd(r1)
            goto L_0x0035
        L_0x008a:
            int r0 = r1.size()
            int r2 = r6.size()
            if (r0 <= 0) goto L_0x0099
            if (r2 <= 0) goto L_0x0099
            r1.addAll(r6)
        L_0x0099:
            if (r0 > 0) goto L_0x009c
            goto L_0x009d
        L_0x009c:
            r6 = r1
        L_0x009d:
            com.google.android.gms.internal.measurement.zzms.zzs(r5, r7, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzkq.zzb(java.lang.Object, java.lang.Object, long):void");
    }

    /* synthetic */ zzkq(zzkp zzkp) {
        super((zzkt) null);
    }
}
