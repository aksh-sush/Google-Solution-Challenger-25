package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzes;

final class p9 extends o9 {

    /* renamed from: g  reason: collision with root package name */
    private final zzes f6338g;

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ q9 f6339h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    p9(q9 q9Var, String str, int i10, zzes zzes) {
        super(str, i10);
        this.f6339h = q9Var;
        this.f6338g = zzes;
    }

    /* access modifiers changed from: package-private */
    public final int a() {
        return this.f6338g.zza();
    }

    /* access modifiers changed from: package-private */
    public final boolean b() {
        return false;
    }

    /* access modifiers changed from: package-private */
    public final boolean c() {
        return true;
    }

    /* JADX WARNING: type inference failed for: r2v16, types: [java.lang.Integer] */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0196  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0199  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x01a1 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x01a2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean k(java.lang.Long r11, java.lang.Long r12, com.google.android.gms.internal.measurement.zzgh r13, boolean r14) {
        /*
            r10 = this;
            com.google.android.gms.internal.measurement.zzoe.zzc()
            com.google.android.gms.measurement.internal.q9 r0 = r10.f6339h
            com.google.android.gms.measurement.internal.n4 r0 = r0.f5994a
            com.google.android.gms.measurement.internal.g r0 = r0.z()
            java.lang.String r1 = r10.f6296a
            com.google.android.gms.measurement.internal.x2 r2 = com.google.android.gms.measurement.internal.y2.Y
            boolean r0 = r0.B(r1, r2)
            com.google.android.gms.internal.measurement.zzes r1 = r10.f6338g
            boolean r1 = r1.zzg()
            com.google.android.gms.internal.measurement.zzes r2 = r10.f6338g
            boolean r2 = r2.zzh()
            com.google.android.gms.internal.measurement.zzes r3 = r10.f6338g
            boolean r3 = r3.zzi()
            r4 = 0
            r5 = 1
            if (r1 != 0) goto L_0x0030
            if (r2 != 0) goto L_0x0030
            if (r3 == 0) goto L_0x002e
            goto L_0x0030
        L_0x002e:
            r1 = 0
            goto L_0x0031
        L_0x0030:
            r1 = 1
        L_0x0031:
            r2 = 0
            if (r14 == 0) goto L_0x0060
            if (r1 != 0) goto L_0x0060
            com.google.android.gms.measurement.internal.q9 r11 = r10.f6339h
            com.google.android.gms.measurement.internal.n4 r11 = r11.f5994a
            com.google.android.gms.measurement.internal.j3 r11 = r11.d()
            com.google.android.gms.measurement.internal.h3 r11 = r11.v()
            int r12 = r10.f6297b
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            com.google.android.gms.internal.measurement.zzes r13 = r10.f6338g
            boolean r13 = r13.zzj()
            if (r13 == 0) goto L_0x005a
            com.google.android.gms.internal.measurement.zzes r13 = r10.f6338g
            int r13 = r13.zza()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r13)
        L_0x005a:
            java.lang.String r13 = "Property filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID"
            r11.c(r13, r12, r2)
            return r5
        L_0x0060:
            com.google.android.gms.internal.measurement.zzes r6 = r10.f6338g
            com.google.android.gms.internal.measurement.zzel r6 = r6.zzb()
            boolean r7 = r6.zzg()
            boolean r8 = r13.zzr()
            if (r8 == 0) goto L_0x00ab
            boolean r8 = r6.zzi()
            if (r8 != 0) goto L_0x0099
            com.google.android.gms.measurement.internal.q9 r6 = r10.f6339h
            com.google.android.gms.measurement.internal.n4 r6 = r6.f5994a
            com.google.android.gms.measurement.internal.j3 r6 = r6.d()
            com.google.android.gms.measurement.internal.h3 r6 = r6.w()
            com.google.android.gms.measurement.internal.q9 r7 = r10.f6339h
            com.google.android.gms.measurement.internal.n4 r7 = r7.f5994a
            com.google.android.gms.measurement.internal.e3 r7 = r7.D()
            java.lang.String r8 = r13.zzf()
            java.lang.String r7 = r7.s(r8)
            java.lang.String r8 = "No number filter for long property. property"
        L_0x0094:
            r6.b(r8, r7)
            goto L_0x0188
        L_0x0099:
            long r8 = r13.zzb()
            com.google.android.gms.internal.measurement.zzeq r2 = r6.zzc()
            java.lang.Boolean r2 = com.google.android.gms.measurement.internal.o9.h(r8, r2)
        L_0x00a5:
            java.lang.Boolean r2 = com.google.android.gms.measurement.internal.o9.j(r2, r7)
            goto L_0x0188
        L_0x00ab:
            boolean r8 = r13.zzq()
            if (r8 == 0) goto L_0x00e3
            boolean r8 = r6.zzi()
            if (r8 != 0) goto L_0x00d6
            com.google.android.gms.measurement.internal.q9 r6 = r10.f6339h
            com.google.android.gms.measurement.internal.n4 r6 = r6.f5994a
            com.google.android.gms.measurement.internal.j3 r6 = r6.d()
            com.google.android.gms.measurement.internal.h3 r6 = r6.w()
            com.google.android.gms.measurement.internal.q9 r7 = r10.f6339h
            com.google.android.gms.measurement.internal.n4 r7 = r7.f5994a
            com.google.android.gms.measurement.internal.e3 r7 = r7.D()
            java.lang.String r8 = r13.zzf()
            java.lang.String r7 = r7.s(r8)
            java.lang.String r8 = "No number filter for double property. property"
            goto L_0x0094
        L_0x00d6:
            double r8 = r13.zza()
            com.google.android.gms.internal.measurement.zzeq r2 = r6.zzc()
            java.lang.Boolean r2 = com.google.android.gms.measurement.internal.o9.g(r8, r2)
            goto L_0x00a5
        L_0x00e3:
            boolean r8 = r13.zzt()
            if (r8 == 0) goto L_0x0168
            boolean r8 = r6.zzk()
            if (r8 != 0) goto L_0x0152
            boolean r8 = r6.zzi()
            if (r8 != 0) goto L_0x0114
            com.google.android.gms.measurement.internal.q9 r6 = r10.f6339h
            com.google.android.gms.measurement.internal.n4 r6 = r6.f5994a
            com.google.android.gms.measurement.internal.j3 r6 = r6.d()
            com.google.android.gms.measurement.internal.h3 r6 = r6.w()
            com.google.android.gms.measurement.internal.q9 r7 = r10.f6339h
            com.google.android.gms.measurement.internal.n4 r7 = r7.f5994a
            com.google.android.gms.measurement.internal.e3 r7 = r7.D()
            java.lang.String r8 = r13.zzf()
            java.lang.String r7 = r7.s(r8)
            java.lang.String r8 = "No string or number filter defined. property"
            goto L_0x0094
        L_0x0114:
            java.lang.String r8 = r13.zzg()
            boolean r8 = com.google.android.gms.measurement.internal.y8.P(r8)
            if (r8 == 0) goto L_0x012c
            java.lang.String r2 = r13.zzg()
            com.google.android.gms.internal.measurement.zzeq r6 = r6.zzc()
            java.lang.Boolean r2 = com.google.android.gms.measurement.internal.o9.i(r2, r6)
            goto L_0x00a5
        L_0x012c:
            com.google.android.gms.measurement.internal.q9 r6 = r10.f6339h
            com.google.android.gms.measurement.internal.n4 r6 = r6.f5994a
            com.google.android.gms.measurement.internal.j3 r6 = r6.d()
            com.google.android.gms.measurement.internal.h3 r6 = r6.w()
            com.google.android.gms.measurement.internal.q9 r7 = r10.f6339h
            com.google.android.gms.measurement.internal.n4 r7 = r7.f5994a
            com.google.android.gms.measurement.internal.e3 r7 = r7.D()
            java.lang.String r8 = r13.zzf()
            java.lang.String r7 = r7.s(r8)
            java.lang.String r8 = r13.zzg()
            java.lang.String r9 = "Invalid user property value for Numeric number filter. property, value"
            r6.c(r9, r7, r8)
            goto L_0x0188
        L_0x0152:
            java.lang.String r2 = r13.zzg()
            com.google.android.gms.internal.measurement.zzex r6 = r6.zzd()
            com.google.android.gms.measurement.internal.q9 r8 = r10.f6339h
            com.google.android.gms.measurement.internal.n4 r8 = r8.f5994a
            com.google.android.gms.measurement.internal.j3 r8 = r8.d()
            java.lang.Boolean r2 = com.google.android.gms.measurement.internal.o9.f(r2, r6, r8)
            goto L_0x00a5
        L_0x0168:
            com.google.android.gms.measurement.internal.q9 r6 = r10.f6339h
            com.google.android.gms.measurement.internal.n4 r6 = r6.f5994a
            com.google.android.gms.measurement.internal.j3 r6 = r6.d()
            com.google.android.gms.measurement.internal.h3 r6 = r6.w()
            com.google.android.gms.measurement.internal.q9 r7 = r10.f6339h
            com.google.android.gms.measurement.internal.n4 r7 = r7.f5994a
            com.google.android.gms.measurement.internal.e3 r7 = r7.D()
            java.lang.String r8 = r13.zzf()
            java.lang.String r7 = r7.s(r8)
            java.lang.String r8 = "User property has no value, property"
            goto L_0x0094
        L_0x0188:
            com.google.android.gms.measurement.internal.q9 r6 = r10.f6339h
            com.google.android.gms.measurement.internal.n4 r6 = r6.f5994a
            com.google.android.gms.measurement.internal.j3 r6 = r6.d()
            com.google.android.gms.measurement.internal.h3 r6 = r6.v()
            if (r2 != 0) goto L_0x0199
            java.lang.String r7 = "null"
            goto L_0x019a
        L_0x0199:
            r7 = r2
        L_0x019a:
            java.lang.String r8 = "Property filter result"
            r6.b(r8, r7)
            if (r2 != 0) goto L_0x01a2
            return r4
        L_0x01a2:
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            r10.f6298c = r4
            if (r3 == 0) goto L_0x01b0
            boolean r3 = r2.booleanValue()
            if (r3 == 0) goto L_0x01af
            goto L_0x01b0
        L_0x01af:
            return r5
        L_0x01b0:
            if (r14 == 0) goto L_0x01ba
            com.google.android.gms.internal.measurement.zzes r14 = r10.f6338g
            boolean r14 = r14.zzg()
            if (r14 == 0) goto L_0x01bc
        L_0x01ba:
            r10.f6299d = r2
        L_0x01bc:
            boolean r14 = r2.booleanValue()
            if (r14 == 0) goto L_0x0201
            if (r1 == 0) goto L_0x0201
            boolean r14 = r13.zzs()
            if (r14 == 0) goto L_0x0201
            long r13 = r13.zzc()
            if (r11 == 0) goto L_0x01d4
            long r13 = r11.longValue()
        L_0x01d4:
            if (r0 == 0) goto L_0x01ec
            com.google.android.gms.internal.measurement.zzes r11 = r10.f6338g
            boolean r11 = r11.zzg()
            if (r11 == 0) goto L_0x01ec
            com.google.android.gms.internal.measurement.zzes r11 = r10.f6338g
            boolean r11 = r11.zzh()
            if (r11 != 0) goto L_0x01ec
            if (r12 == 0) goto L_0x01ec
            long r13 = r12.longValue()
        L_0x01ec:
            com.google.android.gms.internal.measurement.zzes r11 = r10.f6338g
            boolean r11 = r11.zzh()
            if (r11 == 0) goto L_0x01fb
            java.lang.Long r11 = java.lang.Long.valueOf(r13)
            r10.f6301f = r11
            goto L_0x0201
        L_0x01fb:
            java.lang.Long r11 = java.lang.Long.valueOf(r13)
            r10.f6300e = r11
        L_0x0201:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.p9.k(java.lang.Long, java.lang.Long, com.google.android.gms.internal.measurement.zzgh, boolean):boolean");
    }
}
