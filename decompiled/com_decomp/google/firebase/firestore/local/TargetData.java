package com.google.firebase.firestore.local;

import com.google.firebase.firestore.core.Target;
import com.google.firebase.firestore.model.SnapshotVersion;
import com.google.firebase.firestore.util.Preconditions;
import com.google.protobuf.j;

public final class TargetData {
    private final SnapshotVersion lastLimboFreeSnapshotVersion;
    private final QueryPurpose purpose;
    private final j resumeToken;
    private final long sequenceNumber;
    private final SnapshotVersion snapshotVersion;
    private final Target target;
    private final int targetId;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public TargetData(com.google.firebase.firestore.core.Target r10, int r11, long r12, com.google.firebase.firestore.local.QueryPurpose r14) {
        /*
            r9 = this;
            com.google.firebase.firestore.model.SnapshotVersion r7 = com.google.firebase.firestore.model.SnapshotVersion.NONE
            com.google.protobuf.j r8 = com.google.firebase.firestore.remote.WatchStream.EMPTY_RESUME_TOKEN
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = r12
            r5 = r14
            r6 = r7
            r0.<init>(r1, r2, r3, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.firestore.local.TargetData.<init>(com.google.firebase.firestore.core.Target, int, long, com.google.firebase.firestore.local.QueryPurpose):void");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || TargetData.class != obj.getClass()) {
            return false;
        }
        TargetData targetData = (TargetData) obj;
        return this.target.equals(targetData.target) && this.targetId == targetData.targetId && this.sequenceNumber == targetData.sequenceNumber && this.purpose.equals(targetData.purpose) && this.snapshotVersion.equals(targetData.snapshotVersion) && this.lastLimboFreeSnapshotVersion.equals(targetData.lastLimboFreeSnapshotVersion) && this.resumeToken.equals(targetData.resumeToken);
    }

    public SnapshotVersion getLastLimboFreeSnapshotVersion() {
        return this.lastLimboFreeSnapshotVersion;
    }

    public QueryPurpose getPurpose() {
        return this.purpose;
    }

    public j getResumeToken() {
        return this.resumeToken;
    }

    public long getSequenceNumber() {
        return this.sequenceNumber;
    }

    public SnapshotVersion getSnapshotVersion() {
        return this.snapshotVersion;
    }

    public Target getTarget() {
        return this.target;
    }

    public int getTargetId() {
        return this.targetId;
    }

    public int hashCode() {
        return (((((((((((this.target.hashCode() * 31) + this.targetId) * 31) + ((int) this.sequenceNumber)) * 31) + this.purpose.hashCode()) * 31) + this.snapshotVersion.hashCode()) * 31) + this.lastLimboFreeSnapshotVersion.hashCode()) * 31) + this.resumeToken.hashCode();
    }

    public String toString() {
        return "TargetData{target=" + this.target + ", targetId=" + this.targetId + ", sequenceNumber=" + this.sequenceNumber + ", purpose=" + this.purpose + ", snapshotVersion=" + this.snapshotVersion + ", lastLimboFreeSnapshotVersion=" + this.lastLimboFreeSnapshotVersion + ", resumeToken=" + this.resumeToken + '}';
    }

    public TargetData withLastLimboFreeSnapshotVersion(SnapshotVersion snapshotVersion2) {
        return new TargetData(this.target, this.targetId, this.sequenceNumber, this.purpose, this.snapshotVersion, snapshotVersion2, this.resumeToken);
    }

    public TargetData withResumeToken(j jVar, SnapshotVersion snapshotVersion2) {
        return new TargetData(this.target, this.targetId, this.sequenceNumber, this.purpose, snapshotVersion2, this.lastLimboFreeSnapshotVersion, jVar);
    }

    public TargetData withSequenceNumber(long j10) {
        return new TargetData(this.target, this.targetId, j10, this.purpose, this.snapshotVersion, this.lastLimboFreeSnapshotVersion, this.resumeToken);
    }

    TargetData(Target target2, int i10, long j10, QueryPurpose queryPurpose, SnapshotVersion snapshotVersion2, SnapshotVersion snapshotVersion3, j jVar) {
        this.target = (Target) Preconditions.checkNotNull(target2);
        this.targetId = i10;
        this.sequenceNumber = j10;
        this.lastLimboFreeSnapshotVersion = snapshotVersion3;
        this.purpose = queryPurpose;
        this.snapshotVersion = (SnapshotVersion) Preconditions.checkNotNull(snapshotVersion2);
        this.resumeToken = (j) Preconditions.checkNotNull(jVar);
    }
}
