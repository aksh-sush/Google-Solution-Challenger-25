package com.google.android.gms.common.api;

import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.internal.o;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.k;
import com.google.android.gms.common.internal.s;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final C0085a f5280a;

    /* renamed from: b  reason: collision with root package name */
    private final g f5281b;

    /* renamed from: c  reason: collision with root package name */
    private final String f5282c;

    /* renamed from: com.google.android.gms.common.api.a$a  reason: collision with other inner class name */
    public static abstract class C0085a extends e {
        @Deprecated
        public f buildClient(Context context, Looper looper, com.google.android.gms.common.internal.d dVar, Object obj, GoogleApiClient.b bVar, GoogleApiClient.c cVar) {
            return buildClient(context, looper, dVar, obj, (com.google.android.gms.common.api.internal.g) bVar, (o) cVar);
        }

        public f buildClient(Context context, Looper looper, com.google.android.gms.common.internal.d dVar, Object obj, com.google.android.gms.common.api.internal.g gVar, o oVar) {
            throw new UnsupportedOperationException("buildClient must be implemented");
        }
    }

    public interface b {
    }

    public static class c {
    }

    public interface d {

        /* renamed from: a  reason: collision with root package name */
        public static final C0086a f5283a = new C0086a((m) null);

        /* renamed from: com.google.android.gms.common.api.a$d$a  reason: collision with other inner class name */
        public static final class C0086a implements d {
            /* synthetic */ C0086a(m mVar) {
            }
        }
    }

    public static abstract class e {
        public static final int API_PRIORITY_GAMES = 1;
        public static final int API_PRIORITY_OTHER = Integer.MAX_VALUE;
        public static final int API_PRIORITY_PLUS = 2;

        public List<Scope> getImpliedScopes(Object obj) {
            return Collections.emptyList();
        }

        public int getPriority() {
            return API_PRIORITY_OTHER;
        }
    }

    public interface f extends b {
        void connect(c.C0088c cVar);

        void disconnect();

        void disconnect(String str);

        void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

        q3.d[] getAvailableFeatures();

        String getEndpointPackageName();

        String getLastDisconnectMessage();

        int getMinApkVersion();

        void getRemoteService(k kVar, Set set);

        Set getScopesForConnectionlessNonSignIn();

        Intent getSignInIntent();

        boolean isConnected();

        boolean isConnecting();

        void onUserSignOut(c.e eVar);

        boolean providesSignIn();

        boolean requiresGooglePlayServices();

        boolean requiresSignIn();
    }

    public static final class g extends c {
    }

    public a(String str, C0085a aVar, g gVar) {
        s.l(aVar, "Cannot construct an Api with a null ClientBuilder");
        s.l(gVar, "Cannot construct an Api with a null ClientKey");
        this.f5282c = str;
        this.f5280a = aVar;
        this.f5281b = gVar;
    }

    public final C0085a a() {
        return this.f5280a;
    }

    public final c b() {
        return this.f5281b;
    }

    public final e c() {
        return this.f5280a;
    }

    public final String d() {
        return this.f5282c;
    }
}
