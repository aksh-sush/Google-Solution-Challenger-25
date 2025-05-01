package com.google.firebase.firestore.local;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import android.text.TextUtils;
import com.google.firebase.firestore.local.SQLitePersistence;
import com.google.firebase.firestore.local.a0;
import com.google.firebase.firestore.model.ResourcePath;
import com.google.firebase.firestore.proto.Target;
import com.google.firebase.firestore.util.Assert;
import com.google.firebase.firestore.util.Logger;
import com.google.firebase.firestore.util.Preconditions;
import com.google.protobuf.d0;
import java.util.ArrayList;
import java.util.List;

class c2 {

    /* renamed from: a  reason: collision with root package name */
    private final SQLiteDatabase f7964a;

    /* renamed from: b  reason: collision with root package name */
    private final LocalSerializer f7965b;

    c2(SQLiteDatabase sQLiteDatabase, LocalSerializer localSerializer) {
        this.f7964a = sQLiteDatabase;
        this.f7965b = localSerializer;
    }

    private void A() {
        Long l10 = (Long) new SQLitePersistence.d(this.f7964a, "SELECT highest_listen_sequence_number FROM target_globals LIMIT 1").d(new y1());
        Assert.hardAssert(l10 != null, "Missing highest sequence number", new Object[0]);
        long longValue = l10.longValue();
        SQLiteStatement compileStatement = this.f7964a.compileStatement("INSERT INTO target_documents (target_id, path, sequence_number) VALUES (0, ?, ?)");
        SQLitePersistence.d b10 = new SQLitePersistence.d(this.f7964a, "SELECT RD.path FROM remote_documents AS RD WHERE NOT EXISTS (SELECT TD.path FROM target_documents AS TD WHERE RD.path = TD.path AND TD.target_id = 0) LIMIT ?").b(100);
        boolean[] zArr = new boolean[1];
        do {
            zArr[0] = false;
            b10.e(new z1(zArr, compileStatement, longValue));
        } while (zArr[0]);
    }

    private void B() {
        if (!(DatabaseUtils.queryNumEntries(this.f7964a, "target_globals") == 1)) {
            this.f7964a.execSQL("INSERT INTO target_globals (highest_target_id, highest_listen_sequence_number, last_remote_snapshot_version_seconds, last_remote_snapshot_version_nanos) VALUES (?, ?, ?, ?)", new String[]{"0", "0", "0", "0"});
        }
    }

    private boolean D() {
        boolean Z = Z("remote_documents", "read_time_seconds");
        boolean Z2 = Z("remote_documents", "read_time_nanos");
        Assert.hardAssert(Z == Z2, "Table contained just one of read_time_seconds or read_time_nanos", new Object[0]);
        return Z && Z2;
    }

