package com.google.android.gms.cloudmessaging;

import a4.e;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import java.util.List;
import y3.n;

public final class u {

    /* renamed from: a  reason: collision with root package name */
    private final Context f5232a;

    /* renamed from: b  reason: collision with root package name */
    private int f5233b;

    /* renamed from: c  reason: collision with root package name */
    private int f5234c = 0;

    public u(Context context) {
        this.f5232a = context;
    }

    private final PackageInfo b(String str) {
        try {
            return e.a(this.f5232a).e(str, 0);
        } catch (PackageManager.NameNotFoundException e10) {
            String valueOf = String.valueOf(e10);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 23);
            sb2.append("Failed to find package ");
            sb2.append(valueOf);
            Log.w("Metadata", sb2.toString());
            return null;
        }
    }

    public final synchronized int a() {
        int i10 = this.f5234c;
        if (i10 != 0) {
            return i10;
        }
        PackageManager packageManager = this.f5232a.getPackageManager();
        if (e.a(this.f5232a).b("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            Log.e("Metadata", "Google Play services missing or without correct permission.");
            return 0;
        }
        if (!n.h()) {
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
            if (queryIntentServices != null && queryIntentServices.size() > 0) {
                this.f5234c = 1;
                return 1;
            }
        }
        Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
        intent2.setPackage("com.google.android.gms");
        List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
        if (queryBroadcastReceivers == null || queryBroadcastReceivers.size() <= 0) {
            Log.w("Metadata", "Failed to resolve IID implementation package, falling back");
            if (n.h()) {
                this.f5234c = 2;
            } else {
                this.f5234c = 1;
            }
            return this.f5234c;
        }
        this.f5234c = 2;
        return 2;
    }

    public final synchronized int c() {
        PackageInfo b10;
        if (this.f5233b == 0 && (b10 = b("com.google.android.gms")) != null) {
            this.f5233b = b10.versionCode;
        }
        return this.f5233b;
    }
}
