package com.google.android.gms.internal.p002firebaseauthapi;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.internal.g;
import com.google.android.gms.common.api.internal.o;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.h;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import u3.a;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zztn  reason: invalid package */
public final class zztn extends h implements zztm {
    private static final a zze = new a("FirebaseAuth", "FirebaseAuth:");
    private final Context zzf;
    private final zzuf zzg;

    public zztn(Context context, Looper looper, d dVar, zzuf zzuf, g gVar, o oVar) {
        super(context, looper, 112, dVar, gVar, oVar);
        this.zzf = (Context) s.k(context);
        this.zzg = zzuf;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthService");
        return queryLocalInterface instanceof zzua ? (zzua) queryLocalInterface : new zzty(iBinder);
    }

    public final q3.d[] getApiFeatures() {
        return zzd.zzd;
    }

    /* access modifiers changed from: protected */
    public final Bundle getGetServiceRequestExtraArgs() {
        Bundle getServiceRequestExtraArgs = super.getGetServiceRequestExtraArgs();
        if (getServiceRequestExtraArgs == null) {
            getServiceRequestExtraArgs = new Bundle();
        }
        zzuf zzuf = this.zzg;
        if (zzuf != null) {
            getServiceRequestExtraArgs.putString("com.google.firebase.auth.API_KEY", zzuf.zzc());
        }
        getServiceRequestExtraArgs.putString("com.google.firebase.auth.LIBRARY_VERSION", zzuk.zzc());
        return getServiceRequestExtraArgs;
    }

    public final int getMinApkVersion() {
        return q3.o.f14688a;
    }

    /* access modifiers changed from: protected */
    public final String getServiceDescriptor() {
        return "com.google.firebase.auth.api.internal.IFirebaseAuthService";
    }

    /* access modifiers changed from: protected */
    public final String getStartServiceAction() {
        return "com.google.firebase.auth.api.gms.service.START";
    }

    /* access modifiers changed from: protected */
    public final String getStartServicePackage() {
        if (this.zzg.zza) {
            zze.e("Preparing to create service connection to fallback implementation", new Object[0]);
            return this.zzf.getPackageName();
        }
        zze.e("Preparing to create service connection to gms implementation", new Object[0]);
        return "com.google.android.gms";
    }

    public final boolean requiresGooglePlayServices() {
        return DynamiteModule.a(this.zzf, ModuleDescriptor.MODULE_ID) == 0;
    }

    public final /* bridge */ /* synthetic */ zzua zzq() {
        return (zzua) super.getService();
    }
}
