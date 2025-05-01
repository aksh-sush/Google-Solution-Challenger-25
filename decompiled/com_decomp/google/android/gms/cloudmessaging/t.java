package com.google.android.gms.cloudmessaging;

import android.os.Bundle;
import android.util.Log;
import n4.j;

abstract class t {

    /* renamed from: a  reason: collision with root package name */
    final int f5228a;

    /* renamed from: b  reason: collision with root package name */
    final j f5229b = new j();

    /* renamed from: c  reason: collision with root package name */
    final int f5230c;

    /* renamed from: d  reason: collision with root package name */
    final Bundle f5231d;

    t(int i10, int i11, Bundle bundle) {
        this.f5228a = i10;
        this.f5230c = i11;
        this.f5231d = bundle;
    }

    /* access modifiers changed from: package-private */
    public abstract void a(Bundle bundle);

    /* access modifiers changed from: package-private */
    public final void b(s sVar) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(this);
            String valueOf2 = String.valueOf(sVar);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 14 + valueOf2.length());
            sb2.append("Failing ");
            sb2.append(valueOf);
            sb2.append(" with ");
            sb2.append(valueOf2);
            Log.d("MessengerIpcClient", sb2.toString());
        }
        this.f5229b.b(sVar);
    }

    /* access modifiers changed from: package-private */
    public final void c(Object obj) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(this);
            String valueOf2 = String.valueOf(obj);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 16 + valueOf2.length());
            sb2.append("Finishing ");
            sb2.append(valueOf);
            sb2.append(" with ");
            sb2.append(valueOf2);
            Log.d("MessengerIpcClient", sb2.toString());
        }
        this.f5229b.c(obj);
    }

    /* access modifiers changed from: package-private */
    public abstract boolean d();

    public String toString() {
        int i10 = this.f5230c;
        int i11 = this.f5228a;
        boolean d10 = d();
        StringBuilder sb2 = new StringBuilder(55);
        sb2.append("Request { what=");
        sb2.append(i10);
        sb2.append(" id=");
        sb2.append(i11);
        sb2.append(" oneWay=");
        sb2.append(d10);
        sb2.append("}");
        return sb2.toString();
    }
}
