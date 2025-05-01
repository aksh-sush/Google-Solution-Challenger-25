package com.google.firebase.auth;

import android.app.Activity;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Keep;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.internal.p002firebaseauthapi.zzti;
import com.google.android.gms.internal.p002firebaseauthapi.zztk;
import com.google.android.gms.internal.p002firebaseauthapi.zzto;
import com.google.android.gms.internal.p002firebaseauthapi.zzue;
import com.google.android.gms.internal.p002firebaseauthapi.zzug;
import com.google.android.gms.internal.p002firebaseauthapi.zzun;
import com.google.android.gms.internal.p002firebaseauthapi.zzvh;
import com.google.android.gms.internal.p002firebaseauthapi.zzvr;
import com.google.android.gms.internal.p002firebaseauthapi.zzwq;
import com.google.android.gms.internal.p002firebaseauthapi.zzxd;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseError;
import com.google.firebase.auth.PhoneAuthProvider;
import com.google.firebase.auth.internal.InternalAuthProvider;
import com.google.firebase.auth.internal.zzag;
import com.google.firebase.auth.internal.zzay;
import com.google.firebase.auth.internal.zzbg;
import com.google.firebase.auth.internal.zzbi;
import com.google.firebase.auth.internal.zzbj;
import com.google.firebase.auth.internal.zzbk;
import com.google.firebase.auth.internal.zzbm;
import com.google.firebase.auth.internal.zzf;
import com.google.firebase.auth.internal.zzr;
import com.google.firebase.auth.internal.zzw;
import com.google.firebase.auth.internal.zzx;
import com.google.firebase.internal.InternalTokenResult;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import n4.i;
import n4.j;
import n4.l;

public abstract class FirebaseAuth implements InternalAuthProvider {
    private FirebaseApp zza;
    /* access modifiers changed from: private */
    public final List<IdTokenListener> zzb = new CopyOnWriteArrayList();
    /* access modifiers changed from: private */
    public final List<com.google.firebase.auth.internal.IdTokenListener> zzc = new CopyOnWriteArrayList();
    /* access modifiers changed from: private */
    public List<AuthStateListener> zzd = new CopyOnWriteArrayList();
    /* access modifiers changed from: private */
    public zzti zze;
    /* access modifiers changed from: private */
    public FirebaseUser zzf;
    /* access modifiers changed from: private */
    public zzw zzg;
    private final Object zzh = new Object();
    /* access modifiers changed from: private */
    public String zzi;
    private final Object zzj = new Object();
    private String zzk;
    private final zzbg zzl;
    private final zzbm zzm;
    private final zzf zzn;
    private zzbi zzo;
    private zzbj zzp = zzbj.zza();

    public interface AuthStateListener {
        void onAuthStateChanged(FirebaseAuth firebaseAuth);
    }

    public interface IdTokenListener {
        void onIdTokenChanged(FirebaseAuth firebaseAuth);
    }

    public FirebaseAuth(FirebaseApp firebaseApp) {
        zzwq zzb2;
        zzti zza2 = zzug.zza(firebaseApp.getApplicationContext(), zzue.zza(s.g(firebaseApp.getOptions().getApiKey())));
        zzbg zzbg = new zzbg(firebaseApp.getApplicationContext(), firebaseApp.getPersistenceKey());
        zzbm zzc2 = zzbm.zzc();
        zzf zzb3 = zzf.zzb();
        this.zza = (FirebaseApp) s.k(firebaseApp);
        this.zze = (zzti) s.k(zza2);
        zzbg zzbg2 = (zzbg) s.k(zzbg);
        this.zzl = zzbg2;
        this.zzg = new zzw();
        zzbm zzbm = (zzbm) s.k(zzc2);
        this.zzm = zzbm;
        this.zzn = (zzf) s.k(zzb3);
        FirebaseUser zza3 = zzbg2.zza();
        this.zzf = zza3;
        if (!(zza3 == null || (zzb2 = zzbg2.zzb(zza3)) == null)) {
            zzG(this, this.zzf, zzb2, false, false);
        }
        zzbm.zze(this);
    }

