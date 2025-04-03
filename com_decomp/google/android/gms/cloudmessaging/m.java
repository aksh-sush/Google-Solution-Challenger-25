package com.google.android.gms.cloudmessaging;

final /* synthetic */ class m implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    private final i f5219e;

    m(i iVar) {
        this.f5219e = iVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0040, code lost:
        if (android.util.Log.isLoggable("MessengerIpcClient", 3) == false) goto L_0x0062;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0042, code lost:
        r4 = java.lang.String.valueOf(r1);
        r6 = new java.lang.StringBuilder(r4.length() + 8);
        r6.append("Sending ");
        r6.append(r4);
        android.util.Log.d("MessengerIpcClient", r6.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0062, code lost:
        r3 = r0.f5216f.f5207a;
        r4 = r0.f5212b;
        r5 = android.os.Message.obtain();
        r5.what = r1.f5230c;
        r5.arg1 = r1.f5228a;
        r5.replyTo = r4;
        r4 = new android.os.Bundle();
        r4.putBoolean("oneWay", r1.d());
        r4.putString("pkg", r3.getPackageName());
        r4.putBundle(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, r1.f5231d);
        r5.setData(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        r0.f5213c.a(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00a0, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00a1, code lost:
        r0.c(2, r1.getMessage());
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r8 = this;
            com.google.android.gms.cloudmessaging.i r0 = r8.f5219e
        L_0x0002:
            monitor-enter(r0)
            int r1 = r0.f5211a     // Catch:{ all -> 0x00aa }
            r2 = 2
            if (r1 == r2) goto L_0x000a
            monitor-exit(r0)     // Catch:{ all -> 0x00aa }
            return
        L_0x000a:
            java.util.Queue r1 = r0.f5214d     // Catch:{ all -> 0x00aa }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x00aa }
            if (r1 == 0) goto L_0x0017
            r0.f()     // Catch:{ all -> 0x00aa }
            monitor-exit(r0)     // Catch:{ all -> 0x00aa }
            return
        L_0x0017:
            java.util.Queue r1 = r0.f5214d     // Catch:{ all -> 0x00aa }
            java.lang.Object r1 = r1.poll()     // Catch:{ all -> 0x00aa }
            com.google.android.gms.cloudmessaging.t r1 = (com.google.android.gms.cloudmessaging.t) r1     // Catch:{ all -> 0x00aa }
            android.util.SparseArray r3 = r0.f5215e     // Catch:{ all -> 0x00aa }
            int r4 = r1.f5228a     // Catch:{ all -> 0x00aa }
            r3.put(r4, r1)     // Catch:{ all -> 0x00aa }
            com.google.android.gms.cloudmessaging.h r3 = r0.f5216f     // Catch:{ all -> 0x00aa }
            java.util.concurrent.ScheduledExecutorService r3 = r3.f5208b     // Catch:{ all -> 0x00aa }
            com.google.android.gms.cloudmessaging.o r4 = new com.google.android.gms.cloudmessaging.o     // Catch:{ all -> 0x00aa }
            r4.<init>(r0, r1)     // Catch:{ all -> 0x00aa }
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ all -> 0x00aa }
            r6 = 30
            r3.schedule(r4, r6, r5)     // Catch:{ all -> 0x00aa }
            monitor-exit(r0)     // Catch:{ all -> 0x00aa }
            java.lang.String r3 = "MessengerIpcClient"
            r4 = 3
            boolean r3 = android.util.Log.isLoggable(r3, r4)
            if (r3 == 0) goto L_0x0062
            java.lang.String r3 = "MessengerIpcClient"
            java.lang.String r4 = java.lang.String.valueOf(r1)
            int r5 = r4.length()
            int r5 = r5 + 8
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r5)
            java.lang.String r5 = "Sending "
            r6.append(r5)
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            android.util.Log.d(r3, r4)
        L_0x0062:
            com.google.android.gms.cloudmessaging.h r3 = r0.f5216f
            android.content.Context r3 = r3.f5207a
            android.os.Messenger r4 = r0.f5212b
            android.os.Message r5 = android.os.Message.obtain()
            int r6 = r1.f5230c
            r5.what = r6
            int r6 = r1.f5228a
            r5.arg1 = r6
            r5.replyTo = r4
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>()
            java.lang.String r6 = "oneWay"
            boolean r7 = r1.d()
            r4.putBoolean(r6, r7)
            java.lang.String r6 = "pkg"
            java.lang.String r3 = r3.getPackageName()
            r4.putString(r6, r3)
            java.lang.String r3 = "data"
            android.os.Bundle r1 = r1.f5231d
            r4.putBundle(r3, r1)
            r5.setData(r4)
            com.google.android.gms.cloudmessaging.r r1 = r0.f5213c     // Catch:{ RemoteException -> 0x00a0 }
            r1.a(r5)     // Catch:{ RemoteException -> 0x00a0 }
            goto L_0x0002
        L_0x00a0:
            r1 = move-exception
            java.lang.String r1 = r1.getMessage()
            r0.c(r2, r1)
            goto L_0x0002
        L_0x00aa:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00aa }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.cloudmessaging.m.run():void");
    }
}
