package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.internal.base.zal;
import com.google.android.gms.internal.base.zaq;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import q3.b;
import q3.k;

final class z implements y1 {

    /* renamed from: a  reason: collision with root package name */
    private final Context f5541a;

    /* renamed from: b  reason: collision with root package name */
    private final b1 f5542b;

    /* renamed from: c  reason: collision with root package name */
    private final Looper f5543c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final f1 f5544d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final f1 f5545e;

    /* renamed from: f  reason: collision with root package name */
    private final Map f5546f;

    /* renamed from: g  reason: collision with root package name */
    private final Set f5547g = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: h  reason: collision with root package name */
    private final a.f f5548h;

    /* renamed from: i  reason: collision with root package name */
    private Bundle f5549i;
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public b f5550j = null;
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public b f5551k = null;
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public boolean f5552l = false;
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public final Lock f5553m;

    /* renamed from: n  reason: collision with root package name */
    private int f5554n = 0;

    private z(Context context, b1 b1Var, Lock lock, Looper looper, k kVar, Map map, Map map2, d dVar, a.C0085a aVar, a.f fVar, ArrayList arrayList, ArrayList arrayList2, Map map3, Map map4) {
        this.f5541a = context;
        this.f5542b = b1Var;
        this.f5553m = lock;
        this.f5543c = looper;
        this.f5548h = fVar;
        Context context2 = context;
        b1 b1Var2 = b1Var;
        Lock lock2 = lock;
        Looper looper2 = looper;
        k kVar2 = kVar;
        f1 f1Var = r3;
        f1 f1Var2 = new f1(context2, b1Var2, lock2, looper2, kVar2, map2, (d) null, map4, (a.C0085a) null, arrayList2, new e3(this, (d3) null));
        this.f5544d = f1Var;
        this.f5545e = new f1(context2, b1Var2, lock2, looper2, kVar2, map, dVar, map3, aVar, arrayList, new g3(this, (f3) null));
        androidx.collection.a aVar2 = new androidx.collection.a();
        for (a.c put : map2.keySet()) {
            aVar2.put(put, this.f5544d);
        }
        for (a.c put2 : map.keySet()) {
            aVar2.put(put2, this.f5545e);
        }
        this.f5546f = Collections.unmodifiableMap(aVar2);
    }

    private final PendingIntent B() {
        if (this.f5548h == null) {
            return null;
        }
        return zal.zaa(this.f5541a, System.identityHashCode(this.f5542b), this.f5548h.getSignInIntent(), zal.zaa | 134217728);
    }

