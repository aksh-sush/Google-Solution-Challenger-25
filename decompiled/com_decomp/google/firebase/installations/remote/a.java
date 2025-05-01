package com.google.firebase.installations.remote;

import com.google.firebase.installations.remote.InstallationResponse;

final class a extends InstallationResponse {

    /* renamed from: a  reason: collision with root package name */
    private final String f8342a;

    /* renamed from: b  reason: collision with root package name */
    private final String f8343b;

    /* renamed from: c  reason: collision with root package name */
    private final String f8344c;

    /* renamed from: d  reason: collision with root package name */
    private final TokenResult f8345d;

    /* renamed from: e  reason: collision with root package name */
    private final InstallationResponse.ResponseCode f8346e;

    static final class b extends InstallationResponse.Builder {

        /* renamed from: a  reason: collision with root package name */
        private String f8347a;

        /* renamed from: b  reason: collision with root package name */
        private String f8348b;

        /* renamed from: c  reason: collision with root package name */
        private String f8349c;

        /* renamed from: d  reason: collision with root package name */
        private TokenResult f8350d;

        /* renamed from: e  reason: collision with root package name */
        private InstallationResponse.ResponseCode f8351e;

        b() {
        }

        private b(InstallationResponse installationResponse) {
            this.f8347a = installationResponse.getUri();
            this.f8348b = installationResponse.getFid();
            this.f8349c = installationResponse.getRefreshToken();
            this.f8350d = installationResponse.getAuthToken();
            this.f8351e = installationResponse.getResponseCode();
        }

        public InstallationResponse build() {
            return new a(this.f8347a, this.f8348b, this.f8349c, this.f8350d, this.f8351e);
        }

        public InstallationResponse.Builder setAuthToken(TokenResult tokenResult) {
            this.f8350d = tokenResult;
            return this;
        }

        public InstallationResponse.Builder setFid(String str) {
            this.f8348b = str;
            return this;
        }

        public InstallationResponse.Builder setRefreshToken(String str) {
            this.f8349c = str;
            return this;
        }

        public InstallationResponse.Builder setResponseCode(InstallationResponse.ResponseCode responseCode) {
            this.f8351e = responseCode;
            return this;
        }

        public InstallationResponse.Builder setUri(String str) {
            this.f8347a = str;
            return this;
        }
    }

    private a(String str, String str2, String str3, TokenResult tokenResult, InstallationResponse.ResponseCode responseCode) {
        this.f8342a = str;
        this.f8343b = str2;
        this.f8344c = str3;
        this.f8345d = tokenResult;
        this.f8346e = responseCode;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InstallationResponse)) {
            return false;
        }
        InstallationResponse installationResponse = (InstallationResponse) obj;
        String str = this.f8342a;
        if (str != null ? str.equals(installationResponse.getUri()) : installationResponse.getUri() == null) {
            String str2 = this.f8343b;
            if (str2 != null ? str2.equals(installationResponse.getFid()) : installationResponse.getFid() == null) {
                String str3 = this.f8344c;
                if (str3 != null ? str3.equals(installationResponse.getRefreshToken()) : installationResponse.getRefreshToken() == null) {
                    TokenResult tokenResult = this.f8345d;
                    if (tokenResult != null ? tokenResult.equals(installationResponse.getAuthToken()) : installationResponse.getAuthToken() == null) {
                        InstallationResponse.ResponseCode responseCode = this.f8346e;
                        InstallationResponse.ResponseCode responseCode2 = installationResponse.getResponseCode();
                        if (responseCode == null) {
                            if (responseCode2 == null) {
                                return true;
                            }
                        } else if (responseCode.equals(responseCode2)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public TokenResult getAuthToken() {
        return this.f8345d;
    }

    public String getFid() {
        return this.f8343b;
    }

    public String getRefreshToken() {
        return this.f8344c;
    }

    public InstallationResponse.ResponseCode getResponseCode() {
        return this.f8346e;
    }

    public String getUri() {
        return this.f8342a;
    }

    public int hashCode() {
        String str = this.f8342a;
        int i10 = 0;
        int hashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.f8343b;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f8344c;
        int hashCode3 = (hashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        TokenResult tokenResult = this.f8345d;
        int hashCode4 = (hashCode3 ^ (tokenResult == null ? 0 : tokenResult.hashCode())) * 1000003;
        InstallationResponse.ResponseCode responseCode = this.f8346e;
        if (responseCode != null) {
            i10 = responseCode.hashCode();
        }
        return hashCode4 ^ i10;
    }

    public InstallationResponse.Builder toBuilder() {
        return new b(this);
    }

    public String toString() {
        return "InstallationResponse{uri=" + this.f8342a + ", fid=" + this.f8343b + ", refreshToken=" + this.f8344c + ", authToken=" + this.f8345d + ", responseCode=" + this.f8346e + "}";
    }
}
