package com.google.firebase.auth.internal;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p002firebaseauthapi.zzto;
import com.google.firebase.FirebaseError;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import java.lang.ref.WeakReference;
import n4.j;

final class l extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    private final WeakReference f7708a;

    /* renamed from: b  reason: collision with root package name */
    private final j f7709b;

    /* renamed from: c  reason: collision with root package name */
    private final FirebaseAuth f7710c;

    /* renamed from: d  reason: collision with root package name */
    private final FirebaseUser f7711d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ zzax f7712e;

    l(zzax zzax, Activity activity, j jVar, FirebaseAuth firebaseAuth, FirebaseUser firebaseUser) {
        this.f7712e = zzax;
        this.f7708a = new WeakReference(activity);
        this.f7709b = jVar;
        this.f7710c = firebaseAuth;
        this.f7711d = firebaseUser;
    }

    public final void onReceive(Context context, Intent intent) {
        if (((Activity) this.f7708a.get()) == null) {
            Log.e("FederatedAuthReceiver", "Failed to unregister BroadcastReceiver because the Activity that launched this flow has been garbage collected; please do not finish() your Activity while performing a FederatedAuthProvider operation.");
            this.f7709b.b(zzto.zza(new Status((int) FirebaseError.ERROR_INTERNAL_ERROR, "Activity that started the web operation is no longer alive; see logcat for details")));
            zzax.zze(context);
        } else if (intent.hasExtra("com.google.firebase.auth.internal.OPERATION")) {
            String stringExtra = intent.getStringExtra("com.google.firebase.auth.internal.OPERATION");
            if ("com.google.firebase.auth.internal.NONGMSCORE_SIGN_IN".equals(stringExtra)) {
                this.f7710c.signInWithCredential(zzax.zzi(intent)).addOnSuccessListener(new g(this.f7712e, this.f7709b, context)).addOnFailureListener(new f(this.f7712e, this.f7709b, context));
            } else if ("com.google.firebase.auth.internal.NONGMSCORE_LINK".equals(stringExtra)) {
                this.f7711d.linkWithCredential(zzax.zzi(intent)).addOnSuccessListener(new i(this.f7712e, this.f7709b, context)).addOnFailureListener(new h(this.f7712e, this.f7709b, context));
            } else if ("com.google.firebase.auth.internal.NONGMSCORE_REAUTHENTICATE".equals(stringExtra)) {
                this.f7711d.reauthenticateAndRetrieveData(zzax.zzi(intent)).addOnSuccessListener(new k(this.f7712e, this.f7709b, context)).addOnFailureListener(new j(this.f7712e, this.f7709b, context));
            } else {
                j jVar = this.f7709b;
                StringBuilder sb2 = new StringBuilder(String.valueOf(stringExtra).length() + 50);
                sb2.append("WEB_CONTEXT_CANCELED:Unknown operation received (");
                sb2.append(stringExtra);
                sb2.append(")");
                jVar.b(zzto.zza(zzai.zza(sb2.toString())));
            }
        } else if (zzbl.zzd(intent)) {
            this.f7709b.b(zzto.zza(zzbl.zza(intent)));
            zzax.zze(context);
        } else if (intent.hasExtra("com.google.firebase.auth.internal.EXTRA_CANCELED")) {
            this.f7709b.b(zzto.zza(zzai.zza("WEB_CONTEXT_CANCELED")));
            zzax.zze(context);
        }
    }
}
