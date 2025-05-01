package com.google.android.gms.internal.p002firebaseauthapi;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.s;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseError;
import com.google.firebase.auth.ActionCodeSettings;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.EmailAuthCredential;
import com.google.firebase.auth.FirebaseAuthProvider;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.PhoneAuthProvider;
import com.google.firebase.auth.PhoneMultiFactorAssertion;
import com.google.firebase.auth.PhoneMultiFactorInfo;
import com.google.firebase.auth.UserProfileChangeRequest;
import com.google.firebase.auth.internal.zzag;
import com.google.firebase.auth.internal.zzan;
import com.google.firebase.auth.internal.zzba;
import com.google.firebase.auth.internal.zzbk;
import com.google.firebase.auth.internal.zzg;
import com.google.firebase.auth.internal.zzt;
import com.google.firebase.auth.internal.zzx;
import com.google.firebase.auth.internal.zzz;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import n4.i;
import n4.l;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzti  reason: invalid package */
public final class zzti extends zzpy<zzuf> {
    private final Context zza;
    private final zzuf zzb;
    private final Future<zzpu<zzuf>> zzc = zzd();

    zzti(Context context, zzuf zzuf) {
        this.zza = context;
        this.zzb = zzuf;
    }

    static zzx zzR(FirebaseApp firebaseApp, zzwj zzwj) {
        s.k(firebaseApp);
        s.k(zzwj);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new zzt(zzwj, FirebaseAuthProvider.PROVIDER_ID));
        List<zzww> zzr = zzwj.zzr();
        if (zzr != null && !zzr.isEmpty()) {
            for (int i10 = 0; i10 < zzr.size(); i10++) {
                arrayList.add(new zzt(zzr.get(i10)));
            }
        }
        zzx zzx = new zzx(firebaseApp, arrayList);
        zzx.zzr(new zzz(zzwj.zzb(), zzwj.zza()));
        zzx.zzq(zzwj.zzt());
        zzx.zzp(zzwj.zzd());
        zzx.zzi(zzba.zzb(zzwj.zzq()));
        return zzx;
    }

    public final i zzA(String str) {
        return zzb(new zzrx(str));
    }

    public final i zzB(FirebaseApp firebaseApp, zzg zzg, String str) {
        zzrz zzrz = new zzrz(str);
        zzrz.zzg(firebaseApp);
        zzrz.zze(zzg);
        return zzb(zzrz);
    }

    public final i zzC(FirebaseApp firebaseApp, AuthCredential authCredential, String str, zzg zzg) {
        zzsb zzsb = new zzsb(authCredential, str);
        zzsb.zzg(firebaseApp);
        zzsb.zze(zzg);
        return zzb(zzsb);
    }

    public final i zzD(FirebaseApp firebaseApp, String str, String str2, zzg zzg) {
        zzsd zzsd = new zzsd(str, str2);
        zzsd.zzg(firebaseApp);
        zzsd.zze(zzg);
        return zzb(zzsd);
    }

    public final i zzE(FirebaseApp firebaseApp, String str, String str2, String str3, zzg zzg) {
        zzsf zzsf = new zzsf(str, str2, str3);
        zzsf.zzg(firebaseApp);
        zzsf.zze(zzg);
        return zzb(zzsf);
    }

    public final i zzF(FirebaseApp firebaseApp, EmailAuthCredential emailAuthCredential, zzg zzg) {
        zzsh zzsh = new zzsh(emailAuthCredential);
        zzsh.zzg(firebaseApp);
        zzsh.zze(zzg);
        return zzb(zzsh);
    }

    public final i zzG(FirebaseApp firebaseApp, PhoneAuthCredential phoneAuthCredential, String str, zzg zzg) {
        zzvh.zzc();
        zzsj zzsj = new zzsj(phoneAuthCredential, str);
        zzsj.zzg(firebaseApp);
        zzsj.zze(zzg);
        return zzb(zzsj);
    }

    public final i zzH(zzag zzag, String str, String str2, long j10, boolean z10, boolean z11, String str3, String str4, boolean z12, PhoneAuthProvider.OnVerificationStateChangedCallbacks onVerificationStateChangedCallbacks, Executor executor, Activity activity) {
        zzsl zzsl = new zzsl(zzag, str, str2, j10, z10, z11, str3, str4, z12);
        String str5 = str;
        zzsl.zzi(onVerificationStateChangedCallbacks, activity, executor, str);
        return zzb(zzsl);
    }

    public final i zzI(zzag zzag, PhoneMultiFactorInfo phoneMultiFactorInfo, String str, long j10, boolean z10, boolean z11, String str2, String str3, boolean z12, PhoneAuthProvider.OnVerificationStateChangedCallbacks onVerificationStateChangedCallbacks, Executor executor, Activity activity) {
        zzsn zzsn = new zzsn(phoneMultiFactorInfo, zzag.zzd(), str, j10, z10, z11, str2, str3, z12);
        Activity activity2 = activity;
        zzsn.zzi(onVerificationStateChangedCallbacks, activity2, executor, phoneMultiFactorInfo.getUid());
        return zzb(zzsn);
    }

    public final i zzJ(FirebaseApp firebaseApp, FirebaseUser firebaseUser, String str, zzbk zzbk) {
        zzsp zzsp = new zzsp(firebaseUser.zzf(), str);
        zzsp.zzg(firebaseApp);
        zzsp.zzh(firebaseUser);
        zzsp.zze(zzbk);
        zzsp.zzf(zzbk);
        return zzb(zzsp);
    }

    public final i zzK(FirebaseApp firebaseApp, FirebaseUser firebaseUser, String str, zzbk zzbk) {
        s.k(firebaseApp);
        s.g(str);
        s.k(firebaseUser);
        s.k(zzbk);
        List<String> zzg = firebaseUser.zzg();
        if ((zzg != null && !zzg.contains(str)) || firebaseUser.isAnonymous()) {
            return l.d(zzto.zza(new Status((int) FirebaseError.ERROR_NO_SUCH_PROVIDER, str)));
        }
        if (((str.hashCode() == 1216985755 && str.equals("password")) ? (char) 0 : 65535) != 0) {
            zzst zzst = new zzst(str);
            zzst.zzg(firebaseApp);
            zzst.zzh(firebaseUser);
            zzst.zze(zzbk);
            zzst.zzf(zzbk);
            return zzb(zzst);
        }
        zzsr zzsr = new zzsr();
        zzsr.zzg(firebaseApp);
        zzsr.zzh(firebaseUser);
        zzsr.zze(zzbk);
        zzsr.zzf(zzbk);
        return zzb(zzsr);
    }

    public final i zzL(FirebaseApp firebaseApp, FirebaseUser firebaseUser, String str, zzbk zzbk) {
        zzsv zzsv = new zzsv(str);
        zzsv.zzg(firebaseApp);
        zzsv.zzh(firebaseUser);
        zzsv.zze(zzbk);
        zzsv.zzf(zzbk);
        return zzb(zzsv);
    }

    public final i zzM(FirebaseApp firebaseApp, FirebaseUser firebaseUser, String str, zzbk zzbk) {
        zzsx zzsx = new zzsx(str);
        zzsx.zzg(firebaseApp);
        zzsx.zzh(firebaseUser);
        zzsx.zze(zzbk);
        zzsx.zzf(zzbk);
        return zzb(zzsx);
    }

    public final i zzN(FirebaseApp firebaseApp, FirebaseUser firebaseUser, PhoneAuthCredential phoneAuthCredential, zzbk zzbk) {
        zzvh.zzc();
        zzsz zzsz = new zzsz(phoneAuthCredential);
        zzsz.zzg(firebaseApp);
        zzsz.zzh(firebaseUser);
        zzsz.zze(zzbk);
        zzsz.zzf(zzbk);
        return zzb(zzsz);
    }

    public final i zzO(FirebaseApp firebaseApp, FirebaseUser firebaseUser, UserProfileChangeRequest userProfileChangeRequest, zzbk zzbk) {
        zztb zztb = new zztb(userProfileChangeRequest);
        zztb.zzg(firebaseApp);
        zztb.zzh(firebaseUser);
        zztb.zze(zzbk);
        zztb.zzf(zzbk);
        return zzb(zztb);
    }

    public final i zzP(String str, String str2, ActionCodeSettings actionCodeSettings) {
        actionCodeSettings.zzg(7);
        return zzb(new zztd(str, str2, actionCodeSettings));
    }

    public final i zzQ(FirebaseApp firebaseApp, String str, String str2) {
        zztf zztf = new zztf(str, str2);
        zztf.zzg(firebaseApp);
        return zzb(zztf);
    }

    public final void zzS(FirebaseApp firebaseApp, zzxd zzxd, PhoneAuthProvider.OnVerificationStateChangedCallbacks onVerificationStateChangedCallbacks, Activity activity, Executor executor) {
        zzth zzth = new zzth(zzxd);
        zzth.zzg(firebaseApp);
        zzth.zzi(onVerificationStateChangedCallbacks, activity, executor, zzxd.zzd());
        zzb(zzth);
    }

    /* access modifiers changed from: package-private */
    public final Future<zzpu<zzuf>> zzd() {
        Future<zzpu<zzuf>> future = this.zzc;
        if (future != null) {
            return future;
        }
        return zzh.zza().zza(2).submit(new zztj(this.zzb, this.zza));
    }

    public final i zze(FirebaseApp firebaseApp, String str, String str2) {
        zzqb zzqb = new zzqb(str, str2);
        zzqb.zzg(firebaseApp);
        return zzb(zzqb);
    }

    public final i zzf(FirebaseApp firebaseApp, String str, String str2) {
        zzqd zzqd = new zzqd(str, str2);
        zzqd.zzg(firebaseApp);
        return zzb(zzqd);
    }

    public final i zzg(FirebaseApp firebaseApp, String str, String str2, String str3) {
        zzqf zzqf = new zzqf(str, str2, str3);
        zzqf.zzg(firebaseApp);
        return zzb(zzqf);
    }

    public final i zzh(FirebaseApp firebaseApp, String str, String str2, String str3, zzg zzg) {
        zzqh zzqh = new zzqh(str, str2, str3);
        zzqh.zzg(firebaseApp);
        zzqh.zze(zzg);
        return zzb(zzqh);
    }

    public final i zzi(FirebaseUser firebaseUser, zzan zzan) {
        zzqj zzqj = new zzqj();
        zzqj.zzh(firebaseUser);
        zzqj.zze(zzan);
        zzqj.zzf(zzan);
        return zzb(zzqj);
    }

    public final i zzj(FirebaseApp firebaseApp, String str, String str2) {
        zzql zzql = new zzql(str, str2);
        zzql.zzg(firebaseApp);
        return zza(zzql);
    }

    public final i zzk(FirebaseApp firebaseApp, PhoneMultiFactorAssertion phoneMultiFactorAssertion, FirebaseUser firebaseUser, String str, zzg zzg) {
        zzvh.zzc();
        zzqn zzqn = new zzqn(phoneMultiFactorAssertion, firebaseUser.zzf(), str);
        zzqn.zzg(firebaseApp);
        zzqn.zze(zzg);
        return zzb(zzqn);
    }

    public final i zzl(FirebaseApp firebaseApp, FirebaseUser firebaseUser, PhoneMultiFactorAssertion phoneMultiFactorAssertion, String str, zzg zzg) {
        zzvh.zzc();
        zzqp zzqp = new zzqp(phoneMultiFactorAssertion, str);
        zzqp.zzg(firebaseApp);
        zzqp.zze(zzg);
        if (firebaseUser != null) {
            zzqp.zzh(firebaseUser);
        }
        return zzb(zzqp);
    }

    public final i zzm(FirebaseApp firebaseApp, FirebaseUser firebaseUser, String str, zzbk zzbk) {
        zzqr zzqr = new zzqr(str);
        zzqr.zzg(firebaseApp);
        zzqr.zzh(firebaseUser);
        zzqr.zze(zzbk);
        zzqr.zzf(zzbk);
        return zza(zzqr);
    }

    public final i zzn(FirebaseApp firebaseApp, FirebaseUser firebaseUser, AuthCredential authCredential, zzbk zzbk) {
        s.k(firebaseApp);
        s.k(authCredential);
        s.k(firebaseUser);
        s.k(zzbk);
        List<String> zzg = firebaseUser.zzg();
        if (zzg != null && zzg.contains(authCredential.getProvider())) {
            return l.d(zzto.zza(new Status(FirebaseError.ERROR_PROVIDER_ALREADY_LINKED)));
        }
        if (authCredential instanceof EmailAuthCredential) {
            EmailAuthCredential emailAuthCredential = (EmailAuthCredential) authCredential;
            if (!emailAuthCredential.zzg()) {
                zzqt zzqt = new zzqt(emailAuthCredential);
                zzqt.zzg(firebaseApp);
                zzqt.zzh(firebaseUser);
                zzqt.zze(zzbk);
                zzqt.zzf(zzbk);
                return zzb(zzqt);
            }
            zzqz zzqz = new zzqz(emailAuthCredential);
            zzqz.zzg(firebaseApp);
            zzqz.zzh(firebaseUser);
            zzqz.zze(zzbk);
            zzqz.zzf(zzbk);
            return zzb(zzqz);
        } else if (authCredential instanceof PhoneAuthCredential) {
            zzvh.zzc();
            zzqx zzqx = new zzqx((PhoneAuthCredential) authCredential);
            zzqx.zzg(firebaseApp);
            zzqx.zzh(firebaseUser);
            zzqx.zze(zzbk);
            zzqx.zzf(zzbk);
            return zzb(zzqx);
        } else {
            s.k(firebaseApp);
            s.k(authCredential);
            s.k(firebaseUser);
            s.k(zzbk);
            zzqv zzqv = new zzqv(authCredential);
            zzqv.zzg(firebaseApp);
            zzqv.zzh(firebaseUser);
            zzqv.zze(zzbk);
            zzqv.zzf(zzbk);
            return zzb(zzqv);
        }
    }

    public final i zzo(FirebaseApp firebaseApp, FirebaseUser firebaseUser, AuthCredential authCredential, String str, zzbk zzbk) {
        zzrb zzrb = new zzrb(authCredential, str);
        zzrb.zzg(firebaseApp);
        zzrb.zzh(firebaseUser);
        zzrb.zze(zzbk);
        zzrb.zzf(zzbk);
        return zzb(zzrb);
    }

    public final i zzp(FirebaseApp firebaseApp, FirebaseUser firebaseUser, AuthCredential authCredential, String str, zzbk zzbk) {
        zzrd zzrd = new zzrd(authCredential, str);
        zzrd.zzg(firebaseApp);
        zzrd.zzh(firebaseUser);
        zzrd.zze(zzbk);
        zzrd.zzf(zzbk);
        return zzb(zzrd);
    }

    public final i zzq(FirebaseApp firebaseApp, FirebaseUser firebaseUser, EmailAuthCredential emailAuthCredential, zzbk zzbk) {
        zzrf zzrf = new zzrf(emailAuthCredential);
        zzrf.zzg(firebaseApp);
        zzrf.zzh(firebaseUser);
        zzrf.zze(zzbk);
        zzrf.zzf(zzbk);
        return zzb(zzrf);
    }

    public final i zzr(FirebaseApp firebaseApp, FirebaseUser firebaseUser, EmailAuthCredential emailAuthCredential, zzbk zzbk) {
        zzrh zzrh = new zzrh(emailAuthCredential);
        zzrh.zzg(firebaseApp);
        zzrh.zzh(firebaseUser);
        zzrh.zze(zzbk);
        zzrh.zzf(zzbk);
        return zzb(zzrh);
    }

    public final i zzs(FirebaseApp firebaseApp, FirebaseUser firebaseUser, String str, String str2, String str3, zzbk zzbk) {
        zzrj zzrj = new zzrj(str, str2, str3);
        zzrj.zzg(firebaseApp);
        zzrj.zzh(firebaseUser);
        zzrj.zze(zzbk);
        zzrj.zzf(zzbk);
        return zzb(zzrj);
    }

    public final i zzt(FirebaseApp firebaseApp, FirebaseUser firebaseUser, String str, String str2, String str3, zzbk zzbk) {
        zzrl zzrl = new zzrl(str, str2, str3);
        zzrl.zzg(firebaseApp);
        zzrl.zzh(firebaseUser);
        zzrl.zze(zzbk);
        zzrl.zzf(zzbk);
        return zzb(zzrl);
    }

    public final i zzu(FirebaseApp firebaseApp, FirebaseUser firebaseUser, PhoneAuthCredential phoneAuthCredential, String str, zzbk zzbk) {
        zzvh.zzc();
        zzrn zzrn = new zzrn(phoneAuthCredential, str);
        zzrn.zzg(firebaseApp);
        zzrn.zzh(firebaseUser);
        zzrn.zze(zzbk);
        zzrn.zzf(zzbk);
        return zzb(zzrn);
    }

    public final i zzv(FirebaseApp firebaseApp, FirebaseUser firebaseUser, PhoneAuthCredential phoneAuthCredential, String str, zzbk zzbk) {
        zzvh.zzc();
        zzrp zzrp = new zzrp(phoneAuthCredential, str);
        zzrp.zzg(firebaseApp);
        zzrp.zzh(firebaseUser);
        zzrp.zze(zzbk);
        zzrp.zzf(zzbk);
        return zzb(zzrp);
    }

    public final i zzw(FirebaseApp firebaseApp, FirebaseUser firebaseUser, zzbk zzbk) {
        zzrr zzrr = new zzrr();
        zzrr.zzg(firebaseApp);
        zzrr.zzh(firebaseUser);
        zzrr.zze(zzbk);
        zzrr.zzf(zzbk);
        return zza(zzrr);
    }

    public final i zzx(FirebaseApp firebaseApp, ActionCodeSettings actionCodeSettings, String str) {
        zzrt zzrt = new zzrt(str, actionCodeSettings);
        zzrt.zzg(firebaseApp);
        return zzb(zzrt);
    }

    public final i zzy(FirebaseApp firebaseApp, String str, ActionCodeSettings actionCodeSettings, String str2) {
        actionCodeSettings.zzg(1);
        zzrv zzrv = new zzrv(str, actionCodeSettings, str2, "sendPasswordResetEmail");
        zzrv.zzg(firebaseApp);
        return zzb(zzrv);
    }

    public final i zzz(FirebaseApp firebaseApp, String str, ActionCodeSettings actionCodeSettings, String str2) {
        actionCodeSettings.zzg(6);
        zzrv zzrv = new zzrv(str, actionCodeSettings, str2, "sendSignInLinkToEmail");
        zzrv.zzg(firebaseApp);
        return zzb(zzrv);
    }
}
