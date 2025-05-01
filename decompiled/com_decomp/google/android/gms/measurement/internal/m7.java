package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.internal.s;
import h4.d;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

final class m7 implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ AtomicReference f6209e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ String f6210f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ String f6211g;

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ i9 f6212h;

    /* renamed from: i  reason: collision with root package name */
    final /* synthetic */ v7 f6213i;

    m7(v7 v7Var, AtomicReference atomicReference, String str, String str2, String str3, i9 i9Var) {
        this.f6213i = v7Var;
        this.f6209e = atomicReference;
        this.f6210f = str2;
        this.f6211g = str3;
        this.f6212h = i9Var;
    }

    public final void run() {
        AtomicReference atomicReference;
        AtomicReference atomicReference2;
        List v10;
        synchronized (this.f6209e) {
            try {
                d H = this.f6213i.f6501d;
                if (H == null) {
                    this.f6213i.f5994a.d().r().d("(legacy) Failed to get conditional properties; not connected to service", (Object) null, this.f6210f, this.f6211g);
                    this.f6209e.set(Collections.emptyList());
                    this.f6209e.notify();
                    return;
                }
                if (TextUtils.isEmpty((CharSequence) null)) {
                    s.k(this.f6212h);
                    atomicReference2 = this.f6209e;
                    v10 = H.H(this.f6210f, this.f6211g, this.f6212h);
                } else {
                    atomicReference2 = this.f6209e;
                    v10 = H.v((String) null, this.f6210f, this.f6211g);
                }
                atomicReference2.set(v10);
                this.f6213i.E();
                atomicReference = this.f6209e;
                atomicReference.notify();
            } catch (RemoteException e10) {
                try {
                    this.f6213i.f5994a.d().r().d("(legacy) Failed to get conditional properties; remote exception", (Object) null, this.f6210f, e10);
                    this.f6209e.set(Collections.emptyList());
                    atomicReference = this.f6209e;
                } catch (Throwable th) {
                    this.f6209e.notify();
                    throw th;
                }
            }
        }
    }
}
