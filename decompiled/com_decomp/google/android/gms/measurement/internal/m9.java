package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzfo;
import h4.b0;

final class m9 {

    /* renamed from: a  reason: collision with root package name */
    private zzfo f6215a;

    /* renamed from: b  reason: collision with root package name */
    private Long f6216b;

    /* renamed from: c  reason: collision with root package name */
    private long f6217c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ q9 f6218d;

    /* synthetic */ m9(q9 q9Var, b0 b0Var) {
        this.f6218d = q9Var;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00f0, code lost:
        if (r8 == null) goto L_0x00f5;
     */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x01bb  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x01d1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.measurement.zzfo a(java.lang.String r14, com.google.android.gms.internal.measurement.zzfo r15) {
        /*
            r13 = this;
            java.lang.String r0 = r15.zzh()
            java.util.List r1 = r15.zzi()
            com.google.android.gms.measurement.internal.q9 r2 = r13.f6218d
            com.google.android.gms.measurement.internal.w8 r2 = r2.f6214b
            r2.f0()
            java.lang.String r2 = "_eid"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.y8.p(r15, r2)
            r6 = r3
            java.lang.Long r6 = (java.lang.Long) r6
            if (r6 == 0) goto L_0x021e
            java.lang.String r3 = "_ep"
            boolean r3 = r0.equals(r3)
            r4 = 0
            if (r3 == 0) goto L_0x01d5
            com.google.android.gms.common.internal.s.k(r6)
            com.google.android.gms.measurement.internal.q9 r0 = r13.f6218d
            com.google.android.gms.measurement.internal.w8 r0 = r0.f6214b
            r0.f0()
            java.lang.String r0 = "_en"
            java.lang.Object r0 = com.google.android.gms.measurement.internal.y8.p(r15, r0)
            java.lang.String r0 = (java.lang.String) r0
            boolean r3 = android.text.TextUtils.isEmpty(r0)
            r7 = 0
            if (r3 == 0) goto L_0x004f
            com.google.android.gms.measurement.internal.q9 r14 = r13.f6218d
            com.google.android.gms.measurement.internal.n4 r14 = r14.f5994a
            com.google.android.gms.measurement.internal.j3 r14 = r14.d()
            com.google.android.gms.measurement.internal.h3 r14 = r14.t()
            java.lang.String r15 = "Extra parameter without an event name. eventId"
            r14.b(r15, r6)
            return r7
        L_0x004f:
            com.google.android.gms.internal.measurement.zzfo r3 = r13.f6215a
            if (r3 == 0) goto L_0x0065
            java.lang.Long r3 = r13.f6216b
            if (r3 == 0) goto L_0x0065
            long r8 = r6.longValue()
            java.lang.Long r3 = r13.f6216b
            long r10 = r3.longValue()
            int r3 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r3 == 0) goto L_0x011d
        L_0x0065:
            com.google.android.gms.measurement.internal.q9 r3 = r13.f6218d
            com.google.android.gms.measurement.internal.w8 r3 = r3.f6214b
            com.google.android.gms.measurement.internal.j r3 = r3.V()
            r3.h()
            r3.i()
            android.database.sqlite.SQLiteDatabase r8 = r3.R()     // Catch:{ SQLiteException -> 0x00de, all -> 0x00db }
            r9 = 2
            java.lang.String[] r9 = new java.lang.String[r9]     // Catch:{ SQLiteException -> 0x00de, all -> 0x00db }
            r10 = 0
            r9[r10] = r14     // Catch:{ SQLiteException -> 0x00de, all -> 0x00db }
            java.lang.String r11 = java.lang.String.valueOf(r6)     // Catch:{ SQLiteException -> 0x00de, all -> 0x00db }
            r12 = 1
            r9[r12] = r11     // Catch:{ SQLiteException -> 0x00de, all -> 0x00db }
            java.lang.String r11 = "select main_event, children_to_process from main_event_params where app_id=? and event_id=?"
            android.database.Cursor r8 = r8.rawQuery(r11, r9)     // Catch:{ SQLiteException -> 0x00de, all -> 0x00db }
            boolean r9 = r8.moveToFirst()     // Catch:{ SQLiteException -> 0x00d9 }
            if (r9 != 0) goto L_0x00a0
            com.google.android.gms.measurement.internal.n4 r9 = r3.f5994a     // Catch:{ SQLiteException -> 0x00d9 }
            com.google.android.gms.measurement.internal.j3 r9 = r9.d()     // Catch:{ SQLiteException -> 0x00d9 }
            com.google.android.gms.measurement.internal.h3 r9 = r9.v()     // Catch:{ SQLiteException -> 0x00d9 }
            java.lang.String r10 = "Main event not found"
            r9.a(r10)     // Catch:{ SQLiteException -> 0x00d9 }
            goto L_0x00f2
        L_0x00a0:
            byte[] r9 = r8.getBlob(r10)     // Catch:{ SQLiteException -> 0x00d9 }
            long r10 = r8.getLong(r12)     // Catch:{ SQLiteException -> 0x00d9 }
            java.lang.Long r10 = java.lang.Long.valueOf(r10)     // Catch:{ SQLiteException -> 0x00d9 }
            com.google.android.gms.internal.measurement.zzfn r11 = com.google.android.gms.internal.measurement.zzfo.zze()     // Catch:{ IOException -> 0x00c4 }
            com.google.android.gms.internal.measurement.zzlf r9 = com.google.android.gms.measurement.internal.y8.D(r11, r9)     // Catch:{ IOException -> 0x00c4 }
            com.google.android.gms.internal.measurement.zzfn r9 = (com.google.android.gms.internal.measurement.zzfn) r9     // Catch:{ IOException -> 0x00c4 }
            com.google.android.gms.internal.measurement.zzjz r9 = r9.zzaA()     // Catch:{ IOException -> 0x00c4 }
            com.google.android.gms.internal.measurement.zzfo r9 = (com.google.android.gms.internal.measurement.zzfo) r9     // Catch:{ IOException -> 0x00c4 }
            android.util.Pair r3 = android.util.Pair.create(r9, r10)     // Catch:{ SQLiteException -> 0x00d9 }
            r8.close()
            goto L_0x00f6
        L_0x00c4:
            r9 = move-exception
            com.google.android.gms.measurement.internal.n4 r10 = r3.f5994a     // Catch:{ SQLiteException -> 0x00d9 }
            com.google.android.gms.measurement.internal.j3 r10 = r10.d()     // Catch:{ SQLiteException -> 0x00d9 }
            com.google.android.gms.measurement.internal.h3 r10 = r10.r()     // Catch:{ SQLiteException -> 0x00d9 }
            java.lang.String r11 = "Failed to merge main event. appId, eventId"
            java.lang.Object r12 = com.google.android.gms.measurement.internal.j3.z(r14)     // Catch:{ SQLiteException -> 0x00d9 }
            r10.d(r11, r12, r6, r9)     // Catch:{ SQLiteException -> 0x00d9 }
            goto L_0x00f2
        L_0x00d9:
            r9 = move-exception
            goto L_0x00e1
        L_0x00db:
            r14 = move-exception
            goto L_0x01cf
        L_0x00de:
            r8 = move-exception
            r9 = r8
            r8 = r7
        L_0x00e1:
            com.google.android.gms.measurement.internal.n4 r3 = r3.f5994a     // Catch:{ all -> 0x01cd }
            com.google.android.gms.measurement.internal.j3 r3 = r3.d()     // Catch:{ all -> 0x01cd }
            com.google.android.gms.measurement.internal.h3 r3 = r3.r()     // Catch:{ all -> 0x01cd }
            java.lang.String r10 = "Error selecting main event"
            r3.b(r10, r9)     // Catch:{ all -> 0x01cd }
            if (r8 == 0) goto L_0x00f5
        L_0x00f2:
            r8.close()
        L_0x00f5:
            r3 = r7
        L_0x00f6:
            if (r3 == 0) goto L_0x01bb
            java.lang.Object r8 = r3.first
            if (r8 != 0) goto L_0x00fe
            goto L_0x01bb
        L_0x00fe:
            com.google.android.gms.internal.measurement.zzfo r8 = (com.google.android.gms.internal.measurement.zzfo) r8
            r13.f6215a = r8
            java.lang.Object r3 = r3.second
            java.lang.Long r3 = (java.lang.Long) r3
            long r7 = r3.longValue()
            r13.f6217c = r7
            com.google.android.gms.measurement.internal.q9 r3 = r13.f6218d
            com.google.android.gms.measurement.internal.w8 r3 = r3.f6214b
            r3.f0()
            com.google.android.gms.internal.measurement.zzfo r3 = r13.f6215a
            java.lang.Object r2 = com.google.android.gms.measurement.internal.y8.p(r3, r2)
            java.lang.Long r2 = (java.lang.Long) r2
            r13.f6216b = r2
        L_0x011d:
            long r2 = r13.f6217c
            r7 = -1
            long r2 = r2 + r7
            r13.f6217c = r2
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            com.google.android.gms.measurement.internal.q9 r2 = r13.f6218d
            com.google.android.gms.measurement.internal.w8 r2 = r2.f6214b
            if (r7 > 0) goto L_0x0161
            com.google.android.gms.measurement.internal.j r2 = r2.V()
            r2.h()
            com.google.android.gms.measurement.internal.n4 r3 = r2.f5994a
            com.google.android.gms.measurement.internal.j3 r3 = r3.d()
            com.google.android.gms.measurement.internal.h3 r3 = r3.v()
            java.lang.String r4 = "Clearing complex main event info. appId"
            r3.b(r4, r14)
            android.database.sqlite.SQLiteDatabase r3 = r2.R()     // Catch:{ SQLiteException -> 0x0150 }
            java.lang.String[] r14 = new java.lang.String[]{r14}     // Catch:{ SQLiteException -> 0x0150 }
            java.lang.String r4 = "delete from main_event_params where app_id=?"
            r3.execSQL(r4, r14)     // Catch:{ SQLiteException -> 0x0150 }
            goto L_0x016d
        L_0x0150:
            r14 = move-exception
            com.google.android.gms.measurement.internal.n4 r2 = r2.f5994a
            com.google.android.gms.measurement.internal.j3 r2 = r2.d()
            com.google.android.gms.measurement.internal.h3 r2 = r2.r()
            java.lang.String r3 = "Error clearing complex main event"
            r2.b(r3, r14)
            goto L_0x016d
        L_0x0161:
            com.google.android.gms.measurement.internal.j r4 = r2.V()
            long r7 = r13.f6217c
            com.google.android.gms.internal.measurement.zzfo r9 = r13.f6215a
            r5 = r14
            r4.x(r5, r6, r7, r9)
        L_0x016d:
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            com.google.android.gms.internal.measurement.zzfo r2 = r13.f6215a
            java.util.List r2 = r2.zzi()
            java.util.Iterator r2 = r2.iterator()
        L_0x017c:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x019d
            java.lang.Object r3 = r2.next()
            com.google.android.gms.internal.measurement.zzfs r3 = (com.google.android.gms.internal.measurement.zzfs) r3
            com.google.android.gms.measurement.internal.q9 r4 = r13.f6218d
            com.google.android.gms.measurement.internal.w8 r4 = r4.f6214b
            r4.f0()
            java.lang.String r4 = r3.zzg()
            com.google.android.gms.internal.measurement.zzfs r4 = com.google.android.gms.measurement.internal.y8.o(r15, r4)
            if (r4 != 0) goto L_0x017c
            r14.add(r3)
            goto L_0x017c
        L_0x019d:
            boolean r2 = r14.isEmpty()
            if (r2 != 0) goto L_0x01a9
            r14.addAll(r1)
            r1 = r14
            goto L_0x021e
        L_0x01a9:
            com.google.android.gms.measurement.internal.q9 r14 = r13.f6218d
            com.google.android.gms.measurement.internal.n4 r14 = r14.f5994a
            com.google.android.gms.measurement.internal.j3 r14 = r14.d()
            com.google.android.gms.measurement.internal.h3 r14 = r14.t()
            java.lang.String r2 = "No unique parameters in main event. eventName"
        L_0x01b7:
            r14.b(r2, r0)
            goto L_0x021e
        L_0x01bb:
            com.google.android.gms.measurement.internal.q9 r14 = r13.f6218d
            com.google.android.gms.measurement.internal.n4 r14 = r14.f5994a
            com.google.android.gms.measurement.internal.j3 r14 = r14.d()
            com.google.android.gms.measurement.internal.h3 r14 = r14.t()
            java.lang.String r15 = "Extra parameter without existing main event. eventName, eventId"
            r14.c(r15, r0, r6)
            return r7
        L_0x01cd:
            r14 = move-exception
            r7 = r8
        L_0x01cf:
            if (r7 == 0) goto L_0x01d4
            r7.close()
        L_0x01d4:
            throw r14
        L_0x01d5:
            r13.f6216b = r6
            r13.f6215a = r15
            com.google.android.gms.measurement.internal.q9 r2 = r13.f6218d
            com.google.android.gms.measurement.internal.w8 r2 = r2.f6214b
            r2.f0()
            java.lang.Long r2 = java.lang.Long.valueOf(r4)
            java.lang.String r3 = "_epc"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.y8.p(r15, r3)
            if (r3 == 0) goto L_0x01ed
            r2 = r3
        L_0x01ed:
            java.lang.Long r2 = (java.lang.Long) r2
            long r2 = r2.longValue()
            r13.f6217c = r2
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 > 0) goto L_0x0208
            com.google.android.gms.measurement.internal.q9 r14 = r13.f6218d
            com.google.android.gms.measurement.internal.n4 r14 = r14.f5994a
            com.google.android.gms.measurement.internal.j3 r14 = r14.d()
            com.google.android.gms.measurement.internal.h3 r14 = r14.t()
            java.lang.String r2 = "Complex event with zero extra param count. eventName"
            goto L_0x01b7
        L_0x0208:
            com.google.android.gms.measurement.internal.q9 r2 = r13.f6218d
            com.google.android.gms.measurement.internal.w8 r2 = r2.f6214b
            com.google.android.gms.measurement.internal.j r7 = r2.V()
            java.lang.Object r2 = com.google.android.gms.common.internal.s.k(r6)
            r9 = r2
            java.lang.Long r9 = (java.lang.Long) r9
            long r10 = r13.f6217c
            r8 = r14
            r12 = r15
            r7.x(r8, r9, r10, r12)
        L_0x021e:
            com.google.android.gms.internal.measurement.zzjv r14 = r15.zzbv()
            com.google.android.gms.internal.measurement.zzfn r14 = (com.google.android.gms.internal.measurement.zzfn) r14
            r14.zzi(r0)
            r14.zzg()
            r14.zzd(r1)
            com.google.android.gms.internal.measurement.zzjz r14 = r14.zzaA()
            com.google.android.gms.internal.measurement.zzfo r14 = (com.google.android.gms.internal.measurement.zzfo) r14
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.m9.a(java.lang.String, com.google.android.gms.internal.measurement.zzfo):com.google.android.gms.internal.measurement.zzfo");
    }
}
