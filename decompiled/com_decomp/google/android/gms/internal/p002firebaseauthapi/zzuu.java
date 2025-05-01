package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.s;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.internal.zzai;
import com.google.firebase.auth.internal.zzao;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzuu  reason: invalid package */
final class zzuu extends zztw {
    final /* synthetic */ zzux zza;

    zzuu(zzux zzux) {
        this.zza = zzux;
    }

    private final void zzb(zzuv zzuv) {
        this.zza.zzi.execute(new zzut(this, zzuv));
    }

    private final void zzc(Status status, AuthCredential authCredential, String str, String str2) {
        zzux.zzk(this.zza, status);
        zzux zzux = this.zza;
        zzux.zzp = authCredential;
        zzux.zzq = str;
        zzux.zzr = str2;
        zzao zzao = zzux.zzg;
        if (zzao != null) {
            zzao.zzb(status);
        }
        this.zza.zzl(status);
    }

    public final void zzd(String str) {
        int i10 = this.zza.zzb;
        boolean z10 = i10 == 8;
        StringBuilder sb2 = new StringBuilder(36);
        sb2.append("Unexpected response type ");
        sb2.append(i10);
        s.o(z10, sb2.toString());
        zzux zzux = this.zza;
        zzux.zzo = str;
        boolean unused = zzux.zza = true;
        zzb(new zzur(this, str));
    }

    public final void zze(String str) {
        int i10 = this.zza.zzb;
        boolean z10 = i10 == 8;
        StringBuilder sb2 = new StringBuilder(36);
        sb2.append("Unexpected response type ");
        sb2.append(i10);
        s.o(z10, sb2.toString());
        this.zza.zzo = str;
        zzb(new zzup(this, str));
    }

    public final void zzf(zzvv zzvv) {
        int i10 = this.zza.zzb;
        boolean z10 = i10 == 3;
        StringBuilder sb2 = new StringBuilder(36);
        sb2.append("Unexpected response type ");
        sb2.append(i10);
        s.o(z10, sb2.toString());
        zzux zzux = this.zza;
        zzux.zzl = zzvv;
        zzux.zzj(zzux);
    }

    public final void zzg() {
        int i10 = this.zza.zzb;
        boolean z10 = i10 == 5;
        StringBuilder sb2 = new StringBuilder(36);
        sb2.append("Unexpected response type ");
        sb2.append(i10);
        s.o(z10, sb2.toString());
        zzux.zzj(this.zza);
    }

    public final void zzh(zzny zzny) {
        zzc(zzny.zza(), zzny.zzb(), zzny.zzc(), zzny.zzd());
    }

    public final void zzi(zzoa zzoa) {
        zzux zzux = this.zza;
        zzux.zzs = zzoa;
        zzux.zzl(zzai.zza("REQUIRES_SECOND_FACTOR_AUTH"));
    }

    public final void zzj(Status status, PhoneAuthCredential phoneAuthCredential) {
        int i10 = this.zza.zzb;
        boolean z10 = i10 == 2;
        StringBuilder sb2 = new StringBuilder(36);
        sb2.append("Unexpected response type ");
        sb2.append(i10);
        s.o(z10, sb2.toString());
        zzc(status, phoneAuthCredential, (String) null, (String) null);
    }

    public final void zzk(Status status) {
        String W = status.W();
        if (W != null) {
            if (W.contains("MISSING_MFA_PENDING_CREDENTIAL")) {
                status = new Status(17081);
            } else if (W.contains("MISSING_MFA_ENROLLMENT_ID")) {
                status = new Status(17082);
            } else if (W.contains("INVALID_MFA_PENDING_CREDENTIAL")) {
                status = new Status(17083);
            } else if (W.contains("MFA_ENROLLMENT_NOT_FOUND")) {
                status = new Status(17084);
            } else if (W.contains("ADMIN_ONLY_OPERATION")) {
                status = new Status(17085);
            } else if (W.contains("UNVERIFIED_EMAIL")) {
                status = new Status(17086);
            } else if (W.contains("SECOND_FACTOR_EXISTS")) {
                status = new Status(17087);
            } else if (W.contains("SECOND_FACTOR_LIMIT_EXCEEDED")) {
                status = new Status(17088);
            } else if (W.contains("UNSUPPORTED_FIRST_FACTOR")) {
                status = new Status(17089);
            } else if (W.contains("EMAIL_CHANGE_NEEDS_VERIFICATION")) {
                status = new Status(17090);
            }
        }
        zzux zzux = this.zza;
        if (zzux.zzb == 8) {
            boolean unused = zzux.zza = true;
            zzb(new zzus(this, status));
            return;
        }
        zzux.zzk(zzux, status);
        this.zza.zzl(status);
    }

    public final void zzl(zzwq zzwq, zzwj zzwj) {
        int i10 = this.zza.zzb;
        boolean z10 = i10 == 2;
        StringBuilder sb2 = new StringBuilder(37);
        sb2.append("Unexpected response type: ");
        sb2.append(i10);
        s.o(z10, sb2.toString());
        zzux zzux = this.zza;
        zzux.zzj = zzwq;
        zzux.zzk = zzwj;
        zzux.zzj(zzux);
    }

    public final void zzm(zzxb zzxb) {
        int i10 = this.zza.zzb;
        boolean z10 = i10 == 4;
        StringBuilder sb2 = new StringBuilder(36);
        sb2.append("Unexpected response type ");
        sb2.append(i10);
        s.o(z10, sb2.toString());
        zzux zzux = this.zza;
        zzux.zzm = zzxb;
        zzux.zzj(zzux);
    }

    public final void zzn() {
        int i10 = this.zza.zzb;
        boolean z10 = i10 == 6;
        StringBuilder sb2 = new StringBuilder(36);
        sb2.append("Unexpected response type ");
        sb2.append(i10);
        s.o(z10, sb2.toString());
        zzux.zzj(this.zza);
    }

    public final void zzo(String str) {
        int i10 = this.zza.zzb;
        boolean z10 = i10 == 7;
        StringBuilder sb2 = new StringBuilder(36);
        sb2.append("Unexpected response type ");
        sb2.append(i10);
        s.o(z10, sb2.toString());
        zzux zzux = this.zza;
        zzux.zzn = str;
        zzux.zzj(zzux);
    }

    public final void zzp() {
        int i10 = this.zza.zzb;
        boolean z10 = i10 == 9;
        StringBuilder sb2 = new StringBuilder(36);
        sb2.append("Unexpected response type ");
        sb2.append(i10);
        s.o(z10, sb2.toString());
        zzux.zzj(this.zza);
    }

    public final void zzq(zzwq zzwq) {
        int i10 = this.zza.zzb;
        boolean z10 = true;
        if (i10 != 1) {
            z10 = false;
        }
        StringBuilder sb2 = new StringBuilder(37);
        sb2.append("Unexpected response type: ");
        sb2.append(i10);
        s.o(z10, sb2.toString());
        zzux zzux = this.zza;
        zzux.zzj = zzwq;
        zzux.zzj(zzux);
    }

    public final void zzr(PhoneAuthCredential phoneAuthCredential) {
        int i10 = this.zza.zzb;
        boolean z10 = i10 == 8;
        StringBuilder sb2 = new StringBuilder(36);
        sb2.append("Unexpected response type ");
        sb2.append(i10);
        s.o(z10, sb2.toString());
        boolean unused = this.zza.zza = true;
        zzb(new zzuq(this, phoneAuthCredential));
    }
}
