package com.google.android.gms.common.api.internal;

final class c3 implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ z f5337e;

    c3(z zVar) {
        this.f5337e = zVar;
    }

    public final void run() {
        this.f5337e.f5553m.lock();
        try {
            z.y(this.f5337e);
        } finally {
            this.f5337e.f5553m.unlock();
        }
    }
}
