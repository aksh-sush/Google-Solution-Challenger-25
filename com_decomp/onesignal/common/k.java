package com.onesignal.common;

public final class k {
    public static final k INSTANCE = new k();
    private static int maxNetworkRequestAttemptCount = 3;

    public enum a {
        INVALID,
        RETRYABLE,
        UNAUTHORIZED,
        MISSING,
        CONFLICT
    }

    private k() {
    }

    public final int getMaxNetworkRequestAttemptCount() {
        return maxNetworkRequestAttemptCount;
    }

    public final a getResponseStatusType(int i10) {
        if (i10 == 409) {
            return a.CONFLICT;
        }
        if (i10 != 410) {
            switch (i10) {
                case 400:
                case 402:
                    return a.INVALID;
                case 401:
                case 403:
                    return a.UNAUTHORIZED;
                case 404:
                    break;
                default:
                    return a.RETRYABLE;
            }
        }
        return a.MISSING;
    }

    public final void setMaxNetworkRequestAttemptCount(int i10) {
        maxNetworkRequestAttemptCount = i10;
    }
}
