package com.google.android.gms.common.api;

import android.accounts.Account;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.internal.e;
import com.google.android.gms.common.api.internal.g;
import com.google.android.gms.common.api.internal.j;
import com.google.android.gms.common.api.internal.o;
import com.google.android.gms.common.internal.s;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;
import k4.d;

@Deprecated
public abstract class GoogleApiClient {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final Set f5246a = Collections.newSetFromMap(new WeakHashMap());

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private Account f5247a;

        /* renamed from: b  reason: collision with root package name */
        private final Set f5248b = new HashSet();

        /* renamed from: c  reason: collision with root package name */
        private final Set f5249c = new HashSet();

        /* renamed from: d  reason: collision with root package name */
        private int f5250d;

        /* renamed from: e  reason: collision with root package name */
        private View f5251e;

        /* renamed from: f  reason: collision with root package name */
        private String f5252f;

        /* renamed from: g  reason: collision with root package name */
        private String f5253g;

        /* renamed from: h  reason: collision with root package name */
        private final Map f5254h = new androidx.collection.a();

        /* renamed from: i  reason: collision with root package name */
        private final Context f5255i;

        /* renamed from: j  reason: collision with root package name */
        private final Map f5256j = new androidx.collection.a();

        /* renamed from: k  reason: collision with root package name */
        private j f5257k;

        /* renamed from: l  reason: collision with root package name */
        private int f5258l = -1;

        /* renamed from: m  reason: collision with root package name */
        private c f5259m;

        /* renamed from: n  reason: collision with root package name */
        private Looper f5260n;

        /* renamed from: o  reason: collision with root package name */
        private q3.j f5261o = q3.j.q();

        /* renamed from: p  reason: collision with root package name */
        private a.C0085a f5262p = d.f12810c;

        /* renamed from: q  reason: collision with root package name */
        private final ArrayList f5263q = new ArrayList();

        /* renamed from: r  reason: collision with root package name */
        private final ArrayList f5264r = new ArrayList();

        public a(Context context) {
            this.f5255i = context;
            this.f5260n = context.getMainLooper();
            this.f5252f = context.getPackageName();
            this.f5253g = context.getClass().getName();
        }

        public a a(a aVar) {
            s.l(aVar, "Api must not be null");
            this.f5256j.put(aVar, (Object) null);
            List<Scope> impliedScopes = ((a.e) s.l(aVar.c(), "Base client builder must not be null")).getImpliedScopes((Object) null);
            this.f5249c.addAll(impliedScopes);
            this.f5248b.addAll(impliedScopes);
            return this;
        }

        public a b(b bVar) {
            s.l(bVar, "Listener must not be null");
            this.f5263q.add(bVar);
            return this;
        }

