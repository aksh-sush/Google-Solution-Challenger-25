package com.google.firebase.firestore.auth;

import com.google.firebase.firestore.util.Listener;
import n4.i;

public abstract class CredentialsProvider {
    public abstract i getToken();

    public abstract void invalidateToken();

    public abstract void removeChangeListener();

    public abstract void setChangeListener(Listener<User> listener);
}
