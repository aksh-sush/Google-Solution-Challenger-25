package com.google.android.gms.common.api;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.internal.b;
import com.google.android.gms.common.api.internal.c;
import com.google.android.gms.common.api.internal.d0;
import com.google.android.gms.common.api.internal.e;
import com.google.android.gms.common.api.internal.g2;
import com.google.android.gms.common.api.internal.h;
import com.google.android.gms.common.api.internal.l;
import com.google.android.gms.common.api.internal.m;
import com.google.android.gms.common.api.internal.n;
import com.google.android.gms.common.api.internal.n1;
import com.google.android.gms.common.api.internal.p;
import com.google.android.gms.common.api.internal.q;
import com.google.android.gms.common.api.internal.s1;
import com.google.android.gms.common.api.internal.t;
import com.google.android.gms.common.api.internal.v;
import com.google.android.gms.common.api.internal.x;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.s;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import n4.i;
import n4.j;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;

public abstract class d {
    protected final h zaa;
    private final Context zab;
    private final String zac;
    private final a zad;
    private final a.d zae;
    private final c zaf;
    private final Looper zag;
    private final int zah;
    @NotOnlyInitialized
    private final GoogleApiClient zai;
    private final t zaj;

    public static class a {

        /* renamed from: c  reason: collision with root package name */
        public static final a f5285c = new C0087a().a();

        /* renamed from: a  reason: collision with root package name */
        public final t f5286a;

        /* renamed from: b  reason: collision with root package name */
        public final Looper f5287b;

        /* renamed from: com.google.android.gms.common.api.d$a$a  reason: collision with other inner class name */
        public static class C0087a {

            /* renamed from: a  reason: collision with root package name */
            private t f5288a;

            /* renamed from: b  reason: collision with root package name */
            private Looper f5289b;

            public a a() {
                if (this.f5288a == null) {
                    this.f5288a = new b();
                }
                if (this.f5289b == null) {
                    this.f5289b = Looper.getMainLooper();
                }
                return new a(this.f5288a, this.f5289b);
            }

            public C0087a b(Looper looper) {
                s.l(looper, "Looper must not be null.");
                this.f5289b = looper;
                return this;
            }

            public C0087a c(t tVar) {
                s.l(tVar, "StatusExceptionMapper must not be null.");
                this.f5288a = tVar;
                return this;
            }
        }

        private a(t tVar, Account account, Looper looper) {
            this.f5286a = tVar;
            this.f5287b = looper;
        }
    }

    public d(Activity activity, a aVar, a.d dVar, a aVar2) {
        this(activity, activity, aVar, dVar, aVar2);
    }

    private final e b(int i10, e eVar) {
        eVar.zak();
        this.zaa.G(this, i10, eVar);
        return eVar;
    }

    private final i c(int i10, v vVar) {
        j jVar = new j();
        this.zaa.H(this, i10, vVar, jVar, this.zaj);
        return jVar.a();
    }

    public GoogleApiClient asGoogleApiClient() {
        return this.zai;
    }

    /* access modifiers changed from: protected */
    public d.a createClientSettingsBuilder() {
        d.a aVar = new d.a();
        aVar.d((Account) null);
        aVar.c(Collections.emptySet());
        aVar.e(this.zab.getClass().getName());
        aVar.b(this.zab.getPackageName());
        return aVar;
    }

    /* access modifiers changed from: protected */
    public i disconnectService() {
        return this.zaa.A(this);
    }

    public <A extends a.b, T extends e> T doBestEffortWrite(T t10) {
        b(2, t10);
        return t10;
    }

    public <A extends a.b, T extends e> T doRead(T t10) {
        b(0, t10);
        return t10;
    }

    @Deprecated
    public <A extends a.b, T extends p, U extends x> i doRegisterEventListener(T t10, U u10) {
        s.k(t10);
        s.k(u10);
        throw null;
    }

    public i doUnregisterEventListener(l.a aVar) {
        return doUnregisterEventListener(aVar, 0);
    }

    public <A extends a.b, T extends e> T doWrite(T t10) {
        b(1, t10);
        return t10;
    }

    public final c getApiKey() {
        return this.zaf;
    }

    public a.d getApiOptions() {
        return this.zae;
    }

    public Context getApplicationContext() {
        return this.zab;
    }

    /* access modifiers changed from: protected */
    public String getContextAttributionTag() {
        return this.zac;
    }

    /* access modifiers changed from: protected */
    @Deprecated
    public String getContextFeatureId() {
        return this.zac;
    }

    public Looper getLooper() {
        return this.zag;
    }

