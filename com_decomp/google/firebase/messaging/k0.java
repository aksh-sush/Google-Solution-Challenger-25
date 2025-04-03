package com.google.firebase.messaging;

import java.util.Map;
import java.util.concurrent.Executor;
import n4.i;

class k0 {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f8416a;

    /* renamed from: b  reason: collision with root package name */
    private final Map f8417b = new androidx.collection.a();

    interface a {
        i start();
    }

    k0(Executor executor) {
        this.f8416a = executor;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0030, code lost:
        return r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized n4.i a(java.lang.String r4, com.google.firebase.messaging.k0.a r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            java.util.Map r0 = r3.f8417b     // Catch:{ all -> 0x006a }
            java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x006a }
            n4.i r0 = (n4.i) r0     // Catch:{ all -> 0x006a }
            r1 = 3
            if (r0 == 0) goto L_0x0031
            java.lang.String r5 = "FirebaseMessaging"
            boolean r5 = android.util.Log.isLoggable(r5, r1)     // Catch:{ all -> 0x006a }
            if (r5 == 0) goto L_0x002f
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x006a }
            java.lang.String r5 = "Joining ongoing request for: "
            int r1 = r4.length()     // Catch:{ all -> 0x006a }
            if (r1 == 0) goto L_0x0025
            java.lang.String r4 = r5.concat(r4)     // Catch:{ all -> 0x006a }
            goto L_0x002a
        L_0x0025:
            java.lang.String r4 = new java.lang.String     // Catch:{ all -> 0x006a }
            r4.<init>(r5)     // Catch:{ all -> 0x006a }
        L_0x002a:
            java.lang.String r5 = "FirebaseMessaging"
            android.util.Log.d(r5, r4)     // Catch:{ all -> 0x006a }
        L_0x002f:
            monitor-exit(r3)
            return r0
        L_0x0031:
            java.lang.String r0 = "FirebaseMessaging"
            boolean r0 = android.util.Log.isLoggable(r0, r1)     // Catch:{ all -> 0x006a }
            if (r0 == 0) goto L_0x0054
            java.lang.String r0 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x006a }
            java.lang.String r1 = "Making new request for: "
            int r2 = r0.length()     // Catch:{ all -> 0x006a }
            if (r2 == 0) goto L_0x004a
            java.lang.String r0 = r1.concat(r0)     // Catch:{ all -> 0x006a }
            goto L_0x004f
        L_0x004a:
            java.lang.String r0 = new java.lang.String     // Catch:{ all -> 0x006a }
            r0.<init>(r1)     // Catch:{ all -> 0x006a }
        L_0x004f:
            java.lang.String r1 = "FirebaseMessaging"
            android.util.Log.d(r1, r0)     // Catch:{ all -> 0x006a }
        L_0x0054:
            n4.i r5 = r5.start()     // Catch:{ all -> 0x006a }
            java.util.concurrent.Executor r0 = r3.f8416a     // Catch:{ all -> 0x006a }
            com.google.firebase.messaging.j0 r1 = new com.google.firebase.messaging.j0     // Catch:{ all -> 0x006a }
            r1.<init>(r3, r4)     // Catch:{ all -> 0x006a }
            n4.i r5 = r5.continueWithTask(r0, r1)     // Catch:{ all -> 0x006a }
            java.util.Map r0 = r3.f8417b     // Catch:{ all -> 0x006a }
            r0.put(r4, r5)     // Catch:{ all -> 0x006a }
            monitor-exit(r3)
            return r5
        L_0x006a:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.k0.a(java.lang.String, com.google.firebase.messaging.k0$a):n4.i");
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ i b(String str, i iVar) {
        synchronized (this) {
            this.f8417b.remove(str);
        }
        return iVar;
    }
}
