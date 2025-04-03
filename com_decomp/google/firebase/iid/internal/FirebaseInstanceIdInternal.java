package com.google.firebase.iid.internal;

import n4.i;

public interface FirebaseInstanceIdInternal {

    public interface NewTokenListener {
        void onNewToken(String str);
    }

    void addNewTokenListener(NewTokenListener newTokenListener);

    void deleteToken(String str, String str2);

    String getId();

    String getToken();

    i getTokenTask();
}
