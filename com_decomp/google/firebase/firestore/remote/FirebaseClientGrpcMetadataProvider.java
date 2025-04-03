package com.google.firebase.firestore.remote;

import com.google.firebase.FirebaseOptions;
import com.google.firebase.heartbeatinfo.HeartBeatInfo;
import com.google.firebase.inject.Provider;
import com.google.firebase.platforminfo.UserAgentPublisher;
import fa.r0;

public class FirebaseClientGrpcMetadataProvider implements GrpcMetadataProvider {
    private static final r0.g GMP_APP_ID_HEADER;
    private static final r0.g HEART_BEAT_HEADER;
    private static final String HEART_BEAT_TAG = "fire-fst";
    private static final r0.g USER_AGENT_HEADER;
    private final FirebaseOptions firebaseOptions;
    private final Provider<HeartBeatInfo> heartBeatInfoProvider;
    private final Provider<UserAgentPublisher> userAgentPublisherProvider;

    static {
        r0.d dVar = r0.f10507d;
        HEART_BEAT_HEADER = r0.g.e("x-firebase-client-log-type", dVar);
        USER_AGENT_HEADER = r0.g.e("x-firebase-client", dVar);
        GMP_APP_ID_HEADER = r0.g.e("x-firebase-gmpid", dVar);
    }

    public FirebaseClientGrpcMetadataProvider(Provider<UserAgentPublisher> provider, Provider<HeartBeatInfo> provider2, FirebaseOptions firebaseOptions2) {
        this.userAgentPublisherProvider = provider;
        this.heartBeatInfoProvider = provider2;
        this.firebaseOptions = firebaseOptions2;
    }

    private void maybeAddGmpAppId(r0 r0Var) {
        FirebaseOptions firebaseOptions2 = this.firebaseOptions;
        if (firebaseOptions2 != null) {
            String applicationId = firebaseOptions2.getApplicationId();
            if (applicationId.length() != 0) {
                r0Var.o(GMP_APP_ID_HEADER, applicationId);
            }
        }
    }

    public void updateMetadata(r0 r0Var) {
        if (this.heartBeatInfoProvider.get() != null && this.userAgentPublisherProvider.get() != null) {
            int code = this.heartBeatInfoProvider.get().getHeartBeatCode(HEART_BEAT_TAG).getCode();
            if (code != 0) {
                r0Var.o(HEART_BEAT_HEADER, Integer.toString(code));
            }
            r0Var.o(USER_AGENT_HEADER, this.userAgentPublisherProvider.get().getUserAgent());
            maybeAddGmpAppId(r0Var);
        }
    }
}
