package com.google.firebase.auth;

import com.google.android.gms.common.internal.s;
import com.google.firebase.FirebaseException;
import com.google.firebase.auth.PhoneAuthProvider;

final class m extends PhoneAuthProvider.OnVerificationStateChangedCallbacks {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ PhoneAuthProvider.OnVerificationStateChangedCallbacks f7736a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ FirebaseAuth f7737b;

    m(FirebaseAuth firebaseAuth, PhoneAuthProvider.OnVerificationStateChangedCallbacks onVerificationStateChangedCallbacks) {
        this.f7737b = firebaseAuth;
        this.f7736a = onVerificationStateChangedCallbacks;
    }

    public final void onCodeAutoRetrievalTimeOut(String str) {
    }

    public final void onCodeSent(String str, PhoneAuthProvider.ForceResendingToken forceResendingToken) {
        this.f7736a.onVerificationCompleted(PhoneAuthProvider.getCredential(str, (String) s.k(this.f7737b.zzg.zzb())));
    }

    public final void onVerificationCompleted(PhoneAuthCredential phoneAuthCredential) {
        this.f7736a.onVerificationCompleted(phoneAuthCredential);
    }

    public final void onVerificationFailed(FirebaseException firebaseException) {
        this.f7736a.onVerificationFailed(firebaseException);
    }
}
