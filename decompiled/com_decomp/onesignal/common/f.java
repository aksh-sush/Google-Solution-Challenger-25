package com.onesignal.common;

import java.text.SimpleDateFormat;
import java.util.Locale;

public final class f {
    public static final f INSTANCE = new f();

    private f() {
    }

    public final SimpleDateFormat iso8601Format() {
        return new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
    }
}
