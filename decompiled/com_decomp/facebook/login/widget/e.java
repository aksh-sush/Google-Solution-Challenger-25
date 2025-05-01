package com.facebook.login.widget;

import e2.r;

public final /* synthetic */ class e implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ LoginButton f4849e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ r f4850f;

    public /* synthetic */ e(LoginButton loginButton, r rVar) {
        this.f4849e = loginButton;
        this.f4850f = rVar;
    }

    public final void run() {
        LoginButton.v(this.f4849e, this.f4850f);
    }
}
