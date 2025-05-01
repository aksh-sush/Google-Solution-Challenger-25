package com.google.firebase;

import android.content.Context;
import com.google.firebase.inject.Provider;

public final /* synthetic */ class a implements Provider {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ FirebaseApp f7669a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Context f7670b;

    public /* synthetic */ a(FirebaseApp firebaseApp, Context context) {
        this.f7669a = firebaseApp;
        this.f7670b = context;
    }

    public final Object get() {
        return this.f7669a.lambda$new$0(this.f7670b);
    }
}
