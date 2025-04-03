package com.google.firebase.dynamiclinks.internal;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.d;

public class DynamicLinksApi extends d {
    static final com.google.android.gms.common.api.a API;
    private static final a.C0085a CLIENT_BUILDER;
    private static final a.g CLIENT_KEY;

    class a extends a.C0085a {
        a() {
        }

        /* renamed from: a */
        public DynamicLinksClient buildClient(Context context, Looper looper, com.google.android.gms.common.internal.d dVar, a.d.C0086a aVar, GoogleApiClient.b bVar, GoogleApiClient.c cVar) {
            return new DynamicLinksClient(context, looper, dVar, bVar, cVar);
        }
    }

    static {
        a.g gVar = new a.g();
        CLIENT_KEY = gVar;
        a aVar = new a();
        CLIENT_BUILDER = aVar;
        API = new com.google.android.gms.common.api.a("DynamicLinks.API", aVar, gVar);
    }

    public DynamicLinksApi(Context context) {
        super(context, API, (a.d) a.d.f5283a, d.a.f5285c);
    }
}
