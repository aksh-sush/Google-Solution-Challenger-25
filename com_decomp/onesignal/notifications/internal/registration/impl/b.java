package com.onesignal.notifications.internal.registration.impl;

import android.app.Activity;
import android.content.DialogInterface;
import com.onesignal.notifications.internal.registration.impl.a;

public final /* synthetic */ class b implements DialogInterface.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ a f9288e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Activity f9289f;

    public /* synthetic */ b(a aVar, Activity activity) {
        this.f9288e = aVar;
        this.f9289f = activity;
    }

    public final void onClick(DialogInterface dialogInterface, int i10) {
        a.b.m11invokeSuspend$lambda0(this.f9288e, this.f9289f, dialogInterface, i10);
    }
}
