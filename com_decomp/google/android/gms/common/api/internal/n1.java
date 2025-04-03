package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.d;
import com.google.android.gms.common.api.internal.l;
import com.google.android.gms.common.api.l;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.common.internal.s;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import n4.j;
import q3.b;
import t3.e;

public final class n1 implements GoogleApiClient.b, GoogleApiClient.c, b3 {

    /* renamed from: a  reason: collision with root package name */
    private final Queue f5452a = new LinkedList();
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final a.f f5453b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final c f5454c;

    /* renamed from: d  reason: collision with root package name */
    private final c0 f5455d;

    /* renamed from: e  reason: collision with root package name */
    private final Set f5456e = new HashSet();

    /* renamed from: f  reason: collision with root package name */
    private final Map f5457f = new HashMap();

    /* renamed from: g  reason: collision with root package name */
    private final int f5458g;

    /* renamed from: h  reason: collision with root package name */
    private final g2 f5459h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f5460i;

    /* renamed from: j  reason: collision with root package name */
    private final List f5461j = new ArrayList();

    /* renamed from: k  reason: collision with root package name */
    private b f5462k = null;

    /* renamed from: l  reason: collision with root package name */
    private int f5463l = 0;

    /* renamed from: m  reason: collision with root package name */
    final /* synthetic */ h f5464m;

    public n1(h hVar, d dVar) {
        this.f5464m = hVar;
        a.f zab = dVar.zab(hVar.f5399p.getLooper(), this);
        this.f5453b = zab;
        this.f5454c = dVar.getApiKey();
        this.f5455d = new c0();
        this.f5458g = dVar.zaa();
        if (zab.requiresSignIn()) {
            this.f5459h = dVar.zac(hVar.f5390g, hVar.f5399p);
        } else {
            this.f5459h = null;
        }
    }

    private final q3.d b(q3.d[] dVarArr) {
        if (!(dVarArr == null || dVarArr.length == 0)) {
            q3.d[] availableFeatures = this.f5453b.getAvailableFeatures();
            if (availableFeatures == null) {
                availableFeatures = new q3.d[0];
            }
            androidx.collection.a aVar = new androidx.collection.a(r3);
            for (q3.d dVar : availableFeatures) {
                aVar.put(dVar.U(), Long.valueOf(dVar.V()));
            }
            for (q3.d dVar2 : dVarArr) {
                Long l10 = (Long) aVar.get(dVar2.U());
                if (l10 == null || l10.longValue() < dVar2.V()) {
                    return dVar2;
                }
            }
        }
        return null;
    }

    private final void d(b bVar) {
        Iterator it = this.f5456e.iterator();
        if (it.hasNext()) {
            android.support.v4.media.session.b.a(it.next());
            if (q.b(bVar, b.f14642i)) {
                this.f5453b.getEndpointPackageName();
            }
            throw null;
        }
        this.f5456e.clear();
    }

    /* access modifiers changed from: private */
    public final void e(Status status) {
        s.d(this.f5464m.f5399p);
        f(status, (Exception) null, false);
    }

    private final void f(Status status, Exception exc, boolean z10) {
        s.d(this.f5464m.f5399p);
        boolean z11 = false;
        boolean z12 = status == null;
        if (exc == null) {
            z11 = true;
        }
        if (z12 != z11) {
            Iterator it = this.f5452a.iterator();
            while (it.hasNext()) {
                r2 r2Var = (r2) it.next();
                if (!z10 || r2Var.f5488a == 2) {
                    if (status != null) {
                        r2Var.a(status);
                    } else {
                        r2Var.b(exc);
                    }
                    it.remove();
                }
            }
            return;
        }
        throw new IllegalArgumentException("Status XOR exception should be null");
    }

