package com.google.android.gms.internal.p002firebaseauthapi;

import android.app.Activity;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import com.google.android.gms.common.api.internal.k;
import com.google.firebase.auth.PhoneAuthProvider;
import java.util.List;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzuo  reason: invalid package */
final class zzuo extends LifecycleCallback {
    private final List<PhoneAuthProvider.OnVerificationStateChangedCallbacks> zza;

    private zzuo(k kVar, List<PhoneAuthProvider.OnVerificationStateChangedCallbacks> list) {
        super(kVar);
        this.mLifecycleFragment.a("PhoneAuthActivityStopCallback", this);
        this.zza = list;
    }

    public static void zza(Activity activity, List<PhoneAuthProvider.OnVerificationStateChangedCallbacks> list) {
        k fragment = LifecycleCallback.getFragment(activity);
        if (((zzuo) fragment.b("PhoneAuthActivityStopCallback", zzuo.class)) == null) {
            new zzuo(fragment, list);
        }
    }

    public final void onStop() {
        synchronized (this.zza) {
            this.zza.clear();
        }
    }
}
