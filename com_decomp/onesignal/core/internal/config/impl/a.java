package com.onesignal.core.internal.config.impl;

import com.onesignal.common.modeling.e;
import com.onesignal.common.modeling.h;
import db.g;
import kotlin.coroutines.jvm.internal.l;
import sa.t;
import va.d;

public final class a implements z7.b, e {
    public static final C0130a Companion = new C0130a((g) null);
    private static final int INCREASE_BETWEEN_RETRIES = 10000;
    private static final int MAX_WAIT_BETWEEN_RETRIES = 90000;
    private static final int MIN_WAIT_BETWEEN_RETRIES = 30000;
    /* access modifiers changed from: private */
    public final com.onesignal.core.internal.config.b _configModelStore;
    /* access modifiers changed from: private */
    public final m7.b _paramsBackendService;
    /* access modifiers changed from: private */
    public final com.onesignal.user.internal.subscriptions.b _subscriptionManager;

    /* renamed from: com.onesignal.core.internal.config.impl.a$a  reason: collision with other inner class name */
    public static final class C0130a {
        private C0130a() {
        }

        public /* synthetic */ C0130a(g gVar) {
            this();
        }
    }

    static final class b extends l implements cb.l {
        final /* synthetic */ String $appId;
        int I$0;
        int I$1;
        int label;
        final /* synthetic */ a this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(String str, a aVar, d dVar) {
            super(1, dVar);
            this.$appId = str;
            this.this$0 = aVar;
        }

        public final d create(d dVar) {
            return new b(this.$appId, this.this$0, dVar);
        }

