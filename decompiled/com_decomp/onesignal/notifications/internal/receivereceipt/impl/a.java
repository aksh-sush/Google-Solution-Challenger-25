package com.onesignal.notifications.internal.receivereceipt.impl;

import db.l;
import kotlin.coroutines.jvm.internal.d;

public final class a implements o9.a {
    private final y8.a _backend;
    private final q7.a _deviceService;

    /* renamed from: com.onesignal.notifications.internal.receivereceipt.impl.a$a  reason: collision with other inner class name */
    static final class C0181a extends d {
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ a this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0181a(a aVar, va.d dVar) {
            super(dVar);
            this.this$0 = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.sendReceiveReceipt((String) null, (String) null, (String) null, this);
        }
    }

    public a(q7.a aVar, y8.a aVar2) {
        l.e(aVar, "_deviceService");
        l.e(aVar2, "_backend");
        this._deviceService = aVar;
        this._backend = aVar2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object sendReceiveReceipt(java.lang.String r8, java.lang.String r9, java.lang.String r10, va.d r11) {
        /*
            r7 = this;
            boolean r0 = r11 instanceof com.onesignal.notifications.internal.receivereceipt.impl.a.C0181a
            if (r0 == 0) goto L_0x0013
            r0 = r11
            com.onesignal.notifications.internal.receivereceipt.impl.a$a r0 = (com.onesignal.notifications.internal.receivereceipt.impl.a.C0181a) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.onesignal.notifications.internal.receivereceipt.impl.a$a r0 = new com.onesignal.notifications.internal.receivereceipt.impl.a$a
            r0.<init>(r7, r11)
        L_0x0018:
            r6 = r0
            java.lang.Object r11 = r6.result
            java.lang.Object r0 = wa.d.c()
            int r1 = r6.label
            r2 = 1
            if (r1 == 0) goto L_0x0034
            if (r1 != r2) goto L_0x002c
            sa.o.b(r11)     // Catch:{ a -> 0x002a }
            goto L_0x0071
        L_0x002a:
            r8 = move-exception
            goto L_0x004b
        L_0x002c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0034:
            sa.o.b(r11)
            q7.a r11 = r7._deviceService
            q7.a$b r5 = r11.getDeviceType()
            y8.a r1 = r7._backend     // Catch:{ a -> 0x002a }
            r6.label = r2     // Catch:{ a -> 0x002a }
            r2 = r8
            r3 = r10
            r4 = r9
            java.lang.Object r8 = r1.updateNotificationAsReceived(r2, r3, r4, r5, r6)     // Catch:{ a -> 0x002a }
            if (r8 != r0) goto L_0x0071
            return r0
        L_0x004b:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "Receive receipt failed with statusCode: "
            r9.append(r10)
            int r10 = r8.getStatusCode()
            r9.append(r10)
            java.lang.String r10 = " response: "
            r9.append(r10)
            java.lang.String r8 = r8.getResponse()
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            r9 = 2
            r10 = 0
            com.onesignal.debug.internal.logging.a.error$default(r8, r10, r9, r10)
        L_0x0071:
            sa.t r8 = sa.t.f15300a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.notifications.internal.receivereceipt.impl.a.sendReceiveReceipt(java.lang.String, java.lang.String, java.lang.String, va.d):java.lang.Object");
    }
}
