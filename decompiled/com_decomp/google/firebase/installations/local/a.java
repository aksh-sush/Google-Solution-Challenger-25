package com.google.firebase.installations.local;

import com.google.firebase.installations.local.PersistedInstallation;
import com.google.firebase.installations.local.PersistedInstallationEntry;

final class a extends PersistedInstallationEntry {

    /* renamed from: a  reason: collision with root package name */
    private final String f8328a;

    /* renamed from: b  reason: collision with root package name */
    private final PersistedInstallation.RegistrationStatus f8329b;

    /* renamed from: c  reason: collision with root package name */
    private final String f8330c;

    /* renamed from: d  reason: collision with root package name */
    private final String f8331d;

    /* renamed from: e  reason: collision with root package name */
    private final long f8332e;

    /* renamed from: f  reason: collision with root package name */
    private final long f8333f;

    /* renamed from: g  reason: collision with root package name */
    private final String f8334g;

    static final class b extends PersistedInstallationEntry.Builder {

        /* renamed from: a  reason: collision with root package name */
        private String f8335a;

        /* renamed from: b  reason: collision with root package name */
        private PersistedInstallation.RegistrationStatus f8336b;

        /* renamed from: c  reason: collision with root package name */
        private String f8337c;

        /* renamed from: d  reason: collision with root package name */
        private String f8338d;

        /* renamed from: e  reason: collision with root package name */
        private Long f8339e;

        /* renamed from: f  reason: collision with root package name */
        private Long f8340f;

        /* renamed from: g  reason: collision with root package name */
        private String f8341g;

        b() {
        }

        private b(PersistedInstallationEntry persistedInstallationEntry) {
            this.f8335a = persistedInstallationEntry.getFirebaseInstallationId();
            this.f8336b = persistedInstallationEntry.getRegistrationStatus();
            this.f8337c = persistedInstallationEntry.getAuthToken();
            this.f8338d = persistedInstallationEntry.getRefreshToken();
            this.f8339e = Long.valueOf(persistedInstallationEntry.getExpiresInSecs());
            this.f8340f = Long.valueOf(persistedInstallationEntry.getTokenCreationEpochInSecs());
            this.f8341g = persistedInstallationEntry.getFisError();
        }

        public PersistedInstallationEntry build() {
            String str = "";
            if (this.f8336b == null) {
                str = str + " registrationStatus";
            }
            if (this.f8339e == null) {
                str = str + " expiresInSecs";
            }
            if (this.f8340f == null) {
                str = str + " tokenCreationEpochInSecs";
            }
            if (str.isEmpty()) {
                return new a(this.f8335a, this.f8336b, this.f8337c, this.f8338d, this.f8339e.longValue(), this.f8340f.longValue(), this.f8341g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        public PersistedInstallationEntry.Builder setAuthToken(String str) {
            this.f8337c = str;
            return this;
        }

        public PersistedInstallationEntry.Builder setExpiresInSecs(long j10) {
            this.f8339e = Long.valueOf(j10);
            return this;
        }

        public PersistedInstallationEntry.Builder setFirebaseInstallationId(String str) {
            this.f8335a = str;
            return this;
        }

        public PersistedInstallationEntry.Builder setFisError(String str) {
            this.f8341g = str;
            return this;
        }

        public PersistedInstallationEntry.Builder setRefreshToken(String str) {
            this.f8338d = str;
            return this;
        }

        public PersistedInstallationEntry.Builder setRegistrationStatus(PersistedInstallation.RegistrationStatus registrationStatus) {
            if (registrationStatus != null) {
                this.f8336b = registrationStatus;
                return this;
            }
            throw new NullPointerException("Null registrationStatus");
        }

        public PersistedInstallationEntry.Builder setTokenCreationEpochInSecs(long j10) {
            this.f8340f = Long.valueOf(j10);
            return this;
        }
    }

    private a(String str, PersistedInstallation.RegistrationStatus registrationStatus, String str2, String str3, long j10, long j11, String str4) {
        this.f8328a = str;
        this.f8329b = registrationStatus;
        this.f8330c = str2;
        this.f8331d = str3;
        this.f8332e = j10;
        this.f8333f = j11;
        this.f8334g = str4;
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PersistedInstallationEntry)) {
            return false;
        }
        PersistedInstallationEntry persistedInstallationEntry = (PersistedInstallationEntry) obj;
        String str3 = this.f8328a;
        if (str3 != null ? str3.equals(persistedInstallationEntry.getFirebaseInstallationId()) : persistedInstallationEntry.getFirebaseInstallationId() == null) {
            if (this.f8329b.equals(persistedInstallationEntry.getRegistrationStatus()) && ((str = this.f8330c) != null ? str.equals(persistedInstallationEntry.getAuthToken()) : persistedInstallationEntry.getAuthToken() == null) && ((str2 = this.f8331d) != null ? str2.equals(persistedInstallationEntry.getRefreshToken()) : persistedInstallationEntry.getRefreshToken() == null) && this.f8332e == persistedInstallationEntry.getExpiresInSecs() && this.f8333f == persistedInstallationEntry.getTokenCreationEpochInSecs()) {
                String str4 = this.f8334g;
                String fisError = persistedInstallationEntry.getFisError();
                if (str4 == null) {
                    if (fisError == null) {
                        return true;
                    }
                } else if (str4.equals(fisError)) {
                    return true;
                }
            }
        }
        return false;
    }

    public String getAuthToken() {
        return this.f8330c;
    }

    public long getExpiresInSecs() {
        return this.f8332e;
    }

    public String getFirebaseInstallationId() {
        return this.f8328a;
    }

    public String getFisError() {
        return this.f8334g;
    }

    public String getRefreshToken() {
        return this.f8331d;
    }

    public PersistedInstallation.RegistrationStatus getRegistrationStatus() {
        return this.f8329b;
    }

    public long getTokenCreationEpochInSecs() {
        return this.f8333f;
    }

    public int hashCode() {
        String str = this.f8328a;
        int i10 = 0;
        int hashCode = ((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.f8329b.hashCode()) * 1000003;
        String str2 = this.f8330c;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f8331d;
        int hashCode3 = str3 == null ? 0 : str3.hashCode();
        long j10 = this.f8332e;
        long j11 = this.f8333f;
        int i11 = (((((hashCode2 ^ hashCode3) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        String str4 = this.f8334g;
        if (str4 != null) {
            i10 = str4.hashCode();
        }
        return i11 ^ i10;
    }

    public PersistedInstallationEntry.Builder toBuilder() {
        return new b(this);
    }

    public String toString() {
        return "PersistedInstallationEntry{firebaseInstallationId=" + this.f8328a + ", registrationStatus=" + this.f8329b + ", authToken=" + this.f8330c + ", refreshToken=" + this.f8331d + ", expiresInSecs=" + this.f8332e + ", tokenCreationEpochInSecs=" + this.f8333f + ", fisError=" + this.f8334g + "}";
    }
}
