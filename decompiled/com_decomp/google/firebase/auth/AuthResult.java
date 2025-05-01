package com.google.firebase.auth;

import s3.d;

public interface AuthResult extends d {
    AdditionalUserInfo getAdditionalUserInfo();

    AuthCredential getCredential();

    FirebaseUser getUser();
}
