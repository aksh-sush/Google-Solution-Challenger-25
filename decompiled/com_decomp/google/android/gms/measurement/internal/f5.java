package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.database.sqlite.SQLiteException;
import android.os.Binder;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.s;
import com.google.firebase.dynamiclinks.DynamicLink;
import h4.c;
import h4.l;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutionException;
import q3.o;
import q3.p;
import y3.q;

public final class f5 extends c {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final w8 f5962a;

    /* renamed from: b  reason: collision with root package name */
    private Boolean f5963b;

    /* renamed from: c  reason: collision with root package name */
    private String f5964c = null;

    public f5(w8 w8Var, String str) {
        s.k(w8Var);
        this.f5962a = w8Var;
    }

    /* access modifiers changed from: private */
    public final void Y(t tVar, i9 i9Var) {
        this.f5962a.a();
        this.f5962a.i(tVar, i9Var);
    }

    private final void c(String str, boolean z10) {
        boolean z11;
        if (!TextUtils.isEmpty(str)) {
            if (z10) {
                try {
                    if (this.f5963b == null) {
                        if (!"com.google.android.gms".equals(this.f5964c) && !q.a(this.f5962a.c(), Binder.getCallingUid())) {
                            if (!p.a(this.f5962a.c()).c(Binder.getCallingUid())) {
                                z11 = false;
                                this.f5963b = Boolean.valueOf(z11);
                            }
                        }
                        z11 = true;
                        this.f5963b = Boolean.valueOf(z11);
                    }
                    if (this.f5963b.booleanValue()) {
                        return;
                    }
                } catch (SecurityException e10) {
                    this.f5962a.d().r().b("Measurement Service called with invalid calling package. appId", j3.z(str));
                    throw e10;
                }
            }
            if (this.f5964c == null && o.l(this.f5962a.c(), Binder.getCallingUid(), str)) {
                this.f5964c = str;
            }
            if (!str.equals(this.f5964c)) {
                throw new SecurityException(String.format("Unknown calling package name '%s'.", new Object[]{str}));
            }
            return;
        }
        this.f5962a.d().r().a("Measurement Service called without app package");
        throw new SecurityException("Measurement Service called without app package");
    }

    private final void f0(i9 i9Var, boolean z10) {
        s.k(i9Var);
        s.g(i9Var.f6059e);
        c(i9Var.f6059e, false);
        this.f5962a.g0().K(i9Var.f6060f, i9Var.f6075u, i9Var.f6079y);
    }

    public final byte[] A(t tVar, String str) {
        s.g(str);
        s.k(tVar);
        c(str, true);
        this.f5962a.d().q().b("Log and bundle. event", this.f5962a.W().q(tVar.f6408e));
        long b10 = this.f5962a.e().b() / 1000000;
        try {
            byte[] bArr = (byte[]) this.f5962a.b().t(new a5(this, tVar, str)).get();
            if (bArr == null) {
                this.f5962a.d().r().b("Log and bundle returned null. appId", j3.z(str));
                bArr = new byte[0];
            }
            this.f5962a.d().q().d("Log and bundle processed. event, size, time_ms", this.f5962a.W().q(tVar.f6408e), Integer.valueOf(bArr.length), Long.valueOf((this.f5962a.e().b() / 1000000) - b10));
            return bArr;
        } catch (InterruptedException | ExecutionException e10) {
            this.f5962a.d().r().d("Failed to log and bundle. appId, event, error", j3.z(str), this.f5962a.W().q(tVar.f6408e), e10);
            return null;
        }
    }

    public final void E(t tVar, String str, String str2) {
        s.k(tVar);
        s.g(str);
        c(str, true);
        e0(new z4(this, tVar, str));
    }

    public final void G(i9 i9Var) {
        f0(i9Var, false);
        e0(new d5(this, i9Var));
    }

    public final List H(String str, String str2, i9 i9Var) {
        f0(i9Var, false);
        String str3 = i9Var.f6059e;
        s.k(str3);
        try {
            return (List) this.f5962a.b().s(new s4(this, str3, str, str2)).get();
        } catch (InterruptedException | ExecutionException e10) {
            this.f5962a.d().r().b("Failed to get conditional user properties", e10);
            return Collections.emptyList();
        }
    }

