package com.google.firebase.messaging;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.cloudmessaging.c;
import com.google.firebase.FirebaseApp;
import com.google.firebase.heartbeatinfo.HeartBeatInfo;
import com.google.firebase.inject.Provider;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.installations.InstallationTokenResult;
import com.google.firebase.platforminfo.UserAgentPublisher;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.ExecutionException;
import n4.i;
import n4.l;

class e0 {

    /* renamed from: a  reason: collision with root package name */
    private final FirebaseApp f8390a;

    /* renamed from: b  reason: collision with root package name */
    private final i0 f8391b;

    /* renamed from: c  reason: collision with root package name */
    private final c f8392c;

    /* renamed from: d  reason: collision with root package name */
    private final Provider f8393d;

    /* renamed from: e  reason: collision with root package name */
    private final Provider f8394e;

    /* renamed from: f  reason: collision with root package name */
    private final FirebaseInstallationsApi f8395f;

    e0(FirebaseApp firebaseApp, i0 i0Var, c cVar, Provider provider, Provider provider2, FirebaseInstallationsApi firebaseInstallationsApi) {
        this.f8390a = firebaseApp;
        this.f8391b = i0Var;
        this.f8392c = cVar;
        this.f8393d = provider;
        this.f8394e = provider2;
        this.f8395f = firebaseInstallationsApi;
    }

    private static String a(byte[] bArr) {
        return Base64.encodeToString(bArr, 11);
    }

    private i c(i iVar) {
        return iVar.continueWith(c0.f8385e, new d0(this));
    }

    private String d() {
        try {
            return a(MessageDigest.getInstance("SHA-1").digest(this.f8390a.getName().getBytes()));
        } catch (NoSuchAlgorithmException unused) {
            return "[HASH-ERROR]";
        }
    }

    private String f(Bundle bundle) {
        if (bundle != null) {
            String string = bundle.getString("registration_id");
            if (string != null) {
                return string;
            }
            String string2 = bundle.getString("unregistered");
            if (string2 != null) {
                return string2;
            }
            String string3 = bundle.getString(Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            if ("RST".equals(string3)) {
                throw new IOException("INSTANCE_ID_RESET");
            } else if (string3 != null) {
                throw new IOException(string3);
            } else {
                String valueOf = String.valueOf(bundle);
                StringBuilder sb2 = new StringBuilder(valueOf.length() + 21);
                sb2.append("Unexpected response: ");
                sb2.append(valueOf);
                Log.w(Constants.TAG, sb2.toString(), new Throwable());
                throw new IOException("SERVICE_NOT_AVAILABLE");
            }
        } else {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        }
    }

    static boolean g(String str) {
        return "SERVICE_NOT_AVAILABLE".equals(str) || "INTERNAL_SERVER_ERROR".equals(str) || "InternalServerError".equals(str);
    }

    private Bundle i(String str, String str2, String str3, Bundle bundle) {
        HeartBeatInfo.HeartBeat heartBeatCode;
        bundle.putString("scope", str3);
        bundle.putString("sender", str2);
        bundle.putString("subtype", str2);
        bundle.putString("appid", str);
        bundle.putString("gmp_app_id", this.f8390a.getOptions().getApplicationId());
        bundle.putString("gmsv", Integer.toString(this.f8391b.d()));
        bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString("app_ver", this.f8391b.a());
        bundle.putString("app_ver_name", this.f8391b.b());
        bundle.putString("firebase-app-name-hash", d());
        try {
            String token = ((InstallationTokenResult) l.a(this.f8395f.getToken(false))).getToken();
            if (!TextUtils.isEmpty(token)) {
                bundle.putString("Goog-Firebase-Installations-Auth", token);
            } else {
                Log.w(Constants.TAG, "FIS auth token is empty");
            }
        } catch (InterruptedException | ExecutionException e10) {
            Log.e(Constants.TAG, "Failed to get FIS auth token", e10);
        }
        bundle.putString("cliv", "fcm-22.0.0");
        HeartBeatInfo heartBeatInfo = (HeartBeatInfo) this.f8394e.get();
        UserAgentPublisher userAgentPublisher = (UserAgentPublisher) this.f8393d.get();
        if (!(heartBeatInfo == null || userAgentPublisher == null || (heartBeatCode = heartBeatInfo.getHeartBeatCode("fire-iid")) == HeartBeatInfo.HeartBeat.NONE)) {
            bundle.putString("Firebase-Client-Log-Type", Integer.toString(heartBeatCode.getCode()));
            bundle.putString("Firebase-Client", userAgentPublisher.getUserAgent());
        }
        return bundle;
    }

    private i j(String str, String str2, String str3, Bundle bundle) {
        i(str, str2, str3, bundle);
        return this.f8392c.a(bundle);
    }

    /* access modifiers changed from: package-private */
    public i b(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("delete", "1");
        return c(j(str, i0.c(this.f8390a), "*", bundle));
    }

    /* access modifiers changed from: package-private */
    public i e(String str) {
        return c(j(str, i0.c(this.f8390a), "*", new Bundle()));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ String h(i iVar) {
        return f((Bundle) iVar.getResult(IOException.class));
    }

    /* access modifiers changed from: package-private */
    public i k(String str, String str2, String str3) {
        Bundle bundle = new Bundle();
        String valueOf = String.valueOf(str3);
        bundle.putString("gcm.topic", valueOf.length() != 0 ? "/topics/".concat(valueOf) : new String("/topics/"));
        String valueOf2 = String.valueOf(str3);
        return c(j(str, str2, valueOf2.length() != 0 ? "/topics/".concat(valueOf2) : new String("/topics/"), bundle));
    }

    /* access modifiers changed from: package-private */
    public i l(String str, String str2, String str3) {
        Bundle bundle = new Bundle();
        String valueOf = String.valueOf(str3);
        bundle.putString("gcm.topic", valueOf.length() != 0 ? "/topics/".concat(valueOf) : new String("/topics/"));
        bundle.putString("delete", "1");
        String valueOf2 = String.valueOf(str3);
        return c(j(str, str2, valueOf2.length() != 0 ? "/topics/".concat(valueOf2) : new String("/topics/"), bundle));
    }

    e0(FirebaseApp firebaseApp, i0 i0Var, Provider provider, Provider provider2, FirebaseInstallationsApi firebaseInstallationsApi) {
        this(firebaseApp, i0Var, new c(firebaseApp.getApplicationContext()), provider, provider2, firebaseInstallationsApi);
    }
}
