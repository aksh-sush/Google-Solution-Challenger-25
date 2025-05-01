package com.android.installreferrer.api;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import e3.a;
import java.util.List;

class a extends InstallReferrerClient {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public int f4652a = 0;

    /* renamed from: b  reason: collision with root package name */
    private final Context f4653b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public e3.a f4654c;

    /* renamed from: d  reason: collision with root package name */
    private ServiceConnection f4655d;

    private final class b implements ServiceConnection {

        /* renamed from: a  reason: collision with root package name */
        private final InstallReferrerStateListener f4656a;

        private b(InstallReferrerStateListener installReferrerStateListener) {
            if (installReferrerStateListener != null) {
                this.f4656a = installReferrerStateListener;
                return;
            }
            throw new RuntimeException("Please specify a listener to know when setup is done.");
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            o1.a.a("InstallReferrerClient", "Install Referrer service connected.");
            e3.a unused = a.this.f4654c = a.C0211a.c(iBinder);
            int unused2 = a.this.f4652a = 2;
            this.f4656a.a(0);
        }

        public void onServiceDisconnected(ComponentName componentName) {
            o1.a.b("InstallReferrerClient", "Install Referrer service disconnected.");
            e3.a unused = a.this.f4654c = null;
            int unused2 = a.this.f4652a = 0;
            this.f4656a.b();
        }
    }

    public a(Context context) {
        this.f4653b = context.getApplicationContext();
    }

    private boolean g() {
        try {
            return this.f4653b.getPackageManager().getPackageInfo("com.android.vending", 128).versionCode >= 80837300;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    public void a() {
        this.f4652a = 3;
        if (this.f4655d != null) {
            o1.a.a("InstallReferrerClient", "Unbinding from service.");
            this.f4653b.unbindService(this.f4655d);
            this.f4655d = null;
        }
        this.f4654c = null;
    }

    public ReferrerDetails b() {
        if (h()) {
            Bundle bundle = new Bundle();
            bundle.putString("package_name", this.f4653b.getPackageName());
            try {
                return new ReferrerDetails(this.f4654c.I(bundle));
            } catch (RemoteException e10) {
                o1.a.b("InstallReferrerClient", "RemoteException getting install referrer information");
                this.f4652a = 0;
                throw e10;
            }
        } else {
            throw new IllegalStateException("Service not connected. Please start a connection before using the service.");
        }
    }

    public void d(InstallReferrerStateListener installReferrerStateListener) {
        ServiceInfo serviceInfo;
        if (h()) {
            o1.a.a("InstallReferrerClient", "Service connection is valid. No need to re-initialize.");
            installReferrerStateListener.a(0);
            return;
        }
        int i10 = this.f4652a;
        if (i10 == 1) {
            o1.a.b("InstallReferrerClient", "Client is already in the process of connecting to the service.");
            installReferrerStateListener.a(3);
        } else if (i10 == 3) {
            o1.a.b("InstallReferrerClient", "Client was already closed and can't be reused. Please create another instance.");
            installReferrerStateListener.a(3);
        } else {
            o1.a.a("InstallReferrerClient", "Starting install referrer service setup.");
            this.f4655d = new b(installReferrerStateListener);
            Intent intent = new Intent("com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE");
            intent.setComponent(new ComponentName("com.android.vending", "com.google.android.finsky.externalreferrer.GetInstallReferrerService"));
            List<ResolveInfo> queryIntentServices = this.f4653b.getPackageManager().queryIntentServices(intent, 0);
            if (queryIntentServices == null || queryIntentServices.isEmpty() || (serviceInfo = queryIntentServices.get(0).serviceInfo) == null) {
                this.f4652a = 0;
                o1.a.a("InstallReferrerClient", "Install Referrer service unavailable on device.");
                installReferrerStateListener.a(2);
                return;
            }
            String str = serviceInfo.packageName;
            String str2 = serviceInfo.name;
            if (!"com.android.vending".equals(str) || str2 == null || !g()) {
                o1.a.b("InstallReferrerClient", "Play Store missing or incompatible. Version 8.3.73 or later required.");
                this.f4652a = 0;
                installReferrerStateListener.a(2);
                return;
            }
            if (this.f4653b.bindService(new Intent(intent), this.f4655d, 1)) {
                o1.a.a("InstallReferrerClient", "Service was bonded successfully.");
                return;
            }
            o1.a.b("InstallReferrerClient", "Connection to service is blocked.");
            this.f4652a = 0;
            installReferrerStateListener.a(1);
        }
    }

    public boolean h() {
        return (this.f4652a != 2 || this.f4654c == null || this.f4655d == null) ? false : true;
    }
}
