package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;

final class a5 implements Callable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ t f5833a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ String f5834b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ f5 f5835c;

    a5(f5 f5Var, t tVar, String str) {
        this.f5835c = f5Var;
        this.f5833a = tVar;
        this.f5834b = str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0163, code lost:
        if (android.text.TextUtils.isEmpty(r8) == false) goto L_0x0165;
     */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x036d A[Catch:{ SecurityException -> 0x01f5, all -> 0x05f1 }, LOOP:2: B:109:0x0367->B:111:0x036d, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x040c A[Catch:{ SecurityException -> 0x01f5, all -> 0x05f1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0434 A[Catch:{ SecurityException -> 0x01f5, all -> 0x05f1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x046a A[Catch:{ SecurityException -> 0x01f5, all -> 0x05f1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x04ba A[Catch:{ SecurityException -> 0x01f5, all -> 0x05f1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x0526 A[Catch:{ SecurityException -> 0x01f5, all -> 0x05f1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x053c A[Catch:{ SecurityException -> 0x01f5, all -> 0x05f1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x0547 A[Catch:{ SecurityException -> 0x01f5, all -> 0x05f1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x054b A[Catch:{ SecurityException -> 0x01f5, all -> 0x05f1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x02a5 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x01b8 A[Catch:{ SecurityException -> 0x01f5, all -> 0x05f1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x026f A[Catch:{ SecurityException -> 0x01f5, all -> 0x05f1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0294 A[Catch:{ SecurityException -> 0x01f5, all -> 0x05f1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x02f8 A[Catch:{ SecurityException -> 0x01f5, all -> 0x05f1 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object call() {
        /*
            r31 = this;
            r1 = r31
            java.lang.String r0 = "_r"
            com.google.android.gms.measurement.internal.f5 r2 = r1.f5835c
            com.google.android.gms.measurement.internal.w8 r2 = r2.f5962a
            r2.a()
            com.google.android.gms.measurement.internal.f5 r2 = r1.f5835c
            com.google.android.gms.measurement.internal.w8 r2 = r2.f5962a
            com.google.android.gms.measurement.internal.n6 r2 = r2.c0()
            com.google.android.gms.measurement.internal.t r3 = r1.f5833a
            java.lang.String r13 = r1.f5834b
            r2.h()
            com.google.android.gms.measurement.internal.n4.t()
            com.google.android.gms.common.internal.s.k(r3)
            com.google.android.gms.common.internal.s.g(r13)
            com.google.android.gms.measurement.internal.n4 r4 = r2.f5994a
            com.google.android.gms.measurement.internal.g r4 = r4.z()
            com.google.android.gms.measurement.internal.x2 r5 = com.google.android.gms.measurement.internal.y2.W
            boolean r4 = r4.B(r13, r5)
            r5 = 0
            if (r4 != 0) goto L_0x0049
            com.google.android.gms.measurement.internal.n4 r0 = r2.f5994a
            com.google.android.gms.measurement.internal.j3 r0 = r0.d()
            com.google.android.gms.measurement.internal.h3 r0 = r0.q()
            java.lang.String r2 = "Generating ScionPayload disabled. packageName"
            r0.b(r2, r13)
            byte[] r0 = new byte[r5]
            goto L_0x05f0
        L_0x0049:
            java.lang.String r4 = r3.f6408e
            java.lang.String r6 = "_iap"
            boolean r4 = r6.equals(r4)
            r14 = 0
            if (r4 != 0) goto L_0x0072
            java.lang.String r4 = "_iapx"
            java.lang.String r6 = r3.f6408e
            boolean r4 = r4.equals(r6)
            if (r4 != 0) goto L_0x0072
            com.google.android.gms.measurement.internal.n4 r0 = r2.f5994a
            com.google.android.gms.measurement.internal.j3 r0 = r0.d()
            com.google.android.gms.measurement.internal.h3 r0 = r0.q()
            java.lang.String r2 = "Generating a payload for this event is not available. package_name, event_name"
            java.lang.String r3 = r3.f6408e
            r0.c(r2, r13, r3)
            r0 = r14
            goto L_0x05f0
        L_0x0072:
            com.google.android.gms.internal.measurement.zzfv r6 = com.google.android.gms.internal.measurement.zzfw.zza()
            com.google.android.gms.measurement.internal.w8 r4 = r2.f6214b
            com.google.android.gms.measurement.internal.j r4 = r4.V()
            r4.g0()
            com.google.android.gms.measurement.internal.w8 r4 = r2.f6214b     // Catch:{ all -> 0x05f1 }
            com.google.android.gms.measurement.internal.j r4 = r4.V()     // Catch:{ all -> 0x05f1 }
            com.google.android.gms.measurement.internal.u4 r4 = r4.T(r13)     // Catch:{ all -> 0x05f1 }
            if (r4 != 0) goto L_0x00a7
            com.google.android.gms.measurement.internal.n4 r0 = r2.f5994a     // Catch:{ all -> 0x05f1 }
            com.google.android.gms.measurement.internal.j3 r0 = r0.d()     // Catch:{ all -> 0x05f1 }
            com.google.android.gms.measurement.internal.h3 r0 = r0.q()     // Catch:{ all -> 0x05f1 }
            java.lang.String r3 = "Log and bundle not available. package_name"
            r0.b(r3, r13)     // Catch:{ all -> 0x05f1 }
        L_0x009a:
            byte[] r0 = new byte[r5]     // Catch:{ all -> 0x05f1 }
        L_0x009c:
            com.google.android.gms.measurement.internal.w8 r2 = r2.f6214b
            com.google.android.gms.measurement.internal.j r2 = r2.V()
            r2.h0()
            goto L_0x05f0
        L_0x00a7:
            boolean r7 = r4.K()     // Catch:{ all -> 0x05f1 }
            if (r7 != 0) goto L_0x00bd
            com.google.android.gms.measurement.internal.n4 r0 = r2.f5994a     // Catch:{ all -> 0x05f1 }
            com.google.android.gms.measurement.internal.j3 r0 = r0.d()     // Catch:{ all -> 0x05f1 }
            com.google.android.gms.measurement.internal.h3 r0 = r0.q()     // Catch:{ all -> 0x05f1 }
            java.lang.String r3 = "Log and bundle disabled. package_name"
            r0.b(r3, r13)     // Catch:{ all -> 0x05f1 }
            goto L_0x009a
        L_0x00bd:
            com.google.android.gms.internal.measurement.zzfx r15 = com.google.android.gms.internal.measurement.zzfy.zzu()     // Catch:{ all -> 0x05f1 }
            r11 = 1
            r15.zzaa(r11)     // Catch:{ all -> 0x05f1 }
            java.lang.String r7 = "android"
            r15.zzW(r7)     // Catch:{ all -> 0x05f1 }
            java.lang.String r7 = r4.e0()     // Catch:{ all -> 0x05f1 }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x05f1 }
            if (r7 != 0) goto L_0x00db
            java.lang.String r7 = r4.e0()     // Catch:{ all -> 0x05f1 }
            r15.zzA(r7)     // Catch:{ all -> 0x05f1 }
        L_0x00db:
            java.lang.String r7 = r4.g0()     // Catch:{ all -> 0x05f1 }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x05f1 }
            if (r7 != 0) goto L_0x00f2
            java.lang.String r7 = r4.g0()     // Catch:{ all -> 0x05f1 }
            java.lang.Object r7 = com.google.android.gms.common.internal.s.k(r7)     // Catch:{ all -> 0x05f1 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ all -> 0x05f1 }
            r15.zzC(r7)     // Catch:{ all -> 0x05f1 }
        L_0x00f2:
            java.lang.String r7 = r4.h0()     // Catch:{ all -> 0x05f1 }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x05f1 }
            if (r7 != 0) goto L_0x0109
            java.lang.String r7 = r4.h0()     // Catch:{ all -> 0x05f1 }
            java.lang.Object r7 = com.google.android.gms.common.internal.s.k(r7)     // Catch:{ all -> 0x05f1 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ all -> 0x05f1 }
            r15.zzD(r7)     // Catch:{ all -> 0x05f1 }
        L_0x0109:
            long r7 = r4.M()     // Catch:{ all -> 0x05f1 }
            r9 = -2147483648(0xffffffff80000000, double:NaN)
            int r12 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r12 == 0) goto L_0x011c
            long r7 = r4.M()     // Catch:{ all -> 0x05f1 }
            int r8 = (int) r7     // Catch:{ all -> 0x05f1 }
            r15.zzE(r8)     // Catch:{ all -> 0x05f1 }
        L_0x011c:
            long r7 = r4.X()     // Catch:{ all -> 0x05f1 }
            r15.zzS(r7)     // Catch:{ all -> 0x05f1 }
            long r7 = r4.V()     // Catch:{ all -> 0x05f1 }
            r15.zzM(r7)     // Catch:{ all -> 0x05f1 }
            java.lang.String r7 = r4.k0()     // Catch:{ all -> 0x05f1 }
            java.lang.String r8 = r4.c0()     // Catch:{ all -> 0x05f1 }
            com.google.android.gms.internal.measurement.zzoq.zzc()     // Catch:{ all -> 0x05f1 }
            com.google.android.gms.measurement.internal.n4 r9 = r2.f5994a     // Catch:{ all -> 0x05f1 }
            com.google.android.gms.measurement.internal.g r9 = r9.z()     // Catch:{ all -> 0x05f1 }
            java.lang.String r10 = r4.e0()     // Catch:{ all -> 0x05f1 }
            com.google.android.gms.measurement.internal.x2 r12 = com.google.android.gms.measurement.internal.y2.f6623f0     // Catch:{ all -> 0x05f1 }
            boolean r9 = r9.B(r10, r12)     // Catch:{ all -> 0x05f1 }
            if (r9 == 0) goto L_0x0169
            java.lang.String r9 = r4.j0()     // Catch:{ all -> 0x05f1 }
            boolean r10 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x05f1 }
            if (r10 != 0) goto L_0x0155
        L_0x0151:
            r15.zzR(r7)     // Catch:{ all -> 0x05f1 }
            goto L_0x0177
        L_0x0155:
            boolean r7 = android.text.TextUtils.isEmpty(r9)     // Catch:{ all -> 0x05f1 }
            if (r7 != 0) goto L_0x015f
            r15.zzQ(r9)     // Catch:{ all -> 0x05f1 }
            goto L_0x0177
        L_0x015f:
            boolean r7 = android.text.TextUtils.isEmpty(r8)     // Catch:{ all -> 0x05f1 }
            if (r7 != 0) goto L_0x0177
        L_0x0165:
            r15.zzy(r8)     // Catch:{ all -> 0x05f1 }
            goto L_0x0177
        L_0x0169:
            boolean r9 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x05f1 }
            if (r9 != 0) goto L_0x0170
            goto L_0x0151
        L_0x0170:
            boolean r7 = android.text.TextUtils.isEmpty(r8)     // Catch:{ all -> 0x05f1 }
            if (r7 != 0) goto L_0x0177
            goto L_0x0165
        L_0x0177:
            com.google.android.gms.measurement.internal.w8 r7 = r2.f6214b     // Catch:{ all -> 0x05f1 }
            h4.a r7 = r7.U(r13)     // Catch:{ all -> 0x05f1 }
            long r8 = r4.U()     // Catch:{ all -> 0x05f1 }
            r15.zzJ(r8)     // Catch:{ all -> 0x05f1 }
            com.google.android.gms.measurement.internal.n4 r8 = r2.f5994a     // Catch:{ all -> 0x05f1 }
            boolean r8 = r8.o()     // Catch:{ all -> 0x05f1 }
            if (r8 == 0) goto L_0x01ab
            com.google.android.gms.measurement.internal.n4 r8 = r2.f5994a     // Catch:{ all -> 0x05f1 }
            com.google.android.gms.measurement.internal.g r8 = r8.z()     // Catch:{ all -> 0x05f1 }
            java.lang.String r9 = r15.zzal()     // Catch:{ all -> 0x05f1 }
            boolean r8 = r8.C(r9)     // Catch:{ all -> 0x05f1 }
            if (r8 == 0) goto L_0x01ab
            boolean r8 = r7.j()     // Catch:{ all -> 0x05f1 }
            if (r8 == 0) goto L_0x01ab
            boolean r8 = android.text.TextUtils.isEmpty(r14)     // Catch:{ all -> 0x05f1 }
            if (r8 != 0) goto L_0x01ab
            r15.zzL(r14)     // Catch:{ all -> 0x05f1 }
        L_0x01ab:
            java.lang.String r8 = r7.i()     // Catch:{ all -> 0x05f1 }
            r15.zzI(r8)     // Catch:{ all -> 0x05f1 }
            boolean r8 = r7.j()     // Catch:{ all -> 0x05f1 }
            if (r8 == 0) goto L_0x020b
            com.google.android.gms.measurement.internal.w8 r8 = r2.f6214b     // Catch:{ all -> 0x05f1 }
            com.google.android.gms.measurement.internal.w7 r8 = r8.d0()     // Catch:{ all -> 0x05f1 }
            java.lang.String r9 = r4.e0()     // Catch:{ all -> 0x05f1 }
            android.util.Pair r8 = r8.n(r9, r7)     // Catch:{ all -> 0x05f1 }
            boolean r9 = r4.J()     // Catch:{ all -> 0x05f1 }
            if (r9 == 0) goto L_0x020b
            java.lang.Object r9 = r8.first     // Catch:{ all -> 0x05f1 }
            java.lang.CharSequence r9 = (java.lang.CharSequence) r9     // Catch:{ all -> 0x05f1 }
            boolean r9 = android.text.TextUtils.isEmpty(r9)     // Catch:{ all -> 0x05f1 }
            if (r9 != 0) goto L_0x020b
            java.lang.Object r9 = r8.first     // Catch:{ SecurityException -> 0x01f5 }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ SecurityException -> 0x01f5 }
            long r11 = r3.f6411h     // Catch:{ SecurityException -> 0x01f5 }
            java.lang.String r10 = java.lang.Long.toString(r11)     // Catch:{ SecurityException -> 0x01f5 }
            java.lang.String r9 = com.google.android.gms.measurement.internal.n6.a(r9, r10)     // Catch:{ SecurityException -> 0x01f5 }
            r15.zzab(r9)     // Catch:{ SecurityException -> 0x01f5 }
            java.lang.Object r8 = r8.second     // Catch:{ all -> 0x05f1 }
            if (r8 == 0) goto L_0x020b
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch:{ all -> 0x05f1 }
            boolean r8 = r8.booleanValue()     // Catch:{ all -> 0x05f1 }
            r15.zzU(r8)     // Catch:{ all -> 0x05f1 }
            goto L_0x020b
        L_0x01f5:
            r0 = move-exception
            com.google.android.gms.measurement.internal.n4 r3 = r2.f5994a     // Catch:{ all -> 0x05f1 }
            com.google.android.gms.measurement.internal.j3 r3 = r3.d()     // Catch:{ all -> 0x05f1 }
            com.google.android.gms.measurement.internal.h3 r3 = r3.q()     // Catch:{ all -> 0x05f1 }
            java.lang.String r4 = "Resettable device id encryption failed"
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x05f1 }
            r3.b(r4, r0)     // Catch:{ all -> 0x05f1 }
            goto L_0x009a
        L_0x020b:
            com.google.android.gms.measurement.internal.n4 r8 = r2.f5994a     // Catch:{ all -> 0x05f1 }
            com.google.android.gms.measurement.internal.n r8 = r8.A()     // Catch:{ all -> 0x05f1 }
            r8.k()     // Catch:{ all -> 0x05f1 }
            java.lang.String r8 = android.os.Build.MODEL     // Catch:{ all -> 0x05f1 }
            r15.zzK(r8)     // Catch:{ all -> 0x05f1 }
            com.google.android.gms.measurement.internal.n4 r8 = r2.f5994a     // Catch:{ all -> 0x05f1 }
            com.google.android.gms.measurement.internal.n r8 = r8.A()     // Catch:{ all -> 0x05f1 }
            r8.k()     // Catch:{ all -> 0x05f1 }
            java.lang.String r8 = android.os.Build.VERSION.RELEASE     // Catch:{ all -> 0x05f1 }
            r15.zzV(r8)     // Catch:{ all -> 0x05f1 }
            com.google.android.gms.measurement.internal.n4 r8 = r2.f5994a     // Catch:{ all -> 0x05f1 }
            com.google.android.gms.measurement.internal.n r8 = r8.A()     // Catch:{ all -> 0x05f1 }
            long r8 = r8.p()     // Catch:{ all -> 0x05f1 }
            int r9 = (int) r8     // Catch:{ all -> 0x05f1 }
            r15.zzaf(r9)     // Catch:{ all -> 0x05f1 }
            com.google.android.gms.measurement.internal.n4 r8 = r2.f5994a     // Catch:{ all -> 0x05f1 }
            com.google.android.gms.measurement.internal.n r8 = r8.A()     // Catch:{ all -> 0x05f1 }
            java.lang.String r8 = r8.q()     // Catch:{ all -> 0x05f1 }
            r15.zzaj(r8)     // Catch:{ all -> 0x05f1 }
            boolean r7 = r7.k()     // Catch:{ SecurityException -> 0x05d7 }
            if (r7 == 0) goto L_0x0265
            java.lang.String r7 = r4.f0()     // Catch:{ SecurityException -> 0x05d7 }
            if (r7 == 0) goto L_0x0265
            java.lang.String r7 = r4.f0()     // Catch:{ SecurityException -> 0x05d7 }
            java.lang.Object r7 = com.google.android.gms.common.internal.s.k(r7)     // Catch:{ SecurityException -> 0x05d7 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ SecurityException -> 0x05d7 }
            long r8 = r3.f6411h     // Catch:{ SecurityException -> 0x05d7 }
            java.lang.String r8 = java.lang.Long.toString(r8)     // Catch:{ SecurityException -> 0x05d7 }
            java.lang.String r7 = com.google.android.gms.measurement.internal.n6.a(r7, r8)     // Catch:{ SecurityException -> 0x05d7 }
            r15.zzB(r7)     // Catch:{ SecurityException -> 0x05d7 }
        L_0x0265:
            java.lang.String r7 = r4.i0()     // Catch:{ all -> 0x05f1 }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x05f1 }
            if (r7 != 0) goto L_0x027c
            java.lang.String r7 = r4.i0()     // Catch:{ all -> 0x05f1 }
            java.lang.Object r7 = com.google.android.gms.common.internal.s.k(r7)     // Catch:{ all -> 0x05f1 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ all -> 0x05f1 }
            r15.zzP(r7)     // Catch:{ all -> 0x05f1 }
        L_0x027c:
            java.lang.String r7 = r4.e0()     // Catch:{ all -> 0x05f1 }
            com.google.android.gms.measurement.internal.w8 r8 = r2.f6214b     // Catch:{ all -> 0x05f1 }
            com.google.android.gms.measurement.internal.j r8 = r8.V()     // Catch:{ all -> 0x05f1 }
            java.util.List r8 = r8.e0(r7)     // Catch:{ all -> 0x05f1 }
            java.util.Iterator r9 = r8.iterator()     // Catch:{ all -> 0x05f1 }
        L_0x028e:
            boolean r10 = r9.hasNext()     // Catch:{ all -> 0x05f1 }
            if (r10 == 0) goto L_0x02a5
            java.lang.Object r10 = r9.next()     // Catch:{ all -> 0x05f1 }
            com.google.android.gms.measurement.internal.b9 r10 = (com.google.android.gms.measurement.internal.b9) r10     // Catch:{ all -> 0x05f1 }
            java.lang.String r11 = "_lte"
            java.lang.String r12 = r10.f5870c     // Catch:{ all -> 0x05f1 }
            boolean r11 = r11.equals(r12)     // Catch:{ all -> 0x05f1 }
            if (r11 == 0) goto L_0x028e
            goto L_0x02a6
        L_0x02a5:
            r10 = r14
        L_0x02a6:
            r24 = 0
            if (r10 == 0) goto L_0x02ae
            java.lang.Object r9 = r10.f5872e     // Catch:{ all -> 0x05f1 }
            if (r9 != 0) goto L_0x02d5
        L_0x02ae:
            com.google.android.gms.measurement.internal.b9 r9 = new com.google.android.gms.measurement.internal.b9     // Catch:{ all -> 0x05f1 }
            java.lang.String r19 = "auto"
            java.lang.String r20 = "_lte"
            com.google.android.gms.measurement.internal.n4 r10 = r2.f5994a     // Catch:{ all -> 0x05f1 }
            y3.e r10 = r10.e()     // Catch:{ all -> 0x05f1 }
            long r21 = r10.currentTimeMillis()     // Catch:{ all -> 0x05f1 }
            java.lang.Long r23 = java.lang.Long.valueOf(r24)     // Catch:{ all -> 0x05f1 }
            r17 = r9
            r18 = r7
            r17.<init>(r18, r19, r20, r21, r23)     // Catch:{ all -> 0x05f1 }
            r8.add(r9)     // Catch:{ all -> 0x05f1 }
            com.google.android.gms.measurement.internal.w8 r7 = r2.f6214b     // Catch:{ all -> 0x05f1 }
            com.google.android.gms.measurement.internal.j r7 = r7.V()     // Catch:{ all -> 0x05f1 }
            r7.z(r9)     // Catch:{ all -> 0x05f1 }
        L_0x02d5:
            com.google.android.gms.measurement.internal.w8 r7 = r2.f6214b     // Catch:{ all -> 0x05f1 }
            com.google.android.gms.measurement.internal.y8 r7 = r7.f0()     // Catch:{ all -> 0x05f1 }
            com.google.android.gms.measurement.internal.n4 r9 = r7.f5994a     // Catch:{ all -> 0x05f1 }
            com.google.android.gms.measurement.internal.j3 r9 = r9.d()     // Catch:{ all -> 0x05f1 }
            com.google.android.gms.measurement.internal.h3 r9 = r9.v()     // Catch:{ all -> 0x05f1 }
            java.lang.String r10 = "Checking account type status for ad personalization signals"
            r9.a(r10)     // Catch:{ all -> 0x05f1 }
            com.google.android.gms.measurement.internal.n4 r9 = r7.f5994a     // Catch:{ all -> 0x05f1 }
            com.google.android.gms.measurement.internal.n r9 = r9.A()     // Catch:{ all -> 0x05f1 }
            boolean r9 = r9.s()     // Catch:{ all -> 0x05f1 }
            r10 = 1
            if (r9 == 0) goto L_0x0360
            java.lang.String r9 = r4.e0()     // Catch:{ all -> 0x05f1 }
            com.google.android.gms.common.internal.s.k(r9)     // Catch:{ all -> 0x05f1 }
            boolean r12 = r4.J()     // Catch:{ all -> 0x05f1 }
            if (r12 == 0) goto L_0x0360
            com.google.android.gms.measurement.internal.w8 r12 = r7.f6214b     // Catch:{ all -> 0x05f1 }
            com.google.android.gms.measurement.internal.h4 r12 = r12.Z()     // Catch:{ all -> 0x05f1 }
            boolean r12 = r12.t(r9)     // Catch:{ all -> 0x05f1 }
            if (r12 == 0) goto L_0x0360
            com.google.android.gms.measurement.internal.n4 r12 = r7.f5994a     // Catch:{ all -> 0x05f1 }
            com.google.android.gms.measurement.internal.j3 r12 = r12.d()     // Catch:{ all -> 0x05f1 }
            com.google.android.gms.measurement.internal.h3 r12 = r12.q()     // Catch:{ all -> 0x05f1 }
            java.lang.String r14 = "Turning off ad personalization due to account type"
            r12.a(r14)     // Catch:{ all -> 0x05f1 }
            java.util.Iterator r12 = r8.iterator()     // Catch:{ all -> 0x05f1 }
        L_0x0324:
            boolean r14 = r12.hasNext()     // Catch:{ all -> 0x05f1 }
            if (r14 == 0) goto L_0x0342
            java.lang.String r14 = "_npa"
            java.lang.Object r17 = r12.next()     // Catch:{ all -> 0x05f1 }
            r5 = r17
            com.google.android.gms.measurement.internal.b9 r5 = (com.google.android.gms.measurement.internal.b9) r5     // Catch:{ all -> 0x05f1 }
            java.lang.String r5 = r5.f5870c     // Catch:{ all -> 0x05f1 }
            boolean r5 = r14.equals(r5)     // Catch:{ all -> 0x05f1 }
            if (r5 == 0) goto L_0x0340
            r12.remove()     // Catch:{ all -> 0x05f1 }
            goto L_0x0342
        L_0x0340:
            r5 = 0
            goto L_0x0324
        L_0x0342:
            com.google.android.gms.measurement.internal.b9 r5 = new com.google.android.gms.measurement.internal.b9     // Catch:{ all -> 0x05f1 }
            java.lang.String r19 = "auto"
            java.lang.String r20 = "_npa"
            com.google.android.gms.measurement.internal.n4 r7 = r7.f5994a     // Catch:{ all -> 0x05f1 }
            y3.e r7 = r7.e()     // Catch:{ all -> 0x05f1 }
            long r21 = r7.currentTimeMillis()     // Catch:{ all -> 0x05f1 }
            java.lang.Long r23 = java.lang.Long.valueOf(r10)     // Catch:{ all -> 0x05f1 }
            r17 = r5
            r18 = r9
            r17.<init>(r18, r19, r20, r21, r23)     // Catch:{ all -> 0x05f1 }
            r8.add(r5)     // Catch:{ all -> 0x05f1 }
        L_0x0360:
            int r5 = r8.size()     // Catch:{ all -> 0x05f1 }
            com.google.android.gms.internal.measurement.zzgh[] r5 = new com.google.android.gms.internal.measurement.zzgh[r5]     // Catch:{ all -> 0x05f1 }
            r7 = 0
        L_0x0367:
            int r9 = r8.size()     // Catch:{ all -> 0x05f1 }
            if (r7 >= r9) goto L_0x03a5
            com.google.android.gms.internal.measurement.zzgg r9 = com.google.android.gms.internal.measurement.zzgh.zzd()     // Catch:{ all -> 0x05f1 }
            java.lang.Object r12 = r8.get(r7)     // Catch:{ all -> 0x05f1 }
            com.google.android.gms.measurement.internal.b9 r12 = (com.google.android.gms.measurement.internal.b9) r12     // Catch:{ all -> 0x05f1 }
            java.lang.String r12 = r12.f5870c     // Catch:{ all -> 0x05f1 }
            r9.zzf(r12)     // Catch:{ all -> 0x05f1 }
            java.lang.Object r12 = r8.get(r7)     // Catch:{ all -> 0x05f1 }
            com.google.android.gms.measurement.internal.b9 r12 = (com.google.android.gms.measurement.internal.b9) r12     // Catch:{ all -> 0x05f1 }
            long r10 = r12.f5871d     // Catch:{ all -> 0x05f1 }
            r9.zzg(r10)     // Catch:{ all -> 0x05f1 }
            com.google.android.gms.measurement.internal.w8 r10 = r2.f6214b     // Catch:{ all -> 0x05f1 }
            com.google.android.gms.measurement.internal.y8 r10 = r10.f0()     // Catch:{ all -> 0x05f1 }
            java.lang.Object r11 = r8.get(r7)     // Catch:{ all -> 0x05f1 }
            com.google.android.gms.measurement.internal.b9 r11 = (com.google.android.gms.measurement.internal.b9) r11     // Catch:{ all -> 0x05f1 }
            java.lang.Object r11 = r11.f5872e     // Catch:{ all -> 0x05f1 }
            r10.M(r9, r11)     // Catch:{ all -> 0x05f1 }
            com.google.android.gms.internal.measurement.zzjz r9 = r9.zzaA()     // Catch:{ all -> 0x05f1 }
            com.google.android.gms.internal.measurement.zzgh r9 = (com.google.android.gms.internal.measurement.zzgh) r9     // Catch:{ all -> 0x05f1 }
            r5[r7] = r9     // Catch:{ all -> 0x05f1 }
            int r7 = r7 + 1
            r10 = 1
            goto L_0x0367
        L_0x03a5:
            java.util.List r5 = java.util.Arrays.asList(r5)     // Catch:{ all -> 0x05f1 }
            r15.zzi(r5)     // Catch:{ all -> 0x05f1 }
            com.google.android.gms.measurement.internal.k3 r5 = com.google.android.gms.measurement.internal.k3.b(r3)     // Catch:{ all -> 0x05f1 }
            com.google.android.gms.measurement.internal.n4 r7 = r2.f5994a     // Catch:{ all -> 0x05f1 }
            com.google.android.gms.measurement.internal.d9 r7 = r7.N()     // Catch:{ all -> 0x05f1 }
            android.os.Bundle r8 = r5.f6138d     // Catch:{ all -> 0x05f1 }
            com.google.android.gms.measurement.internal.w8 r9 = r2.f6214b     // Catch:{ all -> 0x05f1 }
            com.google.android.gms.measurement.internal.j r9 = r9.V()     // Catch:{ all -> 0x05f1 }
            android.os.Bundle r9 = r9.S(r13)     // Catch:{ all -> 0x05f1 }
            r7.y(r8, r9)     // Catch:{ all -> 0x05f1 }
            com.google.android.gms.measurement.internal.n4 r7 = r2.f5994a     // Catch:{ all -> 0x05f1 }
            com.google.android.gms.measurement.internal.d9 r7 = r7.N()     // Catch:{ all -> 0x05f1 }
            com.google.android.gms.measurement.internal.n4 r8 = r2.f5994a     // Catch:{ all -> 0x05f1 }
            com.google.android.gms.measurement.internal.g r8 = r8.z()     // Catch:{ all -> 0x05f1 }
            int r8 = r8.n(r13)     // Catch:{ all -> 0x05f1 }
            r7.z(r5, r8)     // Catch:{ all -> 0x05f1 }
            android.os.Bundle r14 = r5.f6138d     // Catch:{ all -> 0x05f1 }
            java.lang.String r5 = "_c"
            r7 = 1
            r14.putLong(r5, r7)     // Catch:{ all -> 0x05f1 }
            com.google.android.gms.measurement.internal.n4 r5 = r2.f5994a     // Catch:{ all -> 0x05f1 }
            com.google.android.gms.measurement.internal.j3 r5 = r5.d()     // Catch:{ all -> 0x05f1 }
            com.google.android.gms.measurement.internal.h3 r5 = r5.q()     // Catch:{ all -> 0x05f1 }
            java.lang.String r7 = "Marking in-app purchase as real-time"
            r5.a(r7)     // Catch:{ all -> 0x05f1 }
            r7 = 1
            r14.putLong(r0, r7)     // Catch:{ all -> 0x05f1 }
            java.lang.String r5 = "_o"
            java.lang.String r7 = r3.f6410g     // Catch:{ all -> 0x05f1 }
            r14.putString(r5, r7)     // Catch:{ all -> 0x05f1 }
            com.google.android.gms.measurement.internal.n4 r5 = r2.f5994a     // Catch:{ all -> 0x05f1 }
            com.google.android.gms.measurement.internal.d9 r5 = r5.N()     // Catch:{ all -> 0x05f1 }
            java.lang.String r7 = r15.zzal()     // Catch:{ all -> 0x05f1 }
            boolean r5 = r5.S(r7)     // Catch:{ all -> 0x05f1 }
            if (r5 == 0) goto L_0x0426
            com.google.android.gms.measurement.internal.n4 r5 = r2.f5994a     // Catch:{ all -> 0x05f1 }
            com.google.android.gms.measurement.internal.d9 r5 = r5.N()     // Catch:{ all -> 0x05f1 }
            r7 = 1
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x05f1 }
            java.lang.String r8 = "_dbg"
            r5.B(r14, r8, r7)     // Catch:{ all -> 0x05f1 }
            com.google.android.gms.measurement.internal.n4 r5 = r2.f5994a     // Catch:{ all -> 0x05f1 }
            com.google.android.gms.measurement.internal.d9 r5 = r5.N()     // Catch:{ all -> 0x05f1 }
            r5.B(r14, r0, r7)     // Catch:{ all -> 0x05f1 }
        L_0x0426:
            com.google.android.gms.measurement.internal.w8 r0 = r2.f6214b     // Catch:{ all -> 0x05f1 }
            com.google.android.gms.measurement.internal.j r0 = r0.V()     // Catch:{ all -> 0x05f1 }
            java.lang.String r5 = r3.f6408e     // Catch:{ all -> 0x05f1 }
            com.google.android.gms.measurement.internal.p r0 = r0.X(r13, r5)     // Catch:{ all -> 0x05f1 }
            if (r0 != 0) goto L_0x046a
            com.google.android.gms.measurement.internal.p r0 = new com.google.android.gms.measurement.internal.p     // Catch:{ all -> 0x05f1 }
            java.lang.String r5 = r3.f6408e     // Catch:{ all -> 0x05f1 }
            long r11 = r3.f6411h     // Catch:{ all -> 0x05f1 }
            r7 = 0
            r9 = 0
            r17 = 0
            r21 = r11
            r11 = r17
            r16 = 0
            r28 = r15
            r15 = r16
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r23 = r4
            r4 = r0
            r27 = r5
            r5 = r13
            r29 = r6
            r6 = r27
            r26 = r13
            r27 = r14
            r30 = 0
            r13 = r21
            r4.<init>(r5, r6, r7, r9, r11, r13, r15, r17, r18, r19, r20)     // Catch:{ all -> 0x05f1 }
            r11 = r24
            goto L_0x047f
        L_0x046a:
            r23 = r4
            r29 = r6
            r26 = r13
            r27 = r14
            r28 = r15
            r30 = 0
            long r4 = r0.f6307f     // Catch:{ all -> 0x05f1 }
            long r6 = r3.f6411h     // Catch:{ all -> 0x05f1 }
            com.google.android.gms.measurement.internal.p r0 = r0.c(r6)     // Catch:{ all -> 0x05f1 }
            r11 = r4
        L_0x047f:
            com.google.android.gms.measurement.internal.w8 r4 = r2.f6214b     // Catch:{ all -> 0x05f1 }
            com.google.android.gms.measurement.internal.j r4 = r4.V()     // Catch:{ all -> 0x05f1 }
            r4.q(r0)     // Catch:{ all -> 0x05f1 }
            com.google.android.gms.measurement.internal.o r14 = new com.google.android.gms.measurement.internal.o     // Catch:{ all -> 0x05f1 }
            com.google.android.gms.measurement.internal.n4 r5 = r2.f5994a     // Catch:{ all -> 0x05f1 }
            java.lang.String r6 = r3.f6410g     // Catch:{ all -> 0x05f1 }
            java.lang.String r8 = r3.f6408e     // Catch:{ all -> 0x05f1 }
            long r9 = r3.f6411h     // Catch:{ all -> 0x05f1 }
            r4 = r14
            r7 = r26
            r13 = r27
            r4.<init>((com.google.android.gms.measurement.internal.n4) r5, (java.lang.String) r6, (java.lang.String) r7, (java.lang.String) r8, (long) r9, (long) r11, (android.os.Bundle) r13)     // Catch:{ all -> 0x05f1 }
            com.google.android.gms.internal.measurement.zzfn r4 = com.google.android.gms.internal.measurement.zzfo.zze()     // Catch:{ all -> 0x05f1 }
            long r5 = r14.f6272d     // Catch:{ all -> 0x05f1 }
            r4.zzm(r5)     // Catch:{ all -> 0x05f1 }
            java.lang.String r5 = r14.f6270b     // Catch:{ all -> 0x05f1 }
            r4.zzi(r5)     // Catch:{ all -> 0x05f1 }
            long r5 = r14.f6273e     // Catch:{ all -> 0x05f1 }
            r4.zzl(r5)     // Catch:{ all -> 0x05f1 }
            com.google.android.gms.measurement.internal.r r5 = r14.f6274f     // Catch:{ all -> 0x05f1 }
            com.google.android.gms.measurement.internal.q r6 = new com.google.android.gms.measurement.internal.q     // Catch:{ all -> 0x05f1 }
            r6.<init>(r5)     // Catch:{ all -> 0x05f1 }
        L_0x04b4:
            boolean r5 = r6.hasNext()     // Catch:{ all -> 0x05f1 }
            if (r5 == 0) goto L_0x04da
            java.lang.String r5 = r6.next()     // Catch:{ all -> 0x05f1 }
            com.google.android.gms.internal.measurement.zzfr r7 = com.google.android.gms.internal.measurement.zzfs.zze()     // Catch:{ all -> 0x05f1 }
            r7.zzj(r5)     // Catch:{ all -> 0x05f1 }
            com.google.android.gms.measurement.internal.r r8 = r14.f6274f     // Catch:{ all -> 0x05f1 }
            java.lang.Object r5 = r8.j0(r5)     // Catch:{ all -> 0x05f1 }
            if (r5 == 0) goto L_0x04b4
            com.google.android.gms.measurement.internal.w8 r8 = r2.f6214b     // Catch:{ all -> 0x05f1 }
            com.google.android.gms.measurement.internal.y8 r8 = r8.f0()     // Catch:{ all -> 0x05f1 }
            r8.L(r7, r5)     // Catch:{ all -> 0x05f1 }
            r4.zze(r7)     // Catch:{ all -> 0x05f1 }
            goto L_0x04b4
        L_0x04da:
            r5 = r28
            r5.zzj(r4)     // Catch:{ all -> 0x05f1 }
            com.google.android.gms.internal.measurement.zzfz r6 = com.google.android.gms.internal.measurement.zzgb.zza()     // Catch:{ all -> 0x05f1 }
            com.google.android.gms.internal.measurement.zzfp r7 = com.google.android.gms.internal.measurement.zzfq.zza()     // Catch:{ all -> 0x05f1 }
            long r8 = r0.f6304c     // Catch:{ all -> 0x05f1 }
            r7.zza(r8)     // Catch:{ all -> 0x05f1 }
            java.lang.String r0 = r3.f6408e     // Catch:{ all -> 0x05f1 }
            r7.zzb(r0)     // Catch:{ all -> 0x05f1 }
            r6.zza(r7)     // Catch:{ all -> 0x05f1 }
            r5.zzX(r6)     // Catch:{ all -> 0x05f1 }
            com.google.android.gms.measurement.internal.w8 r0 = r2.f6214b     // Catch:{ all -> 0x05f1 }
            com.google.android.gms.measurement.internal.q9 r6 = r0.S()     // Catch:{ all -> 0x05f1 }
            java.lang.String r7 = r23.e0()     // Catch:{ all -> 0x05f1 }
            java.util.List r8 = java.util.Collections.emptyList()     // Catch:{ all -> 0x05f1 }
            java.util.List r9 = r5.zzap()     // Catch:{ all -> 0x05f1 }
            long r10 = r4.zzc()     // Catch:{ all -> 0x05f1 }
            java.lang.Long r10 = java.lang.Long.valueOf(r10)     // Catch:{ all -> 0x05f1 }
            long r11 = r4.zzc()     // Catch:{ all -> 0x05f1 }
            java.lang.Long r11 = java.lang.Long.valueOf(r11)     // Catch:{ all -> 0x05f1 }
            java.util.List r0 = r6.m(r7, r8, r9, r10, r11)     // Catch:{ all -> 0x05f1 }
            r5.zzf(r0)     // Catch:{ all -> 0x05f1 }
            boolean r0 = r4.zzq()     // Catch:{ all -> 0x05f1 }
            if (r0 == 0) goto L_0x0534
            long r6 = r4.zzc()     // Catch:{ all -> 0x05f1 }
            r5.zzae(r6)     // Catch:{ all -> 0x05f1 }
            long r3 = r4.zzc()     // Catch:{ all -> 0x05f1 }
            r5.zzN(r3)     // Catch:{ all -> 0x05f1 }
        L_0x0534:
            long r3 = r23.Y()     // Catch:{ all -> 0x05f1 }
            int r0 = (r3 > r24 ? 1 : (r3 == r24 ? 0 : -1))
            if (r0 == 0) goto L_0x053f
            r5.zzY(r3)     // Catch:{ all -> 0x05f1 }
        L_0x053f:
            long r6 = r23.a0()     // Catch:{ all -> 0x05f1 }
            int r8 = (r6 > r24 ? 1 : (r6 == r24 ? 0 : -1))
            if (r8 == 0) goto L_0x054b
            r5.zzZ(r6)     // Catch:{ all -> 0x05f1 }
            goto L_0x0550
        L_0x054b:
            if (r0 == 0) goto L_0x0550
            r5.zzZ(r3)     // Catch:{ all -> 0x05f1 }
        L_0x0550:
            r23.e()     // Catch:{ all -> 0x05f1 }
            long r3 = r23.Z()     // Catch:{ all -> 0x05f1 }
            int r0 = (int) r3     // Catch:{ all -> 0x05f1 }
            r5.zzF(r0)     // Catch:{ all -> 0x05f1 }
            com.google.android.gms.measurement.internal.n4 r0 = r2.f5994a     // Catch:{ all -> 0x05f1 }
            com.google.android.gms.measurement.internal.g r0 = r0.z()     // Catch:{ all -> 0x05f1 }
            r0.q()     // Catch:{ all -> 0x05f1 }
            r3 = 42097(0xa471, double:2.07987E-319)
            r5.zzah(r3)     // Catch:{ all -> 0x05f1 }
            com.google.android.gms.measurement.internal.n4 r0 = r2.f5994a     // Catch:{ all -> 0x05f1 }
            y3.e r0 = r0.e()     // Catch:{ all -> 0x05f1 }
            long r3 = r0.currentTimeMillis()     // Catch:{ all -> 0x05f1 }
            r5.zzag(r3)     // Catch:{ all -> 0x05f1 }
            r0 = 1
            r5.zzad(r0)     // Catch:{ all -> 0x05f1 }
            r0 = r29
            r0.zza(r5)     // Catch:{ all -> 0x05f1 }
            long r3 = r5.zzd()     // Catch:{ all -> 0x05f1 }
            r6 = r23
            r6.E(r3)     // Catch:{ all -> 0x05f1 }
            long r3 = r5.zzc()     // Catch:{ all -> 0x05f1 }
            r6.C(r3)     // Catch:{ all -> 0x05f1 }
            com.google.android.gms.measurement.internal.w8 r3 = r2.f6214b     // Catch:{ all -> 0x05f1 }
            com.google.android.gms.measurement.internal.j r3 = r3.V()     // Catch:{ all -> 0x05f1 }
            r3.p(r6)     // Catch:{ all -> 0x05f1 }
            com.google.android.gms.measurement.internal.w8 r3 = r2.f6214b     // Catch:{ all -> 0x05f1 }
            com.google.android.gms.measurement.internal.j r3 = r3.V()     // Catch:{ all -> 0x05f1 }
            r3.o()     // Catch:{ all -> 0x05f1 }
            com.google.android.gms.measurement.internal.w8 r3 = r2.f6214b
            com.google.android.gms.measurement.internal.j r3 = r3.V()
            r3.h0()
            com.google.android.gms.measurement.internal.w8 r3 = r2.f6214b     // Catch:{ IOException -> 0x05c0 }
            com.google.android.gms.measurement.internal.y8 r3 = r3.f0()     // Catch:{ IOException -> 0x05c0 }
            com.google.android.gms.internal.measurement.zzjz r0 = r0.zzaA()     // Catch:{ IOException -> 0x05c0 }
            com.google.android.gms.internal.measurement.zzfw r0 = (com.google.android.gms.internal.measurement.zzfw) r0     // Catch:{ IOException -> 0x05c0 }
            byte[] r0 = r0.zzbs()     // Catch:{ IOException -> 0x05c0 }
            byte[] r0 = r3.Q(r0)     // Catch:{ IOException -> 0x05c0 }
            goto L_0x05f0
        L_0x05c0:
            r0 = move-exception
            com.google.android.gms.measurement.internal.n4 r2 = r2.f5994a
            com.google.android.gms.measurement.internal.j3 r2 = r2.d()
            com.google.android.gms.measurement.internal.h3 r2 = r2.r()
            java.lang.String r3 = "Data loss. Failed to bundle and serialize. appId"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.j3.z(r26)
            r2.c(r3, r4, r0)
            r0 = r30
            goto L_0x05f0
        L_0x05d7:
            r0 = move-exception
            com.google.android.gms.measurement.internal.n4 r3 = r2.f5994a     // Catch:{ all -> 0x05f1 }
            com.google.android.gms.measurement.internal.j3 r3 = r3.d()     // Catch:{ all -> 0x05f1 }
            com.google.android.gms.measurement.internal.h3 r3 = r3.q()     // Catch:{ all -> 0x05f1 }
            java.lang.String r4 = "app instance id encryption failed"
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x05f1 }
            r3.b(r4, r0)     // Catch:{ all -> 0x05f1 }
            r3 = 0
            byte[] r0 = new byte[r3]     // Catch:{ all -> 0x05f1 }
            goto L_0x009c
        L_0x05f0:
            return r0
        L_0x05f1:
            r0 = move-exception
            com.google.android.gms.measurement.internal.w8 r2 = r2.f6214b
            com.google.android.gms.measurement.internal.j r2 = r2.V()
            r2.h0()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.a5.call():java.lang.Object");
    }
}