    private final void g() {
        ArrayList arrayList = new ArrayList(this.f5452a);
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            r2 r2Var = (r2) arrayList.get(i10);
            if (this.f5453b.isConnected()) {
                if (m(r2Var)) {
                    this.f5452a.remove(r2Var);
                }
                i10++;
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: private */
    public final void h() {
        A();
        d(b.f14642i);
        l();
        Iterator it = this.f5457f.values().iterator();
        if (!it.hasNext()) {
            g();
            j();
            return;
        }
        ((c2) it.next()).getClass();
        throw null;
    }

    /* access modifiers changed from: private */
    public final void i(int i10) {
        A();
        this.f5460i = true;
        this.f5455d.e(i10, this.f5453b.getLastDisconnectMessage());
        h hVar = this.f5464m;
        hVar.f5399p.sendMessageDelayed(Message.obtain(hVar.f5399p, 9, this.f5454c), this.f5464m.f5384a);
        h hVar2 = this.f5464m;
        hVar2.f5399p.sendMessageDelayed(Message.obtain(hVar2.f5399p, 11, this.f5454c), this.f5464m.f5385b);
        this.f5464m.f5392i.c();
        for (c2 c2Var : this.f5457f.values()) {
            c2Var.f5336a.run();
        }
    }

    private final void j() {
        this.f5464m.f5399p.removeMessages(12, this.f5454c);
        h hVar = this.f5464m;
        hVar.f5399p.sendMessageDelayed(hVar.f5399p.obtainMessage(12, this.f5454c), this.f5464m.f5386c);
    }

    private final void k(r2 r2Var) {
        r2Var.d(this.f5455d, K());
        try {
            r2Var.c(this);
        } catch (DeadObjectException unused) {
            onConnectionSuspended(1);
            this.f5453b.disconnect("DeadObjectException thrown while running ApiCallRunner.");
        }
    }

    private final void l() {
        if (this.f5460i) {
            this.f5464m.f5399p.removeMessages(11, this.f5454c);
            this.f5464m.f5399p.removeMessages(9, this.f5454c);
            this.f5460i = false;
        }
    }

    private final boolean m(r2 r2Var) {
        if (!(r2Var instanceof x1)) {
            k(r2Var);
            return true;
        }
        x1 x1Var = (x1) r2Var;
        q3.d b10 = b(x1Var.g(this));
        if (b10 == null) {
            k(r2Var);
            return true;
        }
        String name = this.f5453b.getClass().getName();
        String U = b10.U();
        long V = b10.V();
        StringBuilder sb2 = new StringBuilder(name.length() + 77 + String.valueOf(U).length());
        sb2.append(name);
        sb2.append(" could not execute call because it requires feature (");
        sb2.append(U);
        sb2.append(", ");
        sb2.append(V);
        sb2.append(").");
        Log.w("GoogleApiManager", sb2.toString());
        if (!this.f5464m.f5400q || !x1Var.f(this)) {
            x1Var.b(new l(b10));
            return true;
        }
        p1 p1Var = new p1(this.f5454c, b10, (o1) null);
        int indexOf = this.f5461j.indexOf(p1Var);
        if (indexOf >= 0) {
            p1 p1Var2 = (p1) this.f5461j.get(indexOf);
            this.f5464m.f5399p.removeMessages(15, p1Var2);
            h hVar = this.f5464m;
            hVar.f5399p.sendMessageDelayed(Message.obtain(hVar.f5399p, 15, p1Var2), this.f5464m.f5384a);
            return false;
        }
        this.f5461j.add(p1Var);
        h hVar2 = this.f5464m;
        hVar2.f5399p.sendMessageDelayed(Message.obtain(hVar2.f5399p, 15, p1Var), this.f5464m.f5384a);
        h hVar3 = this.f5464m;
        hVar3.f5399p.sendMessageDelayed(Message.obtain(hVar3.f5399p, 16, p1Var), this.f5464m.f5385b);
        b bVar = new b(2, (PendingIntent) null);
        if (n(bVar)) {
            return false;
        }
        this.f5464m.h(bVar, this.f5458g);
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0028, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean n(q3.b r4) {
        /*
            r3 = this;
            java.lang.Object r0 = com.google.android.gms.common.api.internal.h.f5382t
            monitor-enter(r0)
            com.google.android.gms.common.api.internal.h r1 = r3.f5464m     // Catch:{ all -> 0x002a }
            com.google.android.gms.common.api.internal.d0 r2 = r1.f5396m     // Catch:{ all -> 0x002a }
            if (r2 == 0) goto L_0x0027
            java.util.Set r1 = r1.f5397n     // Catch:{ all -> 0x002a }
            com.google.android.gms.common.api.internal.c r2 = r3.f5454c     // Catch:{ all -> 0x002a }
            boolean r1 = r1.contains(r2)     // Catch:{ all -> 0x002a }
            if (r1 == 0) goto L_0x0027
            com.google.android.gms.common.api.internal.h r1 = r3.f5464m     // Catch:{ all -> 0x002a }
            com.google.android.gms.common.api.internal.d0 r1 = r1.f5396m     // Catch:{ all -> 0x002a }
            int r2 = r3.f5458g     // Catch:{ all -> 0x002a }
            r1.h(r4, r2)     // Catch:{ all -> 0x002a }
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            r4 = 1
            return r4
        L_0x0027:
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            r4 = 0
            return r4
        L_0x002a:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.n1.n(q3.b):boolean");
    }

    /* access modifiers changed from: private */
    public final boolean o(boolean z10) {
        s.d(this.f5464m.f5399p);
        if (!this.f5453b.isConnected() || this.f5457f.size() != 0) {
            return false;
        }
        if (this.f5455d.g()) {
            if (z10) {
                j();
            }
            return false;
        }
        this.f5453b.disconnect("Timing out service connection.");
        return true;
    }

    static /* bridge */ /* synthetic */ void y(n1 n1Var, p1 p1Var) {
        if (!n1Var.f5461j.contains(p1Var) || n1Var.f5460i) {
            return;
        }
        if (!n1Var.f5453b.isConnected()) {
            n1Var.B();
        } else {
            n1Var.g();
        }
    }

    static /* bridge */ /* synthetic */ void z(n1 n1Var, p1 p1Var) {
        q3.d[] g10;
        if (n1Var.f5461j.remove(p1Var)) {
            n1Var.f5464m.f5399p.removeMessages(15, p1Var);
            n1Var.f5464m.f5399p.removeMessages(16, p1Var);
            q3.d a10 = p1Var.f5474b;
            ArrayList arrayList = new ArrayList(n1Var.f5452a.size());
            for (r2 r2Var : n1Var.f5452a) {
                if ((r2Var instanceof x1) && (g10 = ((x1) r2Var).g(n1Var)) != null && y3.b.c(g10, a10)) {
                    arrayList.add(r2Var);
                }
            }
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                r2 r2Var2 = (r2) arrayList.get(i10);
                n1Var.f5452a.remove(r2Var2);
                r2Var2.b(new l(a10));
            }
        }
    }

    public final void A() {
        s.d(this.f5464m.f5399p);
        this.f5462k = null;
    }

    public final void B() {
        b bVar;
        s.d(this.f5464m.f5399p);
        if (!this.f5453b.isConnected() && !this.f5453b.isConnecting()) {
            try {
                h hVar = this.f5464m;
                int b10 = hVar.f5392i.b(hVar.f5390g, this.f5453b);
                if (b10 != 0) {
                    b bVar2 = new b(b10, (PendingIntent) null);
                    String name = this.f5453b.getClass().getName();
                    String obj = bVar2.toString();
                    StringBuilder sb2 = new StringBuilder(name.length() + 35 + obj.length());
                    sb2.append("The service for ");
                    sb2.append(name);
                    sb2.append(" is not available: ");
                    sb2.append(obj);
                    Log.w("GoogleApiManager", sb2.toString());
                    E(bVar2, (Exception) null);
                    return;
                }
                h hVar2 = this.f5464m;
                a.f fVar = this.f5453b;
                r1 r1Var = new r1(hVar2, fVar, this.f5454c);
                if (fVar.requiresSignIn()) {
                    ((g2) s.k(this.f5459h)).a0(r1Var);
                }
                try {
                    this.f5453b.connect(r1Var);
                } catch (SecurityException e10) {
                    e = e10;
                    bVar = new b(10);
                    E(bVar, e);
                }
            } catch (IllegalStateException e11) {
                e = e11;
                bVar = new b(10);
                E(bVar, e);
            }
        }
    }

    public final void C(r2 r2Var) {
        s.d(this.f5464m.f5399p);
        if (!this.f5453b.isConnected()) {
            this.f5452a.add(r2Var);
            b bVar = this.f5462k;
            if (bVar == null || !bVar.X()) {
                B();
            } else {
                E(this.f5462k, (Exception) null);
            }
        } else if (m(r2Var)) {
            j();
        } else {
            this.f5452a.add(r2Var);
        }
    }

    /* access modifiers changed from: package-private */
    public final void D() {
        this.f5463l++;
    }

    public final void E(b bVar, Exception exc) {
        s.d(this.f5464m.f5399p);
        g2 g2Var = this.f5459h;
        if (g2Var != null) {
            g2Var.b0();
        }
        A();
        this.f5464m.f5392i.c();
        d(bVar);
        if ((this.f5453b instanceof e) && bVar.U() != 24) {
            this.f5464m.f5387d = true;
            h hVar = this.f5464m;
            hVar.f5399p.sendMessageDelayed(hVar.f5399p.obtainMessage(19), 300000);
        }
        if (bVar.U() == 4) {
            e(h.f5381s);
        } else if (this.f5452a.isEmpty()) {
            this.f5462k = bVar;
        } else if (exc != null) {
            s.d(this.f5464m.f5399p);
            f((Status) null, exc, false);
        } else if (this.f5464m.f5400q) {
            f(h.i(this.f5454c, bVar), (Exception) null, true);
            if (!this.f5452a.isEmpty() && !n(bVar) && !this.f5464m.h(bVar, this.f5458g)) {
                if (bVar.U() == 18) {
                    this.f5460i = true;
                }
                if (this.f5460i) {
                    h hVar2 = this.f5464m;
                    hVar2.f5399p.sendMessageDelayed(Message.obtain(hVar2.f5399p, 9, this.f5454c), this.f5464m.f5384a);
                    return;
                }
                e(h.i(this.f5454c, bVar));
            }
        } else {
            e(h.i(this.f5454c, bVar));
        }
    }

    public final void F(b bVar) {
        s.d(this.f5464m.f5399p);
        a.f fVar = this.f5453b;
        String name = fVar.getClass().getName();
        String valueOf = String.valueOf(bVar);
        StringBuilder sb2 = new StringBuilder(name.length() + 25 + valueOf.length());
        sb2.append("onSignInFailed for ");
        sb2.append(name);
        sb2.append(" with ");
        sb2.append(valueOf);
        fVar.disconnect(sb2.toString());
        E(bVar, (Exception) null);
    }

    public final void G() {
        s.d(this.f5464m.f5399p);
        if (this.f5460i) {
            B();
        }
    }

    public final void H() {
        s.d(this.f5464m.f5399p);
        e(h.f5380r);
        this.f5455d.f();
        for (l.a q2Var : (l.a[]) this.f5457f.keySet().toArray(new l.a[0])) {
            C(new q2(q2Var, new j()));
        }
        d(new b(4));
        if (this.f5453b.isConnected()) {
            this.f5453b.onUserSignOut(new m1(this));
        }
    }

    public final void I() {
        s.d(this.f5464m.f5399p);
        if (this.f5460i) {
            l();
            h hVar = this.f5464m;
            e(hVar.f5391h.i(hVar.f5390g) == 18 ? new Status(21, "Connection timed out waiting for Google Play services update to complete.") : new Status(22, "API failed to connect while resuming due to an unknown error."));
            this.f5453b.disconnect("Timing out connection while resuming.");
        }
    }

    public final boolean K() {
        return this.f5453b.requiresSignIn();
    }

    public final boolean a() {
        return o(true);
    }

    public final void c(b bVar, a aVar, boolean z10) {
        throw null;
    }

    public final void onConnected(Bundle bundle) {
        if (Looper.myLooper() == this.f5464m.f5399p.getLooper()) {
            h();
        } else {
            this.f5464m.f5399p.post(new j1(this));
        }
    }

    public final void onConnectionFailed(b bVar) {
        E(bVar, (Exception) null);
    }

    public final void onConnectionSuspended(int i10) {
        if (Looper.myLooper() == this.f5464m.f5399p.getLooper()) {
            i(i10);
        } else {
            this.f5464m.f5399p.post(new k1(this, i10));
        }
    }

    public final int p() {
        return this.f5458g;
    }

    /* access modifiers changed from: package-private */
    public final int q() {
        return this.f5463l;
    }

    public final a.f s() {
        return this.f5453b;
    }

    public final Map u() {
        return this.f5457f;
    }
}
