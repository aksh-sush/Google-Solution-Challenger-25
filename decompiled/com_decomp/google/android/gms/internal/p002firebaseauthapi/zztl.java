package com.google.android.gms.internal.p002firebaseauthapi;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.s;
import com.google.firebase.auth.PhoneAuthCredential;
import u3.a;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zztl  reason: invalid package */
public class zztl {
    private final zztx zza;
    private final a zzb;

    public zztl(zztl zztl) {
        this(zztl.zza, zztl.zzb);
    }

    public final void zza(String str) {
        try {
            this.zza.zzd(str);
        } catch (RemoteException e10) {
            this.zzb.b("RemoteException when sending auto retrieval timeout response.", e10, new Object[0]);
        }
    }

    public void zzb(String str) {
        try {
            this.zza.zze(str);
        } catch (RemoteException e10) {
            this.zzb.b("RemoteException when sending send verification code response.", e10, new Object[0]);
        }
    }

    public final void zzc(zzvv zzvv) {
        try {
            this.zza.zzf(zzvv);
        } catch (RemoteException e10) {
            this.zzb.b("RemoteException when sending create auth uri response.", e10, new Object[0]);
        }
    }

    public final void zzd() {
        try {
            this.zza.zzg();
        } catch (RemoteException e10) {
            this.zzb.b("RemoteException when sending delete account response.", e10, new Object[0]);
        }
    }

    public final void zze(zzny zzny) {
        try {
            this.zza.zzh(zzny);
        } catch (RemoteException e10) {
            this.zzb.b("RemoteException when sending failure result with credential", e10, new Object[0]);
        }
    }

    public final void zzf(zzoa zzoa) {
        try {
            this.zza.zzi(zzoa);
        } catch (RemoteException e10) {
            this.zzb.b("RemoteException when sending failure result for mfa", e10, new Object[0]);
        }
    }

    public final void zzg(Status status, PhoneAuthCredential phoneAuthCredential) {
        try {
            this.zza.zzj(status, phoneAuthCredential);
        } catch (RemoteException e10) {
            this.zzb.b("RemoteException when sending failure result.", e10, new Object[0]);
        }
    }

    public void zzh(Status status) {
        try {
            this.zza.zzk(status);
        } catch (RemoteException e10) {
            this.zzb.b("RemoteException when sending failure result.", e10, new Object[0]);
        }
    }

    public final void zzi(zzwq zzwq, zzwj zzwj) {
        try {
            this.zza.zzl(zzwq, zzwj);
        } catch (RemoteException e10) {
            this.zzb.b("RemoteException when sending get token and account info user response", e10, new Object[0]);
        }
    }

    public final void zzj(zzxb zzxb) {
        try {
            this.zza.zzm(zzxb);
        } catch (RemoteException e10) {
            this.zzb.b("RemoteException when sending password reset response.", e10, new Object[0]);
        }
    }

    public final void zzk() {
        try {
            this.zza.zzn();
        } catch (RemoteException e10) {
            this.zzb.b("RemoteException when sending email verification response.", e10, new Object[0]);
        }
    }

    public final void zzl(String str) {
        try {
            this.zza.zzo(str);
        } catch (RemoteException e10) {
            this.zzb.b("RemoteException when sending set account info response.", e10, new Object[0]);
        }
    }

    public final void zzm() {
        try {
            this.zza.zzp();
        } catch (RemoteException e10) {
            this.zzb.b("RemoteException when setting FirebaseUI Version", e10, new Object[0]);
        }
    }

    public final void zzn(zzwq zzwq) {
        try {
            this.zza.zzq(zzwq);
        } catch (RemoteException e10) {
            this.zzb.b("RemoteException when sending token result.", e10, new Object[0]);
        }
    }

    public final void zzo(PhoneAuthCredential phoneAuthCredential) {
        try {
            this.zza.zzr(phoneAuthCredential);
        } catch (RemoteException e10) {
            this.zzb.b("RemoteException when sending verification completed response.", e10, new Object[0]);
        }
    }

    public zztl(zztx zztx, a aVar) {
        this.zza = (zztx) s.k(zztx);
        this.zzb = (a) s.k(aVar);
    }
}
