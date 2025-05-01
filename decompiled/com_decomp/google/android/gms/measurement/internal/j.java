package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.internal.measurement.zzfo;
import com.google.android.gms.internal.measurement.zzoq;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

final class j extends n8 {
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static final String[] f6081f = {"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_bundled_day", "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;", "current_session_count", "ALTER TABLE events ADD COLUMN current_session_count INTEGER;"};
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public static final String[] f6082g = {FirebaseAnalytics.Param.ORIGIN, "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public static final String[] f6083h = {"app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", "day", "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;", "admob_app_id", "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;", "linked_admob_app_id", "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;", "dynamite_version", "ALTER TABLE apps ADD COLUMN dynamite_version INTEGER;", "safelisted_events", "ALTER TABLE apps ADD COLUMN safelisted_events TEXT;", "ga_app_id", "ALTER TABLE apps ADD COLUMN ga_app_id TEXT;", "config_last_modified_time", "ALTER TABLE apps ADD COLUMN config_last_modified_time TEXT;"};
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public static final String[] f6084i = {"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;"};
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public static final String[] f6085j = {"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"};
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public static final String[] f6086k = {"session_scoped", "ALTER TABLE event_filters ADD COLUMN session_scoped BOOLEAN;"};
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public static final String[] f6087l = {"session_scoped", "ALTER TABLE property_filters ADD COLUMN session_scoped BOOLEAN;"};
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public static final String[] f6088m = {"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};

    /* renamed from: d  reason: collision with root package name */
    private final i f6089d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final i8 f6090e = new i8(this.f5994a.e());

    j(w8 w8Var) {
        super(w8Var);
        this.f5994a.z();
        this.f6089d = new i(this, this.f5994a.c(), "google_app_measurement.db");
    }

    static final void J(ContentValues contentValues, String str, Object obj) {
        s.g(FirebaseAnalytics.Param.VALUE);
        s.k(obj);
        if (obj instanceof String) {
            contentValues.put(FirebaseAnalytics.Param.VALUE, (String) obj);
        } else if (obj instanceof Long) {
            contentValues.put(FirebaseAnalytics.Param.VALUE, (Long) obj);
        } else if (obj instanceof Double) {
            contentValues.put(FirebaseAnalytics.Param.VALUE, (Double) obj);
        } else {
            throw new IllegalArgumentException("Invalid value type");
        }
    }

    private final long L(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            cursor = R().rawQuery(str, strArr);
            if (cursor.moveToFirst()) {
                long j10 = cursor.getLong(0);
                cursor.close();
                return j10;
            }
            throw new SQLiteException("Database returned empty set");
        } catch (SQLiteException e10) {
            this.f5994a.d().r().c("Database error", str, e10);
            throw e10;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    private final long M(String str, String[] strArr, long j10) {
        Cursor cursor = null;
        try {
            Cursor rawQuery = R().rawQuery(str, strArr);
            if (rawQuery.moveToFirst()) {
                long j11 = rawQuery.getLong(0);
                rawQuery.close();
                return j11;
            }
            rawQuery.close();
            return j10;
        } catch (SQLiteException e10) {
            this.f5994a.d().r().c("Database error", str, e10);
            throw e10;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v7, resolved type: java.lang.String[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v15, resolved type: java.lang.String[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v16, resolved type: java.lang.String[]} */
    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r3v1, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r3v3 */
    /* JADX WARNING: type inference failed for: r3v6 */
    /* JADX WARNING: type inference failed for: r3v7 */
    /* JADX WARNING: type inference failed for: r3v8 */
    /* JADX WARNING: type inference failed for: r3v10 */
    /* JADX WARNING: type inference failed for: r3v11 */
    /* JADX WARNING: type inference failed for: r3v12 */
    /* JADX WARNING: type inference failed for: r3v13 */
    /* JADX WARNING: type inference failed for: r3v14 */
    /* JADX WARNING: type inference failed for: r3v15 */
    /* JADX WARNING: type inference failed for: r3v16 */
    /* JADX WARNING: type inference failed for: r3v17 */
    /* JADX WARNING: type inference failed for: r3v18 */
    /* JADX WARNING: type inference failed for: r3v19 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x0231  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x0239  */
    /* JADX WARNING: Removed duplicated region for block: B:120:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:12:0x003e=Splitter:B:12:0x003e, B:29:0x008e=Splitter:B:29:0x008e} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void I(java.lang.String r21, long r22, long r24, com.google.android.gms.measurement.internal.v8 r26) {
        /*
            r20 = this;
            r1 = r20
            r2 = r26
            com.google.android.gms.common.internal.s.k(r26)
            r20.h()
            r20.i()
            r3 = 0
            android.database.sqlite.SQLiteDatabase r0 = r20.R()     // Catch:{ SQLiteException -> 0x021a, all -> 0x0218 }
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch:{ SQLiteException -> 0x021a, all -> 0x0218 }
            java.lang.String r5 = ""
            r13 = -1
            r15 = 2
            r12 = 1
            r11 = 0
            if (r4 == 0) goto L_0x0077
            int r4 = (r24 > r13 ? 1 : (r24 == r13 ? 0 : -1))
            if (r4 == 0) goto L_0x0032
            java.lang.String[] r6 = new java.lang.String[r15]     // Catch:{ SQLiteException -> 0x021a, all -> 0x0218 }
            java.lang.String r7 = java.lang.String.valueOf(r24)     // Catch:{ SQLiteException -> 0x021a, all -> 0x0218 }
            r6[r11] = r7     // Catch:{ SQLiteException -> 0x021a, all -> 0x0218 }
            java.lang.String r7 = java.lang.String.valueOf(r22)     // Catch:{ SQLiteException -> 0x021a, all -> 0x0218 }
            r6[r12] = r7     // Catch:{ SQLiteException -> 0x021a, all -> 0x0218 }
            goto L_0x003a
        L_0x0032:
            java.lang.String[] r6 = new java.lang.String[r12]     // Catch:{ SQLiteException -> 0x021a, all -> 0x0218 }
            java.lang.String r7 = java.lang.String.valueOf(r22)     // Catch:{ SQLiteException -> 0x021a, all -> 0x0218 }
            r6[r11] = r7     // Catch:{ SQLiteException -> 0x021a, all -> 0x0218 }
        L_0x003a:
            if (r4 == 0) goto L_0x003e
            java.lang.String r5 = "rowid <= ? and "
        L_0x003e:
            int r4 = r5.length()     // Catch:{ SQLiteException -> 0x021a, all -> 0x0218 }
            int r4 = r4 + 148
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x021a, all -> 0x0218 }
            r7.<init>(r4)     // Catch:{ SQLiteException -> 0x021a, all -> 0x0218 }
            java.lang.String r4 = "select app_id, metadata_fingerprint from raw_events where "
            r7.append(r4)     // Catch:{ SQLiteException -> 0x021a, all -> 0x0218 }
            r7.append(r5)     // Catch:{ SQLiteException -> 0x021a, all -> 0x0218 }
            java.lang.String r4 = "app_id in (select app_id from apps where config_fetched_time >= ?) order by rowid limit 1;"
            r7.append(r4)     // Catch:{ SQLiteException -> 0x021a, all -> 0x0218 }
            java.lang.String r4 = r7.toString()     // Catch:{ SQLiteException -> 0x021a, all -> 0x0218 }
            android.database.Cursor r4 = r0.rawQuery(r4, r6)     // Catch:{ SQLiteException -> 0x021a, all -> 0x0218 }
            boolean r5 = r4.moveToFirst()     // Catch:{ SQLiteException -> 0x0074 }
            if (r5 != 0) goto L_0x0068
            r4.close()
            return
        L_0x0068:
            java.lang.String r3 = r4.getString(r11)     // Catch:{ SQLiteException -> 0x0074 }
            java.lang.String r5 = r4.getString(r12)     // Catch:{ SQLiteException -> 0x0074 }
            r4.close()     // Catch:{ SQLiteException -> 0x0074 }
            goto L_0x00bf
        L_0x0074:
            r0 = move-exception
            goto L_0x021c
        L_0x0077:
            int r4 = (r24 > r13 ? 1 : (r24 == r13 ? 0 : -1))
            if (r4 == 0) goto L_0x0086
            java.lang.String[] r6 = new java.lang.String[r15]     // Catch:{ SQLiteException -> 0x021a, all -> 0x0218 }
            r6[r11] = r3     // Catch:{ SQLiteException -> 0x021a, all -> 0x0218 }
            java.lang.String r7 = java.lang.String.valueOf(r24)     // Catch:{ SQLiteException -> 0x021a, all -> 0x0218 }
            r6[r12] = r7     // Catch:{ SQLiteException -> 0x021a, all -> 0x0218 }
            goto L_0x008a
        L_0x0086:
            java.lang.String[] r6 = new java.lang.String[]{r3}     // Catch:{ SQLiteException -> 0x021a, all -> 0x0218 }
        L_0x008a:
            if (r4 == 0) goto L_0x008e
            java.lang.String r5 = " and rowid <= ?"
        L_0x008e:
            int r4 = r5.length()     // Catch:{ SQLiteException -> 0x021a, all -> 0x0218 }
            int r4 = r4 + 84
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x021a, all -> 0x0218 }
            r7.<init>(r4)     // Catch:{ SQLiteException -> 0x021a, all -> 0x0218 }
            java.lang.String r4 = "select metadata_fingerprint from raw_events where app_id = ?"
            r7.append(r4)     // Catch:{ SQLiteException -> 0x021a, all -> 0x0218 }
            r7.append(r5)     // Catch:{ SQLiteException -> 0x021a, all -> 0x0218 }
            java.lang.String r4 = " order by rowid limit 1;"
            r7.append(r4)     // Catch:{ SQLiteException -> 0x021a, all -> 0x0218 }
            java.lang.String r4 = r7.toString()     // Catch:{ SQLiteException -> 0x021a, all -> 0x0218 }
            android.database.Cursor r4 = r0.rawQuery(r4, r6)     // Catch:{ SQLiteException -> 0x021a, all -> 0x0218 }
            boolean r5 = r4.moveToFirst()     // Catch:{ SQLiteException -> 0x0074 }
            if (r5 != 0) goto L_0x00b8
            r4.close()
            return
        L_0x00b8:
            java.lang.String r5 = r4.getString(r11)     // Catch:{ SQLiteException -> 0x0074 }
            r4.close()     // Catch:{ SQLiteException -> 0x0074 }
        L_0x00bf:
            r16 = r4
            r10 = r5
            java.lang.String[] r6 = new java.lang.String[r12]     // Catch:{ SQLiteException -> 0x0214, all -> 0x0210 }
            java.lang.String r4 = "metadata"
            r6[r11] = r4     // Catch:{ SQLiteException -> 0x0214, all -> 0x0210 }
            java.lang.String[] r8 = new java.lang.String[]{r3, r10}     // Catch:{ SQLiteException -> 0x0214, all -> 0x0210 }
            java.lang.String r5 = "raw_events_metadata"
            java.lang.String r7 = "app_id = ? and metadata_fingerprint = ?"
            r9 = 0
            r17 = 0
            java.lang.String r18 = "rowid"
            java.lang.String r19 = "2"
            r4 = r0
            r15 = r10
            r10 = r17
            r13 = 0
            r11 = r18
            r14 = 1
            r12 = r19
            android.database.Cursor r12 = r4.query(r5, r6, r7, r8, r9, r10, r11, r12)     // Catch:{ SQLiteException -> 0x0214, all -> 0x0210 }
            boolean r4 = r12.moveToFirst()     // Catch:{ SQLiteException -> 0x020c, all -> 0x0208 }
            if (r4 != 0) goto L_0x0102
            com.google.android.gms.measurement.internal.n4 r0 = r1.f5994a     // Catch:{ SQLiteException -> 0x020c, all -> 0x0208 }
            com.google.android.gms.measurement.internal.j3 r0 = r0.d()     // Catch:{ SQLiteException -> 0x020c, all -> 0x0208 }
            com.google.android.gms.measurement.internal.h3 r0 = r0.r()     // Catch:{ SQLiteException -> 0x020c, all -> 0x0208 }
            java.lang.String r2 = "Raw event metadata record is missing. appId"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.j3.z(r3)     // Catch:{ SQLiteException -> 0x020c, all -> 0x0208 }
            r0.b(r2, r4)     // Catch:{ SQLiteException -> 0x020c, all -> 0x0208 }
            r12.close()
            return
        L_0x0102:
            byte[] r4 = r12.getBlob(r13)     // Catch:{ SQLiteException -> 0x020c, all -> 0x0208 }
            com.google.android.gms.internal.measurement.zzfx r5 = com.google.android.gms.internal.measurement.zzfy.zzu()     // Catch:{ IOException -> 0x01eb }
            com.google.android.gms.internal.measurement.zzlf r4 = com.google.android.gms.measurement.internal.y8.D(r5, r4)     // Catch:{ IOException -> 0x01eb }
            com.google.android.gms.internal.measurement.zzfx r4 = (com.google.android.gms.internal.measurement.zzfx) r4     // Catch:{ IOException -> 0x01eb }
            com.google.android.gms.internal.measurement.zzjz r4 = r4.zzaA()     // Catch:{ IOException -> 0x01eb }
            com.google.android.gms.internal.measurement.zzfy r4 = (com.google.android.gms.internal.measurement.zzfy) r4     // Catch:{ IOException -> 0x01eb }
            boolean r5 = r12.moveToNext()     // Catch:{ SQLiteException -> 0x020c, all -> 0x0208 }
            if (r5 == 0) goto L_0x012f
            com.google.android.gms.measurement.internal.n4 r5 = r1.f5994a     // Catch:{ SQLiteException -> 0x020c, all -> 0x0208 }
            com.google.android.gms.measurement.internal.j3 r5 = r5.d()     // Catch:{ SQLiteException -> 0x020c, all -> 0x0208 }
            com.google.android.gms.measurement.internal.h3 r5 = r5.w()     // Catch:{ SQLiteException -> 0x020c, all -> 0x0208 }
            java.lang.String r6 = "Get multiple raw event metadata records, expected one. appId"
            java.lang.Object r7 = com.google.android.gms.measurement.internal.j3.z(r3)     // Catch:{ SQLiteException -> 0x020c, all -> 0x0208 }
            r5.b(r6, r7)     // Catch:{ SQLiteException -> 0x020c, all -> 0x0208 }
        L_0x012f:
            r12.close()     // Catch:{ SQLiteException -> 0x020c, all -> 0x0208 }
            com.google.android.gms.common.internal.s.k(r4)     // Catch:{ SQLiteException -> 0x020c, all -> 0x0208 }
            r2.f6507a = r4     // Catch:{ SQLiteException -> 0x020c, all -> 0x0208 }
            r11 = 3
            r4 = -1
            int r6 = (r24 > r4 ? 1 : (r24 == r4 ? 0 : -1))
            if (r6 == 0) goto L_0x014e
            java.lang.String r4 = "app_id = ? and metadata_fingerprint = ? and rowid <= ?"
            java.lang.String[] r5 = new java.lang.String[r11]     // Catch:{ SQLiteException -> 0x020c, all -> 0x0208 }
            r5[r13] = r3     // Catch:{ SQLiteException -> 0x020c, all -> 0x0208 }
            r5[r14] = r15     // Catch:{ SQLiteException -> 0x020c, all -> 0x0208 }
            java.lang.String r6 = java.lang.String.valueOf(r24)     // Catch:{ SQLiteException -> 0x020c, all -> 0x0208 }
            r7 = 2
            r5[r7] = r6     // Catch:{ SQLiteException -> 0x020c, all -> 0x0208 }
            goto L_0x0154
        L_0x014e:
            java.lang.String r4 = "app_id = ? and metadata_fingerprint = ?"
            java.lang.String[] r5 = new java.lang.String[]{r3, r15}     // Catch:{ SQLiteException -> 0x020c, all -> 0x0208 }
        L_0x0154:
            r7 = r4
            r8 = r5
            r4 = 4
            java.lang.String[] r6 = new java.lang.String[r4]     // Catch:{ SQLiteException -> 0x020c, all -> 0x0208 }
            java.lang.String r4 = "rowid"
            r6[r13] = r4     // Catch:{ SQLiteException -> 0x020c, all -> 0x0208 }
            java.lang.String r4 = "name"
            r6[r14] = r4     // Catch:{ SQLiteException -> 0x020c, all -> 0x0208 }
            java.lang.String r4 = "timestamp"
            r5 = 2
            r6[r5] = r4     // Catch:{ SQLiteException -> 0x020c, all -> 0x0208 }
            java.lang.String r4 = "data"
            r6[r11] = r4     // Catch:{ SQLiteException -> 0x020c, all -> 0x0208 }
            java.lang.String r5 = "raw_events"
            r9 = 0
            r10 = 0
            java.lang.String r15 = "rowid"
            r16 = 0
            r4 = r0
            r14 = 3
            r11 = r15
            r15 = r12
            r12 = r16
            android.database.Cursor r4 = r4.query(r5, r6, r7, r8, r9, r10, r11, r12)     // Catch:{ SQLiteException -> 0x0206, all -> 0x0204 }
            boolean r0 = r4.moveToFirst()     // Catch:{ SQLiteException -> 0x0074 }
            if (r0 == 0) goto L_0x01d4
        L_0x0182:
            long r5 = r4.getLong(r13)     // Catch:{ SQLiteException -> 0x0074 }
            byte[] r0 = r4.getBlob(r14)     // Catch:{ SQLiteException -> 0x0074 }
            com.google.android.gms.internal.measurement.zzfn r7 = com.google.android.gms.internal.measurement.zzfo.zze()     // Catch:{ IOException -> 0x01b4 }
            com.google.android.gms.internal.measurement.zzlf r0 = com.google.android.gms.measurement.internal.y8.D(r7, r0)     // Catch:{ IOException -> 0x01b4 }
            com.google.android.gms.internal.measurement.zzfn r0 = (com.google.android.gms.internal.measurement.zzfn) r0     // Catch:{ IOException -> 0x01b4 }
            r7 = 1
            java.lang.String r8 = r4.getString(r7)     // Catch:{ SQLiteException -> 0x0074 }
            r0.zzi(r8)     // Catch:{ SQLiteException -> 0x0074 }
            r8 = 2
            long r9 = r4.getLong(r8)     // Catch:{ SQLiteException -> 0x0074 }
            r0.zzm(r9)     // Catch:{ SQLiteException -> 0x0074 }
            com.google.android.gms.internal.measurement.zzjz r0 = r0.zzaA()     // Catch:{ SQLiteException -> 0x0074 }
            com.google.android.gms.internal.measurement.zzfo r0 = (com.google.android.gms.internal.measurement.zzfo) r0     // Catch:{ SQLiteException -> 0x0074 }
            boolean r0 = r2.a(r5, r0)     // Catch:{ SQLiteException -> 0x0074 }
            if (r0 != 0) goto L_0x01ca
            r4.close()
            return
        L_0x01b4:
            r0 = move-exception
            r7 = 1
            r8 = 2
            com.google.android.gms.measurement.internal.n4 r5 = r1.f5994a     // Catch:{ SQLiteException -> 0x0074 }
            com.google.android.gms.measurement.internal.j3 r5 = r5.d()     // Catch:{ SQLiteException -> 0x0074 }
            com.google.android.gms.measurement.internal.h3 r5 = r5.r()     // Catch:{ SQLiteException -> 0x0074 }
            java.lang.String r6 = "Data loss. Failed to merge raw event. appId"
            java.lang.Object r9 = com.google.android.gms.measurement.internal.j3.z(r3)     // Catch:{ SQLiteException -> 0x0074 }
            r5.c(r6, r9, r0)     // Catch:{ SQLiteException -> 0x0074 }
        L_0x01ca:
            boolean r0 = r4.moveToNext()     // Catch:{ SQLiteException -> 0x0074 }
            if (r0 != 0) goto L_0x0182
            r4.close()
            return
        L_0x01d4:
            com.google.android.gms.measurement.internal.n4 r0 = r1.f5994a     // Catch:{ SQLiteException -> 0x0074 }
            com.google.android.gms.measurement.internal.j3 r0 = r0.d()     // Catch:{ SQLiteException -> 0x0074 }
            com.google.android.gms.measurement.internal.h3 r0 = r0.w()     // Catch:{ SQLiteException -> 0x0074 }
            java.lang.String r2 = "Raw event data disappeared while in transaction. appId"
            java.lang.Object r5 = com.google.android.gms.measurement.internal.j3.z(r3)     // Catch:{ SQLiteException -> 0x0074 }
            r0.b(r2, r5)     // Catch:{ SQLiteException -> 0x0074 }
            r4.close()
            return
        L_0x01eb:
            r0 = move-exception
            r15 = r12
            com.google.android.gms.measurement.internal.n4 r2 = r1.f5994a     // Catch:{ SQLiteException -> 0x0206, all -> 0x0204 }
            com.google.android.gms.measurement.internal.j3 r2 = r2.d()     // Catch:{ SQLiteException -> 0x0206, all -> 0x0204 }
            com.google.android.gms.measurement.internal.h3 r2 = r2.r()     // Catch:{ SQLiteException -> 0x0206, all -> 0x0204 }
            java.lang.String r4 = "Data loss. Failed to merge raw event metadata. appId"
            java.lang.Object r5 = com.google.android.gms.measurement.internal.j3.z(r3)     // Catch:{ SQLiteException -> 0x0206, all -> 0x0204 }
            r2.c(r4, r5, r0)     // Catch:{ SQLiteException -> 0x0206, all -> 0x0204 }
            r15.close()
            return
        L_0x0204:
            r0 = move-exception
            goto L_0x020a
        L_0x0206:
            r0 = move-exception
            goto L_0x020e
        L_0x0208:
            r0 = move-exception
            r15 = r12
        L_0x020a:
            r3 = r15
            goto L_0x0237
        L_0x020c:
            r0 = move-exception
            r15 = r12
        L_0x020e:
            r4 = r15
            goto L_0x021c
        L_0x0210:
            r0 = move-exception
            r3 = r16
            goto L_0x0237
        L_0x0214:
            r0 = move-exception
            r4 = r16
            goto L_0x021c
        L_0x0218:
            r0 = move-exception
            goto L_0x0237
        L_0x021a:
            r0 = move-exception
            r4 = r3
        L_0x021c:
            com.google.android.gms.measurement.internal.n4 r2 = r1.f5994a     // Catch:{ all -> 0x0235 }
            com.google.android.gms.measurement.internal.j3 r2 = r2.d()     // Catch:{ all -> 0x0235 }
            com.google.android.gms.measurement.internal.h3 r2 = r2.r()     // Catch:{ all -> 0x0235 }
            java.lang.String r5 = "Data loss. Error selecting raw event. appId"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.j3.z(r3)     // Catch:{ all -> 0x0235 }
            r2.c(r5, r3, r0)     // Catch:{ all -> 0x0235 }
            if (r4 == 0) goto L_0x0234
            r4.close()
        L_0x0234:
            return
        L_0x0235:
            r0 = move-exception
            r3 = r4
        L_0x0237:
            if (r3 == 0) goto L_0x023c
            r3.close()
        L_0x023c:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.j.I(java.lang.String, long, long, com.google.android.gms.measurement.internal.v8):void");
    }

    public final int K(String str, String str2) {
        s.g(str);
        s.g(str2);
        h();
        i();
        try {
            return R().delete("conditional_properties", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e10) {
            this.f5994a.d().r().d("Error deleting conditional property", j3.z(str), this.f5994a.D().s(str2), e10);
            return 0;
        }
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: protected */
    public final long N(String str, String str2) {
        String str3 = str;
        s.g(str);
        s.g("first_open_count");
        h();
        i();
        SQLiteDatabase R = R();
        R.beginTransaction();
        long j10 = 0;
        try {
            StringBuilder sb2 = new StringBuilder(48);
            sb2.append("select ");
            sb2.append("first_open_count");
            sb2.append(" from app2 where app_id=?");
            long M = M(sb2.toString(), new String[]{str}, -1);
            if (M == -1) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("app_id", str3);
                contentValues.put("first_open_count", 0);
                contentValues.put("previous_install_count", 0);
                if (R.insertWithOnConflict("app2", (String) null, contentValues, 5) == -1) {
                    this.f5994a.d().r().c("Failed to insert column (got -1). appId", j3.z(str), "first_open_count");
                    R.endTransaction();
                    return -1;
                }
                M = 0;
            }
            try {
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("app_id", str3);
                contentValues2.put("first_open_count", Long.valueOf(1 + M));
                if (((long) R.update("app2", contentValues2, "app_id = ?", new String[]{str})) == 0) {
                    this.f5994a.d().r().c("Failed to update column (got 0). appId", j3.z(str), "first_open_count");
                    R.endTransaction();
                    return -1;
                }
                R.setTransactionSuccessful();
                R.endTransaction();
                return M;
            } catch (SQLiteException e10) {
                e = e10;
                j10 = M;
                try {
                    this.f5994a.d().r().d("Error inserting column. appId", j3.z(str), "first_open_count", e);
                    R.endTransaction();
                    return j10;
                } catch (Throwable th) {
                    R.endTransaction();
                    throw th;
                }
            }
        } catch (SQLiteException e11) {
            e = e11;
            this.f5994a.d().r().d("Error inserting column. appId", j3.z(str), "first_open_count", e);
            R.endTransaction();
            return j10;
        }
    }

    public final long O() {
        return M("select max(bundle_end_timestamp) from queue", (String[]) null, 0);
    }

    public final long P() {
        return M("select max(timestamp) from raw_events", (String[]) null, 0);
    }

    public final long Q(String str) {
        s.g(str);
        return M("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[]{str}, 0);
    }

    /* access modifiers changed from: package-private */
    public final SQLiteDatabase R() {
        h();
        try {
            return this.f6089d.getWritableDatabase();
        } catch (SQLiteException e10) {
            this.f5994a.d().w().b("Error opening database", e10);
            throw e10;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:44:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00d8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.os.Bundle S(java.lang.String r8) {
        /*
            r7 = this;
            r7.h()
            r7.i()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r7.R()     // Catch:{ SQLiteException -> 0x00bd, all -> 0x00bb }
            java.lang.String[] r2 = new java.lang.String[]{r8}     // Catch:{ SQLiteException -> 0x00bd, all -> 0x00bb }
            java.lang.String r3 = "select parameters from default_event_params where app_id=?"
            android.database.Cursor r1 = r1.rawQuery(r3, r2)     // Catch:{ SQLiteException -> 0x00bd, all -> 0x00bb }
            boolean r2 = r1.moveToFirst()     // Catch:{ SQLiteException -> 0x00b9 }
            if (r2 != 0) goto L_0x002e
            com.google.android.gms.measurement.internal.n4 r8 = r7.f5994a     // Catch:{ SQLiteException -> 0x00b9 }
            com.google.android.gms.measurement.internal.j3 r8 = r8.d()     // Catch:{ SQLiteException -> 0x00b9 }
            com.google.android.gms.measurement.internal.h3 r8 = r8.v()     // Catch:{ SQLiteException -> 0x00b9 }
            java.lang.String r2 = "Default event parameters not found"
            r8.a(r2)     // Catch:{ SQLiteException -> 0x00b9 }
            r1.close()
            return r0
        L_0x002e:
            r2 = 0
            byte[] r2 = r1.getBlob(r2)     // Catch:{ SQLiteException -> 0x00b9 }
            com.google.android.gms.internal.measurement.zzfn r3 = com.google.android.gms.internal.measurement.zzfo.zze()     // Catch:{ IOException -> 0x00a1 }
            com.google.android.gms.internal.measurement.zzlf r2 = com.google.android.gms.measurement.internal.y8.D(r3, r2)     // Catch:{ IOException -> 0x00a1 }
            com.google.android.gms.internal.measurement.zzfn r2 = (com.google.android.gms.internal.measurement.zzfn) r2     // Catch:{ IOException -> 0x00a1 }
            com.google.android.gms.internal.measurement.zzjz r2 = r2.zzaA()     // Catch:{ IOException -> 0x00a1 }
            com.google.android.gms.internal.measurement.zzfo r2 = (com.google.android.gms.internal.measurement.zzfo) r2     // Catch:{ IOException -> 0x00a1 }
            com.google.android.gms.measurement.internal.w8 r8 = r7.f6214b     // Catch:{ SQLiteException -> 0x00b9 }
            r8.f0()     // Catch:{ SQLiteException -> 0x00b9 }
            java.util.List r8 = r2.zzi()     // Catch:{ SQLiteException -> 0x00b9 }
            android.os.Bundle r2 = new android.os.Bundle     // Catch:{ SQLiteException -> 0x00b9 }
            r2.<init>()     // Catch:{ SQLiteException -> 0x00b9 }
            java.util.Iterator r8 = r8.iterator()     // Catch:{ SQLiteException -> 0x00b9 }
        L_0x0055:
            boolean r3 = r8.hasNext()     // Catch:{ SQLiteException -> 0x00b9 }
            if (r3 == 0) goto L_0x009d
            java.lang.Object r3 = r8.next()     // Catch:{ SQLiteException -> 0x00b9 }
            com.google.android.gms.internal.measurement.zzfs r3 = (com.google.android.gms.internal.measurement.zzfs) r3     // Catch:{ SQLiteException -> 0x00b9 }
            java.lang.String r4 = r3.zzg()     // Catch:{ SQLiteException -> 0x00b9 }
            boolean r5 = r3.zzu()     // Catch:{ SQLiteException -> 0x00b9 }
            if (r5 == 0) goto L_0x0073
            double r5 = r3.zza()     // Catch:{ SQLiteException -> 0x00b9 }
            r2.putDouble(r4, r5)     // Catch:{ SQLiteException -> 0x00b9 }
            goto L_0x0055
        L_0x0073:
            boolean r5 = r3.zzv()     // Catch:{ SQLiteException -> 0x00b9 }
            if (r5 == 0) goto L_0x0081
            float r3 = r3.zzb()     // Catch:{ SQLiteException -> 0x00b9 }
            r2.putFloat(r4, r3)     // Catch:{ SQLiteException -> 0x00b9 }
            goto L_0x0055
        L_0x0081:
            boolean r5 = r3.zzy()     // Catch:{ SQLiteException -> 0x00b9 }
            if (r5 == 0) goto L_0x008f
            java.lang.String r3 = r3.zzh()     // Catch:{ SQLiteException -> 0x00b9 }
            r2.putString(r4, r3)     // Catch:{ SQLiteException -> 0x00b9 }
            goto L_0x0055
        L_0x008f:
            boolean r5 = r3.zzw()     // Catch:{ SQLiteException -> 0x00b9 }
            if (r5 == 0) goto L_0x0055
            long r5 = r3.zzd()     // Catch:{ SQLiteException -> 0x00b9 }
            r2.putLong(r4, r5)     // Catch:{ SQLiteException -> 0x00b9 }
            goto L_0x0055
        L_0x009d:
            r1.close()
            return r2
        L_0x00a1:
            r2 = move-exception
            com.google.android.gms.measurement.internal.n4 r3 = r7.f5994a     // Catch:{ SQLiteException -> 0x00b9 }
            com.google.android.gms.measurement.internal.j3 r3 = r3.d()     // Catch:{ SQLiteException -> 0x00b9 }
            com.google.android.gms.measurement.internal.h3 r3 = r3.r()     // Catch:{ SQLiteException -> 0x00b9 }
            java.lang.String r4 = "Failed to retrieve default event parameters. appId"
            java.lang.Object r8 = com.google.android.gms.measurement.internal.j3.z(r8)     // Catch:{ SQLiteException -> 0x00b9 }
            r3.c(r4, r8, r2)     // Catch:{ SQLiteException -> 0x00b9 }
            r1.close()
            return r0
        L_0x00b9:
            r8 = move-exception
            goto L_0x00bf
        L_0x00bb:
            r8 = move-exception
            goto L_0x00d6
        L_0x00bd:
            r8 = move-exception
            r1 = r0
        L_0x00bf:
            com.google.android.gms.measurement.internal.n4 r2 = r7.f5994a     // Catch:{ all -> 0x00d4 }
            com.google.android.gms.measurement.internal.j3 r2 = r2.d()     // Catch:{ all -> 0x00d4 }
            com.google.android.gms.measurement.internal.h3 r2 = r2.r()     // Catch:{ all -> 0x00d4 }
            java.lang.String r3 = "Error selecting default event parameters"
            r2.b(r3, r8)     // Catch:{ all -> 0x00d4 }
            if (r1 == 0) goto L_0x00d3
            r1.close()
        L_0x00d3:
            return r0
        L_0x00d4:
            r8 = move-exception
            r0 = r1
        L_0x00d6:
            if (r0 == 0) goto L_0x00db
            r0.close()
        L_0x00db:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.j.S(java.lang.String):android.os.Bundle");
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0190 A[Catch:{ SQLiteException -> 0x0261 }] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0194 A[Catch:{ SQLiteException -> 0x0261 }] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x01ce A[Catch:{ SQLiteException -> 0x0261 }] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0203 A[Catch:{ SQLiteException -> 0x0261 }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0206 A[Catch:{ SQLiteException -> 0x0261 }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0215 A[Catch:{ SQLiteException -> 0x0261 }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0238 A[Catch:{ SQLiteException -> 0x0261 }] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x024a A[Catch:{ SQLiteException -> 0x0261 }] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x027c  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0284  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.measurement.internal.u4 T(java.lang.String r25) {
        /*
            r24 = this;
            r1 = r24
            r2 = r25
            com.google.android.gms.common.internal.s.g(r25)
            r24.h()
            r24.i()
            r3 = 0
            android.database.sqlite.SQLiteDatabase r4 = r24.R()     // Catch:{ SQLiteException -> 0x0265, all -> 0x0263 }
            r0 = 28
            java.lang.String[] r6 = new java.lang.String[r0]     // Catch:{ SQLiteException -> 0x0265, all -> 0x0263 }
            java.lang.String r0 = "app_instance_id"
            r12 = 0
            r6[r12] = r0     // Catch:{ SQLiteException -> 0x0265, all -> 0x0263 }
            java.lang.String r0 = "gmp_app_id"
            r13 = 1
            r6[r13] = r0     // Catch:{ SQLiteException -> 0x0265, all -> 0x0263 }
            java.lang.String r0 = "resettable_device_id_hash"
            r14 = 2
            r6[r14] = r0     // Catch:{ SQLiteException -> 0x0265, all -> 0x0263 }
            java.lang.String r0 = "last_bundle_index"
            r15 = 3
            r6[r15] = r0     // Catch:{ SQLiteException -> 0x0265, all -> 0x0263 }
            java.lang.String r0 = "last_bundle_start_timestamp"
            r11 = 4
            r6[r11] = r0     // Catch:{ SQLiteException -> 0x0265, all -> 0x0263 }
            java.lang.String r0 = "last_bundle_end_timestamp"
            r10 = 5
            r6[r10] = r0     // Catch:{ SQLiteException -> 0x0265, all -> 0x0263 }
            java.lang.String r0 = "app_version"
            r9 = 6
            r6[r9] = r0     // Catch:{ SQLiteException -> 0x0265, all -> 0x0263 }
            java.lang.String r0 = "app_store"
            r8 = 7
            r6[r8] = r0     // Catch:{ SQLiteException -> 0x0265, all -> 0x0263 }
            java.lang.String r0 = "gmp_version"
            r7 = 8
            r6[r7] = r0     // Catch:{ SQLiteException -> 0x0265, all -> 0x0263 }
            java.lang.String r0 = "dev_cert_hash"
            r5 = 9
            r6[r5] = r0     // Catch:{ SQLiteException -> 0x0265, all -> 0x0263 }
            java.lang.String r0 = "measurement_enabled"
            r15 = 10
            r6[r15] = r0     // Catch:{ SQLiteException -> 0x0265, all -> 0x0263 }
            java.lang.String r0 = "day"
            r15 = 11
            r6[r15] = r0     // Catch:{ SQLiteException -> 0x0265, all -> 0x0263 }
            java.lang.String r0 = "daily_public_events_count"
            r15 = 12
            r6[r15] = r0     // Catch:{ SQLiteException -> 0x0265, all -> 0x0263 }
            java.lang.String r0 = "daily_events_count"
            r15 = 13
            r6[r15] = r0     // Catch:{ SQLiteException -> 0x0265, all -> 0x0263 }
            java.lang.String r0 = "daily_conversions_count"
            r15 = 14
            r6[r15] = r0     // Catch:{ SQLiteException -> 0x0265, all -> 0x0263 }
            java.lang.String r0 = "config_fetched_time"
            r15 = 15
            r6[r15] = r0     // Catch:{ SQLiteException -> 0x0265, all -> 0x0263 }
            java.lang.String r0 = "failed_config_fetch_time"
            r16 = 16
            r6[r16] = r0     // Catch:{ SQLiteException -> 0x0265, all -> 0x0263 }
            java.lang.String r0 = "app_version_int"
            r15 = 17
            r6[r15] = r0     // Catch:{ SQLiteException -> 0x0265, all -> 0x0263 }
            java.lang.String r0 = "firebase_instance_id"
            r17 = 18
            r6[r17] = r0     // Catch:{ SQLiteException -> 0x0265, all -> 0x0263 }
            java.lang.String r0 = "daily_error_events_count"
            r17 = 19
            r6[r17] = r0     // Catch:{ SQLiteException -> 0x0265, all -> 0x0263 }
            java.lang.String r0 = "daily_realtime_events_count"
            r17 = 20
            r6[r17] = r0     // Catch:{ SQLiteException -> 0x0265, all -> 0x0263 }
            java.lang.String r0 = "health_monitor_sample"
            r17 = 21
            r6[r17] = r0     // Catch:{ SQLiteException -> 0x0265, all -> 0x0263 }
            java.lang.String r0 = "android_id"
            r15 = 22
            r6[r15] = r0     // Catch:{ SQLiteException -> 0x0265, all -> 0x0263 }
            java.lang.String r0 = "adid_reporting_enabled"
            r15 = 23
            r6[r15] = r0     // Catch:{ SQLiteException -> 0x0265, all -> 0x0263 }
            java.lang.String r0 = "admob_app_id"
            r18 = 24
            r6[r18] = r0     // Catch:{ SQLiteException -> 0x0265, all -> 0x0263 }
            java.lang.String r0 = "dynamite_version"
            r15 = 25
            r6[r15] = r0     // Catch:{ SQLiteException -> 0x0265, all -> 0x0263 }
            java.lang.String r0 = "safelisted_events"
            r15 = 26
            r6[r15] = r0     // Catch:{ SQLiteException -> 0x0265, all -> 0x0263 }
            java.lang.String r0 = "ga_app_id"
            r19 = 27
            r6[r19] = r0     // Catch:{ SQLiteException -> 0x0265, all -> 0x0263 }
            java.lang.String[] r0 = new java.lang.String[]{r25}     // Catch:{ SQLiteException -> 0x0265, all -> 0x0263 }
            java.lang.String r19 = "apps"
            java.lang.String r20 = "app_id=?"
            r21 = 0
            r22 = 0
            r23 = 0
            r15 = 9
            r5 = r19
            r15 = 8
            r7 = r20
            r15 = 7
            r8 = r0
            r0 = 6
            r9 = r21
            r15 = 5
            r10 = r22
            r0 = 4
            r11 = r23
            android.database.Cursor r4 = r4.query(r5, r6, r7, r8, r9, r10, r11)     // Catch:{ SQLiteException -> 0x0265, all -> 0x0263 }
            boolean r5 = r4.moveToFirst()     // Catch:{ SQLiteException -> 0x0261 }
            if (r5 != 0) goto L_0x00e5
            r4.close()
            return r3
        L_0x00e5:
            com.google.android.gms.measurement.internal.u4 r5 = new com.google.android.gms.measurement.internal.u4     // Catch:{ SQLiteException -> 0x0261 }
            com.google.android.gms.measurement.internal.w8 r6 = r1.f6214b     // Catch:{ SQLiteException -> 0x0261 }
            com.google.android.gms.measurement.internal.n4 r6 = r6.b0()     // Catch:{ SQLiteException -> 0x0261 }
            r5.<init>(r6, r2)     // Catch:{ SQLiteException -> 0x0261 }
            java.lang.String r6 = r4.getString(r12)     // Catch:{ SQLiteException -> 0x0261 }
            r5.i(r6)     // Catch:{ SQLiteException -> 0x0261 }
            java.lang.String r6 = r4.getString(r13)     // Catch:{ SQLiteException -> 0x0261 }
            r5.y(r6)     // Catch:{ SQLiteException -> 0x0261 }
            java.lang.String r6 = r4.getString(r14)     // Catch:{ SQLiteException -> 0x0261 }
            r5.H(r6)     // Catch:{ SQLiteException -> 0x0261 }
            r6 = 3
            long r6 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x0261 }
            r5.D(r6)     // Catch:{ SQLiteException -> 0x0261 }
            long r6 = r4.getLong(r0)     // Catch:{ SQLiteException -> 0x0261 }
            r5.E(r6)     // Catch:{ SQLiteException -> 0x0261 }
            long r6 = r4.getLong(r15)     // Catch:{ SQLiteException -> 0x0261 }
            r5.C(r6)     // Catch:{ SQLiteException -> 0x0261 }
            r0 = 6
            java.lang.String r0 = r4.getString(r0)     // Catch:{ SQLiteException -> 0x0261 }
            r5.k(r0)     // Catch:{ SQLiteException -> 0x0261 }
            r0 = 7
            java.lang.String r0 = r4.getString(r0)     // Catch:{ SQLiteException -> 0x0261 }
            r5.j(r0)     // Catch:{ SQLiteException -> 0x0261 }
            r0 = 8
            long r6 = r4.getLong(r0)     // Catch:{ SQLiteException -> 0x0261 }
            r5.z(r6)     // Catch:{ SQLiteException -> 0x0261 }
            r0 = 9
            long r6 = r4.getLong(r0)     // Catch:{ SQLiteException -> 0x0261 }
            r5.t(r6)     // Catch:{ SQLiteException -> 0x0261 }
            r0 = 10
            boolean r6 = r4.isNull(r0)     // Catch:{ SQLiteException -> 0x0261 }
            if (r6 != 0) goto L_0x014e
            int r0 = r4.getInt(r0)     // Catch:{ SQLiteException -> 0x0261 }
            if (r0 == 0) goto L_0x014c
            goto L_0x014e
        L_0x014c:
            r0 = 0
            goto L_0x014f
        L_0x014e:
            r0 = 1
        L_0x014f:
            r5.F(r0)     // Catch:{ SQLiteException -> 0x0261 }
            r0 = 11
            long r6 = r4.getLong(r0)     // Catch:{ SQLiteException -> 0x0261 }
            r5.s(r6)     // Catch:{ SQLiteException -> 0x0261 }
            r0 = 12
            long r6 = r4.getLong(r0)     // Catch:{ SQLiteException -> 0x0261 }
            r5.q(r6)     // Catch:{ SQLiteException -> 0x0261 }
            r0 = 13
            long r6 = r4.getLong(r0)     // Catch:{ SQLiteException -> 0x0261 }
            r5.p(r6)     // Catch:{ SQLiteException -> 0x0261 }
            r0 = 14
            long r6 = r4.getLong(r0)     // Catch:{ SQLiteException -> 0x0261 }
            r5.n(r6)     // Catch:{ SQLiteException -> 0x0261 }
            r0 = 15
            long r6 = r4.getLong(r0)     // Catch:{ SQLiteException -> 0x0261 }
            r5.m(r6)     // Catch:{ SQLiteException -> 0x0261 }
            r0 = 16
            long r6 = r4.getLong(r0)     // Catch:{ SQLiteException -> 0x0261 }
            r5.v(r6)     // Catch:{ SQLiteException -> 0x0261 }
            r0 = 17
            boolean r6 = r4.isNull(r0)     // Catch:{ SQLiteException -> 0x0261 }
            if (r6 == 0) goto L_0x0194
            r6 = -2147483648(0xffffffff80000000, double:NaN)
            goto L_0x0199
        L_0x0194:
            int r0 = r4.getInt(r0)     // Catch:{ SQLiteException -> 0x0261 }
            long r6 = (long) r0     // Catch:{ SQLiteException -> 0x0261 }
        L_0x0199:
            r5.l(r6)     // Catch:{ SQLiteException -> 0x0261 }
            r0 = 18
            java.lang.String r0 = r4.getString(r0)     // Catch:{ SQLiteException -> 0x0261 }
            r5.w(r0)     // Catch:{ SQLiteException -> 0x0261 }
            r0 = 19
            long r6 = r4.getLong(r0)     // Catch:{ SQLiteException -> 0x0261 }
            r5.o(r6)     // Catch:{ SQLiteException -> 0x0261 }
            r0 = 20
            long r6 = r4.getLong(r0)     // Catch:{ SQLiteException -> 0x0261 }
            r5.r(r6)     // Catch:{ SQLiteException -> 0x0261 }
            r0 = 21
            java.lang.String r0 = r4.getString(r0)     // Catch:{ SQLiteException -> 0x0261 }
            r5.B(r0)     // Catch:{ SQLiteException -> 0x0261 }
            com.google.android.gms.measurement.internal.n4 r0 = r1.f5994a     // Catch:{ SQLiteException -> 0x0261 }
            com.google.android.gms.measurement.internal.g r0 = r0.z()     // Catch:{ SQLiteException -> 0x0261 }
            com.google.android.gms.measurement.internal.x2 r6 = com.google.android.gms.measurement.internal.y2.f6643p0     // Catch:{ SQLiteException -> 0x0261 }
            boolean r0 = r0.B(r3, r6)     // Catch:{ SQLiteException -> 0x0261 }
            if (r0 != 0) goto L_0x01e0
            r0 = 22
            boolean r6 = r4.isNull(r0)     // Catch:{ SQLiteException -> 0x0261 }
            if (r6 == 0) goto L_0x01d9
            r6 = 0
            goto L_0x01dd
        L_0x01d9:
            long r6 = r4.getLong(r0)     // Catch:{ SQLiteException -> 0x0261 }
        L_0x01dd:
            r5.h(r6)     // Catch:{ SQLiteException -> 0x0261 }
        L_0x01e0:
            r0 = 23
            boolean r6 = r4.isNull(r0)     // Catch:{ SQLiteException -> 0x0261 }
            if (r6 != 0) goto L_0x01ee
            int r0 = r4.getInt(r0)     // Catch:{ SQLiteException -> 0x0261 }
            if (r0 == 0) goto L_0x01ef
        L_0x01ee:
            r12 = 1
        L_0x01ef:
            r5.g(r12)     // Catch:{ SQLiteException -> 0x0261 }
            r0 = 24
            java.lang.String r0 = r4.getString(r0)     // Catch:{ SQLiteException -> 0x0261 }
            r5.f(r0)     // Catch:{ SQLiteException -> 0x0261 }
            r0 = 25
            boolean r6 = r4.isNull(r0)     // Catch:{ SQLiteException -> 0x0261 }
            if (r6 == 0) goto L_0x0206
            r6 = 0
            goto L_0x020a
        L_0x0206:
            long r6 = r4.getLong(r0)     // Catch:{ SQLiteException -> 0x0261 }
        L_0x020a:
            r5.u(r6)     // Catch:{ SQLiteException -> 0x0261 }
            r0 = 26
            boolean r6 = r4.isNull(r0)     // Catch:{ SQLiteException -> 0x0261 }
            if (r6 != 0) goto L_0x0227
            java.lang.String r0 = r4.getString(r0)     // Catch:{ SQLiteException -> 0x0261 }
            java.lang.String r6 = ","
            r7 = -1
            java.lang.String[] r0 = r0.split(r6, r7)     // Catch:{ SQLiteException -> 0x0261 }
            java.util.List r0 = java.util.Arrays.asList(r0)     // Catch:{ SQLiteException -> 0x0261 }
            r5.I(r0)     // Catch:{ SQLiteException -> 0x0261 }
        L_0x0227:
            com.google.android.gms.internal.measurement.zzoq.zzc()     // Catch:{ SQLiteException -> 0x0261 }
            com.google.android.gms.measurement.internal.n4 r0 = r1.f5994a     // Catch:{ SQLiteException -> 0x0261 }
            com.google.android.gms.measurement.internal.g r0 = r0.z()     // Catch:{ SQLiteException -> 0x0261 }
            com.google.android.gms.measurement.internal.x2 r6 = com.google.android.gms.measurement.internal.y2.f6623f0     // Catch:{ SQLiteException -> 0x0261 }
            boolean r0 = r0.B(r2, r6)     // Catch:{ SQLiteException -> 0x0261 }
            if (r0 == 0) goto L_0x0241
            r0 = 27
            java.lang.String r0 = r4.getString(r0)     // Catch:{ SQLiteException -> 0x0261 }
            r5.x(r0)     // Catch:{ SQLiteException -> 0x0261 }
        L_0x0241:
            r5.d()     // Catch:{ SQLiteException -> 0x0261 }
            boolean r0 = r4.moveToNext()     // Catch:{ SQLiteException -> 0x0261 }
            if (r0 == 0) goto L_0x025d
            com.google.android.gms.measurement.internal.n4 r0 = r1.f5994a     // Catch:{ SQLiteException -> 0x0261 }
            com.google.android.gms.measurement.internal.j3 r0 = r0.d()     // Catch:{ SQLiteException -> 0x0261 }
            com.google.android.gms.measurement.internal.h3 r0 = r0.r()     // Catch:{ SQLiteException -> 0x0261 }
            java.lang.String r6 = "Got multiple records for app, expected one. appId"
            java.lang.Object r7 = com.google.android.gms.measurement.internal.j3.z(r25)     // Catch:{ SQLiteException -> 0x0261 }
            r0.b(r6, r7)     // Catch:{ SQLiteException -> 0x0261 }
        L_0x025d:
            r4.close()
            return r5
        L_0x0261:
            r0 = move-exception
            goto L_0x0267
        L_0x0263:
            r0 = move-exception
            goto L_0x0282
        L_0x0265:
            r0 = move-exception
            r4 = r3
        L_0x0267:
            com.google.android.gms.measurement.internal.n4 r5 = r1.f5994a     // Catch:{ all -> 0x0280 }
            com.google.android.gms.measurement.internal.j3 r5 = r5.d()     // Catch:{ all -> 0x0280 }
            com.google.android.gms.measurement.internal.h3 r5 = r5.r()     // Catch:{ all -> 0x0280 }
            java.lang.String r6 = "Error querying app. appId"
            java.lang.Object r2 = com.google.android.gms.measurement.internal.j3.z(r25)     // Catch:{ all -> 0x0280 }
            r5.c(r6, r2, r0)     // Catch:{ all -> 0x0280 }
            if (r4 == 0) goto L_0x027f
            r4.close()
        L_0x027f:
            return r3
        L_0x0280:
            r0 = move-exception
            r3 = r4
        L_0x0282:
            if (r3 == 0) goto L_0x0287
            r3.close()
        L_0x0287:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.j.T(java.lang.String):com.google.android.gms.measurement.internal.u4");
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0148  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0150  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.measurement.internal.c U(java.lang.String r37, java.lang.String r38) {
        /*
            r36 = this;
            r1 = r36
            r8 = r38
            com.google.android.gms.common.internal.s.g(r37)
            com.google.android.gms.common.internal.s.g(r38)
            r36.h()
            r36.i()
            r9 = 0
            android.database.sqlite.SQLiteDatabase r10 = r36.R()     // Catch:{ SQLiteException -> 0x0127, all -> 0x0125 }
            r0 = 11
            java.lang.String[] r12 = new java.lang.String[r0]     // Catch:{ SQLiteException -> 0x0127, all -> 0x0125 }
            java.lang.String r0 = "origin"
            r2 = 0
            r12[r2] = r0     // Catch:{ SQLiteException -> 0x0127, all -> 0x0125 }
            java.lang.String r0 = "value"
            r3 = 1
            r12[r3] = r0     // Catch:{ SQLiteException -> 0x0127, all -> 0x0125 }
            java.lang.String r0 = "active"
            r4 = 2
            r12[r4] = r0     // Catch:{ SQLiteException -> 0x0127, all -> 0x0125 }
            java.lang.String r0 = "trigger_event_name"
            r5 = 3
            r12[r5] = r0     // Catch:{ SQLiteException -> 0x0127, all -> 0x0125 }
            java.lang.String r0 = "trigger_timeout"
            r6 = 4
            r12[r6] = r0     // Catch:{ SQLiteException -> 0x0127, all -> 0x0125 }
            java.lang.String r0 = "timed_out_event"
            r7 = 5
            r12[r7] = r0     // Catch:{ SQLiteException -> 0x0127, all -> 0x0125 }
            java.lang.String r0 = "creation_timestamp"
            r15 = 6
            r12[r15] = r0     // Catch:{ SQLiteException -> 0x0127, all -> 0x0125 }
            java.lang.String r0 = "triggered_event"
            r14 = 7
            r12[r14] = r0     // Catch:{ SQLiteException -> 0x0127, all -> 0x0125 }
            java.lang.String r0 = "triggered_timestamp"
            r13 = 8
            r12[r13] = r0     // Catch:{ SQLiteException -> 0x0127, all -> 0x0125 }
            java.lang.String r0 = "time_to_live"
            r11 = 9
            r12[r11] = r0     // Catch:{ SQLiteException -> 0x0127, all -> 0x0125 }
            java.lang.String r0 = "expired_event"
            r7 = 10
            r12[r7] = r0     // Catch:{ SQLiteException -> 0x0127, all -> 0x0125 }
            java.lang.String[] r0 = new java.lang.String[]{r37, r38}     // Catch:{ SQLiteException -> 0x0127, all -> 0x0125 }
            java.lang.String r16 = "conditional_properties"
            java.lang.String r17 = "app_id=? and name=?"
            r18 = 0
            r19 = 0
            r20 = 0
            r7 = 9
            r11 = r16
            r7 = 8
            r13 = r17
            r7 = 7
            r14 = r0
            r0 = 6
            r15 = r18
            r16 = r19
            r17 = r20
            android.database.Cursor r10 = r10.query(r11, r12, r13, r14, r15, r16, r17)     // Catch:{ SQLiteException -> 0x0127, all -> 0x0125 }
            boolean r11 = r10.moveToFirst()     // Catch:{ SQLiteException -> 0x0123 }
            if (r11 != 0) goto L_0x0080
            r10.close()
            return r9
        L_0x0080:
            java.lang.String r23 = r10.getString(r2)     // Catch:{ SQLiteException -> 0x0123 }
            java.lang.Object r11 = r1.a0(r10, r3)     // Catch:{ SQLiteException -> 0x0123 }
            int r4 = r10.getInt(r4)     // Catch:{ SQLiteException -> 0x0123 }
            if (r4 == 0) goto L_0x0091
            r27 = 1
            goto L_0x0093
        L_0x0091:
            r27 = 0
        L_0x0093:
            java.lang.String r28 = r10.getString(r5)     // Catch:{ SQLiteException -> 0x0123 }
            long r30 = r10.getLong(r6)     // Catch:{ SQLiteException -> 0x0123 }
            com.google.android.gms.measurement.internal.w8 r2 = r1.f6214b     // Catch:{ SQLiteException -> 0x0123 }
            com.google.android.gms.measurement.internal.y8 r2 = r2.f0()     // Catch:{ SQLiteException -> 0x0123 }
            r3 = 5
            byte[] r3 = r10.getBlob(r3)     // Catch:{ SQLiteException -> 0x0123 }
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.t> r4 = com.google.android.gms.measurement.internal.t.CREATOR     // Catch:{ SQLiteException -> 0x0123 }
            android.os.Parcelable r2 = r2.A(r3, r4)     // Catch:{ SQLiteException -> 0x0123 }
            r29 = r2
            com.google.android.gms.measurement.internal.t r29 = (com.google.android.gms.measurement.internal.t) r29     // Catch:{ SQLiteException -> 0x0123 }
            long r25 = r10.getLong(r0)     // Catch:{ SQLiteException -> 0x0123 }
            com.google.android.gms.measurement.internal.w8 r0 = r1.f6214b     // Catch:{ SQLiteException -> 0x0123 }
            com.google.android.gms.measurement.internal.y8 r0 = r0.f0()     // Catch:{ SQLiteException -> 0x0123 }
            byte[] r2 = r10.getBlob(r7)     // Catch:{ SQLiteException -> 0x0123 }
            android.os.Parcelable r0 = r0.A(r2, r4)     // Catch:{ SQLiteException -> 0x0123 }
            r32 = r0
            com.google.android.gms.measurement.internal.t r32 = (com.google.android.gms.measurement.internal.t) r32     // Catch:{ SQLiteException -> 0x0123 }
            r0 = 8
            long r5 = r10.getLong(r0)     // Catch:{ SQLiteException -> 0x0123 }
            r0 = 9
            long r33 = r10.getLong(r0)     // Catch:{ SQLiteException -> 0x0123 }
            com.google.android.gms.measurement.internal.w8 r0 = r1.f6214b     // Catch:{ SQLiteException -> 0x0123 }
            com.google.android.gms.measurement.internal.y8 r0 = r0.f0()     // Catch:{ SQLiteException -> 0x0123 }
            r2 = 10
            byte[] r2 = r10.getBlob(r2)     // Catch:{ SQLiteException -> 0x0123 }
            android.os.Parcelable r0 = r0.A(r2, r4)     // Catch:{ SQLiteException -> 0x0123 }
            r35 = r0
            com.google.android.gms.measurement.internal.t r35 = (com.google.android.gms.measurement.internal.t) r35     // Catch:{ SQLiteException -> 0x0123 }
            com.google.android.gms.measurement.internal.z8 r24 = new com.google.android.gms.measurement.internal.z8     // Catch:{ SQLiteException -> 0x0123 }
            r2 = r24
            r3 = r38
            r4 = r5
            r6 = r11
            r7 = r23
            r2.<init>(r3, r4, r6, r7)     // Catch:{ SQLiteException -> 0x0123 }
            com.google.android.gms.measurement.internal.c r0 = new com.google.android.gms.measurement.internal.c     // Catch:{ SQLiteException -> 0x0123 }
            r21 = r0
            r22 = r37
            r21.<init>(r22, r23, r24, r25, r27, r28, r29, r30, r32, r33, r35)     // Catch:{ SQLiteException -> 0x0123 }
            boolean r2 = r10.moveToNext()     // Catch:{ SQLiteException -> 0x0123 }
            if (r2 == 0) goto L_0x011f
            com.google.android.gms.measurement.internal.n4 r2 = r1.f5994a     // Catch:{ SQLiteException -> 0x0123 }
            com.google.android.gms.measurement.internal.j3 r2 = r2.d()     // Catch:{ SQLiteException -> 0x0123 }
            com.google.android.gms.measurement.internal.h3 r2 = r2.r()     // Catch:{ SQLiteException -> 0x0123 }
            java.lang.String r3 = "Got multiple records for conditional property, expected one"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.j3.z(r37)     // Catch:{ SQLiteException -> 0x0123 }
            com.google.android.gms.measurement.internal.n4 r5 = r1.f5994a     // Catch:{ SQLiteException -> 0x0123 }
            com.google.android.gms.measurement.internal.e3 r5 = r5.D()     // Catch:{ SQLiteException -> 0x0123 }
            java.lang.String r5 = r5.s(r8)     // Catch:{ SQLiteException -> 0x0123 }
            r2.c(r3, r4, r5)     // Catch:{ SQLiteException -> 0x0123 }
        L_0x011f:
            r10.close()
            return r0
        L_0x0123:
            r0 = move-exception
            goto L_0x0129
        L_0x0125:
            r0 = move-exception
            goto L_0x014e
        L_0x0127:
            r0 = move-exception
            r10 = r9
        L_0x0129:
            com.google.android.gms.measurement.internal.n4 r2 = r1.f5994a     // Catch:{ all -> 0x014c }
            com.google.android.gms.measurement.internal.j3 r2 = r2.d()     // Catch:{ all -> 0x014c }
            com.google.android.gms.measurement.internal.h3 r2 = r2.r()     // Catch:{ all -> 0x014c }
            java.lang.String r3 = "Error querying conditional property"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.j3.z(r37)     // Catch:{ all -> 0x014c }
            com.google.android.gms.measurement.internal.n4 r5 = r1.f5994a     // Catch:{ all -> 0x014c }
            com.google.android.gms.measurement.internal.e3 r5 = r5.D()     // Catch:{ all -> 0x014c }
            java.lang.String r5 = r5.s(r8)     // Catch:{ all -> 0x014c }
            r2.d(r3, r4, r5, r0)     // Catch:{ all -> 0x014c }
            if (r10 == 0) goto L_0x014b
            r10.close()
        L_0x014b:
            return r9
        L_0x014c:
            r0 = move-exception
            r9 = r10
        L_0x014e:
            if (r9 == 0) goto L_0x0153
            r9.close()
        L_0x0153:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.j.U(java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.c");
    }

    public final h V(long j10, String str, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        return W(j10, str, 1, false, false, z12, false, z14);
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x0134  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x013b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.measurement.internal.h W(long r24, java.lang.String r26, long r27, boolean r29, boolean r30, boolean r31, boolean r32, boolean r33) {
        /*
            r23 = this;
            r1 = r23
            java.lang.String r0 = "daily_realtime_events_count"
            java.lang.String r2 = "daily_error_events_count"
            java.lang.String r3 = "daily_conversions_count"
            java.lang.String r4 = "daily_public_events_count"
            java.lang.String r5 = "daily_events_count"
            java.lang.String r6 = "day"
            com.google.android.gms.common.internal.s.g(r26)
            r23.h()
            r23.i()
            java.lang.String[] r7 = new java.lang.String[]{r26}
            com.google.android.gms.measurement.internal.h r8 = new com.google.android.gms.measurement.internal.h
            r8.<init>()
            android.database.sqlite.SQLiteDatabase r15 = r23.R()     // Catch:{ SQLiteException -> 0x011d, all -> 0x011a }
            r10 = 6
            java.lang.String[] r12 = new java.lang.String[r10]     // Catch:{ SQLiteException -> 0x011d, all -> 0x011a }
            r14 = 0
            r12[r14] = r6     // Catch:{ SQLiteException -> 0x011d, all -> 0x011a }
            r13 = 1
            r12[r13] = r5     // Catch:{ SQLiteException -> 0x011d, all -> 0x011a }
            r11 = 2
            r12[r11] = r4     // Catch:{ SQLiteException -> 0x011d, all -> 0x011a }
            r10 = 3
            r12[r10] = r3     // Catch:{ SQLiteException -> 0x011d, all -> 0x011a }
            r9 = 4
            r12[r9] = r2     // Catch:{ SQLiteException -> 0x011d, all -> 0x011a }
            r9 = 5
            r12[r9] = r0     // Catch:{ SQLiteException -> 0x011d, all -> 0x011a }
            java.lang.String[] r16 = new java.lang.String[]{r26}     // Catch:{ SQLiteException -> 0x011d, all -> 0x011a }
            java.lang.String r17 = "apps"
            java.lang.String r18 = "app_id=?"
            r19 = 0
            r20 = 0
            r21 = 0
            r9 = 3
            r10 = r15
            r9 = 2
            r11 = r17
            r9 = 1
            r13 = r18
            r9 = 0
            r14 = r16
            r22 = r15
            r15 = r19
            r16 = r20
            r17 = r21
            android.database.Cursor r10 = r10.query(r11, r12, r13, r14, r15, r16, r17)     // Catch:{ SQLiteException -> 0x011d, all -> 0x011a }
            boolean r11 = r10.moveToFirst()     // Catch:{ SQLiteException -> 0x0117, all -> 0x0114 }
            if (r11 != 0) goto L_0x007b
            com.google.android.gms.measurement.internal.n4 r0 = r1.f5994a     // Catch:{ SQLiteException -> 0x0117, all -> 0x0114 }
            com.google.android.gms.measurement.internal.j3 r0 = r0.d()     // Catch:{ SQLiteException -> 0x0117, all -> 0x0114 }
            com.google.android.gms.measurement.internal.h3 r0 = r0.w()     // Catch:{ SQLiteException -> 0x0117, all -> 0x0114 }
            java.lang.String r2 = "Not updating daily counts, app is not known. appId"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.j3.z(r26)     // Catch:{ SQLiteException -> 0x0117, all -> 0x0114 }
            r0.b(r2, r3)     // Catch:{ SQLiteException -> 0x0117, all -> 0x0114 }
            r10.close()
            return r8
        L_0x007b:
            long r11 = r10.getLong(r9)     // Catch:{ SQLiteException -> 0x0117, all -> 0x0114 }
            int r9 = (r11 > r24 ? 1 : (r11 == r24 ? 0 : -1))
            if (r9 != 0) goto L_0x00a6
            r9 = 1
            long r11 = r10.getLong(r9)     // Catch:{ SQLiteException -> 0x0117, all -> 0x0114 }
            r8.f6005b = r11     // Catch:{ SQLiteException -> 0x0117, all -> 0x0114 }
            r9 = 2
            long r11 = r10.getLong(r9)     // Catch:{ SQLiteException -> 0x0117, all -> 0x0114 }
            r8.f6004a = r11     // Catch:{ SQLiteException -> 0x0117, all -> 0x0114 }
            r9 = 3
            long r11 = r10.getLong(r9)     // Catch:{ SQLiteException -> 0x0117, all -> 0x0114 }
            r8.f6006c = r11     // Catch:{ SQLiteException -> 0x0117, all -> 0x0114 }
            r9 = 4
            long r11 = r10.getLong(r9)     // Catch:{ SQLiteException -> 0x0117, all -> 0x0114 }
            r8.f6007d = r11     // Catch:{ SQLiteException -> 0x0117, all -> 0x0114 }
            r9 = 5
            long r11 = r10.getLong(r9)     // Catch:{ SQLiteException -> 0x0117, all -> 0x0114 }
            r8.f6008e = r11     // Catch:{ SQLiteException -> 0x0117, all -> 0x0114 }
        L_0x00a6:
            if (r29 == 0) goto L_0x00ae
            long r11 = r8.f6005b     // Catch:{ SQLiteException -> 0x0117, all -> 0x0114 }
            long r11 = r11 + r27
            r8.f6005b = r11     // Catch:{ SQLiteException -> 0x0117, all -> 0x0114 }
        L_0x00ae:
            if (r30 == 0) goto L_0x00b6
            long r11 = r8.f6004a     // Catch:{ SQLiteException -> 0x0117, all -> 0x0114 }
            long r11 = r11 + r27
            r8.f6004a = r11     // Catch:{ SQLiteException -> 0x0117, all -> 0x0114 }
        L_0x00b6:
            if (r31 == 0) goto L_0x00be
            long r11 = r8.f6006c     // Catch:{ SQLiteException -> 0x0117, all -> 0x0114 }
            long r11 = r11 + r27
            r8.f6006c = r11     // Catch:{ SQLiteException -> 0x0117, all -> 0x0114 }
        L_0x00be:
            if (r32 == 0) goto L_0x00c6
            long r11 = r8.f6007d     // Catch:{ SQLiteException -> 0x0117, all -> 0x0114 }
            long r11 = r11 + r27
            r8.f6007d = r11     // Catch:{ SQLiteException -> 0x0117, all -> 0x0114 }
        L_0x00c6:
            if (r33 == 0) goto L_0x00ce
            long r11 = r8.f6008e     // Catch:{ SQLiteException -> 0x0117, all -> 0x0114 }
            long r11 = r11 + r27
            r8.f6008e = r11     // Catch:{ SQLiteException -> 0x0117, all -> 0x0114 }
        L_0x00ce:
            android.content.ContentValues r9 = new android.content.ContentValues     // Catch:{ SQLiteException -> 0x0117, all -> 0x0114 }
            r9.<init>()     // Catch:{ SQLiteException -> 0x0117, all -> 0x0114 }
            java.lang.Long r11 = java.lang.Long.valueOf(r24)     // Catch:{ SQLiteException -> 0x0117, all -> 0x0114 }
            r9.put(r6, r11)     // Catch:{ SQLiteException -> 0x0117, all -> 0x0114 }
            long r11 = r8.f6004a     // Catch:{ SQLiteException -> 0x0117, all -> 0x0114 }
            java.lang.Long r6 = java.lang.Long.valueOf(r11)     // Catch:{ SQLiteException -> 0x0117, all -> 0x0114 }
            r9.put(r4, r6)     // Catch:{ SQLiteException -> 0x0117, all -> 0x0114 }
            long r11 = r8.f6005b     // Catch:{ SQLiteException -> 0x0117, all -> 0x0114 }
            java.lang.Long r4 = java.lang.Long.valueOf(r11)     // Catch:{ SQLiteException -> 0x0117, all -> 0x0114 }
            r9.put(r5, r4)     // Catch:{ SQLiteException -> 0x0117, all -> 0x0114 }
            long r4 = r8.f6006c     // Catch:{ SQLiteException -> 0x0117, all -> 0x0114 }
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch:{ SQLiteException -> 0x0117, all -> 0x0114 }
            r9.put(r3, r4)     // Catch:{ SQLiteException -> 0x0117, all -> 0x0114 }
            long r3 = r8.f6007d     // Catch:{ SQLiteException -> 0x0117, all -> 0x0114 }
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch:{ SQLiteException -> 0x0117, all -> 0x0114 }
            r9.put(r2, r3)     // Catch:{ SQLiteException -> 0x0117, all -> 0x0114 }
            long r2 = r8.f6008e     // Catch:{ SQLiteException -> 0x0117, all -> 0x0114 }
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch:{ SQLiteException -> 0x0117, all -> 0x0114 }
            r9.put(r0, r2)     // Catch:{ SQLiteException -> 0x0117, all -> 0x0114 }
            java.lang.String r0 = "apps"
            java.lang.String r2 = "app_id=?"
            r3 = r22
            r3.update(r0, r9, r2, r7)     // Catch:{ SQLiteException -> 0x0117, all -> 0x0114 }
            r10.close()
            return r8
        L_0x0114:
            r0 = move-exception
            r9 = r10
            goto L_0x0139
        L_0x0117:
            r0 = move-exception
            r9 = r10
            goto L_0x011f
        L_0x011a:
            r0 = move-exception
            r9 = 0
            goto L_0x0139
        L_0x011d:
            r0 = move-exception
            r9 = 0
        L_0x011f:
            com.google.android.gms.measurement.internal.n4 r2 = r1.f5994a     // Catch:{ all -> 0x0138 }
            com.google.android.gms.measurement.internal.j3 r2 = r2.d()     // Catch:{ all -> 0x0138 }
            com.google.android.gms.measurement.internal.h3 r2 = r2.r()     // Catch:{ all -> 0x0138 }
            java.lang.String r3 = "Error updating daily counts. appId"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.j3.z(r26)     // Catch:{ all -> 0x0138 }
            r2.c(r3, r4, r0)     // Catch:{ all -> 0x0138 }
            if (r9 == 0) goto L_0x0137
            r9.close()
        L_0x0137:
            return r8
        L_0x0138:
            r0 = move-exception
        L_0x0139:
            if (r9 == 0) goto L_0x013e
            r9.close()
        L_0x013e:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.j.W(long, java.lang.String, long, boolean, boolean, boolean, boolean, boolean):com.google.android.gms.measurement.internal.h");
    }

    /* JADX WARNING: Removed duplicated region for block: B:48:0x012b  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0133  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.measurement.internal.p X(java.lang.String r30, java.lang.String r31) {
        /*
            r29 = this;
            r1 = r29
            com.google.android.gms.common.internal.s.g(r30)
            com.google.android.gms.common.internal.s.g(r31)
            r29.h()
            r29.i()
            java.util.ArrayList r0 = new java.util.ArrayList
            java.lang.String r2 = "lifetime_count"
            java.lang.String r3 = "current_bundle_count"
            java.lang.String r4 = "last_fire_timestamp"
            java.lang.String r5 = "last_bundled_timestamp"
            java.lang.String r6 = "last_bundled_day"
            java.lang.String r7 = "last_sampled_complex_event_id"
            java.lang.String r8 = "last_sampling_rate"
            java.lang.String r9 = "last_exempt_from_sampling"
            java.lang.String r10 = "current_session_count"
            java.lang.String[] r2 = new java.lang.String[]{r2, r3, r4, r5, r6, r7, r8, r9, r10}
            java.util.List r2 = java.util.Arrays.asList(r2)
            r0.<init>(r2)
            r2 = 0
            android.database.sqlite.SQLiteDatabase r3 = r29.R()     // Catch:{ SQLiteException -> 0x0108, all -> 0x0106 }
            r11 = 0
            java.lang.String[] r4 = new java.lang.String[r11]     // Catch:{ SQLiteException -> 0x0108, all -> 0x0106 }
            java.lang.Object[] r0 = r0.toArray(r4)     // Catch:{ SQLiteException -> 0x0108, all -> 0x0106 }
            r5 = r0
            java.lang.String[] r5 = (java.lang.String[]) r5     // Catch:{ SQLiteException -> 0x0108, all -> 0x0106 }
            java.lang.String[] r7 = new java.lang.String[]{r30, r31}     // Catch:{ SQLiteException -> 0x0108, all -> 0x0106 }
            java.lang.String r4 = "events"
            java.lang.String r6 = "app_id=? and name=?"
            r8 = 0
            r9 = 0
            r10 = 0
            android.database.Cursor r3 = r3.query(r4, r5, r6, r7, r8, r9, r10)     // Catch:{ SQLiteException -> 0x0108, all -> 0x0106 }
            boolean r0 = r3.moveToFirst()     // Catch:{ SQLiteException -> 0x0104 }
            if (r0 != 0) goto L_0x0055
            r3.close()
            return r2
        L_0x0055:
            long r15 = r3.getLong(r11)     // Catch:{ SQLiteException -> 0x0104 }
            r0 = 1
            long r17 = r3.getLong(r0)     // Catch:{ SQLiteException -> 0x0104 }
            r4 = 2
            long r21 = r3.getLong(r4)     // Catch:{ SQLiteException -> 0x0104 }
            r4 = 3
            boolean r5 = r3.isNull(r4)     // Catch:{ SQLiteException -> 0x0104 }
            r6 = 0
            if (r5 == 0) goto L_0x006f
            r23 = r6
            goto L_0x0075
        L_0x006f:
            long r4 = r3.getLong(r4)     // Catch:{ SQLiteException -> 0x0104 }
            r23 = r4
        L_0x0075:
            r4 = 4
            boolean r5 = r3.isNull(r4)     // Catch:{ SQLiteException -> 0x0104 }
            if (r5 == 0) goto L_0x007f
            r25 = r2
            goto L_0x0089
        L_0x007f:
            long r4 = r3.getLong(r4)     // Catch:{ SQLiteException -> 0x0104 }
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch:{ SQLiteException -> 0x0104 }
            r25 = r4
        L_0x0089:
            r4 = 5
            boolean r5 = r3.isNull(r4)     // Catch:{ SQLiteException -> 0x0104 }
            if (r5 == 0) goto L_0x0093
            r26 = r2
            goto L_0x009d
        L_0x0093:
            long r4 = r3.getLong(r4)     // Catch:{ SQLiteException -> 0x0104 }
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch:{ SQLiteException -> 0x0104 }
            r26 = r4
        L_0x009d:
            r4 = 6
            boolean r5 = r3.isNull(r4)     // Catch:{ SQLiteException -> 0x0104 }
            if (r5 == 0) goto L_0x00a7
            r27 = r2
            goto L_0x00b1
        L_0x00a7:
            long r4 = r3.getLong(r4)     // Catch:{ SQLiteException -> 0x0104 }
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch:{ SQLiteException -> 0x0104 }
            r27 = r4
        L_0x00b1:
            r4 = 7
            boolean r5 = r3.isNull(r4)     // Catch:{ SQLiteException -> 0x0104 }
            if (r5 != 0) goto L_0x00ca
            long r4 = r3.getLong(r4)     // Catch:{ SQLiteException -> 0x0104 }
            r8 = 1
            int r10 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r10 != 0) goto L_0x00c3
            r11 = 1
        L_0x00c3:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r11)     // Catch:{ SQLiteException -> 0x0104 }
            r28 = r0
            goto L_0x00cc
        L_0x00ca:
            r28 = r2
        L_0x00cc:
            r0 = 8
            boolean r4 = r3.isNull(r0)     // Catch:{ SQLiteException -> 0x0104 }
            if (r4 == 0) goto L_0x00d7
            r19 = r6
            goto L_0x00dd
        L_0x00d7:
            long r4 = r3.getLong(r0)     // Catch:{ SQLiteException -> 0x0104 }
            r19 = r4
        L_0x00dd:
            com.google.android.gms.measurement.internal.p r0 = new com.google.android.gms.measurement.internal.p     // Catch:{ SQLiteException -> 0x0104 }
            r12 = r0
            r13 = r30
            r14 = r31
            r12.<init>(r13, r14, r15, r17, r19, r21, r23, r25, r26, r27, r28)     // Catch:{ SQLiteException -> 0x0104 }
            boolean r4 = r3.moveToNext()     // Catch:{ SQLiteException -> 0x0104 }
            if (r4 == 0) goto L_0x0100
            com.google.android.gms.measurement.internal.n4 r4 = r1.f5994a     // Catch:{ SQLiteException -> 0x0104 }
            com.google.android.gms.measurement.internal.j3 r4 = r4.d()     // Catch:{ SQLiteException -> 0x0104 }
            com.google.android.gms.measurement.internal.h3 r4 = r4.r()     // Catch:{ SQLiteException -> 0x0104 }
            java.lang.String r5 = "Got multiple records for event aggregates, expected one. appId"
            java.lang.Object r6 = com.google.android.gms.measurement.internal.j3.z(r30)     // Catch:{ SQLiteException -> 0x0104 }
            r4.b(r5, r6)     // Catch:{ SQLiteException -> 0x0104 }
        L_0x0100:
            r3.close()
            return r0
        L_0x0104:
            r0 = move-exception
            goto L_0x010a
        L_0x0106:
            r0 = move-exception
            goto L_0x0131
        L_0x0108:
            r0 = move-exception
            r3 = r2
        L_0x010a:
            com.google.android.gms.measurement.internal.n4 r4 = r1.f5994a     // Catch:{ all -> 0x012f }
            com.google.android.gms.measurement.internal.j3 r4 = r4.d()     // Catch:{ all -> 0x012f }
            com.google.android.gms.measurement.internal.h3 r4 = r4.r()     // Catch:{ all -> 0x012f }
            java.lang.String r5 = "Error querying events. appId"
            java.lang.Object r6 = com.google.android.gms.measurement.internal.j3.z(r30)     // Catch:{ all -> 0x012f }
            com.google.android.gms.measurement.internal.n4 r7 = r1.f5994a     // Catch:{ all -> 0x012f }
            com.google.android.gms.measurement.internal.e3 r7 = r7.D()     // Catch:{ all -> 0x012f }
            r8 = r31
            java.lang.String r7 = r7.q(r8)     // Catch:{ all -> 0x012f }
            r4.d(r5, r6, r7, r0)     // Catch:{ all -> 0x012f }
            if (r3 == 0) goto L_0x012e
            r3.close()
        L_0x012e:
            return r2
        L_0x012f:
            r0 = move-exception
            r2 = r3
        L_0x0131:
            if (r2 == 0) goto L_0x0136
            r2.close()
        L_0x0136:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.j.X(java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.p");
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00a4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.measurement.internal.b9 Z(java.lang.String r15, java.lang.String r16) {
        /*
            r14 = this;
            r1 = r14
            com.google.android.gms.common.internal.s.g(r15)
            com.google.android.gms.common.internal.s.g(r16)
            r14.h()
            r14.i()
            r2 = 0
            android.database.sqlite.SQLiteDatabase r3 = r14.R()     // Catch:{ SQLiteException -> 0x0079, all -> 0x0077 }
            r0 = 3
            java.lang.String[] r5 = new java.lang.String[r0]     // Catch:{ SQLiteException -> 0x0079, all -> 0x0077 }
            java.lang.String r0 = "set_timestamp"
            r11 = 0
            r5[r11] = r0     // Catch:{ SQLiteException -> 0x0079, all -> 0x0077 }
            java.lang.String r0 = "value"
            r12 = 1
            r5[r12] = r0     // Catch:{ SQLiteException -> 0x0079, all -> 0x0077 }
            java.lang.String r0 = "origin"
            r13 = 2
            r5[r13] = r0     // Catch:{ SQLiteException -> 0x0079, all -> 0x0077 }
            java.lang.String[] r7 = new java.lang.String[]{r15, r16}     // Catch:{ SQLiteException -> 0x0079, all -> 0x0077 }
            java.lang.String r4 = "user_attributes"
            java.lang.String r6 = "app_id=? and name=?"
            r8 = 0
            r9 = 0
            r10 = 0
            android.database.Cursor r3 = r3.query(r4, r5, r6, r7, r8, r9, r10)     // Catch:{ SQLiteException -> 0x0079, all -> 0x0077 }
            boolean r0 = r3.moveToFirst()     // Catch:{ SQLiteException -> 0x0075 }
            if (r0 != 0) goto L_0x003d
            r3.close()
            return r2
        L_0x003d:
            long r8 = r3.getLong(r11)     // Catch:{ SQLiteException -> 0x0075 }
            java.lang.Object r10 = r14.a0(r3, r12)     // Catch:{ SQLiteException -> 0x0075 }
            if (r10 != 0) goto L_0x004b
            r3.close()
            return r2
        L_0x004b:
            java.lang.String r6 = r3.getString(r13)     // Catch:{ SQLiteException -> 0x0075 }
            com.google.android.gms.measurement.internal.b9 r0 = new com.google.android.gms.measurement.internal.b9     // Catch:{ SQLiteException -> 0x0075 }
            r4 = r0
            r5 = r15
            r7 = r16
            r4.<init>(r5, r6, r7, r8, r10)     // Catch:{ SQLiteException -> 0x0075 }
            boolean r4 = r3.moveToNext()     // Catch:{ SQLiteException -> 0x0075 }
            if (r4 == 0) goto L_0x0071
            com.google.android.gms.measurement.internal.n4 r4 = r1.f5994a     // Catch:{ SQLiteException -> 0x0075 }
            com.google.android.gms.measurement.internal.j3 r4 = r4.d()     // Catch:{ SQLiteException -> 0x0075 }
            com.google.android.gms.measurement.internal.h3 r4 = r4.r()     // Catch:{ SQLiteException -> 0x0075 }
            java.lang.String r5 = "Got multiple records for user property, expected one. appId"
            java.lang.Object r6 = com.google.android.gms.measurement.internal.j3.z(r15)     // Catch:{ SQLiteException -> 0x0075 }
            r4.b(r5, r6)     // Catch:{ SQLiteException -> 0x0075 }
        L_0x0071:
            r3.close()
            return r0
        L_0x0075:
            r0 = move-exception
            goto L_0x007b
        L_0x0077:
            r0 = move-exception
            goto L_0x00a2
        L_0x0079:
            r0 = move-exception
            r3 = r2
        L_0x007b:
            com.google.android.gms.measurement.internal.n4 r4 = r1.f5994a     // Catch:{ all -> 0x00a0 }
            com.google.android.gms.measurement.internal.j3 r4 = r4.d()     // Catch:{ all -> 0x00a0 }
            com.google.android.gms.measurement.internal.h3 r4 = r4.r()     // Catch:{ all -> 0x00a0 }
            java.lang.String r5 = "Error querying user property. appId"
            java.lang.Object r6 = com.google.android.gms.measurement.internal.j3.z(r15)     // Catch:{ all -> 0x00a0 }
            com.google.android.gms.measurement.internal.n4 r7 = r1.f5994a     // Catch:{ all -> 0x00a0 }
            com.google.android.gms.measurement.internal.e3 r7 = r7.D()     // Catch:{ all -> 0x00a0 }
            r8 = r16
            java.lang.String r7 = r7.s(r8)     // Catch:{ all -> 0x00a0 }
            r4.d(r5, r6, r7, r0)     // Catch:{ all -> 0x00a0 }
            if (r3 == 0) goto L_0x009f
            r3.close()
        L_0x009f:
            return r2
        L_0x00a0:
            r0 = move-exception
            r2 = r3
        L_0x00a2:
            if (r2 == 0) goto L_0x00a7
            r2.close()
        L_0x00a7:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.j.Z(java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.b9");
    }

    /* access modifiers changed from: package-private */
    public final Object a0(Cursor cursor, int i10) {
        int type = cursor.getType(i10);
        if (type == 0) {
            this.f5994a.d().r().a("Loaded invalid null value from database");
            return null;
        } else if (type == 1) {
            return Long.valueOf(cursor.getLong(i10));
        } else {
            if (type == 2) {
                return Double.valueOf(cursor.getDouble(i10));
            }
            if (type == 3) {
                return cursor.getString(i10);
            }
            if (type != 4) {
                this.f5994a.d().r().b("Loaded invalid unknown value type, ignoring it", Integer.valueOf(type));
                return null;
            }
            this.f5994a.d().r().a("Loaded invalid blob type value, ignoring it");
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0040  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String b0() {
        /*
            r6 = this;
            android.database.sqlite.SQLiteDatabase r0 = r6.R()
            r1 = 0
            java.lang.String r2 = "select app_id from queue order by has_realtime desc, rowid asc limit 1;"
            android.database.Cursor r0 = r0.rawQuery(r2, r1)     // Catch:{ SQLiteException -> 0x0022, all -> 0x0020 }
            boolean r2 = r0.moveToFirst()     // Catch:{ SQLiteException -> 0x001e }
            if (r2 == 0) goto L_0x001a
            r2 = 0
            java.lang.String r1 = r0.getString(r2)     // Catch:{ SQLiteException -> 0x001e }
            r0.close()
            return r1
        L_0x001a:
            r0.close()
            return r1
        L_0x001e:
            r2 = move-exception
            goto L_0x0025
        L_0x0020:
            r0 = move-exception
            goto L_0x003e
        L_0x0022:
            r0 = move-exception
            r2 = r0
            r0 = r1
        L_0x0025:
            com.google.android.gms.measurement.internal.n4 r3 = r6.f5994a     // Catch:{ all -> 0x003a }
            com.google.android.gms.measurement.internal.j3 r3 = r3.d()     // Catch:{ all -> 0x003a }
            com.google.android.gms.measurement.internal.h3 r3 = r3.r()     // Catch:{ all -> 0x003a }
            java.lang.String r4 = "Database error getting next bundle app id"
            r3.b(r4, r2)     // Catch:{ all -> 0x003a }
            if (r0 == 0) goto L_0x0039
            r0.close()
        L_0x0039:
            return r1
        L_0x003a:
            r1 = move-exception
            r5 = r1
            r1 = r0
            r0 = r5
        L_0x003e:
            if (r1 == 0) goto L_0x0043
            r1.close()
        L_0x0043:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.j.b0():java.lang.String");
    }

    public final List c0(String str, String str2, String str3) {
        s.g(str);
        h();
        i();
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(str);
        StringBuilder sb2 = new StringBuilder("app_id=?");
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(str2);
            sb2.append(" and origin=?");
        }
        if (!TextUtils.isEmpty(str3)) {
            arrayList.add(String.valueOf(str3).concat("*"));
            sb2.append(" and name glob ?");
        }
        return d0(sb2.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x0184  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x018b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List d0(java.lang.String r42, java.lang.String[] r43) {
        /*
            r41 = this;
            r1 = r41
            r41.h()
            r41.i()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.String r10 = "1001"
            android.database.sqlite.SQLiteDatabase r2 = r41.R()     // Catch:{ SQLiteException -> 0x016d, all -> 0x016a }
            java.lang.String r3 = "conditional_properties"
            r4 = 13
            java.lang.String[] r4 = new java.lang.String[r4]     // Catch:{ SQLiteException -> 0x016d, all -> 0x016a }
            java.lang.String r5 = "app_id"
            r12 = 0
            r4[r12] = r5     // Catch:{ SQLiteException -> 0x016d, all -> 0x016a }
            java.lang.String r5 = "origin"
            r13 = 1
            r4[r13] = r5     // Catch:{ SQLiteException -> 0x016d, all -> 0x016a }
            java.lang.String r5 = "name"
            r14 = 2
            r4[r14] = r5     // Catch:{ SQLiteException -> 0x016d, all -> 0x016a }
            java.lang.String r5 = "value"
            r15 = 3
            r4[r15] = r5     // Catch:{ SQLiteException -> 0x016d, all -> 0x016a }
            java.lang.String r5 = "active"
            r9 = 4
            r4[r9] = r5     // Catch:{ SQLiteException -> 0x016d, all -> 0x016a }
            java.lang.String r5 = "trigger_event_name"
            r8 = 5
            r4[r8] = r5     // Catch:{ SQLiteException -> 0x016d, all -> 0x016a }
            java.lang.String r5 = "trigger_timeout"
            r7 = 6
            r4[r7] = r5     // Catch:{ SQLiteException -> 0x016d, all -> 0x016a }
            java.lang.String r5 = "timed_out_event"
            r6 = 7
            r4[r6] = r5     // Catch:{ SQLiteException -> 0x016d, all -> 0x016a }
            java.lang.String r5 = "creation_timestamp"
            r11 = 8
            r4[r11] = r5     // Catch:{ SQLiteException -> 0x016d, all -> 0x016a }
            java.lang.String r5 = "triggered_event"
            r11 = 9
            r4[r11] = r5     // Catch:{ SQLiteException -> 0x016d, all -> 0x016a }
            java.lang.String r5 = "triggered_timestamp"
            r11 = 10
            r4[r11] = r5     // Catch:{ SQLiteException -> 0x016d, all -> 0x016a }
            java.lang.String r5 = "time_to_live"
            r11 = 11
            r4[r11] = r5     // Catch:{ SQLiteException -> 0x016d, all -> 0x016a }
            java.lang.String r5 = "expired_event"
            r11 = 12
            r4[r11] = r5     // Catch:{ SQLiteException -> 0x016d, all -> 0x016a }
            java.lang.String r21 = "rowid"
            com.google.android.gms.measurement.internal.n4 r5 = r1.f5994a     // Catch:{ SQLiteException -> 0x016d, all -> 0x016a }
            r5.z()     // Catch:{ SQLiteException -> 0x016d, all -> 0x016a }
            r22 = 0
            r23 = 0
            r5 = r42
            r11 = 7
            r6 = r43
            r11 = 6
            r7 = r22
            r11 = 5
            r8 = r23
            r11 = 4
            r9 = r21
            android.database.Cursor r2 = r2.query(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch:{ SQLiteException -> 0x016d, all -> 0x016a }
            boolean r3 = r2.moveToFirst()     // Catch:{ SQLiteException -> 0x0167, all -> 0x0164 }
            if (r3 == 0) goto L_0x0160
        L_0x0082:
            int r3 = r0.size()     // Catch:{ SQLiteException -> 0x0167, all -> 0x0164 }
            com.google.android.gms.measurement.internal.n4 r4 = r1.f5994a     // Catch:{ SQLiteException -> 0x0167, all -> 0x0164 }
            r4.z()     // Catch:{ SQLiteException -> 0x0167, all -> 0x0164 }
            r4 = 1000(0x3e8, float:1.401E-42)
            if (r3 < r4) goto L_0x00a9
            com.google.android.gms.measurement.internal.n4 r3 = r1.f5994a     // Catch:{ SQLiteException -> 0x0167, all -> 0x0164 }
            com.google.android.gms.measurement.internal.j3 r3 = r3.d()     // Catch:{ SQLiteException -> 0x0167, all -> 0x0164 }
            com.google.android.gms.measurement.internal.h3 r3 = r3.r()     // Catch:{ SQLiteException -> 0x0167, all -> 0x0164 }
            java.lang.String r5 = "Read more than the max allowed conditional properties, ignoring extra"
            com.google.android.gms.measurement.internal.n4 r6 = r1.f5994a     // Catch:{ SQLiteException -> 0x0167, all -> 0x0164 }
            r6.z()     // Catch:{ SQLiteException -> 0x0167, all -> 0x0164 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ SQLiteException -> 0x0167, all -> 0x0164 }
            r3.b(r5, r4)     // Catch:{ SQLiteException -> 0x0167, all -> 0x0164 }
            goto L_0x0159
        L_0x00a9:
            java.lang.String r3 = r2.getString(r12)     // Catch:{ SQLiteException -> 0x0167, all -> 0x0164 }
            java.lang.String r10 = r2.getString(r13)     // Catch:{ SQLiteException -> 0x0167, all -> 0x0164 }
            java.lang.String r5 = r2.getString(r14)     // Catch:{ SQLiteException -> 0x0167, all -> 0x0164 }
            java.lang.Object r8 = r1.a0(r2, r15)     // Catch:{ SQLiteException -> 0x0167, all -> 0x0164 }
            int r4 = r2.getInt(r11)     // Catch:{ SQLiteException -> 0x0167, all -> 0x0164 }
            r9 = 5
            if (r4 == 0) goto L_0x00c3
            r23 = 1
            goto L_0x00c5
        L_0x00c3:
            r23 = 0
        L_0x00c5:
            java.lang.String r25 = r2.getString(r9)     // Catch:{ SQLiteException -> 0x0167, all -> 0x0164 }
            r6 = 6
            long r26 = r2.getLong(r6)     // Catch:{ SQLiteException -> 0x0167, all -> 0x0164 }
            com.google.android.gms.measurement.internal.w8 r4 = r1.f6214b     // Catch:{ SQLiteException -> 0x0167, all -> 0x0164 }
            com.google.android.gms.measurement.internal.y8 r4 = r4.f0()     // Catch:{ SQLiteException -> 0x0167, all -> 0x0164 }
            r7 = 7
            byte[] r6 = r2.getBlob(r7)     // Catch:{ SQLiteException -> 0x0167, all -> 0x0164 }
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.t> r7 = com.google.android.gms.measurement.internal.t.CREATOR     // Catch:{ SQLiteException -> 0x0167, all -> 0x0164 }
            android.os.Parcelable r4 = r4.A(r6, r7)     // Catch:{ SQLiteException -> 0x0167, all -> 0x0164 }
            r28 = r4
            com.google.android.gms.measurement.internal.t r28 = (com.google.android.gms.measurement.internal.t) r28     // Catch:{ SQLiteException -> 0x0167, all -> 0x0164 }
            r6 = 8
            long r29 = r2.getLong(r6)     // Catch:{ SQLiteException -> 0x0167, all -> 0x0164 }
            com.google.android.gms.measurement.internal.w8 r4 = r1.f6214b     // Catch:{ SQLiteException -> 0x0167, all -> 0x0164 }
            com.google.android.gms.measurement.internal.y8 r4 = r4.f0()     // Catch:{ SQLiteException -> 0x0167, all -> 0x0164 }
            r11 = 9
            byte[] r6 = r2.getBlob(r11)     // Catch:{ SQLiteException -> 0x0167, all -> 0x0164 }
            android.os.Parcelable r4 = r4.A(r6, r7)     // Catch:{ SQLiteException -> 0x0167, all -> 0x0164 }
            r31 = r4
            com.google.android.gms.measurement.internal.t r31 = (com.google.android.gms.measurement.internal.t) r31     // Catch:{ SQLiteException -> 0x0167, all -> 0x0164 }
            r6 = 10
            long r18 = r2.getLong(r6)     // Catch:{ SQLiteException -> 0x0167, all -> 0x0164 }
            r4 = 11
            long r32 = r2.getLong(r4)     // Catch:{ SQLiteException -> 0x0167, all -> 0x0164 }
            com.google.android.gms.measurement.internal.w8 r4 = r1.f6214b     // Catch:{ SQLiteException -> 0x0167, all -> 0x0164 }
            com.google.android.gms.measurement.internal.y8 r4 = r4.f0()     // Catch:{ SQLiteException -> 0x0167, all -> 0x0164 }
            r11 = 12
            byte[] r6 = r2.getBlob(r11)     // Catch:{ SQLiteException -> 0x0167, all -> 0x0164 }
            android.os.Parcelable r4 = r4.A(r6, r7)     // Catch:{ SQLiteException -> 0x0167, all -> 0x0164 }
            r34 = r4
            com.google.android.gms.measurement.internal.t r34 = (com.google.android.gms.measurement.internal.t) r34     // Catch:{ SQLiteException -> 0x0167, all -> 0x0164 }
            com.google.android.gms.measurement.internal.z8 r21 = new com.google.android.gms.measurement.internal.z8     // Catch:{ SQLiteException -> 0x0167, all -> 0x0164 }
            r35 = 11
            r4 = r21
            r36 = 10
            r37 = 8
            r38 = 7
            r39 = 6
            r6 = r18
            r40 = 5
            r9 = r10
            r4.<init>(r5, r6, r8, r9)     // Catch:{ SQLiteException -> 0x0167, all -> 0x0164 }
            com.google.android.gms.measurement.internal.c r4 = new com.google.android.gms.measurement.internal.c     // Catch:{ SQLiteException -> 0x0167, all -> 0x0164 }
            r16 = r4
            r17 = r3
            r18 = r10
            r19 = r21
            r20 = r29
            r22 = r23
            r23 = r25
            r24 = r28
            r25 = r26
            r27 = r31
            r28 = r32
            r30 = r34
            r16.<init>(r17, r18, r19, r20, r22, r23, r24, r25, r27, r28, r30)     // Catch:{ SQLiteException -> 0x0167, all -> 0x0164 }
            r0.add(r4)     // Catch:{ SQLiteException -> 0x0167, all -> 0x0164 }
            boolean r3 = r2.moveToNext()     // Catch:{ SQLiteException -> 0x0167, all -> 0x0164 }
            if (r3 != 0) goto L_0x015d
        L_0x0159:
            r2.close()
            return r0
        L_0x015d:
            r11 = 4
            goto L_0x0082
        L_0x0160:
            r2.close()
            return r0
        L_0x0164:
            r0 = move-exception
            r11 = r2
            goto L_0x0189
        L_0x0167:
            r0 = move-exception
            r11 = r2
            goto L_0x016f
        L_0x016a:
            r0 = move-exception
            r11 = 0
            goto L_0x0189
        L_0x016d:
            r0 = move-exception
            r11 = 0
        L_0x016f:
            com.google.android.gms.measurement.internal.n4 r2 = r1.f5994a     // Catch:{ all -> 0x0188 }
            com.google.android.gms.measurement.internal.j3 r2 = r2.d()     // Catch:{ all -> 0x0188 }
            com.google.android.gms.measurement.internal.h3 r2 = r2.r()     // Catch:{ all -> 0x0188 }
            java.lang.String r3 = "Error querying conditional user property value"
            r2.b(r3, r0)     // Catch:{ all -> 0x0188 }
            java.util.List r0 = java.util.Collections.emptyList()     // Catch:{ all -> 0x0188 }
            if (r11 == 0) goto L_0x0187
            r11.close()
        L_0x0187:
            return r0
        L_0x0188:
            r0 = move-exception
        L_0x0189:
            if (r11 == 0) goto L_0x018e
            r11.close()
        L_0x018e:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.j.d0(java.lang.String, java.lang.String[]):java.util.List");
    }

    public final List e0(String str) {
        s.g(str);
        h();
        i();
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            SQLiteDatabase R = R();
            String[] strArr = {"name", FirebaseAnalytics.Param.ORIGIN, "set_timestamp", FirebaseAnalytics.Param.VALUE};
            this.f5994a.z();
            Cursor query = R.query("user_attributes", strArr, "app_id=?", new String[]{str}, (String) null, (String) null, "rowid", "1000");
            if (query.moveToFirst()) {
                do {
                    String string = query.getString(0);
                    String string2 = query.getString(1);
                    if (string2 == null) {
                        string2 = "";
                    }
                    String str2 = string2;
                    long j10 = query.getLong(2);
                    Object a02 = a0(query, 3);
                    if (a02 == null) {
                        this.f5994a.d().r().b("Read invalid user property value, ignoring it. appId", j3.z(str));
                    } else {
                        arrayList.add(new b9(str, str2, string, j10, a02));
                    }
                } while (query.moveToNext());
                query.close();
                return arrayList;
            }
            query.close();
            return arrayList;
        } catch (SQLiteException e10) {
            this.f5994a.d().r().c("Error querying user properties. appId", j3.z(str), e10);
            List emptyList = Collections.emptyList();
            if (cursor != null) {
                cursor.close();
            }
            return emptyList;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x010f, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0111, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0112, code lost:
        r11 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0114, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0115, code lost:
        r13 = r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0117, code lost:
        r14 = r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0133, code lost:
        r11.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x013a, code lost:
        r11.close();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0111 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:1:0x0012] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0133  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x013a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List f0(java.lang.String r20, java.lang.String r21, java.lang.String r22) {
        /*
            r19 = this;
            r1 = r19
            com.google.android.gms.common.internal.s.g(r20)
            r19.h()
            r19.i()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.String r10 = "1001"
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x0114, all -> 0x0111 }
            r12 = 3
            r2.<init>(r12)     // Catch:{ SQLiteException -> 0x0114, all -> 0x0111 }
            r13 = r20
            r2.add(r13)     // Catch:{ SQLiteException -> 0x010f, all -> 0x0111 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x010f, all -> 0x0111 }
            java.lang.String r4 = "app_id=?"
            r3.<init>(r4)     // Catch:{ SQLiteException -> 0x010f, all -> 0x0111 }
            boolean r4 = android.text.TextUtils.isEmpty(r21)     // Catch:{ SQLiteException -> 0x010f, all -> 0x0111 }
            if (r4 != 0) goto L_0x0035
            r14 = r21
            r2.add(r14)     // Catch:{ SQLiteException -> 0x010d, all -> 0x0111 }
            java.lang.String r4 = " and origin=?"
            r3.append(r4)     // Catch:{ SQLiteException -> 0x010d, all -> 0x0111 }
            goto L_0x0037
        L_0x0035:
            r14 = r21
        L_0x0037:
            boolean r4 = android.text.TextUtils.isEmpty(r22)     // Catch:{ SQLiteException -> 0x010d, all -> 0x0111 }
            if (r4 != 0) goto L_0x004f
            java.lang.String r4 = java.lang.String.valueOf(r22)     // Catch:{ SQLiteException -> 0x010d, all -> 0x0111 }
            java.lang.String r5 = "*"
            java.lang.String r4 = r4.concat(r5)     // Catch:{ SQLiteException -> 0x010d, all -> 0x0111 }
            r2.add(r4)     // Catch:{ SQLiteException -> 0x010d, all -> 0x0111 }
            java.lang.String r4 = " and name glob ?"
            r3.append(r4)     // Catch:{ SQLiteException -> 0x010d, all -> 0x0111 }
        L_0x004f:
            int r4 = r2.size()     // Catch:{ SQLiteException -> 0x010d, all -> 0x0111 }
            java.lang.String[] r4 = new java.lang.String[r4]     // Catch:{ SQLiteException -> 0x010d, all -> 0x0111 }
            java.lang.Object[] r2 = r2.toArray(r4)     // Catch:{ SQLiteException -> 0x010d, all -> 0x0111 }
            r6 = r2
            java.lang.String[] r6 = (java.lang.String[]) r6     // Catch:{ SQLiteException -> 0x010d, all -> 0x0111 }
            android.database.sqlite.SQLiteDatabase r2 = r19.R()     // Catch:{ SQLiteException -> 0x010d, all -> 0x0111 }
            java.lang.String r4 = "user_attributes"
            r5 = 4
            java.lang.String[] r5 = new java.lang.String[r5]     // Catch:{ SQLiteException -> 0x010d, all -> 0x0111 }
            java.lang.String r7 = "name"
            r15 = 0
            r5[r15] = r7     // Catch:{ SQLiteException -> 0x010d, all -> 0x0111 }
            java.lang.String r7 = "set_timestamp"
            r9 = 1
            r5[r9] = r7     // Catch:{ SQLiteException -> 0x010d, all -> 0x0111 }
            java.lang.String r7 = "value"
            r8 = 2
            r5[r8] = r7     // Catch:{ SQLiteException -> 0x010d, all -> 0x0111 }
            java.lang.String r7 = "origin"
            r5[r12] = r7     // Catch:{ SQLiteException -> 0x010d, all -> 0x0111 }
            java.lang.String r7 = r3.toString()     // Catch:{ SQLiteException -> 0x010d, all -> 0x0111 }
            java.lang.String r16 = "rowid"
            com.google.android.gms.measurement.internal.n4 r3 = r1.f5994a     // Catch:{ SQLiteException -> 0x010d, all -> 0x0111 }
            r3.z()     // Catch:{ SQLiteException -> 0x010d, all -> 0x0111 }
            r17 = 0
            r18 = 0
            r3 = r4
            r4 = r5
            r5 = r7
            r7 = r17
            r11 = 2
            r8 = r18
            r12 = 1
            r9 = r16
            android.database.Cursor r2 = r2.query(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch:{ SQLiteException -> 0x010d, all -> 0x0111 }
            boolean r3 = r2.moveToFirst()     // Catch:{ SQLiteException -> 0x010a, all -> 0x0107 }
            if (r3 != 0) goto L_0x00a0
            r2.close()
            return r0
        L_0x00a0:
            int r3 = r0.size()     // Catch:{ SQLiteException -> 0x010a, all -> 0x0107 }
            com.google.android.gms.measurement.internal.n4 r4 = r1.f5994a     // Catch:{ SQLiteException -> 0x010a, all -> 0x0107 }
            r4.z()     // Catch:{ SQLiteException -> 0x010a, all -> 0x0107 }
            r4 = 1000(0x3e8, float:1.401E-42)
            if (r3 < r4) goto L_0x00c6
            com.google.android.gms.measurement.internal.n4 r3 = r1.f5994a     // Catch:{ SQLiteException -> 0x010a, all -> 0x0107 }
            com.google.android.gms.measurement.internal.j3 r3 = r3.d()     // Catch:{ SQLiteException -> 0x010a, all -> 0x0107 }
            com.google.android.gms.measurement.internal.h3 r3 = r3.r()     // Catch:{ SQLiteException -> 0x010a, all -> 0x0107 }
            java.lang.String r5 = "Read more than the max allowed user properties, ignoring excess"
            com.google.android.gms.measurement.internal.n4 r6 = r1.f5994a     // Catch:{ SQLiteException -> 0x010a, all -> 0x0107 }
            r6.z()     // Catch:{ SQLiteException -> 0x010a, all -> 0x0107 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ SQLiteException -> 0x010a, all -> 0x0107 }
            r3.b(r5, r4)     // Catch:{ SQLiteException -> 0x010a, all -> 0x0107 }
            goto L_0x0103
        L_0x00c6:
            java.lang.String r6 = r2.getString(r15)     // Catch:{ SQLiteException -> 0x010a, all -> 0x0107 }
            long r7 = r2.getLong(r12)     // Catch:{ SQLiteException -> 0x010a, all -> 0x0107 }
            java.lang.Object r9 = r1.a0(r2, r11)     // Catch:{ SQLiteException -> 0x010a, all -> 0x0107 }
            r10 = 3
            java.lang.String r14 = r2.getString(r10)     // Catch:{ SQLiteException -> 0x010a, all -> 0x0107 }
            if (r9 != 0) goto L_0x00ef
            com.google.android.gms.measurement.internal.n4 r3 = r1.f5994a     // Catch:{ SQLiteException -> 0x010a, all -> 0x0107 }
            com.google.android.gms.measurement.internal.j3 r3 = r3.d()     // Catch:{ SQLiteException -> 0x010a, all -> 0x0107 }
            com.google.android.gms.measurement.internal.h3 r3 = r3.r()     // Catch:{ SQLiteException -> 0x010a, all -> 0x0107 }
            java.lang.String r4 = "(2)Read invalid user property value, ignoring it"
            java.lang.Object r5 = com.google.android.gms.measurement.internal.j3.z(r20)     // Catch:{ SQLiteException -> 0x010a, all -> 0x0107 }
            r6 = r22
            r3.d(r4, r5, r14, r6)     // Catch:{ SQLiteException -> 0x010a, all -> 0x0107 }
            goto L_0x00fc
        L_0x00ef:
            com.google.android.gms.measurement.internal.b9 r5 = new com.google.android.gms.measurement.internal.b9     // Catch:{ SQLiteException -> 0x010a, all -> 0x0107 }
            r3 = r5
            r4 = r20
            r10 = r5
            r5 = r14
            r3.<init>(r4, r5, r6, r7, r9)     // Catch:{ SQLiteException -> 0x010a, all -> 0x0107 }
            r0.add(r10)     // Catch:{ SQLiteException -> 0x010a, all -> 0x0107 }
        L_0x00fc:
            boolean r3 = r2.moveToNext()     // Catch:{ SQLiteException -> 0x010a, all -> 0x0107 }
            if (r3 == 0) goto L_0x0103
            goto L_0x00a0
        L_0x0103:
            r2.close()
            return r0
        L_0x0107:
            r0 = move-exception
            r11 = r2
            goto L_0x0138
        L_0x010a:
            r0 = move-exception
            r11 = r2
            goto L_0x011a
        L_0x010d:
            r0 = move-exception
            goto L_0x0119
        L_0x010f:
            r0 = move-exception
            goto L_0x0117
        L_0x0111:
            r0 = move-exception
            r11 = 0
            goto L_0x0138
        L_0x0114:
            r0 = move-exception
            r13 = r20
        L_0x0117:
            r14 = r21
        L_0x0119:
            r11 = 0
        L_0x011a:
            com.google.android.gms.measurement.internal.n4 r2 = r1.f5994a     // Catch:{ all -> 0x0137 }
            com.google.android.gms.measurement.internal.j3 r2 = r2.d()     // Catch:{ all -> 0x0137 }
            com.google.android.gms.measurement.internal.h3 r2 = r2.r()     // Catch:{ all -> 0x0137 }
            java.lang.String r3 = "(2)Error querying user properties"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.j3.z(r20)     // Catch:{ all -> 0x0137 }
            r2.d(r3, r4, r14, r0)     // Catch:{ all -> 0x0137 }
            java.util.List r0 = java.util.Collections.emptyList()     // Catch:{ all -> 0x0137 }
            if (r11 == 0) goto L_0x0136
            r11.close()
        L_0x0136:
            return r0
        L_0x0137:
            r0 = move-exception
        L_0x0138:
            if (r11 == 0) goto L_0x013d
            r11.close()
        L_0x013d:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.j.f0(java.lang.String, java.lang.String, java.lang.String):java.util.List");
    }

    public final void g0() {
        i();
        R().beginTransaction();
    }

    public final void h0() {
        i();
        R().endTransaction();
    }

    /* access modifiers changed from: package-private */
    public final void i0(List list) {
        h();
        i();
        s.k(list);
        s.m(list.size());
        if (w()) {
            String join = TextUtils.join(",", list);
            StringBuilder sb2 = new StringBuilder(String.valueOf(join).length() + 2);
            sb2.append("(");
            sb2.append(join);
            sb2.append(")");
            String sb3 = sb2.toString();
            StringBuilder sb4 = new StringBuilder(String.valueOf(sb3).length() + 80);
            sb4.append("SELECT COUNT(1) FROM queue WHERE rowid IN ");
            sb4.append(sb3);
            sb4.append(" AND retry_count =  2147483647 LIMIT 1");
            if (L(sb4.toString(), (String[]) null) > 0) {
                this.f5994a.d().w().a("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                SQLiteDatabase R = R();
                StringBuilder sb5 = new StringBuilder(String.valueOf(sb3).length() + 127);
                sb5.append("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN ");
                sb5.append(sb3);
                sb5.append(" AND (retry_count IS NULL OR retry_count < ");
                sb5.append(a.e.API_PRIORITY_OTHER);
                sb5.append(")");
                R.execSQL(sb5.toString());
            } catch (SQLiteException e10) {
                this.f5994a.d().r().b("Error incrementing retry count. error", e10);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void j0() {
        h();
        i();
        if (w()) {
            long a10 = this.f6214b.d0().f6554g.a();
            long a11 = this.f5994a.e().a();
            long abs = Math.abs(a11 - a10);
            this.f5994a.z();
            if (abs > ((Long) y2.f6662z.a((Object) null)).longValue()) {
                this.f6214b.d0().f6554g.b(a11);
                h();
                i();
                if (w()) {
                    SQLiteDatabase R = R();
                    String valueOf = String.valueOf(this.f5994a.e().currentTimeMillis());
                    this.f5994a.z();
                    int delete = R.delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[]{valueOf, String.valueOf(g.i())});
                    if (delete > 0) {
                        this.f5994a.d().v().b("Deleted stale rows. rowsDeleted", Integer.valueOf(delete));
                    }
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public final boolean l() {
        return false;
    }

    public final void m(String str, String str2) {
        s.g(str);
        s.g(str2);
        h();
        i();
        try {
            R().delete("user_attributes", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e10) {
            this.f5994a.d().r().d("Error deleting user property. appId", j3.z(str), this.f5994a.D().s(str2), e10);
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0322, code lost:
        r11.put("filter_id", r14);
        r23 = r0;
        r11.put("property_name", r3.zze());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0334, code lost:
        if (r3.zzk() == false) goto L_0x033f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0336, code lost:
        r0 = java.lang.Boolean.valueOf(r3.zzi());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x033f, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0340, code lost:
        r11.put("session_scoped", r0);
        r11.put(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0354, code lost:
        if (R().insertWithOnConflict("property_filters", (java.lang.String) null, r11, 5) != -1) goto L_0x036a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0356, code lost:
        r1.f5994a.d().r().b("Failed to insert property filter (got -1). appId", com.google.android.gms.measurement.internal.j3.z(r25));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x036a, code lost:
        r0 = r23;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x036e, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:?, code lost:
        r3 = r1.f5994a.d().r();
        r7 = "Error storing property filter. appId";
        r8 = com.google.android.gms.measurement.internal.j3.z(r25);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0381, code lost:
        i();
        h();
        com.google.android.gms.common.internal.s.g(r25);
        r0 = R();
        r3 = r17;
        r0.delete("property_filters", r3, new java.lang.String[]{r4, java.lang.String.valueOf(r9)});
        r0.delete("event_filters", r3, new java.lang.String[]{r4, java.lang.String.valueOf(r9)});
        r17 = r3;
        r4 = r22;
        r3 = r26;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x03b8, code lost:
        r3 = r26;
        r4 = r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0181, code lost:
        r0.c(r7, r8, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0185, code lost:
        r10 = r0.zzh().iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0191, code lost:
        if (r10.hasNext() == false) goto L_0x01b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x019d, code lost:
        if (r10.next().zzj() != false) goto L_0x018d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x019f, code lost:
        r0 = r1.f5994a.d().w();
        r7 = "Property filter with no ID. Audience definition ignored. appId, audienceId";
        r8 = com.google.android.gms.measurement.internal.j3.z(r25);
        r9 = java.lang.Integer.valueOf(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x01b4, code lost:
        r10 = r0.zzg().iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x01ca, code lost:
        if (r10.hasNext() == false) goto L_0x02a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:?, code lost:
        r11 = r10.next();
        i();
        h();
        com.google.android.gms.common.internal.s.g(r25);
        com.google.android.gms.common.internal.s.k(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x01e6, code lost:
        if (android.text.TextUtils.isEmpty(r11.zzg()) == false) goto L_0x021c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x01e8, code lost:
        r0 = r1.f5994a.d().w();
        r8 = com.google.android.gms.measurement.internal.j3.z(r25);
        r10 = java.lang.Integer.valueOf(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0200, code lost:
        if (r11.zzp() == false) goto L_0x020d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0202, code lost:
        r20 = java.lang.Integer.valueOf(r11.zzb());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x020d, code lost:
        r20 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x020f, code lost:
        r0.d("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", r8, r10, java.lang.String.valueOf(r20));
        r22 = r4;
        r4 = r25;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x021c, code lost:
        r14 = r11.zzbs();
        r3 = new android.content.ContentValues();
        r22 = r4;
        r4 = r25;
        r3.put("app_id", r4);
        r3.put("audience_id", java.lang.Integer.valueOf(r9));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0237, code lost:
        if (r11.zzp() == false) goto L_0x0242;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0239, code lost:
        r8 = java.lang.Integer.valueOf(r11.zzb());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0242, code lost:
        r8 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0243, code lost:
        r3.put("filter_id", r8);
        r3.put("event_name", r11.zzg());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0253, code lost:
        if (r11.zzq() == false) goto L_0x025e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0255, code lost:
        r8 = java.lang.Boolean.valueOf(r11.zzn());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x025e, code lost:
        r8 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x025f, code lost:
        r3.put("session_scoped", r8);
        r3.put(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0273, code lost:
        if (R().insertWithOnConflict("event_filters", (java.lang.String) null, r3, 5) != -1) goto L_0x0288;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0275, code lost:
        r1.f5994a.d().r().b("Failed to insert event filter (got -1). appId", com.google.android.gms.measurement.internal.j3.z(r25));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0288, code lost:
        r3 = r26;
        r4 = r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x029f, code lost:
        r3.c(r7, r8, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x02a4, code lost:
        r22 = r4;
        r4 = r25;
        r0 = r0.zzh().iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x02b4, code lost:
        if (r0.hasNext() == false) goto L_0x03b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x02b6, code lost:
        r3 = r0.next();
        i();
        h();
        com.google.android.gms.common.internal.s.g(r25);
        com.google.android.gms.common.internal.s.k(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x02d0, code lost:
        if (android.text.TextUtils.isEmpty(r3.zze()) == false) goto L_0x02ff;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x02d2, code lost:
        r0 = r1.f5994a.d().w();
        r8 = com.google.android.gms.measurement.internal.j3.z(r25);
        r10 = java.lang.Integer.valueOf(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x02ea, code lost:
        if (r3.zzj() == false) goto L_0x02f5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x02ec, code lost:
        r3 = java.lang.Integer.valueOf(r3.zza());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x02f5, code lost:
        r3 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x02f6, code lost:
        r0.d("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", r8, r10, java.lang.String.valueOf(r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x02ff, code lost:
        r10 = r3.zzbs();
        r11 = new android.content.ContentValues();
        r11.put("app_id", r4);
        r11.put("audience_id", java.lang.Integer.valueOf(r9));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0316, code lost:
        if (r3.zzj() == false) goto L_0x0321;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0318, code lost:
        r14 = java.lang.Integer.valueOf(r3.zza());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0321, code lost:
        r14 = null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void n(java.lang.String r25, java.util.List r26) {
        /*
            r24 = this;
            r1 = r24
            r2 = r25
            r3 = r26
            java.lang.String r4 = "app_id=? and audience_id=?"
            java.lang.String r0 = "app_id=?"
            java.lang.String r5 = "event_filters"
            java.lang.String r6 = "property_filters"
            com.google.android.gms.common.internal.s.k(r26)
            r8 = 0
        L_0x0012:
            int r9 = r26.size()
            if (r8 >= r9) goto L_0x00e9
            java.lang.Object r9 = r3.get(r8)
            com.google.android.gms.internal.measurement.zzeh r9 = (com.google.android.gms.internal.measurement.zzeh) r9
            com.google.android.gms.internal.measurement.zzjv r9 = r9.zzbv()
            com.google.android.gms.internal.measurement.zzeg r9 = (com.google.android.gms.internal.measurement.zzeg) r9
            int r11 = r9.zza()
            if (r11 == 0) goto L_0x00a6
            r12 = r9
            r11 = 0
        L_0x002c:
            int r13 = r12.zza()
            if (r11 >= r13) goto L_0x00a3
            com.google.android.gms.internal.measurement.zzej r13 = r12.zze(r11)
            com.google.android.gms.internal.measurement.zzjv r13 = r13.zzbv()
            com.google.android.gms.internal.measurement.zzei r13 = (com.google.android.gms.internal.measurement.zzei) r13
            com.google.android.gms.internal.measurement.zzjv r14 = r13.zzaq()
            com.google.android.gms.internal.measurement.zzei r14 = (com.google.android.gms.internal.measurement.zzei) r14
            java.lang.String r15 = r13.zze()
            java.lang.String r15 = h4.n.b(r15)
            if (r15 == 0) goto L_0x0051
            r14.zzb(r15)
            r15 = 1
            goto L_0x0052
        L_0x0051:
            r15 = 0
        L_0x0052:
            r10 = 0
        L_0x0053:
            int r7 = r13.zza()
            if (r10 >= r7) goto L_0x008b
            com.google.android.gms.internal.measurement.zzel r7 = r13.zzd(r10)
            r16 = r13
            java.lang.String r13 = r7.zze()
            r17 = r4
            java.lang.String[] r4 = h4.o.f10964a
            java.lang.String[] r2 = h4.o.f10965b
            java.lang.String r2 = h4.v.b(r13, r4, r2)
            if (r2 == 0) goto L_0x0082
            com.google.android.gms.internal.measurement.zzjv r4 = r7.zzbv()
            com.google.android.gms.internal.measurement.zzek r4 = (com.google.android.gms.internal.measurement.zzek) r4
            r4.zza(r2)
            com.google.android.gms.internal.measurement.zzjz r2 = r4.zzaA()
            com.google.android.gms.internal.measurement.zzel r2 = (com.google.android.gms.internal.measurement.zzel) r2
            r14.zzc(r10, r2)
            r15 = 1
        L_0x0082:
            int r10 = r10 + 1
            r2 = r25
            r13 = r16
            r4 = r17
            goto L_0x0053
        L_0x008b:
            r17 = r4
            if (r15 == 0) goto L_0x009c
            r12.zzc(r11, r14)
            com.google.android.gms.internal.measurement.zzjz r2 = r9.zzaA()
            com.google.android.gms.internal.measurement.zzeh r2 = (com.google.android.gms.internal.measurement.zzeh) r2
            r3.set(r8, r2)
            r12 = r9
        L_0x009c:
            int r11 = r11 + 1
            r2 = r25
            r4 = r17
            goto L_0x002c
        L_0x00a3:
            r17 = r4
            goto L_0x00a9
        L_0x00a6:
            r17 = r4
            r12 = r9
        L_0x00a9:
            int r2 = r12.zzb()
            if (r2 == 0) goto L_0x00e1
            r2 = 0
        L_0x00b0:
            int r4 = r12.zzb()
            if (r2 >= r4) goto L_0x00e1
            com.google.android.gms.internal.measurement.zzes r4 = r12.zzf(r2)
            java.lang.String r7 = r4.zze()
            java.lang.String[] r10 = h4.p.f10968a
            java.lang.String[] r11 = h4.p.f10969b
            java.lang.String r7 = h4.v.b(r7, r10, r11)
            if (r7 == 0) goto L_0x00de
            com.google.android.gms.internal.measurement.zzjv r4 = r4.zzbv()
            com.google.android.gms.internal.measurement.zzer r4 = (com.google.android.gms.internal.measurement.zzer) r4
            r4.zza(r7)
            r12.zzd(r2, r4)
            com.google.android.gms.internal.measurement.zzjz r4 = r9.zzaA()
            com.google.android.gms.internal.measurement.zzeh r4 = (com.google.android.gms.internal.measurement.zzeh) r4
            r3.set(r8, r4)
            r12 = r9
        L_0x00de:
            int r2 = r2 + 1
            goto L_0x00b0
        L_0x00e1:
            int r8 = r8 + 1
            r2 = r25
            r4 = r17
            goto L_0x0012
        L_0x00e9:
            r17 = r4
            r24.i()
            r24.h()
            com.google.android.gms.common.internal.s.g(r25)
            com.google.android.gms.common.internal.s.k(r26)
            android.database.sqlite.SQLiteDatabase r2 = r24.R()
            r2.beginTransaction()
            r24.i()     // Catch:{ all -> 0x04b5 }
            r24.h()     // Catch:{ all -> 0x04b5 }
            com.google.android.gms.common.internal.s.g(r25)     // Catch:{ all -> 0x04b5 }
            android.database.sqlite.SQLiteDatabase r4 = r24.R()     // Catch:{ all -> 0x04b5 }
            java.lang.String[] r7 = new java.lang.String[]{r25}     // Catch:{ all -> 0x04b5 }
            r4.delete(r6, r0, r7)     // Catch:{ all -> 0x04b5 }
            java.lang.String[] r7 = new java.lang.String[]{r25}     // Catch:{ all -> 0x04b5 }
            r4.delete(r5, r0, r7)     // Catch:{ all -> 0x04b5 }
            java.util.Iterator r4 = r26.iterator()     // Catch:{ all -> 0x04b5 }
        L_0x011d:
            boolean r0 = r4.hasNext()     // Catch:{ all -> 0x04b5 }
            if (r0 == 0) goto L_0x03be
            java.lang.Object r0 = r4.next()     // Catch:{ all -> 0x04b5 }
            com.google.android.gms.internal.measurement.zzeh r0 = (com.google.android.gms.internal.measurement.zzeh) r0     // Catch:{ all -> 0x04b5 }
            r24.i()     // Catch:{ all -> 0x04b5 }
            r24.h()     // Catch:{ all -> 0x04b5 }
            com.google.android.gms.common.internal.s.g(r25)     // Catch:{ all -> 0x04b5 }
            com.google.android.gms.common.internal.s.k(r0)     // Catch:{ all -> 0x04b5 }
            boolean r9 = r0.zzk()     // Catch:{ all -> 0x04b5 }
            if (r9 != 0) goto L_0x014f
            com.google.android.gms.measurement.internal.n4 r0 = r1.f5994a     // Catch:{ all -> 0x04b5 }
            com.google.android.gms.measurement.internal.j3 r0 = r0.d()     // Catch:{ all -> 0x04b5 }
            com.google.android.gms.measurement.internal.h3 r0 = r0.w()     // Catch:{ all -> 0x04b5 }
            java.lang.String r7 = "Audience with no ID. appId"
            java.lang.Object r8 = com.google.android.gms.measurement.internal.j3.z(r25)     // Catch:{ all -> 0x04b5 }
            r0.b(r7, r8)     // Catch:{ all -> 0x04b5 }
            goto L_0x011d
        L_0x014f:
            int r9 = r0.zza()     // Catch:{ all -> 0x04b5 }
            java.util.List r10 = r0.zzg()     // Catch:{ all -> 0x04b5 }
            java.util.Iterator r10 = r10.iterator()     // Catch:{ all -> 0x04b5 }
        L_0x015b:
            boolean r11 = r10.hasNext()     // Catch:{ all -> 0x04b5 }
            if (r11 == 0) goto L_0x0185
            java.lang.Object r11 = r10.next()     // Catch:{ all -> 0x04b5 }
            com.google.android.gms.internal.measurement.zzej r11 = (com.google.android.gms.internal.measurement.zzej) r11     // Catch:{ all -> 0x04b5 }
            boolean r11 = r11.zzp()     // Catch:{ all -> 0x04b5 }
            if (r11 != 0) goto L_0x015b
            com.google.android.gms.measurement.internal.n4 r0 = r1.f5994a     // Catch:{ all -> 0x04b5 }
            com.google.android.gms.measurement.internal.j3 r0 = r0.d()     // Catch:{ all -> 0x04b5 }
            com.google.android.gms.measurement.internal.h3 r0 = r0.w()     // Catch:{ all -> 0x04b5 }
            java.lang.String r7 = "Event filter with no ID. Audience definition ignored. appId, audienceId"
            java.lang.Object r8 = com.google.android.gms.measurement.internal.j3.z(r25)     // Catch:{ all -> 0x04b5 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x04b5 }
        L_0x0181:
            r0.c(r7, r8, r9)     // Catch:{ all -> 0x04b5 }
            goto L_0x011d
        L_0x0185:
            java.util.List r10 = r0.zzh()     // Catch:{ all -> 0x04b5 }
            java.util.Iterator r10 = r10.iterator()     // Catch:{ all -> 0x04b5 }
        L_0x018d:
            boolean r11 = r10.hasNext()     // Catch:{ all -> 0x04b5 }
            if (r11 == 0) goto L_0x01b4
            java.lang.Object r11 = r10.next()     // Catch:{ all -> 0x04b5 }
            com.google.android.gms.internal.measurement.zzes r11 = (com.google.android.gms.internal.measurement.zzes) r11     // Catch:{ all -> 0x04b5 }
            boolean r11 = r11.zzj()     // Catch:{ all -> 0x04b5 }
            if (r11 != 0) goto L_0x018d
            com.google.android.gms.measurement.internal.n4 r0 = r1.f5994a     // Catch:{ all -> 0x04b5 }
            com.google.android.gms.measurement.internal.j3 r0 = r0.d()     // Catch:{ all -> 0x04b5 }
            com.google.android.gms.measurement.internal.h3 r0 = r0.w()     // Catch:{ all -> 0x04b5 }
            java.lang.String r7 = "Property filter with no ID. Audience definition ignored. appId, audienceId"
            java.lang.Object r8 = com.google.android.gms.measurement.internal.j3.z(r25)     // Catch:{ all -> 0x04b5 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x04b5 }
            goto L_0x0181
        L_0x01b4:
            java.util.List r10 = r0.zzg()     // Catch:{ all -> 0x04b5 }
            java.util.Iterator r10 = r10.iterator()     // Catch:{ all -> 0x04b5 }
        L_0x01bc:
            boolean r11 = r10.hasNext()     // Catch:{ all -> 0x04b5 }
            java.lang.String r15 = "data"
            java.lang.String r7 = "session_scoped"
            java.lang.String r12 = "filter_id"
            java.lang.String r13 = "audience_id"
            java.lang.String r8 = "app_id"
            if (r11 == 0) goto L_0x02a4
            java.lang.Object r11 = r10.next()     // Catch:{ all -> 0x04b5 }
            com.google.android.gms.internal.measurement.zzej r11 = (com.google.android.gms.internal.measurement.zzej) r11     // Catch:{ all -> 0x04b5 }
            r24.i()     // Catch:{ all -> 0x04b5 }
            r24.h()     // Catch:{ all -> 0x04b5 }
            com.google.android.gms.common.internal.s.g(r25)     // Catch:{ all -> 0x04b5 }
            com.google.android.gms.common.internal.s.k(r11)     // Catch:{ all -> 0x04b5 }
            java.lang.String r21 = r11.zzg()     // Catch:{ all -> 0x04b5 }
            boolean r21 = android.text.TextUtils.isEmpty(r21)     // Catch:{ all -> 0x04b5 }
            if (r21 == 0) goto L_0x021c
            com.google.android.gms.measurement.internal.n4 r0 = r1.f5994a     // Catch:{ all -> 0x04b5 }
            com.google.android.gms.measurement.internal.j3 r0 = r0.d()     // Catch:{ all -> 0x04b5 }
            com.google.android.gms.measurement.internal.h3 r0 = r0.w()     // Catch:{ all -> 0x04b5 }
            java.lang.String r7 = "Event filter had no event name. Audience definition ignored. appId, audienceId, filterId"
            java.lang.Object r8 = com.google.android.gms.measurement.internal.j3.z(r25)     // Catch:{ all -> 0x04b5 }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x04b5 }
            boolean r12 = r11.zzp()     // Catch:{ all -> 0x04b5 }
            if (r12 == 0) goto L_0x020d
            int r11 = r11.zzb()     // Catch:{ all -> 0x04b5 }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x04b5 }
            r20 = r11
            goto L_0x020f
        L_0x020d:
            r20 = 0
        L_0x020f:
            java.lang.String r11 = java.lang.String.valueOf(r20)     // Catch:{ all -> 0x04b5 }
            r0.d(r7, r8, r10, r11)     // Catch:{ all -> 0x04b5 }
            r22 = r4
            r4 = r25
            goto L_0x0381
        L_0x021c:
            byte[] r14 = r11.zzbs()     // Catch:{ all -> 0x04b5 }
            android.content.ContentValues r3 = new android.content.ContentValues     // Catch:{ all -> 0x04b5 }
            r3.<init>()     // Catch:{ all -> 0x04b5 }
            r22 = r4
            r4 = r25
            r3.put(r8, r4)     // Catch:{ all -> 0x04b5 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x04b5 }
            r3.put(r13, r8)     // Catch:{ all -> 0x04b5 }
            boolean r8 = r11.zzp()     // Catch:{ all -> 0x04b5 }
            if (r8 == 0) goto L_0x0242
            int r8 = r11.zzb()     // Catch:{ all -> 0x04b5 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x04b5 }
            goto L_0x0243
        L_0x0242:
            r8 = 0
        L_0x0243:
            r3.put(r12, r8)     // Catch:{ all -> 0x04b5 }
            java.lang.String r8 = "event_name"
            java.lang.String r12 = r11.zzg()     // Catch:{ all -> 0x04b5 }
            r3.put(r8, r12)     // Catch:{ all -> 0x04b5 }
            boolean r8 = r11.zzq()     // Catch:{ all -> 0x04b5 }
            if (r8 == 0) goto L_0x025e
            boolean r8 = r11.zzn()     // Catch:{ all -> 0x04b5 }
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)     // Catch:{ all -> 0x04b5 }
            goto L_0x025f
        L_0x025e:
            r8 = 0
        L_0x025f:
            r3.put(r7, r8)     // Catch:{ all -> 0x04b5 }
            r3.put(r15, r14)     // Catch:{ all -> 0x04b5 }
            android.database.sqlite.SQLiteDatabase r7 = r24.R()     // Catch:{ SQLiteException -> 0x028e }
            r8 = 5
            r11 = 0
            long r7 = r7.insertWithOnConflict(r5, r11, r3, r8)     // Catch:{ SQLiteException -> 0x028e }
            r11 = -1
            int r3 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r3 != 0) goto L_0x0288
            com.google.android.gms.measurement.internal.n4 r3 = r1.f5994a     // Catch:{ SQLiteException -> 0x028e }
            com.google.android.gms.measurement.internal.j3 r3 = r3.d()     // Catch:{ SQLiteException -> 0x028e }
            com.google.android.gms.measurement.internal.h3 r3 = r3.r()     // Catch:{ SQLiteException -> 0x028e }
            java.lang.String r7 = "Failed to insert event filter (got -1). appId"
            java.lang.Object r8 = com.google.android.gms.measurement.internal.j3.z(r25)     // Catch:{ SQLiteException -> 0x028e }
            r3.b(r7, r8)     // Catch:{ SQLiteException -> 0x028e }
        L_0x0288:
            r3 = r26
            r4 = r22
            goto L_0x01bc
        L_0x028e:
            r0 = move-exception
            com.google.android.gms.measurement.internal.n4 r3 = r1.f5994a     // Catch:{ all -> 0x04b5 }
            com.google.android.gms.measurement.internal.j3 r3 = r3.d()     // Catch:{ all -> 0x04b5 }
            com.google.android.gms.measurement.internal.h3 r3 = r3.r()     // Catch:{ all -> 0x04b5 }
            java.lang.String r7 = "Error storing event filter. appId"
            java.lang.Object r8 = com.google.android.gms.measurement.internal.j3.z(r25)     // Catch:{ all -> 0x04b5 }
        L_0x029f:
            r3.c(r7, r8, r0)     // Catch:{ all -> 0x04b5 }
            goto L_0x0381
        L_0x02a4:
            r22 = r4
            r4 = r25
            java.util.List r0 = r0.zzh()     // Catch:{ all -> 0x04b5 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x04b5 }
        L_0x02b0:
            boolean r3 = r0.hasNext()     // Catch:{ all -> 0x04b5 }
            if (r3 == 0) goto L_0x03b8
            java.lang.Object r3 = r0.next()     // Catch:{ all -> 0x04b5 }
            com.google.android.gms.internal.measurement.zzes r3 = (com.google.android.gms.internal.measurement.zzes) r3     // Catch:{ all -> 0x04b5 }
            r24.i()     // Catch:{ all -> 0x04b5 }
            r24.h()     // Catch:{ all -> 0x04b5 }
            com.google.android.gms.common.internal.s.g(r25)     // Catch:{ all -> 0x04b5 }
            com.google.android.gms.common.internal.s.k(r3)     // Catch:{ all -> 0x04b5 }
            java.lang.String r10 = r3.zze()     // Catch:{ all -> 0x04b5 }
            boolean r10 = android.text.TextUtils.isEmpty(r10)     // Catch:{ all -> 0x04b5 }
            if (r10 == 0) goto L_0x02ff
            com.google.android.gms.measurement.internal.n4 r0 = r1.f5994a     // Catch:{ all -> 0x04b5 }
            com.google.android.gms.measurement.internal.j3 r0 = r0.d()     // Catch:{ all -> 0x04b5 }
            com.google.android.gms.measurement.internal.h3 r0 = r0.w()     // Catch:{ all -> 0x04b5 }
            java.lang.String r7 = "Property filter had no property name. Audience definition ignored. appId, audienceId, filterId"
            java.lang.Object r8 = com.google.android.gms.measurement.internal.j3.z(r25)     // Catch:{ all -> 0x04b5 }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x04b5 }
            boolean r11 = r3.zzj()     // Catch:{ all -> 0x04b5 }
            if (r11 == 0) goto L_0x02f5
            int r3 = r3.zza()     // Catch:{ all -> 0x04b5 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x04b5 }
            goto L_0x02f6
        L_0x02f5:
            r3 = 0
        L_0x02f6:
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x04b5 }
            r0.d(r7, r8, r10, r3)     // Catch:{ all -> 0x04b5 }
            goto L_0x0381
        L_0x02ff:
            byte[] r10 = r3.zzbs()     // Catch:{ all -> 0x04b5 }
            android.content.ContentValues r11 = new android.content.ContentValues     // Catch:{ all -> 0x04b5 }
            r11.<init>()     // Catch:{ all -> 0x04b5 }
            r11.put(r8, r4)     // Catch:{ all -> 0x04b5 }
            java.lang.Integer r14 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x04b5 }
            r11.put(r13, r14)     // Catch:{ all -> 0x04b5 }
            boolean r14 = r3.zzj()     // Catch:{ all -> 0x04b5 }
            if (r14 == 0) goto L_0x0321
            int r14 = r3.zza()     // Catch:{ all -> 0x04b5 }
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)     // Catch:{ all -> 0x04b5 }
            goto L_0x0322
        L_0x0321:
            r14 = 0
        L_0x0322:
            r11.put(r12, r14)     // Catch:{ all -> 0x04b5 }
            java.lang.String r14 = "property_name"
            r23 = r0
            java.lang.String r0 = r3.zze()     // Catch:{ all -> 0x04b5 }
            r11.put(r14, r0)     // Catch:{ all -> 0x04b5 }
            boolean r0 = r3.zzk()     // Catch:{ all -> 0x04b5 }
            if (r0 == 0) goto L_0x033f
            boolean r0 = r3.zzi()     // Catch:{ all -> 0x04b5 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x04b5 }
            goto L_0x0340
        L_0x033f:
            r0 = 0
        L_0x0340:
            r11.put(r7, r0)     // Catch:{ all -> 0x04b5 }
            r11.put(r15, r10)     // Catch:{ all -> 0x04b5 }
            android.database.sqlite.SQLiteDatabase r0 = r24.R()     // Catch:{ SQLiteException -> 0x036e }
            r3 = 0
            r10 = 5
            long r20 = r0.insertWithOnConflict(r6, r3, r11, r10)     // Catch:{ SQLiteException -> 0x036e }
            r18 = -1
            int r0 = (r20 > r18 ? 1 : (r20 == r18 ? 0 : -1))
            if (r0 != 0) goto L_0x036a
            com.google.android.gms.measurement.internal.n4 r0 = r1.f5994a     // Catch:{ SQLiteException -> 0x036e }
            com.google.android.gms.measurement.internal.j3 r0 = r0.d()     // Catch:{ SQLiteException -> 0x036e }
            com.google.android.gms.measurement.internal.h3 r0 = r0.r()     // Catch:{ SQLiteException -> 0x036e }
            java.lang.String r3 = "Failed to insert property filter (got -1). appId"
            java.lang.Object r7 = com.google.android.gms.measurement.internal.j3.z(r25)     // Catch:{ SQLiteException -> 0x036e }
            r0.b(r3, r7)     // Catch:{ SQLiteException -> 0x036e }
            goto L_0x0381
        L_0x036a:
            r0 = r23
            goto L_0x02b0
        L_0x036e:
            r0 = move-exception
            com.google.android.gms.measurement.internal.n4 r3 = r1.f5994a     // Catch:{ all -> 0x04b5 }
            com.google.android.gms.measurement.internal.j3 r3 = r3.d()     // Catch:{ all -> 0x04b5 }
            com.google.android.gms.measurement.internal.h3 r3 = r3.r()     // Catch:{ all -> 0x04b5 }
            java.lang.String r7 = "Error storing property filter. appId"
            java.lang.Object r8 = com.google.android.gms.measurement.internal.j3.z(r25)     // Catch:{ all -> 0x04b5 }
            goto L_0x029f
        L_0x0381:
            r24.i()     // Catch:{ all -> 0x04b5 }
            r24.h()     // Catch:{ all -> 0x04b5 }
            com.google.android.gms.common.internal.s.g(r25)     // Catch:{ all -> 0x04b5 }
            android.database.sqlite.SQLiteDatabase r0 = r24.R()     // Catch:{ all -> 0x04b5 }
            r3 = 2
            java.lang.String[] r7 = new java.lang.String[r3]     // Catch:{ all -> 0x04b5 }
            r3 = 0
            r7[r3] = r4     // Catch:{ all -> 0x04b5 }
            java.lang.String r3 = java.lang.String.valueOf(r9)     // Catch:{ all -> 0x04b5 }
            r8 = 1
            r7[r8] = r3     // Catch:{ all -> 0x04b5 }
            r3 = r17
            r0.delete(r6, r3, r7)     // Catch:{ all -> 0x04b5 }
            r7 = 2
            java.lang.String[] r7 = new java.lang.String[r7]     // Catch:{ all -> 0x04b5 }
            r8 = 0
            r7[r8] = r4     // Catch:{ all -> 0x04b5 }
            java.lang.String r8 = java.lang.String.valueOf(r9)     // Catch:{ all -> 0x04b5 }
            r9 = 1
            r7[r9] = r8     // Catch:{ all -> 0x04b5 }
            r0.delete(r5, r3, r7)     // Catch:{ all -> 0x04b5 }
            r17 = r3
            r4 = r22
            r3 = r26
            goto L_0x011d
        L_0x03b8:
            r3 = r26
            r4 = r22
            goto L_0x011d
        L_0x03be:
            r4 = r25
            r3 = 0
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x04b5 }
            r0.<init>()     // Catch:{ all -> 0x04b5 }
            java.util.Iterator r5 = r26.iterator()     // Catch:{ all -> 0x04b5 }
        L_0x03ca:
            boolean r6 = r5.hasNext()     // Catch:{ all -> 0x04b5 }
            if (r6 == 0) goto L_0x03ea
            java.lang.Object r6 = r5.next()     // Catch:{ all -> 0x04b5 }
            com.google.android.gms.internal.measurement.zzeh r6 = (com.google.android.gms.internal.measurement.zzeh) r6     // Catch:{ all -> 0x04b5 }
            boolean r7 = r6.zzk()     // Catch:{ all -> 0x04b5 }
            if (r7 == 0) goto L_0x03e5
            int r6 = r6.zza()     // Catch:{ all -> 0x04b5 }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x04b5 }
            goto L_0x03e6
        L_0x03e5:
            r11 = r3
        L_0x03e6:
            r0.add(r11)     // Catch:{ all -> 0x04b5 }
            goto L_0x03ca
        L_0x03ea:
            com.google.android.gms.common.internal.s.g(r25)     // Catch:{ all -> 0x04b5 }
            r24.i()     // Catch:{ all -> 0x04b5 }
            r24.h()     // Catch:{ all -> 0x04b5 }
            android.database.sqlite.SQLiteDatabase r3 = r24.R()     // Catch:{ all -> 0x04b5 }
            java.lang.String[] r5 = new java.lang.String[]{r25}     // Catch:{ SQLiteException -> 0x049a }
            java.lang.String r6 = "select count(1) from audience_filter_values where app_id=?"
            long r5 = r1.L(r6, r5)     // Catch:{ SQLiteException -> 0x049a }
            com.google.android.gms.measurement.internal.n4 r7 = r1.f5994a     // Catch:{ all -> 0x04b5 }
            com.google.android.gms.measurement.internal.g r7 = r7.z()     // Catch:{ all -> 0x04b5 }
            com.google.android.gms.measurement.internal.x2 r8 = com.google.android.gms.measurement.internal.y2.G     // Catch:{ all -> 0x04b5 }
            int r7 = r7.o(r4, r8)     // Catch:{ all -> 0x04b5 }
            r8 = 2000(0x7d0, float:2.803E-42)
            int r7 = java.lang.Math.min(r8, r7)     // Catch:{ all -> 0x04b5 }
            r8 = 0
            int r7 = java.lang.Math.max(r8, r7)     // Catch:{ all -> 0x04b5 }
            long r8 = (long) r7     // Catch:{ all -> 0x04b5 }
            int r10 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r10 > 0) goto L_0x041f
            goto L_0x04ae
        L_0x041f:
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ all -> 0x04b5 }
            r5.<init>()     // Catch:{ all -> 0x04b5 }
            r6 = 0
        L_0x0425:
            int r8 = r0.size()     // Catch:{ all -> 0x04b5 }
            if (r6 >= r8) goto L_0x0441
            java.lang.Object r8 = r0.get(r6)     // Catch:{ all -> 0x04b5 }
            java.lang.Integer r8 = (java.lang.Integer) r8     // Catch:{ all -> 0x04b5 }
            if (r8 == 0) goto L_0x04ae
            int r8 = r8.intValue()     // Catch:{ all -> 0x04b5 }
            java.lang.String r8 = java.lang.Integer.toString(r8)     // Catch:{ all -> 0x04b5 }
            r5.add(r8)     // Catch:{ all -> 0x04b5 }
            int r6 = r6 + 1
            goto L_0x0425
        L_0x0441:
            java.lang.String r0 = ","
            java.lang.String r0 = android.text.TextUtils.join(r0, r5)     // Catch:{ all -> 0x04b5 }
            java.lang.String r5 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x04b5 }
            int r5 = r5.length()     // Catch:{ all -> 0x04b5 }
            r6 = 2
            int r5 = r5 + r6
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x04b5 }
            r6.<init>(r5)     // Catch:{ all -> 0x04b5 }
            java.lang.String r5 = "("
            r6.append(r5)     // Catch:{ all -> 0x04b5 }
            r6.append(r0)     // Catch:{ all -> 0x04b5 }
            java.lang.String r0 = ")"
            r6.append(r0)     // Catch:{ all -> 0x04b5 }
            java.lang.String r0 = r6.toString()     // Catch:{ all -> 0x04b5 }
            java.lang.String r5 = "audience_filter_values"
            java.lang.String r6 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x04b5 }
            int r6 = r6.length()     // Catch:{ all -> 0x04b5 }
            int r6 = r6 + 140
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x04b5 }
            r8.<init>(r6)     // Catch:{ all -> 0x04b5 }
            java.lang.String r6 = "audience_id in (select audience_id from audience_filter_values where app_id=? and audience_id not in "
            r8.append(r6)     // Catch:{ all -> 0x04b5 }
            r8.append(r0)     // Catch:{ all -> 0x04b5 }
            java.lang.String r0 = " order by rowid desc limit -1 offset ?)"
            r8.append(r0)     // Catch:{ all -> 0x04b5 }
            java.lang.String r0 = r8.toString()     // Catch:{ all -> 0x04b5 }
            r6 = 2
            java.lang.String[] r6 = new java.lang.String[r6]     // Catch:{ all -> 0x04b5 }
            r8 = 0
            r6[r8] = r4     // Catch:{ all -> 0x04b5 }
            java.lang.String r4 = java.lang.Integer.toString(r7)     // Catch:{ all -> 0x04b5 }
            r7 = 1
            r6[r7] = r4     // Catch:{ all -> 0x04b5 }
            r3.delete(r5, r0, r6)     // Catch:{ all -> 0x04b5 }
            goto L_0x04ae
        L_0x049a:
            r0 = move-exception
            com.google.android.gms.measurement.internal.n4 r3 = r1.f5994a     // Catch:{ all -> 0x04b5 }
            com.google.android.gms.measurement.internal.j3 r3 = r3.d()     // Catch:{ all -> 0x04b5 }
            com.google.android.gms.measurement.internal.h3 r3 = r3.r()     // Catch:{ all -> 0x04b5 }
            java.lang.String r5 = "Database error querying filters. appId"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.j3.z(r25)     // Catch:{ all -> 0x04b5 }
            r3.c(r5, r4, r0)     // Catch:{ all -> 0x04b5 }
        L_0x04ae:
            r2.setTransactionSuccessful()     // Catch:{ all -> 0x04b5 }
            r2.endTransaction()
            return
        L_0x04b5:
            r0 = move-exception
            r2.endTransaction()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.j.n(java.lang.String, java.util.List):void");
    }

    public final void o() {
        i();
        R().setTransactionSuccessful();
    }

    public final void p(u4 u4Var) {
        s.k(u4Var);
        h();
        i();
        String e02 = u4Var.e0();
        s.k(e02);
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", e02);
        contentValues.put("app_instance_id", u4Var.f0());
        contentValues.put("gmp_app_id", u4Var.k0());
        contentValues.put("resettable_device_id_hash", u4Var.b());
        contentValues.put("last_bundle_index", Long.valueOf(u4Var.Z()));
        contentValues.put("last_bundle_start_timestamp", Long.valueOf(u4Var.a0()));
        contentValues.put("last_bundle_end_timestamp", Long.valueOf(u4Var.Y()));
        contentValues.put("app_version", u4Var.h0());
        contentValues.put("app_store", u4Var.g0());
        contentValues.put("gmp_version", Long.valueOf(u4Var.X()));
        contentValues.put("dev_cert_hash", Long.valueOf(u4Var.U()));
        contentValues.put("measurement_enabled", Boolean.valueOf(u4Var.K()));
        contentValues.put("day", Long.valueOf(u4Var.T()));
        contentValues.put("daily_public_events_count", Long.valueOf(u4Var.R()));
        contentValues.put("daily_events_count", Long.valueOf(u4Var.Q()));
        contentValues.put("daily_conversions_count", Long.valueOf(u4Var.O()));
        contentValues.put("config_fetched_time", Long.valueOf(u4Var.N()));
        contentValues.put("failed_config_fetch_time", Long.valueOf(u4Var.W()));
        contentValues.put("app_version_int", Long.valueOf(u4Var.M()));
        contentValues.put("firebase_instance_id", u4Var.i0());
        contentValues.put("daily_error_events_count", Long.valueOf(u4Var.P()));
        contentValues.put("daily_realtime_events_count", Long.valueOf(u4Var.S()));
        contentValues.put("health_monitor_sample", u4Var.a());
        contentValues.put("android_id", Long.valueOf(u4Var.A()));
        contentValues.put("adid_reporting_enabled", Boolean.valueOf(u4Var.J()));
        contentValues.put("admob_app_id", u4Var.c0());
        contentValues.put("dynamite_version", Long.valueOf(u4Var.V()));
        List c10 = u4Var.c();
        if (c10 != null) {
            if (c10.size() == 0) {
                this.f5994a.d().w().b("Safelisted events should not be an empty list. appId", e02);
            } else {
                contentValues.put("safelisted_events", TextUtils.join(",", c10));
            }
        }
        zzoq.zzc();
        if (this.f5994a.z().B(e02, y2.f6623f0)) {
            contentValues.put("ga_app_id", u4Var.j0());
        }
        try {
            SQLiteDatabase R = R();
            if (((long) R.update("apps", contentValues, "app_id = ?", new String[]{e02})) == 0 && R.insertWithOnConflict("apps", (String) null, contentValues, 5) == -1) {
                this.f5994a.d().r().b("Failed to insert/update app (got -1). appId", j3.z(e02));
            }
        } catch (SQLiteException e10) {
            this.f5994a.d().r().c("Error storing app. appId", j3.z(e02), e10);
        }
    }

    public final void q(p pVar) {
        s.k(pVar);
        h();
        i();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", pVar.f6302a);
        contentValues.put("name", pVar.f6303b);
        contentValues.put("lifetime_count", Long.valueOf(pVar.f6304c));
        contentValues.put("current_bundle_count", Long.valueOf(pVar.f6305d));
        contentValues.put("last_fire_timestamp", Long.valueOf(pVar.f6307f));
        contentValues.put("last_bundled_timestamp", Long.valueOf(pVar.f6308g));
        contentValues.put("last_bundled_day", pVar.f6309h);
        contentValues.put("last_sampled_complex_event_id", pVar.f6310i);
        contentValues.put("last_sampling_rate", pVar.f6311j);
        contentValues.put("current_session_count", Long.valueOf(pVar.f6306e));
        Boolean bool = pVar.f6312k;
        contentValues.put("last_exempt_from_sampling", (bool == null || !bool.booleanValue()) ? null : 1L);
        try {
            if (R().insertWithOnConflict("events", (String) null, contentValues, 5) == -1) {
                this.f5994a.d().r().b("Failed to insert/update event aggregates (got -1). appId", j3.z(pVar.f6302a));
            }
        } catch (SQLiteException e10) {
            this.f5994a.d().r().c("Error storing event aggregates. appId", j3.z(pVar.f6302a), e10);
        }
    }

    public final void r(String str, byte[] bArr, String str2) {
        s.g(str);
        h();
        i();
        ContentValues contentValues = new ContentValues();
        contentValues.put("remote_config", bArr);
        contentValues.put("config_last_modified_time", str2);
        try {
            if (((long) R().update("apps", contentValues, "app_id = ?", new String[]{str})) == 0) {
                this.f5994a.d().r().b("Failed to update remote config (got 0). appId", j3.z(str));
            }
        } catch (SQLiteException e10) {
            this.f5994a.d().r().c("Error storing remote config. appId", j3.z(str), e10);
        }
    }

    public final boolean s() {
        return L("select count(1) > 0 from raw_events", (String[]) null) != 0;
    }

    public final boolean t() {
        return L("select count(1) > 0 from queue where has_realtime = 1", (String[]) null) != 0;
    }

    public final boolean u() {
        return L("select count(1) > 0 from raw_events where realtime = 1", (String[]) null) != 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0047, code lost:
        if (r2 > (com.google.android.gms.measurement.internal.g.i() + r0)) goto L_0x0049;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean v(com.google.android.gms.internal.measurement.zzfy r8, boolean r9) {
        /*
            r7 = this;
            r7.h()
            r7.i()
            com.google.android.gms.common.internal.s.k(r8)
            java.lang.String r0 = r8.zzy()
            com.google.android.gms.common.internal.s.g(r0)
            boolean r0 = r8.zzbc()
            com.google.android.gms.common.internal.s.n(r0)
            r7.j0()
            com.google.android.gms.measurement.internal.n4 r0 = r7.f5994a
            y3.e r0 = r0.e()
            long r0 = r0.currentTimeMillis()
            long r2 = r8.zzm()
            com.google.android.gms.measurement.internal.n4 r4 = r7.f5994a
            r4.z()
            long r4 = com.google.android.gms.measurement.internal.g.i()
            long r4 = r0 - r4
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 < 0) goto L_0x0049
            long r2 = r8.zzm()
            com.google.android.gms.measurement.internal.n4 r4 = r7.f5994a
            r4.z()
            long r4 = com.google.android.gms.measurement.internal.g.i()
            long r4 = r4 + r0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 <= 0) goto L_0x006c
        L_0x0049:
            com.google.android.gms.measurement.internal.n4 r2 = r7.f5994a
            com.google.android.gms.measurement.internal.j3 r2 = r2.d()
            com.google.android.gms.measurement.internal.h3 r2 = r2.w()
            java.lang.String r3 = r8.zzy()
            java.lang.Object r3 = com.google.android.gms.measurement.internal.j3.z(r3)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            long r4 = r8.zzm()
            java.lang.Long r1 = java.lang.Long.valueOf(r4)
            java.lang.String r4 = "Storing bundle outside of the max uploading time span. appId, now, timestamp"
            r2.d(r4, r3, r0, r1)
        L_0x006c:
            byte[] r0 = r8.zzbs()
            r1 = 0
            com.google.android.gms.measurement.internal.w8 r2 = r7.f6214b     // Catch:{ IOException -> 0x010f }
            com.google.android.gms.measurement.internal.y8 r2 = r2.f0()     // Catch:{ IOException -> 0x010f }
            byte[] r0 = r2.Q(r0)     // Catch:{ IOException -> 0x010f }
            com.google.android.gms.measurement.internal.n4 r2 = r7.f5994a
            com.google.android.gms.measurement.internal.j3 r2 = r2.d()
            com.google.android.gms.measurement.internal.h3 r2 = r2.v()
            int r3 = r0.length
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.String r4 = "Saving bundle, size"
            r2.b(r4, r3)
            android.content.ContentValues r2 = new android.content.ContentValues
            r2.<init>()
            java.lang.String r3 = "app_id"
            java.lang.String r4 = r8.zzy()
            r2.put(r3, r4)
            long r3 = r8.zzm()
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            java.lang.String r4 = "bundle_end_timestamp"
            r2.put(r4, r3)
            java.lang.String r3 = "data"
            r2.put(r3, r0)
            java.lang.String r0 = "has_realtime"
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r2.put(r0, r9)
            boolean r9 = r8.zzbi()
            if (r9 == 0) goto L_0x00cb
            int r9 = r8.zze()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            java.lang.String r0 = "retry_count"
            r2.put(r0, r9)
        L_0x00cb:
            android.database.sqlite.SQLiteDatabase r9 = r7.R()     // Catch:{ SQLiteException -> 0x00f6 }
            java.lang.String r0 = "queue"
            r3 = 0
            long r2 = r9.insert(r0, r3, r2)     // Catch:{ SQLiteException -> 0x00f6 }
            r4 = -1
            int r9 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r9 != 0) goto L_0x00f4
            com.google.android.gms.measurement.internal.n4 r9 = r7.f5994a     // Catch:{ SQLiteException -> 0x00f6 }
            com.google.android.gms.measurement.internal.j3 r9 = r9.d()     // Catch:{ SQLiteException -> 0x00f6 }
            com.google.android.gms.measurement.internal.h3 r9 = r9.r()     // Catch:{ SQLiteException -> 0x00f6 }
            java.lang.String r0 = "Failed to insert bundle (got -1). appId"
            java.lang.String r2 = r8.zzy()     // Catch:{ SQLiteException -> 0x00f6 }
            java.lang.Object r2 = com.google.android.gms.measurement.internal.j3.z(r2)     // Catch:{ SQLiteException -> 0x00f6 }
            r9.b(r0, r2)     // Catch:{ SQLiteException -> 0x00f6 }
            return r1
        L_0x00f4:
            r8 = 1
            return r8
        L_0x00f6:
            r9 = move-exception
            com.google.android.gms.measurement.internal.n4 r0 = r7.f5994a
            com.google.android.gms.measurement.internal.j3 r0 = r0.d()
            com.google.android.gms.measurement.internal.h3 r0 = r0.r()
            java.lang.String r8 = r8.zzy()
            java.lang.Object r8 = com.google.android.gms.measurement.internal.j3.z(r8)
            java.lang.String r2 = "Error storing bundle. appId"
        L_0x010b:
            r0.c(r2, r8, r9)
            return r1
        L_0x010f:
            r9 = move-exception
            com.google.android.gms.measurement.internal.n4 r0 = r7.f5994a
            com.google.android.gms.measurement.internal.j3 r0 = r0.d()
            com.google.android.gms.measurement.internal.h3 r0 = r0.r()
            java.lang.String r8 = r8.zzy()
            java.lang.Object r8 = com.google.android.gms.measurement.internal.j3.z(r8)
            java.lang.String r2 = "Data loss. Failed to serialize bundle. appId"
            goto L_0x010b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.j.v(com.google.android.gms.internal.measurement.zzfy, boolean):boolean");
    }

    /* access modifiers changed from: protected */
    public final boolean w() {
        Context c10 = this.f5994a.c();
        this.f5994a.z();
        return c10.getDatabasePath("google_app_measurement.db").exists();
    }

    public final boolean x(String str, Long l10, long j10, zzfo zzfo) {
        h();
        i();
        s.k(zzfo);
        s.g(str);
        s.k(l10);
        byte[] zzbs = zzfo.zzbs();
        this.f5994a.d().v().c("Saving complex main event, appId, data size", this.f5994a.D().q(str), Integer.valueOf(zzbs.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("event_id", l10);
        contentValues.put("children_to_process", Long.valueOf(j10));
        contentValues.put("main_event", zzbs);
        try {
            if (R().insertWithOnConflict("main_event_params", (String) null, contentValues, 5) != -1) {
                return true;
            }
            this.f5994a.d().r().b("Failed to insert complex main event (got -1). appId", j3.z(str));
            return false;
        } catch (SQLiteException e10) {
            this.f5994a.d().r().c("Error storing complex main event. appId", j3.z(str), e10);
            return false;
        }
    }

    public final boolean y(c cVar) {
        s.k(cVar);
        h();
        i();
        String str = cVar.f5873e;
        s.k(str);
        if (Z(str, cVar.f5875g.f6689f) == null) {
            long L = L("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[]{str});
            this.f5994a.z();
            if (L >= 1000) {
                return false;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put(FirebaseAnalytics.Param.ORIGIN, cVar.f5874f);
        contentValues.put("name", cVar.f5875g.f6689f);
        J(contentValues, FirebaseAnalytics.Param.VALUE, s.k(cVar.f5875g.U()));
        contentValues.put("active", Boolean.valueOf(cVar.f5877i));
        contentValues.put("trigger_event_name", cVar.f5878j);
        contentValues.put("trigger_timeout", Long.valueOf(cVar.f5880l));
        contentValues.put("timed_out_event", this.f5994a.N().c0(cVar.f5879k));
        contentValues.put("creation_timestamp", Long.valueOf(cVar.f5876h));
        contentValues.put("triggered_event", this.f5994a.N().c0(cVar.f5881m));
        contentValues.put("triggered_timestamp", Long.valueOf(cVar.f5875g.f6690g));
        contentValues.put("time_to_live", Long.valueOf(cVar.f5882n));
        contentValues.put("expired_event", this.f5994a.N().c0(cVar.f5883o));
        try {
            if (R().insertWithOnConflict("conditional_properties", (String) null, contentValues, 5) != -1) {
                return true;
            }
            this.f5994a.d().r().b("Failed to insert/update conditional user property (got -1)", j3.z(str));
            return true;
        } catch (SQLiteException e10) {
            this.f5994a.d().r().c("Error storing conditional user property", j3.z(str), e10);
            return true;
        }
    }

    public final boolean z(b9 b9Var) {
        s.k(b9Var);
        h();
        i();
        if (Z(b9Var.f5868a, b9Var.f5870c) == null) {
            if (d9.W(b9Var.f5870c)) {
                if (L("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new String[]{b9Var.f5868a}) >= ((long) this.f5994a.z().p(b9Var.f5868a, y2.H, 25, 100))) {
                    return false;
                }
            } else if (!"_npa".equals(b9Var.f5870c)) {
                long L = L("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[]{b9Var.f5868a, b9Var.f5869b});
                this.f5994a.z();
                if (L >= 25) {
                    return false;
                }
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", b9Var.f5868a);
        contentValues.put(FirebaseAnalytics.Param.ORIGIN, b9Var.f5869b);
        contentValues.put("name", b9Var.f5870c);
        contentValues.put("set_timestamp", Long.valueOf(b9Var.f5871d));
        J(contentValues, FirebaseAnalytics.Param.VALUE, b9Var.f5872e);
        try {
            if (R().insertWithOnConflict("user_attributes", (String) null, contentValues, 5) != -1) {
                return true;
            }
            this.f5994a.d().r().b("Failed to insert/update user property (got -1). appId", j3.z(b9Var.f5868a));
            return true;
        } catch (SQLiteException e10) {
            this.f5994a.d().r().c("Error storing user property. appId", j3.z(b9Var.f5868a), e10);
            return true;
        }
    }
}
