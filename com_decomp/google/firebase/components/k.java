package com.google.firebase.components;

import com.google.firebase.components.ComponentRuntime;
import com.google.firebase.inject.Provider;

public final /* synthetic */ class k implements Provider {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ComponentRegistrar f7758a;

    public /* synthetic */ k(ComponentRegistrar componentRegistrar) {
        this.f7758a = componentRegistrar;
    }

    public final Object get() {
        return ComponentRuntime.Builder.lambda$addComponentRegistrar$0(this.f7758a);
    }
}
