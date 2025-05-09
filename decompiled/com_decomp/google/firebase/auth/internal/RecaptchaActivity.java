package com.google.firebase.auth.internal;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.fragment.app.e;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p002firebaseauthapi.zzh;
import com.google.android.gms.internal.p002firebaseauthapi.zztr;
import com.google.android.gms.internal.p002firebaseauthapi.zztt;
import com.google.android.gms.internal.p002firebaseauthapi.zzun;
import com.google.android.gms.internal.p002firebaseauthapi.zzvr;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.dynamiclinks.DynamicLink;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import o.c;
import p0.a;
import y3.h;
import y3.j;

public class RecaptchaActivity extends e implements zztt {
    private static final String zzb = "RecaptchaActivity";
    private static final ExecutorService zzc = zzh.zza().zza(2);
    private static long zzd = 0;
    private static final zzbm zze = zzbm.zzc();
    private boolean zzf = false;

    private final void zzg() {
        zzd = 0;
        this.zzf = false;
        Intent intent = new Intent();
        intent.putExtra("com.google.firebase.auth.internal.EXTRA_CANCELED", true);
        intent.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
        a.b(this).d(intent);
        zze.zzd(this);
        finish();
    }

    private final void zzh(Status status) {
        zzd = 0;
        this.zzf = false;
        Intent intent = new Intent();
        zzbl.zzc(intent, status);
        intent.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
        a.b(this).d(intent);
        zze.zzd(this);
        finish();
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String action = getIntent().getAction();
        if ("com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA".equals(action) || "android.intent.action.VIEW".equals(action)) {
            long currentTimeMillis = h.c().currentTimeMillis();
            if (currentTimeMillis - zzd < 30000) {
                Log.e(zzb, "Could not start operation - already in progress");
                return;
            }
            zzd = currentTimeMillis;
            if (bundle != null) {
                this.zzf = bundle.getBoolean("com.google.firebase.auth.internal.KEY_ALREADY_STARTED_RECAPTCHA_FLOW");
                return;
            }
            return;
        }
        String str = zzb;
        String valueOf = String.valueOf(action);
        Log.e(str, valueOf.length() != 0 ? "Could not do operation - unknown action: ".concat(valueOf) : new String("Could not do operation - unknown action: "));
        zzg();
    }

    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
    }

    /* access modifiers changed from: protected */
    public final void onResume() {
        super.onResume();
        if ("android.intent.action.VIEW".equals(getIntent().getAction())) {
            Intent intent = getIntent();
            if (intent.hasExtra("firebaseError")) {
                zzh(zzbl.zzb(intent.getStringExtra("firebaseError")));
            } else if (!intent.hasExtra(DynamicLink.Builder.KEY_LINK) || !intent.hasExtra("eventId")) {
                zzg();
            } else {
                String stringExtra = intent.getStringExtra(DynamicLink.Builder.KEY_LINK);
                String zzc2 = zzj.zzb().zzc(getApplicationContext(), getPackageName(), intent.getStringExtra("eventId"));
                if (TextUtils.isEmpty(zzc2)) {
                    Log.e(zzb, "Failed to find registration for this event - failing to prevent session injection.");
                    zzh(zzai.zza("Failed to find registration for this reCAPTCHA event"));
                }
                if (intent.getBooleanExtra("encryptionEnabled", true)) {
                    stringExtra = zzk.zza(getApplicationContext(), FirebaseApp.getInstance(zzc2).getPersistenceKey()).zzb(stringExtra);
                }
                String queryParameter = Uri.parse(stringExtra).getQueryParameter("recaptchaToken");
                zzd = 0;
                this.zzf = false;
                Intent intent2 = new Intent();
                intent2.putExtra("com.google.firebase.auth.internal.RECAPTCHA_TOKEN", queryParameter);
                intent2.putExtra("com.google.firebase.auth.internal.OPERATION", "com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA");
                intent2.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
                if (!a.b(this).d(intent2)) {
                    SharedPreferences.Editor edit = getApplicationContext().getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
                    edit.putString("recaptchaToken", queryParameter);
                    edit.putString("operation", "com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA");
                    edit.putLong("timestamp", h.c().currentTimeMillis());
                    edit.commit();
                } else {
                    zze.zzd(this);
                }
                finish();
            }
        } else if (!this.zzf) {
            String packageName = getPackageName();
            try {
                new zztr(packageName, j.b(y3.a.a(this, packageName)).toLowerCase(Locale.US), getIntent(), this).executeOnExecutor(zzc, new Void[0]);
            } catch (PackageManager.NameNotFoundException e10) {
                String str = zzb;
                String valueOf = String.valueOf(e10);
                StringBuilder sb2 = new StringBuilder(String.valueOf(packageName).length() + 34 + valueOf.length());
                sb2.append("Could not get package signature: ");
                sb2.append(packageName);
                sb2.append(" ");
                sb2.append(valueOf);
                Log.e(str, sb2.toString());
                zze(packageName, (Status) null);
            }
            this.zzf = true;
        } else {
            zzg();
        }
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("com.google.firebase.auth.internal.KEY_ALREADY_STARTED_RECAPTCHA_FLOW", this.zzf);
    }

    public final Context zza() {
        return getApplicationContext();
    }

    public final Uri.Builder zzb(Intent intent, String str, String str2) {
        String stringExtra = intent.getStringExtra("com.google.firebase.auth.KEY_API_KEY");
        String uuid = UUID.randomUUID().toString();
        String stringExtra2 = intent.getStringExtra("com.google.firebase.auth.internal.CLIENT_VERSION");
        String stringExtra3 = intent.getStringExtra("com.google.firebase.auth.internal.FIREBASE_APP_NAME");
        FirebaseApp instance = FirebaseApp.getInstance(stringExtra3);
        FirebaseAuth instance2 = FirebaseAuth.getInstance(instance);
        zzj.zzb().zze(getApplicationContext(), str, uuid, "com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA", stringExtra3);
        String zzc2 = zzk.zza(getApplicationContext(), instance.getPersistenceKey()).zzc();
        if (TextUtils.isEmpty(zzc2)) {
            Log.e(zzb, "Could not generate an encryption key for reCAPTCHA - cancelling flow.");
            zzh(zzai.zza("Failed to generate/retrieve public encryption key for reCAPTCHA flow."));
            return null;
        }
        Uri.Builder appendQueryParameter = new Uri.Builder().scheme("https").appendPath("__").appendPath("auth").appendPath("handler").appendQueryParameter(DynamicLink.Builder.KEY_API_KEY, stringExtra).appendQueryParameter("authType", "verifyApp").appendQueryParameter(DynamicLink.AndroidParameters.KEY_ANDROID_PACKAGE_NAME, str).appendQueryParameter("hl", !TextUtils.isEmpty(instance2.getLanguageCode()) ? instance2.getLanguageCode() : zzun.zza()).appendQueryParameter("eventId", uuid);
        String valueOf = String.valueOf(stringExtra2);
        return appendQueryParameter.appendQueryParameter("v", valueOf.length() != 0 ? "X".concat(valueOf) : new String("X")).appendQueryParameter("eid", d9.a.PUSH_MINIFIED_BUTTON_ICON).appendQueryParameter("appName", stringExtra3).appendQueryParameter("sha1Cert", str2).appendQueryParameter("publicKey", zzc2);
    }

    public final String zzc(String str) {
        return zzvr.zzb(str);
    }

    public final HttpURLConnection zzd(URL url) {
        try {
            return (HttpURLConnection) url.openConnection();
        } catch (IOException unused) {
            zztt.zza.c("Error generating connection", new Object[0]);
            return null;
        }
    }

    public final void zze(String str, Status status) {
        if (status == null) {
            zzg();
        } else {
            zzh(status);
        }
    }

    public final void zzf(Uri uri, String str) {
        if (getPackageManager().resolveActivity(new Intent("android.intent.action.VIEW"), 0) != null) {
            List<ResolveInfo> queryIntentServices = getPackageManager().queryIntentServices(new Intent("android.support.customtabs.action.CustomTabsService"), 0);
            if (queryIntentServices == null || queryIntentServices.isEmpty()) {
                Intent intent = new Intent("android.intent.action.VIEW", uri);
                intent.putExtra("com.android.browser.application_id", str);
                intent.addFlags(1073741824);
                intent.addFlags(268435456);
                startActivity(intent);
                return;
            }
            c a10 = new c.a().a();
            a10.f13582a.addFlags(1073741824);
            a10.f13582a.addFlags(268435456);
            a10.a(this, uri);
            return;
        }
        Log.e(zzb, "Device cannot resolve intent for: android.intent.action.VIEW");
        zze(str, (Status) null);
    }
}
