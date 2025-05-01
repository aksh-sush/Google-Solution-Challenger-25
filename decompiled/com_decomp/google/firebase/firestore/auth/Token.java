package com.google.firebase.firestore.auth;

public final class Token {
    private final User user;
    private final String value;

    public Token(String str, User user2) {
        this.value = str;
        this.user = user2;
    }

    public User getUser() {
        return this.user;
    }

    public String getValue() {
        return this.value;
    }
}
