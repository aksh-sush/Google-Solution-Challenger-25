package com.google.firebase.firestore.model;

import com.google.firebase.Timestamp;
import com.google.protobuf.r1;
import t5.r;
import t5.x;

public final class ServerTimestamps {
    private static final String LOCAL_WRITE_TIME_KEY = "__local_write_time__";
    private static final String PREVIOUS_VALUE_KEY = "__previous_value__";
    private static final String SERVER_TIMESTAMP_SENTINEL = "server_timestamp";
    private static final String TYPE_KEY = "__type__";

    private ServerTimestamps() {
    }

    public static r1 getLocalWriteTime(x xVar) {
        return xVar.A().n(LOCAL_WRITE_TIME_KEY).D();
    }

    public static x getPreviousValue(x xVar) {
        x m10 = xVar.A().m(PREVIOUS_VALUE_KEY, (x) null);
        return isServerTimestamp(m10) ? getPreviousValue(m10) : m10;
    }

    public static boolean isServerTimestamp(x xVar) {
        x xVar2 = null;
        if (xVar != null) {
            xVar2 = xVar.A().m(TYPE_KEY, (x) null);
        }
        return xVar2 != null && SERVER_TIMESTAMP_SENTINEL.equals(xVar2.C());
    }

    public static x valueOf(Timestamp timestamp, x xVar) {
        r.b g10 = r.r().g(TYPE_KEY, (x) x.F().p(SERVER_TIMESTAMP_SENTINEL).build()).g(LOCAL_WRITE_TIME_KEY, (x) x.F().q(r1.n().f(timestamp.getSeconds()).e(timestamp.getNanoseconds())).build());
        if (xVar != null) {
            g10.g(PREVIOUS_VALUE_KEY, xVar);
        }
        return (x) x.F().l(g10).build();
    }
}
