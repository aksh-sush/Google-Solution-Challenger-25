package com.google.firebase.messaging;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import com.google.firebase.FirebaseApp;

class i0 {

    /* renamed from: a  reason: collision with root package name */
    private final Context f8407a;

    /* renamed from: b  reason: collision with root package name */
    private String f8408b;

    /* renamed from: c  reason: collision with root package name */
    private String f8409c;

    /* renamed from: d  reason: collision with root package name */
    private int f8410d;

    /* renamed from: e  reason: collision with root package name */
    private int f8411e = 0;

    i0(Context context) {
        this.f8407a = context;
    }

    static String c(FirebaseApp firebaseApp) {
        String gcmSenderId = firebaseApp.getOptions().getGcmSenderId();
        if (gcmSenderId != null) {
            return gcmSenderId;
        }
        String applicationId = firebaseApp.getOptions().getApplicationId();
        if (!applicationId.startsWith("1:")) {
            return applicationId;
        }
        String[] split = applicationId.split(":");
        if (split.length < 2) {
            return null;
        }
        String str = split[1];
        if (str.isEmpty()) {
            return null;
        }
        return str;
    }

    private PackageInfo f(String str) {
        try {
            return this.f8407a.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e10) {
            String valueOf = String.valueOf(e10);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 23);
            sb2.append("Failed to find package ");
            sb2.append(valueOf);
            Log.w(Constants.TAG, sb2.toString());
            return null;
        }
    }

    private synchronized void h() {
        PackageInfo f10 = f(this.f8407a.getPackageName());
        if (f10 != null) {
            this.f8408b = Integer.toString(f10.versionCode);
            this.f8409c = f10.versionName;
        }
    }

    /* access modifiers changed from: package-private */
    public synchronized String a() {
        if (this.f8408b == null) {
            h();
        }
        return this.f8408b;
    }

    /* access modifiers changed from: package-private */
    public synchronized String b() {
        if (this.f8409c == null) {
            h();
        }
        return this.f8409c;
    }

    /* access modifiers changed from: package-private */
    public synchronized int d() {
        PackageInfo f10;
        if (this.f8410d == 0 && (f10 = f("com.google.android.gms")) != null) {
            this.f8410d = f10.versionCode;
        }
        return this.f8410d;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0078, code lost:
        return r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized int e() {
        /*
            r5 = this;
            monitor-enter(r5)
            int r0 = r5.f8411e     // Catch:{ all -> 0x0079 }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r5)
            return r0
        L_0x0007:
            android.content.Context r0 = r5.f8407a     // Catch:{ all -> 0x0079 }
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch:{ all -> 0x0079 }
            java.lang.String r1 = "com.google.android.c2dm.permission.SEND"
            java.lang.String r2 = "com.google.android.gms"
            int r1 = r0.checkPermission(r1, r2)     // Catch:{ all -> 0x0079 }
            r2 = -1
            r3 = 0
            if (r1 != r2) goto L_0x0022
            java.lang.String r0 = "FirebaseMessaging"
            java.lang.String r1 = "Google Play services missing or without correct permission."
            android.util.Log.e(r0, r1)     // Catch:{ all -> 0x0079 }
            monitor-exit(r5)
            return r3
        L_0x0022:
            boolean r1 = y3.n.h()     // Catch:{ all -> 0x0079 }
            r2 = 1
            if (r1 != 0) goto L_0x0046
            android.content.Intent r1 = new android.content.Intent     // Catch:{ all -> 0x0079 }
            java.lang.String r4 = "com.google.android.c2dm.intent.REGISTER"
            r1.<init>(r4)     // Catch:{ all -> 0x0079 }
            java.lang.String r4 = "com.google.android.gms"
            r1.setPackage(r4)     // Catch:{ all -> 0x0079 }
            java.util.List r1 = r0.queryIntentServices(r1, r3)     // Catch:{ all -> 0x0079 }
            if (r1 == 0) goto L_0x0046
            int r1 = r1.size()     // Catch:{ all -> 0x0079 }
            if (r1 > 0) goto L_0x0042
            goto L_0x0046
        L_0x0042:
            r5.f8411e = r2     // Catch:{ all -> 0x0079 }
            monitor-exit(r5)
            return r2
        L_0x0046:
            android.content.Intent r1 = new android.content.Intent     // Catch:{ all -> 0x0079 }
            java.lang.String r4 = "com.google.iid.TOKEN_REQUEST"
            r1.<init>(r4)     // Catch:{ all -> 0x0079 }
            java.lang.String r4 = "com.google.android.gms"
            r1.setPackage(r4)     // Catch:{ all -> 0x0079 }
            java.util.List r0 = r0.queryBroadcastReceivers(r1, r3)     // Catch:{ all -> 0x0079 }
            r1 = 2
            if (r0 == 0) goto L_0x0064
            int r0 = r0.size()     // Catch:{ all -> 0x0079 }
            if (r0 > 0) goto L_0x0060
            goto L_0x0064
        L_0x0060:
            r5.f8411e = r1     // Catch:{ all -> 0x0079 }
            monitor-exit(r5)
            return r1
        L_0x0064:
            java.lang.String r0 = "FirebaseMessaging"
            java.lang.String r3 = "Failed to resolve IID implementation package, falling back"
            android.util.Log.w(r0, r3)     // Catch:{ all -> 0x0079 }
            boolean r0 = y3.n.h()     // Catch:{ all -> 0x0079 }
            if (r0 == 0) goto L_0x0075
            r5.f8411e = r1     // Catch:{ all -> 0x0079 }
            r2 = 2
            goto L_0x0077
        L_0x0075:
            r5.f8411e = r2     // Catch:{ all -> 0x0079 }
        L_0x0077:
            monitor-exit(r5)
            return r2
        L_0x0079:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.i0.e():int");
    }

    /* access modifiers changed from: package-private */
    public boolean g() {
        return e() != 0;
    }
}