    @Keep
    public static FirebaseAuth getInstance() {
        return (FirebaseAuth) FirebaseApp.getInstance().get(FirebaseAuth.class);
    }

    public static void zzE(FirebaseAuth firebaseAuth, FirebaseUser firebaseUser) {
        String str;
        if (firebaseUser != null) {
            String uid = firebaseUser.getUid();
            StringBuilder sb2 = new StringBuilder(String.valueOf(uid).length() + 47);
            sb2.append("Notifying auth state listeners about user ( ");
            sb2.append(uid);
            sb2.append(" ).");
            str = sb2.toString();
        } else {
            str = "Notifying auth state listeners about a sign-out event.";
        }
        Log.d("FirebaseAuth", str);
        firebaseAuth.zzp.execute(new i(firebaseAuth));
    }

    public static void zzF(FirebaseAuth firebaseAuth, FirebaseUser firebaseUser) {
        String str;
        if (firebaseUser != null) {
            String uid = firebaseUser.getUid();
            StringBuilder sb2 = new StringBuilder(String.valueOf(uid).length() + 45);
            sb2.append("Notifying id token listeners about user ( ");
            sb2.append(uid);
            sb2.append(" ).");
            str = sb2.toString();
        } else {
            str = "Notifying id token listeners about a sign-out event.";
        }
        Log.d("FirebaseAuth", str);
        firebaseAuth.zzp.execute(new h(firebaseAuth, new InternalTokenResult(firebaseUser != null ? firebaseUser.zze() : null)));
    }

    static void zzG(FirebaseAuth firebaseAuth, FirebaseUser firebaseUser, zzwq zzwq, boolean z10, boolean z11) {
        boolean z12;
        s.k(firebaseUser);
        s.k(zzwq);
        boolean z13 = false;
        boolean z14 = true;
        boolean z15 = firebaseAuth.zzf != null && firebaseUser.getUid().equals(firebaseAuth.zzf.getUid());
        if (z15 || !z11) {
            FirebaseUser firebaseUser2 = firebaseAuth.zzf;
            if (firebaseUser2 == null) {
                z12 = true;
            } else {
                boolean z16 = !firebaseUser2.zzd().zze().equals(zzwq.zze());
                if (!z15 || z16) {
                    z13 = true;
                }
                z12 = true ^ z15;
                z14 = z13;
            }
            s.k(firebaseUser);
            FirebaseUser firebaseUser3 = firebaseAuth.zzf;
            if (firebaseUser3 == null) {
                firebaseAuth.zzf = firebaseUser;
            } else {
                firebaseUser3.zzc(firebaseUser.getProviderData());
                if (!firebaseUser.isAnonymous()) {
                    firebaseAuth.zzf.zzb();
                }
                firebaseAuth.zzf.zzi(firebaseUser.getMultiFactor().getEnrolledFactors());
            }
            if (z10) {
                firebaseAuth.zzl.zzd(firebaseAuth.zzf);
            }
            if (z14) {
                FirebaseUser firebaseUser4 = firebaseAuth.zzf;
                if (firebaseUser4 != null) {
                    firebaseUser4.zzh(zzwq);
                }
                zzF(firebaseAuth, firebaseAuth.zzf);
            }
            if (z12) {
                zzE(firebaseAuth, firebaseAuth.zzf);
            }
            if (z10) {
                firebaseAuth.zzl.zze(firebaseUser, zzwq);
            }
            FirebaseUser firebaseUser5 = firebaseAuth.zzf;
            if (firebaseUser5 != null) {
                zzx(firebaseAuth).zzd(firebaseUser5.zzd());
            }
        }
    }

    /* access modifiers changed from: private */
    public final PhoneAuthProvider.OnVerificationStateChangedCallbacks zzJ(String str, PhoneAuthProvider.OnVerificationStateChangedCallbacks onVerificationStateChangedCallbacks) {
        return (!this.zzg.zzd() || str == null || !str.equals(this.zzg.zza())) ? onVerificationStateChangedCallbacks : new m(this, onVerificationStateChangedCallbacks);
    }

