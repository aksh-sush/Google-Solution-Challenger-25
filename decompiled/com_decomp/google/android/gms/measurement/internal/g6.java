package com.google.android.gms.measurement.internal;

import android.net.Uri;

final class g6 implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ boolean f5995e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ Uri f5996f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ String f5997g;

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ String f5998h;

    /* renamed from: i  reason: collision with root package name */
    final /* synthetic */ h6 f5999i;

    g6(h6 h6Var, boolean z10, Uri uri, String str, String str2) {
        this.f5999i = h6Var;
        this.f5995e = z10;
        this.f5996f = uri;
        this.f5997g = str;
        this.f5998h = str2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x007b A[SYNTHETIC, Splitter:B:25:0x007b] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00c3 A[Catch:{ RuntimeException -> 0x0156 }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00c5 A[Catch:{ RuntimeException -> 0x0156 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r17 = this;
            r1 = r17
            com.google.android.gms.measurement.internal.h6 r2 = r1.f5999i
            boolean r0 = r1.f5995e
            android.net.Uri r3 = r1.f5996f
            java.lang.String r4 = r1.f5997g
            java.lang.String r5 = r1.f5998h
            com.google.android.gms.measurement.internal.i6 r6 = r2.f6025e
            r6.h()
            com.google.android.gms.measurement.internal.i6 r6 = r2.f6025e     // Catch:{ RuntimeException -> 0x0156 }
            com.google.android.gms.measurement.internal.n4 r6 = r6.f5994a     // Catch:{ RuntimeException -> 0x0156 }
            com.google.android.gms.measurement.internal.d9 r6 = r6.N()     // Catch:{ RuntimeException -> 0x0156 }
            boolean r7 = android.text.TextUtils.isEmpty(r5)     // Catch:{ RuntimeException -> 0x0156 }
            java.lang.String r8 = "Activity created with data 'referrer' without required params"
            java.lang.String r9 = "_cis"
            java.lang.String r10 = "utm_medium"
            java.lang.String r11 = "utm_source"
            java.lang.String r12 = "utm_campaign"
            r13 = 0
            java.lang.String r14 = "gclid"
            if (r7 == 0) goto L_0x002e
        L_0x002c:
            r6 = r13
            goto L_0x0076
        L_0x002e:
            boolean r7 = r5.contains(r14)     // Catch:{ RuntimeException -> 0x0156 }
            if (r7 != 0) goto L_0x0054
            boolean r7 = r5.contains(r12)     // Catch:{ RuntimeException -> 0x0156 }
            if (r7 != 0) goto L_0x0054
            boolean r7 = r5.contains(r11)     // Catch:{ RuntimeException -> 0x0156 }
            if (r7 != 0) goto L_0x0054
            boolean r7 = r5.contains(r10)     // Catch:{ RuntimeException -> 0x0156 }
            if (r7 != 0) goto L_0x0054
            com.google.android.gms.measurement.internal.n4 r6 = r6.f5994a     // Catch:{ RuntimeException -> 0x0156 }
            com.google.android.gms.measurement.internal.j3 r6 = r6.d()     // Catch:{ RuntimeException -> 0x0156 }
            com.google.android.gms.measurement.internal.h3 r6 = r6.q()     // Catch:{ RuntimeException -> 0x0156 }
            r6.a(r8)     // Catch:{ RuntimeException -> 0x0156 }
            goto L_0x002c
        L_0x0054:
            java.lang.String r7 = "https://google.com/search?"
            int r15 = r5.length()     // Catch:{ RuntimeException -> 0x0156 }
            if (r15 == 0) goto L_0x0061
            java.lang.String r7 = r7.concat(r5)     // Catch:{ RuntimeException -> 0x0156 }
            goto L_0x0067
        L_0x0061:
            java.lang.String r15 = new java.lang.String     // Catch:{ RuntimeException -> 0x0156 }
            r15.<init>(r7)     // Catch:{ RuntimeException -> 0x0156 }
            r7 = r15
        L_0x0067:
            android.net.Uri r7 = android.net.Uri.parse(r7)     // Catch:{ RuntimeException -> 0x0156 }
            android.os.Bundle r6 = r6.t0(r7)     // Catch:{ RuntimeException -> 0x0156 }
            if (r6 == 0) goto L_0x0076
            java.lang.String r7 = "referrer"
            r6.putString(r9, r7)     // Catch:{ RuntimeException -> 0x0156 }
        L_0x0076:
            java.lang.String r7 = "_cmp"
            r15 = 1
            if (r0 == 0) goto L_0x00bd
            com.google.android.gms.measurement.internal.i6 r0 = r2.f6025e     // Catch:{ RuntimeException -> 0x0156 }
            com.google.android.gms.measurement.internal.n4 r0 = r0.f5994a     // Catch:{ RuntimeException -> 0x0156 }
            com.google.android.gms.measurement.internal.d9 r0 = r0.N()     // Catch:{ RuntimeException -> 0x0156 }
            android.os.Bundle r0 = r0.t0(r3)     // Catch:{ RuntimeException -> 0x0156 }
            if (r0 == 0) goto L_0x00bd
            java.lang.String r3 = "intent"
            r0.putString(r9, r3)     // Catch:{ RuntimeException -> 0x0156 }
            boolean r3 = r0.containsKey(r14)     // Catch:{ RuntimeException -> 0x0156 }
            if (r3 != 0) goto L_0x00b1
            if (r6 == 0) goto L_0x00b1
            boolean r3 = r6.containsKey(r14)     // Catch:{ RuntimeException -> 0x0156 }
            if (r3 == 0) goto L_0x00b1
            java.lang.Object[] r3 = new java.lang.Object[r15]     // Catch:{ RuntimeException -> 0x0156 }
            java.lang.String r9 = r6.getString(r14)     // Catch:{ RuntimeException -> 0x0156 }
            r16 = 0
            r3[r16] = r9     // Catch:{ RuntimeException -> 0x0156 }
            java.lang.String r9 = "_cer"
            java.lang.String r15 = "gclid=%s"
            java.lang.String r3 = java.lang.String.format(r15, r3)     // Catch:{ RuntimeException -> 0x0156 }
            r0.putString(r9, r3)     // Catch:{ RuntimeException -> 0x0156 }
        L_0x00b1:
            com.google.android.gms.measurement.internal.i6 r3 = r2.f6025e     // Catch:{ RuntimeException -> 0x0156 }
            r3.t(r4, r7, r0)     // Catch:{ RuntimeException -> 0x0156 }
            com.google.android.gms.measurement.internal.i6 r3 = r2.f6025e     // Catch:{ RuntimeException -> 0x0156 }
            com.google.android.gms.measurement.internal.k9 r3 = r3.f6052n     // Catch:{ RuntimeException -> 0x0156 }
            r3.a(r4, r0)     // Catch:{ RuntimeException -> 0x0156 }
        L_0x00bd:
            boolean r0 = android.text.TextUtils.isEmpty(r5)     // Catch:{ RuntimeException -> 0x0156 }
            if (r0 == 0) goto L_0x00c5
            goto L_0x0145
        L_0x00c5:
            com.google.android.gms.measurement.internal.i6 r0 = r2.f6025e     // Catch:{ RuntimeException -> 0x0156 }
            com.google.android.gms.measurement.internal.n4 r0 = r0.f5994a     // Catch:{ RuntimeException -> 0x0156 }
            com.google.android.gms.measurement.internal.j3 r0 = r0.d()     // Catch:{ RuntimeException -> 0x0156 }
            com.google.android.gms.measurement.internal.h3 r0 = r0.q()     // Catch:{ RuntimeException -> 0x0156 }
            java.lang.String r3 = "Activity created with referrer"
            r0.b(r3, r5)     // Catch:{ RuntimeException -> 0x0156 }
            com.google.android.gms.measurement.internal.i6 r0 = r2.f6025e     // Catch:{ RuntimeException -> 0x0156 }
            com.google.android.gms.measurement.internal.n4 r0 = r0.f5994a     // Catch:{ RuntimeException -> 0x0156 }
            com.google.android.gms.measurement.internal.g r0 = r0.z()     // Catch:{ RuntimeException -> 0x0156 }
            com.google.android.gms.measurement.internal.x2 r3 = com.google.android.gms.measurement.internal.y2.f6617c0     // Catch:{ RuntimeException -> 0x0156 }
            boolean r0 = r0.B(r13, r3)     // Catch:{ RuntimeException -> 0x0156 }
            java.lang.String r3 = "_ldl"
            java.lang.String r9 = "auto"
            if (r0 == 0) goto L_0x0111
            if (r6 == 0) goto L_0x00f9
            com.google.android.gms.measurement.internal.i6 r0 = r2.f6025e     // Catch:{ RuntimeException -> 0x0156 }
            r0.t(r4, r7, r6)     // Catch:{ RuntimeException -> 0x0156 }
            com.google.android.gms.measurement.internal.i6 r0 = r2.f6025e     // Catch:{ RuntimeException -> 0x0156 }
            com.google.android.gms.measurement.internal.k9 r0 = r0.f6052n     // Catch:{ RuntimeException -> 0x0156 }
            r0.a(r4, r6)     // Catch:{ RuntimeException -> 0x0156 }
            goto L_0x010a
        L_0x00f9:
            com.google.android.gms.measurement.internal.i6 r0 = r2.f6025e     // Catch:{ RuntimeException -> 0x0156 }
            com.google.android.gms.measurement.internal.n4 r0 = r0.f5994a     // Catch:{ RuntimeException -> 0x0156 }
            com.google.android.gms.measurement.internal.j3 r0 = r0.d()     // Catch:{ RuntimeException -> 0x0156 }
            com.google.android.gms.measurement.internal.h3 r0 = r0.q()     // Catch:{ RuntimeException -> 0x0156 }
            java.lang.String r4 = "Referrer does not contain valid parameters"
            r0.b(r4, r5)     // Catch:{ RuntimeException -> 0x0156 }
        L_0x010a:
            com.google.android.gms.measurement.internal.i6 r0 = r2.f6025e     // Catch:{ RuntimeException -> 0x0156 }
            r4 = 1
            r0.J(r9, r3, r13, r4)     // Catch:{ RuntimeException -> 0x0156 }
            return
        L_0x0111:
            boolean r0 = r5.contains(r14)     // Catch:{ RuntimeException -> 0x0156 }
            if (r0 == 0) goto L_0x0146
            boolean r0 = r5.contains(r12)     // Catch:{ RuntimeException -> 0x0156 }
            if (r0 != 0) goto L_0x0139
            boolean r0 = r5.contains(r11)     // Catch:{ RuntimeException -> 0x0156 }
            if (r0 != 0) goto L_0x0139
            boolean r0 = r5.contains(r10)     // Catch:{ RuntimeException -> 0x0156 }
            if (r0 != 0) goto L_0x0139
            java.lang.String r0 = "utm_term"
            boolean r0 = r5.contains(r0)     // Catch:{ RuntimeException -> 0x0156 }
            if (r0 != 0) goto L_0x0139
            java.lang.String r0 = "utm_content"
            boolean r0 = r5.contains(r0)     // Catch:{ RuntimeException -> 0x0156 }
            if (r0 == 0) goto L_0x0146
        L_0x0139:
            boolean r0 = android.text.TextUtils.isEmpty(r5)     // Catch:{ RuntimeException -> 0x0156 }
            if (r0 != 0) goto L_0x0145
            com.google.android.gms.measurement.internal.i6 r0 = r2.f6025e     // Catch:{ RuntimeException -> 0x0156 }
            r4 = 1
            r0.J(r9, r3, r5, r4)     // Catch:{ RuntimeException -> 0x0156 }
        L_0x0145:
            return
        L_0x0146:
            com.google.android.gms.measurement.internal.i6 r0 = r2.f6025e     // Catch:{ RuntimeException -> 0x0156 }
            com.google.android.gms.measurement.internal.n4 r0 = r0.f5994a     // Catch:{ RuntimeException -> 0x0156 }
            com.google.android.gms.measurement.internal.j3 r0 = r0.d()     // Catch:{ RuntimeException -> 0x0156 }
            com.google.android.gms.measurement.internal.h3 r0 = r0.q()     // Catch:{ RuntimeException -> 0x0156 }
            r0.a(r8)     // Catch:{ RuntimeException -> 0x0156 }
            return
        L_0x0156:
            r0 = move-exception
            com.google.android.gms.measurement.internal.i6 r2 = r2.f6025e
            com.google.android.gms.measurement.internal.n4 r2 = r2.f5994a
            com.google.android.gms.measurement.internal.j3 r2 = r2.d()
            com.google.android.gms.measurement.internal.h3 r2 = r2.r()
            java.lang.String r3 = "Throwable caught in handleReferrerForOnActivityCreated"
            r2.b(r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.g6.run():void");
    }
}
