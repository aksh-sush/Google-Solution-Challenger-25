package com.google.firebase.firestore.local;

import android.database.Cursor;
import com.google.firebase.Timestamp;
import com.google.firebase.firestore.bundle.BundleMetadata;
import com.google.firebase.firestore.bundle.NamedQuery;
import com.google.firebase.firestore.model.SnapshotVersion;
import com.google.firebase.firestore.util.Assert;
import com.google.protobuf.d0;
import s5.a;

class l0 implements BundleCache {

    /* renamed from: a  reason: collision with root package name */
    private final SQLitePersistence f8042a;

    /* renamed from: b  reason: collision with root package name */
    private final LocalSerializer f8043b;

    l0(SQLitePersistence sQLitePersistence, LocalSerializer localSerializer) {
        this.f8042a = sQLitePersistence;
        this.f8043b = localSerializer;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ BundleMetadata c(String str, Cursor cursor) {
        if (cursor == null) {
            return null;
        }
        return new BundleMetadata(str, cursor.getInt(0), new SnapshotVersion(new Timestamp(cursor.getLong(1), cursor.getInt(2))), cursor.getInt(3), cursor.getLong(4));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ NamedQuery d(String str, Cursor cursor) {
        if (cursor == null) {
            return null;
        }
        try {
            return new NamedQuery(str, this.f8043b.decodeBundledQuery(a.p(cursor.getBlob(2))), new SnapshotVersion(new Timestamp(cursor.getLong(0), cursor.getInt(1))));
        } catch (d0 e10) {
            throw Assert.fail("NamedQuery failed to parse: %s", e10);
        }
    }

    public BundleMetadata getBundleMetadata(String str) {
        return (BundleMetadata) this.f8042a.query("SELECT schema_version, create_time_seconds, create_time_nanos, total_documents,  total_bytes FROM bundles WHERE bundle_id = ?").b(str).d(new j0(str));
    }

    public NamedQuery getNamedQuery(String str) {
        return (NamedQuery) this.f8042a.query("SELECT read_time_seconds, read_time_nanos, bundled_query_proto FROM named_queries WHERE name = ?").b(str).d(new k0(this, str));
    }

    public void saveBundleMetadata(BundleMetadata bundleMetadata) {
        this.f8042a.execute("INSERT OR REPLACE INTO bundles (bundle_id, schema_version, create_time_seconds, create_time_nanos, total_documents, total_bytes) VALUES (?, ?, ?, ?, ?, ?)", bundleMetadata.getBundleId(), Integer.valueOf(bundleMetadata.getSchemaVersion()), Long.valueOf(bundleMetadata.getCreateTime().getTimestamp().getSeconds()), Integer.valueOf(bundleMetadata.getCreateTime().getTimestamp().getNanoseconds()), Integer.valueOf(bundleMetadata.getTotalDocuments()), Long.valueOf(bundleMetadata.getTotalBytes()));
    }

    public void saveNamedQuery(NamedQuery namedQuery) {
        a encodeBundledQuery = this.f8043b.encodeBundledQuery(namedQuery.getBundledQuery());
        this.f8042a.execute("INSERT OR REPLACE INTO named_queries (name, read_time_seconds, read_time_nanos, bundled_query_proto) VALUES (?, ?, ?, ?)", namedQuery.getName(), Long.valueOf(namedQuery.getReadTime().getTimestamp().getSeconds()), Integer.valueOf(namedQuery.getReadTime().getTimestamp().getNanoseconds()), encodeBundledQuery.toByteArray());
    }
}