    private void E(String[] strArr, Runnable runnable) {
        StringBuilder sb2;
        String str;
        String str2 = "[" + TextUtils.join(", ", strArr) + "]";
        boolean z10 = false;
        for (int i10 = 0; i10 < strArr.length; i10++) {
            String str3 = strArr[i10];
            boolean a02 = a0(str3);
            if (i10 == 0) {
                z10 = a02;
            } else if (a02 != z10) {
                String str4 = "Expected all of " + str2 + " to either exist or not, but ";
                if (z10) {
                    sb2.append(str4);
                    sb2.append(strArr[0]);
                    sb2.append(" exists and ");
                    sb2.append(str3);
                    str = " does not";
                } else {
                    sb2 = new StringBuilder();
                    sb2.append(str4);
                    sb2.append(strArr[0]);
                    sb2.append(" does not exist and ");
                    sb2.append(str3);
                    str = " does";
                }
                sb2.append(str);
                throw new IllegalStateException(sb2.toString());
            }
        }
        if (!z10) {
            runnable.run();
            return;
        }
        Logger.debug("SQLiteSchema", "Skipping migration because all of " + str2 + " already exist", new Object[0]);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void F() {
        this.f7964a.execSQL("CREATE TABLE bundles (bundle_id TEXT PRIMARY KEY, create_time_seconds INTEGER, create_time_nanos INTEGER, schema_version INTEGER, total_documents INTEGER, total_bytes INTEGER)");
        this.f7964a.execSQL("CREATE TABLE named_queries (name TEXT PRIMARY KEY, read_time_seconds INTEGER, read_time_nanos INTEGER, bundled_query_proto BLOB)");
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void G() {
        this.f7964a.execSQL("CREATE TABLE collection_index (uid TEXT, collection_path TEXT, field_path TEXT, field_value_type INTEGER, field_value_1, field_value_2, document_id TEXT, PRIMARY KEY (uid, collection_path, field_path, field_value_type, field_value_1, field_value_2, document_id))");
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void H() {
        this.f7964a.execSQL("CREATE TABLE mutation_queues (uid TEXT PRIMARY KEY, last_acknowledged_batch_id INTEGER, last_stream_token BLOB)");
        this.f7964a.execSQL("CREATE TABLE mutations (uid TEXT, batch_id INTEGER, mutations BLOB, PRIMARY KEY (uid, batch_id))");
        this.f7964a.execSQL("CREATE TABLE document_mutations (uid TEXT, path TEXT, batch_id INTEGER, PRIMARY KEY (uid, path, batch_id))");
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void I() {
        this.f7964a.execSQL("CREATE TABLE remote_documents (path TEXT PRIMARY KEY, contents BLOB)");
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void J() {
        this.f7964a.execSQL("CREATE TABLE targets (target_id INTEGER PRIMARY KEY, canonical_id TEXT, snapshot_version_seconds INTEGER, snapshot_version_nanos INTEGER, resume_token BLOB, last_listen_sequence_number INTEGER,target_proto BLOB)");
        this.f7964a.execSQL("CREATE INDEX query_targets ON targets (canonical_id, target_id)");
        this.f7964a.execSQL("CREATE TABLE target_globals (highest_target_id INTEGER, highest_listen_sequence_number INTEGER, last_remote_snapshot_version_seconds INTEGER, last_remote_snapshot_version_nanos INTEGER)");
        this.f7964a.execSQL("CREATE TABLE target_documents (target_id INTEGER, path TEXT, PRIMARY KEY (target_id, path))");
        this.f7964a.execSQL("CREATE INDEX document_targets ON target_documents (path, target_id)");
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void K(a0.a aVar, SQLiteStatement sQLiteStatement, ResourcePath resourcePath) {
        if (aVar.a(resourcePath)) {
            String lastSegment = resourcePath.getLastSegment();
            sQLiteStatement.clearBindings();
            sQLiteStatement.bindString(1, lastSegment);
            sQLiteStatement.bindString(2, d.c((ResourcePath) resourcePath.popLast()));
            sQLiteStatement.execute();
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void N() {
        this.f7964a.execSQL("CREATE TABLE collection_parents (collection_id TEXT, parent TEXT, PRIMARY KEY(collection_id, parent))");
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void O(Cursor cursor) {
        int i10 = cursor.getInt(0);
        try {
            this.f7964a.execSQL("UPDATE targets SET target_proto = ? WHERE target_id = ?", new Object[]{((Target) ((Target.Builder) Target.parseFrom(cursor.getBlob(1)).toBuilder()).clearLastLimboFreeSnapshotVersion().build()).toByteArray(), Integer.valueOf(i10)});
        } catch (d0 unused) {
            throw Assert.fail("Failed to decode Query data for target %s", Integer.valueOf(i10));
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void Q(boolean[] zArr, SQLiteStatement sQLiteStatement, long j10, Cursor cursor) {
        boolean z10 = true;
        zArr[0] = true;
        sQLiteStatement.clearBindings();
        sQLiteStatement.bindString(1, cursor.getString(0));
        sQLiteStatement.bindLong(2, j10);
        if (sQLiteStatement.executeInsert() == -1) {
            z10 = false;
        }
        Assert.hardAssert(z10, "Failed to insert a sentinel row", new Object[0]);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void R(String str, Cursor cursor) {
        V(str, cursor.getInt(0));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void S(Cursor cursor) {
        String string = cursor.getString(0);
        long j10 = cursor.getLong(1);
        new SQLitePersistence.d(this.f7964a, "SELECT batch_id FROM mutations WHERE uid = ? AND batch_id <= ?").b(string, Long.valueOf(j10)).e(new s1(this, string));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void T(Cursor cursor) {
        int i10 = cursor.getInt(0);
        try {
            String canonicalId = this.f7965b.decodeTargetData(Target.parseFrom(cursor.getBlob(1))).getTarget().getCanonicalId();
            this.f7964a.execSQL("UPDATE targets SET canonical_id  = ? WHERE target_id = ?", new Object[]{canonicalId, Integer.valueOf(i10)});
        } catch (d0 unused) {
            throw Assert.fail("Failed to decode Query data for target %s", Integer.valueOf(i10));
        }
    }

    private void U() {
        new SQLitePersistence.d(this.f7964a, "SELECT uid, last_acknowledged_batch_id FROM mutation_queues").e(new v1(this));
    }

    private void V(String str, int i10) {
        SQLiteStatement compileStatement = this.f7964a.compileStatement("DELETE FROM mutations WHERE uid = ? AND batch_id = ?");
        compileStatement.bindString(1, str);
        compileStatement.bindLong(2, (long) i10);
        Assert.hardAssert(compileStatement.executeUpdateDelete() != 0, "Mutatiohn batch (%s, %d) did not exist", str, Integer.valueOf(i10));
        this.f7964a.execSQL("DELETE FROM document_mutations WHERE uid = ? AND batch_id = ?", new Object[]{str, Integer.valueOf(i10)});
    }

    private void W() {
        new SQLitePersistence.d(this.f7964a, "SELECT target_id, target_proto FROM targets").e(new t1(this));
    }

    private boolean Z(String str, String str2) {
        return C(str).indexOf(str2) != -1;
    }

    private boolean a0(String str) {
        return !new SQLitePersistence.d(this.f7964a, "SELECT 1=1 FROM sqlite_master WHERE tbl_name = ?").b(str).f();
    }

    private void p() {
        this.f7964a.execSQL("ALTER TABLE remote_documents ADD COLUMN read_time_seconds INTEGER");
        this.f7964a.execSQL("ALTER TABLE remote_documents ADD COLUMN read_time_nanos INTEGER");
    }

    private void q() {
        if (!Z("target_documents", "sequence_number")) {
            this.f7964a.execSQL("ALTER TABLE target_documents ADD COLUMN sequence_number INTEGER");
        }
    }

    private void r() {
        if (!Z("target_globals", "target_count")) {
            this.f7964a.execSQL("ALTER TABLE target_globals ADD COLUMN target_count INTEGER");
        }
        long queryNumEntries = DatabaseUtils.queryNumEntries(this.f7964a, "targets");
        ContentValues contentValues = new ContentValues();
        contentValues.put("target_count", Long.valueOf(queryNumEntries));
        this.f7964a.update("target_globals", contentValues, (String) null, (String[]) null);
    }

    private void s() {
        E(new String[]{"bundles", "named_queries"}, new w1(this));
    }

    private void t() {
        E(new String[]{"collection_index"}, new b2(this));
    }

    private void u() {
        E(new String[]{"mutation_queues", "mutations", "document_mutations"}, new a2(this));
    }

    private void v() {
        E(new String[]{"remote_documents"}, new u1(this));
    }

    private void w() {
        E(new String[]{"targets", "target_globals", "target_documents"}, new n1(this));
    }

    private void x() {
        E(new String[]{"collection_parents"}, new o1(this));
        p1 p1Var = new p1(new a0.a(), this.f7964a.compileStatement("INSERT OR REPLACE INTO collection_parents (collection_id, parent) VALUES (?, ?)"));
        new SQLitePersistence.d(this.f7964a, "SELECT path FROM remote_documents").e(new q1(p1Var));
        new SQLitePersistence.d(this.f7964a, "SELECT path FROM document_mutations").e(new r1(p1Var));
    }

    private void y() {
        new SQLitePersistence.d(this.f7964a, "SELECT target_id, target_proto FROM targets").e(new x1(this));
    }

    private void z() {
        if (a0("targets")) {
            this.f7964a.execSQL("DROP TABLE targets");
        }
        if (a0("target_globals")) {
            this.f7964a.execSQL("DROP TABLE target_globals");
        }
        if (a0("target_documents")) {
            this.f7964a.execSQL("DROP TABLE target_documents");
        }
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.String[], android.database.Cursor] */
    /* access modifiers changed from: package-private */
    public List C(String str) {
        ArrayList arrayList = new ArrayList();
        ? r12 = 0;
        try {
            SQLiteDatabase sQLiteDatabase = this.f7964a;
            Cursor rawQuery = sQLiteDatabase.rawQuery("PRAGMA table_info(" + str + ")", r12);
            int columnIndex = rawQuery.getColumnIndex("name");
            while (rawQuery.moveToNext()) {
                arrayList.add(rawQuery.getString(columnIndex));
            }
            rawQuery.close();
            return arrayList;
        } catch (Throwable th) {
            if (r12 != 0) {
                r12.close();
            }
            throw th;
        }
    }

    /* access modifiers changed from: package-private */
    public void X(int i10) {
        Y(i10, 12);
    }

    /* access modifiers changed from: package-private */
    public void Y(int i10, int i11) {
        if (i10 < 1 && i11 >= 1) {
            u();
            w();
            v();
        }
        if (i10 < 3 && i11 >= 3 && i10 != 0) {
            z();
            w();
        }
        if (i10 < 4 && i11 >= 4) {
            B();
            r();
        }
        if (i10 < 5 && i11 >= 5) {
            q();
        }
        if (i10 < 6 && i11 >= 6) {
            U();
        }
        if (i10 < 7 && i11 >= 7) {
            A();
        }
        if (i10 < 8 && i11 >= 8) {
            x();
        }
        if (i10 < 9 && i11 >= 9) {
            if (!D()) {
                p();
            } else {
                y();
            }
        }
        if (i10 == 9 && i11 >= 10) {
            y();
        }
        if (i10 < 11 && i11 >= 11) {
            W();
        }
        if (i10 < 12 && i11 >= 12) {
            s();
        }
        if (i10 < 13 && i11 >= 13) {
            Preconditions.checkState(Persistence.INDEXING_SUPPORT_ENABLED);
            t();
        }
    }
}
