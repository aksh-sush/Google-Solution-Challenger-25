package com.onesignal.notifications.internal.registration.impl;

import android.util.Base64;
import cb.p;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.messaging.FirebaseMessaging;
import db.t;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.ExecutionException;
import kotlin.coroutines.jvm.internal.l;
import l7.f;
import mb.d0;
import mb.h;
import mb.h0;
import mb.i0;
import mb.j0;
import mb.o1;
import mb.w0;
import n4.i;
import sa.o;

public final class g extends f {
    public static final a Companion = new a((db.g) null);
    private static final String FCM_APP_NAME = "ONESIGNAL_SDK_FCM_APP_NAME";
    private static final String FCM_DEFAULT_API_KEY_BASE64 = "QUl6YVN5QW5UTG41LV80TWMyYTJQLWRLVWVFLWFCdGd5Q3JqbFlV";
    private static final String FCM_DEFAULT_APP_ID = "1:754795614042:android:c682b8144a8dd52bc1ad63";
    private static final String FCM_DEFAULT_PROJECT_ID = "onesignal-shared-public";
    private final f _applicationService;
    private com.onesignal.core.internal.config.b _configModelStore;
    private final String apiKey;
    private final String appId;
    /* access modifiers changed from: private */
    public FirebaseApp firebaseApp;
    private final String projectId;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(db.g gVar) {
            this();
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.d {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ g this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(g gVar, va.d dVar) {
            super(dVar);
            this.this$0 = gVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.getToken((String) null, this);
        }
    }

    static final class c extends l implements p {
        final /* synthetic */ String $senderId;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ g this$0;

        static final class a extends l implements p {
            final /* synthetic */ Method $getTokenMethod;
            final /* synthetic */ Object $instanceId;
            final /* synthetic */ String $senderId;
            final /* synthetic */ t $token;
            int label;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(Method method, Object obj, String str, t tVar, va.d dVar) {
                super(2, dVar);
                this.$getTokenMethod = method;
                this.$instanceId = obj;
                this.$senderId = str;
                this.$token = tVar;
            }

            public final va.d create(Object obj, va.d dVar) {
                return new a(this.$getTokenMethod, this.$instanceId, this.$senderId, this.$token, dVar);
            }

            public final Object invokeSuspend(Object obj) {
                Object unused = d.c();
                if (this.label == 0) {
                    o.b(obj);
                    Object invoke = this.$getTokenMethod.invoke(this.$instanceId, new Object[]{this.$senderId, FirebaseMessaging.INSTANCE_ID_SCOPE});
                    t tVar = this.$token;
                    db.l.c(invoke, "null cannot be cast to non-null type kotlin.String");
                    tVar.f9426e = (String) invoke;
                    return sa.t.f15300a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            public final Object invoke(h0 h0Var, va.d dVar) {
                return ((a) create(h0Var, dVar)).invokeSuspend(sa.t.f15300a);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(g gVar, String str, va.d dVar) {
            super(2, dVar);
            this.this$0 = gVar;
            this.$senderId = str;
        }

        public final va.d create(Object obj, va.d dVar) {
            c cVar = new c(this.this$0, this.$senderId, dVar);
            cVar.L$0 = obj;
            return cVar;
        }

        public final Object invokeSuspend(Object obj) {
            Class<String> cls = String.class;
            Object unused = d.c();
            if (this.label == 0) {
                o.b(obj);
                h0 h0Var = (h0) this.L$0;
                t tVar = new t();
                tVar.f9426e = "";
                try {
                    Object invoke = Class.forName("com.google.firebase.iid.FirebaseInstanceId").getMethod("getInstance", new Class[]{FirebaseApp.class}).invoke((Object) null, new Object[]{this.this$0.firebaseApp});
                    Method method = invoke.getClass().getMethod("getToken", new Class[]{cls, cls});
                    o1 unused2 = j.d(h0Var, w0.a(), (j0) null, new a(method, invoke, this.$senderId, tVar, (va.d) null), 2, (Object) null);
                    return tVar.f9426e;
                } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e10) {
                    throw new Error("Reflection error on FirebaseInstanceId.getInstance(firebaseApp).getToken(senderId, FirebaseMessaging.INSTANCE_ID_SCOPE)", e10);
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        public final Object invoke(h0 h0Var, va.d dVar) {
            return ((c) create(h0Var, dVar)).invokeSuspend(sa.t.f15300a);
        }
    }

    static final class d extends l implements p {
        Object L$0;
        int label;
        final /* synthetic */ g this$0;

        static final class a extends l implements p {
            final /* synthetic */ t $token;
            int label;
            final /* synthetic */ g this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(g gVar, t tVar, va.d dVar) {
                super(2, dVar);
                this.this$0 = gVar;
                this.$token = tVar;
            }

            public final va.d create(Object obj, va.d dVar) {
                return new a(this.this$0, this.$token, dVar);
            }

            public final Object invokeSuspend(Object obj) {
                Object unused = d.c();
                if (this.label == 0) {
                    o.b(obj);
                    FirebaseApp access$getFirebaseApp$p = this.this$0.firebaseApp;
                    db.l.b(access$getFirebaseApp$p);
                    i token = ((FirebaseMessaging) access$getFirebaseApp$p.get(FirebaseMessaging.class)).getToken();
                    db.l.d(token, "fcmInstance.token");
                    try {
                        t tVar = this.$token;
                        Object a10 = n4.l.a(token);
                        db.l.d(a10, "await(tokenTask)");
                        tVar.f9426e = a10;
                        return sa.t.f15300a;
                    } catch (ExecutionException unused2) {
                        Exception exception = token.getException();
                        db.l.d(exception, "tokenTask.exception");
                        throw exception;
                    }
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            public final Object invoke(h0 h0Var, va.d dVar) {
                return ((a) create(h0Var, dVar)).invokeSuspend(sa.t.f15300a);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(g gVar, va.d dVar) {
            super(2, dVar);
            this.this$0 = gVar;
        }

        public final va.d create(Object obj, va.d dVar) {
            return new d(this.this$0, dVar);
        }

        public final Object invokeSuspend(Object obj) {
            t tVar;
            Object c10 = d.c();
            int i10 = this.label;
            if (i10 == 0) {
                o.b(obj);
                t tVar2 = new t();
                tVar2.f9426e = "";
                d0 a10 = w0.a();
                a aVar = new a(this.this$0, tVar2, (va.d) null);
                this.L$0 = tVar2;
                this.label = 1;
                if (h.g(a10, aVar, this) == c10) {
                    return c10;
                }
                tVar = tVar2;
            } else if (i10 == 1) {
                tVar = (t) this.L$0;
                o.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return tVar.f9426e;
        }

        public final Object invoke(h0 h0Var, va.d dVar) {
            return ((d) create(h0Var, dVar)).invokeSuspend(sa.t.f15300a);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g(com.onesignal.core.internal.config.b bVar, f fVar, a aVar, q7.a aVar2) {
        super(aVar2, bVar, aVar);
        db.l.e(bVar, "_configModelStore");
        db.l.e(fVar, "_applicationService");
        db.l.e(aVar, "upgradePrompt");
        db.l.e(aVar2, "deviceService");
        this._configModelStore = bVar;
        this._applicationService = fVar;
        com.onesignal.core.internal.config.c fcmParams = ((com.onesignal.core.internal.config.a) bVar.getModel()).getFcmParams();
        String projectId2 = fcmParams.getProjectId();
        this.projectId = projectId2 == null ? FCM_DEFAULT_PROJECT_ID : projectId2;
        String appId2 = fcmParams.getAppId();
        this.appId = appId2 == null ? FCM_DEFAULT_APP_ID : appId2;
        byte[] decode = Base64.decode(FCM_DEFAULT_API_KEY_BASE64, 0);
        db.l.d(decode, "decode(FCM_DEFAULT_API_KEY_BASE64, Base64.DEFAULT)");
        String str = new String(decode, lb.d.f13235b);
        String apiKey2 = fcmParams.getApiKey();
        this.apiKey = apiKey2 != null ? apiKey2 : str;
    }

    /* access modifiers changed from: private */
    public final Object getTokenWithClassFirebaseInstanceId(String str, va.d dVar) {
        return i0.b(new c(this, str, (va.d) null), dVar);
    }

    /* access modifiers changed from: private */
    public final Object getTokenWithClassFirebaseMessaging(va.d dVar) {
        return i0.b(new d(this, (va.d) null), dVar);
    }

    private final void initFirebaseApp(String str) {
        if (this.firebaseApp == null) {
            FirebaseOptions build = new FirebaseOptions.Builder().setGcmSenderId(str).setApplicationId(this.appId).setApiKey(this.apiKey).setProjectId(this.projectId).build();
            db.l.d(build, "Builder()\n              …\n                .build()");
            this.firebaseApp = FirebaseApp.initializeApp(this._applicationService.getAppContext(), build, FCM_APP_NAME);
        }
    }

    public String getProviderName() {
        return FirebaseMessaging.INSTANCE_ID_SCOPE;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object getToken(java.lang.String r8, va.d r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.onesignal.notifications.internal.registration.impl.g.b
            if (r0 == 0) goto L_0x0013
            r0 = r9
            com.onesignal.notifications.internal.registration.impl.g$b r0 = (com.onesignal.notifications.internal.registration.impl.g.b) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.onesignal.notifications.internal.registration.impl.g$b r0 = new com.onesignal.notifications.internal.registration.impl.g$b
            r0.<init>(r7, r9)
        L_0x0018:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = wa.d.c()
            int r2 = r0.label
            java.lang.String r3 = "FirebaseMessaging.getToken not found, attempting to use FirebaseInstanceId.getToken"
            r4 = 1
            r5 = 2
            r6 = 0
            if (r2 == 0) goto L_0x0043
            if (r2 == r4) goto L_0x0037
            if (r2 != r5) goto L_0x002f
            sa.o.b(r9)
            goto L_0x0068
        L_0x002f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0037:
            java.lang.Object r8 = r0.L$1
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r2 = r0.L$0
            com.onesignal.notifications.internal.registration.impl.g r2 = (com.onesignal.notifications.internal.registration.impl.g) r2
            sa.o.b(r9)     // Catch:{ NoClassDefFoundError | NoSuchMethodError -> 0x0058 }
            goto L_0x0056
        L_0x0043:
            sa.o.b(r9)
            r7.initFirebaseApp(r8)
            r0.L$0 = r7     // Catch:{ NoClassDefFoundError | NoSuchMethodError -> 0x0057 }
            r0.L$1 = r8     // Catch:{ NoClassDefFoundError | NoSuchMethodError -> 0x0057 }
            r0.label = r4     // Catch:{ NoClassDefFoundError | NoSuchMethodError -> 0x0057 }
            java.lang.Object r9 = r7.getTokenWithClassFirebaseMessaging(r0)     // Catch:{ NoClassDefFoundError | NoSuchMethodError -> 0x0057 }
            if (r9 != r1) goto L_0x0056
            return r1
        L_0x0056:
            return r9
        L_0x0057:
            r2 = r7
        L_0x0058:
            com.onesignal.debug.internal.logging.a.info$default(r3, r6, r5, r6)
            r0.L$0 = r6
            r0.L$1 = r6
            r0.label = r5
            java.lang.Object r9 = r2.getTokenWithClassFirebaseInstanceId(r8, r0)
            if (r9 != r1) goto L_0x0068
            return r1
        L_0x0068:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.notifications.internal.registration.impl.g.getToken(java.lang.String, va.d):java.lang.Object");
    }

    public final f get_applicationService() {
        return this._applicationService;
    }

    public final com.onesignal.core.internal.config.b get_configModelStore() {
        return this._configModelStore;
    }

    public final void set_configModelStore(com.onesignal.core.internal.config.b bVar) {
        db.l.e(bVar, "<set-?>");
        this._configModelStore = bVar;
    }
}
