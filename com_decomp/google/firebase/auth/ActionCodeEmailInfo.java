package com.google.firebase.auth;

public abstract class ActionCodeEmailInfo extends ActionCodeInfo {
    public String getEmail() {
        return super.getEmail();
    }

    public abstract String getPreviousEmail();
}
