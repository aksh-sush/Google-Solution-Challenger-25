package com.google.android.gms.measurement.internal;

import a4.e;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.internal.measurement.zzcl;
import com.google.android.gms.internal.measurement.zzfn;
import com.google.android.gms.internal.measurement.zzfo;
import com.google.android.gms.internal.measurement.zzfr;
import com.google.android.gms.internal.measurement.zzfs;
import com.google.android.gms.internal.measurement.zzfx;
import com.google.android.gms.internal.measurement.zzgg;
import com.google.android.gms.internal.measurement.zzgh;
import com.google.android.gms.internal.measurement.zzna;
import com.google.android.gms.internal.measurement.zzoq;
import com.google.android.gms.internal.measurement.zzpx;
import h4.a;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class w8 implements i5 {
    private static volatile w8 C;
    private final Map A;
    private final c9 B = new u8(this);

    /* renamed from: a  reason: collision with root package name */
    private final h4 f6559a;

    /* renamed from: b  reason: collision with root package name */
    private final o3 f6560b;

    /* renamed from: c  reason: collision with root package name */
    private j f6561c;

    /* renamed from: d  reason: collision with root package name */
    private q3 f6562d;

    /* renamed from: e  reason: collision with root package name */
    private l8 f6563e;

    /* renamed from: f  reason: collision with root package name */
    private q9 f6564f;

    /* renamed from: g  reason: collision with root package name */
    private final y8 f6565g;

    /* renamed from: h  reason: collision with root package name */
    private n6 f6566h;

    /* renamed from: i  reason: collision with root package name */
    private w7 f6567i;

    /* renamed from: j  reason: collision with root package name */
    private final o8 f6568j;

    /* renamed from: k  reason: collision with root package name */
    private a4 f6569k;
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public final n4 f6570l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f6571m = false;

    /* renamed from: n  reason: collision with root package name */
    private boolean f6572n;

    /* renamed from: o  reason: collision with root package name */
    long f6573o;

    /* renamed from: p  reason: collision with root package name */
    private List f6574p;

    /* renamed from: q  reason: collision with root package name */
    private int f6575q;

    /* renamed from: r  reason: collision with root package name */
    private int f6576r;

    /* renamed from: s  reason: collision with root package name */
    private boolean f6577s;

    /* renamed from: t  reason: collision with root package name */
    private boolean f6578t;

    /* renamed from: u  reason: collision with root package name */
    private boolean f6579u;

    /* renamed from: v  reason: collision with root package name */
    private FileLock f6580v;

    /* renamed from: w  reason: collision with root package name */
    private FileChannel f6581w;

    /* renamed from: x  reason: collision with root package name */
    private List f6582x;

    /* renamed from: y  reason: collision with root package name */
    private List f6583y;

    /* renamed from: z  reason: collision with root package name */
    private long f6584z;

    w8(x8 x8Var, n4 n4Var) {
        s.k(x8Var);
        this.f6570l = n4.H(x8Var.f6608a, (zzcl) null, (Long) null);
        this.f6584z = -1;
        this.f6568j = new o8(this);
        y8 y8Var = new y8(this);
        y8Var.j();
        this.f6565g = y8Var;
        o3 o3Var = new o3(this);
        o3Var.j();
        this.f6560b = o3Var;
        h4 h4Var = new h4(this);
        h4Var.j();
        this.f6559a = h4Var;
        this.A = new HashMap();
        b().z(new p8(this, x8Var));
    }

    static final void D(zzfn zzfn, int i10, String str) {
        List<zzfs> zzp = zzfn.zzp();
        int i11 = 0;
        while (i11 < zzp.size()) {
            if (!"_err".equals(zzp.get(i11).zzg())) {
                i11++;
            } else {
                return;
            }
        }
        zzfr zze = zzfs.zze();
        zze.zzj("_err");
        zze.zzi(Long.valueOf((long) i10).longValue());
        zzfr zze2 = zzfs.zze();
        zze2.zzj("_ev");
        zze2.zzk(str);
        zzfn.zzf((zzfs) zze.zzaA());
        zzfn.zzf((zzfs) zze2.zzaA());
    }

    static final void E(zzfn zzfn, String str) {
        List<zzfs> zzp = zzfn.zzp();
        for (int i10 = 0; i10 < zzp.size(); i10++) {
            if (str.equals(zzp.get(i10).zzg())) {
                zzfn.zzh(i10);
                return;
            }
        }
    }

    private final i9 G(String str) {
        h3 q10;
        String str2;
        Object obj;
        String str3 = str;
        j jVar = this.f6561c;
        Q(jVar);
        u4 T = jVar.T(str3);
        if (T == null || TextUtils.isEmpty(T.h0())) {
            q10 = d().q();
            str2 = "No app data available; dropping";
            obj = str3;
        } else {
            Boolean H = H(T);
            if (H == null || H.booleanValue()) {
                String k02 = T.k0();
                String h02 = T.h0();
                long M = T.M();
                String g02 = T.g0();
                long X = T.X();
                long U = T.U();
                boolean K = T.K();
                String i02 = T.i0();
                long A2 = T.A();
                boolean J = T.J();
                String c02 = T.c0();
                Boolean b02 = T.b0();
                long V = T.V();
                List c10 = T.c();
                zzoq.zzc();
                return new i9(str, k02, h02, M, g02, X, U, (String) null, K, false, i02, A2, 0, 0, J, false, c02, b02, V, c10, T().B(str3, y2.f6623f0) ? T.j0() : null, U(str).i());
            }
            q10 = d().r();
            str2 = "App version does not match; dropping. appId";
            obj = j3.z(str);
        }
        q10.b(str2, obj);
        return null;
    }

    private final Boolean H(u4 u4Var) {
        try {
            if (u4Var.M() != -2147483648L) {
                if (u4Var.M() == ((long) e.a(this.f6570l.c()).e(u4Var.e0(), 0).versionCode)) {
                    return Boolean.TRUE;
                }
            } else {
                String str = e.a(this.f6570l.c()).e(u4Var.e0(), 0).versionName;
                String h02 = u4Var.h0();
                if (h02 != null && h02.equals(str)) {
                    return Boolean.TRUE;
                }
            }
            return Boolean.FALSE;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    private final void I() {
        b().h();
        if (this.f6577s || this.f6578t || this.f6579u) {
            d().v().d("Not stopping services. fetch, network, upload", Boolean.valueOf(this.f6577s), Boolean.valueOf(this.f6578t), Boolean.valueOf(this.f6579u));
            return;
        }
        d().v().a("Stopping uploading service(s)");
        List<Runnable> list = this.f6574p;
        if (list != null) {
            for (Runnable run : list) {
                run.run();
            }
            ((List) s.k(this.f6574p)).clear();
        }
    }

    private final void J(zzfx zzfx, long j10, boolean z10) {
        zzfx zzfx2 = zzfx;
        boolean z11 = z10;
        String str = true != z11 ? "_lte" : "_se";
        j jVar = this.f6561c;
        Q(jVar);
        b9 Z = jVar.Z(zzfx.zzal(), str);
        b9 b9Var = (Z == null || Z.f5872e == null) ? new b9(zzfx.zzal(), "auto", str, e().currentTimeMillis(), Long.valueOf(j10)) : new b9(zzfx.zzal(), "auto", str, e().currentTimeMillis(), Long.valueOf(((Long) Z.f5872e).longValue() + j10));
        zzgg zzd = zzgh.zzd();
        zzd.zzf(str);
        zzd.zzg(e().currentTimeMillis());
        zzd.zze(((Long) b9Var.f5872e).longValue());
        zzgh zzgh = (zzgh) zzd.zzaA();
        int x10 = y8.x(zzfx2, str);
        if (x10 >= 0) {
            zzfx2.zzai(x10, zzgh);
        } else {
            zzfx2.zzl(zzgh);
        }
        if (j10 > 0) {
            j jVar2 = this.f6561c;
            Q(jVar2);
            jVar2.z(b9Var);
            d().v().c("Updated engagement user property. scope, value", true != z11 ? "lifetime" : "session-scoped", b9Var.f5872e);
        }
    }

    private final void K(zzfn zzfn, zzfn zzfn2) {
        s.a("_e".equals(zzfn.zzo()));
        Q(this.f6565g);
        zzfs o10 = y8.o((zzfo) zzfn.zzaA(), "_et");
        if (o10 != null && o10.zzw() && o10.zzd() > 0) {
            long zzd = o10.zzd();
            Q(this.f6565g);
            zzfs o11 = y8.o((zzfo) zzfn2.zzaA(), "_et");
            if (o11 != null && o11.zzd() > 0) {
                zzd += o11.zzd();
            }
            Q(this.f6565g);
            y8.m(zzfn2, "_et", Long.valueOf(zzd));
            Q(this.f6565g);
            y8.m(zzfn, "_fr", 1L);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:47:0x0177  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x021c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void L() {
        /*
            r20 = this;
            r0 = r20
            com.google.android.gms.measurement.internal.l4 r1 = r20.b()
            r1.h()
            r20.g()
            long r1 = r0.f6573o
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L_0x004e
            y3.e r1 = r20.e()
            long r1 = r1.a()
            long r5 = r0.f6573o
            long r1 = r1 - r5
            long r1 = java.lang.Math.abs(r1)
            r5 = 3600000(0x36ee80, double:1.7786363E-317)
            long r5 = r5 - r1
            int r1 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r1 <= 0) goto L_0x004c
            com.google.android.gms.measurement.internal.j3 r1 = r20.d()
            com.google.android.gms.measurement.internal.h3 r1 = r1.v()
            java.lang.String r2 = "Upload has been suspended. Will update scheduling later in approximately ms"
            java.lang.Long r3 = java.lang.Long.valueOf(r5)
            r1.b(r2, r3)
            com.google.android.gms.measurement.internal.q3 r1 = r20.Y()
            r1.c()
            com.google.android.gms.measurement.internal.l8 r1 = r0.f6563e
            Q(r1)
            r1.m()
            return
        L_0x004c:
            r0.f6573o = r3
        L_0x004e:
            com.google.android.gms.measurement.internal.n4 r1 = r0.f6570l
            boolean r1 = r1.r()
            if (r1 == 0) goto L_0x0239
            boolean r1 = r20.O()
            if (r1 != 0) goto L_0x005e
            goto L_0x0239
        L_0x005e:
            y3.e r1 = r20.e()
            long r1 = r1.currentTimeMillis()
            r20.T()
            com.google.android.gms.measurement.internal.x2 r5 = com.google.android.gms.measurement.internal.y2.B
            r6 = 0
            java.lang.Object r5 = r5.a(r6)
            java.lang.Long r5 = (java.lang.Long) r5
            long r7 = r5.longValue()
            long r7 = java.lang.Math.max(r3, r7)
            com.google.android.gms.measurement.internal.j r5 = r0.f6561c
            Q(r5)
            boolean r5 = r5.u()
            r10 = 1
            if (r5 != 0) goto L_0x0093
            com.google.android.gms.measurement.internal.j r5 = r0.f6561c
            Q(r5)
            boolean r5 = r5.t()
            if (r5 == 0) goto L_0x0092
            goto L_0x0093
        L_0x0092:
            r10 = 0
        L_0x0093:
            if (r10 == 0) goto L_0x00b7
            com.google.android.gms.measurement.internal.g r5 = r20.T()
            java.lang.String r5 = r5.u()
            boolean r11 = android.text.TextUtils.isEmpty(r5)
            if (r11 != 0) goto L_0x00b1
            java.lang.String r11 = ".none."
            boolean r5 = r11.equals(r5)
            if (r5 != 0) goto L_0x00b1
            r20.T()
            com.google.android.gms.measurement.internal.x2 r5 = com.google.android.gms.measurement.internal.y2.f6656w
            goto L_0x00bc
        L_0x00b1:
            r20.T()
            com.google.android.gms.measurement.internal.x2 r5 = com.google.android.gms.measurement.internal.y2.f6654v
            goto L_0x00bc
        L_0x00b7:
            r20.T()
            com.google.android.gms.measurement.internal.x2 r5 = com.google.android.gms.measurement.internal.y2.f6652u
        L_0x00bc:
            java.lang.Object r5 = r5.a(r6)
            java.lang.Long r5 = (java.lang.Long) r5
            long r11 = r5.longValue()
            long r11 = java.lang.Math.max(r3, r11)
            com.google.android.gms.measurement.internal.w7 r5 = r0.f6567i
            com.google.android.gms.measurement.internal.t3 r5 = r5.f6556i
            long r13 = r5.a()
            com.google.android.gms.measurement.internal.w7 r5 = r0.f6567i
            com.google.android.gms.measurement.internal.t3 r5 = r5.f6557j
            long r15 = r5.a()
            com.google.android.gms.measurement.internal.j r5 = r0.f6561c
            Q(r5)
            r17 = r10
            long r9 = r5.O()
            com.google.android.gms.measurement.internal.j r5 = r0.f6561c
            Q(r5)
            r18 = r7
            long r6 = r5.P()
            long r5 = java.lang.Math.max(r9, r6)
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 != 0) goto L_0x00fb
        L_0x00f8:
            r7 = r3
            goto L_0x0173
        L_0x00fb:
            long r5 = r5 - r1
            long r5 = java.lang.Math.abs(r5)
            long r5 = r1 - r5
            long r13 = r13 - r1
            long r7 = java.lang.Math.abs(r13)
            long r15 = r15 - r1
            long r9 = java.lang.Math.abs(r15)
            long r9 = r1 - r9
            long r1 = r1 - r7
            long r1 = java.lang.Math.max(r1, r9)
            long r7 = r5 + r18
            if (r17 == 0) goto L_0x0120
            int r13 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r13 <= 0) goto L_0x0120
            long r7 = java.lang.Math.min(r5, r1)
            long r7 = r7 + r11
        L_0x0120:
            com.google.android.gms.measurement.internal.y8 r13 = r0.f6565g
            Q(r13)
            boolean r13 = r13.O(r1, r11)
            if (r13 != 0) goto L_0x012d
            long r7 = r1 + r11
        L_0x012d:
            int r1 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r1 == 0) goto L_0x0173
            int r1 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r1 < 0) goto L_0x0173
            r1 = 0
        L_0x0136:
            r20.T()
            com.google.android.gms.measurement.internal.x2 r2 = com.google.android.gms.measurement.internal.y2.D
            r5 = 0
            java.lang.Object r2 = r2.a(r5)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r6 = 0
            int r2 = java.lang.Math.max(r6, r2)
            r11 = 20
            int r2 = java.lang.Math.min(r11, r2)
            if (r1 >= r2) goto L_0x00f8
            r20.T()
            com.google.android.gms.measurement.internal.x2 r2 = com.google.android.gms.measurement.internal.y2.C
            java.lang.Object r2 = r2.a(r5)
            java.lang.Long r2 = (java.lang.Long) r2
            long r11 = r2.longValue()
            long r11 = java.lang.Math.max(r3, r11)
            r13 = 1
            long r13 = r13 << r1
            long r11 = r11 * r13
            long r7 = r7 + r11
            int r2 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r2 > 0) goto L_0x0173
            int r1 = r1 + 1
            goto L_0x0136
        L_0x0173:
            int r1 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r1 == 0) goto L_0x021c
            com.google.android.gms.measurement.internal.o3 r1 = r0.f6560b
            Q(r1)
            boolean r1 = r1.n()
            if (r1 == 0) goto L_0x01ff
            com.google.android.gms.measurement.internal.w7 r1 = r0.f6567i
            com.google.android.gms.measurement.internal.t3 r1 = r1.f6555h
            long r1 = r1.a()
            r20.T()
            com.google.android.gms.measurement.internal.x2 r5 = com.google.android.gms.measurement.internal.y2.f6648s
            r6 = 0
            java.lang.Object r5 = r5.a(r6)
            java.lang.Long r5 = (java.lang.Long) r5
            long r5 = r5.longValue()
            long r5 = java.lang.Math.max(r3, r5)
            com.google.android.gms.measurement.internal.y8 r9 = r0.f6565g
            Q(r9)
            boolean r9 = r9.O(r1, r5)
            if (r9 != 0) goto L_0x01ae
            long r1 = r1 + r5
            long r7 = java.lang.Math.max(r7, r1)
        L_0x01ae:
            com.google.android.gms.measurement.internal.q3 r1 = r20.Y()
            r1.c()
            y3.e r1 = r20.e()
            long r1 = r1.currentTimeMillis()
            long r7 = r7 - r1
            int r1 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r1 > 0) goto L_0x01e5
            r20.T()
            com.google.android.gms.measurement.internal.x2 r1 = com.google.android.gms.measurement.internal.y2.f6658x
            r2 = 0
            java.lang.Object r1 = r1.a(r2)
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            long r7 = java.lang.Math.max(r3, r1)
            com.google.android.gms.measurement.internal.w7 r1 = r0.f6567i
            com.google.android.gms.measurement.internal.t3 r1 = r1.f6556i
            y3.e r2 = r20.e()
            long r2 = r2.currentTimeMillis()
            r1.b(r2)
        L_0x01e5:
            com.google.android.gms.measurement.internal.j3 r1 = r20.d()
            com.google.android.gms.measurement.internal.h3 r1 = r1.v()
            java.lang.String r2 = "Upload scheduled in approximately ms"
            java.lang.Long r3 = java.lang.Long.valueOf(r7)
            r1.b(r2, r3)
            com.google.android.gms.measurement.internal.l8 r1 = r0.f6563e
            Q(r1)
            r1.n(r7)
            return
        L_0x01ff:
            com.google.android.gms.measurement.internal.j3 r1 = r20.d()
            com.google.android.gms.measurement.internal.h3 r1 = r1.v()
            java.lang.String r2 = "No network"
            r1.a(r2)
            com.google.android.gms.measurement.internal.q3 r1 = r20.Y()
            r1.b()
            com.google.android.gms.measurement.internal.l8 r1 = r0.f6563e
            Q(r1)
            r1.m()
            return
        L_0x021c:
            com.google.android.gms.measurement.internal.j3 r1 = r20.d()
            com.google.android.gms.measurement.internal.h3 r1 = r1.v()
            java.lang.String r2 = "Next upload time is 0"
            r1.a(r2)
            com.google.android.gms.measurement.internal.q3 r1 = r20.Y()
            r1.c()
            com.google.android.gms.measurement.internal.l8 r1 = r0.f6563e
            Q(r1)
            r1.m()
            return
        L_0x0239:
            com.google.android.gms.measurement.internal.j3 r1 = r20.d()
            com.google.android.gms.measurement.internal.h3 r1 = r1.v()
            java.lang.String r2 = "Nothing to upload or uploading impossible"
            r1.a(r2)
            com.google.android.gms.measurement.internal.q3 r1 = r20.Y()
            r1.c()
            com.google.android.gms.measurement.internal.l8 r1 = r0.f6563e
            Q(r1)
            r1.m()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.w8.L():void");
    }

    private final boolean M(i9 i9Var) {
        zzoq.zzc();
        return T().B(i9Var.f6059e, y2.f6623f0) ? !TextUtils.isEmpty(i9Var.f6060f) || !TextUtils.isEmpty(i9Var.f6079y) || !TextUtils.isEmpty(i9Var.f6075u) : !TextUtils.isEmpty(i9Var.f6060f) || !TextUtils.isEmpty(i9Var.f6075u);
    }

    /* JADX WARNING: Removed duplicated region for block: B:115:0x03c9 A[Catch:{ NumberFormatException -> 0x095d, all -> 0x0d63 }] */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x048d A[Catch:{ NumberFormatException -> 0x095d, all -> 0x0d63 }] */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x04f1 A[Catch:{ NumberFormatException -> 0x095d, all -> 0x0d63 }] */
    /* JADX WARNING: Removed duplicated region for block: B:210:0x0649 A[Catch:{ NumberFormatException -> 0x095d, all -> 0x0d63 }] */
    /* JADX WARNING: Removed duplicated region for block: B:212:0x0661 A[Catch:{ NumberFormatException -> 0x095d, all -> 0x0d63 }] */
    /* JADX WARNING: Removed duplicated region for block: B:321:0x0996 A[Catch:{ NumberFormatException -> 0x095d, all -> 0x0d63 }] */
    /* JADX WARNING: Removed duplicated region for block: B:333:0x09df A[Catch:{ NumberFormatException -> 0x095d, all -> 0x0d63 }] */
    /* JADX WARNING: Removed duplicated region for block: B:334:0x09ff A[Catch:{ NumberFormatException -> 0x095d, all -> 0x0d63 }] */
    /* JADX WARNING: Removed duplicated region for block: B:342:0x0a76 A[Catch:{ NumberFormatException -> 0x095d, all -> 0x0d63 }] */
    /* JADX WARNING: Removed duplicated region for block: B:343:0x0a78 A[Catch:{ NumberFormatException -> 0x095d, all -> 0x0d63 }] */
    /* JADX WARNING: Removed duplicated region for block: B:346:0x0a80 A[Catch:{ NumberFormatException -> 0x095d, all -> 0x0d63 }] */
    /* JADX WARNING: Removed duplicated region for block: B:355:0x0aa9 A[Catch:{ NumberFormatException -> 0x095d, all -> 0x0d63 }] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:441:0x0d51=Splitter:B:441:0x0d51, B:68:0x01ff=Splitter:B:68:0x01ff} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean N(java.lang.String r45, long r46) {
        /*
            r44 = this;
            r1 = r44
            java.lang.String r2 = "_sc"
            java.lang.String r3 = "_sn"
            java.lang.String r4 = "_npa"
            java.lang.String r5 = "_ai"
            com.google.android.gms.measurement.internal.j r6 = r1.f6561c
            Q(r6)
            r6.g0()
            com.google.android.gms.measurement.internal.v8 r6 = new com.google.android.gms.measurement.internal.v8     // Catch:{ all -> 0x0d63 }
            r14 = 0
            r6.<init>(r1, r14)     // Catch:{ all -> 0x0d63 }
            com.google.android.gms.measurement.internal.j r7 = r1.f6561c     // Catch:{ all -> 0x0d63 }
            Q(r7)     // Catch:{ all -> 0x0d63 }
            r8 = 0
            long r11 = r1.f6584z     // Catch:{ all -> 0x0d63 }
            r9 = r46
            r13 = r6
            r7.I(r8, r9, r11, r13)     // Catch:{ all -> 0x0d63 }
            java.util.List r7 = r6.f6509c     // Catch:{ all -> 0x0d63 }
            if (r7 == 0) goto L_0x0d51
            boolean r7 = r7.isEmpty()     // Catch:{ all -> 0x0d63 }
            if (r7 == 0) goto L_0x0032
            goto L_0x0d51
        L_0x0032:
            com.google.android.gms.internal.measurement.zzfy r7 = r6.f6507a     // Catch:{ all -> 0x0d63 }
            com.google.android.gms.internal.measurement.zzjv r7 = r7.zzbv()     // Catch:{ all -> 0x0d63 }
            com.google.android.gms.internal.measurement.zzfx r7 = (com.google.android.gms.internal.measurement.zzfx) r7     // Catch:{ all -> 0x0d63 }
            r7.zzp()     // Catch:{ all -> 0x0d63 }
            com.google.android.gms.measurement.internal.g r9 = r44.T()     // Catch:{ all -> 0x0d63 }
            com.google.android.gms.internal.measurement.zzfy r10 = r6.f6507a     // Catch:{ all -> 0x0d63 }
            java.lang.String r10 = r10.zzy()     // Catch:{ all -> 0x0d63 }
            com.google.android.gms.measurement.internal.x2 r11 = com.google.android.gms.measurement.internal.y2.V     // Catch:{ all -> 0x0d63 }
            boolean r9 = r9.B(r10, r11)     // Catch:{ all -> 0x0d63 }
            r18 = r14
            r19 = r18
            r8 = -1
            r13 = 0
            r14 = -1
            r15 = 0
            r17 = 0
            r20 = 0
        L_0x005a:
            java.util.List r10 = r6.f6509c     // Catch:{ all -> 0x0d63 }
            int r10 = r10.size()     // Catch:{ all -> 0x0d63 }
            java.lang.String r11 = "_fr"
            java.lang.String r12 = "_et"
            r21 = r4
            java.lang.String r4 = "_e"
            r22 = r2
            r23 = r3
            if (r13 >= r10) goto L_0x06b6
            java.util.List r3 = r6.f6509c     // Catch:{ all -> 0x0d63 }
            java.lang.Object r3 = r3.get(r13)     // Catch:{ all -> 0x0d63 }
            com.google.android.gms.internal.measurement.zzfo r3 = (com.google.android.gms.internal.measurement.zzfo) r3     // Catch:{ all -> 0x0d63 }
            com.google.android.gms.internal.measurement.zzjv r3 = r3.zzbv()     // Catch:{ all -> 0x0d63 }
            com.google.android.gms.internal.measurement.zzfn r3 = (com.google.android.gms.internal.measurement.zzfn) r3     // Catch:{ all -> 0x0d63 }
            com.google.android.gms.measurement.internal.h4 r10 = r1.f6559a     // Catch:{ all -> 0x0d63 }
            Q(r10)     // Catch:{ all -> 0x0d63 }
            com.google.android.gms.internal.measurement.zzfy r2 = r6.f6507a     // Catch:{ all -> 0x0d63 }
            java.lang.String r2 = r2.zzy()     // Catch:{ all -> 0x0d63 }
            r26 = r13
            java.lang.String r13 = r3.zzo()     // Catch:{ all -> 0x0d63 }
            boolean r2 = r10.x(r2, r13)     // Catch:{ all -> 0x0d63 }
            java.lang.String r10 = "_err"
            if (r2 == 0) goto L_0x0112
            com.google.android.gms.measurement.internal.j3 r2 = r44.d()     // Catch:{ all -> 0x0d63 }
            com.google.android.gms.measurement.internal.h3 r2 = r2.w()     // Catch:{ all -> 0x0d63 }
            java.lang.String r4 = "Dropping blocked raw event. appId"
            com.google.android.gms.internal.measurement.zzfy r11 = r6.f6507a     // Catch:{ all -> 0x0d63 }
            java.lang.String r11 = r11.zzy()     // Catch:{ all -> 0x0d63 }
            java.lang.Object r11 = com.google.android.gms.measurement.internal.j3.z(r11)     // Catch:{ all -> 0x0d63 }
            com.google.android.gms.measurement.internal.n4 r12 = r1.f6570l     // Catch:{ all -> 0x0d63 }
            com.google.android.gms.measurement.internal.e3 r12 = r12.D()     // Catch:{ all -> 0x0d63 }
            java.lang.String r13 = r3.zzo()     // Catch:{ all -> 0x0d63 }
            java.lang.String r12 = r12.q(r13)     // Catch:{ all -> 0x0d63 }
            r2.c(r4, r11, r12)     // Catch:{ all -> 0x0d63 }
            com.google.android.gms.measurement.internal.h4 r2 = r1.f6559a     // Catch:{ all -> 0x0d63 }
            Q(r2)     // Catch:{ all -> 0x0d63 }
            com.google.android.gms.internal.measurement.zzfy r4 = r6.f6507a     // Catch:{ all -> 0x0d63 }
            java.lang.String r4 = r4.zzy()     // Catch:{ all -> 0x0d63 }
            boolean r2 = r2.v(r4)     // Catch:{ all -> 0x0d63 }
            if (r2 != 0) goto L_0x0102
            com.google.android.gms.measurement.internal.h4 r2 = r1.f6559a     // Catch:{ all -> 0x0d63 }
            Q(r2)     // Catch:{ all -> 0x0d63 }
            com.google.android.gms.internal.measurement.zzfy r4 = r6.f6507a     // Catch:{ all -> 0x0d63 }
            java.lang.String r4 = r4.zzy()     // Catch:{ all -> 0x0d63 }
            boolean r2 = r2.y(r4)     // Catch:{ all -> 0x0d63 }
            if (r2 == 0) goto L_0x00dd
            goto L_0x0102
        L_0x00dd:
            java.lang.String r2 = r3.zzo()     // Catch:{ all -> 0x0d63 }
            boolean r2 = r10.equals(r2)     // Catch:{ all -> 0x0d63 }
            if (r2 != 0) goto L_0x0102
            com.google.android.gms.measurement.internal.d9 r27 = r44.g0()     // Catch:{ all -> 0x0d63 }
            com.google.android.gms.measurement.internal.c9 r2 = r1.B     // Catch:{ all -> 0x0d63 }
            com.google.android.gms.internal.measurement.zzfy r4 = r6.f6507a     // Catch:{ all -> 0x0d63 }
            java.lang.String r29 = r4.zzy()     // Catch:{ all -> 0x0d63 }
            r30 = 11
            java.lang.String r31 = "_ev"
            java.lang.String r32 = r3.zzo()     // Catch:{ all -> 0x0d63 }
            r33 = 0
            r28 = r2
            r27.A(r28, r29, r30, r31, r32, r33)     // Catch:{ all -> 0x0d63 }
        L_0x0102:
            r28 = r5
            r5 = r7
            r2 = r14
            r29 = r15
            r14 = r22
            r11 = r23
            r16 = r9
            r9 = r26
            goto L_0x06a3
        L_0x0112:
            java.lang.String r2 = r3.zzo()     // Catch:{ all -> 0x0d63 }
            java.lang.String r13 = h4.n.a(r5)     // Catch:{ all -> 0x0d63 }
            boolean r2 = r2.equals(r13)     // Catch:{ all -> 0x0d63 }
            if (r2 == 0) goto L_0x0188
            r3.zzi(r5)     // Catch:{ all -> 0x0d63 }
            com.google.android.gms.measurement.internal.j3 r2 = r44.d()     // Catch:{ all -> 0x0d63 }
            com.google.android.gms.measurement.internal.h3 r2 = r2.v()     // Catch:{ all -> 0x0d63 }
            java.lang.String r13 = "Renaming ad_impression to _ai"
            r2.a(r13)     // Catch:{ all -> 0x0d63 }
            com.google.android.gms.measurement.internal.j3 r2 = r44.d()     // Catch:{ all -> 0x0d63 }
            java.lang.String r2 = r2.C()     // Catch:{ all -> 0x0d63 }
            r13 = 5
            boolean r2 = android.util.Log.isLoggable(r2, r13)     // Catch:{ all -> 0x0d63 }
            if (r2 == 0) goto L_0x0188
            r2 = 0
        L_0x0140:
            int r13 = r3.zza()     // Catch:{ all -> 0x0d63 }
            if (r2 >= r13) goto L_0x0188
            java.lang.String r13 = "ad_platform"
            com.google.android.gms.internal.measurement.zzfs r27 = r3.zzn(r2)     // Catch:{ all -> 0x0d63 }
            r28 = r5
            java.lang.String r5 = r27.zzg()     // Catch:{ all -> 0x0d63 }
            boolean r5 = r13.equals(r5)     // Catch:{ all -> 0x0d63 }
            if (r5 == 0) goto L_0x0183
            com.google.android.gms.internal.measurement.zzfs r5 = r3.zzn(r2)     // Catch:{ all -> 0x0d63 }
            java.lang.String r5 = r5.zzh()     // Catch:{ all -> 0x0d63 }
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x0d63 }
            if (r5 != 0) goto L_0x0183
            java.lang.String r5 = "admob"
            com.google.android.gms.internal.measurement.zzfs r13 = r3.zzn(r2)     // Catch:{ all -> 0x0d63 }
            java.lang.String r13 = r13.zzh()     // Catch:{ all -> 0x0d63 }
            boolean r5 = r5.equalsIgnoreCase(r13)     // Catch:{ all -> 0x0d63 }
            if (r5 == 0) goto L_0x0183
            com.google.android.gms.measurement.internal.j3 r5 = r44.d()     // Catch:{ all -> 0x0d63 }
            com.google.android.gms.measurement.internal.h3 r5 = r5.x()     // Catch:{ all -> 0x0d63 }
            java.lang.String r13 = "AdMob ad impression logged from app. Potentially duplicative."
            r5.a(r13)     // Catch:{ all -> 0x0d63 }
        L_0x0183:
            int r2 = r2 + 1
            r5 = r28
            goto L_0x0140
        L_0x0188:
            r28 = r5
            com.google.android.gms.measurement.internal.h4 r2 = r1.f6559a     // Catch:{ all -> 0x0d63 }
            Q(r2)     // Catch:{ all -> 0x0d63 }
            com.google.android.gms.internal.measurement.zzfy r5 = r6.f6507a     // Catch:{ all -> 0x0d63 }
            java.lang.String r5 = r5.zzy()     // Catch:{ all -> 0x0d63 }
            java.lang.String r13 = r3.zzo()     // Catch:{ all -> 0x0d63 }
            boolean r2 = r2.w(r5, r13)     // Catch:{ all -> 0x0d63 }
            java.lang.String r5 = "_c"
            if (r2 != 0) goto L_0x01f6
            com.google.android.gms.measurement.internal.y8 r13 = r1.f6565g     // Catch:{ all -> 0x0d63 }
            Q(r13)     // Catch:{ all -> 0x0d63 }
            java.lang.String r13 = r3.zzo()     // Catch:{ all -> 0x0d63 }
            com.google.android.gms.common.internal.s.g(r13)     // Catch:{ all -> 0x0d63 }
            r29 = r15
            int r15 = r13.hashCode()     // Catch:{ all -> 0x0d63 }
            r16 = r9
            r9 = 94660(0x171c4, float:1.32647E-40)
            r27 = r14
            r14 = 2
            if (r15 == r9) goto L_0x01dc
            r9 = 95025(0x17331, float:1.33158E-40)
            if (r15 == r9) goto L_0x01d2
            r9 = 95027(0x17333, float:1.33161E-40)
            if (r15 == r9) goto L_0x01c8
            goto L_0x01e6
        L_0x01c8:
            java.lang.String r9 = "_ui"
            boolean r9 = r13.equals(r9)
            if (r9 == 0) goto L_0x01e6
            r9 = 1
            goto L_0x01e7
        L_0x01d2:
            java.lang.String r9 = "_ug"
            boolean r9 = r13.equals(r9)
            if (r9 == 0) goto L_0x01e6
            r9 = 2
            goto L_0x01e7
        L_0x01dc:
            java.lang.String r9 = "_in"
            boolean r9 = r13.equals(r9)
            if (r9 == 0) goto L_0x01e6
            r9 = 0
            goto L_0x01e7
        L_0x01e6:
            r9 = -1
        L_0x01e7:
            if (r9 == 0) goto L_0x01fc
            r13 = 1
            if (r9 == r13) goto L_0x01fc
            if (r9 == r14) goto L_0x01fc
            r15 = r7
            r32 = r8
            r31 = r12
            r2 = 0
            goto L_0x03c7
        L_0x01f6:
            r27 = r14
            r29 = r15
            r16 = r9
        L_0x01fc:
            r9 = 0
            r13 = 0
            r14 = 0
        L_0x01ff:
            int r15 = r3.zza()     // Catch:{ all -> 0x0d63 }
            r31 = r12
            java.lang.String r12 = "_r"
            if (r9 >= r15) goto L_0x026a
            com.google.android.gms.internal.measurement.zzfs r15 = r3.zzn(r9)     // Catch:{ all -> 0x0d63 }
            java.lang.String r15 = r15.zzg()     // Catch:{ all -> 0x0d63 }
            boolean r15 = r5.equals(r15)     // Catch:{ all -> 0x0d63 }
            if (r15 == 0) goto L_0x0235
            com.google.android.gms.internal.measurement.zzfs r12 = r3.zzn(r9)     // Catch:{ all -> 0x0d63 }
            com.google.android.gms.internal.measurement.zzjv r12 = r12.zzbv()     // Catch:{ all -> 0x0d63 }
            com.google.android.gms.internal.measurement.zzfr r12 = (com.google.android.gms.internal.measurement.zzfr) r12     // Catch:{ all -> 0x0d63 }
            r15 = r7
            r32 = r8
            r7 = 1
            r12.zzi(r7)     // Catch:{ all -> 0x0d63 }
            com.google.android.gms.internal.measurement.zzjz r7 = r12.zzaA()     // Catch:{ all -> 0x0d63 }
            com.google.android.gms.internal.measurement.zzfs r7 = (com.google.android.gms.internal.measurement.zzfs) r7     // Catch:{ all -> 0x0d63 }
            r3.zzk(r9, r7)     // Catch:{ all -> 0x0d63 }
            r8 = r15
            r13 = 1
            goto L_0x0262
        L_0x0235:
            r15 = r7
            r32 = r8
            com.google.android.gms.internal.measurement.zzfs r7 = r3.zzn(r9)     // Catch:{ all -> 0x0d63 }
            java.lang.String r7 = r7.zzg()     // Catch:{ all -> 0x0d63 }
            boolean r7 = r12.equals(r7)     // Catch:{ all -> 0x0d63 }
            if (r7 == 0) goto L_0x0261
            com.google.android.gms.internal.measurement.zzfs r7 = r3.zzn(r9)     // Catch:{ all -> 0x0d63 }
            com.google.android.gms.internal.measurement.zzjv r7 = r7.zzbv()     // Catch:{ all -> 0x0d63 }
            com.google.android.gms.internal.measurement.zzfr r7 = (com.google.android.gms.internal.measurement.zzfr) r7     // Catch:{ all -> 0x0d63 }
            r8 = r15
            r14 = 1
            r7.zzi(r14)     // Catch:{ all -> 0x0d63 }
            com.google.android.gms.internal.measurement.zzjz r7 = r7.zzaA()     // Catch:{ all -> 0x0d63 }
            com.google.android.gms.internal.measurement.zzfs r7 = (com.google.android.gms.internal.measurement.zzfs) r7     // Catch:{ all -> 0x0d63 }
            r3.zzk(r9, r7)     // Catch:{ all -> 0x0d63 }
            r14 = 1
            goto L_0x0262
        L_0x0261:
            r8 = r15
        L_0x0262:
            int r9 = r9 + 1
            r7 = r8
            r12 = r31
            r8 = r32
            goto L_0x01ff
        L_0x026a:
            r32 = r8
            r8 = r7
            if (r13 != 0) goto L_0x029d
            if (r2 == 0) goto L_0x029d
            com.google.android.gms.measurement.internal.j3 r7 = r44.d()     // Catch:{ all -> 0x0d63 }
            com.google.android.gms.measurement.internal.h3 r7 = r7.v()     // Catch:{ all -> 0x0d63 }
            java.lang.String r9 = "Marking event as conversion"
            com.google.android.gms.measurement.internal.n4 r13 = r1.f6570l     // Catch:{ all -> 0x0d63 }
            com.google.android.gms.measurement.internal.e3 r13 = r13.D()     // Catch:{ all -> 0x0d63 }
            java.lang.String r15 = r3.zzo()     // Catch:{ all -> 0x0d63 }
            java.lang.String r13 = r13.q(r15)     // Catch:{ all -> 0x0d63 }
            r7.b(r9, r13)     // Catch:{ all -> 0x0d63 }
            com.google.android.gms.internal.measurement.zzfr r7 = com.google.android.gms.internal.measurement.zzfs.zze()     // Catch:{ all -> 0x0d63 }
            r7.zzj(r5)     // Catch:{ all -> 0x0d63 }
            r15 = r8
            r8 = 1
            r7.zzi(r8)     // Catch:{ all -> 0x0d63 }
            r3.zze(r7)     // Catch:{ all -> 0x0d63 }
            goto L_0x029e
        L_0x029d:
            r15 = r8
        L_0x029e:
            if (r14 != 0) goto L_0x02ca
            com.google.android.gms.measurement.internal.j3 r7 = r44.d()     // Catch:{ all -> 0x0d63 }
            com.google.android.gms.measurement.internal.h3 r7 = r7.v()     // Catch:{ all -> 0x0d63 }
            java.lang.String r8 = "Marking event as real-time"
            com.google.android.gms.measurement.internal.n4 r9 = r1.f6570l     // Catch:{ all -> 0x0d63 }
            com.google.android.gms.measurement.internal.e3 r9 = r9.D()     // Catch:{ all -> 0x0d63 }
            java.lang.String r13 = r3.zzo()     // Catch:{ all -> 0x0d63 }
            java.lang.String r9 = r9.q(r13)     // Catch:{ all -> 0x0d63 }
            r7.b(r8, r9)     // Catch:{ all -> 0x0d63 }
            com.google.android.gms.internal.measurement.zzfr r7 = com.google.android.gms.internal.measurement.zzfs.zze()     // Catch:{ all -> 0x0d63 }
            r7.zzj(r12)     // Catch:{ all -> 0x0d63 }
            r8 = 1
            r7.zzi(r8)     // Catch:{ all -> 0x0d63 }
            r3.zze(r7)     // Catch:{ all -> 0x0d63 }
        L_0x02ca:
            com.google.android.gms.measurement.internal.j r7 = r1.f6561c     // Catch:{ all -> 0x0d63 }
            Q(r7)     // Catch:{ all -> 0x0d63 }
            long r34 = r44.F()     // Catch:{ all -> 0x0d63 }
            com.google.android.gms.internal.measurement.zzfy r8 = r6.f6507a     // Catch:{ all -> 0x0d63 }
            java.lang.String r36 = r8.zzy()     // Catch:{ all -> 0x0d63 }
            r37 = 0
            r38 = 0
            r39 = 0
            r40 = 0
            r41 = 1
            r33 = r7
            com.google.android.gms.measurement.internal.h r7 = r33.V(r34, r36, r37, r38, r39, r40, r41)     // Catch:{ all -> 0x0d63 }
            long r7 = r7.f6008e     // Catch:{ all -> 0x0d63 }
            com.google.android.gms.measurement.internal.g r9 = r44.T()     // Catch:{ all -> 0x0d63 }
            com.google.android.gms.internal.measurement.zzfy r13 = r6.f6507a     // Catch:{ all -> 0x0d63 }
            java.lang.String r13 = r13.zzy()     // Catch:{ all -> 0x0d63 }
            com.google.android.gms.measurement.internal.x2 r14 = com.google.android.gms.measurement.internal.y2.f6642p     // Catch:{ all -> 0x0d63 }
            int r9 = r9.o(r13, r14)     // Catch:{ all -> 0x0d63 }
            long r13 = (long) r9     // Catch:{ all -> 0x0d63 }
            int r9 = (r7 > r13 ? 1 : (r7 == r13 ? 0 : -1))
            if (r9 <= 0) goto L_0x0304
            E(r3, r12)     // Catch:{ all -> 0x0d63 }
            goto L_0x0306
        L_0x0304:
            r20 = 1
        L_0x0306:
            java.lang.String r7 = r3.zzo()     // Catch:{ all -> 0x0d63 }
            boolean r7 = com.google.android.gms.measurement.internal.d9.W(r7)     // Catch:{ all -> 0x0d63 }
            if (r7 == 0) goto L_0x03c7
            if (r2 == 0) goto L_0x03c7
            com.google.android.gms.measurement.internal.j r7 = r1.f6561c     // Catch:{ all -> 0x0d63 }
            Q(r7)     // Catch:{ all -> 0x0d63 }
            long r34 = r44.F()     // Catch:{ all -> 0x0d63 }
            com.google.android.gms.internal.measurement.zzfy r8 = r6.f6507a     // Catch:{ all -> 0x0d63 }
            java.lang.String r36 = r8.zzy()     // Catch:{ all -> 0x0d63 }
            r37 = 0
            r38 = 0
            r39 = 1
            r40 = 0
            r41 = 0
            r33 = r7
            com.google.android.gms.measurement.internal.h r7 = r33.V(r34, r36, r37, r38, r39, r40, r41)     // Catch:{ all -> 0x0d63 }
            long r7 = r7.f6006c     // Catch:{ all -> 0x0d63 }
            com.google.android.gms.measurement.internal.g r9 = r44.T()     // Catch:{ all -> 0x0d63 }
            com.google.android.gms.internal.measurement.zzfy r12 = r6.f6507a     // Catch:{ all -> 0x0d63 }
            java.lang.String r12 = r12.zzy()     // Catch:{ all -> 0x0d63 }
            com.google.android.gms.measurement.internal.x2 r13 = com.google.android.gms.measurement.internal.y2.f6640o     // Catch:{ all -> 0x0d63 }
            int r9 = r9.o(r12, r13)     // Catch:{ all -> 0x0d63 }
            long r12 = (long) r9     // Catch:{ all -> 0x0d63 }
            int r9 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1))
            if (r9 <= 0) goto L_0x03c7
            com.google.android.gms.measurement.internal.j3 r7 = r44.d()     // Catch:{ all -> 0x0d63 }
            com.google.android.gms.measurement.internal.h3 r7 = r7.w()     // Catch:{ all -> 0x0d63 }
            java.lang.String r8 = "Too many conversions. Not logging as conversion. appId"
            com.google.android.gms.internal.measurement.zzfy r9 = r6.f6507a     // Catch:{ all -> 0x0d63 }
            java.lang.String r9 = r9.zzy()     // Catch:{ all -> 0x0d63 }
            java.lang.Object r9 = com.google.android.gms.measurement.internal.j3.z(r9)     // Catch:{ all -> 0x0d63 }
            r7.b(r8, r9)     // Catch:{ all -> 0x0d63 }
            r7 = 0
            r8 = 0
            r9 = 0
            r12 = -1
        L_0x0363:
            int r13 = r3.zza()     // Catch:{ all -> 0x0d63 }
            if (r8 >= r13) goto L_0x038d
            com.google.android.gms.internal.measurement.zzfs r13 = r3.zzn(r8)     // Catch:{ all -> 0x0d63 }
            java.lang.String r14 = r13.zzg()     // Catch:{ all -> 0x0d63 }
            boolean r14 = r5.equals(r14)     // Catch:{ all -> 0x0d63 }
            if (r14 == 0) goto L_0x037f
            com.google.android.gms.internal.measurement.zzjv r7 = r13.zzbv()     // Catch:{ all -> 0x0d63 }
            com.google.android.gms.internal.measurement.zzfr r7 = (com.google.android.gms.internal.measurement.zzfr) r7     // Catch:{ all -> 0x0d63 }
            r12 = r8
            goto L_0x038a
        L_0x037f:
            java.lang.String r13 = r13.zzg()     // Catch:{ all -> 0x0d63 }
            boolean r13 = r10.equals(r13)     // Catch:{ all -> 0x0d63 }
            if (r13 == 0) goto L_0x038a
            r9 = 1
        L_0x038a:
            int r8 = r8 + 1
            goto L_0x0363
        L_0x038d:
            if (r9 == 0) goto L_0x0396
            if (r7 == 0) goto L_0x0395
            r3.zzh(r12)     // Catch:{ all -> 0x0d63 }
            goto L_0x03c7
        L_0x0395:
            r7 = 0
        L_0x0396:
            if (r7 == 0) goto L_0x03b0
            com.google.android.gms.internal.measurement.zzjv r7 = r7.zzaq()     // Catch:{ all -> 0x0d63 }
            com.google.android.gms.internal.measurement.zzfr r7 = (com.google.android.gms.internal.measurement.zzfr) r7     // Catch:{ all -> 0x0d63 }
            r7.zzj(r10)     // Catch:{ all -> 0x0d63 }
            r8 = 10
            r7.zzi(r8)     // Catch:{ all -> 0x0d63 }
            com.google.android.gms.internal.measurement.zzjz r7 = r7.zzaA()     // Catch:{ all -> 0x0d63 }
            com.google.android.gms.internal.measurement.zzfs r7 = (com.google.android.gms.internal.measurement.zzfs) r7     // Catch:{ all -> 0x0d63 }
            r3.zzk(r12, r7)     // Catch:{ all -> 0x0d63 }
            goto L_0x03c7
        L_0x03b0:
            com.google.android.gms.measurement.internal.j3 r7 = r44.d()     // Catch:{ all -> 0x0d63 }
            com.google.android.gms.measurement.internal.h3 r7 = r7.r()     // Catch:{ all -> 0x0d63 }
            java.lang.String r8 = "Did not find conversion parameter. appId"
            com.google.android.gms.internal.measurement.zzfy r9 = r6.f6507a     // Catch:{ all -> 0x0d63 }
            java.lang.String r9 = r9.zzy()     // Catch:{ all -> 0x0d63 }
            java.lang.Object r9 = com.google.android.gms.measurement.internal.j3.z(r9)     // Catch:{ all -> 0x0d63 }
            r7.b(r8, r9)     // Catch:{ all -> 0x0d63 }
        L_0x03c7:
            if (r2 == 0) goto L_0x0480
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x0d63 }
            java.util.List r7 = r3.zzp()     // Catch:{ all -> 0x0d63 }
            r2.<init>(r7)     // Catch:{ all -> 0x0d63 }
            r7 = 0
            r8 = -1
            r9 = -1
        L_0x03d5:
            int r10 = r2.size()     // Catch:{ all -> 0x0d63 }
            java.lang.String r12 = "currency"
            java.lang.String r13 = "value"
            if (r7 >= r10) goto L_0x0405
            java.lang.Object r10 = r2.get(r7)     // Catch:{ all -> 0x0d63 }
            com.google.android.gms.internal.measurement.zzfs r10 = (com.google.android.gms.internal.measurement.zzfs) r10     // Catch:{ all -> 0x0d63 }
            java.lang.String r10 = r10.zzg()     // Catch:{ all -> 0x0d63 }
            boolean r10 = r13.equals(r10)     // Catch:{ all -> 0x0d63 }
            if (r10 == 0) goto L_0x03f1
            r8 = r7
            goto L_0x0402
        L_0x03f1:
            java.lang.Object r10 = r2.get(r7)     // Catch:{ all -> 0x0d63 }
            com.google.android.gms.internal.measurement.zzfs r10 = (com.google.android.gms.internal.measurement.zzfs) r10     // Catch:{ all -> 0x0d63 }
            java.lang.String r10 = r10.zzg()     // Catch:{ all -> 0x0d63 }
            boolean r10 = r12.equals(r10)     // Catch:{ all -> 0x0d63 }
            if (r10 == 0) goto L_0x0402
            r9 = r7
        L_0x0402:
            int r7 = r7 + 1
            goto L_0x03d5
        L_0x0405:
            r7 = -1
            if (r8 != r7) goto L_0x040a
            goto L_0x0481
        L_0x040a:
            java.lang.Object r7 = r2.get(r8)     // Catch:{ all -> 0x0d63 }
            com.google.android.gms.internal.measurement.zzfs r7 = (com.google.android.gms.internal.measurement.zzfs) r7     // Catch:{ all -> 0x0d63 }
            boolean r7 = r7.zzw()     // Catch:{ all -> 0x0d63 }
            if (r7 != 0) goto L_0x043b
            java.lang.Object r7 = r2.get(r8)     // Catch:{ all -> 0x0d63 }
            com.google.android.gms.internal.measurement.zzfs r7 = (com.google.android.gms.internal.measurement.zzfs) r7     // Catch:{ all -> 0x0d63 }
            boolean r7 = r7.zzu()     // Catch:{ all -> 0x0d63 }
            if (r7 != 0) goto L_0x043b
            com.google.android.gms.measurement.internal.j3 r2 = r44.d()     // Catch:{ all -> 0x0d63 }
            com.google.android.gms.measurement.internal.h3 r2 = r2.x()     // Catch:{ all -> 0x0d63 }
            java.lang.String r7 = "Value must be specified with a numeric type."
            r2.a(r7)     // Catch:{ all -> 0x0d63 }
            r3.zzh(r8)     // Catch:{ all -> 0x0d63 }
            E(r3, r5)     // Catch:{ all -> 0x0d63 }
            r2 = 18
            D(r3, r2, r13)     // Catch:{ all -> 0x0d63 }
            goto L_0x0480
        L_0x043b:
            r7 = -1
            if (r9 != r7) goto L_0x043f
            goto L_0x0467
        L_0x043f:
            java.lang.Object r2 = r2.get(r9)     // Catch:{ all -> 0x0d63 }
            com.google.android.gms.internal.measurement.zzfs r2 = (com.google.android.gms.internal.measurement.zzfs) r2     // Catch:{ all -> 0x0d63 }
            java.lang.String r2 = r2.zzh()     // Catch:{ all -> 0x0d63 }
            int r9 = r2.length()     // Catch:{ all -> 0x0d63 }
            r10 = 3
            if (r9 != r10) goto L_0x0467
            r9 = 0
        L_0x0451:
            int r10 = r2.length()     // Catch:{ all -> 0x0d63 }
            if (r9 >= r10) goto L_0x0481
            int r10 = r2.codePointAt(r9)     // Catch:{ all -> 0x0d63 }
            boolean r13 = java.lang.Character.isLetter(r10)     // Catch:{ all -> 0x0d63 }
            if (r13 == 0) goto L_0x0467
            int r10 = java.lang.Character.charCount(r10)     // Catch:{ all -> 0x0d63 }
            int r9 = r9 + r10
            goto L_0x0451
        L_0x0467:
            com.google.android.gms.measurement.internal.j3 r2 = r44.d()     // Catch:{ all -> 0x0d63 }
            com.google.android.gms.measurement.internal.h3 r2 = r2.x()     // Catch:{ all -> 0x0d63 }
            java.lang.String r9 = "Value parameter discarded. You must also supply a 3-letter ISO_4217 currency code in the currency parameter."
            r2.a(r9)     // Catch:{ all -> 0x0d63 }
            r3.zzh(r8)     // Catch:{ all -> 0x0d63 }
            E(r3, r5)     // Catch:{ all -> 0x0d63 }
            r2 = 19
            D(r3, r2, r12)     // Catch:{ all -> 0x0d63 }
            goto L_0x0481
        L_0x0480:
            r7 = -1
        L_0x0481:
            java.lang.String r2 = r3.zzo()     // Catch:{ all -> 0x0d63 }
            boolean r2 = r4.equals(r2)     // Catch:{ all -> 0x0d63 }
            r8 = 1000(0x3e8, double:4.94E-321)
            if (r2 == 0) goto L_0x04f1
            com.google.android.gms.measurement.internal.y8 r2 = r1.f6565g     // Catch:{ all -> 0x0d63 }
            Q(r2)     // Catch:{ all -> 0x0d63 }
            com.google.android.gms.internal.measurement.zzjz r2 = r3.zzaA()     // Catch:{ all -> 0x0d63 }
            com.google.android.gms.internal.measurement.zzfo r2 = (com.google.android.gms.internal.measurement.zzfo) r2     // Catch:{ all -> 0x0d63 }
            com.google.android.gms.internal.measurement.zzfs r2 = com.google.android.gms.measurement.internal.y8.o(r2, r11)     // Catch:{ all -> 0x0d63 }
            if (r2 != 0) goto L_0x04e4
            if (r19 == 0) goto L_0x04d4
            long r10 = r19.zzc()     // Catch:{ all -> 0x0d63 }
            long r12 = r3.zzc()     // Catch:{ all -> 0x0d63 }
            long r10 = r10 - r12
            long r10 = java.lang.Math.abs(r10)     // Catch:{ all -> 0x0d63 }
            int r2 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r2 > 0) goto L_0x04d4
            com.google.android.gms.internal.measurement.zzjv r2 = r19.zzaq()     // Catch:{ all -> 0x0d63 }
            com.google.android.gms.internal.measurement.zzfn r2 = (com.google.android.gms.internal.measurement.zzfn) r2     // Catch:{ all -> 0x0d63 }
            boolean r5 = r1.P(r3, r2)     // Catch:{ all -> 0x0d63 }
            if (r5 == 0) goto L_0x04c9
            r5 = r15
            r12 = r32
            r5.zzO(r12, r2)     // Catch:{ all -> 0x0d63 }
            r14 = r27
            r2 = 0
            r19 = 0
            goto L_0x04cf
        L_0x04c9:
            r5 = r15
            r12 = r32
            r2 = r3
            r14 = r17
        L_0x04cf:
            r18 = r2
            r8 = r12
            r2 = r14
            goto L_0x04dc
        L_0x04d4:
            r5 = r15
            r12 = r32
            r18 = r3
            r8 = r12
            r2 = r17
        L_0x04dc:
            r14 = r22
            r11 = r23
            r10 = r31
            goto L_0x0637
        L_0x04e4:
            r5 = r15
            r12 = r32
            r14 = r22
            r11 = r23
            r8 = r27
            r10 = r31
            goto L_0x0635
        L_0x04f1:
            r5 = r15
            r12 = r32
            java.lang.String r2 = "_vs"
            java.lang.String r10 = r3.zzo()     // Catch:{ all -> 0x0d63 }
            boolean r2 = r2.equals(r10)     // Catch:{ all -> 0x0d63 }
            if (r2 == 0) goto L_0x0557
            com.google.android.gms.measurement.internal.y8 r2 = r1.f6565g     // Catch:{ all -> 0x0d63 }
            Q(r2)     // Catch:{ all -> 0x0d63 }
            com.google.android.gms.internal.measurement.zzjz r2 = r3.zzaA()     // Catch:{ all -> 0x0d63 }
            com.google.android.gms.internal.measurement.zzfo r2 = (com.google.android.gms.internal.measurement.zzfo) r2     // Catch:{ all -> 0x0d63 }
            r10 = r31
            com.google.android.gms.internal.measurement.zzfs r2 = com.google.android.gms.measurement.internal.y8.o(r2, r10)     // Catch:{ all -> 0x0d63 }
            if (r2 != 0) goto L_0x0553
            if (r18 == 0) goto L_0x0546
            long r13 = r18.zzc()     // Catch:{ all -> 0x0d63 }
            long r24 = r3.zzc()     // Catch:{ all -> 0x0d63 }
            long r13 = r13 - r24
            long r13 = java.lang.Math.abs(r13)     // Catch:{ all -> 0x0d63 }
            int r2 = (r13 > r8 ? 1 : (r13 == r8 ? 0 : -1))
            if (r2 > 0) goto L_0x0546
            com.google.android.gms.internal.measurement.zzjv r2 = r18.zzaq()     // Catch:{ all -> 0x0d63 }
            com.google.android.gms.internal.measurement.zzfn r2 = (com.google.android.gms.internal.measurement.zzfn) r2     // Catch:{ all -> 0x0d63 }
            boolean r8 = r1.P(r2, r3)     // Catch:{ all -> 0x0d63 }
            if (r8 == 0) goto L_0x053c
            r8 = r27
            r5.zzO(r8, r2)     // Catch:{ all -> 0x0d63 }
            r2 = 0
            r18 = 0
            goto L_0x0541
        L_0x053c:
            r8 = r27
            r2 = r3
            r12 = r17
        L_0x0541:
            r19 = r2
            r2 = r8
            r8 = r12
            goto L_0x054d
        L_0x0546:
            r8 = r27
            r19 = r3
            r2 = r8
            r8 = r17
        L_0x054d:
            r14 = r22
            r11 = r23
            goto L_0x0637
        L_0x0553:
            r8 = r27
            goto L_0x0631
        L_0x0557:
            r8 = r27
            r10 = r31
            com.google.android.gms.measurement.internal.g r2 = r44.T()     // Catch:{ all -> 0x0d63 }
            com.google.android.gms.internal.measurement.zzfy r9 = r6.f6507a     // Catch:{ all -> 0x0d63 }
            java.lang.String r9 = r9.zzy()     // Catch:{ all -> 0x0d63 }
            com.google.android.gms.measurement.internal.x2 r11 = com.google.android.gms.measurement.internal.y2.f6629i0     // Catch:{ all -> 0x0d63 }
            boolean r2 = r2.B(r9, r11)     // Catch:{ all -> 0x0d63 }
            if (r2 == 0) goto L_0x0631
            java.lang.String r2 = "_ab"
            java.lang.String r9 = r3.zzo()     // Catch:{ all -> 0x0d63 }
            boolean r2 = r2.equals(r9)     // Catch:{ all -> 0x0d63 }
            if (r2 == 0) goto L_0x0631
            com.google.android.gms.measurement.internal.y8 r2 = r1.f6565g     // Catch:{ all -> 0x0d63 }
            Q(r2)     // Catch:{ all -> 0x0d63 }
            com.google.android.gms.internal.measurement.zzjz r2 = r3.zzaA()     // Catch:{ all -> 0x0d63 }
            com.google.android.gms.internal.measurement.zzfo r2 = (com.google.android.gms.internal.measurement.zzfo) r2     // Catch:{ all -> 0x0d63 }
            com.google.android.gms.internal.measurement.zzfs r2 = com.google.android.gms.measurement.internal.y8.o(r2, r10)     // Catch:{ all -> 0x0d63 }
            if (r2 != 0) goto L_0x0631
            if (r18 == 0) goto L_0x0631
            long r13 = r18.zzc()     // Catch:{ all -> 0x0d63 }
            long r24 = r3.zzc()     // Catch:{ all -> 0x0d63 }
            long r13 = r13 - r24
            long r13 = java.lang.Math.abs(r13)     // Catch:{ all -> 0x0d63 }
            r24 = 4000(0xfa0, double:1.9763E-320)
            int r2 = (r13 > r24 ? 1 : (r13 == r24 ? 0 : -1))
            if (r2 > 0) goto L_0x0631
            com.google.android.gms.internal.measurement.zzjv r2 = r18.zzaq()     // Catch:{ all -> 0x0d63 }
            com.google.android.gms.internal.measurement.zzfn r2 = (com.google.android.gms.internal.measurement.zzfn) r2     // Catch:{ all -> 0x0d63 }
            r1.K(r2, r3)     // Catch:{ all -> 0x0d63 }
            java.lang.String r9 = r2.zzo()     // Catch:{ all -> 0x0d63 }
            boolean r9 = r4.equals(r9)     // Catch:{ all -> 0x0d63 }
            com.google.android.gms.common.internal.s.a(r9)     // Catch:{ all -> 0x0d63 }
            com.google.android.gms.measurement.internal.y8 r9 = r1.f6565g     // Catch:{ all -> 0x0d63 }
            Q(r9)     // Catch:{ all -> 0x0d63 }
            com.google.android.gms.internal.measurement.zzjz r9 = r2.zzaA()     // Catch:{ all -> 0x0d63 }
            com.google.android.gms.internal.measurement.zzfo r9 = (com.google.android.gms.internal.measurement.zzfo) r9     // Catch:{ all -> 0x0d63 }
            r11 = r23
            com.google.android.gms.internal.measurement.zzfs r9 = com.google.android.gms.measurement.internal.y8.o(r9, r11)     // Catch:{ all -> 0x0d63 }
            com.google.android.gms.measurement.internal.y8 r13 = r1.f6565g     // Catch:{ all -> 0x0d63 }
            Q(r13)     // Catch:{ all -> 0x0d63 }
            com.google.android.gms.internal.measurement.zzjz r13 = r2.zzaA()     // Catch:{ all -> 0x0d63 }
            com.google.android.gms.internal.measurement.zzfo r13 = (com.google.android.gms.internal.measurement.zzfo) r13     // Catch:{ all -> 0x0d63 }
            r14 = r22
            com.google.android.gms.internal.measurement.zzfs r13 = com.google.android.gms.measurement.internal.y8.o(r13, r14)     // Catch:{ all -> 0x0d63 }
            com.google.android.gms.measurement.internal.y8 r15 = r1.f6565g     // Catch:{ all -> 0x0d63 }
            Q(r15)     // Catch:{ all -> 0x0d63 }
            com.google.android.gms.internal.measurement.zzjz r15 = r2.zzaA()     // Catch:{ all -> 0x0d63 }
            com.google.android.gms.internal.measurement.zzfo r15 = (com.google.android.gms.internal.measurement.zzfo) r15     // Catch:{ all -> 0x0d63 }
            java.lang.String r7 = "_si"
            com.google.android.gms.internal.measurement.zzfs r7 = com.google.android.gms.measurement.internal.y8.o(r15, r7)     // Catch:{ all -> 0x0d63 }
            if (r9 == 0) goto L_0x05ee
            java.lang.String r9 = r9.zzh()     // Catch:{ all -> 0x0d63 }
            goto L_0x05f0
        L_0x05ee:
            java.lang.String r9 = ""
        L_0x05f0:
            boolean r15 = android.text.TextUtils.isEmpty(r9)     // Catch:{ all -> 0x0d63 }
            if (r15 != 0) goto L_0x05fe
            com.google.android.gms.measurement.internal.y8 r15 = r1.f6565g     // Catch:{ all -> 0x0d63 }
            Q(r15)     // Catch:{ all -> 0x0d63 }
            com.google.android.gms.measurement.internal.y8.m(r3, r11, r9)     // Catch:{ all -> 0x0d63 }
        L_0x05fe:
            if (r13 == 0) goto L_0x0605
            java.lang.String r9 = r13.zzh()     // Catch:{ all -> 0x0d63 }
            goto L_0x0607
        L_0x0605:
            java.lang.String r9 = ""
        L_0x0607:
            boolean r13 = android.text.TextUtils.isEmpty(r9)     // Catch:{ all -> 0x0d63 }
            if (r13 != 0) goto L_0x0615
            com.google.android.gms.measurement.internal.y8 r13 = r1.f6565g     // Catch:{ all -> 0x0d63 }
            Q(r13)     // Catch:{ all -> 0x0d63 }
            com.google.android.gms.measurement.internal.y8.m(r3, r14, r9)     // Catch:{ all -> 0x0d63 }
        L_0x0615:
            if (r7 == 0) goto L_0x0629
            com.google.android.gms.measurement.internal.y8 r9 = r1.f6565g     // Catch:{ all -> 0x0d63 }
            Q(r9)     // Catch:{ all -> 0x0d63 }
            java.lang.String r9 = "_si"
            long r22 = r7.zzd()     // Catch:{ all -> 0x0d63 }
            java.lang.Long r7 = java.lang.Long.valueOf(r22)     // Catch:{ all -> 0x0d63 }
            com.google.android.gms.measurement.internal.y8.m(r3, r9, r7)     // Catch:{ all -> 0x0d63 }
        L_0x0629:
            r5.zzO(r8, r2)     // Catch:{ all -> 0x0d63 }
            r2 = r8
            r8 = r12
            r18 = 0
            goto L_0x0637
        L_0x0631:
            r14 = r22
            r11 = r23
        L_0x0635:
            r2 = r8
            r8 = r12
        L_0x0637:
            if (r16 != 0) goto L_0x0691
            java.lang.String r7 = r3.zzo()     // Catch:{ all -> 0x0d63 }
            boolean r4 = r4.equals(r7)     // Catch:{ all -> 0x0d63 }
            if (r4 == 0) goto L_0x0691
            int r4 = r3.zza()     // Catch:{ all -> 0x0d63 }
            if (r4 != 0) goto L_0x0661
            com.google.android.gms.measurement.internal.j3 r4 = r44.d()     // Catch:{ all -> 0x0d63 }
            com.google.android.gms.measurement.internal.h3 r4 = r4.w()     // Catch:{ all -> 0x0d63 }
            java.lang.String r7 = "Engagement event does not contain any parameters. appId"
            com.google.android.gms.internal.measurement.zzfy r9 = r6.f6507a     // Catch:{ all -> 0x0d63 }
            java.lang.String r9 = r9.zzy()     // Catch:{ all -> 0x0d63 }
            java.lang.Object r9 = com.google.android.gms.measurement.internal.j3.z(r9)     // Catch:{ all -> 0x0d63 }
        L_0x065d:
            r4.b(r7, r9)     // Catch:{ all -> 0x0d63 }
            goto L_0x0691
        L_0x0661:
            com.google.android.gms.measurement.internal.y8 r4 = r1.f6565g     // Catch:{ all -> 0x0d63 }
            Q(r4)     // Catch:{ all -> 0x0d63 }
            com.google.android.gms.internal.measurement.zzjz r4 = r3.zzaA()     // Catch:{ all -> 0x0d63 }
            com.google.android.gms.internal.measurement.zzfo r4 = (com.google.android.gms.internal.measurement.zzfo) r4     // Catch:{ all -> 0x0d63 }
            java.lang.Object r4 = com.google.android.gms.measurement.internal.y8.p(r4, r10)     // Catch:{ all -> 0x0d63 }
            java.lang.Long r4 = (java.lang.Long) r4     // Catch:{ all -> 0x0d63 }
            if (r4 != 0) goto L_0x0689
            com.google.android.gms.measurement.internal.j3 r4 = r44.d()     // Catch:{ all -> 0x0d63 }
            com.google.android.gms.measurement.internal.h3 r4 = r4.w()     // Catch:{ all -> 0x0d63 }
            java.lang.String r7 = "Engagement event does not include duration. appId"
            com.google.android.gms.internal.measurement.zzfy r9 = r6.f6507a     // Catch:{ all -> 0x0d63 }
            java.lang.String r9 = r9.zzy()     // Catch:{ all -> 0x0d63 }
            java.lang.Object r9 = com.google.android.gms.measurement.internal.j3.z(r9)     // Catch:{ all -> 0x0d63 }
            goto L_0x065d
        L_0x0689:
            long r9 = r4.longValue()     // Catch:{ all -> 0x0d63 }
            long r9 = r29 + r9
            r29 = r9
        L_0x0691:
            java.util.List r4 = r6.f6509c     // Catch:{ all -> 0x0d63 }
            com.google.android.gms.internal.measurement.zzjz r7 = r3.zzaA()     // Catch:{ all -> 0x0d63 }
            com.google.android.gms.internal.measurement.zzfo r7 = (com.google.android.gms.internal.measurement.zzfo) r7     // Catch:{ all -> 0x0d63 }
            r9 = r26
            r4.set(r9, r7)     // Catch:{ all -> 0x0d63 }
            int r17 = r17 + 1
            r5.zzj(r3)     // Catch:{ all -> 0x0d63 }
        L_0x06a3:
            int r13 = r9 + 1
            r7 = r5
            r3 = r11
            r9 = r16
            r4 = r21
            r5 = r28
            r15 = r29
            r43 = r14
            r14 = r2
            r2 = r43
            goto L_0x005a
        L_0x06b6:
            r5 = r7
            r10 = r12
            r29 = r15
            r16 = r9
            if (r16 == 0) goto L_0x0717
            r3 = r17
            r15 = r29
            r2 = 0
        L_0x06c3:
            if (r2 >= r3) goto L_0x0715
            com.google.android.gms.internal.measurement.zzfo r7 = r5.zze(r2)     // Catch:{ all -> 0x0d63 }
            java.lang.String r8 = r7.zzh()     // Catch:{ all -> 0x0d63 }
            boolean r8 = r4.equals(r8)     // Catch:{ all -> 0x0d63 }
            if (r8 == 0) goto L_0x06e6
            com.google.android.gms.measurement.internal.y8 r8 = r1.f6565g     // Catch:{ all -> 0x0d63 }
            Q(r8)     // Catch:{ all -> 0x0d63 }
            com.google.android.gms.internal.measurement.zzfs r8 = com.google.android.gms.measurement.internal.y8.o(r7, r11)     // Catch:{ all -> 0x0d63 }
            if (r8 == 0) goto L_0x06e6
            r5.zzw(r2)     // Catch:{ all -> 0x0d63 }
            int r3 = r3 + -1
            int r2 = r2 + -1
            goto L_0x0712
        L_0x06e6:
            com.google.android.gms.measurement.internal.y8 r8 = r1.f6565g     // Catch:{ all -> 0x0d63 }
            Q(r8)     // Catch:{ all -> 0x0d63 }
            com.google.android.gms.internal.measurement.zzfs r7 = com.google.android.gms.measurement.internal.y8.o(r7, r10)     // Catch:{ all -> 0x0d63 }
            if (r7 == 0) goto L_0x0712
            boolean r8 = r7.zzw()     // Catch:{ all -> 0x0d63 }
            if (r8 == 0) goto L_0x0700
            long r7 = r7.zzd()     // Catch:{ all -> 0x0d63 }
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x0d63 }
            goto L_0x0701
        L_0x0700:
            r7 = 0
        L_0x0701:
            if (r7 == 0) goto L_0x0712
            long r8 = r7.longValue()     // Catch:{ all -> 0x0d63 }
            r12 = 0
            int r14 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r14 <= 0) goto L_0x0712
            long r7 = r7.longValue()     // Catch:{ all -> 0x0d63 }
            long r15 = r15 + r7
        L_0x0712:
            r7 = 1
            int r2 = r2 + r7
            goto L_0x06c3
        L_0x0715:
            r2 = r15
            goto L_0x0719
        L_0x0717:
            r2 = r29
        L_0x0719:
            r4 = 0
            r1.J(r5, r2, r4)     // Catch:{ all -> 0x0d63 }
            java.util.List r4 = r5.zzao()     // Catch:{ all -> 0x0d63 }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ all -> 0x0d63 }
        L_0x0725:
            boolean r7 = r4.hasNext()     // Catch:{ all -> 0x0d63 }
            java.lang.String r8 = "_se"
            if (r7 == 0) goto L_0x074b
            java.lang.String r7 = "_s"
            java.lang.Object r9 = r4.next()     // Catch:{ all -> 0x0d63 }
            com.google.android.gms.internal.measurement.zzfo r9 = (com.google.android.gms.internal.measurement.zzfo) r9     // Catch:{ all -> 0x0d63 }
            java.lang.String r9 = r9.zzh()     // Catch:{ all -> 0x0d63 }
            boolean r7 = r7.equals(r9)     // Catch:{ all -> 0x0d63 }
            if (r7 == 0) goto L_0x0725
            com.google.android.gms.measurement.internal.j r4 = r1.f6561c     // Catch:{ all -> 0x0d63 }
            Q(r4)     // Catch:{ all -> 0x0d63 }
            java.lang.String r7 = r5.zzal()     // Catch:{ all -> 0x0d63 }
            r4.m(r7, r8)     // Catch:{ all -> 0x0d63 }
        L_0x074b:
            java.lang.String r4 = "_sid"
            int r4 = com.google.android.gms.measurement.internal.y8.x(r5, r4)     // Catch:{ all -> 0x0d63 }
            if (r4 < 0) goto L_0x0758
            r4 = 1
            r1.J(r5, r2, r4)     // Catch:{ all -> 0x0d63 }
            goto L_0x0778
        L_0x0758:
            int r2 = com.google.android.gms.measurement.internal.y8.x(r5, r8)     // Catch:{ all -> 0x0d63 }
            if (r2 < 0) goto L_0x0778
            r5.zzx(r2)     // Catch:{ all -> 0x0d63 }
            com.google.android.gms.measurement.internal.j3 r2 = r44.d()     // Catch:{ all -> 0x0d63 }
            com.google.android.gms.measurement.internal.h3 r2 = r2.r()     // Catch:{ all -> 0x0d63 }
            java.lang.String r3 = "Session engagement user property is in the bundle without session ID. appId"
            com.google.android.gms.internal.measurement.zzfy r4 = r6.f6507a     // Catch:{ all -> 0x0d63 }
            java.lang.String r4 = r4.zzy()     // Catch:{ all -> 0x0d63 }
            java.lang.Object r4 = com.google.android.gms.measurement.internal.j3.z(r4)     // Catch:{ all -> 0x0d63 }
            r2.b(r3, r4)     // Catch:{ all -> 0x0d63 }
        L_0x0778:
            com.google.android.gms.measurement.internal.y8 r2 = r1.f6565g     // Catch:{ all -> 0x0d63 }
            Q(r2)     // Catch:{ all -> 0x0d63 }
            com.google.android.gms.measurement.internal.n4 r3 = r2.f5994a     // Catch:{ all -> 0x0d63 }
            com.google.android.gms.measurement.internal.j3 r3 = r3.d()     // Catch:{ all -> 0x0d63 }
            com.google.android.gms.measurement.internal.h3 r3 = r3.v()     // Catch:{ all -> 0x0d63 }
            java.lang.String r4 = "Checking account type status for ad personalization signals"
            r3.a(r4)     // Catch:{ all -> 0x0d63 }
            com.google.android.gms.measurement.internal.w8 r3 = r2.f6214b     // Catch:{ all -> 0x0d63 }
            com.google.android.gms.measurement.internal.h4 r3 = r3.f6559a     // Catch:{ all -> 0x0d63 }
            Q(r3)     // Catch:{ all -> 0x0d63 }
            java.lang.String r4 = r5.zzal()     // Catch:{ all -> 0x0d63 }
            boolean r3 = r3.t(r4)     // Catch:{ all -> 0x0d63 }
            if (r3 == 0) goto L_0x080f
            com.google.android.gms.measurement.internal.w8 r3 = r2.f6214b     // Catch:{ all -> 0x0d63 }
            com.google.android.gms.measurement.internal.j r3 = r3.f6561c     // Catch:{ all -> 0x0d63 }
            Q(r3)     // Catch:{ all -> 0x0d63 }
            java.lang.String r4 = r5.zzal()     // Catch:{ all -> 0x0d63 }
            com.google.android.gms.measurement.internal.u4 r3 = r3.T(r4)     // Catch:{ all -> 0x0d63 }
            if (r3 == 0) goto L_0x080f
            boolean r3 = r3.J()     // Catch:{ all -> 0x0d63 }
            if (r3 == 0) goto L_0x080f
            com.google.android.gms.measurement.internal.n4 r3 = r2.f5994a     // Catch:{ all -> 0x0d63 }
            com.google.android.gms.measurement.internal.n r3 = r3.A()     // Catch:{ all -> 0x0d63 }
            boolean r3 = r3.s()     // Catch:{ all -> 0x0d63 }
            if (r3 == 0) goto L_0x080f
            com.google.android.gms.measurement.internal.n4 r3 = r2.f5994a     // Catch:{ all -> 0x0d63 }
            com.google.android.gms.measurement.internal.j3 r3 = r3.d()     // Catch:{ all -> 0x0d63 }
            com.google.android.gms.measurement.internal.h3 r3 = r3.q()     // Catch:{ all -> 0x0d63 }
            java.lang.String r4 = "Turning off ad personalization due to account type"
            r3.a(r4)     // Catch:{ all -> 0x0d63 }
            com.google.android.gms.internal.measurement.zzgg r3 = com.google.android.gms.internal.measurement.zzgh.zzd()     // Catch:{ all -> 0x0d63 }
            r4 = r21
            r3.zzf(r4)     // Catch:{ all -> 0x0d63 }
            com.google.android.gms.measurement.internal.n4 r2 = r2.f5994a     // Catch:{ all -> 0x0d63 }
            com.google.android.gms.measurement.internal.n r2 = r2.A()     // Catch:{ all -> 0x0d63 }
            long r7 = r2.o()     // Catch:{ all -> 0x0d63 }
            r3.zzg(r7)     // Catch:{ all -> 0x0d63 }
            r7 = 1
            r3.zze(r7)     // Catch:{ all -> 0x0d63 }
            com.google.android.gms.internal.measurement.zzjz r2 = r3.zzaA()     // Catch:{ all -> 0x0d63 }
            com.google.android.gms.internal.measurement.zzgh r2 = (com.google.android.gms.internal.measurement.zzgh) r2     // Catch:{ all -> 0x0d63 }
            r3 = 0
        L_0x07f1:
            int r7 = r5.zzb()     // Catch:{ all -> 0x0d63 }
            if (r3 >= r7) goto L_0x080c
            com.google.android.gms.internal.measurement.zzgh r7 = r5.zzak(r3)     // Catch:{ all -> 0x0d63 }
            java.lang.String r7 = r7.zzf()     // Catch:{ all -> 0x0d63 }
            boolean r7 = r4.equals(r7)     // Catch:{ all -> 0x0d63 }
            if (r7 == 0) goto L_0x0809
            r5.zzai(r3, r2)     // Catch:{ all -> 0x0d63 }
            goto L_0x080f
        L_0x0809:
            int r3 = r3 + 1
            goto L_0x07f1
        L_0x080c:
            r5.zzl(r2)     // Catch:{ all -> 0x0d63 }
        L_0x080f:
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r5.zzae(r2)     // Catch:{ all -> 0x0d63 }
            r2 = -9223372036854775808
            r5.zzN(r2)     // Catch:{ all -> 0x0d63 }
            r4 = 0
        L_0x081d:
            int r2 = r5.zza()     // Catch:{ all -> 0x0d63 }
            if (r4 >= r2) goto L_0x0850
            com.google.android.gms.internal.measurement.zzfo r2 = r5.zze(r4)     // Catch:{ all -> 0x0d63 }
            long r7 = r2.zzd()     // Catch:{ all -> 0x0d63 }
            long r9 = r5.zzd()     // Catch:{ all -> 0x0d63 }
            int r3 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r3 >= 0) goto L_0x083a
            long r7 = r2.zzd()     // Catch:{ all -> 0x0d63 }
            r5.zzae(r7)     // Catch:{ all -> 0x0d63 }
        L_0x083a:
            long r7 = r2.zzd()     // Catch:{ all -> 0x0d63 }
            long r9 = r5.zzc()     // Catch:{ all -> 0x0d63 }
            int r3 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r3 <= 0) goto L_0x084d
            long r2 = r2.zzd()     // Catch:{ all -> 0x0d63 }
            r5.zzN(r2)     // Catch:{ all -> 0x0d63 }
        L_0x084d:
            int r4 = r4 + 1
            goto L_0x081d
        L_0x0850:
            r5.zzv()     // Catch:{ all -> 0x0d63 }
            r5.zzn()     // Catch:{ all -> 0x0d63 }
            com.google.android.gms.measurement.internal.q9 r7 = r1.f6564f     // Catch:{ all -> 0x0d63 }
            Q(r7)     // Catch:{ all -> 0x0d63 }
            java.lang.String r8 = r5.zzal()     // Catch:{ all -> 0x0d63 }
            java.util.List r9 = r5.zzao()     // Catch:{ all -> 0x0d63 }
            java.util.List r10 = r5.zzap()     // Catch:{ all -> 0x0d63 }
            long r2 = r5.zzd()     // Catch:{ all -> 0x0d63 }
            java.lang.Long r11 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x0d63 }
            long r2 = r5.zzc()     // Catch:{ all -> 0x0d63 }
            java.lang.Long r12 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x0d63 }
            java.util.List r2 = r7.m(r8, r9, r10, r11, r12)     // Catch:{ all -> 0x0d63 }
            r5.zzf(r2)     // Catch:{ all -> 0x0d63 }
            com.google.android.gms.measurement.internal.g r2 = r44.T()     // Catch:{ all -> 0x0d63 }
            com.google.android.gms.internal.measurement.zzfy r3 = r6.f6507a     // Catch:{ all -> 0x0d63 }
            java.lang.String r3 = r3.zzy()     // Catch:{ all -> 0x0d63 }
            boolean r2 = r2.F(r3)     // Catch:{ all -> 0x0d63 }
            if (r2 == 0) goto L_0x0bc2
            java.util.HashMap r2 = new java.util.HashMap     // Catch:{ all -> 0x0d63 }
            r2.<init>()     // Catch:{ all -> 0x0d63 }
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x0d63 }
            r3.<init>()     // Catch:{ all -> 0x0d63 }
            com.google.android.gms.measurement.internal.d9 r4 = r44.g0()     // Catch:{ all -> 0x0d63 }
            java.security.SecureRandom r4 = r4.t()     // Catch:{ all -> 0x0d63 }
            r7 = 0
        L_0x08a1:
            int r8 = r5.zza()     // Catch:{ all -> 0x0d63 }
            if (r7 >= r8) goto L_0x0b89
            com.google.android.gms.internal.measurement.zzfo r8 = r5.zze(r7)     // Catch:{ all -> 0x0d63 }
            com.google.android.gms.internal.measurement.zzjv r8 = r8.zzbv()     // Catch:{ all -> 0x0d63 }
            com.google.android.gms.internal.measurement.zzfn r8 = (com.google.android.gms.internal.measurement.zzfn) r8     // Catch:{ all -> 0x0d63 }
            java.lang.String r9 = r8.zzo()     // Catch:{ all -> 0x0d63 }
            java.lang.String r10 = "_ep"
            boolean r9 = r9.equals(r10)     // Catch:{ all -> 0x0d63 }
            java.lang.String r10 = "_sr"
            if (r9 == 0) goto L_0x0941
            com.google.android.gms.measurement.internal.y8 r9 = r1.f6565g     // Catch:{ all -> 0x0d63 }
            Q(r9)     // Catch:{ all -> 0x0d63 }
            com.google.android.gms.internal.measurement.zzjz r9 = r8.zzaA()     // Catch:{ all -> 0x0d63 }
            com.google.android.gms.internal.measurement.zzfo r9 = (com.google.android.gms.internal.measurement.zzfo) r9     // Catch:{ all -> 0x0d63 }
            java.lang.String r11 = "_en"
            java.lang.Object r9 = com.google.android.gms.measurement.internal.y8.p(r9, r11)     // Catch:{ all -> 0x0d63 }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ all -> 0x0d63 }
            java.lang.Object r11 = r2.get(r9)     // Catch:{ all -> 0x0d63 }
            com.google.android.gms.measurement.internal.p r11 = (com.google.android.gms.measurement.internal.p) r11     // Catch:{ all -> 0x0d63 }
            if (r11 != 0) goto L_0x08f4
            com.google.android.gms.measurement.internal.j r11 = r1.f6561c     // Catch:{ all -> 0x0d63 }
            Q(r11)     // Catch:{ all -> 0x0d63 }
            com.google.android.gms.internal.measurement.zzfy r12 = r6.f6507a     // Catch:{ all -> 0x0d63 }
            java.lang.String r12 = r12.zzy()     // Catch:{ all -> 0x0d63 }
            java.lang.Object r13 = com.google.android.gms.common.internal.s.k(r9)     // Catch:{ all -> 0x0d63 }
            java.lang.String r13 = (java.lang.String) r13     // Catch:{ all -> 0x0d63 }
            com.google.android.gms.measurement.internal.p r11 = r11.X(r12, r13)     // Catch:{ all -> 0x0d63 }
            if (r11 == 0) goto L_0x08f4
            r2.put(r9, r11)     // Catch:{ all -> 0x0d63 }
        L_0x08f4:
            if (r11 == 0) goto L_0x0935
            java.lang.Long r9 = r11.f6310i     // Catch:{ all -> 0x0d63 }
            if (r9 != 0) goto L_0x0935
            java.lang.Long r9 = r11.f6311j     // Catch:{ all -> 0x0d63 }
            if (r9 == 0) goto L_0x0912
            long r12 = r9.longValue()     // Catch:{ all -> 0x0d63 }
            r14 = 1
            int r9 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r9 <= 0) goto L_0x0912
            com.google.android.gms.measurement.internal.y8 r9 = r1.f6565g     // Catch:{ all -> 0x0d63 }
            Q(r9)     // Catch:{ all -> 0x0d63 }
            java.lang.Long r9 = r11.f6311j     // Catch:{ all -> 0x0d63 }
            com.google.android.gms.measurement.internal.y8.m(r8, r10, r9)     // Catch:{ all -> 0x0d63 }
        L_0x0912:
            java.lang.Boolean r9 = r11.f6312k     // Catch:{ all -> 0x0d63 }
            if (r9 == 0) goto L_0x092c
            boolean r9 = r9.booleanValue()     // Catch:{ all -> 0x0d63 }
            if (r9 == 0) goto L_0x092c
            com.google.android.gms.measurement.internal.y8 r9 = r1.f6565g     // Catch:{ all -> 0x0d63 }
            Q(r9)     // Catch:{ all -> 0x0d63 }
            java.lang.String r9 = "_efs"
            r10 = 1
            java.lang.Long r12 = java.lang.Long.valueOf(r10)     // Catch:{ all -> 0x0d63 }
            com.google.android.gms.measurement.internal.y8.m(r8, r9, r12)     // Catch:{ all -> 0x0d63 }
        L_0x092c:
            com.google.android.gms.internal.measurement.zzjz r9 = r8.zzaA()     // Catch:{ all -> 0x0d63 }
            com.google.android.gms.internal.measurement.zzfo r9 = (com.google.android.gms.internal.measurement.zzfo) r9     // Catch:{ all -> 0x0d63 }
            r3.add(r9)     // Catch:{ all -> 0x0d63 }
        L_0x0935:
            r5.zzO(r7, r8)     // Catch:{ all -> 0x0d63 }
            r47 = r4
            r4 = r5
            r16 = r6
            r5 = 1
            goto L_0x0b80
        L_0x0941:
            com.google.android.gms.measurement.internal.h4 r9 = r1.f6559a     // Catch:{ all -> 0x0d63 }
            Q(r9)     // Catch:{ all -> 0x0d63 }
            com.google.android.gms.internal.measurement.zzfy r11 = r6.f6507a     // Catch:{ all -> 0x0d63 }
            java.lang.String r11 = r11.zzy()     // Catch:{ all -> 0x0d63 }
            java.lang.String r12 = "measurement.account.time_zone_offset_minutes"
            java.lang.String r12 = r9.a(r11, r12)     // Catch:{ all -> 0x0d63 }
            boolean r13 = android.text.TextUtils.isEmpty(r12)     // Catch:{ all -> 0x0d63 }
            if (r13 != 0) goto L_0x0972
            long r11 = java.lang.Long.parseLong(r12)     // Catch:{ NumberFormatException -> 0x095d }
            goto L_0x0974
        L_0x095d:
            r0 = move-exception
            r12 = r0
            com.google.android.gms.measurement.internal.n4 r9 = r9.f5994a     // Catch:{ all -> 0x0d63 }
            com.google.android.gms.measurement.internal.j3 r9 = r9.d()     // Catch:{ all -> 0x0d63 }
            com.google.android.gms.measurement.internal.h3 r9 = r9.w()     // Catch:{ all -> 0x0d63 }
            java.lang.String r13 = "Unable to parse timezone offset. appId"
            java.lang.Object r11 = com.google.android.gms.measurement.internal.j3.z(r11)     // Catch:{ all -> 0x0d63 }
            r9.c(r13, r11, r12)     // Catch:{ all -> 0x0d63 }
        L_0x0972:
            r11 = 0
        L_0x0974:
            com.google.android.gms.measurement.internal.d9 r9 = r44.g0()     // Catch:{ all -> 0x0d63 }
            long r13 = r8.zzc()     // Catch:{ all -> 0x0d63 }
            long r13 = r9.s0(r13, r11)     // Catch:{ all -> 0x0d63 }
            com.google.android.gms.internal.measurement.zzjz r9 = r8.zzaA()     // Catch:{ all -> 0x0d63 }
            com.google.android.gms.internal.measurement.zzfo r9 = (com.google.android.gms.internal.measurement.zzfo) r9     // Catch:{ all -> 0x0d63 }
            r17 = r11
            r15 = 1
            java.lang.Long r11 = java.lang.Long.valueOf(r15)     // Catch:{ all -> 0x0d63 }
            java.lang.String r12 = "_dbg"
            boolean r15 = android.text.TextUtils.isEmpty(r12)     // Catch:{ all -> 0x0d63 }
            if (r15 != 0) goto L_0x09ca
            java.util.List r9 = r9.zzi()     // Catch:{ all -> 0x0d63 }
            java.util.Iterator r9 = r9.iterator()     // Catch:{ all -> 0x0d63 }
        L_0x099e:
            boolean r15 = r9.hasNext()     // Catch:{ all -> 0x0d63 }
            if (r15 == 0) goto L_0x09ca
            java.lang.Object r15 = r9.next()     // Catch:{ all -> 0x0d63 }
            com.google.android.gms.internal.measurement.zzfs r15 = (com.google.android.gms.internal.measurement.zzfs) r15     // Catch:{ all -> 0x0d63 }
            r47 = r9
            java.lang.String r9 = r15.zzg()     // Catch:{ all -> 0x0d63 }
            boolean r9 = r12.equals(r9)     // Catch:{ all -> 0x0d63 }
            if (r9 == 0) goto L_0x09c7
            long r15 = r15.zzd()     // Catch:{ all -> 0x0d63 }
            java.lang.Long r9 = java.lang.Long.valueOf(r15)     // Catch:{ all -> 0x0d63 }
            boolean r9 = r11.equals(r9)     // Catch:{ all -> 0x0d63 }
            if (r9 != 0) goto L_0x09c5
            goto L_0x09ca
        L_0x09c5:
            r9 = 1
            goto L_0x09dd
        L_0x09c7:
            r9 = r47
            goto L_0x099e
        L_0x09ca:
            com.google.android.gms.measurement.internal.h4 r9 = r1.f6559a     // Catch:{ all -> 0x0d63 }
            Q(r9)     // Catch:{ all -> 0x0d63 }
            com.google.android.gms.internal.measurement.zzfy r11 = r6.f6507a     // Catch:{ all -> 0x0d63 }
            java.lang.String r11 = r11.zzy()     // Catch:{ all -> 0x0d63 }
            java.lang.String r12 = r8.zzo()     // Catch:{ all -> 0x0d63 }
            int r9 = r9.m(r11, r12)     // Catch:{ all -> 0x0d63 }
        L_0x09dd:
            if (r9 > 0) goto L_0x09ff
            com.google.android.gms.measurement.internal.j3 r10 = r44.d()     // Catch:{ all -> 0x0d63 }
            com.google.android.gms.measurement.internal.h3 r10 = r10.w()     // Catch:{ all -> 0x0d63 }
            java.lang.String r11 = "Sample rate must be positive. event, rate"
            java.lang.String r12 = r8.zzo()     // Catch:{ all -> 0x0d63 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x0d63 }
            r10.c(r11, r12, r9)     // Catch:{ all -> 0x0d63 }
            com.google.android.gms.internal.measurement.zzjz r9 = r8.zzaA()     // Catch:{ all -> 0x0d63 }
            com.google.android.gms.internal.measurement.zzfo r9 = (com.google.android.gms.internal.measurement.zzfo) r9     // Catch:{ all -> 0x0d63 }
            r3.add(r9)     // Catch:{ all -> 0x0d63 }
            goto L_0x0935
        L_0x09ff:
            java.lang.String r11 = r8.zzo()     // Catch:{ all -> 0x0d63 }
            java.lang.Object r11 = r2.get(r11)     // Catch:{ all -> 0x0d63 }
            com.google.android.gms.measurement.internal.p r11 = (com.google.android.gms.measurement.internal.p) r11     // Catch:{ all -> 0x0d63 }
            if (r11 != 0) goto L_0x0a5f
            com.google.android.gms.measurement.internal.j r11 = r1.f6561c     // Catch:{ all -> 0x0d63 }
            Q(r11)     // Catch:{ all -> 0x0d63 }
            com.google.android.gms.internal.measurement.zzfy r12 = r6.f6507a     // Catch:{ all -> 0x0d63 }
            java.lang.String r12 = r12.zzy()     // Catch:{ all -> 0x0d63 }
            java.lang.String r15 = r8.zzo()     // Catch:{ all -> 0x0d63 }
            com.google.android.gms.measurement.internal.p r11 = r11.X(r12, r15)     // Catch:{ all -> 0x0d63 }
            if (r11 != 0) goto L_0x0a5f
            com.google.android.gms.measurement.internal.j3 r11 = r44.d()     // Catch:{ all -> 0x0d63 }
            com.google.android.gms.measurement.internal.h3 r11 = r11.w()     // Catch:{ all -> 0x0d63 }
            java.lang.String r12 = "Event being bundled has no eventAggregate. appId, eventName"
            com.google.android.gms.internal.measurement.zzfy r15 = r6.f6507a     // Catch:{ all -> 0x0d63 }
            java.lang.String r15 = r15.zzy()     // Catch:{ all -> 0x0d63 }
            r21 = r13
            java.lang.String r13 = r8.zzo()     // Catch:{ all -> 0x0d63 }
            r11.c(r12, r15, r13)     // Catch:{ all -> 0x0d63 }
            com.google.android.gms.measurement.internal.p r11 = new com.google.android.gms.measurement.internal.p     // Catch:{ all -> 0x0d63 }
            com.google.android.gms.internal.measurement.zzfy r12 = r6.f6507a     // Catch:{ all -> 0x0d63 }
            java.lang.String r27 = r12.zzy()     // Catch:{ all -> 0x0d63 }
            java.lang.String r28 = r8.zzo()     // Catch:{ all -> 0x0d63 }
            r29 = 1
            r31 = 1
            r33 = 1
            long r35 = r8.zzc()     // Catch:{ all -> 0x0d63 }
            r37 = 0
            r39 = 0
            r40 = 0
            r41 = 0
            r42 = 0
            r26 = r11
            r26.<init>(r27, r28, r29, r31, r33, r35, r37, r39, r40, r41, r42)     // Catch:{ all -> 0x0d63 }
            goto L_0x0a61
        L_0x0a5f:
            r21 = r13
        L_0x0a61:
            com.google.android.gms.measurement.internal.y8 r12 = r1.f6565g     // Catch:{ all -> 0x0d63 }
            Q(r12)     // Catch:{ all -> 0x0d63 }
            com.google.android.gms.internal.measurement.zzjz r12 = r8.zzaA()     // Catch:{ all -> 0x0d63 }
            com.google.android.gms.internal.measurement.zzfo r12 = (com.google.android.gms.internal.measurement.zzfo) r12     // Catch:{ all -> 0x0d63 }
            java.lang.String r13 = "_eid"
            java.lang.Object r12 = com.google.android.gms.measurement.internal.y8.p(r12, r13)     // Catch:{ all -> 0x0d63 }
            java.lang.Long r12 = (java.lang.Long) r12     // Catch:{ all -> 0x0d63 }
            if (r12 == 0) goto L_0x0a78
            r13 = 1
            goto L_0x0a79
        L_0x0a78:
            r13 = 0
        L_0x0a79:
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r13)     // Catch:{ all -> 0x0d63 }
            r14 = 1
            if (r9 != r14) goto L_0x0aa9
            com.google.android.gms.internal.measurement.zzjz r9 = r8.zzaA()     // Catch:{ all -> 0x0d63 }
            com.google.android.gms.internal.measurement.zzfo r9 = (com.google.android.gms.internal.measurement.zzfo) r9     // Catch:{ all -> 0x0d63 }
            r3.add(r9)     // Catch:{ all -> 0x0d63 }
            boolean r9 = r13.booleanValue()     // Catch:{ all -> 0x0d63 }
            if (r9 == 0) goto L_0x0935
            java.lang.Long r9 = r11.f6310i     // Catch:{ all -> 0x0d63 }
            if (r9 != 0) goto L_0x0a9b
            java.lang.Long r9 = r11.f6311j     // Catch:{ all -> 0x0d63 }
            if (r9 != 0) goto L_0x0a9b
            java.lang.Boolean r9 = r11.f6312k     // Catch:{ all -> 0x0d63 }
            if (r9 == 0) goto L_0x0935
        L_0x0a9b:
            r9 = 0
            com.google.android.gms.measurement.internal.p r10 = r11.a(r9, r9, r9)     // Catch:{ all -> 0x0d63 }
            java.lang.String r9 = r8.zzo()     // Catch:{ all -> 0x0d63 }
            r2.put(r9, r10)     // Catch:{ all -> 0x0d63 }
            goto L_0x0935
        L_0x0aa9:
            int r14 = r4.nextInt(r9)     // Catch:{ all -> 0x0d63 }
            if (r14 != 0) goto L_0x0aea
            com.google.android.gms.measurement.internal.y8 r12 = r1.f6565g     // Catch:{ all -> 0x0d63 }
            Q(r12)     // Catch:{ all -> 0x0d63 }
            long r14 = (long) r9     // Catch:{ all -> 0x0d63 }
            java.lang.Long r9 = java.lang.Long.valueOf(r14)     // Catch:{ all -> 0x0d63 }
            com.google.android.gms.measurement.internal.y8.m(r8, r10, r9)     // Catch:{ all -> 0x0d63 }
            com.google.android.gms.internal.measurement.zzjz r10 = r8.zzaA()     // Catch:{ all -> 0x0d63 }
            com.google.android.gms.internal.measurement.zzfo r10 = (com.google.android.gms.internal.measurement.zzfo) r10     // Catch:{ all -> 0x0d63 }
            r3.add(r10)     // Catch:{ all -> 0x0d63 }
            boolean r10 = r13.booleanValue()     // Catch:{ all -> 0x0d63 }
            if (r10 == 0) goto L_0x0ad0
            r10 = 0
            com.google.android.gms.measurement.internal.p r11 = r11.a(r10, r9, r10)     // Catch:{ all -> 0x0d63 }
        L_0x0ad0:
            java.lang.String r9 = r8.zzo()     // Catch:{ all -> 0x0d63 }
            long r12 = r8.zzc()     // Catch:{ all -> 0x0d63 }
            r14 = r21
            com.google.android.gms.measurement.internal.p r10 = r11.b(r12, r14)     // Catch:{ all -> 0x0d63 }
            r2.put(r9, r10)     // Catch:{ all -> 0x0d63 }
            r47 = r4
            r4 = r5
            r16 = r6
            r5 = 1
            goto L_0x0b7d
        L_0x0aea:
            r47 = r4
            r14 = r21
            java.lang.Long r4 = r11.f6309h     // Catch:{ all -> 0x0d63 }
            if (r4 == 0) goto L_0x0b01
            long r16 = r4.longValue()     // Catch:{ all -> 0x0d63 }
            r19 = r5
            r22 = r11
            r21 = r12
            r4 = r16
            r16 = r6
            goto L_0x0b17
        L_0x0b01:
            com.google.android.gms.measurement.internal.d9 r4 = r44.g0()     // Catch:{ all -> 0x0d63 }
            r19 = r5
            r16 = r6
            long r5 = r8.zzb()     // Catch:{ all -> 0x0d63 }
            r22 = r11
            r21 = r12
            r11 = r17
            long r4 = r4.s0(r5, r11)     // Catch:{ all -> 0x0d63 }
        L_0x0b17:
            int r6 = (r4 > r14 ? 1 : (r4 == r14 ? 0 : -1))
            if (r6 == 0) goto L_0x0b63
            com.google.android.gms.measurement.internal.y8 r4 = r1.f6565g     // Catch:{ all -> 0x0d63 }
            Q(r4)     // Catch:{ all -> 0x0d63 }
            java.lang.String r4 = "_efs"
            r5 = 1
            java.lang.Long r11 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x0d63 }
            com.google.android.gms.measurement.internal.y8.m(r8, r4, r11)     // Catch:{ all -> 0x0d63 }
            com.google.android.gms.measurement.internal.y8 r4 = r1.f6565g     // Catch:{ all -> 0x0d63 }
            Q(r4)     // Catch:{ all -> 0x0d63 }
            long r11 = (long) r9     // Catch:{ all -> 0x0d63 }
            java.lang.Long r4 = java.lang.Long.valueOf(r11)     // Catch:{ all -> 0x0d63 }
            com.google.android.gms.measurement.internal.y8.m(r8, r10, r4)     // Catch:{ all -> 0x0d63 }
            com.google.android.gms.internal.measurement.zzjz r9 = r8.zzaA()     // Catch:{ all -> 0x0d63 }
            com.google.android.gms.internal.measurement.zzfo r9 = (com.google.android.gms.internal.measurement.zzfo) r9     // Catch:{ all -> 0x0d63 }
            r3.add(r9)     // Catch:{ all -> 0x0d63 }
            boolean r9 = r13.booleanValue()     // Catch:{ all -> 0x0d63 }
            if (r9 == 0) goto L_0x0b51
            java.lang.Boolean r9 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x0d63 }
            r11 = r22
            r10 = 0
            com.google.android.gms.measurement.internal.p r11 = r11.a(r10, r4, r9)     // Catch:{ all -> 0x0d63 }
            goto L_0x0b53
        L_0x0b51:
            r11 = r22
        L_0x0b53:
            java.lang.String r4 = r8.zzo()     // Catch:{ all -> 0x0d63 }
            long r9 = r8.zzc()     // Catch:{ all -> 0x0d63 }
            com.google.android.gms.measurement.internal.p r9 = r11.b(r9, r14)     // Catch:{ all -> 0x0d63 }
            r2.put(r4, r9)     // Catch:{ all -> 0x0d63 }
            goto L_0x0b7b
        L_0x0b63:
            r11 = r22
            r5 = 1
            boolean r4 = r13.booleanValue()     // Catch:{ all -> 0x0d63 }
            if (r4 == 0) goto L_0x0b7b
            java.lang.String r4 = r8.zzo()     // Catch:{ all -> 0x0d63 }
            r12 = r21
            r9 = 0
            com.google.android.gms.measurement.internal.p r10 = r11.a(r12, r9, r9)     // Catch:{ all -> 0x0d63 }
            r2.put(r4, r10)     // Catch:{ all -> 0x0d63 }
        L_0x0b7b:
            r4 = r19
        L_0x0b7d:
            r4.zzO(r7, r8)     // Catch:{ all -> 0x0d63 }
        L_0x0b80:
            int r7 = r7 + 1
            r5 = r4
            r6 = r16
            r4 = r47
            goto L_0x08a1
        L_0x0b89:
            r4 = r5
            r16 = r6
            int r5 = r3.size()     // Catch:{ all -> 0x0d63 }
            int r6 = r4.zza()     // Catch:{ all -> 0x0d63 }
            if (r5 >= r6) goto L_0x0b9c
            r4.zzp()     // Catch:{ all -> 0x0d63 }
            r4.zzg(r3)     // Catch:{ all -> 0x0d63 }
        L_0x0b9c:
            java.util.Set r2 = r2.entrySet()     // Catch:{ all -> 0x0d63 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x0d63 }
        L_0x0ba4:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x0d63 }
            if (r3 == 0) goto L_0x0bbf
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x0d63 }
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch:{ all -> 0x0d63 }
            com.google.android.gms.measurement.internal.j r5 = r1.f6561c     // Catch:{ all -> 0x0d63 }
            Q(r5)     // Catch:{ all -> 0x0d63 }
            java.lang.Object r3 = r3.getValue()     // Catch:{ all -> 0x0d63 }
            com.google.android.gms.measurement.internal.p r3 = (com.google.android.gms.measurement.internal.p) r3     // Catch:{ all -> 0x0d63 }
            r5.q(r3)     // Catch:{ all -> 0x0d63 }
            goto L_0x0ba4
        L_0x0bbf:
            r2 = r16
            goto L_0x0bc4
        L_0x0bc2:
            r4 = r5
            r2 = r6
        L_0x0bc4:
            com.google.android.gms.internal.measurement.zzfy r3 = r2.f6507a     // Catch:{ all -> 0x0d63 }
            java.lang.String r3 = r3.zzy()     // Catch:{ all -> 0x0d63 }
            com.google.android.gms.measurement.internal.j r5 = r1.f6561c     // Catch:{ all -> 0x0d63 }
            Q(r5)     // Catch:{ all -> 0x0d63 }
            com.google.android.gms.measurement.internal.u4 r5 = r5.T(r3)     // Catch:{ all -> 0x0d63 }
            if (r5 != 0) goto L_0x0bed
            com.google.android.gms.measurement.internal.j3 r5 = r44.d()     // Catch:{ all -> 0x0d63 }
            com.google.android.gms.measurement.internal.h3 r5 = r5.r()     // Catch:{ all -> 0x0d63 }
            java.lang.String r6 = "Bundling raw events w/o app info. appId"
            com.google.android.gms.internal.measurement.zzfy r7 = r2.f6507a     // Catch:{ all -> 0x0d63 }
            java.lang.String r7 = r7.zzy()     // Catch:{ all -> 0x0d63 }
            java.lang.Object r7 = com.google.android.gms.measurement.internal.j3.z(r7)     // Catch:{ all -> 0x0d63 }
            r5.b(r6, r7)     // Catch:{ all -> 0x0d63 }
            goto L_0x0c49
        L_0x0bed:
            int r6 = r4.zza()     // Catch:{ all -> 0x0d63 }
            if (r6 <= 0) goto L_0x0c49
            long r6 = r5.Y()     // Catch:{ all -> 0x0d63 }
            r8 = 0
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 == 0) goto L_0x0c01
            r4.zzY(r6)     // Catch:{ all -> 0x0d63 }
            goto L_0x0c04
        L_0x0c01:
            r4.zzs()     // Catch:{ all -> 0x0d63 }
        L_0x0c04:
            long r8 = r5.a0()     // Catch:{ all -> 0x0d63 }
            r10 = 0
            int r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r12 != 0) goto L_0x0c0f
            goto L_0x0c10
        L_0x0c0f:
            r6 = r8
        L_0x0c10:
            int r8 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r8 == 0) goto L_0x0c18
            r4.zzZ(r6)     // Catch:{ all -> 0x0d63 }
            goto L_0x0c1b
        L_0x0c18:
            r4.zzt()     // Catch:{ all -> 0x0d63 }
        L_0x0c1b:
            r5.e()     // Catch:{ all -> 0x0d63 }
            long r6 = r5.Z()     // Catch:{ all -> 0x0d63 }
            int r7 = (int) r6     // Catch:{ all -> 0x0d63 }
            r4.zzF(r7)     // Catch:{ all -> 0x0d63 }
            long r6 = r4.zzd()     // Catch:{ all -> 0x0d63 }
            r5.E(r6)     // Catch:{ all -> 0x0d63 }
            long r6 = r4.zzc()     // Catch:{ all -> 0x0d63 }
            r5.C(r6)     // Catch:{ all -> 0x0d63 }
            java.lang.String r6 = r5.d0()     // Catch:{ all -> 0x0d63 }
            if (r6 == 0) goto L_0x0c3e
            r4.zzT(r6)     // Catch:{ all -> 0x0d63 }
            goto L_0x0c41
        L_0x0c3e:
            r4.zzq()     // Catch:{ all -> 0x0d63 }
        L_0x0c41:
            com.google.android.gms.measurement.internal.j r6 = r1.f6561c     // Catch:{ all -> 0x0d63 }
            Q(r6)     // Catch:{ all -> 0x0d63 }
            r6.p(r5)     // Catch:{ all -> 0x0d63 }
        L_0x0c49:
            int r5 = r4.zza()     // Catch:{ all -> 0x0d63 }
            if (r5 <= 0) goto L_0x0cad
            com.google.android.gms.measurement.internal.n4 r5 = r1.f6570l     // Catch:{ all -> 0x0d63 }
            r5.f()     // Catch:{ all -> 0x0d63 }
            com.google.android.gms.measurement.internal.h4 r5 = r1.f6559a     // Catch:{ all -> 0x0d63 }
            Q(r5)     // Catch:{ all -> 0x0d63 }
            com.google.android.gms.internal.measurement.zzfy r6 = r2.f6507a     // Catch:{ all -> 0x0d63 }
            java.lang.String r6 = r6.zzy()     // Catch:{ all -> 0x0d63 }
            com.google.android.gms.internal.measurement.zzfc r5 = r5.o(r6)     // Catch:{ all -> 0x0d63 }
            if (r5 == 0) goto L_0x0c74
            boolean r6 = r5.zzq()     // Catch:{ all -> 0x0d63 }
            if (r6 != 0) goto L_0x0c6c
            goto L_0x0c74
        L_0x0c6c:
            long r5 = r5.zzc()     // Catch:{ all -> 0x0d63 }
            r4.zzH(r5)     // Catch:{ all -> 0x0d63 }
            goto L_0x0c9d
        L_0x0c74:
            com.google.android.gms.internal.measurement.zzfy r5 = r2.f6507a     // Catch:{ all -> 0x0d63 }
            java.lang.String r5 = r5.zzH()     // Catch:{ all -> 0x0d63 }
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x0d63 }
            if (r5 == 0) goto L_0x0c86
            r5 = -1
            r4.zzH(r5)     // Catch:{ all -> 0x0d63 }
            goto L_0x0c9d
        L_0x0c86:
            com.google.android.gms.measurement.internal.j3 r5 = r44.d()     // Catch:{ all -> 0x0d63 }
            com.google.android.gms.measurement.internal.h3 r5 = r5.w()     // Catch:{ all -> 0x0d63 }
            java.lang.String r6 = "Did not find measurement config or missing version info. appId"
            com.google.android.gms.internal.measurement.zzfy r7 = r2.f6507a     // Catch:{ all -> 0x0d63 }
            java.lang.String r7 = r7.zzy()     // Catch:{ all -> 0x0d63 }
            java.lang.Object r7 = com.google.android.gms.measurement.internal.j3.z(r7)     // Catch:{ all -> 0x0d63 }
            r5.b(r6, r7)     // Catch:{ all -> 0x0d63 }
        L_0x0c9d:
            com.google.android.gms.measurement.internal.j r5 = r1.f6561c     // Catch:{ all -> 0x0d63 }
            Q(r5)     // Catch:{ all -> 0x0d63 }
            com.google.android.gms.internal.measurement.zzjz r4 = r4.zzaA()     // Catch:{ all -> 0x0d63 }
            com.google.android.gms.internal.measurement.zzfy r4 = (com.google.android.gms.internal.measurement.zzfy) r4     // Catch:{ all -> 0x0d63 }
            r8 = r20
            r5.v(r4, r8)     // Catch:{ all -> 0x0d63 }
        L_0x0cad:
            com.google.android.gms.measurement.internal.j r4 = r1.f6561c     // Catch:{ all -> 0x0d63 }
            Q(r4)     // Catch:{ all -> 0x0d63 }
            java.util.List r2 = r2.f6508b     // Catch:{ all -> 0x0d63 }
            com.google.android.gms.common.internal.s.k(r2)     // Catch:{ all -> 0x0d63 }
            r4.h()     // Catch:{ all -> 0x0d63 }
            r4.i()     // Catch:{ all -> 0x0d63 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0d63 }
            java.lang.String r6 = "rowid in ("
            r5.<init>(r6)     // Catch:{ all -> 0x0d63 }
            r8 = 0
        L_0x0cc5:
            int r6 = r2.size()     // Catch:{ all -> 0x0d63 }
            if (r8 >= r6) goto L_0x0ce2
            if (r8 == 0) goto L_0x0cd2
            java.lang.String r6 = ","
            r5.append(r6)     // Catch:{ all -> 0x0d63 }
        L_0x0cd2:
            java.lang.Object r6 = r2.get(r8)     // Catch:{ all -> 0x0d63 }
            java.lang.Long r6 = (java.lang.Long) r6     // Catch:{ all -> 0x0d63 }
            long r6 = r6.longValue()     // Catch:{ all -> 0x0d63 }
            r5.append(r6)     // Catch:{ all -> 0x0d63 }
            int r8 = r8 + 1
            goto L_0x0cc5
        L_0x0ce2:
            java.lang.String r6 = ")"
            r5.append(r6)     // Catch:{ all -> 0x0d63 }
            android.database.sqlite.SQLiteDatabase r6 = r4.R()     // Catch:{ all -> 0x0d63 }
            java.lang.String r7 = "raw_events"
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x0d63 }
            r8 = 0
            int r5 = r6.delete(r7, r5, r8)     // Catch:{ all -> 0x0d63 }
            int r6 = r2.size()     // Catch:{ all -> 0x0d63 }
            if (r5 == r6) goto L_0x0d17
            com.google.android.gms.measurement.internal.n4 r4 = r4.f5994a     // Catch:{ all -> 0x0d63 }
            com.google.android.gms.measurement.internal.j3 r4 = r4.d()     // Catch:{ all -> 0x0d63 }
            com.google.android.gms.measurement.internal.h3 r4 = r4.r()     // Catch:{ all -> 0x0d63 }
            java.lang.String r6 = "Deleted fewer rows from raw events table than expected"
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x0d63 }
            int r2 = r2.size()     // Catch:{ all -> 0x0d63 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0d63 }
            r4.c(r6, r5, r2)     // Catch:{ all -> 0x0d63 }
        L_0x0d17:
            com.google.android.gms.measurement.internal.j r2 = r1.f6561c     // Catch:{ all -> 0x0d63 }
            Q(r2)     // Catch:{ all -> 0x0d63 }
            android.database.sqlite.SQLiteDatabase r4 = r2.R()     // Catch:{ all -> 0x0d63 }
            java.lang.String[] r5 = new java.lang.String[]{r3, r3}     // Catch:{ SQLiteException -> 0x0d2a }
            java.lang.String r6 = "delete from raw_events_metadata where app_id=? and metadata_fingerprint not in (select distinct metadata_fingerprint from raw_events where app_id=?)"
            r4.execSQL(r6, r5)     // Catch:{ SQLiteException -> 0x0d2a }
            goto L_0x0d3f
        L_0x0d2a:
            r0 = move-exception
            r4 = r0
            com.google.android.gms.measurement.internal.n4 r2 = r2.f5994a     // Catch:{ all -> 0x0d63 }
            com.google.android.gms.measurement.internal.j3 r2 = r2.d()     // Catch:{ all -> 0x0d63 }
            com.google.android.gms.measurement.internal.h3 r2 = r2.r()     // Catch:{ all -> 0x0d63 }
            java.lang.String r5 = "Failed to remove unused event metadata. appId"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.j3.z(r3)     // Catch:{ all -> 0x0d63 }
            r2.c(r5, r3, r4)     // Catch:{ all -> 0x0d63 }
        L_0x0d3f:
            com.google.android.gms.measurement.internal.j r2 = r1.f6561c     // Catch:{ all -> 0x0d63 }
            Q(r2)     // Catch:{ all -> 0x0d63 }
            r2.o()     // Catch:{ all -> 0x0d63 }
            com.google.android.gms.measurement.internal.j r2 = r1.f6561c
            Q(r2)
            r2.h0()
            r2 = 1
            return r2
        L_0x0d51:
            com.google.android.gms.measurement.internal.j r2 = r1.f6561c     // Catch:{ all -> 0x0d63 }
            Q(r2)     // Catch:{ all -> 0x0d63 }
            r2.o()     // Catch:{ all -> 0x0d63 }
            com.google.android.gms.measurement.internal.j r2 = r1.f6561c
            Q(r2)
            r2.h0()
            r2 = 0
            return r2
        L_0x0d63:
            r0 = move-exception
            r2 = r0
            com.google.android.gms.measurement.internal.j r3 = r1.f6561c
            Q(r3)
            r3.h0()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.w8.N(java.lang.String, long):boolean");
    }

    private final boolean O() {
        b().h();
        g();
        j jVar = this.f6561c;
        Q(jVar);
        if (jVar.s()) {
            return true;
        }
        j jVar2 = this.f6561c;
        Q(jVar2);
        return !TextUtils.isEmpty(jVar2.b0());
    }

    private final boolean P(zzfn zzfn, zzfn zzfn2) {
        s.a("_e".equals(zzfn.zzo()));
        Q(this.f6565g);
        zzfs o10 = y8.o((zzfo) zzfn.zzaA(), "_sc");
        String str = null;
        String zzh = o10 == null ? null : o10.zzh();
        Q(this.f6565g);
        zzfs o11 = y8.o((zzfo) zzfn2.zzaA(), "_pc");
        if (o11 != null) {
            str = o11.zzh();
        }
        if (str == null || !str.equals(zzh)) {
            return false;
        }
        K(zzfn, zzfn2);
        return true;
    }

    private static final n8 Q(n8 n8Var) {
        if (n8Var == null) {
            throw new IllegalStateException("Upload Component not created");
        } else if (n8Var.k()) {
            return n8Var;
        } else {
            String valueOf = String.valueOf(n8Var.getClass());
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 27);
            sb2.append("Component not initialized: ");
            sb2.append(valueOf);
            throw new IllegalStateException(sb2.toString());
        }
    }

    public static w8 e0(Context context) {
        s.k(context);
        s.k(context.getApplicationContext());
        if (C == null) {
            synchronized (w8.class) {
                if (C == null) {
                    C = new w8((x8) s.k(new x8(context)), (n4) null);
                }
            }
        }
        return C;
    }

    static /* bridge */ /* synthetic */ void j0(w8 w8Var, x8 x8Var) {
        w8Var.b().h();
        w8Var.f6569k = new a4(w8Var);
        j jVar = new j(w8Var);
        jVar.j();
        w8Var.f6561c = jVar;
        w8Var.T().z((f) s.k(w8Var.f6559a));
        w7 w7Var = new w7(w8Var);
        w7Var.j();
        w8Var.f6567i = w7Var;
        q9 q9Var = new q9(w8Var);
        q9Var.j();
        w8Var.f6564f = q9Var;
        n6 n6Var = new n6(w8Var);
        n6Var.j();
        w8Var.f6566h = n6Var;
        l8 l8Var = new l8(w8Var);
        l8Var.j();
        w8Var.f6563e = l8Var;
        w8Var.f6562d = new q3(w8Var);
        if (w8Var.f6575q != w8Var.f6576r) {
            w8Var.d().r().c("Not all upload components initialized", Integer.valueOf(w8Var.f6575q), Integer.valueOf(w8Var.f6576r));
        }
        w8Var.f6571m = true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r9v0 */
    /* JADX WARNING: type inference failed for: r9v1, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r9v3 */
    /* JADX WARNING: type inference failed for: r9v4 */
    /* JADX WARNING: type inference failed for: r9v15, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r9v16 */
    /* JADX WARNING: type inference failed for: r9v17 */
    /* JADX WARNING: type inference failed for: r9v18 */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Can't wrap try/catch for region: R(2:194|195) */
    /* JADX WARNING: Code restructure failed: missing block: B:125:?, code lost:
        r11.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x025f, code lost:
        r0 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0261, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:?, code lost:
        d().r().c("Failed to parse upload URL. Not uploading. appId", com.google.android.gms.measurement.internal.j3.z(r6), r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x04d4, code lost:
        if (r3 != null) goto L_0x04b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0115, code lost:
        if (r11 != null) goto L_0x00f7;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:194:0x045a */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x0288 A[SYNTHETIC, Splitter:B:137:0x0288] */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x0291 A[Catch:{ all -> 0x011b, all -> 0x04f8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x0471 A[Catch:{ all -> 0x011b, all -> 0x04f8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:230:0x04f4 A[SYNTHETIC, Splitter:B:230:0x04f4] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x011f A[Catch:{ all -> 0x011b, all -> 0x04f8 }] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:208:0x04b5=Splitter:B:208:0x04b5, B:48:0x0106=Splitter:B:48:0x0106, B:40:0x00f7=Splitter:B:40:0x00f7, B:220:0x04d7=Splitter:B:220:0x04d7, B:51:0x0118=Splitter:B:51:0x0118, B:124:0x025c=Splitter:B:124:0x025c, B:185:0x03dc=Splitter:B:185:0x03dc, B:134:0x026f=Splitter:B:134:0x026f} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A() {
        /*
            r22 = this;
            r1 = r22
            com.google.android.gms.measurement.internal.l4 r0 = r22.b()
            r0.h()
            r22.g()
            r2 = 1
            r1.f6579u = r2
            r3 = 0
            com.google.android.gms.measurement.internal.n4 r0 = r1.f6570l     // Catch:{ all -> 0x04f8 }
            r0.f()     // Catch:{ all -> 0x04f8 }
            com.google.android.gms.measurement.internal.n4 r0 = r1.f6570l     // Catch:{ all -> 0x04f8 }
            com.google.android.gms.measurement.internal.v7 r0 = r0.L()     // Catch:{ all -> 0x04f8 }
            java.lang.Boolean r0 = r0.J()     // Catch:{ all -> 0x04f8 }
            if (r0 != 0) goto L_0x0034
            com.google.android.gms.measurement.internal.j3 r0 = r22.d()     // Catch:{ all -> 0x04f8 }
            com.google.android.gms.measurement.internal.h3 r0 = r0.w()     // Catch:{ all -> 0x04f8 }
            java.lang.String r2 = "Upload data called on the client side before use of service was decided"
        L_0x002b:
            r0.a(r2)     // Catch:{ all -> 0x04f8 }
        L_0x002e:
            r1.f6579u = r3
        L_0x0030:
            r22.I()
            return
        L_0x0034:
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x04f8 }
            if (r0 == 0) goto L_0x0045
            com.google.android.gms.measurement.internal.j3 r0 = r22.d()     // Catch:{ all -> 0x04f8 }
            com.google.android.gms.measurement.internal.h3 r0 = r0.r()     // Catch:{ all -> 0x04f8 }
            java.lang.String r2 = "Upload called in the client side when service should be used"
            goto L_0x002b
        L_0x0045:
            long r4 = r1.f6573o     // Catch:{ all -> 0x04f8 }
            r6 = 0
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 <= 0) goto L_0x0051
        L_0x004d:
            r22.L()     // Catch:{ all -> 0x04f8 }
            goto L_0x002e
        L_0x0051:
            com.google.android.gms.measurement.internal.l4 r0 = r22.b()     // Catch:{ all -> 0x04f8 }
            r0.h()     // Catch:{ all -> 0x04f8 }
            java.util.List r0 = r1.f6582x     // Catch:{ all -> 0x04f8 }
            if (r0 == 0) goto L_0x0067
            com.google.android.gms.measurement.internal.j3 r0 = r22.d()     // Catch:{ all -> 0x04f8 }
            com.google.android.gms.measurement.internal.h3 r0 = r0.v()     // Catch:{ all -> 0x04f8 }
            java.lang.String r2 = "Uploading requested multiple times"
            goto L_0x002b
        L_0x0067:
            com.google.android.gms.measurement.internal.o3 r0 = r1.f6560b     // Catch:{ all -> 0x04f8 }
            Q(r0)     // Catch:{ all -> 0x04f8 }
            boolean r0 = r0.n()     // Catch:{ all -> 0x04f8 }
            if (r0 != 0) goto L_0x0080
            com.google.android.gms.measurement.internal.j3 r0 = r22.d()     // Catch:{ all -> 0x04f8 }
            com.google.android.gms.measurement.internal.h3 r0 = r0.v()     // Catch:{ all -> 0x04f8 }
            java.lang.String r2 = "Network not connected, ignoring upload request"
            r0.a(r2)     // Catch:{ all -> 0x04f8 }
            goto L_0x004d
        L_0x0080:
            y3.e r0 = r22.e()     // Catch:{ all -> 0x04f8 }
            long r4 = r0.currentTimeMillis()     // Catch:{ all -> 0x04f8 }
            com.google.android.gms.measurement.internal.g r0 = r22.T()     // Catch:{ all -> 0x04f8 }
            com.google.android.gms.measurement.internal.x2 r8 = com.google.android.gms.measurement.internal.y2.R     // Catch:{ all -> 0x04f8 }
            r9 = 0
            int r0 = r0.o(r9, r8)     // Catch:{ all -> 0x04f8 }
            r22.T()     // Catch:{ all -> 0x04f8 }
            long r10 = com.google.android.gms.measurement.internal.g.I()     // Catch:{ all -> 0x04f8 }
            long r10 = r4 - r10
            r8 = 0
        L_0x009d:
            if (r8 >= r0) goto L_0x00a8
            boolean r12 = r1.N(r9, r10)     // Catch:{ all -> 0x04f8 }
            if (r12 == 0) goto L_0x00a8
            int r8 = r8 + 1
            goto L_0x009d
        L_0x00a8:
            com.google.android.gms.measurement.internal.w7 r0 = r1.f6567i     // Catch:{ all -> 0x04f8 }
            com.google.android.gms.measurement.internal.t3 r0 = r0.f6556i     // Catch:{ all -> 0x04f8 }
            long r10 = r0.a()     // Catch:{ all -> 0x04f8 }
            int r0 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x00cb
            com.google.android.gms.measurement.internal.j3 r0 = r22.d()     // Catch:{ all -> 0x04f8 }
            com.google.android.gms.measurement.internal.h3 r0 = r0.q()     // Catch:{ all -> 0x04f8 }
            java.lang.String r6 = "Uploading events. Elapsed time since last upload attempt (ms)"
            long r7 = r4 - r10
            long r7 = java.lang.Math.abs(r7)     // Catch:{ all -> 0x04f8 }
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x04f8 }
            r0.b(r6, r7)     // Catch:{ all -> 0x04f8 }
        L_0x00cb:
            com.google.android.gms.measurement.internal.j r0 = r1.f6561c     // Catch:{ all -> 0x04f8 }
            Q(r0)     // Catch:{ all -> 0x04f8 }
            java.lang.String r6 = r0.b0()     // Catch:{ all -> 0x04f8 }
            boolean r0 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x04f8 }
            r7 = -1
            if (r0 != 0) goto L_0x0475
            long r10 = r1.f6584z     // Catch:{ all -> 0x04f8 }
            int r0 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r0 != 0) goto L_0x0123
            com.google.android.gms.measurement.internal.j r10 = r1.f6561c     // Catch:{ all -> 0x04f8 }
            Q(r10)     // Catch:{ all -> 0x04f8 }
            android.database.sqlite.SQLiteDatabase r0 = r10.R()     // Catch:{ SQLiteException -> 0x0104, all -> 0x0102 }
            java.lang.String r11 = "select rowid from raw_events order by rowid desc limit 1;"
            android.database.Cursor r11 = r0.rawQuery(r11, r9)     // Catch:{ SQLiteException -> 0x0104, all -> 0x0102 }
            boolean r0 = r11.moveToFirst()     // Catch:{ SQLiteException -> 0x0100 }
            if (r0 != 0) goto L_0x00fb
        L_0x00f7:
            r11.close()     // Catch:{ all -> 0x04f8 }
            goto L_0x0118
        L_0x00fb:
            long r7 = r11.getLong(r3)     // Catch:{ SQLiteException -> 0x0100 }
            goto L_0x00f7
        L_0x0100:
            r0 = move-exception
            goto L_0x0106
        L_0x0102:
            r0 = move-exception
            goto L_0x011d
        L_0x0104:
            r0 = move-exception
            r11 = r9
        L_0x0106:
            com.google.android.gms.measurement.internal.n4 r10 = r10.f5994a     // Catch:{ all -> 0x011b }
            com.google.android.gms.measurement.internal.j3 r10 = r10.d()     // Catch:{ all -> 0x011b }
            com.google.android.gms.measurement.internal.h3 r10 = r10.r()     // Catch:{ all -> 0x011b }
            java.lang.String r12 = "Error querying raw events"
            r10.b(r12, r0)     // Catch:{ all -> 0x011b }
            if (r11 == 0) goto L_0x0118
            goto L_0x00f7
        L_0x0118:
            r1.f6584z = r7     // Catch:{ all -> 0x04f8 }
            goto L_0x0123
        L_0x011b:
            r0 = move-exception
            r9 = r11
        L_0x011d:
            if (r9 == 0) goto L_0x0122
            r9.close()     // Catch:{ all -> 0x04f8 }
        L_0x0122:
            throw r0     // Catch:{ all -> 0x04f8 }
        L_0x0123:
            com.google.android.gms.measurement.internal.g r0 = r22.T()     // Catch:{ all -> 0x04f8 }
            com.google.android.gms.measurement.internal.x2 r7 = com.google.android.gms.measurement.internal.y2.f6626h     // Catch:{ all -> 0x04f8 }
            int r0 = r0.o(r6, r7)     // Catch:{ all -> 0x04f8 }
            com.google.android.gms.measurement.internal.g r7 = r22.T()     // Catch:{ all -> 0x04f8 }
            com.google.android.gms.measurement.internal.x2 r8 = com.google.android.gms.measurement.internal.y2.f6628i     // Catch:{ all -> 0x04f8 }
            int r7 = r7.o(r6, r8)     // Catch:{ all -> 0x04f8 }
            int r7 = java.lang.Math.max(r3, r7)     // Catch:{ all -> 0x04f8 }
            com.google.android.gms.measurement.internal.j r8 = r1.f6561c     // Catch:{ all -> 0x04f8 }
            Q(r8)     // Catch:{ all -> 0x04f8 }
            r8.h()     // Catch:{ all -> 0x04f8 }
            r8.i()     // Catch:{ all -> 0x04f8 }
            if (r0 <= 0) goto L_0x014a
            r10 = 1
            goto L_0x014b
        L_0x014a:
            r10 = 0
        L_0x014b:
            com.google.android.gms.common.internal.s.a(r10)     // Catch:{ all -> 0x04f8 }
            if (r7 <= 0) goto L_0x0152
            r10 = 1
            goto L_0x0153
        L_0x0152:
            r10 = 0
        L_0x0153:
            com.google.android.gms.common.internal.s.a(r10)     // Catch:{ all -> 0x04f8 }
            com.google.android.gms.common.internal.s.g(r6)     // Catch:{ all -> 0x04f8 }
            r10 = 2
            android.database.sqlite.SQLiteDatabase r11 = r8.R()     // Catch:{ SQLiteException -> 0x026b, all -> 0x0267 }
            r12 = 3
            java.lang.String[] r13 = new java.lang.String[r12]     // Catch:{ SQLiteException -> 0x026b, all -> 0x0267 }
            java.lang.String r12 = "rowid"
            r13[r3] = r12     // Catch:{ SQLiteException -> 0x026b, all -> 0x0267 }
            java.lang.String r12 = "data"
            r13[r2] = r12     // Catch:{ SQLiteException -> 0x026b, all -> 0x0267 }
            java.lang.String r12 = "retry_count"
            r13[r10] = r12     // Catch:{ SQLiteException -> 0x026b, all -> 0x0267 }
            java.lang.String[] r15 = new java.lang.String[]{r6}     // Catch:{ SQLiteException -> 0x026b, all -> 0x0267 }
            java.lang.String r12 = "queue"
            java.lang.String r14 = "app_id=?"
            r16 = 0
            r17 = 0
            java.lang.String r18 = "rowid"
            java.lang.String r19 = java.lang.String.valueOf(r0)     // Catch:{ SQLiteException -> 0x026b, all -> 0x0267 }
            android.database.Cursor r11 = r11.query(r12, r13, r14, r15, r16, r17, r18, r19)     // Catch:{ SQLiteException -> 0x026b, all -> 0x0267 }
            boolean r0 = r11.moveToFirst()     // Catch:{ SQLiteException -> 0x0263 }
            if (r0 != 0) goto L_0x0194
            java.util.List r0 = java.util.Collections.emptyList()     // Catch:{ SQLiteException -> 0x0263 }
            r11.close()     // Catch:{ all -> 0x04f8 }
            r20 = r4
            goto L_0x028b
        L_0x0194:
            java.util.ArrayList r12 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x0263 }
            r12.<init>()     // Catch:{ SQLiteException -> 0x0263 }
            r13 = 0
        L_0x019a:
            long r14 = r11.getLong(r3)     // Catch:{ SQLiteException -> 0x0263 }
            byte[] r0 = r11.getBlob(r2)     // Catch:{ IOException -> 0x0237 }
            com.google.android.gms.measurement.internal.w8 r2 = r8.f6214b     // Catch:{ IOException -> 0x0237 }
            com.google.android.gms.measurement.internal.y8 r2 = r2.f6565g     // Catch:{ IOException -> 0x0237 }
            Q(r2)     // Catch:{ IOException -> 0x0237 }
            java.io.ByteArrayInputStream r9 = new java.io.ByteArrayInputStream     // Catch:{ IOException -> 0x0222 }
            r9.<init>(r0)     // Catch:{ IOException -> 0x0222 }
            java.util.zip.GZIPInputStream r0 = new java.util.zip.GZIPInputStream     // Catch:{ IOException -> 0x0222 }
            r0.<init>(r9)     // Catch:{ IOException -> 0x0222 }
            java.io.ByteArrayOutputStream r3 = new java.io.ByteArrayOutputStream     // Catch:{ IOException -> 0x0222 }
            r3.<init>()     // Catch:{ IOException -> 0x0222 }
            r10 = 1024(0x400, float:1.435E-42)
            byte[] r10 = new byte[r10]     // Catch:{ IOException -> 0x0222 }
            r20 = r4
        L_0x01be:
            int r4 = r0.read(r10)     // Catch:{ IOException -> 0x0220 }
            if (r4 > 0) goto L_0x021b
            r0.close()     // Catch:{ IOException -> 0x0220 }
            r9.close()     // Catch:{ IOException -> 0x0220 }
            byte[] r0 = r3.toByteArray()     // Catch:{ IOException -> 0x0220 }
            boolean r2 = r12.isEmpty()     // Catch:{ SQLiteException -> 0x0261 }
            if (r2 != 0) goto L_0x01da
            int r2 = r0.length     // Catch:{ SQLiteException -> 0x0261 }
            int r2 = r2 + r13
            if (r2 <= r7) goto L_0x01da
            goto L_0x025c
        L_0x01da:
            com.google.android.gms.internal.measurement.zzfx r2 = com.google.android.gms.internal.measurement.zzfy.zzu()     // Catch:{ IOException -> 0x0206 }
            com.google.android.gms.internal.measurement.zzlf r2 = com.google.android.gms.measurement.internal.y8.D(r2, r0)     // Catch:{ IOException -> 0x0206 }
            com.google.android.gms.internal.measurement.zzfx r2 = (com.google.android.gms.internal.measurement.zzfx) r2     // Catch:{ IOException -> 0x0206 }
            r3 = 2
            boolean r4 = r11.isNull(r3)     // Catch:{ SQLiteException -> 0x0261 }
            if (r4 != 0) goto L_0x01f2
            int r4 = r11.getInt(r3)     // Catch:{ SQLiteException -> 0x0261 }
            r2.zzac(r4)     // Catch:{ SQLiteException -> 0x0261 }
        L_0x01f2:
            int r0 = r0.length     // Catch:{ SQLiteException -> 0x0261 }
            int r13 = r13 + r0
            com.google.android.gms.internal.measurement.zzjz r0 = r2.zzaA()     // Catch:{ SQLiteException -> 0x0261 }
            com.google.android.gms.internal.measurement.zzfy r0 = (com.google.android.gms.internal.measurement.zzfy) r0     // Catch:{ SQLiteException -> 0x0261 }
            java.lang.Long r2 = java.lang.Long.valueOf(r14)     // Catch:{ SQLiteException -> 0x0261 }
            android.util.Pair r0 = android.util.Pair.create(r0, r2)     // Catch:{ SQLiteException -> 0x0261 }
            r12.add(r0)     // Catch:{ SQLiteException -> 0x0261 }
            goto L_0x024b
        L_0x0206:
            r0 = move-exception
            com.google.android.gms.measurement.internal.n4 r2 = r8.f5994a     // Catch:{ SQLiteException -> 0x0261 }
            com.google.android.gms.measurement.internal.j3 r2 = r2.d()     // Catch:{ SQLiteException -> 0x0261 }
            com.google.android.gms.measurement.internal.h3 r2 = r2.r()     // Catch:{ SQLiteException -> 0x0261 }
            java.lang.String r3 = "Failed to merge queued bundle. appId"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.j3.z(r6)     // Catch:{ SQLiteException -> 0x0261 }
        L_0x0217:
            r2.c(r3, r4, r0)     // Catch:{ SQLiteException -> 0x0261 }
            goto L_0x024b
        L_0x021b:
            r5 = 0
            r3.write(r10, r5, r4)     // Catch:{ IOException -> 0x0220 }
            goto L_0x01be
        L_0x0220:
            r0 = move-exception
            goto L_0x0225
        L_0x0222:
            r0 = move-exception
            r20 = r4
        L_0x0225:
            com.google.android.gms.measurement.internal.n4 r2 = r2.f5994a     // Catch:{ IOException -> 0x0235 }
            com.google.android.gms.measurement.internal.j3 r2 = r2.d()     // Catch:{ IOException -> 0x0235 }
            com.google.android.gms.measurement.internal.h3 r2 = r2.r()     // Catch:{ IOException -> 0x0235 }
            java.lang.String r3 = "Failed to ungzip content"
            r2.b(r3, r0)     // Catch:{ IOException -> 0x0235 }
            throw r0     // Catch:{ IOException -> 0x0235 }
        L_0x0235:
            r0 = move-exception
            goto L_0x023a
        L_0x0237:
            r0 = move-exception
            r20 = r4
        L_0x023a:
            com.google.android.gms.measurement.internal.n4 r2 = r8.f5994a     // Catch:{ SQLiteException -> 0x0261 }
            com.google.android.gms.measurement.internal.j3 r2 = r2.d()     // Catch:{ SQLiteException -> 0x0261 }
            com.google.android.gms.measurement.internal.h3 r2 = r2.r()     // Catch:{ SQLiteException -> 0x0261 }
            java.lang.String r3 = "Failed to unzip queued bundle. appId"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.j3.z(r6)     // Catch:{ SQLiteException -> 0x0261 }
            goto L_0x0217
        L_0x024b:
            boolean r0 = r11.moveToNext()     // Catch:{ SQLiteException -> 0x0261 }
            if (r0 == 0) goto L_0x025c
            if (r13 <= r7) goto L_0x0254
            goto L_0x025c
        L_0x0254:
            r4 = r20
            r2 = 1
            r3 = 0
            r9 = 0
            r10 = 2
            goto L_0x019a
        L_0x025c:
            r11.close()     // Catch:{ all -> 0x04f8 }
            r0 = r12
            goto L_0x028b
        L_0x0261:
            r0 = move-exception
            goto L_0x026f
        L_0x0263:
            r0 = move-exception
            r20 = r4
            goto L_0x026f
        L_0x0267:
            r0 = move-exception
            r9 = 0
            goto L_0x046f
        L_0x026b:
            r0 = move-exception
            r20 = r4
            r11 = 0
        L_0x026f:
            com.google.android.gms.measurement.internal.n4 r2 = r8.f5994a     // Catch:{ all -> 0x046d }
            com.google.android.gms.measurement.internal.j3 r2 = r2.d()     // Catch:{ all -> 0x046d }
            com.google.android.gms.measurement.internal.h3 r2 = r2.r()     // Catch:{ all -> 0x046d }
            java.lang.String r3 = "Error querying bundles. appId"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.j3.z(r6)     // Catch:{ all -> 0x046d }
            r2.c(r3, r4, r0)     // Catch:{ all -> 0x046d }
            java.util.List r0 = java.util.Collections.emptyList()     // Catch:{ all -> 0x046d }
            if (r11 == 0) goto L_0x028b
            r11.close()     // Catch:{ all -> 0x04f8 }
        L_0x028b:
            boolean r2 = r0.isEmpty()     // Catch:{ all -> 0x04f8 }
            if (r2 != 0) goto L_0x04eb
            h4.a r2 = r1.U(r6)     // Catch:{ all -> 0x04f8 }
            boolean r2 = r2.j()     // Catch:{ all -> 0x04f8 }
            if (r2 == 0) goto L_0x02f0
            java.util.Iterator r2 = r0.iterator()     // Catch:{ all -> 0x04f8 }
        L_0x029f:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x04f8 }
            if (r3 == 0) goto L_0x02be
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x04f8 }
            android.util.Pair r3 = (android.util.Pair) r3     // Catch:{ all -> 0x04f8 }
            java.lang.Object r3 = r3.first     // Catch:{ all -> 0x04f8 }
            com.google.android.gms.internal.measurement.zzfy r3 = (com.google.android.gms.internal.measurement.zzfy) r3     // Catch:{ all -> 0x04f8 }
            java.lang.String r4 = r3.zzL()     // Catch:{ all -> 0x04f8 }
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x04f8 }
            if (r4 != 0) goto L_0x029f
            java.lang.String r2 = r3.zzL()     // Catch:{ all -> 0x04f8 }
            goto L_0x02bf
        L_0x02be:
            r2 = 0
        L_0x02bf:
            if (r2 == 0) goto L_0x02f0
            r3 = 0
        L_0x02c2:
            int r4 = r0.size()     // Catch:{ all -> 0x04f8 }
            if (r3 >= r4) goto L_0x02f0
            java.lang.Object r4 = r0.get(r3)     // Catch:{ all -> 0x04f8 }
            android.util.Pair r4 = (android.util.Pair) r4     // Catch:{ all -> 0x04f8 }
            java.lang.Object r4 = r4.first     // Catch:{ all -> 0x04f8 }
            com.google.android.gms.internal.measurement.zzfy r4 = (com.google.android.gms.internal.measurement.zzfy) r4     // Catch:{ all -> 0x04f8 }
            java.lang.String r5 = r4.zzL()     // Catch:{ all -> 0x04f8 }
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x04f8 }
            if (r5 == 0) goto L_0x02dd
            goto L_0x02ed
        L_0x02dd:
            java.lang.String r4 = r4.zzL()     // Catch:{ all -> 0x04f8 }
            boolean r4 = r4.equals(r2)     // Catch:{ all -> 0x04f8 }
            if (r4 != 0) goto L_0x02ed
            r4 = 0
            java.util.List r0 = r0.subList(r4, r3)     // Catch:{ all -> 0x04f8 }
            goto L_0x02f0
        L_0x02ed:
            int r3 = r3 + 1
            goto L_0x02c2
        L_0x02f0:
            com.google.android.gms.internal.measurement.zzfv r2 = com.google.android.gms.internal.measurement.zzfw.zza()     // Catch:{ all -> 0x04f8 }
            int r3 = r0.size()     // Catch:{ all -> 0x04f8 }
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ all -> 0x04f8 }
            int r5 = r0.size()     // Catch:{ all -> 0x04f8 }
            r4.<init>(r5)     // Catch:{ all -> 0x04f8 }
            com.google.android.gms.measurement.internal.g r5 = r22.T()     // Catch:{ all -> 0x04f8 }
            boolean r5 = r5.C(r6)     // Catch:{ all -> 0x04f8 }
            if (r5 == 0) goto L_0x0317
            h4.a r5 = r1.U(r6)     // Catch:{ all -> 0x04f8 }
            boolean r5 = r5.j()     // Catch:{ all -> 0x04f8 }
            if (r5 == 0) goto L_0x0317
            r5 = 1
            goto L_0x0318
        L_0x0317:
            r5 = 0
        L_0x0318:
            h4.a r7 = r1.U(r6)     // Catch:{ all -> 0x04f8 }
            boolean r7 = r7.j()     // Catch:{ all -> 0x04f8 }
            h4.a r8 = r1.U(r6)     // Catch:{ all -> 0x04f8 }
            boolean r8 = r8.k()     // Catch:{ all -> 0x04f8 }
            r9 = 0
        L_0x0329:
            if (r9 >= r3) goto L_0x039f
            java.lang.Object r10 = r0.get(r9)     // Catch:{ all -> 0x04f8 }
            android.util.Pair r10 = (android.util.Pair) r10     // Catch:{ all -> 0x04f8 }
            java.lang.Object r10 = r10.first     // Catch:{ all -> 0x04f8 }
            com.google.android.gms.internal.measurement.zzfy r10 = (com.google.android.gms.internal.measurement.zzfy) r10     // Catch:{ all -> 0x04f8 }
            com.google.android.gms.internal.measurement.zzjv r10 = r10.zzbv()     // Catch:{ all -> 0x04f8 }
            com.google.android.gms.internal.measurement.zzfx r10 = (com.google.android.gms.internal.measurement.zzfx) r10     // Catch:{ all -> 0x04f8 }
            java.lang.Object r11 = r0.get(r9)     // Catch:{ all -> 0x04f8 }
            android.util.Pair r11 = (android.util.Pair) r11     // Catch:{ all -> 0x04f8 }
            java.lang.Object r11 = r11.second     // Catch:{ all -> 0x04f8 }
            java.lang.Long r11 = (java.lang.Long) r11     // Catch:{ all -> 0x04f8 }
            r4.add(r11)     // Catch:{ all -> 0x04f8 }
            com.google.android.gms.measurement.internal.g r11 = r22.T()     // Catch:{ all -> 0x04f8 }
            r11.q()     // Catch:{ all -> 0x04f8 }
            r11 = 42097(0xa471, double:2.07987E-319)
            r10.zzah(r11)     // Catch:{ all -> 0x04f8 }
            r11 = r20
            r10.zzag(r11)     // Catch:{ all -> 0x04f8 }
            com.google.android.gms.measurement.internal.n4 r13 = r1.f6570l     // Catch:{ all -> 0x04f8 }
            r13.f()     // Catch:{ all -> 0x04f8 }
            r13 = 0
            r10.zzad(r13)     // Catch:{ all -> 0x04f8 }
            if (r5 != 0) goto L_0x0368
            r10.zzo()     // Catch:{ all -> 0x04f8 }
        L_0x0368:
            if (r7 != 0) goto L_0x0370
            r10.zzu()     // Catch:{ all -> 0x04f8 }
            r10.zzr()     // Catch:{ all -> 0x04f8 }
        L_0x0370:
            if (r8 != 0) goto L_0x0375
            r10.zzm()     // Catch:{ all -> 0x04f8 }
        L_0x0375:
            com.google.android.gms.measurement.internal.g r13 = r22.T()     // Catch:{ all -> 0x04f8 }
            com.google.android.gms.measurement.internal.x2 r14 = com.google.android.gms.measurement.internal.y2.X     // Catch:{ all -> 0x04f8 }
            boolean r13 = r13.B(r6, r14)     // Catch:{ all -> 0x04f8 }
            if (r13 == 0) goto L_0x0397
            com.google.android.gms.internal.measurement.zzjz r13 = r10.zzaA()     // Catch:{ all -> 0x04f8 }
            com.google.android.gms.internal.measurement.zzfy r13 = (com.google.android.gms.internal.measurement.zzfy) r13     // Catch:{ all -> 0x04f8 }
            byte[] r13 = r13.zzbs()     // Catch:{ all -> 0x04f8 }
            com.google.android.gms.measurement.internal.y8 r14 = r1.f6565g     // Catch:{ all -> 0x04f8 }
            Q(r14)     // Catch:{ all -> 0x04f8 }
            long r13 = r14.y(r13)     // Catch:{ all -> 0x04f8 }
            r10.zzG(r13)     // Catch:{ all -> 0x04f8 }
        L_0x0397:
            r2.zza(r10)     // Catch:{ all -> 0x04f8 }
            int r9 = r9 + 1
            r20 = r11
            goto L_0x0329
        L_0x039f:
            r11 = r20
            com.google.android.gms.measurement.internal.j3 r0 = r22.d()     // Catch:{ all -> 0x04f8 }
            java.lang.String r0 = r0.C()     // Catch:{ all -> 0x04f8 }
            r5 = 2
            boolean r0 = android.util.Log.isLoggable(r0, r5)     // Catch:{ all -> 0x04f8 }
            if (r0 == 0) goto L_0x03c0
            com.google.android.gms.measurement.internal.y8 r0 = r1.f6565g     // Catch:{ all -> 0x04f8 }
            Q(r0)     // Catch:{ all -> 0x04f8 }
            com.google.android.gms.internal.measurement.zzjz r5 = r2.zzaA()     // Catch:{ all -> 0x04f8 }
            com.google.android.gms.internal.measurement.zzfw r5 = (com.google.android.gms.internal.measurement.zzfw) r5     // Catch:{ all -> 0x04f8 }
            java.lang.String r0 = r0.E(r5)     // Catch:{ all -> 0x04f8 }
            goto L_0x03c1
        L_0x03c0:
            r0 = 0
        L_0x03c1:
            com.google.android.gms.measurement.internal.y8 r5 = r1.f6565g     // Catch:{ all -> 0x04f8 }
            Q(r5)     // Catch:{ all -> 0x04f8 }
            com.google.android.gms.internal.measurement.zzjz r5 = r2.zzaA()     // Catch:{ all -> 0x04f8 }
            com.google.android.gms.internal.measurement.zzfw r5 = (com.google.android.gms.internal.measurement.zzfw) r5     // Catch:{ all -> 0x04f8 }
            byte[] r14 = r5.zzbs()     // Catch:{ all -> 0x04f8 }
            r22.T()     // Catch:{ all -> 0x04f8 }
            com.google.android.gms.measurement.internal.x2 r5 = com.google.android.gms.measurement.internal.y2.f6646r     // Catch:{ all -> 0x04f8 }
            r9 = 0
            java.lang.Object r5 = r5.a(r9)     // Catch:{ all -> 0x04f8 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x04f8 }
            java.net.URL r13 = new java.net.URL     // Catch:{ MalformedURLException -> 0x045a }
            r13.<init>(r5)     // Catch:{ MalformedURLException -> 0x045a }
            boolean r7 = r4.isEmpty()     // Catch:{ MalformedURLException -> 0x045a }
            r8 = 1
            r7 = r7 ^ r8
            com.google.android.gms.common.internal.s.a(r7)     // Catch:{ MalformedURLException -> 0x045a }
            java.util.List r7 = r1.f6582x     // Catch:{ MalformedURLException -> 0x045a }
            if (r7 == 0) goto L_0x03fc
            com.google.android.gms.measurement.internal.j3 r4 = r22.d()     // Catch:{ MalformedURLException -> 0x045a }
            com.google.android.gms.measurement.internal.h3 r4 = r4.r()     // Catch:{ MalformedURLException -> 0x045a }
            java.lang.String r7 = "Set uploading progress before finishing the previous upload"
            r4.a(r7)     // Catch:{ MalformedURLException -> 0x045a }
            goto L_0x0403
        L_0x03fc:
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ MalformedURLException -> 0x045a }
            r7.<init>(r4)     // Catch:{ MalformedURLException -> 0x045a }
            r1.f6582x = r7     // Catch:{ MalformedURLException -> 0x045a }
        L_0x0403:
            com.google.android.gms.measurement.internal.w7 r4 = r1.f6567i     // Catch:{ MalformedURLException -> 0x045a }
            com.google.android.gms.measurement.internal.t3 r4 = r4.f6557j     // Catch:{ MalformedURLException -> 0x045a }
            r4.b(r11)     // Catch:{ MalformedURLException -> 0x045a }
            java.lang.String r4 = "?"
            if (r3 <= 0) goto L_0x0417
            r3 = 0
            com.google.android.gms.internal.measurement.zzfy r2 = r2.zzb(r3)     // Catch:{ MalformedURLException -> 0x045a }
            java.lang.String r4 = r2.zzy()     // Catch:{ MalformedURLException -> 0x045a }
        L_0x0417:
            com.google.android.gms.measurement.internal.j3 r2 = r22.d()     // Catch:{ MalformedURLException -> 0x045a }
            com.google.android.gms.measurement.internal.h3 r2 = r2.v()     // Catch:{ MalformedURLException -> 0x045a }
            java.lang.String r3 = "Uploading data. app, uncompressed size, data"
            int r7 = r14.length     // Catch:{ MalformedURLException -> 0x045a }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ MalformedURLException -> 0x045a }
            r2.d(r3, r4, r7, r0)     // Catch:{ MalformedURLException -> 0x045a }
            r2 = 1
            r1.f6578t = r2     // Catch:{ MalformedURLException -> 0x045a }
            com.google.android.gms.measurement.internal.o3 r11 = r1.f6560b     // Catch:{ MalformedURLException -> 0x045a }
            Q(r11)     // Catch:{ MalformedURLException -> 0x045a }
            com.google.android.gms.measurement.internal.q8 r0 = new com.google.android.gms.measurement.internal.q8     // Catch:{ MalformedURLException -> 0x045a }
            r0.<init>(r1, r6)     // Catch:{ MalformedURLException -> 0x045a }
            r11.h()     // Catch:{ MalformedURLException -> 0x045a }
            r11.i()     // Catch:{ MalformedURLException -> 0x045a }
            com.google.android.gms.common.internal.s.k(r13)     // Catch:{ MalformedURLException -> 0x045a }
            com.google.android.gms.common.internal.s.k(r14)     // Catch:{ MalformedURLException -> 0x045a }
            com.google.android.gms.common.internal.s.k(r0)     // Catch:{ MalformedURLException -> 0x045a }
            com.google.android.gms.measurement.internal.n4 r2 = r11.f5994a     // Catch:{ MalformedURLException -> 0x045a }
            com.google.android.gms.measurement.internal.l4 r2 = r2.b()     // Catch:{ MalformedURLException -> 0x045a }
            com.google.android.gms.measurement.internal.n3 r3 = new com.google.android.gms.measurement.internal.n3     // Catch:{ MalformedURLException -> 0x045a }
            r15 = 0
            r10 = r3
            r12 = r6
            r16 = r0
            r10.<init>(r11, r12, r13, r14, r15, r16)     // Catch:{ MalformedURLException -> 0x045a }
            r2.y(r3)     // Catch:{ MalformedURLException -> 0x045a }
            goto L_0x04eb
        L_0x045a:
            com.google.android.gms.measurement.internal.j3 r0 = r22.d()     // Catch:{ all -> 0x04f8 }
            com.google.android.gms.measurement.internal.h3 r0 = r0.r()     // Catch:{ all -> 0x04f8 }
            java.lang.String r2 = "Failed to parse upload URL. Not uploading. appId"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.j3.z(r6)     // Catch:{ all -> 0x04f8 }
            r0.c(r2, r3, r5)     // Catch:{ all -> 0x04f8 }
            goto L_0x04eb
        L_0x046d:
            r0 = move-exception
            r9 = r11
        L_0x046f:
            if (r9 == 0) goto L_0x0474
            r9.close()     // Catch:{ all -> 0x04f8 }
        L_0x0474:
            throw r0     // Catch:{ all -> 0x04f8 }
        L_0x0475:
            r11 = r4
            r1.f6584z = r7     // Catch:{ all -> 0x04f8 }
            com.google.android.gms.measurement.internal.j r2 = r1.f6561c     // Catch:{ all -> 0x04f8 }
            Q(r2)     // Catch:{ all -> 0x04f8 }
            r22.T()     // Catch:{ all -> 0x04f8 }
            long r3 = com.google.android.gms.measurement.internal.g.I()     // Catch:{ all -> 0x04f8 }
            long r4 = r11 - r3
            r2.h()     // Catch:{ all -> 0x04f8 }
            r2.i()     // Catch:{ all -> 0x04f8 }
            android.database.sqlite.SQLiteDatabase r0 = r2.R()     // Catch:{ SQLiteException -> 0x04c3, all -> 0x04c1 }
            r3 = 1
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch:{ SQLiteException -> 0x04c3, all -> 0x04c1 }
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ SQLiteException -> 0x04c3, all -> 0x04c1 }
            r5 = 0
            r3[r5] = r4     // Catch:{ SQLiteException -> 0x04c3, all -> 0x04c1 }
            java.lang.String r4 = "select app_id from apps where app_id in (select distinct app_id from raw_events) and config_fetched_time < ? order by failed_config_fetch_time limit 1;"
            android.database.Cursor r3 = r0.rawQuery(r4, r3)     // Catch:{ SQLiteException -> 0x04c3, all -> 0x04c1 }
            boolean r0 = r3.moveToFirst()     // Catch:{ SQLiteException -> 0x04bf }
            if (r0 != 0) goto L_0x04b9
            com.google.android.gms.measurement.internal.n4 r0 = r2.f5994a     // Catch:{ SQLiteException -> 0x04bf }
            com.google.android.gms.measurement.internal.j3 r0 = r0.d()     // Catch:{ SQLiteException -> 0x04bf }
            com.google.android.gms.measurement.internal.h3 r0 = r0.v()     // Catch:{ SQLiteException -> 0x04bf }
            java.lang.String r4 = "No expired configs for apps with pending events"
            r0.a(r4)     // Catch:{ SQLiteException -> 0x04bf }
        L_0x04b5:
            r3.close()     // Catch:{ all -> 0x04f8 }
            goto L_0x04d7
        L_0x04b9:
            r4 = 0
            java.lang.String r9 = r3.getString(r4)     // Catch:{ SQLiteException -> 0x04bf }
            goto L_0x04b5
        L_0x04bf:
            r0 = move-exception
            goto L_0x04c5
        L_0x04c1:
            r0 = move-exception
            goto L_0x04f2
        L_0x04c3:
            r0 = move-exception
            r3 = r9
        L_0x04c5:
            com.google.android.gms.measurement.internal.n4 r2 = r2.f5994a     // Catch:{ all -> 0x04f0 }
            com.google.android.gms.measurement.internal.j3 r2 = r2.d()     // Catch:{ all -> 0x04f0 }
            com.google.android.gms.measurement.internal.h3 r2 = r2.r()     // Catch:{ all -> 0x04f0 }
            java.lang.String r4 = "Error selecting expired configs"
            r2.b(r4, r0)     // Catch:{ all -> 0x04f0 }
            if (r3 == 0) goto L_0x04d7
            goto L_0x04b5
        L_0x04d7:
            boolean r0 = android.text.TextUtils.isEmpty(r9)     // Catch:{ all -> 0x04f8 }
            if (r0 != 0) goto L_0x04eb
            com.google.android.gms.measurement.internal.j r0 = r1.f6561c     // Catch:{ all -> 0x04f8 }
            Q(r0)     // Catch:{ all -> 0x04f8 }
            com.google.android.gms.measurement.internal.u4 r0 = r0.T(r9)     // Catch:{ all -> 0x04f8 }
            if (r0 == 0) goto L_0x04eb
            r1.h(r0)     // Catch:{ all -> 0x04f8 }
        L_0x04eb:
            r2 = 0
            r1.f6579u = r2
            goto L_0x0030
        L_0x04f0:
            r0 = move-exception
            r9 = r3
        L_0x04f2:
            if (r9 == 0) goto L_0x04f7
            r9.close()     // Catch:{ all -> 0x04f8 }
        L_0x04f7:
            throw r0     // Catch:{ all -> 0x04f8 }
        L_0x04f8:
            r0 = move-exception
            r2 = 0
            r1.f6579u = r2
            r22.I()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.w8.A():void");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:248:0x07c3, code lost:
        if (r14.size() == 0) goto L_0x07c5;
     */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x032c A[Catch:{ NumberFormatException -> 0x07ad, all -> 0x0b04 }] */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x0372 A[Catch:{ NumberFormatException -> 0x07ad, all -> 0x0b04 }] */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x0375 A[Catch:{ NumberFormatException -> 0x07ad, all -> 0x0b04 }] */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x03d5 A[Catch:{ NumberFormatException -> 0x07ad, all -> 0x0b04 }] */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x0402  */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x0561 A[Catch:{ NumberFormatException -> 0x07ad, all -> 0x0b04 }] */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x059e A[Catch:{ NumberFormatException -> 0x07ad, all -> 0x0b04 }] */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x0617 A[Catch:{ NumberFormatException -> 0x07ad, all -> 0x0b04 }] */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x0664 A[Catch:{ NumberFormatException -> 0x07ad, all -> 0x0b04 }] */
    /* JADX WARNING: Removed duplicated region for block: B:194:0x0671 A[Catch:{ NumberFormatException -> 0x07ad, all -> 0x0b04 }] */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x067e A[Catch:{ NumberFormatException -> 0x07ad, all -> 0x0b04 }] */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x068c A[Catch:{ NumberFormatException -> 0x07ad, all -> 0x0b04 }] */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x069d A[Catch:{ NumberFormatException -> 0x07ad, all -> 0x0b04 }] */
    /* JADX WARNING: Removed duplicated region for block: B:206:0x06d0 A[Catch:{ NumberFormatException -> 0x07ad, all -> 0x0b04 }] */
    /* JADX WARNING: Removed duplicated region for block: B:219:0x0709 A[Catch:{ NumberFormatException -> 0x07ad, all -> 0x0b04 }] */
    /* JADX WARNING: Removed duplicated region for block: B:226:0x0726 A[Catch:{ NumberFormatException -> 0x07ad, all -> 0x0b04 }] */
    /* JADX WARNING: Removed duplicated region for block: B:229:0x0741 A[Catch:{ NumberFormatException -> 0x07ad, all -> 0x0b04 }] */
    /* JADX WARNING: Removed duplicated region for block: B:251:0x07c8 A[Catch:{ NumberFormatException -> 0x07ad, all -> 0x0b04 }] */
    /* JADX WARNING: Removed duplicated region for block: B:254:0x07e7 A[Catch:{ NumberFormatException -> 0x07ad, all -> 0x0b04 }] */
    /* JADX WARNING: Removed duplicated region for block: B:263:0x0854 A[Catch:{ NumberFormatException -> 0x07ad, all -> 0x0b04 }] */
    /* JADX WARNING: Removed duplicated region for block: B:266:0x0861 A[Catch:{ NumberFormatException -> 0x07ad, all -> 0x0b04 }] */
    /* JADX WARNING: Removed duplicated region for block: B:271:0x087a A[Catch:{ NumberFormatException -> 0x07ad, all -> 0x0b04 }] */
    /* JADX WARNING: Removed duplicated region for block: B:285:0x0911 A[Catch:{ NumberFormatException -> 0x07ad, all -> 0x0b04 }] */
    /* JADX WARNING: Removed duplicated region for block: B:289:0x0930 A[Catch:{ NumberFormatException -> 0x07ad, all -> 0x0b04 }] */
    /* JADX WARNING: Removed duplicated region for block: B:299:0x09c2 A[Catch:{ NumberFormatException -> 0x07ad, all -> 0x0b04 }] */
    /* JADX WARNING: Removed duplicated region for block: B:312:0x0a6d A[Catch:{ SQLiteException -> 0x0a88 }] */
    /* JADX WARNING: Removed duplicated region for block: B:313:0x0a83  */
    /* JADX WARNING: Removed duplicated region for block: B:346:0x09ce A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x01c6 A[Catch:{ NumberFormatException -> 0x07ad, all -> 0x0b04 }] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x01d9 A[SYNTHETIC, Splitter:B:61:0x01d9] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0242  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0254 A[Catch:{ NumberFormatException -> 0x07ad, all -> 0x0b04 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void B(com.google.android.gms.measurement.internal.t r35, com.google.android.gms.measurement.internal.i9 r36) {
        /*
            r34 = this;
            r1 = r34
            r2 = r35
            r3 = r36
            java.lang.String r4 = "metadata_fingerprint"
            java.lang.String r5 = "app_id"
            java.lang.String r6 = "raw_events"
            java.lang.String r7 = "_sno"
            com.google.android.gms.common.internal.s.k(r36)
            java.lang.String r8 = r3.f6059e
            com.google.android.gms.common.internal.s.g(r8)
            long r8 = java.lang.System.nanoTime()
            com.google.android.gms.measurement.internal.l4 r10 = r34.b()
            r10.h()
            r34.g()
            java.lang.String r10 = r3.f6059e
            com.google.android.gms.measurement.internal.y8 r11 = r1.f6565g
            Q(r11)
            boolean r11 = com.google.android.gms.measurement.internal.y8.n(r35, r36)
            if (r11 != 0) goto L_0x0032
            return
        L_0x0032:
            boolean r11 = r3.f6066l
            if (r11 == 0) goto L_0x0b0f
            com.google.android.gms.measurement.internal.h4 r11 = r1.f6559a
            Q(r11)
            java.lang.String r12 = r2.f6408e
            boolean r11 = r11.x(r10, r12)
            java.lang.String r15 = "_err"
            r14 = 0
            if (r11 == 0) goto L_0x00df
            com.google.android.gms.measurement.internal.j3 r3 = r34.d()
            com.google.android.gms.measurement.internal.h3 r3 = r3.w()
            java.lang.Object r4 = com.google.android.gms.measurement.internal.j3.z(r10)
            com.google.android.gms.measurement.internal.n4 r5 = r1.f6570l
            com.google.android.gms.measurement.internal.e3 r5 = r5.D()
            java.lang.String r6 = r2.f6408e
            java.lang.String r5 = r5.q(r6)
            java.lang.String r6 = "Dropping blocked event. appId"
            r3.c(r6, r4, r5)
            com.google.android.gms.measurement.internal.h4 r3 = r1.f6559a
            Q(r3)
            boolean r3 = r3.v(r10)
            if (r3 != 0) goto L_0x0097
            com.google.android.gms.measurement.internal.h4 r3 = r1.f6559a
            Q(r3)
            boolean r3 = r3.y(r10)
            if (r3 == 0) goto L_0x007a
            goto L_0x0097
        L_0x007a:
            java.lang.String r3 = r2.f6408e
            boolean r3 = r15.equals(r3)
            if (r3 != 0) goto L_0x00de
            com.google.android.gms.measurement.internal.d9 r11 = r34.g0()
            com.google.android.gms.measurement.internal.c9 r12 = r1.B
            r14 = 11
            java.lang.String r15 = "_ev"
            java.lang.String r2 = r2.f6408e
            r17 = 0
            r13 = r10
            r16 = r2
            r11.A(r12, r13, r14, r15, r16, r17)
            return
        L_0x0097:
            com.google.android.gms.measurement.internal.j r2 = r1.f6561c
            Q(r2)
            com.google.android.gms.measurement.internal.u4 r2 = r2.T(r10)
            if (r2 == 0) goto L_0x00de
            long r3 = r2.W()
            long r5 = r2.N()
            long r3 = java.lang.Math.max(r3, r5)
            y3.e r5 = r34.e()
            long r5 = r5.currentTimeMillis()
            long r5 = r5 - r3
            long r3 = java.lang.Math.abs(r5)
            r34.T()
            com.google.android.gms.measurement.internal.x2 r5 = com.google.android.gms.measurement.internal.y2.A
            java.lang.Object r5 = r5.a(r14)
            java.lang.Long r5 = (java.lang.Long) r5
            long r5 = r5.longValue()
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 <= 0) goto L_0x00de
            com.google.android.gms.measurement.internal.j3 r3 = r34.d()
            com.google.android.gms.measurement.internal.h3 r3 = r3.q()
            java.lang.String r4 = "Fetching config for blocked app"
            r3.a(r4)
            r1.h(r2)
        L_0x00de:
            return
        L_0x00df:
            com.google.android.gms.measurement.internal.k3 r2 = com.google.android.gms.measurement.internal.k3.b(r35)
            com.google.android.gms.measurement.internal.d9 r11 = r34.g0()
            com.google.android.gms.measurement.internal.g r12 = r34.T()
            int r12 = r12.n(r10)
            r11.z(r2, r12)
            com.google.android.gms.measurement.internal.t r2 = r2.a()
            com.google.android.gms.measurement.internal.j3 r11 = r34.d()
            java.lang.String r11 = r11.C()
            r12 = 2
            boolean r11 = android.util.Log.isLoggable(r11, r12)
            if (r11 == 0) goto L_0x0165
            com.google.android.gms.measurement.internal.j3 r11 = r34.d()
            com.google.android.gms.measurement.internal.h3 r11 = r11.v()
            com.google.android.gms.measurement.internal.n4 r13 = r1.f6570l
            com.google.android.gms.measurement.internal.e3 r13 = r13.D()
            boolean r16 = r13.t()
            if (r16 != 0) goto L_0x011e
            java.lang.String r13 = r2.toString()
            goto L_0x0160
        L_0x011e:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r14 = "origin="
            r12.append(r14)
            java.lang.String r14 = r2.f6410g
            r12.append(r14)
            java.lang.String r14 = ",name="
            r12.append(r14)
            java.lang.String r14 = r2.f6408e
            java.lang.String r14 = r13.q(r14)
            r12.append(r14)
            java.lang.String r14 = ",params="
            r12.append(r14)
            com.google.android.gms.measurement.internal.r r14 = r2.f6409f
            if (r14 != 0) goto L_0x0146
            r13 = 0
            goto L_0x0159
        L_0x0146:
            boolean r17 = r13.t()
            if (r17 != 0) goto L_0x0151
            java.lang.String r13 = r14.toString()
            goto L_0x0159
        L_0x0151:
            android.os.Bundle r14 = r14.V()
            java.lang.String r13 = r13.p(r14)
        L_0x0159:
            r12.append(r13)
            java.lang.String r13 = r12.toString()
        L_0x0160:
            java.lang.String r12 = "Logging event"
            r11.b(r12, r13)
        L_0x0165:
            com.google.android.gms.measurement.internal.j r11 = r1.f6561c
            Q(r11)
            r11.g0()
            r1.R(r3)     // Catch:{ all -> 0x0b04 }
            com.google.android.gms.internal.measurement.zzna.zzc()     // Catch:{ all -> 0x0b04 }
            com.google.android.gms.measurement.internal.g r11 = r34.T()     // Catch:{ all -> 0x0b04 }
            com.google.android.gms.measurement.internal.x2 r12 = com.google.android.gms.measurement.internal.y2.A0     // Catch:{ all -> 0x0b04 }
            r14 = 0
            boolean r11 = r11.B(r14, r12)     // Catch:{ all -> 0x0b04 }
            if (r11 != 0) goto L_0x0198
            com.google.android.gms.measurement.internal.g r11 = r34.T()     // Catch:{ all -> 0x0b04 }
            com.google.android.gms.measurement.internal.x2 r12 = com.google.android.gms.measurement.internal.y2.B0     // Catch:{ all -> 0x0b04 }
            boolean r11 = r11.B(r14, r12)     // Catch:{ all -> 0x0b04 }
            if (r11 == 0) goto L_0x0198
            com.google.android.gms.measurement.internal.j r11 = r1.f6561c     // Catch:{ all -> 0x0b04 }
            Q(r11)     // Catch:{ all -> 0x0b04 }
            java.lang.String r12 = r3.f6059e     // Catch:{ all -> 0x0b04 }
            java.lang.String r13 = "_lair"
            r11.m(r12, r13)     // Catch:{ all -> 0x0b04 }
        L_0x0198:
            java.lang.String r11 = "ecommerce_purchase"
            java.lang.String r12 = r2.f6408e     // Catch:{ all -> 0x0b04 }
            boolean r11 = r11.equals(r12)     // Catch:{ all -> 0x0b04 }
            java.lang.String r12 = "refund"
            r28 = r8
            if (r11 != 0) goto L_0x01bb
            java.lang.String r9 = "purchase"
            java.lang.String r11 = r2.f6408e     // Catch:{ all -> 0x0b04 }
            boolean r9 = r9.equals(r11)     // Catch:{ all -> 0x0b04 }
            if (r9 != 0) goto L_0x01bb
            java.lang.String r9 = r2.f6408e     // Catch:{ all -> 0x0b04 }
            boolean r9 = r12.equals(r9)     // Catch:{ all -> 0x0b04 }
            if (r9 == 0) goto L_0x01b9
            goto L_0x01bb
        L_0x01b9:
            r9 = 0
            goto L_0x01bc
        L_0x01bb:
            r9 = 1
        L_0x01bc:
            java.lang.String r11 = "_iap"
            java.lang.String r13 = r2.f6408e     // Catch:{ all -> 0x0b04 }
            boolean r11 = r11.equals(r13)     // Catch:{ all -> 0x0b04 }
            if (r11 != 0) goto L_0x01cd
            if (r9 == 0) goto L_0x01ca
            r9 = 1
            goto L_0x01cd
        L_0x01ca:
            r8 = r15
            goto L_0x035f
        L_0x01cd:
            com.google.android.gms.measurement.internal.r r11 = r2.f6409f     // Catch:{ all -> 0x0b04 }
            java.lang.String r13 = "currency"
            java.lang.String r11 = r11.l0(r13)     // Catch:{ all -> 0x0b04 }
            java.lang.String r13 = "value"
            if (r9 == 0) goto L_0x0242
            com.google.android.gms.measurement.internal.r r9 = r2.f6409f     // Catch:{ all -> 0x0b04 }
            java.lang.Double r9 = r9.W(r13)     // Catch:{ all -> 0x0b04 }
            double r17 = r9.doubleValue()     // Catch:{ all -> 0x0b04 }
            r19 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            double r17 = r17 * r19
            r21 = 0
            int r9 = (r17 > r21 ? 1 : (r17 == r21 ? 0 : -1))
            if (r9 != 0) goto L_0x0200
            com.google.android.gms.measurement.internal.r r9 = r2.f6409f     // Catch:{ all -> 0x0b04 }
            java.lang.Long r9 = r9.X(r13)     // Catch:{ all -> 0x0b04 }
            r21 = r15
            long r14 = r9.longValue()     // Catch:{ all -> 0x0b04 }
            double r13 = (double) r14     // Catch:{ all -> 0x0b04 }
            double r17 = r13 * r19
            goto L_0x0202
        L_0x0200:
            r21 = r15
        L_0x0202:
            r13 = 4890909195324358656(0x43e0000000000000, double:9.223372036854776E18)
            int r9 = (r17 > r13 ? 1 : (r17 == r13 ? 0 : -1))
            if (r9 > 0) goto L_0x021c
            r13 = -4332462841530417152(0xc3e0000000000000, double:-9.223372036854776E18)
            int r9 = (r17 > r13 ? 1 : (r17 == r13 ? 0 : -1))
            if (r9 < 0) goto L_0x021c
            long r13 = java.lang.Math.round(r17)     // Catch:{ all -> 0x0b04 }
            java.lang.String r9 = r2.f6408e     // Catch:{ all -> 0x0b04 }
            boolean r9 = r12.equals(r9)     // Catch:{ all -> 0x0b04 }
            if (r9 == 0) goto L_0x024e
            long r13 = -r13
            goto L_0x024e
        L_0x021c:
            com.google.android.gms.measurement.internal.j3 r2 = r34.d()     // Catch:{ all -> 0x0b04 }
            com.google.android.gms.measurement.internal.h3 r2 = r2.w()     // Catch:{ all -> 0x0b04 }
            java.lang.String r3 = "Data lost. Currency value is too big. appId"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.j3.z(r10)     // Catch:{ all -> 0x0b04 }
            java.lang.Double r5 = java.lang.Double.valueOf(r17)     // Catch:{ all -> 0x0b04 }
            r2.c(r3, r4, r5)     // Catch:{ all -> 0x0b04 }
            com.google.android.gms.measurement.internal.j r2 = r1.f6561c     // Catch:{ all -> 0x0b04 }
            Q(r2)     // Catch:{ all -> 0x0b04 }
            r2.o()     // Catch:{ all -> 0x0b04 }
            com.google.android.gms.measurement.internal.j r2 = r1.f6561c
            Q(r2)
            r2.h0()
            return
        L_0x0242:
            r21 = r15
            com.google.android.gms.measurement.internal.r r9 = r2.f6409f     // Catch:{ all -> 0x0b04 }
            java.lang.Long r9 = r9.X(r13)     // Catch:{ all -> 0x0b04 }
            long r13 = r9.longValue()     // Catch:{ all -> 0x0b04 }
        L_0x024e:
            boolean r9 = android.text.TextUtils.isEmpty(r11)     // Catch:{ all -> 0x0b04 }
            if (r9 != 0) goto L_0x035d
            java.util.Locale r9 = java.util.Locale.US     // Catch:{ all -> 0x0b04 }
            java.lang.String r9 = r11.toUpperCase(r9)     // Catch:{ all -> 0x0b04 }
            java.lang.String r11 = "[A-Z]{3}"
            boolean r11 = r9.matches(r11)     // Catch:{ all -> 0x0b04 }
            if (r11 == 0) goto L_0x035d
            java.lang.String r11 = "_ltv_"
            int r12 = r9.length()     // Catch:{ all -> 0x0b04 }
            if (r12 == 0) goto L_0x026f
            java.lang.String r9 = r11.concat(r9)     // Catch:{ all -> 0x0b04 }
            goto L_0x0274
        L_0x026f:
            java.lang.String r9 = new java.lang.String     // Catch:{ all -> 0x0b04 }
            r9.<init>(r11)     // Catch:{ all -> 0x0b04 }
        L_0x0274:
            com.google.android.gms.measurement.internal.j r11 = r1.f6561c     // Catch:{ all -> 0x0b04 }
            Q(r11)     // Catch:{ all -> 0x0b04 }
            com.google.android.gms.measurement.internal.b9 r11 = r11.Z(r10, r9)     // Catch:{ all -> 0x0b04 }
            if (r11 == 0) goto L_0x02b1
            java.lang.Object r11 = r11.f5872e     // Catch:{ all -> 0x0b04 }
            boolean r12 = r11 instanceof java.lang.Long     // Catch:{ all -> 0x0b04 }
            if (r12 != 0) goto L_0x0286
            goto L_0x02b1
        L_0x0286:
            java.lang.Long r11 = (java.lang.Long) r11     // Catch:{ all -> 0x0b04 }
            long r11 = r11.longValue()     // Catch:{ all -> 0x0b04 }
            com.google.android.gms.measurement.internal.b9 r18 = new com.google.android.gms.measurement.internal.b9     // Catch:{ all -> 0x0b04 }
            java.lang.String r15 = r2.f6410g     // Catch:{ all -> 0x0b04 }
            y3.e r17 = r34.e()     // Catch:{ all -> 0x0b04 }
            long r19 = r17.currentTimeMillis()     // Catch:{ all -> 0x0b04 }
            long r11 = r11 + r13
            java.lang.Long r17 = java.lang.Long.valueOf(r11)     // Catch:{ all -> 0x0b04 }
            r11 = r18
            r12 = r10
            r14 = 0
            r13 = r15
            r8 = 0
            r15 = 0
            r14 = r9
            r9 = r21
            r15 = r19
            r11.<init>(r12, r13, r14, r15, r17)     // Catch:{ all -> 0x0b04 }
            r8 = r9
        L_0x02ad:
            r9 = r18
            goto L_0x0321
        L_0x02b1:
            r15 = r21
            r8 = 0
            com.google.android.gms.measurement.internal.j r11 = r1.f6561c     // Catch:{ all -> 0x0b04 }
            Q(r11)     // Catch:{ all -> 0x0b04 }
            com.google.android.gms.measurement.internal.g r12 = r34.T()     // Catch:{ all -> 0x0b04 }
            com.google.android.gms.measurement.internal.x2 r8 = com.google.android.gms.measurement.internal.y2.F     // Catch:{ all -> 0x0b04 }
            int r8 = r12.o(r10, r8)     // Catch:{ all -> 0x0b04 }
            int r8 = r8 + -1
            com.google.android.gms.common.internal.s.g(r10)     // Catch:{ all -> 0x0b04 }
            r11.h()     // Catch:{ all -> 0x0b04 }
            r11.i()     // Catch:{ all -> 0x0b04 }
            android.database.sqlite.SQLiteDatabase r12 = r11.R()     // Catch:{ SQLiteException -> 0x02ef }
            r21 = r15
            r15 = 3
            java.lang.String[] r15 = new java.lang.String[r15]     // Catch:{ SQLiteException -> 0x02ed }
            r16 = 0
            r15[r16] = r10     // Catch:{ SQLiteException -> 0x02ed }
            r16 = 1
            r15[r16] = r10     // Catch:{ SQLiteException -> 0x02ed }
            java.lang.String r8 = java.lang.String.valueOf(r8)     // Catch:{ SQLiteException -> 0x02ed }
            r16 = 2
            r15[r16] = r8     // Catch:{ SQLiteException -> 0x02ed }
            java.lang.String r8 = "delete from user_attributes where app_id=? and name in (select name from user_attributes where app_id=? and name like '_ltv_%' order by set_timestamp desc limit ?,10);"
            r12.execSQL(r8, r15)     // Catch:{ SQLiteException -> 0x02ed }
            goto L_0x0306
        L_0x02ed:
            r0 = move-exception
            goto L_0x02f2
        L_0x02ef:
            r0 = move-exception
            r21 = r15
        L_0x02f2:
            r8 = r0
            com.google.android.gms.measurement.internal.n4 r11 = r11.f5994a     // Catch:{ all -> 0x0b04 }
            com.google.android.gms.measurement.internal.j3 r11 = r11.d()     // Catch:{ all -> 0x0b04 }
            com.google.android.gms.measurement.internal.h3 r11 = r11.r()     // Catch:{ all -> 0x0b04 }
            java.lang.String r12 = "Error pruning currencies. appId"
            java.lang.Object r15 = com.google.android.gms.measurement.internal.j3.z(r10)     // Catch:{ all -> 0x0b04 }
            r11.c(r12, r15, r8)     // Catch:{ all -> 0x0b04 }
        L_0x0306:
            com.google.android.gms.measurement.internal.b9 r18 = new com.google.android.gms.measurement.internal.b9     // Catch:{ all -> 0x0b04 }
            java.lang.String r8 = r2.f6410g     // Catch:{ all -> 0x0b04 }
            y3.e r11 = r34.e()     // Catch:{ all -> 0x0b04 }
            long r15 = r11.currentTimeMillis()     // Catch:{ all -> 0x0b04 }
            java.lang.Long r17 = java.lang.Long.valueOf(r13)     // Catch:{ all -> 0x0b04 }
            r11 = r18
            r12 = r10
            r13 = r8
            r14 = r9
            r8 = r21
            r11.<init>(r12, r13, r14, r15, r17)     // Catch:{ all -> 0x0b04 }
            goto L_0x02ad
        L_0x0321:
            com.google.android.gms.measurement.internal.j r11 = r1.f6561c     // Catch:{ all -> 0x0b04 }
            Q(r11)     // Catch:{ all -> 0x0b04 }
            boolean r11 = r11.z(r9)     // Catch:{ all -> 0x0b04 }
            if (r11 != 0) goto L_0x035f
            com.google.android.gms.measurement.internal.j3 r11 = r34.d()     // Catch:{ all -> 0x0b04 }
            com.google.android.gms.measurement.internal.h3 r11 = r11.r()     // Catch:{ all -> 0x0b04 }
            java.lang.String r12 = "Too many unique user properties are set. Ignoring user property. appId"
            java.lang.Object r13 = com.google.android.gms.measurement.internal.j3.z(r10)     // Catch:{ all -> 0x0b04 }
            com.google.android.gms.measurement.internal.n4 r14 = r1.f6570l     // Catch:{ all -> 0x0b04 }
            com.google.android.gms.measurement.internal.e3 r14 = r14.D()     // Catch:{ all -> 0x0b04 }
            java.lang.String r15 = r9.f5870c     // Catch:{ all -> 0x0b04 }
            java.lang.String r14 = r14.s(r15)     // Catch:{ all -> 0x0b04 }
            java.lang.Object r9 = r9.f5872e     // Catch:{ all -> 0x0b04 }
            r11.d(r12, r13, r14, r9)     // Catch:{ all -> 0x0b04 }
            com.google.android.gms.measurement.internal.d9 r11 = r34.g0()     // Catch:{ all -> 0x0b04 }
            com.google.android.gms.measurement.internal.c9 r12 = r1.B     // Catch:{ all -> 0x0b04 }
            r14 = 9
            r15 = 0
            r16 = 0
            r17 = 0
            r13 = r10
            r11.A(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x0b04 }
            goto L_0x035f
        L_0x035d:
            r8 = r21
        L_0x035f:
            java.lang.String r9 = r2.f6408e     // Catch:{ all -> 0x0b04 }
            boolean r9 = com.google.android.gms.measurement.internal.d9.W(r9)     // Catch:{ all -> 0x0b04 }
            java.lang.String r11 = r2.f6408e     // Catch:{ all -> 0x0b04 }
            boolean r8 = r8.equals(r11)     // Catch:{ all -> 0x0b04 }
            r34.g0()     // Catch:{ all -> 0x0b04 }
            com.google.android.gms.measurement.internal.r r11 = r2.f6409f     // Catch:{ all -> 0x0b04 }
            if (r11 != 0) goto L_0x0375
            r16 = 0
            goto L_0x0395
        L_0x0375:
            com.google.android.gms.measurement.internal.q r12 = new com.google.android.gms.measurement.internal.q     // Catch:{ all -> 0x0b04 }
            r12.<init>(r11)     // Catch:{ all -> 0x0b04 }
            r16 = 0
        L_0x037c:
            boolean r13 = r12.hasNext()     // Catch:{ all -> 0x0b04 }
            if (r13 == 0) goto L_0x0395
            java.lang.String r13 = r12.next()     // Catch:{ all -> 0x0b04 }
            java.lang.Object r13 = r11.j0(r13)     // Catch:{ all -> 0x0b04 }
            boolean r14 = r13 instanceof android.os.Parcelable[]     // Catch:{ all -> 0x0b04 }
            if (r14 == 0) goto L_0x037c
            android.os.Parcelable[] r13 = (android.os.Parcelable[]) r13     // Catch:{ all -> 0x0b04 }
            int r13 = r13.length     // Catch:{ all -> 0x0b04 }
            long r13 = (long) r13     // Catch:{ all -> 0x0b04 }
            long r16 = r16 + r13
            goto L_0x037c
        L_0x0395:
            r22 = 1
            long r15 = r16 + r22
            com.google.android.gms.measurement.internal.j r11 = r1.f6561c     // Catch:{ all -> 0x0b04 }
            Q(r11)     // Catch:{ all -> 0x0b04 }
            long r12 = r34.F()     // Catch:{ all -> 0x0b04 }
            r17 = 1
            r20 = 0
            r21 = 0
            r32 = r4
            r33 = r5
            r4 = 0
            r14 = r10
            r18 = r9
            r19 = r20
            r20 = r8
            com.google.android.gms.measurement.internal.h r11 = r11.W(r12, r14, r15, r17, r18, r19, r20, r21)     // Catch:{ all -> 0x0b04 }
            long r12 = r11.f6005b     // Catch:{ all -> 0x0b04 }
            r34.T()     // Catch:{ all -> 0x0b04 }
            com.google.android.gms.measurement.internal.x2 r14 = com.google.android.gms.measurement.internal.y2.f6634l     // Catch:{ all -> 0x0b04 }
            r15 = 0
            java.lang.Object r14 = r14.a(r15)     // Catch:{ all -> 0x0b04 }
            java.lang.Integer r14 = (java.lang.Integer) r14     // Catch:{ all -> 0x0b04 }
            int r14 = r14.intValue()     // Catch:{ all -> 0x0b04 }
            long r4 = (long) r14     // Catch:{ all -> 0x0b04 }
            long r12 = r12 - r4
            r4 = 1000(0x3e8, double:4.94E-321)
            r16 = 0
            int r14 = (r12 > r16 ? 1 : (r12 == r16 ? 0 : -1))
            if (r14 <= 0) goto L_0x0402
            long r12 = r12 % r4
            int r2 = (r12 > r22 ? 1 : (r12 == r22 ? 0 : -1))
            if (r2 != 0) goto L_0x03f1
            com.google.android.gms.measurement.internal.j3 r2 = r34.d()     // Catch:{ all -> 0x0b04 }
            com.google.android.gms.measurement.internal.h3 r2 = r2.r()     // Catch:{ all -> 0x0b04 }
            java.lang.String r3 = "Data loss. Too many events logged. appId, count"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.j3.z(r10)     // Catch:{ all -> 0x0b04 }
            long r5 = r11.f6005b     // Catch:{ all -> 0x0b04 }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x0b04 }
            r2.c(r3, r4, r5)     // Catch:{ all -> 0x0b04 }
        L_0x03f1:
            com.google.android.gms.measurement.internal.j r2 = r1.f6561c     // Catch:{ all -> 0x0b04 }
            Q(r2)     // Catch:{ all -> 0x0b04 }
            r2.o()     // Catch:{ all -> 0x0b04 }
            com.google.android.gms.measurement.internal.j r2 = r1.f6561c
            Q(r2)
            r2.h0()
            return
        L_0x0402:
            if (r9 == 0) goto L_0x0460
            long r12 = r11.f6004a     // Catch:{ all -> 0x0b04 }
            r34.T()     // Catch:{ all -> 0x0b04 }
            com.google.android.gms.measurement.internal.x2 r14 = com.google.android.gms.measurement.internal.y2.f6638n     // Catch:{ all -> 0x0b04 }
            java.lang.Object r14 = r14.a(r15)     // Catch:{ all -> 0x0b04 }
            java.lang.Integer r14 = (java.lang.Integer) r14     // Catch:{ all -> 0x0b04 }
            int r14 = r14.intValue()     // Catch:{ all -> 0x0b04 }
            long r4 = (long) r14     // Catch:{ all -> 0x0b04 }
            long r12 = r12 - r4
            r4 = 0
            int r14 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r14 <= 0) goto L_0x0460
            r4 = 1000(0x3e8, double:4.94E-321)
            long r12 = r12 % r4
            int r3 = (r12 > r22 ? 1 : (r12 == r22 ? 0 : -1))
            if (r3 != 0) goto L_0x043b
            com.google.android.gms.measurement.internal.j3 r3 = r34.d()     // Catch:{ all -> 0x0b04 }
            com.google.android.gms.measurement.internal.h3 r3 = r3.r()     // Catch:{ all -> 0x0b04 }
            java.lang.String r4 = "Data loss. Too many public events logged. appId, count"
            java.lang.Object r5 = com.google.android.gms.measurement.internal.j3.z(r10)     // Catch:{ all -> 0x0b04 }
            long r6 = r11.f6004a     // Catch:{ all -> 0x0b04 }
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x0b04 }
            r3.c(r4, r5, r6)     // Catch:{ all -> 0x0b04 }
        L_0x043b:
            com.google.android.gms.measurement.internal.d9 r11 = r34.g0()     // Catch:{ all -> 0x0b04 }
            com.google.android.gms.measurement.internal.c9 r12 = r1.B     // Catch:{ all -> 0x0b04 }
            r14 = 16
            java.lang.String r15 = "_ev"
            java.lang.String r2 = r2.f6408e     // Catch:{ all -> 0x0b04 }
            r17 = 0
            r13 = r10
            r16 = r2
            r11.A(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x0b04 }
            com.google.android.gms.measurement.internal.j r2 = r1.f6561c     // Catch:{ all -> 0x0b04 }
            Q(r2)     // Catch:{ all -> 0x0b04 }
            r2.o()     // Catch:{ all -> 0x0b04 }
            com.google.android.gms.measurement.internal.j r2 = r1.f6561c
            Q(r2)
            r2.h0()
            return
        L_0x0460:
            r4 = 1000000(0xf4240, float:1.401298E-39)
            if (r8 == 0) goto L_0x04b0
            long r12 = r11.f6007d     // Catch:{ all -> 0x0b04 }
            com.google.android.gms.measurement.internal.g r5 = r34.T()     // Catch:{ all -> 0x0b04 }
            java.lang.String r8 = r3.f6059e     // Catch:{ all -> 0x0b04 }
            com.google.android.gms.measurement.internal.x2 r14 = com.google.android.gms.measurement.internal.y2.f6636m     // Catch:{ all -> 0x0b04 }
            int r5 = r5.o(r8, r14)     // Catch:{ all -> 0x0b04 }
            int r5 = java.lang.Math.min(r4, r5)     // Catch:{ all -> 0x0b04 }
            r8 = 0
            int r5 = java.lang.Math.max(r8, r5)     // Catch:{ all -> 0x0b04 }
            long r4 = (long) r5     // Catch:{ all -> 0x0b04 }
            long r12 = r12 - r4
            r4 = 0
            int r8 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r8 <= 0) goto L_0x04b0
            int r2 = (r12 > r22 ? 1 : (r12 == r22 ? 0 : -1))
            if (r2 != 0) goto L_0x049f
            com.google.android.gms.measurement.internal.j3 r2 = r34.d()     // Catch:{ all -> 0x0b04 }
            com.google.android.gms.measurement.internal.h3 r2 = r2.r()     // Catch:{ all -> 0x0b04 }
            java.lang.String r3 = "Too many error events logged. appId, count"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.j3.z(r10)     // Catch:{ all -> 0x0b04 }
            long r5 = r11.f6007d     // Catch:{ all -> 0x0b04 }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x0b04 }
            r2.c(r3, r4, r5)     // Catch:{ all -> 0x0b04 }
        L_0x049f:
            com.google.android.gms.measurement.internal.j r2 = r1.f6561c     // Catch:{ all -> 0x0b04 }
            Q(r2)     // Catch:{ all -> 0x0b04 }
            r2.o()     // Catch:{ all -> 0x0b04 }
            com.google.android.gms.measurement.internal.j r2 = r1.f6561c
            Q(r2)
            r2.h0()
            return
        L_0x04b0:
            com.google.android.gms.measurement.internal.r r4 = r2.f6409f     // Catch:{ all -> 0x0b04 }
            android.os.Bundle r4 = r4.V()     // Catch:{ all -> 0x0b04 }
            com.google.android.gms.measurement.internal.d9 r5 = r34.g0()     // Catch:{ all -> 0x0b04 }
            java.lang.String r8 = "_o"
            java.lang.String r11 = r2.f6410g     // Catch:{ all -> 0x0b04 }
            r5.B(r4, r8, r11)     // Catch:{ all -> 0x0b04 }
            com.google.android.gms.measurement.internal.d9 r5 = r34.g0()     // Catch:{ all -> 0x0b04 }
            boolean r5 = r5.S(r10)     // Catch:{ all -> 0x0b04 }
            java.lang.String r8 = "_r"
            if (r5 == 0) goto L_0x04e1
            com.google.android.gms.measurement.internal.d9 r5 = r34.g0()     // Catch:{ all -> 0x0b04 }
            java.lang.Long r11 = java.lang.Long.valueOf(r22)     // Catch:{ all -> 0x0b04 }
            java.lang.String r12 = "_dbg"
            r5.B(r4, r12, r11)     // Catch:{ all -> 0x0b04 }
            com.google.android.gms.measurement.internal.d9 r5 = r34.g0()     // Catch:{ all -> 0x0b04 }
            r5.B(r4, r8, r11)     // Catch:{ all -> 0x0b04 }
        L_0x04e1:
            java.lang.String r5 = "_s"
            java.lang.String r11 = r2.f6408e     // Catch:{ all -> 0x0b04 }
            boolean r5 = r5.equals(r11)     // Catch:{ all -> 0x0b04 }
            if (r5 == 0) goto L_0x0507
            com.google.android.gms.measurement.internal.j r5 = r1.f6561c     // Catch:{ all -> 0x0b04 }
            Q(r5)     // Catch:{ all -> 0x0b04 }
            java.lang.String r11 = r3.f6059e     // Catch:{ all -> 0x0b04 }
            com.google.android.gms.measurement.internal.b9 r5 = r5.Z(r11, r7)     // Catch:{ all -> 0x0b04 }
            if (r5 == 0) goto L_0x0507
            java.lang.Object r11 = r5.f5872e     // Catch:{ all -> 0x0b04 }
            boolean r11 = r11 instanceof java.lang.Long     // Catch:{ all -> 0x0b04 }
            if (r11 == 0) goto L_0x0507
            com.google.android.gms.measurement.internal.d9 r11 = r34.g0()     // Catch:{ all -> 0x0b04 }
            java.lang.Object r5 = r5.f5872e     // Catch:{ all -> 0x0b04 }
            r11.B(r4, r7, r5)     // Catch:{ all -> 0x0b04 }
        L_0x0507:
            com.google.android.gms.measurement.internal.j r5 = r1.f6561c     // Catch:{ all -> 0x0b04 }
            Q(r5)     // Catch:{ all -> 0x0b04 }
            com.google.android.gms.common.internal.s.g(r10)     // Catch:{ all -> 0x0b04 }
            r5.h()     // Catch:{ all -> 0x0b04 }
            r5.i()     // Catch:{ all -> 0x0b04 }
            android.database.sqlite.SQLiteDatabase r7 = r5.R()     // Catch:{ SQLiteException -> 0x0543 }
            com.google.android.gms.measurement.internal.n4 r11 = r5.f5994a     // Catch:{ SQLiteException -> 0x0543 }
            com.google.android.gms.measurement.internal.g r11 = r11.z()     // Catch:{ SQLiteException -> 0x0543 }
            com.google.android.gms.measurement.internal.x2 r12 = com.google.android.gms.measurement.internal.y2.f6644q     // Catch:{ SQLiteException -> 0x0543 }
            int r11 = r11.o(r10, r12)     // Catch:{ SQLiteException -> 0x0543 }
            r12 = 1000000(0xf4240, float:1.401298E-39)
            int r11 = java.lang.Math.min(r12, r11)     // Catch:{ SQLiteException -> 0x0543 }
            r14 = 0
            int r11 = java.lang.Math.max(r14, r11)     // Catch:{ SQLiteException -> 0x0541 }
            java.lang.String r11 = java.lang.String.valueOf(r11)     // Catch:{ SQLiteException -> 0x0541 }
            java.lang.String[] r11 = new java.lang.String[]{r10, r11}     // Catch:{ SQLiteException -> 0x0541 }
            java.lang.String r12 = "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)"
            int r5 = r7.delete(r6, r12, r11)     // Catch:{ SQLiteException -> 0x0541 }
            long r11 = (long) r5
            goto L_0x055b
        L_0x0541:
            r0 = move-exception
            goto L_0x0545
        L_0x0543:
            r0 = move-exception
            r14 = 0
        L_0x0545:
            r7 = r0
            com.google.android.gms.measurement.internal.n4 r5 = r5.f5994a     // Catch:{ all -> 0x0b04 }
            com.google.android.gms.measurement.internal.j3 r5 = r5.d()     // Catch:{ all -> 0x0b04 }
            com.google.android.gms.measurement.internal.h3 r5 = r5.r()     // Catch:{ all -> 0x0b04 }
            java.lang.String r11 = "Error deleting over the limit events. appId"
            java.lang.Object r12 = com.google.android.gms.measurement.internal.j3.z(r10)     // Catch:{ all -> 0x0b04 }
            r5.c(r11, r12, r7)     // Catch:{ all -> 0x0b04 }
            r11 = 0
        L_0x055b:
            r16 = 0
            int r5 = (r11 > r16 ? 1 : (r11 == r16 ? 0 : -1))
            if (r5 <= 0) goto L_0x0576
            com.google.android.gms.measurement.internal.j3 r5 = r34.d()     // Catch:{ all -> 0x0b04 }
            com.google.android.gms.measurement.internal.h3 r5 = r5.w()     // Catch:{ all -> 0x0b04 }
            java.lang.String r7 = "Data lost. Too many events stored on disk, deleted. appId"
            java.lang.Object r13 = com.google.android.gms.measurement.internal.j3.z(r10)     // Catch:{ all -> 0x0b04 }
            java.lang.Long r11 = java.lang.Long.valueOf(r11)     // Catch:{ all -> 0x0b04 }
            r5.c(r7, r13, r11)     // Catch:{ all -> 0x0b04 }
        L_0x0576:
            com.google.android.gms.measurement.internal.o r5 = new com.google.android.gms.measurement.internal.o     // Catch:{ all -> 0x0b04 }
            com.google.android.gms.measurement.internal.n4 r12 = r1.f6570l     // Catch:{ all -> 0x0b04 }
            java.lang.String r13 = r2.f6410g     // Catch:{ all -> 0x0b04 }
            java.lang.String r7 = r2.f6408e     // Catch:{ all -> 0x0b04 }
            long r2 = r2.f6411h     // Catch:{ all -> 0x0b04 }
            r18 = 0
            r11 = r5
            r30 = 0
            r14 = r10
            r31 = r6
            r6 = r15
            r15 = r7
            r16 = r2
            r20 = r4
            r11.<init>((com.google.android.gms.measurement.internal.n4) r12, (java.lang.String) r13, (java.lang.String) r14, (java.lang.String) r15, (long) r16, (long) r18, (android.os.Bundle) r20)     // Catch:{ all -> 0x0b04 }
            com.google.android.gms.measurement.internal.j r2 = r1.f6561c     // Catch:{ all -> 0x0b04 }
            Q(r2)     // Catch:{ all -> 0x0b04 }
            java.lang.String r3 = r5.f6270b     // Catch:{ all -> 0x0b04 }
            com.google.android.gms.measurement.internal.p r2 = r2.X(r10, r3)     // Catch:{ all -> 0x0b04 }
            if (r2 != 0) goto L_0x0617
            com.google.android.gms.measurement.internal.j r2 = r1.f6561c     // Catch:{ all -> 0x0b04 }
            Q(r2)     // Catch:{ all -> 0x0b04 }
            long r2 = r2.Q(r10)     // Catch:{ all -> 0x0b04 }
            com.google.android.gms.measurement.internal.g r4 = r34.T()     // Catch:{ all -> 0x0b04 }
            int r4 = r4.l(r10)     // Catch:{ all -> 0x0b04 }
            long r11 = (long) r4     // Catch:{ all -> 0x0b04 }
            int r4 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r4 < 0) goto L_0x05f9
            if (r9 == 0) goto L_0x05f9
            com.google.android.gms.measurement.internal.j3 r2 = r34.d()     // Catch:{ all -> 0x0b04 }
            com.google.android.gms.measurement.internal.h3 r2 = r2.r()     // Catch:{ all -> 0x0b04 }
            java.lang.String r3 = "Too many event names used, ignoring event. appId, name, supported count"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.j3.z(r10)     // Catch:{ all -> 0x0b04 }
            com.google.android.gms.measurement.internal.n4 r6 = r1.f6570l     // Catch:{ all -> 0x0b04 }
            com.google.android.gms.measurement.internal.e3 r6 = r6.D()     // Catch:{ all -> 0x0b04 }
            java.lang.String r5 = r5.f6270b     // Catch:{ all -> 0x0b04 }
            java.lang.String r5 = r6.q(r5)     // Catch:{ all -> 0x0b04 }
            com.google.android.gms.measurement.internal.g r6 = r34.T()     // Catch:{ all -> 0x0b04 }
            int r6 = r6.l(r10)     // Catch:{ all -> 0x0b04 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x0b04 }
            r2.d(r3, r4, r5, r6)     // Catch:{ all -> 0x0b04 }
            com.google.android.gms.measurement.internal.d9 r11 = r34.g0()     // Catch:{ all -> 0x0b04 }
            com.google.android.gms.measurement.internal.c9 r12 = r1.B     // Catch:{ all -> 0x0b04 }
            r14 = 8
            r15 = 0
            r16 = 0
            r17 = 0
            r13 = r10
            r11.A(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x0b04 }
            com.google.android.gms.measurement.internal.j r2 = r1.f6561c
            Q(r2)
            r2.h0()
            return
        L_0x05f9:
            com.google.android.gms.measurement.internal.p r2 = new com.google.android.gms.measurement.internal.p     // Catch:{ all -> 0x0b04 }
            java.lang.String r13 = r5.f6270b     // Catch:{ all -> 0x0b04 }
            long r3 = r5.f6272d     // Catch:{ all -> 0x0b04 }
            r14 = 0
            r16 = 0
            r18 = 0
            r22 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r11 = r2
            r12 = r10
            r20 = r3
            r11.<init>(r12, r13, r14, r16, r18, r20, r22, r24, r25, r26, r27)     // Catch:{ all -> 0x0b04 }
            goto L_0x0625
        L_0x0617:
            com.google.android.gms.measurement.internal.n4 r3 = r1.f6570l     // Catch:{ all -> 0x0b04 }
            long r9 = r2.f6307f     // Catch:{ all -> 0x0b04 }
            com.google.android.gms.measurement.internal.o r5 = r5.a(r3, r9)     // Catch:{ all -> 0x0b04 }
            long r3 = r5.f6272d     // Catch:{ all -> 0x0b04 }
            com.google.android.gms.measurement.internal.p r2 = r2.c(r3)     // Catch:{ all -> 0x0b04 }
        L_0x0625:
            com.google.android.gms.measurement.internal.j r3 = r1.f6561c     // Catch:{ all -> 0x0b04 }
            Q(r3)     // Catch:{ all -> 0x0b04 }
            r3.q(r2)     // Catch:{ all -> 0x0b04 }
            com.google.android.gms.measurement.internal.l4 r2 = r34.b()     // Catch:{ all -> 0x0b04 }
            r2.h()     // Catch:{ all -> 0x0b04 }
            r34.g()     // Catch:{ all -> 0x0b04 }
            com.google.android.gms.common.internal.s.k(r5)     // Catch:{ all -> 0x0b04 }
            com.google.android.gms.common.internal.s.k(r36)     // Catch:{ all -> 0x0b04 }
            java.lang.String r2 = r5.f6269a     // Catch:{ all -> 0x0b04 }
            com.google.android.gms.common.internal.s.g(r2)     // Catch:{ all -> 0x0b04 }
            java.lang.String r2 = r5.f6269a     // Catch:{ all -> 0x0b04 }
            r3 = r36
            java.lang.String r4 = r3.f6059e     // Catch:{ all -> 0x0b04 }
            boolean r2 = r2.equals(r4)     // Catch:{ all -> 0x0b04 }
            com.google.android.gms.common.internal.s.a(r2)     // Catch:{ all -> 0x0b04 }
            com.google.android.gms.internal.measurement.zzfx r2 = com.google.android.gms.internal.measurement.zzfy.zzu()     // Catch:{ all -> 0x0b04 }
            r4 = 1
            r2.zzaa(r4)     // Catch:{ all -> 0x0b04 }
            java.lang.String r7 = "android"
            r2.zzW(r7)     // Catch:{ all -> 0x0b04 }
            java.lang.String r7 = r3.f6059e     // Catch:{ all -> 0x0b04 }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x0b04 }
            if (r7 != 0) goto L_0x0669
            java.lang.String r7 = r3.f6059e     // Catch:{ all -> 0x0b04 }
            r2.zzA(r7)     // Catch:{ all -> 0x0b04 }
        L_0x0669:
            java.lang.String r7 = r3.f6062h     // Catch:{ all -> 0x0b04 }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x0b04 }
            if (r7 != 0) goto L_0x0676
            java.lang.String r7 = r3.f6062h     // Catch:{ all -> 0x0b04 }
            r2.zzC(r7)     // Catch:{ all -> 0x0b04 }
        L_0x0676:
            java.lang.String r7 = r3.f6061g     // Catch:{ all -> 0x0b04 }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x0b04 }
            if (r7 != 0) goto L_0x0683
            java.lang.String r7 = r3.f6061g     // Catch:{ all -> 0x0b04 }
            r2.zzD(r7)     // Catch:{ all -> 0x0b04 }
        L_0x0683:
            long r9 = r3.f6068n     // Catch:{ all -> 0x0b04 }
            r11 = -2147483648(0xffffffff80000000, double:NaN)
            int r7 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r7 == 0) goto L_0x0690
            int r7 = (int) r9     // Catch:{ all -> 0x0b04 }
            r2.zzE(r7)     // Catch:{ all -> 0x0b04 }
        L_0x0690:
            long r9 = r3.f6063i     // Catch:{ all -> 0x0b04 }
            r2.zzS(r9)     // Catch:{ all -> 0x0b04 }
            java.lang.String r7 = r3.f6060f     // Catch:{ all -> 0x0b04 }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x0b04 }
            if (r7 != 0) goto L_0x06a2
            java.lang.String r7 = r3.f6060f     // Catch:{ all -> 0x0b04 }
            r2.zzR(r7)     // Catch:{ all -> 0x0b04 }
        L_0x06a2:
            java.lang.String r7 = r3.f6059e     // Catch:{ all -> 0x0b04 }
            java.lang.Object r7 = com.google.android.gms.common.internal.s.k(r7)     // Catch:{ all -> 0x0b04 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ all -> 0x0b04 }
            h4.a r7 = r1.U(r7)     // Catch:{ all -> 0x0b04 }
            java.lang.String r9 = r3.f6080z     // Catch:{ all -> 0x0b04 }
            h4.a r9 = h4.a.b(r9)     // Catch:{ all -> 0x0b04 }
            h4.a r7 = r7.c(r9)     // Catch:{ all -> 0x0b04 }
            java.lang.String r7 = r7.i()     // Catch:{ all -> 0x0b04 }
            r2.zzI(r7)     // Catch:{ all -> 0x0b04 }
            com.google.android.gms.internal.measurement.zzoq.zzc()     // Catch:{ all -> 0x0b04 }
            com.google.android.gms.measurement.internal.g r7 = r34.T()     // Catch:{ all -> 0x0b04 }
            java.lang.String r9 = r3.f6059e     // Catch:{ all -> 0x0b04 }
            com.google.android.gms.measurement.internal.x2 r10 = com.google.android.gms.measurement.internal.y2.f6623f0     // Catch:{ all -> 0x0b04 }
            boolean r7 = r7.B(r9, r10)     // Catch:{ all -> 0x0b04 }
            if (r7 == 0) goto L_0x0709
            java.lang.String r7 = r2.zzan()     // Catch:{ all -> 0x0b04 }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x0b04 }
            if (r7 == 0) goto L_0x06e7
            java.lang.String r7 = r3.f6079y     // Catch:{ all -> 0x0b04 }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x0b04 }
            if (r7 != 0) goto L_0x06e7
            java.lang.String r7 = r3.f6079y     // Catch:{ all -> 0x0b04 }
            r2.zzQ(r7)     // Catch:{ all -> 0x0b04 }
        L_0x06e7:
            java.lang.String r7 = r2.zzan()     // Catch:{ all -> 0x0b04 }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x0b04 }
            if (r7 == 0) goto L_0x071e
            java.lang.String r7 = r2.zzam()     // Catch:{ all -> 0x0b04 }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x0b04 }
            if (r7 == 0) goto L_0x071e
            java.lang.String r7 = r3.f6075u     // Catch:{ all -> 0x0b04 }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x0b04 }
            if (r7 != 0) goto L_0x071e
            java.lang.String r7 = r3.f6075u     // Catch:{ all -> 0x0b04 }
        L_0x0705:
            r2.zzy(r7)     // Catch:{ all -> 0x0b04 }
            goto L_0x071e
        L_0x0709:
            java.lang.String r7 = r2.zzan()     // Catch:{ all -> 0x0b04 }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x0b04 }
            if (r7 == 0) goto L_0x071e
            java.lang.String r7 = r3.f6075u     // Catch:{ all -> 0x0b04 }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x0b04 }
            if (r7 != 0) goto L_0x071e
            java.lang.String r7 = r3.f6075u     // Catch:{ all -> 0x0b04 }
            goto L_0x0705
        L_0x071e:
            long r9 = r3.f6064j     // Catch:{ all -> 0x0b04 }
            r11 = 0
            int r7 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r7 == 0) goto L_0x0729
            r2.zzJ(r9)     // Catch:{ all -> 0x0b04 }
        L_0x0729:
            long r9 = r3.f6077w     // Catch:{ all -> 0x0b04 }
            r2.zzM(r9)     // Catch:{ all -> 0x0b04 }
            com.google.android.gms.measurement.internal.y8 r7 = r1.f6565g     // Catch:{ all -> 0x0b04 }
            Q(r7)     // Catch:{ all -> 0x0b04 }
            com.google.android.gms.measurement.internal.w8 r9 = r7.f6214b     // Catch:{ all -> 0x0b04 }
            com.google.android.gms.measurement.internal.n4 r9 = r9.f6570l     // Catch:{ all -> 0x0b04 }
            android.content.Context r9 = r9.c()     // Catch:{ all -> 0x0b04 }
            java.util.Map r9 = com.google.android.gms.measurement.internal.y2.c(r9)     // Catch:{ all -> 0x0b04 }
            if (r9 == 0) goto L_0x07c5
            int r10 = r9.size()     // Catch:{ all -> 0x0b04 }
            if (r10 != 0) goto L_0x0749
            goto L_0x07c5
        L_0x0749:
            java.util.ArrayList r14 = new java.util.ArrayList     // Catch:{ all -> 0x0b04 }
            r14.<init>()     // Catch:{ all -> 0x0b04 }
            com.google.android.gms.measurement.internal.x2 r10 = com.google.android.gms.measurement.internal.y2.Q     // Catch:{ all -> 0x0b04 }
            java.lang.Object r10 = r10.a(r6)     // Catch:{ all -> 0x0b04 }
            java.lang.Integer r10 = (java.lang.Integer) r10     // Catch:{ all -> 0x0b04 }
            int r10 = r10.intValue()     // Catch:{ all -> 0x0b04 }
            java.util.Set r9 = r9.entrySet()     // Catch:{ all -> 0x0b04 }
            java.util.Iterator r9 = r9.iterator()     // Catch:{ all -> 0x0b04 }
        L_0x0762:
            boolean r11 = r9.hasNext()     // Catch:{ all -> 0x0b04 }
            if (r11 == 0) goto L_0x07bf
            java.lang.Object r11 = r9.next()     // Catch:{ all -> 0x0b04 }
            java.util.Map$Entry r11 = (java.util.Map.Entry) r11     // Catch:{ all -> 0x0b04 }
            java.lang.Object r12 = r11.getKey()     // Catch:{ all -> 0x0b04 }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ all -> 0x0b04 }
            java.lang.String r13 = "measurement.id."
            boolean r12 = r12.startsWith(r13)     // Catch:{ all -> 0x0b04 }
            if (r12 == 0) goto L_0x0762
            java.lang.Object r11 = r11.getValue()     // Catch:{ NumberFormatException -> 0x07ad }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ NumberFormatException -> 0x07ad }
            int r11 = java.lang.Integer.parseInt(r11)     // Catch:{ NumberFormatException -> 0x07ad }
            if (r11 == 0) goto L_0x0762
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ NumberFormatException -> 0x07ad }
            r14.add(r11)     // Catch:{ NumberFormatException -> 0x07ad }
            int r11 = r14.size()     // Catch:{ NumberFormatException -> 0x07ad }
            if (r11 < r10) goto L_0x0762
            com.google.android.gms.measurement.internal.n4 r11 = r7.f5994a     // Catch:{ NumberFormatException -> 0x07ad }
            com.google.android.gms.measurement.internal.j3 r11 = r11.d()     // Catch:{ NumberFormatException -> 0x07ad }
            com.google.android.gms.measurement.internal.h3 r11 = r11.w()     // Catch:{ NumberFormatException -> 0x07ad }
            java.lang.String r12 = "Too many experiment IDs. Number of IDs"
            int r13 = r14.size()     // Catch:{ NumberFormatException -> 0x07ad }
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)     // Catch:{ NumberFormatException -> 0x07ad }
            r11.b(r12, r13)     // Catch:{ NumberFormatException -> 0x07ad }
            goto L_0x07bf
        L_0x07ad:
            r0 = move-exception
            r11 = r0
            com.google.android.gms.measurement.internal.n4 r12 = r7.f5994a     // Catch:{ all -> 0x0b04 }
            com.google.android.gms.measurement.internal.j3 r12 = r12.d()     // Catch:{ all -> 0x0b04 }
            com.google.android.gms.measurement.internal.h3 r12 = r12.w()     // Catch:{ all -> 0x0b04 }
            java.lang.String r13 = "Experiment ID NumberFormatException"
            r12.b(r13, r11)     // Catch:{ all -> 0x0b04 }
            goto L_0x0762
        L_0x07bf:
            int r7 = r14.size()     // Catch:{ all -> 0x0b04 }
            if (r7 != 0) goto L_0x07c6
        L_0x07c5:
            r14 = r6
        L_0x07c6:
            if (r14 == 0) goto L_0x07cb
            r2.zzh(r14)     // Catch:{ all -> 0x0b04 }
        L_0x07cb:
            java.lang.String r7 = r3.f6059e     // Catch:{ all -> 0x0b04 }
            java.lang.Object r7 = com.google.android.gms.common.internal.s.k(r7)     // Catch:{ all -> 0x0b04 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ all -> 0x0b04 }
            h4.a r7 = r1.U(r7)     // Catch:{ all -> 0x0b04 }
            java.lang.String r9 = r3.f6080z     // Catch:{ all -> 0x0b04 }
            h4.a r9 = h4.a.b(r9)     // Catch:{ all -> 0x0b04 }
            h4.a r7 = r7.c(r9)     // Catch:{ all -> 0x0b04 }
            boolean r9 = r7.j()     // Catch:{ all -> 0x0b04 }
            if (r9 == 0) goto L_0x0811
            com.google.android.gms.measurement.internal.w7 r9 = r1.f6567i     // Catch:{ all -> 0x0b04 }
            java.lang.String r10 = r3.f6059e     // Catch:{ all -> 0x0b04 }
            android.util.Pair r9 = r9.n(r10, r7)     // Catch:{ all -> 0x0b04 }
            java.lang.Object r10 = r9.first     // Catch:{ all -> 0x0b04 }
            java.lang.CharSequence r10 = (java.lang.CharSequence) r10     // Catch:{ all -> 0x0b04 }
            boolean r10 = android.text.TextUtils.isEmpty(r10)     // Catch:{ all -> 0x0b04 }
            if (r10 != 0) goto L_0x0811
            boolean r10 = r3.f6073s     // Catch:{ all -> 0x0b04 }
            if (r10 == 0) goto L_0x0811
            java.lang.Object r10 = r9.first     // Catch:{ all -> 0x0b04 }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ all -> 0x0b04 }
            r2.zzab(r10)     // Catch:{ all -> 0x0b04 }
            java.lang.Object r9 = r9.second     // Catch:{ all -> 0x0b04 }
            if (r9 == 0) goto L_0x0811
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch:{ all -> 0x0b04 }
            boolean r9 = r9.booleanValue()     // Catch:{ all -> 0x0b04 }
            r2.zzU(r9)     // Catch:{ all -> 0x0b04 }
        L_0x0811:
            com.google.android.gms.measurement.internal.n4 r9 = r1.f6570l     // Catch:{ all -> 0x0b04 }
            com.google.android.gms.measurement.internal.n r9 = r9.A()     // Catch:{ all -> 0x0b04 }
            r9.k()     // Catch:{ all -> 0x0b04 }
            java.lang.String r9 = android.os.Build.MODEL     // Catch:{ all -> 0x0b04 }
            r2.zzK(r9)     // Catch:{ all -> 0x0b04 }
            com.google.android.gms.measurement.internal.n4 r9 = r1.f6570l     // Catch:{ all -> 0x0b04 }
            com.google.android.gms.measurement.internal.n r9 = r9.A()     // Catch:{ all -> 0x0b04 }
            r9.k()     // Catch:{ all -> 0x0b04 }
            java.lang.String r9 = android.os.Build.VERSION.RELEASE     // Catch:{ all -> 0x0b04 }
            r2.zzV(r9)     // Catch:{ all -> 0x0b04 }
            com.google.android.gms.measurement.internal.n4 r9 = r1.f6570l     // Catch:{ all -> 0x0b04 }
            com.google.android.gms.measurement.internal.n r9 = r9.A()     // Catch:{ all -> 0x0b04 }
            long r9 = r9.p()     // Catch:{ all -> 0x0b04 }
            int r10 = (int) r9     // Catch:{ all -> 0x0b04 }
            r2.zzaf(r10)     // Catch:{ all -> 0x0b04 }
            com.google.android.gms.measurement.internal.n4 r9 = r1.f6570l     // Catch:{ all -> 0x0b04 }
            com.google.android.gms.measurement.internal.n r9 = r9.A()     // Catch:{ all -> 0x0b04 }
            java.lang.String r9 = r9.q()     // Catch:{ all -> 0x0b04 }
            r2.zzaj(r9)     // Catch:{ all -> 0x0b04 }
            com.google.android.gms.measurement.internal.g r9 = r34.T()     // Catch:{ all -> 0x0b04 }
            com.google.android.gms.measurement.internal.x2 r10 = com.google.android.gms.measurement.internal.y2.f6643p0     // Catch:{ all -> 0x0b04 }
            boolean r9 = r9.B(r6, r10)     // Catch:{ all -> 0x0b04 }
            if (r9 != 0) goto L_0x0859
            long r11 = r3.f6070p     // Catch:{ all -> 0x0b04 }
            r2.zzz(r11)     // Catch:{ all -> 0x0b04 }
        L_0x0859:
            com.google.android.gms.measurement.internal.n4 r9 = r1.f6570l     // Catch:{ all -> 0x0b04 }
            boolean r9 = r9.o()     // Catch:{ all -> 0x0b04 }
            if (r9 == 0) goto L_0x086d
            r2.zzal()     // Catch:{ all -> 0x0b04 }
            boolean r9 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x0b04 }
            if (r9 != 0) goto L_0x086d
            r2.zzL(r6)     // Catch:{ all -> 0x0b04 }
        L_0x086d:
            com.google.android.gms.measurement.internal.j r9 = r1.f6561c     // Catch:{ all -> 0x0b04 }
            Q(r9)     // Catch:{ all -> 0x0b04 }
            java.lang.String r11 = r3.f6059e     // Catch:{ all -> 0x0b04 }
            com.google.android.gms.measurement.internal.u4 r9 = r9.T(r11)     // Catch:{ all -> 0x0b04 }
            if (r9 != 0) goto L_0x08ea
            com.google.android.gms.measurement.internal.u4 r9 = new com.google.android.gms.measurement.internal.u4     // Catch:{ all -> 0x0b04 }
            com.google.android.gms.measurement.internal.n4 r11 = r1.f6570l     // Catch:{ all -> 0x0b04 }
            java.lang.String r12 = r3.f6059e     // Catch:{ all -> 0x0b04 }
            r9.<init>(r11, r12)     // Catch:{ all -> 0x0b04 }
            java.lang.String r11 = r1.h0(r7)     // Catch:{ all -> 0x0b04 }
            r9.i(r11)     // Catch:{ all -> 0x0b04 }
            java.lang.String r11 = r3.f6069o     // Catch:{ all -> 0x0b04 }
            r9.w(r11)     // Catch:{ all -> 0x0b04 }
            java.lang.String r11 = r3.f6060f     // Catch:{ all -> 0x0b04 }
            r9.y(r11)     // Catch:{ all -> 0x0b04 }
            boolean r11 = r7.j()     // Catch:{ all -> 0x0b04 }
            if (r11 == 0) goto L_0x08a5
            com.google.android.gms.measurement.internal.w7 r11 = r1.f6567i     // Catch:{ all -> 0x0b04 }
            java.lang.String r12 = r3.f6059e     // Catch:{ all -> 0x0b04 }
            java.lang.String r11 = r11.o(r12)     // Catch:{ all -> 0x0b04 }
            r9.H(r11)     // Catch:{ all -> 0x0b04 }
        L_0x08a5:
            r11 = 0
            r9.D(r11)     // Catch:{ all -> 0x0b04 }
            r9.E(r11)     // Catch:{ all -> 0x0b04 }
            r9.C(r11)     // Catch:{ all -> 0x0b04 }
            java.lang.String r11 = r3.f6061g     // Catch:{ all -> 0x0b04 }
            r9.k(r11)     // Catch:{ all -> 0x0b04 }
            long r11 = r3.f6068n     // Catch:{ all -> 0x0b04 }
            r9.l(r11)     // Catch:{ all -> 0x0b04 }
            java.lang.String r11 = r3.f6062h     // Catch:{ all -> 0x0b04 }
            r9.j(r11)     // Catch:{ all -> 0x0b04 }
            long r11 = r3.f6063i     // Catch:{ all -> 0x0b04 }
            r9.z(r11)     // Catch:{ all -> 0x0b04 }
            long r11 = r3.f6064j     // Catch:{ all -> 0x0b04 }
            r9.t(r11)     // Catch:{ all -> 0x0b04 }
            boolean r11 = r3.f6066l     // Catch:{ all -> 0x0b04 }
            r9.F(r11)     // Catch:{ all -> 0x0b04 }
            com.google.android.gms.measurement.internal.g r11 = r34.T()     // Catch:{ all -> 0x0b04 }
            boolean r10 = r11.B(r6, r10)     // Catch:{ all -> 0x0b04 }
            if (r10 != 0) goto L_0x08dd
            long r10 = r3.f6070p     // Catch:{ all -> 0x0b04 }
            r9.h(r10)     // Catch:{ all -> 0x0b04 }
        L_0x08dd:
            long r10 = r3.f6077w     // Catch:{ all -> 0x0b04 }
            r9.u(r10)     // Catch:{ all -> 0x0b04 }
            com.google.android.gms.measurement.internal.j r10 = r1.f6561c     // Catch:{ all -> 0x0b04 }
            Q(r10)     // Catch:{ all -> 0x0b04 }
            r10.p(r9)     // Catch:{ all -> 0x0b04 }
        L_0x08ea:
            boolean r7 = r7.k()     // Catch:{ all -> 0x0b04 }
            if (r7 == 0) goto L_0x0907
            java.lang.String r7 = r9.f0()     // Catch:{ all -> 0x0b04 }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x0b04 }
            if (r7 != 0) goto L_0x0907
            java.lang.String r7 = r9.f0()     // Catch:{ all -> 0x0b04 }
            java.lang.Object r7 = com.google.android.gms.common.internal.s.k(r7)     // Catch:{ all -> 0x0b04 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ all -> 0x0b04 }
            r2.zzB(r7)     // Catch:{ all -> 0x0b04 }
        L_0x0907:
            java.lang.String r7 = r9.i0()     // Catch:{ all -> 0x0b04 }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x0b04 }
            if (r7 != 0) goto L_0x091e
            java.lang.String r7 = r9.i0()     // Catch:{ all -> 0x0b04 }
            java.lang.Object r7 = com.google.android.gms.common.internal.s.k(r7)     // Catch:{ all -> 0x0b04 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ all -> 0x0b04 }
            r2.zzP(r7)     // Catch:{ all -> 0x0b04 }
        L_0x091e:
            com.google.android.gms.measurement.internal.j r7 = r1.f6561c     // Catch:{ all -> 0x0b04 }
            Q(r7)     // Catch:{ all -> 0x0b04 }
            java.lang.String r3 = r3.f6059e     // Catch:{ all -> 0x0b04 }
            java.util.List r3 = r7.e0(r3)     // Catch:{ all -> 0x0b04 }
            r13 = 0
        L_0x092a:
            int r7 = r3.size()     // Catch:{ all -> 0x0b04 }
            if (r13 >= r7) goto L_0x0960
            com.google.android.gms.internal.measurement.zzgg r7 = com.google.android.gms.internal.measurement.zzgh.zzd()     // Catch:{ all -> 0x0b04 }
            java.lang.Object r9 = r3.get(r13)     // Catch:{ all -> 0x0b04 }
            com.google.android.gms.measurement.internal.b9 r9 = (com.google.android.gms.measurement.internal.b9) r9     // Catch:{ all -> 0x0b04 }
            java.lang.String r9 = r9.f5870c     // Catch:{ all -> 0x0b04 }
            r7.zzf(r9)     // Catch:{ all -> 0x0b04 }
            java.lang.Object r9 = r3.get(r13)     // Catch:{ all -> 0x0b04 }
            com.google.android.gms.measurement.internal.b9 r9 = (com.google.android.gms.measurement.internal.b9) r9     // Catch:{ all -> 0x0b04 }
            long r9 = r9.f5871d     // Catch:{ all -> 0x0b04 }
            r7.zzg(r9)     // Catch:{ all -> 0x0b04 }
            com.google.android.gms.measurement.internal.y8 r9 = r1.f6565g     // Catch:{ all -> 0x0b04 }
            Q(r9)     // Catch:{ all -> 0x0b04 }
            java.lang.Object r10 = r3.get(r13)     // Catch:{ all -> 0x0b04 }
            com.google.android.gms.measurement.internal.b9 r10 = (com.google.android.gms.measurement.internal.b9) r10     // Catch:{ all -> 0x0b04 }
            java.lang.Object r10 = r10.f5872e     // Catch:{ all -> 0x0b04 }
            r9.M(r7, r10)     // Catch:{ all -> 0x0b04 }
            r2.zzk(r7)     // Catch:{ all -> 0x0b04 }
            int r13 = r13 + 1
            goto L_0x092a
        L_0x0960:
            com.google.android.gms.measurement.internal.j r3 = r1.f6561c     // Catch:{ IOException -> 0x0aba }
            Q(r3)     // Catch:{ IOException -> 0x0aba }
            com.google.android.gms.internal.measurement.zzjz r7 = r2.zzaA()     // Catch:{ IOException -> 0x0aba }
            com.google.android.gms.internal.measurement.zzfy r7 = (com.google.android.gms.internal.measurement.zzfy) r7     // Catch:{ IOException -> 0x0aba }
            r3.h()     // Catch:{ IOException -> 0x0aba }
            r3.i()     // Catch:{ IOException -> 0x0aba }
            com.google.android.gms.common.internal.s.k(r7)     // Catch:{ IOException -> 0x0aba }
            java.lang.String r9 = r7.zzy()     // Catch:{ IOException -> 0x0aba }
            com.google.android.gms.common.internal.s.g(r9)     // Catch:{ IOException -> 0x0aba }
            byte[] r9 = r7.zzbs()     // Catch:{ IOException -> 0x0aba }
            com.google.android.gms.measurement.internal.w8 r10 = r3.f6214b     // Catch:{ IOException -> 0x0aba }
            com.google.android.gms.measurement.internal.y8 r10 = r10.f6565g     // Catch:{ IOException -> 0x0aba }
            Q(r10)     // Catch:{ IOException -> 0x0aba }
            long r10 = r10.y(r9)     // Catch:{ IOException -> 0x0aba }
            android.content.ContentValues r12 = new android.content.ContentValues     // Catch:{ IOException -> 0x0aba }
            r12.<init>()     // Catch:{ IOException -> 0x0aba }
            java.lang.String r13 = r7.zzy()     // Catch:{ IOException -> 0x0aba }
            r14 = r33
            r12.put(r14, r13)     // Catch:{ IOException -> 0x0aba }
            java.lang.Long r13 = java.lang.Long.valueOf(r10)     // Catch:{ IOException -> 0x0aba }
            r15 = r32
            r12.put(r15, r13)     // Catch:{ IOException -> 0x0aba }
            java.lang.String r13 = "metadata"
            r12.put(r13, r9)     // Catch:{ IOException -> 0x0aba }
            android.database.sqlite.SQLiteDatabase r9 = r3.R()     // Catch:{ SQLiteException -> 0x0aa0 }
            java.lang.String r13 = "raw_events_metadata"
            r4 = 4
            r9.insertWithOnConflict(r13, r6, r12, r4)     // Catch:{ SQLiteException -> 0x0aa0 }
            com.google.android.gms.measurement.internal.j r2 = r1.f6561c     // Catch:{ all -> 0x0b04 }
            Q(r2)     // Catch:{ all -> 0x0b04 }
            com.google.android.gms.measurement.internal.r r3 = r5.f6274f     // Catch:{ all -> 0x0b04 }
            com.google.android.gms.measurement.internal.q r4 = new com.google.android.gms.measurement.internal.q     // Catch:{ all -> 0x0b04 }
            r4.<init>(r3)     // Catch:{ all -> 0x0b04 }
        L_0x09bc:
            boolean r3 = r4.hasNext()     // Catch:{ all -> 0x0b04 }
            if (r3 == 0) goto L_0x09ce
            java.lang.String r3 = r4.next()     // Catch:{ all -> 0x0b04 }
            boolean r3 = r8.equals(r3)     // Catch:{ all -> 0x0b04 }
            if (r3 == 0) goto L_0x09bc
        L_0x09cc:
            r13 = 1
            goto L_0x0a0f
        L_0x09ce:
            com.google.android.gms.measurement.internal.h4 r3 = r1.f6559a     // Catch:{ all -> 0x0b04 }
            Q(r3)     // Catch:{ all -> 0x0b04 }
            java.lang.String r4 = r5.f6269a     // Catch:{ all -> 0x0b04 }
            java.lang.String r7 = r5.f6270b     // Catch:{ all -> 0x0b04 }
            boolean r3 = r3.w(r4, r7)     // Catch:{ all -> 0x0b04 }
            com.google.android.gms.measurement.internal.j r4 = r1.f6561c     // Catch:{ all -> 0x0b04 }
            Q(r4)     // Catch:{ all -> 0x0b04 }
            long r17 = r34.F()     // Catch:{ all -> 0x0b04 }
            java.lang.String r7 = r5.f6269a     // Catch:{ all -> 0x0b04 }
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r16 = r4
            r19 = r7
            com.google.android.gms.measurement.internal.h r4 = r16.V(r17, r19, r20, r21, r22, r23, r24)     // Catch:{ all -> 0x0b04 }
            if (r3 == 0) goto L_0x0a0e
            long r3 = r4.f6008e     // Catch:{ all -> 0x0b04 }
            com.google.android.gms.measurement.internal.g r7 = r34.T()     // Catch:{ all -> 0x0b04 }
            java.lang.String r8 = r5.f6269a     // Catch:{ all -> 0x0b04 }
            com.google.android.gms.measurement.internal.x2 r9 = com.google.android.gms.measurement.internal.y2.f6642p     // Catch:{ all -> 0x0b04 }
            int r7 = r7.o(r8, r9)     // Catch:{ all -> 0x0b04 }
            long r7 = (long) r7     // Catch:{ all -> 0x0b04 }
            int r9 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r9 >= 0) goto L_0x0a0e
            goto L_0x09cc
        L_0x0a0e:
            r13 = 0
        L_0x0a0f:
            r2.h()     // Catch:{ all -> 0x0b04 }
            r2.i()     // Catch:{ all -> 0x0b04 }
            com.google.android.gms.common.internal.s.k(r5)     // Catch:{ all -> 0x0b04 }
            java.lang.String r3 = r5.f6269a     // Catch:{ all -> 0x0b04 }
            com.google.android.gms.common.internal.s.g(r3)     // Catch:{ all -> 0x0b04 }
            com.google.android.gms.measurement.internal.w8 r3 = r2.f6214b     // Catch:{ all -> 0x0b04 }
            com.google.android.gms.measurement.internal.y8 r3 = r3.f6565g     // Catch:{ all -> 0x0b04 }
            Q(r3)     // Catch:{ all -> 0x0b04 }
            com.google.android.gms.internal.measurement.zzfo r3 = r3.C(r5)     // Catch:{ all -> 0x0b04 }
            byte[] r3 = r3.zzbs()     // Catch:{ all -> 0x0b04 }
            android.content.ContentValues r4 = new android.content.ContentValues     // Catch:{ all -> 0x0b04 }
            r4.<init>()     // Catch:{ all -> 0x0b04 }
            java.lang.String r7 = r5.f6269a     // Catch:{ all -> 0x0b04 }
            r4.put(r14, r7)     // Catch:{ all -> 0x0b04 }
            java.lang.String r7 = "name"
            java.lang.String r8 = r5.f6270b     // Catch:{ all -> 0x0b04 }
            r4.put(r7, r8)     // Catch:{ all -> 0x0b04 }
            java.lang.String r7 = "timestamp"
            long r8 = r5.f6272d     // Catch:{ all -> 0x0b04 }
            java.lang.Long r8 = java.lang.Long.valueOf(r8)     // Catch:{ all -> 0x0b04 }
            r4.put(r7, r8)     // Catch:{ all -> 0x0b04 }
            java.lang.Long r7 = java.lang.Long.valueOf(r10)     // Catch:{ all -> 0x0b04 }
            r4.put(r15, r7)     // Catch:{ all -> 0x0b04 }
            java.lang.String r7 = "data"
            r4.put(r7, r3)     // Catch:{ all -> 0x0b04 }
            java.lang.String r3 = "realtime"
            java.lang.Integer r7 = java.lang.Integer.valueOf(r13)     // Catch:{ all -> 0x0b04 }
            r4.put(r3, r7)     // Catch:{ all -> 0x0b04 }
            android.database.sqlite.SQLiteDatabase r3 = r2.R()     // Catch:{ SQLiteException -> 0x0a88 }
            r7 = r31
            long r3 = r3.insert(r7, r6, r4)     // Catch:{ SQLiteException -> 0x0a88 }
            r6 = -1
            int r8 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r8 != 0) goto L_0x0a83
            com.google.android.gms.measurement.internal.n4 r3 = r2.f5994a     // Catch:{ SQLiteException -> 0x0a88 }
            com.google.android.gms.measurement.internal.j3 r3 = r3.d()     // Catch:{ SQLiteException -> 0x0a88 }
            com.google.android.gms.measurement.internal.h3 r3 = r3.r()     // Catch:{ SQLiteException -> 0x0a88 }
            java.lang.String r4 = "Failed to insert raw event (got -1). appId"
            java.lang.String r6 = r5.f6269a     // Catch:{ SQLiteException -> 0x0a88 }
            java.lang.Object r6 = com.google.android.gms.measurement.internal.j3.z(r6)     // Catch:{ SQLiteException -> 0x0a88 }
            r3.b(r4, r6)     // Catch:{ SQLiteException -> 0x0a88 }
            goto L_0x0ad1
        L_0x0a83:
            r3 = 0
            r1.f6573o = r3     // Catch:{ all -> 0x0b04 }
            goto L_0x0ad1
        L_0x0a88:
            r0 = move-exception
            r3 = r0
            com.google.android.gms.measurement.internal.n4 r2 = r2.f5994a     // Catch:{ all -> 0x0b04 }
            com.google.android.gms.measurement.internal.j3 r2 = r2.d()     // Catch:{ all -> 0x0b04 }
            com.google.android.gms.measurement.internal.h3 r2 = r2.r()     // Catch:{ all -> 0x0b04 }
            java.lang.String r4 = "Error storing raw event. appId"
            java.lang.String r5 = r5.f6269a     // Catch:{ all -> 0x0b04 }
            java.lang.Object r5 = com.google.android.gms.measurement.internal.j3.z(r5)     // Catch:{ all -> 0x0b04 }
            r2.c(r4, r5, r3)     // Catch:{ all -> 0x0b04 }
            goto L_0x0ad1
        L_0x0aa0:
            r0 = move-exception
            r4 = r0
            com.google.android.gms.measurement.internal.n4 r3 = r3.f5994a     // Catch:{ IOException -> 0x0aba }
            com.google.android.gms.measurement.internal.j3 r3 = r3.d()     // Catch:{ IOException -> 0x0aba }
            com.google.android.gms.measurement.internal.h3 r3 = r3.r()     // Catch:{ IOException -> 0x0aba }
            java.lang.String r5 = "Error storing raw event metadata. appId"
            java.lang.String r6 = r7.zzy()     // Catch:{ IOException -> 0x0aba }
            java.lang.Object r6 = com.google.android.gms.measurement.internal.j3.z(r6)     // Catch:{ IOException -> 0x0aba }
            r3.c(r5, r6, r4)     // Catch:{ IOException -> 0x0aba }
            throw r4     // Catch:{ IOException -> 0x0aba }
        L_0x0aba:
            r0 = move-exception
            r3 = r0
            com.google.android.gms.measurement.internal.j3 r4 = r34.d()     // Catch:{ all -> 0x0b04 }
            com.google.android.gms.measurement.internal.h3 r4 = r4.r()     // Catch:{ all -> 0x0b04 }
            java.lang.String r5 = "Data loss. Failed to insert raw event metadata. appId"
            java.lang.String r2 = r2.zzal()     // Catch:{ all -> 0x0b04 }
            java.lang.Object r2 = com.google.android.gms.measurement.internal.j3.z(r2)     // Catch:{ all -> 0x0b04 }
            r4.c(r5, r2, r3)     // Catch:{ all -> 0x0b04 }
        L_0x0ad1:
            com.google.android.gms.measurement.internal.j r2 = r1.f6561c     // Catch:{ all -> 0x0b04 }
            Q(r2)     // Catch:{ all -> 0x0b04 }
            r2.o()     // Catch:{ all -> 0x0b04 }
            com.google.android.gms.measurement.internal.j r2 = r1.f6561c
            Q(r2)
            r2.h0()
            r34.L()
            com.google.android.gms.measurement.internal.j3 r2 = r34.d()
            com.google.android.gms.measurement.internal.h3 r2 = r2.v()
            long r3 = java.lang.System.nanoTime()
            long r3 = r3 - r28
            r5 = 500000(0x7a120, double:2.47033E-318)
            long r3 = r3 + r5
            r5 = 1000000(0xf4240, double:4.940656E-318)
            long r3 = r3 / r5
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            java.lang.String r4 = "Background event processing time, ms"
            r2.b(r4, r3)
            return
        L_0x0b04:
            r0 = move-exception
            r2 = r0
            com.google.android.gms.measurement.internal.j r3 = r1.f6561c
            Q(r3)
            r3.h0()
            throw r2
        L_0x0b0f:
            r1.R(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.w8.B(com.google.android.gms.measurement.internal.t, com.google.android.gms.measurement.internal.i9):void");
    }

    /* access modifiers changed from: package-private */
    public final boolean C() {
        String str;
        h3 h3Var;
        FileLock fileLock;
        b().h();
        if (!T().B((String) null, y2.f6621e0) || (fileLock = this.f6580v) == null || !fileLock.isValid()) {
            this.f6561c.f5994a.z();
            try {
                FileChannel channel = new RandomAccessFile(new File(this.f6570l.c().getFilesDir(), "google_app_measurement.db"), "rw").getChannel();
                this.f6581w = channel;
                FileLock tryLock = channel.tryLock();
                this.f6580v = tryLock;
                if (tryLock != null) {
                    d().v().a("Storage concurrent access okay");
                    return true;
                }
                d().r().a("Storage concurrent data access panic");
                return false;
            } catch (FileNotFoundException e10) {
                e = e10;
                h3Var = d().r();
                str = "Failed to acquire storage lock";
                h3Var.b(str, e);
                return false;
            } catch (IOException e11) {
                e = e11;
                h3Var = d().r();
                str = "Failed to access storage lock file";
                h3Var.b(str, e);
                return false;
            } catch (OverlappingFileLockException e12) {
                e = e12;
                h3Var = d().w();
                str = "Storage lock already acquired";
                h3Var.b(str, e);
                return false;
            }
        } else {
            d().v().a("Storage concurrent access okay");
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    public final long F() {
        long currentTimeMillis = e().currentTimeMillis();
        w7 w7Var = this.f6567i;
        w7Var.i();
        w7Var.h();
        long a10 = w7Var.f6558k.a();
        if (a10 == 0) {
            a10 = ((long) w7Var.f5994a.N().t().nextInt(86400000)) + 1;
            w7Var.f6558k.b(a10);
        }
        return ((((currentTimeMillis + a10) / 1000) / 60) / 60) / 24;
    }

    /* access modifiers changed from: package-private */
    public final u4 R(i9 i9Var) {
        b().h();
        g();
        s.k(i9Var);
        s.g(i9Var.f6059e);
        j jVar = this.f6561c;
        Q(jVar);
        u4 T = jVar.T(i9Var.f6059e);
        a c10 = U(i9Var.f6059e).c(a.b(i9Var.f6080z));
        String o10 = c10.j() ? this.f6567i.o(i9Var.f6059e) : "";
        if (T == null) {
            T = new u4(this.f6570l, i9Var.f6059e);
            if (c10.k()) {
                T.i(h0(c10));
            }
            if (c10.j()) {
                T.H(o10);
            }
        } else if (c10.j() && o10 != null && !o10.equals(T.b())) {
            T.H(o10);
            T.i(h0(c10));
            zzna.zzc();
            if (T().B((String) null, y2.A0) && !"00000000-0000-0000-0000-000000000000".equals(this.f6567i.n(i9Var.f6059e, c10).first)) {
                j jVar2 = this.f6561c;
                Q(jVar2);
                if (jVar2.Z(i9Var.f6059e, "_id") != null) {
                    j jVar3 = this.f6561c;
                    Q(jVar3);
                    if (jVar3.Z(i9Var.f6059e, "_lair") == null) {
                        b9 b9Var = new b9(i9Var.f6059e, "auto", "_lair", e().currentTimeMillis(), 1L);
                        j jVar4 = this.f6561c;
                        Q(jVar4);
                        jVar4.z(b9Var);
                    }
                }
            }
        } else if (TextUtils.isEmpty(T.f0()) && c10.k()) {
            T.i(h0(c10));
        }
        T.y(i9Var.f6060f);
        T.f(i9Var.f6075u);
        zzoq.zzc();
        if (T().B(T.e0(), y2.f6623f0)) {
            T.x(i9Var.f6079y);
        }
        if (!TextUtils.isEmpty(i9Var.f6069o)) {
            T.w(i9Var.f6069o);
        }
        long j10 = i9Var.f6063i;
        if (j10 != 0) {
            T.z(j10);
        }
        if (!TextUtils.isEmpty(i9Var.f6061g)) {
            T.k(i9Var.f6061g);
        }
        T.l(i9Var.f6068n);
        String str = i9Var.f6062h;
        if (str != null) {
            T.j(str);
        }
        T.t(i9Var.f6064j);
        T.F(i9Var.f6066l);
        if (!TextUtils.isEmpty(i9Var.f6065k)) {
            T.B(i9Var.f6065k);
        }
        if (!T().B((String) null, y2.f6643p0)) {
            T.h(i9Var.f6070p);
        }
        T.g(i9Var.f6073s);
        T.G(i9Var.f6076v);
        T.u(i9Var.f6077w);
        if (T.L()) {
            j jVar5 = this.f6561c;
            Q(jVar5);
            jVar5.p(T);
        }
        return T;
    }

    public final q9 S() {
        q9 q9Var = this.f6564f;
        Q(q9Var);
        return q9Var;
    }

    public final g T() {
        return ((n4) s.k(this.f6570l)).z();
    }

    /* access modifiers changed from: package-private */
    public final a U(String str) {
        String str2;
        b().h();
        g();
        a aVar = (a) this.A.get(str);
        if (aVar != null) {
            return aVar;
        }
        j jVar = this.f6561c;
        Q(jVar);
        s.k(str);
        jVar.h();
        jVar.i();
        Cursor cursor = null;
        try {
            Cursor rawQuery = jVar.R().rawQuery("select consent_state from consent_settings where app_id=? limit 1;", new String[]{str});
            if (rawQuery.moveToFirst()) {
                str2 = rawQuery.getString(0);
                rawQuery.close();
            } else {
                rawQuery.close();
                str2 = "G1";
            }
            a b10 = a.b(str2);
            y(str, b10);
            return b10;
        } catch (SQLiteException e10) {
            jVar.f5994a.d().r().c("Database error", "select consent_state from consent_settings where app_id=? limit 1;", e10);
            throw e10;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    public final j V() {
        j jVar = this.f6561c;
        Q(jVar);
        return jVar;
    }

    public final e3 W() {
        return this.f6570l.D();
    }

    public final o3 X() {
        o3 o3Var = this.f6560b;
        Q(o3Var);
        return o3Var;
    }

    public final q3 Y() {
        q3 q3Var = this.f6562d;
        if (q3Var != null) {
            return q3Var;
        }
        throw new IllegalStateException("Network broadcast receiver not created");
    }

    public final h4 Z() {
        h4 h4Var = this.f6559a;
        Q(h4Var);
        return h4Var;
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        h3 r10;
        Integer valueOf;
        Integer valueOf2;
        String str;
        b().h();
        g();
        if (!this.f6572n) {
            this.f6572n = true;
            if (C()) {
                FileChannel fileChannel = this.f6581w;
                b().h();
                int i10 = 0;
                if (fileChannel == null || !fileChannel.isOpen()) {
                    d().r().a("Bad channel to read from");
                } else {
                    ByteBuffer allocate = ByteBuffer.allocate(4);
                    try {
                        fileChannel.position(0);
                        int read = fileChannel.read(allocate);
                        if (read == 4) {
                            allocate.flip();
                            i10 = allocate.getInt();
                        } else if (read != -1) {
                            d().w().b("Unexpected data length. Bytes read", Integer.valueOf(read));
                        }
                    } catch (IOException e10) {
                        d().r().b("Failed to read from channel", e10);
                    }
                }
                int p10 = this.f6570l.B().p();
                b().h();
                if (i10 > p10) {
                    r10 = d().r();
                    valueOf = Integer.valueOf(i10);
                    valueOf2 = Integer.valueOf(p10);
                    str = "Panic: can't downgrade version. Previous, current version";
                } else if (i10 < p10) {
                    FileChannel fileChannel2 = this.f6581w;
                    b().h();
                    if (fileChannel2 == null || !fileChannel2.isOpen()) {
                        d().r().a("Bad channel to read from");
                    } else {
                        ByteBuffer allocate2 = ByteBuffer.allocate(4);
                        allocate2.putInt(p10);
                        allocate2.flip();
                        try {
                            fileChannel2.truncate(0);
                            boolean B2 = T().B((String) null, y2.f6639n0);
                            fileChannel2.write(allocate2);
                            fileChannel2.force(true);
                            if (fileChannel2.size() != 4) {
                                d().r().b("Error writing to channel. Bytes written", Long.valueOf(fileChannel2.size()));
                            }
                            r10 = d().v();
                            valueOf = Integer.valueOf(i10);
                            valueOf2 = Integer.valueOf(p10);
                            str = "Storage version upgraded. Previous, current version";
                        } catch (IOException e11) {
                            d().r().b("Failed to write to channel", e11);
                        }
                    }
                    r10 = d().r();
                    valueOf = Integer.valueOf(i10);
                    valueOf2 = Integer.valueOf(p10);
                    str = "Storage version upgrade failed. Previous, current version";
                } else {
                    return;
                }
                r10.c(str, valueOf, valueOf2);
            }
        }
    }

    public final l4 b() {
        return ((n4) s.k(this.f6570l)).b();
    }

    /* access modifiers changed from: package-private */
    public final n4 b0() {
        return this.f6570l;
    }

    public final Context c() {
        return this.f6570l.c();
    }

    public final n6 c0() {
        n6 n6Var = this.f6566h;
        Q(n6Var);
        return n6Var;
    }

    public final j3 d() {
        return ((n4) s.k(this.f6570l)).d();
    }

    public final w7 d0() {
        return this.f6567i;
    }

    public final y3.e e() {
        return ((n4) s.k(this.f6570l)).e();
    }

    public final b f() {
        throw null;
    }

    public final y8 f0() {
        y8 y8Var = this.f6565g;
        Q(y8Var);
        return y8Var;
    }

    /* access modifiers changed from: package-private */
    public final void g() {
        if (!this.f6571m) {
            throw new IllegalStateException("UploadController is not initialized");
        }
    }

    public final d9 g0() {
        return ((n4) s.k(this.f6570l)).N();
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00a3, code lost:
        if (android.text.TextUtils.isEmpty(r3) != false) goto L_0x00a5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void h(com.google.android.gms.measurement.internal.u4 r13) {
        /*
            r12 = this;
            com.google.android.gms.measurement.internal.l4 r0 = r12.b()
            r0.h()
            com.google.android.gms.internal.measurement.zzoq.zzc()
            com.google.android.gms.measurement.internal.g r0 = r12.T()
            java.lang.String r1 = r13.e0()
            com.google.android.gms.measurement.internal.x2 r2 = com.google.android.gms.measurement.internal.y2.f6623f0
            boolean r0 = r0.B(r1, r2)
            if (r0 == 0) goto L_0x004e
            java.lang.String r0 = r13.k0()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0077
            java.lang.String r0 = r13.j0()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0077
            java.lang.String r0 = r13.c0()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0039
            goto L_0x0077
        L_0x0039:
            java.lang.String r13 = r13.e0()
            java.lang.Object r13 = com.google.android.gms.common.internal.s.k(r13)
            r1 = r13
            java.lang.String r1 = (java.lang.String) r1
            r2 = 204(0xcc, float:2.86E-43)
            r3 = 0
            r4 = 0
            r5 = 0
            r0 = r12
            r0.m(r1, r2, r3, r4, r5)
            return
        L_0x004e:
            java.lang.String r0 = r13.k0()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0077
            java.lang.String r0 = r13.c0()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0077
            java.lang.String r13 = r13.e0()
            java.lang.Object r13 = com.google.android.gms.common.internal.s.k(r13)
            r1 = r13
            java.lang.String r1 = (java.lang.String) r1
            r2 = 204(0xcc, float:2.86E-43)
            r3 = 0
            r4 = 0
            r5 = 0
            r0 = r12
            r0.m(r1, r2, r3, r4, r5)
            return
        L_0x0077:
            com.google.android.gms.measurement.internal.o8 r0 = r12.f6568j
            android.net.Uri$Builder r1 = new android.net.Uri$Builder
            r1.<init>()
            java.lang.String r3 = r13.k0()
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            if (r4 == 0) goto L_0x00a9
            com.google.android.gms.internal.measurement.zzoq.zzc()
            com.google.android.gms.measurement.internal.n4 r3 = r0.f5994a
            com.google.android.gms.measurement.internal.g r3 = r3.z()
            java.lang.String r4 = r13.e0()
            boolean r2 = r3.B(r4, r2)
            if (r2 == 0) goto L_0x00a5
            java.lang.String r3 = r13.j0()
            boolean r2 = android.text.TextUtils.isEmpty(r3)
            if (r2 == 0) goto L_0x00a9
        L_0x00a5:
            java.lang.String r3 = r13.c0()
        L_0x00a9:
            com.google.android.gms.measurement.internal.x2 r2 = com.google.android.gms.measurement.internal.y2.f6622f
            r4 = 0
            java.lang.Object r2 = r2.a(r4)
            java.lang.String r2 = (java.lang.String) r2
            android.net.Uri$Builder r2 = r1.scheme(r2)
            com.google.android.gms.measurement.internal.x2 r5 = com.google.android.gms.measurement.internal.y2.f6624g
            java.lang.Object r5 = r5.a(r4)
            java.lang.String r5 = (java.lang.String) r5
            android.net.Uri$Builder r2 = r2.encodedAuthority(r5)
            java.lang.String r3 = java.lang.String.valueOf(r3)
            int r5 = r3.length()
            java.lang.String r6 = "config/app/"
            if (r5 == 0) goto L_0x00d3
            java.lang.String r3 = r6.concat(r3)
            goto L_0x00d8
        L_0x00d3:
            java.lang.String r3 = new java.lang.String
            r3.<init>(r6)
        L_0x00d8:
            android.net.Uri$Builder r2 = r2.path(r3)
            java.lang.String r3 = r13.f0()
            java.lang.String r5 = "app_instance_id"
            android.net.Uri$Builder r2 = r2.appendQueryParameter(r5, r3)
            java.lang.String r3 = "platform"
            java.lang.String r5 = "android"
            android.net.Uri$Builder r2 = r2.appendQueryParameter(r3, r5)
            com.google.android.gms.measurement.internal.n4 r3 = r0.f5994a
            com.google.android.gms.measurement.internal.g r3 = r3.z()
            r3.q()
            r5 = 42097(0xa471, double:2.07987E-319)
            java.lang.String r3 = java.lang.String.valueOf(r5)
            java.lang.String r5 = "gmp_version"
            r2.appendQueryParameter(r5, r3)
            com.google.android.gms.internal.measurement.zzpl.zzc()
            com.google.android.gms.measurement.internal.n4 r0 = r0.f5994a
            com.google.android.gms.measurement.internal.g r0 = r0.z()
            java.lang.String r2 = r13.e0()
            com.google.android.gms.measurement.internal.x2 r3 = com.google.android.gms.measurement.internal.y2.f6659x0
            boolean r0 = r0.B(r2, r3)
            if (r0 == 0) goto L_0x011f
            java.lang.String r0 = "runtime_version"
            java.lang.String r2 = "0"
            r1.appendQueryParameter(r0, r2)
        L_0x011f:
            android.net.Uri r0 = r1.build()
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = r13.e0()     // Catch:{ MalformedURLException -> 0x0193 }
            java.lang.Object r1 = com.google.android.gms.common.internal.s.k(r1)     // Catch:{ MalformedURLException -> 0x0193 }
            r7 = r1
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ MalformedURLException -> 0x0193 }
            java.net.URL r8 = new java.net.URL     // Catch:{ MalformedURLException -> 0x0193 }
            r8.<init>(r0)     // Catch:{ MalformedURLException -> 0x0193 }
            com.google.android.gms.measurement.internal.j3 r1 = r12.d()     // Catch:{ MalformedURLException -> 0x0193 }
            com.google.android.gms.measurement.internal.h3 r1 = r1.v()     // Catch:{ MalformedURLException -> 0x0193 }
            java.lang.String r2 = "Fetching remote configuration"
            r1.b(r2, r7)     // Catch:{ MalformedURLException -> 0x0193 }
            com.google.android.gms.measurement.internal.h4 r1 = r12.f6559a     // Catch:{ MalformedURLException -> 0x0193 }
            Q(r1)     // Catch:{ MalformedURLException -> 0x0193 }
            com.google.android.gms.internal.measurement.zzfc r1 = r1.o(r7)     // Catch:{ MalformedURLException -> 0x0193 }
            com.google.android.gms.measurement.internal.h4 r2 = r12.f6559a     // Catch:{ MalformedURLException -> 0x0193 }
            Q(r2)     // Catch:{ MalformedURLException -> 0x0193 }
            java.lang.String r2 = r2.p(r7)     // Catch:{ MalformedURLException -> 0x0193 }
            if (r1 == 0) goto L_0x0168
            boolean r1 = android.text.TextUtils.isEmpty(r2)     // Catch:{ MalformedURLException -> 0x0193 }
            if (r1 != 0) goto L_0x0168
            androidx.collection.a r4 = new androidx.collection.a     // Catch:{ MalformedURLException -> 0x0193 }
            r4.<init>()     // Catch:{ MalformedURLException -> 0x0193 }
            java.lang.String r1 = "If-Modified-Since"
            r4.put(r1, r2)     // Catch:{ MalformedURLException -> 0x0193 }
        L_0x0168:
            r10 = r4
            r1 = 1
            r12.f6577s = r1     // Catch:{ MalformedURLException -> 0x0193 }
            com.google.android.gms.measurement.internal.o3 r6 = r12.f6560b     // Catch:{ MalformedURLException -> 0x0193 }
            Q(r6)     // Catch:{ MalformedURLException -> 0x0193 }
            com.google.android.gms.measurement.internal.r8 r11 = new com.google.android.gms.measurement.internal.r8     // Catch:{ MalformedURLException -> 0x0193 }
            r11.<init>(r12)     // Catch:{ MalformedURLException -> 0x0193 }
            r6.h()     // Catch:{ MalformedURLException -> 0x0193 }
            r6.i()     // Catch:{ MalformedURLException -> 0x0193 }
            com.google.android.gms.common.internal.s.k(r8)     // Catch:{ MalformedURLException -> 0x0193 }
            com.google.android.gms.common.internal.s.k(r11)     // Catch:{ MalformedURLException -> 0x0193 }
            com.google.android.gms.measurement.internal.n4 r1 = r6.f5994a     // Catch:{ MalformedURLException -> 0x0193 }
            com.google.android.gms.measurement.internal.l4 r1 = r1.b()     // Catch:{ MalformedURLException -> 0x0193 }
            com.google.android.gms.measurement.internal.n3 r2 = new com.google.android.gms.measurement.internal.n3     // Catch:{ MalformedURLException -> 0x0193 }
            r9 = 0
            r5 = r2
            r5.<init>(r6, r7, r8, r9, r10, r11)     // Catch:{ MalformedURLException -> 0x0193 }
            r1.y(r2)     // Catch:{ MalformedURLException -> 0x0193 }
            return
        L_0x0193:
            com.google.android.gms.measurement.internal.j3 r1 = r12.d()
            com.google.android.gms.measurement.internal.h3 r1 = r1.r()
            java.lang.String r13 = r13.e0()
            java.lang.Object r13 = com.google.android.gms.measurement.internal.j3.z(r13)
            java.lang.String r2 = "Failed to parse config URL. Not fetching. appId"
            r1.c(r2, r13, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.w8.h(com.google.android.gms.measurement.internal.u4):void");
    }

    /* access modifiers changed from: package-private */
    public final String h0(a aVar) {
        if (!aVar.k()) {
            return null;
        }
        byte[] bArr = new byte[16];
        g0().t().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new Object[]{new BigInteger(1, bArr)});
    }

    /* access modifiers changed from: package-private */
    public final void i(t tVar, i9 i9Var) {
        t tVar2;
        List<c> list;
        List<c> list2;
        List<c> list3;
        h3 r10;
        String str;
        Object z10;
        String s10;
        Object obj;
        i9 i9Var2 = i9Var;
        s.k(i9Var);
        s.g(i9Var2.f6059e);
        b().h();
        g();
        String str2 = i9Var2.f6059e;
        t tVar3 = tVar;
        long j10 = tVar3.f6411h;
        zzpx.zzc();
        if (T().B((String) null, y2.C0)) {
            k3 b10 = k3.b(tVar);
            b().h();
            d9.x((o6) null, b10.f6138d, false);
            tVar3 = b10.a();
        }
        Q(this.f6565g);
        if (y8.n(tVar3, i9Var2)) {
            if (!i9Var2.f6066l) {
                R(i9Var2);
                return;
            }
            List list4 = i9Var2.f6078x;
            if (list4 == null) {
                tVar2 = tVar3;
            } else if (list4.contains(tVar3.f6408e)) {
                Bundle V = tVar3.f6409f.V();
                V.putLong("ga_safelisted", 1);
                tVar2 = new t(tVar3.f6408e, new r(V), tVar3.f6410g, tVar3.f6411h);
            } else {
                d().q().d("Dropping non-safelisted event. appId, event name, origin", str2, tVar3.f6408e, tVar3.f6410g);
                return;
            }
            j jVar = this.f6561c;
            Q(jVar);
            jVar.g0();
            try {
                j jVar2 = this.f6561c;
                Q(jVar2);
                s.g(str2);
                jVar2.h();
                jVar2.i();
                int i10 = (j10 > 0 ? 1 : (j10 == 0 ? 0 : -1));
                if (i10 < 0) {
                    jVar2.f5994a.d().w().c("Invalid time querying timed out conditional properties", j3.z(str2), Long.valueOf(j10));
                    list = Collections.emptyList();
                } else {
                    list = jVar2.d0("active=0 and app_id=? and abs(? - creation_timestamp) > trigger_timeout", new String[]{str2, String.valueOf(j10)});
                }
                for (c cVar : list) {
                    if (cVar != null) {
                        d().v().d("User property timed out", cVar.f5873e, this.f6570l.D().s(cVar.f5875g.f6689f), cVar.f5875g.U());
                        t tVar4 = cVar.f5879k;
                        if (tVar4 != null) {
                            B(new t(tVar4, j10), i9Var2);
                        }
                        j jVar3 = this.f6561c;
                        Q(jVar3);
                        jVar3.K(str2, cVar.f5875g.f6689f);
                    }
                }
                j jVar4 = this.f6561c;
                Q(jVar4);
                s.g(str2);
                jVar4.h();
                jVar4.i();
                if (i10 < 0) {
                    jVar4.f5994a.d().w().c("Invalid time querying expired conditional properties", j3.z(str2), Long.valueOf(j10));
                    list2 = Collections.emptyList();
                } else {
                    list2 = jVar4.d0("active<>0 and app_id=? and abs(? - triggered_timestamp) > time_to_live", new String[]{str2, String.valueOf(j10)});
                }
                ArrayList<t> arrayList = new ArrayList<>(list2.size());
                for (c cVar2 : list2) {
                    if (cVar2 != null) {
                        d().v().d("User property expired", cVar2.f5873e, this.f6570l.D().s(cVar2.f5875g.f6689f), cVar2.f5875g.U());
                        j jVar5 = this.f6561c;
                        Q(jVar5);
                        jVar5.m(str2, cVar2.f5875g.f6689f);
                        t tVar5 = cVar2.f5883o;
                        if (tVar5 != null) {
                            arrayList.add(tVar5);
                        }
                        j jVar6 = this.f6561c;
                        Q(jVar6);
                        jVar6.K(str2, cVar2.f5875g.f6689f);
                    }
                }
                for (t tVar6 : arrayList) {
                    B(new t(tVar6, j10), i9Var2);
                }
                j jVar7 = this.f6561c;
                Q(jVar7);
                String str3 = tVar2.f6408e;
                s.g(str2);
                s.g(str3);
                jVar7.h();
                jVar7.i();
                if (i10 < 0) {
                    jVar7.f5994a.d().w().d("Invalid time querying triggered conditional properties", j3.z(str2), jVar7.f5994a.D().q(str3), Long.valueOf(j10));
                    list3 = Collections.emptyList();
                } else {
                    list3 = jVar7.d0("active=0 and app_id=? and trigger_event_name=? and abs(? - creation_timestamp) <= trigger_timeout", new String[]{str2, str3, String.valueOf(j10)});
                }
                ArrayList<t> arrayList2 = new ArrayList<>(list3.size());
                for (c cVar3 : list3) {
                    if (cVar3 != null) {
                        z8 z8Var = cVar3.f5875g;
                        b9 b9Var = new b9((String) s.k(cVar3.f5873e), cVar3.f5874f, z8Var.f6689f, j10, s.k(z8Var.U()));
                        j jVar8 = this.f6561c;
                        Q(jVar8);
                        if (jVar8.z(b9Var)) {
                            r10 = d().v();
                            str = "User property triggered";
                            z10 = cVar3.f5873e;
                            s10 = this.f6570l.D().s(b9Var.f5870c);
                            obj = b9Var.f5872e;
                        } else {
                            r10 = d().r();
                            str = "Too many active user properties, ignoring";
                            z10 = j3.z(cVar3.f5873e);
                            s10 = this.f6570l.D().s(b9Var.f5870c);
                            obj = b9Var.f5872e;
                        }
                        r10.d(str, z10, s10, obj);
                        t tVar7 = cVar3.f5881m;
                        if (tVar7 != null) {
                            arrayList2.add(tVar7);
                        }
                        cVar3.f5875g = new z8(b9Var);
                        cVar3.f5877i = true;
                        j jVar9 = this.f6561c;
                        Q(jVar9);
                        jVar9.y(cVar3);
                    }
                }
                B(tVar2, i9Var2);
                for (t tVar8 : arrayList2) {
                    B(new t(tVar8, j10), i9Var2);
                }
                j jVar10 = this.f6561c;
                Q(jVar10);
                jVar10.o();
            } finally {
                j jVar11 = this.f6561c;
                Q(jVar11);
                jVar11.h0();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final String i0(i9 i9Var) {
        try {
            return (String) b().s(new s8(this, i9Var)).get(30000, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e10) {
            d().r().c("Failed to get app instance id. appId", j3.z(i9Var.f6059e), e10);
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public final void j(t tVar, String str) {
        t tVar2 = tVar;
        String str2 = str;
        j jVar = this.f6561c;
        Q(jVar);
        u4 T = jVar.T(str2);
        if (T == null || TextUtils.isEmpty(T.h0())) {
            d().q().b("No app data available; dropping event", str2);
            return;
        }
        Boolean H = H(T);
        if (H == null) {
            if (!"_ui".equals(tVar2.f6408e)) {
                d().w().b("Could not find package. appId", j3.z(str));
            }
        } else if (!H.booleanValue()) {
            d().r().b("App version does not match; dropping event. appId", j3.z(str));
            return;
        }
        String k02 = T.k0();
        String h02 = T.h0();
        long M = T.M();
        String g02 = T.g0();
        long X = T.X();
        long U = T.U();
        boolean K = T.K();
        String i02 = T.i0();
        long A2 = T.A();
        boolean J = T.J();
        String c02 = T.c0();
        Boolean b02 = T.b0();
        long V = T.V();
        List c10 = T.c();
        zzoq.zzc();
        i9 i9Var = r2;
        i9 i9Var2 = new i9(str, k02, h02, M, g02, X, U, (String) null, K, false, i02, A2, 0, 0, J, false, c02, b02, V, c10, T().B(T.e0(), y2.f6623f0) ? T.j0() : null, U(str2).i());
        k(tVar, i9Var);
    }

    /* access modifiers changed from: package-private */
    public final void k(t tVar, i9 i9Var) {
        s.g(i9Var.f6059e);
        k3 b10 = k3.b(tVar);
        d9 g02 = g0();
        Bundle bundle = b10.f6138d;
        j jVar = this.f6561c;
        Q(jVar);
        g02.y(bundle, jVar.S(i9Var.f6059e));
        g0().z(b10, T().n(i9Var.f6059e));
        t a10 = b10.a();
        if ("_cmp".equals(a10.f6408e) && "referrer API v2".equals(a10.f6409f.l0("_cis"))) {
            String l02 = a10.f6409f.l0("gclid");
            if (!TextUtils.isEmpty(l02)) {
                z(new z8("_lgclid", a10.f6411h, l02, "auto"), i9Var);
            }
        }
        i(a10, i9Var);
    }

    /* access modifiers changed from: package-private */
    public final void k0(Runnable runnable) {
        b().h();
        if (this.f6574p == null) {
            this.f6574p = new ArrayList();
        }
        this.f6574p.add(runnable);
    }

    /* access modifiers changed from: package-private */
    public final void l() {
        this.f6576r++;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x004a A[Catch:{ all -> 0x0168, all -> 0x0172 }] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x005d A[Catch:{ all -> 0x0168, all -> 0x0172 }] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0127 A[Catch:{ all -> 0x0168, all -> 0x0172 }] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0135 A[Catch:{ all -> 0x0168, all -> 0x0172 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m(java.lang.String r7, int r8, java.lang.Throwable r9, byte[] r10, java.util.Map r11) {
        /*
            r6 = this;
            com.google.android.gms.measurement.internal.l4 r0 = r6.b()
            r0.h()
            r6.g()
            com.google.android.gms.common.internal.s.g(r7)
            r0 = 0
            if (r10 != 0) goto L_0x0012
            byte[] r10 = new byte[r0]     // Catch:{ all -> 0x0172 }
        L_0x0012:
            com.google.android.gms.measurement.internal.j3 r1 = r6.d()     // Catch:{ all -> 0x0172 }
            com.google.android.gms.measurement.internal.h3 r1 = r1.v()     // Catch:{ all -> 0x0172 }
            int r2 = r10.length     // Catch:{ all -> 0x0172 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0172 }
            java.lang.String r3 = "onConfigFetched. Response size"
            r1.b(r3, r2)     // Catch:{ all -> 0x0172 }
            com.google.android.gms.measurement.internal.j r1 = r6.f6561c     // Catch:{ all -> 0x0172 }
            Q(r1)     // Catch:{ all -> 0x0172 }
            r1.g0()     // Catch:{ all -> 0x0172 }
            com.google.android.gms.measurement.internal.j r1 = r6.f6561c     // Catch:{ all -> 0x0168 }
            Q(r1)     // Catch:{ all -> 0x0168 }
            com.google.android.gms.measurement.internal.u4 r1 = r1.T(r7)     // Catch:{ all -> 0x0168 }
            r3 = 200(0xc8, float:2.8E-43)
            r4 = 304(0x130, float:4.26E-43)
            if (r8 == r3) goto L_0x0043
            r3 = 204(0xcc, float:2.86E-43)
            if (r8 == r3) goto L_0x0043
            if (r8 != r4) goto L_0x0047
            r8 = 304(0x130, float:4.26E-43)
        L_0x0043:
            if (r9 != 0) goto L_0x0047
            r3 = 1
            goto L_0x0048
        L_0x0047:
            r3 = 0
        L_0x0048:
            if (r1 != 0) goto L_0x005d
            com.google.android.gms.measurement.internal.j3 r8 = r6.d()     // Catch:{ all -> 0x0168 }
            com.google.android.gms.measurement.internal.h3 r8 = r8.w()     // Catch:{ all -> 0x0168 }
            java.lang.String r9 = "App does not exist in onConfigFetched. appId"
            java.lang.Object r7 = com.google.android.gms.measurement.internal.j3.z(r7)     // Catch:{ all -> 0x0168 }
            r8.b(r9, r7)     // Catch:{ all -> 0x0168 }
            goto L_0x015a
        L_0x005d:
            r5 = 404(0x194, float:5.66E-43)
            if (r3 != 0) goto L_0x00bb
            if (r8 != r5) goto L_0x0064
            goto L_0x00bb
        L_0x0064:
            y3.e r10 = r6.e()     // Catch:{ all -> 0x0168 }
            long r10 = r10.currentTimeMillis()     // Catch:{ all -> 0x0168 }
            r1.v(r10)     // Catch:{ all -> 0x0168 }
            com.google.android.gms.measurement.internal.j r10 = r6.f6561c     // Catch:{ all -> 0x0168 }
            Q(r10)     // Catch:{ all -> 0x0168 }
            r10.p(r1)     // Catch:{ all -> 0x0168 }
            com.google.android.gms.measurement.internal.j3 r10 = r6.d()     // Catch:{ all -> 0x0168 }
            com.google.android.gms.measurement.internal.h3 r10 = r10.v()     // Catch:{ all -> 0x0168 }
            java.lang.String r11 = "Fetching config failed. code, error"
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x0168 }
            r10.c(r11, r1, r9)     // Catch:{ all -> 0x0168 }
            com.google.android.gms.measurement.internal.h4 r9 = r6.f6559a     // Catch:{ all -> 0x0168 }
            Q(r9)     // Catch:{ all -> 0x0168 }
            r9.r(r7)     // Catch:{ all -> 0x0168 }
            com.google.android.gms.measurement.internal.w7 r7 = r6.f6567i     // Catch:{ all -> 0x0168 }
            com.google.android.gms.measurement.internal.t3 r7 = r7.f6557j     // Catch:{ all -> 0x0168 }
            y3.e r9 = r6.e()     // Catch:{ all -> 0x0168 }
            long r9 = r9.currentTimeMillis()     // Catch:{ all -> 0x0168 }
            r7.b(r9)     // Catch:{ all -> 0x0168 }
            r7 = 503(0x1f7, float:7.05E-43)
            if (r8 == r7) goto L_0x00a7
            r7 = 429(0x1ad, float:6.01E-43)
            if (r8 != r7) goto L_0x00b6
        L_0x00a7:
            com.google.android.gms.measurement.internal.w7 r7 = r6.f6567i     // Catch:{ all -> 0x0168 }
            com.google.android.gms.measurement.internal.t3 r7 = r7.f6555h     // Catch:{ all -> 0x0168 }
            y3.e r8 = r6.e()     // Catch:{ all -> 0x0168 }
            long r8 = r8.currentTimeMillis()     // Catch:{ all -> 0x0168 }
            r7.b(r8)     // Catch:{ all -> 0x0168 }
        L_0x00b6:
            r6.L()     // Catch:{ all -> 0x0168 }
            goto L_0x015a
        L_0x00bb:
            r9 = 0
            if (r11 == 0) goto L_0x00c7
            java.lang.String r3 = "Last-Modified"
            java.lang.Object r11 = r11.get(r3)     // Catch:{ all -> 0x0168 }
            java.util.List r11 = (java.util.List) r11     // Catch:{ all -> 0x0168 }
            goto L_0x00c8
        L_0x00c7:
            r11 = r9
        L_0x00c8:
            if (r11 == 0) goto L_0x00d7
            int r3 = r11.size()     // Catch:{ all -> 0x0168 }
            if (r3 <= 0) goto L_0x00d7
            java.lang.Object r11 = r11.get(r0)     // Catch:{ all -> 0x0168 }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ all -> 0x0168 }
            goto L_0x00d8
        L_0x00d7:
            r11 = r9
        L_0x00d8:
            if (r8 == r5) goto L_0x00f6
            if (r8 != r4) goto L_0x00dd
            goto L_0x00f6
        L_0x00dd:
            com.google.android.gms.measurement.internal.h4 r9 = r6.f6559a     // Catch:{ all -> 0x0168 }
            Q(r9)     // Catch:{ all -> 0x0168 }
            boolean r9 = r9.z(r7, r10, r11)     // Catch:{ all -> 0x0168 }
            if (r9 != 0) goto L_0x0112
            com.google.android.gms.measurement.internal.j r7 = r6.f6561c     // Catch:{ all -> 0x0172 }
            Q(r7)     // Catch:{ all -> 0x0172 }
        L_0x00ed:
            r7.h0()     // Catch:{ all -> 0x0172 }
            r6.f6577s = r0
            r6.I()
            return
        L_0x00f6:
            com.google.android.gms.measurement.internal.h4 r10 = r6.f6559a     // Catch:{ all -> 0x0168 }
            Q(r10)     // Catch:{ all -> 0x0168 }
            com.google.android.gms.internal.measurement.zzfc r10 = r10.o(r7)     // Catch:{ all -> 0x0168 }
            if (r10 != 0) goto L_0x0112
            com.google.android.gms.measurement.internal.h4 r10 = r6.f6559a     // Catch:{ all -> 0x0168 }
            Q(r10)     // Catch:{ all -> 0x0168 }
            boolean r9 = r10.z(r7, r9, r9)     // Catch:{ all -> 0x0168 }
            if (r9 != 0) goto L_0x0112
            com.google.android.gms.measurement.internal.j r7 = r6.f6561c     // Catch:{ all -> 0x0172 }
            Q(r7)     // Catch:{ all -> 0x0172 }
            goto L_0x00ed
        L_0x0112:
            y3.e r9 = r6.e()     // Catch:{ all -> 0x0168 }
            long r9 = r9.currentTimeMillis()     // Catch:{ all -> 0x0168 }
            r1.m(r9)     // Catch:{ all -> 0x0168 }
            com.google.android.gms.measurement.internal.j r9 = r6.f6561c     // Catch:{ all -> 0x0168 }
            Q(r9)     // Catch:{ all -> 0x0168 }
            r9.p(r1)     // Catch:{ all -> 0x0168 }
            if (r8 != r5) goto L_0x0135
            com.google.android.gms.measurement.internal.j3 r8 = r6.d()     // Catch:{ all -> 0x0168 }
            com.google.android.gms.measurement.internal.h3 r8 = r8.x()     // Catch:{ all -> 0x0168 }
            java.lang.String r9 = "Config not found. Using empty config. appId"
            r8.b(r9, r7)     // Catch:{ all -> 0x0168 }
            goto L_0x0146
        L_0x0135:
            com.google.android.gms.measurement.internal.j3 r7 = r6.d()     // Catch:{ all -> 0x0168 }
            com.google.android.gms.measurement.internal.h3 r7 = r7.v()     // Catch:{ all -> 0x0168 }
            java.lang.String r9 = "Successfully fetched config. Got network response. code, size"
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x0168 }
            r7.c(r9, r8, r2)     // Catch:{ all -> 0x0168 }
        L_0x0146:
            com.google.android.gms.measurement.internal.o3 r7 = r6.f6560b     // Catch:{ all -> 0x0168 }
            Q(r7)     // Catch:{ all -> 0x0168 }
            boolean r7 = r7.n()     // Catch:{ all -> 0x0168 }
            if (r7 == 0) goto L_0x00b6
            boolean r7 = r6.O()     // Catch:{ all -> 0x0168 }
            if (r7 == 0) goto L_0x00b6
            r6.A()     // Catch:{ all -> 0x0168 }
        L_0x015a:
            com.google.android.gms.measurement.internal.j r7 = r6.f6561c     // Catch:{ all -> 0x0168 }
            Q(r7)     // Catch:{ all -> 0x0168 }
            r7.o()     // Catch:{ all -> 0x0168 }
            com.google.android.gms.measurement.internal.j r7 = r6.f6561c     // Catch:{ all -> 0x0172 }
            Q(r7)     // Catch:{ all -> 0x0172 }
            goto L_0x00ed
        L_0x0168:
            r7 = move-exception
            com.google.android.gms.measurement.internal.j r8 = r6.f6561c     // Catch:{ all -> 0x0172 }
            Q(r8)     // Catch:{ all -> 0x0172 }
            r8.h0()     // Catch:{ all -> 0x0172 }
            throw r7     // Catch:{ all -> 0x0172 }
        L_0x0172:
            r7 = move-exception
            r6.f6577s = r0
            r6.I()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.w8.m(java.lang.String, int, java.lang.Throwable, byte[], java.util.Map):void");
    }

    /* access modifiers changed from: package-private */
    public final void n(boolean z10) {
        L();
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: package-private */
    public final void o(int i10, Throwable th, byte[] bArr, String str) {
        j jVar;
        b().h();
        g();
        if (bArr == null) {
            try {
                bArr = new byte[0];
            } catch (Throwable th2) {
                this.f6578t = false;
                I();
                throw th2;
            }
        }
        List<Long> list = (List) s.k(this.f6582x);
        this.f6582x = null;
        if (i10 != 200) {
            if (i10 == 204) {
                i10 = 204;
            }
            d().v().c("Network upload failed. Will retry later. code, error", Integer.valueOf(i10), th);
            this.f6567i.f6557j.b(e().currentTimeMillis());
            if (i10 == 503 || i10 == 429) {
                this.f6567i.f6555h.b(e().currentTimeMillis());
            }
            j jVar2 = this.f6561c;
            Q(jVar2);
            jVar2.i0(list);
            L();
            this.f6578t = false;
            I();
        }
        if (th == null) {
            try {
                this.f6567i.f6556i.b(e().currentTimeMillis());
                this.f6567i.f6557j.b(0);
                L();
                d().v().c("Successful upload. Got network response. code, size", Integer.valueOf(i10), Integer.valueOf(bArr.length));
                j jVar3 = this.f6561c;
                Q(jVar3);
                jVar3.g0();
                try {
                    for (Long l10 : list) {
                        try {
                            jVar = this.f6561c;
                            Q(jVar);
                            long longValue = l10.longValue();
                            jVar.h();
                            jVar.i();
                            if (jVar.R().delete("queue", "rowid=?", new String[]{String.valueOf(longValue)}) != 1) {
                                throw new SQLiteException("Deleted fewer rows from queue than expected");
                            }
                        } catch (SQLiteException e10) {
                            jVar.f5994a.d().r().b("Failed to delete a bundle in a queue table", e10);
                            throw e10;
                        } catch (SQLiteException e11) {
                            List list2 = this.f6583y;
                            if (list2 == null || !list2.contains(l10)) {
                                throw e11;
                            }
                        }
                    }
                    j jVar4 = this.f6561c;
                    Q(jVar4);
                    jVar4.o();
                    j jVar5 = this.f6561c;
                    Q(jVar5);
                    jVar5.h0();
                    this.f6583y = null;
                    o3 o3Var = this.f6560b;
                    Q(o3Var);
                    if (!o3Var.n() || !O()) {
                        this.f6584z = -1;
                        L();
                    } else {
                        A();
                    }
                    this.f6573o = 0;
                } catch (Throwable th3) {
                    j jVar6 = this.f6561c;
                    Q(jVar6);
                    jVar6.h0();
                    throw th3;
                }
            } catch (SQLiteException e12) {
                d().r().b("Database error while trying to delete uploaded bundles", e12);
                this.f6573o = e().a();
                d().v().b("Disable upload, time", Long.valueOf(this.f6573o));
            }
            this.f6578t = false;
            I();
        }
        d().v().c("Network upload failed. Will retry later. code, error", Integer.valueOf(i10), th);
        this.f6567i.f6557j.b(e().currentTimeMillis());
        this.f6567i.f6555h.b(e().currentTimeMillis());
        j jVar22 = this.f6561c;
        Q(jVar22);
        jVar22.i0(list);
        L();
        this.f6578t = false;
        I();
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x03c7 A[Catch:{ SQLiteException -> 0x01ca, all -> 0x058e }] */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x03f3 A[Catch:{ SQLiteException -> 0x01ca, all -> 0x058e }] */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x040a A[SYNTHETIC, Splitter:B:136:0x040a] */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x04ae A[Catch:{ SQLiteException -> 0x01ca, all -> 0x058e }] */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x04cb A[Catch:{ SQLiteException -> 0x01ca, all -> 0x058e }] */
    /* JADX WARNING: Removed duplicated region for block: B:184:0x053e A[Catch:{ SQLiteException -> 0x01ca, all -> 0x058e }] */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x0562 A[Catch:{ SQLiteException -> 0x01ca, all -> 0x058e }] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x01b6 A[Catch:{ SQLiteException -> 0x01ca, all -> 0x058e }] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x01e1 A[Catch:{ SQLiteException -> 0x01ca, all -> 0x058e }] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0219 A[Catch:{ SQLiteException -> 0x01ca, all -> 0x058e }] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0238 A[Catch:{ SQLiteException -> 0x01ca, all -> 0x058e }] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x023f A[Catch:{ SQLiteException -> 0x01ca, all -> 0x058e }] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x024e A[Catch:{ SQLiteException -> 0x01ca, all -> 0x058e }] */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x025e A[Catch:{ SQLiteException -> 0x01ca, all -> 0x058e }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void p(com.google.android.gms.measurement.internal.i9 r24) {
        /*
            r23 = this;
            r1 = r23
            r2 = r24
            java.lang.String r3 = "_sysu"
            java.lang.String r4 = "_sys"
            java.lang.String r5 = "com.android.vending"
            java.lang.String r6 = "_pfo"
            java.lang.String r7 = "_uwa"
            java.lang.String r0 = "app_id=?"
            com.google.android.gms.measurement.internal.l4 r8 = r23.b()
            r8.h()
            r23.g()
            com.google.android.gms.common.internal.s.k(r24)
            java.lang.String r8 = r2.f6059e
            com.google.android.gms.common.internal.s.g(r8)
            boolean r8 = r23.M(r24)
            if (r8 == 0) goto L_0x0598
            com.google.android.gms.measurement.internal.j r8 = r1.f6561c
            Q(r8)
            java.lang.String r9 = r2.f6059e
            com.google.android.gms.measurement.internal.u4 r8 = r8.T(r9)
            r9 = 0
            if (r8 == 0) goto L_0x005e
            java.lang.String r11 = r8.k0()
            boolean r11 = android.text.TextUtils.isEmpty(r11)
            if (r11 == 0) goto L_0x005e
            java.lang.String r11 = r2.f6060f
            boolean r11 = android.text.TextUtils.isEmpty(r11)
            if (r11 != 0) goto L_0x005e
            r8.m(r9)
            com.google.android.gms.measurement.internal.j r11 = r1.f6561c
            Q(r11)
            r11.p(r8)
            com.google.android.gms.measurement.internal.h4 r8 = r1.f6559a
            Q(r8)
            java.lang.String r11 = r2.f6059e
            r8.s(r11)
        L_0x005e:
            boolean r8 = r2.f6066l
            if (r8 != 0) goto L_0x0066
            r23.R(r24)
            return
        L_0x0066:
            long r11 = r2.f6071q
            int r8 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r8 != 0) goto L_0x0074
            y3.e r8 = r23.e()
            long r11 = r8.currentTimeMillis()
        L_0x0074:
            com.google.android.gms.measurement.internal.n4 r8 = r1.f6570l
            com.google.android.gms.measurement.internal.n r8 = r8.A()
            r8.r()
            int r8 = r2.f6072r
            r15 = 1
            if (r8 == 0) goto L_0x009c
            if (r8 == r15) goto L_0x009c
            com.google.android.gms.measurement.internal.j3 r13 = r23.d()
            com.google.android.gms.measurement.internal.h3 r13 = r13.w()
            java.lang.String r14 = r2.f6059e
            java.lang.Object r14 = com.google.android.gms.measurement.internal.j3.z(r14)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            java.lang.String r9 = "Incorrect app type, assuming installed app. appId, appType"
            r13.c(r9, r14, r8)
            r8 = 0
        L_0x009c:
            com.google.android.gms.measurement.internal.j r9 = r1.f6561c
            Q(r9)
            r9.g0()
            com.google.android.gms.measurement.internal.j r9 = r1.f6561c     // Catch:{ all -> 0x058e }
            Q(r9)     // Catch:{ all -> 0x058e }
            java.lang.String r10 = r2.f6059e     // Catch:{ all -> 0x058e }
            java.lang.String r13 = "_npa"
            com.google.android.gms.measurement.internal.b9 r9 = r9.Z(r10, r13)     // Catch:{ all -> 0x058e }
            if (r9 == 0) goto L_0x00c4
            java.lang.String r10 = "auto"
            java.lang.String r13 = r9.f5869b     // Catch:{ all -> 0x058e }
            boolean r10 = r10.equals(r13)     // Catch:{ all -> 0x058e }
            if (r10 == 0) goto L_0x00be
            goto L_0x00c4
        L_0x00be:
            r21 = r3
            r22 = r4
            r4 = 0
            goto L_0x0117
        L_0x00c4:
            java.lang.Boolean r10 = r2.f6076v     // Catch:{ all -> 0x058e }
            if (r10 == 0) goto L_0x0100
            com.google.android.gms.measurement.internal.z8 r14 = new com.google.android.gms.measurement.internal.z8     // Catch:{ all -> 0x058e }
            java.lang.String r19 = "_npa"
            boolean r10 = r10.booleanValue()     // Catch:{ all -> 0x058e }
            if (r15 == r10) goto L_0x00d5
            r20 = 0
            goto L_0x00d7
        L_0x00d5:
            r20 = 1
        L_0x00d7:
            java.lang.Long r10 = java.lang.Long.valueOf(r20)     // Catch:{ all -> 0x058e }
            java.lang.String r20 = "auto"
            r21 = r3
            r22 = r4
            r3 = 1
            r13 = r14
            r3 = r14
            r4 = 0
            r14 = r19
            r15 = r11
            r17 = r10
            r18 = r20
            r13.<init>(r14, r15, r17, r18)     // Catch:{ all -> 0x058e }
            if (r9 == 0) goto L_0x00fc
            java.lang.Object r9 = r9.f5872e     // Catch:{ all -> 0x058e }
            java.lang.Long r10 = r3.f6691h     // Catch:{ all -> 0x058e }
            boolean r9 = r9.equals(r10)     // Catch:{ all -> 0x058e }
            if (r9 != 0) goto L_0x0117
        L_0x00fc:
            r1.z(r3, r2)     // Catch:{ all -> 0x058e }
            goto L_0x0117
        L_0x0100:
            r21 = r3
            r22 = r4
            r4 = 0
            if (r9 == 0) goto L_0x0117
            com.google.android.gms.measurement.internal.z8 r3 = new com.google.android.gms.measurement.internal.z8     // Catch:{ all -> 0x058e }
            java.lang.String r14 = "_npa"
            r17 = 0
            java.lang.String r18 = "auto"
            r13 = r3
            r15 = r11
            r13.<init>(r14, r15, r17, r18)     // Catch:{ all -> 0x058e }
            r1.t(r3, r2)     // Catch:{ all -> 0x058e }
        L_0x0117:
            com.google.android.gms.measurement.internal.j r3 = r1.f6561c     // Catch:{ all -> 0x058e }
            Q(r3)     // Catch:{ all -> 0x058e }
            java.lang.String r9 = r2.f6059e     // Catch:{ all -> 0x058e }
            java.lang.Object r9 = com.google.android.gms.common.internal.s.k(r9)     // Catch:{ all -> 0x058e }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ all -> 0x058e }
            com.google.android.gms.measurement.internal.u4 r3 = r3.T(r9)     // Catch:{ all -> 0x058e }
            if (r3 == 0) goto L_0x01df
            com.google.android.gms.measurement.internal.d9 r10 = r23.g0()     // Catch:{ all -> 0x058e }
            java.lang.String r13 = r2.f6060f     // Catch:{ all -> 0x058e }
            java.lang.String r14 = r3.k0()     // Catch:{ all -> 0x058e }
            java.lang.String r15 = r2.f6075u     // Catch:{ all -> 0x058e }
            java.lang.String r9 = r3.c0()     // Catch:{ all -> 0x058e }
            boolean r9 = r10.b0(r13, r14, r15, r9)     // Catch:{ all -> 0x058e }
            if (r9 == 0) goto L_0x01df
            com.google.android.gms.measurement.internal.j3 r9 = r23.d()     // Catch:{ all -> 0x058e }
            com.google.android.gms.measurement.internal.h3 r9 = r9.w()     // Catch:{ all -> 0x058e }
            java.lang.String r10 = "New GMP App Id passed in. Removing cached database data. appId"
            java.lang.String r13 = r3.e0()     // Catch:{ all -> 0x058e }
            java.lang.Object r13 = com.google.android.gms.measurement.internal.j3.z(r13)     // Catch:{ all -> 0x058e }
            r9.b(r10, r13)     // Catch:{ all -> 0x058e }
            com.google.android.gms.measurement.internal.j r9 = r1.f6561c     // Catch:{ all -> 0x058e }
            Q(r9)     // Catch:{ all -> 0x058e }
            java.lang.String r3 = r3.e0()     // Catch:{ all -> 0x058e }
            r9.i()     // Catch:{ all -> 0x058e }
            r9.h()     // Catch:{ all -> 0x058e }
            com.google.android.gms.common.internal.s.g(r3)     // Catch:{ all -> 0x058e }
            android.database.sqlite.SQLiteDatabase r10 = r9.R()     // Catch:{ SQLiteException -> 0x01ca }
            java.lang.String[] r13 = new java.lang.String[]{r3}     // Catch:{ SQLiteException -> 0x01ca }
            java.lang.String r14 = "events"
            int r14 = r10.delete(r14, r0, r13)     // Catch:{ SQLiteException -> 0x01ca }
            java.lang.String r15 = "user_attributes"
            int r15 = r10.delete(r15, r0, r13)     // Catch:{ SQLiteException -> 0x01ca }
            int r14 = r14 + r15
            java.lang.String r15 = "conditional_properties"
            int r15 = r10.delete(r15, r0, r13)     // Catch:{ SQLiteException -> 0x01ca }
            int r14 = r14 + r15
            java.lang.String r15 = "apps"
            int r15 = r10.delete(r15, r0, r13)     // Catch:{ SQLiteException -> 0x01ca }
            int r14 = r14 + r15
            java.lang.String r15 = "raw_events"
            int r15 = r10.delete(r15, r0, r13)     // Catch:{ SQLiteException -> 0x01ca }
            int r14 = r14 + r15
            java.lang.String r15 = "raw_events_metadata"
            int r15 = r10.delete(r15, r0, r13)     // Catch:{ SQLiteException -> 0x01ca }
            int r14 = r14 + r15
            java.lang.String r15 = "event_filters"
            int r15 = r10.delete(r15, r0, r13)     // Catch:{ SQLiteException -> 0x01ca }
            int r14 = r14 + r15
            java.lang.String r15 = "property_filters"
            int r15 = r10.delete(r15, r0, r13)     // Catch:{ SQLiteException -> 0x01ca }
            int r14 = r14 + r15
            java.lang.String r15 = "audience_filter_values"
            int r15 = r10.delete(r15, r0, r13)     // Catch:{ SQLiteException -> 0x01ca }
            int r14 = r14 + r15
            java.lang.String r15 = "consent_settings"
            int r0 = r10.delete(r15, r0, r13)     // Catch:{ SQLiteException -> 0x01ca }
            int r14 = r14 + r0
            if (r14 <= 0) goto L_0x01de
            com.google.android.gms.measurement.internal.n4 r0 = r9.f5994a     // Catch:{ SQLiteException -> 0x01ca }
            com.google.android.gms.measurement.internal.j3 r0 = r0.d()     // Catch:{ SQLiteException -> 0x01ca }
            com.google.android.gms.measurement.internal.h3 r0 = r0.v()     // Catch:{ SQLiteException -> 0x01ca }
            java.lang.String r10 = "Deleted application data. app, records"
            java.lang.Integer r13 = java.lang.Integer.valueOf(r14)     // Catch:{ SQLiteException -> 0x01ca }
            r0.c(r10, r3, r13)     // Catch:{ SQLiteException -> 0x01ca }
            goto L_0x01de
        L_0x01ca:
            r0 = move-exception
            com.google.android.gms.measurement.internal.n4 r9 = r9.f5994a     // Catch:{ all -> 0x058e }
            com.google.android.gms.measurement.internal.j3 r9 = r9.d()     // Catch:{ all -> 0x058e }
            com.google.android.gms.measurement.internal.h3 r9 = r9.r()     // Catch:{ all -> 0x058e }
            java.lang.String r10 = "Error deleting application data. appId, error"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.j3.z(r3)     // Catch:{ all -> 0x058e }
            r9.c(r10, r3, r0)     // Catch:{ all -> 0x058e }
        L_0x01de:
            r3 = 0
        L_0x01df:
            if (r3 == 0) goto L_0x0238
            long r9 = r3.M()     // Catch:{ all -> 0x058e }
            r13 = -2147483648(0xffffffff80000000, double:NaN)
            int r0 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r0 == 0) goto L_0x01fa
            long r9 = r3.M()     // Catch:{ all -> 0x058e }
            r20 = r5
            long r4 = r2.f6068n     // Catch:{ all -> 0x058e }
            int r0 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x01fc
            r15 = 1
            goto L_0x01fd
        L_0x01fa:
            r20 = r5
        L_0x01fc:
            r15 = 0
        L_0x01fd:
            java.lang.String r0 = r3.h0()     // Catch:{ all -> 0x058e }
            long r3 = r3.M()     // Catch:{ all -> 0x058e }
            int r5 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r5 != 0) goto L_0x0215
            if (r0 == 0) goto L_0x0215
            java.lang.String r3 = r2.f6061g     // Catch:{ all -> 0x058e }
            boolean r3 = r0.equals(r3)     // Catch:{ all -> 0x058e }
            if (r3 != 0) goto L_0x0215
            r3 = 1
            goto L_0x0216
        L_0x0215:
            r3 = 0
        L_0x0216:
            r3 = r3 | r15
            if (r3 == 0) goto L_0x023a
            android.os.Bundle r3 = new android.os.Bundle     // Catch:{ all -> 0x058e }
            r3.<init>()     // Catch:{ all -> 0x058e }
            java.lang.String r4 = "_pv"
            r3.putString(r4, r0)     // Catch:{ all -> 0x058e }
            com.google.android.gms.measurement.internal.t r0 = new com.google.android.gms.measurement.internal.t     // Catch:{ all -> 0x058e }
            com.google.android.gms.measurement.internal.r r15 = new com.google.android.gms.measurement.internal.r     // Catch:{ all -> 0x058e }
            r15.<init>(r3)     // Catch:{ all -> 0x058e }
            java.lang.String r14 = "_au"
            java.lang.String r16 = "auto"
            r13 = r0
            r17 = r11
            r13.<init>(r14, r15, r16, r17)     // Catch:{ all -> 0x058e }
            r1.i(r0, r2)     // Catch:{ all -> 0x058e }
            goto L_0x023a
        L_0x0238:
            r20 = r5
        L_0x023a:
            r23.R(r24)     // Catch:{ all -> 0x058e }
            if (r8 != 0) goto L_0x024e
            com.google.android.gms.measurement.internal.j r0 = r1.f6561c     // Catch:{ all -> 0x058e }
            Q(r0)     // Catch:{ all -> 0x058e }
            java.lang.String r3 = r2.f6059e     // Catch:{ all -> 0x058e }
            java.lang.String r4 = "_f"
            com.google.android.gms.measurement.internal.p r0 = r0.X(r3, r4)     // Catch:{ all -> 0x058e }
            r15 = 0
            goto L_0x025c
        L_0x024e:
            com.google.android.gms.measurement.internal.j r0 = r1.f6561c     // Catch:{ all -> 0x058e }
            Q(r0)     // Catch:{ all -> 0x058e }
            java.lang.String r3 = r2.f6059e     // Catch:{ all -> 0x058e }
            java.lang.String r4 = "_v"
            com.google.android.gms.measurement.internal.p r0 = r0.X(r3, r4)     // Catch:{ all -> 0x058e }
            r15 = 1
        L_0x025c:
            if (r0 != 0) goto L_0x0562
            r3 = 3600000(0x36ee80, double:1.7786363E-317)
            long r8 = r11 / r3
            r13 = 1
            long r8 = r8 + r13
            long r8 = r8 * r3
            java.lang.String r3 = "_dac"
            java.lang.String r4 = "_r"
            java.lang.String r5 = "_c"
            java.lang.String r10 = "_et"
            if (r15 != 0) goto L_0x04e5
            com.google.android.gms.measurement.internal.z8 r0 = new com.google.android.gms.measurement.internal.z8     // Catch:{ all -> 0x058e }
            java.lang.String r14 = "_fot"
            java.lang.Long r17 = java.lang.Long.valueOf(r8)     // Catch:{ all -> 0x058e }
            java.lang.String r18 = "auto"
            r13 = r0
            r15 = r11
            r13.<init>(r14, r15, r17, r18)     // Catch:{ all -> 0x058e }
            r1.z(r0, r2)     // Catch:{ all -> 0x058e }
            com.google.android.gms.measurement.internal.l4 r0 = r23.b()     // Catch:{ all -> 0x058e }
            r0.h()     // Catch:{ all -> 0x058e }
            com.google.android.gms.measurement.internal.a4 r0 = r1.f6569k     // Catch:{ all -> 0x058e }
            java.lang.Object r0 = com.google.android.gms.common.internal.s.k(r0)     // Catch:{ all -> 0x058e }
            r8 = r0
            com.google.android.gms.measurement.internal.a4 r8 = (com.google.android.gms.measurement.internal.a4) r8     // Catch:{ all -> 0x058e }
            java.lang.String r0 = r2.f6059e     // Catch:{ all -> 0x058e }
            if (r0 == 0) goto L_0x0387
            boolean r9 = r0.isEmpty()     // Catch:{ all -> 0x058e }
            if (r9 == 0) goto L_0x02a0
            goto L_0x0387
        L_0x02a0:
            com.google.android.gms.measurement.internal.n4 r9 = r8.f5832a     // Catch:{ all -> 0x058e }
            com.google.android.gms.measurement.internal.l4 r9 = r9.b()     // Catch:{ all -> 0x058e }
            r9.h()     // Catch:{ all -> 0x058e }
            boolean r9 = r8.a()     // Catch:{ all -> 0x058e }
            if (r9 != 0) goto L_0x02c1
            com.google.android.gms.measurement.internal.n4 r0 = r8.f5832a     // Catch:{ all -> 0x058e }
            com.google.android.gms.measurement.internal.j3 r0 = r0.d()     // Catch:{ all -> 0x058e }
            com.google.android.gms.measurement.internal.h3 r0 = r0.u()     // Catch:{ all -> 0x058e }
            java.lang.String r8 = "Install Referrer Reporter is not available"
        L_0x02bb:
            r0.a(r8)     // Catch:{ all -> 0x058e }
        L_0x02be:
            r15 = 1
            goto L_0x0395
        L_0x02c1:
            com.google.android.gms.measurement.internal.y3 r9 = new com.google.android.gms.measurement.internal.y3     // Catch:{ all -> 0x058e }
            r9.<init>(r8, r0)     // Catch:{ all -> 0x058e }
            com.google.android.gms.measurement.internal.n4 r0 = r8.f5832a     // Catch:{ all -> 0x058e }
            com.google.android.gms.measurement.internal.l4 r0 = r0.b()     // Catch:{ all -> 0x058e }
            r0.h()     // Catch:{ all -> 0x058e }
            android.content.Intent r0 = new android.content.Intent     // Catch:{ all -> 0x058e }
            java.lang.String r13 = "com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE"
            r0.<init>(r13)     // Catch:{ all -> 0x058e }
            android.content.ComponentName r13 = new android.content.ComponentName     // Catch:{ all -> 0x058e }
            java.lang.String r14 = "com.google.android.finsky.externalreferrer.GetInstallReferrerService"
            r15 = r20
            r13.<init>(r15, r14)     // Catch:{ all -> 0x058e }
            r0.setComponent(r13)     // Catch:{ all -> 0x058e }
            com.google.android.gms.measurement.internal.n4 r13 = r8.f5832a     // Catch:{ all -> 0x058e }
            android.content.Context r13 = r13.c()     // Catch:{ all -> 0x058e }
            android.content.pm.PackageManager r13 = r13.getPackageManager()     // Catch:{ all -> 0x058e }
            if (r13 != 0) goto L_0x02fb
            com.google.android.gms.measurement.internal.n4 r0 = r8.f5832a     // Catch:{ all -> 0x058e }
            com.google.android.gms.measurement.internal.j3 r0 = r0.d()     // Catch:{ all -> 0x058e }
            com.google.android.gms.measurement.internal.h3 r0 = r0.y()     // Catch:{ all -> 0x058e }
            java.lang.String r8 = "Failed to obtain Package Manager to verify binding conditions for Install Referrer"
            goto L_0x02bb
        L_0x02fb:
            r14 = 0
            java.util.List r13 = r13.queryIntentServices(r0, r14)     // Catch:{ all -> 0x058e }
            if (r13 == 0) goto L_0x0379
            boolean r16 = r13.isEmpty()     // Catch:{ all -> 0x058e }
            if (r16 != 0) goto L_0x0379
            java.lang.Object r13 = r13.get(r14)     // Catch:{ all -> 0x058e }
            android.content.pm.ResolveInfo r13 = (android.content.pm.ResolveInfo) r13     // Catch:{ all -> 0x058e }
            android.content.pm.ServiceInfo r13 = r13.serviceInfo     // Catch:{ all -> 0x058e }
            if (r13 == 0) goto L_0x02be
            java.lang.String r14 = r13.packageName     // Catch:{ all -> 0x058e }
            java.lang.String r13 = r13.name     // Catch:{ all -> 0x058e }
            if (r13 == 0) goto L_0x0368
            boolean r13 = r15.equals(r14)     // Catch:{ all -> 0x058e }
            if (r13 == 0) goto L_0x0368
            boolean r13 = r8.a()     // Catch:{ all -> 0x058e }
            if (r13 == 0) goto L_0x0368
            android.content.Intent r13 = new android.content.Intent     // Catch:{ all -> 0x058e }
            r13.<init>(r0)     // Catch:{ all -> 0x058e }
            x3.b r0 = x3.b.b()     // Catch:{ RuntimeException -> 0x0352 }
            com.google.android.gms.measurement.internal.n4 r14 = r8.f5832a     // Catch:{ RuntimeException -> 0x0352 }
            android.content.Context r14 = r14.c()     // Catch:{ RuntimeException -> 0x0352 }
            r15 = 1
            boolean r0 = r0.a(r14, r13, r9, r15)     // Catch:{ RuntimeException -> 0x0350 }
            com.google.android.gms.measurement.internal.n4 r9 = r8.f5832a     // Catch:{ RuntimeException -> 0x0350 }
            com.google.android.gms.measurement.internal.j3 r9 = r9.d()     // Catch:{ RuntimeException -> 0x0350 }
            com.google.android.gms.measurement.internal.h3 r9 = r9.v()     // Catch:{ RuntimeException -> 0x0350 }
            java.lang.String r13 = "Install Referrer Service is"
            java.lang.String r14 = "available"
            java.lang.String r16 = "not available"
            if (r15 == r0) goto L_0x034c
            r14 = r16
        L_0x034c:
            r9.b(r13, r14)     // Catch:{ RuntimeException -> 0x0350 }
            goto L_0x0395
        L_0x0350:
            r0 = move-exception
            goto L_0x0354
        L_0x0352:
            r0 = move-exception
            r15 = 1
        L_0x0354:
            com.google.android.gms.measurement.internal.n4 r8 = r8.f5832a     // Catch:{ all -> 0x058e }
            com.google.android.gms.measurement.internal.j3 r8 = r8.d()     // Catch:{ all -> 0x058e }
            com.google.android.gms.measurement.internal.h3 r8 = r8.r()     // Catch:{ all -> 0x058e }
            java.lang.String r9 = "Exception occurred while binding to Install Referrer Service"
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x058e }
            r8.b(r9, r0)     // Catch:{ all -> 0x058e }
            goto L_0x0395
        L_0x0368:
            r15 = 1
            com.google.android.gms.measurement.internal.n4 r0 = r8.f5832a     // Catch:{ all -> 0x058e }
            com.google.android.gms.measurement.internal.j3 r0 = r0.d()     // Catch:{ all -> 0x058e }
            com.google.android.gms.measurement.internal.h3 r0 = r0.w()     // Catch:{ all -> 0x058e }
            java.lang.String r8 = "Play Store version 8.3.73 or higher required for Install Referrer"
        L_0x0375:
            r0.a(r8)     // Catch:{ all -> 0x058e }
            goto L_0x0395
        L_0x0379:
            r15 = 1
            com.google.android.gms.measurement.internal.n4 r0 = r8.f5832a     // Catch:{ all -> 0x058e }
            com.google.android.gms.measurement.internal.j3 r0 = r0.d()     // Catch:{ all -> 0x058e }
            com.google.android.gms.measurement.internal.h3 r0 = r0.u()     // Catch:{ all -> 0x058e }
            java.lang.String r8 = "Play Service for fetching Install Referrer is unavailable on device"
            goto L_0x0375
        L_0x0387:
            r15 = 1
            com.google.android.gms.measurement.internal.n4 r0 = r8.f5832a     // Catch:{ all -> 0x058e }
            com.google.android.gms.measurement.internal.j3 r0 = r0.d()     // Catch:{ all -> 0x058e }
            com.google.android.gms.measurement.internal.h3 r0 = r0.y()     // Catch:{ all -> 0x058e }
            java.lang.String r8 = "Install Referrer Reporter was called with invalid app package name"
            goto L_0x0375
        L_0x0395:
            com.google.android.gms.measurement.internal.l4 r0 = r23.b()     // Catch:{ all -> 0x058e }
            r0.h()     // Catch:{ all -> 0x058e }
            r23.g()     // Catch:{ all -> 0x058e }
            android.os.Bundle r8 = new android.os.Bundle     // Catch:{ all -> 0x058e }
            r8.<init>()     // Catch:{ all -> 0x058e }
            r13 = 1
            r8.putLong(r5, r13)     // Catch:{ all -> 0x058e }
            r8.putLong(r4, r13)     // Catch:{ all -> 0x058e }
            r4 = 0
            r8.putLong(r7, r4)     // Catch:{ all -> 0x058e }
            r8.putLong(r6, r4)     // Catch:{ all -> 0x058e }
            r9 = r22
            r8.putLong(r9, r4)     // Catch:{ all -> 0x058e }
            r14 = r21
            r8.putLong(r14, r4)     // Catch:{ all -> 0x058e }
            r4 = 1
            r8.putLong(r10, r4)     // Catch:{ all -> 0x058e }
            boolean r0 = r2.f6074t     // Catch:{ all -> 0x058e }
            if (r0 == 0) goto L_0x03ca
            r8.putLong(r3, r4)     // Catch:{ all -> 0x058e }
        L_0x03ca:
            java.lang.String r0 = r2.f6059e     // Catch:{ all -> 0x058e }
            java.lang.Object r0 = com.google.android.gms.common.internal.s.k(r0)     // Catch:{ all -> 0x058e }
            r3 = r0
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x058e }
            com.google.android.gms.measurement.internal.j r0 = r1.f6561c     // Catch:{ all -> 0x058e }
            Q(r0)     // Catch:{ all -> 0x058e }
            com.google.android.gms.common.internal.s.g(r3)     // Catch:{ all -> 0x058e }
            r0.h()     // Catch:{ all -> 0x058e }
            r0.i()     // Catch:{ all -> 0x058e }
            java.lang.String r4 = "first_open_count"
            long r4 = r0.N(r3, r4)     // Catch:{ all -> 0x058e }
            com.google.android.gms.measurement.internal.n4 r0 = r1.f6570l     // Catch:{ all -> 0x058e }
            android.content.Context r0 = r0.c()     // Catch:{ all -> 0x058e }
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch:{ all -> 0x058e }
            if (r0 != 0) goto L_0x040a
            com.google.android.gms.measurement.internal.j3 r0 = r23.d()     // Catch:{ all -> 0x058e }
            com.google.android.gms.measurement.internal.h3 r0 = r0.r()     // Catch:{ all -> 0x058e }
            java.lang.String r7 = "PackageManager is null, first open report might be inaccurate. appId"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.j3.z(r3)     // Catch:{ all -> 0x058e }
            r0.b(r7, r3)     // Catch:{ all -> 0x058e }
            r20 = r10
        L_0x0406:
            r9 = 0
            goto L_0x04c7
        L_0x040a:
            com.google.android.gms.measurement.internal.n4 r0 = r1.f6570l     // Catch:{ NameNotFoundException -> 0x041c }
            android.content.Context r0 = r0.c()     // Catch:{ NameNotFoundException -> 0x041c }
            a4.d r0 = a4.e.a(r0)     // Catch:{ NameNotFoundException -> 0x041c }
            r13 = 0
            android.content.pm.PackageInfo r0 = r0.e(r3, r13)     // Catch:{ NameNotFoundException -> 0x041c }
            r21 = r14
            goto L_0x0431
        L_0x041c:
            r0 = move-exception
            com.google.android.gms.measurement.internal.j3 r13 = r23.d()     // Catch:{ all -> 0x058e }
            com.google.android.gms.measurement.internal.h3 r13 = r13.r()     // Catch:{ all -> 0x058e }
            java.lang.String r15 = "Package info is null, first open report might be inaccurate. appId"
            r21 = r14
            java.lang.Object r14 = com.google.android.gms.measurement.internal.j3.z(r3)     // Catch:{ all -> 0x058e }
            r13.c(r15, r14, r0)     // Catch:{ all -> 0x058e }
            r0 = 0
        L_0x0431:
            if (r0 == 0) goto L_0x0481
            long r13 = r0.firstInstallTime     // Catch:{ all -> 0x058e }
            r15 = 0
            int r17 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r17 == 0) goto L_0x0481
            r22 = r9
            r20 = r10
            long r9 = r0.lastUpdateTime     // Catch:{ all -> 0x058e }
            int r0 = (r13 > r9 ? 1 : (r13 == r9 ? 0 : -1))
            if (r0 == 0) goto L_0x0462
            com.google.android.gms.measurement.internal.g r0 = r23.T()     // Catch:{ all -> 0x058e }
            com.google.android.gms.measurement.internal.x2 r9 = com.google.android.gms.measurement.internal.y2.f6631j0     // Catch:{ all -> 0x058e }
            r10 = 0
            boolean r0 = r0.B(r10, r9)     // Catch:{ all -> 0x058e }
            if (r0 == 0) goto L_0x045f
            r13 = 0
            int r0 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r0 != 0) goto L_0x045d
            r13 = 1
        L_0x045a:
            r8.putLong(r7, r13)     // Catch:{ all -> 0x058e }
        L_0x045d:
            r15 = 0
            goto L_0x0464
        L_0x045f:
            r13 = 1
            goto L_0x045a
        L_0x0462:
            r10 = 0
            r15 = 1
        L_0x0464:
            com.google.android.gms.measurement.internal.z8 r0 = new com.google.android.gms.measurement.internal.z8     // Catch:{ all -> 0x058e }
            java.lang.String r14 = "_fi"
            r7 = 1
            if (r7 == r15) goto L_0x046e
            r15 = 0
            goto L_0x0470
        L_0x046e:
            r15 = 1
        L_0x0470:
            java.lang.Long r17 = java.lang.Long.valueOf(r15)     // Catch:{ all -> 0x058e }
            java.lang.String r18 = "auto"
            r13 = r0
            r9 = r21
            r15 = r11
            r13.<init>(r14, r15, r17, r18)     // Catch:{ all -> 0x058e }
            r1.z(r0, r2)     // Catch:{ all -> 0x058e }
            goto L_0x0489
        L_0x0481:
            r22 = r9
            r20 = r10
            r9 = r21
            r7 = 1
            r10 = 0
        L_0x0489:
            com.google.android.gms.measurement.internal.n4 r0 = r1.f6570l     // Catch:{ NameNotFoundException -> 0x0499 }
            android.content.Context r0 = r0.c()     // Catch:{ NameNotFoundException -> 0x0499 }
            a4.d r0 = a4.e.a(r0)     // Catch:{ NameNotFoundException -> 0x0499 }
            r13 = 0
            android.content.pm.ApplicationInfo r0 = r0.c(r3, r13)     // Catch:{ NameNotFoundException -> 0x0499 }
            goto L_0x04ac
        L_0x0499:
            r0 = move-exception
            com.google.android.gms.measurement.internal.j3 r13 = r23.d()     // Catch:{ all -> 0x058e }
            com.google.android.gms.measurement.internal.h3 r13 = r13.r()     // Catch:{ all -> 0x058e }
            java.lang.String r14 = "Application info is null, first open report might be inaccurate. appId"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.j3.z(r3)     // Catch:{ all -> 0x058e }
            r13.c(r14, r3, r0)     // Catch:{ all -> 0x058e }
            r0 = r10
        L_0x04ac:
            if (r0 == 0) goto L_0x0406
            int r3 = r0.flags     // Catch:{ all -> 0x058e }
            r3 = r3 & r7
            if (r3 == 0) goto L_0x04ba
            r3 = r22
            r13 = 1
            r8.putLong(r3, r13)     // Catch:{ all -> 0x058e }
        L_0x04ba:
            int r0 = r0.flags     // Catch:{ all -> 0x058e }
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0406
            r13 = 1
            r8.putLong(r9, r13)     // Catch:{ all -> 0x058e }
            goto L_0x0406
        L_0x04c7:
            int r0 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r0 < 0) goto L_0x04ce
            r8.putLong(r6, r4)     // Catch:{ all -> 0x058e }
        L_0x04ce:
            com.google.android.gms.measurement.internal.t r0 = new com.google.android.gms.measurement.internal.t     // Catch:{ all -> 0x058e }
            com.google.android.gms.measurement.internal.r r15 = new com.google.android.gms.measurement.internal.r     // Catch:{ all -> 0x058e }
            r15.<init>(r8)     // Catch:{ all -> 0x058e }
            java.lang.String r14 = "_f"
            java.lang.String r16 = "auto"
            r13 = r0
            r17 = r11
            r13.<init>(r14, r15, r16, r17)     // Catch:{ all -> 0x058e }
            r1.k(r0, r2)     // Catch:{ all -> 0x058e }
            r4 = r20
            goto L_0x0530
        L_0x04e5:
            r20 = r10
            com.google.android.gms.measurement.internal.z8 r0 = new com.google.android.gms.measurement.internal.z8     // Catch:{ all -> 0x058e }
            java.lang.String r14 = "_fvt"
            java.lang.Long r17 = java.lang.Long.valueOf(r8)     // Catch:{ all -> 0x058e }
            java.lang.String r18 = "auto"
            r13 = r0
            r15 = r11
            r13.<init>(r14, r15, r17, r18)     // Catch:{ all -> 0x058e }
            r1.z(r0, r2)     // Catch:{ all -> 0x058e }
            com.google.android.gms.measurement.internal.l4 r0 = r23.b()     // Catch:{ all -> 0x058e }
            r0.h()     // Catch:{ all -> 0x058e }
            r23.g()     // Catch:{ all -> 0x058e }
            android.os.Bundle r0 = new android.os.Bundle     // Catch:{ all -> 0x058e }
            r0.<init>()     // Catch:{ all -> 0x058e }
            r6 = 1
            r0.putLong(r5, r6)     // Catch:{ all -> 0x058e }
            r0.putLong(r4, r6)     // Catch:{ all -> 0x058e }
            r4 = r20
            r0.putLong(r4, r6)     // Catch:{ all -> 0x058e }
            boolean r5 = r2.f6074t     // Catch:{ all -> 0x058e }
            if (r5 == 0) goto L_0x051c
            r0.putLong(r3, r6)     // Catch:{ all -> 0x058e }
        L_0x051c:
            com.google.android.gms.measurement.internal.t r3 = new com.google.android.gms.measurement.internal.t     // Catch:{ all -> 0x058e }
            com.google.android.gms.measurement.internal.r r15 = new com.google.android.gms.measurement.internal.r     // Catch:{ all -> 0x058e }
            r15.<init>(r0)     // Catch:{ all -> 0x058e }
            java.lang.String r14 = "_v"
            java.lang.String r16 = "auto"
            r13 = r3
            r17 = r11
            r13.<init>(r14, r15, r16, r17)     // Catch:{ all -> 0x058e }
            r1.k(r3, r2)     // Catch:{ all -> 0x058e }
        L_0x0530:
            com.google.android.gms.measurement.internal.g r0 = r23.T()     // Catch:{ all -> 0x058e }
            java.lang.String r3 = r2.f6059e     // Catch:{ all -> 0x058e }
            com.google.android.gms.measurement.internal.x2 r5 = com.google.android.gms.measurement.internal.y2.V     // Catch:{ all -> 0x058e }
            boolean r0 = r0.B(r3, r5)     // Catch:{ all -> 0x058e }
            if (r0 != 0) goto L_0x057d
            android.os.Bundle r0 = new android.os.Bundle     // Catch:{ all -> 0x058e }
            r0.<init>()     // Catch:{ all -> 0x058e }
            r5 = 1
            r0.putLong(r4, r5)     // Catch:{ all -> 0x058e }
            java.lang.String r3 = "_fr"
            r0.putLong(r3, r5)     // Catch:{ all -> 0x058e }
            com.google.android.gms.measurement.internal.t r3 = new com.google.android.gms.measurement.internal.t     // Catch:{ all -> 0x058e }
            java.lang.String r14 = "_e"
            com.google.android.gms.measurement.internal.r r15 = new com.google.android.gms.measurement.internal.r     // Catch:{ all -> 0x058e }
            r15.<init>(r0)     // Catch:{ all -> 0x058e }
            java.lang.String r16 = "auto"
            r13 = r3
            r17 = r11
            r13.<init>(r14, r15, r16, r17)     // Catch:{ all -> 0x058e }
        L_0x055e:
            r1.k(r3, r2)     // Catch:{ all -> 0x058e }
            goto L_0x057d
        L_0x0562:
            boolean r0 = r2.f6067m     // Catch:{ all -> 0x058e }
            if (r0 == 0) goto L_0x057d
            android.os.Bundle r0 = new android.os.Bundle     // Catch:{ all -> 0x058e }
            r0.<init>()     // Catch:{ all -> 0x058e }
            com.google.android.gms.measurement.internal.t r3 = new com.google.android.gms.measurement.internal.t     // Catch:{ all -> 0x058e }
            com.google.android.gms.measurement.internal.r r15 = new com.google.android.gms.measurement.internal.r     // Catch:{ all -> 0x058e }
            r15.<init>(r0)     // Catch:{ all -> 0x058e }
            java.lang.String r14 = "_cd"
            java.lang.String r16 = "auto"
            r13 = r3
            r17 = r11
            r13.<init>(r14, r15, r16, r17)     // Catch:{ all -> 0x058e }
            goto L_0x055e
        L_0x057d:
            com.google.android.gms.measurement.internal.j r0 = r1.f6561c     // Catch:{ all -> 0x058e }
            Q(r0)     // Catch:{ all -> 0x058e }
            r0.o()     // Catch:{ all -> 0x058e }
            com.google.android.gms.measurement.internal.j r0 = r1.f6561c
            Q(r0)
            r0.h0()
            return
        L_0x058e:
            r0 = move-exception
            com.google.android.gms.measurement.internal.j r2 = r1.f6561c
            Q(r2)
            r2.h0()
            throw r0
        L_0x0598:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.w8.p(com.google.android.gms.measurement.internal.i9):void");
    }

    /* access modifiers changed from: package-private */
    public final void q() {
        this.f6575q++;
    }

    /* access modifiers changed from: package-private */
    public final void r(c cVar) {
        i9 G = G((String) s.k(cVar.f5873e));
        if (G != null) {
            s(cVar, G);
        }
    }

    /* access modifiers changed from: package-private */
    public final void s(c cVar, i9 i9Var) {
        s.k(cVar);
        s.g(cVar.f5873e);
        s.k(cVar.f5875g);
        s.g(cVar.f5875g.f6689f);
        b().h();
        g();
        if (M(i9Var)) {
            if (i9Var.f6066l) {
                j jVar = this.f6561c;
                Q(jVar);
                jVar.g0();
                try {
                    R(i9Var);
                    String str = (String) s.k(cVar.f5873e);
                    j jVar2 = this.f6561c;
                    Q(jVar2);
                    c U = jVar2.U(str, cVar.f5875g.f6689f);
                    if (U != null) {
                        d().q().c("Removing conditional user property", cVar.f5873e, this.f6570l.D().s(cVar.f5875g.f6689f));
                        j jVar3 = this.f6561c;
                        Q(jVar3);
                        jVar3.K(str, cVar.f5875g.f6689f);
                        if (U.f5877i) {
                            j jVar4 = this.f6561c;
                            Q(jVar4);
                            jVar4.m(str, cVar.f5875g.f6689f);
                        }
                        t tVar = cVar.f5883o;
                        if (tVar != null) {
                            r rVar = tVar.f6409f;
                            B((t) s.k(g0().w0(str, ((t) s.k(cVar.f5883o)).f6408e, rVar != null ? rVar.V() : null, U.f5874f, cVar.f5883o.f6411h, true, true)), i9Var);
                        }
                    } else {
                        d().w().c("Conditional user property doesn't exist", j3.z(cVar.f5873e), this.f6570l.D().s(cVar.f5875g.f6689f));
                    }
                    j jVar5 = this.f6561c;
                    Q(jVar5);
                    jVar5.o();
                } finally {
                    j jVar6 = this.f6561c;
                    Q(jVar6);
                    jVar6.h0();
                }
            } else {
                R(i9Var);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void t(z8 z8Var, i9 i9Var) {
        b().h();
        g();
        if (M(i9Var)) {
            if (!i9Var.f6066l) {
                R(i9Var);
            } else if (!"_npa".equals(z8Var.f6689f) || i9Var.f6076v == null) {
                d().q().b("Removing user property", this.f6570l.D().s(z8Var.f6689f));
                j jVar = this.f6561c;
                Q(jVar);
                jVar.g0();
                try {
                    R(i9Var);
                    j jVar2 = this.f6561c;
                    Q(jVar2);
                    jVar2.m((String) s.k(i9Var.f6059e), z8Var.f6689f);
                    j jVar3 = this.f6561c;
                    Q(jVar3);
                    jVar3.o();
                    d().q().b("User property removed", this.f6570l.D().s(z8Var.f6689f));
                } finally {
                    j jVar4 = this.f6561c;
                    Q(jVar4);
                    jVar4.h0();
                }
            } else {
                d().q().a("Falling back to manifest metadata value for ad personalization");
                z(new z8("_npa", e().currentTimeMillis(), Long.valueOf(true != i9Var.f6076v.booleanValue() ? 0 : 1), "auto"), i9Var);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void u(i9 i9Var) {
        if (this.f6582x != null) {
            ArrayList arrayList = new ArrayList();
            this.f6583y = arrayList;
            arrayList.addAll(this.f6582x);
        }
        j jVar = this.f6561c;
        Q(jVar);
        String str = (String) s.k(i9Var.f6059e);
        s.g(str);
        jVar.h();
        jVar.i();
        try {
            SQLiteDatabase R = jVar.R();
            String[] strArr = {str};
            int delete = R.delete("apps", "app_id=?", strArr) + R.delete("events", "app_id=?", strArr) + R.delete("user_attributes", "app_id=?", strArr) + R.delete("conditional_properties", "app_id=?", strArr) + R.delete("raw_events", "app_id=?", strArr) + R.delete("raw_events_metadata", "app_id=?", strArr) + R.delete("queue", "app_id=?", strArr) + R.delete("audience_filter_values", "app_id=?", strArr) + R.delete("main_event_params", "app_id=?", strArr) + R.delete("default_event_params", "app_id=?", strArr);
            if (delete > 0) {
                jVar.f5994a.d().v().c("Reset analytics data. app, records", str, Integer.valueOf(delete));
            }
        } catch (SQLiteException e10) {
            jVar.f5994a.d().r().c("Error resetting analytics data. appId, error", j3.z(str), e10);
        }
        if (i9Var.f6066l) {
            p(i9Var);
        }
    }

    /* access modifiers changed from: protected */
    public final void v() {
        b().h();
        j jVar = this.f6561c;
        Q(jVar);
        jVar.j0();
        if (this.f6567i.f6556i.a() == 0) {
            this.f6567i.f6556i.b(e().currentTimeMillis());
        }
        L();
    }

    /* access modifiers changed from: package-private */
    public final void w(c cVar) {
        i9 G = G((String) s.k(cVar.f5873e));
        if (G != null) {
            x(cVar, G);
        }
    }

    /* access modifiers changed from: package-private */
    public final void x(c cVar, i9 i9Var) {
        h3 r10;
        String str;
        Object z10;
        String s10;
        Object U;
        h3 r11;
        String str2;
        Object z11;
        String s11;
        Object obj;
        t tVar;
        s.k(cVar);
        s.g(cVar.f5873e);
        s.k(cVar.f5874f);
        s.k(cVar.f5875g);
        s.g(cVar.f5875g.f6689f);
        b().h();
        g();
        if (M(i9Var)) {
            if (!i9Var.f6066l) {
                R(i9Var);
                return;
            }
            c cVar2 = new c(cVar);
            boolean z12 = false;
            cVar2.f5877i = false;
            j jVar = this.f6561c;
            Q(jVar);
            jVar.g0();
            try {
                j jVar2 = this.f6561c;
                Q(jVar2);
                c U2 = jVar2.U((String) s.k(cVar2.f5873e), cVar2.f5875g.f6689f);
                if (U2 != null && !U2.f5874f.equals(cVar2.f5874f)) {
                    d().w().d("Updating a conditional user property with different origin. name, origin, origin (from DB)", this.f6570l.D().s(cVar2.f5875g.f6689f), cVar2.f5874f, U2.f5874f);
                }
                if (U2 != null && U2.f5877i) {
                    cVar2.f5874f = U2.f5874f;
                    cVar2.f5876h = U2.f5876h;
                    cVar2.f5880l = U2.f5880l;
                    cVar2.f5878j = U2.f5878j;
                    cVar2.f5881m = U2.f5881m;
                    cVar2.f5877i = true;
                    z8 z8Var = cVar2.f5875g;
                    cVar2.f5875g = new z8(z8Var.f6689f, U2.f5875g.f6690g, z8Var.U(), U2.f5875g.f6693j);
                } else if (TextUtils.isEmpty(cVar2.f5878j)) {
                    z8 z8Var2 = cVar2.f5875g;
                    cVar2.f5875g = new z8(z8Var2.f6689f, cVar2.f5876h, z8Var2.U(), cVar2.f5875g.f6693j);
                    cVar2.f5877i = true;
                    z12 = true;
                }
                if (cVar2.f5877i) {
                    z8 z8Var3 = cVar2.f5875g;
                    b9 b9Var = new b9((String) s.k(cVar2.f5873e), cVar2.f5874f, z8Var3.f6689f, z8Var3.f6690g, s.k(z8Var3.U()));
                    j jVar3 = this.f6561c;
                    Q(jVar3);
                    if (jVar3.z(b9Var)) {
                        r11 = d().q();
                        str2 = "User property updated immediately";
                        z11 = cVar2.f5873e;
                        s11 = this.f6570l.D().s(b9Var.f5870c);
                        obj = b9Var.f5872e;
                    } else {
                        r11 = d().r();
                        str2 = "(2)Too many active user properties, ignoring";
                        z11 = j3.z(cVar2.f5873e);
                        s11 = this.f6570l.D().s(b9Var.f5870c);
                        obj = b9Var.f5872e;
                    }
                    r11.d(str2, z11, s11, obj);
                    if (z12 && (tVar = cVar2.f5881m) != null) {
                        B(new t(tVar, cVar2.f5876h), i9Var);
                    }
                }
                j jVar4 = this.f6561c;
                Q(jVar4);
                if (jVar4.y(cVar2)) {
                    r10 = d().q();
                    str = "Conditional property added";
                    z10 = cVar2.f5873e;
                    s10 = this.f6570l.D().s(cVar2.f5875g.f6689f);
                    U = cVar2.f5875g.U();
                } else {
                    r10 = d().r();
                    str = "Too many conditional properties, ignoring";
                    z10 = j3.z(cVar2.f5873e);
                    s10 = this.f6570l.D().s(cVar2.f5875g.f6689f);
                    U = cVar2.f5875g.U();
                }
                r10.d(str, z10, s10, U);
                j jVar5 = this.f6561c;
                Q(jVar5);
                jVar5.o();
            } finally {
                j jVar6 = this.f6561c;
                Q(jVar6);
                jVar6.h0();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void y(String str, a aVar) {
        b().h();
        g();
        this.A.put(str, aVar);
        j jVar = this.f6561c;
        Q(jVar);
        s.k(str);
        s.k(aVar);
        jVar.h();
        jVar.i();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("consent_state", aVar.i());
        try {
            if (jVar.R().insertWithOnConflict("consent_settings", (String) null, contentValues, 5) == -1) {
                jVar.f5994a.d().r().b("Failed to insert/update consent setting (got -1). appId", j3.z(str));
            }
        } catch (SQLiteException e10) {
            jVar.f5994a.d().r().c("Error storing consent setting. appId, error", j3.z(str), e10);
        }
    }

    /* access modifiers changed from: package-private */
    public final void z(z8 z8Var, i9 i9Var) {
        long j10;
        b().h();
        g();
        if (M(i9Var)) {
            if (!i9Var.f6066l) {
                R(i9Var);
                return;
            }
            int n02 = g0().n0(z8Var.f6689f);
            d9 g02 = g0();
            String str = z8Var.f6689f;
            if (n02 != 0) {
                T();
                String q10 = g02.q(str, 24, true);
                String str2 = z8Var.f6689f;
                g0().A(this.B, i9Var.f6059e, n02, "_ev", q10, str2 != null ? str2.length() : 0);
                return;
            }
            int j02 = g02.j0(str, z8Var.U());
            if (j02 != 0) {
                d9 g03 = g0();
                String str3 = z8Var.f6689f;
                T();
                String q11 = g03.q(str3, 24, true);
                Object U = z8Var.U();
                g0().A(this.B, i9Var.f6059e, j02, "_ev", q11, (U == null || (!(U instanceof String) && !(U instanceof CharSequence))) ? 0 : String.valueOf(U).length());
                return;
            }
            Object p10 = g0().p(z8Var.f6689f, z8Var.U());
            if (p10 != null) {
                if ("_sid".equals(z8Var.f6689f)) {
                    long j11 = z8Var.f6690g;
                    String str4 = z8Var.f6693j;
                    String str5 = (String) s.k(i9Var.f6059e);
                    j jVar = this.f6561c;
                    Q(jVar);
                    b9 Z = jVar.Z(str5, "_sno");
                    if (Z != null) {
                        Object obj = Z.f5872e;
                        if (obj instanceof Long) {
                            j10 = ((Long) obj).longValue();
                            z(new z8("_sno", j11, Long.valueOf(j10 + 1), str4), i9Var);
                        }
                    }
                    if (Z != null) {
                        d().w().b("Retrieved last session number from database does not contain a valid (long) value", Z.f5872e);
                    }
                    j jVar2 = this.f6561c;
                    Q(jVar2);
                    p X = jVar2.X(str5, "_s");
                    if (X != null) {
                        j10 = X.f6304c;
                        d().v().b("Backfill the session number. Last used session number", Long.valueOf(j10));
                    } else {
                        j10 = 0;
                    }
                    z(new z8("_sno", j11, Long.valueOf(j10 + 1), str4), i9Var);
                }
                b9 b9Var = new b9((String) s.k(i9Var.f6059e), (String) s.k(z8Var.f6693j), z8Var.f6689f, z8Var.f6690g, p10);
                d().v().c("Setting user property", this.f6570l.D().s(b9Var.f5870c), p10);
                j jVar3 = this.f6561c;
                Q(jVar3);
                jVar3.g0();
                try {
                    zzna.zzc();
                    if (this.f6570l.z().B((String) null, y2.A0) && "_id".equals(b9Var.f5870c)) {
                        j jVar4 = this.f6561c;
                        Q(jVar4);
                        jVar4.m(i9Var.f6059e, "_lair");
                    }
                    R(i9Var);
                    j jVar5 = this.f6561c;
                    Q(jVar5);
                    boolean z10 = jVar5.z(b9Var);
                    j jVar6 = this.f6561c;
                    Q(jVar6);
                    jVar6.o();
                    if (!z10) {
                        d().r().c("Too many unique user properties are set. Ignoring user property", this.f6570l.D().s(b9Var.f5870c), b9Var.f5872e);
                        g0().A(this.B, i9Var.f6059e, 9, (String) null, (String) null, 0);
                    }
                } finally {
                    j jVar7 = this.f6561c;
                    Q(jVar7);
                    jVar7.h0();
                }
            }
        }
    }
}
