package com.google.android.gms.common.api.internal;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import androidx.collection.b;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.d;
import com.google.android.gms.common.api.internal.l;
import com.google.android.gms.common.internal.m0;
import com.google.android.gms.common.internal.p;
import com.google.android.gms.common.internal.t;
import com.google.android.gms.common.internal.u;
import com.google.android.gms.common.internal.w;
import com.google.android.gms.common.internal.x;
import com.google.android.gms.common.internal.y;
import com.google.android.gms.internal.base.zaq;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import q3.j;
import y3.i;

public class h implements Handler.Callback {

    /* renamed from: r  reason: collision with root package name */
    public static final Status f5380r = new Status(4, "Sign-out occurred while this API call was in progress.");
    /* access modifiers changed from: private */

    /* renamed from: s  reason: collision with root package name */
    public static final Status f5381s = new Status(4, "The user must be signed in to make this API call.");
    /* access modifiers changed from: private */

    /* renamed from: t  reason: collision with root package name */
    public static final Object f5382t = new Object();

    /* renamed from: u  reason: collision with root package name */
    private static h f5383u;
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public long f5384a = 5000;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public long f5385b = 120000;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public long f5386c = 10000;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public boolean f5387d = false;

    /* renamed from: e  reason: collision with root package name */
    private w f5388e;

    /* renamed from: f  reason: collision with root package name */
    private y f5389f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public final Context f5390g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public final j f5391h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public final m0 f5392i;

    /* renamed from: j  reason: collision with root package name */
    private final AtomicInteger f5393j = new AtomicInteger(1);

    /* renamed from: k  reason: collision with root package name */
    private final AtomicInteger f5394k = new AtomicInteger(0);
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public final Map f5395l = new ConcurrentHashMap(5, 0.75f, 1);
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public d0 f5396m = null;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public final Set f5397n = new b();

    /* renamed from: o  reason: collision with root package name */
    private final Set f5398o = new b();
    /* access modifiers changed from: private */

    /* renamed from: p  reason: collision with root package name */
    public final Handler f5399p;
    /* access modifiers changed from: private */

    /* renamed from: q  reason: collision with root package name */
    public volatile boolean f5400q = true;

    private h(Context context, Looper looper, j jVar) {
        this.f5390g = context;
        zaq zaq = new zaq(looper, this);
        this.f5399p = zaq;
        this.f5391h = jVar;
        this.f5392i = new m0(jVar);
        if (i.a(context)) {
            this.f5400q = false;
        }
        zaq.sendMessage(zaq.obtainMessage(6));
    }

    public static void a() {
        synchronized (f5382t) {
            h hVar = f5383u;
            if (hVar != null) {
                hVar.f5394k.incrementAndGet();
                Handler handler = hVar.f5399p;
                handler.sendMessageAtFrontOfQueue(handler.obtainMessage(10));
            }
        }
    }

    /* access modifiers changed from: private */
    public static Status i(c cVar, q3.b bVar) {
        String b10 = cVar.b();
        String valueOf = String.valueOf(bVar);
        StringBuilder sb2 = new StringBuilder(String.valueOf(b10).length() + 63 + valueOf.length());
        sb2.append("API: ");
        sb2.append(b10);
        sb2.append(" is not available on this device. Connection failed with: ");
        sb2.append(valueOf);
        return new Status(bVar, sb2.toString());
    }

    private final n1 j(d dVar) {
        c apiKey = dVar.getApiKey();
        n1 n1Var = (n1) this.f5395l.get(apiKey);
        if (n1Var == null) {
            n1Var = new n1(this, dVar);
            this.f5395l.put(apiKey, n1Var);
        }
        if (n1Var.K()) {
            this.f5398o.add(apiKey);
        }
        n1Var.B();
        return n1Var;
    }

    private final y k() {
        if (this.f5389f == null) {
            this.f5389f = x.a(this.f5390g);
        }
        return this.f5389f;
    }

    private final void l() {
        w wVar = this.f5388e;
        if (wVar != null) {
            if (wVar.U() > 0 || g()) {
                k().a(wVar);
            }
            this.f5388e = null;
        }
    }

    private final void m(n4.j jVar, int i10, d dVar) {
        z1 b10;
        if (i10 != 0 && (b10 = z1.b(this, i10, dVar.getApiKey())) != null) {
            n4.i a10 = jVar.a();
            Handler handler = this.f5399p;
            handler.getClass();
            a10.addOnCompleteListener((Executor) new h1(handler), (n4.d) b10);
        }
    }

    public static h y(Context context) {
        h hVar;
        synchronized (f5382t) {
            if (f5383u == null) {
                f5383u = new h(context.getApplicationContext(), com.google.android.gms.common.internal.i.b().getLooper(), j.q());
            }
            hVar = f5383u;
        }
        return hVar;
    }

