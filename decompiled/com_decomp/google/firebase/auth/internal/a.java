package com.google.firebase.auth.internal;

import android.app.Activity;
import android.util.Log;
import com.google.firebase.auth.FirebaseAuth;
import n4.e;
import n4.j;

final class a implements e {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ FirebaseAuth f7687a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ zzbm f7688b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ Activity f7689c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ j f7690d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ zzf f7691e;

    a(zzf zzf, FirebaseAuth firebaseAuth, zzbm zzbm, Activity activity, j jVar) {
        this.f7691e = zzf;
        this.f7687a = firebaseAuth;
        this.f7688b = zzbm;
        this.f7689c = activity;
        this.f7690d = jVar;
    }

    public final void onFailure(Exception exc) {
        String zzc = zzf.zza;
        String valueOf = String.valueOf(exc.getMessage());
        Log.e(zzc, valueOf.length() != 0 ? "Problem retrieving SafetyNet Token: ".concat(valueOf) : new String("Problem retrieving SafetyNet Token: "));
        this.f7691e.zze(this.f7687a, this.f7688b, this.f7689c, this.f7690d);
    }
}
