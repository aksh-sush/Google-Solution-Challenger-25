package com.google.android.gms.internal.p002firebaseauthapi;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.s;
import com.google.firebase.FirebaseError;
import com.google.firebase.auth.ActionCodeSettings;
import com.google.firebase.auth.EmailAuthCredential;
import com.google.firebase.auth.UserProfileChangeRequest;
import com.google.firebase.auth.internal.zzai;
import com.google.firebase.auth.zze;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzpt  reason: invalid package */
public final class zzpt {
    /* access modifiers changed from: private */
    public final zzva zza;

    public zzpt(zzva zzva) {
        this.zza = (zzva) s.k(zzva);
    }

    private final void zzM(String str, zzuz<zzwq> zzuz) {
        s.k(zzuz);
        s.g(str);
        zzwq zzd = zzwq.zzd(str);
        if (zzd.zzj()) {
            zzuz.zzb(zzd);
            return;
        }
        this.zza.zzf(new zzwf(zzd.zzf()), new zzps(this, zzuz));
    }

    /* access modifiers changed from: private */
    public final void zzN(zzvy zzvy, zztl zztl) {
        s.k(zzvy);
        s.k(zztl);
        this.zza.zzc(zzvy, new zzof(this, zztl));
    }

    /* access modifiers changed from: private */
    public final void zzO(zzwq zzwq, String str, String str2, Boolean bool, zze zze, zztl zztl, zzuy zzuy) {
        s.k(zzwq);
        s.k(zzuy);
        s.k(zztl);
        this.zza.zzg(new zzwg(zzwq.zze()), new zzoi(this, zzuy, str2, str, bool, zze, zztl, zzwq));
    }

    private final void zzP(zzwn zzwn, zztl zztl) {
        s.k(zzwn);
        s.k(zztl);
        this.zza.zzh(zzwn, new zzpl(this, zztl));
    }

    static /* synthetic */ void zzc(zzpt zzpt, zzxs zzxs, zztl zztl, zzuy zzuy) {
        if (zzxs.zzp()) {
            zztl.zze(new zzny(zzxs.zzn() ? new Status(FirebaseError.ERROR_ACCOUNT_EXISTS_WITH_DIFFERENT_CREDENTIAL) : zzai.zza(zzxs.zze()), zzxs.zzc(), zzxs.zzd(), zzxs.zzk()));
            return;
        }
        zzpt.zzO(new zzwq(zzxs.zzj(), zzxs.zzf(), Long.valueOf(zzxs.zzb()), "Bearer"), zzxs.zzi(), zzxs.zzh(), Boolean.valueOf(zzxs.zzo()), zzxs.zzc(), zztl, zzuy);
    }

    static /* synthetic */ void zzd(zzpt zzpt, zztl zztl, zzwq zzwq, zzxg zzxg, zzuy zzuy) {
        s.k(zztl);
        s.k(zzwq);
        s.k(zzxg);
        s.k(zzuy);
        zzpt.zza.zzg(new zzwg(zzwq.zze()), new zzog(zzpt, zzuy, zztl, zzwq, zzxg));
    }

    static /* synthetic */ void zzf(zzpt zzpt, zztl zztl, zzwq zzwq, zzwj zzwj, zzxg zzxg, zzuy zzuy) {
        s.k(zztl);
        s.k(zzwq);
        s.k(zzwj);
        s.k(zzxg);
        s.k(zzuy);
        zzpt.zza.zzl(zzxg, new zzoh(zzpt, zzxg, zzwj, zztl, zzwq, zzuy));
    }

    public final void zzA(Context context, zzxq zzxq, zztl zztl) {
        s.k(zzxq);
        s.k(zztl);
        zzxq.zzd(true);
        this.zza.zzq((Context) null, zzxq, new zzpm(this, zztl));
    }

    public final void zzB(zzxt zzxt, zztl zztl) {
        s.k(zzxt);
        s.k(zztl);
        this.zza.zzr(zzxt, new zzpb(this, zztl));
    }

    public final void zzC(Context context, String str, String str2, String str3, zztl zztl) {
        s.g(str);
        s.g(str2);
        s.k(zztl);
        this.zza.zzs((Context) null, new zzxw(str, str2, str3), new zzod(this, zztl));
    }

    public final void zzD(EmailAuthCredential emailAuthCredential, zztl zztl) {
        s.k(emailAuthCredential);
        s.k(zztl);
        if (emailAuthCredential.zzh()) {
            zzM(emailAuthCredential.zzc(), new zzoe(this, emailAuthCredential, zztl));
        } else {
            zzN(new zzvy(emailAuthCredential, (String) null), zztl);
        }
    }

    public final void zzE(Context context, zzxy zzxy, zztl zztl) {
        s.k(zzxy);
        s.k(zztl);
        this.zza.zzt((Context) null, zzxy, new zzop(this, zztl));
    }

    public final void zzF(zzxk zzxk, zztl zztl) {
        s.k(zzxk);
        s.k(zztl);
        this.zza.zzo(zzxk, new zzpa(this, zztl));
    }

    public final void zzG(zzxm zzxm, zztl zztl) {
        s.k(zzxm);
        s.k(zztl);
        this.zza.zzp(zzxm, new zzpf(this, zztl));
    }

