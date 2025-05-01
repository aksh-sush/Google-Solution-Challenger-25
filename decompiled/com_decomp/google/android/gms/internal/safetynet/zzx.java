package com.google.android.gms.internal.safetynet;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.h;
import java.util.List;

public final class zzx extends h {
    private final Context zzap;

    public zzx(Context context, Looper looper, d dVar, GoogleApiClient.b bVar, GoogleApiClient.c cVar) {
        super(context, looper, 45, dVar, bVar, cVar);
        this.zzap = context;
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.safetynet.internal.ISafetyNetService");
        return queryLocalInterface instanceof zzi ? (zzi) queryLocalInterface : new zzj(iBinder);
    }

    public final int getMinApkVersion() {
        return 12200000;
    }

    /* access modifiers changed from: protected */
    public final String getServiceDescriptor() {
        return "com.google.android.gms.safetynet.internal.ISafetyNetService";
    }

    /* access modifiers changed from: protected */
    public final String getStartServiceAction() {
        return "com.google.android.gms.safetynet.service.START";
    }

    public final void zza(zzg zzg, List<Integer> list, int i10, String str, String str2) {
        if (str2 == null) {
            str2 = zzb("com.google.android.safetynet.API_KEY");
        }
        String str3 = str2;
        int[] iArr = new int[list.size()];
        for (int i11 = 0; i11 < list.size(); i11++) {
            iArr[i11] = list.get(i11).intValue();
        }
        ((zzi) getService()).zza(zzg, str3, iArr, i10, str);
    }

    /* access modifiers changed from: protected */
    public final String zzb(String str) {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            PackageManager packageManager = this.zzap.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(this.zzap.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null) {
                return null;
            }
            return (String) bundle.get(str);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }
}
