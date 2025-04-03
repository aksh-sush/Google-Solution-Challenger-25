package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzej;

final class n9 extends o9 {

    /* renamed from: g  reason: collision with root package name */
    private final zzej f6267g;

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ q9 f6268h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    n9(q9 q9Var, String str, int i10, zzej zzej) {
        super(str, i10);
        this.f6268h = q9Var;
        this.f6267g = zzej;
    }

    /* access modifiers changed from: package-private */
    public final int a() {
        return this.f6267g.zzb();
    }

    /* access modifiers changed from: package-private */
    public final boolean b() {
        return this.f6267g.zzo();
    }

    /* access modifiers changed from: package-private */
    public final boolean c() {
        return false;
    }

    /* JADX WARNING: type inference failed for: r5v3, types: [java.lang.Integer] */
    /* JADX WARNING: type inference failed for: r5v12, types: [java.lang.Integer] */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x010f, code lost:
        if (r2.booleanValue() == false) goto L_0x0111;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0111, code lost:
        r5 = java.lang.Boolean.FALSE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0152, code lost:
        r2.b(r7, r3);
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x03c8  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x03cb  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x03d3 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x03d4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean k(java.lang.Long r16, java.lang.Long r17, com.google.android.gms.internal.measurement.zzfo r18, long r19, com.google.android.gms.measurement.internal.p r21, boolean r22) {
        /*
            r15 = this;
            r0 = r15
            com.google.android.gms.internal.measurement.zzoe.zzc()
            com.google.android.gms.measurement.internal.q9 r1 = r0.f6268h
            com.google.android.gms.measurement.internal.n4 r1 = r1.f5994a
            com.google.android.gms.measurement.internal.g r1 = r1.z()
            java.lang.String r2 = r0.f6296a
            com.google.android.gms.measurement.internal.x2 r3 = com.google.android.gms.measurement.internal.y2.f6613a0
            boolean r1 = r1.B(r2, r3)
            com.google.android.gms.internal.measurement.zzej r2 = r0.f6267g
            boolean r2 = r2.zzn()
            if (r2 == 0) goto L_0x0021
            r2 = r21
            long r2 = r2.f6306e
            goto L_0x0023
        L_0x0021:
            r2 = r19
        L_0x0023:
            com.google.android.gms.measurement.internal.q9 r4 = r0.f6268h
            com.google.android.gms.measurement.internal.n4 r4 = r4.f5994a
            com.google.android.gms.measurement.internal.j3 r4 = r4.d()
            java.lang.String r4 = r4.C()
            r5 = 2
            boolean r4 = android.util.Log.isLoggable(r4, r5)
            r5 = 0
            if (r4 == 0) goto L_0x0093
            com.google.android.gms.measurement.internal.q9 r4 = r0.f6268h
            com.google.android.gms.measurement.internal.n4 r4 = r4.f5994a
            com.google.android.gms.measurement.internal.j3 r4 = r4.d()
            com.google.android.gms.measurement.internal.h3 r4 = r4.v()
            int r6 = r0.f6297b
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            com.google.android.gms.internal.measurement.zzej r7 = r0.f6267g
            boolean r7 = r7.zzp()
            if (r7 == 0) goto L_0x005c
            com.google.android.gms.internal.measurement.zzej r7 = r0.f6267g
            int r7 = r7.zzb()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            goto L_0x005d
        L_0x005c:
            r7 = r5
        L_0x005d:
            com.google.android.gms.measurement.internal.q9 r8 = r0.f6268h
            com.google.android.gms.measurement.internal.n4 r8 = r8.f5994a
            com.google.android.gms.measurement.internal.e3 r8 = r8.D()
            com.google.android.gms.internal.measurement.zzej r9 = r0.f6267g
            java.lang.String r9 = r9.zzg()
            java.lang.String r8 = r8.q(r9)
            java.lang.String r9 = "Evaluating filter. audience, filter, event"
            r4.d(r9, r6, r7, r8)
            com.google.android.gms.measurement.internal.q9 r4 = r0.f6268h
            com.google.android.gms.measurement.internal.n4 r4 = r4.f5994a
            com.google.android.gms.measurement.internal.j3 r4 = r4.d()
            com.google.android.gms.measurement.internal.h3 r4 = r4.v()
            com.google.android.gms.measurement.internal.q9 r6 = r0.f6268h
            com.google.android.gms.measurement.internal.w8 r6 = r6.f6214b
            com.google.android.gms.measurement.internal.y8 r6 = r6.f0()
            com.google.android.gms.internal.measurement.zzej r7 = r0.f6267g
            java.lang.String r6 = r6.F(r7)
            java.lang.String r7 = "Filter definition"
            r4.b(r7, r6)
        L_0x0093:
            com.google.android.gms.internal.measurement.zzej r4 = r0.f6267g
            boolean r4 = r4.zzp()
            r6 = 0
            if (r4 == 0) goto L_0x0418
            com.google.android.gms.internal.measurement.zzej r4 = r0.f6267g
            int r4 = r4.zzb()
            r7 = 256(0x100, float:3.59E-43)
            if (r4 <= r7) goto L_0x00a8
            goto L_0x0418
        L_0x00a8:
            com.google.android.gms.internal.measurement.zzej r4 = r0.f6267g
            boolean r4 = r4.zzk()
            com.google.android.gms.internal.measurement.zzej r7 = r0.f6267g
            boolean r7 = r7.zzm()
            com.google.android.gms.internal.measurement.zzej r8 = r0.f6267g
            boolean r8 = r8.zzn()
            r9 = 1
            if (r4 != 0) goto L_0x00c4
            if (r7 != 0) goto L_0x00c4
            if (r8 == 0) goto L_0x00c2
            goto L_0x00c4
        L_0x00c2:
            r4 = 0
            goto L_0x00c5
        L_0x00c4:
            r4 = 1
        L_0x00c5:
            if (r22 == 0) goto L_0x00f3
            if (r4 != 0) goto L_0x00f3
            com.google.android.gms.measurement.internal.q9 r1 = r0.f6268h
            com.google.android.gms.measurement.internal.n4 r1 = r1.f5994a
            com.google.android.gms.measurement.internal.j3 r1 = r1.d()
            com.google.android.gms.measurement.internal.h3 r1 = r1.v()
            int r2 = r0.f6297b
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            com.google.android.gms.internal.measurement.zzej r3 = r0.f6267g
            boolean r3 = r3.zzp()
            if (r3 == 0) goto L_0x00ed
            com.google.android.gms.internal.measurement.zzej r3 = r0.f6267g
            int r3 = r3.zzb()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)
        L_0x00ed:
            java.lang.String r3 = "Event filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID"
            r1.c(r3, r2, r5)
            return r9
        L_0x00f3:
            com.google.android.gms.internal.measurement.zzej r7 = r0.f6267g
            java.lang.String r8 = r18.zzh()
            boolean r10 = r7.zzo()
            if (r10 == 0) goto L_0x0115
            com.google.android.gms.internal.measurement.zzeq r10 = r7.zzf()
            java.lang.Boolean r2 = com.google.android.gms.measurement.internal.o9.h(r2, r10)
            if (r2 != 0) goto L_0x010b
            goto L_0x03ba
        L_0x010b:
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto L_0x0115
        L_0x0111:
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            goto L_0x03ba
        L_0x0115:
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            java.util.List r3 = r7.zzh()
            java.util.Iterator r3 = r3.iterator()
        L_0x0122:
            boolean r10 = r3.hasNext()
            if (r10 == 0) goto L_0x015f
            java.lang.Object r10 = r3.next()
            com.google.android.gms.internal.measurement.zzel r10 = (com.google.android.gms.internal.measurement.zzel) r10
            java.lang.String r11 = r10.zze()
            boolean r11 = r11.isEmpty()
            if (r11 == 0) goto L_0x0157
            com.google.android.gms.measurement.internal.q9 r2 = r0.f6268h
            com.google.android.gms.measurement.internal.n4 r2 = r2.f5994a
            com.google.android.gms.measurement.internal.j3 r2 = r2.d()
            com.google.android.gms.measurement.internal.h3 r2 = r2.w()
            com.google.android.gms.measurement.internal.q9 r3 = r0.f6268h
            com.google.android.gms.measurement.internal.n4 r3 = r3.f5994a
            com.google.android.gms.measurement.internal.e3 r3 = r3.D()
            java.lang.String r3 = r3.q(r8)
            java.lang.String r7 = "null or empty param name in filter. event"
        L_0x0152:
            r2.b(r7, r3)
            goto L_0x03ba
        L_0x0157:
            java.lang.String r10 = r10.zze()
            r2.add(r10)
            goto L_0x0122
        L_0x015f:
            androidx.collection.a r3 = new androidx.collection.a
            r3.<init>()
            java.util.List r10 = r18.zzi()
            java.util.Iterator r10 = r10.iterator()
        L_0x016c:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x01f7
            java.lang.Object r11 = r10.next()
            com.google.android.gms.internal.measurement.zzfs r11 = (com.google.android.gms.internal.measurement.zzfs) r11
            java.lang.String r12 = r11.zzg()
            boolean r12 = r2.contains(r12)
            if (r12 == 0) goto L_0x016c
            boolean r12 = r11.zzw()
            if (r12 == 0) goto L_0x019d
            java.lang.String r12 = r11.zzg()
            boolean r13 = r11.zzw()
            if (r13 == 0) goto L_0x019b
            long r13 = r11.zzd()
            java.lang.Long r11 = java.lang.Long.valueOf(r13)
            goto L_0x01c4
        L_0x019b:
            r11 = r5
            goto L_0x01c4
        L_0x019d:
            boolean r12 = r11.zzu()
            if (r12 == 0) goto L_0x01b6
            java.lang.String r12 = r11.zzg()
            boolean r13 = r11.zzu()
            if (r13 == 0) goto L_0x019b
            double r13 = r11.zza()
            java.lang.Double r11 = java.lang.Double.valueOf(r13)
            goto L_0x01c4
        L_0x01b6:
            boolean r12 = r11.zzy()
            if (r12 == 0) goto L_0x01c8
            java.lang.String r12 = r11.zzg()
            java.lang.String r11 = r11.zzh()
        L_0x01c4:
            r3.put(r12, r11)
            goto L_0x016c
        L_0x01c8:
            com.google.android.gms.measurement.internal.q9 r2 = r0.f6268h
            com.google.android.gms.measurement.internal.n4 r2 = r2.f5994a
            com.google.android.gms.measurement.internal.j3 r2 = r2.d()
            com.google.android.gms.measurement.internal.h3 r2 = r2.w()
            com.google.android.gms.measurement.internal.q9 r3 = r0.f6268h
            com.google.android.gms.measurement.internal.n4 r3 = r3.f5994a
            com.google.android.gms.measurement.internal.e3 r3 = r3.D()
            java.lang.String r3 = r3.q(r8)
            com.google.android.gms.measurement.internal.q9 r7 = r0.f6268h
            com.google.android.gms.measurement.internal.n4 r7 = r7.f5994a
            com.google.android.gms.measurement.internal.e3 r7 = r7.D()
            java.lang.String r8 = r11.zzg()
            java.lang.String r7 = r7.r(r8)
            java.lang.String r8 = "Unknown value for param. event, param"
        L_0x01f2:
            r2.c(r8, r3, r7)
            goto L_0x03ba
        L_0x01f7:
            java.util.List r2 = r7.zzh()
            java.util.Iterator r2 = r2.iterator()
        L_0x01ff:
            boolean r7 = r2.hasNext()
            if (r7 == 0) goto L_0x03b8
            java.lang.Object r7 = r2.next()
            com.google.android.gms.internal.measurement.zzel r7 = (com.google.android.gms.internal.measurement.zzel) r7
            boolean r10 = r7.zzh()
            if (r10 == 0) goto L_0x0219
            boolean r10 = r7.zzg()
            if (r10 == 0) goto L_0x0219
            r10 = 1
            goto L_0x021a
        L_0x0219:
            r10 = 0
        L_0x021a:
            java.lang.String r11 = r7.zze()
            boolean r12 = r11.isEmpty()
            if (r12 == 0) goto L_0x0240
            com.google.android.gms.measurement.internal.q9 r2 = r0.f6268h
            com.google.android.gms.measurement.internal.n4 r2 = r2.f5994a
            com.google.android.gms.measurement.internal.j3 r2 = r2.d()
            com.google.android.gms.measurement.internal.h3 r2 = r2.w()
            com.google.android.gms.measurement.internal.q9 r3 = r0.f6268h
            com.google.android.gms.measurement.internal.n4 r3 = r3.f5994a
            com.google.android.gms.measurement.internal.e3 r3 = r3.D()
            java.lang.String r3 = r3.q(r8)
            java.lang.String r7 = "Event has empty param name. event"
            goto L_0x0152
        L_0x0240:
            java.lang.Object r12 = r3.get(r11)
            boolean r13 = r12 instanceof java.lang.Long
            if (r13 == 0) goto L_0x0290
            boolean r13 = r7.zzi()
            if (r13 != 0) goto L_0x0276
            com.google.android.gms.measurement.internal.q9 r2 = r0.f6268h
            com.google.android.gms.measurement.internal.n4 r2 = r2.f5994a
            com.google.android.gms.measurement.internal.j3 r2 = r2.d()
            com.google.android.gms.measurement.internal.h3 r2 = r2.w()
            com.google.android.gms.measurement.internal.q9 r3 = r0.f6268h
            com.google.android.gms.measurement.internal.n4 r3 = r3.f5994a
            com.google.android.gms.measurement.internal.e3 r3 = r3.D()
            java.lang.String r3 = r3.q(r8)
            com.google.android.gms.measurement.internal.q9 r7 = r0.f6268h
            com.google.android.gms.measurement.internal.n4 r7 = r7.f5994a
            com.google.android.gms.measurement.internal.e3 r7 = r7.D()
            java.lang.String r7 = r7.r(r11)
            java.lang.String r8 = "No number filter for long param. event, param"
            goto L_0x01f2
        L_0x0276:
            java.lang.Long r12 = (java.lang.Long) r12
            long r11 = r12.longValue()
            com.google.android.gms.internal.measurement.zzeq r7 = r7.zzc()
            java.lang.Boolean r7 = com.google.android.gms.measurement.internal.o9.h(r11, r7)
            if (r7 != 0) goto L_0x0288
            goto L_0x03ba
        L_0x0288:
            boolean r7 = r7.booleanValue()
            if (r7 != r10) goto L_0x01ff
            goto L_0x0111
        L_0x0290:
            boolean r13 = r12 instanceof java.lang.Double
            if (r13 == 0) goto L_0x02dc
            boolean r13 = r7.zzi()
            if (r13 != 0) goto L_0x02c2
            com.google.android.gms.measurement.internal.q9 r2 = r0.f6268h
            com.google.android.gms.measurement.internal.n4 r2 = r2.f5994a
            com.google.android.gms.measurement.internal.j3 r2 = r2.d()
            com.google.android.gms.measurement.internal.h3 r2 = r2.w()
            com.google.android.gms.measurement.internal.q9 r3 = r0.f6268h
            com.google.android.gms.measurement.internal.n4 r3 = r3.f5994a
            com.google.android.gms.measurement.internal.e3 r3 = r3.D()
            java.lang.String r3 = r3.q(r8)
            com.google.android.gms.measurement.internal.q9 r7 = r0.f6268h
            com.google.android.gms.measurement.internal.n4 r7 = r7.f5994a
            com.google.android.gms.measurement.internal.e3 r7 = r7.D()
            java.lang.String r7 = r7.r(r11)
            java.lang.String r8 = "No number filter for double param. event, param"
            goto L_0x01f2
        L_0x02c2:
            java.lang.Double r12 = (java.lang.Double) r12
            double r11 = r12.doubleValue()
            com.google.android.gms.internal.measurement.zzeq r7 = r7.zzc()
            java.lang.Boolean r7 = com.google.android.gms.measurement.internal.o9.g(r11, r7)
            if (r7 != 0) goto L_0x02d4
            goto L_0x03ba
        L_0x02d4:
            boolean r7 = r7.booleanValue()
            if (r7 != r10) goto L_0x01ff
            goto L_0x0111
        L_0x02dc:
            boolean r13 = r12 instanceof java.lang.String
            if (r13 == 0) goto L_0x036b
            boolean r13 = r7.zzk()
            if (r13 == 0) goto L_0x02f9
            java.lang.String r12 = (java.lang.String) r12
            com.google.android.gms.internal.measurement.zzex r7 = r7.zzd()
            com.google.android.gms.measurement.internal.q9 r11 = r0.f6268h
            com.google.android.gms.measurement.internal.n4 r11 = r11.f5994a
            com.google.android.gms.measurement.internal.j3 r11 = r11.d()
            java.lang.Boolean r7 = com.google.android.gms.measurement.internal.o9.f(r12, r7, r11)
            goto L_0x030f
        L_0x02f9:
            boolean r13 = r7.zzi()
            if (r13 == 0) goto L_0x0343
            java.lang.String r12 = (java.lang.String) r12
            boolean r13 = com.google.android.gms.measurement.internal.y8.P(r12)
            if (r13 == 0) goto L_0x031b
            com.google.android.gms.internal.measurement.zzeq r7 = r7.zzc()
            java.lang.Boolean r7 = com.google.android.gms.measurement.internal.o9.i(r12, r7)
        L_0x030f:
            if (r7 != 0) goto L_0x0313
            goto L_0x03ba
        L_0x0313:
            boolean r7 = r7.booleanValue()
            if (r7 != r10) goto L_0x01ff
            goto L_0x0111
        L_0x031b:
            com.google.android.gms.measurement.internal.q9 r2 = r0.f6268h
            com.google.android.gms.measurement.internal.n4 r2 = r2.f5994a
            com.google.android.gms.measurement.internal.j3 r2 = r2.d()
            com.google.android.gms.measurement.internal.h3 r2 = r2.w()
            com.google.android.gms.measurement.internal.q9 r3 = r0.f6268h
            com.google.android.gms.measurement.internal.n4 r3 = r3.f5994a
            com.google.android.gms.measurement.internal.e3 r3 = r3.D()
            java.lang.String r3 = r3.q(r8)
            com.google.android.gms.measurement.internal.q9 r7 = r0.f6268h
            com.google.android.gms.measurement.internal.n4 r7 = r7.f5994a
            com.google.android.gms.measurement.internal.e3 r7 = r7.D()
            java.lang.String r7 = r7.r(r11)
            java.lang.String r8 = "Invalid param value for number filter. event, param"
            goto L_0x01f2
        L_0x0343:
            com.google.android.gms.measurement.internal.q9 r2 = r0.f6268h
            com.google.android.gms.measurement.internal.n4 r2 = r2.f5994a
            com.google.android.gms.measurement.internal.j3 r2 = r2.d()
            com.google.android.gms.measurement.internal.h3 r2 = r2.w()
            com.google.android.gms.measurement.internal.q9 r3 = r0.f6268h
            com.google.android.gms.measurement.internal.n4 r3 = r3.f5994a
            com.google.android.gms.measurement.internal.e3 r3 = r3.D()
            java.lang.String r3 = r3.q(r8)
            com.google.android.gms.measurement.internal.q9 r7 = r0.f6268h
            com.google.android.gms.measurement.internal.n4 r7 = r7.f5994a
            com.google.android.gms.measurement.internal.e3 r7 = r7.D()
            java.lang.String r7 = r7.r(r11)
            java.lang.String r8 = "No filter for String param. event, param"
            goto L_0x01f2
        L_0x036b:
            com.google.android.gms.measurement.internal.q9 r2 = r0.f6268h
            com.google.android.gms.measurement.internal.n4 r2 = r2.f5994a
            com.google.android.gms.measurement.internal.j3 r2 = r2.d()
            if (r12 != 0) goto L_0x0398
            com.google.android.gms.measurement.internal.h3 r2 = r2.v()
            com.google.android.gms.measurement.internal.q9 r3 = r0.f6268h
            com.google.android.gms.measurement.internal.n4 r3 = r3.f5994a
            com.google.android.gms.measurement.internal.e3 r3 = r3.D()
            java.lang.String r3 = r3.q(r8)
            com.google.android.gms.measurement.internal.q9 r5 = r0.f6268h
            com.google.android.gms.measurement.internal.n4 r5 = r5.f5994a
            com.google.android.gms.measurement.internal.e3 r5 = r5.D()
            java.lang.String r5 = r5.r(r11)
            java.lang.String r7 = "Missing param for filter. event, param"
            r2.c(r7, r3, r5)
            goto L_0x0111
        L_0x0398:
            com.google.android.gms.measurement.internal.h3 r2 = r2.w()
            com.google.android.gms.measurement.internal.q9 r3 = r0.f6268h
            com.google.android.gms.measurement.internal.n4 r3 = r3.f5994a
            com.google.android.gms.measurement.internal.e3 r3 = r3.D()
            java.lang.String r3 = r3.q(r8)
            com.google.android.gms.measurement.internal.q9 r7 = r0.f6268h
            com.google.android.gms.measurement.internal.n4 r7 = r7.f5994a
            com.google.android.gms.measurement.internal.e3 r7 = r7.D()
            java.lang.String r7 = r7.r(r11)
            java.lang.String r8 = "Unknown param type. event, param"
            goto L_0x01f2
        L_0x03b8:
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
        L_0x03ba:
            com.google.android.gms.measurement.internal.q9 r2 = r0.f6268h
            com.google.android.gms.measurement.internal.n4 r2 = r2.f5994a
            com.google.android.gms.measurement.internal.j3 r2 = r2.d()
            com.google.android.gms.measurement.internal.h3 r2 = r2.v()
            if (r5 != 0) goto L_0x03cb
            java.lang.String r3 = "null"
            goto L_0x03cc
        L_0x03cb:
            r3 = r5
        L_0x03cc:
            java.lang.String r7 = "Event filter result"
            r2.b(r7, r3)
            if (r5 != 0) goto L_0x03d4
            return r6
        L_0x03d4:
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            r0.f6298c = r2
            boolean r3 = r5.booleanValue()
            if (r3 != 0) goto L_0x03df
            return r9
        L_0x03df:
            r0.f6299d = r2
            if (r4 == 0) goto L_0x0417
            boolean r2 = r18.zzu()
            if (r2 == 0) goto L_0x0417
            long r2 = r18.zzd()
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            com.google.android.gms.internal.measurement.zzej r3 = r0.f6267g
            boolean r3 = r3.zzm()
            if (r3 == 0) goto L_0x0409
            if (r1 == 0) goto L_0x0406
            com.google.android.gms.internal.measurement.zzej r1 = r0.f6267g
            boolean r1 = r1.zzo()
            if (r1 != 0) goto L_0x0404
            goto L_0x0406
        L_0x0404:
            r2 = r16
        L_0x0406:
            r0.f6301f = r2
            goto L_0x0417
        L_0x0409:
            if (r1 == 0) goto L_0x0415
            com.google.android.gms.internal.measurement.zzej r1 = r0.f6267g
            boolean r1 = r1.zzo()
            if (r1 == 0) goto L_0x0415
            r2 = r17
        L_0x0415:
            r0.f6300e = r2
        L_0x0417:
            return r9
        L_0x0418:
            com.google.android.gms.measurement.internal.q9 r1 = r0.f6268h
            com.google.android.gms.measurement.internal.n4 r1 = r1.f5994a
            com.google.android.gms.measurement.internal.j3 r1 = r1.d()
            com.google.android.gms.measurement.internal.h3 r1 = r1.w()
            java.lang.String r2 = r0.f6296a
            java.lang.Object r2 = com.google.android.gms.measurement.internal.j3.z(r2)
            com.google.android.gms.internal.measurement.zzej r3 = r0.f6267g
            boolean r3 = r3.zzp()
            if (r3 == 0) goto L_0x043c
            com.google.android.gms.internal.measurement.zzej r3 = r0.f6267g
            int r3 = r3.zzb()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)
        L_0x043c:
            java.lang.String r3 = java.lang.String.valueOf(r5)
            java.lang.String r4 = "Invalid event filter ID. appId, id"
            r1.c(r4, r2, r3)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.n9.k(java.lang.Long, java.lang.Long, com.google.android.gms.internal.measurement.zzfo, long, com.google.android.gms.measurement.internal.p, boolean):boolean");
    }
}
