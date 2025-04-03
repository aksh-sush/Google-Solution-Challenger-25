package com.google.firebase.auth;

import s3.a;

public abstract class AuthCredential extends a {
    AuthCredential() {
    }

    public abstract String getProvider();

    public abstract String getSignInMethod();

    public abstract AuthCredential zza();
}