    private final boolean zzK(String str) {
        ActionCodeUrl parseLink = ActionCodeUrl.parseLink(str);
        return parseLink != null && !TextUtils.equals(this.zzk, parseLink.zza());
    }

    public static zzbi zzx(FirebaseAuth firebaseAuth) {
        if (firebaseAuth.zzo == null) {
            firebaseAuth.zzo = new zzbi((FirebaseApp) s.k(firebaseAuth.zza));
        }
        return firebaseAuth.zzo;
    }

    public void addAuthStateListener(AuthStateListener authStateListener) {
        this.zzd.add(authStateListener);
        this.zzp.execute(new g(this, authStateListener));
    }

    public void addIdTokenListener(IdTokenListener idTokenListener) {
        this.zzb.add(idTokenListener);
        ((zzbj) s.k(this.zzp)).execute(new f(this, idTokenListener));
    }

    public i applyActionCode(String str) {
        s.g(str);
        return this.zze.zze(this.zza, str, this.zzk);
    }

    public i checkActionCode(String str) {
        s.g(str);
        return this.zze.zzf(this.zza, str, this.zzk);
    }

    public i confirmPasswordReset(String str, String str2) {
        s.g(str);
        s.g(str2);
        return this.zze.zzg(this.zza, str, str2, this.zzk);
    }

    public i createUserWithEmailAndPassword(String str, String str2) {
        s.g(str);
        s.g(str2);
        return this.zze.zzh(this.zza, str, str2, this.zzk, new o(this));
    }

    public i fetchSignInMethodsForEmail(String str) {
        s.g(str);
        return this.zze.zzj(this.zza, str, this.zzk);
    }

    public final i getAccessToken(boolean z10) {
        return zzc(this.zzf, z10);
    }

    public FirebaseApp getApp() {
        return this.zza;
    }

    public FirebaseUser getCurrentUser() {
        return this.zzf;
    }

    public FirebaseAuthSettings getFirebaseAuthSettings() {
        return this.zzg;
    }

    public String getLanguageCode() {
        String str;
        synchronized (this.zzh) {
            str = this.zzi;
        }
        return str;
    }

    public i getPendingAuthResult() {
        return this.zzm.zza();
    }

    public String getTenantId() {
        String str;
        synchronized (this.zzj) {
            str = this.zzk;
        }
        return str;
    }

    public final String getUid() {
        FirebaseUser firebaseUser = this.zzf;
        if (firebaseUser == null) {
            return null;
        }
        return firebaseUser.getUid();
    }

    public boolean isSignInWithEmailLink(String str) {
        return EmailAuthCredential.zzi(str);
    }

    public void removeAuthStateListener(AuthStateListener authStateListener) {
        this.zzd.remove(authStateListener);
    }

    public void removeIdTokenListener(IdTokenListener idTokenListener) {
        this.zzb.remove(idTokenListener);
    }

    public i sendPasswordResetEmail(String str) {
        s.g(str);
        return sendPasswordResetEmail(str, (ActionCodeSettings) null);
    }

    public i sendSignInLinkToEmail(String str, ActionCodeSettings actionCodeSettings) {
        s.g(str);
        s.k(actionCodeSettings);
        if (actionCodeSettings.canHandleCodeInApp()) {
            String str2 = this.zzi;
            if (str2 != null) {
                actionCodeSettings.zzf(str2);
            }
            return this.zze.zzz(this.zza, str, actionCodeSettings, this.zzk);
        }
        throw new IllegalArgumentException("You must set canHandleCodeInApp in your ActionCodeSettings to true for Email-Link Sign-in.");
    }

    public i setFirebaseUIVersion(String str) {
        return this.zze.zzA(str);
    }

    public void setLanguageCode(String str) {
        s.g(str);
        synchronized (this.zzh) {
            this.zzi = str;
        }
    }

    public void setTenantId(String str) {
        s.g(str);
        synchronized (this.zzj) {
            this.zzk = str;
        }
    }

