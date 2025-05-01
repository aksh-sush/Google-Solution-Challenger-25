package com.google.firebase.components;

import com.google.firebase.inject.Provider;

public final /* synthetic */ class h implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ o f7755e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Provider f7756f;

    public /* synthetic */ h(o oVar, Provider provider) {
        this.f7755e = oVar;
        this.f7756f = provider;
    }

    public final void run() {
        this.f7755e.a(this.f7756f);
    }
}
