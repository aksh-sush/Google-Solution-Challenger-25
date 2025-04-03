package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.s;
import java.util.List;

public final class b3 extends z3 {

    /* renamed from: c  reason: collision with root package name */
    private String f5847c;

    /* renamed from: d  reason: collision with root package name */
    private String f5848d;

    /* renamed from: e  reason: collision with root package name */
    private int f5849e;

    /* renamed from: f  reason: collision with root package name */
    private String f5850f;

    /* renamed from: g  reason: collision with root package name */
    private String f5851g;

    /* renamed from: h  reason: collision with root package name */
    private long f5852h;

    /* renamed from: i  reason: collision with root package name */
    private final long f5853i;

    /* renamed from: j  reason: collision with root package name */
    private List f5854j;

    /* renamed from: k  reason: collision with root package name */
    private int f5855k;

    /* renamed from: l  reason: collision with root package name */
    private String f5856l;

    /* renamed from: m  reason: collision with root package name */
    private String f5857m;

    /* renamed from: n  reason: collision with root package name */
    private String f5858n;

    b3(n4 n4Var, long j10) {
        super(n4Var);
        this.f5853i = j10;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00f2  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0100  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0107  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x010e  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0124  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0145 A[Catch:{ IllegalStateException -> 0x01e7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0147 A[Catch:{ IllegalStateException -> 0x01e7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x015d A[SYNTHETIC, Splitter:B:56:0x015d] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x019d A[Catch:{ IllegalStateException -> 0x01e7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x01c8 A[Catch:{ IllegalStateException -> 0x01e7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0211  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x024a  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0257  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void l() {
        /*
            r13 = this;
            com.google.android.gms.measurement.internal.n4 r0 = r13.f5994a
            android.content.Context r0 = r0.c()
            java.lang.String r0 = r0.getPackageName()
            com.google.android.gms.measurement.internal.n4 r1 = r13.f5994a
            android.content.Context r1 = r1.c()
            android.content.pm.PackageManager r1 = r1.getPackageManager()
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 0
            java.lang.String r4 = ""
            java.lang.String r5 = "unknown"
            java.lang.String r6 = "Unknown"
            if (r1 != 0) goto L_0x0035
            com.google.android.gms.measurement.internal.n4 r7 = r13.f5994a
            com.google.android.gms.measurement.internal.j3 r7 = r7.d()
            com.google.android.gms.measurement.internal.h3 r7 = r7.r()
            java.lang.String r8 = "PackageManager is null, app identity information might be inaccurate. appId"
            java.lang.Object r9 = com.google.android.gms.measurement.internal.j3.z(r0)
            r7.b(r8, r9)
        L_0x0032:
            r8 = r6
            goto L_0x009b
        L_0x0035:
            java.lang.String r5 = r1.getInstallerPackageName(r0)     // Catch:{ IllegalArgumentException -> 0x003a }
            goto L_0x004d
        L_0x003a:
            com.google.android.gms.measurement.internal.n4 r7 = r13.f5994a
            com.google.android.gms.measurement.internal.j3 r7 = r7.d()
            com.google.android.gms.measurement.internal.h3 r7 = r7.r()
            java.lang.String r8 = "Error retrieving app installer package name. appId"
            java.lang.Object r9 = com.google.android.gms.measurement.internal.j3.z(r0)
            r7.b(r8, r9)
        L_0x004d:
            if (r5 != 0) goto L_0x0052
            java.lang.String r5 = "manual_install"
            goto L_0x005b
        L_0x0052:
            java.lang.String r7 = "com.android.vending"
            boolean r7 = r7.equals(r5)
            if (r7 == 0) goto L_0x005b
            r5 = r4
        L_0x005b:
            com.google.android.gms.measurement.internal.n4 r7 = r13.f5994a     // Catch:{ NameNotFoundException -> 0x0085 }
            android.content.Context r7 = r7.c()     // Catch:{ NameNotFoundException -> 0x0085 }
            java.lang.String r7 = r7.getPackageName()     // Catch:{ NameNotFoundException -> 0x0085 }
            android.content.pm.PackageInfo r7 = r1.getPackageInfo(r7, r3)     // Catch:{ NameNotFoundException -> 0x0085 }
            if (r7 == 0) goto L_0x0032
            android.content.pm.ApplicationInfo r8 = r7.applicationInfo     // Catch:{ NameNotFoundException -> 0x0085 }
            java.lang.CharSequence r8 = r1.getApplicationLabel(r8)     // Catch:{ NameNotFoundException -> 0x0085 }
            boolean r9 = android.text.TextUtils.isEmpty(r8)     // Catch:{ NameNotFoundException -> 0x0085 }
            if (r9 != 0) goto L_0x007c
            java.lang.String r8 = r8.toString()     // Catch:{ NameNotFoundException -> 0x0085 }
            goto L_0x007d
        L_0x007c:
            r8 = r6
        L_0x007d:
            java.lang.String r6 = r7.versionName     // Catch:{ NameNotFoundException -> 0x0082 }
            int r2 = r7.versionCode     // Catch:{ NameNotFoundException -> 0x0082 }
            goto L_0x009b
        L_0x0082:
            r7 = r6
            r6 = r8
            goto L_0x0086
        L_0x0085:
            r7 = r6
        L_0x0086:
            com.google.android.gms.measurement.internal.n4 r8 = r13.f5994a
            com.google.android.gms.measurement.internal.j3 r8 = r8.d()
            com.google.android.gms.measurement.internal.h3 r8 = r8.r()
            java.lang.String r9 = "Error retrieving package info. appId, appName"
            java.lang.Object r10 = com.google.android.gms.measurement.internal.j3.z(r0)
            r8.c(r9, r10, r6)
            r8 = r6
            r6 = r7
        L_0x009b:
            r13.f5847c = r0
            r13.f5850f = r5
            r13.f5848d = r6
            r13.f5849e = r2
            r13.f5851g = r8
            r5 = 0
            r13.f5852h = r5
            com.google.android.gms.measurement.internal.n4 r2 = r13.f5994a
            java.lang.String r2 = r2.O()
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            r5 = 1
            if (r2 != 0) goto L_0x00c6
            com.google.android.gms.measurement.internal.n4 r2 = r13.f5994a
            java.lang.String r2 = r2.P()
            java.lang.String r6 = "am"
            boolean r2 = r6.equals(r2)
            if (r2 == 0) goto L_0x00c6
            r2 = 1
            goto L_0x00c7
        L_0x00c6:
            r2 = 0
        L_0x00c7:
            com.google.android.gms.measurement.internal.n4 r6 = r13.f5994a
            int r6 = r6.x()
            com.google.android.gms.measurement.internal.n4 r7 = r13.f5994a
            com.google.android.gms.measurement.internal.j3 r7 = r7.d()
            switch(r6) {
                case 0: goto L_0x010e;
                case 1: goto L_0x0107;
                case 2: goto L_0x0100;
                case 3: goto L_0x00f9;
                case 4: goto L_0x00f2;
                case 5: goto L_0x00eb;
                case 6: goto L_0x00e4;
                case 7: goto L_0x00dd;
                default: goto L_0x00d6;
            }
        L_0x00d6:
            com.google.android.gms.measurement.internal.h3 r7 = r7.u()
            java.lang.String r8 = "App measurement disabled due to denied storage consent"
            goto L_0x0114
        L_0x00dd:
            com.google.android.gms.measurement.internal.h3 r7 = r7.u()
            java.lang.String r8 = "App measurement disabled via the global data collection setting"
            goto L_0x0114
        L_0x00e4:
            com.google.android.gms.measurement.internal.h3 r7 = r7.x()
            java.lang.String r8 = "App measurement deactivated via resources. This method is being deprecated. Please refer to https://firebase.google.com/support/guides/disable-analytics"
            goto L_0x0114
        L_0x00eb:
            com.google.android.gms.measurement.internal.h3 r7 = r7.v()
            java.lang.String r8 = "App measurement disabled via the init parameters"
            goto L_0x0114
        L_0x00f2:
            com.google.android.gms.measurement.internal.h3 r7 = r7.u()
            java.lang.String r8 = "App measurement disabled via the manifest"
            goto L_0x0114
        L_0x00f9:
            com.google.android.gms.measurement.internal.h3 r7 = r7.u()
            java.lang.String r8 = "App measurement disabled by setAnalyticsCollectionEnabled(false)"
            goto L_0x0114
        L_0x0100:
            com.google.android.gms.measurement.internal.h3 r7 = r7.v()
            java.lang.String r8 = "App measurement deactivated via the init parameters"
            goto L_0x0114
        L_0x0107:
            com.google.android.gms.measurement.internal.h3 r7 = r7.u()
            java.lang.String r8 = "App measurement deactivated via the manifest"
            goto L_0x0114
        L_0x010e:
            com.google.android.gms.measurement.internal.h3 r7 = r7.v()
            java.lang.String r8 = "App measurement collection enabled"
        L_0x0114:
            r7.a(r8)
            r13.f5856l = r4
            r13.f5857m = r4
            r13.f5858n = r4
            com.google.android.gms.measurement.internal.n4 r7 = r13.f5994a
            r7.f()
            if (r2 == 0) goto L_0x012c
            com.google.android.gms.measurement.internal.n4 r2 = r13.f5994a
            java.lang.String r2 = r2.O()
            r13.f5857m = r2
        L_0x012c:
            r2 = 0
            com.google.android.gms.measurement.internal.n4 r7 = r13.f5994a     // Catch:{ IllegalStateException -> 0x01e7 }
            android.content.Context r7 = r7.c()     // Catch:{ IllegalStateException -> 0x01e7 }
            com.google.android.gms.measurement.internal.n4 r8 = r13.f5994a     // Catch:{ IllegalStateException -> 0x01e7 }
            java.lang.String r8 = r8.R()     // Catch:{ IllegalStateException -> 0x01e7 }
            java.lang.String r9 = "google_app_id"
            java.lang.String r7 = h4.v.c(r7, r9, r8)     // Catch:{ IllegalStateException -> 0x01e7 }
            boolean r8 = android.text.TextUtils.isEmpty(r7)     // Catch:{ IllegalStateException -> 0x01e7 }
            if (r5 == r8) goto L_0x0147
            r8 = r7
            goto L_0x0148
        L_0x0147:
            r8 = r4
        L_0x0148:
            r13.f5856l = r8     // Catch:{ IllegalStateException -> 0x01e7 }
            com.google.android.gms.internal.measurement.zzoq.zzc()     // Catch:{ IllegalStateException -> 0x01e7 }
            com.google.android.gms.measurement.internal.n4 r8 = r13.f5994a     // Catch:{ IllegalStateException -> 0x01e7 }
            com.google.android.gms.measurement.internal.g r8 = r8.z()     // Catch:{ IllegalStateException -> 0x01e7 }
            com.google.android.gms.measurement.internal.x2 r9 = com.google.android.gms.measurement.internal.y2.f6623f0     // Catch:{ IllegalStateException -> 0x01e7 }
            boolean r8 = r8.B(r2, r9)     // Catch:{ IllegalStateException -> 0x01e7 }
            java.lang.String r9 = "admob_app_id"
            if (r8 == 0) goto L_0x019d
            com.google.android.gms.measurement.internal.n4 r8 = r13.f5994a     // Catch:{ IllegalStateException -> 0x01e7 }
            android.content.Context r8 = r8.c()     // Catch:{ IllegalStateException -> 0x01e7 }
            com.google.android.gms.measurement.internal.n4 r10 = r13.f5994a     // Catch:{ IllegalStateException -> 0x01e7 }
            java.lang.String r10 = r10.R()     // Catch:{ IllegalStateException -> 0x01e7 }
            com.google.android.gms.common.internal.s.k(r8)     // Catch:{ IllegalStateException -> 0x01e7 }
            android.content.res.Resources r11 = r8.getResources()     // Catch:{ IllegalStateException -> 0x01e7 }
            boolean r12 = android.text.TextUtils.isEmpty(r10)     // Catch:{ IllegalStateException -> 0x01e7 }
            if (r12 != 0) goto L_0x0177
            goto L_0x017b
        L_0x0177:
            java.lang.String r10 = h4.j.a(r8)     // Catch:{ IllegalStateException -> 0x01e7 }
        L_0x017b:
            java.lang.String r8 = "ga_app_id"
            java.lang.String r8 = h4.j.b(r8, r11, r10)     // Catch:{ IllegalStateException -> 0x01e7 }
            boolean r12 = android.text.TextUtils.isEmpty(r8)     // Catch:{ IllegalStateException -> 0x01e7 }
            if (r5 == r12) goto L_0x0188
            r4 = r8
        L_0x0188:
            r13.f5858n = r4     // Catch:{ IllegalStateException -> 0x01e7 }
            boolean r4 = android.text.TextUtils.isEmpty(r7)     // Catch:{ IllegalStateException -> 0x01e7 }
            if (r4 == 0) goto L_0x0196
            boolean r4 = android.text.TextUtils.isEmpty(r8)     // Catch:{ IllegalStateException -> 0x01e7 }
            if (r4 != 0) goto L_0x01c6
        L_0x0196:
            java.lang.String r4 = h4.j.b(r9, r11, r10)     // Catch:{ IllegalStateException -> 0x01e7 }
        L_0x019a:
            r13.f5857m = r4     // Catch:{ IllegalStateException -> 0x01e7 }
            goto L_0x01c6
        L_0x019d:
            boolean r4 = android.text.TextUtils.isEmpty(r7)     // Catch:{ IllegalStateException -> 0x01e7 }
            if (r4 != 0) goto L_0x01c6
            com.google.android.gms.measurement.internal.n4 r4 = r13.f5994a     // Catch:{ IllegalStateException -> 0x01e7 }
            android.content.Context r4 = r4.c()     // Catch:{ IllegalStateException -> 0x01e7 }
            com.google.android.gms.measurement.internal.n4 r5 = r13.f5994a     // Catch:{ IllegalStateException -> 0x01e7 }
            java.lang.String r5 = r5.R()     // Catch:{ IllegalStateException -> 0x01e7 }
            com.google.android.gms.common.internal.s.k(r4)     // Catch:{ IllegalStateException -> 0x01e7 }
            android.content.res.Resources r7 = r4.getResources()     // Catch:{ IllegalStateException -> 0x01e7 }
            boolean r8 = android.text.TextUtils.isEmpty(r5)     // Catch:{ IllegalStateException -> 0x01e7 }
            if (r8 != 0) goto L_0x01bd
            goto L_0x01c1
        L_0x01bd:
            java.lang.String r5 = h4.j.a(r4)     // Catch:{ IllegalStateException -> 0x01e7 }
        L_0x01c1:
            java.lang.String r4 = h4.j.b(r9, r7, r5)     // Catch:{ IllegalStateException -> 0x01e7 }
            goto L_0x019a
        L_0x01c6:
            if (r6 != 0) goto L_0x01fb
            com.google.android.gms.measurement.internal.n4 r4 = r13.f5994a     // Catch:{ IllegalStateException -> 0x01e7 }
            com.google.android.gms.measurement.internal.j3 r4 = r4.d()     // Catch:{ IllegalStateException -> 0x01e7 }
            com.google.android.gms.measurement.internal.h3 r4 = r4.v()     // Catch:{ IllegalStateException -> 0x01e7 }
            java.lang.String r5 = "App measurement enabled for app package, google app id"
            java.lang.String r6 = r13.f5847c     // Catch:{ IllegalStateException -> 0x01e7 }
            java.lang.String r7 = r13.f5856l     // Catch:{ IllegalStateException -> 0x01e7 }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ IllegalStateException -> 0x01e7 }
            if (r7 == 0) goto L_0x01e1
            java.lang.String r7 = r13.f5857m     // Catch:{ IllegalStateException -> 0x01e7 }
            goto L_0x01e3
        L_0x01e1:
            java.lang.String r7 = r13.f5856l     // Catch:{ IllegalStateException -> 0x01e7 }
        L_0x01e3:
            r4.c(r5, r6, r7)     // Catch:{ IllegalStateException -> 0x01e7 }
            goto L_0x01fb
        L_0x01e7:
            r4 = move-exception
            com.google.android.gms.measurement.internal.n4 r5 = r13.f5994a
            com.google.android.gms.measurement.internal.j3 r5 = r5.d()
            com.google.android.gms.measurement.internal.h3 r5 = r5.r()
            java.lang.String r6 = "Fetching Google App Id failed with exception. appId"
            java.lang.Object r0 = com.google.android.gms.measurement.internal.j3.z(r0)
            r5.c(r6, r0, r4)
        L_0x01fb:
            r13.f5854j = r2
            com.google.android.gms.measurement.internal.n4 r0 = r13.f5994a
            r0.f()
            com.google.android.gms.measurement.internal.n4 r0 = r13.f5994a
            com.google.android.gms.measurement.internal.g r0 = r0.z()
            java.lang.String r2 = "analytics.safelisted_events"
            java.util.List r0 = r0.y(r2)
            if (r0 != 0) goto L_0x0211
            goto L_0x0246
        L_0x0211:
            int r2 = r0.size()
            if (r2 != 0) goto L_0x0227
            com.google.android.gms.measurement.internal.n4 r0 = r13.f5994a
            com.google.android.gms.measurement.internal.j3 r0 = r0.d()
            com.google.android.gms.measurement.internal.h3 r0 = r0.x()
            java.lang.String r2 = "Safelisted event list is empty. Ignoring"
            r0.a(r2)
            goto L_0x0248
        L_0x0227:
            java.util.Iterator r2 = r0.iterator()
        L_0x022b:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x0246
            java.lang.Object r4 = r2.next()
            java.lang.String r4 = (java.lang.String) r4
            com.google.android.gms.measurement.internal.n4 r5 = r13.f5994a
            com.google.android.gms.measurement.internal.d9 r5 = r5.N()
            java.lang.String r6 = "safelisted event"
            boolean r4 = r5.P(r6, r4)
            if (r4 != 0) goto L_0x022b
            goto L_0x0248
        L_0x0246:
            r13.f5854j = r0
        L_0x0248:
            if (r1 == 0) goto L_0x0257
            com.google.android.gms.measurement.internal.n4 r0 = r13.f5994a
            android.content.Context r0 = r0.c()
            boolean r0 = a4.b.a(r0)
            r13.f5855k = r0
            return
        L_0x0257:
            r13.f5855k = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.b3.l():void");
    }

    /* access modifiers changed from: protected */
    public final boolean n() {
        return true;
    }

    /* access modifiers changed from: package-private */
    public final int o() {
        i();
        return this.f5855k;
    }

    /* access modifiers changed from: package-private */
    public final int p() {
        i();
        return this.f5849e;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x018b  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0191  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x01d0  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x01d3  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x01fb  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0202  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.measurement.internal.i9 q(java.lang.String r35) {
        /*
            r34 = this;
            r1 = r34
            r34.h()
            com.google.android.gms.measurement.internal.i9 r31 = new com.google.android.gms.measurement.internal.i9
            java.lang.String r3 = r34.s()
            java.lang.String r4 = r34.u()
            r34.i()
            java.lang.String r5 = r1.f5848d
            r34.i()
            int r0 = r1.f5849e
            long r6 = (long) r0
            r34.i()
            java.lang.String r0 = r1.f5850f
            com.google.android.gms.common.internal.s.k(r0)
            java.lang.String r8 = r1.f5850f
            com.google.android.gms.measurement.internal.n4 r0 = r1.f5994a
            com.google.android.gms.measurement.internal.g r0 = r0.z()
            r0.q()
            r34.i()
            r34.h()
            long r9 = r1.f5852h
            r2 = 0
            r11 = 0
            int r0 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r0 != 0) goto L_0x00d2
            com.google.android.gms.measurement.internal.n4 r0 = r1.f5994a
            com.google.android.gms.measurement.internal.d9 r9 = r0.N()
            com.google.android.gms.measurement.internal.n4 r0 = r1.f5994a
            android.content.Context r0 = r0.c()
            com.google.android.gms.measurement.internal.n4 r10 = r1.f5994a
            android.content.Context r10 = r10.c()
            java.lang.String r10 = r10.getPackageName()
            r9.h()
            com.google.android.gms.common.internal.s.k(r0)
            com.google.android.gms.common.internal.s.g(r10)
            android.content.pm.PackageManager r13 = r0.getPackageManager()
            java.lang.String r14 = "MD5"
            java.security.MessageDigest r14 = com.google.android.gms.measurement.internal.d9.s(r14)
            r15 = -1
            if (r14 != 0) goto L_0x007a
            com.google.android.gms.measurement.internal.n4 r0 = r9.f5994a
            com.google.android.gms.measurement.internal.j3 r0 = r0.d()
            com.google.android.gms.measurement.internal.h3 r0 = r0.r()
            java.lang.String r9 = "Could not get MD5 instance"
            r0.a(r9)
        L_0x0078:
            r9 = r15
            goto L_0x00d0
        L_0x007a:
            if (r13 == 0) goto L_0x00cf
            boolean r10 = r9.U(r0, r10)     // Catch:{ NameNotFoundException -> 0x00bf }
            if (r10 != 0) goto L_0x00bd
            a4.d r0 = a4.e.a(r0)     // Catch:{ NameNotFoundException -> 0x00bf }
            com.google.android.gms.measurement.internal.n4 r10 = r9.f5994a     // Catch:{ NameNotFoundException -> 0x00bf }
            android.content.Context r10 = r10.c()     // Catch:{ NameNotFoundException -> 0x00bf }
            java.lang.String r10 = r10.getPackageName()     // Catch:{ NameNotFoundException -> 0x00bf }
            r13 = 64
            android.content.pm.PackageInfo r0 = r0.e(r10, r13)     // Catch:{ NameNotFoundException -> 0x00bf }
            android.content.pm.Signature[] r0 = r0.signatures     // Catch:{ NameNotFoundException -> 0x00bf }
            if (r0 == 0) goto L_0x00ad
            int r10 = r0.length     // Catch:{ NameNotFoundException -> 0x00bf }
            if (r10 <= 0) goto L_0x00ad
            r0 = r0[r2]     // Catch:{ NameNotFoundException -> 0x00bf }
            byte[] r0 = r0.toByteArray()     // Catch:{ NameNotFoundException -> 0x00bf }
            byte[] r0 = r14.digest(r0)     // Catch:{ NameNotFoundException -> 0x00bf }
            long r9 = com.google.android.gms.measurement.internal.d9.q0(r0)     // Catch:{ NameNotFoundException -> 0x00bf }
            r15 = r9
            goto L_0x0078
        L_0x00ad:
            com.google.android.gms.measurement.internal.n4 r0 = r9.f5994a     // Catch:{ NameNotFoundException -> 0x00bf }
            com.google.android.gms.measurement.internal.j3 r0 = r0.d()     // Catch:{ NameNotFoundException -> 0x00bf }
            com.google.android.gms.measurement.internal.h3 r0 = r0.w()     // Catch:{ NameNotFoundException -> 0x00bf }
            java.lang.String r10 = "Could not get signatures"
            r0.a(r10)     // Catch:{ NameNotFoundException -> 0x00bf }
            goto L_0x0078
        L_0x00bd:
            r15 = r11
            goto L_0x0078
        L_0x00bf:
            r0 = move-exception
            com.google.android.gms.measurement.internal.n4 r9 = r9.f5994a
            com.google.android.gms.measurement.internal.j3 r9 = r9.d()
            com.google.android.gms.measurement.internal.h3 r9 = r9.r()
            java.lang.String r10 = "Package name not found"
            r9.b(r10, r0)
        L_0x00cf:
            r9 = r11
        L_0x00d0:
            r1.f5852h = r9
        L_0x00d2:
            r13 = r9
            com.google.android.gms.measurement.internal.n4 r0 = r1.f5994a
            boolean r0 = r0.o()
            com.google.android.gms.measurement.internal.n4 r9 = r1.f5994a
            com.google.android.gms.measurement.internal.w3 r9 = r9.F()
            boolean r9 = r9.f6530p
            r10 = 1
            r15 = r9 ^ 1
            r34.h()
            com.google.android.gms.measurement.internal.n4 r9 = r1.f5994a
            boolean r9 = r9.o()
            r11 = 0
            if (r9 != 0) goto L_0x00f4
        L_0x00f0:
            r20 = r11
            goto L_0x0179
        L_0x00f4:
            com.google.android.gms.internal.measurement.zzqd.zzc()
            com.google.android.gms.measurement.internal.n4 r9 = r1.f5994a
            com.google.android.gms.measurement.internal.g r9 = r9.z()
            com.google.android.gms.measurement.internal.x2 r12 = com.google.android.gms.measurement.internal.y2.f6627h0
            boolean r9 = r9.B(r11, r12)
            if (r9 == 0) goto L_0x0115
            com.google.android.gms.measurement.internal.n4 r9 = r1.f5994a
            com.google.android.gms.measurement.internal.j3 r9 = r9.d()
            com.google.android.gms.measurement.internal.h3 r9 = r9.v()
            java.lang.String r12 = "Disabled IID for tests."
            r9.a(r12)
            goto L_0x00f0
        L_0x0115:
            com.google.android.gms.measurement.internal.n4 r9 = r1.f5994a     // Catch:{ ClassNotFoundException -> 0x0176 }
            android.content.Context r9 = r9.c()     // Catch:{ ClassNotFoundException -> 0x0176 }
            java.lang.ClassLoader r9 = r9.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x0176 }
            java.lang.String r12 = "com.google.firebase.analytics.FirebaseAnalytics"
            java.lang.Class r9 = r9.loadClass(r12)     // Catch:{ ClassNotFoundException -> 0x0176 }
            if (r9 != 0) goto L_0x0128
            goto L_0x00f0
        L_0x0128:
            java.lang.Class[] r12 = new java.lang.Class[r10]     // Catch:{ Exception -> 0x0166 }
            java.lang.Class<android.content.Context> r18 = android.content.Context.class
            r12[r2] = r18     // Catch:{ Exception -> 0x0166 }
            java.lang.String r11 = "getInstance"
            java.lang.reflect.Method r11 = r9.getDeclaredMethod(r11, r12)     // Catch:{ Exception -> 0x0166 }
            java.lang.Object[] r12 = new java.lang.Object[r10]     // Catch:{ Exception -> 0x0166 }
            com.google.android.gms.measurement.internal.n4 r10 = r1.f5994a     // Catch:{ Exception -> 0x0166 }
            android.content.Context r10 = r10.c()     // Catch:{ Exception -> 0x0166 }
            r12[r2] = r10     // Catch:{ Exception -> 0x0166 }
            r10 = 0
            java.lang.Object r11 = r11.invoke(r10, r12)     // Catch:{ Exception -> 0x0166 }
            if (r11 != 0) goto L_0x0146
            goto L_0x0177
        L_0x0146:
            java.lang.String r10 = "getFirebaseInstanceId"
            java.lang.Class[] r12 = new java.lang.Class[r2]     // Catch:{ Exception -> 0x0159 }
            java.lang.reflect.Method r9 = r9.getDeclaredMethod(r10, r12)     // Catch:{ Exception -> 0x0159 }
            java.lang.Object[] r10 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x0159 }
            java.lang.Object r9 = r9.invoke(r11, r10)     // Catch:{ Exception -> 0x0159 }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ Exception -> 0x0159 }
            r20 = r9
            goto L_0x0179
        L_0x0159:
            com.google.android.gms.measurement.internal.n4 r9 = r1.f5994a
            com.google.android.gms.measurement.internal.j3 r9 = r9.d()
            com.google.android.gms.measurement.internal.h3 r9 = r9.x()
            java.lang.String r10 = "Failed to retrieve Firebase Instance Id"
            goto L_0x0172
        L_0x0166:
            com.google.android.gms.measurement.internal.n4 r9 = r1.f5994a
            com.google.android.gms.measurement.internal.j3 r9 = r9.d()
            com.google.android.gms.measurement.internal.h3 r9 = r9.y()
            java.lang.String r10 = "Failed to obtain Firebase Analytics instance"
        L_0x0172:
            r9.a(r10)
            goto L_0x0177
        L_0x0176:
        L_0x0177:
            r20 = 0
        L_0x0179:
            com.google.android.gms.measurement.internal.n4 r9 = r1.f5994a
            com.google.android.gms.measurement.internal.w3 r10 = r9.F()
            com.google.android.gms.measurement.internal.t3 r10 = r10.f6519e
            long r10 = r10.a()
            r16 = 0
            int r12 = (r10 > r16 ? 1 : (r10 == r16 ? 0 : -1))
            if (r12 != 0) goto L_0x0191
            long r9 = r9.G
            r12 = r3
            r21 = r9
            goto L_0x019a
        L_0x0191:
            r12 = r3
            long r2 = r9.G
            long r2 = java.lang.Math.min(r2, r10)
            r21 = r2
        L_0x019a:
            r34.i()
            int r11 = r1.f5855k
            com.google.android.gms.measurement.internal.n4 r2 = r1.f5994a
            com.google.android.gms.measurement.internal.g r2 = r2.z()
            boolean r23 = r2.A()
            com.google.android.gms.measurement.internal.n4 r2 = r1.f5994a
            com.google.android.gms.measurement.internal.w3 r2 = r2.F()
            r2.h()
            android.content.SharedPreferences r2 = r2.o()
            java.lang.String r3 = "deferred_analytics_collection"
            r9 = 0
            boolean r24 = r2.getBoolean(r3, r9)
            r34.i()
            java.lang.String r3 = r1.f5857m
            com.google.android.gms.measurement.internal.n4 r2 = r1.f5994a
            com.google.android.gms.measurement.internal.g r2 = r2.z()
            java.lang.String r9 = "google_analytics_default_allow_ad_personalization_signals"
            java.lang.Boolean r2 = r2.t(r9)
            if (r2 != 0) goto L_0x01d3
            r25 = 0
            goto L_0x01df
        L_0x01d3:
            boolean r2 = r2.booleanValue()
            r9 = 1
            r2 = r2 ^ r9
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r25 = r2
        L_0x01df:
            long r9 = r1.f5853i
            java.util.List r2 = r1.f5854j
            com.google.android.gms.internal.measurement.zzoq.zzc()
            r16 = r2
            com.google.android.gms.measurement.internal.n4 r2 = r1.f5994a
            com.google.android.gms.measurement.internal.g r2 = r2.z()
            r19 = r3
            com.google.android.gms.measurement.internal.x2 r3 = com.google.android.gms.measurement.internal.y2.f6623f0
            r26 = r9
            r9 = 0
            boolean r2 = r2.B(r9, r3)
            if (r2 == 0) goto L_0x0202
            java.lang.String r2 = r34.t()
            r29 = r2
            goto L_0x0204
        L_0x0202:
            r29 = r9
        L_0x0204:
            r9 = 42097(0xa471, double:2.07987E-319)
            r17 = 0
            com.google.android.gms.measurement.internal.n4 r2 = r1.f5994a
            com.google.android.gms.measurement.internal.w3 r2 = r2.F()
            h4.a r2 = r2.q()
            java.lang.String r30 = r2.i()
            r28 = r16
            r2 = r31
            r32 = r19
            r3 = r12
            r33 = r11
            r11 = r13
            r13 = r35
            r14 = r0
            r16 = r20
            r19 = r21
            r21 = r33
            r22 = r23
            r23 = r24
            r24 = r32
            r2.<init>((java.lang.String) r3, (java.lang.String) r4, (java.lang.String) r5, (long) r6, (java.lang.String) r8, (long) r9, (long) r11, (java.lang.String) r13, (boolean) r14, (boolean) r15, (java.lang.String) r16, (long) r17, (long) r19, (int) r21, (boolean) r22, (boolean) r23, (java.lang.String) r24, (java.lang.Boolean) r25, (long) r26, (java.util.List) r28, (java.lang.String) r29, (java.lang.String) r30)
            return r31
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.b3.q(java.lang.String):com.google.android.gms.measurement.internal.i9");
    }

    /* access modifiers changed from: package-private */
    public final String r() {
        i();
        return this.f5857m;
    }

    /* access modifiers changed from: package-private */
    public final String s() {
        i();
        s.k(this.f5847c);
        return this.f5847c;
    }

    /* access modifiers changed from: package-private */
    public final String t() {
        i();
        s.k(this.f5858n);
        return this.f5858n;
    }

    /* access modifiers changed from: package-private */
    public final String u() {
        i();
        s.k(this.f5856l);
        return this.f5856l;
    }

    /* access modifiers changed from: package-private */
    public final List v() {
        return this.f5854j;
    }
}
