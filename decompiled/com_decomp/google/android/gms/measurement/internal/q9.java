package com.google.android.gms.measurement.internal;

import h4.a0;
import java.util.Map;
import java.util.Set;

final class q9 extends n8 {

    /* renamed from: d  reason: collision with root package name */
    private String f6366d;

    /* renamed from: e  reason: collision with root package name */
    private Set f6367e;

    /* renamed from: f  reason: collision with root package name */
    private Map f6368f;

    /* renamed from: g  reason: collision with root package name */
    private Long f6369g;

    /* renamed from: h  reason: collision with root package name */
    private Long f6370h;

    q9(w8 w8Var) {
        super(w8Var);
    }

    private final l9 n(Integer num) {
        if (this.f6368f.containsKey(num)) {
            return (l9) this.f6368f.get(num);
        }
        l9 l9Var = new l9(this, this.f6366d, (a0) null);
        this.f6368f.put(num, l9Var);
        return l9Var;
    }

    private final boolean o(int i10, int i11) {
        l9 l9Var = (l9) this.f6368f.get(Integer.valueOf(i10));
        if (l9Var == null) {
            return false;
        }
        return l9Var.f6184d.get(i11);
    }

    /* access modifiers changed from: protected */
    public final boolean l() {
        return false;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x02f1, code lost:
        if (r5 != null) goto L_0x02c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:280:0x0713, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:281:0x0714, code lost:
        r28 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:282:0x0717, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:283:0x0718, code lost:
        r28 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:284:0x071b, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:285:0x071c, code lost:
        r5 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:291:0x073b, code lost:
        if (r4 == null) goto L_0x073e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:296:0x0746, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:358:0x08db, code lost:
        if (r9 == null) goto L_0x08de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:395:0x09fa, code lost:
        if (r8 != false) goto L_0x0a05;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0174, code lost:
        if (r5 != null) goto L_0x0152;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x03bf  */
    /* JADX WARNING: Removed duplicated region for block: B:222:0x0580  */
    /* JADX WARNING: Removed duplicated region for block: B:284:0x071b A[ExcHandler: all (th java.lang.Throwable), Splitter:B:234:0x0663] */
    /* JADX WARNING: Removed duplicated region for block: B:296:0x0746  */
    /* JADX WARNING: Removed duplicated region for block: B:320:0x07fe  */
    /* JADX WARNING: Removed duplicated region for block: B:363:0x08e6  */
    /* JADX WARNING: Removed duplicated region for block: B:401:0x0a22  */
    /* JADX WARNING: Removed duplicated region for block: B:418:0x0aba  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0179  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x01b5 A[Catch:{ SQLiteException -> 0x021c }] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x01c1 A[SYNTHETIC, Splitter:B:65:0x01c1] */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0241  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0253  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List m(java.lang.String r65, java.util.List r66, java.util.List r67, java.lang.Long r68, java.lang.Long r69) {
        /*
            r64 = this;
            r10 = r64
            java.lang.String r11 = "current_results"
            com.google.android.gms.common.internal.s.g(r65)
            com.google.android.gms.common.internal.s.k(r66)
            com.google.android.gms.common.internal.s.k(r67)
            r0 = r65
            r10.f6366d = r0
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r10.f6367e = r0
            androidx.collection.a r0 = new androidx.collection.a
            r0.<init>()
            r10.f6368f = r0
            r0 = r68
            r10.f6369g = r0
            r0 = r69
            r10.f6370h = r0
            java.util.Iterator r0 = r66.iterator()
        L_0x002b:
            boolean r1 = r0.hasNext()
            r12 = 0
            r13 = 1
            if (r1 == 0) goto L_0x0047
            java.lang.Object r1 = r0.next()
            com.google.android.gms.internal.measurement.zzfo r1 = (com.google.android.gms.internal.measurement.zzfo) r1
            java.lang.String r1 = r1.zzh()
            java.lang.String r2 = "_s"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x002b
            r1 = 1
            goto L_0x0048
        L_0x0047:
            r1 = 0
        L_0x0048:
            com.google.android.gms.internal.measurement.zzoe.zzc()
            com.google.android.gms.measurement.internal.n4 r0 = r10.f5994a
            com.google.android.gms.measurement.internal.g r0 = r0.z()
            java.lang.String r2 = r10.f6366d
            com.google.android.gms.measurement.internal.x2 r3 = com.google.android.gms.measurement.internal.y2.f6613a0
            boolean r14 = r0.B(r2, r3)
            com.google.android.gms.internal.measurement.zzoe.zzc()
            com.google.android.gms.measurement.internal.n4 r0 = r10.f5994a
            com.google.android.gms.measurement.internal.g r0 = r0.z()
            java.lang.String r2 = r10.f6366d
            com.google.android.gms.measurement.internal.x2 r3 = com.google.android.gms.measurement.internal.y2.Z
            boolean r15 = r0.B(r2, r3)
            if (r1 == 0) goto L_0x00af
            com.google.android.gms.measurement.internal.w8 r0 = r10.f6214b
            com.google.android.gms.measurement.internal.j r2 = r0.V()
            java.lang.String r3 = r10.f6366d
            r2.i()
            r2.h()
            com.google.android.gms.common.internal.s.g(r3)
            android.content.ContentValues r0 = new android.content.ContentValues
            r0.<init>()
            java.lang.String r4 = "current_session_count"
            java.lang.Integer r5 = java.lang.Integer.valueOf(r12)
            r0.put(r4, r5)
            android.database.sqlite.SQLiteDatabase r4 = r2.R()     // Catch:{ SQLiteException -> 0x009b }
            java.lang.String[] r5 = new java.lang.String[]{r3}     // Catch:{ SQLiteException -> 0x009b }
            java.lang.String r6 = "events"
            java.lang.String r7 = "app_id = ?"
            r4.update(r6, r0, r7, r5)     // Catch:{ SQLiteException -> 0x009b }
            goto L_0x00af
        L_0x009b:
            r0 = move-exception
            com.google.android.gms.measurement.internal.n4 r2 = r2.f5994a
            com.google.android.gms.measurement.internal.j3 r2 = r2.d()
            com.google.android.gms.measurement.internal.h3 r2 = r2.r()
            java.lang.String r4 = "Error resetting session-scoped event counts. appId"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.j3.z(r3)
            r2.c(r4, r3, r0)
        L_0x00af:
            java.util.Map r0 = java.util.Collections.emptyMap()
            java.lang.String r9 = "Failed to merge filter. appId"
            java.lang.String r8 = "Database error querying filters. appId"
            java.lang.String r16 = "data"
            java.lang.String r7 = "audience_id"
            r6 = 2
            if (r15 == 0) goto L_0x017d
            if (r14 == 0) goto L_0x017d
            com.google.android.gms.measurement.internal.w8 r0 = r10.f6214b
            com.google.android.gms.measurement.internal.j r2 = r0.V()
            java.lang.String r3 = r10.f6366d
            com.google.android.gms.common.internal.s.g(r3)
            androidx.collection.a r4 = new androidx.collection.a
            r4.<init>()
            android.database.sqlite.SQLiteDatabase r17 = r2.R()
            java.lang.String[] r0 = new java.lang.String[r6]     // Catch:{ SQLiteException -> 0x015d, all -> 0x015a }
            r0[r12] = r7     // Catch:{ SQLiteException -> 0x015d, all -> 0x015a }
            r0[r13] = r16     // Catch:{ SQLiteException -> 0x015d, all -> 0x015a }
            java.lang.String[] r21 = new java.lang.String[]{r3}     // Catch:{ SQLiteException -> 0x015d, all -> 0x015a }
            java.lang.String r18 = "event_filters"
            java.lang.String r20 = "app_id=?"
            r22 = 0
            r23 = 0
            r24 = 0
            r19 = r0
            android.database.Cursor r5 = r17.query(r18, r19, r20, r21, r22, r23, r24)     // Catch:{ SQLiteException -> 0x015d, all -> 0x015a }
            boolean r0 = r5.moveToFirst()     // Catch:{ SQLiteException -> 0x0158 }
            if (r0 == 0) goto L_0x014e
        L_0x00f4:
            byte[] r0 = r5.getBlob(r13)     // Catch:{ SQLiteException -> 0x0158 }
            com.google.android.gms.internal.measurement.zzei r13 = com.google.android.gms.internal.measurement.zzej.zzc()     // Catch:{ IOException -> 0x012e }
            com.google.android.gms.internal.measurement.zzlf r0 = com.google.android.gms.measurement.internal.y8.D(r13, r0)     // Catch:{ IOException -> 0x012e }
            com.google.android.gms.internal.measurement.zzei r0 = (com.google.android.gms.internal.measurement.zzei) r0     // Catch:{ IOException -> 0x012e }
            com.google.android.gms.internal.measurement.zzjz r0 = r0.zzaA()     // Catch:{ IOException -> 0x012e }
            com.google.android.gms.internal.measurement.zzej r0 = (com.google.android.gms.internal.measurement.zzej) r0     // Catch:{ IOException -> 0x012e }
            boolean r13 = r0.zzo()     // Catch:{ SQLiteException -> 0x0158 }
            if (r13 != 0) goto L_0x010f
            goto L_0x0140
        L_0x010f:
            int r13 = r5.getInt(r12)     // Catch:{ SQLiteException -> 0x0158 }
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)     // Catch:{ SQLiteException -> 0x0158 }
            java.lang.Object r17 = r4.get(r13)     // Catch:{ SQLiteException -> 0x0158 }
            java.util.List r17 = (java.util.List) r17     // Catch:{ SQLiteException -> 0x0158 }
            if (r17 != 0) goto L_0x0128
            java.util.ArrayList r12 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x0158 }
            r12.<init>()     // Catch:{ SQLiteException -> 0x0158 }
            r4.put(r13, r12)     // Catch:{ SQLiteException -> 0x0158 }
            goto L_0x012a
        L_0x0128:
            r12 = r17
        L_0x012a:
            r12.add(r0)     // Catch:{ SQLiteException -> 0x0158 }
            goto L_0x0140
        L_0x012e:
            r0 = move-exception
            com.google.android.gms.measurement.internal.n4 r12 = r2.f5994a     // Catch:{ SQLiteException -> 0x0158 }
            com.google.android.gms.measurement.internal.j3 r12 = r12.d()     // Catch:{ SQLiteException -> 0x0158 }
            com.google.android.gms.measurement.internal.h3 r12 = r12.r()     // Catch:{ SQLiteException -> 0x0158 }
            java.lang.Object r13 = com.google.android.gms.measurement.internal.j3.z(r3)     // Catch:{ SQLiteException -> 0x0158 }
            r12.c(r9, r13, r0)     // Catch:{ SQLiteException -> 0x0158 }
        L_0x0140:
            boolean r0 = r5.moveToNext()     // Catch:{ SQLiteException -> 0x0158 }
            if (r0 != 0) goto L_0x014b
            r5.close()
            r12 = r4
            goto L_0x017e
        L_0x014b:
            r12 = 0
            r13 = 1
            goto L_0x00f4
        L_0x014e:
            java.util.Map r0 = java.util.Collections.emptyMap()     // Catch:{ SQLiteException -> 0x0158 }
        L_0x0152:
            r5.close()
            goto L_0x017d
        L_0x0156:
            r0 = move-exception
            goto L_0x0177
        L_0x0158:
            r0 = move-exception
            goto L_0x015f
        L_0x015a:
            r0 = move-exception
            r5 = 0
            goto L_0x0177
        L_0x015d:
            r0 = move-exception
            r5 = 0
        L_0x015f:
            com.google.android.gms.measurement.internal.n4 r2 = r2.f5994a     // Catch:{ all -> 0x0156 }
            com.google.android.gms.measurement.internal.j3 r2 = r2.d()     // Catch:{ all -> 0x0156 }
            com.google.android.gms.measurement.internal.h3 r2 = r2.r()     // Catch:{ all -> 0x0156 }
            java.lang.Object r3 = com.google.android.gms.measurement.internal.j3.z(r3)     // Catch:{ all -> 0x0156 }
            r2.c(r8, r3, r0)     // Catch:{ all -> 0x0156 }
            java.util.Map r0 = java.util.Collections.emptyMap()     // Catch:{ all -> 0x0156 }
            if (r5 == 0) goto L_0x017d
            goto L_0x0152
        L_0x0177:
            if (r5 == 0) goto L_0x017c
            r5.close()
        L_0x017c:
            throw r0
        L_0x017d:
            r12 = r0
        L_0x017e:
            com.google.android.gms.measurement.internal.w8 r0 = r10.f6214b
            com.google.android.gms.measurement.internal.j r2 = r0.V()
            java.lang.String r3 = r10.f6366d
            r2.i()
            r2.h()
            com.google.android.gms.common.internal.s.g(r3)
            android.database.sqlite.SQLiteDatabase r17 = r2.R()
            java.lang.String[] r0 = new java.lang.String[r6]     // Catch:{ SQLiteException -> 0x0224, all -> 0x0220 }
            r4 = 0
            r0[r4] = r7     // Catch:{ SQLiteException -> 0x0224, all -> 0x0220 }
            r4 = 1
            r0[r4] = r11     // Catch:{ SQLiteException -> 0x0224, all -> 0x0220 }
            java.lang.String[] r21 = new java.lang.String[]{r3}     // Catch:{ SQLiteException -> 0x0224, all -> 0x0220 }
            java.lang.String r18 = "audience_filter_values"
            java.lang.String r20 = "app_id=?"
            r22 = 0
            r23 = 0
            r24 = 0
            r19 = r0
            android.database.Cursor r4 = r17.query(r18, r19, r20, r21, r22, r23, r24)     // Catch:{ SQLiteException -> 0x0224, all -> 0x0220 }
            boolean r0 = r4.moveToFirst()     // Catch:{ SQLiteException -> 0x021c }
            if (r0 != 0) goto L_0x01c1
            java.util.Map r0 = java.util.Collections.emptyMap()     // Catch:{ SQLiteException -> 0x021c }
            r4.close()
            r13 = r0
            r20 = r7
            goto L_0x0245
        L_0x01c1:
            androidx.collection.a r5 = new androidx.collection.a     // Catch:{ SQLiteException -> 0x021c }
            r5.<init>()     // Catch:{ SQLiteException -> 0x021c }
        L_0x01c6:
            r13 = 0
            int r17 = r4.getInt(r13)     // Catch:{ SQLiteException -> 0x021c }
            r13 = 1
            byte[] r0 = r4.getBlob(r13)     // Catch:{ SQLiteException -> 0x021c }
            com.google.android.gms.internal.measurement.zzgc r13 = com.google.android.gms.internal.measurement.zzgd.zzf()     // Catch:{ IOException -> 0x01ec }
            com.google.android.gms.internal.measurement.zzlf r0 = com.google.android.gms.measurement.internal.y8.D(r13, r0)     // Catch:{ IOException -> 0x01ec }
            com.google.android.gms.internal.measurement.zzgc r0 = (com.google.android.gms.internal.measurement.zzgc) r0     // Catch:{ IOException -> 0x01ec }
            com.google.android.gms.internal.measurement.zzjz r0 = r0.zzaA()     // Catch:{ IOException -> 0x01ec }
            com.google.android.gms.internal.measurement.zzgd r0 = (com.google.android.gms.internal.measurement.zzgd) r0     // Catch:{ IOException -> 0x01ec }
            java.lang.Integer r13 = java.lang.Integer.valueOf(r17)     // Catch:{ SQLiteException -> 0x021c }
            r5.put(r13, r0)     // Catch:{ SQLiteException -> 0x021c }
            r19 = r5
            r20 = r7
            goto L_0x0208
        L_0x01ec:
            r0 = move-exception
            com.google.android.gms.measurement.internal.n4 r13 = r2.f5994a     // Catch:{ SQLiteException -> 0x021c }
            com.google.android.gms.measurement.internal.j3 r13 = r13.d()     // Catch:{ SQLiteException -> 0x021c }
            com.google.android.gms.measurement.internal.h3 r13 = r13.r()     // Catch:{ SQLiteException -> 0x021c }
            java.lang.String r6 = "Failed to merge filter results. appId, audienceId, error"
            r19 = r5
            java.lang.Object r5 = com.google.android.gms.measurement.internal.j3.z(r3)     // Catch:{ SQLiteException -> 0x021c }
            r20 = r7
            java.lang.Integer r7 = java.lang.Integer.valueOf(r17)     // Catch:{ SQLiteException -> 0x021a }
            r13.d(r6, r5, r7, r0)     // Catch:{ SQLiteException -> 0x021a }
        L_0x0208:
            boolean r0 = r4.moveToNext()     // Catch:{ SQLiteException -> 0x021a }
            if (r0 != 0) goto L_0x0214
            r4.close()
            r13 = r19
            goto L_0x0245
        L_0x0214:
            r5 = r19
            r7 = r20
            r6 = 2
            goto L_0x01c6
        L_0x021a:
            r0 = move-exception
            goto L_0x0228
        L_0x021c:
            r0 = move-exception
            r20 = r7
            goto L_0x0228
        L_0x0220:
            r0 = move-exception
            r5 = 0
            goto L_0x0ab8
        L_0x0224:
            r0 = move-exception
            r20 = r7
            r4 = 0
        L_0x0228:
            com.google.android.gms.measurement.internal.n4 r2 = r2.f5994a     // Catch:{ all -> 0x0ab6 }
            com.google.android.gms.measurement.internal.j3 r2 = r2.d()     // Catch:{ all -> 0x0ab6 }
            com.google.android.gms.measurement.internal.h3 r2 = r2.r()     // Catch:{ all -> 0x0ab6 }
            java.lang.String r5 = "Database error querying filter results. appId"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.j3.z(r3)     // Catch:{ all -> 0x0ab6 }
            r2.c(r5, r3, r0)     // Catch:{ all -> 0x0ab6 }
            java.util.Map r0 = java.util.Collections.emptyMap()     // Catch:{ all -> 0x0ab6 }
            if (r4 == 0) goto L_0x0244
            r4.close()
        L_0x0244:
            r13 = r0
        L_0x0245:
            boolean r0 = r13.isEmpty()
            if (r0 == 0) goto L_0x0253
        L_0x024b:
            r12 = r8
            r29 = r9
            r28 = r20
            r13 = 0
            goto L_0x0574
        L_0x0253:
            java.util.HashSet r2 = new java.util.HashSet
            java.util.Set r0 = r13.keySet()
            r2.<init>(r0)
            if (r1 == 0) goto L_0x03c3
            java.lang.String r1 = r10.f6366d
            com.google.android.gms.common.internal.s.g(r1)
            com.google.android.gms.common.internal.s.k(r13)
            androidx.collection.a r3 = new androidx.collection.a
            r3.<init>()
            boolean r0 = r13.isEmpty()
            if (r0 == 0) goto L_0x0273
            goto L_0x03bb
        L_0x0273:
            com.google.android.gms.measurement.internal.w8 r0 = r10.f6214b
            com.google.android.gms.measurement.internal.j r4 = r0.V()
            r4.i()
            r4.h()
            com.google.android.gms.common.internal.s.g(r1)
            androidx.collection.a r0 = new androidx.collection.a
            r0.<init>()
            android.database.sqlite.SQLiteDatabase r5 = r4.R()
            java.lang.String[] r6 = new java.lang.String[]{r1, r1}     // Catch:{ SQLiteException -> 0x02d8, all -> 0x02d4 }
            java.lang.String r7 = "select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;"
            android.database.Cursor r5 = r5.rawQuery(r7, r6)     // Catch:{ SQLiteException -> 0x02d8, all -> 0x02d4 }
            boolean r6 = r5.moveToFirst()     // Catch:{ SQLiteException -> 0x02d2 }
            if (r6 == 0) goto L_0x02ca
        L_0x029b:
            r6 = 0
            int r7 = r5.getInt(r6)     // Catch:{ SQLiteException -> 0x02d2 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r7)     // Catch:{ SQLiteException -> 0x02d2 }
            java.lang.Object r7 = r0.get(r6)     // Catch:{ SQLiteException -> 0x02d2 }
            java.util.List r7 = (java.util.List) r7     // Catch:{ SQLiteException -> 0x02d2 }
            if (r7 != 0) goto L_0x02b4
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x02d2 }
            r7.<init>()     // Catch:{ SQLiteException -> 0x02d2 }
            r0.put(r6, r7)     // Catch:{ SQLiteException -> 0x02d2 }
        L_0x02b4:
            r6 = 1
            int r17 = r5.getInt(r6)     // Catch:{ SQLiteException -> 0x02d2 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r17)     // Catch:{ SQLiteException -> 0x02d2 }
            r7.add(r6)     // Catch:{ SQLiteException -> 0x02d2 }
            boolean r6 = r5.moveToNext()     // Catch:{ SQLiteException -> 0x02d2 }
            if (r6 != 0) goto L_0x029b
        L_0x02c6:
            r5.close()
            goto L_0x02f4
        L_0x02ca:
            java.util.Map r0 = java.util.Collections.emptyMap()     // Catch:{ SQLiteException -> 0x02d2 }
            goto L_0x02c6
        L_0x02cf:
            r0 = move-exception
            goto L_0x03bd
        L_0x02d2:
            r0 = move-exception
            goto L_0x02da
        L_0x02d4:
            r0 = move-exception
            r5 = 0
            goto L_0x03bd
        L_0x02d8:
            r0 = move-exception
            r5 = 0
        L_0x02da:
            com.google.android.gms.measurement.internal.n4 r4 = r4.f5994a     // Catch:{ all -> 0x02cf }
            com.google.android.gms.measurement.internal.j3 r4 = r4.d()     // Catch:{ all -> 0x02cf }
            com.google.android.gms.measurement.internal.h3 r4 = r4.r()     // Catch:{ all -> 0x02cf }
            java.lang.String r6 = "Database error querying scoped filters. appId"
            java.lang.Object r1 = com.google.android.gms.measurement.internal.j3.z(r1)     // Catch:{ all -> 0x02cf }
            r4.c(r6, r1, r0)     // Catch:{ all -> 0x02cf }
            java.util.Map r0 = java.util.Collections.emptyMap()     // Catch:{ all -> 0x02cf }
            if (r5 == 0) goto L_0x02f4
            goto L_0x02c6
        L_0x02f4:
            java.util.Set r1 = r13.keySet()
            java.util.Iterator r1 = r1.iterator()
        L_0x02fc:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x03bb
            java.lang.Object r4 = r1.next()
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            java.lang.Object r6 = r13.get(r5)
            com.google.android.gms.internal.measurement.zzgd r6 = (com.google.android.gms.internal.measurement.zzgd) r6
            java.lang.Object r7 = r0.get(r5)
            java.util.List r7 = (java.util.List) r7
            if (r7 == 0) goto L_0x03ae
            boolean r17 = r7.isEmpty()
            if (r17 == 0) goto L_0x0326
            goto L_0x03ae
        L_0x0326:
            com.google.android.gms.measurement.internal.w8 r5 = r10.f6214b
            com.google.android.gms.measurement.internal.y8 r5 = r5.f0()
            r17 = r0
            java.util.List r0 = r6.zzk()
            java.util.List r0 = r5.I(r0, r7)
            boolean r5 = r0.isEmpty()
            if (r5 != 0) goto L_0x03aa
            com.google.android.gms.internal.measurement.zzjv r5 = r6.zzbv()
            com.google.android.gms.internal.measurement.zzgc r5 = (com.google.android.gms.internal.measurement.zzgc) r5
            r5.zze()
            r5.zzb(r0)
            com.google.android.gms.measurement.internal.w8 r0 = r10.f6214b
            com.google.android.gms.measurement.internal.y8 r0 = r0.f0()
            r19 = r1
            java.util.List r1 = r6.zzn()
            java.util.List r0 = r0.I(r1, r7)
            r5.zzf()
            r5.zzd(r0)
            r0 = 0
        L_0x035f:
            int r1 = r6.zza()
            if (r0 >= r1) goto L_0x037d
            com.google.android.gms.internal.measurement.zzfm r1 = r6.zze(r0)
            int r1 = r1.zza()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            boolean r1 = r7.contains(r1)
            if (r1 == 0) goto L_0x037a
            r5.zzg(r0)
        L_0x037a:
            int r0 = r0 + 1
            goto L_0x035f
        L_0x037d:
            r0 = 0
        L_0x037e:
            int r1 = r6.zzc()
            if (r0 >= r1) goto L_0x039c
            com.google.android.gms.internal.measurement.zzgf r1 = r6.zzi(r0)
            int r1 = r1.zzb()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            boolean r1 = r7.contains(r1)
            if (r1 == 0) goto L_0x0399
            r5.zzh(r0)
        L_0x0399:
            int r0 = r0 + 1
            goto L_0x037e
        L_0x039c:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            com.google.android.gms.internal.measurement.zzjz r1 = r5.zzaA()
            com.google.android.gms.internal.measurement.zzgd r1 = (com.google.android.gms.internal.measurement.zzgd) r1
            r3.put(r0, r1)
            goto L_0x03b5
        L_0x03aa:
            r0 = r17
            goto L_0x02fc
        L_0x03ae:
            r17 = r0
            r19 = r1
            r3.put(r5, r6)
        L_0x03b5:
            r0 = r17
            r1 = r19
            goto L_0x02fc
        L_0x03bb:
            r0 = r3
            goto L_0x03c4
        L_0x03bd:
            if (r5 == 0) goto L_0x03c2
            r5.close()
        L_0x03c2:
            throw r0
        L_0x03c3:
            r0 = r13
        L_0x03c4:
            java.util.Iterator r17 = r2.iterator()
        L_0x03c8:
            boolean r1 = r17.hasNext()
            if (r1 == 0) goto L_0x024b
            java.lang.Object r1 = r17.next()
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r19 = r1.intValue()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r19)
            java.lang.Object r1 = r0.get(r1)
            com.google.android.gms.internal.measurement.zzgd r1 = (com.google.android.gms.internal.measurement.zzgd) r1
            java.util.BitSet r5 = new java.util.BitSet
            r5.<init>()
            java.util.BitSet r6 = new java.util.BitSet
            r6.<init>()
            androidx.collection.a r7 = new androidx.collection.a
            r7.<init>()
            if (r1 == 0) goto L_0x0430
            int r2 = r1.zza()
            if (r2 != 0) goto L_0x03fa
            goto L_0x0430
        L_0x03fa:
            java.util.List r2 = r1.zzj()
            java.util.Iterator r2 = r2.iterator()
        L_0x0402:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0430
            java.lang.Object r3 = r2.next()
            com.google.android.gms.internal.measurement.zzfm r3 = (com.google.android.gms.internal.measurement.zzfm) r3
            boolean r4 = r3.zzh()
            if (r4 == 0) goto L_0x0402
            int r4 = r3.zza()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            boolean r21 = r3.zzg()
            if (r21 == 0) goto L_0x042b
            long r21 = r3.zzb()
            java.lang.Long r3 = java.lang.Long.valueOf(r21)
            goto L_0x042c
        L_0x042b:
            r3 = 0
        L_0x042c:
            r7.put(r4, r3)
            goto L_0x0402
        L_0x0430:
            androidx.collection.a r4 = new androidx.collection.a
            r4.<init>()
            if (r1 == 0) goto L_0x0480
            int r2 = r1.zzc()
            if (r2 != 0) goto L_0x043e
            goto L_0x0480
        L_0x043e:
            java.util.List r2 = r1.zzm()
            java.util.Iterator r2 = r2.iterator()
        L_0x0446:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0480
            java.lang.Object r3 = r2.next()
            com.google.android.gms.internal.measurement.zzgf r3 = (com.google.android.gms.internal.measurement.zzgf) r3
            boolean r21 = r3.zzi()
            if (r21 == 0) goto L_0x0446
            int r21 = r3.zza()
            if (r21 <= 0) goto L_0x0446
            int r21 = r3.zzb()
            r22 = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r21)
            int r21 = r3.zza()
            r23 = r2
            int r2 = r21 + -1
            long r2 = r3.zzc(r2)
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r4.put(r0, r2)
            r0 = r22
            r2 = r23
            goto L_0x0446
        L_0x0480:
            r22 = r0
            if (r1 == 0) goto L_0x04d5
            r0 = 0
        L_0x0485:
            int r2 = r1.zzd()
            int r2 = r2 * 64
            if (r0 >= r2) goto L_0x04d5
            java.util.List r2 = r1.zzn()
            boolean r2 = com.google.android.gms.measurement.internal.y8.N(r2, r0)
            if (r2 == 0) goto L_0x04c3
            com.google.android.gms.measurement.internal.n4 r2 = r10.f5994a
            com.google.android.gms.measurement.internal.j3 r2 = r2.d()
            com.google.android.gms.measurement.internal.h3 r2 = r2.v()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r19)
            r21 = r8
            java.lang.Integer r8 = java.lang.Integer.valueOf(r0)
            r23 = r9
            java.lang.String r9 = "Filter already evaluated. audience ID, filter ID"
            r2.c(r9, r3, r8)
            r6.set(r0)
            java.util.List r2 = r1.zzk()
            boolean r2 = com.google.android.gms.measurement.internal.y8.N(r2, r0)
            if (r2 == 0) goto L_0x04c7
            r5.set(r0)
            goto L_0x04ce
        L_0x04c3:
            r21 = r8
            r23 = r9
        L_0x04c7:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            r7.remove(r2)
        L_0x04ce:
            int r0 = r0 + 1
            r8 = r21
            r9 = r23
            goto L_0x0485
        L_0x04d5:
            r21 = r8
            r23 = r9
            java.lang.Integer r0 = java.lang.Integer.valueOf(r19)
            java.lang.Object r1 = r13.get(r0)
            r8 = r1
            com.google.android.gms.internal.measurement.zzgd r8 = (com.google.android.gms.internal.measurement.zzgd) r8
            if (r15 == 0) goto L_0x0544
            if (r14 == 0) goto L_0x0544
            java.lang.Object r0 = r12.get(r0)
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L_0x0544
            java.lang.Long r1 = r10.f6370h
            if (r1 == 0) goto L_0x0544
            java.lang.Long r1 = r10.f6369g
            if (r1 != 0) goto L_0x04f9
            goto L_0x0544
        L_0x04f9:
            java.util.Iterator r0 = r0.iterator()
        L_0x04fd:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0544
            java.lang.Object r1 = r0.next()
            com.google.android.gms.internal.measurement.zzej r1 = (com.google.android.gms.internal.measurement.zzej) r1
            int r2 = r1.zzb()
            java.lang.Long r3 = r10.f6370h
            long r24 = r3.longValue()
            r26 = 1000(0x3e8, double:4.94E-321)
            long r24 = r24 / r26
            boolean r1 = r1.zzm()
            if (r1 == 0) goto L_0x0525
            java.lang.Long r1 = r10.f6369g
            long r24 = r1.longValue()
            long r24 = r24 / r26
        L_0x0525:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            boolean r2 = r7.containsKey(r1)
            if (r2 == 0) goto L_0x0536
            java.lang.Long r2 = java.lang.Long.valueOf(r24)
            r7.put(r1, r2)
        L_0x0536:
            boolean r2 = r4.containsKey(r1)
            if (r2 == 0) goto L_0x04fd
            java.lang.Long r2 = java.lang.Long.valueOf(r24)
            r4.put(r1, r2)
            goto L_0x04fd
        L_0x0544:
            com.google.android.gms.measurement.internal.l9 r0 = new com.google.android.gms.measurement.internal.l9
            java.lang.String r3 = r10.f6366d
            r9 = 0
            r1 = r0
            r2 = r64
            r24 = r4
            r4 = r8
            r8 = 0
            r28 = r20
            r18 = r12
            r65 = r13
            r12 = r21
            r13 = r8
            r8 = r24
            r29 = r23
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            java.util.Map r1 = r10.f6368f
            java.lang.Integer r2 = java.lang.Integer.valueOf(r19)
            r1.put(r2, r0)
            r13 = r65
            r8 = r12
            r12 = r18
            r0 = r22
            r9 = r29
            goto L_0x03c8
        L_0x0574:
            boolean r0 = r66.isEmpty()
            java.lang.String r1 = "Skipping failed audience ID"
            if (r0 == 0) goto L_0x0580
        L_0x057c:
            r26 = r11
            goto L_0x07f6
        L_0x0580:
            com.google.android.gms.measurement.internal.m9 r2 = new com.google.android.gms.measurement.internal.m9
            r2.<init>(r10, r13)
            androidx.collection.a r3 = new androidx.collection.a
            r3.<init>()
            java.util.Iterator r4 = r66.iterator()
        L_0x058e:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x057c
            java.lang.Object r0 = r4.next()
            com.google.android.gms.internal.measurement.zzfo r0 = (com.google.android.gms.internal.measurement.zzfo) r0
            java.lang.String r5 = r10.f6366d
            com.google.android.gms.internal.measurement.zzfo r5 = r2.a(r5, r0)
            if (r5 == 0) goto L_0x07f3
            com.google.android.gms.measurement.internal.w8 r6 = r10.f6214b
            com.google.android.gms.measurement.internal.j r6 = r6.V()
            java.lang.String r7 = r10.f6366d
            java.lang.String r8 = r5.zzh()
            java.lang.String r9 = r0.zzh()
            com.google.android.gms.measurement.internal.p r9 = r6.X(r7, r9)
            if (r9 != 0) goto L_0x05f7
            com.google.android.gms.measurement.internal.n4 r9 = r6.f5994a
            com.google.android.gms.measurement.internal.j3 r9 = r9.d()
            com.google.android.gms.measurement.internal.h3 r9 = r9.w()
            java.lang.Object r14 = com.google.android.gms.measurement.internal.j3.z(r7)
            com.google.android.gms.measurement.internal.n4 r6 = r6.f5994a
            com.google.android.gms.measurement.internal.e3 r6 = r6.D()
            java.lang.String r6 = r6.q(r8)
            java.lang.String r8 = "Event aggregate wasn't created during raw event logging. appId, event"
            r9.c(r8, r14, r6)
            com.google.android.gms.measurement.internal.p r6 = new com.google.android.gms.measurement.internal.p
            r30 = r6
            java.lang.String r32 = r0.zzh()
            r33 = 1
            r35 = 1
            r37 = 1
            long r39 = r0.zzd()
            r41 = 0
            r43 = 0
            r44 = 0
            r45 = 0
            r46 = 0
            r31 = r7
            r30.<init>(r31, r32, r33, r35, r37, r39, r41, r43, r44, r45, r46)
            goto L_0x062c
        L_0x05f7:
            com.google.android.gms.measurement.internal.p r6 = new com.google.android.gms.measurement.internal.p
            r47 = r6
            java.lang.String r0 = r9.f6302a
            r48 = r0
            java.lang.String r0 = r9.f6303b
            r49 = r0
            long r7 = r9.f6304c
            r14 = 1
            long r50 = r7 + r14
            long r7 = r9.f6305d
            long r52 = r7 + r14
            long r7 = r9.f6306e
            long r54 = r7 + r14
            long r7 = r9.f6307f
            r56 = r7
            long r7 = r9.f6308g
            r58 = r7
            java.lang.Long r0 = r9.f6309h
            r60 = r0
            java.lang.Long r0 = r9.f6310i
            r61 = r0
            java.lang.Long r0 = r9.f6311j
            r62 = r0
            java.lang.Boolean r0 = r9.f6312k
            r63 = r0
            r47.<init>(r48, r49, r50, r52, r54, r56, r58, r60, r61, r62, r63)
        L_0x062c:
            com.google.android.gms.measurement.internal.w8 r0 = r10.f6214b
            com.google.android.gms.measurement.internal.j r0 = r0.V()
            r0.q(r6)
            long r7 = r6.f6304c
            java.lang.String r9 = r5.zzh()
            java.lang.Object r0 = r3.get(r9)
            java.util.Map r0 = (java.util.Map) r0
            if (r0 != 0) goto L_0x074a
            com.google.android.gms.measurement.internal.w8 r0 = r10.f6214b
            com.google.android.gms.measurement.internal.j r14 = r0.V()
            java.lang.String r15 = r10.f6366d
            r14.i()
            r14.h()
            com.google.android.gms.common.internal.s.g(r15)
            com.google.android.gms.common.internal.s.g(r9)
            androidx.collection.a r13 = new androidx.collection.a
            r13.<init>()
            android.database.sqlite.SQLiteDatabase r17 = r14.R()
            r25 = r2
            r2 = 2
            java.lang.String[] r0 = new java.lang.String[r2]     // Catch:{ SQLiteException -> 0x071e, all -> 0x071b }
            r2 = r28
            r18 = 0
            r0[r18] = r2     // Catch:{ SQLiteException -> 0x0717, all -> 0x071b }
            r18 = 1
            r0[r18] = r16     // Catch:{ SQLiteException -> 0x0717, all -> 0x071b }
            java.lang.String[] r21 = new java.lang.String[]{r15, r9}     // Catch:{ SQLiteException -> 0x0717, all -> 0x071b }
            java.lang.String r18 = "event_filters"
            java.lang.String r20 = "app_id=? AND event_name=?"
            r22 = 0
            r23 = 0
            r24 = 0
            r19 = r0
            r66 = r4
            android.database.Cursor r4 = r17.query(r18, r19, r20, r21, r22, r23, r24)     // Catch:{ SQLiteException -> 0x0713, all -> 0x071b }
            boolean r0 = r4.moveToFirst()     // Catch:{ SQLiteException -> 0x070b }
            if (r0 == 0) goto L_0x06fb
            r26 = r11
        L_0x068d:
            r11 = 1
            byte[] r0 = r4.getBlob(r11)     // Catch:{ SQLiteException -> 0x06f7 }
            com.google.android.gms.internal.measurement.zzei r11 = com.google.android.gms.internal.measurement.zzej.zzc()     // Catch:{ IOException -> 0x06ca }
            com.google.android.gms.internal.measurement.zzlf r0 = com.google.android.gms.measurement.internal.y8.D(r11, r0)     // Catch:{ IOException -> 0x06ca }
            com.google.android.gms.internal.measurement.zzei r0 = (com.google.android.gms.internal.measurement.zzei) r0     // Catch:{ IOException -> 0x06ca }
            com.google.android.gms.internal.measurement.zzjz r0 = r0.zzaA()     // Catch:{ IOException -> 0x06ca }
            com.google.android.gms.internal.measurement.zzej r0 = (com.google.android.gms.internal.measurement.zzej) r0     // Catch:{ IOException -> 0x06ca }
            r11 = 0
            int r17 = r4.getInt(r11)     // Catch:{ SQLiteException -> 0x06f7 }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r17)     // Catch:{ SQLiteException -> 0x06f7 }
            java.lang.Object r17 = r13.get(r11)     // Catch:{ SQLiteException -> 0x06f7 }
            java.util.List r17 = (java.util.List) r17     // Catch:{ SQLiteException -> 0x06f7 }
            if (r17 != 0) goto L_0x06be
            r28 = r2
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x06f5 }
            r2.<init>()     // Catch:{ SQLiteException -> 0x06f5 }
            r13.put(r11, r2)     // Catch:{ SQLiteException -> 0x06f5 }
            goto L_0x06c2
        L_0x06be:
            r28 = r2
            r2 = r17
        L_0x06c2:
            r2.add(r0)     // Catch:{ SQLiteException -> 0x06f5 }
            r17 = r13
            r13 = r29
            goto L_0x06e2
        L_0x06ca:
            r0 = move-exception
            r28 = r2
            com.google.android.gms.measurement.internal.n4 r2 = r14.f5994a     // Catch:{ SQLiteException -> 0x06f5 }
            com.google.android.gms.measurement.internal.j3 r2 = r2.d()     // Catch:{ SQLiteException -> 0x06f5 }
            com.google.android.gms.measurement.internal.h3 r2 = r2.r()     // Catch:{ SQLiteException -> 0x06f5 }
            java.lang.Object r11 = com.google.android.gms.measurement.internal.j3.z(r15)     // Catch:{ SQLiteException -> 0x06f5 }
            r17 = r13
            r13 = r29
            r2.c(r13, r11, r0)     // Catch:{ SQLiteException -> 0x0709 }
        L_0x06e2:
            boolean r0 = r4.moveToNext()     // Catch:{ SQLiteException -> 0x0709 }
            if (r0 != 0) goto L_0x06ee
            r4.close()
            r0 = r17
            goto L_0x073e
        L_0x06ee:
            r29 = r13
            r13 = r17
            r2 = r28
            goto L_0x068d
        L_0x06f5:
            r0 = move-exception
            goto L_0x0710
        L_0x06f7:
            r0 = move-exception
            r28 = r2
            goto L_0x0710
        L_0x06fb:
            r28 = r2
            r26 = r11
            r13 = r29
            java.util.Map r0 = java.util.Collections.emptyMap()     // Catch:{ SQLiteException -> 0x0709 }
        L_0x0705:
            r4.close()
            goto L_0x073e
        L_0x0709:
            r0 = move-exception
            goto L_0x0726
        L_0x070b:
            r0 = move-exception
            r28 = r2
            r26 = r11
        L_0x0710:
            r13 = r29
            goto L_0x0726
        L_0x0713:
            r0 = move-exception
            r28 = r2
            goto L_0x0721
        L_0x0717:
            r0 = move-exception
            r28 = r2
            goto L_0x071f
        L_0x071b:
            r0 = move-exception
            r5 = 0
            goto L_0x0744
        L_0x071e:
            r0 = move-exception
        L_0x071f:
            r66 = r4
        L_0x0721:
            r26 = r11
            r13 = r29
            r4 = 0
        L_0x0726:
            com.google.android.gms.measurement.internal.n4 r2 = r14.f5994a     // Catch:{ all -> 0x0742 }
            com.google.android.gms.measurement.internal.j3 r2 = r2.d()     // Catch:{ all -> 0x0742 }
            com.google.android.gms.measurement.internal.h3 r2 = r2.r()     // Catch:{ all -> 0x0742 }
            java.lang.Object r11 = com.google.android.gms.measurement.internal.j3.z(r15)     // Catch:{ all -> 0x0742 }
            r2.c(r12, r11, r0)     // Catch:{ all -> 0x0742 }
            java.util.Map r0 = java.util.Collections.emptyMap()     // Catch:{ all -> 0x0742 }
            if (r4 == 0) goto L_0x073e
            goto L_0x0705
        L_0x073e:
            r3.put(r9, r0)
            goto L_0x0752
        L_0x0742:
            r0 = move-exception
            r5 = r4
        L_0x0744:
            if (r5 == 0) goto L_0x0749
            r5.close()
        L_0x0749:
            throw r0
        L_0x074a:
            r25 = r2
            r66 = r4
            r26 = r11
            r13 = r29
        L_0x0752:
            java.util.Set r2 = r0.keySet()
            java.util.Iterator r2 = r2.iterator()
        L_0x075a:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x07eb
            java.lang.Object r4 = r2.next()
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            java.util.Set r9 = r10.f6367e
            java.lang.Integer r11 = java.lang.Integer.valueOf(r4)
            boolean r9 = r9.contains(r11)
            if (r9 == 0) goto L_0x0784
            com.google.android.gms.measurement.internal.n4 r4 = r10.f5994a
            com.google.android.gms.measurement.internal.j3 r4 = r4.d()
            com.google.android.gms.measurement.internal.h3 r4 = r4.v()
            r4.b(r1, r11)
            goto L_0x075a
        L_0x0784:
            java.lang.Object r9 = r0.get(r11)
            java.util.List r9 = (java.util.List) r9
            java.util.Iterator r9 = r9.iterator()
            r11 = 1
        L_0x078f:
            boolean r14 = r9.hasNext()
            if (r14 == 0) goto L_0x07da
            java.lang.Object r11 = r9.next()
            com.google.android.gms.internal.measurement.zzej r11 = (com.google.android.gms.internal.measurement.zzej) r11
            com.google.android.gms.measurement.internal.n9 r14 = new com.google.android.gms.measurement.internal.n9
            java.lang.String r15 = r10.f6366d
            r14.<init>(r10, r15, r4, r11)
            java.lang.Long r15 = r10.f6369g
            r27 = r0
            java.lang.Long r0 = r10.f6370h
            int r11 = r11.zzb()
            boolean r24 = r10.o(r4, r11)
            r17 = r14
            r18 = r15
            r19 = r0
            r20 = r5
            r21 = r7
            r23 = r6
            boolean r11 = r17.k(r18, r19, r20, r21, r23, r24)
            if (r11 == 0) goto L_0x07d0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            com.google.android.gms.measurement.internal.l9 r0 = r10.n(r0)
            r0.c(r14)
            r0 = r27
            goto L_0x078f
        L_0x07d0:
            java.util.Set r0 = r10.f6367e
            java.lang.Integer r9 = java.lang.Integer.valueOf(r4)
            r0.add(r9)
            goto L_0x07dc
        L_0x07da:
            r27 = r0
        L_0x07dc:
            if (r11 != 0) goto L_0x07e7
            java.util.Set r0 = r10.f6367e
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r0.add(r4)
        L_0x07e7:
            r0 = r27
            goto L_0x075a
        L_0x07eb:
            r4 = r66
            r29 = r13
            r2 = r25
            r11 = r26
        L_0x07f3:
            r13 = 0
            goto L_0x058e
        L_0x07f6:
            boolean r0 = r67.isEmpty()
            if (r0 == 0) goto L_0x07fe
            goto L_0x0a08
        L_0x07fe:
            androidx.collection.a r2 = new androidx.collection.a
            r2.<init>()
            java.util.Iterator r3 = r67.iterator()
        L_0x0807:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0a08
            java.lang.Object r0 = r3.next()
            r4 = r0
            com.google.android.gms.internal.measurement.zzgh r4 = (com.google.android.gms.internal.measurement.zzgh) r4
            java.lang.String r5 = r4.zzf()
            java.lang.Object r0 = r2.get(r5)
            java.util.Map r0 = (java.util.Map) r0
            if (r0 != 0) goto L_0x08ea
            com.google.android.gms.measurement.internal.w8 r0 = r10.f6214b
            com.google.android.gms.measurement.internal.j r6 = r0.V()
            java.lang.String r7 = r10.f6366d
            r6.i()
            r6.h()
            com.google.android.gms.common.internal.s.g(r7)
            com.google.android.gms.common.internal.s.g(r5)
            androidx.collection.a r8 = new androidx.collection.a
            r8.<init>()
            android.database.sqlite.SQLiteDatabase r17 = r6.R()
            r9 = 2
            java.lang.String[] r0 = new java.lang.String[r9]     // Catch:{ SQLiteException -> 0x08c3, all -> 0x08c0 }
            r9 = 0
            r0[r9] = r28     // Catch:{ SQLiteException -> 0x08c3, all -> 0x08c0 }
            r9 = 1
            r0[r9] = r16     // Catch:{ SQLiteException -> 0x08c3, all -> 0x08c0 }
            java.lang.String[] r21 = new java.lang.String[]{r7, r5}     // Catch:{ SQLiteException -> 0x08c3, all -> 0x08c0 }
            java.lang.String r18 = "property_filters"
            java.lang.String r20 = "app_id=? AND property_name=?"
            r22 = 0
            r23 = 0
            r24 = 0
            r19 = r0
            android.database.Cursor r9 = r17.query(r18, r19, r20, r21, r22, r23, r24)     // Catch:{ SQLiteException -> 0x08c3, all -> 0x08c0 }
            boolean r0 = r9.moveToFirst()     // Catch:{ SQLiteException -> 0x08bd }
            if (r0 == 0) goto L_0x08b2
        L_0x0860:
            r11 = 1
            byte[] r0 = r9.getBlob(r11)     // Catch:{ SQLiteException -> 0x08bd }
            com.google.android.gms.internal.measurement.zzer r13 = com.google.android.gms.internal.measurement.zzes.zzc()     // Catch:{ IOException -> 0x0892 }
            com.google.android.gms.internal.measurement.zzlf r0 = com.google.android.gms.measurement.internal.y8.D(r13, r0)     // Catch:{ IOException -> 0x0892 }
            com.google.android.gms.internal.measurement.zzer r0 = (com.google.android.gms.internal.measurement.zzer) r0     // Catch:{ IOException -> 0x0892 }
            com.google.android.gms.internal.measurement.zzjz r0 = r0.zzaA()     // Catch:{ IOException -> 0x0892 }
            com.google.android.gms.internal.measurement.zzes r0 = (com.google.android.gms.internal.measurement.zzes) r0     // Catch:{ IOException -> 0x0892 }
            r13 = 0
            int r14 = r9.getInt(r13)     // Catch:{ SQLiteException -> 0x08bb }
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)     // Catch:{ SQLiteException -> 0x08bb }
            java.lang.Object r15 = r8.get(r14)     // Catch:{ SQLiteException -> 0x08bb }
            java.util.List r15 = (java.util.List) r15     // Catch:{ SQLiteException -> 0x08bb }
            if (r15 != 0) goto L_0x088e
            java.util.ArrayList r15 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x08bb }
            r15.<init>()     // Catch:{ SQLiteException -> 0x08bb }
            r8.put(r14, r15)     // Catch:{ SQLiteException -> 0x08bb }
        L_0x088e:
            r15.add(r0)     // Catch:{ SQLiteException -> 0x08bb }
            goto L_0x08a7
        L_0x0892:
            r0 = move-exception
            r13 = 0
            com.google.android.gms.measurement.internal.n4 r14 = r6.f5994a     // Catch:{ SQLiteException -> 0x08bb }
            com.google.android.gms.measurement.internal.j3 r14 = r14.d()     // Catch:{ SQLiteException -> 0x08bb }
            com.google.android.gms.measurement.internal.h3 r14 = r14.r()     // Catch:{ SQLiteException -> 0x08bb }
            java.lang.String r15 = "Failed to merge filter"
            java.lang.Object r11 = com.google.android.gms.measurement.internal.j3.z(r7)     // Catch:{ SQLiteException -> 0x08bb }
            r14.c(r15, r11, r0)     // Catch:{ SQLiteException -> 0x08bb }
        L_0x08a7:
            boolean r0 = r9.moveToNext()     // Catch:{ SQLiteException -> 0x08bb }
            if (r0 != 0) goto L_0x0860
            r9.close()
            r0 = r8
            goto L_0x08de
        L_0x08b2:
            r13 = 0
            java.util.Map r0 = java.util.Collections.emptyMap()     // Catch:{ SQLiteException -> 0x08bb }
        L_0x08b7:
            r9.close()
            goto L_0x08de
        L_0x08bb:
            r0 = move-exception
            goto L_0x08c6
        L_0x08bd:
            r0 = move-exception
            r13 = 0
            goto L_0x08c6
        L_0x08c0:
            r0 = move-exception
            r5 = 0
            goto L_0x08e4
        L_0x08c3:
            r0 = move-exception
            r13 = 0
            r9 = 0
        L_0x08c6:
            com.google.android.gms.measurement.internal.n4 r6 = r6.f5994a     // Catch:{ all -> 0x08e2 }
            com.google.android.gms.measurement.internal.j3 r6 = r6.d()     // Catch:{ all -> 0x08e2 }
            com.google.android.gms.measurement.internal.h3 r6 = r6.r()     // Catch:{ all -> 0x08e2 }
            java.lang.Object r7 = com.google.android.gms.measurement.internal.j3.z(r7)     // Catch:{ all -> 0x08e2 }
            r6.c(r12, r7, r0)     // Catch:{ all -> 0x08e2 }
            java.util.Map r0 = java.util.Collections.emptyMap()     // Catch:{ all -> 0x08e2 }
            if (r9 == 0) goto L_0x08de
            goto L_0x08b7
        L_0x08de:
            r2.put(r5, r0)
            goto L_0x08eb
        L_0x08e2:
            r0 = move-exception
            r5 = r9
        L_0x08e4:
            if (r5 == 0) goto L_0x08e9
            r5.close()
        L_0x08e9:
            throw r0
        L_0x08ea:
            r13 = 0
        L_0x08eb:
            java.util.Set r5 = r0.keySet()
            java.util.Iterator r5 = r5.iterator()
        L_0x08f3:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x0807
            java.lang.Object r6 = r5.next()
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            java.util.Set r7 = r10.f6367e
            java.lang.Integer r8 = java.lang.Integer.valueOf(r6)
            boolean r7 = r7.contains(r8)
            if (r7 == 0) goto L_0x091e
            com.google.android.gms.measurement.internal.n4 r0 = r10.f5994a
            com.google.android.gms.measurement.internal.j3 r0 = r0.d()
            com.google.android.gms.measurement.internal.h3 r0 = r0.v()
            r0.b(r1, r8)
            goto L_0x0807
        L_0x091e:
            java.lang.Object r7 = r0.get(r8)
            java.util.List r7 = (java.util.List) r7
            java.util.Iterator r7 = r7.iterator()
            r8 = 1
        L_0x0929:
            boolean r9 = r7.hasNext()
            if (r9 == 0) goto L_0x09fa
            java.lang.Object r8 = r7.next()
            com.google.android.gms.internal.measurement.zzes r8 = (com.google.android.gms.internal.measurement.zzes) r8
            com.google.android.gms.measurement.internal.n4 r9 = r10.f5994a
            com.google.android.gms.measurement.internal.j3 r9 = r9.d()
            java.lang.String r9 = r9.C()
            r11 = 2
            boolean r9 = android.util.Log.isLoggable(r9, r11)
            if (r9 == 0) goto L_0x0990
            com.google.android.gms.measurement.internal.n4 r9 = r10.f5994a
            com.google.android.gms.measurement.internal.j3 r9 = r9.d()
            com.google.android.gms.measurement.internal.h3 r9 = r9.v()
            java.lang.Integer r14 = java.lang.Integer.valueOf(r6)
            boolean r15 = r8.zzj()
            if (r15 == 0) goto L_0x0963
            int r15 = r8.zza()
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)
            goto L_0x0964
        L_0x0963:
            r15 = 0
        L_0x0964:
            com.google.android.gms.measurement.internal.n4 r11 = r10.f5994a
            com.google.android.gms.measurement.internal.e3 r11 = r11.D()
            java.lang.String r13 = r8.zze()
            java.lang.String r11 = r11.s(r13)
            java.lang.String r13 = "Evaluating filter. audience, filter, property"
            r9.d(r13, r14, r15, r11)
            com.google.android.gms.measurement.internal.n4 r9 = r10.f5994a
            com.google.android.gms.measurement.internal.j3 r9 = r9.d()
            com.google.android.gms.measurement.internal.h3 r9 = r9.v()
            com.google.android.gms.measurement.internal.w8 r11 = r10.f6214b
            com.google.android.gms.measurement.internal.y8 r11 = r11.f0()
            java.lang.String r11 = r11.G(r8)
            java.lang.String r13 = "Filter definition"
            r9.b(r13, r11)
        L_0x0990:
            boolean r9 = r8.zzj()
            if (r9 == 0) goto L_0x09d0
            int r9 = r8.zza()
            r11 = 256(0x100, float:3.59E-43)
            if (r9 <= r11) goto L_0x099f
            goto L_0x09d0
        L_0x099f:
            com.google.android.gms.measurement.internal.p9 r9 = new com.google.android.gms.measurement.internal.p9
            java.lang.String r11 = r10.f6366d
            r9.<init>(r10, r11, r6, r8)
            java.lang.Long r11 = r10.f6369g
            java.lang.Long r13 = r10.f6370h
            int r8 = r8.zza()
            boolean r8 = r10.o(r6, r8)
            boolean r8 = r9.k(r11, r13, r4, r8)
            if (r8 == 0) goto L_0x09c6
            java.lang.Integer r11 = java.lang.Integer.valueOf(r6)
            com.google.android.gms.measurement.internal.l9 r11 = r10.n(r11)
            r11.c(r9)
            r13 = 0
            goto L_0x0929
        L_0x09c6:
            java.util.Set r7 = r10.f6367e
            java.lang.Integer r9 = java.lang.Integer.valueOf(r6)
            r7.add(r9)
            goto L_0x09fa
        L_0x09d0:
            com.google.android.gms.measurement.internal.n4 r7 = r10.f5994a
            com.google.android.gms.measurement.internal.j3 r7 = r7.d()
            com.google.android.gms.measurement.internal.h3 r7 = r7.w()
            java.lang.String r9 = r10.f6366d
            java.lang.Object r9 = com.google.android.gms.measurement.internal.j3.z(r9)
            boolean r11 = r8.zzj()
            if (r11 == 0) goto L_0x09ef
            int r8 = r8.zza()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            goto L_0x09f0
        L_0x09ef:
            r8 = 0
        L_0x09f0:
            java.lang.String r8 = java.lang.String.valueOf(r8)
            java.lang.String r11 = "Invalid property filter ID. appId, id"
            r7.c(r11, r9, r8)
            goto L_0x09fc
        L_0x09fa:
            if (r8 != 0) goto L_0x0a05
        L_0x09fc:
            java.util.Set r7 = r10.f6367e
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r7.add(r6)
        L_0x0a05:
            r13 = 0
            goto L_0x08f3
        L_0x0a08:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Map r0 = r10.f6368f
            java.util.Set r0 = r0.keySet()
            java.util.Set r2 = r10.f6367e
            r0.removeAll(r2)
            java.util.Iterator r2 = r0.iterator()
        L_0x0a1c:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0ab5
            java.lang.Object r0 = r2.next()
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            java.util.Map r3 = r10.f6368f
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            java.lang.Object r3 = r3.get(r4)
            com.google.android.gms.measurement.internal.l9 r3 = (com.google.android.gms.measurement.internal.l9) r3
            com.google.android.gms.common.internal.s.k(r3)
            com.google.android.gms.internal.measurement.zzfk r0 = r3.a(r0)
            r1.add(r0)
            com.google.android.gms.measurement.internal.w8 r3 = r10.f6214b
            com.google.android.gms.measurement.internal.j r3 = r3.V()
            java.lang.String r5 = r10.f6366d
            com.google.android.gms.internal.measurement.zzgd r0 = r0.zzd()
            r3.i()
            r3.h()
            com.google.android.gms.common.internal.s.g(r5)
            com.google.android.gms.common.internal.s.k(r0)
            byte[] r0 = r0.zzbs()
            android.content.ContentValues r6 = new android.content.ContentValues
            r6.<init>()
            java.lang.String r7 = "app_id"
            r6.put(r7, r5)
            r7 = r28
            r6.put(r7, r4)
            r4 = r26
            r6.put(r4, r0)
            android.database.sqlite.SQLiteDatabase r0 = r3.R()     // Catch:{ SQLiteException -> 0x0a9a }
            java.lang.String r8 = "audience_filter_values"
            r9 = 5
            r11 = 0
            long r8 = r0.insertWithOnConflict(r8, r11, r6, r9)     // Catch:{ SQLiteException -> 0x0a98 }
            r12 = -1
            int r0 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r0 != 0) goto L_0x0aaf
            com.google.android.gms.measurement.internal.n4 r0 = r3.f5994a     // Catch:{ SQLiteException -> 0x0a98 }
            com.google.android.gms.measurement.internal.j3 r0 = r0.d()     // Catch:{ SQLiteException -> 0x0a98 }
            com.google.android.gms.measurement.internal.h3 r0 = r0.r()     // Catch:{ SQLiteException -> 0x0a98 }
            java.lang.String r6 = "Failed to insert filter results (got -1). appId"
            java.lang.Object r8 = com.google.android.gms.measurement.internal.j3.z(r5)     // Catch:{ SQLiteException -> 0x0a98 }
            r0.b(r6, r8)     // Catch:{ SQLiteException -> 0x0a98 }
            goto L_0x0aaf
        L_0x0a98:
            r0 = move-exception
            goto L_0x0a9c
        L_0x0a9a:
            r0 = move-exception
            r11 = 0
        L_0x0a9c:
            com.google.android.gms.measurement.internal.n4 r3 = r3.f5994a
            com.google.android.gms.measurement.internal.j3 r3 = r3.d()
            com.google.android.gms.measurement.internal.h3 r3 = r3.r()
            java.lang.String r6 = "Error storing filter results. appId"
            java.lang.Object r5 = com.google.android.gms.measurement.internal.j3.z(r5)
            r3.c(r6, r5, r0)
        L_0x0aaf:
            r26 = r4
            r28 = r7
            goto L_0x0a1c
        L_0x0ab5:
            return r1
        L_0x0ab6:
            r0 = move-exception
            r5 = r4
        L_0x0ab8:
            if (r5 == 0) goto L_0x0abd
            r5.close()
        L_0x0abd:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.q9.m(java.lang.String, java.util.List, java.util.List, java.lang.Long, java.lang.Long):java.util.List");
    }
}
