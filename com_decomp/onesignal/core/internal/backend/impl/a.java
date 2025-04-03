package com.onesignal.core.internal.backend.impl;

import cb.l;
import com.onesignal.common.i;
import db.m;
import db.t;
import org.json.JSONObject;

public final class a implements m7.b {
    private final s7.b _http;

    /* renamed from: com.onesignal.core.internal.backend.impl.a$a  reason: collision with other inner class name */
    static final class C0123a extends kotlin.coroutines.jvm.internal.d {
        Object L$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ a this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0123a(a aVar, va.d dVar) {
            super(dVar);
            this.this$0 = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.fetchParams((String) null, (String) null, this);
        }
    }

    static final class b extends m implements l {
        final /* synthetic */ t $influenceParams;
        final /* synthetic */ a this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(t tVar, a aVar) {
            super(1);
            this.$influenceParams = tVar;
            this.this$0 = aVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((JSONObject) obj);
            return sa.t.f15300a;
        }

        public final void invoke(JSONObject jSONObject) {
            db.l.e(jSONObject, "it");
            this.$influenceParams.f9426e = this.this$0.processOutcomeJson(jSONObject);
        }
    }

    static final class c extends m implements l {
        final /* synthetic */ t $fcmParams;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(t tVar) {
            super(1);
            this.$fcmParams = tVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((JSONObject) obj);
            return sa.t.f15300a;
        }

        public final void invoke(JSONObject jSONObject) {
            db.l.e(jSONObject, "it");
            t tVar = this.$fcmParams;
            String safeString = i.safeString(jSONObject, "api_key");
            tVar.f9426e = new m7.a(i.safeString(jSONObject, "project_id"), i.safeString(jSONObject, "app_id"), safeString);
        }
    }

    static final class d extends m implements l {
        final /* synthetic */ t $isDirectEnabled;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(t tVar) {
            super(1);
            this.$isDirectEnabled = tVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((JSONObject) obj);
            return sa.t.f15300a;
        }

        public final void invoke(JSONObject jSONObject) {
            db.l.e(jSONObject, "it");
            this.$isDirectEnabled.f9426e = i.safeBool(jSONObject, "enabled");
        }
    }

    static final class e extends m implements l {
        final /* synthetic */ t $iamLimit;
        final /* synthetic */ t $indirectIAMAttributionWindow;
        final /* synthetic */ t $indirectNotificationAttributionWindow;
        final /* synthetic */ t $isIndirectEnabled;
        final /* synthetic */ t $notificationLimit;

        /* renamed from: com.onesignal.core.internal.backend.impl.a$e$a  reason: collision with other inner class name */
        static final class C0124a extends m implements l {
            final /* synthetic */ t $indirectNotificationAttributionWindow;
            final /* synthetic */ t $notificationLimit;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0124a(t tVar, t tVar2) {
                super(1);
                this.$indirectNotificationAttributionWindow = tVar;
                this.$notificationLimit = tVar2;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((JSONObject) obj);
                return sa.t.f15300a;
            }

            public final void invoke(JSONObject jSONObject) {
                db.l.e(jSONObject, "it");
                this.$indirectNotificationAttributionWindow.f9426e = i.safeInt(jSONObject, "minutes_since_displayed");
                this.$notificationLimit.f9426e = i.safeInt(jSONObject, "limit");
            }
        }

        static final class b extends m implements l {
            final /* synthetic */ t $iamLimit;
            final /* synthetic */ t $indirectIAMAttributionWindow;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            b(t tVar, t tVar2) {
                super(1);
                this.$indirectIAMAttributionWindow = tVar;
                this.$iamLimit = tVar2;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((JSONObject) obj);
                return sa.t.f15300a;
            }

            public final void invoke(JSONObject jSONObject) {
                db.l.e(jSONObject, "it");
                this.$indirectIAMAttributionWindow.f9426e = i.safeInt(jSONObject, "minutes_since_displayed");
                this.$iamLimit.f9426e = i.safeInt(jSONObject, "limit");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(t tVar, t tVar2, t tVar3, t tVar4, t tVar5) {
            super(1);
            this.$isIndirectEnabled = tVar;
            this.$indirectNotificationAttributionWindow = tVar2;
            this.$notificationLimit = tVar3;
            this.$indirectIAMAttributionWindow = tVar4;
            this.$iamLimit = tVar5;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((JSONObject) obj);
            return sa.t.f15300a;
        }

        public final void invoke(JSONObject jSONObject) {
            db.l.e(jSONObject, "indirectJSON");
            this.$isIndirectEnabled.f9426e = i.safeBool(jSONObject, "enabled");
            i.expandJSONObject(jSONObject, "notification_attribution", new C0124a(this.$indirectNotificationAttributionWindow, this.$notificationLimit));
            i.expandJSONObject(jSONObject, "in_app_message_attribution", new b(this.$indirectIAMAttributionWindow, this.$iamLimit));
        }
    }

