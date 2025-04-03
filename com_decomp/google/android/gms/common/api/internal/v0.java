package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.common.internal.w0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;
import k4.e;
import l4.l;
import q3.b;
import q3.k;

public final class v0 implements c1 {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final f1 f5508a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final Lock f5509b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final Context f5510c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final k f5511d;

    /* renamed from: e  reason: collision with root package name */
    private b f5512e;

    /* renamed from: f  reason: collision with root package name */
    private int f5513f;

    /* renamed from: g  reason: collision with root package name */
    private int f5514g = 0;

    /* renamed from: h  reason: collision with root package name */
    private int f5515h;

    /* renamed from: i  reason: collision with root package name */
    private final Bundle f5516i = new Bundle();

    /* renamed from: j  reason: collision with root package name */
    private final Set f5517j = new HashSet();
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public e f5518k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f5519l;
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public boolean f5520m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f5521n;
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public com.google.android.gms.common.internal.k f5522o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f5523p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f5524q;
    /* access modifiers changed from: private */

    /* renamed from: r  reason: collision with root package name */
    public final d f5525r;

    /* renamed from: s  reason: collision with root package name */
    private final Map f5526s;

    /* renamed from: t  reason: collision with root package name */
    private final a.C0085a f5527t;

    /* renamed from: u  reason: collision with root package name */
    private final ArrayList f5528u = new ArrayList();

    public v0(f1 f1Var, d dVar, Map map, k kVar, a.C0085a aVar, Lock lock, Context context) {
        this.f5508a = f1Var;
        this.f5525r = dVar;
        this.f5526s = map;
        this.f5511d = kVar;
        this.f5527t = aVar;
        this.f5509b = lock;
        this.f5510c = context;
    }

    static /* bridge */ /* synthetic */ void B(v0 v0Var, l lVar) {
        if (v0Var.o(0)) {
            b U = lVar.U();
            if (U.j0()) {
                w0 w0Var = (w0) s.k(lVar.V());
                b U2 = w0Var.U();
                if (!U2.j0()) {
                    String valueOf = String.valueOf(U2);
                    Log.wtf("GACConnecting", "Sign-in succeeded with resolve account failure: ".concat(valueOf), new Exception());
                    v0Var.l(U2);
                    return;
                }
                v0Var.f5521n = true;
                v0Var.f5522o = (com.google.android.gms.common.internal.k) s.k(w0Var.V());
                v0Var.f5523p = w0Var.W();
                v0Var.f5524q = w0Var.X();
                v0Var.n();
            } else if (v0Var.q(U)) {
                v0Var.i();
                v0Var.n();
            } else {
                v0Var.l(U);
            }
        }
    }