        public a c(c cVar) {
            s.l(cVar, "Listener must not be null");
            this.f5264r.add(cVar);
            return this;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v10, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v1, resolved type: com.google.android.gms.common.api.a} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public com.google.android.gms.common.api.GoogleApiClient d() {
            /*
                r22 = this;
                r1 = r22
                java.util.Map r0 = r1.f5256j
                boolean r0 = r0.isEmpty()
                r2 = 1
                r0 = r0 ^ r2
                java.lang.String r3 = "must call addApi() to add at least one API"
                com.google.android.gms.common.internal.s.b(r0, r3)
                com.google.android.gms.common.internal.d r0 = r22.f()
                java.util.Map r3 = r0.k()
                androidx.collection.a r11 = new androidx.collection.a
                r11.<init>()
                androidx.collection.a r14 = new androidx.collection.a
                r14.<init>()
                java.util.ArrayList r15 = new java.util.ArrayList
                r15.<init>()
                java.util.Map r4 = r1.f5256j
                java.util.Set r4 = r4.keySet()
                java.util.Iterator r12 = r4.iterator()
                r4 = 0
                r13 = 0
                r16 = r4
                r17 = 0
            L_0x0036:
                boolean r4 = r12.hasNext()
                if (r4 == 0) goto L_0x00d4
                java.lang.Object r4 = r12.next()
                r10 = r4
                com.google.android.gms.common.api.a r10 = (com.google.android.gms.common.api.a) r10
                java.util.Map r4 = r1.f5256j
                java.lang.Object r18 = r4.get(r10)
                java.lang.Object r4 = r3.get(r10)
                if (r4 == 0) goto L_0x0051
                r4 = 1
                goto L_0x0052
            L_0x0051:
                r4 = 0
            L_0x0052:
                java.lang.Boolean r5 = java.lang.Boolean.valueOf(r4)
                r11.put(r10, r5)
                com.google.android.gms.common.api.internal.a3 r9 = new com.google.android.gms.common.api.internal.a3
                r9.<init>(r10, r4)
                r15.add(r9)
                com.google.android.gms.common.api.a$a r4 = r10.a()
                java.lang.Object r4 = com.google.android.gms.common.internal.s.k(r4)
                r19 = r4
                com.google.android.gms.common.api.a$a r19 = (com.google.android.gms.common.api.a.C0085a) r19
                android.content.Context r5 = r1.f5255i
                android.os.Looper r6 = r1.f5260n
                r4 = r19
                r7 = r0
                r8 = r18
                r20 = r9
                r21 = r10
                r10 = r20
                com.google.android.gms.common.api.a$f r4 = r4.buildClient((android.content.Context) r5, (android.os.Looper) r6, (com.google.android.gms.common.internal.d) r7, (java.lang.Object) r8, (com.google.android.gms.common.api.GoogleApiClient.b) r9, (com.google.android.gms.common.api.GoogleApiClient.c) r10)
                com.google.android.gms.common.api.a$c r5 = r21.b()
                r14.put(r5, r4)
                int r5 = r19.getPriority()
                if (r5 != r2) goto L_0x0094
                if (r18 == 0) goto L_0x0092
                r17 = 1
                goto L_0x0094
            L_0x0092:
                r17 = 0
            L_0x0094:
                boolean r4 = r4.providesSignIn()
                if (r4 == 0) goto L_0x0036
                if (r16 != 0) goto L_0x009f
                r16 = r21
                goto L_0x0036
            L_0x009f:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r2 = r21.d()
                java.lang.String r3 = r16.d()
                java.lang.String r4 = java.lang.String.valueOf(r2)
                int r4 = r4.length()
                java.lang.String r5 = java.lang.String.valueOf(r3)
                int r5 = r5.length()
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                int r4 = r4 + 21
                int r4 = r4 + r5
                r6.<init>(r4)
                r6.append(r2)
                java.lang.String r2 = " cannot be used with "
                r6.append(r2)
                r6.append(r3)
                java.lang.String r2 = r6.toString()
                r0.<init>(r2)
                throw r0
            L_0x00d4:
                if (r16 == 0) goto L_0x012c
                if (r17 != 0) goto L_0x0102
                android.accounts.Account r3 = r1.f5247a
                if (r3 != 0) goto L_0x00de
                r3 = 1
                goto L_0x00df
            L_0x00de:
                r3 = 0
            L_0x00df:
                java.lang.Object[] r4 = new java.lang.Object[r2]
                java.lang.String r5 = r16.d()
                r4[r13] = r5
                java.lang.String r5 = "Must not set an account in GoogleApiClient.Builder when using %s. Set account in GoogleSignInOptions.Builder instead"
                com.google.android.gms.common.internal.s.p(r3, r5, r4)
                java.util.Set r3 = r1.f5248b
                java.util.Set r4 = r1.f5249c
                boolean r3 = r3.equals(r4)
                java.lang.Object[] r4 = new java.lang.Object[r2]
                java.lang.String r5 = r16.d()
                r4[r13] = r5
                java.lang.String r5 = "Must not set scopes in GoogleApiClient.Builder when using %s. Set account in GoogleSignInOptions.Builder instead."
                com.google.android.gms.common.internal.s.p(r3, r5, r4)
                goto L_0x012c
            L_0x0102:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r2 = r16.d()
                java.lang.String r3 = java.lang.String.valueOf(r2)
                int r3 = r3.length()
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                int r3 = r3 + 82
                r4.<init>(r3)
                java.lang.String r3 = "With using "
                r4.append(r3)
                r4.append(r2)
                java.lang.String r2 = ", GamesOptions can only be specified within GoogleSignInOptions.Builder"
                r4.append(r2)
                java.lang.String r2 = r4.toString()
                r0.<init>(r2)
                throw r0
            L_0x012c:
                java.util.Collection r3 = r14.values()
                int r16 = com.google.android.gms.common.api.internal.b1.r(r3, r2)
                com.google.android.gms.common.api.internal.b1 r2 = new com.google.android.gms.common.api.internal.b1
                android.content.Context r5 = r1.f5255i
                java.util.concurrent.locks.ReentrantLock r6 = new java.util.concurrent.locks.ReentrantLock
                r6.<init>()
                android.os.Looper r7 = r1.f5260n
                q3.j r9 = r1.f5261o
                com.google.android.gms.common.api.a$a r10 = r1.f5262p
                java.util.ArrayList r12 = r1.f5263q
                java.util.ArrayList r13 = r1.f5264r
                int r3 = r1.f5258l
                r4 = r2
                r8 = r0
                r0 = r15
                r15 = r3
                r17 = r0
                r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
                java.util.Set r3 = com.google.android.gms.common.api.GoogleApiClient.f5246a
                monitor-enter(r3)
                java.util.Set r0 = com.google.android.gms.common.api.GoogleApiClient.f5246a     // Catch:{ all -> 0x0171 }
                r0.add(r2)     // Catch:{ all -> 0x0171 }
                monitor-exit(r3)     // Catch:{ all -> 0x0171 }
                int r0 = r1.f5258l
                if (r0 < 0) goto L_0x0170
                com.google.android.gms.common.api.internal.j r0 = r1.f5257k
                com.google.android.gms.common.api.internal.t2 r0 = com.google.android.gms.common.api.internal.t2.i(r0)
                int r3 = r1.f5258l
                com.google.android.gms.common.api.GoogleApiClient$c r4 = r1.f5259m
                r0.j(r3, r2, r4)
            L_0x0170:
                return r2
            L_0x0171:
                r0 = move-exception
                monitor-exit(r3)     // Catch:{ all -> 0x0171 }
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.GoogleApiClient.a.d():com.google.android.gms.common.api.GoogleApiClient");
        }

        public a e(Handler handler) {
            s.l(handler, "Handler must not be null");
            this.f5260n = handler.getLooper();
            return this;
        }

        public final com.google.android.gms.common.internal.d f() {
            k4.a aVar = k4.a.f12798n;
            Map map = this.f5256j;
            a aVar2 = d.f12814g;
            if (map.containsKey(aVar2)) {
                aVar = (k4.a) this.f5256j.get(aVar2);
            }
            return new com.google.android.gms.common.internal.d(this.f5247a, this.f5248b, this.f5254h, this.f5250d, this.f5251e, this.f5252f, this.f5253g, aVar, false);
        }
    }

    public interface b extends g {
    }

    public interface c extends o {
    }

    public static Set h() {
        Set set = f5246a;
        synchronized (set) {
        }
        return set;
    }

    public abstract void connect();

    public abstract q3.b d(long j10, TimeUnit timeUnit);

    public abstract void disconnect();

    public abstract void e(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    public e f(e eVar) {
        throw new UnsupportedOperationException();
    }

    public e g(e eVar) {
        throw new UnsupportedOperationException();
    }

    public a.f i(a.c cVar) {
        throw new UnsupportedOperationException();
    }

    public Context j() {
        throw new UnsupportedOperationException();
    }

    public Looper k() {
        throw new UnsupportedOperationException();
    }

    public abstract boolean l();

    public boolean m(com.google.android.gms.common.api.internal.s sVar) {
        throw new UnsupportedOperationException();
    }

    public void n() {
        throw new UnsupportedOperationException();
    }

    public abstract void o(c cVar);

    public abstract void p(c cVar);
}
