package com.google.android.gms.internal.p002firebaseauthapi;

import android.content.Context;
import com.google.android.gms.common.internal.s;
import com.google.firebase.auth.PhoneAuthCredential;
import u3.a;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zztp  reason: invalid package */
public final class zztp extends zztz {
    private static final a zza = new a("FirebaseAuth", "FirebaseAuthFallback:");
    private final zzpt zzb;
    private final zzvn zzc;

    public zztp(Context context, String str) {
        s.k(context);
        Context context2 = context;
        this.zzb = new zzpt(new zzul(context2, s.g(str), zzuk.zza(), (zzve) null, (zzub) null, (zzuc) null));
        this.zzc = new zzvn(context);
    }

    private static boolean zzH(long j10, boolean z10) {
        if (j10 > 0 && z10) {
            return true;
        }
        zza.h("App hash will not be appended to the request.", new Object[0]);
        return false;
    }

    public final void zzA(zznk zznk, zztx zztx) {
        s.k(zznk);
        s.k(zztx);
        String zzd = zznk.zzd();
        zztl zztl = new zztl(zztx, zza);
        if (this.zzc.zzl(zzd)) {
            if (zznk.zzg()) {
                this.zzc.zzj(zzd);
            } else {
                this.zzc.zzi(zztl, zzd);
                return;
            }
        }
        long zza2 = zznk.zza();
        boolean zzh = zznk.zzh();
        zzxk zzb2 = zzxk.zzb(zznk.zzb(), zznk.zzd(), zznk.zzc(), zznk.zze(), zznk.zzf());
        if (zzH(zza2, zzh)) {
            zzb2.zzd(new zzvs(this.zzc.zzc()));
        }
        this.zzc.zzk(zzd, zztl, zza2, zzh);
        this.zzb.zzF(zzb2, new zzvk(this.zzc, zztl, zzd));
    }

    public final void zzB(zznm zznm, zztx zztx) {
        s.k(zznm);
        s.k(zztx);
        String phoneNumber = zznm.zzb().getPhoneNumber();
        zztl zztl = new zztl(zztx, zza);
        if (this.zzc.zzl(phoneNumber)) {
            if (zznm.zzg()) {
                this.zzc.zzj(phoneNumber);
            } else {
                this.zzc.zzi(zztl, phoneNumber);
                return;
            }
        }
        long zza2 = zznm.zza();
        boolean zzh = zznm.zzh();
        zzxm zzb2 = zzxm.zzb(zznm.zzd(), zznm.zzb().getUid(), zznm.zzb().getPhoneNumber(), zznm.zzc(), zznm.zze(), zznm.zzf());
        if (zzH(zza2, zzh)) {
            zzb2.zzd(new zzvs(this.zzc.zzc()));
        }
        this.zzc.zzk(phoneNumber, zztl, zza2, zzh);
        this.zzb.zzG(zzb2, new zzvk(this.zzc, zztl, phoneNumber));
    }

    public final void zzC(zzno zzno, zztx zztx) {
        s.k(zzno);
        s.k(zztx);
        this.zzb.zzH(zzno.zza(), zzno.zzb(), new zztl(zztx, zza));
    }

    public final void zzD(zznq zznq, zztx zztx) {
        s.k(zznq);
        s.g(zznq.zza());
        s.k(zztx);
        this.zzb.zzI(zznq.zza(), new zztl(zztx, zza));
    }

    public final void zzE(zzns zzns, zztx zztx) {
        s.k(zzns);
        s.g(zzns.zzb());
        s.g(zzns.zza());
        s.k(zztx);
        this.zzb.zzJ(zzns.zzb(), zzns.zza(), new zztl(zztx, zza));
    }

    public final void zzF(zznu zznu, zztx zztx) {
        s.k(zznu);
        s.g(zznu.zzb());
        s.k(zznu.zza());
        s.k(zztx);
        this.zzb.zzK(zznu.zzb(), zznu.zza(), new zztl(zztx, zza));
    }