    static final class f extends m implements l {
        final /* synthetic */ t $isUnattributedEnabled;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(t tVar) {
            super(1);
            this.$isUnattributedEnabled = tVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((JSONObject) obj);
            return sa.t.f15300a;
        }

        public final void invoke(JSONObject jSONObject) {
            db.l.e(jSONObject, "it");
            this.$isUnattributedEnabled.f9426e = i.safeBool(jSONObject, "enabled");
        }
    }

    public a(s7.b bVar) {
        db.l.e(bVar, "_http");
        this._http = bVar;
    }

    /* access modifiers changed from: private */
    public final m7.c processOutcomeJson(JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject;
        t tVar = new t();
        t tVar2 = new t();
        t tVar3 = new t();
        t tVar4 = new t();
        t tVar5 = new t();
        t tVar6 = new t();
        t tVar7 = new t();
        i.expandJSONObject(jSONObject2, com.onesignal.session.internal.influence.impl.e.DIRECT_TAG, new d(tVar5));
        i.expandJSONObject(jSONObject2, "indirect", new e(tVar6, tVar, tVar2, tVar3, tVar4));
        i.expandJSONObject(jSONObject2, "unattributed", new f(tVar7));
        return new m7.c((Integer) tVar.f9426e, (Integer) tVar2.f9426e, (Integer) tVar3.f9426e, (Integer) tVar4.f9426e, (Boolean) tVar5.f9426e, (Boolean) tVar6.f9426e, (Boolean) tVar7.f9426e);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x016a  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object fetchParams(java.lang.String r31, java.lang.String r32, va.d r33) {
        /*
            r30 = this;
            r0 = r30
            r1 = r31
            r2 = r32
            r3 = r33
            boolean r4 = r3 instanceof com.onesignal.core.internal.backend.impl.a.C0123a
            if (r4 == 0) goto L_0x001b
            r4 = r3
            com.onesignal.core.internal.backend.impl.a$a r4 = (com.onesignal.core.internal.backend.impl.a.C0123a) r4
            int r5 = r4.label
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r5 & r6
            if (r7 == 0) goto L_0x001b
            int r5 = r5 - r6
            r4.label = r5
            goto L_0x0020
        L_0x001b:
            com.onesignal.core.internal.backend.impl.a$a r4 = new com.onesignal.core.internal.backend.impl.a$a
            r4.<init>(r0, r3)
        L_0x0020:
            java.lang.Object r3 = r4.result
            java.lang.Object r5 = wa.d.c()
            int r6 = r4.label
            r7 = 1
            if (r6 == 0) goto L_0x003d
            if (r6 != r7) goto L_0x0035
            java.lang.Object r1 = r4.L$0
            com.onesignal.core.internal.backend.impl.a r1 = (com.onesignal.core.internal.backend.impl.a) r1
            sa.o.b(r3)
            goto L_0x00a7
        L_0x0035:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x003d:
            sa.o.b(r3)
            c8.b r3 = c8.b.DEBUG
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r8 = "ParamsBackendService.fetchParams(appId: "
            r6.append(r8)
            r6.append(r1)
            java.lang.String r8 = ", subscriptionId: "
            r6.append(r8)
            r6.append(r2)
            r8 = 41
            r6.append(r8)
            java.lang.String r6 = r6.toString()
            com.onesignal.debug.internal.logging.a.log(r3, r6)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r6 = "apps/"
            r3.append(r6)
            r3.append(r1)
            java.lang.String r1 = "/android_params.js"
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            if (r2 == 0) goto L_0x0097
            com.onesignal.common.h r3 = com.onesignal.common.h.INSTANCE
            boolean r3 = r3.isLocalId(r2)
            if (r3 != 0) goto L_0x0097
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r1)
            java.lang.String r1 = "?player_id="
            r3.append(r1)
            r3.append(r2)
            java.lang.String r1 = r3.toString()
        L_0x0097:
            s7.b r2 = r0._http
            r4.L$0 = r0
            r4.label = r7
            java.lang.String r3 = "CACHE_KEY_REMOTE_PARAMS"
            java.lang.Object r3 = r2.get(r1, r3, r4)
            if (r3 != r5) goto L_0x00a6
            return r5
        L_0x00a6:
            r1 = r0
        L_0x00a7:
            s7.a r3 = (s7.a) r3
            boolean r2 = r3.isSuccess()
            if (r2 == 0) goto L_0x016a
            org.json.JSONObject r2 = new org.json.JSONObject
            java.lang.String r3 = r3.getPayload()
            db.l.b(r3)
            r2.<init>(r3)
            db.t r3 = new db.t
            r3.<init>()
            com.onesignal.core.internal.backend.impl.a$b r4 = new com.onesignal.core.internal.backend.impl.a$b
            r4.<init>(r3, r1)
            java.lang.String r1 = "outcomes"
            com.onesignal.common.i.expandJSONObject(r2, r1, r4)
            db.t r1 = new db.t
            r1.<init>()
            com.onesignal.core.internal.backend.impl.a$c r4 = new com.onesignal.core.internal.backend.impl.a$c
            r4.<init>(r1)
            java.lang.String r5 = "fcm"
            com.onesignal.common.i.expandJSONObject(r2, r5, r4)
            m7.d r4 = new m7.d
            java.lang.String r5 = "android_sender_id"
            java.lang.String r7 = com.onesignal.common.i.safeString(r2, r5)
            java.lang.String r5 = "enterp"
            java.lang.Boolean r8 = com.onesignal.common.i.safeBool(r2, r5)
            java.lang.String r5 = "require_ident_auth"
            java.lang.Boolean r9 = com.onesignal.common.i.safeBool(r2, r5)
            java.lang.String r5 = "chnl_lst"
            org.json.JSONArray r10 = r2.optJSONArray(r5)
            java.lang.String r5 = "fba"
            java.lang.Boolean r11 = com.onesignal.common.i.safeBool(r2, r5)
            java.lang.String r5 = "restore_ttl_filter"
            java.lang.Boolean r12 = com.onesignal.common.i.safeBool(r2, r5)
            java.lang.String r5 = "clear_group_on_summary_click"
            java.lang.Boolean r13 = com.onesignal.common.i.safeBool(r2, r5)
            java.lang.String r5 = "receive_receipts_enable"
            java.lang.Boolean r14 = com.onesignal.common.i.safeBool(r2, r5)
            java.lang.String r5 = "disable_gms_missing_prompt"
            java.lang.Boolean r15 = com.onesignal.common.i.safeBool(r2, r5)
            java.lang.String r5 = "unsubscribe_on_notifications_disabled"
            java.lang.Boolean r16 = com.onesignal.common.i.safeBool(r2, r5)
            java.lang.String r5 = "location_shared"
            java.lang.Boolean r17 = com.onesignal.common.i.safeBool(r2, r5)
            java.lang.String r5 = "requires_user_privacy_consent"
            java.lang.Boolean r18 = com.onesignal.common.i.safeBool(r2, r5)
            java.lang.String r5 = "oprepo_execution_interval"
            java.lang.Long r19 = com.onesignal.common.i.safeLong(r2, r5)
            java.lang.Object r2 = r3.f9426e
            m7.c r2 = (m7.c) r2
            if (r2 != 0) goto L_0x0149
            m7.c r2 = new m7.c
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 127(0x7f, float:1.78E-43)
            r29 = 0
            r20 = r2
            r20.<init>(r21, r22, r23, r24, r25, r26, r27, r28, r29)
            goto L_0x014b
        L_0x0149:
            r20 = r2
        L_0x014b:
            java.lang.Object r1 = r1.f9426e
            m7.a r1 = (m7.a) r1
            if (r1 != 0) goto L_0x0163
            m7.a r1 = new m7.a
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 7
            r26 = 0
            r21 = r1
            r21.<init>(r22, r23, r24, r25, r26)
            goto L_0x0165
        L_0x0163:
            r21 = r1
        L_0x0165:
            r6 = r4
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            return r4
        L_0x016a:
            h7.a r1 = new h7.a
            int r2 = r3.getStatusCode()
            java.lang.String r3 = r3.getPayload()
            r1.<init>(r2, r3)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.core.internal.backend.impl.a.fetchParams(java.lang.String, java.lang.String, va.d):java.lang.Object");
    }
}
