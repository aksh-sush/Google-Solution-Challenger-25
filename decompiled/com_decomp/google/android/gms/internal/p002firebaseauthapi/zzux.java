package com.google.android.gms.internal.p002firebaseauthapi;

import android.app.Activity;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.s;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.PhoneAuthProvider;
import com.google.firebase.auth.internal.zzao;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzux  reason: invalid package */
abstract class zzux<ResultT, CallbackT> implements zzpx<zztm, ResultT> {
    /* access modifiers changed from: private */
    public boolean zza;
    protected final int zzb;
    final zzuu zzc = new zzuu(this);
    protected FirebaseApp zzd;
    protected FirebaseUser zze;
    protected CallbackT zzf;
    protected zzao zzg;
    protected final List<PhoneAuthProvider.OnVerificationStateChangedCallbacks> zzh = new ArrayList();
    protected Executor zzi;
    protected zzwq zzj;
    protected zzwj zzk;
    protected zzvv zzl;
    protected zzxb zzm;
    protected String zzn;
    protected String zzo;
    protected AuthCredential zzp;
    protected String zzq;
    protected String zzr;
    protected zzoa zzs;
    ResultT zzt;
    Status zzu;
    protected zzuw zzv;

    public zzux(int i10) {
        this.zzb = i10;
    }

    static /* synthetic */ void zzj(zzux zzux) {
        zzux.zzc();
        s.o(zzux.zza, "no success or failure set on method implementation");
    }

    static /* synthetic */ void zzk(zzux zzux, Status status) {
        zzao zzao = zzux.zzg;
        if (zzao != null) {
            zzao.zzb(status);
        }
    }

    public abstract void zzc();

    public final zzux<ResultT, CallbackT> zze(CallbackT callbackt) {
        this.zzf = s.l(callbackt, "external callback cannot be null");
        return this;
    }

    public final zzux<ResultT, CallbackT> zzf(zzao zzao) {
        this.zzg = (zzao) s.l(zzao, "external failure callback cannot be null");
        return this;
    }

    public final zzux<ResultT, CallbackT> zzg(FirebaseApp firebaseApp) {
        this.zzd = (FirebaseApp) s.l(firebaseApp, "firebaseApp cannot be null");
        return this;
    }

    public final zzux<ResultT, CallbackT> zzh(FirebaseUser firebaseUser) {
        this.zze = (FirebaseUser) s.l(firebaseUser, "firebaseUser cannot be null");
        return this;
    }

    public final zzux<ResultT, CallbackT> zzi(PhoneAuthProvider.OnVerificationStateChangedCallbacks onVerificationStateChangedCallbacks, Activity activity, Executor executor, String str) {
        PhoneAuthProvider.OnVerificationStateChangedCallbacks zza2 = zzvh.zza(str, onVerificationStateChangedCallbacks, this);
        synchronized (this.zzh) {
            this.zzh.add((PhoneAuthProvider.OnVerificationStateChangedCallbacks) s.k(zza2));
        }
        if (activity != null) {
            zzuo.zza(activity, this.zzh);
        }
        this.zzi = (Executor) s.k(executor);
        return this;
    }

    public final void zzl(Status status) {
        this.zza = true;
        this.zzu = status;
        this.zzv.zza(null, status);
    }

    public final void zzm(ResultT resultt) {
        this.zza = true;
        this.zzt = resultt;
        this.zzv.zza(resultt, (Status) null);
    }
}