    public i signInAnonymously() {
        FirebaseUser firebaseUser = this.zzf;
        if (firebaseUser == null || !firebaseUser.isAnonymous()) {
            return this.zze.zzB(this.zza, new o(this), this.zzk);
        }
        zzx zzx = (zzx) this.zzf;
        zzx.zzq(false);
        return l.e(new zzr(zzx));
    }

    public i signInWithCredential(AuthCredential authCredential) {
        s.k(authCredential);
        AuthCredential zza2 = authCredential.zza();
        if (zza2 instanceof EmailAuthCredential) {
            EmailAuthCredential emailAuthCredential = (EmailAuthCredential) zza2;
            if (!emailAuthCredential.zzg()) {
                return this.zze.zzE(this.zza, emailAuthCredential.zzd(), s.g(emailAuthCredential.zze()), this.zzk, new o(this));
            }
            return zzK(s.g(emailAuthCredential.zzf())) ? l.d(zzto.zza(new Status(17072))) : this.zze.zzF(this.zza, emailAuthCredential, new o(this));
        } else if (!(zza2 instanceof PhoneAuthCredential)) {
            return this.zze.zzC(this.zza, zza2, this.zzk, new o(this));
        } else {
            return this.zze.zzG(this.zza, (PhoneAuthCredential) zza2, this.zzk, new o(this));
        }
    }

    public i signInWithCustomToken(String str) {
        s.g(str);
        return this.zze.zzD(this.zza, str, this.zzk, new o(this));
    }

    public i signInWithEmailAndPassword(String str, String str2) {
        s.g(str);
        s.g(str2);
        return this.zze.zzE(this.zza, str, str2, this.zzk, new o(this));
    }

    public i signInWithEmailLink(String str, String str2) {
        return signInWithCredential(EmailAuthProvider.getCredentialWithLink(str, str2));
    }

    public void signOut() {
        zzC();
        zzbi zzbi = this.zzo;
        if (zzbi != null) {
            zzbi.zzb();
        }
    }

    public i startActivityForSignInWithProvider(Activity activity, FederatedAuthProvider federatedAuthProvider) {
        s.k(federatedAuthProvider);
        s.k(activity);
        j jVar = new j();
        if (!this.zzm.zzi(activity, jVar, this)) {
            return l.d(zzto.zza(new Status(17057)));
        }
        this.zzm.zzg(activity.getApplicationContext(), this);
        federatedAuthProvider.zzc(activity);
        return jVar.a();
    }

    public i updateCurrentUser(FirebaseUser firebaseUser) {
        String str;
        if (firebaseUser != null) {
            String tenantId = firebaseUser.getTenantId();
            if ((tenantId != null && !tenantId.equals(this.zzk)) || ((str = this.zzk) != null && !str.equals(tenantId))) {
                return l.d(zzto.zza(new Status(17072)));
            }
            String apiKey = firebaseUser.zza().getOptions().getApiKey();
            String apiKey2 = this.zza.getOptions().getApiKey();
            if (!firebaseUser.zzd().zzj() || !apiKey2.equals(apiKey)) {
                return zzg(firebaseUser, new q(this));
            }
            zzD(zzx.zzk(this.zza, firebaseUser), firebaseUser.zzd(), true);
            return l.e((Object) null);
        }
        throw new IllegalArgumentException("Cannot update current user with null user!");
    }

    public void useAppLanguage() {
        synchronized (this.zzh) {
            this.zzi = zzun.zza();
        }
    }

    public void useEmulator(String str, int i10) {
        s.g(str);
        boolean z10 = false;
        if (i10 >= 0 && i10 <= 65535) {
            z10 = true;
        }
        s.b(z10, "Port number must be in the range 0-65535");
        zzvr.zzf(this.zza, str, i10);
    }

    public i verifyPasswordResetCode(String str) {
        s.g(str);
        return this.zze.zzQ(this.zza, str, this.zzk);
    }

