package com.onesignal.common;

import db.l;
import java.util.UUID;

public final class h {
    public static final h INSTANCE = new h();
    private static final String LOCAL_PREFIX = "local-";

    private h() {
    }

    public final String createLocalId() {
        return LOCAL_PREFIX + UUID.randomUUID();
    }

    public final boolean isLocalId(String str) {
        l.e(str, "id");
        return p.t(str, LOCAL_PREFIX, false, 2, (Object) null);
    }
}
