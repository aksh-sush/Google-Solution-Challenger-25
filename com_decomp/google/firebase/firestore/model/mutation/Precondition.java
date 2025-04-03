package com.google.firebase.firestore.model.mutation;

import com.google.firebase.firestore.model.MutableDocument;
import com.google.firebase.firestore.model.SnapshotVersion;
import com.google.firebase.firestore.util.Assert;

public final class Precondition {
    public static final Precondition NONE = new Precondition((SnapshotVersion) null, (Boolean) null);
    private final Boolean exists;
    private final SnapshotVersion updateTime;

    private Precondition(SnapshotVersion snapshotVersion, Boolean bool) {
        Assert.hardAssert(snapshotVersion == null || bool == null, "Precondition can specify \"exists\" or \"updateTime\" but not both", new Object[0]);
        this.updateTime = snapshotVersion;
        this.exists = bool;
    }

    public static Precondition exists(boolean z10) {
        return new Precondition((SnapshotVersion) null, Boolean.valueOf(z10));
    }

    public static Precondition updateTime(SnapshotVersion snapshotVersion) {
        return new Precondition(snapshotVersion, (Boolean) null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Precondition.class != obj.getClass()) {
            return false;
        }
        Precondition precondition = (Precondition) obj;
        SnapshotVersion snapshotVersion = this.updateTime;
        if (snapshotVersion == null ? precondition.updateTime != null : !snapshotVersion.equals(precondition.updateTime)) {
            return false;
        }
        Boolean bool = this.exists;
        Boolean bool2 = precondition.exists;
        return bool != null ? bool.equals(bool2) : bool2 == null;
    }

    public Boolean getExists() {
        return this.exists;
    }

    public SnapshotVersion getUpdateTime() {
        return this.updateTime;
    }

    public int hashCode() {
        SnapshotVersion snapshotVersion = this.updateTime;
        int i10 = 0;
        int hashCode = (snapshotVersion != null ? snapshotVersion.hashCode() : 0) * 31;
        Boolean bool = this.exists;
        if (bool != null) {
            i10 = bool.hashCode();
        }
        return hashCode + i10;
    }

    public boolean isNone() {
        return this.updateTime == null && this.exists == null;
    }

    public boolean isValidFor(MutableDocument mutableDocument) {
        if (this.updateTime != null) {
            return mutableDocument.isFoundDocument() && mutableDocument.getVersion().equals(this.updateTime);
        }
        Boolean bool = this.exists;
        if (bool != null) {
            return bool.booleanValue() == mutableDocument.isFoundDocument();
        }
        Assert.hardAssert(isNone(), "Precondition should be empty", new Object[0]);
        return true;
    }

    public String toString() {
        StringBuilder sb2;
        Object obj;
        if (isNone()) {
            return "Precondition{<none>}";
        }
        if (this.updateTime != null) {
            sb2 = new StringBuilder();
            sb2.append("Precondition{updateTime=");
            obj = this.updateTime;
        } else if (this.exists != null) {
            sb2 = new StringBuilder();
            sb2.append("Precondition{exists=");
            obj = this.exists;
        } else {
            throw Assert.fail("Invalid Precondition", new Object[0]);
        }
        sb2.append(obj);
        sb2.append("}");
        return sb2.toString();
    }
}
