package com.google.firebase.dynamiclinks.internal;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.v;
import com.google.android.gms.common.api.internal.w;
import com.google.android.gms.common.internal.s;
import com.google.firebase.FirebaseApp;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import com.google.firebase.dynamiclinks.DynamicLink;
import com.google.firebase.dynamiclinks.FirebaseDynamicLinks;
import com.google.firebase.dynamiclinks.PendingDynamicLinkData;
import com.google.firebase.dynamiclinks.internal.IDynamicLinksCallbacks;
import com.google.firebase.inject.Provider;
import n4.i;
import n4.j;
import n4.l;

public class FirebaseDynamicLinksImpl extends FirebaseDynamicLinks {
    private static final String ANALYTICS_FDL_ORIGIN = "fdl";
    public static final String EXTRA_DYNAMIC_LINK_DATA = "com.google.firebase.dynamiclinks.DYNAMIC_LINK_DATA";
    public static final String KEY_SCION_DATA = "scionData";
    private static final String TAG = "FDL";
    private final Provider<AnalyticsConnector> analytics;
    private final FirebaseApp firebaseApp;
    private final com.google.android.gms.common.api.d googleApi;

    static class a extends IDynamicLinksCallbacks.Stub {
        a() {
        }

        public void onCreateShortDynamicLink(Status status, ShortDynamicLinkImpl shortDynamicLinkImpl) {
            throw new UnsupportedOperationException();
        }

        public void onGetDynamicLink(Status status, DynamicLinkData dynamicLinkData) {
            throw new UnsupportedOperationException();
        }
    }

    static class b extends a {

        /* renamed from: a  reason: collision with root package name */
        private final j f7802a;

        b(j jVar) {
            this.f7802a = jVar;
        }

        public void onCreateShortDynamicLink(Status status, ShortDynamicLinkImpl shortDynamicLinkImpl) {
            w.a(status, shortDynamicLinkImpl, this.f7802a);
        }
    }

    static final class c extends v {

        /* renamed from: d  reason: collision with root package name */
        private final Bundle f7803d;

        c(Bundle bundle) {
            super((q3.d[]) null, false, 13202);
            this.f7803d = bundle;
        }

        /* access modifiers changed from: protected */
        /* renamed from: f */
        public void b(DynamicLinksClient dynamicLinksClient, j jVar) {
            dynamicLinksClient.createShortDynamicLink(new b(jVar), this.f7803d);
        }
    }

    static class d extends a {

        /* renamed from: a  reason: collision with root package name */
        private final j f7804a;

        /* renamed from: b  reason: collision with root package name */
        private final Provider f7805b;

        public d(Provider provider, j jVar) {
            this.f7805b = provider;
            this.f7804a = jVar;
        }

        public void onGetDynamicLink(Status status, DynamicLinkData dynamicLinkData) {
            Bundle bundle;
            AnalyticsConnector analyticsConnector;
            w.a(status, dynamicLinkData == null ? null : new PendingDynamicLinkData(dynamicLinkData), this.f7804a);
            if (dynamicLinkData != null && (bundle = dynamicLinkData.getExtensionBundle().getBundle("scionData")) != null && bundle.keySet() != null && (analyticsConnector = (AnalyticsConnector) this.f7805b.get()) != null) {
                for (String next : bundle.keySet()) {
                    analyticsConnector.logEvent(FirebaseDynamicLinksImpl.ANALYTICS_FDL_ORIGIN, next, bundle.getBundle(next));
                }
            }
        }
    }

    static final class e extends v {

        /* renamed from: d  reason: collision with root package name */
        private final String f7806d;

        /* renamed from: e  reason: collision with root package name */
        private final Provider f7807e;

        e(Provider provider, String str) {
            super((q3.d[]) null, false, 13201);
            this.f7806d = str;
            this.f7807e = provider;
        }

        /* access modifiers changed from: protected */
        /* renamed from: f */
        public void b(DynamicLinksClient dynamicLinksClient, j jVar) {
            dynamicLinksClient.getDynamicLink(new d(this.f7807e, jVar), this.f7806d);
        }
    }

    public FirebaseDynamicLinksImpl(com.google.android.gms.common.api.d dVar, FirebaseApp firebaseApp2, Provider<AnalyticsConnector> provider) {
        this.googleApi = dVar;
        this.firebaseApp = (FirebaseApp) s.k(firebaseApp2);
        this.analytics = provider;
        if (provider.get() == null) {
            Log.w(TAG, "FDL logging failed. Add a dependency for Firebase Analytics to your app to enable logging of Dynamic Link events.");
        }
    }

    public static Uri createDynamicLink(Bundle bundle) {
        verifyDomainUriPrefix(bundle);
        Uri uri = (Uri) bundle.getParcelable(DynamicLink.Builder.KEY_DYNAMIC_LINK);
        if (uri != null) {
            return uri;
        }
        Uri.Builder builder = new Uri.Builder();
        Uri parse = Uri.parse((String) s.k(bundle.getString(DynamicLink.Builder.KEY_DOMAIN_URI_PREFIX)));
        builder.scheme(parse.getScheme());
        builder.authority(parse.getAuthority());
        builder.path(parse.getPath());
        Bundle bundle2 = bundle.getBundle(DynamicLink.Builder.KEY_DYNAMIC_LINK_PARAMETERS);
        if (bundle2 != null) {
            for (String next : bundle2.keySet()) {
                Object obj = bundle2.get(next);
                if (obj != null) {
                    builder.appendQueryParameter(next, obj.toString());
                }
            }
        }
        return builder.build();
    }

    public static void verifyDomainUriPrefix(Bundle bundle) {
        Uri uri = (Uri) bundle.getParcelable(DynamicLink.Builder.KEY_DYNAMIC_LINK);
        if (TextUtils.isEmpty(bundle.getString(DynamicLink.Builder.KEY_DOMAIN_URI_PREFIX)) && uri == null) {
            throw new IllegalArgumentException("FDL domain is missing. Set with setDomainUriPrefix() or setDynamicLinkDomain().");
        }
    }

    public i createShortDynamicLink(Bundle bundle) {
        verifyDomainUriPrefix(bundle);
        return this.googleApi.doWrite((v) new c(bundle));
    }

    public i getDynamicLink(Intent intent) {
        i doWrite = this.googleApi.doWrite((v) new e(this.analytics, intent.getDataString()));
        PendingDynamicLinkData pendingDynamicLinkData = getPendingDynamicLinkData(intent);
        return pendingDynamicLinkData != null ? l.e(pendingDynamicLinkData) : doWrite;
    }

    public FirebaseApp getFirebaseApp() {
        return this.firebaseApp;
    }

    public PendingDynamicLinkData getPendingDynamicLinkData(Intent intent) {
        DynamicLinkData dynamicLinkData = (DynamicLinkData) s3.e.b(intent, EXTRA_DYNAMIC_LINK_DATA, DynamicLinkData.CREATOR);
        if (dynamicLinkData != null) {
            return new PendingDynamicLinkData(dynamicLinkData);
        }
        return null;
    }

    public FirebaseDynamicLinksImpl(FirebaseApp firebaseApp2, Provider<AnalyticsConnector> provider) {
        this(new DynamicLinksApi(firebaseApp2.getApplicationContext()), firebaseApp2, provider);
    }

    public DynamicLink.Builder createDynamicLink() {
        return new DynamicLink.Builder(this);
    }

    public i getDynamicLink(Uri uri) {
        return this.googleApi.doWrite((v) new e(this.analytics, uri.toString()));
    }
}
