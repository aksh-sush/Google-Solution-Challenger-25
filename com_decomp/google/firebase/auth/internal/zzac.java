package com.google.firebase.auth.internal;

import com.google.android.gms.common.internal.s;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.MultiFactor;
import com.google.firebase.auth.MultiFactorAssertion;
import com.google.firebase.auth.MultiFactorInfo;
import java.util.List;
import n4.i;

public final class zzac extends MultiFactor {
    private final zzx zza;

    public zzac(zzx zzx) {
        s.k(zzx);
        this.zza = zzx;
    }

    public final i enroll(MultiFactorAssertion multiFactorAssertion, String str) {
        s.k(multiFactorAssertion);
        zzx zzx = this.zza;
        return FirebaseAuth.getInstance(zzx.zza()).zzb(zzx, multiFactorAssertion, str);
    }

    public final List<MultiFactorInfo> getEnrolledFactors() {
        return this.zza.zzn();
    }

    public final i getSession() {
        return this.zza.getIdToken(false).continueWithTask(new b(this));
    }

    public final i unenroll(MultiFactorInfo multiFactorInfo) {
        s.k(multiFactorInfo);
        String uid = multiFactorInfo.getUid();
        s.g(uid);
        zzx zzx = this.zza;
        return FirebaseAuth.getInstance(zzx.zza()).zzl(zzx, uid);
    }

    public final i unenroll(String str) {
        s.g(str);
        zzx zzx = this.zza;
        return FirebaseAuth.getInstance(zzx.zza()).zzl(zzx, str);
    }
}
