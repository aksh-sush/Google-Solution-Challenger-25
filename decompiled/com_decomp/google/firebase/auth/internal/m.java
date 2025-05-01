package com.google.firebase.auth.internal;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p002firebaseauthapi.zzto;
import com.google.firebase.FirebaseError;
import java.lang.ref.WeakReference;
import n4.j;

final class m extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    private final WeakReference f7713a;

    /* renamed from: b  reason: collision with root package name */
    private final j f7714b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ zzax f7715c;

    m(zzax zzax, Activity activity, j jVar) {
        this.f7715c = zzax;
        this.f7713a = new WeakReference(activity);
        this.f7714b = jVar;
    }

    public final void onReceive(Context context, Intent intent) {
        if (((Activity) this.f7713a.get()) == null) {
            Log.e("FederatedAuthReceiver", "Failed to unregister BroadcastReceiver because the Activity that launched this flow has been garbage collected; please do not finish() your Activity while performing a FederatedAuthProvider operation.");
            this.f7714b.b(zzto.zza(new Status((int) FirebaseError.ERROR_INTERNAL_ERROR, "Activity that started the web operation is no longer alive; see logcat for details")));
            zzax.zze(context);
        } else if (intent.hasExtra("com.google.firebase.auth.internal.OPERATION")) {
            String stringExtra = intent.getStringExtra("com.google.firebase.auth.internal.OPERATION");
            if ("com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA".equals(stringExtra)) {
                this.f7714b.c(intent.getStringExtra("com.google.firebase.auth.internal.RECAPTCHA_TOKEN"));
                zzax.zze(context);
                return;
            }
            j jVar = this.f7714b;
            StringBuilder sb2 = new StringBuilder(String.valueOf(stringExtra).length() + 50);
            sb2.append("WEB_CONTEXT_CANCELED:Unknown operation received (");
            sb2.append(stringExtra);
            sb2.append(")");
            jVar.b(zzto.zza(zzai.zza(sb2.toString())));
        } else if (zzbl.zzd(intent)) {
            this.f7714b.b(zzto.zza(zzbl.zza(intent)));
            zzax.zze(context);
        } else if (intent.hasExtra("com.google.firebase.auth.internal.EXTRA_CANCELED")) {
            this.f7714b.b(zzto.zza(zzai.zza("WEB_CONTEXT_CANCELED")));
            zzax.zze(context);
        }
    }
}
