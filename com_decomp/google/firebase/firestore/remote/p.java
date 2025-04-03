package com.google.firebase.firestore.remote;

import n4.d;
import n4.i;
import n4.j;

public final /* synthetic */ class p implements d {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ FirestoreChannel f8224a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ j f8225b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f8226c;

    public /* synthetic */ p(FirestoreChannel firestoreChannel, j jVar, Object obj) {
        this.f8224a = firestoreChannel;
        this.f8225b = jVar;
        this.f8226c = obj;
    }

    public final void a(i iVar) {
        this.f8224a.lambda$runStreamingResponseRpc$1(this.f8225b, this.f8226c, iVar);
    }
}
