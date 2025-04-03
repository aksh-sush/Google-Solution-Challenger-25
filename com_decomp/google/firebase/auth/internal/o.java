package com.google.firebase.auth.internal;

import android.app.Activity;
import com.google.firebase.auth.FirebaseAuth;
import i4.e;
import n4.f;
import n4.j;

final class o implements f {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ j f7717a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ FirebaseAuth f7718b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ zzbm f7719c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ Activity f7720d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ zzf f7721e;

    o(zzf zzf, j jVar, FirebaseAuth firebaseAuth, zzbm zzbm, Activity activity) {
        this.f7721e = zzf;
        this.f7717a = jVar;
        this.f7718b = firebaseAuth;
        this.f7719c = zzbm;
        this.f7720d = activity;
    }

    public final /* bridge */ /* synthetic */ void b(Object obj) {
        e.a aVar = (e.a) obj;
        if (zzbf.zza(aVar)) {
            this.f7717a.c(new zze(aVar.c(), (String) null));
        } else {
            this.f7721e.zze(this.f7718b, this.f7719c, this.f7720d, this.f7717a);
        }
    }
}
