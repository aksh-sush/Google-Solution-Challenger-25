package com.google.firebase.components;

import com.google.firebase.inject.Provider;

public final /* synthetic */ class g implements Provider {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ComponentRuntime f7753a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Component f7754b;

    public /* synthetic */ g(ComponentRuntime componentRuntime, Component component) {
        this.f7753a = componentRuntime;
        this.f7754b = component;
    }

    public final Object get() {
        return this.f7753a.lambda$discoverComponents$0(this.f7754b);
    }
}
