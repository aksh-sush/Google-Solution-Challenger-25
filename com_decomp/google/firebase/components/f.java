package com.google.firebase.components;

import com.google.firebase.inject.Provider;

public final /* synthetic */ class f implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ t f7751e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Provider f7752f;

    public /* synthetic */ f(t tVar, Provider provider) {
        this.f7751e = tVar;
        this.f7752f = provider;
    }

    public final void run() {
        this.f7751e.i(this.f7752f);
    }
}
