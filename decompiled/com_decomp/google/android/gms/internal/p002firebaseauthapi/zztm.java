package com.google.android.gms.internal.p002firebaseauthapi;

import android.content.Intent;
import android.os.IBinder;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.k;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Set;
import q3.d;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zztm  reason: invalid package */
public interface zztm extends a.f {
    /* synthetic */ void connect(c.C0088c cVar);

    /* synthetic */ void disconnect();

    /* synthetic */ void disconnect(String str);

    /* synthetic */ void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    /* synthetic */ d[] getAvailableFeatures();

    /* synthetic */ String getEndpointPackageName();

    /* synthetic */ String getLastDisconnectMessage();

    /* synthetic */ int getMinApkVersion();

    /* synthetic */ void getRemoteService(k kVar, Set set);

    /* synthetic */ d[] getRequiredFeatures();

    /* synthetic */ Set getScopesForConnectionlessNonSignIn();

    /* synthetic */ IBinder getServiceBrokerBinder();

    /* synthetic */ Intent getSignInIntent();

    /* synthetic */ boolean isConnected();

    /* synthetic */ boolean isConnecting();

    /* synthetic */ void onUserSignOut(c.e eVar);

    /* synthetic */ boolean providesSignIn();

    /* synthetic */ boolean requiresAccount();

    /* synthetic */ boolean requiresGooglePlayServices();

    /* synthetic */ boolean requiresSignIn();

    zzua zzq();
}
