package com.google.firebase.installations;

import com.google.firebase.annotations.DeferredApi;
import com.google.firebase.installations.internal.FidListener;
import com.google.firebase.installations.internal.FidListenerHandle;
import n4.i;

public interface FirebaseInstallationsApi {
    i delete();

    i getId();

    i getToken(boolean z10);

    @DeferredApi
    FidListenerHandle registerFidListener(FidListener fidListener);
}
