package com.google.firebase.auth.internal;

import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.internal.p002firebaseauthapi.zzto;
import com.google.android.gms.internal.p002firebaseauthapi.zzuk;
import com.google.android.gms.internal.p002firebaseauthapi.zzvr;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.FirebaseAuth;
import i4.d;
import i4.f;
import java.io.UnsupportedEncodingException;
import n4.i;
import n4.j;
import n4.l;

public final class zzf {
    /* access modifiers changed from: private */
    public static final String zza = "zzf";
    private static final zzf zzb = new zzf();

    private zzf() {
    }

    public static zzf zzb() {
        return zzb;
    }

    /* access modifiers changed from: private */
    public final void zze(FirebaseAuth firebaseAuth, zzbm zzbm, Activity activity, j jVar) {
        i iVar;
        zzbm.zzg(firebaseAuth.getApp().getApplicationContext(), firebaseAuth);
        s.k(activity);
        j jVar2 = new j();
        if (!zzax.zza().zzg(activity, jVar2)) {
            iVar = l.d(zzto.zza(new Status(17057, "reCAPTCHA flow already in progress")));
        } else {
            Intent intent = new Intent("com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA");
            intent.setClass(activity, RecaptchaActivity.class);
            intent.setPackage(activity.getPackageName());
            intent.putExtra("com.google.firebase.auth.KEY_API_KEY", firebaseAuth.getApp().getOptions().getApiKey());
            if (!TextUtils.isEmpty(firebaseAuth.getTenantId())) {
                intent.putExtra("com.google.firebase.auth.KEY_TENANT_ID", firebaseAuth.getTenantId());
            }
            intent.putExtra("com.google.firebase.auth.internal.CLIENT_VERSION", zzuk.zza().zzb());
            intent.putExtra("com.google.firebase.auth.internal.FIREBASE_APP_NAME", firebaseAuth.getApp().getName());
            activity.startActivity(intent);
            iVar = jVar2.a();
        }
        iVar.addOnSuccessListener(new s(this, jVar)).addOnFailureListener(new q(this, jVar));
    }

    public final i zza(FirebaseAuth firebaseAuth, String str, Activity activity, boolean z10) {
        zze zze;
        zzw zzw = (zzw) firebaseAuth.getFirebaseAuthSettings();
        f a10 = z10 ? d.a(firebaseAuth.getApp().getApplicationContext()) : null;
        zzbm zzc = zzbm.zzc();
        if (zzvr.zzg(firebaseAuth.getApp()) || zzw.zze()) {
            zze = new zze((String) null, (String) null);
        } else {
            j jVar = new j();
            i zzb2 = zzc.zzb();
            if (zzb2 != null) {
                if (zzb2.isSuccessful()) {
                    zze = new zze((String) null, (String) zzb2.getResult());
                } else {
                    String str2 = zza;
                    String valueOf = String.valueOf(zzb2.getException().getMessage());
                    Log.e(str2, valueOf.length() != 0 ? "Error in previous reCAPTCHA flow: ".concat(valueOf) : new String("Error in previous reCAPTCHA flow: "));
                    Log.e(str2, "Continuing with application verification as normal");
                }
            }
            if (a10 == null || zzw.zzc()) {
                zze(firebaseAuth, zzc, activity, jVar);
            } else {
                FirebaseApp app = firebaseAuth.getApp();
                byte[] bArr = new byte[0];
                if (str != null) {
                    try {
                        bArr = str.getBytes("UTF-8");
                    } catch (UnsupportedEncodingException e10) {
                        String str3 = zza;
                        String valueOf2 = String.valueOf(e10.getMessage());
                        Log.e(str3, valueOf2.length() != 0 ? "Failed to getBytes with exception: ".concat(valueOf2) : new String("Failed to getBytes with exception: "));
                    }
                }
                a10.d(bArr, app.getOptions().getApiKey()).addOnSuccessListener(new o(this, jVar, firebaseAuth, zzc, activity)).addOnFailureListener(new a(this, firebaseAuth, zzc, activity, jVar));
            }
            return jVar.a();
        }
        return l.e(zze);
    }
}
