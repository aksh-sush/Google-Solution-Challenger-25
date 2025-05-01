package com.google.firebase.dynamiclinks;

import android.content.Intent;
import android.net.Uri;
import com.google.firebase.FirebaseApp;
import com.google.firebase.dynamiclinks.DynamicLink;
import n4.i;

public abstract class FirebaseDynamicLinks {
    public static synchronized FirebaseDynamicLinks getInstance() {
        FirebaseDynamicLinks instance;
        synchronized (FirebaseDynamicLinks.class) {
            instance = getInstance(FirebaseApp.getInstance());
        }
        return instance;
    }

    public abstract DynamicLink.Builder createDynamicLink();

    public abstract i getDynamicLink(Intent intent);

    public abstract i getDynamicLink(Uri uri);

    public static synchronized FirebaseDynamicLinks getInstance(FirebaseApp firebaseApp) {
        FirebaseDynamicLinks firebaseDynamicLinks;
        synchronized (FirebaseDynamicLinks.class) {
            firebaseDynamicLinks = (FirebaseDynamicLinks) firebaseApp.get(FirebaseDynamicLinks.class);
        }
        return firebaseDynamicLinks;
    }
}