    private final void J() {
        ArrayList arrayList = this.f5528u;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((Future) arrayList.get(i10)).cancel(true);
        }
        this.f5528u.clear();
    }

    /* access modifiers changed from: private */
    public final void i() {
        this.f5520m = false;
        this.f5508a.f5367n.f5317p = Collections.emptySet();
        for (a.c cVar : this.f5517j) {
            if (!this.f5508a.f5360g.containsKey(cVar)) {
                this.f5508a.f5360g.put(cVar, new b(17, (PendingIntent) null));
            }
        }
    }

    private final void j(boolean z10) {
        e eVar = this.f5518k;
        if (eVar != null) {
            if (eVar.isConnected() && z10) {
                eVar.c();
            }
            eVar.disconnect();
            d dVar = (d) s.k(this.f5525r);
            this.f5522o = null;
        }
    }

    private final void k() {
        this.f5508a.m();
        g1.a().execute(new j0(this));
        e eVar = this.f5518k;
        if (eVar != null) {
            if (this.f5523p) {
                eVar.b((com.google.android.gms.common.internal.k) s.k(this.f5522o), this.f5524q);
            }
            j(false);
        }
        for (a.c cVar : this.f5508a.f5360g.keySet()) {
            ((a.f) s.k((a.f) this.f5508a.f5359f.get(cVar))).disconnect();
        }
        this.f5508a.f5368o.b(this.f5516i.isEmpty() ? null : this.f5516i);
    }

    /* access modifiers changed from: private */
    public final void l(b bVar) {
        J();
        j(!bVar.X());
        this.f5508a.o(bVar);
        this.f5508a.f5368o.a(bVar);
    }

    /* access modifiers changed from: private */
    public final void m(b bVar, a aVar, boolean z10) {
        int priority = aVar.c().getPriority();
        if ((!z10 || bVar.X() || this.f5511d.c(bVar.U()) != null) && (this.f5512e == null || priority < this.f5513f)) {
            this.f5512e = bVar;
            this.f5513f = priority;
        }
        this.f5508a.f5360g.put(aVar.b(), bVar);
    }

    /* access modifiers changed from: private */
    public final void n() {
        if (this.f5515h == 0) {
            if (!this.f5520m || this.f5521n) {
                ArrayList arrayList = new ArrayList();
                this.f5514g = 1;
                this.f5515h = this.f5508a.f5359f.size();
                for (a.c cVar : this.f5508a.f5359f.keySet()) {
                    if (!this.f5508a.f5360g.containsKey(cVar)) {
                        arrayList.add((a.f) this.f5508a.f5359f.get(cVar));
                    } else if (p()) {
                        k();
                    }
                }
                if (!arrayList.isEmpty()) {
                    this.f5528u.add(g1.a().submit(new o0(this, arrayList)));
                }
            }
        }
    }

    /* access modifiers changed from: private */
    public final boolean o(int i10) {
        if (this.f5514g == i10) {
            return true;
        }
        Log.w("GACConnecting", this.f5508a.f5367n.s());
        Log.w("GACConnecting", "Unexpected callback in ".concat(toString()));
        int i11 = this.f5515h;
        StringBuilder sb2 = new StringBuilder(33);
        sb2.append("mRemainingConnections=");
        sb2.append(i11);
        Log.w("GACConnecting", sb2.toString());
        String r10 = r(this.f5514g);
        String r11 = r(i10);
        StringBuilder sb3 = new StringBuilder(r10.length() + 70 + r11.length());
        sb3.append("GoogleApiClient connecting is in step ");
        sb3.append(r10);
        sb3.append(" but received callback for step ");
        sb3.append(r11);
        Log.e("GACConnecting", sb3.toString(), new Exception());
        l(new b(8, (PendingIntent) null));
        return false;
    }

    /* access modifiers changed from: private */
    public final boolean p() {
        b bVar;
        int i10 = this.f5515h - 1;
        this.f5515h = i10;
        if (i10 > 0) {
            return false;
        }
        if (i10 < 0) {
            Log.w("GACConnecting", this.f5508a.f5367n.s());
            Log.wtf("GACConnecting", "GoogleApiClient received too many callbacks for the given step. Clients may be in an unexpected state; GoogleApiClient will now disconnect.", new Exception());
            bVar = new b(8, (PendingIntent) null);
        } else {
            bVar = this.f5512e;
            if (bVar == null) {
                return true;
            }
            this.f5508a.f5366m = this.f5513f;
        }
        l(bVar);
        return false;
    }

    /* access modifiers changed from: private */
    public final boolean q(b bVar) {
        return this.f5519l && !bVar.X();
    }

    private static final String r(int i10) {
        return i10 != 0 ? "STEP_GETTING_REMOTE_SERVICE" : "STEP_SERVICE_BINDINGS_AND_SIGN_IN";
    }

    static /* bridge */ /* synthetic */ Set y(v0 v0Var) {
        d dVar = v0Var.f5525r;
        if (dVar == null) {
            return Collections.emptySet();
        }
        HashSet hashSet = new HashSet(dVar.g());
        Map k10 = v0Var.f5525r.k();
        for (a aVar : k10.keySet()) {
            if (!v0Var.f5508a.f5360g.containsKey(aVar.b())) {
                android.support.v4.media.session.b.a(k10.get(aVar));
                throw null;
            }
        }
        return hashSet;
    }

    public final void a(Bundle bundle) {
        if (o(1)) {
            if (bundle != null) {
                this.f5516i.putAll(bundle);
            }
            if (p()) {
                k();
            }
        }
    }

    public final void b(int i10) {
        l(new b(8, (PendingIntent) null));
    }

    /* JADX WARNING: type inference failed for: r0v13, types: [k4.e, com.google.android.gms.common.api.a$f] */
    public final void c() {
        this.f5508a.f5360g.clear();
        this.f5520m = false;
        this.f5512e = null;
        this.f5514g = 0;
        this.f5519l = true;
        this.f5521n = false;
        this.f5523p = false;
        HashMap hashMap = new HashMap();
        boolean z10 = false;
        for (a aVar : this.f5526s.keySet()) {
            a.f fVar = (a.f) s.k((a.f) this.f5508a.f5359f.get(aVar.b()));
            z10 |= aVar.c().getPriority() == 1;
            boolean booleanValue = ((Boolean) this.f5526s.get(aVar)).booleanValue();
            if (fVar.requiresSignIn()) {
                this.f5520m = true;
                if (booleanValue) {
                    this.f5517j.add(aVar.b());
                } else {
                    this.f5519l = false;
                }
            }
            hashMap.put(fVar, new k0(this, aVar, booleanValue));
        }
        if (z10) {
            this.f5520m = false;
        }
        if (this.f5520m) {
            s.k(this.f5525r);
            s.k(this.f5527t);
            this.f5525r.l(Integer.valueOf(System.identityHashCode(this.f5508a.f5367n)));
            s0 s0Var = new s0(this, (r0) null);
            a.C0085a aVar2 = this.f5527t;
            Context context = this.f5510c;
            Looper k10 = this.f5508a.f5367n.k();
            d dVar = this.f5525r;
            this.f5518k = aVar2.buildClient(context, k10, dVar, (Object) dVar.h(), (GoogleApiClient.b) s0Var, (GoogleApiClient.c) s0Var);
        }
        this.f5515h = this.f5508a.f5359f.size();
        this.f5528u.add(g1.a().submit(new n0(this, hashMap)));
    }

    public final void d() {
    }

    public final void e(b bVar, a aVar, boolean z10) {
        if (o(1)) {
            m(bVar, aVar, z10);
            if (p()) {
                k();
            }
        }
    }

    public final e f(e eVar) {
        this.f5508a.f5367n.f5309h.add(eVar);
        return eVar;
    }

    public final boolean g() {
        J();
        j(true);
        this.f5508a.o((b) null);
        return true;
    }

    public final e h(e eVar) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }
}
