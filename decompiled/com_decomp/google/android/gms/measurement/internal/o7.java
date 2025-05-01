package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.internal.s;
import h4.d;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

final class o7 implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ AtomicReference f6290e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ String f6291f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ String f6292g;

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ i9 f6293h;

    /* renamed from: i  reason: collision with root package name */
    final /* synthetic */ boolean f6294i;

    /* renamed from: j  reason: collision with root package name */
    final /* synthetic */ v7 f6295j;

    o7(v7 v7Var, AtomicReference atomicReference, String str, String str2, String str3, i9 i9Var, boolean z10) {
        this.f6295j = v7Var;
        this.f6290e = atomicReference;
        this.f6291f = str2;
        this.f6292g = str3;
        this.f6293h = i9Var;
        this.f6294i = z10;
    }

    public final void run() {
        AtomicReference atomicReference;
        AtomicReference atomicReference2;
        List i10;
        synchronized (this.f6290e) {
            try {
                d H = this.f6295j.f6501d;
                if (H == null) {
                    this.f6295j.f5994a.d().r().d("(legacy) Failed to get user properties; not connected to service", (Object) null, this.f6291f, this.f6292g);
                    this.f6290e.set(Collections.emptyList());
                    this.f6290e.notify();
                    return;
                }
                if (TextUtils.isEmpty((CharSequence) null)) {
                    s.k(this.f6293h);
                    atomicReference2 = this.f6290e;
                    i10 = H.e(this.f6291f, this.f6292g, this.f6294i, this.f6293h);
                } else {
                    atomicReference2 = this.f6290e;
                    i10 = H.i((String) null, this.f6291f, this.f6292g, this.f6294i);
                }
                atomicReference2.set(i10);
                this.f6295j.E();
                atomicReference = this.f6290e;
                atomicReference.notify();
            } catch (RemoteException e10) {
                try {
                    this.f6295j.f5994a.d().r().d("(legacy) Failed to get user properties; remote exception", (Object) null, this.f6291f, e10);
                    this.f6290e.set(Collections.emptyList());
                    atomicReference = this.f6290e;
                } catch (Throwable th) {
                    this.f6290e.notify();
                    throw th;
                }
            }
        }
    }
}
