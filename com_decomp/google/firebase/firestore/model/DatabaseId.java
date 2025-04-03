package com.google.firebase.firestore.model;

import com.google.firebase.firestore.util.Assert;

public final class DatabaseId implements Comparable<DatabaseId> {
    public static final String DEFAULT_DATABASE_ID = "(default)";
    private final String databaseId;
    private final String projectId;

    private DatabaseId(String str, String str2) {
        this.projectId = str;
        this.databaseId = str2;
    }

    public static DatabaseId forDatabase(String str, String str2) {
        return new DatabaseId(str, str2);
    }

    public static DatabaseId forProject(String str) {
        return forDatabase(str, DEFAULT_DATABASE_ID);
    }

    public static DatabaseId fromName(String str) {
        ResourcePath fromString = ResourcePath.fromString(str);
        Assert.hardAssert(fromString.length() > 3 && fromString.getSegment(0).equals("projects") && fromString.getSegment(2).equals("databases"), "Tried to parse an invalid resource name: %s", fromString);
        return new DatabaseId(fromString.getSegment(1), fromString.getSegment(3));
    }

    public int compareTo(DatabaseId databaseId2) {
        int compareTo = this.projectId.compareTo(databaseId2.projectId);
        return compareTo != 0 ? compareTo : this.databaseId.compareTo(databaseId2.databaseId);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || DatabaseId.class != obj.getClass()) {
            return false;
        }
        DatabaseId databaseId2 = (DatabaseId) obj;
        return this.projectId.equals(databaseId2.projectId) && this.databaseId.equals(databaseId2.databaseId);
    }

    public String getDatabaseId() {
        return this.databaseId;
    }

    public String getProjectId() {
        return this.projectId;
    }

    public int hashCode() {
        return (this.projectId.hashCode() * 31) + this.databaseId.hashCode();
    }

    public String toString() {
        return "DatabaseId(" + this.projectId + ", " + this.databaseId + ")";
    }
}
