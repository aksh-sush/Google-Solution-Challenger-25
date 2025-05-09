package com.google.firebase.firestore.auth;

public final class User {
    public static final User UNAUTHENTICATED = new User((String) null);
    private final String uid;

    public User(String str) {
        this.uid = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || User.class != obj.getClass()) {
            return false;
        }
        String str = this.uid;
        String str2 = ((User) obj).uid;
        return str != null ? str.equals(str2) : str2 == null;
    }

    public String getUid() {
        return this.uid;
    }

    public int hashCode() {
        String str = this.uid;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public boolean isAuthenticated() {
        return this.uid != null;
    }

    public String toString() {
        return "User(uid:" + this.uid + ")";
    }
}
