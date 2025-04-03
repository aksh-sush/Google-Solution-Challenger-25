package com.google.firebase.auth;

import java.util.Map;
import s3.d;

public interface AdditionalUserInfo extends d {
    Map<String, Object> getProfile();

    String getProviderId();

    String getUsername();

    boolean isNewUser();
}
