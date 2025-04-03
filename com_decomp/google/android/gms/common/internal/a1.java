package com.google.android.gms.common.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.view.View;
import b4.b;
import b4.c;
import com.google.android.gms.common.api.Scope;

public final class a1 extends c {

    /* renamed from: c  reason: collision with root package name */
    private static final a1 f5577c = new a1();

    private a1() {
        super("com.google.android.gms.common.ui.SignInButtonCreatorImpl");
    }

    public static View c(Context context, int i10, int i11) {
        a1 a1Var = f5577c;
        try {
            y0 y0Var = new y0(1, i10, i11, (Scope[]) null);
            return (View) b.Y(((n0) a1Var.b(context)).c(b.Z(context), y0Var));
        } catch (Exception e10) {
            StringBuilder sb2 = new StringBuilder(64);
            sb2.append("Could not get button with size ");
            sb2.append(i10);
            sb2.append(" and color ");
            sb2.append(i11);
            throw new c.a(sb2.toString(), e10);
        }
    }

    public final /* synthetic */ Object a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ISignInButtonCreator");
        return queryLocalInterface instanceof n0 ? (n0) queryLocalInterface : new n0(iBinder);
    }
}
