package com.google.firebase.installations;

import com.google.auto.value.AutoValue;
import com.google.firebase.installations.a;

@AutoValue
public abstract class InstallationTokenResult {

    @AutoValue.Builder
    public static abstract class Builder {
        public abstract InstallationTokenResult build();

        public abstract Builder setToken(String str);

        public abstract Builder setTokenCreationTimestamp(long j10);

        public abstract Builder setTokenExpirationTimestamp(long j10);
    }

    public static Builder builder() {
        return new a.b();
    }

    public abstract String getToken();

    public abstract long getTokenCreationTimestamp();

    public abstract long getTokenExpirationTimestamp();

    public abstract Builder toBuilder();
}
