package com.google.firebase.components;

import com.google.firebase.inject.Deferred;
import com.google.firebase.inject.Provider;

public final /* synthetic */ class s implements Deferred.DeferredHandler {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Deferred.DeferredHandler f7771a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Deferred.DeferredHandler f7772b;

    public /* synthetic */ s(Deferred.DeferredHandler deferredHandler, Deferred.DeferredHandler deferredHandler2) {
        this.f7771a = deferredHandler;
        this.f7772b = deferredHandler2;
    }

    public final void handle(Provider provider) {
        t.g(this.f7771a, this.f7772b, provider);
    }
}
