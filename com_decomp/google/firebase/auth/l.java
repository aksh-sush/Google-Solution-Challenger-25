package com.google.firebase.auth;

import android.util.Log;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.internal.p002firebaseauthapi.zztk;
import com.google.firebase.auth.PhoneAuthProvider;
import com.google.firebase.auth.internal.zzag;
import com.google.firebase.auth.internal.zze;
import n4.d;
import n4.i;

final class l implements d {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ PhoneAuthOptions f7734a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ FirebaseAuth f7735b;

    l(FirebaseAuth firebaseAuth, PhoneAuthOptions phoneAuthOptions) {
        this.f7735b = firebaseAuth;
        this.f7734a = phoneAuthOptions;
    }

    public final void a(i iVar) {
        String str;
        String str2;
        if (!iVar.isSuccessful()) {
            String str3 = "Error while validating application identity: ";
            if (iVar.getException() != null) {
                String valueOf = String.valueOf(iVar.getException().getMessage());
                str3 = valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3);
            }
            Log.e("FirebaseAuth", str3);
            Log.e("FirebaseAuth", "Proceeding without any application identifier.");
            str2 = null;
            str = null;
        } else {
            str2 = ((zze) iVar.getResult()).zzb();
            str = ((zze) iVar.getResult()).zza();
        }
        long longValue = this.f7734a.zzg().longValue();
        PhoneAuthProvider.OnVerificationStateChangedCallbacks zzt = this.f7735b.zzJ(this.f7734a.zzh(), this.f7734a.zze());
        zzag zzag = (zzag) s.k(this.f7734a.zzc());
        if (zzag.zze()) {
            this.f7735b.zze.zzH(zzag, (String) s.k(this.f7734a.zzh()), this.f7735b.zzi, longValue, this.f7734a.zzd() != null, this.f7734a.zzj(), str2, str, zztk.zzb(), zzt, this.f7734a.zzi(), this.f7734a.zza());
        } else {
            this.f7735b.zze.zzI(zzag, (PhoneMultiFactorInfo) s.k(this.f7734a.zzf()), this.f7735b.zzi, longValue, this.f7734a.zzd() != null, this.f7734a.zzj(), str2, str, zztk.zzb(), zzt, this.f7734a.zzi(), this.f7734a.zza());
        }
    }
}
