package com.google.android.gms.common.api.internal;

import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.s;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import q3.b;
import q3.j;

public final class t2 extends x2 {

    /* renamed from: i  reason: collision with root package name */
    private final SparseArray f5495i = new SparseArray();

    private t2(k kVar) {
        super(kVar, j.q());
        this.mLifecycleFragment.a("AutoManageHelper", this);
    }

    public static t2 i(j jVar) {
        k fragment = LifecycleCallback.getFragment(jVar);
        t2 t2Var = (t2) fragment.b("AutoManageHelper", t2.class);
        return t2Var != null ? t2Var : new t2(fragment);
    }

    private final s2 l(int i10) {
        if (this.f5495i.size() <= i10) {
            return null;
        }
        SparseArray sparseArray = this.f5495i;
        return (s2) sparseArray.get(sparseArray.keyAt(i10));
    }

    /* access modifiers changed from: protected */
    public final void b(b bVar, int i10) {
        Log.w("AutoManageHelper", "Unresolved error while connecting client. Stopping auto-manage.");
        if (i10 < 0) {
            Log.wtf("AutoManageHelper", "AutoManageLifecycleHelper received onErrorResolutionFailed callback but no failing client ID is set", new Exception());
            return;
        }
        s2 s2Var = (s2) this.f5495i.get(i10);
        if (s2Var != null) {
            k(i10);
            GoogleApiClient.c cVar = s2Var.f5493c;
            if (cVar != null) {
                cVar.onConnectionFailed(bVar);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void c() {
        for (int i10 = 0; i10 < this.f5495i.size(); i10++) {
            s2 l10 = l(i10);
            if (l10 != null) {
                l10.f5492b.connect();
            }
        }
    }

    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        for (int i10 = 0; i10 < this.f5495i.size(); i10++) {
            s2 l10 = l(i10);
            if (l10 != null) {
                printWriter.append(str).append("GoogleApiClient #").print(l10.f5491a);
                printWriter.println(":");
                l10.f5492b.e(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
            }
        }
    }

    public final void j(int i10, GoogleApiClient googleApiClient, GoogleApiClient.c cVar) {
        s.l(googleApiClient, "GoogleApiClient instance cannot be null");
        boolean z10 = this.f5495i.indexOfKey(i10) < 0;
        StringBuilder sb2 = new StringBuilder(54);
        sb2.append("Already managing a GoogleApiClient with id ");
        sb2.append(i10);
        s.o(z10, sb2.toString());
        u2 u2Var = (u2) this.f5536f.get();
        boolean z11 = this.f5535e;
        String valueOf = String.valueOf(u2Var);
        StringBuilder sb3 = new StringBuilder(valueOf.length() + 49);
        sb3.append("starting AutoManage for client ");
        sb3.append(i10);
        sb3.append(" ");
        sb3.append(z11);
        sb3.append(" ");
        sb3.append(valueOf);
        Log.d("AutoManageHelper", sb3.toString());
        s2 s2Var = new s2(this, i10, googleApiClient, cVar);
        googleApiClient.o(s2Var);
        this.f5495i.put(i10, s2Var);
        if (this.f5535e && u2Var == null) {
            Log.d("AutoManageHelper", "connecting ".concat(googleApiClient.toString()));
            googleApiClient.connect();
        }
    }

    public final void k(int i10) {
        s2 s2Var = (s2) this.f5495i.get(i10);
        this.f5495i.remove(i10);
        if (s2Var != null) {
            s2Var.f5492b.p(s2Var);
            s2Var.f5492b.disconnect();
        }
    }

    public final void onStart() {
        super.onStart();
        boolean z10 = this.f5535e;
        String valueOf = String.valueOf(this.f5495i);
        StringBuilder sb2 = new StringBuilder(valueOf.length() + 14);
        sb2.append("onStart ");
        sb2.append(z10);
        sb2.append(" ");
        sb2.append(valueOf);
        Log.d("AutoManageHelper", sb2.toString());
        if (this.f5536f.get() == null) {
            for (int i10 = 0; i10 < this.f5495i.size(); i10++) {
                s2 l10 = l(i10);
                if (l10 != null) {
                    l10.f5492b.connect();
                }
            }
        }
    }

    public final void onStop() {
        super.onStop();
        for (int i10 = 0; i10 < this.f5495i.size(); i10++) {
            s2 l10 = l(i10);
            if (l10 != null) {
                l10.f5492b.disconnect();
            }
        }
    }
}
