package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.internal.measurement.zzcf;
import h4.d;
import java.util.List;

final class w6 implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ String f6545e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ String f6546f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ i9 f6547g;

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ boolean f6548h;

    /* renamed from: i  reason: collision with root package name */
    final /* synthetic */ zzcf f6549i;

    /* renamed from: j  reason: collision with root package name */
    final /* synthetic */ v7 f6550j;

    w6(v7 v7Var, String str, String str2, i9 i9Var, boolean z10, zzcf zzcf) {
        this.f6550j = v7Var;
        this.f6545e = str;
        this.f6546f = str2;
        this.f6547g = i9Var;
        this.f6548h = z10;
        this.f6549i = zzcf;
    }

    public final void run() {
        Throwable th;
        Bundle bundle;
        RemoteException e10;
        Bundle bundle2 = new Bundle();
        try {
            d H = this.f6550j.f6501d;
            if (H == null) {
                this.f6550j.f5994a.d().r().c("Failed to get user properties; not connected to service", this.f6545e, this.f6546f);
                this.f6550j.f5994a.N().E(this.f6549i, bundle2);
                return;
            }
            s.k(this.f6547g);
            List<z8> e11 = H.e(this.f6545e, this.f6546f, this.f6548h, this.f6547g);
            bundle = new Bundle();
            if (e11 != null) {
                for (z8 z8Var : e11) {
                    String str = z8Var.f6692i;
                    if (str != null) {
                        bundle.putString(z8Var.f6689f, str);
                    } else {
                        Long l10 = z8Var.f6691h;
                        if (l10 != null) {
                            bundle.putLong(z8Var.f6689f, l10.longValue());
                        } else {
                            Double d10 = z8Var.f6694k;
                            if (d10 != null) {
                                bundle.putDouble(z8Var.f6689f, d10.doubleValue());
                            }
                        }
                    }
                }
            }
            try {
                this.f6550j.E();
                this.f6550j.f5994a.N().E(this.f6549i, bundle);
            } catch (RemoteException e12) {
                e10 = e12;
                try {
                    this.f6550j.f5994a.d().r().c("Failed to get user properties; remote exception", this.f6545e, e10);
                    this.f6550j.f5994a.N().E(this.f6549i, bundle);
                } catch (Throwable th2) {
                    th = th2;
                    bundle2 = bundle;
                    this.f6550j.f5994a.N().E(this.f6549i, bundle2);
                    throw th;
                }
            }
        } catch (RemoteException e13) {
            bundle = bundle2;
            e10 = e13;
            this.f6550j.f5994a.d().r().c("Failed to get user properties; remote exception", this.f6545e, e10);
            this.f6550j.f5994a.N().E(this.f6549i, bundle);
        } catch (Throwable th3) {
            th = th3;
            this.f6550j.f5994a.N().E(this.f6549i, bundle2);
            throw th;
        }
    }
}
