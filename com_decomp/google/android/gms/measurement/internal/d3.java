package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.os.Parcel;
import android.os.SystemClock;

public final class d3 extends z3 {

    /* renamed from: c  reason: collision with root package name */
    private final c3 f5904c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f5905d;

    d3(n4 n4Var) {
        super(n4Var);
        Context c10 = this.f5994a.c();
        this.f5994a.z();
        this.f5904c = new c3(this, c10, "google_app_measurement_local.db");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v4, resolved type: android.database.sqlite.SQLiteDatabase} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: android.database.sqlite.SQLiteDatabase} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v7, resolved type: android.database.sqlite.SQLiteDatabase} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v11, resolved type: android.database.sqlite.SQLiteDatabase} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v12, resolved type: android.database.sqlite.SQLiteDatabase} */
    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r2v1, types: [boolean, int] */
    /* JADX WARNING: type inference failed for: r8v0 */
    /* JADX WARNING: type inference failed for: r8v1, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r8v2 */
    /* JADX WARNING: type inference failed for: r8v3 */
    /* JADX WARNING: type inference failed for: r2v4 */
    /* JADX WARNING: type inference failed for: r8v6, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r8v8 */
    /* JADX WARNING: type inference failed for: r8v9 */
    /* JADX WARNING: type inference failed for: r8v10 */
    /* JADX WARNING: type inference failed for: r8v13 */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00c6 A[SYNTHETIC, Splitter:B:47:0x00c6] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00f2  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0111  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0124  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0129  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0119 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0119 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0119 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean x(int r17, byte[] r18) {
        /*
            r16 = this;
            r1 = r16
            r16.h()
            boolean r0 = r1.f5905d
            r2 = 0
            if (r0 == 0) goto L_0x000b
            return r2
        L_0x000b:
            android.content.ContentValues r3 = new android.content.ContentValues
            r3.<init>()
            java.lang.String r0 = "type"
            java.lang.Integer r4 = java.lang.Integer.valueOf(r17)
            r3.put(r0, r4)
            java.lang.String r0 = "entry"
            r4 = r18
            r3.put(r0, r4)
            com.google.android.gms.measurement.internal.n4 r0 = r1.f5994a
            r0.z()
            r4 = 5
            r5 = 0
            r6 = 5
        L_0x0028:
            if (r5 >= r4) goto L_0x012d
            r7 = 1
            r8 = 0
            android.database.sqlite.SQLiteDatabase r9 = r16.o()     // Catch:{ SQLiteFullException -> 0x00fb, SQLiteDatabaseLockedException -> 0x00e9, SQLiteException -> 0x00c2, all -> 0x00bf }
            if (r9 != 0) goto L_0x0035
            r1.f5905d = r7     // Catch:{ SQLiteFullException -> 0x00bb, SQLiteDatabaseLockedException -> 0x00ea, SQLiteException -> 0x00b7 }
            return r2
        L_0x0035:
            r9.beginTransaction()     // Catch:{ SQLiteFullException -> 0x00bb, SQLiteDatabaseLockedException -> 0x00ea, SQLiteException -> 0x00b7 }
            java.lang.String r0 = "select count(1) from messages"
            android.database.Cursor r10 = r9.rawQuery(r0, r8)     // Catch:{ SQLiteFullException -> 0x00bb, SQLiteDatabaseLockedException -> 0x00ea, SQLiteException -> 0x00b7 }
            r11 = 0
            if (r10 == 0) goto L_0x0054
            boolean r0 = r10.moveToFirst()     // Catch:{ SQLiteFullException -> 0x0052, SQLiteDatabaseLockedException -> 0x00b2, SQLiteException -> 0x0050, all -> 0x004d }
            if (r0 == 0) goto L_0x0054
            long r11 = r10.getLong(r2)     // Catch:{ SQLiteFullException -> 0x0052, SQLiteDatabaseLockedException -> 0x00b2, SQLiteException -> 0x0050, all -> 0x004d }
            goto L_0x0054
        L_0x004d:
            r0 = move-exception
            goto L_0x0121
        L_0x0050:
            r0 = move-exception
            goto L_0x00b9
        L_0x0052:
            r0 = move-exception
            goto L_0x00bd
        L_0x0054:
            java.lang.String r0 = "messages"
            r13 = 100000(0x186a0, double:4.94066E-319)
            int r15 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r15 < 0) goto L_0x009f
            com.google.android.gms.measurement.internal.n4 r15 = r1.f5994a     // Catch:{ SQLiteFullException -> 0x0052, SQLiteDatabaseLockedException -> 0x00b2, SQLiteException -> 0x0050, all -> 0x004d }
            com.google.android.gms.measurement.internal.j3 r15 = r15.d()     // Catch:{ SQLiteFullException -> 0x0052, SQLiteDatabaseLockedException -> 0x00b2, SQLiteException -> 0x0050, all -> 0x004d }
            com.google.android.gms.measurement.internal.h3 r15 = r15.r()     // Catch:{ SQLiteFullException -> 0x0052, SQLiteDatabaseLockedException -> 0x00b2, SQLiteException -> 0x0050, all -> 0x004d }
            java.lang.String r4 = "Data loss, local db full"
            r15.a(r4)     // Catch:{ SQLiteFullException -> 0x0052, SQLiteDatabaseLockedException -> 0x00b2, SQLiteException -> 0x0050, all -> 0x004d }
            long r13 = r13 - r11
            r11 = 1
            long r13 = r13 + r11
            java.lang.String[] r4 = new java.lang.String[r7]     // Catch:{ SQLiteFullException -> 0x0052, SQLiteDatabaseLockedException -> 0x00b2, SQLiteException -> 0x0050, all -> 0x004d }
            java.lang.String r11 = java.lang.Long.toString(r13)     // Catch:{ SQLiteFullException -> 0x0052, SQLiteDatabaseLockedException -> 0x00b2, SQLiteException -> 0x0050, all -> 0x004d }
            r4[r2] = r11     // Catch:{ SQLiteFullException -> 0x0052, SQLiteDatabaseLockedException -> 0x00b2, SQLiteException -> 0x0050, all -> 0x004d }
            java.lang.String r11 = "rowid in (select rowid from messages order by rowid asc limit ?)"
            int r4 = r9.delete(r0, r11, r4)     // Catch:{ SQLiteFullException -> 0x0052, SQLiteDatabaseLockedException -> 0x00b2, SQLiteException -> 0x0050, all -> 0x004d }
            long r11 = (long) r4     // Catch:{ SQLiteFullException -> 0x0052, SQLiteDatabaseLockedException -> 0x00b2, SQLiteException -> 0x0050, all -> 0x004d }
            int r4 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r4 == 0) goto L_0x009f
            com.google.android.gms.measurement.internal.n4 r4 = r1.f5994a     // Catch:{ SQLiteFullException -> 0x0052, SQLiteDatabaseLockedException -> 0x00b2, SQLiteException -> 0x0050, all -> 0x004d }
            com.google.android.gms.measurement.internal.j3 r4 = r4.d()     // Catch:{ SQLiteFullException -> 0x0052, SQLiteDatabaseLockedException -> 0x00b2, SQLiteException -> 0x0050, all -> 0x004d }
            com.google.android.gms.measurement.internal.h3 r4 = r4.r()     // Catch:{ SQLiteFullException -> 0x0052, SQLiteDatabaseLockedException -> 0x00b2, SQLiteException -> 0x0050, all -> 0x004d }
            java.lang.String r15 = "Different delete count than expected in local db. expected, received, difference"
            java.lang.Long r2 = java.lang.Long.valueOf(r13)     // Catch:{ SQLiteFullException -> 0x0052, SQLiteDatabaseLockedException -> 0x00b2, SQLiteException -> 0x0050, all -> 0x004d }
            java.lang.Long r7 = java.lang.Long.valueOf(r11)     // Catch:{ SQLiteFullException -> 0x0052, SQLiteDatabaseLockedException -> 0x00b2, SQLiteException -> 0x0050, all -> 0x004d }
            long r13 = r13 - r11
            java.lang.Long r11 = java.lang.Long.valueOf(r13)     // Catch:{ SQLiteFullException -> 0x0052, SQLiteDatabaseLockedException -> 0x00b2, SQLiteException -> 0x0050, all -> 0x004d }
            r4.d(r15, r2, r7, r11)     // Catch:{ SQLiteFullException -> 0x0052, SQLiteDatabaseLockedException -> 0x00b2, SQLiteException -> 0x0050, all -> 0x004d }
        L_0x009f:
            r9.insertOrThrow(r0, r8, r3)     // Catch:{ SQLiteFullException -> 0x0052, SQLiteDatabaseLockedException -> 0x00b2, SQLiteException -> 0x0050, all -> 0x004d }
            r9.setTransactionSuccessful()     // Catch:{ SQLiteFullException -> 0x0052, SQLiteDatabaseLockedException -> 0x00b2, SQLiteException -> 0x0050, all -> 0x004d }
            r9.endTransaction()     // Catch:{ SQLiteFullException -> 0x0052, SQLiteDatabaseLockedException -> 0x00b2, SQLiteException -> 0x0050, all -> 0x004d }
            if (r10 == 0) goto L_0x00ad
            r10.close()
        L_0x00ad:
            r9.close()
            r2 = 1
            return r2
        L_0x00b2:
            r8 = r10
            goto L_0x00ea
        L_0x00b4:
            r0 = move-exception
            goto L_0x0122
        L_0x00b7:
            r0 = move-exception
            r10 = r8
        L_0x00b9:
            r8 = r9
            goto L_0x00c4
        L_0x00bb:
            r0 = move-exception
            r10 = r8
        L_0x00bd:
            r8 = r9
            goto L_0x00fd
        L_0x00bf:
            r0 = move-exception
            r9 = r8
            goto L_0x0122
        L_0x00c2:
            r0 = move-exception
            r10 = r8
        L_0x00c4:
            if (r8 == 0) goto L_0x00cf
            boolean r2 = r8.inTransaction()     // Catch:{ all -> 0x011f }
            if (r2 == 0) goto L_0x00cf
            r8.endTransaction()     // Catch:{ all -> 0x011f }
        L_0x00cf:
            com.google.android.gms.measurement.internal.n4 r2 = r1.f5994a     // Catch:{ all -> 0x011f }
            com.google.android.gms.measurement.internal.j3 r2 = r2.d()     // Catch:{ all -> 0x011f }
            com.google.android.gms.measurement.internal.h3 r2 = r2.r()     // Catch:{ all -> 0x011f }
            java.lang.String r4 = "Error writing entry to local database"
            r2.b(r4, r0)     // Catch:{ all -> 0x011f }
            r2 = 1
            r1.f5905d = r2     // Catch:{ all -> 0x011f }
            if (r10 == 0) goto L_0x00e6
            r10.close()
        L_0x00e6:
            if (r8 == 0) goto L_0x0119
            goto L_0x0116
        L_0x00e9:
            r9 = r8
        L_0x00ea:
            long r10 = (long) r6
            android.os.SystemClock.sleep(r10)     // Catch:{ all -> 0x00b4 }
            int r6 = r6 + 20
            if (r8 == 0) goto L_0x00f5
            r8.close()
        L_0x00f5:
            if (r9 == 0) goto L_0x0119
            r9.close()
            goto L_0x0119
        L_0x00fb:
            r0 = move-exception
            r10 = r8
        L_0x00fd:
            com.google.android.gms.measurement.internal.n4 r2 = r1.f5994a     // Catch:{ all -> 0x011f }
            com.google.android.gms.measurement.internal.j3 r2 = r2.d()     // Catch:{ all -> 0x011f }
            com.google.android.gms.measurement.internal.h3 r2 = r2.r()     // Catch:{ all -> 0x011f }
            java.lang.String r4 = "Error writing entry; local database full"
            r2.b(r4, r0)     // Catch:{ all -> 0x011f }
            r2 = 1
            r1.f5905d = r2     // Catch:{ all -> 0x011f }
            if (r10 == 0) goto L_0x0114
            r10.close()
        L_0x0114:
            if (r8 == 0) goto L_0x0119
        L_0x0116:
            r8.close()
        L_0x0119:
            int r5 = r5 + 1
            r2 = 0
            r4 = 5
            goto L_0x0028
        L_0x011f:
            r0 = move-exception
            r9 = r8
        L_0x0121:
            r8 = r10
        L_0x0122:
            if (r8 == 0) goto L_0x0127
            r8.close()
        L_0x0127:
            if (r9 == 0) goto L_0x012c
            r9.close()
        L_0x012c:
            throw r0
        L_0x012d:
            com.google.android.gms.measurement.internal.n4 r0 = r1.f5994a
            com.google.android.gms.measurement.internal.j3 r0 = r0.d()
            com.google.android.gms.measurement.internal.h3 r0 = r0.v()
            java.lang.String r2 = "Failed to write entry to local database"
            r0.a(r2)
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.d3.x(int, byte[]):boolean");
    }

    /* access modifiers changed from: protected */
    public final boolean n() {
        return false;
    }

    /* access modifiers changed from: package-private */
    public final SQLiteDatabase o() {
        if (this.f5905d) {
            return null;
        }
        SQLiteDatabase writableDatabase = this.f5904c.getWritableDatabase();
        if (writableDatabase != null) {
            return writableDatabase;
        }
        this.f5905d = true;
        return null;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:59|60|61|62) */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:74|75|76|77) */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:46|47|48|49|197) */
    /* JADX WARNING: Code restructure failed: missing block: B:47:?, code lost:
        r1.f5994a.d().r().a("Failed to load event from local database");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:?, code lost:
        r12.recycle();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:?, code lost:
        r1.f5994a.d().r().a("Failed to load user property from local database");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:?, code lost:
        r12.recycle();
        r13 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:?, code lost:
        r1.f5994a.d().r().a("Failed to load conditional user property from local database");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:?, code lost:
        r12.recycle();
        r13 = null;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:46:0x00d2 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:59:0x0104 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:74:0x0139 */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x01db A[SYNTHETIC, Splitter:B:123:0x01db] */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x0200 A[SYNTHETIC, Splitter:B:151:0x0200] */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x021a  */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x022a  */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x0247  */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x0256  */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x025b  */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x01de A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x024d A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:190:0x024d A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x024d A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List p(int r24) {
        /*
            r23 = this;
            r1 = r23
            java.lang.String r2 = "rowid"
            java.lang.String r3 = "Error reading entries from local database"
            r23.h()
            boolean r0 = r1.f5905d
            r4 = 0
            if (r0 == 0) goto L_0x000f
            return r4
        L_0x000f:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            boolean r0 = r23.s()
            if (r0 == 0) goto L_0x026f
            r6 = 5
            r7 = 0
            r8 = 0
            r9 = 5
        L_0x001e:
            if (r8 >= r6) goto L_0x025f
            r10 = 1
            android.database.sqlite.SQLiteDatabase r15 = r23.o()     // Catch:{ SQLiteFullException -> 0x0233, SQLiteDatabaseLockedException -> 0x0220, SQLiteException -> 0x01fb, all -> 0x01f8 }
            if (r15 != 0) goto L_0x002a
            r1.f5905d = r10     // Catch:{ SQLiteFullException -> 0x01f3, SQLiteDatabaseLockedException -> 0x01ef, SQLiteException -> 0x01ea, all -> 0x01e5 }
            return r4
        L_0x002a:
            r15.beginTransaction()     // Catch:{ SQLiteFullException -> 0x01f3, SQLiteDatabaseLockedException -> 0x01ef, SQLiteException -> 0x01ea, all -> 0x01e5 }
            java.lang.String r0 = "3"
            java.lang.String r12 = "messages"
            java.lang.String[] r13 = new java.lang.String[r10]     // Catch:{ all -> 0x01d6 }
            r13[r7] = r2     // Catch:{ all -> 0x01d6 }
            java.lang.String r14 = "type=?"
            java.lang.String[] r0 = new java.lang.String[]{r0}     // Catch:{ all -> 0x01d6 }
            r16 = 0
            r17 = 0
            java.lang.String r18 = "rowid desc"
            java.lang.String r19 = "1"
            r11 = r15
            r24 = r15
            r15 = r0
            android.database.Cursor r11 = r11.query(r12, r13, r14, r15, r16, r17, r18, r19)     // Catch:{ all -> 0x01d2 }
            boolean r0 = r11.moveToFirst()     // Catch:{ all -> 0x01ce }
            r20 = -1
            if (r0 == 0) goto L_0x005b
            long r12 = r11.getLong(r7)     // Catch:{ all -> 0x01ce }
            r11.close()     // Catch:{ SQLiteFullException -> 0x01ca, SQLiteDatabaseLockedException -> 0x01c7, SQLiteException -> 0x01c3, all -> 0x01bf }
            goto L_0x0060
        L_0x005b:
            r11.close()     // Catch:{ SQLiteFullException -> 0x01ca, SQLiteDatabaseLockedException -> 0x01c7, SQLiteException -> 0x01c3, all -> 0x01bf }
            r12 = r20
        L_0x0060:
            int r0 = (r12 > r20 ? 1 : (r12 == r20 ? 0 : -1))
            if (r0 == 0) goto L_0x0071
            java.lang.String r0 = "rowid<?"
            java.lang.String[] r11 = new java.lang.String[r10]     // Catch:{ SQLiteFullException -> 0x01ca, SQLiteDatabaseLockedException -> 0x01c7, SQLiteException -> 0x01c3, all -> 0x01bf }
            java.lang.String r12 = java.lang.String.valueOf(r12)     // Catch:{ SQLiteFullException -> 0x01ca, SQLiteDatabaseLockedException -> 0x01c7, SQLiteException -> 0x01c3, all -> 0x01bf }
            r11[r7] = r12     // Catch:{ SQLiteFullException -> 0x01ca, SQLiteDatabaseLockedException -> 0x01c7, SQLiteException -> 0x01c3, all -> 0x01bf }
            r14 = r0
            r15 = r11
            goto L_0x0073
        L_0x0071:
            r14 = r4
            r15 = r14
        L_0x0073:
            r0 = 3
            java.lang.String[] r13 = new java.lang.String[r0]     // Catch:{ SQLiteFullException -> 0x01ca, SQLiteDatabaseLockedException -> 0x01c7, SQLiteException -> 0x01c3, all -> 0x01bf }
            r13[r7] = r2     // Catch:{ SQLiteFullException -> 0x01ca, SQLiteDatabaseLockedException -> 0x01c7, SQLiteException -> 0x01c3, all -> 0x01bf }
            java.lang.String r11 = "type"
            r13[r10] = r11     // Catch:{ SQLiteFullException -> 0x01ca, SQLiteDatabaseLockedException -> 0x01c7, SQLiteException -> 0x01c3, all -> 0x01bf }
            java.lang.String r11 = "entry"
            r12 = 2
            r13[r12] = r11     // Catch:{ SQLiteFullException -> 0x01ca, SQLiteDatabaseLockedException -> 0x01c7, SQLiteException -> 0x01c3, all -> 0x01bf }
            java.lang.String r16 = "messages"
            r17 = 0
            r18 = 0
            java.lang.String r19 = "rowid asc"
            r11 = 100
            java.lang.String r22 = java.lang.Integer.toString(r11)     // Catch:{ SQLiteFullException -> 0x01ca, SQLiteDatabaseLockedException -> 0x01c7, SQLiteException -> 0x01c3, all -> 0x01bf }
            r11 = r24
            r6 = 2
            r12 = r16
            r16 = r17
            r17 = r18
            r18 = r19
            r19 = r22
            android.database.Cursor r11 = r11.query(r12, r13, r14, r15, r16, r17, r18, r19)     // Catch:{ SQLiteFullException -> 0x01ca, SQLiteDatabaseLockedException -> 0x01c7, SQLiteException -> 0x01c3, all -> 0x01bf }
        L_0x00a0:
            boolean r12 = r11.moveToNext()     // Catch:{ SQLiteFullException -> 0x01bb, SQLiteDatabaseLockedException -> 0x01b8, SQLiteException -> 0x01b4, all -> 0x01af }
            if (r12 == 0) goto L_0x0174
            long r20 = r11.getLong(r7)     // Catch:{ SQLiteFullException -> 0x01bb, SQLiteDatabaseLockedException -> 0x01b8, SQLiteException -> 0x01b4, all -> 0x01af }
            int r12 = r11.getInt(r10)     // Catch:{ SQLiteFullException -> 0x01bb, SQLiteDatabaseLockedException -> 0x01b8, SQLiteException -> 0x01b4, all -> 0x01af }
            byte[] r13 = r11.getBlob(r6)     // Catch:{ SQLiteFullException -> 0x01bb, SQLiteDatabaseLockedException -> 0x01b8, SQLiteException -> 0x01b4, all -> 0x01af }
            if (r12 != 0) goto L_0x00e9
            android.os.Parcel r12 = android.os.Parcel.obtain()     // Catch:{ SQLiteFullException -> 0x01bb, SQLiteDatabaseLockedException -> 0x01b8, SQLiteException -> 0x01b4, all -> 0x01af }
            int r14 = r13.length     // Catch:{ a -> 0x00d2 }
            r12.unmarshall(r13, r7, r14)     // Catch:{ a -> 0x00d2 }
            r12.setDataPosition(r7)     // Catch:{ a -> 0x00d2 }
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.t> r13 = com.google.android.gms.measurement.internal.t.CREATOR     // Catch:{ a -> 0x00d2 }
            java.lang.Object r13 = r13.createFromParcel(r12)     // Catch:{ a -> 0x00d2 }
            com.google.android.gms.measurement.internal.t r13 = (com.google.android.gms.measurement.internal.t) r13     // Catch:{ a -> 0x00d2 }
            r12.recycle()     // Catch:{ SQLiteFullException -> 0x01bb, SQLiteDatabaseLockedException -> 0x01b8, SQLiteException -> 0x01b4, all -> 0x01af }
            if (r13 == 0) goto L_0x00a0
        L_0x00cc:
            r5.add(r13)     // Catch:{ SQLiteFullException -> 0x01bb, SQLiteDatabaseLockedException -> 0x01b8, SQLiteException -> 0x01b4, all -> 0x01af }
            goto L_0x00a0
        L_0x00d0:
            r0 = move-exception
            goto L_0x00e5
        L_0x00d2:
            com.google.android.gms.measurement.internal.n4 r13 = r1.f5994a     // Catch:{ all -> 0x00d0 }
            com.google.android.gms.measurement.internal.j3 r13 = r13.d()     // Catch:{ all -> 0x00d0 }
            com.google.android.gms.measurement.internal.h3 r13 = r13.r()     // Catch:{ all -> 0x00d0 }
            java.lang.String r14 = "Failed to load event from local database"
            r13.a(r14)     // Catch:{ all -> 0x00d0 }
            r12.recycle()     // Catch:{ SQLiteFullException -> 0x01bb, SQLiteDatabaseLockedException -> 0x01b8, SQLiteException -> 0x01b4, all -> 0x01af }
            goto L_0x00a0
        L_0x00e5:
            r12.recycle()     // Catch:{ SQLiteFullException -> 0x01bb, SQLiteDatabaseLockedException -> 0x01b8, SQLiteException -> 0x01b4, all -> 0x01af }
            throw r0     // Catch:{ SQLiteFullException -> 0x01bb, SQLiteDatabaseLockedException -> 0x01b8, SQLiteException -> 0x01b4, all -> 0x01af }
        L_0x00e9:
            if (r12 != r10) goto L_0x011e
            android.os.Parcel r12 = android.os.Parcel.obtain()     // Catch:{ SQLiteFullException -> 0x01bb, SQLiteDatabaseLockedException -> 0x01b8, SQLiteException -> 0x01b4, all -> 0x01af }
            int r14 = r13.length     // Catch:{ a -> 0x0104 }
            r12.unmarshall(r13, r7, r14)     // Catch:{ a -> 0x0104 }
            r12.setDataPosition(r7)     // Catch:{ a -> 0x0104 }
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.z8> r13 = com.google.android.gms.measurement.internal.z8.CREATOR     // Catch:{ a -> 0x0104 }
            java.lang.Object r13 = r13.createFromParcel(r12)     // Catch:{ a -> 0x0104 }
            com.google.android.gms.measurement.internal.z8 r13 = (com.google.android.gms.measurement.internal.z8) r13     // Catch:{ a -> 0x0104 }
            r12.recycle()     // Catch:{ SQLiteFullException -> 0x01bb, SQLiteDatabaseLockedException -> 0x01b8, SQLiteException -> 0x01b4, all -> 0x01af }
            goto L_0x0117
        L_0x0102:
            r0 = move-exception
            goto L_0x011a
        L_0x0104:
            com.google.android.gms.measurement.internal.n4 r13 = r1.f5994a     // Catch:{ all -> 0x0102 }
            com.google.android.gms.measurement.internal.j3 r13 = r13.d()     // Catch:{ all -> 0x0102 }
            com.google.android.gms.measurement.internal.h3 r13 = r13.r()     // Catch:{ all -> 0x0102 }
            java.lang.String r14 = "Failed to load user property from local database"
            r13.a(r14)     // Catch:{ all -> 0x0102 }
            r12.recycle()     // Catch:{ SQLiteFullException -> 0x01bb, SQLiteDatabaseLockedException -> 0x01b8, SQLiteException -> 0x01b4, all -> 0x01af }
            r13 = r4
        L_0x0117:
            if (r13 == 0) goto L_0x00a0
            goto L_0x00cc
        L_0x011a:
            r12.recycle()     // Catch:{ SQLiteFullException -> 0x01bb, SQLiteDatabaseLockedException -> 0x01b8, SQLiteException -> 0x01b4, all -> 0x01af }
            throw r0     // Catch:{ SQLiteFullException -> 0x01bb, SQLiteDatabaseLockedException -> 0x01b8, SQLiteException -> 0x01b4, all -> 0x01af }
        L_0x011e:
            if (r12 != r6) goto L_0x0154
            android.os.Parcel r12 = android.os.Parcel.obtain()     // Catch:{ SQLiteFullException -> 0x01bb, SQLiteDatabaseLockedException -> 0x01b8, SQLiteException -> 0x01b4, all -> 0x01af }
            int r14 = r13.length     // Catch:{ a -> 0x0139 }
            r12.unmarshall(r13, r7, r14)     // Catch:{ a -> 0x0139 }
            r12.setDataPosition(r7)     // Catch:{ a -> 0x0139 }
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.c> r13 = com.google.android.gms.measurement.internal.c.CREATOR     // Catch:{ a -> 0x0139 }
            java.lang.Object r13 = r13.createFromParcel(r12)     // Catch:{ a -> 0x0139 }
            com.google.android.gms.measurement.internal.c r13 = (com.google.android.gms.measurement.internal.c) r13     // Catch:{ a -> 0x0139 }
            r12.recycle()     // Catch:{ SQLiteFullException -> 0x01bb, SQLiteDatabaseLockedException -> 0x01b8, SQLiteException -> 0x01b4, all -> 0x01af }
            goto L_0x014c
        L_0x0137:
            r0 = move-exception
            goto L_0x0150
        L_0x0139:
            com.google.android.gms.measurement.internal.n4 r13 = r1.f5994a     // Catch:{ all -> 0x0137 }
            com.google.android.gms.measurement.internal.j3 r13 = r13.d()     // Catch:{ all -> 0x0137 }
            com.google.android.gms.measurement.internal.h3 r13 = r13.r()     // Catch:{ all -> 0x0137 }
            java.lang.String r14 = "Failed to load conditional user property from local database"
            r13.a(r14)     // Catch:{ all -> 0x0137 }
            r12.recycle()     // Catch:{ SQLiteFullException -> 0x01bb, SQLiteDatabaseLockedException -> 0x01b8, SQLiteException -> 0x01b4, all -> 0x01af }
            r13 = r4
        L_0x014c:
            if (r13 == 0) goto L_0x00a0
            goto L_0x00cc
        L_0x0150:
            r12.recycle()     // Catch:{ SQLiteFullException -> 0x01bb, SQLiteDatabaseLockedException -> 0x01b8, SQLiteException -> 0x01b4, all -> 0x01af }
            throw r0     // Catch:{ SQLiteFullException -> 0x01bb, SQLiteDatabaseLockedException -> 0x01b8, SQLiteException -> 0x01b4, all -> 0x01af }
        L_0x0154:
            if (r12 != r0) goto L_0x0167
            com.google.android.gms.measurement.internal.n4 r12 = r1.f5994a     // Catch:{ SQLiteFullException -> 0x01bb, SQLiteDatabaseLockedException -> 0x01b8, SQLiteException -> 0x01b4, all -> 0x01af }
            com.google.android.gms.measurement.internal.j3 r12 = r12.d()     // Catch:{ SQLiteFullException -> 0x01bb, SQLiteDatabaseLockedException -> 0x01b8, SQLiteException -> 0x01b4, all -> 0x01af }
            com.google.android.gms.measurement.internal.h3 r12 = r12.w()     // Catch:{ SQLiteFullException -> 0x01bb, SQLiteDatabaseLockedException -> 0x01b8, SQLiteException -> 0x01b4, all -> 0x01af }
            java.lang.String r13 = "Skipping app launch break"
        L_0x0162:
            r12.a(r13)     // Catch:{ SQLiteFullException -> 0x01bb, SQLiteDatabaseLockedException -> 0x01b8, SQLiteException -> 0x01b4, all -> 0x01af }
            goto L_0x00a0
        L_0x0167:
            com.google.android.gms.measurement.internal.n4 r12 = r1.f5994a     // Catch:{ SQLiteFullException -> 0x01bb, SQLiteDatabaseLockedException -> 0x01b8, SQLiteException -> 0x01b4, all -> 0x01af }
            com.google.android.gms.measurement.internal.j3 r12 = r12.d()     // Catch:{ SQLiteFullException -> 0x01bb, SQLiteDatabaseLockedException -> 0x01b8, SQLiteException -> 0x01b4, all -> 0x01af }
            com.google.android.gms.measurement.internal.h3 r12 = r12.r()     // Catch:{ SQLiteFullException -> 0x01bb, SQLiteDatabaseLockedException -> 0x01b8, SQLiteException -> 0x01b4, all -> 0x01af }
            java.lang.String r13 = "Unknown record type in local database"
            goto L_0x0162
        L_0x0174:
            java.lang.String[] r0 = new java.lang.String[r10]     // Catch:{ SQLiteFullException -> 0x01bb, SQLiteDatabaseLockedException -> 0x01b8, SQLiteException -> 0x01b4, all -> 0x01af }
            java.lang.String r6 = java.lang.Long.toString(r20)     // Catch:{ SQLiteFullException -> 0x01bb, SQLiteDatabaseLockedException -> 0x01b8, SQLiteException -> 0x01b4, all -> 0x01af }
            r0[r7] = r6     // Catch:{ SQLiteFullException -> 0x01bb, SQLiteDatabaseLockedException -> 0x01b8, SQLiteException -> 0x01b4, all -> 0x01af }
            java.lang.String r6 = "messages"
            java.lang.String r12 = "rowid <= ?"
            r13 = r24
            int r0 = r13.delete(r6, r12, r0)     // Catch:{ SQLiteFullException -> 0x01ac, SQLiteDatabaseLockedException -> 0x01f1, SQLiteException -> 0x01aa, all -> 0x01a8 }
            int r6 = r5.size()     // Catch:{ SQLiteFullException -> 0x01ac, SQLiteDatabaseLockedException -> 0x01f1, SQLiteException -> 0x01aa, all -> 0x01a8 }
            if (r0 >= r6) goto L_0x019b
            com.google.android.gms.measurement.internal.n4 r0 = r1.f5994a     // Catch:{ SQLiteFullException -> 0x01ac, SQLiteDatabaseLockedException -> 0x01f1, SQLiteException -> 0x01aa, all -> 0x01a8 }
            com.google.android.gms.measurement.internal.j3 r0 = r0.d()     // Catch:{ SQLiteFullException -> 0x01ac, SQLiteDatabaseLockedException -> 0x01f1, SQLiteException -> 0x01aa, all -> 0x01a8 }
            com.google.android.gms.measurement.internal.h3 r0 = r0.r()     // Catch:{ SQLiteFullException -> 0x01ac, SQLiteDatabaseLockedException -> 0x01f1, SQLiteException -> 0x01aa, all -> 0x01a8 }
            java.lang.String r6 = "Fewer entries removed from local database than expected"
            r0.a(r6)     // Catch:{ SQLiteFullException -> 0x01ac, SQLiteDatabaseLockedException -> 0x01f1, SQLiteException -> 0x01aa, all -> 0x01a8 }
        L_0x019b:
            r13.setTransactionSuccessful()     // Catch:{ SQLiteFullException -> 0x01ac, SQLiteDatabaseLockedException -> 0x01f1, SQLiteException -> 0x01aa, all -> 0x01a8 }
            r13.endTransaction()     // Catch:{ SQLiteFullException -> 0x01ac, SQLiteDatabaseLockedException -> 0x01f1, SQLiteException -> 0x01aa, all -> 0x01a8 }
            r11.close()
            r13.close()
            return r5
        L_0x01a8:
            r0 = move-exception
            goto L_0x01b2
        L_0x01aa:
            r0 = move-exception
            goto L_0x01ed
        L_0x01ac:
            r0 = move-exception
            goto L_0x01f6
        L_0x01af:
            r0 = move-exception
            r13 = r24
        L_0x01b2:
            r4 = r11
            goto L_0x01e7
        L_0x01b4:
            r0 = move-exception
            r13 = r24
            goto L_0x01ed
        L_0x01b8:
            r13 = r24
            goto L_0x01f1
        L_0x01bb:
            r0 = move-exception
            r13 = r24
            goto L_0x01f6
        L_0x01bf:
            r0 = move-exception
            r13 = r24
            goto L_0x01e7
        L_0x01c3:
            r0 = move-exception
            r13 = r24
            goto L_0x01ec
        L_0x01c7:
            r13 = r24
            goto L_0x01f0
        L_0x01ca:
            r0 = move-exception
            r13 = r24
            goto L_0x01f5
        L_0x01ce:
            r0 = move-exception
            r13 = r24
            goto L_0x01d9
        L_0x01d2:
            r0 = move-exception
            r13 = r24
            goto L_0x01d8
        L_0x01d6:
            r0 = move-exception
            r13 = r15
        L_0x01d8:
            r11 = r4
        L_0x01d9:
            if (r11 == 0) goto L_0x01de
            r11.close()     // Catch:{ SQLiteFullException -> 0x01e3, SQLiteDatabaseLockedException -> 0x01f0, SQLiteException -> 0x01e1, all -> 0x01df }
        L_0x01de:
            throw r0     // Catch:{ SQLiteFullException -> 0x01e3, SQLiteDatabaseLockedException -> 0x01f0, SQLiteException -> 0x01e1, all -> 0x01df }
        L_0x01df:
            r0 = move-exception
            goto L_0x01e7
        L_0x01e1:
            r0 = move-exception
            goto L_0x01ec
        L_0x01e3:
            r0 = move-exception
            goto L_0x01f5
        L_0x01e5:
            r0 = move-exception
            r13 = r15
        L_0x01e7:
            r15 = r13
            goto L_0x0254
        L_0x01ea:
            r0 = move-exception
            r13 = r15
        L_0x01ec:
            r11 = r4
        L_0x01ed:
            r15 = r13
            goto L_0x01fe
        L_0x01ef:
            r13 = r15
        L_0x01f0:
            r11 = r4
        L_0x01f1:
            r15 = r13
            goto L_0x0222
        L_0x01f3:
            r0 = move-exception
            r13 = r15
        L_0x01f5:
            r11 = r4
        L_0x01f6:
            r15 = r13
            goto L_0x0236
        L_0x01f8:
            r0 = move-exception
            r15 = r4
            goto L_0x0254
        L_0x01fb:
            r0 = move-exception
            r11 = r4
            r15 = r11
        L_0x01fe:
            if (r15 == 0) goto L_0x0209
            boolean r6 = r15.inTransaction()     // Catch:{ all -> 0x0252 }
            if (r6 == 0) goto L_0x0209
            r15.endTransaction()     // Catch:{ all -> 0x0252 }
        L_0x0209:
            com.google.android.gms.measurement.internal.n4 r6 = r1.f5994a     // Catch:{ all -> 0x0252 }
            com.google.android.gms.measurement.internal.j3 r6 = r6.d()     // Catch:{ all -> 0x0252 }
            com.google.android.gms.measurement.internal.h3 r6 = r6.r()     // Catch:{ all -> 0x0252 }
            r6.b(r3, r0)     // Catch:{ all -> 0x0252 }
            r1.f5905d = r10     // Catch:{ all -> 0x0252 }
            if (r11 == 0) goto L_0x021d
            r11.close()
        L_0x021d:
            if (r15 == 0) goto L_0x024d
            goto L_0x022f
        L_0x0220:
            r11 = r4
            r15 = r11
        L_0x0222:
            long r12 = (long) r9
            android.os.SystemClock.sleep(r12)     // Catch:{ all -> 0x0252 }
            int r9 = r9 + 20
            if (r11 == 0) goto L_0x022d
            r11.close()
        L_0x022d:
            if (r15 == 0) goto L_0x024d
        L_0x022f:
            r15.close()
            goto L_0x024d
        L_0x0233:
            r0 = move-exception
            r11 = r4
            r15 = r11
        L_0x0236:
            com.google.android.gms.measurement.internal.n4 r6 = r1.f5994a     // Catch:{ all -> 0x0252 }
            com.google.android.gms.measurement.internal.j3 r6 = r6.d()     // Catch:{ all -> 0x0252 }
            com.google.android.gms.measurement.internal.h3 r6 = r6.r()     // Catch:{ all -> 0x0252 }
            r6.b(r3, r0)     // Catch:{ all -> 0x0252 }
            r1.f5905d = r10     // Catch:{ all -> 0x0252 }
            if (r11 == 0) goto L_0x024a
            r11.close()
        L_0x024a:
            if (r15 == 0) goto L_0x024d
            goto L_0x022f
        L_0x024d:
            int r8 = r8 + 1
            r6 = 5
            goto L_0x001e
        L_0x0252:
            r0 = move-exception
            r4 = r11
        L_0x0254:
            if (r4 == 0) goto L_0x0259
            r4.close()
        L_0x0259:
            if (r15 == 0) goto L_0x025e
            r15.close()
        L_0x025e:
            throw r0
        L_0x025f:
            com.google.android.gms.measurement.internal.n4 r0 = r1.f5994a
            com.google.android.gms.measurement.internal.j3 r0 = r0.d()
            com.google.android.gms.measurement.internal.h3 r0 = r0.w()
            java.lang.String r2 = "Failed to read events from database in reasonable time"
            r0.a(r2)
            return r4
        L_0x026f:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.d3.p(int):java.util.List");
    }

    public final void q() {
        int delete;
        h();
        try {
            SQLiteDatabase o10 = o();
            if (o10 != null && (delete = o10.delete("messages", (String) null, (String[]) null)) > 0) {
                this.f5994a.d().v().b("Reset local analytics data. records", Integer.valueOf(delete));
            }
        } catch (SQLiteException e10) {
            this.f5994a.d().r().b("Error resetting local analytics data. error", e10);
        }
    }

    public final boolean r() {
        return x(3, new byte[0]);
    }

    /* access modifiers changed from: package-private */
    public final boolean s() {
        Context c10 = this.f5994a.c();
        this.f5994a.z();
        return c10.getDatabasePath("google_app_measurement_local.db").exists();
    }

    public final boolean t() {
        h();
        if (!this.f5905d && s()) {
            int i10 = 0;
            int i11 = 5;
            while (i10 < 5) {
                SQLiteDatabase sQLiteDatabase = null;
                try {
                    SQLiteDatabase o10 = o();
                    if (o10 == null) {
                        this.f5905d = true;
                        return false;
                    }
                    o10.beginTransaction();
                    o10.delete("messages", "type == ?", new String[]{Integer.toString(3)});
                    o10.setTransactionSuccessful();
                    o10.endTransaction();
                    o10.close();
                    return true;
                } catch (SQLiteFullException e10) {
                    this.f5994a.d().r().b("Error deleting app launch break from local database", e10);
                    this.f5905d = true;
                    if (sQLiteDatabase == null) {
                        i10++;
                    }
                    sQLiteDatabase.close();
                    i10++;
                } catch (SQLiteDatabaseLockedException unused) {
                    SystemClock.sleep((long) i11);
                    i11 += 20;
                    if (sQLiteDatabase == null) {
                        i10++;
                    }
                    sQLiteDatabase.close();
                    i10++;
                } catch (SQLiteException e11) {
                    if (sQLiteDatabase != null) {
                        if (sQLiteDatabase.inTransaction()) {
                            sQLiteDatabase.endTransaction();
                        }
                    }
                    this.f5994a.d().r().b("Error deleting app launch break from local database", e11);
                    this.f5905d = true;
                    if (sQLiteDatabase != null) {
                        sQLiteDatabase.close();
                        i10++;
                    } else {
                        i10++;
                    }
                } catch (Throwable th) {
                    if (sQLiteDatabase != null) {
                        sQLiteDatabase.close();
                    }
                    throw th;
                }
            }
            this.f5994a.d().w().a("Error deleting app launch break from local database in reasonable time");
        }
        return false;
    }

    public final boolean u(c cVar) {
        byte[] c02 = this.f5994a.N().c0(cVar);
        if (c02.length <= 131072) {
            return x(2, c02);
        }
        this.f5994a.d().t().a("Conditional user property too long for local database. Sending directly to service");
        return false;
    }

    public final boolean v(t tVar) {
        Parcel obtain = Parcel.obtain();
        u.a(tVar, obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        if (marshall.length <= 131072) {
            return x(0, marshall);
        }
        this.f5994a.d().t().a("Event is too long for local database. Sending event directly to service");
        return false;
    }

    public final boolean w(z8 z8Var) {
        Parcel obtain = Parcel.obtain();
        a9.a(z8Var, obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        if (marshall.length <= 131072) {
            return x(1, marshall);
        }
        this.f5994a.d().t().a("User property too long for local database. Sending directly to service");
        return false;
    }
}
