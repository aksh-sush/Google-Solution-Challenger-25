package com.google.firebase.auth;

import s3.d;

public interface FirebaseUserMetadata extends d {
    long getCreationTimestamp();

    long getLastSignInTimestamp();
}