    public final void zzC() {
        s.k(this.zzl);
        FirebaseUser firebaseUser = this.zzf;
        if (firebaseUser != null) {
            zzbg zzbg = this.zzl;
            s.k(firebaseUser);
            zzbg.zzc(String.format("com.google.firebase.auth.GET_TOKEN_RESPONSE.%s", new Object[]{firebaseUser.getUid()}));
            this.zzf = null;
        }
        this.zzl.zzc("com.google.firebase.auth.FIREBASE_USER");
        zzF(this, (FirebaseUser) null);
        zzE(this, (FirebaseUser) null);
    }

    public final void zzD(FirebaseUser firebaseUser, zzwq zzwq, boolean z10) {
        zzG(this, firebaseUser, zzwq, true, false);
    }

    public final void zzH(PhoneAuthOptions phoneAuthOptions) {
        if (phoneAuthOptions.zzk()) {
            FirebaseAuth zzb2 = phoneAuthOptions.zzb();
            String g10 = s.g(((zzag) s.k(phoneAuthOptions.zzc())).zze() ? phoneAuthOptions.zzh() : ((PhoneMultiFactorInfo) s.k(phoneAuthOptions.zzf())).getUid());
            if (phoneAuthOptions.zzd() == null || !zzvh.zzd(g10, phoneAuthOptions.zze(), (Activity) s.k(phoneAuthOptions.zza()), phoneAuthOptions.zzi())) {
                zzb2.zzn.zza(zzb2, phoneAuthOptions.zzh(), (Activity) s.k(phoneAuthOptions.zza()), zztk.zzb()).addOnCompleteListener(new l(zzb2, phoneAuthOptions));
                return;
            }
            return;
        }
        FirebaseAuth zzb3 = phoneAuthOptions.zzb();
        String g11 = s.g(phoneAuthOptions.zzh());
        long longValue = phoneAuthOptions.zzg().longValue();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        PhoneAuthProvider.OnVerificationStateChangedCallbacks zze2 = phoneAuthOptions.zze();
        Activity activity = (Activity) s.k(phoneAuthOptions.zza());
        Executor zzi2 = phoneAuthOptions.zzi();
        boolean z10 = phoneAuthOptions.zzd() != null;
        if (z10 || !zzvh.zzd(g11, zze2, activity, zzi2)) {
            zzb3.zzn.zza(zzb3, g11, activity, zztk.zzb()).addOnCompleteListener(new k(zzb3, g11, longValue, timeUnit, zze2, activity, zzi2, z10));
        }
    }

    public final void zzI(String str, long j10, TimeUnit timeUnit, PhoneAuthProvider.OnVerificationStateChangedCallbacks onVerificationStateChangedCallbacks, Activity activity, Executor executor, boolean z10, String str2, String str3) {
        long j11 = j10;
        long convert = TimeUnit.SECONDS.convert(j10, timeUnit);
        if (convert < 0 || convert > 120) {
            throw new IllegalArgumentException("We only support 0-120 seconds for sms-auto-retrieval timeout");
        }
        String str4 = str;
        this.zze.zzS(this.zza, new zzxd(str, convert, z10, this.zzi, this.zzk, str2, zztk.zzb(), str3), zzJ(str, onVerificationStateChangedCallbacks), activity, executor);
    }

    public final i zza(FirebaseUser firebaseUser) {
        s.k(firebaseUser);
        return this.zze.zzi(firebaseUser, new e(this, firebaseUser));
    }

    public final i zzb(FirebaseUser firebaseUser, MultiFactorAssertion multiFactorAssertion, String str) {
        s.k(firebaseUser);
        s.k(multiFactorAssertion);
        if (!(multiFactorAssertion instanceof PhoneMultiFactorAssertion)) {
            return l.d(zzto.zza(new Status(FirebaseError.ERROR_INTERNAL_ERROR)));
        }
        return this.zze.zzk(this.zza, (PhoneMultiFactorAssertion) multiFactorAssertion, firebaseUser, str, new o(this));
    }

