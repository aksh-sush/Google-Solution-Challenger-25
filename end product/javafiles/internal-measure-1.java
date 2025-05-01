package com.google.android.gms.measurement.internal;

import android.content.ServiceConnection;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.zzbr;

/* loaded from: classes.dex */
final class x3 implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ zzbr f6628e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ ServiceConnection f6629f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ y3 f6630g;

    x3(y3 y3Var, zzbr zzbrVar, ServiceConnection serviceConnection) {
        this.f6630g = y3Var;
        this.f6628e = zzbrVar;
        this.f6629f = serviceConnection;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        h3 r10;
        String str2;
        y3 y3Var = this.f6630g;
        a4 a4Var = y3Var.f6697b;
        str = y3Var.f6696a;
        zzbr zzbrVar = this.f6628e;
        ServiceConnection serviceConnection = this.f6629f;
        a4Var.f5864a.b().h();
        Bundle bundle = new Bundle();
        bundle.putString("package_name", str);
        Bundle bundle2 = null;
        try {
            Bundle zzd = zzbrVar.zzd(bundle);
            if (zzd == null) {
                a4Var.f5864a.d().r().a("Install Referrer Service returned a null response");
            } else {
                bundle2 = zzd;
            }
        } catch (Exception e10) {
            a4Var.f5864a.d().r().b("Exception occurred while retrieving the Install Referrer", e10.getMessage());
        }
        a4Var.f5864a.b().h();
        n4.t();
        if (bundle2 != null) {
            long j10 = bundle2.getLong("install_begin_timestamp_seconds", 0L) * 1000;
            if (j10 == 0) {
                r10 = a4Var.f5864a.d().w();
                str2 = "Service response is missing Install Referrer install timestamp";
            } else {
                String string = bundle2.getString("install_referrer");
                if (string == null || string.isEmpty()) {
                    r10 = a4Var.f5864a.d().r();
                    str2 = "No referrer defined in Install Referrer response";
                } else {
                    a4Var.f5864a.d().v().b("InstallReferrer API result", string);
                    Bundle t02 = a4Var.f5864a.N().t0(Uri.parse(string.length() != 0 ? "?".concat(string) : new String("?")));
                    if (t02 == null) {
                        r10 = a4Var.f5864a.d().r();
                        str2 = "No campaign params defined in Install Referrer result";
                    } else {
                        String string2 = t02.getString("medium");
                        if (string2 != null && !"(not set)".equalsIgnoreCase(string2) && !"organic".equalsIgnoreCase(string2)) {
                            long j11 = bundle2.getLong("referrer_click_timestamp_seconds", 0L) * 1000;
                            if (j11 == 0) {
                                r10 = a4Var.f5864a.d().r();
                                str2 = "Install Referrer is missing click timestamp for ad campaign";
                            } else {
                                t02.putLong("click_timestamp", j11);
                            }
                        }
                        if (j10 == a4Var.f5864a.F().f6552f.a()) {
                            a4Var.f5864a.d().v().a("Logging Install Referrer campaign from module while it may have already been logged.");
                        }
                        if (a4Var.f5864a.o()) {
                            a4Var.f5864a.F().f6552f.b(j10);
                            a4Var.f5864a.d().v().b("Logging Install Referrer campaign from gmscore with ", "referrer API v2");
                            t02.putString("_cis", "referrer API v2");
                            a4Var.f5864a.I().s("auto", "_cmp", t02, str);
                        }
                    }
                }
            }
            r10.a(str2);
        }
        x3.b.b().c(a4Var.f5864a.c(), serviceConnection);
    }
}