        /* JADX WARNING: Removed duplicated region for block: B:101:0x01b3 A[Catch:{ a -> 0x025b }] */
        /* JADX WARNING: Removed duplicated region for block: B:104:0x01c8 A[Catch:{ a -> 0x025b }] */
        /* JADX WARNING: Removed duplicated region for block: B:107:0x01dd A[Catch:{ a -> 0x025b }] */
        /* JADX WARNING: Removed duplicated region for block: B:110:0x01f2 A[Catch:{ a -> 0x025b }] */
        /* JADX WARNING: Removed duplicated region for block: B:113:0x0207 A[Catch:{ a -> 0x025b }] */
        /* JADX WARNING: Removed duplicated region for block: B:120:0x0221 A[Catch:{ a -> 0x025b }] */
        /* JADX WARNING: Removed duplicated region for block: B:127:0x023b A[Catch:{ a -> 0x025b }] */
        /* JADX WARNING: Removed duplicated region for block: B:139:0x026c  */
        /* JADX WARNING: Removed duplicated region for block: B:141:0x0274  */
        /* JADX WARNING: Removed duplicated region for block: B:149:0x02b0  */
        /* JADX WARNING: Removed duplicated region for block: B:17:0x0074 A[Catch:{ a -> 0x025d }] */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x0076 A[Catch:{ a -> 0x025d }] */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x0079 A[Catch:{ a -> 0x025d }] */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x0086 A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x0087  */
        /* JADX WARNING: Removed duplicated region for block: B:28:0x00ea A[Catch:{ a -> 0x025b }] */
        /* JADX WARNING: Removed duplicated region for block: B:35:0x00fc A[Catch:{ a -> 0x025b }] */
        /* JADX WARNING: Removed duplicated region for block: B:42:0x010e A[Catch:{ a -> 0x025b }] */
        /* JADX WARNING: Removed duplicated region for block: B:49:0x0120 A[Catch:{ a -> 0x025b }] */
        /* JADX WARNING: Removed duplicated region for block: B:56:0x0132 A[Catch:{ a -> 0x025b }] */
        /* JADX WARNING: Removed duplicated region for block: B:63:0x0144 A[Catch:{ a -> 0x025b }] */
        /* JADX WARNING: Removed duplicated region for block: B:70:0x0156 A[Catch:{ a -> 0x025b }] */
        /* JADX WARNING: Removed duplicated region for block: B:77:0x0168 A[Catch:{ a -> 0x025b }] */
        /* JADX WARNING: Removed duplicated region for block: B:84:0x017a A[Catch:{ a -> 0x025b }] */
        /* JADX WARNING: Removed duplicated region for block: B:91:0x018c A[Catch:{ a -> 0x025b }] */
        /* JADX WARNING: Removed duplicated region for block: B:98:0x01a2 A[Catch:{ a -> 0x025b }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                r12 = this;
                java.lang.Object r0 = wa.d.c()
                int r1 = r12.label
                r2 = 2
                r3 = 0
                r4 = 0
                r5 = 1
                if (r1 == 0) goto L_0x0038
                if (r1 == r5) goto L_0x0025
                if (r1 != r2) goto L_0x001d
                int r1 = r12.I$1
                int r6 = r12.I$0
                sa.o.b(r13)
                r7 = r6
                r6 = r1
                r1 = r0
                r0 = r12
                goto L_0x02a9
            L_0x001d:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r0)
                throw r13
            L_0x0025:
                int r1 = r12.I$1
                int r6 = r12.I$0
                sa.o.b(r13)     // Catch:{ a -> 0x0031 }
                r7 = r6
                r6 = r1
                r1 = r0
                r0 = r12
                goto L_0x008d
            L_0x0031:
                r13 = move-exception
                r7 = r6
                r6 = r1
                r1 = r0
                r0 = r12
                goto L_0x0264
            L_0x0038:
                sa.o.b(r13)
                java.lang.StringBuilder r13 = new java.lang.StringBuilder
                r13.<init>()
                java.lang.String r1 = "ConfigModelListener: fetching parameters for appId: "
                r13.append(r1)
                java.lang.String r1 = r12.$appId
                r13.append(r1)
                java.lang.String r13 = r13.toString()
                com.onesignal.debug.internal.logging.a.debug$default(r13, r3, r2, r3)
                r1 = 0
                r6 = 0
                r13 = r12
            L_0x0054:
                com.onesignal.core.internal.config.impl.a r7 = r13.this$0     // Catch:{ a -> 0x025d }
                m7.b r7 = r7._paramsBackendService     // Catch:{ a -> 0x025d }
                java.lang.String r8 = r13.$appId     // Catch:{ a -> 0x025d }
                com.onesignal.core.internal.config.impl.a r9 = r13.this$0     // Catch:{ a -> 0x025d }
                com.onesignal.user.internal.subscriptions.b r9 = r9._subscriptionManager     // Catch:{ a -> 0x025d }
                com.onesignal.user.internal.subscriptions.c r9 = r9.getSubscriptions()     // Catch:{ a -> 0x025d }
                ba.b r9 = r9.getPush()     // Catch:{ a -> 0x025d }
                java.lang.String r9 = r9.getId()     // Catch:{ a -> 0x025d }
                int r10 = r9.length()     // Catch:{ a -> 0x025d }
                if (r10 != 0) goto L_0x0076
                r10 = 1
                goto L_0x0077
            L_0x0076:
                r10 = 0
            L_0x0077:
                if (r10 == 0) goto L_0x007a
                r9 = r3
            L_0x007a:
                r13.I$0 = r6     // Catch:{ a -> 0x025d }
                r13.I$1 = r1     // Catch:{ a -> 0x025d }
                r13.label = r5     // Catch:{ a -> 0x025d }
                java.lang.Object r7 = r7.fetchParams(r8, r9, r13)     // Catch:{ a -> 0x025d }
                if (r7 != r0) goto L_0x0087
                return r0
            L_0x0087:
                r11 = r0
                r0 = r13
                r13 = r7
                r7 = r6
                r6 = r1
                r1 = r11
            L_0x008d:
                m7.d r13 = (m7.d) r13     // Catch:{ a -> 0x025b }
                com.onesignal.core.internal.config.a r8 = new com.onesignal.core.internal.config.a     // Catch:{ a -> 0x025b }
                r8.<init>()     // Catch:{ a -> 0x025b }
                com.onesignal.core.internal.config.impl.a r9 = r0.this$0     // Catch:{ a -> 0x025b }
                com.onesignal.core.internal.config.b r9 = r9._configModelStore     // Catch:{ a -> 0x025b }
                com.onesignal.common.modeling.g r9 = r9.getModel()     // Catch:{ a -> 0x025b }
                r8.initializeFromModel(r3, r9)     // Catch:{ a -> 0x025b }
                r8.setInitializedWithRemote(r5)     // Catch:{ a -> 0x025b }
                java.lang.String r9 = r0.$appId     // Catch:{ a -> 0x025b }
                r8.setAppId(r9)     // Catch:{ a -> 0x025b }
                org.json.JSONArray r9 = r13.getNotificationChannels()     // Catch:{ a -> 0x025b }
                r8.setNotificationChannels(r9)     // Catch:{ a -> 0x025b }
                java.lang.String r9 = r13.getGoogleProjectNumber()     // Catch:{ a -> 0x025b }
                r8.setGoogleProjectNumber(r9)     // Catch:{ a -> 0x025b }
                com.onesignal.core.internal.config.c r9 = r8.getFcmParams()     // Catch:{ a -> 0x025b }
                m7.a r10 = r13.getFcmParams()     // Catch:{ a -> 0x025b }
                java.lang.String r10 = r10.getProjectId()     // Catch:{ a -> 0x025b }
                r9.setProjectId(r10)     // Catch:{ a -> 0x025b }
                com.onesignal.core.internal.config.c r9 = r8.getFcmParams()     // Catch:{ a -> 0x025b }
                m7.a r10 = r13.getFcmParams()     // Catch:{ a -> 0x025b }
                java.lang.String r10 = r10.getAppId()     // Catch:{ a -> 0x025b }
                r9.setAppId(r10)     // Catch:{ a -> 0x025b }
                com.onesignal.core.internal.config.c r9 = r8.getFcmParams()     // Catch:{ a -> 0x025b }
                m7.a r10 = r13.getFcmParams()     // Catch:{ a -> 0x025b }
                java.lang.String r10 = r10.getApiKey()     // Catch:{ a -> 0x025b }
                r9.setApiKey(r10)     // Catch:{ a -> 0x025b }
                java.lang.Boolean r9 = r13.getEnterprise()     // Catch:{ a -> 0x025b }
                if (r9 == 0) goto L_0x00f6
                boolean r9 = r9.booleanValue()     // Catch:{ a -> 0x025b }
                if (r9 == 0) goto L_0x00f2
                r9 = 1
                goto L_0x00f3
            L_0x00f2:
                r9 = 0
            L_0x00f3:
                r8.setEnterprise(r9)     // Catch:{ a -> 0x025b }
            L_0x00f6:
                java.lang.Boolean r9 = r13.getUseIdentityVerification()     // Catch:{ a -> 0x025b }
                if (r9 == 0) goto L_0x0108
                boolean r9 = r9.booleanValue()     // Catch:{ a -> 0x025b }
                if (r9 == 0) goto L_0x0104
                r9 = 1
                goto L_0x0105
            L_0x0104:
                r9 = 0
            L_0x0105:
                r8.setUseIdentityVerification(r9)     // Catch:{ a -> 0x025b }
            L_0x0108:
                java.lang.Boolean r9 = r13.getFirebaseAnalytics()     // Catch:{ a -> 0x025b }
                if (r9 == 0) goto L_0x011a
                boolean r9 = r9.booleanValue()     // Catch:{ a -> 0x025b }
                if (r9 == 0) goto L_0x0116
                r9 = 1
                goto L_0x0117
            L_0x0116:
                r9 = 0
            L_0x0117:
                r8.setFirebaseAnalytics(r9)     // Catch:{ a -> 0x025b }
            L_0x011a:
                java.lang.Boolean r9 = r13.getRestoreTTLFilter()     // Catch:{ a -> 0x025b }
                if (r9 == 0) goto L_0x012c
                boolean r9 = r9.booleanValue()     // Catch:{ a -> 0x025b }
                if (r9 == 0) goto L_0x0128
                r9 = 1
                goto L_0x0129
            L_0x0128:
                r9 = 0
            L_0x0129:
                r8.setRestoreTTLFilter(r9)     // Catch:{ a -> 0x025b }
            L_0x012c:
                java.lang.Boolean r9 = r13.getClearGroupOnSummaryClick()     // Catch:{ a -> 0x025b }
                if (r9 == 0) goto L_0x013e
                boolean r9 = r9.booleanValue()     // Catch:{ a -> 0x025b }
                if (r9 == 0) goto L_0x013a
                r9 = 1
                goto L_0x013b
            L_0x013a:
                r9 = 0
            L_0x013b:
                r8.setClearGroupOnSummaryClick(r9)     // Catch:{ a -> 0x025b }
            L_0x013e:
                java.lang.Boolean r9 = r13.getReceiveReceiptEnabled()     // Catch:{ a -> 0x025b }
                if (r9 == 0) goto L_0x0150
                boolean r9 = r9.booleanValue()     // Catch:{ a -> 0x025b }
                if (r9 == 0) goto L_0x014c
                r9 = 1
                goto L_0x014d
            L_0x014c:
                r9 = 0
            L_0x014d:
                r8.setReceiveReceiptEnabled(r9)     // Catch:{ a -> 0x025b }
            L_0x0150:
                java.lang.Boolean r9 = r13.getDisableGMSMissingPrompt()     // Catch:{ a -> 0x025b }
                if (r9 == 0) goto L_0x0162
                boolean r9 = r9.booleanValue()     // Catch:{ a -> 0x025b }
                if (r9 == 0) goto L_0x015e
                r9 = 1
                goto L_0x015f
            L_0x015e:
                r9 = 0
            L_0x015f:
                r8.setDisableGMSMissingPrompt(r9)     // Catch:{ a -> 0x025b }
            L_0x0162:
                java.lang.Boolean r9 = r13.getUnsubscribeWhenNotificationsDisabled()     // Catch:{ a -> 0x025b }
                if (r9 == 0) goto L_0x0174
                boolean r9 = r9.booleanValue()     // Catch:{ a -> 0x025b }
                if (r9 == 0) goto L_0x0170
                r9 = 1
                goto L_0x0171
            L_0x0170:
                r9 = 0
            L_0x0171:
                r8.setUnsubscribeWhenNotificationsDisabled(r9)     // Catch:{ a -> 0x025b }
            L_0x0174:
                java.lang.Boolean r9 = r13.getLocationShared()     // Catch:{ a -> 0x025b }
                if (r9 == 0) goto L_0x0186
                boolean r9 = r9.booleanValue()     // Catch:{ a -> 0x025b }
                if (r9 == 0) goto L_0x0182
                r9 = 1
                goto L_0x0183
            L_0x0182:
                r9 = 0
            L_0x0183:
                r8.setLocationShared(r9)     // Catch:{ a -> 0x025b }
            L_0x0186:
                java.lang.Boolean r9 = r13.getRequiresUserPrivacyConsent()     // Catch:{ a -> 0x025b }
                if (r9 == 0) goto L_0x019c
                boolean r9 = r9.booleanValue()     // Catch:{ a -> 0x025b }
                if (r9 == 0) goto L_0x0194
                r9 = 1
                goto L_0x0195
            L_0x0194:
                r9 = 0
            L_0x0195:
                java.lang.Boolean r9 = kotlin.coroutines.jvm.internal.b.a(r9)     // Catch:{ a -> 0x025b }
                r8.setConsentRequired(r9)     // Catch:{ a -> 0x025b }
            L_0x019c:
                java.lang.Long r9 = r13.getOpRepoExecutionInterval()     // Catch:{ a -> 0x025b }
                if (r9 == 0) goto L_0x01a9
                long r9 = r9.longValue()     // Catch:{ a -> 0x025b }
                r8.setOpRepoExecutionInterval(r9)     // Catch:{ a -> 0x025b }
            L_0x01a9:
                m7.c r9 = r13.getInfluenceParams()     // Catch:{ a -> 0x025b }
                java.lang.Integer r9 = r9.getNotificationLimit()     // Catch:{ a -> 0x025b }
                if (r9 == 0) goto L_0x01be
                int r9 = r9.intValue()     // Catch:{ a -> 0x025b }
                com.onesignal.core.internal.config.d r10 = r8.getInfluenceParams()     // Catch:{ a -> 0x025b }
                r10.setNotificationLimit(r9)     // Catch:{ a -> 0x025b }
            L_0x01be:
                m7.c r9 = r13.getInfluenceParams()     // Catch:{ a -> 0x025b }
                java.lang.Integer r9 = r9.getIndirectNotificationAttributionWindow()     // Catch:{ a -> 0x025b }
                if (r9 == 0) goto L_0x01d3
                int r9 = r9.intValue()     // Catch:{ a -> 0x025b }
                com.onesignal.core.internal.config.d r10 = r8.getInfluenceParams()     // Catch:{ a -> 0x025b }
                r10.setIndirectNotificationAttributionWindow(r9)     // Catch:{ a -> 0x025b }
            L_0x01d3:
                m7.c r9 = r13.getInfluenceParams()     // Catch:{ a -> 0x025b }
                java.lang.Integer r9 = r9.getIamLimit()     // Catch:{ a -> 0x025b }
                if (r9 == 0) goto L_0x01e8
                int r9 = r9.intValue()     // Catch:{ a -> 0x025b }
                com.onesignal.core.internal.config.d r10 = r8.getInfluenceParams()     // Catch:{ a -> 0x025b }
                r10.setIamLimit(r9)     // Catch:{ a -> 0x025b }
            L_0x01e8:
                m7.c r9 = r13.getInfluenceParams()     // Catch:{ a -> 0x025b }
                java.lang.Integer r9 = r9.getIndirectIAMAttributionWindow()     // Catch:{ a -> 0x025b }
                if (r9 == 0) goto L_0x01fd
                int r9 = r9.intValue()     // Catch:{ a -> 0x025b }
                com.onesignal.core.internal.config.d r10 = r8.getInfluenceParams()     // Catch:{ a -> 0x025b }
                r10.setIndirectIAMAttributionWindow(r9)     // Catch:{ a -> 0x025b }
            L_0x01fd:
                m7.c r9 = r13.getInfluenceParams()     // Catch:{ a -> 0x025b }
                java.lang.Boolean r9 = r9.isDirectEnabled()     // Catch:{ a -> 0x025b }
                if (r9 == 0) goto L_0x0217
                boolean r9 = r9.booleanValue()     // Catch:{ a -> 0x025b }
                com.onesignal.core.internal.config.d r10 = r8.getInfluenceParams()     // Catch:{ a -> 0x025b }
                if (r9 == 0) goto L_0x0213
                r9 = 1
                goto L_0x0214
            L_0x0213:
                r9 = 0
            L_0x0214:
                r10.setDirectEnabled(r9)     // Catch:{ a -> 0x025b }
            L_0x0217:
                m7.c r9 = r13.getInfluenceParams()     // Catch:{ a -> 0x025b }
                java.lang.Boolean r9 = r9.isIndirectEnabled()     // Catch:{ a -> 0x025b }
                if (r9 == 0) goto L_0x0231
                boolean r9 = r9.booleanValue()     // Catch:{ a -> 0x025b }
                com.onesignal.core.internal.config.d r10 = r8.getInfluenceParams()     // Catch:{ a -> 0x025b }
                if (r9 == 0) goto L_0x022d
                r9 = 1
                goto L_0x022e
            L_0x022d:
                r9 = 0
            L_0x022e:
                r10.setIndirectEnabled(r9)     // Catch:{ a -> 0x025b }
            L_0x0231:
                m7.c r13 = r13.getInfluenceParams()     // Catch:{ a -> 0x025b }
                java.lang.Boolean r13 = r13.isUnattributedEnabled()     // Catch:{ a -> 0x025b }
                if (r13 == 0) goto L_0x024b
                boolean r13 = r13.booleanValue()     // Catch:{ a -> 0x025b }
                com.onesignal.core.internal.config.d r9 = r8.getInfluenceParams()     // Catch:{ a -> 0x025b }
                if (r13 == 0) goto L_0x0247
                r13 = 1
                goto L_0x0248
            L_0x0247:
                r13 = 0
            L_0x0248:
                r9.setUnattributedEnabled(r13)     // Catch:{ a -> 0x025b }
            L_0x024b:
                com.onesignal.core.internal.config.impl.a r13 = r0.this$0     // Catch:{ a -> 0x025b }
                com.onesignal.core.internal.config.b r13 = r13._configModelStore     // Catch:{ a -> 0x025b }
                java.lang.String r9 = "HYDRATE"
                r13.replace(r8, r9)     // Catch:{ a -> 0x025b }
                r13 = r0
                r0 = r1
                r6 = r7
                r1 = 1
                goto L_0x02ae
            L_0x025b:
                r13 = move-exception
                goto L_0x0264
            L_0x025d:
                r7 = move-exception
                r11 = r0
                r0 = r13
                r13 = r7
                r7 = r6
                r6 = r1
                r1 = r11
            L_0x0264:
                int r13 = r13.getStatusCode()
                r8 = 403(0x193, float:5.65E-43)
                if (r13 != r8) goto L_0x0274
                java.lang.String r13 = "403 error getting OneSignal params, omitting further retries!"
                com.onesignal.debug.internal.logging.a.fatal$default(r13, r3, r2, r3)
                sa.t r13 = sa.t.f15300a
                return r13
            L_0x0274:
                int r13 = r7 * 10000
                int r13 = r13 + 30000
                r8 = 90000(0x15f90, float:1.26117E-40)
                if (r13 <= r8) goto L_0x0280
                r13 = 90000(0x15f90, float:1.26117E-40)
            L_0x0280:
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                java.lang.String r9 = "Failed to get Android parameters, trying again in "
                r8.append(r9)
                int r9 = r13 / 1000
                r8.append(r9)
                java.lang.String r9 = " seconds."
                r8.append(r9)
                java.lang.String r8 = r8.toString()
                com.onesignal.debug.internal.logging.a.info$default(r8, r3, r2, r3)
                long r8 = (long) r13
                r0.I$0 = r7
                r0.I$1 = r6
                r0.label = r2
                java.lang.Object r13 = mb.r0.a(r8, r0)
                if (r13 != r1) goto L_0x02a9
                return r1
            L_0x02a9:
                int r7 = r7 + r5
                r13 = r0
                r0 = r1
                r1 = r6
                r6 = r7
            L_0x02ae:
                if (r1 == 0) goto L_0x0054
                sa.t r13 = sa.t.f15300a
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onesignal.core.internal.config.impl.a.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        public final Object invoke(d dVar) {
            return ((b) create(dVar)).invokeSuspend(t.f15300a);
        }
    }

    public a(com.onesignal.core.internal.config.b bVar, m7.b bVar2, com.onesignal.user.internal.subscriptions.b bVar3) {
        db.l.e(bVar, "_configModelStore");
        db.l.e(bVar2, "_paramsBackendService");
        db.l.e(bVar3, "_subscriptionManager");
        this._configModelStore = bVar;
        this._paramsBackendService = bVar2;
        this._subscriptionManager = bVar3;
    }

    private final void fetchParams() {
        String appId = ((com.onesignal.core.internal.config.a) this._configModelStore.getModel()).getAppId();
        if (!(appId.length() == 0)) {
            com.onesignal.common.threading.a.suspendifyOnThread$default(0, new b(appId, this, (d) null), 1, (Object) null);
        }
    }

    public void onModelUpdated(h hVar, String str) {
        db.l.e(hVar, "args");
        db.l.e(str, "tag");
        if (db.l.a(hVar.getProperty(), "appId")) {
            fetchParams();
        }
    }

    public void start() {
        this._configModelStore.subscribe((e) this);
        fetchParams();
    }

    public void onModelReplaced(com.onesignal.core.internal.config.a aVar, String str) {
        db.l.e(aVar, "model");
        db.l.e(str, "tag");
        if (db.l.a(str, "NORMAL")) {
            fetchParams();
        }
    }
}
