package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

public abstract class r2 {

    /* renamed from: a  reason: collision with root package name */
    public final int f5488a;

    public r2(int i10) {
        this.f5488a = i10;
    }

    static /* bridge */ /* synthetic */ Status e(RemoteException remoteException) {
        return new Status(19, remoteException.getClass().getSimpleName() + ": " + remoteException.getLocalizedMessage());
    }

    public abstract void a(Status status);

    public abstract void b(Exception exc);

    public abstract void c(n1 n1Var);

    public abstract void d(c0 c0Var, boolean z10);
}
