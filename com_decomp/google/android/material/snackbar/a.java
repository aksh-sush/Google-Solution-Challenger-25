package com.google.android.material.snackbar;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

class a {

    /* renamed from: c  reason: collision with root package name */
    private static a f7275c;

    /* renamed from: a  reason: collision with root package name */
    private final Object f7276a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private final Handler f7277b = new Handler(Looper.getMainLooper(), new C0097a());

    /* renamed from: com.google.android.material.snackbar.a$a  reason: collision with other inner class name */
    class C0097a implements Handler.Callback {
        C0097a() {
        }

        public boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            a aVar = a.this;
            android.support.v4.media.session.b.a(message.obj);
            aVar.c((c) null);
            return true;
        }
    }

    interface b {
    }

    private static class c {
    }

    private a() {
    }

    private boolean a(c cVar, int i10) {
        throw null;
    }

    static a b() {
        if (f7275c == null) {
            f7275c = new a();
        }
        return f7275c;
    }

    private boolean d(b bVar) {
        return false;
    }

    /* access modifiers changed from: package-private */
    public void c(c cVar) {
        synchronized (this.f7276a) {
            a(cVar, 2);
        }
    }

    public void e(b bVar) {
        synchronized (this.f7276a) {
            if (d(bVar)) {
                throw null;
            }
        }
    }

    public void f(b bVar) {
        synchronized (this.f7276a) {
            if (d(bVar)) {
                throw null;
            }
        }
    }
}
