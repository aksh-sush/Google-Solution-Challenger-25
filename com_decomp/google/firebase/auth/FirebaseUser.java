package com.google.firebase.auth;

import android.app.Activity;
import android.net.Uri;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.internal.p002firebaseauthapi.zzwq;
import com.google.firebase.FirebaseApp;
import java.util.List;
import n4.i;
import s3.a;

public abstract class FirebaseUser extends a implements UserInfo {
    public i delete() {
        return FirebaseAuth.getInstance(zza()).zza(this);
    }

    public abstract String getDisplayName();

    public abstract String getEmail();

    public i getIdToken(boolean z10) {
        return FirebaseAuth.getInstance(zza()).zzc(this, z10);
    }

    public abstract FirebaseUserMetadata getMetadata();

    public abstract MultiFactor getMultiFactor();

    public abstract String getPhoneNumber();

    public abstract Uri getPhotoUrl();

    public abstract List<? extends UserInfo> getProviderData();

    public abstract String getProviderId();

    public abstract String getTenantId();

    public abstract String getUid();

    public abstract boolean isAnonymous();

    public i linkWithCredential(AuthCredential authCredential) {
        s.k(authCredential);
        return FirebaseAuth.getInstance(zza()).zzd(this, authCredential);
    }

    public i reauthenticate(AuthCredential authCredential) {
        s.k(authCredential);
        return FirebaseAuth.getInstance(zza()).zze(this, authCredential);
    }

    public i reauthenticateAndRetrieveData(AuthCredential authCredential) {
        s.k(authCredential);
        return FirebaseAuth.getInstance(zza()).zzf(this, authCredential);
    }

    public i reload() {
        FirebaseAuth instance = FirebaseAuth.getInstance(zza());
        return instance.zzg(this, new p(instance));
    }

    public i sendEmailVerification() {
        return FirebaseAuth.getInstance(zza()).zzc(this, false).continueWithTask(new s(this));
    }

    public i startActivityForLinkWithProvider(Activity activity, FederatedAuthProvider federatedAuthProvider) {
        s.k(activity);
        s.k(federatedAuthProvider);
        return FirebaseAuth.getInstance(zza()).zzj(activity, federatedAuthProvider, this);
    }

    public i startActivityForReauthenticateWithProvider(Activity activity, FederatedAuthProvider federatedAuthProvider) {
        s.k(activity);
        s.k(federatedAuthProvider);
        return FirebaseAuth.getInstance(zza()).zzk(activity, federatedAuthProvider, this);
    }

    public i unlink(String str) {
        s.g(str);
        return FirebaseAuth.getInstance(zza()).zzm(this, str);
    }

    public i updateEmail(String str) {
        s.g(str);
        return FirebaseAuth.getInstance(zza()).zzn(this, str);
    }

    public i updatePassword(String str) {
        s.g(str);
        return FirebaseAuth.getInstance(zza()).zzo(this, str);
    }

    public i updatePhoneNumber(PhoneAuthCredential phoneAuthCredential) {
        return FirebaseAuth.getInstance(zza()).zzp(this, phoneAuthCredential);
    }

    public i updateProfile(UserProfileChangeRequest userProfileChangeRequest) {
        s.k(userProfileChangeRequest);
        return FirebaseAuth.getInstance(zza()).zzq(this, userProfileChangeRequest);
    }

    public i verifyBeforeUpdateEmail(String str) {
        return verifyBeforeUpdateEmail(str, (ActionCodeSettings) null);
    }

    public abstract FirebaseApp zza();

    public abstract FirebaseUser zzb();

    public abstract FirebaseUser zzc(List<? extends UserInfo> list);

    public abstract zzwq zzd();

    public abstract String zze();

    public abstract String zzf();

    public abstract List<String> zzg();

    public abstract void zzh(zzwq zzwq);

    public abstract void zzi(List<MultiFactorInfo> list);

    public i sendEmailVerification(ActionCodeSettings actionCodeSettings) {
        return FirebaseAuth.getInstance(zza()).zzc(this, false).continueWithTask(new t(this, actionCodeSettings));
    }

    public i verifyBeforeUpdateEmail(String str, ActionCodeSettings actionCodeSettings) {
        return FirebaseAuth.getInstance(zza()).zzc(this, false).continueWithTask(new u(this, str, actionCodeSettings));
    }
}
