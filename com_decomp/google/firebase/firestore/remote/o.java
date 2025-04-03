package com.google.firebase.firestore.remote;

import fa.f;
import n4.d;
import n4.i;

public final /* synthetic */ class o implements d {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ FirestoreChannel f8221a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ f[] f8222b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ y f8223c;

    public /* synthetic */ o(FirestoreChannel firestoreChannel, f[] fVarArr, y yVar) {
        this.f8221a = firestoreChannel;
        this.f8222b = fVarArr;
        this.f8223c = yVar;
    }

    public final void a(i iVar) {
        this.f8221a.lambda$runBidiStreamingRpc$0(this.f8222b, this.f8223c, iVar);
    }
}