    public final i zzc(FirebaseUser firebaseUser, boolean z10) {
        if (firebaseUser == null) {
            return l.d(zzto.zza(new Status(FirebaseError.ERROR_NO_SIGNED_IN_USER)));
        }
        zzwq zzd2 = firebaseUser.zzd();
        return (!zzd2.zzj() || z10) ? this.zze.zzm(this.zza, firebaseUser, zzd2.zzf(), new j(this)) : l.e(zzay.zza(zzd2.zze()));
    }

    public final i zzd(FirebaseUser firebaseUser, AuthCredential authCredential) {
        s.k(authCredential);
        s.k(firebaseUser);
        return this.zze.zzn(this.zza, firebaseUser, authCredential.zza(), new p(this));
    }

    public final i zze(FirebaseUser firebaseUser, AuthCredential authCredential) {
        s.k(firebaseUser);
        s.k(authCredential);
        AuthCredential zza2 = authCredential.zza();
        if (zza2 instanceof EmailAuthCredential) {
            EmailAuthCredential emailAuthCredential = (EmailAuthCredential) zza2;
            if (!"password".equals(emailAuthCredential.getSignInMethod())) {
                return zzK(s.g(emailAuthCredential.zzf())) ? l.d(zzto.zza(new Status(17072))) : this.zze.zzq(this.zza, firebaseUser, emailAuthCredential, new p(this));
            }
            return this.zze.zzs(this.zza, firebaseUser, emailAuthCredential.zzd(), s.g(emailAuthCredential.zze()), firebaseUser.getTenantId(), new p(this));
        } else if (zza2 instanceof PhoneAuthCredential) {
            return this.zze.zzu(this.zza, firebaseUser, (PhoneAuthCredential) zza2, this.zzk, new p(this));
        } else {
            return this.zze.zzo(this.zza, firebaseUser, zza2, firebaseUser.getTenantId(), new p(this));
        }
    }

    public final i zzf(FirebaseUser firebaseUser, AuthCredential authCredential) {
        s.k(firebaseUser);
        s.k(authCredential);
        AuthCredential zza2 = authCredential.zza();
        if (zza2 instanceof EmailAuthCredential) {
            EmailAuthCredential emailAuthCredential = (EmailAuthCredential) zza2;
            if (!"password".equals(emailAuthCredential.getSignInMethod())) {
                return zzK(s.g(emailAuthCredential.zzf())) ? l.d(zzto.zza(new Status(17072))) : this.zze.zzr(this.zza, firebaseUser, emailAuthCredential, new p(this));
            }
            return this.zze.zzt(this.zza, firebaseUser, emailAuthCredential.zzd(), s.g(emailAuthCredential.zze()), firebaseUser.getTenantId(), new p(this));
        } else if (zza2 instanceof PhoneAuthCredential) {
            return this.zze.zzv(this.zza, firebaseUser, (PhoneAuthCredential) zza2, this.zzk, new p(this));
        } else {
            return this.zze.zzp(this.zza, firebaseUser, zza2, firebaseUser.getTenantId(), new p(this));
        }
    }

    public final i zzg(FirebaseUser firebaseUser, zzbk zzbk) {
        s.k(firebaseUser);
        return this.zze.zzw(this.zza, firebaseUser, zzbk);
    }

    public final i zzh(MultiFactorAssertion multiFactorAssertion, zzag zzag, FirebaseUser firebaseUser) {
        s.k(multiFactorAssertion);
        s.k(zzag);
        return this.zze.zzl(this.zza, firebaseUser, (PhoneMultiFactorAssertion) multiFactorAssertion, s.g(zzag.zzd()), new o(this));
    }

    public final i zzi(ActionCodeSettings actionCodeSettings, String str) {
        s.g(str);
        if (this.zzi != null) {
            if (actionCodeSettings == null) {
                actionCodeSettings = ActionCodeSettings.zzb();
            }
            actionCodeSettings.zzf(this.zzi);
        }
        return this.zze.zzx(this.zza, actionCodeSettings, str);
    }

