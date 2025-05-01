package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.google.android.gms.common.api.a;
import com.google.android.gms.internal.measurement.zzfn;
import com.google.android.gms.internal.measurement.zzfo;
import com.google.android.gms.internal.measurement.zzfx;
import com.google.android.gms.internal.measurement.zzfy;
import com.google.android.gms.internal.measurement.zzoq;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
final class j extends n8 {

    /* renamed from: f, reason: collision with root package name */
    private static final String[] f6113f = {"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_bundled_day", "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;", "current_session_count", "ALTER TABLE events ADD COLUMN current_session_count INTEGER;"};

    /* renamed from: g, reason: collision with root package name */
    private static final String[] f6114g = {FirebaseAnalytics.Param.ORIGIN, "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};

    /* renamed from: h, reason: collision with root package name */
    private static final String[] f6115h = {"app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", "day", "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;", "admob_app_id", "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;", "linked_admob_app_id", "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;", "dynamite_version", "ALTER TABLE apps ADD COLUMN dynamite_version INTEGER;", "safelisted_events", "ALTER TABLE apps ADD COLUMN safelisted_events TEXT;", "ga_app_id", "ALTER TABLE apps ADD COLUMN ga_app_id TEXT;", "config_last_modified_time", "ALTER TABLE apps ADD COLUMN config_last_modified_time TEXT;"};

    /* renamed from: i, reason: collision with root package name */
    private static final String[] f6116i = {"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;"};

    /* renamed from: j, reason: collision with root package name */
    private static final String[] f6117j = {"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"};

    /* renamed from: k, reason: collision with root package name */
    private static final String[] f6118k = {"session_scoped", "ALTER TABLE event_filters ADD COLUMN session_scoped BOOLEAN;"};

    /* renamed from: l, reason: collision with root package name */
    private static final String[] f6119l = {"session_scoped", "ALTER TABLE property_filters ADD COLUMN session_scoped BOOLEAN;"};

    /* renamed from: m, reason: collision with root package name */
    private static final String[] f6120m = {"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};

    /* renamed from: d, reason: collision with root package name */
    private final i f6121d;

    /* renamed from: e, reason: collision with root package name */
    private final i8 f6122e;

    j(w8 w8Var) {
        super(w8Var);
        this.f6122e = new i8(this.f6026a.e());
        this.f6026a.z();
        this.f6121d = new i(this, this.f6026a.c(), "google_app_measurement.db");
    }

    static final void J(ContentValues contentValues, String str, Object obj) {
        com.google.android.gms.common.internal.s.g(FirebaseAnalytics.Param.VALUE);
        com.google.android.gms.common.internal.s.k(obj);
        if (obj instanceof String) {
            contentValues.put(FirebaseAnalytics.Param.VALUE, (String) obj);
        } else if (obj instanceof Long) {
            contentValues.put(FirebaseAnalytics.Param.VALUE, (Long) obj);
        } else {
            if (!(obj instanceof Double)) {
                throw new IllegalArgumentException("Invalid value type");
            }
            contentValues.put(FirebaseAnalytics.Param.VALUE, (Double) obj);
        }
    }

    private final long L(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            try {
                Cursor rawQuery = R().rawQuery(str, strArr);
                if (!rawQuery.moveToFirst()) {
                    throw new SQLiteException("Database returned empty set");
                }
                long j10 = rawQuery.getLong(0);
                rawQuery.close();
                return j10;
            } catch (SQLiteException e10) {
                this.f6026a.d().r().c("Database error", str, e10);
                throw e10;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    private final long M(String str, String[] strArr, long j10) {
        Cursor cursor = null;
        try {
            try {
                cursor = R().rawQuery(str, strArr);
                if (!cursor.moveToFirst()) {
                    cursor.close();
                    return j10;
                }
                long j11 = cursor.getLong(0);
                cursor.close();
                return j11;
            } catch (SQLiteException e10) {
                this.f6026a.d().r().c("Database error", str, e10);
                throw e10;
            }
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 4, insn: 0x0236: MOVE (r3 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]), block:B:107:0x0236 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v2, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r4v3, types: [boolean] */
    public final void I(String str, long j10, long j11, v8 v8Var) {
        ?? r42;
        Cursor cursor;
        String str2;
        Cursor rawQuery;
        String string;
        String str3;
        String[] strArr;
        com.google.android.gms.common.internal.s.k(v8Var);
        h();
        i();
        Cursor cursor2 = null;
        r3 = null;
        r3 = null;
        String str4 = null;
        try {
            try {
                SQLiteDatabase R = R();
                r42 = TextUtils.isEmpty(null);
                try {
                    if (r42 != 0) {
                        String[] strArr2 = j11 != -1 ? new String[]{String.valueOf(j11), String.valueOf(j10)} : new String[]{String.valueOf(j10)};
                        str2 = j11 != -1 ? "rowid <= ? and " : "";
                        StringBuilder sb2 = new StringBuilder(str2.length() + 148);
                        sb2.append("select app_id, metadata_fingerprint from raw_events where ");
                        sb2.append(str2);
                        sb2.append("app_id in (select app_id from apps where config_fetched_time >= ?) order by rowid limit 1;");
                        rawQuery = R.rawQuery(sb2.toString(), strArr2);
                        if (!rawQuery.moveToFirst()) {
                            rawQuery.close();
                            return;
                        } else {
                            str4 = rawQuery.getString(0);
                            string = rawQuery.getString(1);
                            rawQuery.close();
                        }
                    } else {
                        String[] strArr3 = j11 != -1 ? new String[]{null, String.valueOf(j11)} : new String[]{null};
                        str2 = j11 != -1 ? " and rowid <= ?" : "";
                        StringBuilder sb3 = new StringBuilder(str2.length() + 84);
                        sb3.append("select metadata_fingerprint from raw_events where app_id = ?");
                        sb3.append(str2);
                        sb3.append(" order by rowid limit 1;");
                        rawQuery = R.rawQuery(sb3.toString(), strArr3);
                        if (!rawQuery.moveToFirst()) {
                            rawQuery.close();
                            return;
                        } else {
                            string = rawQuery.getString(0);
                            rawQuery.close();
                        }
                    }
                    Cursor cursor3 = rawQuery;
                    String str5 = string;
                    try {
                        String str6 = str5;
                        Cursor query = R.query("raw_events_metadata", new String[]{"metadata"}, "app_id = ? and metadata_fingerprint = ?", new String[]{str4, str5}, null, null, "rowid", "2");
                        try {
                            if (!query.moveToFirst()) {
                                this.f6026a.d().r().b("Raw event metadata record is missing. appId", j3.z(str4));
                                query.close();
                                return;
                            }
                            try {
                                try {
                                    zzfy zzaA = ((zzfx) y8.D(zzfy.zzu(), query.getBlob(0))).zzaA();
                                    if (query.moveToNext()) {
                                        this.f6026a.d().w().b("Get multiple raw event metadata records, expected one. appId", j3.z(str4));
                                    }
                                    query.close();
                                    com.google.android.gms.common.internal.s.k(zzaA);
                                    v8Var.f6539a = zzaA;
                                    if (j11 != -1) {
                                        str3 = "app_id = ? and metadata_fingerprint = ? and rowid <= ?";
                                        strArr = new String[]{str4, str6, String.valueOf(j11)};
                                    } else {
                                        str3 = "app_id = ? and metadata_fingerprint = ?";
                                        strArr = new String[]{str4, str6};
                                    }
                                    Cursor query2 = R.query("raw_events", new String[]{"rowid", "name", "timestamp", Constants.ScionAnalytics.MessageType.DATA_MESSAGE}, str3, strArr, null, null, "rowid", null);
                                    if (!query2.moveToFirst()) {
                                        this.f6026a.d().w().b("Raw event data disappeared while in transaction. appId", j3.z(str4));
                                        query2.close();
                                        return;
                                    }
                                    do {
                                        long j12 = query2.getLong(0);
                                        try {
                                            zzfn zzfnVar = (zzfn) y8.D(zzfo.zze(), query2.getBlob(3));
                                            zzfnVar.zzi(query2.getString(1));
                                            zzfnVar.zzm(query2.getLong(2));
                                            if (!v8Var.a(j12, zzfnVar.zzaA())) {
                                                query2.close();
                                                return;
                                            }
                                        } catch (IOException e10) {
                                            this.f6026a.d().r().c("Data loss. Failed to merge raw event. appId", j3.z(str4), e10);
                                        }
                                    } while (query2.moveToNext());
                                    query2.close();
                                } catch (SQLiteException e11) {
                                    e = e11;
                                    r42 = str6;
                                    this.f6026a.d().r().c("Data loss. Error selecting raw event. appId", j3.z(str4), e);
                                    if (r42 != 0) {
                                        r42.close();
                                    }
                                } catch (Throwable th) {
                                    th = th;
                                    cursor2 = str6;
                                    if (cursor2 != null) {
                                        cursor2.close();
                                    }
                                    throw th;
                                }
                            } catch (IOException e12) {
                                this.f6026a.d().r().c("Data loss. Failed to merge raw event metadata. appId", j3.z(str4), e12);
                                query.close();
                            }
                        } catch (SQLiteException e13) {
                            e = e13;
                            str6 = query;
                        } catch (Throwable th2) {
                            th = th2;
                            str6 = query;
                        }
                    } catch (SQLiteException e14) {
                        e = e14;
                        r42 = cursor3;
                    } catch (Throwable th3) {
                        th = th3;
                        cursor2 = cursor3;
                    }
                } catch (SQLiteException e15) {
                    e = e15;
                }
            } catch (SQLiteException e16) {
                e = e16;
                r42 = 0;
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (Throwable th5) {
            th = th5;
            cursor2 = cursor;
        }
    }

    public final int K(String str, String str2) {
        com.google.android.gms.common.internal.s.g(str);
        com.google.android.gms.common.internal.s.g(str2);
        h();
        i();
        try {
            return R().delete("conditional_properties", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e10) {
            this.f6026a.d().r().d("Error deleting conditional property", j3.z(str), this.f6026a.D().s(str2), e10);
            return 0;
        }
    }

    protected final long N(String str, String str2) {
        long M;
        com.google.android.gms.common.internal.s.g(str);
        com.google.android.gms.common.internal.s.g("first_open_count");
        h();
        i();
        SQLiteDatabase R = R();
        R.beginTransaction();
        long j10 = 0;
        try {
            try {
                StringBuilder sb2 = new StringBuilder(48);
                sb2.append("select ");
                sb2.append("first_open_count");
                sb2.append(" from app2 where app_id=?");
                M = M(sb2.toString(), new String[]{str}, -1L);
                if (M == -1) {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("app_id", str);
                    contentValues.put("first_open_count", (Integer) 0);
                    contentValues.put("previous_install_count", (Integer) 0);
                    if (R.insertWithOnConflict("app2", null, contentValues, 5) == -1) {
                        this.f6026a.d().r().c("Failed to insert column (got -1). appId", j3.z(str), "first_open_count");
                        return -1L;
                    }
                    M = 0;
                }
            } finally {
                R.endTransaction();
            }
        } catch (SQLiteException e10) {
            e = e10;
        }
        try {
            ContentValues contentValues2 = new ContentValues();
            contentValues2.put("app_id", str);
            contentValues2.put("first_open_count", Long.valueOf(1 + M));
            if (R.update("app2", contentValues2, "app_id = ?", new String[]{str}) == 0) {
                this.f6026a.d().r().c("Failed to update column (got 0). appId", j3.z(str), "first_open_count");
                return -1L;
            }
            R.setTransactionSuccessful();
            return M;
        } catch (SQLiteException e11) {
            e = e11;
            j10 = M;
            this.f6026a.d().r().d("Error inserting column. appId", j3.z(str), "first_open_count", e);
            R.endTransaction();
            return j10;
        }
    }

    public final long O() {
        return M("select max(bundle_end_timestamp) from queue", null, 0L);
    }

    public final long P() {
        return M("select max(timestamp) from raw_events", null, 0L);
    }

    public final long Q(String str) {
        com.google.android.gms.common.internal.s.g(str);
        return M("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[]{str}, 0L);
    }

    final SQLiteDatabase R() {
        h();
        try {
            return this.f6121d.getWritableDatabase();
        } catch (SQLiteException e10) {
            this.f6026a.d().w().b("Error opening database", e10);
            throw e10;
        }
    }

    /* JADX WARN: Not initialized variable reg: 1, insn: 0x00d5: MOVE (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]), block:B:58:0x00d5 */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00d8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.os.Bundle S(java.lang.String r8) {
        /*
            r7 = this;
            r7.h()
            r7.i()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r7.R()     // Catch: java.lang.Throwable -> Lbb android.database.sqlite.SQLiteException -> Lbd
            java.lang.String[] r2 = new java.lang.String[]{r8}     // Catch: java.lang.Throwable -> Lbb android.database.sqlite.SQLiteException -> Lbd
            java.lang.String r3 = "select parameters from default_event_params where app_id=?"
            android.database.Cursor r1 = r1.rawQuery(r3, r2)     // Catch: java.lang.Throwable -> Lbb android.database.sqlite.SQLiteException -> Lbd
            boolean r2 = r1.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> Lb9 java.lang.Throwable -> Ld4
            if (r2 != 0) goto L2e
            com.google.android.gms.measurement.internal.n4 r8 = r7.f6026a     // Catch: android.database.sqlite.SQLiteException -> Lb9 java.lang.Throwable -> Ld4
            com.google.android.gms.measurement.internal.j3 r8 = r8.d()     // Catch: android.database.sqlite.SQLiteException -> Lb9 java.lang.Throwable -> Ld4
            com.google.android.gms.measurement.internal.h3 r8 = r8.v()     // Catch: android.database.sqlite.SQLiteException -> Lb9 java.lang.Throwable -> Ld4
            java.lang.String r2 = "Default event parameters not found"
            r8.a(r2)     // Catch: android.database.sqlite.SQLiteException -> Lb9 java.lang.Throwable -> Ld4
            r1.close()
            return r0
        L2e:
            r2 = 0
            byte[] r2 = r1.getBlob(r2)     // Catch: android.database.sqlite.SQLiteException -> Lb9 java.lang.Throwable -> Ld4
            com.google.android.gms.internal.measurement.zzfn r3 = com.google.android.gms.internal.measurement.zzfo.zze()     // Catch: java.io.IOException -> La1 android.database.sqlite.SQLiteException -> Lb9 java.lang.Throwable -> Ld4
            com.google.android.gms.internal.measurement.zzlf r2 = com.google.android.gms.measurement.internal.y8.D(r3, r2)     // Catch: java.io.IOException -> La1 android.database.sqlite.SQLiteException -> Lb9 java.lang.Throwable -> Ld4
            com.google.android.gms.internal.measurement.zzfn r2 = (com.google.android.gms.internal.measurement.zzfn) r2     // Catch: java.io.IOException -> La1 android.database.sqlite.SQLiteException -> Lb9 java.lang.Throwable -> Ld4
            com.google.android.gms.internal.measurement.zzjz r2 = r2.zzaA()     // Catch: java.io.IOException -> La1 android.database.sqlite.SQLiteException -> Lb9 java.lang.Throwable -> Ld4
            com.google.android.gms.internal.measurement.zzfo r2 = (com.google.android.gms.internal.measurement.zzfo) r2     // Catch: java.io.IOException -> La1 android.database.sqlite.SQLiteException -> Lb9 java.lang.Throwable -> Ld4
            com.google.android.gms.measurement.internal.w8 r8 = r7.f6246b     // Catch: android.database.sqlite.SQLiteException -> Lb9 java.lang.Throwable -> Ld4
            r8.f0()     // Catch: android.database.sqlite.SQLiteException -> Lb9 java.lang.Throwable -> Ld4
            java.util.List r8 = r2.zzi()     // Catch: android.database.sqlite.SQLiteException -> Lb9 java.lang.Throwable -> Ld4
            android.os.Bundle r2 = new android.os.Bundle     // Catch: android.database.sqlite.SQLiteException -> Lb9 java.lang.Throwable -> Ld4
            r2.<init>()     // Catch: android.database.sqlite.SQLiteException -> Lb9 java.lang.Throwable -> Ld4
            java.util.Iterator r8 = r8.iterator()     // Catch: android.database.sqlite.SQLiteException -> Lb9 java.lang.Throwable -> Ld4
        L55:
            boolean r3 = r8.hasNext()     // Catch: android.database.sqlite.SQLiteException -> Lb9 java.lang.Throwable -> Ld4
            if (r3 == 0) goto L9d
            java.lang.Object r3 = r8.next()     // Catch: android.database.sqlite.SQLiteException -> Lb9 java.lang.Throwable -> Ld4
            com.google.android.gms.internal.measurement.zzfs r3 = (com.google.android.gms.internal.measurement.zzfs) r3     // Catch: android.database.sqlite.SQLiteException -> Lb9 java.lang.Throwable -> Ld4
            java.lang.String r4 = r3.zzg()     // Catch: android.database.sqlite.SQLiteException -> Lb9 java.lang.Throwable -> Ld4
            boolean r5 = r3.zzu()     // Catch: android.database.sqlite.SQLiteException -> Lb9 java.lang.Throwable -> Ld4
            if (r5 == 0) goto L73
            double r5 = r3.zza()     // Catch: android.database.sqlite.SQLiteException -> Lb9 java.lang.Throwable -> Ld4
            r2.putDouble(r4, r5)     // Catch: android.database.sqlite.SQLiteException -> Lb9 java.lang.Throwable -> Ld4
            goto L55
        L73:
            boolean r5 = r3.zzv()     // Catch: android.database.sqlite.SQLiteException -> Lb9 java.lang.Throwable -> Ld4
            if (r5 == 0) goto L81
            float r3 = r3.zzb()     // Catch: android.database.sqlite.SQLiteException -> Lb9 java.lang.Throwable -> Ld4
            r2.putFloat(r4, r3)     // Catch: android.database.sqlite.SQLiteException -> Lb9 java.lang.Throwable -> Ld4
            goto L55
        L81:
            boolean r5 = r3.zzy()     // Catch: android.database.sqlite.SQLiteException -> Lb9 java.lang.Throwable -> Ld4
            if (r5 == 0) goto L8f
            java.lang.String r3 = r3.zzh()     // Catch: android.database.sqlite.SQLiteException -> Lb9 java.lang.Throwable -> Ld4
            r2.putString(r4, r3)     // Catch: android.database.sqlite.SQLiteException -> Lb9 java.lang.Throwable -> Ld4
            goto L55
        L8f:
            boolean r5 = r3.zzw()     // Catch: android.database.sqlite.SQLiteException -> Lb9 java.lang.Throwable -> Ld4
            if (r5 == 0) goto L55
            long r5 = r3.zzd()     // Catch: android.database.sqlite.SQLiteException -> Lb9 java.lang.Throwable -> Ld4
            r2.putLong(r4, r5)     // Catch: android.database.sqlite.SQLiteException -> Lb9 java.lang.Throwable -> Ld4
            goto L55
        L9d:
            r1.close()
            return r2
        La1:
            r2 = move-exception
            com.google.android.gms.measurement.internal.n4 r3 = r7.f6026a     // Catch: android.database.sqlite.SQLiteException -> Lb9 java.lang.Throwable -> Ld4
            com.google.android.gms.measurement.internal.j3 r3 = r3.d()     // Catch: android.database.sqlite.SQLiteException -> Lb9 java.lang.Throwable -> Ld4
            com.google.android.gms.measurement.internal.h3 r3 = r3.r()     // Catch: android.database.sqlite.SQLiteException -> Lb9 java.lang.Throwable -> Ld4
            java.lang.String r4 = "Failed to retrieve default event parameters. appId"
            java.lang.Object r8 = com.google.android.gms.measurement.internal.j3.z(r8)     // Catch: android.database.sqlite.SQLiteException -> Lb9 java.lang.Throwable -> Ld4
            r3.c(r4, r8, r2)     // Catch: android.database.sqlite.SQLiteException -> Lb9 java.lang.Throwable -> Ld4
            r1.close()
            return r0
        Lb9:
            r8 = move-exception
            goto Lbf
        Lbb:
            r8 = move-exception
            goto Ld6
        Lbd:
            r8 = move-exception
            r1 = r0
        Lbf:
            com.google.android.gms.measurement.internal.n4 r2 = r7.f6026a     // Catch: java.lang.Throwable -> Ld4
            com.google.android.gms.measurement.internal.j3 r2 = r2.d()     // Catch: java.lang.Throwable -> Ld4
            com.google.android.gms.measurement.internal.h3 r2 = r2.r()     // Catch: java.lang.Throwable -> Ld4
            java.lang.String r3 = "Error selecting default event parameters"
            r2.b(r3, r8)     // Catch: java.lang.Throwable -> Ld4
            if (r1 == 0) goto Ld3
            r1.close()
        Ld3:
            return r0
        Ld4:
            r8 = move-exception
            r0 = r1
        Ld6:
            if (r0 == 0) goto Ldb
            r0.close()
        Ldb:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.j.S(java.lang.String):android.os.Bundle");
    }

    /* JADX WARN: Not initialized variable reg: 4, insn: 0x0281: MOVE (r3 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]), block:B:56:0x0281 */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x01ce A[Catch: SQLiteException -> 0x0261, all -> 0x0280, TryCatch #0 {all -> 0x0280, blocks: (B:5:0x00db, B:10:0x00e5, B:12:0x0145, B:16:0x014f, B:19:0x0199, B:21:0x01ce, B:24:0x01dd, B:25:0x01d9, B:26:0x01e0, B:28:0x01e8, B:30:0x01ef, B:33:0x020a, B:35:0x0215, B:36:0x0227, B:38:0x0238, B:39:0x0241, B:41:0x024a, B:45:0x0206, B:47:0x0194, B:50:0x0267), top: B:2:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0215 A[Catch: SQLiteException -> 0x0261, all -> 0x0280, TryCatch #0 {all -> 0x0280, blocks: (B:5:0x00db, B:10:0x00e5, B:12:0x0145, B:16:0x014f, B:19:0x0199, B:21:0x01ce, B:24:0x01dd, B:25:0x01d9, B:26:0x01e0, B:28:0x01e8, B:30:0x01ef, B:33:0x020a, B:35:0x0215, B:36:0x0227, B:38:0x0238, B:39:0x0241, B:41:0x024a, B:45:0x0206, B:47:0x0194, B:50:0x0267), top: B:2:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0238 A[Catch: SQLiteException -> 0x0261, all -> 0x0280, TryCatch #0 {all -> 0x0280, blocks: (B:5:0x00db, B:10:0x00e5, B:12:0x0145, B:16:0x014f, B:19:0x0199, B:21:0x01ce, B:24:0x01dd, B:25:0x01d9, B:26:0x01e0, B:28:0x01e8, B:30:0x01ef, B:33:0x020a, B:35:0x0215, B:36:0x0227, B:38:0x0238, B:39:0x0241, B:41:0x024a, B:45:0x0206, B:47:0x0194, B:50:0x0267), top: B:2:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x024a A[Catch: SQLiteException -> 0x0261, all -> 0x0280, TRY_LEAVE, TryCatch #0 {all -> 0x0280, blocks: (B:5:0x00db, B:10:0x00e5, B:12:0x0145, B:16:0x014f, B:19:0x0199, B:21:0x01ce, B:24:0x01dd, B:25:0x01d9, B:26:0x01e0, B:28:0x01e8, B:30:0x01ef, B:33:0x020a, B:35:0x0215, B:36:0x0227, B:38:0x0238, B:39:0x0241, B:41:0x024a, B:45:0x0206, B:47:0x0194, B:50:0x0267), top: B:2:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0206 A[Catch: SQLiteException -> 0x0261, all -> 0x0280, TryCatch #0 {all -> 0x0280, blocks: (B:5:0x00db, B:10:0x00e5, B:12:0x0145, B:16:0x014f, B:19:0x0199, B:21:0x01ce, B:24:0x01dd, B:25:0x01d9, B:26:0x01e0, B:28:0x01e8, B:30:0x01ef, B:33:0x020a, B:35:0x0215, B:36:0x0227, B:38:0x0238, B:39:0x0241, B:41:0x024a, B:45:0x0206, B:47:0x0194, B:50:0x0267), top: B:2:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0194 A[Catch: SQLiteException -> 0x0261, all -> 0x0280, TryCatch #0 {all -> 0x0280, blocks: (B:5:0x00db, B:10:0x00e5, B:12:0x0145, B:16:0x014f, B:19:0x0199, B:21:0x01ce, B:24:0x01dd, B:25:0x01d9, B:26:0x01e0, B:28:0x01e8, B:30:0x01ef, B:33:0x020a, B:35:0x0215, B:36:0x0227, B:38:0x0238, B:39:0x0241, B:41:0x024a, B:45:0x0206, B:47:0x0194, B:50:0x0267), top: B:2:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0284  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.measurement.internal.u4 T(java.lang.String r25) {
        /*
            Method dump skipped, instructions count: 648
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.j.T(java.lang.String):com.google.android.gms.measurement.internal.u4");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0150  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.measurement.internal.c U(java.lang.String r37, java.lang.String r38) {
        /*
            Method dump skipped, instructions count: 340
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.j.U(java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.c");
    }

    public final h V(long j10, String str, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        return W(j10, str, 1L, false, false, z12, false, z14);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x013b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.measurement.internal.h W(long r24, java.lang.String r26, long r27, boolean r29, boolean r30, boolean r31, boolean r32, boolean r33) {
        /*
            Method dump skipped, instructions count: 319
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.j.W(long, java.lang.String, long, boolean, boolean, boolean, boolean, boolean):com.google.android.gms.measurement.internal.h");
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x0133  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.measurement.internal.p X(java.lang.String r30, java.lang.String r31) {
        /*
            Method dump skipped, instructions count: 311
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.j.X(java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.p");
    }

    /* JADX WARN: Not initialized variable reg: 3, insn: 0x00a1: MOVE (r2 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]), block:B:27:0x00a1 */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.measurement.internal.b9 Z(java.lang.String r15, java.lang.String r16) {
        /*
            r14 = this;
            r1 = r14
            com.google.android.gms.common.internal.s.g(r15)
            com.google.android.gms.common.internal.s.g(r16)
            r14.h()
            r14.i()
            r2 = 0
            android.database.sqlite.SQLiteDatabase r3 = r14.R()     // Catch: java.lang.Throwable -> L77 android.database.sqlite.SQLiteException -> L79
            r0 = 3
            java.lang.String[] r5 = new java.lang.String[r0]     // Catch: java.lang.Throwable -> L77 android.database.sqlite.SQLiteException -> L79
            java.lang.String r0 = "set_timestamp"
            r11 = 0
            r5[r11] = r0     // Catch: java.lang.Throwable -> L77 android.database.sqlite.SQLiteException -> L79
            java.lang.String r0 = "value"
            r12 = 1
            r5[r12] = r0     // Catch: java.lang.Throwable -> L77 android.database.sqlite.SQLiteException -> L79
            java.lang.String r0 = "origin"
            r13 = 2
            r5[r13] = r0     // Catch: java.lang.Throwable -> L77 android.database.sqlite.SQLiteException -> L79
            java.lang.String[] r7 = new java.lang.String[]{r15, r16}     // Catch: java.lang.Throwable -> L77 android.database.sqlite.SQLiteException -> L79
            java.lang.String r4 = "user_attributes"
            java.lang.String r6 = "app_id=? and name=?"
            r8 = 0
            r9 = 0
            r10 = 0
            android.database.Cursor r3 = r3.query(r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L77 android.database.sqlite.SQLiteException -> L79
            boolean r0 = r3.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L75 java.lang.Throwable -> La0
            if (r0 != 0) goto L3d
            r3.close()
            return r2
        L3d:
            long r8 = r3.getLong(r11)     // Catch: android.database.sqlite.SQLiteException -> L75 java.lang.Throwable -> La0
            java.lang.Object r10 = r14.a0(r3, r12)     // Catch: android.database.sqlite.SQLiteException -> L75 java.lang.Throwable -> La0
            if (r10 != 0) goto L4b
            r3.close()
            return r2
        L4b:
            java.lang.String r6 = r3.getString(r13)     // Catch: android.database.sqlite.SQLiteException -> L75 java.lang.Throwable -> La0
            com.google.android.gms.measurement.internal.b9 r0 = new com.google.android.gms.measurement.internal.b9     // Catch: android.database.sqlite.SQLiteException -> L75 java.lang.Throwable -> La0
            r4 = r0
            r5 = r15
            r7 = r16
            r4.<init>(r5, r6, r7, r8, r10)     // Catch: android.database.sqlite.SQLiteException -> L75 java.lang.Throwable -> La0
            boolean r4 = r3.moveToNext()     // Catch: android.database.sqlite.SQLiteException -> L75 java.lang.Throwable -> La0
            if (r4 == 0) goto L71
            com.google.android.gms.measurement.internal.n4 r4 = r1.f6026a     // Catch: android.database.sqlite.SQLiteException -> L75 java.lang.Throwable -> La0
            com.google.android.gms.measurement.internal.j3 r4 = r4.d()     // Catch: android.database.sqlite.SQLiteException -> L75 java.lang.Throwable -> La0
            com.google.android.gms.measurement.internal.h3 r4 = r4.r()     // Catch: android.database.sqlite.SQLiteException -> L75 java.lang.Throwable -> La0
            java.lang.String r5 = "Got multiple records for user property, expected one. appId"
            java.lang.Object r6 = com.google.android.gms.measurement.internal.j3.z(r15)     // Catch: android.database.sqlite.SQLiteException -> L75 java.lang.Throwable -> La0
            r4.b(r5, r6)     // Catch: android.database.sqlite.SQLiteException -> L75 java.lang.Throwable -> La0
        L71:
            r3.close()
            return r0
        L75:
            r0 = move-exception
            goto L7b
        L77:
            r0 = move-exception
            goto La2
        L79:
            r0 = move-exception
            r3 = r2
        L7b:
            com.google.android.gms.measurement.internal.n4 r4 = r1.f6026a     // Catch: java.lang.Throwable -> La0
            com.google.android.gms.measurement.internal.j3 r4 = r4.d()     // Catch: java.lang.Throwable -> La0
            com.google.android.gms.measurement.internal.h3 r4 = r4.r()     // Catch: java.lang.Throwable -> La0
            java.lang.String r5 = "Error querying user property. appId"
            java.lang.Object r6 = com.google.android.gms.measurement.internal.j3.z(r15)     // Catch: java.lang.Throwable -> La0
            com.google.android.gms.measurement.internal.n4 r7 = r1.f6026a     // Catch: java.lang.Throwable -> La0
            com.google.android.gms.measurement.internal.e3 r7 = r7.D()     // Catch: java.lang.Throwable -> La0
            r8 = r16
            java.lang.String r7 = r7.s(r8)     // Catch: java.lang.Throwable -> La0
            r4.d(r5, r6, r7, r0)     // Catch: java.lang.Throwable -> La0
            if (r3 == 0) goto L9f
            r3.close()
        L9f:
            return r2
        La0:
            r0 = move-exception
            r2 = r3
        La2:
            if (r2 == 0) goto La7
            r2.close()
        La7:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.j.Z(java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.b9");
    }

    final Object a0(Cursor cursor, int i10) {
        int type = cursor.getType(i10);
        if (type == 0) {
            this.f6026a.d().r().a("Loaded invalid null value from database");
            return null;
        }
        if (type == 1) {
            return Long.valueOf(cursor.getLong(i10));
        }
        if (type == 2) {
            return Double.valueOf(cursor.getDouble(i10));
        }
        if (type == 3) {
            return cursor.getString(i10);
        }
        if (type != 4) {
            this.f6026a.d().r().b("Loaded invalid unknown value type, ignoring it", Integer.valueOf(type));
            return null;
        }
        this.f6026a.d().r().a("Loaded invalid blob type value, ignoring it");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0040  */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String b0() {
        /*
            r6 = this;
            android.database.sqlite.SQLiteDatabase r0 = r6.R()
            r1 = 0
            java.lang.String r2 = "select app_id from queue order by has_realtime desc, rowid asc limit 1;"
            android.database.Cursor r0 = r0.rawQuery(r2, r1)     // Catch: java.lang.Throwable -> L20 android.database.sqlite.SQLiteException -> L22
            boolean r2 = r0.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L1e java.lang.Throwable -> L3a
            if (r2 == 0) goto L1a
            r2 = 0
            java.lang.String r1 = r0.getString(r2)     // Catch: android.database.sqlite.SQLiteException -> L1e java.lang.Throwable -> L3a
            r0.close()
            return r1
        L1a:
            r0.close()
            return r1
        L1e:
            r2 = move-exception
            goto L25
        L20:
            r0 = move-exception
            goto L3e
        L22:
            r0 = move-exception
            r2 = r0
            r0 = r1
        L25:
            com.google.android.gms.measurement.internal.n4 r3 = r6.f6026a     // Catch: java.lang.Throwable -> L3a
            com.google.android.gms.measurement.internal.j3 r3 = r3.d()     // Catch: java.lang.Throwable -> L3a
            com.google.android.gms.measurement.internal.h3 r3 = r3.r()     // Catch: java.lang.Throwable -> L3a
            java.lang.String r4 = "Database error getting next bundle app id"
            r3.b(r4, r2)     // Catch: java.lang.Throwable -> L3a
            if (r0 == 0) goto L39
            r0.close()
        L39:
            return r1
        L3a:
            r1 = move-exception
            r5 = r1
            r1 = r0
            r0 = r5
        L3e:
            if (r1 == 0) goto L43
            r1.close()
        L43:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.j.b0():java.lang.String");
    }

    public final List c0(String str, String str2, String str3) {
        com.google.android.gms.common.internal.s.g(str);
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

    /* JADX WARN: Code restructure failed: missing block: B:21:0x008f, code lost:
    
        r3 = r41.f6026a.d().r();
        r41.f6026a.z();
        r3.b("Read more than the max allowed conditional properties, ignoring extra", 1000);
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x018b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List d0(java.lang.String r42, java.lang.String[] r43) {
        /*
            Method dump skipped, instructions count: 399
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.j.d0(java.lang.String, java.lang.String[]):java.util.List");
    }

    public final List e0(String str) {
        com.google.android.gms.common.internal.s.g(str);
        h();
        i();
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            try {
                SQLiteDatabase R = R();
                String[] strArr = {"name", FirebaseAnalytics.Param.ORIGIN, "set_timestamp", FirebaseAnalytics.Param.VALUE};
                this.f6026a.z();
                cursor = R.query("user_attributes", strArr, "app_id=?", new String[]{str}, null, null, "rowid", "1000");
                if (!cursor.moveToFirst()) {
                    cursor.close();
                    return arrayList;
                }
                do {
                    String string = cursor.getString(0);
                    String string2 = cursor.getString(1);
                    if (string2 == null) {
                        string2 = "";
                    }
                    String str2 = string2;
                    long j10 = cursor.getLong(2);
                    Object a02 = a0(cursor, 3);
                    if (a02 == null) {
                        this.f6026a.d().r().b("Read invalid user property value, ignoring it. appId", j3.z(str));
                    } else {
                        arrayList.add(new b9(str, str2, string, j10, a02));
                    }
                } while (cursor.moveToNext());
                cursor.close();
                return arrayList;
            } catch (SQLiteException e10) {
                this.f6026a.d().r().c("Error querying user properties. appId", j3.z(str), e10);
                List emptyList = Collections.emptyList();
                if (cursor != null) {
                    cursor.close();
                }
                return emptyList;
            }
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00ad, code lost:
    
        r3 = r19.f6026a.d().r();
        r19.f6026a.z();
        r3.b("Read more than the max allowed user properties, ignoring excess", 1000);
     */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x013a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List f0(java.lang.String r20, java.lang.String r21, java.lang.String r22) {
        /*
            Method dump skipped, instructions count: 318
            To view this dump change 'Code comments level' option to 'DEBUG'
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

    final void i0(List list) {
        h();
        i();
        com.google.android.gms.common.internal.s.k(list);
        com.google.android.gms.common.internal.s.m(list.size());
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
            if (L(sb4.toString(), null) > 0) {
                this.f6026a.d().w().a("The number of upload retries exceeds the limit. Will remain unchanged.");
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
                this.f6026a.d().r().b("Error incrementing retry count. error", e10);
            }
        }
    }

    final void j0() {
        h();
        i();
        if (w()) {
            long a10 = this.f6246b.d0().f6586g.a();
            long a11 = this.f6026a.e().a();
            long abs = Math.abs(a11 - a10);
            this.f6026a.z();
            if (abs > ((Long) y2.f6694z.a(null)).longValue()) {
                this.f6246b.d0().f6586g.b(a11);
                h();
                i();
                if (w()) {
                    SQLiteDatabase R = R();
                    String valueOf = String.valueOf(this.f6026a.e().currentTimeMillis());
                    this.f6026a.z();
                    int delete = R.delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[]{valueOf, String.valueOf(g.i())});
                    if (delete > 0) {
                        this.f6026a.d().v().b("Deleted stale rows. rowsDeleted", Integer.valueOf(delete));
                    }
                }
            }
        }
    }

    @Override // com.google.android.gms.measurement.internal.n8
    protected final boolean l() {
        return false;
    }

    public final void m(String str, String str2) {
        com.google.android.gms.common.internal.s.g(str);
        com.google.android.gms.common.internal.s.g(str2);
        h();
        i();
        try {
            R().delete("user_attributes", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e10) {
            this.f6026a.d().r().d("Error deleting user property. appId", j3.z(str), this.f6026a.D().s(str2), e10);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0381, code lost:
    
        i();
        h();
        com.google.android.gms.common.internal.s.g(r25);
        r0 = R();
        r3 = r17;
        r0.delete("property_filters", r3, new java.lang.String[]{r4, java.lang.String.valueOf(r9)});
        r0.delete("event_filters", r3, new java.lang.String[]{r4, java.lang.String.valueOf(r9)});
        r17 = r3;
        r4 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x025e, code lost:
    
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0242, code lost:
    
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01e8, code lost:
    
        r0 = r24.f6026a.d().w();
        r8 = com.google.android.gms.measurement.internal.j3.z(r25);
        r10 = java.lang.Integer.valueOf(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0200, code lost:
    
        if (r11.zzp() == false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0202, code lost:
    
        r20 = java.lang.Integer.valueOf(r11.zzb());
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x020f, code lost:
    
        r0.d("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", r8, r10, java.lang.String.valueOf(r20));
        r22 = r4;
        r4 = r25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x020d, code lost:
    
        r20 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x02a4, code lost:
    
        r22 = r4;
        r4 = r25;
        r0 = r0.zzh().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x02b4, code lost:
    
        if (r0.hasNext() == false) goto L164;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x02b6, code lost:
    
        r3 = r0.next();
        i();
        h();
        com.google.android.gms.common.internal.s.g(r25);
        com.google.android.gms.common.internal.s.k(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x02d0, code lost:
    
        if (android.text.TextUtils.isEmpty(r3.zze()) == false) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x02ff, code lost:
    
        r10 = r3.zzbs();
        r11 = new android.content.ContentValues();
        r11.put("app_id", r4);
        r11.put("audience_id", java.lang.Integer.valueOf(r9));
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0316, code lost:
    
        if (r3.zzj() == false) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0318, code lost:
    
        r14 = java.lang.Integer.valueOf(r3.zza());
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0322, code lost:
    
        r11.put("filter_id", r14);
        r23 = r0;
        r11.put("property_name", r3.zze());
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0334, code lost:
    
        if (r3.zzk() == false) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0336, code lost:
    
        r0 = java.lang.Boolean.valueOf(r3.zzi());
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0340, code lost:
    
        r11.put("session_scoped", r0);
        r11.put(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0354, code lost:
    
        if (R().insertWithOnConflict("property_filters", null, r11, 5) != (-1)) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x036a, code lost:
    
        r0 = r23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0356, code lost:
    
        r24.f6026a.d().r().b("Failed to insert property filter (got -1). appId", com.google.android.gms.measurement.internal.j3.z(r25));
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x036e, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x036f, code lost:
    
        r3 = r24.f6026a.d().r();
        r7 = "Error storing property filter. appId";
        r8 = com.google.android.gms.measurement.internal.j3.z(r25);
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x033f, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0321, code lost:
    
        r14 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x02d2, code lost:
    
        r0 = r24.f6026a.d().w();
        r8 = com.google.android.gms.measurement.internal.j3.z(r25);
        r10 = java.lang.Integer.valueOf(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x02ea, code lost:
    
        if (r3.zzj() == false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x02ec, code lost:
    
        r3 = java.lang.Integer.valueOf(r3.zza());
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x02f6, code lost:
    
        r0.d("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", r8, r10, java.lang.String.valueOf(r3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x02f5, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x03b8, code lost:
    
        r4 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0181, code lost:
    
        r0.c(r7, r8, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0185, code lost:
    
        r10 = r0.zzh().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0191, code lost:
    
        if (r10.hasNext() == false) goto L161;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x019d, code lost:
    
        if (r10.next().zzj() != false) goto L176;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x019f, code lost:
    
        r0 = r24.f6026a.d().w();
        r7 = "Property filter with no ID. Audience definition ignored. appId, audienceId";
        r8 = com.google.android.gms.measurement.internal.j3.z(r25);
        r9 = java.lang.Integer.valueOf(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01b4, code lost:
    
        r10 = r0.zzg().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01ca, code lost:
    
        if (r10.hasNext() == false) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01cc, code lost:
    
        r11 = r10.next();
        i();
        h();
        com.google.android.gms.common.internal.s.g(r25);
        com.google.android.gms.common.internal.s.k(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01e6, code lost:
    
        if (android.text.TextUtils.isEmpty(r11.zzg()) == false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x021c, code lost:
    
        r14 = r11.zzbs();
        r3 = new android.content.ContentValues();
        r22 = r4;
        r4 = r25;
        r3.put("app_id", r4);
        r3.put("audience_id", java.lang.Integer.valueOf(r9));
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0237, code lost:
    
        if (r11.zzp() == false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0239, code lost:
    
        r8 = java.lang.Integer.valueOf(r11.zzb());
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0243, code lost:
    
        r3.put("filter_id", r8);
        r3.put("event_name", r11.zzg());
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0253, code lost:
    
        if (r11.zzq() == false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0255, code lost:
    
        r8 = java.lang.Boolean.valueOf(r11.zzn());
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x025f, code lost:
    
        r3.put("session_scoped", r8);
        r3.put(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0273, code lost:
    
        if (R().insertWithOnConflict("event_filters", null, r3, 5) != (-1)) goto L179;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0275, code lost:
    
        r24.f6026a.d().r().b("Failed to insert event filter (got -1). appId", com.google.android.gms.measurement.internal.j3.z(r25));
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0288, code lost:
    
        r4 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x028e, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x028f, code lost:
    
        r3 = r24.f6026a.d().r();
        r7 = "Error storing event filter. appId";
        r8 = com.google.android.gms.measurement.internal.j3.z(r25);
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x029f, code lost:
    
        r3.c(r7, r8, r0);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final void n(java.lang.String r25, java.util.List r26) {
        /*
            Method dump skipped, instructions count: 1210
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.j.n(java.lang.String, java.util.List):void");
    }

    public final void o() {
        i();
        R().setTransactionSuccessful();
    }

    public final void p(u4 u4Var) {
        com.google.android.gms.common.internal.s.k(u4Var);
        h();
        i();
        String e02 = u4Var.e0();
        com.google.android.gms.common.internal.s.k(e02);
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
                this.f6026a.d().w().b("Safelisted events should not be an empty list. appId", e02);
            } else {
                contentValues.put("safelisted_events", TextUtils.join(",", c10));
            }
        }
        zzoq.zzc();
        if (this.f6026a.z().B(e02, y2.f6655f0)) {
            contentValues.put("ga_app_id", u4Var.j0());
        }
        try {
            SQLiteDatabase R = R();
            if (R.update("apps", contentValues, "app_id = ?", new String[]{e02}) == 0 && R.insertWithOnConflict("apps", null, contentValues, 5) == -1) {
                this.f6026a.d().r().b("Failed to insert/update app (got -1). appId", j3.z(e02));
            }
        } catch (SQLiteException e10) {
            this.f6026a.d().r().c("Error storing app. appId", j3.z(e02), e10);
        }
    }

    public final void q(p pVar) {
        com.google.android.gms.common.internal.s.k(pVar);
        h();
        i();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", pVar.f6334a);
        contentValues.put("name", pVar.f6335b);
        contentValues.put("lifetime_count", Long.valueOf(pVar.f6336c));
        contentValues.put("current_bundle_count", Long.valueOf(pVar.f6337d));
        contentValues.put("last_fire_timestamp", Long.valueOf(pVar.f6339f));
        contentValues.put("last_bundled_timestamp", Long.valueOf(pVar.f6340g));
        contentValues.put("last_bundled_day", pVar.f6341h);
        contentValues.put("last_sampled_complex_event_id", pVar.f6342i);
        contentValues.put("last_sampling_rate", pVar.f6343j);
        contentValues.put("current_session_count", Long.valueOf(pVar.f6338e));
        Boolean bool = pVar.f6344k;
        contentValues.put("last_exempt_from_sampling", (bool == null || !bool.booleanValue()) ? null : 1L);
        try {
            if (R().insertWithOnConflict("events", null, contentValues, 5) == -1) {
                this.f6026a.d().r().b("Failed to insert/update event aggregates (got -1). appId", j3.z(pVar.f6334a));
            }
        } catch (SQLiteException e10) {
            this.f6026a.d().r().c("Error storing event aggregates. appId", j3.z(pVar.f6334a), e10);
        }
    }

    public final void r(String str, byte[] bArr, String str2) {
        com.google.android.gms.common.internal.s.g(str);
        h();
        i();
        ContentValues contentValues = new ContentValues();
        contentValues.put("remote_config", bArr);
        contentValues.put("config_last_modified_time", str2);
        try {
            if (R().update("apps", contentValues, "app_id = ?", new String[]{str}) == 0) {
                this.f6026a.d().r().b("Failed to update remote config (got 0). appId", j3.z(str));
            }
        } catch (SQLiteException e10) {
            this.f6026a.d().r().c("Error storing remote config. appId", j3.z(str), e10);
        }
    }

    public final boolean s() {
        return L("select count(1) > 0 from raw_events", null) != 0;
    }

    public final boolean t() {
        return L("select count(1) > 0 from queue where has_realtime = 1", null) != 0;
    }

    public final boolean u() {
        return L("select count(1) > 0 from raw_events where realtime = 1", null) != 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0047, code lost:
    
        if (r2 > (com.google.android.gms.measurement.internal.g.i() + r0)) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean v(com.google.android.gms.internal.measurement.zzfy r8, boolean r9) {
        /*
            Method dump skipped, instructions count: 293
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.j.v(com.google.android.gms.internal.measurement.zzfy, boolean):boolean");
    }

    protected final boolean w() {
        Context c10 = this.f6026a.c();
        this.f6026a.z();
        return c10.getDatabasePath("google_app_measurement.db").exists();
    }

    public final boolean x(String str, Long l10, long j10, zzfo zzfoVar) {
        h();
        i();
        com.google.android.gms.common.internal.s.k(zzfoVar);
        com.google.android.gms.common.internal.s.g(str);
        com.google.android.gms.common.internal.s.k(l10);
        byte[] zzbs = zzfoVar.zzbs();
        this.f6026a.d().v().c("Saving complex main event, appId, data size", this.f6026a.D().q(str), Integer.valueOf(zzbs.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("event_id", l10);
        contentValues.put("children_to_process", Long.valueOf(j10));
        contentValues.put("main_event", zzbs);
        try {
            if (R().insertWithOnConflict("main_event_params", null, contentValues, 5) != -1) {
                return true;
            }
            this.f6026a.d().r().b("Failed to insert complex main event (got -1). appId", j3.z(str));
            return false;
        } catch (SQLiteException e10) {
            this.f6026a.d().r().c("Error storing complex main event. appId", j3.z(str), e10);
            return false;
        }
    }

    public final boolean y(c cVar) {
        com.google.android.gms.common.internal.s.k(cVar);
        h();
        i();
        String str = cVar.f5905e;
        com.google.android.gms.common.internal.s.k(str);
        if (Z(str, cVar.f5907g.f6721f) == null) {
            long L = L("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[]{str});
            this.f6026a.z();
            if (L >= 1000) {
                return false;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put(FirebaseAnalytics.Param.ORIGIN, cVar.f5906f);
        contentValues.put("name", cVar.f5907g.f6721f);
        J(contentValues, FirebaseAnalytics.Param.VALUE, com.google.android.gms.common.internal.s.k(cVar.f5907g.U()));
        contentValues.put("active", Boolean.valueOf(cVar.f5909i));
        contentValues.put("trigger_event_name", cVar.f5910j);
        contentValues.put("trigger_timeout", Long.valueOf(cVar.f5912l));
        contentValues.put("timed_out_event", this.f6026a.N().c0(cVar.f5911k));
        contentValues.put("creation_timestamp", Long.valueOf(cVar.f5908h));
        contentValues.put("triggered_event", this.f6026a.N().c0(cVar.f5913m));
        contentValues.put("triggered_timestamp", Long.valueOf(cVar.f5907g.f6722g));
        contentValues.put("time_to_live", Long.valueOf(cVar.f5914n));
        contentValues.put("expired_event", this.f6026a.N().c0(cVar.f5915o));
        try {
            if (R().insertWithOnConflict("conditional_properties", null, contentValues, 5) != -1) {
                return true;
            }
            this.f6026a.d().r().b("Failed to insert/update conditional user property (got -1)", j3.z(str));
            return true;
        } catch (SQLiteException e10) {
            this.f6026a.d().r().c("Error storing conditional user property", j3.z(str), e10);
            return true;
        }
    }

    public final boolean z(b9 b9Var) {
        com.google.android.gms.common.internal.s.k(b9Var);
        h();
        i();
        if (Z(b9Var.f5900a, b9Var.f5902c) == null) {
            if (d9.W(b9Var.f5902c)) {
                if (L("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new String[]{b9Var.f5900a}) >= this.f6026a.z().p(b9Var.f5900a, y2.H, 25, 100)) {
                    return false;
                }
            } else if (!"_npa".equals(b9Var.f5902c)) {
                long L = L("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[]{b9Var.f5900a, b9Var.f5901b});
                this.f6026a.z();
                if (L >= 25) {
                    return false;
                }
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", b9Var.f5900a);
        contentValues.put(FirebaseAnalytics.Param.ORIGIN, b9Var.f5901b);
        contentValues.put("name", b9Var.f5902c);
        contentValues.put("set_timestamp", Long.valueOf(b9Var.f5903d));
        J(contentValues, FirebaseAnalytics.Param.VALUE, b9Var.f5904e);
        try {
            if (R().insertWithOnConflict("user_attributes", null, contentValues, 5) != -1) {
                return true;
            }
            this.f6026a.d().r().b("Failed to insert/update user property (got -1). appId", j3.z(b9Var.f5900a));
            return true;
        } catch (SQLiteException e10) {
            this.f6026a.d().r().c("Error storing user property. appId", j3.z(b9Var.f5900a), e10);
            return true;
        }
    }
}