    public final void P(i9 i9Var) {
        f0(i9Var, false);
        e0(new w4(this, i9Var));
    }

    public final void U(z8 z8Var, i9 i9Var) {
        s.k(z8Var);
        f0(i9Var, false);
        e0(new b5(this, z8Var, i9Var));
    }

    public final void X(t tVar, i9 i9Var) {
        s.k(tVar);
        f0(i9Var, false);
        e0(new y4(this, tVar, i9Var));
    }

    /* access modifiers changed from: package-private */
    public final t Z(t tVar, i9 i9Var) {
        r rVar;
        if (!(!"_cmp".equals(tVar.f6408e) || (rVar = tVar.f6409f) == null || rVar.zza() == 0)) {
            String l02 = tVar.f6409f.l0("_cis");
            if ("referrer broadcast".equals(l02) || "referrer API".equals(l02)) {
                this.f5962a.d().u().b("Event has been filtered ", tVar.toString());
                return new t("_cmpx", tVar.f6409f, tVar.f6410g, tVar.f6411h);
            }
        }
        return tVar;
    }

    public final void a(i9 i9Var) {
        s.g(i9Var.f6059e);
        s.k(i9Var.f6080z);
        x4 x4Var = new x4(this, i9Var);
        s.k(x4Var);
        if (this.f5962a.b().C()) {
            x4Var.run();
        } else {
            this.f5962a.b().A(x4Var);
        }
    }

