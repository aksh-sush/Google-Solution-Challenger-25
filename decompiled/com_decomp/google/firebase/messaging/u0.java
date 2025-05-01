package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import java.util.concurrent.TimeUnit;
import m4.a;

abstract class u0 {

    /* renamed from: a  reason: collision with root package name */
    private static final long f8480a = TimeUnit.MINUTES.toMillis(1);

    /* renamed from: b  reason: collision with root package name */
    private static final Object f8481b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private static a f8482c;

    private static void a(Context context) {
        if (f8482c == null) {
            a aVar = new a(context, 1, "wake:com.google.firebase.iid.WakeLockHolder");
            f8482c = aVar;
            aVar.c(true);
        }
    }

    static void b(Intent intent) {
        synchronized (f8481b) {
            if (f8482c != null && c(intent)) {
                d(intent, false);
                f8482c.b();
            }
        }
    }

    static boolean c(Intent intent) {
        return intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
    }

    private static void d(Intent intent, boolean z10) {
        intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", z10);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0021, code lost:
        return r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static android.content.ComponentName e(android.content.Context r3, android.content.Intent r4) {
        /*
            java.lang.Object r0 = f8481b
            monitor-enter(r0)
            a(r3)     // Catch:{ all -> 0x0022 }
            boolean r1 = c(r4)     // Catch:{ all -> 0x0022 }
            r2 = 1
            d(r4, r2)     // Catch:{ all -> 0x0022 }
            android.content.ComponentName r3 = r3.startService(r4)     // Catch:{ all -> 0x0022 }
            if (r3 != 0) goto L_0x0017
            monitor-exit(r0)     // Catch:{ all -> 0x0022 }
            r3 = 0
            return r3
        L_0x0017:
            if (r1 != 0) goto L_0x0020
            m4.a r4 = f8482c     // Catch:{ all -> 0x0022 }
            long r1 = f8480a     // Catch:{ all -> 0x0022 }
            r4.a(r1)     // Catch:{ all -> 0x0022 }
        L_0x0020:
            monitor-exit(r0)     // Catch:{ all -> 0x0022 }
            return r3
        L_0x0022:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0022 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.u0.e(android.content.Context, android.content.Intent):android.content.ComponentName");
    }
}