    public final void zzG(zznw zznw, zztx zztx) {
        s.k(zznw);
        this.zzb.zzL(zzwn.zzc(zznw.zza(), zznw.zzb(), zznw.zzc()), new zztl(zztx, zza));
    }

    public final void zzb(zzlm zzlm, zztx zztx) {
        s.k(zzlm);
        s.g(zzlm.zza());
        s.k(zztx);
        this.zzb.zzg(zzlm.zza(), zzlm.zzb(), new zztl(zztx, zza));
    }

    public final void zzc(zzlo zzlo, zztx zztx) {
        s.k(zzlo);
        s.g(zzlo.zza());
        s.g(zzlo.zzb());
        s.k(zztx);
        this.zzb.zzh(zzlo.zza(), zzlo.zzb(), new zztl(zztx, zza));
    }

    public final void zzd(zzlq zzlq, zztx zztx) {
        s.k(zzlq);
        s.g(zzlq.zza());
        s.g(zzlq.zzb());
        s.k(zztx);
        this.zzb.zzi(zzlq.zza(), zzlq.zzb(), new zztl(zztx, zza));
    }

    public final void zze(zzls zzls, zztx zztx) {
        s.k(zzls);
        s.g(zzls.zza());
        s.k(zztx);
        this.zzb.zzj(zzls.zza(), zzls.zzb(), new zztl(zztx, zza));
    }

    public final void zzf(zzlu zzlu, zztx zztx) {
        s.k(zzlu);
        s.g(zzlu.zza());
        s.g(zzlu.zzb());
        s.k(zztx);
        this.zzb.zzk(zzlu.zza(), zzlu.zzb(), zzlu.zzc(), new zztl(zztx, zza));
    }

    public final void zzg(zzlw zzlw, zztx zztx) {
        s.k(zzlw);
        s.g(zzlw.zza());
        s.g(zzlw.zzb());
        s.k(zztx);
        this.zzb.zzl(zzlw.zza(), zzlw.zzb(), zzlw.zzc(), new zztl(zztx, zza));
    }

    public final void zzh(zzly zzly, zztx zztx) {
        s.k(zzly);
        s.g(zzly.zza());
        s.k(zztx);
        this.zzb.zzm(zzly.zza(), new zztl(zztx, zza));
    }

    public final void zzi(zzma zzma, zztx zztx) {
        s.k(zzma);
        s.k(zztx);
        this.zzb.zzn((Context) null, zzwa.zzb(zzma.zzb(), zzma.zza().zzg(), zzma.zza().getSmsCode(), zzma.zzc()), zzma.zzb(), new zztl(zztx, zza));
    }

    public final void zzj(zzmc zzmc, zztx zztx) {
        s.k(zzmc);
        s.k(zztx);
        this.zzb.zzo((Context) null, zzwc.zzb(zzmc.zzb(), zzmc.zza().zzg(), zzmc.zza().getSmsCode()), new zztl(zztx, zza));
    }

    public final void zzk(zzme zzme, zztx zztx) {
        s.k(zzme);
        s.k(zztx);
        s.g(zzme.zza());
        this.zzb.zzp(zzme.zza(), new zztl(zztx, zza));
    }

    public final void zzl(zzmg zzmg, zztx zztx) {
        s.k(zzmg);
        s.g(zzmg.zza());
        this.zzb.zzq(zzmg.zza(), zzmg.zzb(), new zztl(zztx, zza));
    }

    public final void zzm(zzmi zzmi, zztx zztx) {
        s.k(zzmi);
        s.g(zzmi.zzb());
        s.g(zzmi.zzc());
        s.g(zzmi.zza());
        s.k(zztx);
        this.zzb.zzr(zzmi.zzb(), zzmi.zzc(), zzmi.zza(), new zztl(zztx, zza));
    }

