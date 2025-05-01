package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.support.v4.media.session.b;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.j;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.internal.s;
import java.lang.ref.WeakReference;

public final class l2 extends k implements i {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public l2 f5439a = null;

    /* renamed from: b  reason: collision with root package name */
    private PendingResult f5440b = null;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final Object f5441c = new Object();

    /* renamed from: d  reason: collision with root package name */
    private Status f5442d = null;

    /* renamed from: e  reason: collision with root package name */
    private final WeakReference f5443e;

    /* renamed from: f  reason: collision with root package name */
    private final j2 f5444f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f5445g = false;

    public l2(WeakReference weakReference) {
        s.l(weakReference, "GoogleApiClient reference must not be null");
        this.f5443e = weakReference;
        GoogleApiClient googleApiClient = (GoogleApiClient) weakReference.get();
        this.f5444f = new j2(this, googleApiClient != null ? googleApiClient.k() : Looper.getMainLooper());
    }

    /* access modifiers changed from: private */
    public final void h(Status status) {
        synchronized (this.f5441c) {
            this.f5442d = status;
            j(status);
        }
    }

    private final void i() {
    }

    private final void j(Status status) {
        synchronized (this.f5441c) {
            if (k()) {
                b.a(s.k((Object) null));
                throw null;
            }
        }
    }

    private final boolean k() {
        GoogleApiClient googleApiClient = (GoogleApiClient) this.f5443e.get();
        return false;
    }

    private static final void l(h hVar) {
    }

    public final void a(h hVar) {
        synchronized (this.f5441c) {
            if (!hVar.getStatus().j0()) {
                h(hVar.getStatus());
                l(hVar);
            } else if (k()) {
                b.a(s.k((Object) null));
                throw null;
            }
        }
    }

    public final k b(j jVar) {
        l2 l2Var;
        synchronized (this.f5441c) {
            s.o(true, "Cannot call then() twice.");
            s.o(true, "Cannot call then() and andFinally() on the same TransformedResult.");
            l2Var = new l2(this.f5443e);
            this.f5439a = l2Var;
            i();
        }
        return l2Var;
    }

    /* access modifiers changed from: package-private */
    public final void f() {
    }

    public final void g(PendingResult pendingResult) {
        synchronized (this.f5441c) {
            this.f5440b = pendingResult;
            i();
        }
    }
}
