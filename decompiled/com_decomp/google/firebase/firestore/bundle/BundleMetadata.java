package com.google.firebase.firestore.bundle;

import com.google.firebase.firestore.model.SnapshotVersion;

public class BundleMetadata implements BundleElement {
    private final String bundleId;
    private final SnapshotVersion createTime;
    private final int schemaVersion;
    private final long totalBytes;
    private final int totalDocuments;

    public BundleMetadata(String str, int i10, SnapshotVersion snapshotVersion, int i11, long j10) {
        this.bundleId = str;
        this.schemaVersion = i10;
        this.createTime = snapshotVersion;
        this.totalDocuments = i11;
        this.totalBytes = j10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BundleMetadata bundleMetadata = (BundleMetadata) obj;
        if (this.schemaVersion == bundleMetadata.schemaVersion && this.totalDocuments == bundleMetadata.totalDocuments && this.totalBytes == bundleMetadata.totalBytes && this.bundleId.equals(bundleMetadata.bundleId)) {
            return this.createTime.equals(bundleMetadata.createTime);
        }
        return false;
    }

    public String getBundleId() {
        return this.bundleId;
    }

    public SnapshotVersion getCreateTime() {
        return this.createTime;
    }

    public int getSchemaVersion() {
        return this.schemaVersion;
    }

    public long getTotalBytes() {
        return this.totalBytes;
    }

    public int getTotalDocuments() {
        return this.totalDocuments;
    }

    public int hashCode() {
        long j10 = this.totalBytes;
        return (((((((this.bundleId.hashCode() * 31) + this.schemaVersion) * 31) + this.totalDocuments) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + this.createTime.hashCode();
    }
}
