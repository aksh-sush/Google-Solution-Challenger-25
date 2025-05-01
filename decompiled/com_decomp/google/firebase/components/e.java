package com.google.firebase.components;

import com.google.firebase.inject.Provider;

public final /* synthetic */ class e implements Provider {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f7750a;

    public /* synthetic */ e(String str) {
        this.f7750a = str;
    }

    public final Object get() {
        return ComponentDiscovery.instantiate(this.f7750a);
    }
}
