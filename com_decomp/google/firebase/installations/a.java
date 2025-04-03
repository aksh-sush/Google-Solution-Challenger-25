package com.google.firebase.installations;

import com.google.firebase.installations.InstallationTokenResult;

final class a extends InstallationTokenResult {

    /* renamed from: a  reason: collision with root package name */
    private final String f8311a;

    /* renamed from: b  reason: collision with root package name */
    private final long f8312b;

    /* renamed from: c  reason: collision with root package name */
    private final long f8313c;

    static final class b extends InstallationTokenResult.Builder {

        /* renamed from: a  reason: collision with root package name */
        private String f8314a;

        /* renamed from: b  reason: collision with root package name */
        private Long f8315b;

        /* renamed from: c  reason: collision with root package name */
        private Long f8316c;

        b() {
        }

        private b(InstallationTokenResult installationTokenResult) {
            this.f8314a = installationTokenResult.getToken();
            this.f8315b = Long.valueOf(installationTokenResult.getTokenExpirationTimestamp());
            this.f8316c = Long.valueOf(installationTokenResult.getTokenCreationTimestamp());
        }

        public InstallationTokenResult build() {
            String str = "";
            if (this.f8314a == null) {
                str = str + " token";
            }
            if (this.f8315b == null) {
                str = str + " tokenExpirationTimestamp";
            }
            if (this.f8316c == null) {
                str = str + " tokenCreationTimestamp";
            }
            if (str.isEmpty()) {
                return new a(this.f8314a, this.f8315b.longValue(), this.f8316c.longValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        public InstallationTokenResult.Builder setToken(String str) {
            if (str != null) {
                this.f8314a = str;
                return this;
            }
            throw new NullPointerException("Null token");
        }

        public InstallationTokenResult.Builder setTokenCreationTimestamp(long j10) {
            this.f8316c = Long.valueOf(j10);
            return this;
        }

        public InstallationTokenResult.Builder setTokenExpirationTimestamp(long j10) {
            this.f8315b = Long.valueOf(j10);
            return this;
        }
    }

    private a(String str, long j10, long j11) {
        this.f8311a = str;
        this.f8312b = j10;
        this.f8313c = j11;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InstallationTokenResult)) {
            return false;
        }
        InstallationTokenResult installationTokenResult = (InstallationTokenResult) obj;
        return this.f8311a.equals(installationTokenResult.getToken()) && this.f8312b == installationTokenResult.getTokenExpirationTimestamp() && this.f8313c == installationTokenResult.getTokenCreationTimestamp();
    }

    public String getToken() {
        return this.f8311a;
    }

    public long getTokenCreationTimestamp() {
        return this.f8313c;
    }

    public long getTokenExpirationTimestamp() {
        return this.f8312b;
    }

    public int hashCode() {
        long j10 = this.f8312b;
        long j11 = this.f8313c;
        return ((((this.f8311a.hashCode() ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)));
    }

    public InstallationTokenResult.Builder toBuilder() {
        return new b(this);
    }

    public String toString() {
        return "InstallationTokenResult{token=" + this.f8311a + ", tokenExpirationTimestamp=" + this.f8312b + ", tokenCreationTimestamp=" + this.f8313c + "}";
    }
}
