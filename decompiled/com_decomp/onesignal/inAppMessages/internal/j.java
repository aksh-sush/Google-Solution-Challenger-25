package com.onesignal.inAppMessages.internal;

import android.content.DialogInterface;
import java.util.List;

public final /* synthetic */ class j implements DialogInterface.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ k f9280e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ a f9281f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ List f9282g;

    public /* synthetic */ j(k kVar, a aVar, List list) {
        this.f9280e = kVar;
        this.f9281f = aVar;
        this.f9282g = list;
    }

    public final void onClick(DialogInterface dialogInterface, int i10) {
        k.m6showAlertDialogMessage$lambda5(this.f9280e, this.f9281f, this.f9282g, dialogInterface, i10);
    }
}
