package com.onesignal.notifications.internal.pushtoken;

import com.onesignal.user.internal.subscriptions.f;
import db.l;
import kotlin.coroutines.jvm.internal.d;
import q7.a;

public final class b implements a {
    private final q7.a _deviceService;
    private final p9.a _pushRegistrator;
    private String pushToken;
    private f pushTokenStatus = f.NO_PERMISSION;

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[a.C0281a.values().length];
            iArr[a.C0281a.MISSING.ordinal()] = 1;
            iArr[a.C0281a.OUTDATED.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* renamed from: com.onesignal.notifications.internal.pushtoken.b$b  reason: collision with other inner class name */
    static final class C0180b extends d {
        Object L$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ b this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0180b(b bVar, va.d dVar) {
            super(dVar);
            this.this$0 = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.retrievePushToken(this);
        }
    }

    public b(p9.a aVar, q7.a aVar2) {
        l.e(aVar, "_pushRegistrator");
        l.e(aVar2, "_deviceService");
        this._pushRegistrator = aVar;
        this._deviceService = aVar2;
    }

    private final boolean pushStatusRuntimeError(f fVar) {
        return fVar.getValue() < -6;
    }

    public final String getPushToken() {
        return this.pushToken;
    }

    public final f getPushTokenStatus() {
        return this.pushTokenStatus;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object retrievePushToken(va.d r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.onesignal.notifications.internal.pushtoken.b.C0180b
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.onesignal.notifications.internal.pushtoken.b$b r0 = (com.onesignal.notifications.internal.pushtoken.b.C0180b) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.onesignal.notifications.internal.pushtoken.b$b r0 = new com.onesignal.notifications.internal.pushtoken.b$b
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = wa.d.c()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            java.lang.Object r0 = r0.L$0
            com.onesignal.notifications.internal.pushtoken.b r0 = (com.onesignal.notifications.internal.pushtoken.b) r0
            sa.o.b(r6)
            goto L_0x005a
        L_0x002d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x0035:
            sa.o.b(r6)
            q7.a r6 = r5._deviceService
            q7.a$a r6 = r6.getAndroidSupportLibraryStatus()
            int[] r2 = com.onesignal.notifications.internal.pushtoken.b.a.$EnumSwitchMapping$0
            int r6 = r6.ordinal()
            r6 = r2[r6]
            r2 = 2
            r4 = 0
            if (r6 == r3) goto L_0x00aa
            if (r6 == r2) goto L_0x00a2
            p9.a r6 = r5._pushRegistrator
            r0.L$0 = r5
            r0.label = r3
            java.lang.Object r6 = r6.registerForPush(r0)
            if (r6 != r1) goto L_0x0059
            return r1
        L_0x0059:
            r0 = r5
        L_0x005a:
            p9.a$a r6 = (p9.a.C0280a) r6
            com.onesignal.user.internal.subscriptions.f r1 = r6.getStatus()
            int r1 = r1.getValue()
            com.onesignal.user.internal.subscriptions.f r2 = com.onesignal.user.internal.subscriptions.f.SUBSCRIBED
            int r3 = r2.getValue()
            if (r1 != r3) goto L_0x0073
        L_0x006c:
            com.onesignal.user.internal.subscriptions.f r1 = r6.getStatus()
            r0.pushTokenStatus = r1
            goto L_0x009b
        L_0x0073:
            com.onesignal.user.internal.subscriptions.f r1 = r6.getStatus()
            int r1 = r1.getValue()
            int r2 = r2.getValue()
            if (r1 >= r2) goto L_0x0092
            java.lang.String r1 = r0.pushToken
            if (r1 != 0) goto L_0x009b
            com.onesignal.user.internal.subscriptions.f r1 = r0.pushTokenStatus
            com.onesignal.user.internal.subscriptions.f r2 = com.onesignal.user.internal.subscriptions.f.NO_PERMISSION
            if (r1 == r2) goto L_0x006c
            boolean r1 = r0.pushStatusRuntimeError(r1)
            if (r1 == 0) goto L_0x009b
            goto L_0x006c
        L_0x0092:
            com.onesignal.user.internal.subscriptions.f r1 = r0.pushTokenStatus
            boolean r1 = r0.pushStatusRuntimeError(r1)
            if (r1 == 0) goto L_0x009b
            goto L_0x006c
        L_0x009b:
            java.lang.String r6 = r6.getId()
            r0.pushToken = r6
            goto L_0x00b4
        L_0x00a2:
            java.lang.String r6 = "The included Android Support Library is too old or incomplete. Please update to the 26.0.0 revision or newer."
            com.onesignal.debug.internal.logging.a.fatal$default(r6, r4, r2, r4)
            com.onesignal.user.internal.subscriptions.f r6 = com.onesignal.user.internal.subscriptions.f.OUTDATED_ANDROID_SUPPORT_LIBRARY
            goto L_0x00b1
        L_0x00aa:
            java.lang.String r6 = "Could not find the Android Support Library. Please make sure it has been correctly added to your project."
            com.onesignal.debug.internal.logging.a.fatal$default(r6, r4, r2, r4)
            com.onesignal.user.internal.subscriptions.f r6 = com.onesignal.user.internal.subscriptions.f.MISSING_ANDROID_SUPPORT_LIBRARY
        L_0x00b1:
            r5.pushTokenStatus = r6
            r0 = r5
        L_0x00b4:
            com.onesignal.notifications.internal.pushtoken.c r6 = new com.onesignal.notifications.internal.pushtoken.c
            java.lang.String r1 = r0.pushToken
            com.onesignal.user.internal.subscriptions.f r0 = r0.pushTokenStatus
            r6.<init>(r1, r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.notifications.internal.pushtoken.b.retrievePushToken(va.d):java.lang.Object");
    }

    public final void setPushToken(String str) {
        this.pushToken = str;
    }

    public final void setPushTokenStatus(f fVar) {
        l.e(fVar, "<set-?>");
        this.pushTokenStatus = fVar;
    }
}