    public final void zzH(String str, String str2, zztl zztl) {
        s.g(str);
        s.g(str2);
        s.k(zztl);
        zzM(str, new zzoz(this, str2, zztl));
    }

    public final void zzI(String str, zztl zztl) {
        s.g(str);
        s.k(zztl);
        zzM(str, new zzov(this, zztl));
    }

    public final void zzJ(String str, String str2, zztl zztl) {
        s.g(str);
        s.g(str2);
        s.k(zztl);
        zzM(str2, new zzox(this, str, zztl));
    }

    public final void zzK(String str, UserProfileChangeRequest userProfileChangeRequest, zztl zztl) {
        s.g(str);
        s.k(userProfileChangeRequest);
        s.k(zztl);
        zzM(str, new zzpo(this, userProfileChangeRequest, zztl));
    }

    public final void zzL(zzwn zzwn, zztl zztl) {
        zzP(zzwn, zztl);
    }

    public final void zzg(String str, String str2, zztl zztl) {
        s.g(str);
        s.k(zztl);
        zzxg zzxg = new zzxg();
        zzxg.zzf(str);
        zzxg.zzi(str2);
        this.zza.zzl(zzxg, new zzpr(this, zztl));
    }

    public final void zzh(String str, String str2, zztl zztl) {
        s.g(str);
        s.g(str2);
        s.k(zztl);
        zzM(str, new zzpp(this, str2, zztl));
    }

    public final void zzi(String str, String str2, zztl zztl) {
        s.g(str);
        s.g(str2);
        s.k(zztl);
        zzM(str, new zzpq(this, str2, zztl));
    }

    public final void zzj(String str, String str2, zztl zztl) {
        s.g(str);
        s.k(zztl);
        this.zza.zzj(new zzxa(str, (String) null, str2), new zzol(this, zztl));
    }

    public final void zzk(String str, String str2, String str3, zztl zztl) {
        s.g(str);
        s.g(str2);
        s.k(zztl);
        this.zza.zzj(new zzxa(str, str2, str3), new zzon(this, zztl));
    }

    public final void zzl(String str, String str2, String str3, zztl zztl) {
        s.g(str);
        s.g(str2);
        s.k(zztl);
        this.zza.zzn(new zzxi(str, str2, (String) null, str3), new zzoc(this, zztl));
    }

    public final void zzm(String str, zztl zztl) {
        s.g(str);
        s.k(zztl);
        zzM(str, new zzpj(this, zztl));
    }

    public final void zzn(Context context, zzwa zzwa, String str, zztl zztl) {
        s.k(zzwa);
        s.k(zztl);
        zzM(str, new zzpd(this, zzwa, (Context) null, zztl));
    }

    public final void zzo(Context context, zzwc zzwc, zztl zztl) {
        s.k(zzwc);
        s.k(zztl);
        this.zza.zze((Context) null, zzwc, new zzpe(this, zztl));
    }

    public final void zzp(String str, zztl zztl) {
        s.g(str);
        s.k(zztl);
        this.zza.zzf(new zzwf(str), new zzom(this, zztl));
    }

    public final void zzq(String str, String str2, zztl zztl) {
        s.g(str);
        s.k(zztl);
        this.zza.zza(new zzvu(str, str2), new zzoj(this, zztl));
    }

    public final void zzr(String str, String str2, String str3, zztl zztl) {
        s.g(str);
        s.g(str2);
        s.g(str3);
        s.k(zztl);
        zzM(str3, new zzoq(this, str, str2, zztl));
    }

    public final void zzs(String str, zzxq zzxq, zztl zztl) {
        s.g(str);
        s.k(zzxq);
        s.k(zztl);
        zzM(str, new zzou(this, zzxq, zztl));
    }

    public final void zzt(Context context, String str, zzxy zzxy, zztl zztl) {
        s.g(str);
        s.k(zzxy);
        s.k(zztl);
        zzM(str, new zzos(this, zzxy, (Context) null, zztl));
    }

    public final void zzu(String str, zztl zztl) {
        s.g(str);
        s.k(zztl);
        zzM(str, new zzph(this, zztl));
    }

    public final void zzv(String str, ActionCodeSettings actionCodeSettings, zztl zztl) {
        s.g(str);
        s.k(zztl);
        zzwn zzwn = new zzwn(4);
        zzwn.zzg(str);
        if (actionCodeSettings != null) {
            zzwn.zzd(actionCodeSettings);
        }
        zzP(zzwn, zztl);
    }

    public final void zzw(String str, ActionCodeSettings actionCodeSettings, String str2, zztl zztl) {
        s.g(str);
        s.k(zztl);
        zzwn zzwn = new zzwn(actionCodeSettings.zza());
        zzwn.zze(str);
        zzwn.zzd(actionCodeSettings);
        zzwn.zzf(str2);
        this.zza.zzh(zzwn, new zzok(this, zztl));
    }

    public final void zzx(zzxd zzxd, zztl zztl) {
        s.g(zzxd.zzd());
        s.k(zztl);
        this.zza.zzk(zzxd, new zzoo(this, zztl));
    }

    public final void zzy(String str, zztl zztl) {
        s.k(zztl);
        this.zza.zzm(str, new zzpk(this, zztl));
    }

    public final void zzz(String str, zztl zztl) {
        s.k(zztl);
        this.zza.zzn(new zzxi(str), new zzpn(this, zztl));
    }
}
