package com.facebook.login.widget;

import android.content.DialogInterface;
import com.facebook.login.widget.LoginButton;
import o2.d0;

public final /* synthetic */ class f implements DialogInterface.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ d0 f4851e;

    public /* synthetic */ f(d0 d0Var) {
        this.f4851e = d0Var;
    }

    public final void onClick(DialogInterface dialogInterface, int i10) {
        LoginButton.c.g(this.f4851e, dialogInterface, i10);
    }
}
