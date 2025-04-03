package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.s;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import q3.b;
import q3.k;

public final class f1 implements y1, b3 {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final Lock f5354a;

    /* renamed from: b  reason: collision with root package name */
    private final Condition f5355b;

    /* renamed from: c  reason: collision with root package name */
    private final Context f5356c;

    /* renamed from: d  reason: collision with root package name */
    private final k f5357d;

    /* renamed from: e  reason: collision with root package name */
    private final e1 f5358e;

    /* renamed from: f  reason: collision with root package name */
    final Map f5359f;

    /* renamed from: g  reason: collision with root package name */
    final Map f5360g = new HashMap();

    /* renamed from: h  reason: collision with root package name */
    final d f5361h;

    /* renamed from: i  reason: collision with root package name */
    final Map f5362i;

    /* renamed from: j  reason: collision with root package name */
    final a.C0085a f5363j;
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public volatile c1 f5364k;

    /* renamed from: l  reason: collision with root package name */
    private b f5365l = null;

    /* renamed from: m  reason: collision with root package name */
    int f5366m;

    /* renamed from: n  reason: collision with root package name */
    final b1 f5367n;

    /* renamed from: o  reason: collision with root package name */
    final w1 f5368o;

    public f1(Context context, b1 b1Var, Lock lock, Looper looper, k kVar, Map map, d dVar, Map map2, a.C0085a aVar, ArrayList arrayList, w1 w1Var) {
        this.f5356c = context;
        this.f5354a = lock;
        this.f5357d = kVar;
        this.f5359f = map;
        this.f5361h = dVar;
        this.f5362i = map2;
        this.f5363j = aVar;
        this.f5367n = b1Var;
        this.f5368o = w1Var;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((a3) arrayList.get(i10)).a(this);
        }
        this.f5358e = new e1(this, looper);
        this.f5355b = lock.newCondition();
        this.f5364k = new w0(this);
    }

    public final void a() {
    }

    public final b b(long j10, TimeUnit timeUnit) {
        d();
        long nanos = timeUnit.toNanos(j10);
        while (this.f5364k instanceof v0) {
            if (nanos <= 0) {
                try {
                    e();
                    return new b(14, (PendingIntent) null);
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    return new b(15, (PendingIntent) null);
                }
            } else {
                nanos = this.f5355b.awaitNanos(nanos);
            }
        }
        if (this.f5364k instanceof i0) {
            return b.f14642i;
        }
        b bVar = this.f5365l;
        return bVar != null ? bVar : new b(13, (PendingIntent) null);
    }

    public final void c(b bVar, a aVar, boolean z10) {
        this.f5354a.lock();
        try {
            this.f5364k.e(bVar, aVar, z10);
        } finally {
            this.f5354a.unlock();
        }
    }

    public final void d() {
        this.f5364k.d();
    }

    public final void e() {
        if (this.f5364k.g()) {
            this.f5360g.clear();
        }
    }

    public final e f(e eVar) {
        eVar.zak();
        this.f5364k.f(eVar);
        return eVar;
    }

    public final boolean g(s sVar) {
        return false;
    }

    public final void h(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String concat = String.valueOf(str).concat("  ");
        printWriter.append(str).append("mState=").println(this.f5364k);
        for (a aVar : this.f5362i.keySet()) {
            printWriter.append(str).append(aVar.d()).println(":");
            ((a.f) s.k((a.f) this.f5359f.get(aVar.b()))).dump(concat, fileDescriptor, printWriter, strArr);
        }
    }

    public final boolean i() {
        return this.f5364k instanceof i0;
    }

    public final e j(e eVar) {
        eVar.zak();
        return this.f5364k.h(eVar);
    }

    /* access modifiers changed from: package-private */
    public final void m() {
        this.f5354a.lock();
        try {
            this.f5367n.w();
            this.f5364k = new i0(this);
            this.f5364k.c();
            this.f5355b.signalAll();
        } finally {
            this.f5354a.unlock();
        }
    }

    /* access modifiers changed from: package-private */
    public final void n() {
        this.f5354a.lock();
        try {
            this.f5364k = new v0(this, this.f5361h, this.f5362i, this.f5357d, this.f5363j, this.f5354a, this.f5356c);
            this.f5364k.c();
            this.f5355b.signalAll();
        } finally {
            this.f5354a.unlock();
        }
    }

    /* access modifiers changed from: package-private */
    public final void o(b bVar) {
        this.f5354a.lock();
        try {
            this.f5365l = bVar;
            this.f5364k = new w0(this);
            this.f5364k.c();
            this.f5355b.signalAll();
        } finally {
            this.f5354a.unlock();
        }
    }

    public final void onConnected(Bundle bundle) {
        this.f5354a.lock();
        try {
            this.f5364k.a(bundle);
        } finally {
            this.f5354a.unlock();
        }
    }

    public final void onConnectionSuspended(int i10) {
        this.f5354a.lock();
        try {
            this.f5364k.b(i10);
        } finally {
            this.f5354a.unlock();
        }
    }

    /* access modifiers changed from: package-private */
    public final void p(d1 d1Var) {
        this.f5358e.sendMessage(this.f5358e.obtainMessage(1, d1Var));
    }

    /* access modifiers changed from: package-private */
    public final void q(RuntimeException runtimeException) {
        this.f5358e.sendMessage(this.f5358e.obtainMessage(2, runtimeException));
    }
}
