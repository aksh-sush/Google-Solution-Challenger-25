package com.onesignal.inAppMessages.internal.prompt.impl;

import com.onesignal.notifications.n;
import db.l;

public final class d extends b {
    private final n _notificationsManager;

    static final class a extends kotlin.coroutines.jvm.internal.d {
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ d this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(d dVar, va.d dVar2) {
            super(dVar2);
            this.this$0 = dVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.handlePrompt(this);
        }
    }

    public d(n nVar) {
        l.e(nVar, "_notificationsManager");
        this._notificationsManager = nVar;
    }

    public String getPromptKey() {
        return "push";
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object handlePrompt(va.d r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.onesignal.inAppMessages.internal.prompt.impl.d.a
            if (r0 == 0) goto L_0x0013
            r0 = r5
            com.onesignal.inAppMessages.internal.prompt.impl.d$a r0 = (com.onesignal.inAppMessages.internal.prompt.impl.d.a) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.onesignal.inAppMessages.internal.prompt.impl.d$a r0 = new com.onesignal.inAppMessages.internal.prompt.impl.d$a
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = wa.d.c()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            sa.o.b(r5)
            goto L_0x003f
        L_0x0029:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x0031:
            sa.o.b(r5)
            com.onesignal.notifications.n r5 = r4._notificationsManager
            r0.label = r3
            java.lang.Object r5 = r5.requestPermission(r3, r0)
            if (r5 != r1) goto L_0x003f
            return r1
        L_0x003f:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L_0x004a
            com.onesignal.inAppMessages.internal.prompt.impl.b$a r5 = com.onesignal.inAppMessages.internal.prompt.impl.b.a.PERMISSION_GRANTED
            goto L_0x004c
        L_0x004a:
            com.onesignal.inAppMessages.internal.prompt.impl.b$a r5 = com.onesignal.inAppMessages.internal.prompt.impl.b.a.PERMISSION_DENIED
        L_0x004c:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.inAppMessages.internal.prompt.impl.d.handlePrompt(va.d):java.lang.Object");
    }
}