    public final void b(long j10, String str, String str2, String str3) {
        e0(new e5(this, str2, str3, str, j10));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v30, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: com.google.android.gms.internal.measurement.zzc} */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c0(com.google.android.gms.measurement.internal.t r8, com.google.android.gms.measurement.internal.i9 r9) {
        /*
            r7 = this;
            com.google.android.gms.measurement.internal.w8 r0 = r7.f5962a
            com.google.android.gms.measurement.internal.h4 r0 = r0.Z()
            java.lang.String r1 = r9.f6059e
            boolean r0 = r0.u(r1)
            if (r0 != 0) goto L_0x0012
            r7.Y(r8, r9)
            return
        L_0x0012:
            com.google.android.gms.measurement.internal.w8 r0 = r7.f5962a
            com.google.android.gms.measurement.internal.j3 r0 = r0.d()
            com.google.android.gms.measurement.internal.h3 r0 = r0.v()
            java.lang.String r1 = "EES config found for"
            java.lang.String r2 = r9.f6059e
            r0.b(r1, r2)
            com.google.android.gms.measurement.internal.w8 r0 = r7.f5962a
            com.google.android.gms.measurement.internal.h4 r0 = r0.Z()
            java.lang.String r1 = r9.f6059e
            com.google.android.gms.internal.measurement.zzpl.zzc()
            com.google.android.gms.measurement.internal.n4 r2 = r0.f5994a
            com.google.android.gms.measurement.internal.g r2 = r2.z()
            com.google.android.gms.measurement.internal.x2 r3 = com.google.android.gms.measurement.internal.y2.f6659x0
            r4 = 0
            boolean r2 = r2.B(r4, r3)
            if (r2 == 0) goto L_0x004d
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 == 0) goto L_0x0044
            goto L_0x004d
        L_0x0044:
            androidx.collection.e r0 = r0.f6021i
            java.lang.Object r0 = r0.get(r1)
            r4 = r0
            com.google.android.gms.internal.measurement.zzc r4 = (com.google.android.gms.internal.measurement.zzc) r4
        L_0x004d:
            if (r4 == 0) goto L_0x00fa
            com.google.android.gms.measurement.internal.r r0 = r8.f6409f     // Catch:{ zzd -> 0x00d2 }
            android.os.Bundle r0 = r0.V()     // Catch:{ zzd -> 0x00d2 }
            r1 = 1
            java.util.Map r0 = com.google.android.gms.measurement.internal.y8.K(r0, r1)     // Catch:{ zzd -> 0x00d2 }
            java.lang.String r1 = r8.f6408e     // Catch:{ zzd -> 0x00d2 }
            java.lang.String r1 = h4.n.a(r1)     // Catch:{ zzd -> 0x00d2 }
            if (r1 != 0) goto L_0x0064
            java.lang.String r1 = r8.f6408e     // Catch:{ zzd -> 0x00d2 }
        L_0x0064:
            com.google.android.gms.internal.measurement.zzaa r2 = new com.google.android.gms.internal.measurement.zzaa     // Catch:{ zzd -> 0x00d2 }
            long r5 = r8.f6411h     // Catch:{ zzd -> 0x00d2 }
            r2.<init>(r1, r5, r0)     // Catch:{ zzd -> 0x00d2 }
            boolean r0 = r4.zze(r2)     // Catch:{ zzd -> 0x00d2 }
            if (r0 != 0) goto L_0x0072
            goto L_0x00e5
        L_0x0072:
            boolean r0 = r4.zzg()
            if (r0 == 0) goto L_0x0095
            com.google.android.gms.measurement.internal.w8 r0 = r7.f5962a
            com.google.android.gms.measurement.internal.j3 r0 = r0.d()
            com.google.android.gms.measurement.internal.h3 r0 = r0.v()
            java.lang.String r1 = "EES edited event"
            java.lang.String r8 = r8.f6408e
            r0.b(r1, r8)
            com.google.android.gms.internal.measurement.zzab r8 = r4.zza()
            com.google.android.gms.internal.measurement.zzaa r8 = r8.zzb()
            com.google.android.gms.measurement.internal.t r8 = com.google.android.gms.measurement.internal.y8.B(r8)
        L_0x0095:
            r7.Y(r8, r9)
            boolean r8 = r4.zzf()
            if (r8 == 0) goto L_0x00d1
            com.google.android.gms.internal.measurement.zzab r8 = r4.zza()
            java.util.List r8 = r8.zzc()
            java.util.Iterator r8 = r8.iterator()
        L_0x00aa:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x00d1
            java.lang.Object r0 = r8.next()
            com.google.android.gms.internal.measurement.zzaa r0 = (com.google.android.gms.internal.measurement.zzaa) r0
            com.google.android.gms.measurement.internal.w8 r1 = r7.f5962a
            com.google.android.gms.measurement.internal.j3 r1 = r1.d()
            com.google.android.gms.measurement.internal.h3 r1 = r1.v()
            java.lang.String r2 = r0.zzd()
            java.lang.String r3 = "EES logging created event"
            r1.b(r3, r2)
            com.google.android.gms.measurement.internal.t r0 = com.google.android.gms.measurement.internal.y8.B(r0)
            r7.Y(r0, r9)
            goto L_0x00aa
        L_0x00d1:
            return
        L_0x00d2:
            com.google.android.gms.measurement.internal.w8 r0 = r7.f5962a
            com.google.android.gms.measurement.internal.j3 r0 = r0.d()
            com.google.android.gms.measurement.internal.h3 r0 = r0.r()
            java.lang.String r1 = r9.f6060f
            java.lang.String r2 = r8.f6408e
            java.lang.String r3 = "EES error. appId, eventName"
            r0.c(r3, r1, r2)
        L_0x00e5:
            com.google.android.gms.measurement.internal.w8 r0 = r7.f5962a
            com.google.android.gms.measurement.internal.j3 r0 = r0.d()
            com.google.android.gms.measurement.internal.h3 r0 = r0.v()
            java.lang.String r1 = r8.f6408e
            java.lang.String r2 = "EES was not applied to event"
            r0.b(r2, r1)
        L_0x00f6:
            r7.Y(r8, r9)
            return
        L_0x00fa:
            com.google.android.gms.measurement.internal.w8 r0 = r7.f5962a
            com.google.android.gms.measurement.internal.j3 r0 = r0.d()
            com.google.android.gms.measurement.internal.h3 r0 = r0.v()
            java.lang.String r1 = "EES not loaded for"
            java.lang.String r2 = r9.f6059e
            r0.b(r1, r2)
            goto L_0x00f6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.f5.c0(com.google.android.gms.measurement.internal.t, com.google.android.gms.measurement.internal.i9):void");
    }

    public final void d(Bundle bundle, i9 i9Var) {
        f0(i9Var, false);
        String str = i9Var.f6059e;
        s.k(str);
        e0(new l(this, str, bundle));
    }

    public final /* synthetic */ void d0(String str, Bundle bundle) {
        j V = this.f5962a.V();
        V.h();
        V.i();
        byte[] zzbs = V.f6214b.f0().C(new o(V.f5994a, "", str, "dep", 0, 0, bundle)).zzbs();
        V.f5994a.d().v().c("Saving default event parameters, appId, data size", V.f5994a.D().q(str), Integer.valueOf(zzbs.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put(DynamicLink.Builder.KEY_DYNAMIC_LINK_PARAMETERS, zzbs);
        try {
            if (V.R().insertWithOnConflict("default_event_params", (String) null, contentValues, 5) == -1) {
                V.f5994a.d().r().b("Failed to insert default event parameters (got -1). appId", j3.z(str));
            }
        } catch (SQLiteException e10) {
            V.f5994a.d().r().c("Error storing default event parameters. appId", j3.z(str), e10);
        }
    }

    public final List e(String str, String str2, boolean z10, i9 i9Var) {
        f0(i9Var, false);
        String str3 = i9Var.f6059e;
        s.k(str3);
        try {
            List<b9> list = (List) this.f5962a.b().s(new q4(this, str3, str, str2)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (b9 b9Var : list) {
                if (z10 || !d9.V(b9Var.f5870c)) {
                    arrayList.add(new z8(b9Var));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e10) {
            this.f5962a.d().r().c("Failed to query user properties. appId", j3.z(i9Var.f6059e), e10);
            return Collections.emptyList();
        }
    }

    /* access modifiers changed from: package-private */
    public final void e0(Runnable runnable) {
        s.k(runnable);
        if (this.f5962a.b().C()) {
            runnable.run();
        } else {
            this.f5962a.b().z(runnable);
        }
    }

    public final void g(c cVar, i9 i9Var) {
        s.k(cVar);
        s.k(cVar.f5875g);
        f0(i9Var, false);
        c cVar2 = new c(cVar);
        cVar2.f5873e = i9Var.f6059e;
        e0(new o4(this, cVar2, i9Var));
    }

    public final List i(String str, String str2, String str3, boolean z10) {
        c(str, true);
        try {
            List<b9> list = (List) this.f5962a.b().s(new r4(this, str, str2, str3)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (b9 b9Var : list) {
                if (z10 || !d9.V(b9Var.f5870c)) {
                    arrayList.add(new z8(b9Var));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e10) {
            this.f5962a.d().r().c("Failed to get user properties as. appId", j3.z(str), e10);
            return Collections.emptyList();
        }
    }

    public final void k(i9 i9Var) {
        s.g(i9Var.f6059e);
        c(i9Var.f6059e, false);
        e0(new v4(this, i9Var));
    }

    public final String o(i9 i9Var) {
        f0(i9Var, false);
        return this.f5962a.i0(i9Var);
    }

    public final void u(c cVar) {
        s.k(cVar);
        s.k(cVar.f5875g);
        s.g(cVar.f5873e);
        c(cVar.f5873e, true);
        e0(new p4(this, new c(cVar)));
    }

    public final List v(String str, String str2, String str3) {
        c(str, true);
        try {
            return (List) this.f5962a.b().s(new t4(this, str, str2, str3)).get();
        } catch (InterruptedException | ExecutionException e10) {
            this.f5962a.d().r().b("Failed to get conditional user properties as", e10);
            return Collections.emptyList();
        }
    }

    public final List x(i9 i9Var, boolean z10) {
        f0(i9Var, false);
        String str = i9Var.f6059e;
        s.k(str);
        try {
            List<b9> list = (List) this.f5962a.b().s(new c5(this, str)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (b9 b9Var : list) {
                if (z10 || !d9.V(b9Var.f5870c)) {
                    arrayList.add(new z8(b9Var));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e10) {
            this.f5962a.d().r().c("Failed to get user properties. appId", j3.z(i9Var.f6059e), e10);
            return null;
        }
    }
}
