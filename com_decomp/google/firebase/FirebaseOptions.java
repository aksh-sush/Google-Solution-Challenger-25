package com.google.firebase;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.common.internal.v;
import com.google.firebase.dynamiclinks.DynamicLink;
import y3.p;

public final class FirebaseOptions {
    private static final String API_KEY_RESOURCE_NAME = "google_api_key";
    private static final String APP_ID_RESOURCE_NAME = "google_app_id";
    private static final String DATABASE_URL_RESOURCE_NAME = "firebase_database_url";
    private static final String GA_TRACKING_ID_RESOURCE_NAME = "ga_trackingId";
    private static final String GCM_SENDER_ID_RESOURCE_NAME = "gcm_defaultSenderId";
    private static final String PROJECT_ID_RESOURCE_NAME = "project_id";
    private static final String STORAGE_BUCKET_RESOURCE_NAME = "google_storage_bucket";
    /* access modifiers changed from: private */
    public final String apiKey;
    /* access modifiers changed from: private */
    public final String applicationId;
    /* access modifiers changed from: private */
    public final String databaseUrl;
    /* access modifiers changed from: private */
    public final String gaTrackingId;
    /* access modifiers changed from: private */
    public final String gcmSenderId;
    /* access modifiers changed from: private */
    public final String projectId;
    /* access modifiers changed from: private */
    public final String storageBucket;

    public static final class Builder {
        private String apiKey;
        private String applicationId;
        private String databaseUrl;
        private String gaTrackingId;
        private String gcmSenderId;
        private String projectId;
        private String storageBucket;

        public Builder() {
        }

        public Builder(FirebaseOptions firebaseOptions) {
            this.applicationId = firebaseOptions.applicationId;
            this.apiKey = firebaseOptions.apiKey;
            this.databaseUrl = firebaseOptions.databaseUrl;
            this.gaTrackingId = firebaseOptions.gaTrackingId;
            this.gcmSenderId = firebaseOptions.gcmSenderId;
            this.storageBucket = firebaseOptions.storageBucket;
            this.projectId = firebaseOptions.projectId;
        }

        public FirebaseOptions build() {
            return new FirebaseOptions(this.applicationId, this.apiKey, this.databaseUrl, this.gaTrackingId, this.gcmSenderId, this.storageBucket, this.projectId);
        }

        public Builder setApiKey(String str) {
            this.apiKey = s.h(str, "ApiKey must be set.");
            return this;
        }

        public Builder setApplicationId(String str) {
            this.applicationId = s.h(str, "ApplicationId must be set.");
            return this;
        }

        public Builder setDatabaseUrl(String str) {
            this.databaseUrl = str;
            return this;
        }

        public Builder setGaTrackingId(String str) {
            this.gaTrackingId = str;
            return this;
        }

        public Builder setGcmSenderId(String str) {
            this.gcmSenderId = str;
            return this;
        }

        public Builder setProjectId(String str) {
            this.projectId = str;
            return this;
        }

        public Builder setStorageBucket(String str) {
            this.storageBucket = str;
            return this;
        }
    }

    private FirebaseOptions(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        s.o(!p.b(str), "ApplicationId must be set.");
        this.applicationId = str;
        this.apiKey = str2;
        this.databaseUrl = str3;
        this.gaTrackingId = str4;
        this.gcmSenderId = str5;
        this.storageBucket = str6;
        this.projectId = str7;
    }

    public static FirebaseOptions fromResource(Context context) {
        v vVar = new v(context);
        String a10 = vVar.a(APP_ID_RESOURCE_NAME);
        if (TextUtils.isEmpty(a10)) {
            return null;
        }
        return new FirebaseOptions(a10, vVar.a(API_KEY_RESOURCE_NAME), vVar.a(DATABASE_URL_RESOURCE_NAME), vVar.a(GA_TRACKING_ID_RESOURCE_NAME), vVar.a(GCM_SENDER_ID_RESOURCE_NAME), vVar.a(STORAGE_BUCKET_RESOURCE_NAME), vVar.a(PROJECT_ID_RESOURCE_NAME));
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof FirebaseOptions)) {
            return false;
        }
        FirebaseOptions firebaseOptions = (FirebaseOptions) obj;
        return q.b(this.applicationId, firebaseOptions.applicationId) && q.b(this.apiKey, firebaseOptions.apiKey) && q.b(this.databaseUrl, firebaseOptions.databaseUrl) && q.b(this.gaTrackingId, firebaseOptions.gaTrackingId) && q.b(this.gcmSenderId, firebaseOptions.gcmSenderId) && q.b(this.storageBucket, firebaseOptions.storageBucket) && q.b(this.projectId, firebaseOptions.projectId);
    }

    public String getApiKey() {
        return this.apiKey;
    }

    public String getApplicationId() {
        return this.applicationId;
    }

    public String getDatabaseUrl() {
        return this.databaseUrl;
    }

    public String getGaTrackingId() {
        return this.gaTrackingId;
    }

    public String getGcmSenderId() {
        return this.gcmSenderId;
    }

    public String getProjectId() {
        return this.projectId;
    }

    public String getStorageBucket() {
        return this.storageBucket;
    }

    public int hashCode() {
        return q.c(this.applicationId, this.apiKey, this.databaseUrl, this.gaTrackingId, this.gcmSenderId, this.storageBucket, this.projectId);
    }

    public String toString() {
        return q.d(this).a("applicationId", this.applicationId).a(DynamicLink.Builder.KEY_API_KEY, this.apiKey).a("databaseUrl", this.databaseUrl).a("gcmSenderId", this.gcmSenderId).a("storageBucket", this.storageBucket).a("projectId", this.projectId).toString();
    }
}