    public final n4.i A(d dVar) {
        e0 e0Var = new e0(dVar.getApiKey());
        Handler handler = this.f5399p;
        handler.sendMessage(handler.obtainMessage(14, e0Var));
        return e0Var.b().a();
    }

    public final n4.i B(d dVar, l.a aVar, int i10) {
        n4.j jVar = new n4.j();
        m(jVar, i10, dVar);
        q2 q2Var = new q2(aVar, jVar);
        Handler handler = this.f5399p;
        handler.sendMessage(handler.obtainMessage(13, new b2(q2Var, this.f5394k.get(), dVar)));
        return jVar.a();
    }

    public final void G(d dVar, int i10, e eVar) {
        o2 o2Var = new o2(i10, eVar);
        Handler handler = this.f5399p;
        handler.sendMessage(handler.obtainMessage(4, new b2(o2Var, this.f5394k.get(), dVar)));
    }

    public final void H(d dVar, int i10, v vVar, n4.j jVar, t tVar) {
        m(jVar, vVar.d(), dVar);
        p2 p2Var = new p2(i10, vVar, jVar, tVar);
        Handler handler = this.f5399p;
        handler.sendMessage(handler.obtainMessage(4, new b2(p2Var, this.f5394k.get(), dVar)));
    }

    /* access modifiers changed from: package-private */
    public final void I(p pVar, int i10, long j10, int i11) {
        Handler handler = this.f5399p;
        handler.sendMessage(handler.obtainMessage(18, new a2(pVar, i10, j10, i11)));
    }

    public final void J(q3.b bVar, int i10) {
        if (!h(bVar, i10)) {
            Handler handler = this.f5399p;
            handler.sendMessage(handler.obtainMessage(5, i10, 0, bVar));
        }
    }

    public final void b() {
        Handler handler = this.f5399p;
        handler.sendMessage(handler.obtainMessage(3));
    }

    public final void c(d dVar) {
        Handler handler = this.f5399p;
        handler.sendMessage(handler.obtainMessage(7, dVar));
    }

    public final void d(d0 d0Var) {
        synchronized (f5382t) {
            if (this.f5396m != d0Var) {
                this.f5396m = d0Var;
                this.f5397n.clear();
            }
            this.f5397n.addAll(d0Var.i());
        }
    }

