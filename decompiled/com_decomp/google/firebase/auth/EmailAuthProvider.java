package com.google.firebase.auth;

import com.google.android.gms.common.internal.s;

public class EmailAuthProvider {
    public static final String EMAIL_LINK_SIGN_IN_METHOD = "emailLink";
    public static final String EMAIL_PASSWORD_SIGN_IN_METHOD = "password";
    public static final String PROVIDER_ID = "password";

    private EmailAuthProvider() {
    }

    public static AuthCredential getCredential(String str, String str2) {
        s.g(str);
        s.g(str2);
        return new EmailAuthCredential(str, str2, (String) null, (String) null, false);
    }

    public static AuthCredential getCredentialWithLink(String str, String str2) {
        if (EmailAuthCredential.zzi(str2)) {
            return new EmailAuthCredential(str, (String) null, str2, (String) null, false);
        }
        throw new IllegalArgumentException("Given link is not a valid email link. Please use FirebaseAuth#isSignInWithEmailLink(String) to determine this before calling this function");
    }
}
