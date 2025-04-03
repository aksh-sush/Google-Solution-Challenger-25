package com.google.android.gms.internal.p002firebaseauthapi;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzvl  reason: invalid package */
final class zzvl extends BroadcastReceiver {
    final /* synthetic */ zzvn zza;
    private final String zzb;

    public zzvl(zzvn zzvn, String str) {
        this.zza = zzvn;
        this.zzb = str;
    }

    public final void onReceive(Context context, Intent intent) {
        if ("com.google.android.gms.auth.api.phone.SMS_RETRIEVED".equals(intent.getAction())) {
            Bundle extras = intent.getExtras();
            if (((Status) extras.get("com.google.android.gms.auth.api.phone.EXTRA_STATUS")).V() == 0) {
                String str = (String) extras.get("com.google.android.gms.auth.api.phone.EXTRA_SMS_MESSAGE");
                zzvm zzvm = (zzvm) this.zza.zzd.get(this.zzb);
                if (zzvm == null) {
                    zzvn.zza.c("Verification code received with no active retrieval session.", new Object[0]);
                } else {
                    String zzb2 = zzvn.zzb(str);
                    zzvm.zze = zzb2;
                    if (zzb2 == null) {
                        zzvn.zza.c("Unable to extract verification code.", new Object[0]);
                    } else if (!zzaf.zzd(zzvm.zzd)) {
                        zzvn.zze(this.zza, this.zzb);
                    }
                }
            }
            context.getApplicationContext().unregisterReceiver(this);
        }
    }
}