    public final void zzn(zzmk zzmk, zztx zztx) {
        s.k(zzmk);
        s.g(zzmk.zzb());
        s.k(zzmk.zza());
        s.k(zztx);
        this.zzb.zzs(zzmk.zzb(), zzmk.zza(), new zztl(zztx, zza));
    }

    public final void zzo(zzmm zzmm, zztx zztx) {
        s.k(zztx);
        s.k(zzmm);
        this.zzb.zzt((Context) null, s.g(zzmm.zzb()), zzvd.zza((PhoneAuthCredential) s.k(zzmm.zza())), new zztl(zztx, zza));
    }

    public final void zzp(zzmo zzmo, zztx zztx) {
        s.k(zzmo);
        s.g(zzmo.zza());
        s.k(zztx);
        this.zzb.zzu(zzmo.zza(), new zztl(zztx, zza));
    }

    public final void zzq(zzmq zzmq, zztx zztx) {
        s.k(zzmq);
        s.g(zzmq.zzb());
        s.k(zztx);
        this.zzb.zzv(zzmq.zzb(), zzmq.zza(), new zztl(zztx, zza));
    }

    public final void zzr(zzms zzms, zztx zztx) {
        s.k(zzms);
        s.g(zzms.zzb());
        s.k(zztx);
        this.zzb.zzw(zzms.zzb(), zzms.zza(), zzms.zzc(), new zztl(zztx, zza));
    }

    public final void zzs(zzmu zzmu, zztx zztx) {
        s.k(zztx);
        s.k(zzmu);
        zzxd zzxd = (zzxd) s.k(zzmu.zza());
        String zzd = zzxd.zzd();
        zztl zztl = new zztl(zztx, zza);
        if (this.zzc.zzl(zzd)) {
            if (zzxd.zzf()) {
                this.zzc.zzj(zzd);
            } else {
                this.zzc.zzi(zztl, zzd);
                return;
            }
        }
        long zzb2 = zzxd.zzb();
        boolean zzg = zzxd.zzg();
        if (zzH(zzb2, zzg)) {
            zzxd.zze(new zzvs(this.zzc.zzc()));
        }
        this.zzc.zzk(zzd, zztl, zzb2, zzg);
        this.zzb.zzx(zzxd, new zzvk(this.zzc, zztl, zzd));
    }

    public final void zzt(zzmw zzmw, zztx zztx) {
        s.k(zzmw);
        s.k(zztx);
        this.zzb.zzy(zzmw.zza(), new zztl(zztx, zza));
    }

    public final void zzu(zzmy zzmy, zztx zztx) {
        s.k(zzmy);
        s.k(zztx);
        this.zzb.zzz(zzmy.zza(), new zztl(zztx, zza));
    }

    public final void zzv(zzna zzna, zztx zztx) {
        s.k(zzna);
        s.k(zzna.zza());
        s.k(zztx);
        this.zzb.zzA((Context) null, zzna.zza(), new zztl(zztx, zza));
    }

    public final void zzw(zznc zznc, zztx zztx) {
        s.k(zznc);
        s.g(zznc.zzb());
        s.k(zztx);
        this.zzb.zzB(new zzxt(zznc.zzb(), zznc.zza()), new zztl(zztx, zza));
    }

    public final void zzx(zzne zzne, zztx zztx) {
        s.k(zzne);
        s.g(zzne.zza());
        s.g(zzne.zzb());
        s.k(zztx);
        this.zzb.zzC((Context) null, zzne.zza(), zzne.zzb(), zzne.zzc(), new zztl(zztx, zza));
    }

    public final void zzy(zzng zzng, zztx zztx) {
        s.k(zzng);
        s.k(zzng.zza());
        s.k(zztx);
        this.zzb.zzD(zzng.zza(), new zztl(zztx, zza));
    }

    public final void zzz(zzni zzni, zztx zztx) {
        s.k(zztx);
        s.k(zzni);
        this.zzb.zzE((Context) null, zzvd.zza((PhoneAuthCredential) s.k(zzni.zza())), new zztl(zztx, zza));
    }
}
