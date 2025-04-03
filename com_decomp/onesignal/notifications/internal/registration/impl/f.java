package com.onesignal.notifications.internal.registration.impl;

import com.onesignal.common.AndroidUtils;
import db.g;
import db.l;
import java.io.IOException;
import p9.a;

public abstract class f implements p9.a, d {
    public static final a Companion = new a((g) null);
    private static final int REGISTRATION_RETRY_BACKOFF_MS = 10000;
    private static final int REGISTRATION_RETRY_COUNT = 5;
    private com.onesignal.core.internal.config.b _configModelStore;
    private final q7.a _deviceService;
    private final a _upgradePrompt;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.d {
        int I$0;
        Object L$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ f this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(f fVar, va.d dVar) {
            super(dVar);
            this.this$0 = fVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.attemptRegistration((String) null, 0, this);
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.d {
        Object L$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ f this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(f fVar, va.d dVar) {
            super(dVar);
            this.this$0 = fVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.internalRegisterForPush((String) null, this);
        }
    }

    static final class d extends kotlin.coroutines.jvm.internal.d {
        int I$0;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ f this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(f fVar, va.d dVar) {
            super(dVar);
            this.this$0 = fVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.registerInBackground((String) null, this);
        }
    }

    public f(q7.a aVar, com.onesignal.core.internal.config.b bVar, a aVar2) {
        l.e(aVar, "_deviceService");
        l.e(bVar, "_configModelStore");
        l.e(aVar2, "_upgradePrompt");
        this._deviceService = aVar;
        this._configModelStore = bVar;
        this._upgradePrompt = aVar2;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object attemptRegistration(java.lang.String r8, int r9, va.d r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof com.onesignal.notifications.internal.registration.impl.f.b
            if (r0 == 0) goto L_0x0013
            r0 = r10
            com.onesignal.notifications.internal.registration.impl.f$b r0 = (com.onesignal.notifications.internal.registration.impl.f.b) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.onesignal.notifications.internal.registration.impl.f$b r0 = new com.onesignal.notifications.internal.registration.impl.f$b
            r0.<init>(r7, r10)
        L_0x0018:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = wa.d.c()
            int r2 = r0.label
            r3 = 2
            java.lang.String r4 = " Token"
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L_0x003f
            if (r2 != r5) goto L_0x0037
            int r9 = r0.I$0
            java.lang.Object r8 = r0.L$0
            com.onesignal.notifications.internal.registration.impl.f r8 = (com.onesignal.notifications.internal.registration.impl.f) r8
            sa.o.b(r10)     // Catch:{ IOException -> 0x0035, all -> 0x0033 }
            goto L_0x0050
        L_0x0033:
            r9 = move-exception
            goto L_0x0070
        L_0x0035:
            r10 = move-exception
            goto L_0x0095
        L_0x0037:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x003f:
            sa.o.b(r10)
            r0.L$0 = r7     // Catch:{ IOException -> 0x0093, all -> 0x006e }
            r0.I$0 = r9     // Catch:{ IOException -> 0x0093, all -> 0x006e }
            r0.label = r5     // Catch:{ IOException -> 0x0093, all -> 0x006e }
            java.lang.Object r10 = r7.getToken(r8, r0)     // Catch:{ IOException -> 0x0093, all -> 0x006e }
            if (r10 != r1) goto L_0x004f
            return r1
        L_0x004f:
            r8 = r7
        L_0x0050:
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ IOException -> 0x0035, all -> 0x0033 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0035, all -> 0x0033 }
            r0.<init>()     // Catch:{ IOException -> 0x0035, all -> 0x0033 }
            java.lang.String r1 = "Device registered, push token = "
            r0.append(r1)     // Catch:{ IOException -> 0x0035, all -> 0x0033 }
            r0.append(r10)     // Catch:{ IOException -> 0x0035, all -> 0x0033 }
            java.lang.String r0 = r0.toString()     // Catch:{ IOException -> 0x0035, all -> 0x0033 }
            com.onesignal.debug.internal.logging.a.info$default(r0, r6, r3, r6)     // Catch:{ IOException -> 0x0035, all -> 0x0033 }
            p9.a$a r0 = new p9.a$a     // Catch:{ IOException -> 0x0035, all -> 0x0033 }
            com.onesignal.user.internal.subscriptions.f r1 = com.onesignal.user.internal.subscriptions.f.SUBSCRIBED     // Catch:{ IOException -> 0x0035, all -> 0x0033 }
            r0.<init>(r10, r1)     // Catch:{ IOException -> 0x0035, all -> 0x0033 }
            return r0
        L_0x006e:
            r9 = move-exception
            r8 = r7
        L_0x0070:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r0 = "Unknown error getting "
            r10.append(r0)
            java.lang.String r8 = r8.getProviderName()
            r10.append(r8)
            r10.append(r4)
            java.lang.String r8 = r10.toString()
            com.onesignal.debug.internal.logging.a.error(r8, r9)
            p9.a$a r8 = new p9.a$a
            com.onesignal.user.internal.subscriptions.f r9 = com.onesignal.user.internal.subscriptions.f.FIREBASE_FCM_ERROR_MISC_EXCEPTION
            r8.<init>(r6, r9)
            return r8
        L_0x0093:
            r10 = move-exception
            r8 = r7
        L_0x0095:
            com.onesignal.user.internal.subscriptions.f r0 = r8.pushStatusFromThrowable(r10)
            com.onesignal.common.AndroidUtils r1 = com.onesignal.common.AndroidUtils.INSTANCE
            java.lang.String r1 = r1.getRootCauseMessage(r10)
            java.lang.String r2 = "SERVICE_NOT_AVAILABLE"
            boolean r2 = db.l.a(r2, r1)
            if (r2 != 0) goto L_0x00b1
            java.lang.String r2 = "AUTHENTICATION_FAILED"
            boolean r2 = db.l.a(r2, r1)
            if (r2 == 0) goto L_0x00b0
            goto L_0x00b1
        L_0x00b0:
            r5 = 0
        L_0x00b1:
            if (r5 == 0) goto L_0x00fe
            java.lang.Exception r2 = new java.lang.Exception
            r2.<init>(r10)
            r10 = 4
            if (r9 < r10) goto L_0x00d9
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "Retry count of 5 exceed! Could not get a "
            r9.append(r10)
            java.lang.String r8 = r8.getProviderName()
            r9.append(r8)
            java.lang.String r8 = " Token."
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            com.onesignal.debug.internal.logging.a.error(r8, r2)
            goto L_0x00fd
        L_0x00d9:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r10 = "'Google Play services' returned "
            r8.append(r10)
            r8.append(r1)
            java.lang.String r10 = " error. Current retry count: "
            r8.append(r10)
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            com.onesignal.debug.internal.logging.a.info(r8, r2)
            if (r9 != r3) goto L_0x00fd
            p9.a$a r8 = new p9.a$a
            r8.<init>(r6, r0)
            return r8
        L_0x00fd:
            return r6
        L_0x00fe:
            java.lang.Exception r9 = new java.lang.Exception
            r9.<init>(r10)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r1 = "Error Getting "
            r10.append(r1)
            java.lang.String r8 = r8.getProviderName()
            r10.append(r8)
            r10.append(r4)
            java.lang.String r8 = r10.toString()
            com.onesignal.debug.internal.logging.a.error(r8, r9)
            p9.a$a r8 = new p9.a$a
            r8.<init>(r6, r0)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.notifications.internal.registration.impl.f.attemptRegistration(java.lang.String, int, va.d):java.lang.Object");
    }

    static /* synthetic */ Object fireCallback$suspendImpl(f fVar, String str, va.d dVar) {
        throw new Exception("Google has no callback mechanism for push registration!");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object internalRegisterForPush(java.lang.String r7, va.d r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.onesignal.notifications.internal.registration.impl.f.c
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.onesignal.notifications.internal.registration.impl.f$c r0 = (com.onesignal.notifications.internal.registration.impl.f.c) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.onesignal.notifications.internal.registration.impl.f$c r0 = new com.onesignal.notifications.internal.registration.impl.f$c
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = wa.d.c()
            int r2 = r0.label
            r3 = 1
            r4 = 2
            r5 = 0
            if (r2 == 0) goto L_0x0043
            if (r2 == r3) goto L_0x0039
            if (r2 != r4) goto L_0x0031
            java.lang.Object r7 = r0.L$0
            com.onesignal.notifications.internal.registration.impl.f r7 = (com.onesignal.notifications.internal.registration.impl.f) r7
            sa.o.b(r8)     // Catch:{ all -> 0x0041 }
            goto L_0x006b
        L_0x0031:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0039:
            java.lang.Object r7 = r0.L$0
            com.onesignal.notifications.internal.registration.impl.f r7 = (com.onesignal.notifications.internal.registration.impl.f) r7
            sa.o.b(r8)     // Catch:{ all -> 0x0041 }
            goto L_0x005a
        L_0x0041:
            r8 = move-exception
            goto L_0x007a
        L_0x0043:
            sa.o.b(r8)
            q7.a r8 = r6._deviceService     // Catch:{ all -> 0x0078 }
            boolean r8 = r8.isGMSInstalledAndEnabled()     // Catch:{ all -> 0x0078 }
            if (r8 == 0) goto L_0x005d
            r0.L$0 = r6     // Catch:{ all -> 0x0078 }
            r0.label = r3     // Catch:{ all -> 0x0078 }
            java.lang.Object r8 = r6.registerInBackground(r7, r0)     // Catch:{ all -> 0x0078 }
            if (r8 != r1) goto L_0x0059
            return r1
        L_0x0059:
            r7 = r6
        L_0x005a:
            p9.a$a r8 = (p9.a.C0280a) r8     // Catch:{ all -> 0x0041 }
            goto L_0x0077
        L_0x005d:
            com.onesignal.notifications.internal.registration.impl.a r7 = r6._upgradePrompt     // Catch:{ all -> 0x0078 }
            r0.L$0 = r6     // Catch:{ all -> 0x0078 }
            r0.label = r4     // Catch:{ all -> 0x0078 }
            java.lang.Object r7 = r7.showUpdateGPSDialog(r0)     // Catch:{ all -> 0x0078 }
            if (r7 != r1) goto L_0x006a
            return r1
        L_0x006a:
            r7 = r6
        L_0x006b:
            java.lang.String r8 = "'Google Play services' app not installed or disabled on the device."
            com.onesignal.debug.internal.logging.a.error$default(r8, r5, r4, r5)     // Catch:{ all -> 0x0041 }
            p9.a$a r8 = new p9.a$a     // Catch:{ all -> 0x0041 }
            com.onesignal.user.internal.subscriptions.f r0 = com.onesignal.user.internal.subscriptions.f.OUTDATED_GOOGLE_PLAY_SERVICES_APP     // Catch:{ all -> 0x0041 }
            r8.<init>(r5, r0)     // Catch:{ all -> 0x0041 }
        L_0x0077:
            return r8
        L_0x0078:
            r8 = move-exception
            r7 = r6
        L_0x007a:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Could not register with "
            r0.append(r1)
            java.lang.String r7 = r7.getProviderName()
            r0.append(r7)
            java.lang.String r7 = " due to an issue with your AndroidManifest.xml or with 'Google Play services'."
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            com.onesignal.debug.internal.logging.a.error(r7, r8)
            p9.a$a r7 = new p9.a$a
            com.onesignal.user.internal.subscriptions.f r8 = com.onesignal.user.internal.subscriptions.f.FIREBASE_FCM_INIT_ERROR
            r7.<init>(r5, r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.notifications.internal.registration.impl.f.internalRegisterForPush(java.lang.String, va.d):java.lang.Object");
    }

    private final boolean isValidProjectNumber(String str) {
        boolean z10;
        try {
            l.b(str);
            Float.parseFloat(str);
            z10 = true;
        } catch (Throwable unused) {
            z10 = false;
        }
        return z10;
    }

    private final com.onesignal.user.internal.subscriptions.f pushStatusFromThrowable(Throwable th) {
        String rootCauseMessage = AndroidUtils.INSTANCE.getRootCauseMessage(th);
        return th instanceof IOException ? l.a(rootCauseMessage, "SERVICE_NOT_AVAILABLE") ? com.onesignal.user.internal.subscriptions.f.FIREBASE_FCM_ERROR_IOEXCEPTION_SERVICE_NOT_AVAILABLE : l.a(rootCauseMessage, "AUTHENTICATION_FAILED") ? com.onesignal.user.internal.subscriptions.f.FIREBASE_FCM_ERROR_IOEXCEPTION_AUTHENTICATION_FAILED : com.onesignal.user.internal.subscriptions.f.FIREBASE_FCM_ERROR_IOEXCEPTION_OTHER : com.onesignal.user.internal.subscriptions.f.FIREBASE_FCM_ERROR_MISC_EXCEPTION;
    }

    static /* synthetic */ Object registerForPush$suspendImpl(f fVar, va.d dVar) {
        if (!((com.onesignal.core.internal.config.a) fVar._configModelStore.getModel()).isInitializedWithRemote()) {
            return new a.C0280a((String) null, com.onesignal.user.internal.subscriptions.f.FIREBASE_FCM_INIT_ERROR);
        }
        if (!fVar._deviceService.getHasFCMLibrary()) {
            com.onesignal.debug.internal.logging.a.fatal$default("The Firebase FCM library is missing! Please make sure to include it in your project.", (Throwable) null, 2, (Object) null);
            return new a.C0280a((String) null, com.onesignal.user.internal.subscriptions.f.MISSING_FIREBASE_FCM_LIBRARY);
        } else if (!fVar.isValidProjectNumber(((com.onesignal.core.internal.config.a) fVar._configModelStore.getModel()).getGoogleProjectNumber())) {
            com.onesignal.debug.internal.logging.a.error$default("Missing Google Project number!\nPlease enter a Google Project number / Sender ID on under App Settings > Android > Configuration on the OneSignal dashboard.", (Throwable) null, 2, (Object) null);
            return new a.C0280a((String) null, com.onesignal.user.internal.subscriptions.f.INVALID_FCM_SENDER_ID);
        } else {
            String googleProjectNumber = ((com.onesignal.core.internal.config.a) fVar._configModelStore.getModel()).getGoogleProjectNumber();
            l.b(googleProjectNumber);
            return fVar.internalRegisterForPush(googleProjectNumber, dVar);
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object registerInBackground(java.lang.String r10, va.d r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof com.onesignal.notifications.internal.registration.impl.f.d
            if (r0 == 0) goto L_0x0013
            r0 = r11
            com.onesignal.notifications.internal.registration.impl.f$d r0 = (com.onesignal.notifications.internal.registration.impl.f.d) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.onesignal.notifications.internal.registration.impl.f$d r0 = new com.onesignal.notifications.internal.registration.impl.f$d
            r0.<init>(r9, r11)
        L_0x0018:
            java.lang.Object r11 = r0.result
            java.lang.Object r1 = wa.d.c()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x004c
            if (r2 == r4) goto L_0x003e
            if (r2 != r3) goto L_0x0036
            int r10 = r0.I$0
            java.lang.Object r2 = r0.L$1
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r5 = r0.L$0
            com.onesignal.notifications.internal.registration.impl.f r5 = (com.onesignal.notifications.internal.registration.impl.f) r5
            sa.o.b(r11)
            goto L_0x0081
        L_0x0036:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x003e:
            int r10 = r0.I$0
            java.lang.Object r2 = r0.L$1
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r5 = r0.L$0
            com.onesignal.notifications.internal.registration.impl.f r5 = (com.onesignal.notifications.internal.registration.impl.f) r5
            sa.o.b(r11)
            goto L_0x0068
        L_0x004c:
            sa.o.b(r11)
            r11 = 0
            r2 = r9
        L_0x0051:
            r5 = 5
            if (r11 >= r5) goto L_0x0086
            r0.L$0 = r2
            r0.L$1 = r10
            r0.I$0 = r11
            r0.label = r4
            java.lang.Object r5 = r2.attemptRegistration(r10, r11, r0)
            if (r5 != r1) goto L_0x0063
            return r1
        L_0x0063:
            r8 = r2
            r2 = r10
            r10 = r11
            r11 = r5
            r5 = r8
        L_0x0068:
            p9.a$a r11 = (p9.a.C0280a) r11
            if (r11 == 0) goto L_0x006d
            return r11
        L_0x006d:
            int r11 = r10 + 1
            int r11 = r11 * 10000
            long r6 = (long) r11
            r0.L$0 = r5
            r0.L$1 = r2
            r0.I$0 = r10
            r0.label = r3
            java.lang.Object r11 = mb.r0.a(r6, r0)
            if (r11 != r1) goto L_0x0081
            return r1
        L_0x0081:
            int r11 = r10 + 1
            r10 = r2
            r2 = r5
            goto L_0x0051
        L_0x0086:
            p9.a$a r10 = new p9.a$a
            r11 = 0
            com.onesignal.user.internal.subscriptions.f r0 = com.onesignal.user.internal.subscriptions.f.FIREBASE_FCM_INIT_ERROR
            r10.<init>(r11, r0)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.notifications.internal.registration.impl.f.registerInBackground(java.lang.String, va.d):java.lang.Object");
    }

    public Object fireCallback(String str, va.d dVar) {
        return fireCallback$suspendImpl(this, str, dVar);
    }

    public abstract String getProviderName();

    public abstract Object getToken(String str, va.d dVar);

    public Object registerForPush(va.d dVar) {
        return registerForPush$suspendImpl(this, dVar);
    }
}
