package com.google.firebase.firestore.auth;

import com.google.firebase.FirebaseApiNotAvailableException;
import com.google.firebase.auth.GetTokenResult;
import com.google.firebase.auth.internal.IdTokenListener;
import com.google.firebase.auth.internal.InternalAuthProvider;
import com.google.firebase.firestore.util.Executors;
import com.google.firebase.firestore.util.Listener;
import com.google.firebase.firestore.util.Logger;
import com.google.firebase.inject.Deferred;
import com.google.firebase.inject.Provider;
import com.google.firebase.internal.InternalTokenResult;
import n4.i;
import n4.l;
import r5.a;
import r5.b;
import r5.c;

public final class FirebaseAuthCredentialsProvider extends CredentialsProvider {
    private static final String LOG_TAG = "FirebaseAuthCredentialsProvider";
    private Listener<User> changeListener;
    private boolean forceRefresh;
    private final IdTokenListener idTokenListener = new a(this);
    private InternalAuthProvider internalAuthProvider;
    private int tokenCounter;

    public FirebaseAuthCredentialsProvider(Deferred<InternalAuthProvider> deferred) {
        deferred.whenAvailable(new b(this));
    }

    private synchronized User getUser() {
        String uid;
        InternalAuthProvider internalAuthProvider2 = this.internalAuthProvider;
        uid = internalAuthProvider2 == null ? null : internalAuthProvider2.getUid();
        return uid != null ? new User(uid) : User.UNAUTHENTICATED;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ i lambda$getToken$2(int i10, i iVar) {
        synchronized (this) {
            if (i10 != this.tokenCounter) {
                Logger.debug(LOG_TAG, "getToken aborted due to token change", new Object[0]);
                i token = getToken();
                return token;
            } else if (iVar.isSuccessful()) {
                i e10 = l.e(((GetTokenResult) iVar.getResult()).getToken());
                return e10;
            } else {
                i d10 = l.d(iVar.getException());
                return d10;
            }
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(InternalTokenResult internalTokenResult) {
        onIdTokenChanged();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$new$1(Provider provider) {
        synchronized (this) {
            this.internalAuthProvider = (InternalAuthProvider) provider.get();
            onIdTokenChanged();
            this.internalAuthProvider.addIdTokenListener(this.idTokenListener);
        }
    }

    private synchronized void onIdTokenChanged() {
        this.tokenCounter++;
        Listener<User> listener = this.changeListener;
        if (listener != null) {
            listener.onValue(getUser());
        }
    }

    public synchronized i getToken() {
        InternalAuthProvider internalAuthProvider2 = this.internalAuthProvider;
        if (internalAuthProvider2 == null) {
            return l.d(new FirebaseApiNotAvailableException("auth is not available"));
        }
        i accessToken = internalAuthProvider2.getAccessToken(this.forceRefresh);
        this.forceRefresh = false;
        return accessToken.continueWithTask(Executors.DIRECT_EXECUTOR, new c(this, this.tokenCounter));
    }

    public synchronized void invalidateToken() {
        this.forceRefresh = true;
    }

    public synchronized void removeChangeListener() {
        this.changeListener = null;
        InternalAuthProvider internalAuthProvider2 = this.internalAuthProvider;
        if (internalAuthProvider2 != null) {
            internalAuthProvider2.removeIdTokenListener(this.idTokenListener);
        }
    }

    public synchronized void setChangeListener(Listener<User> listener) {
        this.changeListener = listener;
        listener.onValue(getUser());
    }
}