    private final void c(b bVar) {
        int i10 = this.f5554n;
        if (i10 != 1) {
            if (i10 != 2) {
                Log.wtf("CompositeGAC", "Attempted to call failure callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new Exception());
                this.f5554n = 0;
            }
            this.f5542b.a(bVar);
        }
        k();
        this.f5554n = 0;
    }

    private final void k() {
        for (s a10 : this.f5547g) {
            a10.a();
        }
        this.f5547g.clear();
    }

    private final boolean l() {
        b bVar = this.f5551k;
        return bVar != null && bVar.U() == 4;
    }

    private final boolean m(e eVar) {
        f1 f1Var = (f1) this.f5546f.get(eVar.getClientKey());
        s.l(f1Var, "GoogleApiClient is not configured to use the API required for this call.");
        return f1Var.equals(this.f5545e);
    }

    private static boolean n(b bVar) {
        return bVar != null && bVar.j0();
    }

    public static z p(Context context, b1 b1Var, Lock lock, Looper looper, k kVar, Map map, d dVar, Map map2, a.C0085a aVar, ArrayList arrayList) {
        Map map3 = map2;
        androidx.collection.a aVar2 = new androidx.collection.a();
        androidx.collection.a aVar3 = new androidx.collection.a();
        a.f fVar = null;
        for (Map.Entry entry : map.entrySet()) {
            a.f fVar2 = (a.f) entry.getValue();
            if (true == fVar2.providesSignIn()) {
                fVar = fVar2;
            }
            boolean requiresSignIn = fVar2.requiresSignIn();
            a.c cVar = (a.c) entry.getKey();
            if (requiresSignIn) {
                aVar2.put(cVar, fVar2);
            } else {
                aVar3.put(cVar, fVar2);
            }
        }
        s.o(!aVar2.isEmpty(), "CompositeGoogleApiClient should not be used without any APIs that require sign-in.");
        androidx.collection.a aVar4 = new androidx.collection.a();
        androidx.collection.a aVar5 = new androidx.collection.a();
        for (a aVar6 : map2.keySet()) {
            a.c b10 = aVar6.b();
            if (aVar2.containsKey(b10)) {
                aVar4.put(aVar6, (Boolean) map3.get(aVar6));
            } else if (aVar3.containsKey(b10)) {
                aVar5.put(aVar6, (Boolean) map3.get(aVar6));
            } else {
                throw new IllegalStateException("Each API in the isOptionalMap must have a corresponding client in the clients map.");
            }
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            a3 a3Var = (a3) arrayList.get(i10);
            if (aVar4.containsKey(a3Var.f5298a)) {
                arrayList2.add(a3Var);
            } else if (aVar5.containsKey(a3Var.f5298a)) {
                arrayList3.add(a3Var);
            } else {
                throw new IllegalStateException("Each ClientCallbacks must have a corresponding API in the isOptionalMap");
            }
        }
        return new z(context, b1Var, lock, looper, kVar, aVar2, aVar3, dVar, aVar, fVar, arrayList2, arrayList3, aVar4, aVar5);
    }

    static /* bridge */ /* synthetic */ void w(z zVar, int i10, boolean z10) {
        zVar.f5542b.c(i10, z10);
        zVar.f5551k = null;
        zVar.f5550j = null;
    }

    static /* bridge */ /* synthetic */ void x(z zVar, Bundle bundle) {
        Bundle bundle2 = zVar.f5549i;
        if (bundle2 == null) {
            zVar.f5549i = bundle;
        } else if (bundle != null) {
            bundle2.putAll(bundle);
        }
    }

    static /* bridge */ /* synthetic */ void y(z zVar) {
        b bVar;
        if (n(zVar.f5550j)) {
            if (n(zVar.f5551k) || zVar.l()) {
                int i10 = zVar.f5554n;
                if (i10 != 1) {
                    if (i10 != 2) {
                        Log.wtf("CompositeGAC", "Attempted to call success callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new AssertionError());
                        zVar.f5554n = 0;
                        return;
                    }
                    ((b1) s.k(zVar.f5542b)).b(zVar.f5549i);
                }
                zVar.k();
                zVar.f5554n = 0;
                return;
            }
            b bVar2 = zVar.f5551k;
            if (bVar2 == null) {
                return;
            }
            if (zVar.f5554n == 1) {
                zVar.k();
                return;
            }
            zVar.c(bVar2);
            zVar.f5544d.e();
        } else if (zVar.f5550j == null || !n(zVar.f5551k)) {
            b bVar3 = zVar.f5550j;
            if (bVar3 != null && (bVar = zVar.f5551k) != null) {
                if (zVar.f5545e.f5366m < zVar.f5544d.f5366m) {
                    bVar3 = bVar;
                }
                zVar.c(bVar3);
            }
        } else {
            zVar.f5545e.e();
            zVar.c((b) s.k(zVar.f5550j));
        }
    }

    public final boolean A() {
        this.f5553m.lock();
        try {
            return this.f5554n == 2;
        } finally {
            this.f5553m.unlock();
        }
    }

    public final void a() {
        this.f5553m.lock();
        try {
            boolean A = A();
            this.f5545e.e();
            this.f5551k = new b(4);
            if (A) {
                new zaq(this.f5543c).post(new c3(this));
            } else {
                k();
            }
        } finally {
            this.f5553m.unlock();
        }
    }

    public final b b(long j10, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    public final void d() {
        this.f5554n = 2;
        this.f5552l = false;
        this.f5551k = null;
        this.f5550j = null;
        this.f5544d.d();
        this.f5545e.d();
    }

    public final void e() {
        this.f5551k = null;
        this.f5550j = null;
        this.f5554n = 0;
        this.f5544d.e();
        this.f5545e.e();
        k();
    }

    public final e f(e eVar) {
        if (!m(eVar)) {
            this.f5544d.f(eVar);
            return eVar;
        } else if (l()) {
            eVar.setFailedResult(new Status(4, (String) null, B()));
            return eVar;
        } else {
            this.f5545e.f(eVar);
            return eVar;
        }
    }

    public final boolean g(s sVar) {
        this.f5553m.lock();
        try {
            if ((A() || i()) && !this.f5545e.i()) {
                this.f5547g.add(sVar);
                if (this.f5554n == 0) {
                    this.f5554n = 1;
                }
                this.f5551k = null;
                this.f5545e.d();
                return true;
            }
            this.f5553m.unlock();
            return false;
        } finally {
            this.f5553m.unlock();
        }
    }

    public final void h(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append(str).append("authClient").println(":");
        this.f5545e.h(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
        printWriter.append(str).append("anonClient").println(":");
        this.f5544d.h(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
    }

    public final boolean i() {
        this.f5553m.lock();
        try {
            boolean z10 = false;
            if (this.f5544d.i() && (this.f5545e.i() || l() || this.f5554n == 1)) {
                z10 = true;
            }
            return z10;
        } finally {
            this.f5553m.unlock();
        }
    }

    public final e j(e eVar) {
        if (!m(eVar)) {
            return this.f5544d.j(eVar);
        }
        if (!l()) {
            return this.f5545e.j(eVar);
        }
        eVar.setFailedResult(new Status(4, (String) null, B()));
        return eVar;
    }
}
