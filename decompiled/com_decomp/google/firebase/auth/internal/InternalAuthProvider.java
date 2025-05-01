package com.google.firebase.auth.internal;

import com.google.firebase.annotations.DeferredApi;
import com.google.firebase.internal.InternalTokenProvider;
import n4.i;

public interface InternalAuthProvider extends InternalTokenProvider {
    @DeferredApi
    void addIdTokenListener(IdTokenListener idTokenListener);

    i getAccessToken(boolean z10);

    String getUid();

    void removeIdTokenListener(IdTokenListener idTokenListener);
}
