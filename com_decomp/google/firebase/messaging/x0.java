package com.google.firebase.messaging;

import android.content.Intent;
import android.os.Binder;
import android.os.Process;
import android.util.Log;
import com.google.firebase.messaging.a1;
import n4.d;
import n4.i;

class x0 extends Binder {

    /* renamed from: a  reason: collision with root package name */
    private final a f8489a;

    interface a {
        i a(Intent intent);
    }

    x0(a aVar) {
        this.f8489a = aVar;
    }

    /* access modifiers changed from: package-private */
    public void b(a1.a aVar) {
        if (Binder.getCallingUid() == Process.myUid()) {
            if (Log.isLoggable(Constants.TAG, 3)) {
                Log.d(Constants.TAG, "service received new intent via bind strategy");
            }
            this.f8489a.a(aVar.f8376a).addOnCompleteListener(v0.f8485e, (d) new w0(aVar));
            return;
        }
        throw new SecurityException("Binding only allowed within app");
    }
}