    public final i zzj(Activity activity, FederatedAuthProvider federatedAuthProvider, FirebaseUser firebaseUser) {
        s.k(activity);
        s.k(federatedAuthProvider);
        s.k(firebaseUser);
        j jVar = new j();
        if (!this.zzm.zzj(activity, jVar, this, firebaseUser)) {
            return l.d(zzto.zza(new Status(17057)));
        }
        this.zzm.zzh(activity.getApplicationContext(), this, firebaseUser);
        federatedAuthProvider.zza(activity);
        return jVar.a();
    }

    public final i zzk(Activity activity, FederatedAuthProvider federatedAuthProvider, FirebaseUser firebaseUser) {
        s.k(activity);
        s.k(federatedAuthProvider);
        s.k(firebaseUser);
        j jVar = new j();
        if (!this.zzm.zzj(activity, jVar, this, firebaseUser)) {
            return l.d(zzto.zza(new Status(17057)));
        }
        this.zzm.zzh(activity.getApplicationContext(), this, firebaseUser);
        federatedAuthProvider.zzb(activity);
        return jVar.a();
    }

    public final i zzl(FirebaseUser firebaseUser, String str) {
        s.k(firebaseUser);
        s.g(str);
        return this.zze.zzJ(this.zza, firebaseUser, str, new p(this)).continueWithTask(new n(this));
    }

    public final i zzm(FirebaseUser firebaseUser, String str) {
        s.g(str);
        s.k(firebaseUser);
        return this.zze.zzK(this.zza, firebaseUser, str, new p(this));
    }

    public final i zzn(FirebaseUser firebaseUser, String str) {
        s.k(firebaseUser);
        s.g(str);
        return this.zze.zzL(this.zza, firebaseUser, str, new p(this));
    }

    public final i zzo(FirebaseUser firebaseUser, String str) {
        s.k(firebaseUser);
        s.g(str);
        return this.zze.zzM(this.zza, firebaseUser, str, new p(this));
    }

    public final i zzp(FirebaseUser firebaseUser, PhoneAuthCredential phoneAuthCredential) {
        s.k(firebaseUser);
        s.k(phoneAuthCredential);
        return this.zze.zzN(this.zza, firebaseUser, phoneAuthCredential.clone(), new p(this));
    }

    public final i zzq(FirebaseUser firebaseUser, UserProfileChangeRequest userProfileChangeRequest) {
        s.k(firebaseUser);
        s.k(userProfileChangeRequest);
        return this.zze.zzO(this.zza, firebaseUser, userProfileChangeRequest, new p(this));
    }

    public final i zzr(String str, String str2, ActionCodeSettings actionCodeSettings) {
        s.g(str);
        s.g(str2);
        if (actionCodeSettings == null) {
            actionCodeSettings = ActionCodeSettings.zzb();
        }
        String str3 = this.zzi;
        if (str3 != null) {
            actionCodeSettings.zzf(str3);
        }
        return this.zze.zzP(str, str2, actionCodeSettings);
    }

    public final synchronized zzbi zzw() {
        return zzx(this);
    }

    @Keep
    public static FirebaseAuth getInstance(FirebaseApp firebaseApp) {
        return (FirebaseAuth) firebaseApp.get(FirebaseAuth.class);
    }

    public void addIdTokenListener(com.google.firebase.auth.internal.IdTokenListener idTokenListener) {
        s.k(idTokenListener);
        this.zzc.add(idTokenListener);
        zzw().zzc(this.zzc.size());
    }

    public void removeIdTokenListener(com.google.firebase.auth.internal.IdTokenListener idTokenListener) {
        s.k(idTokenListener);
        this.zzc.remove(idTokenListener);
        zzw().zzc(this.zzc.size());
    }

    public i sendPasswordResetEmail(String str, ActionCodeSettings actionCodeSettings) {
        s.g(str);
        if (actionCodeSettings == null) {
            actionCodeSettings = ActionCodeSettings.zzb();
        }
        String str2 = this.zzi;
        if (str2 != null) {
            actionCodeSettings.zzf(str2);
        }
        actionCodeSettings.zzg(1);
        return this.zze.zzy(this.zza, str, actionCodeSettings, this.zzk);
    }
}
