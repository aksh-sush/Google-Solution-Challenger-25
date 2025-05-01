package com.google.firebase.firestore.remote;

import com.google.firebase.FirebaseApiNotAvailableException;
import com.google.firebase.firestore.auth.CredentialsProvider;
import com.google.firebase.firestore.util.Logger;
import com.google.firebase.internal.api.FirebaseNoSignedInUserException;
import fa.b;
import fa.d1;
import fa.r0;
import java.util.concurrent.Executor;
import n4.e;
import n4.f;

final class m extends b {

    /* renamed from: b  reason: collision with root package name */
    private static final r0.g f8216b = r0.g.e("Authorization", r0.f10507d);

    /* renamed from: a  reason: collision with root package name */
    private final CredentialsProvider f8217a;

    m(CredentialsProvider credentialsProvider) {
        this.f8217a = credentialsProvider;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void d(b.a aVar, String str) {
        Logger.debug("FirestoreCallCredentials", "Successfully fetched token.", new Object[0]);
        r0 r0Var = new r0();
        if (str != null) {
            r0.g gVar = f8216b;
            r0Var.o(gVar, "Bearer " + str);
        }
        aVar.a(r0Var);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void e(b.a aVar, Exception exc) {
        r0 r0Var;
        if (exc instanceof FirebaseApiNotAvailableException) {
            Logger.debug("FirestoreCallCredentials", "Firebase Auth API not available, not using authentication.", new Object[0]);
            r0Var = new r0();
        } else if (exc instanceof FirebaseNoSignedInUserException) {
            Logger.debug("FirestoreCallCredentials", "No user signed in, not using authentication.", new Object[0]);
            r0Var = new r0();
        } else {
            Logger.warn("FirestoreCallCredentials", "Failed to get token: %s.", exc);
            aVar.b(d1.f10382n.p(exc));
            return;
        }
        aVar.a(r0Var);
    }

    public void a(b.C0218b bVar, Executor executor, b.a aVar) {
        this.f8217a.getToken().addOnSuccessListener(executor, (f) new k(aVar)).addOnFailureListener(executor, (e) new l(aVar));
    }
}