    public <L> l registerListener(L l10, String str) {
        return m.a(l10, this.zag, str);
    }

    public final int zaa() {
        return this.zah;
    }

    public final a.f zab(Looper looper, n1 n1Var) {
        Looper looper2 = looper;
        a.f buildClient = ((a.C0085a) s.k(this.zad.a())).buildClient(this.zab, looper2, createClientSettingsBuilder().a(), (Object) this.zae, (GoogleApiClient.b) n1Var, (GoogleApiClient.c) n1Var);
        String contextAttributionTag = getContextAttributionTag();
        if (contextAttributionTag != null && (buildClient instanceof com.google.android.gms.common.internal.c)) {
            ((com.google.android.gms.common.internal.c) buildClient).setAttributionTag(contextAttributionTag);
        }
        if (contextAttributionTag == null || !(buildClient instanceof n)) {
            return buildClient;
        }
        n nVar = (n) buildClient;
        throw null;
    }

    public final g2 zac(Context context, Handler handler) {
        return new g2(context, handler, createClientSettingsBuilder().a());
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public d(android.app.Activity r2, com.google.android.gms.common.api.a r3, com.google.android.gms.common.api.a.d r4, com.google.android.gms.common.api.internal.t r5) {
        /*
            r1 = this;
            com.google.android.gms.common.api.d$a$a r0 = new com.google.android.gms.common.api.d$a$a
            r0.<init>()
            r0.c(r5)
            android.os.Looper r5 = r2.getMainLooper()
            r0.b(r5)
            com.google.android.gms.common.api.d$a r5 = r0.a()
            r1.<init>((android.app.Activity) r2, (com.google.android.gms.common.api.a) r3, (com.google.android.gms.common.api.a.d) r4, (com.google.android.gms.common.api.d.a) r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.d.<init>(android.app.Activity, com.google.android.gms.common.api.a, com.google.android.gms.common.api.a$d, com.google.android.gms.common.api.internal.t):void");
    }

    public <TResult, A extends a.b> i doBestEffortWrite(v vVar) {
        return c(2, vVar);
    }

    public <TResult, A extends a.b> i doRead(v vVar) {
        return c(0, vVar);
    }

    public <A extends a.b> i doRegisterEventListener(q qVar) {
        s.k(qVar);
        throw null;
    }

    public i doUnregisterEventListener(l.a aVar, int i10) {
        s.l(aVar, "Listener key cannot be null.");
        return this.zaa.B(this, aVar, i10);
    }

    public <TResult, A extends a.b> i doWrite(v vVar) {
        return c(1, vVar);
    }

    private d(Context context, Activity activity, a aVar, a.d dVar, a aVar2) {
        s.l(context, "Null context is not permitted.");
        s.l(aVar, "Api must not be null.");
        s.l(aVar2, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        this.zab = context.getApplicationContext();
        String str = null;
        if (y3.n.k()) {
            try {
                str = (String) Context.class.getMethod("getAttributionTag", new Class[0]).invoke(context, new Object[0]);
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
        }
        this.zac = str;
        this.zad = aVar;
        this.zae = dVar;
        this.zag = aVar2.f5287b;
        c a10 = c.a(aVar, dVar, str);
        this.zaf = a10;
        this.zai = new s1(this);
        h y10 = h.y(this.zab);
        this.zaa = y10;
        this.zah = y10.n();
        this.zaj = aVar2.f5286a;
        if (activity != null && !(activity instanceof GoogleApiActivity) && Looper.myLooper() == Looper.getMainLooper()) {
            d0.j(activity, y10, a10);
        }
        y10.c(this);
    }

    public d(Context context, a aVar, a.d dVar, a aVar2) {
        this(context, (Activity) null, aVar, dVar, aVar2);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public d(android.content.Context r2, com.google.android.gms.common.api.a r3, com.google.android.gms.common.api.a.d r4, com.google.android.gms.common.api.internal.t r5) {
        /*
            r1 = this;
            com.google.android.gms.common.api.d$a$a r0 = new com.google.android.gms.common.api.d$a$a
            r0.<init>()
            r0.c(r5)
            com.google.android.gms.common.api.d$a r5 = r0.a()
            r1.<init>((android.content.Context) r2, (com.google.android.gms.common.api.a) r3, (com.google.android.gms.common.api.a.d) r4, (com.google.android.gms.common.api.d.a) r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.d.<init>(android.content.Context, com.google.android.gms.common.api.a, com.google.android.gms.common.api.a$d, com.google.android.gms.common.api.internal.t):void");
    }
}
