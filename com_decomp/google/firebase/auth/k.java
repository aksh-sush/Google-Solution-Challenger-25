package com.google.firebase.auth;

import android.app.Activity;
import android.util.Log;
import com.google.firebase.auth.PhoneAuthProvider;
import com.google.firebase.auth.internal.zze;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import n4.d;
import n4.i;

final class k implements d {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ String f7726a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ long f7727b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ TimeUnit f7728c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ PhoneAuthProvider.OnVerificationStateChangedCallbacks f7729d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ Activity f7730e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ Executor f7731f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ boolean f7732g;

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ FirebaseAuth f7733h;

    k(FirebaseAuth firebaseAuth, String str, long j10, TimeUnit timeUnit, PhoneAuthProvider.OnVerificationStateChangedCallbacks onVerificationStateChangedCallbacks, Activity activity, Executor executor, boolean z10) {
        this.f7733h = firebaseAuth;
        this.f7726a = str;
        this.f7727b = j10;
        this.f7728c = timeUnit;
        this.f7729d = onVerificationStateChangedCallbacks;
        this.f7730e = activity;
        this.f7731f = executor;
        this.f7732g = z10;
    }

    public final void a(i iVar) {
        String str;
        String str2;
        if (!iVar.isSuccessful()) {
            String valueOf = String.valueOf(iVar.getException() != null ? iVar.getException().getMessage() : "");
            Log.e("FirebaseAuth", valueOf.length() != 0 ? "Error while validating application identity: ".concat(valueOf) : new String("Error while validating application identity: "));
            Log.e("FirebaseAuth", "Proceeding without any application identifier.");
            str2 = null;
            str = null;
        } else {
            String zzb = ((zze) iVar.getResult()).zzb();
            str2 = ((zze) iVar.getResult()).zza();
            str = zzb;
        }
        this.f7733h.zzI(this.f7726a, this.f7727b, this.f7728c, this.f7729d, this.f7730e, this.f7731f, this.f7732g, str2, str);
    }
}
