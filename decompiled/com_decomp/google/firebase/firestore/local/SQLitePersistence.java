package com.google.firebase.firestore.local;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteProgram;
import android.database.sqlite.SQLiteStatement;
import android.database.sqlite.SQLiteTransactionListener;
import com.google.firebase.firestore.FirebaseFirestoreException;
import com.google.firebase.firestore.auth.User;
import com.google.firebase.firestore.local.LruGarbageCollector;
import com.google.firebase.firestore.model.DatabaseId;
import com.google.firebase.firestore.util.Assert;
import com.google.firebase.firestore.util.Consumer;
import com.google.firebase.firestore.util.FileUtil;
import com.google.firebase.firestore.util.Logger;
import com.google.firebase.firestore.util.Supplier;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class SQLitePersistence extends Persistence {
    private final l0 bundleCache;

    /* renamed from: db  reason: collision with root package name */
    private SQLiteDatabase f7931db;
    private final n0 indexManager;
    private final SQLiteOpenHelper opener;
    /* access modifiers changed from: private */
    public final r0 referenceDelegate;
    private final m1 remoteDocumentCache;
    private final LocalSerializer serializer;
    private boolean started;
    private final i2 targetCache;
    private final SQLiteTransactionListener transactionListener;

    class a implements SQLiteTransactionListener {
        a() {
        }

        public void onBegin() {
            SQLitePersistence.this.referenceDelegate.d();
        }

        public void onCommit() {
            SQLitePersistence.this.referenceDelegate.c();
        }

        public void onRollback() {
        }
    }

    static class b {

        /* renamed from: a  reason: collision with root package name */
        private final SQLitePersistence f7933a;

        /* renamed from: b  reason: collision with root package name */
        private final String f7934b;

        /* renamed from: c  reason: collision with root package name */
        private final String f7935c;

        /* renamed from: d  reason: collision with root package name */
        private final List f7936d;

        /* renamed from: e  reason: collision with root package name */
        private int f7937e = 0;

        /* renamed from: f  reason: collision with root package name */
        private final Iterator f7938f;

        b(SQLitePersistence sQLitePersistence, String str, List list, String str2) {
            this.f7933a = sQLitePersistence;
            this.f7934b = str;
            this.f7936d = Collections.emptyList();
            this.f7935c = str2;
            this.f7938f = list.iterator();
        }

        /* access modifiers changed from: package-private */
        public int a() {
            return this.f7937e;
        }

        /* access modifiers changed from: package-private */
        public boolean b() {
            return this.f7938f.hasNext();
        }

        /* access modifiers changed from: package-private */
        public d c() {
            this.f7937e++;
            ArrayList arrayList = new ArrayList(this.f7936d);
            StringBuilder sb2 = new StringBuilder();
            int i10 = 0;
            while (this.f7938f.hasNext() && i10 < 900 - this.f7936d.size()) {
                if (i10 > 0) {
                    sb2.append(", ");
                }
                sb2.append("?");
                arrayList.add(this.f7938f.next());
                i10++;
            }
            String sb3 = sb2.toString();
            return this.f7933a.query(this.f7934b + sb3 + this.f7935c).b(arrayList.toArray());
        }

        b(SQLitePersistence sQLitePersistence, String str, List list, List list2, String str2) {
            this.f7933a = sQLitePersistence;
            this.f7934b = str;
            this.f7936d = list;
            this.f7935c = str2;
            this.f7938f = list2.iterator();
        }
    }

    private static class c extends SQLiteOpenHelper {

        /* renamed from: e  reason: collision with root package name */
        private final LocalSerializer f7939e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f7940f;

        c(Context context, LocalSerializer localSerializer, String str) {
            super(context, str, (SQLiteDatabase.CursorFactory) null, 12);
            this.f7939e = localSerializer;
        }

        private void a(SQLiteDatabase sQLiteDatabase) {
            if (!this.f7940f) {
                onConfigure(sQLiteDatabase);
            }
        }

        public void onConfigure(SQLiteDatabase sQLiteDatabase) {
            this.f7940f = true;
            sQLiteDatabase.rawQuery("PRAGMA locking_mode = EXCLUSIVE", new String[0]).close();
        }

        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            a(sQLiteDatabase);
            new c2(sQLiteDatabase, this.f7939e).X(0);
        }

        public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
            a(sQLiteDatabase);
        }

        public void onOpen(SQLiteDatabase sQLiteDatabase) {
            a(sQLiteDatabase);
        }

        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
            a(sQLiteDatabase);
            new c2(sQLiteDatabase, this.f7939e).X(i10);
        }
    }

    static class d {

        /* renamed from: a  reason: collision with root package name */
        private final SQLiteDatabase f7941a;

        /* renamed from: b  reason: collision with root package name */
        private final String f7942b;

        /* renamed from: c  reason: collision with root package name */
        private SQLiteDatabase.CursorFactory f7943c;

        d(SQLiteDatabase sQLiteDatabase, String str) {
            this.f7941a = sQLiteDatabase;
            this.f7942b = str;
        }

        private Cursor h() {
            SQLiteDatabase.CursorFactory cursorFactory = this.f7943c;
            return cursorFactory != null ? this.f7941a.rawQueryWithFactory(cursorFactory, this.f7942b, (String[]) null, (String) null) : this.f7941a.rawQuery(this.f7942b, (String[]) null);
        }

        /* access modifiers changed from: package-private */
        public d b(Object... objArr) {
            this.f7943c = new h1(objArr);
            return this;
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Removed duplicated region for block: B:14:0x001d  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int c(com.google.firebase.firestore.util.Consumer r3) {
            /*
                r2 = this;
                android.database.Cursor r0 = r2.h()     // Catch:{ all -> 0x0019 }
                boolean r1 = r0.moveToFirst()     // Catch:{ all -> 0x0017 }
                if (r1 == 0) goto L_0x0012
                r3.accept(r0)     // Catch:{ all -> 0x0017 }
                r0.close()
                r3 = 1
                return r3
            L_0x0012:
                r0.close()
                r3 = 0
                return r3
            L_0x0017:
                r3 = move-exception
                goto L_0x001b
            L_0x0019:
                r3 = move-exception
                r0 = 0
            L_0x001b:
                if (r0 == 0) goto L_0x0020
                r0.close()
            L_0x0020:
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.firestore.local.SQLitePersistence.d.c(com.google.firebase.firestore.util.Consumer):int");
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x001d  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object d(com.google.firebase.firestore.util.Function r4) {
            /*
                r3 = this;
                r0 = 0
                android.database.Cursor r1 = r3.h()     // Catch:{ all -> 0x001a }
                boolean r2 = r1.moveToFirst()     // Catch:{ all -> 0x0017 }
                if (r2 == 0) goto L_0x0013
                java.lang.Object r4 = r4.apply(r1)     // Catch:{ all -> 0x0017 }
                r1.close()
                return r4
            L_0x0013:
                r1.close()
                return r0
            L_0x0017:
                r4 = move-exception
                r0 = r1
                goto L_0x001b
            L_0x001a:
                r4 = move-exception
            L_0x001b:
                if (r0 == 0) goto L_0x0020
                r0.close()
            L_0x0020:
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.firestore.local.SQLitePersistence.d.d(com.google.firebase.firestore.util.Function):java.lang.Object");
        }

        /* access modifiers changed from: package-private */
        public int e(Consumer consumer) {
            Cursor h10 = h();
            int i10 = 0;
            while (h10.moveToNext()) {
                try {
                    i10++;
                    consumer.accept(h10);
                } catch (Throwable th) {
                    th.addSuppressed(th);
                }
            }
            h10.close();
            return i10;
            throw th;
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Removed duplicated region for block: B:10:0x0014  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean f() {
            /*
                r2 = this;
                android.database.Cursor r0 = r2.h()     // Catch:{ all -> 0x0010 }
                boolean r1 = r0.moveToFirst()     // Catch:{ all -> 0x000e }
                r1 = r1 ^ 1
                r0.close()
                return r1
            L_0x000e:
                r1 = move-exception
                goto L_0x0012
            L_0x0010:
                r1 = move-exception
                r0 = 0
            L_0x0012:
                if (r0 == 0) goto L_0x0017
                r0.close()
            L_0x0017:
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.firestore.local.SQLitePersistence.d.f():boolean");
        }
    }

    public SQLitePersistence(Context context, String str, DatabaseId databaseId, LocalSerializer localSerializer, LruGarbageCollector.Params params) {
        this(localSerializer, params, new c(context, localSerializer, databaseName(str, databaseId)));
    }

    /* access modifiers changed from: private */
    public static void bind(SQLiteProgram sQLiteProgram, Object[] objArr) {
        int i10;
        long longValue;
        for (int i11 = 0; i11 < objArr.length; i11++) {
            String str = objArr[i11];
            if (str == null) {
                sQLiteProgram.bindNull(i11 + 1);
            } else if (str instanceof String) {
                sQLiteProgram.bindString(i11 + 1, str);
            } else {
                if (str instanceof Integer) {
                    i10 = i11 + 1;
                    longValue = (long) ((Integer) str).intValue();
                } else if (str instanceof Long) {
                    i10 = i11 + 1;
                    longValue = ((Long) str).longValue();
                } else if (str instanceof Double) {
                    sQLiteProgram.bindDouble(i11 + 1, ((Double) str).doubleValue());
                } else if (str instanceof byte[]) {
                    sQLiteProgram.bindBlob(i11 + 1, (byte[]) str);
                } else {
                    throw Assert.fail("Unknown argument %s of type %s", str, str.getClass());
                }
                sQLiteProgram.bindLong(i10, longValue);
            }
        }
    }

    public static void clearPersistence(Context context, DatabaseId databaseId, String str) {
        String path = context.getDatabasePath(databaseName(str, databaseId)).getPath();
        String str2 = path + "-wal";
        File file = new File(path);
        File file2 = new File(path + "-journal");
        File file3 = new File(str2);
        try {
            FileUtil.delete(file);
            FileUtil.delete(file2);
            FileUtil.delete(file3);
        } catch (IOException e10) {
            throw new FirebaseFirestoreException("Failed to clear persistence." + e10, FirebaseFirestoreException.Code.UNKNOWN);
        }
    }

    public static String databaseName(String str, DatabaseId databaseId) {
        try {
            return "firestore." + URLEncoder.encode(str, "utf-8") + "." + URLEncoder.encode(databaseId.getProjectId(), "utf-8") + "." + URLEncoder.encode(databaseId.getDatabaseId(), "utf-8");
        } catch (UnsupportedEncodingException e10) {
            throw new AssertionError(e10);
        }
    }

    private long getPageCount() {
        return ((Long) query("PRAGMA page_count").d(new g1())).longValue();
    }

    private long getPageSize() {
        return ((Long) query("PRAGMA page_size").d(new f1())).longValue();
    }

    /* access modifiers changed from: package-private */
    public int execute(SQLiteStatement sQLiteStatement, Object... objArr) {
        sQLiteStatement.clearBindings();
        bind(sQLiteStatement, objArr);
        return sQLiteStatement.executeUpdateDelete();
    }

    /* access modifiers changed from: package-private */
    public BundleCache getBundleCache() {
        return this.bundleCache;
    }

    /* access modifiers changed from: package-private */
    public long getByteSize() {
        return getPageCount() * getPageSize();
    }

    /* access modifiers changed from: package-private */
    public IndexManager getIndexManager() {
        return this.indexManager;
    }

    /* access modifiers changed from: package-private */
    public g0 getMutationQueue(User user) {
        return new e1(this, this.serializer, user);
    }

    /* access modifiers changed from: package-private */
    public i0 getRemoteDocumentCache() {
        return this.remoteDocumentCache;
    }

    /* access modifiers changed from: package-private */
    public i2 getTargetCache() {
        return this.targetCache;
    }

    public boolean isStarted() {
        return this.started;
    }

    /* access modifiers changed from: package-private */
    public SQLiteStatement prepare(String str) {
        return this.f7931db.compileStatement(str);
    }

    /* access modifiers changed from: package-private */
    public d query(String str) {
        return new d(this.f7931db, str);
    }

    /* access modifiers changed from: package-private */
    public <T> T runTransaction(String str, Supplier<T> supplier) {
        Logger.debug(Persistence.TAG, "Starting transaction: %s", str);
        this.f7931db.beginTransactionWithListener(this.transactionListener);
        try {
            T t10 = supplier.get();
            this.f7931db.setTransactionSuccessful();
            return t10;
        } finally {
            this.f7931db.endTransaction();
        }
    }

    public void shutdown() {
        Assert.hardAssert(this.started, "SQLitePersistence shutdown without start!", new Object[0]);
        this.started = false;
        this.f7931db.close();
        this.f7931db = null;
    }

    public void start() {
        Assert.hardAssert(!this.started, "SQLitePersistence double-started!", new Object[0]);
        this.started = true;
        try {
            this.f7931db = this.opener.getWritableDatabase();
            this.targetCache.z();
            this.referenceDelegate.s(this.targetCache.p());
        } catch (SQLiteDatabaseLockedException e10) {
            throw new RuntimeException("Failed to gain exclusive lock to the Cloud Firestore client's offline persistence. This generally means you are using Cloud Firestore from multiple processes in your app. Keep in mind that multi-process Android apps execute the code in your Application class in all processes, so you may need to avoid initializing Cloud Firestore in your Application class. If you are intentionally using Cloud Firestore from multiple processes, you can only enable offline persistence (that is, call setPersistenceEnabled(true)) in one of them.", e10);
        }
    }

    public SQLitePersistence(LocalSerializer localSerializer, LruGarbageCollector.Params params, SQLiteOpenHelper sQLiteOpenHelper) {
        this.transactionListener = new a();
        this.opener = sQLiteOpenHelper;
        this.serializer = localSerializer;
        this.targetCache = new i2(this, localSerializer);
        this.indexManager = new n0(this);
        this.bundleCache = new l0(this, localSerializer);
        this.remoteDocumentCache = new m1(this, localSerializer);
        this.referenceDelegate = new r0(this, params);
    }

    /* access modifiers changed from: package-private */
    public void execute(String str, Object... objArr) {
        this.f7931db.execSQL(str, objArr);
    }

    public r0 getReferenceDelegate() {
        return this.referenceDelegate;
    }

    /* access modifiers changed from: package-private */
    public void runTransaction(String str, Runnable runnable) {
        Logger.debug(Persistence.TAG, "Starting transaction: %s", str);
        this.f7931db.beginTransactionWithListener(this.transactionListener);
        try {
            runnable.run();
            this.f7931db.setTransactionSuccessful();
        } finally {
            this.f7931db.endTransaction();
        }
    }
}
