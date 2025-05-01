package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.s;
import h4.d;
import java.util.concurrent.atomic.AtomicReference;

final class z6 implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ AtomicReference f6683e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ i9 f6684f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ v7 f6685g;

    z6(v7 v7Var, AtomicReference atomicReference, i9 i9Var) {
        this.f6685g = v7Var;
        this.f6683e = atomicReference;
        this.f6684f = i9Var;
    }

    public final void run() {
        AtomicReference atomicReference;
        synchronized (this.f6683e) {
            try {
                if (!this.f6685g.f5994a.F().q().k()) {
                    this.f6685g.f5994a.d().x().a("Analytics storage consent denied; will not get app instance id");
                    this.f6685g.f5994a.I().B((String) null);
                    this.f6685g.f5994a.F().f6521g.b((String) null);
                    this.f6683e.set((Object) null);
                    this.f6683e.notify();
                    return;
                }
                d H = this.f6685g.f6501d;
                if (H == null) {
                    this.f6685g.f5994a.d().r().a("Failed to get app instance id");
                    this.f6683e.notify();
                    return;
                }
                s.k(this.f6684f);
                this.f6683e.set(H.o(this.f6684f));
                String str = (String) this.f6683e.get();
                if (str != null) {
                    this.f6685g.f5994a.I().B(str);
                    this.f6685g.f5994a.F().f6521g.b(str);
                }
                this.f6685g.E();
                atomicReference = this.f6683e;
                atomicReference.notify();
            } catch (RemoteException e10) {
                try {
                    this.f6685g.f5994a.d().r().b("Failed to get app instance id", e10);
                    atomicReference = this.f6683e;
                } catch (Throwable th) {
                    this.f6683e.notify();
                    throw th;
                }
            }
        }
    }
}
