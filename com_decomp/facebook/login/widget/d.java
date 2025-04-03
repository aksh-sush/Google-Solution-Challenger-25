package com.facebook.login.widget;

public final /* synthetic */ class d implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ String f4847e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ LoginButton f4848f;

    public /* synthetic */ d(String str, LoginButton loginButton) {
        this.f4847e = str;
        this.f4848f = loginButton;
    }

    public final void run() {
        LoginButton.u(this.f4847e, this.f4848f);
    }
}
