package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.api.internal.v;
import com.google.android.gms.common.internal.s;
import com.google.firebase.auth.PhoneAuthProvider;
import com.google.firebase.auth.PhoneMultiFactorInfo;
import n4.j;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzsn  reason: invalid package */
final class zzsn extends zzux<Void, PhoneAuthProvider.OnVerificationStateChangedCallbacks> {
    private final zznm zza;

    public zzsn(PhoneMultiFactorInfo phoneMultiFactorInfo, String str, String str2, long j10, boolean z10, boolean z11, String str3, String str4, boolean z12) {
        super(8);
        s.k(phoneMultiFactorInfo);
        s.g(str);
        this.zza = new zznm(phoneMultiFactorInfo, str, str2, j10, z10, z11, str3, str4, z12);
    }

    public final v zza() {
        return v.a().b(new zzsm(this)).a();
    }

    public final String zzb() {
        return "startMfaSignInWithPhoneNumber";
    }

    public final void zzc() {
    }

    public final /* synthetic */ void zzd(zztm zztm, j jVar) {
        this.zzv = new zzuw(this, jVar);
        zztm.zzq().zzB(this.zza, this.zzc);
    }
}
