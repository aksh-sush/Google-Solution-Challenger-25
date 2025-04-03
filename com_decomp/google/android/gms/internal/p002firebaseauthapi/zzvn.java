package com.google.android.gms.internal.p002firebaseauthapi;

import a4.e;
import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Base64;
import com.google.android.gms.common.internal.s;
import com.google.firebase.auth.PhoneAuthCredential;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import u3.a;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzvn  reason: invalid package */
final class zzvn {
    /* access modifiers changed from: private */
    public static final a zza = new a("FirebaseAuth", "SmsRetrieverHelper");
    private final Context zzb;
    private final ScheduledExecutorService zzc;
    /* access modifiers changed from: private */
    public final HashMap<String, zzvm> zzd = new HashMap<>();

    zzvn(Context context) {
        this.zzb = (Context) s.k(context);
        zzh.zza();
        this.zzc = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
    }

    static String zzb(String str) {
        Matcher matcher = Pattern.compile("(?<!\\d)\\d{6}(?!\\d)").matcher(str);
        if (matcher.find()) {
            return matcher.group();
        }
        return null;
    }

    static /* synthetic */ void zze(zzvn zzvn, String str) {
        zzvm zzvm = zzvn.zzd.get(str);
        if (zzvm != null && !zzaf.zzd(zzvm.zzd) && !zzaf.zzd(zzvm.zze) && !zzvm.zzb.isEmpty()) {
            for (zztl zzo : zzvm.zzb) {
                zzo.zzo(PhoneAuthCredential.zzc(zzvm.zzd, zzvm.zze));
            }
            zzvm.zzh = true;
        }
    }

    private static String zzm(String str, String str2) {
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(str2).length());
        sb2.append(str);
        sb2.append(" ");
        sb2.append(str2);
        String sb3 = sb2.toString();
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA-256");
            instance.update(sb3.getBytes(zzq.zzc));
            String substring = Base64.encodeToString(Arrays.copyOf(instance.digest(), 9), 3).substring(0, 11);
            a aVar = zza;
            StringBuilder sb4 = new StringBuilder(String.valueOf(str).length() + 19 + String.valueOf(substring).length());
            sb4.append("Package: ");
            sb4.append(str);
            sb4.append(" -- Hash: ");
            sb4.append(substring);
            aVar.a(sb4.toString(), new Object[0]);
            return substring;
        } catch (NoSuchAlgorithmException e10) {
            a aVar2 = zza;
            String valueOf = String.valueOf(e10.getMessage());
            aVar2.c(valueOf.length() != 0 ? "NoSuchAlgorithm: ".concat(valueOf) : new String("NoSuchAlgorithm: "), new Object[0]);
            return null;
        }
    }

    /* access modifiers changed from: private */
    public final void zzn(String str) {
        zzvm zzvm = this.zzd.get(str);
        if (zzvm != null && !zzvm.zzh && !zzaf.zzd(zzvm.zzd)) {
            zza.h("Timed out waiting for SMS.", new Object[0]);
            for (zztl zza2 : zzvm.zzb) {
                zza2.zza(zzvm.zzd);
            }
            zzvm.zzi = true;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: zzo */
    public final void zzh(String str) {
        zzvm zzvm = this.zzd.get(str);
        if (zzvm != null) {
            if (!zzvm.zzi) {
                zzn(str);
            }
            zzj(str);
        }
    }

    /* access modifiers changed from: package-private */
    public final String zzc() {
        try {
            String packageName = this.zzb.getPackageName();
            String zzm = zzm(packageName, (Build.VERSION.SDK_INT < 28 ? e.a(this.zzb).e(packageName, 64).signatures : e.a(this.zzb).e(packageName, 134217728).signingInfo.getApkContentsSigners())[0].toCharsString());
            if (zzm != null) {
                return zzm;
            }
            zza.c("Hash generation failed.", new Object[0]);
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            zza.c("Unable to find package to obtain hash.", new Object[0]);
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public final void zzi(zztl zztl, String str) {
        zzvm zzvm = this.zzd.get(str);
        if (zzvm != null) {
            zzvm.zzb.add(zztl);
            if (zzvm.zzg) {
                zztl.zzb(zzvm.zzd);
            }
            if (zzvm.zzh) {
                zztl.zzo(PhoneAuthCredential.zzc(zzvm.zzd, zzvm.zze));
            }
            if (zzvm.zzi) {
                zztl.zza(zzvm.zzd);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void zzj(String str) {
        zzvm zzvm = this.zzd.get(str);
        if (zzvm != null) {
            ScheduledFuture<?> scheduledFuture = zzvm.zzf;
            if (scheduledFuture != null && !scheduledFuture.isDone()) {
                zzvm.zzf.cancel(false);
            }
            zzvm.zzb.clear();
            this.zzd.remove(str);
        }
    }

    /* access modifiers changed from: package-private */
    public final void zzk(String str, zztl zztl, long j10, boolean z10) {
        this.zzd.put(str, new zzvm(j10, z10));
        zzi(zztl, str);
        zzvm zzvm = this.zzd.get(str);
        if (zzvm.zza <= 0) {
            zza.h("Timeout of 0 specified; SmsRetriever will not start.", new Object[0]);
            return;
        }
        zzvm.zzf = this.zzc.schedule(new zzvi(this, str), zzvm.zza, TimeUnit.SECONDS);
        if (!zzvm.zzc) {
            zza.h("SMS auto-retrieval unavailable; SmsRetriever will not start.", new Object[0]);
            return;
        }
        zzvl zzvl = new zzvl(this, str);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.google.android.gms.auth.api.phone.SMS_RETRIEVED");
        this.zzb.getApplicationContext().registerReceiver(zzvl, intentFilter);
        l3.a.a(this.zzb).startSmsRetriever().addOnFailureListener(new zzvj(this));
    }

    /* access modifiers changed from: package-private */
    public final boolean zzl(String str) {
        return this.zzd.get(str) != null;
    }
}