    /* access modifiers changed from: package-private */
    public final void e(d0 d0Var) {
        synchronized (f5382t) {
            if (this.f5396m == d0Var) {
                this.f5396m = null;
                this.f5397n.clear();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean g() {
        if (this.f5387d) {
            return false;
        }
        u a10 = t.b().a();
        if (a10 != null && !a10.W()) {
            return false;
        }
        int a11 = this.f5392i.a(this.f5390g, 203400000);
        return a11 == -1 || a11 == 0;
    }

    /* access modifiers changed from: package-private */
    public final boolean h(q3.b bVar, int i10) {
        return this.f5391h.A(this.f5390g, bVar, i10);
    }

    public final boolean handleMessage(Message message) {
        n4.j jVar;
        Boolean bool;
        int i10 = message.what;
        long j10 = 300000;
        n1 n1Var = null;
        switch (i10) {
            case 1:
                if (true == ((Boolean) message.obj).booleanValue()) {
                    j10 = 10000;
                }
                this.f5386c = j10;
                this.f5399p.removeMessages(12);
                for (c obtainMessage : this.f5395l.keySet()) {
                    Handler handler = this.f5399p;
                    handler.sendMessageDelayed(handler.obtainMessage(12, obtainMessage), this.f5386c);
                }
                break;
            case 2:
                android.support.v4.media.session.b.a(message.obj);
                throw null;
            case 3:
                for (n1 n1Var2 : this.f5395l.values()) {
                    n1Var2.A();
                    n1Var2.B();
                }
                break;
            case 4:
            case 8:
            case 13:
                b2 b2Var = (b2) message.obj;
                n1 n1Var3 = (n1) this.f5395l.get(b2Var.f5329c.getApiKey());
                if (n1Var3 == null) {
                    n1Var3 = j(b2Var.f5329c);
                }
                if (n1Var3.K() && this.f5394k.get() != b2Var.f5328b) {
                    b2Var.f5327a.a(f5380r);
                    n1Var3.H();
                    break;
                } else {
                    n1Var3.C(b2Var.f5327a);
                    break;
                }
            case 5:
                int i11 = message.arg1;
                q3.b bVar = (q3.b) message.obj;
                Iterator it = this.f5395l.values().iterator();
                while (true) {
                    if (it.hasNext()) {
                        n1 n1Var4 = (n1) it.next();
                        if (n1Var4.p() == i11) {
                            n1Var = n1Var4;
                        }
                    }
                }
                if (n1Var != null) {
                    if (bVar.U() != 13) {
                        n1Var.e(i(n1Var.f5454c, bVar));
                        break;
                    } else {
                        String g10 = this.f5391h.g(bVar.U());
                        String V = bVar.V();
                        StringBuilder sb2 = new StringBuilder(String.valueOf(g10).length() + 69 + String.valueOf(V).length());
                        sb2.append("Error resolution was canceled by the user, original error message: ");
                        sb2.append(g10);
                        sb2.append(": ");
                        sb2.append(V);
                        n1Var.e(new Status(17, sb2.toString()));
                        break;
                    }
                } else {
                    StringBuilder sb3 = new StringBuilder(76);
                    sb3.append("Could not find API instance ");
                    sb3.append(i11);
                    sb3.append(" while trying to fail enqueued calls.");
                    Log.wtf("GoogleApiManager", sb3.toString(), new Exception());
                    break;
                }
            case 6:
                if (this.f5390g.getApplicationContext() instanceof Application) {
                    d.c((Application) this.f5390g.getApplicationContext());
                    d.b().a(new i1(this));
                    if (!d.b().e(true)) {
                        this.f5386c = 300000;
                        break;
                    }
                }
                break;
            case 7:
                j((d) message.obj);
                break;
            case 9:
                if (this.f5395l.containsKey(message.obj)) {
                    ((n1) this.f5395l.get(message.obj)).G();
                    break;
                }
                break;
            case 10:
                for (c remove : this.f5398o) {
                    n1 n1Var5 = (n1) this.f5395l.remove(remove);
                    if (n1Var5 != null) {
                        n1Var5.H();
                    }
                }
                this.f5398o.clear();
                break;
            case 11:
                if (this.f5395l.containsKey(message.obj)) {
                    ((n1) this.f5395l.get(message.obj)).I();
                    break;
                }
                break;
            case 12:
                if (this.f5395l.containsKey(message.obj)) {
                    ((n1) this.f5395l.get(message.obj)).a();
                    break;
                }
                break;
            case 14:
                e0 e0Var = (e0) message.obj;
                c a10 = e0Var.a();
                if (!this.f5395l.containsKey(a10)) {
                    jVar = e0Var.b();
                    bool = Boolean.FALSE;
                } else {
                    boolean J = ((n1) this.f5395l.get(a10)).o(false);
                    jVar = e0Var.b();
                    bool = Boolean.valueOf(J);
                }
                jVar.c(bool);
                break;
            case 15:
                p1 p1Var = (p1) message.obj;
                if (this.f5395l.containsKey(p1Var.f5473a)) {
                    n1.y((n1) this.f5395l.get(p1Var.f5473a), p1Var);
                    break;
                }
                break;
            case 16:
                p1 p1Var2 = (p1) message.obj;
                if (this.f5395l.containsKey(p1Var2.f5473a)) {
                    n1.z((n1) this.f5395l.get(p1Var2.f5473a), p1Var2);
                    break;
                }
                break;
            case 17:
                l();
                break;
            case 18:
                a2 a2Var = (a2) message.obj;
                if (a2Var.f5296c != 0) {
                    w wVar = this.f5388e;
                    if (wVar != null) {
                        List V2 = wVar.V();
                        if (wVar.U() != a2Var.f5295b || (V2 != null && V2.size() >= a2Var.f5297d)) {
                            this.f5399p.removeMessages(17);
                            l();
                        } else {
                            this.f5388e.W(a2Var.f5294a);
                        }
                    }
                    if (this.f5388e == null) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(a2Var.f5294a);
                        this.f5388e = new w(a2Var.f5295b, arrayList);
                        Handler handler2 = this.f5399p;
                        handler2.sendMessageDelayed(handler2.obtainMessage(17), a2Var.f5296c);
                        break;
                    }
                } else {
                    k().a(new w(a2Var.f5295b, Arrays.asList(new p[]{a2Var.f5294a})));
                    break;
                }
                break;
            case 19:
                this.f5387d = false;
                break;
            default:
                StringBuilder sb4 = new StringBuilder(31);
                sb4.append("Unknown message id: ");
                sb4.append(i10);
                Log.w("GoogleApiManager", sb4.toString());
                return false;
        }
        return true;
    }

    public final int n() {
        return this.f5393j.getAndIncrement();
    }

    /* access modifiers changed from: package-private */
    public final n1 x(c cVar) {
        return (n1) this.f5395l.get(cVar);
    }
}
