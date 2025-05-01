package com.onesignal.core.internal.operations.impl;

import com.onesignal.common.modeling.i;
import db.l;

public final class a extends i {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(y7.a aVar) {
        super("operations", aVar);
        l.e(aVar, "prefs");
        load();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0110, code lost:
        r0.initializeFromJson(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0113, code lost:
        return r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public v7.f create(org.json.JSONObject r5) {
        /*
            r4 = this;
            r0 = 2
            r1 = 0
            if (r5 != 0) goto L_0x000a
            java.lang.String r5 = "null jsonObject sent to OperationModelStore.create"
        L_0x0006:
            com.onesignal.debug.internal.logging.a.error$default(r5, r1, r0, r1)
            return r1
        L_0x000a:
            java.lang.String r2 = "name"
            boolean r3 = r5.has(r2)
            if (r3 != 0) goto L_0x0029
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r3 = "jsonObject must have '"
            r5.append(r3)
            r5.append(r2)
            java.lang.String r2 = "' attribute"
            r5.append(r2)
            java.lang.String r5 = r5.toString()
            goto L_0x0006
        L_0x0029:
            java.lang.String r0 = r5.getString(r2)
            if (r0 == 0) goto L_0x0114
            int r1 = r0.hashCode()
            switch(r1) {
                case -1865677906: goto L_0x0103;
                case -1793763409: goto L_0x00f5;
                case -1606689981: goto L_0x00e7;
                case -1188793632: goto L_0x00d9;
                case -1080179201: goto L_0x00cb;
                case -828599391: goto L_0x00bd;
                case -516221659: goto L_0x00af;
                case -92337283: goto L_0x00a1;
                case 532599746: goto L_0x0092;
                case 846157390: goto L_0x0083;
                case 1707031487: goto L_0x0074;
                case 1763437688: goto L_0x0065;
                case 1852485538: goto L_0x0056;
                case 1983836079: goto L_0x0047;
                case 2135250281: goto L_0x0038;
                default: goto L_0x0036;
            }
        L_0x0036:
            goto L_0x0114
        L_0x0038:
            java.lang.String r1 = "track-session-start"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0114
            com.onesignal.user.internal.operations.n r0 = new com.onesignal.user.internal.operations.n
            r0.<init>()
            goto L_0x0110
        L_0x0047:
            java.lang.String r1 = "set-tag"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0114
            com.onesignal.user.internal.operations.k r0 = new com.onesignal.user.internal.operations.k
            r0.<init>()
            goto L_0x0110
        L_0x0056:
            java.lang.String r1 = "track-session-end"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0114
            com.onesignal.user.internal.operations.m r0 = new com.onesignal.user.internal.operations.m
            r0.<init>()
            goto L_0x0110
        L_0x0065:
            java.lang.String r1 = "delete-tag"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0114
            com.onesignal.user.internal.operations.d r0 = new com.onesignal.user.internal.operations.d
            r0.<init>()
            goto L_0x0110
        L_0x0074:
            java.lang.String r1 = "transfer-subscription"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0114
            com.onesignal.user.internal.operations.o r0 = new com.onesignal.user.internal.operations.o
            r0.<init>()
            goto L_0x0110
        L_0x0083:
            java.lang.String r1 = "create-subscription"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0114
            com.onesignal.user.internal.operations.a r0 = new com.onesignal.user.internal.operations.a
            r0.<init>()
            goto L_0x0110
        L_0x0092:
            java.lang.String r1 = "login-user-from-subscription"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0114
            com.onesignal.user.internal.operations.e r0 = new com.onesignal.user.internal.operations.e
            r0.<init>()
            goto L_0x0110
        L_0x00a1:
            java.lang.String r1 = "refresh-user"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0114
            com.onesignal.user.internal.operations.h r0 = new com.onesignal.user.internal.operations.h
            r0.<init>()
            goto L_0x0110
        L_0x00af:
            java.lang.String r1 = "set-alias"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0114
            com.onesignal.user.internal.operations.i r0 = new com.onesignal.user.internal.operations.i
            r0.<init>()
            goto L_0x0110
        L_0x00bd:
            java.lang.String r1 = "update-subscription"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0114
            com.onesignal.user.internal.operations.p r0 = new com.onesignal.user.internal.operations.p
            r0.<init>()
            goto L_0x0110
        L_0x00cb:
            java.lang.String r1 = "delete-subscription"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0114
            com.onesignal.user.internal.operations.c r0 = new com.onesignal.user.internal.operations.c
            r0.<init>()
            goto L_0x0110
        L_0x00d9:
            java.lang.String r1 = "set-property"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0114
            com.onesignal.user.internal.operations.j r0 = new com.onesignal.user.internal.operations.j
            r0.<init>()
            goto L_0x0110
        L_0x00e7:
            java.lang.String r1 = "track-purchase"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0114
            com.onesignal.user.internal.operations.l r0 = new com.onesignal.user.internal.operations.l
            r0.<init>()
            goto L_0x0110
        L_0x00f5:
            java.lang.String r1 = "login-user"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0114
            com.onesignal.user.internal.operations.f r0 = new com.onesignal.user.internal.operations.f
            r0.<init>()
            goto L_0x0110
        L_0x0103:
            java.lang.String r1 = "delete-alias"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0114
            com.onesignal.user.internal.operations.b r0 = new com.onesignal.user.internal.operations.b
            r0.<init>()
        L_0x0110:
            r0.initializeFromJson(r5)
            return r0
        L_0x0114:
            java.lang.Exception r5 = new java.lang.Exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unrecognized operation: "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r5.<init>(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.core.internal.operations.impl.a.create(org.json.JSONObject):v7.f");
    }
}
